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

public class XmlNode_getProps_12411615465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term921;

    public XmlNode_getProps_12411615465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term936 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term936, term936.getClass(), "name", "");
        setField(term936, term936.getClass(), "value", "");
        Object term939 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term939, term939.getClass(), "name", "");
        setField(term939, term939.getClass(), "value", "");
        Object term942 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term942, term942.getClass(), "name", "");
        setField(term942, term942.getClass(), "value", "");
        Object term945 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term945, term945.getClass(), "name", "");
        setField(term945, term945.getClass(), "value", "");
        Object term948 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term948, term948.getClass(), "name", "");
        setField(term948, term948.getClass(), "value", "");
        ArrayList term934 = new ArrayList();
        ((ArrayList) term934).add(term936);
        ((ArrayList) term934).add(term939);
        ((ArrayList) term934).add(term942);
        ((ArrayList) term934).add(term945);
        ((ArrayList) term934).add(term948);
        HashMap term953 = new HashMap();
        term921 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlNode"));
        setField(term921, term921.getClass(), "name", "OeQLvhVERT");
        setField(term921, term921.getClass(), "props", term934);
        setField(term921, term921.getClass(), "children", term953);
        setField(term921, term921.getClass(), "content", "riMtzCoxNj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.xml.XmlNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProps", argTypes, term921, args);
    }

};


