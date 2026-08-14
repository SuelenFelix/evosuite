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
import java.lang.Boolean;

public class AnnotationInstance_getName_10005899562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102;

    public AnnotationInstance_getName_10005899562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term107 = new ArrayList();
        ((ArrayList) term107).add((Object)null);
        ((ArrayList) term107).add((Object)null);
        ((ArrayList) term107).add((Object)null);
        ArrayList term110 = new ArrayList();
        ((ArrayList) term110).add((Object)null);
        ((ArrayList) term110).add((Object)null);
        ((ArrayList) term110).add((Object)null);
        ((ArrayList) term110).add((Object)null);
        Boolean term114 = new Boolean(true);
        Boolean term116 = new Boolean(false);
        Object term105 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationArgument"));
        Object term106 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term106, term106.getClass(), "wildcard", null);
        setField(term106, term106.getClass(), "generic", null);
        setField(term106, term106.getClass(), "qualified", null);
        setField(term106, term106.getClass(), "dimension", null);
        setField(term105, term105.getClass(), "type", term106);
        setField(term105, term105.getClass(), "value", term107);
        setField(term105, term105.getClass(), "annotation", term110);
        setField(term105, term105.getClass(), "name", "");
        setField(term105, term105.getClass(), "primitive", term114);
        setField(term105, term105.getClass(), "array", term116);
        ArrayList term103 = new ArrayList();
        ((ArrayList) term103).add(term105);
        term102 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term102, term102.getClass(), "argument", term103);
        setField(term102, term102.getClass(), "name", "LWyEaeIyAo");
        setField(term102, term102.getClass(), "qualified", "yVMkkQhvmN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term102, args);
    }

};


