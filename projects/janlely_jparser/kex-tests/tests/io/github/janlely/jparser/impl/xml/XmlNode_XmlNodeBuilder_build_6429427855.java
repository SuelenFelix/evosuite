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

public class XmlNode_XmlNodeBuilder_build_6429427855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term375;

    public XmlNode_XmlNodeBuilder_build_6429427855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term390 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term390, term390.getClass(), "name", "");
        setField(term390, term390.getClass(), "value", "");
        ArrayList term388 = new ArrayList();
        ((ArrayList) term388).add(term390);
        HashMap term395 = new HashMap();
        term375 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlNode$XmlNodeBuilder"));
        setField(term375, term375.getClass(), "name", "WHcwFgsGFC");
        setField(term375, term375.getClass(), "props", term388);
        setField(term375, term375.getClass(), "children", term395);
        setField(term375, term375.getClass(), "content", "ZfdXfCCFDf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.xml.XmlNode$XmlNodeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term375, args);
    }

};


