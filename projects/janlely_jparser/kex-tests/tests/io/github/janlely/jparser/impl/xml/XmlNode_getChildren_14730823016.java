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

public class XmlNode_getChildren_14730823016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term990;

    public XmlNode_getChildren_14730823016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1005 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1005, term1005.getClass(), "name", "");
        setField(term1005, term1005.getClass(), "value", "");
        Object term1008 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1008, term1008.getClass(), "name", "");
        setField(term1008, term1008.getClass(), "value", "");
        Object term1011 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1011, term1011.getClass(), "name", "");
        setField(term1011, term1011.getClass(), "value", "");
        Object term1014 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1014, term1014.getClass(), "name", "");
        setField(term1014, term1014.getClass(), "value", "");
        Object term1017 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1017, term1017.getClass(), "name", "");
        setField(term1017, term1017.getClass(), "value", "");
        ArrayList term1003 = new ArrayList();
        ((ArrayList) term1003).add(term1005);
        ((ArrayList) term1003).add(term1008);
        ((ArrayList) term1003).add(term1011);
        ((ArrayList) term1003).add(term1014);
        ((ArrayList) term1003).add(term1017);
        HashMap term1022 = new HashMap();
        term990 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlNode"));
        setField(term990, term990.getClass(), "name", "YAXkVjQZcV");
        setField(term990, term990.getClass(), "props", term1003);
        setField(term990, term990.getClass(), "children", term1022);
        setField(term990, term990.getClass(), "content", "iuCxnHGMoW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.xml.XmlNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChildren", argTypes, term990, args);
    }

};


