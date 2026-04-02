package com.automation.xmldoclet.xjc;

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
import static com.automation.xmldoclet.xjc.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class EnumConstant_getComment_6057177171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7302;

    public EnumConstant_getComment_6057177171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7317 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term7317, term7317.getClass(), "name", "");
        setField(term7317, term7317.getClass(), "text", "");
        Object term7320 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term7320, term7320.getClass(), "name", "");
        setField(term7320, term7320.getClass(), "text", "");
        Object term7323 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term7323, term7323.getClass(), "name", "");
        setField(term7323, term7323.getClass(), "text", "");
        Object term7326 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term7326, term7326.getClass(), "name", "");
        setField(term7326, term7326.getClass(), "text", "");
        Object term7329 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term7329, term7329.getClass(), "name", "");
        setField(term7329, term7329.getClass(), "text", "");
        Object term7332 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term7332, term7332.getClass(), "name", "");
        setField(term7332, term7332.getClass(), "text", "");
        Object term7335 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term7335, term7335.getClass(), "name", "");
        setField(term7335, term7335.getClass(), "text", "");
        ArrayList term7315 = new ArrayList();
        ((ArrayList) term7315).add(term7317);
        ((ArrayList) term7315).add(term7320);
        ((ArrayList) term7315).add(term7323);
        ((ArrayList) term7315).add(term7326);
        ((ArrayList) term7315).add(term7329);
        ((ArrayList) term7315).add(term7332);
        ((ArrayList) term7315).add(term7335);
        ArrayList term7343 = new ArrayList();
        ((ArrayList) term7343).add((Object)null);
        ((ArrayList) term7343).add((Object)null);
        ((ArrayList) term7343).add((Object)null);
        ((ArrayList) term7343).add((Object)null);
        ((ArrayList) term7343).add((Object)null);
        ((ArrayList) term7343).add((Object)null);
        ((ArrayList) term7343).add((Object)null);
        ((ArrayList) term7343).add((Object)null);
        ((ArrayList) term7343).add((Object)null);
        Object term7342 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term7342, term7342.getClass(), "argument", term7343);
        setField(term7342, term7342.getClass(), "name", "");
        setField(term7342, term7342.getClass(), "qualified", "");
        ArrayList term7349 = new ArrayList();
        ((ArrayList) term7349).add((Object)null);
        ((ArrayList) term7349).add((Object)null);
        ((ArrayList) term7349).add((Object)null);
        ((ArrayList) term7349).add((Object)null);
        ((ArrayList) term7349).add((Object)null);
        Object term7348 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term7348, term7348.getClass(), "argument", term7349);
        setField(term7348, term7348.getClass(), "name", "");
        setField(term7348, term7348.getClass(), "qualified", "");
        ArrayList term7355 = new ArrayList();
        ((ArrayList) term7355).add((Object)null);
        Object term7354 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term7354, term7354.getClass(), "argument", term7355);
        setField(term7354, term7354.getClass(), "name", "");
        setField(term7354, term7354.getClass(), "qualified", "");
        ArrayList term7361 = new ArrayList();
        ((ArrayList) term7361).add((Object)null);
        ((ArrayList) term7361).add((Object)null);
        Object term7360 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term7360, term7360.getClass(), "argument", term7361);
        setField(term7360, term7360.getClass(), "name", "");
        setField(term7360, term7360.getClass(), "qualified", "");
        ArrayList term7367 = new ArrayList();
        ((ArrayList) term7367).add((Object)null);
        ((ArrayList) term7367).add((Object)null);
        Object term7366 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term7366, term7366.getClass(), "argument", term7367);
        setField(term7366, term7366.getClass(), "name", "");
        setField(term7366, term7366.getClass(), "qualified", "");
        ArrayList term7373 = new ArrayList();
        ((ArrayList) term7373).add((Object)null);
        ((ArrayList) term7373).add((Object)null);
        ((ArrayList) term7373).add((Object)null);
        ((ArrayList) term7373).add((Object)null);
        ((ArrayList) term7373).add((Object)null);
        Object term7372 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term7372, term7372.getClass(), "argument", term7373);
        setField(term7372, term7372.getClass(), "name", "");
        setField(term7372, term7372.getClass(), "qualified", "");
        ArrayList term7340 = new ArrayList();
        ((ArrayList) term7340).add(term7342);
        ((ArrayList) term7340).add(term7348);
        ((ArrayList) term7340).add(term7354);
        ((ArrayList) term7340).add(term7360);
        ((ArrayList) term7340).add(term7366);
        ((ArrayList) term7340).add(term7372);
        term7302 = newInstance(Class.forName("com.automation.xmldoclet.xjc.EnumConstant"));
        setField(term7302, term7302.getClass(), "comment", "qTiIgMQXbW");
        setField(term7302, term7302.getClass(), "tag", term7315);
        setField(term7302, term7302.getClass(), "annotation", term7340);
        setField(term7302, term7302.getClass(), "name", "PxscjEhxGk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.EnumConstant");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComment", argTypes, term7302, args);
    }

};


