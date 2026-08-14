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

public class AnnotationArgument_getAnnotation_21244376255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52878;

    public AnnotationArgument_getAnnotation_21244376255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term52881 = new ArrayList();
        ((ArrayList) term52881).add((Object)null);
        ArrayList term52885 = new ArrayList();
        ((ArrayList) term52885).add((Object)null);
        ((ArrayList) term52885).add((Object)null);
        ((ArrayList) term52885).add((Object)null);
        ((ArrayList) term52885).add((Object)null);
        ((ArrayList) term52885).add((Object)null);
        ((ArrayList) term52885).add((Object)null);
        ((ArrayList) term52885).add((Object)null);
        ArrayList term52889 = new ArrayList();
        ArrayList term52917 = new ArrayList();
        ArrayList term52924 = new ArrayList();
        ((ArrayList) term52924).add((Object)null);
        ((ArrayList) term52924).add((Object)null);
        ((ArrayList) term52924).add((Object)null);
        ((ArrayList) term52924).add((Object)null);
        ((ArrayList) term52924).add((Object)null);
        ((ArrayList) term52924).add((Object)null);
        ((ArrayList) term52924).add((Object)null);
        ((ArrayList) term52924).add((Object)null);
        Object term52923 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term52923, term52923.getClass(), "argument", term52924);
        setField(term52923, term52923.getClass(), "name", "");
        setField(term52923, term52923.getClass(), "qualified", "");
        ArrayList term52930 = new ArrayList();
        ((ArrayList) term52930).add((Object)null);
        ((ArrayList) term52930).add((Object)null);
        ((ArrayList) term52930).add((Object)null);
        ((ArrayList) term52930).add((Object)null);
        Object term52929 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term52929, term52929.getClass(), "argument", term52930);
        setField(term52929, term52929.getClass(), "name", "");
        setField(term52929, term52929.getClass(), "qualified", "");
        ArrayList term52936 = new ArrayList();
        ((ArrayList) term52936).add((Object)null);
        ((ArrayList) term52936).add((Object)null);
        ((ArrayList) term52936).add((Object)null);
        ((ArrayList) term52936).add((Object)null);
        ((ArrayList) term52936).add((Object)null);
        ((ArrayList) term52936).add((Object)null);
        ((ArrayList) term52936).add((Object)null);
        Object term52935 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term52935, term52935.getClass(), "argument", term52936);
        setField(term52935, term52935.getClass(), "name", "");
        setField(term52935, term52935.getClass(), "qualified", "");
        ArrayList term52942 = new ArrayList();
        ((ArrayList) term52942).add((Object)null);
        ((ArrayList) term52942).add((Object)null);
        ((ArrayList) term52942).add((Object)null);
        ((ArrayList) term52942).add((Object)null);
        ((ArrayList) term52942).add((Object)null);
        ((ArrayList) term52942).add((Object)null);
        ((ArrayList) term52942).add((Object)null);
        Object term52941 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term52941, term52941.getClass(), "argument", term52942);
        setField(term52941, term52941.getClass(), "name", "");
        setField(term52941, term52941.getClass(), "qualified", "");
        ArrayList term52948 = new ArrayList();
        Object term52947 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term52947, term52947.getClass(), "argument", term52948);
        setField(term52947, term52947.getClass(), "name", "");
        setField(term52947, term52947.getClass(), "qualified", "");
        ArrayList term52921 = new ArrayList();
        ((ArrayList) term52921).add(term52923);
        ((ArrayList) term52921).add(term52929);
        ((ArrayList) term52921).add(term52935);
        ((ArrayList) term52921).add(term52941);
        ((ArrayList) term52921).add(term52947);
        Boolean term52967 = new Boolean(false);
        Boolean term52969 = new Boolean(true);
        term52878 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationArgument"));
        Object term52879 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term52880 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term52880, term52880.getClass(), "extendsBound", term52881);
        setField(term52880, term52880.getClass(), "superBound", term52885);
        setField(term52879, term52879.getClass(), "wildcard", term52880);
        setField(term52879, term52879.getClass(), "generic", term52889);
        setField(term52879, term52879.getClass(), "qualified", "stxcPdrmfU");
        setField(term52879, term52879.getClass(), "dimension", "TOhFCBArUA");
        setField(term52878, term52878.getClass(), "type", term52879);
        setField(term52878, term52878.getClass(), "value", term52917);
        setField(term52878, term52878.getClass(), "annotation", term52921);
        setField(term52878, term52878.getClass(), "name", "UrLMnSrrua");
        setField(term52878, term52878.getClass(), "primitive", term52967);
        setField(term52878, term52878.getClass(), "array", term52969);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.AnnotationArgument");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAnnotation", argTypes, term52878, args);
    }

};


