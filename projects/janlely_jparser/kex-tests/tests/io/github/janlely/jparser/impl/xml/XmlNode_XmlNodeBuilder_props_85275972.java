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
import java.util.LinkedList;

public class XmlNode_XmlNodeBuilder_props_85275972 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92;
     Object term138;

    public XmlNode_XmlNodeBuilder_props_85275972() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term107 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term107, term107.getClass(), "name", "");
        setField(term107, term107.getClass(), "value", "");
        Object term110 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term110, term110.getClass(), "name", "");
        setField(term110, term110.getClass(), "value", "");
        Object term113 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term113, term113.getClass(), "name", "");
        setField(term113, term113.getClass(), "value", "");
        Object term116 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term116, term116.getClass(), "name", "");
        setField(term116, term116.getClass(), "value", "");
        ArrayList term105 = new ArrayList();
        ((ArrayList) term105).add(term107);
        ((ArrayList) term105).add(term110);
        ((ArrayList) term105).add(term113);
        ((ArrayList) term105).add(term116);
        HashMap term121 = new HashMap();
        term92 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlNode$XmlNodeBuilder"));
        setField(term92, term92.getClass(), "name", "LQFpaHEwXR");
        setField(term92, term92.getClass(), "props", term105);
        setField(term92, term92.getClass(), "children", term121);
        setField(term92, term92.getClass(), "content", "xOEqzGAmDU");
        term138 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.xml.XmlNode$XmlNodeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term138;
        callMethod(klass, "props", argTypes, term92, args);
    }

};


