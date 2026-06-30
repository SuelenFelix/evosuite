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

public class XmlNode_initChildren_17049428940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term507;

    public XmlNode_initChildren_17049428940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term522 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term522, term522.getClass(), "name", "");
        setField(term522, term522.getClass(), "value", "");
        Object term525 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term525, term525.getClass(), "name", "");
        setField(term525, term525.getClass(), "value", "");
        Object term528 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term528, term528.getClass(), "name", "");
        setField(term528, term528.getClass(), "value", "");
        Object term531 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term531, term531.getClass(), "name", "");
        setField(term531, term531.getClass(), "value", "");
        Object term534 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term534, term534.getClass(), "name", "");
        setField(term534, term534.getClass(), "value", "");
        ArrayList term520 = new ArrayList();
        ((ArrayList) term520).add(term522);
        ((ArrayList) term520).add(term525);
        ((ArrayList) term520).add(term528);
        ((ArrayList) term520).add(term531);
        ((ArrayList) term520).add(term534);
        HashMap term539 = new HashMap();
        term507 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlNode"));
        setField(term507, term507.getClass(), "name", "WzFopsaDuG");
        setField(term507, term507.getClass(), "props", term520);
        setField(term507, term507.getClass(), "children", term539);
        setField(term507, term507.getClass(), "content", "cudZvLMQon");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.xml.XmlNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "initChildren", argTypes, term507, args);
    }

};


