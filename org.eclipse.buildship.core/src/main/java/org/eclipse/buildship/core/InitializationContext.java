/*
 * Copyright (c) 2018 the original author or authors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.eclipse.buildship.core;

/**
 * Describes a Gradle build being synchronized.
 *
 * @author Donat Csikos
 * @since 3.0
 * @see ProjectConfigurator
 */
public interface InitializationContext extends SynchronizationContext {

    /**
     * @return the current Gradle build being synchronized
     */
    GradleBuild getGradleBuild();
}