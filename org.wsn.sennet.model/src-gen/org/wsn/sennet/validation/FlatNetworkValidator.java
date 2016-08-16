/**
 *
 * $Id$
 */
package org.wsn.sennet.validation;

import org.eclipse.emf.common.util.EList;

import org.wsn.sennet.AbstractFlatNode;

/**
 * A sample validator interface for {@link org.wsn.sennet.FlatNetwork}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface FlatNetworkValidator {
	boolean validate();

	boolean validateNodes(EList<AbstractFlatNode> value);
}