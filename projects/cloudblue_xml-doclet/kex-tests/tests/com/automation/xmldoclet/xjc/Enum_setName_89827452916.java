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

public class Enum_setName_89827452916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34625;

    public Enum_setName_89827452916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term34640 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term34640, term34640.getClass(), "name", "");
        setField(term34640, term34640.getClass(), "text", "");
        ArrayList term34638 = new ArrayList();
        ((ArrayList) term34638).add(term34640);
        ArrayList term34647 = new ArrayList();
        ((ArrayList) term34647).add((Object)null);
        ((ArrayList) term34647).add((Object)null);
        ((ArrayList) term34647).add((Object)null);
        ArrayList term34651 = new ArrayList();
        ((ArrayList) term34651).add((Object)null);
        Object term34657 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term34657, term34657.getClass(), "wildcard", null);
        setField(term34657, term34657.getClass(), "generic", null);
        setField(term34657, term34657.getClass(), "qualified", null);
        setField(term34657, term34657.getClass(), "dimension", null);
        Object term34658 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term34658, term34658.getClass(), "wildcard", null);
        setField(term34658, term34658.getClass(), "generic", null);
        setField(term34658, term34658.getClass(), "qualified", null);
        setField(term34658, term34658.getClass(), "dimension", null);
        ArrayList term34655 = new ArrayList();
        ((ArrayList) term34655).add(term34657);
        ((ArrayList) term34655).add(term34658);
        Object term34687 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term34687, term34687.getClass(), "wildcard", null);
        setField(term34687, term34687.getClass(), "generic", null);
        setField(term34687, term34687.getClass(), "qualified", null);
        setField(term34687, term34687.getClass(), "dimension", null);
        ArrayList term34685 = new ArrayList();
        ((ArrayList) term34685).add(term34687);
        ArrayList term34690 = new ArrayList();
        ArrayList term34697 = new ArrayList();
        ((ArrayList) term34697).add((Object)null);
        ((ArrayList) term34697).add((Object)null);
        ((ArrayList) term34697).add((Object)null);
        ((ArrayList) term34697).add((Object)null);
        ((ArrayList) term34697).add((Object)null);
        ((ArrayList) term34697).add((Object)null);
        ((ArrayList) term34697).add((Object)null);
        Object term34696 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term34696, term34696.getClass(), "argument", term34697);
        setField(term34696, term34696.getClass(), "name", "");
        setField(term34696, term34696.getClass(), "qualified", "");
        ArrayList term34703 = new ArrayList();
        ((ArrayList) term34703).add((Object)null);
        ((ArrayList) term34703).add((Object)null);
        ((ArrayList) term34703).add((Object)null);
        ((ArrayList) term34703).add((Object)null);
        ((ArrayList) term34703).add((Object)null);
        ((ArrayList) term34703).add((Object)null);
        Object term34702 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term34702, term34702.getClass(), "argument", term34703);
        setField(term34702, term34702.getClass(), "name", "");
        setField(term34702, term34702.getClass(), "qualified", "");
        ArrayList term34709 = new ArrayList();
        ((ArrayList) term34709).add((Object)null);
        ((ArrayList) term34709).add((Object)null);
        Object term34708 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term34708, term34708.getClass(), "argument", term34709);
        setField(term34708, term34708.getClass(), "name", "");
        setField(term34708, term34708.getClass(), "qualified", "");
        ArrayList term34715 = new ArrayList();
        Object term34714 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term34714, term34714.getClass(), "argument", term34715);
        setField(term34714, term34714.getClass(), "name", "");
        setField(term34714, term34714.getClass(), "qualified", "");
        ArrayList term34721 = new ArrayList();
        ((ArrayList) term34721).add((Object)null);
        ((ArrayList) term34721).add((Object)null);
        ((ArrayList) term34721).add((Object)null);
        ((ArrayList) term34721).add((Object)null);
        ((ArrayList) term34721).add((Object)null);
        ((ArrayList) term34721).add((Object)null);
        ((ArrayList) term34721).add((Object)null);
        ((ArrayList) term34721).add((Object)null);
        Object term34720 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term34720, term34720.getClass(), "argument", term34721);
        setField(term34720, term34720.getClass(), "name", "");
        setField(term34720, term34720.getClass(), "qualified", "");
        ArrayList term34694 = new ArrayList();
        ((ArrayList) term34694).add(term34696);
        ((ArrayList) term34694).add(term34702);
        ((ArrayList) term34694).add(term34708);
        ((ArrayList) term34694).add(term34714);
        ((ArrayList) term34694).add(term34720);
        Boolean term34764 = new Boolean(true);
        term34625 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Enum"));
        Object term34645 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term34646 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term34625, term34625.getClass(), "comment", "AheuvbpcEh");
        setField(term34625, term34625.getClass(), "tag", term34638);
        setField(term34646, term34646.getClass(), "extendsBound", term34647);
        setField(term34646, term34646.getClass(), "superBound", term34651);
        setField(term34645, term34645.getClass(), "wildcard", term34646);
        setField(term34645, term34645.getClass(), "generic", term34655);
        setField(term34645, term34645.getClass(), "qualified", "McGIyCSPDq");
        setField(term34645, term34645.getClass(), "dimension", "DomylWWXxB");
        setField(term34625, term34625.getClass(), "clazz", term34645);
        setField(term34625, term34625.getClass(), "_interface", term34685);
        setField(term34625, term34625.getClass(), "constant", term34690);
        setField(term34625, term34625.getClass(), "annotation", term34694);
        setField(term34625, term34625.getClass(), "name", "VFVtUIgTiw");
        setField(term34625, term34625.getClass(), "qualified", "kxPWFZqtzn");
        setField(term34625, term34625.getClass(), "scope", "rYcZdXyZVp");
        setField(term34625, term34625.getClass(), "included", term34764);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Enum");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LYolXAGOVy";
        callMethod(klass, "setName", argTypes, term34625, args);
    }

};


