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

public class EnumConstant_getTag_5232339513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7529;

    public EnumConstant_getTag_5232339513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7544 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term7544, term7544.getClass(), "name", "");
        setField(term7544, term7544.getClass(), "text", "");
        Object term7547 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term7547, term7547.getClass(), "name", "");
        setField(term7547, term7547.getClass(), "text", "");
        Object term7550 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term7550, term7550.getClass(), "name", "");
        setField(term7550, term7550.getClass(), "text", "");
        Object term7553 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term7553, term7553.getClass(), "name", "");
        setField(term7553, term7553.getClass(), "text", "");
        Object term7556 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term7556, term7556.getClass(), "name", "");
        setField(term7556, term7556.getClass(), "text", "");
        Object term7559 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term7559, term7559.getClass(), "name", "");
        setField(term7559, term7559.getClass(), "text", "");
        Object term7562 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term7562, term7562.getClass(), "name", "");
        setField(term7562, term7562.getClass(), "text", "");
        Object term7565 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term7565, term7565.getClass(), "name", "");
        setField(term7565, term7565.getClass(), "text", "");
        ArrayList term7542 = new ArrayList();
        ((ArrayList) term7542).add(term7544);
        ((ArrayList) term7542).add(term7547);
        ((ArrayList) term7542).add(term7550);
        ((ArrayList) term7542).add(term7553);
        ((ArrayList) term7542).add(term7556);
        ((ArrayList) term7542).add(term7559);
        ((ArrayList) term7542).add(term7562);
        ((ArrayList) term7542).add(term7565);
        ArrayList term7573 = new ArrayList();
        ((ArrayList) term7573).add((Object)null);
        ((ArrayList) term7573).add((Object)null);
        ((ArrayList) term7573).add((Object)null);
        ((ArrayList) term7573).add((Object)null);
        ((ArrayList) term7573).add((Object)null);
        ((ArrayList) term7573).add((Object)null);
        ((ArrayList) term7573).add((Object)null);
        ((ArrayList) term7573).add((Object)null);
        Object term7572 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term7572, term7572.getClass(), "argument", term7573);
        setField(term7572, term7572.getClass(), "name", "");
        setField(term7572, term7572.getClass(), "qualified", "");
        ArrayList term7579 = new ArrayList();
        Object term7578 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term7578, term7578.getClass(), "argument", term7579);
        setField(term7578, term7578.getClass(), "name", "");
        setField(term7578, term7578.getClass(), "qualified", "");
        ArrayList term7585 = new ArrayList();
        ((ArrayList) term7585).add((Object)null);
        Object term7584 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term7584, term7584.getClass(), "argument", term7585);
        setField(term7584, term7584.getClass(), "name", "");
        setField(term7584, term7584.getClass(), "qualified", "");
        ArrayList term7591 = new ArrayList();
        ((ArrayList) term7591).add((Object)null);
        ((ArrayList) term7591).add((Object)null);
        ((ArrayList) term7591).add((Object)null);
        ((ArrayList) term7591).add((Object)null);
        ((ArrayList) term7591).add((Object)null);
        ((ArrayList) term7591).add((Object)null);
        Object term7590 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term7590, term7590.getClass(), "argument", term7591);
        setField(term7590, term7590.getClass(), "name", "");
        setField(term7590, term7590.getClass(), "qualified", "");
        ArrayList term7597 = new ArrayList();
        ((ArrayList) term7597).add((Object)null);
        ((ArrayList) term7597).add((Object)null);
        ((ArrayList) term7597).add((Object)null);
        Object term7596 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term7596, term7596.getClass(), "argument", term7597);
        setField(term7596, term7596.getClass(), "name", "");
        setField(term7596, term7596.getClass(), "qualified", "");
        ArrayList term7603 = new ArrayList();
        ((ArrayList) term7603).add((Object)null);
        ((ArrayList) term7603).add((Object)null);
        ((ArrayList) term7603).add((Object)null);
        ((ArrayList) term7603).add((Object)null);
        ((ArrayList) term7603).add((Object)null);
        ((ArrayList) term7603).add((Object)null);
        ((ArrayList) term7603).add((Object)null);
        Object term7602 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term7602, term7602.getClass(), "argument", term7603);
        setField(term7602, term7602.getClass(), "name", "");
        setField(term7602, term7602.getClass(), "qualified", "");
        ArrayList term7570 = new ArrayList();
        ((ArrayList) term7570).add(term7572);
        ((ArrayList) term7570).add(term7578);
        ((ArrayList) term7570).add(term7584);
        ((ArrayList) term7570).add(term7590);
        ((ArrayList) term7570).add(term7578);
        ((ArrayList) term7570).add(term7596);
        ((ArrayList) term7570).add(term7602);
        term7529 = newInstance(Class.forName("com.automation.xmldoclet.xjc.EnumConstant"));
        setField(term7529, term7529.getClass(), "comment", "nUWkEhozFC");
        setField(term7529, term7529.getClass(), "tag", term7542);
        setField(term7529, term7529.getClass(), "annotation", term7570);
        setField(term7529, term7529.getClass(), "name", "tIucnzigbY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.EnumConstant");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTag", argTypes, term7529, args);
    }

};


