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

public class Annotation_setIncluded_45936574113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44534;
     Object term44654;

    public Annotation_setIncluded_45936574113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term44549 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term44549, term44549.getClass(), "name", "");
        setField(term44549, term44549.getClass(), "text", "");
        Object term44552 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term44552, term44552.getClass(), "name", "");
        setField(term44552, term44552.getClass(), "text", "");
        Object term44555 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term44555, term44555.getClass(), "name", "");
        setField(term44555, term44555.getClass(), "text", "");
        Object term44558 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term44558, term44558.getClass(), "name", "");
        setField(term44558, term44558.getClass(), "text", "");
        ArrayList term44547 = new ArrayList();
        ((ArrayList) term44547).add(term44549);
        ((ArrayList) term44547).add(term44552);
        ((ArrayList) term44547).add(term44555);
        ((ArrayList) term44547).add(term44558);
        Object term44565 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term44566 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term44566, term44566.getClass(), "wildcard", null);
        setField(term44566, term44566.getClass(), "generic", null);
        setField(term44566, term44566.getClass(), "qualified", null);
        setField(term44566, term44566.getClass(), "dimension", null);
        setField(term44565, term44565.getClass(), "type", term44566);
        setField(term44565, term44565.getClass(), "name", "");
        setField(term44565, term44565.getClass(), "qualified", "");
        setField(term44565, term44565.getClass(), "_default", "");
        Object term44570 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term44571 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term44571, term44571.getClass(), "wildcard", null);
        setField(term44571, term44571.getClass(), "generic", null);
        setField(term44571, term44571.getClass(), "qualified", null);
        setField(term44571, term44571.getClass(), "dimension", null);
        setField(term44570, term44570.getClass(), "type", term44571);
        setField(term44570, term44570.getClass(), "name", "");
        setField(term44570, term44570.getClass(), "qualified", "");
        setField(term44570, term44570.getClass(), "_default", "");
        Object term44575 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationElement"));
        Object term44576 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term44576, term44576.getClass(), "wildcard", null);
        setField(term44576, term44576.getClass(), "generic", null);
        setField(term44576, term44576.getClass(), "qualified", null);
        setField(term44576, term44576.getClass(), "dimension", null);
        setField(term44575, term44575.getClass(), "type", term44576);
        setField(term44575, term44575.getClass(), "name", "");
        setField(term44575, term44575.getClass(), "qualified", "");
        setField(term44575, term44575.getClass(), "_default", "");
        ArrayList term44563 = new ArrayList();
        ((ArrayList) term44563).add(term44565);
        ((ArrayList) term44563).add(term44570);
        ((ArrayList) term44563).add(term44575);
        ArrayList term44585 = new ArrayList();
        ((ArrayList) term44585).add((Object)null);
        ((ArrayList) term44585).add((Object)null);
        ((ArrayList) term44585).add((Object)null);
        ((ArrayList) term44585).add((Object)null);
        ((ArrayList) term44585).add((Object)null);
        ((ArrayList) term44585).add((Object)null);
        ((ArrayList) term44585).add((Object)null);
        ((ArrayList) term44585).add((Object)null);
        ((ArrayList) term44585).add((Object)null);
        Object term44584 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term44584, term44584.getClass(), "argument", term44585);
        setField(term44584, term44584.getClass(), "name", "");
        setField(term44584, term44584.getClass(), "qualified", "");
        ArrayList term44591 = new ArrayList();
        ((ArrayList) term44591).add((Object)null);
        ((ArrayList) term44591).add((Object)null);
        ((ArrayList) term44591).add((Object)null);
        Object term44590 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term44590, term44590.getClass(), "argument", term44591);
        setField(term44590, term44590.getClass(), "name", "");
        setField(term44590, term44590.getClass(), "qualified", "");
        ArrayList term44597 = new ArrayList();
        ((ArrayList) term44597).add((Object)null);
        ((ArrayList) term44597).add((Object)null);
        ((ArrayList) term44597).add((Object)null);
        ((ArrayList) term44597).add((Object)null);
        ((ArrayList) term44597).add((Object)null);
        ((ArrayList) term44597).add((Object)null);
        Object term44596 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term44596, term44596.getClass(), "argument", term44597);
        setField(term44596, term44596.getClass(), "name", "");
        setField(term44596, term44596.getClass(), "qualified", "");
        ArrayList term44603 = new ArrayList();
        ((ArrayList) term44603).add((Object)null);
        ((ArrayList) term44603).add((Object)null);
        ((ArrayList) term44603).add((Object)null);
        Object term44602 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term44602, term44602.getClass(), "argument", term44603);
        setField(term44602, term44602.getClass(), "name", "");
        setField(term44602, term44602.getClass(), "qualified", "");
        ArrayList term44609 = new ArrayList();
        ((ArrayList) term44609).add((Object)null);
        ((ArrayList) term44609).add((Object)null);
        ((ArrayList) term44609).add((Object)null);
        ((ArrayList) term44609).add((Object)null);
        ((ArrayList) term44609).add((Object)null);
        ((ArrayList) term44609).add((Object)null);
        Object term44608 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term44608, term44608.getClass(), "argument", term44609);
        setField(term44608, term44608.getClass(), "name", "");
        setField(term44608, term44608.getClass(), "qualified", "");
        ArrayList term44582 = new ArrayList();
        ((ArrayList) term44582).add(term44584);
        ((ArrayList) term44582).add(term44590);
        ((ArrayList) term44582).add(term44596);
        ((ArrayList) term44582).add(term44602);
        ((ArrayList) term44582).add(term44608);
        ((ArrayList) term44582).add(term44602);
        ((ArrayList) term44582).add(term44590);
        ((ArrayList) term44582).add(term44596);
        ((ArrayList) term44582).add(term44590);
        Boolean term44652 = new Boolean(false);
        term44534 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Annotation"));
        setField(term44534, term44534.getClass(), "comment", "NHSDjuLYjD");
        setField(term44534, term44534.getClass(), "tag", term44547);
        setField(term44534, term44534.getClass(), "element", term44563);
        setField(term44534, term44534.getClass(), "annotation", term44582);
        setField(term44534, term44534.getClass(), "name", "ZEkLOAxhOq");
        setField(term44534, term44534.getClass(), "qualified", "WyoVFLxANG");
        setField(term44534, term44534.getClass(), "scope", "opshEcMQKE");
        setField(term44534, term44534.getClass(), "included", term44652);
        term44654 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Annotation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term44654;
        callMethod(klass, "setIncluded", argTypes, term44534, args);
    }

};


