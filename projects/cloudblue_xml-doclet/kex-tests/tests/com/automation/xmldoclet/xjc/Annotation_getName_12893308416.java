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

public class Annotation_getName_12893308416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43309;

    public Annotation_getName_12893308416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term43324 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term43324, term43324.getClass(), "name", "");
        setField(term43324, term43324.getClass(), "text", "");
        Object term43327 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term43327, term43327.getClass(), "name", "");
        setField(term43327, term43327.getClass(), "text", "");
        Object term43330 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term43330, term43330.getClass(), "name", "");
        setField(term43330, term43330.getClass(), "text", "");
        Object term43333 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term43333, term43333.getClass(), "name", "");
        setField(term43333, term43333.getClass(), "text", "");
        Object term43336 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term43336, term43336.getClass(), "name", "");
        setField(term43336, term43336.getClass(), "text", "");
        Object term43339 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term43339, term43339.getClass(), "name", "");
        setField(term43339, term43339.getClass(), "text", "");
        Object term43342 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term43342, term43342.getClass(), "name", "");
        setField(term43342, term43342.getClass(), "text", "");
        Object term43345 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term43345, term43345.getClass(), "name", "");
        setField(term43345, term43345.getClass(), "text", "");
        ArrayList term43322 = new ArrayList();
        ((ArrayList) term43322).add(term43324);
        ((ArrayList) term43322).add(term43327);
        ((ArrayList) term43322).add(term43330);
        ((ArrayList) term43322).add(term43333);
        ((ArrayList) term43322).add(term43336);
        ((ArrayList) term43322).add(term43339);
        ((ArrayList) term43322).add(term43342);
        ((ArrayList) term43322).add(term43345);
        Object term43352 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term43353 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term43353, term43353.getClass(), "wildcard", null);
        setField(term43353, term43353.getClass(), "generic", null);
        setField(term43353, term43353.getClass(), "qualified", null);
        setField(term43353, term43353.getClass(), "dimension", null);
        setField(term43352, term43352.getClass(), "type", term43353);
        setField(term43352, term43352.getClass(), "name", "");
        setField(term43352, term43352.getClass(), "qualified", "");
        setField(term43352, term43352.getClass(), "_default", "");
        Object term43357 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term43358 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term43358, term43358.getClass(), "wildcard", null);
        setField(term43358, term43358.getClass(), "generic", null);
        setField(term43358, term43358.getClass(), "qualified", null);
        setField(term43358, term43358.getClass(), "dimension", null);
        setField(term43357, term43357.getClass(), "type", term43358);
        setField(term43357, term43357.getClass(), "name", "");
        setField(term43357, term43357.getClass(), "qualified", "");
        setField(term43357, term43357.getClass(), "_default", "");
        Object term43362 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term43363 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term43363, term43363.getClass(), "wildcard", null);
        setField(term43363, term43363.getClass(), "generic", null);
        setField(term43363, term43363.getClass(), "qualified", null);
        setField(term43363, term43363.getClass(), "dimension", null);
        setField(term43362, term43362.getClass(), "type", term43363);
        setField(term43362, term43362.getClass(), "name", "");
        setField(term43362, term43362.getClass(), "qualified", "");
        setField(term43362, term43362.getClass(), "_default", "");
        Object term43367 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term43368 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term43368, term43368.getClass(), "wildcard", null);
        setField(term43368, term43368.getClass(), "generic", null);
        setField(term43368, term43368.getClass(), "qualified", null);
        setField(term43368, term43368.getClass(), "dimension", null);
        setField(term43367, term43367.getClass(), "type", term43368);
        setField(term43367, term43367.getClass(), "name", "");
        setField(term43367, term43367.getClass(), "qualified", "");
        setField(term43367, term43367.getClass(), "_default", "");
        Object term43372 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term43373 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term43373, term43373.getClass(), "wildcard", null);
        setField(term43373, term43373.getClass(), "generic", null);
        setField(term43373, term43373.getClass(), "qualified", null);
        setField(term43373, term43373.getClass(), "dimension", null);
        setField(term43372, term43372.getClass(), "type", term43373);
        setField(term43372, term43372.getClass(), "name", "");
        setField(term43372, term43372.getClass(), "qualified", "");
        setField(term43372, term43372.getClass(), "_default", "");
        Object term43377 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term43378 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term43378, term43378.getClass(), "wildcard", null);
        setField(term43378, term43378.getClass(), "generic", null);
        setField(term43378, term43378.getClass(), "qualified", null);
        setField(term43378, term43378.getClass(), "dimension", null);
        setField(term43377, term43377.getClass(), "type", term43378);
        setField(term43377, term43377.getClass(), "name", "");
        setField(term43377, term43377.getClass(), "qualified", "");
        setField(term43377, term43377.getClass(), "_default", "");
        Object term43382 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        setField(term43382, term43382.getClass(), "type", term43368);
        setField(term43382, term43382.getClass(), "name", "");
        setField(term43382, term43382.getClass(), "qualified", "");
        setField(term43382, term43382.getClass(), "_default", "");
        Object term43386 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term43387 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term43387, term43387.getClass(), "wildcard", null);
        setField(term43387, term43387.getClass(), "generic", null);
        setField(term43387, term43387.getClass(), "qualified", null);
        setField(term43387, term43387.getClass(), "dimension", null);
        setField(term43386, term43386.getClass(), "type", term43387);
        setField(term43386, term43386.getClass(), "name", "");
        setField(term43386, term43386.getClass(), "qualified", "");
        setField(term43386, term43386.getClass(), "_default", "");
        Object term43391 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        setField(term43391, term43391.getClass(), "type", term43358);
        setField(term43391, term43391.getClass(), "name", "");
        setField(term43391, term43391.getClass(), "qualified", "");
        setField(term43391, term43391.getClass(), "_default", "");
        ArrayList term43350 = new ArrayList();
        ((ArrayList) term43350).add(term43352);
        ((ArrayList) term43350).add(term43357);
        ((ArrayList) term43350).add(term43362);
        ((ArrayList) term43350).add(term43367);
        ((ArrayList) term43350).add(term43372);
        ((ArrayList) term43350).add(term43377);
        ((ArrayList) term43350).add(term43382);
        ((ArrayList) term43350).add(term43386);
        ((ArrayList) term43350).add(term43391);
        ArrayList term43400 = new ArrayList();
        ((ArrayList) term43400).add((Object)null);
        ((ArrayList) term43400).add((Object)null);
        ((ArrayList) term43400).add((Object)null);
        Object term43399 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term43399, term43399.getClass(), "argument", term43400);
        setField(term43399, term43399.getClass(), "name", "");
        setField(term43399, term43399.getClass(), "qualified", "");
        ArrayList term43406 = new ArrayList();
        ((ArrayList) term43406).add((Object)null);
        Object term43405 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term43405, term43405.getClass(), "argument", term43406);
        setField(term43405, term43405.getClass(), "name", "");
        setField(term43405, term43405.getClass(), "qualified", "");
        ArrayList term43412 = new ArrayList();
        ((ArrayList) term43412).add((Object)null);
        ((ArrayList) term43412).add((Object)null);
        Object term43411 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term43411, term43411.getClass(), "argument", term43412);
        setField(term43411, term43411.getClass(), "name", "");
        setField(term43411, term43411.getClass(), "qualified", "");
        ArrayList term43397 = new ArrayList();
        ((ArrayList) term43397).add(term43399);
        ((ArrayList) term43397).add(term43405);
        ((ArrayList) term43397).add(term43411);
        Boolean term43455 = new Boolean(true);
        term43309 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Annotation"));
        setField(term43309, term43309.getClass(), "comment", "bgabpMBUJI");
        setField(term43309, term43309.getClass(), "tag", term43322);
        setField(term43309, term43309.getClass(), "element", term43350);
        setField(term43309, term43309.getClass(), "annotation", term43397);
        setField(term43309, term43309.getClass(), "name", "HvZXCbuDzi");
        setField(term43309, term43309.getClass(), "qualified", "JQNnsCGeMS");
        setField(term43309, term43309.getClass(), "scope", "JOQkrTRvJu");
        setField(term43309, term43309.getClass(), "included", term43455);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Annotation");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term43309, args);
    }

};


