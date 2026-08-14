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

public class AnnotationInstance_setName_15745007723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164;

    public AnnotationInstance_setName_15745007723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term169 = new ArrayList();
        ((ArrayList) term169).add((Object)null);
        ((ArrayList) term169).add((Object)null);
        ((ArrayList) term169).add((Object)null);
        ((ArrayList) term169).add((Object)null);
        ((ArrayList) term169).add((Object)null);
        ((ArrayList) term169).add((Object)null);
        ((ArrayList) term169).add((Object)null);
        ((ArrayList) term169).add((Object)null);
        ((ArrayList) term169).add((Object)null);
        ArrayList term172 = new ArrayList();
        ((ArrayList) term172).add((Object)null);
        ((ArrayList) term172).add((Object)null);
        ((ArrayList) term172).add((Object)null);
        ((ArrayList) term172).add((Object)null);
        ((ArrayList) term172).add((Object)null);
        ((ArrayList) term172).add((Object)null);
        Boolean term176 = new Boolean(false);
        Boolean term178 = new Boolean(false);
        Object term167 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationArgument"));
        Object term168 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term168, term168.getClass(), "wildcard", null);
        setField(term168, term168.getClass(), "generic", null);
        setField(term168, term168.getClass(), "qualified", null);
        setField(term168, term168.getClass(), "dimension", null);
        setField(term167, term167.getClass(), "type", term168);
        setField(term167, term167.getClass(), "value", term169);
        setField(term167, term167.getClass(), "annotation", term172);
        setField(term167, term167.getClass(), "name", "");
        setField(term167, term167.getClass(), "primitive", term176);
        setField(term167, term167.getClass(), "array", term178);
        ArrayList term182 = new ArrayList();
        ((ArrayList) term182).add((Object)null);
        ((ArrayList) term182).add((Object)null);
        ArrayList term185 = new ArrayList();
        ((ArrayList) term185).add((Object)null);
        ((ArrayList) term185).add((Object)null);
        Boolean term189 = new Boolean(true);
        Boolean term191 = new Boolean(false);
        Object term180 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationArgument"));
        Object term181 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term181, term181.getClass(), "wildcard", null);
        setField(term181, term181.getClass(), "generic", null);
        setField(term181, term181.getClass(), "qualified", null);
        setField(term181, term181.getClass(), "dimension", null);
        setField(term180, term180.getClass(), "type", term181);
        setField(term180, term180.getClass(), "value", term182);
        setField(term180, term180.getClass(), "annotation", term185);
        setField(term180, term180.getClass(), "name", "");
        setField(term180, term180.getClass(), "primitive", term189);
        setField(term180, term180.getClass(), "array", term191);
        ArrayList term195 = new ArrayList();
        ((ArrayList) term195).add((Object)null);
        ((ArrayList) term195).add((Object)null);
        ((ArrayList) term195).add((Object)null);
        ((ArrayList) term195).add((Object)null);
        ((ArrayList) term195).add((Object)null);
        ((ArrayList) term195).add((Object)null);
        ((ArrayList) term195).add((Object)null);
        ((ArrayList) term195).add((Object)null);
        ArrayList term198 = new ArrayList();
        Boolean term202 = new Boolean(true);
        Boolean term204 = new Boolean(true);
        Object term193 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationArgument"));
        Object term194 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term194, term194.getClass(), "wildcard", null);
        setField(term194, term194.getClass(), "generic", null);
        setField(term194, term194.getClass(), "qualified", null);
        setField(term194, term194.getClass(), "dimension", null);
        setField(term193, term193.getClass(), "type", term194);
        setField(term193, term193.getClass(), "value", term195);
        setField(term193, term193.getClass(), "annotation", term198);
        setField(term193, term193.getClass(), "name", "");
        setField(term193, term193.getClass(), "primitive", term202);
        setField(term193, term193.getClass(), "array", term204);
        ArrayList term208 = new ArrayList();
        ArrayList term211 = new ArrayList();
        ((ArrayList) term211).add((Object)null);
        Boolean term215 = new Boolean(true);
        Boolean term217 = new Boolean(true);
        Object term206 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationArgument"));
        Object term207 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term207, term207.getClass(), "wildcard", null);
        setField(term207, term207.getClass(), "generic", null);
        setField(term207, term207.getClass(), "qualified", null);
        setField(term207, term207.getClass(), "dimension", null);
        setField(term206, term206.getClass(), "type", term207);
        setField(term206, term206.getClass(), "value", term208);
        setField(term206, term206.getClass(), "annotation", term211);
        setField(term206, term206.getClass(), "name", "");
        setField(term206, term206.getClass(), "primitive", term215);
        setField(term206, term206.getClass(), "array", term217);
        ArrayList term165 = new ArrayList();
        ((ArrayList) term165).add(term167);
        ((ArrayList) term165).add(term180);
        ((ArrayList) term165).add(term193);
        ((ArrayList) term165).add(term206);
        term164 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term164, term164.getClass(), "argument", term165);
        setField(term164, term164.getClass(), "name", "GrqozDKFOk");
        setField(term164, term164.getClass(), "qualified", "CFyoseFGLF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SFqCrhEWLm";
        callMethod(klass, "setName", argTypes, term164, args);
    }

};


