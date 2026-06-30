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

public class XmlNode_getName_7967496084 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term858;

    public XmlNode_getName_7967496084() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term873 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term873, term873.getClass(), "name", "");
        setField(term873, term873.getClass(), "value", "");
        Object term876 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term876, term876.getClass(), "name", "");
        setField(term876, term876.getClass(), "value", "");
        Object term879 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term879, term879.getClass(), "name", "");
        setField(term879, term879.getClass(), "value", "");
        ArrayList term871 = new ArrayList();
        ((ArrayList) term871).add(term873);
        ((ArrayList) term871).add(term876);
        ((ArrayList) term871).add(term879);
        HashMap term884 = new HashMap();
        term858 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlNode"));
        setField(term858, term858.getClass(), "name", "DzHVBMqWtE");
        setField(term858, term858.getClass(), "props", term871);
        setField(term858, term858.getClass(), "children", term884);
        setField(term858, term858.getClass(), "content", "WxYUTuqmIq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.xml.XmlNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term858, args);
    }

};


