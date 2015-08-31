
/*
 *  JScripter Standard 1.0 - To Script In Java
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

package js.user;

import js.*;
import js.core.*;

/**
 * <p>An <b>opaque</b> class representing JavaScript client-side objects of the global 
 * {@link JsClient#CDATASection} class.</p>
 *
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 *
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
 * generated into the target codes. Re-compilers must exit with error on the operations of
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsCDATASection extends JsClient.CDATASection.Prototype
{
	/**
	 * <p>An <b>opaque</b> class representing members of its enclosing <b>opaque</b> type.</p>
	 * <p>Note that, this class is <b>opaque</b> but its constructors are all <b>internal</b>. 
	 * This class and the subclasses of this class are used to declare either <b>opaque</b> 
	 * <tt>public</tt> instance fields of the opaque type {@link js.Var.Member} or the 
	 * <b>opaque</b> <tt>public</tt> static fields of other <b>opaque</b> types while their 
	 * constructors are used to define the fields inside <b>opaque</b> classes. Under 
	 * either circumstance, the field names must be exactly same as the member names, as 
	 * the <b>opaque</b> fields of <b>opaque</b> types are resolved by re-compilers directly 
	 * based on the field names.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be created
	 * in the target codes. Re-compilers must exit with error on operations accessing that kind 
	 * of class objects.
	 * Re-compilers must resolve an <b>opaque</b> instance field declared by this class in
	 * {@link js.Var.Member} or its subclasses to the JavaScript identifier: 
	 * <pre>q.m</pre>
	 * where <tt>m</tt> is the identifier of the field name and <tt>q</tt> is the identifier
	 * resolved from the instance of the enclosing member. Re-compilers must resolve an 
	 * <b>opaque</b> static field declared by this class in <b>opaque</b> types other than 
	 * {@link js.Var.Member} and its subclasses to the JavaScript identifier: 
	 * <pre>m</pre>
	 * where <tt>m</tt> is the identifier of the field name. And re-compilers must report
	 * error on the access to <b>opaque</b> fields declared by this class under any other 
	 * circumstances.
	 */
	public static class Member extends JsClient.CDATASection.Prototype.Member
	{
		/**
		 * <p>Internally constructs a member based on a qualifying member.</p>
		 * <p>This constructor is <b>internal</b> and only called inside of <b>opaque</b>
		 * or <b>internal</b> classes or class members.</p>
		 * <p>Note that, this constructor is <b>internal</b> but its declaring class is
		 * <b>opaque</b>. This constructor is used to define <b>opaque</b> instance fields 
		 * declared in the declaring class of this constructor itself or its subclasses. 
		 * Under this circumstance, the field names must be exactly same as the member 
		 * names, as the <b>opaque</b> instance fields of the <b>opaque</b> type 
		 * {@link js.Var.Member} or its subclasses are resolved by re-compilers directly
		 * to their names appending to the name resolved from the specified qualifying 
		 * member with a dot in between.</p>
		 * @param q A qualifying member
		 * @param mid The ID of the member to construct
		 * @since 1.0
		 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> constructor.
		 */
		public Member(JsObject.Member q, Mid mid) {
			super(q, mid);
		}
		/**
		 * <p>Internally constructs a member without a qualifying member.</p>
		 * <p>This constructor is <b>internal</b> and only called inside of <b>opaque</b>
		 * or <b>internal</b> classes or class members.</p>
		 * <p>Note that, this constructor is <b>internal</b> but its declaring class is
		 * <b>opaque</b>. This constructor is used to define <b>opaque</b> static fields, 
		 * declared in <b>opaque</b> types other than the declaring class of this constructor 
		 * itself and its subclasses. Under this circumstance, the field names must be
		 * exactly same as the member names, as the <b>opaque</b> static fields of <b>opaque</b>
		 * types are generally resolved by re-compilers directly to identifiers of their names.</p>
		 * @param mid The ID of the member to construct
		 * @since 1.0
		 * @javascript Re-compilers must report error on the invocation to an <b>internal</b> constructor.
		 */
		public Member(Mid mid) {
			super(mid);
		}
		@Override
		/**
		 * <p>Evaluates the property, represented by the current member instance, of the
		 * argument object.</p>
		 * @param o The argument object
		 * @return The value of the current member based on the object argument.
		 * @since 1.0
		 * @javascript Re-compilers must convert the instance invocation of this method into
		 * the JavaScript expression: 
		 * <pre>o.m</pre>
		 * where <tt>m</tt> is the identifier name resolved from the current member
		 * instance of the invocation.
		 */
		public JsCDATASection with(ObjectLike o) {
			return new JsCDATASection(super.with(o));
		}
	}

	/**
	 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
	 * with the wrapping constructor.</p>
	 * @param var The argument of an <b>opaque</b> object.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the construction operation of this constructor,
	 * that is, replacing it with its only argument.
	 */
	public JsCDATASection(JsObject var) {
		super(var);
	}

	@Override
	/**
	 * <p>Returns the primitive value associated with the current instance, if there is one.
	 * This invocation simply returns the instance itself for the current instance is an 
	 * object and there is no primitive value for it.</p>
	 * @return The current object itself.
	 * @since 1.0
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public JsCDATASection valueOf() {
		return new JsCDATASection((JsObject)var().valueOf());
	}

	/**
	 * <p>Splits this {@link JsCDATASection} node into two at the specified character position 
	 * and returns the new {@link JsCDATASection} node.</p>
	 * <p>This method splits a {@link JsCDATASection} node in two at the specified <tt>offset</tt>. 
	 * The original {@link JsCDATASection} node is modified so that it contains all text content 
	 * up to, but not including, the character at position <tt>offset</tt>. A new {@link JsCDATASection} 
	 * node is created to contain all the characters from and including the position <tt>offset</tt> 
	 * to the end of the string. The new {@link JsCDATASection} node is the return value of the 
	 * method. Additionally, if the original {@link JsCDATASection} node has a {@link JsNode#parentNode}, 
	 * the new node is inserted into this parent node immediately after the original node.</p>
	 * @param offset The character position at which to split the {@link JsCDATASection} node.
	 * @return The {@link JsCDATASection} node that was split from this node.
	 * @throws RuntimeException JavaScript throws a a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR} 
	 * if the node is read-only and may not be modified or the value {@link JsDOMException#INDEX_SIZE_ERR} 
	 * if <tt>offset</tt> is negative or is greater than the length of the {@link JsCDATASection} or 
	 * {@link JsComment} node. 
	 * See {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @see #splitText(NumberLike)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	@Override
	public final JsCDATASection splitText(Number offset) {
		return new JsCDATASection(call(splitText, offset));
	}
	/**
	 * <p>Splits this {@link JsCDATASection} node into two at the specified character position 
	 * and returns the new {@link JsCDATASection} node.</p>
	 * <p>This method splits a {@link JsCDATASection} node in two at the specified <tt>offset</tt>. 
	 * The original {@link JsCDATASection} node is modified so that it contains all text content 
	 * up to, but not including, the character at position <tt>offset</tt>. A new {@link JsCDATASection} 
	 * node is created to contain all the characters from and including the position <tt>offset</tt> 
	 * to the end of the string. The new {@link JsCDATASection} node is the return value of the 
	 * method. Additionally, if the original {@link JsCDATASection} node has a {@link JsNode#parentNode}, 
	 * the new node is inserted into this parent node immediately after the original node.</p>
	 * <p>This class inherits from {@link JsText}. The newly created node of {@link #splitText(Number)} 
	 * is a {@link JsCDATASection} node rather than a {@link JsText} node as of 
	 * {@link JsText#splitText(Number)}.</p>
	 * <p>This class inherits from {@link JsText}. The newly created node of {@link #splitText(NumberLike)} 
	 * is a {@link JsCDATASection} node rather than a {@link JsText} node as of 
	 * {@link JsText#splitText(Number)}.</p>
	 * @param offset The character position at which to split the {@link JsCDATASection} node.
	 * @return The {@link JsCDATASection} node that was split from this node.
	 * @throws RuntimeException JavaScript throws a a {@link JsDOMException} object with 
	 * the {@link JsDOMException#code} property of the value {@link JsDOMException#NO_MODIFICATION_ALLOWED_ERR} 
	 * if the node is read-only and may not be modified or the value {@link JsDOMException#INDEX_SIZE_ERR} 
	 * if <tt>offset</tt> is negative or is greater than the length of the {@link JsCDATASection} or 
	 * {@link JsComment} node. 
	 * See {@link Js#err(Object)} for JS Simulation.
	 * @since 1.0
	 * @see #splitText(Number)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	@Override
	public final JsCDATASection splitText(NumberLike<?> offset) {
		return splitText(Js.valueOf(offset));
	}
}