/*
 *  JScripter Emulation 1.0 - To Script Java
 *  Copyright (C) 2008-2011  J.J.Liu<jianjunliu@126.com> <http://www.jscripter.org>
 *  
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *  
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.jscripter.emu.java.lang;

/**
 * <p>An <b>internal</b> class of an exception, emulating a standard
 * <tt>java.lang</tt> interface or class with the same simple name as this one,
 * thrown when an application tries to reflectively create an instance (other
 * than an array), set or get a field, or invoke a method, but the currently
 * executing method does not have access to the definition of the specified
 * class, field, method or constructor.</p>
 * <p>This interface or class is only used internally by JS re-compiler implementations.</p>
 * <p>Please refer to <a href="http://java.sun.com/docs/">the Java API Standards</a> for detail description of the original class or interface.</p>
 * 
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 * 
 * @javascript Re-compilers must redirect the resolution of the emulated original Java class or interface to this one.
 */
public class IllegalAccessException extends Exception
{
	/**
	 * <p>Internally constructs an exception of this type.</p>
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 */
	public IllegalAccessException() {
		super();
	}

	/**
	 * <p>Internally constructs an exception of this type with detail message.</p>
	 * @param message The detail message.
	 * @since 1.0
	 * @javascript Re-compilers must report error on end-users directly using this constructor.
	 */
	public IllegalAccessException(java.lang.String message) {
		super(message);
	}
}
