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

public class XmlNode_hashCode_84576782117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1672;

    public XmlNode_hashCode_84576782117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1687 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1687, term1687.getClass(), "name", "");
        setField(term1687, term1687.getClass(), "value", "");
        Object term1690 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1690, term1690.getClass(), "name", "");
        setField(term1690, term1690.getClass(), "value", "");
        Object term1693 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1693, term1693.getClass(), "name", "");
        setField(term1693, term1693.getClass(), "value", "");
        Object term1696 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1696, term1696.getClass(), "name", "");
        setField(term1696, term1696.getClass(), "value", "");
        Object term1699 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1699, term1699.getClass(), "name", "");
        setField(term1699, term1699.getClass(), "value", "");
        Object term1702 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1702, term1702.getClass(), "name", "");
        setField(term1702, term1702.getClass(), "value", "");
        Object term1705 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1705, term1705.getClass(), "name", "");
        setField(term1705, term1705.getClass(), "value", "");
        ArrayList term1685 = new ArrayList();
        ((ArrayList) term1685).add(term1687);
        ((ArrayList) term1685).add(term1690);
        ((ArrayList) term1685).add(term1693);
        ((ArrayList) term1685).add(term1696);
        ((ArrayList) term1685).add(term1699);
        ((ArrayList) term1685).add(term1702);
        ((ArrayList) term1685).add(term1705);
        HashMap term1710 = new HashMap();
        term1672 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlNode"));
        setField(term1672, term1672.getClass(), "name", "QpYltHAdyY");
        setField(term1672, term1672.getClass(), "props", term1685);
        setField(term1672, term1672.getClass(), "children", term1710);
        setField(term1672, term1672.getClass(), "content", "mvfDtZNEHr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.xml.XmlNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1672, args);
    }

};


