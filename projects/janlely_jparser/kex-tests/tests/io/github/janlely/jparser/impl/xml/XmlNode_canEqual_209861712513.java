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

public class XmlNode_canEqual_209861712513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1596;
     Object term1648;

    public XmlNode_canEqual_209861712513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1611 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1611, term1611.getClass(), "name", "");
        setField(term1611, term1611.getClass(), "value", "");
        Object term1614 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1614, term1614.getClass(), "name", "");
        setField(term1614, term1614.getClass(), "value", "");
        Object term1617 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1617, term1617.getClass(), "name", "");
        setField(term1617, term1617.getClass(), "value", "");
        Object term1620 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1620, term1620.getClass(), "name", "");
        setField(term1620, term1620.getClass(), "value", "");
        Object term1623 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1623, term1623.getClass(), "name", "");
        setField(term1623, term1623.getClass(), "value", "");
        Object term1626 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1626, term1626.getClass(), "name", "");
        setField(term1626, term1626.getClass(), "value", "");
        ArrayList term1609 = new ArrayList();
        ((ArrayList) term1609).add(term1611);
        ((ArrayList) term1609).add(term1614);
        ((ArrayList) term1609).add(term1617);
        ((ArrayList) term1609).add(term1620);
        ((ArrayList) term1609).add(term1623);
        ((ArrayList) term1609).add(term1626);
        HashMap term1631 = new HashMap();
        term1596 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlNode"));
        setField(term1596, term1596.getClass(), "name", "bEmHScVZaQ");
        setField(term1596, term1596.getClass(), "props", term1609);
        setField(term1596, term1596.getClass(), "children", term1631);
        setField(term1596, term1596.getClass(), "content", "UqKUbMyPMJ");
        term1648 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.xml.XmlNode");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1648;
        callMethod(klass, "canEqual", argTypes, term1596, args);
    }

};


