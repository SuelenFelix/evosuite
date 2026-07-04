package com.org.model.vo;

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
import static com.org.model.vo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.lang.Object;
import java.util.ArrayList;

public class RouterVO_getChildren_6959973517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1072;

    public RouterVO_getChildren_6959973517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term1097 = new Boolean(false);
        Boolean term1153 = new Boolean(false);
        ArrayList term1158 = new ArrayList();
        ((ArrayList) term1158).add((Object)null);
        ((ArrayList) term1158).add((Object)null);
        ((ArrayList) term1158).add((Object)null);
        ((ArrayList) term1158).add((Object)null);
        ((ArrayList) term1158).add((Object)null);
        ((ArrayList) term1158).add((Object)null);
        ((ArrayList) term1158).add((Object)null);
        Object term1150 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term1157 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term1150, term1150.getClass(), "name", "");
        setField(term1150, term1150.getClass(), "path", "");
        setField(term1150, term1150.getClass(), "hidden", term1153);
        setField(term1150, term1150.getClass(), "redirect", "");
        setField(term1150, term1150.getClass(), "component", "");
        setField(term1157, term1157.getClass(), "title", null);
        setField(term1157, term1157.getClass(), "icon", null);
        setField(term1150, term1150.getClass(), "meta", term1157);
        setField(term1150, term1150.getClass(), "children", term1158);
        Boolean term1164 = new Boolean(true);
        ArrayList term1169 = new ArrayList();
        ((ArrayList) term1169).add((Object)null);
        ((ArrayList) term1169).add((Object)null);
        ((ArrayList) term1169).add((Object)null);
        ((ArrayList) term1169).add((Object)null);
        ((ArrayList) term1169).add((Object)null);
        Object term1161 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term1168 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term1161, term1161.getClass(), "name", "");
        setField(term1161, term1161.getClass(), "path", "");
        setField(term1161, term1161.getClass(), "hidden", term1164);
        setField(term1161, term1161.getClass(), "redirect", "");
        setField(term1161, term1161.getClass(), "component", "");
        setField(term1168, term1168.getClass(), "title", null);
        setField(term1168, term1168.getClass(), "icon", null);
        setField(term1161, term1161.getClass(), "meta", term1168);
        setField(term1161, term1161.getClass(), "children", term1169);
        Boolean term1175 = new Boolean(false);
        ArrayList term1180 = new ArrayList();
        ((ArrayList) term1180).add((Object)null);
        Object term1172 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term1179 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term1172, term1172.getClass(), "name", "");
        setField(term1172, term1172.getClass(), "path", "");
        setField(term1172, term1172.getClass(), "hidden", term1175);
        setField(term1172, term1172.getClass(), "redirect", "");
        setField(term1172, term1172.getClass(), "component", "");
        setField(term1179, term1179.getClass(), "title", null);
        setField(term1179, term1179.getClass(), "icon", null);
        setField(term1172, term1172.getClass(), "meta", term1179);
        setField(term1172, term1172.getClass(), "children", term1180);
        Boolean term1186 = new Boolean(false);
        ArrayList term1191 = new ArrayList();
        ((ArrayList) term1191).add((Object)null);
        ((ArrayList) term1191).add((Object)null);
        ((ArrayList) term1191).add((Object)null);
        ((ArrayList) term1191).add((Object)null);
        ((ArrayList) term1191).add((Object)null);
        ((ArrayList) term1191).add((Object)null);
        Object term1183 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term1190 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term1183, term1183.getClass(), "name", "");
        setField(term1183, term1183.getClass(), "path", "");
        setField(term1183, term1183.getClass(), "hidden", term1186);
        setField(term1183, term1183.getClass(), "redirect", "");
        setField(term1183, term1183.getClass(), "component", "");
        setField(term1190, term1190.getClass(), "title", null);
        setField(term1190, term1190.getClass(), "icon", null);
        setField(term1183, term1183.getClass(), "meta", term1190);
        setField(term1183, term1183.getClass(), "children", term1191);
        Boolean term1197 = new Boolean(false);
        ArrayList term1202 = new ArrayList();
        ((ArrayList) term1202).add((Object)null);
        ((ArrayList) term1202).add((Object)null);
        ((ArrayList) term1202).add((Object)null);
        ((ArrayList) term1202).add((Object)null);
        ((ArrayList) term1202).add((Object)null);
        ((ArrayList) term1202).add((Object)null);
        Object term1194 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term1201 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term1194, term1194.getClass(), "name", "");
        setField(term1194, term1194.getClass(), "path", "");
        setField(term1194, term1194.getClass(), "hidden", term1197);
        setField(term1194, term1194.getClass(), "redirect", "");
        setField(term1194, term1194.getClass(), "component", "");
        setField(term1201, term1201.getClass(), "title", null);
        setField(term1201, term1201.getClass(), "icon", null);
        setField(term1194, term1194.getClass(), "meta", term1201);
        setField(term1194, term1194.getClass(), "children", term1202);
        ArrayList term1148 = new ArrayList();
        ((ArrayList) term1148).add(term1150);
        ((ArrayList) term1148).add(term1161);
        ((ArrayList) term1148).add(term1172);
        ((ArrayList) term1148).add(term1150);
        ((ArrayList) term1148).add(term1183);
        ((ArrayList) term1148).add(term1194);
        term1072 = newInstance(Class.forName("com.org.model.vo.RouterVO"));
        Object term1123 = newInstance(Class.forName("com.org.model.vo.MetaVO"));
        setField(term1072, term1072.getClass(), "name", "MeTmRZXErV");
        setField(term1072, term1072.getClass(), "path", "jNxbVmoZgq");
        setField(term1072, term1072.getClass(), "hidden", term1097);
        setField(term1072, term1072.getClass(), "redirect", "PvmBHIXaMY");
        setField(term1072, term1072.getClass(), "component", "hulYxtowxw");
        setField(term1123, term1123.getClass(), "title", "GNEmuHPNcU");
        setField(term1123, term1123.getClass(), "icon", "IoSfuKDFRe");
        setField(term1072, term1072.getClass(), "meta", term1123);
        setField(term1072, term1072.getClass(), "children", term1148);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.RouterVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChildren", argTypes, term1072, args);
    }

};


