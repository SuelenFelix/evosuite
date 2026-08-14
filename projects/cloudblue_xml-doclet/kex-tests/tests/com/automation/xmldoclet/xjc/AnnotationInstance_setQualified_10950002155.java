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

public class AnnotationInstance_setQualified_10950002155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term400;

    public AnnotationInstance_setQualified_10950002155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term405 = new ArrayList();
        ((ArrayList) term405).add((Object)null);
        ArrayList term408 = new ArrayList();
        ((ArrayList) term408).add((Object)null);
        ((ArrayList) term408).add((Object)null);
        Boolean term412 = new Boolean(true);
        Boolean term414 = new Boolean(false);
        Object term403 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationArgument"));
        Object term404 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term404, term404.getClass(), "wildcard", null);
        setField(term404, term404.getClass(), "generic", null);
        setField(term404, term404.getClass(), "qualified", null);
        setField(term404, term404.getClass(), "dimension", null);
        setField(term403, term403.getClass(), "type", term404);
        setField(term403, term403.getClass(), "value", term405);
        setField(term403, term403.getClass(), "annotation", term408);
        setField(term403, term403.getClass(), "name", "");
        setField(term403, term403.getClass(), "primitive", term412);
        setField(term403, term403.getClass(), "array", term414);
        ArrayList term401 = new ArrayList();
        ((ArrayList) term401).add(term403);
        term400 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term400, term400.getClass(), "argument", term401);
        setField(term400, term400.getClass(), "name", "GNEmuHPNcU");
        setField(term400, term400.getClass(), "qualified", "IoSfuKDFRe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AWYyZiNfsm";
        callMethod(klass, "setQualified", argTypes, term400, args);
    }

};


