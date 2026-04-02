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

public class Field_getComment_14340107685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55114;

    public Field_getComment_14340107685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term55117 = new ArrayList();
        ((ArrayList) term55117).add((Object)null);
        ((ArrayList) term55117).add((Object)null);
        ((ArrayList) term55117).add((Object)null);
        ((ArrayList) term55117).add((Object)null);
        ((ArrayList) term55117).add((Object)null);
        ((ArrayList) term55117).add((Object)null);
        ((ArrayList) term55117).add((Object)null);
        ((ArrayList) term55117).add((Object)null);
        ((ArrayList) term55117).add((Object)null);
        ArrayList term55121 = new ArrayList();
        Object term55127 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term55127, term55127.getClass(), "wildcard", null);
        setField(term55127, term55127.getClass(), "generic", null);
        setField(term55127, term55127.getClass(), "qualified", null);
        setField(term55127, term55127.getClass(), "dimension", null);
        Object term55128 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term55128, term55128.getClass(), "wildcard", null);
        setField(term55128, term55128.getClass(), "generic", null);
        setField(term55128, term55128.getClass(), "qualified", null);
        setField(term55128, term55128.getClass(), "dimension", null);
        Object term55129 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term55129, term55129.getClass(), "wildcard", null);
        setField(term55129, term55129.getClass(), "generic", null);
        setField(term55129, term55129.getClass(), "qualified", null);
        setField(term55129, term55129.getClass(), "dimension", null);
        Object term55130 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term55130, term55130.getClass(), "wildcard", null);
        setField(term55130, term55130.getClass(), "generic", null);
        setField(term55130, term55130.getClass(), "qualified", null);
        setField(term55130, term55130.getClass(), "dimension", null);
        Object term55131 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term55131, term55131.getClass(), "wildcard", null);
        setField(term55131, term55131.getClass(), "generic", null);
        setField(term55131, term55131.getClass(), "qualified", null);
        setField(term55131, term55131.getClass(), "dimension", null);
        Object term55132 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term55132, term55132.getClass(), "wildcard", null);
        setField(term55132, term55132.getClass(), "generic", null);
        setField(term55132, term55132.getClass(), "qualified", null);
        setField(term55132, term55132.getClass(), "dimension", null);
        ArrayList term55125 = new ArrayList();
        ((ArrayList) term55125).add(term55127);
        ((ArrayList) term55125).add(term55128);
        ((ArrayList) term55125).add(term55129);
        ((ArrayList) term55125).add(term55130);
        ((ArrayList) term55125).add(term55131);
        ((ArrayList) term55125).add(term55132);
        ((ArrayList) term55125).add(term55129);
        Object term55173 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term55173, term55173.getClass(), "name", "");
        setField(term55173, term55173.getClass(), "text", "");
        Object term55176 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term55176, term55176.getClass(), "name", "");
        setField(term55176, term55176.getClass(), "text", "");
        Object term55179 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term55179, term55179.getClass(), "name", "");
        setField(term55179, term55179.getClass(), "text", "");
        ArrayList term55171 = new ArrayList();
        ((ArrayList) term55171).add(term55173);
        ((ArrayList) term55171).add(term55176);
        ((ArrayList) term55171).add(term55179);
        ArrayList term55196 = new ArrayList();
        Boolean term55236 = new Boolean(true);
        Boolean term55238 = new Boolean(true);
        Boolean term55240 = new Boolean(true);
        Boolean term55242 = new Boolean(false);
        term55114 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Field"));
        Object term55115 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term55116 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term55116, term55116.getClass(), "extendsBound", term55117);
        setField(term55116, term55116.getClass(), "superBound", term55121);
        setField(term55115, term55115.getClass(), "wildcard", term55116);
        setField(term55115, term55115.getClass(), "generic", term55125);
        setField(term55115, term55115.getClass(), "qualified", "WTntCqvPHx");
        setField(term55115, term55115.getClass(), "dimension", "XWUNufuicE");
        setField(term55114, term55114.getClass(), "type", term55115);
        setField(term55114, term55114.getClass(), "comment", "cpuUPYbFqm");
        setField(term55114, term55114.getClass(), "tag", term55171);
        setField(term55114, term55114.getClass(), "constant", "nnSzYSYtqS");
        setField(term55114, term55114.getClass(), "annotation", term55196);
        setField(term55114, term55114.getClass(), "name", "fLzDYlullC");
        setField(term55114, term55114.getClass(), "qualified", "tTtfYMoFOk");
        setField(term55114, term55114.getClass(), "scope", "hOKJaeptHA");
        setField(term55114, term55114.getClass(), "_volatile", term55236);
        setField(term55114, term55114.getClass(), "_transient", term55238);
        setField(term55114, term55114.getClass(), "_static", term55240);
        setField(term55114, term55114.getClass(), "_final", term55242);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Field");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComment", argTypes, term55114, args);
    }

};


