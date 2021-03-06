/*
 * Copyright 2014 Open Networking Laboratory
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
package org.onosproject.iptopology.api.link;

import org.onosproject.iptopology.api.IpLinkIdentifier;
import org.onosproject.iptopology.api.LinkTed;
import org.onosproject.iptopology.api.TerminationPoint;
import org.onosproject.net.Description;

/**
 * Describes an ip link.
 */
public interface IpLinkDescription extends Description {

    /**
     * Returns the link source.
     *
     * @return links source
     */
    TerminationPoint src();

    /**
     * Returns the link destination.
     *
     * @return links destination
     */
    TerminationPoint dst();

    /**
     * Returns the link identifier.
     *
     * @return links identifier informations
     */
    IpLinkIdentifier linkIdentifier();

    /**
     * Returns the link traffic engineering parameters.
     *
     * @return links traffic engineering parameters
     */
    LinkTed linkTed();
}
