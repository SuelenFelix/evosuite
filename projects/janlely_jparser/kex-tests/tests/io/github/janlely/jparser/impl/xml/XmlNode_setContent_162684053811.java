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
     Object term6324;

    public XmlNode_setContent_162684053811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6339 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term6339, term6339.getClass(), "name", "");
        setField(term6339, term6339.getClass(), "value", "");
        Object term6342 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term6342, term6342.getClass(), "name", "");
        setField(term6342, term6342.getClass(), "value", "");
        ArrayList term6337 = new ArrayList();
        ((ArrayList) term6337).add(term6339);
        ((ArrayList) term6337).add(term6342);
        HashMap term6347 = new HashMap();
        term6324 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlNode"));
        setField(term6324, term6324.getClass(), "name", "jcWKHRWhyj");
        setField(term6324, term6324.getClass(), "props", term6337);
        setField(term6324, term6324.getClass(), "children", term6347);
        setField(term6324, term6324.getClass(), "content", "MlzTkzKMCX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.xml.XmlNode");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UqKUbMyPMJ";
        callMethod(klass, "setContent", argTypes, term6324, args);
    }

};


