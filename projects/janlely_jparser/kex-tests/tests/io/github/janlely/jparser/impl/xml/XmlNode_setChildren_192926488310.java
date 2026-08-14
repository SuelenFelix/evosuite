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
import java.util.LinkedHashMap;

public class XmlNode_setChildren_192926488310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6209;
     Object term6255;

    public XmlNode_setChildren_192926488310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6224 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term6224, term6224.getClass(), "name", "");
        setField(term6224, term6224.getClass(), "value", "");
        Object term6227 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term6227, term6227.getClass(), "name", "");
        setField(term6227, term6227.getClass(), "value", "");
        Object term6230 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term6230, term6230.getClass(), "name", "");
        setField(term6230, term6230.getClass(), "value", "");
        Object term6233 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term6233, term6233.getClass(), "name", "");
        setField(term6233, term6233.getClass(), "value", "");
        ArrayList term6222 = new ArrayList();
        ((ArrayList) term6222).add(term6224);
        ((ArrayList) term6222).add(term6227);
        ((ArrayList) term6222).add(term6230);
        ((ArrayList) term6222).add(term6233);
        HashMap term6238 = new HashMap();
        term6209 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlNode"));
        setField(term6209, term6209.getClass(), "name", "zsWKWiTFuo");
        setField(term6209, term6209.getClass(), "props", term6222);
        setField(term6209, term6209.getClass(), "children", term6238);
        setField(term6209, term6209.getClass(), "content", "AWYyZiNfsm");
        term6255 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.xml.XmlNode");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term6255;
        callMethod(klass, "setChildren", argTypes, term6209, args);
    }

};


