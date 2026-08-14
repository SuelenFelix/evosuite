package com.usantatecla.ustumlserver.domain.model.classDiagram;

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
import static com.usantatecla.ustumlserver.domain.model.classDiagram.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class Class_setAttributes_6916102920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30815;
     Object term30910;

    public Class_setAttributes_6916102920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term30816 = new ArrayList();
        ArrayList term30825 = new ArrayList();
        ((ArrayList) term30825).add((Object)null);
        ((ArrayList) term30825).add((Object)null);
        ((ArrayList) term30825).add((Object)null);
        ((ArrayList) term30825).add((Object)null);
        ((ArrayList) term30825).add((Object)null);
        ((ArrayList) term30825).add((Object)null);
        Object term30822 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term30822, term30822.getClass(), "name", "");
        setField(term30822, term30822.getClass(), "type", "");
        setField(term30822, term30822.getClass(), "modifiers", term30825);
        ArrayList term30831 = new ArrayList();
        Object term30828 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term30828, term30828.getClass(), "name", "");
        setField(term30828, term30828.getClass(), "type", "");
        setField(term30828, term30828.getClass(), "modifiers", term30831);
        ArrayList term30837 = new ArrayList();
        ((ArrayList) term30837).add((Object)null);
        Object term30834 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term30834, term30834.getClass(), "name", "");
        setField(term30834, term30834.getClass(), "type", "");
        setField(term30834, term30834.getClass(), "modifiers", term30837);
        ArrayList term30843 = new ArrayList();
        ((ArrayList) term30843).add((Object)null);
        Object term30840 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term30840, term30840.getClass(), "name", "");
        setField(term30840, term30840.getClass(), "type", "");
        setField(term30840, term30840.getClass(), "modifiers", term30843);
        ArrayList term30849 = new ArrayList();
        Object term30846 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term30846, term30846.getClass(), "name", "");
        setField(term30846, term30846.getClass(), "type", "");
        setField(term30846, term30846.getClass(), "modifiers", term30849);
        ArrayList term30855 = new ArrayList();
        ((ArrayList) term30855).add((Object)null);
        ((ArrayList) term30855).add((Object)null);
        ((ArrayList) term30855).add((Object)null);
        ((ArrayList) term30855).add((Object)null);
        Object term30852 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term30852, term30852.getClass(), "name", "");
        setField(term30852, term30852.getClass(), "type", "");
        setField(term30852, term30852.getClass(), "modifiers", term30855);
        ArrayList term30861 = new ArrayList();
        ((ArrayList) term30861).add((Object)null);
        ((ArrayList) term30861).add((Object)null);
        ((ArrayList) term30861).add((Object)null);
        Object term30858 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term30858, term30858.getClass(), "name", "");
        setField(term30858, term30858.getClass(), "type", "");
        setField(term30858, term30858.getClass(), "modifiers", term30861);
        ArrayList term30867 = new ArrayList();
        ((ArrayList) term30867).add((Object)null);
        ((ArrayList) term30867).add((Object)null);
        Object term30864 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term30864, term30864.getClass(), "name", "");
        setField(term30864, term30864.getClass(), "type", "");
        setField(term30864, term30864.getClass(), "modifiers", term30867);
        ArrayList term30873 = new ArrayList();
        ((ArrayList) term30873).add((Object)null);
        ((ArrayList) term30873).add((Object)null);
        Object term30870 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term30870, term30870.getClass(), "name", "");
        setField(term30870, term30870.getClass(), "type", "");
        setField(term30870, term30870.getClass(), "modifiers", term30873);
        ArrayList term30820 = new ArrayList();
        ((ArrayList) term30820).add(term30822);
        ((ArrayList) term30820).add(term30828);
        ((ArrayList) term30820).add(term30834);
        ((ArrayList) term30820).add(term30840);
        ((ArrayList) term30820).add(term30846);
        ((ArrayList) term30820).add(term30852);
        ((ArrayList) term30820).add(term30858);
        ((ArrayList) term30820).add(term30864);
        ((ArrayList) term30820).add(term30870);
        ArrayList term30878 = new ArrayList();
        ArrayList term30906 = new ArrayList();
        ((ArrayList) term30906).add((Object)null);
        ((ArrayList) term30906).add((Object)null);
        ((ArrayList) term30906).add((Object)null);
        ((ArrayList) term30906).add((Object)null);
        ((ArrayList) term30906).add((Object)null);
        ((ArrayList) term30906).add((Object)null);
        term30815 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class"));
        setField(term30815, term30815.getClass(), "modifiers", term30816);
        setField(term30815, term30815.getClass(), "attributes", term30820);
        setField(term30815, term30815.getClass(), "methods", term30878);
        setField(term30815, term30815.getClass(), "id", "HegRNsidFg");
        setField(term30815, term30815.getClass(), "name", "udRdJkgXmH");
        setField(term30815, term30815.getClass(), "relations", term30906);
        term30910 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term30910;
        callMethod(klass, "setAttributes", argTypes, term30815, args);
    }

};


