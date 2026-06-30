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

public class XmlNode_XmlNodeBuilder_children_12709585003 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161;
     Object term207;

    public XmlNode_XmlNodeBuilder_children_12709585003() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term176 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term176, term176.getClass(), "name", "");
        setField(term176, term176.getClass(), "value", "");
        Object term179 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term179, term179.getClass(), "name", "");
        setField(term179, term179.getClass(), "value", "");
        Object term182 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term182, term182.getClass(), "name", "");
        setField(term182, term182.getClass(), "value", "");
        Object term185 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term185, term185.getClass(), "name", "");
        setField(term185, term185.getClass(), "value", "");
        ArrayList term174 = new ArrayList();
        ((ArrayList) term174).add(term176);
        ((ArrayList) term174).add(term179);
        ((ArrayList) term174).add(term182);
        ((ArrayList) term174).add(term185);
        HashMap term190 = new HashMap();
        term161 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlNode$XmlNodeBuilder"));
        setField(term161, term161.getClass(), "name", "eZFUvlxvGV");
        setField(term161, term161.getClass(), "props", term174);
        setField(term161, term161.getClass(), "children", term190);
        setField(term161, term161.getClass(), "content", "AijpHYOFuy");
        term207 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.xml.XmlNode$XmlNodeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term207;
        callMethod(klass, "children", argTypes, term161, args);
    }

};


