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

public class XmlNode_XmlNodeBuilder_toString_13299957996 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term432;

    public XmlNode_XmlNodeBuilder_toString_13299957996() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term447 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term447, term447.getClass(), "name", "");
        setField(term447, term447.getClass(), "value", "");
        Object term450 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term450, term450.getClass(), "name", "");
        setField(term450, term450.getClass(), "value", "");
        Object term453 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term453, term453.getClass(), "name", "");
        setField(term453, term453.getClass(), "value", "");
        Object term456 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term456, term456.getClass(), "name", "");
        setField(term456, term456.getClass(), "value", "");
        Object term459 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term459, term459.getClass(), "name", "");
        setField(term459, term459.getClass(), "value", "");
        ArrayList term445 = new ArrayList();
        ((ArrayList) term445).add(term447);
        ((ArrayList) term445).add(term450);
        ((ArrayList) term445).add(term453);
        ((ArrayList) term445).add(term456);
        ((ArrayList) term445).add(term459);
        HashMap term464 = new HashMap();
        term432 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlNode$XmlNodeBuilder"));
        setField(term432, term432.getClass(), "name", "MwwjNtdOFT");
        setField(term432, term432.getClass(), "props", term445);
        setField(term432, term432.getClass(), "children", term464);
        setField(term432, term432.getClass(), "content", "DbiCVtPPCT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.xml.XmlNode$XmlNodeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term432, args);
    }

};


