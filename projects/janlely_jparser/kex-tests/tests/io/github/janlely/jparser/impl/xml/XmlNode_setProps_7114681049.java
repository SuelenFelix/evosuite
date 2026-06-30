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

public class XmlNode_setProps_7114681049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1192;
     Object term1253;

    public XmlNode_setProps_7114681049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1207 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1207, term1207.getClass(), "name", "");
        setField(term1207, term1207.getClass(), "value", "");
        Object term1210 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1210, term1210.getClass(), "name", "");
        setField(term1210, term1210.getClass(), "value", "");
        Object term1213 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1213, term1213.getClass(), "name", "");
        setField(term1213, term1213.getClass(), "value", "");
        Object term1216 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1216, term1216.getClass(), "name", "");
        setField(term1216, term1216.getClass(), "value", "");
        Object term1219 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1219, term1219.getClass(), "name", "");
        setField(term1219, term1219.getClass(), "value", "");
        Object term1222 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1222, term1222.getClass(), "name", "");
        setField(term1222, term1222.getClass(), "value", "");
        Object term1225 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1225, term1225.getClass(), "name", "");
        setField(term1225, term1225.getClass(), "value", "");
        Object term1228 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1228, term1228.getClass(), "name", "");
        setField(term1228, term1228.getClass(), "value", "");
        Object term1231 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1231, term1231.getClass(), "name", "");
        setField(term1231, term1231.getClass(), "value", "");
        ArrayList term1205 = new ArrayList();
        ((ArrayList) term1205).add(term1207);
        ((ArrayList) term1205).add(term1210);
        ((ArrayList) term1205).add(term1213);
        ((ArrayList) term1205).add(term1216);
        ((ArrayList) term1205).add(term1219);
        ((ArrayList) term1205).add(term1222);
        ((ArrayList) term1205).add(term1225);
        ((ArrayList) term1205).add(term1228);
        ((ArrayList) term1205).add(term1231);
        HashMap term1236 = new HashMap();
        term1192 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlNode"));
        setField(term1192, term1192.getClass(), "name", "aanyiAOJCl");
        setField(term1192, term1192.getClass(), "props", term1205);
        setField(term1192, term1192.getClass(), "children", term1236);
        setField(term1192, term1192.getClass(), "content", "ITRRYiuDwH");
        term1253 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.xml.XmlNode");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1253;
        callMethod(klass, "setProps", argTypes, term1192, args);
    }

};


