
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
 * {@link JsClient#UIEvent} class.</p>
 * <p>This class is a subclass of {@link JsEvent} and defines the type of {@link JsEvent} 
 * object passed to events of type <tt>DOMFocusIn</tt>, <tt>DOMFocusOut</tt>, and 
 * <tt>DOMActivate</tt>. These event types are not commonly used in web browsers, and 
 * what is more important about the {@link JsUIEvent} is that it is the parent of 
 * {@link JsMouseEvent}.</p>
 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
 *
 * @javascript <b>Opaque</b> types can be resolved but no class objects for them can be
 * generated into the target codes. Re-compilers must exit with error on the operations of
 * accessing that kind of class objects.
 * The <tt>checkcast</tt> operation to the class literal of this interface must be ignored
 * and <tt>instanceof</tt> to it always <tt>true</tt>.
 */
public class JsUIEvent extends JsClient.UIEvent.Prototype
{
	/**
	 * <p>An <b>internal</b> class containing membership data for its enclosing
	 * opaque class.</p>
	 * <p>This class is only used inside of <b>opaque</b> or <b>internal</b> classes or
	 * class members.</p>
	 *
	 * @author <a href="mailto:jianjunliu@126.com">J.J.Liu (Jianjun Liu)</a> at <a href="http://www.jscripter.org" target="_blank">http://www.jscripter.org</a>
	 * 
	 * @javascript Re-compilers must report error on resolving an <b>internal</b> class.
	 */
	protected static abstract class Members extends JsClient.UIEvent.Prototype.Members
	{
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsUIEvent#detail
		 * @see JsUIEvent.Member#detail
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid detail = id("detail");
		/**
		 * <p>An <b>internal</b> static field defining a member ID of the field name and
		 * used internally to define a member of the same name.</p>
		 * @since 1.0
		 * @see JsUIEvent#view
		 * @javascript Re-compilers must report error on accessing an <b>internal</b> field.
		 */
		public final static Mid view   = id("view"  );
	}

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
	public static class Member extends JsClient.UIEvent.Prototype.Member
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
		public JsUIEvent with(ObjectLike o) {
			return new JsUIEvent(super.with(o));
		}

		/**
		 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
		 * name of this field, qualified by the current member instance of the field, and 
		 * to access the property of the name on an object.</p>
		 * <p>The property, identified by this member, of a {@link JsUIEvent} object 
		 * refers to a read-only numeric value specifying detail about the event. For 
		 * "click", "mousedown", and "mouseup" events (see {@link JsMouseEvent}), this 
		 * value is the click count: 1 for a single-click, 2 for a double-click, 3 for 
		 * a triple-click, and so on. For "DOMActivate" events, the value is 1 for a 
		 * normal activation or 2 for a "hyperactivation," such as a double-click or 
		 * Shift-Enter combination.</p> 
		 * @since 1.0
		 * @javascript Re-compilers must resolve the member of this instance field to the
		 * identifier of the field name appending to the identifier resolved from its 
		 * qualifying member with a dot in between.
		 */
		public final Value.Number.Member detail = new Value.Number.Member(this, Members.detail);
	}

	/**
	 * <p>Casts an <b>opaque</b> object to the current <b>opaque</b> type by wrapping it
	 * with the wrapping constructor.</p>
	 * @param var The argument of an <b>opaque</b> object.
	 * @since 1.0
	 * @javascript Re-compilers must ignore the construction operation of this constructor,
	 * that is, replacing it with its only argument.
	 */
	public JsUIEvent(JsObject var) {
		super(var);
	}

	/**
	 * <p>An <b>opaque</b> static field defining a member that is named by the field name
	 * without a qualifying member and to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsUIEvent} object 
	 * refers to a read-only numeric value specifying detail about the event. For 
	 * "click", "mousedown", and "mouseup" events (see {@link JsMouseEvent}), this 
	 * value is the click count: 1 for a single-click, 2 for a double-click, 3 for 
	 * a triple-click, and so on. For "DOMActivate" events, the value is 1 for a 
	 * normal activation or 2 for a "hyperactivation," such as a double-click or 
	 * Shift-Enter combination.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this static field to the
	 * identifier of the field name.
	 */
	public static final Value.Number.Member detail = new Value.Number.Member(Members.detail);
	/**
	 * <p>An <b>opaque</b> instance field defining a sub-member that is named by the
	 * name of this field, qualified by the current member instance of the field, and 
	 * to access the property of the name on an object.</p>
	 * <p>The property, identified by this member, of a {@link JsUIEvent} object is 
	 * a read-only reference to the {@link JsWindow} object or the "view" in which the 
	 * event was generated.</p> 
	 * @since 1.0
	 * @javascript Re-compilers must resolve the member of this instance field to the
	 * identifier of the field name appending to the identifier resolved from its 
	 * qualifying member with a dot in between.
	 */
	public static final JsWindow.Member view = new JsWindow.Member(Members.view);

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
	public JsUIEvent valueOf() {
		return new JsUIEvent((JsObject)var().valueOf());
	}

	/**
	 * <p>Initializes the properties of a newly created {@link JsUIEvent} object, 
	 * including the properties inherited from {@link JsEvent}.</p>
	 * <p>This method initializes the {@link #view} and {@link #detail} properties of 
	 * the {@link JsUIEvent} object and also the {@link #type}, {@link #bubbles}, and 
	 * {@link #cancelable} properties inherited from {@link JsEvent}. This method may 
	 * be called on newly created {@link JsUIEvent} objects only before they have been 
	 * passed to {@link JsElement#dispatchEvent(JsEvent)} method to dispatch.</p>
	 * @param eventType The type of event.
	 * @param canBubble Specifies whether the event will bubble.
	 * @param cancelable Specifies whether the event can be canceled with {@link JsEvent#preventDefault()}.
	 * @param view The {@link JsWindow} object in which the event occurred.
	 * @param detail The {@link #detail} property for the event.
	 * @since 1.0
	 * @see JsEvent#initEvent(String, Boolean, Boolean)
	 * @see JsDocument#createEvent(String)
	 * @see JsMouseEvent#initMouseEvent(String, Boolean, Boolean, JsWindow, Number, Number, Number, Number, Number, Boolean, Boolean, Boolean, Boolean, Number, JsElement)
	 * @javascript Re-compilers must convert the instance invocation of this method directly
	 * into a JavaScript invocation on its current object instance without changing the 
	 * method name, but expanding variable arguments, if any, into comma-separated values. 
	 */
	public final void initUIEvent(String eventType, Boolean canBubble, Boolean cancelable, JsWindow view, Long detail) {
		call(initUIEvent, new Vars<Object>().add(eventType).add(canBubble).add(cancelable).add(view).add(detail));
	}
}
