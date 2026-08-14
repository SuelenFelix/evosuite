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

public class AnnotationArgument_setType_3811862372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54650;
     Object term54726;

    public AnnotationArgument_setType_3811862372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term54653 = new ArrayList();
        ArrayList term54657 = new ArrayList();
        ((ArrayList) term54657).add((Object)null);
        ((ArrayList) term54657).add((Object)null);
        ((ArrayList) term54657).add((Object)null);
        ((ArrayList) term54657).add((Object)null);
        ((ArrayList) term54657).add((Object)null);
        ((ArrayList) term54657).add((Object)null);
        Object term54663 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term54663, term54663.getClass(), "wildcard", null);
        setField(term54663, term54663.getClass(), "generic", null);
        setField(term54663, term54663.getClass(), "qualified", null);
        setField(term54663, term54663.getClass(), "dimension", null);
        ArrayList term54661 = new ArrayList();
        ((ArrayList) term54661).add(term54663);
        ArrayList term54690 = new ArrayList();
        ArrayList term54697 = new ArrayList();
        ((ArrayList) term54697).add((Object)null);
        ((ArrayList) term54697).add((Object)null);
        ((ArrayList) term54697).add((Object)null);
        ((ArrayList) term54697).add((Object)null);
        ((ArrayList) term54697).add((Object)null);
        ((ArrayList) term54697).add((Object)null);
        ((ArrayList) term54697).add((Object)null);
        Object term54696 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term54696, term54696.getClass(), "argument", term54697);
        setField(term54696, term54696.getClass(), "name", "");
        setField(term54696, term54696.getClass(), "qualified", "");
        ArrayList term54703 = new ArrayList();
        ((ArrayList) term54703).add((Object)null);
        ((ArrayList) term54703).add((Object)null);
        Object term54702 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term54702, term54702.getClass(), "argument", term54703);
        setField(term54702, term54702.getClass(), "name", "");
        setField(term54702, term54702.getClass(), "qualified", "");
        ArrayList term54694 = new ArrayList();
        ((ArrayList) term54694).add(term54696);
        ((ArrayList) term54694).add(term54702);
        Boolean term54722 = new Boolean(false);
        Boolean term54724 = new Boolean(true);
        term54650 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationArgument"));
        Object term54651 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term54652 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term54652, term54652.getClass(), "extendsBound", term54653);
        setField(term54652, term54652.getClass(), "superBound", term54657);
        setField(term54651, term54651.getClass(), "wildcard", term54652);
        setField(term54651, term54651.getClass(), "generic", term54661);
        setField(term54651, term54651.getClass(), "qualified", "ZcImTSVbEj");
        setField(term54651, term54651.getClass(), "dimension", "PvGPHATNbn");
        setField(term54650, term54650.getClass(), "type", term54651);
        setField(term54650, term54650.getClass(), "value", term54690);
        setField(term54650, term54650.getClass(), "annotation", term54694);
        setField(term54650, term54650.getClass(), "name", "EjIiXgQVpN");
        setField(term54650, term54650.getClass(), "primitive", term54722);
        setField(term54650, term54650.getClass(), "array", term54724);
        Object term54730 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term54730, term54730.getClass(), "wildcard", null);
        setField(term54730, term54730.getClass(), "generic", null);
        setField(term54730, term54730.getClass(), "qualified", null);
        setField(term54730, term54730.getClass(), "dimension", null);
        Object term54731 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term54731, term54731.getClass(), "wildcard", null);
        setField(term54731, term54731.getClass(), "generic", null);
        setField(term54731, term54731.getClass(), "qualified", null);
        setField(term54731, term54731.getClass(), "dimension", null);
        Object term54732 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term54732, term54732.getClass(), "wildcard", null);
        setField(term54732, term54732.getClass(), "generic", null);
        setField(term54732, term54732.getClass(), "qualified", null);
        setField(term54732, term54732.getClass(), "dimension", null);
        Object term54733 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term54733, term54733.getClass(), "wildcard", null);
        setField(term54733, term54733.getClass(), "generic", null);
        setField(term54733, term54733.getClass(), "qualified", null);
        setField(term54733, term54733.getClass(), "dimension", null);
        ArrayList term54728 = new ArrayList();
        ((ArrayList) term54728).add(term54730);
        ((ArrayList) term54728).add(term54726);
        ((ArrayList) term54728).add(term54731);
        ((ArrayList) term54728).add(term54732);
        ((ArrayList) term54728).add(term54733);
        ((ArrayList) term54728).add(term54732);
        ((ArrayList) term54728).add(term54732);
        Object term54738 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term54738, term54738.getClass(), "wildcard", null);
        setField(term54738, term54738.getClass(), "generic", null);
        setField(term54738, term54738.getClass(), "qualified", null);
        setField(term54738, term54738.getClass(), "dimension", null);
        Object term54739 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term54739, term54739.getClass(), "wildcard", null);
        setField(term54739, term54739.getClass(), "generic", null);
        setField(term54739, term54739.getClass(), "qualified", null);
        setField(term54739, term54739.getClass(), "dimension", null);
        ArrayList term54736 = new ArrayList();
        ((ArrayList) term54736).add(term54738);
        ((ArrayList) term54736).add(term54739);
        Object term54744 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term54744, term54744.getClass(), "wildcard", null);
        setField(term54744, term54744.getClass(), "generic", null);
        setField(term54744, term54744.getClass(), "qualified", null);
        setField(term54744, term54744.getClass(), "dimension", null);
        Object term54745 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term54745, term54745.getClass(), "wildcard", null);
        setField(term54745, term54745.getClass(), "generic", null);
        setField(term54745, term54745.getClass(), "qualified", null);
        setField(term54745, term54745.getClass(), "dimension", null);
        Object term54746 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term54746, term54746.getClass(), "wildcard", null);
        setField(term54746, term54746.getClass(), "generic", null);
        setField(term54746, term54746.getClass(), "qualified", null);
        setField(term54746, term54746.getClass(), "dimension", null);
        ArrayList term54742 = new ArrayList();
        ((ArrayList) term54742).add(term54744);
        ((ArrayList) term54742).add(term54745);
        ((ArrayList) term54742).add(term54746);
        ((ArrayList) term54742).add(term54730);
        ((ArrayList) term54742).add(term54732);
        term54726 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term54727 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term54727, term54727.getClass(), "extendsBound", term54728);
        setField(term54727, term54727.getClass(), "superBound", term54736);
        setField(term54726, term54726.getClass(), "wildcard", term54727);
        setField(term54726, term54726.getClass(), "generic", term54742);
        setField(term54726, term54726.getClass(), "qualified", "AODiaTWquF");
        setField(term54726, term54726.getClass(), "dimension", "lAaxjitzSK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.AnnotationArgument");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.automation.xmldoclet.xjc.TypeInfo");
        Object[] args = new Object[1];
        args[0] = term54726;
        callMethod(klass, "setType", argTypes, term54650, args);
    }

};


