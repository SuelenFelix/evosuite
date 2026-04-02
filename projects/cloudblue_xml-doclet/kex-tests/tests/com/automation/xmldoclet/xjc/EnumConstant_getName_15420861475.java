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

public class EnumConstant_getName_15420861475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7707;

    public EnumConstant_getName_15420861475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7722 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term7722, term7722.getClass(), "name", "");
        setField(term7722, term7722.getClass(), "text", "");
        Object term7725 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term7725, term7725.getClass(), "name", "");
        setField(term7725, term7725.getClass(), "text", "");
        Object term7728 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term7728, term7728.getClass(), "name", "");
        setField(term7728, term7728.getClass(), "text", "");
        Object term7731 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term7731, term7731.getClass(), "name", "");
        setField(term7731, term7731.getClass(), "text", "");
        ArrayList term7720 = new ArrayList();
        ((ArrayList) term7720).add(term7722);
        ((ArrayList) term7720).add(term7725);
        ((ArrayList) term7720).add(term7728);
        ((ArrayList) term7720).add(term7731);
        ArrayList term7739 = new ArrayList();
        ((ArrayList) term7739).add((Object)null);
        ((ArrayList) term7739).add((Object)null);
        ((ArrayList) term7739).add((Object)null);
        ((ArrayList) term7739).add((Object)null);
        ((ArrayList) term7739).add((Object)null);
        ((ArrayList) term7739).add((Object)null);
        ((ArrayList) term7739).add((Object)null);
        ((ArrayList) term7739).add((Object)null);
        Object term7738 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term7738, term7738.getClass(), "argument", term7739);
        setField(term7738, term7738.getClass(), "name", "");
        setField(term7738, term7738.getClass(), "qualified", "");
        ArrayList term7745 = new ArrayList();
        ((ArrayList) term7745).add((Object)null);
        ((ArrayList) term7745).add((Object)null);
        ((ArrayList) term7745).add((Object)null);
        ((ArrayList) term7745).add((Object)null);
        ((ArrayList) term7745).add((Object)null);
        ((ArrayList) term7745).add((Object)null);
        ((ArrayList) term7745).add((Object)null);
        Object term7744 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term7744, term7744.getClass(), "argument", term7745);
        setField(term7744, term7744.getClass(), "name", "");
        setField(term7744, term7744.getClass(), "qualified", "");
        ArrayList term7751 = new ArrayList();
        Object term7750 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term7750, term7750.getClass(), "argument", term7751);
        setField(term7750, term7750.getClass(), "name", "");
        setField(term7750, term7750.getClass(), "qualified", "");
        ArrayList term7757 = new ArrayList();
        Object term7756 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term7756, term7756.getClass(), "argument", term7757);
        setField(term7756, term7756.getClass(), "name", "");
        setField(term7756, term7756.getClass(), "qualified", "");
        ArrayList term7763 = new ArrayList();
        ((ArrayList) term7763).add((Object)null);
        ((ArrayList) term7763).add((Object)null);
        ((ArrayList) term7763).add((Object)null);
        ((ArrayList) term7763).add((Object)null);
        Object term7762 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term7762, term7762.getClass(), "argument", term7763);
        setField(term7762, term7762.getClass(), "name", "");
        setField(term7762, term7762.getClass(), "qualified", "");
        ArrayList term7736 = new ArrayList();
        ((ArrayList) term7736).add(term7738);
        ((ArrayList) term7736).add(term7744);
        ((ArrayList) term7736).add(term7750);
        ((ArrayList) term7736).add(term7744);
        ((ArrayList) term7736).add(term7756);
        ((ArrayList) term7736).add(term7750);
        ((ArrayList) term7736).add(term7762);
        ((ArrayList) term7736).add(term7756);
        term7707 = newInstance(Class.forName("com.automation.xmldoclet.xjc.EnumConstant"));
        setField(term7707, term7707.getClass(), "comment", "xtNmObxmHy");
        setField(term7707, term7707.getClass(), "tag", term7720);
        setField(term7707, term7707.getClass(), "annotation", term7736);
        setField(term7707, term7707.getClass(), "name", "gyLdvdOJQs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.EnumConstant");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term7707, args);
    }

};


