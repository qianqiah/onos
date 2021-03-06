/*
 * Copyright 2015 Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onosproject.store.serializers;

import org.onosproject.net.DefaultAnnotations;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;

import java.util.HashMap;

public class AnnotationsSerializer extends Serializer<DefaultAnnotations> {

    public AnnotationsSerializer() {
        super(false, true);
    }

    @Override
    public void write(Kryo kryo, Output output, DefaultAnnotations object) {
        kryo.writeObject(output, object.asMap());
    }

    @Override
    public DefaultAnnotations read(Kryo kryo, Input input, Class<DefaultAnnotations> type) {
        DefaultAnnotations.Builder b = DefaultAnnotations.builder();
        HashMap<String, String> map = kryo.readObject(input, HashMap.class);
        map.forEach((k, v) -> b.set(k, v));

        return b.build();
    }

}
