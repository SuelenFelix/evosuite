package io.codeworth.panelmatic.impl.gridbagpanelbuilder;

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
import static io.codeworth.panelmatic.impl.gridbagpanelbuilder.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class GbPanelBuilder_setLabelBehavior_5011745052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1061;
     Object term1208;

    public GbPanelBuilder_setLabelBehavior_5011745052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1137 = new ArrayList();
        ((ArrayList) term1137).add((Object)null);
        ((ArrayList) term1137).add((Object)null);
        ((ArrayList) term1137).add((Object)null);
        ((ArrayList) term1137).add((Object)null);
        ArrayList term1141 = new ArrayList();
        Class<? extends Object> term1234 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term1233 = ((Class) term1234).getDeclaredField((String) "START");
        ((Field) term1233).setAccessible(true);
        Object enum3 = ((Field) term1233).get((Object) null);
        Class<? extends Object> term1511 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.PageAlign");
        Field term1510 = ((Class) term1511).getDeclaredField((String) "MIDDLE");
        ((Field) term1510).setAccessible(true);
        Object enum4 = ((Field) term1510).get((Object) null);
        Class<? extends Object> term1791 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term1790 = ((Class) term1791).getDeclaredField((String) "CENTER");
        ((Field) term1790).setAccessible(true);
        Object enum5 = ((Field) term1790).get((Object) null);
        HashMap term1203 = new HashMap();
        Set<Object> term2070 =  ((Map) term1203).keySet();
        HashSet term1202 = new HashSet((Collection<? extends Object>) term2070);
        term1061 = newInstance(Class.forName("io.codeworth.panelmatic.impl.gridbagpanelbuilder.GbPanelBuilder"));
        Object term1062 = newInstance(Class.forName("java.awt.GridBagConstraints"));
        Object term1071 = newInstance(Class.forName("java.awt.Insets"));
        Object term1088 = newInstance(Class.forName("java.awt.GridBagConstraints"));
        Object term1097 = newInstance(Class.forName("java.awt.Insets"));
        Object term1112 = newInstance(Class.forName("java.awt.Component$BaselineResizeBehavior"));
        Object term1134 = newInstance(Class.forName("io.codeworth.panelmatic.impl.DefaultComponentFactory"));
        Object term1135 = newInstance(Class.forName("java.awt.ComponentOrientation"));
        Object term1145 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term1168 = newInstance(Class.forName("java.awt.Insets"));
        Object term1173 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term1187 = newInstance(Class.forName("java.awt.Insets"));
        Object term1192 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term1196 = newInstance(Class.forName("java.awt.Insets"));
        Object term1201 = newInstance(Class.forName("io.codeworth.panelmatic.BuilderPool"));
        setIntField(term1062, term1062.getClass(), "gridx", -1);
        setIntField(term1062, term1062.getClass(), "gridy", -1);
        setIntField(term1062, term1062.getClass(), "gridwidth", 1);
        setIntField(term1062, term1062.getClass(), "gridheight", 1);
        setDoubleField(term1062, term1062.getClass(), "weightx", 0.0);
        setDoubleField(term1062, term1062.getClass(), "weighty", 0.0);
        setIntField(term1062, term1062.getClass(), "anchor", 21);
        setIntField(term1062, term1062.getClass(), "fill", 0);
        setIntField(term1071, term1071.getClass(), "top", 1);
        setIntField(term1071, term1071.getClass(), "left", 1);
        setIntField(term1071, term1071.getClass(), "bottom", 1);
        setIntField(term1071, term1071.getClass(), "right", 1);
        setField(term1062, term1062.getClass(), "insets", term1071);
        setIntField(term1062, term1062.getClass(), "ipadx", 0);
        setIntField(term1062, term1062.getClass(), "ipady", 0);
        setIntField(term1062, term1062.getClass(), "tempX", 0);
        setIntField(term1062, term1062.getClass(), "tempY", 0);
        setIntField(term1062, term1062.getClass(), "tempWidth", 0);
        setIntField(term1062, term1062.getClass(), "tempHeight", 0);
        setIntField(term1062, term1062.getClass(), "minWidth", 0);
        setIntField(term1062, term1062.getClass(), "minHeight", 0);
        setIntField(term1062, term1062.getClass(), "ascent", 0);
        setIntField(term1062, term1062.getClass(), "descent", 0);
        setField(term1062, term1062.getClass(), "baselineResizeBehavior", null);
        setIntField(term1062, term1062.getClass(), "centerPadding", 0);
        setIntField(term1062, term1062.getClass(), "centerOffset", 0);
        setField(term1061, term1061.getClass(), "labelConstraints", term1062);
        setIntField(term1088, term1088.getClass(), "gridx", -1);
        setIntField(term1088, term1088.getClass(), "gridy", -1);
        setIntField(term1088, term1088.getClass(), "gridwidth", 1);
        setIntField(term1088, term1088.getClass(), "gridheight", 1);
        setDoubleField(term1088, term1088.getClass(), "weightx", 0.544608645520025);
        setDoubleField(term1088, term1088.getClass(), "weighty", 0.28570734989730284);
        setIntField(term1088, term1088.getClass(), "anchor", 10);
        setIntField(term1088, term1088.getClass(), "fill", -1456670397);
        setIntField(term1097, term1097.getClass(), "top", 0);
        setIntField(term1097, term1097.getClass(), "left", 0);
        setIntField(term1097, term1097.getClass(), "bottom", 0);
        setIntField(term1097, term1097.getClass(), "right", 0);
        setField(term1088, term1088.getClass(), "insets", term1097);
        setIntField(term1088, term1088.getClass(), "ipadx", 1622346318);
        setIntField(term1088, term1088.getClass(), "ipady", 1048535127);
        setIntField(term1088, term1088.getClass(), "tempX", -655067527);
        setIntField(term1088, term1088.getClass(), "tempY", -6029667);
        setIntField(term1088, term1088.getClass(), "tempWidth", -2068769794);
        setIntField(term1088, term1088.getClass(), "tempHeight", -117576464);
        setIntField(term1088, term1088.getClass(), "minWidth", -1007160944);
        setIntField(term1088, term1088.getClass(), "minHeight", 1135664017);
        setIntField(term1088, term1088.getClass(), "ascent", 590364439);
        setIntField(term1088, term1088.getClass(), "descent", 865208305);
        setField(term1112, term1112.getClass(), "name", "CONSTANT_DESCENT");
        setIntField(term1112, term1112.getClass(), "ordinal", 1);
        setField(term1088, term1088.getClass(), "baselineResizeBehavior", term1112);
        setIntField(term1088, term1088.getClass(), "centerPadding", -1275173084);
        setIntField(term1088, term1088.getClass(), "centerOffset", -244121226);
        setField(term1061, term1061.getClass(), "headerConstraints", term1088);
        setField(term1061, term1061.getClass(), "product", null);
        setIntField(term1135, term1135.getClass(), "orientation", 6);
        setField(term1134, term1134.getClass(), "componentOrientation", term1135);
        setField(term1061, term1061.getClass(), "componentFactory", term1134);
        setField(term1061, term1061.getClass(), "currentBuildCustomizers", term1137);
        setField(term1061, term1061.getClass(), "customizerChain", term1141);
        setField(term1145, term1145.getClass(), "lineAlign", enum3);
        setField(term1145, term1145.getClass(), "pageAlign", enum4);
        setBooleanField(term1145, term1145.getClass(), "pageStretch", true);
        setBooleanField(term1145, term1145.getClass(), "lineStretch", true);
        setDoubleField(term1145, term1145.getClass(), "pageGrowFactor", 0.0);
        setIntField(term1168, term1168.getClass(), "top", 1);
        setIntField(term1168, term1168.getClass(), "left", 1);
        setIntField(term1168, term1168.getClass(), "bottom", 3);
        setIntField(term1168, term1168.getClass(), "right", 1);
        setField(term1145, term1145.getClass(), "insets", term1168);
        setField(term1061, term1061.getClass(), "baseComponentBehavior", term1145);
        setField(term1173, term1173.getClass(), "lineAlign", enum5);
        setField(term1173, term1173.getClass(), "pageAlign", enum4);
        setBooleanField(term1173, term1173.getClass(), "pageStretch", false);
        setBooleanField(term1173, term1173.getClass(), "lineStretch", true);
        setDoubleField(term1173, term1173.getClass(), "pageGrowFactor", 0.0);
        setIntField(term1187, term1187.getClass(), "top", 0);
        setIntField(term1187, term1187.getClass(), "left", 0);
        setIntField(term1187, term1187.getClass(), "bottom", 0);
        setIntField(term1187, term1187.getClass(), "right", 0);
        setField(term1173, term1173.getClass(), "insets", term1187);
        setField(term1061, term1061.getClass(), "headerBehavior", term1173);
        setField(term1192, term1192.getClass(), "lineAlign", enum3);
        setField(term1192, term1192.getClass(), "pageAlign", enum4);
        setBooleanField(term1192, term1192.getClass(), "pageStretch", false);
        setBooleanField(term1192, term1192.getClass(), "lineStretch", false);
        setDoubleField(term1192, term1192.getClass(), "pageGrowFactor", 0.0);
        setIntField(term1196, term1196.getClass(), "top", 1);
        setIntField(term1196, term1196.getClass(), "left", 5);
        setIntField(term1196, term1196.getClass(), "bottom", 1);
        setIntField(term1196, term1196.getClass(), "right", 1);
        setField(term1192, term1192.getClass(), "insets", term1196);
        setField(term1061, term1061.getClass(), "labelBehavior", term1192);
        setField(term1201, term1201.getClass(), "builders", term1202);
        setField(term1061, term1061.getClass(), "myPool", term1201);
        setField(term1061, term1061.getClass(), "resourceBundle", null);
        term1208 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term1212 = newInstance(Class.forName("java.awt.Insets"));
        setField(term1208, term1208.getClass(), "lineAlign", enum5);
        setField(term1208, term1208.getClass(), "pageAlign", enum4);
        setBooleanField(term1208, term1208.getClass(), "pageStretch", false);
        setBooleanField(term1208, term1208.getClass(), "lineStretch", false);
        setDoubleField(term1208, term1208.getClass(), "pageGrowFactor", 0.40176586625454525);
        setIntField(term1212, term1212.getClass(), "top", 0);
        setIntField(term1212, term1212.getClass(), "left", 0);
        setIntField(term1212, term1212.getClass(), "bottom", 0);
        setIntField(term1212, term1212.getClass(), "right", 0);
        setField(term1208, term1208.getClass(), "insets", term1212);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.impl.gridbagpanelbuilder.GbPanelBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior");
        Object[] args = new Object[1];
        args[0] = term1208;
        callMethod(klass, "setLabelBehavior", argTypes, term1061, args);
    }

};


