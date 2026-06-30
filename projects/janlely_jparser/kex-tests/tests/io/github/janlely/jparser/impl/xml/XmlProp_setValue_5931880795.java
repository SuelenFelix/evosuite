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

public class XmlProp_setValue_5931880795 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2282;

    public XmlProp_setValue_5931880795() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2282 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term2282, term2282.getClass(), "name", "IkfarsYNJO");
        setField(term2282, term2282.getClass(), "value", "aZKOWhHMEh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.xml.XmlProp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "YfkhviKZwl";
        callMethod(klass, "setValue", argTypes, term2282, args);
    }

};


