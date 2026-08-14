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

public class XmlNode_equals_129445449614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1522;
     Object term1577;

    public XmlNode_equals_129445449614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1537 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1537, term1537.getClass(), "name", "");
        setField(term1537, term1537.getClass(), "value", "");
        Object term1540 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1540, term1540.getClass(), "name", "");
        setField(term1540, term1540.getClass(), "value", "");
        Object term1543 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1543, term1543.getClass(), "name", "");
        setField(term1543, term1543.getClass(), "value", "");
        Object term1546 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1546, term1546.getClass(), "name", "");
        setField(term1546, term1546.getClass(), "value", "");
        Object term1549 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1549, term1549.getClass(), "name", "");
        setField(term1549, term1549.getClass(), "value", "");
        Object term1552 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1552, term1552.getClass(), "name", "");
        setField(term1552, term1552.getClass(), "value", "");
        Object term1555 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1555, term1555.getClass(), "name", "");
        setField(term1555, term1555.getClass(), "value", "");
        ArrayList term1535 = new ArrayList();
        ((ArrayList) term1535).add(term1537);
        ((ArrayList) term1535).add(term1540);
        ((ArrayList) term1535).add(term1543);
        ((ArrayList) term1535).add(term1546);
        ((ArrayList) term1535).add(term1549);
        ((ArrayList) term1535).add(term1552);
        ((ArrayList) term1535).add(term1555);
        HashMap term1560 = new HashMap();
        term1522 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlNode"));
        setField(term1522, term1522.getClass(), "name", "mfHtgSbdjD");
        setField(term1522, term1522.getClass(), "props", term1535);
        setField(term1522, term1522.getClass(), "children", term1560);
        setField(term1522, term1522.getClass(), "content", "zMsSLTfGhl");
        term1577 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.xml.XmlNode");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1577;
        callMethod(klass, "equals", argTypes, term1522, args);
    }

};


