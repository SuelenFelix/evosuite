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

public class Field_isStatic_161618669433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60890;

    public Field_isStatic_161618669433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term60893 = new ArrayList();
        ((ArrayList) term60893).add((Object)null);
        ((ArrayList) term60893).add((Object)null);
        ((ArrayList) term60893).add((Object)null);
        ((ArrayList) term60893).add((Object)null);
        ((ArrayList) term60893).add((Object)null);
        ArrayList term60897 = new ArrayList();
        ((ArrayList) term60897).add((Object)null);
        ((ArrayList) term60897).add((Object)null);
        ((ArrayList) term60897).add((Object)null);
        ((ArrayList) term60897).add((Object)null);
        ((ArrayList) term60897).add((Object)null);
        ArrayList term60901 = new ArrayList();
        Object term60943 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term60943, term60943.getClass(), "name", "");
        setField(term60943, term60943.getClass(), "text", "");
        Object term60946 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term60946, term60946.getClass(), "name", "");
        setField(term60946, term60946.getClass(), "text", "");
        Object term60949 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term60949, term60949.getClass(), "name", "");
        setField(term60949, term60949.getClass(), "text", "");
        Object term60952 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term60952, term60952.getClass(), "name", "");
        setField(term60952, term60952.getClass(), "text", "");
        Object term60955 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term60955, term60955.getClass(), "name", "");
        setField(term60955, term60955.getClass(), "text", "");
        Object term60958 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term60958, term60958.getClass(), "name", "");
        setField(term60958, term60958.getClass(), "text", "");
        ArrayList term60941 = new ArrayList();
        ((ArrayList) term60941).add(term60943);
        ((ArrayList) term60941).add(term60946);
        ((ArrayList) term60941).add(term60949);
        ((ArrayList) term60941).add(term60952);
        ((ArrayList) term60941).add(term60955);
        ((ArrayList) term60941).add(term60958);
        ArrayList term60978 = new ArrayList();
        ((ArrayList) term60978).add((Object)null);
        Object term60977 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term60977, term60977.getClass(), "argument", term60978);
        setField(term60977, term60977.getClass(), "name", "");
        setField(term60977, term60977.getClass(), "qualified", "");
        ArrayList term60975 = new ArrayList();
        ((ArrayList) term60975).add(term60977);
        Boolean term61021 = new Boolean(true);
        Boolean term61023 = new Boolean(true);
        Boolean term61025 = new Boolean(true);
        Boolean term61027 = new Boolean(true);
        term60890 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Field"));
        Object term60891 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term60892 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term60892, term60892.getClass(), "extendsBound", term60893);
        setField(term60892, term60892.getClass(), "superBound", term60897);
        setField(term60891, term60891.getClass(), "wildcard", term60892);
        setField(term60891, term60891.getClass(), "generic", term60901);
        setField(term60891, term60891.getClass(), "qualified", "IsKWevDvDN");
        setField(term60891, term60891.getClass(), "dimension", "YWQZxNeTsN");
        setField(term60890, term60890.getClass(), "type", term60891);
        setField(term60890, term60890.getClass(), "comment", "QHPCoaLpPb");
        setField(term60890, term60890.getClass(), "tag", term60941);
        setField(term60890, term60890.getClass(), "constant", "JrgKDebhdL");
        setField(term60890, term60890.getClass(), "annotation", term60975);
        setField(term60890, term60890.getClass(), "name", "yyPqyxZPlL");
        setField(term60890, term60890.getClass(), "qualified", "oiUtixhBDB");
        setField(term60890, term60890.getClass(), "scope", "irEoFunFtf");
        setField(term60890, term60890.getClass(), "_volatile", term61021);
        setField(term60890, term60890.getClass(), "_transient", term61023);
        setField(term60890, term60890.getClass(), "_static", term61025);
        setField(term60890, term60890.getClass(), "_final", term61027);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Field");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isStatic", argTypes, term60890, args);
    }

};


