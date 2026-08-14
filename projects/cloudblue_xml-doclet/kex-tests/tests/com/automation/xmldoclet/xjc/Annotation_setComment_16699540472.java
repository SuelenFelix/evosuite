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

public class Annotation_setComment_16699540472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42755;

    public Annotation_setComment_16699540472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term42770 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term42770, term42770.getClass(), "name", "");
        setField(term42770, term42770.getClass(), "text", "");
        Object term42773 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term42773, term42773.getClass(), "name", "");
        setField(term42773, term42773.getClass(), "text", "");
        Object term42776 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term42776, term42776.getClass(), "name", "");
        setField(term42776, term42776.getClass(), "text", "");
        Object term42779 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term42779, term42779.getClass(), "name", "");
        setField(term42779, term42779.getClass(), "text", "");
        Object term42782 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term42782, term42782.getClass(), "name", "");
        setField(term42782, term42782.getClass(), "text", "");
        ArrayList term42768 = new ArrayList();
        ((ArrayList) term42768).add(term42770);
        ((ArrayList) term42768).add(term42773);
        ((ArrayList) term42768).add(term42776);
        ((ArrayList) term42768).add(term42779);
        ((ArrayList) term42768).add(term42782);
        ArrayList term42787 = new ArrayList();
        ArrayList term42791 = new ArrayList();
        Boolean term42831 = new Boolean(false);
        term42755 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Annotation"));
        setField(term42755, term42755.getClass(), "comment", "AouJHfhVkt");
        setField(term42755, term42755.getClass(), "tag", term42768);
        setField(term42755, term42755.getClass(), "element", term42787);
        setField(term42755, term42755.getClass(), "annotation", term42791);
        setField(term42755, term42755.getClass(), "name", "DthmeRjqtB");
        setField(term42755, term42755.getClass(), "qualified", "ATNcXATdDD");
        setField(term42755, term42755.getClass(), "scope", "TODbGitNAz");
        setField(term42755, term42755.getClass(), "included", term42831);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Annotation");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UdhGgnzBQx";
        callMethod(klass, "setComment", argTypes, term42755, args);
    }

};


