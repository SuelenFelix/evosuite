package io.github.janlely.jparser.impl.xml;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static io.github.janlely.jparser.impl.xml.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.util.LinkedList;

public class XmlNode_addAll_3448140061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term576;
     Object term622;

    public XmlNode_addAll_3448140061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term591 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term591, term591.getClass(), "name", "");
        setField(term591, term591.getClass(), "value", "");
        Object term594 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term594, term594.getClass(), "name", "");
        setField(term594, term594.getClass(), "value", "");
        Object term597 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term597, term597.getClass(), "name", "");
        setField(term597, term597.getClass(), "value", "");
        Object term600 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term600, term600.getClass(), "name", "");
        setField(term600, term600.getClass(), "value", "");
        ArrayList term589 = new ArrayList();
        ((ArrayList) term589).add(term591);
        ((ArrayList) term589).add(term594);
        ((ArrayList) term589).add(term597);
        ((ArrayList) term589).add(term600);
        HashMap term605 = new HashMap();
        term576 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlNode"));
        setField(term576, term576.getClass(), "name", "lihXWlGDxk");
        setField(term576, term576.getClass(), "props", term589);
        setField(term576, term576.getClass(), "children", term605);
        setField(term576, term576.getClass(), "content", "YpJbIgJWWv");
        ArrayList term638 = new ArrayList();
        ((ArrayList) term638).add((Object)null);
        HashMap term642 = new HashMap();
        Object term625 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlNode"));
        setField(term625, term625.getClass(), "name", "JppkknKVOw");
        setField(term625, term625.getClass(), "props", term638);
        setField(term625, term625.getClass(), "children", term642);
        setField(term625, term625.getClass(), "content", "vKQukfbJUd");
        ArrayList term662 = new ArrayList();
        ((ArrayList) term662).add((Object)null);
        ((ArrayList) term662).add((Object)null);
        ((ArrayList) term662).add((Object)null);
        ((ArrayList) term662).add((Object)null);
        ((ArrayList) term662).add((Object)null);
        ((ArrayList) term662).add((Object)null);
        ((ArrayList) term662).add((Object)null);
        ((ArrayList) term662).add((Object)null);
        ((ArrayList) term662).add((Object)null);
        HashMap term665 = new HashMap();
        Object term660 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlNode"));
        setField(term660, term660.getClass(), "name", "");
        setField(term660, term660.getClass(), "props", term662);
        setField(term660, term660.getClass(), "children", term665);
        setField(term660, term660.getClass(), "content", "");
        Object term672 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlNode"));
        setField(term672, term672.getClass(), "name", null);
        setField(term672, term672.getClass(), "props", null);
        setField(term672, term672.getClass(), "children", null);
        setField(term672, term672.getClass(), "content", null);
        term622 = new LinkedList();
        ((LinkedList) term622).add(term625);
        ((LinkedList) term622).add(term660);
        ((LinkedList) term622).add(term672);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.xml.XmlNode");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term622;
        callMethod(klass, "addAll", argTypes, term576, args);
    }

};


