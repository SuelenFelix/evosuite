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
     Object term6612;

    public XmlNode_toString_33500813115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6627 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term6627, term6627.getClass(), "name", "");
        setField(term6627, term6627.getClass(), "value", "");
        Object term6630 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term6630, term6630.getClass(), "name", "");
        setField(term6630, term6630.getClass(), "value", "");
        Object term6633 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term6633, term6633.getClass(), "name", "");
        setField(term6633, term6633.getClass(), "value", "");
        Object term6636 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term6636, term6636.getClass(), "name", "");
        setField(term6636, term6636.getClass(), "value", "");
        Object term6639 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term6639, term6639.getClass(), "name", "");
        setField(term6639, term6639.getClass(), "value", "");
        Object term6642 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term6642, term6642.getClass(), "name", "");
        setField(term6642, term6642.getClass(), "value", "");
        Object term6645 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term6645, term6645.getClass(), "name", "");
        setField(term6645, term6645.getClass(), "value", "");
        Object term6648 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term6648, term6648.getClass(), "name", "");
        setField(term6648, term6648.getClass(), "value", "");
        ArrayList term6625 = new ArrayList();
        ((ArrayList) term6625).add(term6627);
        ((ArrayList) term6625).add(term6630);
        ((ArrayList) term6625).add(term6633);
        ((ArrayList) term6625).add(term6636);
        ((ArrayList) term6625).add(term6639);
        ((ArrayList) term6625).add(term6642);
        ((ArrayList) term6625).add(term6645);
        ((ArrayList) term6625).add(term6648);
        HashMap term6653 = new HashMap();
        term6612 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlNode"));
        setField(term6612, term6612.getClass(), "name", "mnHyQbMyld");
        setField(term6612, term6612.getClass(), "props", term6625);
        setField(term6612, term6612.getClass(), "children", term6653);
        setField(term6612, term6612.getClass(), "content", "hgFbWAUtsu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.xml.XmlNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term6612, args);
    }

};


