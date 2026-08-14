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

public class Annotation_getTag_2704786453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42895;

    public Annotation_getTag_2704786453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term42910 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term42910, term42910.getClass(), "name", "");
        setField(term42910, term42910.getClass(), "text", "");
        ArrayList term42908 = new ArrayList();
        ((ArrayList) term42908).add(term42910);
        ArrayList term42915 = new ArrayList();
        ArrayList term42922 = new ArrayList();
        ((ArrayList) term42922).add((Object)null);
        ((ArrayList) term42922).add((Object)null);
        ((ArrayList) term42922).add((Object)null);
        ((ArrayList) term42922).add((Object)null);
        ((ArrayList) term42922).add((Object)null);
        Object term42921 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term42921, term42921.getClass(), "argument", term42922);
        setField(term42921, term42921.getClass(), "name", "");
        setField(term42921, term42921.getClass(), "qualified", "");
        ArrayList term42928 = new ArrayList();
        ((ArrayList) term42928).add((Object)null);
        Object term42927 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term42927, term42927.getClass(), "argument", term42928);
        setField(term42927, term42927.getClass(), "name", "");
        setField(term42927, term42927.getClass(), "qualified", "");
        ArrayList term42934 = new ArrayList();
        ((ArrayList) term42934).add((Object)null);
        ((ArrayList) term42934).add((Object)null);
        ((ArrayList) term42934).add((Object)null);
        ((ArrayList) term42934).add((Object)null);
        ((ArrayList) term42934).add((Object)null);
        ((ArrayList) term42934).add((Object)null);
        Object term42933 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term42933, term42933.getClass(), "argument", term42934);
        setField(term42933, term42933.getClass(), "name", "");
        setField(term42933, term42933.getClass(), "qualified", "");
        ArrayList term42940 = new ArrayList();
        ((ArrayList) term42940).add((Object)null);
        ((ArrayList) term42940).add((Object)null);
        ((ArrayList) term42940).add((Object)null);
        ((ArrayList) term42940).add((Object)null);
        Object term42939 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term42939, term42939.getClass(), "argument", term42940);
        setField(term42939, term42939.getClass(), "name", "");
        setField(term42939, term42939.getClass(), "qualified", "");
        ArrayList term42946 = new ArrayList();
        ((ArrayList) term42946).add((Object)null);
        ((ArrayList) term42946).add((Object)null);
        ((ArrayList) term42946).add((Object)null);
        ((ArrayList) term42946).add((Object)null);
        ((ArrayList) term42946).add((Object)null);
        ((ArrayList) term42946).add((Object)null);
        ((ArrayList) term42946).add((Object)null);
        ((ArrayList) term42946).add((Object)null);
        Object term42945 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term42945, term42945.getClass(), "argument", term42946);
        setField(term42945, term42945.getClass(), "name", "");
        setField(term42945, term42945.getClass(), "qualified", "");
        ArrayList term42952 = new ArrayList();
        ((ArrayList) term42952).add((Object)null);
        ((ArrayList) term42952).add((Object)null);
        Object term42951 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term42951, term42951.getClass(), "argument", term42952);
        setField(term42951, term42951.getClass(), "name", "");
        setField(term42951, term42951.getClass(), "qualified", "");
        ArrayList term42919 = new ArrayList();
        ((ArrayList) term42919).add(term42921);
        ((ArrayList) term42919).add(term42921);
        ((ArrayList) term42919).add(term42927);
        ((ArrayList) term42919).add(term42933);
        ((ArrayList) term42919).add(term42939);
        ((ArrayList) term42919).add(term42945);
        ((ArrayList) term42919).add(term42951);
        Boolean term42995 = new Boolean(true);
        term42895 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Annotation"));
        setField(term42895, term42895.getClass(), "comment", "JHwprxZzLl");
        setField(term42895, term42895.getClass(), "tag", term42908);
        setField(term42895, term42895.getClass(), "element", term42915);
        setField(term42895, term42895.getClass(), "annotation", term42919);
        setField(term42895, term42895.getClass(), "name", "RbhCtpGXCa");
        setField(term42895, term42895.getClass(), "qualified", "lQuDfWZydn");
        setField(term42895, term42895.getClass(), "scope", "KAghZGtstY");
        setField(term42895, term42895.getClass(), "included", term42995);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Annotation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTag", argTypes, term42895, args);
    }

};


