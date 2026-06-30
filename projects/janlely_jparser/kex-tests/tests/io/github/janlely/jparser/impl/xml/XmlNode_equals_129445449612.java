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

public class XmlNode_equals_129445449612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1520;
     Object term1575;

    public XmlNode_equals_129445449612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1535 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1535, term1535.getClass(), "name", "");
        setField(term1535, term1535.getClass(), "value", "");
        Object term1538 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1538, term1538.getClass(), "name", "");
        setField(term1538, term1538.getClass(), "value", "");
        Object term1541 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1541, term1541.getClass(), "name", "");
        setField(term1541, term1541.getClass(), "value", "");
        Object term1544 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1544, term1544.getClass(), "name", "");
        setField(term1544, term1544.getClass(), "value", "");
        Object term1547 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1547, term1547.getClass(), "name", "");
        setField(term1547, term1547.getClass(), "value", "");
        Object term1550 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1550, term1550.getClass(), "name", "");
        setField(term1550, term1550.getClass(), "value", "");
        Object term1553 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1553, term1553.getClass(), "name", "");
        setField(term1553, term1553.getClass(), "value", "");
        ArrayList term1533 = new ArrayList();
        ((ArrayList) term1533).add(term1535);
        ((ArrayList) term1533).add(term1538);
        ((ArrayList) term1533).add(term1541);
        ((ArrayList) term1533).add(term1544);
        ((ArrayList) term1533).add(term1547);
        ((ArrayList) term1533).add(term1550);
        ((ArrayList) term1533).add(term1553);
        HashMap term1558 = new HashMap();
        term1520 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlNode"));
        setField(term1520, term1520.getClass(), "name", "mfHtgSbdjD");
        setField(term1520, term1520.getClass(), "props", term1533);
        setField(term1520, term1520.getClass(), "children", term1558);
        setField(term1520, term1520.getClass(), "content", "zMsSLTfGhl");
        term1575 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.xml.XmlNode");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1575;
        callMethod(klass, "equals", argTypes, term1520, args);
    }

};


