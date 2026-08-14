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

public class XmlNode_canEqual_209861712515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1598;
     Object term1650;

    public XmlNode_canEqual_209861712515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1613 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1613, term1613.getClass(), "name", "");
        setField(term1613, term1613.getClass(), "value", "");
        Object term1616 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1616, term1616.getClass(), "name", "");
        setField(term1616, term1616.getClass(), "value", "");
        Object term1619 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1619, term1619.getClass(), "name", "");
        setField(term1619, term1619.getClass(), "value", "");
        Object term1622 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1622, term1622.getClass(), "name", "");
        setField(term1622, term1622.getClass(), "value", "");
        Object term1625 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1625, term1625.getClass(), "name", "");
        setField(term1625, term1625.getClass(), "value", "");
        Object term1628 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1628, term1628.getClass(), "name", "");
        setField(term1628, term1628.getClass(), "value", "");
        ArrayList term1611 = new ArrayList();
        ((ArrayList) term1611).add(term1613);
        ((ArrayList) term1611).add(term1616);
        ((ArrayList) term1611).add(term1619);
        ((ArrayList) term1611).add(term1622);
        ((ArrayList) term1611).add(term1625);
        ((ArrayList) term1611).add(term1628);
        HashMap term1633 = new HashMap();
        term1598 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlNode"));
        setField(term1598, term1598.getClass(), "name", "bEmHScVZaQ");
        setField(term1598, term1598.getClass(), "props", term1611);
        setField(term1598, term1598.getClass(), "children", term1633);
        setField(term1598, term1598.getClass(), "content", "UqKUbMyPMJ");
        term1650 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.xml.XmlNode");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1650;
        callMethod(klass, "canEqual", argTypes, term1598, args);
    }

};


