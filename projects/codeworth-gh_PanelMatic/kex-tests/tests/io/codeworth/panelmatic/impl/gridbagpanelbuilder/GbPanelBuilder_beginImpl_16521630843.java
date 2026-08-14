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

public class GbPanelBuilder_beginImpl_16521630843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2071;

    public GbPanelBuilder_beginImpl_16521630843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2147 = new ArrayList();
        ((ArrayList) term2147).add((Object)null);
        ((ArrayList) term2147).add((Object)null);
        ((ArrayList) term2147).add((Object)null);
        ArrayList term2151 = new ArrayList();
        Class<? extends Object> term2235 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term2234 = ((Class) term2235).getDeclaredField((String) "START");
        ((Field) term2234).setAccessible(true);
        Object enum6 = ((Field) term2234).get((Object) null);
        Class<? extends Object> term2512 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.PageAlign");
        Field term2511 = ((Class) term2512).getDeclaredField((String) "MIDDLE");
        ((Field) term2511).setAccessible(true);
        Object enum7 = ((Field) term2511).get((Object) null);
        Class<? extends Object> term2792 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term2791 = ((Class) term2792).getDeclaredField((String) "CENTER");
        ((Field) term2791).setAccessible(true);
        Object enum8 = ((Field) term2791).get((Object) null);
        HashMap term2213 = new HashMap();
        Set<Object> term3071 =  ((Map) term2213).keySet();
        HashSet term2212 = new HashSet((Collection<? extends Object>) term3071);
        term2071 = newInstance(Class.forName("io.codeworth.panelmatic.impl.gridbagpanelbuilder.GbPanelBuilder"));
        Object term2072 = newInstance(Class.forName("java.awt.GridBagConstraints"));
        Object term2081 = newInstance(Class.forName("java.awt.Insets"));
        Object term2098 = newInstance(Class.forName("java.awt.GridBagConstraints"));
        Object term2107 = newInstance(Class.forName("java.awt.Insets"));
        Object term2122 = newInstance(Class.forName("java.awt.Component$BaselineResizeBehavior"));
        Object term2144 = newInstance(Class.forName("io.codeworth.panelmatic.impl.DefaultComponentFactory"));
        Object term2145 = newInstance(Class.forName("java.awt.ComponentOrientation"));
        Object term2155 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term2178 = newInstance(Class.forName("java.awt.Insets"));
        Object term2183 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term2197 = newInstance(Class.forName("java.awt.Insets"));
        Object term2202 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term2206 = newInstance(Class.forName("java.awt.Insets"));
        Object term2211 = newInstance(Class.forName("io.codeworth.panelmatic.BuilderPool"));
        setIntField(term2072, term2072.getClass(), "gridx", -1);
        setIntField(term2072, term2072.getClass(), "gridy", -1);
        setIntField(term2072, term2072.getClass(), "gridwidth", 1);
        setIntField(term2072, term2072.getClass(), "gridheight", 1);
        setDoubleField(term2072, term2072.getClass(), "weightx", 0.0);
        setDoubleField(term2072, term2072.getClass(), "weighty", 0.0);
        setIntField(term2072, term2072.getClass(), "anchor", 21);
        setIntField(term2072, term2072.getClass(), "fill", 0);
        setIntField(term2081, term2081.getClass(), "top", 1);
        setIntField(term2081, term2081.getClass(), "left", 1);
        setIntField(term2081, term2081.getClass(), "bottom", 1);
        setIntField(term2081, term2081.getClass(), "right", 1);
        setField(term2072, term2072.getClass(), "insets", term2081);
        setIntField(term2072, term2072.getClass(), "ipadx", 0);
        setIntField(term2072, term2072.getClass(), "ipady", 0);
        setIntField(term2072, term2072.getClass(), "tempX", 0);
        setIntField(term2072, term2072.getClass(), "tempY", 0);
        setIntField(term2072, term2072.getClass(), "tempWidth", 0);
        setIntField(term2072, term2072.getClass(), "tempHeight", 0);
        setIntField(term2072, term2072.getClass(), "minWidth", 0);
        setIntField(term2072, term2072.getClass(), "minHeight", 0);
        setIntField(term2072, term2072.getClass(), "ascent", 0);
        setIntField(term2072, term2072.getClass(), "descent", 0);
        setField(term2072, term2072.getClass(), "baselineResizeBehavior", null);
        setIntField(term2072, term2072.getClass(), "centerPadding", 0);
        setIntField(term2072, term2072.getClass(), "centerOffset", 0);
        setField(term2071, term2071.getClass(), "labelConstraints", term2072);
        setIntField(term2098, term2098.getClass(), "gridx", -1);
        setIntField(term2098, term2098.getClass(), "gridy", -1);
        setIntField(term2098, term2098.getClass(), "gridwidth", 1);
        setIntField(term2098, term2098.getClass(), "gridheight", 1);
        setDoubleField(term2098, term2098.getClass(), "weightx", 0.2641345529914265);
        setDoubleField(term2098, term2098.getClass(), "weighty", 0.36923381893433327);
        setIntField(term2098, term2098.getClass(), "anchor", 10);
        setIntField(term2098, term2098.getClass(), "fill", -73683645);
        setIntField(term2107, term2107.getClass(), "top", 0);
        setIntField(term2107, term2107.getClass(), "left", 0);
        setIntField(term2107, term2107.getClass(), "bottom", 0);
        setIntField(term2107, term2107.getClass(), "right", 0);
        setField(term2098, term2098.getClass(), "insets", term2107);
        setIntField(term2098, term2098.getClass(), "ipadx", -226514366);
        setIntField(term2098, term2098.getClass(), "ipady", 1193880199);
        setIntField(term2098, term2098.getClass(), "tempX", -1087774327);
        setIntField(term2098, term2098.getClass(), "tempY", -1530420153);
        setIntField(term2098, term2098.getClass(), "tempWidth", -469968304);
        setIntField(term2098, term2098.getClass(), "tempHeight", -1145578966);
        setIntField(term2098, term2098.getClass(), "minWidth", 679763016);
        setIntField(term2098, term2098.getClass(), "minHeight", 1962444399);
        setIntField(term2098, term2098.getClass(), "ascent", 767834723);
        setIntField(term2098, term2098.getClass(), "descent", -602026508);
        setField(term2122, term2122.getClass(), "name", "CONSTANT_DESCENT");
        setIntField(term2122, term2122.getClass(), "ordinal", 1);
        setField(term2098, term2098.getClass(), "baselineResizeBehavior", term2122);
        setIntField(term2098, term2098.getClass(), "centerPadding", -157887805);
        setIntField(term2098, term2098.getClass(), "centerOffset", 1876565163);
        setField(term2071, term2071.getClass(), "headerConstraints", term2098);
        setField(term2071, term2071.getClass(), "product", null);
        setIntField(term2145, term2145.getClass(), "orientation", 6);
        setField(term2144, term2144.getClass(), "componentOrientation", term2145);
        setField(term2071, term2071.getClass(), "componentFactory", term2144);
        setField(term2071, term2071.getClass(), "currentBuildCustomizers", term2147);
        setField(term2071, term2071.getClass(), "customizerChain", term2151);
        setField(term2155, term2155.getClass(), "lineAlign", enum6);
        setField(term2155, term2155.getClass(), "pageAlign", enum7);
        setBooleanField(term2155, term2155.getClass(), "pageStretch", true);
        setBooleanField(term2155, term2155.getClass(), "lineStretch", true);
        setDoubleField(term2155, term2155.getClass(), "pageGrowFactor", 0.0);
        setIntField(term2178, term2178.getClass(), "top", 1);
        setIntField(term2178, term2178.getClass(), "left", 1);
        setIntField(term2178, term2178.getClass(), "bottom", 3);
        setIntField(term2178, term2178.getClass(), "right", 1);
        setField(term2155, term2155.getClass(), "insets", term2178);
        setField(term2071, term2071.getClass(), "baseComponentBehavior", term2155);
        setField(term2183, term2183.getClass(), "lineAlign", enum8);
        setField(term2183, term2183.getClass(), "pageAlign", enum7);
        setBooleanField(term2183, term2183.getClass(), "pageStretch", false);
        setBooleanField(term2183, term2183.getClass(), "lineStretch", true);
        setDoubleField(term2183, term2183.getClass(), "pageGrowFactor", 0.0);
        setIntField(term2197, term2197.getClass(), "top", 0);
        setIntField(term2197, term2197.getClass(), "left", 0);
        setIntField(term2197, term2197.getClass(), "bottom", 0);
        setIntField(term2197, term2197.getClass(), "right", 0);
        setField(term2183, term2183.getClass(), "insets", term2197);
        setField(term2071, term2071.getClass(), "headerBehavior", term2183);
        setField(term2202, term2202.getClass(), "lineAlign", enum6);
        setField(term2202, term2202.getClass(), "pageAlign", enum7);
        setBooleanField(term2202, term2202.getClass(), "pageStretch", false);
        setBooleanField(term2202, term2202.getClass(), "lineStretch", false);
        setDoubleField(term2202, term2202.getClass(), "pageGrowFactor", 0.0);
        setIntField(term2206, term2206.getClass(), "top", 1);
        setIntField(term2206, term2206.getClass(), "left", 5);
        setIntField(term2206, term2206.getClass(), "bottom", 1);
        setIntField(term2206, term2206.getClass(), "right", 1);
        setField(term2202, term2202.getClass(), "insets", term2206);
        setField(term2071, term2071.getClass(), "labelBehavior", term2202);
        setField(term2211, term2211.getClass(), "builders", term2212);
        setField(term2071, term2071.getClass(), "myPool", term2211);
        setField(term2071, term2071.getClass(), "resourceBundle", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.impl.gridbagpanelbuilder.GbPanelBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.JComponent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "beginImpl", argTypes, term2071, args);
    }

};


