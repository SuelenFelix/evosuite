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

public class GbPanelBuilder_setHeaderBehavior_16880945401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term147;

    public GbPanelBuilder_setHeaderBehavior_16880945401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term76 = new ArrayList();
        ((ArrayList) term76).add((Object)null);
        ((ArrayList) term76).add((Object)null);
        ((ArrayList) term76).add((Object)null);
        ((ArrayList) term76).add((Object)null);
        ((ArrayList) term76).add((Object)null);
        ArrayList term80 = new ArrayList();
        Class<? extends Object> term198 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term197 = ((Class) term198).getDeclaredField((String) "START");
        ((Field) term197).setAccessible(true);
        Object enum0 = ((Field) term197).get((Object) null);
        Class<? extends Object> term501 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.PageAlign");
        Field term500 = ((Class) term501).getDeclaredField((String) "MIDDLE");
        ((Field) term500).setAccessible(true);
        Object enum1 = ((Field) term500).get((Object) null);
        Class<? extends Object> term781 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term780 = ((Class) term781).getDeclaredField((String) "CENTER");
        ((Field) term780).setAccessible(true);
        Object enum2 = ((Field) term780).get((Object) null);
        HashMap term142 = new HashMap();
        Set<Object> term1060 =  ((Map) term142).keySet();
        HashSet term141 = new HashSet((Collection<? extends Object>) term1060);
        term1 = newInstance(Class.forName("io.codeworth.panelmatic.impl.gridbagpanelbuilder.GbPanelBuilder"));
        Object term2 = newInstance(Class.forName("java.awt.GridBagConstraints"));
        Object term11 = newInstance(Class.forName("java.awt.Insets"));
        Object term28 = newInstance(Class.forName("java.awt.GridBagConstraints"));
        Object term37 = newInstance(Class.forName("java.awt.Insets"));
        Object term52 = newInstance(Class.forName("java.awt.Component$BaselineResizeBehavior"));
        Object term73 = newInstance(Class.forName("io.codeworth.panelmatic.impl.DefaultComponentFactory"));
        Object term74 = newInstance(Class.forName("java.awt.ComponentOrientation"));
        Object term84 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term107 = newInstance(Class.forName("java.awt.Insets"));
        Object term112 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term126 = newInstance(Class.forName("java.awt.Insets"));
        Object term131 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term135 = newInstance(Class.forName("java.awt.Insets"));
        Object term140 = newInstance(Class.forName("io.codeworth.panelmatic.BuilderPool"));
        setIntField(term2, term2.getClass(), "gridx", -1);
        setIntField(term2, term2.getClass(), "gridy", -1);
        setIntField(term2, term2.getClass(), "gridwidth", 1);
        setIntField(term2, term2.getClass(), "gridheight", 1);
        setDoubleField(term2, term2.getClass(), "weightx", 0.0);
        setDoubleField(term2, term2.getClass(), "weighty", 0.0);
        setIntField(term2, term2.getClass(), "anchor", 21);
        setIntField(term2, term2.getClass(), "fill", 0);
        setIntField(term11, term11.getClass(), "top", 1);
        setIntField(term11, term11.getClass(), "left", 1);
        setIntField(term11, term11.getClass(), "bottom", 1);
        setIntField(term11, term11.getClass(), "right", 1);
        setField(term2, term2.getClass(), "insets", term11);
        setIntField(term2, term2.getClass(), "ipadx", 0);
        setIntField(term2, term2.getClass(), "ipady", 0);
        setIntField(term2, term2.getClass(), "tempX", 0);
        setIntField(term2, term2.getClass(), "tempY", 0);
        setIntField(term2, term2.getClass(), "tempWidth", 0);
        setIntField(term2, term2.getClass(), "tempHeight", 0);
        setIntField(term2, term2.getClass(), "minWidth", 0);
        setIntField(term2, term2.getClass(), "minHeight", 0);
        setIntField(term2, term2.getClass(), "ascent", 0);
        setIntField(term2, term2.getClass(), "descent", 0);
        setField(term2, term2.getClass(), "baselineResizeBehavior", null);
        setIntField(term2, term2.getClass(), "centerPadding", 0);
        setIntField(term2, term2.getClass(), "centerOffset", 0);
        setField(term1, term1.getClass(), "labelConstraints", term2);
        setIntField(term28, term28.getClass(), "gridx", -1);
        setIntField(term28, term28.getClass(), "gridy", -1);
        setIntField(term28, term28.getClass(), "gridwidth", 1);
        setIntField(term28, term28.getClass(), "gridheight", 1);
        setDoubleField(term28, term28.getClass(), "weightx", 0.13238746331190498);
        setDoubleField(term28, term28.getClass(), "weighty", 0.3455959125047594);
        setIntField(term28, term28.getClass(), "anchor", 10);
        setIntField(term28, term28.getClass(), "fill", 1484323161);
        setIntField(term37, term37.getClass(), "top", 0);
        setIntField(term37, term37.getClass(), "left", 0);
        setIntField(term37, term37.getClass(), "bottom", 0);
        setIntField(term37, term37.getClass(), "right", 0);
        setField(term28, term28.getClass(), "insets", term37);
        setIntField(term28, term28.getClass(), "ipadx", 391863371);
        setIntField(term28, term28.getClass(), "ipady", -1922583790);
        setIntField(term28, term28.getClass(), "tempX", -616727354);
        setIntField(term28, term28.getClass(), "tempY", -1955890973);
        setIntField(term28, term28.getClass(), "tempWidth", -2038273078);
        setIntField(term28, term28.getClass(), "tempHeight", 1227103734);
        setIntField(term28, term28.getClass(), "minWidth", -1339778481);
        setIntField(term28, term28.getClass(), "minHeight", 1725571209);
        setIntField(term28, term28.getClass(), "ascent", -522618178);
        setIntField(term28, term28.getClass(), "descent", 1134449235);
        setField(term52, term52.getClass(), "name", "CONSTANT_ASCENT");
        setIntField(term52, term52.getClass(), "ordinal", 0);
        setField(term28, term28.getClass(), "baselineResizeBehavior", term52);
        setIntField(term28, term28.getClass(), "centerPadding", -883034806);
        setIntField(term28, term28.getClass(), "centerOffset", 1585847225);
        setField(term1, term1.getClass(), "headerConstraints", term28);
        setField(term1, term1.getClass(), "product", null);
        setIntField(term74, term74.getClass(), "orientation", 6);
        setField(term73, term73.getClass(), "componentOrientation", term74);
        setField(term1, term1.getClass(), "componentFactory", term73);
        setField(term1, term1.getClass(), "currentBuildCustomizers", term76);
        setField(term1, term1.getClass(), "customizerChain", term80);
        setField(term84, term84.getClass(), "lineAlign", enum0);
        setField(term84, term84.getClass(), "pageAlign", enum1);
        setBooleanField(term84, term84.getClass(), "pageStretch", true);
        setBooleanField(term84, term84.getClass(), "lineStretch", true);
        setDoubleField(term84, term84.getClass(), "pageGrowFactor", 0.0);
        setIntField(term107, term107.getClass(), "top", 1);
        setIntField(term107, term107.getClass(), "left", 1);
        setIntField(term107, term107.getClass(), "bottom", 3);
        setIntField(term107, term107.getClass(), "right", 1);
        setField(term84, term84.getClass(), "insets", term107);
        setField(term1, term1.getClass(), "baseComponentBehavior", term84);
        setField(term112, term112.getClass(), "lineAlign", enum2);
        setField(term112, term112.getClass(), "pageAlign", enum1);
        setBooleanField(term112, term112.getClass(), "pageStretch", false);
        setBooleanField(term112, term112.getClass(), "lineStretch", true);
        setDoubleField(term112, term112.getClass(), "pageGrowFactor", 0.0);
        setIntField(term126, term126.getClass(), "top", 0);
        setIntField(term126, term126.getClass(), "left", 0);
        setIntField(term126, term126.getClass(), "bottom", 0);
        setIntField(term126, term126.getClass(), "right", 0);
        setField(term112, term112.getClass(), "insets", term126);
        setField(term1, term1.getClass(), "headerBehavior", term112);
        setField(term131, term131.getClass(), "lineAlign", enum0);
        setField(term131, term131.getClass(), "pageAlign", enum1);
        setBooleanField(term131, term131.getClass(), "pageStretch", false);
        setBooleanField(term131, term131.getClass(), "lineStretch", false);
        setDoubleField(term131, term131.getClass(), "pageGrowFactor", 0.0);
        setIntField(term135, term135.getClass(), "top", 1);
        setIntField(term135, term135.getClass(), "left", 5);
        setIntField(term135, term135.getClass(), "bottom", 1);
        setIntField(term135, term135.getClass(), "right", 1);
        setField(term131, term131.getClass(), "insets", term135);
        setField(term1, term1.getClass(), "labelBehavior", term131);
        setField(term140, term140.getClass(), "builders", term141);
        setField(term1, term1.getClass(), "myPool", term140);
        setField(term1, term1.getClass(), "resourceBundle", null);
        term147 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term151 = newInstance(Class.forName("java.awt.Insets"));
        setField(term147, term147.getClass(), "lineAlign", enum2);
        setField(term147, term147.getClass(), "pageAlign", enum1);
        setBooleanField(term147, term147.getClass(), "pageStretch", false);
        setBooleanField(term147, term147.getClass(), "lineStretch", false);
        setDoubleField(term147, term147.getClass(), "pageGrowFactor", 0.5523635872663106);
        setIntField(term151, term151.getClass(), "top", 0);
        setIntField(term151, term151.getClass(), "left", 0);
        setIntField(term151, term151.getClass(), "bottom", 0);
        setIntField(term151, term151.getClass(), "right", 0);
        setField(term147, term147.getClass(), "insets", term151);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.impl.gridbagpanelbuilder.GbPanelBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior");
        Object[] args = new Object[1];
        args[0] = term147;
        callMethod(klass, "setHeaderBehavior", argTypes, term1, args);
    }

};


