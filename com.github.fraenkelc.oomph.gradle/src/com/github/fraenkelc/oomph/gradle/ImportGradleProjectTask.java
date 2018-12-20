/********************************************************************************
 * Copyright (c) 2018 Christian Fränkel
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Christian Fränkel - initial API and implementation
 ********************************************************************************/
package com.github.fraenkelc.oomph.gradle;

import org.eclipse.oomph.resources.SourceLocator;
import org.eclipse.oomph.setup.SetupTask;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Task</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link com.github.fraenkelc.oomph.gradle.ImportGradleProjectTask#getSourceLocators
 * <em>Source Locators</em>}</li>
 * </ul>
 *
 * @see com.github.fraenkelc.oomph.gradle.ImportGradleProjectPackage#getImportGradleProjectTask()
 * @model annotation="http://www.eclipse.org/oomph/setup/Enablement
 * variableName='p2.import.gradle.project'
 * repository='https://dl.bintray.com/fraenkelc/buildship3_setuptask/updates'
 * installableUnits='buildship3_setuptask.feature.group'"
 * annotation="http://www.eclipse.org/oomph/setup/ValidTriggers
 * triggers='STARTUP MANUAL'"
 * @generated
 */
public interface ImportGradleProjectTask extends SetupTask {

	/**
	 * Returns the value of the '<em><b>Source Locators</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link org.eclipse.oomph.resources.SourceLocator}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Source Locators</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Source Locators</em>' containment reference
	 * list.
	 * @see com.github.fraenkelc.oomph.gradle.ImportGradleProjectPackage#getImportGradleProjectTask_SourceLocators()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SourceLocator> getSourceLocators();
} // ImportGradleProjectTask
