/*
 * JBoss, Home of Professional Open Source
 * Copyright 2012, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.shrinkwrap.resolver.api.maven.dependency;

import org.jboss.shrinkwrap.resolver.api.maven.ConfigurableResolveStage;
import org.jboss.shrinkwrap.resolver.api.maven.MavenFormatStage;
import org.jboss.shrinkwrap.resolver.api.maven.MavenResolutionFilter;
import org.jboss.shrinkwrap.resolver.api.maven.MavenResolutionStrategy;
import org.jboss.shrinkwrap.resolver.api.maven.MavenStrategyStage;
import org.jboss.shrinkwrap.resolver.api.maven.dependency.exclusion.DependencyExclusionBuilderToConfigurableDependencyDeclarationBuilderBridge;

/**
 * Mutable builder of new, immutable {@link DependencyDeclaration} instances as made from a
 * {@link ConfigurableResolveStage}.
 *
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 * @author <a href="mailto:kpiwko@redhat.com">Karel Piwko</a>
 */
public interface ConfigurableDependencyDeclarationBuilder
    extends
    DependencyDeclarationBuilderBase<DependencyDeclaration, ConfigurableDependencyDeclarationBuilder, MavenResolutionFilter, DependencyExclusionBuilderToConfigurableDependencyDeclarationBuilderBridge, ConfigurableResolveStage, MavenStrategyStage, MavenFormatStage, MavenResolutionStrategy> {

}
