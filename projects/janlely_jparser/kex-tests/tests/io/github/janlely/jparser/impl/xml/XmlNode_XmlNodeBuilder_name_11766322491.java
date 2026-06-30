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

public class XmlNode_XmlNodeBuilder_name_11766322491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public XmlNode_XmlNodeBuilder_name_11766322491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term16 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term16, term16.getClass(), "name", "");
        setField(term16, term16.getClass(), "value", "");
        Object term19 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term19, term19.getClass(), "name", "");
        setField(term19, term19.getClass(), "value", "");
        Object term22 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term22, term22.getClass(), "name", "");
        setField(term22, term22.getClass(), "value", "");
        Object term25 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term25, term25.getClass(), "name", "");
        setField(term25, term25.getClass(), "value", "");
        Object term28 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlProp"));
        setField(term28, term28.getClass(), "name", "");
        setField(term28, term28.getClass(), "value", "");
        ArrayList term14 = new ArrayList();
        ((ArrayList) term14).add(term16);
        ((ArrayList) term14).add(term19);
        ((ArrayList) term14).add(term22);
        ((ArrayList) term14).add(term25);
        ((ArrayList) term14).add(term28);
        HashMap term33 = new HashMap();
        term1 = newInstance(Class.forName("io.github.janlely.jparser.impl.xml.XmlNode$XmlNodeBuilder"));
        setField(term1, term1.getClass(), "name", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "props", term14);
        setField(term1, term1.getClass(), "children", term33);
        setField(term1, term1.getClass(), "content", "uuaPigETmJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.janlely.jparser.impl.xml.XmlNode$XmlNodeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MxlszYVzRf";
        callMethod(klass, "name", argTypes, term1, args);
    }

};


