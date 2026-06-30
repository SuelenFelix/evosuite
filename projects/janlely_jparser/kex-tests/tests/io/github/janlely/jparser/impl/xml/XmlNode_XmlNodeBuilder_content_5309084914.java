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

public class XmlNode_XmlNodeBuilder_content_5309084914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278;

    public XmlNode_XmlNodeBuilder_content_5309084914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term293 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term293, term293.getClass(), "name", "");
        setField(term293, term293.getClass(), "value", "");
        Object term296 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term296, term296.getClass(), "name", "");
        setField(term296, term296.getClass(), "value", "");
        Object term299 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term299, term299.getClass(), "name", "");
        setField(term299, term299.getClass(), "value", "");
        Object term302 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term302, term302.getClass(), "name", "");
        setField(term302, term302.getClass(), "value", "");
        Object term305 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term305, term305.getClass(), "name", "");
        setField(term305, term305.getClass(), "value", "");
        Object term308 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term308, term308.getClass(), "name", "");
        setField(term308, term308.getClass(), "value", "");
        Object term311 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term311, term311.getClass(), "name", "");
        setField(term311, term311.getClass(), "value", "");
        ArrayList term291 = new ArrayList();
        ((ArrayList) term291).add(term293);
        ((ArrayList) term291).add(term296);
        ((ArrayList) term291).add(term299);
        ((ArrayList) term291).add(term302);
        ((ArrayList) term291).add(term305);
        ((ArrayList) term291).add(term308);
        ((ArrayList) term291).add(term311);
        HashMap term316 = new HashMap();
        term278 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlNode$XmlNodeBuilder"));
        setField(term278, term278.getClass(), "name", "AKNapTAfmD");
        setField(term278, term278.getClass(), "props", term291);
        setField(term278, term278.getClass(), "children", term316);
        setField(term278, term278.getClass(), "content", "UfQtPRyWRC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.xml.XmlNode$XmlNodeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FPvxVzzSvD";
        callMethod(klass, "content", argTypes, term278, args);
    }

};


