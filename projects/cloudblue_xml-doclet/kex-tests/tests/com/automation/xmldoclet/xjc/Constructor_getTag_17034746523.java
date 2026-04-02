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

public class Constructor_getTag_17034746523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term914;

    public Constructor_getTag_17034746523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term929 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term929, term929.getClass(), "name", "");
        setField(term929, term929.getClass(), "text", "");
        Object term932 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term932, term932.getClass(), "name", "");
        setField(term932, term932.getClass(), "text", "");
        Object term935 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term935, term935.getClass(), "name", "");
        setField(term935, term935.getClass(), "text", "");
        Object term938 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term938, term938.getClass(), "name", "");
        setField(term938, term938.getClass(), "text", "");
        Object term941 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term941, term941.getClass(), "name", "");
        setField(term941, term941.getClass(), "text", "");
        ArrayList term927 = new ArrayList();
        ((ArrayList) term927).add(term929);
        ((ArrayList) term927).add(term932);
        ((ArrayList) term927).add(term935);
        ((ArrayList) term927).add(term938);
        ((ArrayList) term927).add(term941);
        ArrayList term950 = new ArrayList();
        ((ArrayList) term950).add((Object)null);
        ((ArrayList) term950).add((Object)null);
        ((ArrayList) term950).add((Object)null);
        Object term948 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term949 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term949, term949.getClass(), "wildcard", null);
        setField(term949, term949.getClass(), "generic", null);
        setField(term949, term949.getClass(), "qualified", null);
        setField(term949, term949.getClass(), "dimension", null);
        setField(term948, term948.getClass(), "type", term949);
        setField(term948, term948.getClass(), "annotation", term950);
        setField(term948, term948.getClass(), "name", "");
        ArrayList term956 = new ArrayList();
        Object term954 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term955 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term955, term955.getClass(), "wildcard", null);
        setField(term955, term955.getClass(), "generic", null);
        setField(term955, term955.getClass(), "qualified", null);
        setField(term955, term955.getClass(), "dimension", null);
        setField(term954, term954.getClass(), "type", term955);
        setField(term954, term954.getClass(), "annotation", term956);
        setField(term954, term954.getClass(), "name", "");
        ArrayList term962 = new ArrayList();
        ((ArrayList) term962).add((Object)null);
        ((ArrayList) term962).add((Object)null);
        ((ArrayList) term962).add((Object)null);
        ((ArrayList) term962).add((Object)null);
        ((ArrayList) term962).add((Object)null);
        ((ArrayList) term962).add((Object)null);
        Object term960 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term961 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term961, term961.getClass(), "wildcard", null);
        setField(term961, term961.getClass(), "generic", null);
        setField(term961, term961.getClass(), "qualified", null);
        setField(term961, term961.getClass(), "dimension", null);
        setField(term960, term960.getClass(), "type", term961);
        setField(term960, term960.getClass(), "annotation", term962);
        setField(term960, term960.getClass(), "name", "");
        ArrayList term968 = new ArrayList();
        ((ArrayList) term968).add((Object)null);
        ((ArrayList) term968).add((Object)null);
        ((ArrayList) term968).add((Object)null);
        ((ArrayList) term968).add((Object)null);
        ((ArrayList) term968).add((Object)null);
        ((ArrayList) term968).add((Object)null);
        ((ArrayList) term968).add((Object)null);
        Object term966 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term967 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term967, term967.getClass(), "wildcard", null);
        setField(term967, term967.getClass(), "generic", null);
        setField(term967, term967.getClass(), "qualified", null);
        setField(term967, term967.getClass(), "dimension", null);
        setField(term966, term966.getClass(), "type", term967);
        setField(term966, term966.getClass(), "annotation", term968);
        setField(term966, term966.getClass(), "name", "");
        ArrayList term974 = new ArrayList();
        ((ArrayList) term974).add((Object)null);
        ((ArrayList) term974).add((Object)null);
        ((ArrayList) term974).add((Object)null);
        ((ArrayList) term974).add((Object)null);
        ((ArrayList) term974).add((Object)null);
        Object term972 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term973 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term973, term973.getClass(), "wildcard", null);
        setField(term973, term973.getClass(), "generic", null);
        setField(term973, term973.getClass(), "qualified", null);
        setField(term973, term973.getClass(), "dimension", null);
        setField(term972, term972.getClass(), "type", term973);
        setField(term972, term972.getClass(), "annotation", term974);
        setField(term972, term972.getClass(), "name", "");
        ArrayList term946 = new ArrayList();
        ((ArrayList) term946).add(term948);
        ((ArrayList) term946).add(term954);
        ((ArrayList) term946).add(term960);
        ((ArrayList) term946).add(term966);
        ((ArrayList) term946).add(term972);
        ArrayList term984 = new ArrayList();
        Object term982 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term983 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term983, term983.getClass(), "extendsBound", null);
        setField(term983, term983.getClass(), "superBound", null);
        setField(term982, term982.getClass(), "wildcard", term983);
        setField(term982, term982.getClass(), "generic", term984);
        setField(term982, term982.getClass(), "qualified", "");
        setField(term982, term982.getClass(), "dimension", "");
        Object term989 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term989, term989.getClass(), "wildcard", null);
        setField(term989, term989.getClass(), "generic", null);
        setField(term989, term989.getClass(), "qualified", null);
        setField(term989, term989.getClass(), "dimension", null);
        ArrayList term980 = new ArrayList();
        ((ArrayList) term980).add(term973);
        ((ArrayList) term980).add(term982);
        ((ArrayList) term980).add(term955);
        ((ArrayList) term980).add(term967);
        ((ArrayList) term980).add(term989);
        ((ArrayList) term980).add(term955);
        ((ArrayList) term980).add(term961);
        ((ArrayList) term980).add(term967);
        ArrayList term995 = new ArrayList();
        Object term994 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term994, term994.getClass(), "argument", term995);
        setField(term994, term994.getClass(), "name", "");
        setField(term994, term994.getClass(), "qualified", "");
        Object term1000 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term1000, term1000.getClass(), "argument", null);
        setField(term1000, term1000.getClass(), "name", null);
        setField(term1000, term1000.getClass(), "qualified", null);
        ArrayList term992 = new ArrayList();
        ((ArrayList) term992).add(term994);
        ((ArrayList) term992).add(term1000);
        Boolean term1051 = new Boolean(false);
        Boolean term1053 = new Boolean(true);
        Boolean term1055 = new Boolean(false);
        Boolean term1057 = new Boolean(false);
        Boolean term1059 = new Boolean(true);
        Boolean term1061 = new Boolean(true);
        term914 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Constructor"));
        setField(term914, term914.getClass(), "comment", "vqnBkkxoIa");
        setField(term914, term914.getClass(), "tag", term927);
        setField(term914, term914.getClass(), "parameter", term946);
        setField(term914, term914.getClass(), "exception", term980);
        setField(term914, term914.getClass(), "annotation", term992);
        setField(term914, term914.getClass(), "name", "mnHyQbMyld");
        setField(term914, term914.getClass(), "signature", "KHtaDOIcJZ");
        setField(term914, term914.getClass(), "qualified", "vgdwrCZczl");
        setField(term914, term914.getClass(), "scope", "gKMNrpKBpu");
        setField(term914, term914.getClass(), "_final", term1051);
        setField(term914, term914.getClass(), "included", term1053);
        setField(term914, term914.getClass(), "_native", term1055);
        setField(term914, term914.getClass(), "_synchronized", term1057);
        setField(term914, term914.getClass(), "_static", term1059);
        setField(term914, term914.getClass(), "varArgs", term1061);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Constructor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTag", argTypes, term914, args);
    }

};


