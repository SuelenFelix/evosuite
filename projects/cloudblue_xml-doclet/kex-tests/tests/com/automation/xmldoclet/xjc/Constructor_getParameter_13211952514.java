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

public class Constructor_getParameter_13211952514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1113;

    public Constructor_getParameter_13211952514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1128 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term1128, term1128.getClass(), "name", "");
        setField(term1128, term1128.getClass(), "text", "");
        Object term1131 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term1131, term1131.getClass(), "name", "");
        setField(term1131, term1131.getClass(), "text", "");
        Object term1134 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term1134, term1134.getClass(), "name", "");
        setField(term1134, term1134.getClass(), "text", "");
        Object term1137 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TagInfo"));
        setField(term1137, term1137.getClass(), "name", "");
        setField(term1137, term1137.getClass(), "text", "");
        ArrayList term1126 = new ArrayList();
        ((ArrayList) term1126).add(term1128);
        ((ArrayList) term1126).add(term1131);
        ((ArrayList) term1126).add(term1134);
        ((ArrayList) term1126).add(term1137);
        ArrayList term1146 = new ArrayList();
        Object term1144 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term1145 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term1145, term1145.getClass(), "wildcard", null);
        setField(term1145, term1145.getClass(), "generic", null);
        setField(term1145, term1145.getClass(), "qualified", null);
        setField(term1145, term1145.getClass(), "dimension", null);
        setField(term1144, term1144.getClass(), "type", term1145);
        setField(term1144, term1144.getClass(), "annotation", term1146);
        setField(term1144, term1144.getClass(), "name", "");
        ArrayList term1152 = new ArrayList();
        ((ArrayList) term1152).add((Object)null);
        ((ArrayList) term1152).add((Object)null);
        Object term1150 = newInstance(Class.forName("com.automation.xmldoclet.xjc.MethodParameter"));
        Object term1151 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term1151, term1151.getClass(), "wildcard", null);
        setField(term1151, term1151.getClass(), "generic", null);
        setField(term1151, term1151.getClass(), "qualified", null);
        setField(term1151, term1151.getClass(), "dimension", null);
        setField(term1150, term1150.getClass(), "type", term1151);
        setField(term1150, term1150.getClass(), "annotation", term1152);
        setField(term1150, term1150.getClass(), "name", "");
        ArrayList term1142 = new ArrayList();
        ((ArrayList) term1142).add(term1144);
        ((ArrayList) term1142).add(term1150);
        Object term1160 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term1160, term1160.getClass(), "wildcard", null);
        setField(term1160, term1160.getClass(), "generic", null);
        setField(term1160, term1160.getClass(), "qualified", null);
        setField(term1160, term1160.getClass(), "dimension", null);
        Object term1161 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        setField(term1161, term1161.getClass(), "wildcard", null);
        setField(term1161, term1161.getClass(), "generic", null);
        setField(term1161, term1161.getClass(), "qualified", null);
        setField(term1161, term1161.getClass(), "dimension", null);
        ArrayList term1164 = new ArrayList();
        ((ArrayList) term1164).add((Object)null);
        ((ArrayList) term1164).add((Object)null);
        ((ArrayList) term1164).add((Object)null);
        ((ArrayList) term1164).add((Object)null);
        ((ArrayList) term1164).add((Object)null);
        ((ArrayList) term1164).add((Object)null);
        Object term1162 = newInstance(Class.forName("com.automation.xmldoclet.xjc.TypeInfo"));
        Object term1163 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Wildcard"));
        setField(term1163, term1163.getClass(), "extendsBound", null);
        setField(term1163, term1163.getClass(), "superBound", null);
        setField(term1162, term1162.getClass(), "wildcard", term1163);
        setField(term1162, term1162.getClass(), "generic", term1164);
        setField(term1162, term1162.getClass(), "qualified", "");
        setField(term1162, term1162.getClass(), "dimension", "");
        ArrayList term1158 = new ArrayList();
        ((ArrayList) term1158).add(term1160);
        ((ArrayList) term1158).add(term1161);
        ((ArrayList) term1158).add(term1162);
        ((ArrayList) term1158).add(term1160);
        Object term1173 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term1173, term1173.getClass(), "argument", null);
        setField(term1173, term1173.getClass(), "name", null);
        setField(term1173, term1173.getClass(), "qualified", null);
        Object term1174 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term1174, term1174.getClass(), "argument", null);
        setField(term1174, term1174.getClass(), "name", null);
        setField(term1174, term1174.getClass(), "qualified", null);
        Object term1175 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term1175, term1175.getClass(), "argument", null);
        setField(term1175, term1175.getClass(), "name", null);
        setField(term1175, term1175.getClass(), "qualified", null);
        ArrayList term1177 = new ArrayList();
        ((ArrayList) term1177).add((Object)null);
        ((ArrayList) term1177).add((Object)null);
        ((ArrayList) term1177).add((Object)null);
        ((ArrayList) term1177).add((Object)null);
        ((ArrayList) term1177).add((Object)null);
        ((ArrayList) term1177).add((Object)null);
        ((ArrayList) term1177).add((Object)null);
        Object term1176 = newInstance(Class.forName("com.automation.xmldoclet.xjc.AnnotationInstance"));
        setField(term1176, term1176.getClass(), "argument", term1177);
        setField(term1176, term1176.getClass(), "name", "");
        setField(term1176, term1176.getClass(), "qualified", "");
        ArrayList term1171 = new ArrayList();
        ((ArrayList) term1171).add(term1173);
        ((ArrayList) term1171).add(term1174);
        ((ArrayList) term1171).add(term1175);
        ((ArrayList) term1171).add(term1176);
        ((ArrayList) term1171).add(term1173);
        ((ArrayList) term1171).add(term1176);
        ((ArrayList) term1171).add(term1174);
        ((ArrayList) term1171).add(term1175);
        ((ArrayList) term1171).add(term1174);
        Boolean term1232 = new Boolean(true);
        Boolean term1234 = new Boolean(true);
        Boolean term1236 = new Boolean(false);
        Boolean term1238 = new Boolean(false);
        Boolean term1240 = new Boolean(false);
        Boolean term1242 = new Boolean(false);
        term1113 = newInstance(Class.forName("com.automation.xmldoclet.xjc.Constructor"));
        setField(term1113, term1113.getClass(), "comment", "ZbHJVEqcoa");
        setField(term1113, term1113.getClass(), "tag", term1126);
        setField(term1113, term1113.getClass(), "parameter", term1142);
        setField(term1113, term1113.getClass(), "exception", term1158);
        setField(term1113, term1113.getClass(), "annotation", term1171);
        setField(term1113, term1113.getClass(), "name", "VuLLXpvPpZ");
        setField(term1113, term1113.getClass(), "signature", "UEdzEKEEEV");
        setField(term1113, term1113.getClass(), "qualified", "BcENaQFYSd");
        setField(term1113, term1113.getClass(), "scope", "POPYycoDBy");
        setField(term1113, term1113.getClass(), "_final", term1232);
        setField(term1113, term1113.getClass(), "included", term1234);
        setField(term1113, term1113.getClass(), "_native", term1236);
        setField(term1113, term1113.getClass(), "_synchronized", term1238);
        setField(term1113, term1113.getClass(), "_static", term1240);
        setField(term1113, term1113.getClass(), "varArgs", term1242);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.automation.xmldoclet.xjc.Constructor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParameter", argTypes, term1113, args);
    }

};


