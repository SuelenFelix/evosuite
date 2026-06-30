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
import java.util.LinkedList;
import java.lang.Object;
import java.util.LinkedHashMap;

public class XmlNode_init_8452389222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term726;
     Object term759;

    public XmlNode_init_8452389222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term729 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term729, term729.getClass(), "name", "SFqCrhEWLm");
        setField(term729, term729.getClass(), "value", "GZdcJyZntS");
        Object term755 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term755, term755.getClass(), "name", "");
        setField(term755, term755.getClass(), "value", "");
        term726 = new LinkedList();
        ((LinkedList) term726).add(term729);
        ((LinkedList) term726).add(term755);
        term759 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.xml.XmlNode");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("java.util.Map");
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = "CFyoseFGLF";
        args[1] = term726;
        args[2] = term759;
        args[3] = "EdPAvpluZg";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


