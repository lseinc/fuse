/**
 * Copyright (C) FuseSource, Inc.
 * http://fusesource.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.fusesource.fabric.service;

import org.fusesource.fabric.api.Container;
import org.fusesource.fabric.api.ContainerProvider;
import org.fusesource.fabric.api.CreateContainerMetadata;
import org.fusesource.fabric.api.CreateContainerOptions;
import org.fusesource.fabric.api.FabricRequirements;
import org.fusesource.fabric.api.FabricService;
import org.fusesource.fabric.api.FabricStatus;
import org.fusesource.fabric.api.Profile;
import org.fusesource.fabric.api.Version;
import org.fusesource.fabric.zookeeper.IZKClient;
import org.osgi.service.cm.ConfigurationAdmin;

import java.io.IOException;
import java.net.URI;
import java.util.Map;

/**
 * An MBean for use by a <a href="http://jolokia.org/">Jolokia</a> JMX connector.
 *
 * <bNote></b> this MBean will not be usable remotely unless you use Jolokia or you have Fabric on your classpath!
 */
public interface FabricManagerMBean {
    CreateContainerMetadata[] createContainers(CreateContainerOptions options);

    Profile createProfile(String version, String name);

    Version createVersion(Version parent, String toVersion);

    Version createVersion(String version);

    void deleteProfile(Profile profile);

    void deleteVersion(String version);

    void destroyContainer(Container container);

    Container getContainer(String name);

    Container[] containers();

    ContainerTemplate getContainerTemplate(Container container, String jmxUser, String jmxPassword);

    Container currentContainer();

    String getCurrentContainerName();

    String getDefaultJvmOptions();

    String getDefaultRepo();

    Version defaultVersion();

    FabricStatus fabricStatus();

    String getMavenRepoUploadURI();

    String getMavenRepoURI();

    Profile getProfile(String version, String name);

    Profile[] getProfiles(String version);

    ContainerProvider getProvider(Container container);

    ContainerProvider getProvider(String scheme);

    Map<String, ContainerProvider> providers();

    FabricRequirements requirements();

    Version getVersion(String name);

    Version[] versions();

    String getZookeeperInfo(String name);

    String getZookeeperUrl();

    void registerProvider(ContainerProvider provider, Map<String, Object> properties);

    void registerProvider(String scheme, ContainerProvider provider);

    void setDefaultJvmOptions(String jvmOptions);

    void setDefaultRepo(String defaultRepo);

    void setDefaultVersion(Version version);

    void requirements(FabricRequirements requirements) throws IOException;

    void startContainer(Container container);

    void stopContainer(Container container);

    void unregisterProvider(ContainerProvider provider, Map<String, Object> properties);

    void unregisterProvider(String scheme);
}
