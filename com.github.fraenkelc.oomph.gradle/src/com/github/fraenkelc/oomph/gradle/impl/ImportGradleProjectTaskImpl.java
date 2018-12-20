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
package com.github.fraenkelc.oomph.gradle.impl;

import org.eclipse.oomph.resources.SourceLocator;
import org.eclipse.oomph.setup.SetupTaskContext;
import org.eclipse.oomph.setup.Trigger;
import org.eclipse.oomph.setup.impl.SetupTaskImpl;
import org.eclipse.oomph.util.MonitorUtil;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.buildship.core.BuildConfiguration;
import org.eclipse.buildship.core.GradleBuild;
import org.eclipse.buildship.core.GradleCore;
import org.eclipse.buildship.core.GradleDistribution;
import org.eclipse.buildship.core.GradleWorkspace;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;

import com.github.fraenkelc.oomph.gradle.ImportGradleProjectPackage;
import com.github.fraenkelc.oomph.gradle.ImportGradleProjectTask;

import java.io.File;
import java.util.Collection;
import java.util.Optional;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.github.fraenkelc.oomph.gradle.impl.ImportGradleProjectTaskImpl#getSourceLocators <em>Source Locators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportGradleProjectTaskImpl extends SetupTaskImpl implements ImportGradleProjectTask
{
  private static final IWorkspaceRoot ROOT = ResourcesPlugin.getWorkspace().getRoot();

  /**
   * The cached value of the '{@link #getSourceLocators() <em>Source Locators</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceLocators()
   * @generated
   * @ordered
   */
  protected EList<SourceLocator> sourceLocators;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImportGradleProjectTaskImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ImportGradleProjectPackage.Literals.IMPORT_GRADLE_PROJECT_TASK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SourceLocator> getSourceLocators()
  {
    if (sourceLocators == null)
    {
      sourceLocators = new EObjectContainmentEList<SourceLocator>(SourceLocator.class, this,
          ImportGradleProjectPackage.IMPORT_GRADLE_PROJECT_TASK__SOURCE_LOCATORS);
    }
    return sourceLocators;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
    case ImportGradleProjectPackage.IMPORT_GRADLE_PROJECT_TASK__SOURCE_LOCATORS:
      return ((InternalEList<?>)getSourceLocators()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
    case ImportGradleProjectPackage.IMPORT_GRADLE_PROJECT_TASK__SOURCE_LOCATORS:
      return getSourceLocators();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
    case ImportGradleProjectPackage.IMPORT_GRADLE_PROJECT_TASK__SOURCE_LOCATORS:
      getSourceLocators().clear();
      getSourceLocators().addAll((Collection<? extends SourceLocator>)newValue);
      return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
    case ImportGradleProjectPackage.IMPORT_GRADLE_PROJECT_TASK__SOURCE_LOCATORS:
      getSourceLocators().clear();
      return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
    case ImportGradleProjectPackage.IMPORT_GRADLE_PROJECT_TASK__SOURCE_LOCATORS:
      return sourceLocators != null && !sourceLocators.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /*
   * (non-Javadoc)
   * @see org.eclipse.oomph.setup.SetupTask#isNeeded(org.eclipse.oomph.setup.SetupTaskContext)
   */
  @Override
  public boolean isNeeded(SetupTaskContext context) throws Exception
  {
    EList<SourceLocator> sourceLocators = getSourceLocators();
    if (sourceLocators.isEmpty())
    {
      return false;
    }
    if (context.getTrigger() != Trigger.MANUAL)
    {
      for (IProject project : ROOT.getProjects())
      {
        IPath projectFolder = project.getLocation();
        for (SourceLocator sourceLocator : sourceLocators)
        {
          Path rootFolder = new Path(sourceLocator.getRootFolder());
          if (rootFolder.isPrefixOf(projectFolder))
          {
            // In STARTUP trigger don't perform if there's already at least 1 project from the source locators
            return false;
          }
        }
      }
    }
    return true;
  }

  /*
   * (non-Javadoc)
   * @see org.eclipse.oomph.setup.SetupTask#perform(org.eclipse.oomph.setup.SetupTaskContext)
   */
  @Override
  public void perform(SetupTaskContext context) throws Exception
  {
    EList<SourceLocator> sourceLocators = getSourceLocators();
    int size = sourceLocators.size();

    IProgressMonitor monitor = context.getProgressMonitor(true);
    monitor.beginTask("", size);
    try
    {
      GradleWorkspace workspace = GradleCore.getWorkspace();
      for (SourceLocator sourceLocator : sourceLocators)
      {
        Optional<GradleBuild> gradleBuild = Optional.empty();
        for (IProject project : ROOT.getProjects())
        {
          if (!gradleBuild.isPresent() && project.getLocation().equals(new Path(sourceLocator.getRootFolder())))
          {
            gradleBuild = workspace.getBuild(project);
          }
        }

        GradleBuild newBuild = gradleBuild.orElseGet(() -> {
          BuildConfiguration configuration = BuildConfiguration.forRootProjectDirectory(new File(sourceLocator.getRootFolder()))
              .overrideWorkspaceConfiguration(false).gradleDistribution(GradleDistribution.fromBuild()).autoSync(false).build();
          return workspace.createBuild(configuration);
        });
        newBuild.synchronize(MonitorUtil.create(monitor, 1));
      }
    }
    finally
    {
      monitor.done();
    }
  }

} // ImportGradleProjectTaskImpl
