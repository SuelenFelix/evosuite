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

public class XmlNode_setContent_162684053812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1418;

    public XmlNode_setContent_162684053812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1433 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1433, term1433.getClass(), "name", "");
        setField(term1433, term1433.getClass(), "value", "");
        Object term1436 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1436, term1436.getClass(), "name", "");
        setField(term1436, term1436.getClass(), "value", "");
        Object term1439 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1439, term1439.getClass(), "name", "");
        setField(term1439, term1439.getClass(), "value", "");
        Object term1442 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1442, term1442.getClass(), "name", "");
        setField(term1442, term1442.getClass(), "value", "");
        Object term1445 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1445, term1445.getClass(), "name", "");
        setField(term1445, term1445.getClass(), "value", "");
        Object term1448 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1448, term1448.getClass(), "name", "");
        setField(term1448, term1448.getClass(), "value", "");
        Object term1451 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1451, term1451.getClass(), "name", "");
        setField(term1451, term1451.getClass(), "value", "");
        Object term1454 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1454, term1454.getClass(), "name", "");
        setField(term1454, term1454.getClass(), "value", "");
        Object term1457 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1457, term1457.getClass(), "name", "");
        setField(term1457, term1457.getClass(), "value", "");
        ArrayList term1431 = new ArrayList();
        ((ArrayList) term1431).add(term1433);
        ((ArrayList) term1431).add(term1436);
        ((ArrayList) term1431).add(term1439);
        ((ArrayList) term1431).add(term1442);
        ((ArrayList) term1431).add(term1445);
        ((ArrayList) term1431).add(term1448);
        ((ArrayList) term1431).add(term1451);
        ((ArrayList) term1431).add(term1454);
        ((ArrayList) term1431).add(term1457);
        HashMap term1462 = new HashMap();
        term1418 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlNode"));
        setField(term1418, term1418.getClass(), "name", "OirVUQhauU");
        setField(term1418, term1418.getClass(), "props", term1431);
        setField(term1418, term1418.getClass(), "children", term1462);
        setField(term1418, term1418.getClass(), "content", "DzKFxEuEEC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.xml.XmlNode");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CAMnvfDLJL";
        callMethod(klass, "setContent", argTypes, term1418, args);
    }

};


