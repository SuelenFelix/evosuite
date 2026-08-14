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
     Object term6476;
     Object term6537;

    public XmlNode_canEqual_209861712513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6491 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term6491, term6491.getClass(), "name", "");
        setField(term6491, term6491.getClass(), "value", "");
        Object term6494 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term6494, term6494.getClass(), "name", "");
        setField(term6494, term6494.getClass(), "value", "");
        Object term6497 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term6497, term6497.getClass(), "name", "");
        setField(term6497, term6497.getClass(), "value", "");
        Object term6500 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term6500, term6500.getClass(), "name", "");
        setField(term6500, term6500.getClass(), "value", "");
        Object term6503 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term6503, term6503.getClass(), "name", "");
        setField(term6503, term6503.getClass(), "value", "");
        Object term6506 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term6506, term6506.getClass(), "name", "");
        setField(term6506, term6506.getClass(), "value", "");
        Object term6509 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term6509, term6509.getClass(), "name", "");
        setField(term6509, term6509.getClass(), "value", "");
        Object term6512 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term6512, term6512.getClass(), "name", "");
        setField(term6512, term6512.getClass(), "value", "");
        Object term6515 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term6515, term6515.getClass(), "name", "");
        setField(term6515, term6515.getClass(), "value", "");
        ArrayList term6489 = new ArrayList();
        ((ArrayList) term6489).add(term6491);
        ((ArrayList) term6489).add(term6494);
        ((ArrayList) term6489).add(term6497);
        ((ArrayList) term6489).add(term6500);
        ((ArrayList) term6489).add(term6503);
        ((ArrayList) term6489).add(term6506);
        ((ArrayList) term6489).add(term6509);
        ((ArrayList) term6489).add(term6512);
        ((ArrayList) term6489).add(term6515);
        HashMap term6520 = new HashMap();
        term6476 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlNode"));
        setField(term6476, term6476.getClass(), "name", "PaCpFXGzdX");
        setField(term6476, term6476.getClass(), "props", term6489);
        setField(term6476, term6476.getClass(), "children", term6520);
        setField(term6476, term6476.getClass(), "content", "EMiMtYgfvr");
        term6537 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.xml.XmlNode");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6537;
        callMethod(klass, "canEqual", argTypes, term6476, args);
    }

};


