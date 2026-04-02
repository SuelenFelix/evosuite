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

public class Method_getScope_74075162020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48711;

    public Method_getScope_74075162020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term48726 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term48726, term48726.getClass(), "name", "");
        setField(term48726, term48726.getClass(), "text", "");
        Object term48729 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term48729, term48729.getClass(), "name", "");
        setField(term48729, term48729.getClass(), "text", "");
        Object term48732 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term48732, term48732.getClass(), "name", "");
        setField(term48732, term48732.getClass(), "text", "");
        Object term48735 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term48735, term48735.getClass(), "name", "");
        setField(term48735, term48735.getClass(), "text", "");
        Object term48738 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term48738, term48738.getClass(), "name", "");
        setField(term48738, term48738.getClass(), "text", "");
        Object term48741 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term48741, term48741.getClass(), "name", "");
        setField(term48741, term48741.getClass(), "text", "");
        ArrayList term48724 = new ArrayList();
        ((ArrayList) term48724).add(term48726);
        ((ArrayList) term48724).add(term48729);
        ((ArrayList) term48724).add(term48732);
        ((ArrayList) term48724).add(term48735);
        ((ArrayList) term48724).add(term48738);
        ((ArrayList) term48724).add(term48741);
        ArrayList term48750 = new ArrayList();
        ((ArrayList) term48750).add((Object)null);
        ((ArrayList) term48750).add((Object)null);
        ((ArrayList) term48750).add((Object)null);
        ((ArrayList) term48750).add((Object)null);
        ((ArrayList) term48750).add((Object)null);
        ((ArrayList) term48750).add((Object)null);
        Object term48748 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term48749 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term48749, term48749.getClass(), "wildcard", null);
        setField(term48749, term48749.getClass(), "generic", null);
        setField(term48749, term48749.getClass(), "qualified", null);
        setField(term48749, term48749.getClass(), "dimension", null);
        setField(term48748, term48748.getClass(), "type", term48749);
        setField(term48748, term48748.getClass(), "annotation", term48750);
        setField(term48748, term48748.getClass(), "name", "");
        ArrayList term48756 = new ArrayList();
        ((ArrayList) term48756).add((Object)null);
        ((ArrayList) term48756).add((Object)null);
        ((ArrayList) term48756).add((Object)null);
        ((ArrayList) term48756).add((Object)null);
        ((ArrayList) term48756).add((Object)null);
        ((ArrayList) term48756).add((Object)null);
        ((ArrayList) term48756).add((Object)null);
        ((ArrayList) term48756).add((Object)null);
        Object term48754 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term48755 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term48755, term48755.getClass(), "wildcard", null);
        setField(term48755, term48755.getClass(), "generic", null);
        setField(term48755, term48755.getClass(), "qualified", null);
        setField(term48755, term48755.getClass(), "dimension", null);
        setField(term48754, term48754.getClass(), "type", term48755);
        setField(term48754, term48754.getClass(), "annotation", term48756);
        setField(term48754, term48754.getClass(), "name", "");
        ArrayList term48746 = new ArrayList();
        ((ArrayList) term48746).add(term48748);
        ((ArrayList) term48746).add(term48754);
        Object term48764 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term48764, term48764.getClass(), "wildcard", null);
        setField(term48764, term48764.getClass(), "generic", null);
        setField(term48764, term48764.getClass(), "qualified", null);
        setField(term48764, term48764.getClass(), "dimension", null);
        Object term48765 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term48765, term48765.getClass(), "wildcard", null);
        setField(term48765, term48765.getClass(), "generic", null);
        setField(term48765, term48765.getClass(), "qualified", null);
        setField(term48765, term48765.getClass(), "dimension", null);
        Object term48766 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term48766, term48766.getClass(), "wildcard", null);
        setField(term48766, term48766.getClass(), "generic", null);
        setField(term48766, term48766.getClass(), "qualified", null);
        setField(term48766, term48766.getClass(), "dimension", null);
        Object term48767 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term48767, term48767.getClass(), "wildcard", null);
        setField(term48767, term48767.getClass(), "generic", null);
        setField(term48767, term48767.getClass(), "qualified", null);
        setField(term48767, term48767.getClass(), "dimension", null);
        ArrayList term48762 = new ArrayList();
        ((ArrayList) term48762).add(term48749);
        ((ArrayList) term48762).add(term48764);
        ((ArrayList) term48762).add(term48765);
        ((ArrayList) term48762).add(term48766);
        ((ArrayList) term48762).add(term48767);
        Object term48772 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term48772, term48772.getClass(), "argument", null);
        setField(term48772, term48772.getClass(), "name", null);
        setField(term48772, term48772.getClass(), "qualified", null);
        ArrayList term48774 = new ArrayList();
        ((ArrayList) term48774).add((Object)null);
        ((ArrayList) term48774).add((Object)null);
        ((ArrayList) term48774).add((Object)null);
        ((ArrayList) term48774).add((Object)null);
        ((ArrayList) term48774).add((Object)null);
        ((ArrayList) term48774).add((Object)null);
        Object term48773 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term48773, term48773.getClass(), "argument", term48774);
        setField(term48773, term48773.getClass(), "name", "");
        setField(term48773, term48773.getClass(), "qualified", "");
        ArrayList term48770 = new ArrayList();
        ((ArrayList) term48770).add(term48772);
        ((ArrayList) term48770).add(term48773);
        Boolean term48829 = new Boolean(false);
        Boolean term48831 = new Boolean(true);
        Boolean term48833 = new Boolean(false);
        Boolean term48835 = new Boolean(false);
        Boolean term48837 = new Boolean(false);
        Boolean term48839 = new Boolean(false);
        Boolean term48841 = new Boolean(false);
        term48711 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Method"));
        setField(term48711, term48711.getClass(), "comment", "ICCZJRszuI");
        setField(term48711, term48711.getClass(), "tag", term48724);
        setField(term48711, term48711.getClass(), "parameter", term48746);
        setField(term48711, term48711.getClass(), "_return", term48755);
        setField(term48711, term48711.getClass(), "exception", term48762);
        setField(term48711, term48711.getClass(), "annotation", term48770);
        setField(term48711, term48711.getClass(), "name", "UMrPdiXrmI");
        setField(term48711, term48711.getClass(), "signature", "cFVgbtnrKt");
        setField(term48711, term48711.getClass(), "qualified", "TexKVxVHtd");
        setField(term48711, term48711.getClass(), "scope", "VnsHjZqIRT");
        setField(term48711, term48711.getClass(), "_abstract", term48829);
        setField(term48711, term48711.getClass(), "_final", term48831);
        setField(term48711, term48711.getClass(), "included", term48833);
        setField(term48711, term48711.getClass(), "_native", term48835);
        setField(term48711, term48711.getClass(), "_synchronized", term48837);
        setField(term48711, term48711.getClass(), "_static", term48839);
        setField(term48711, term48711.getClass(), "varArgs", term48841);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Method");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScope", argTypes, term48711, args);
    }

};


