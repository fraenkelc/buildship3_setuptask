/**
 */
package com.github.fraenkelc.oomph.gradle;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.github.fraenkelc.oomph.gradle.ImportGradleProjectPackage
 * @generated
 */
public interface ImportGradleProjectFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ImportGradleProjectFactory eINSTANCE = com.github.fraenkelc.oomph.gradle.impl.ImportGradleProjectFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task</em>'.
   * @generated
   */
  ImportGradleProjectTask createImportGradleProjectTask();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ImportGradleProjectPackage getImportGradleProjectPackage();

} // ImportGradleProjectFactory
