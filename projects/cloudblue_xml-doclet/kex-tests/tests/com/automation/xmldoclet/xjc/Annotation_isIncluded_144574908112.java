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

public class Annotation_isIncluded_144574908112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44397;

    public Annotation_isIncluded_144574908112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term44412 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term44412, term44412.getClass(), "name", "");
        setField(term44412, term44412.getClass(), "text", "");
        Object term44415 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term44415, term44415.getClass(), "name", "");
        setField(term44415, term44415.getClass(), "text", "");
        Object term44418 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term44418, term44418.getClass(), "name", "");
        setField(term44418, term44418.getClass(), "text", "");
        Object term44421 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term44421, term44421.getClass(), "name", "");
        setField(term44421, term44421.getClass(), "text", "");
        Object term44424 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term44424, term44424.getClass(), "name", "");
        setField(term44424, term44424.getClass(), "text", "");
        Object term44427 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term44427, term44427.getClass(), "name", "");
        setField(term44427, term44427.getClass(), "text", "");
        ArrayList term44410 = new ArrayList();
        ((ArrayList) term44410).add(term44412);
        ((ArrayList) term44410).add(term44415);
        ((ArrayList) term44410).add(term44418);
        ((ArrayList) term44410).add(term44421);
        ((ArrayList) term44410).add(term44424);
        ((ArrayList) term44410).add(term44427);
        Object term44434 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term44435 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term44435, term44435.getClass(), "wildcard", null);
        setField(term44435, term44435.getClass(), "generic", null);
        setField(term44435, term44435.getClass(), "qualified", null);
        setField(term44435, term44435.getClass(), "dimension", null);
        setField(term44434, term44434.getClass(), "type", term44435);
        setField(term44434, term44434.getClass(), "name", "");
        setField(term44434, term44434.getClass(), "qualified", "");
        setField(term44434, term44434.getClass(), "_default", "");
        Object term44439 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term44440 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term44440, term44440.getClass(), "wildcard", null);
        setField(term44440, term44440.getClass(), "generic", null);
        setField(term44440, term44440.getClass(), "qualified", null);
        setField(term44440, term44440.getClass(), "dimension", null);
        setField(term44439, term44439.getClass(), "type", term44440);
        setField(term44439, term44439.getClass(), "name", "");
        setField(term44439, term44439.getClass(), "qualified", "");
        setField(term44439, term44439.getClass(), "_default", "");
        ArrayList term44432 = new ArrayList();
        ((ArrayList) term44432).add(term44434);
        ((ArrayList) term44432).add(term44439);
        ArrayList term44449 = new ArrayList();
        ((ArrayList) term44449).add((Object)null);
        ((ArrayList) term44449).add((Object)null);
        ((ArrayList) term44449).add((Object)null);
        ((ArrayList) term44449).add((Object)null);
        Object term44448 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term44448, term44448.getClass(), "argument", term44449);
        setField(term44448, term44448.getClass(), "name", "");
        setField(term44448, term44448.getClass(), "qualified", "");
        ArrayList term44446 = new ArrayList();
        ((ArrayList) term44446).add(term44448);
        Boolean term44492 = new Boolean(true);
        term44397 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Annotation"));
        setField(term44397, term44397.getClass(), "comment", "SQncqRDKPN");
        setField(term44397, term44397.getClass(), "tag", term44410);
        setField(term44397, term44397.getClass(), "element", term44432);
        setField(term44397, term44397.getClass(), "annotation", term44446);
        setField(term44397, term44397.getClass(), "name", "NtCFjfwNZY");
        setField(term44397, term44397.getClass(), "qualified", "faRMMoEReo");
        setField(term44397, term44397.getClass(), "scope", "gHvxxYtTrX");
        setField(term44397, term44397.getClass(), "included", term44492);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Annotation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isIncluded", argTypes, term44397, args);
    }

};


