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
     Object term6406;
     Object term6455;

    public XmlNode_equals_129445449612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6421 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term6421, term6421.getClass(), "name", "");
        setField(term6421, term6421.getClass(), "value", "");
        Object term6424 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term6424, term6424.getClass(), "name", "");
        setField(term6424, term6424.getClass(), "value", "");
        Object term6427 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term6427, term6427.getClass(), "name", "");
        setField(term6427, term6427.getClass(), "value", "");
        Object term6430 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term6430, term6430.getClass(), "name", "");
        setField(term6430, term6430.getClass(), "value", "");
        Object term6433 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term6433, term6433.getClass(), "name", "");
        setField(term6433, term6433.getClass(), "value", "");
        ArrayList term6419 = new ArrayList();
        ((ArrayList) term6419).add(term6421);
        ((ArrayList) term6419).add(term6424);
        ((ArrayList) term6419).add(term6427);
        ((ArrayList) term6419).add(term6430);
        ((ArrayList) term6419).add(term6433);
        HashMap term6438 = new HashMap();
        term6406 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlNode"));
        setField(term6406, term6406.getClass(), "name", "QpYltHAdyY");
        setField(term6406, term6406.getClass(), "props", term6419);
        setField(term6406, term6406.getClass(), "children", term6438);
        setField(term6406, term6406.getClass(), "content", "pDkMNnAGgv");
        term6455 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.xml.XmlNode");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6455;
        callMethod(klass, "equals", argTypes, term6406, args);
    }

};


