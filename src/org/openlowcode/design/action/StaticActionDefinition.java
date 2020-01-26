/********************************************************************************
 * Copyright (c) 2019-2020 [Open Lowcode SAS](https://openlowcode.com/)
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0 .
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/

package org.openlowcode.design.action;

import org.openlowcode.design.data.ArgumentContent;
import org.openlowcode.design.data.argument.ObjectArgument;
import org.openlowcode.design.data.argument.ObjectIdArgument;
import org.openlowcode.tools.misc.NamedList;

/**
 * A static Action Definition does not have any input parameter. It can be
 * called from a module main menu.
 * 
 * @author <a href="https://openlowcode.com/" rel="nofollow">Open Lowcode
 *         SAS</a>
 *
 */
public class StaticActionDefinition
		extends
		ActionDefinition {
	private NamedList<ArgumentContent> emptyinputarguments;

	/**
	 * Creates a static action definition for the given name that is user-generated
	 * 
	 * @param name a unique name for the module, and that is a valid java class name
	 *             (does not start by a number...)
	 */
	public StaticActionDefinition(String name) {
		super(name);
		emptyinputarguments = new NamedList<ArgumentContent>();
	}

	/**
	 * Creates a static action definition for the given name
	 * 
	 * @param name          a unique name for the module, and that is a valid java
	 *                      class name (does not start by a number...)
	 * @param autogenerated true if the action is auto-generated (defined by
	 *                      OpenLowcode designer), false if the action is
	 *                      user-generated
	 */
	public StaticActionDefinition(String name, boolean autogenerated) {
		super(name, autogenerated);
		emptyinputarguments = new NamedList<ArgumentContent>();
	}

	/**
	 * creates a user-generated static action definition
	 * 
	 * @param name          a unique name for the module, and that is a valid java
	 *                      class name (does not start by a number...)
	 * @param specification a text specification that will appear in the javadoc of
	 *                      the action
	 */
	public StaticActionDefinition(String name, String specification) {
		super(name, specification);
		emptyinputarguments = new NamedList<ArgumentContent>();
	}

	@Override
	public NamedList<ArgumentContent> getInputArguments() {
		return emptyinputarguments;
	}

	@Override
	public ObjectArgument getSecurityobjectargument() {
		return null;
	}

	@Override
	public ObjectIdArgument getSecurityobjectidargument() {
		return null;
	}

}
