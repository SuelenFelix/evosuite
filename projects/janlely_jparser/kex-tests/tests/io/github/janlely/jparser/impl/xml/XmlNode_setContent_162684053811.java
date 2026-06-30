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

public class XmlNode_setContent_162684053811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1417;

    public XmlNode_setContent_162684053811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1432 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1432, term1432.getClass(), "name", "");
        setField(term1432, term1432.getClass(), "value", "");
        Object term1435 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1435, term1435.getClass(), "name", "");
        setField(term1435, term1435.getClass(), "value", "");
        Object term1438 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1438, term1438.getClass(), "name", "");
        setField(term1438, term1438.getClass(), "value", "");
        Object term1441 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1441, term1441.getClass(), "name", "");
        setField(term1441, term1441.getClass(), "value", "");
        Object term1444 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1444, term1444.getClass(), "name", "");
        setField(term1444, term1444.getClass(), "value", "");
        Object term1447 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1447, term1447.getClass(), "name", "");
        setField(term1447, term1447.getClass(), "value", "");
        Object term1450 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1450, term1450.getClass(), "name", "");
        setField(term1450, term1450.getClass(), "value", "");
        Object term1453 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1453, term1453.getClass(), "name", "");
        setField(term1453, term1453.getClass(), "value", "");
        Object term1456 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1456, term1456.getClass(), "name", "");
        setField(term1456, term1456.getClass(), "value", "");
        ArrayList term1430 = new ArrayList();
        ((ArrayList) term1430).add(term1432);
        ((ArrayList) term1430).add(term1435);
        ((ArrayList) term1430).add(term1438);
        ((ArrayList) term1430).add(term1441);
        ((ArrayList) term1430).add(term1444);
        ((ArrayList) term1430).add(term1447);
        ((ArrayList) term1430).add(term1450);
        ((ArrayList) term1430).add(term1453);
        ((ArrayList) term1430).add(term1456);
        HashMap term1461 = new HashMap();
        term1417 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlNode"));
        setField(term1417, term1417.getClass(), "name", "OirVUQhauU");
        setField(term1417, term1417.getClass(), "props", term1430);
        setField(term1417, term1417.getClass(), "children", term1461);
        setField(term1417, term1417.getClass(), "content", "DzKFxEuEEC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.xml.XmlNode");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CAMnvfDLJL";
        callMethod(klass, "setContent", argTypes, term1417, args);
    }

};


