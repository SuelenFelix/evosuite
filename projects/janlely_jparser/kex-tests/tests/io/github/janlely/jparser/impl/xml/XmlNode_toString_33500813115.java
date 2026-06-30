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

public class XmlNode_toString_33500813115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1744;

    public XmlNode_toString_33500813115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1759 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1759, term1759.getClass(), "name", "");
        setField(term1759, term1759.getClass(), "value", "");
        Object term1762 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1762, term1762.getClass(), "name", "");
        setField(term1762, term1762.getClass(), "value", "");
        Object term1765 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1765, term1765.getClass(), "name", "");
        setField(term1765, term1765.getClass(), "value", "");
        Object term1768 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1768, term1768.getClass(), "name", "");
        setField(term1768, term1768.getClass(), "value", "");
        Object term1771 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1771, term1771.getClass(), "name", "");
        setField(term1771, term1771.getClass(), "value", "");
        Object term1774 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1774, term1774.getClass(), "name", "");
        setField(term1774, term1774.getClass(), "value", "");
        Object term1777 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1777, term1777.getClass(), "name", "");
        setField(term1777, term1777.getClass(), "value", "");
        Object term1780 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1780, term1780.getClass(), "name", "");
        setField(term1780, term1780.getClass(), "value", "");
        Object term1783 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term1783, term1783.getClass(), "name", "");
        setField(term1783, term1783.getClass(), "value", "");
        ArrayList term1757 = new ArrayList();
        ((ArrayList) term1757).add(term1759);
        ((ArrayList) term1757).add(term1762);
        ((ArrayList) term1757).add(term1765);
        ((ArrayList) term1757).add(term1768);
        ((ArrayList) term1757).add(term1771);
        ((ArrayList) term1757).add(term1774);
        ((ArrayList) term1757).add(term1777);
        ((ArrayList) term1757).add(term1780);
        ((ArrayList) term1757).add(term1783);
        HashMap term1788 = new HashMap();
        term1744 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlNode"));
        setField(term1744, term1744.getClass(), "name", "bvSgmFUDOU");
        setField(term1744, term1744.getClass(), "props", term1757);
        setField(term1744, term1744.getClass(), "children", term1788);
        setField(term1744, term1744.getClass(), "content", "KHtaDOIcJZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.xml.XmlNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1744, args);
    }

};


