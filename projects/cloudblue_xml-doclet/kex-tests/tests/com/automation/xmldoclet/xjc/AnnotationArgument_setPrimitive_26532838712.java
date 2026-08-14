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
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Boolean;

public class AnnotationArgument_setPrimitive_26532838712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53821;
     Object term54002;

    public AnnotationArgument_setPrimitive_26532838712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term53824 = new ArrayList();
        ((ArrayList) term53824).add((Object)null);
        ArrayList term53828 = new ArrayList();
        ((ArrayList) term53828).add((Object)null);
        ((ArrayList) term53828).add((Object)null);
        ((ArrayList) term53828).add((Object)null);
        ((ArrayList) term53828).add((Object)null);
        ((ArrayList) term53828).add((Object)null);
        ((ArrayList) term53828).add((Object)null);
        ((ArrayList) term53828).add((Object)null);
        Object term53834 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term53834, term53834.getClass(), "wildcard", null);
        setField(term53834, term53834.getClass(), "generic", null);
        setField(term53834, term53834.getClass(), "qualified", null);
        setField(term53834, term53834.getClass(), "dimension", null);
        Object term53835 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term53835, term53835.getClass(), "wildcard", null);
        setField(term53835, term53835.getClass(), "generic", null);
        setField(term53835, term53835.getClass(), "qualified", null);
        setField(term53835, term53835.getClass(), "dimension", null);
        Object term53836 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term53836, term53836.getClass(), "wildcard", null);
        setField(term53836, term53836.getClass(), "generic", null);
        setField(term53836, term53836.getClass(), "qualified", null);
        setField(term53836, term53836.getClass(), "dimension", null);
        Object term53837 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term53837, term53837.getClass(), "wildcard", null);
        setField(term53837, term53837.getClass(), "generic", null);
        setField(term53837, term53837.getClass(), "qualified", null);
        setField(term53837, term53837.getClass(), "dimension", null);
        ArrayList term53832 = new ArrayList();
        ((ArrayList) term53832).add(term53834);
        ((ArrayList) term53832).add(term53835);
        ((ArrayList) term53832).add(term53836);
        ((ArrayList) term53832).add(term53837);
        ArrayList term53864 = new ArrayList();
        ((ArrayList) term53864).add("wyxalusBIa");
        ((ArrayList) term53864).add("BrolVEBPTk");
        ((ArrayList) term53864).add("YygTQTEmYQ");
        ((ArrayList) term53864).add("PdEsTcSWqF");
        ((ArrayList) term53864).add("OAVjFLwRji");
        ((ArrayList) term53864).add("mHwQmyvfuY");
        ((ArrayList) term53864).add("rxkWSDTOqj");
        ((ArrayList) term53864).add("ZciPfZTSBI");
        ((ArrayList) term53864).add("qVEAjkOIeL");
        ArrayList term53979 = new ArrayList();
        ((ArrayList) term53979).add((Object)null);
        ((ArrayList) term53979).add((Object)null);
        Object term53978 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term53978, term53978.getClass(), "argument", term53979);
        setField(term53978, term53978.getClass(), "name", "");
        setField(term53978, term53978.getClass(), "qualified", "");
        ArrayList term53976 = new ArrayList();
        ((ArrayList) term53976).add(term53978);
        Boolean term53998 = new Boolean(false);
        Boolean term54000 = new Boolean(false);
        term53821 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationArgument"));
        Object term53822 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term53823 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term53823, term53823.getClass(), "extendsBound", term53824);
        setField(term53823, term53823.getClass(), "superBound", term53828);
        setField(term53822, term53822.getClass(), "wildcard", term53823);
        setField(term53822, term53822.getClass(), "generic", term53832);
        setField(term53822, term53822.getClass(), "qualified", "VRPUeZZKir");
        setField(term53822, term53822.getClass(), "dimension", "pemGWiEQkK");
        setField(term53821, term53821.getClass(), "type", term53822);
        setField(term53821, term53821.getClass(), "value", term53864);
        setField(term53821, term53821.getClass(), "annotation", term53976);
        setField(term53821, term53821.getClass(), "name", "lKOtqqAzSe");
        setField(term53821, term53821.getClass(), "primitive", term53998);
        setField(term53821, term53821.getClass(), "array", term54000);
        term54002 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.AnnotationArgument");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term54002;
        callMethod(klass, "setPrimitive", argTypes, term53821, args);
    }

};


