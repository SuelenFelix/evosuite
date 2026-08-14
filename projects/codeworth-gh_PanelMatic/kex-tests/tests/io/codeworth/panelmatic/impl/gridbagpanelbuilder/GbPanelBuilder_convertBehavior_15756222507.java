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

public class GbPanelBuilder_convertBehavior_15756222507 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6054;
     Object term6198;

    public GbPanelBuilder_convertBehavior_15756222507() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6127 = new ArrayList();
        ((ArrayList) term6127).add((Object)null);
        ((ArrayList) term6127).add((Object)null);
        ArrayList term6131 = new ArrayList();
        Class<? extends Object> term6221 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term6220 = ((Class) term6221).getDeclaredField((String) "START");
        ((Field) term6220).setAccessible(true);
        Object enum18 = ((Field) term6220).get((Object) null);
        Class<? extends Object> term6498 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.PageAlign");
        Field term6497 = ((Class) term6498).getDeclaredField((String) "MIDDLE");
        ((Field) term6497).setAccessible(true);
        Object enum19 = ((Field) term6497).get((Object) null);
        Class<? extends Object> term6778 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term6777 = ((Class) term6778).getDeclaredField((String) "CENTER");
        ((Field) term6777).setAccessible(true);
        Object enum20 = ((Field) term6777).get((Object) null);
        HashMap term6193 = new HashMap();
        Set<Object> term7057 =  ((Map) term6193).keySet();
        HashSet term6192 = new HashSet((Collection<? extends Object>) term7057);
        term6054 = newInstance(Class.forName("io.codeworth.panelmatic.impl.gridbagpanelbuilder.GbPanelBuilder"));
        Object term6055 = newInstance(Class.forName("java.awt.GridBagConstraints"));
        Object term6064 = newInstance(Class.forName("java.awt.Insets"));
        Object term6081 = newInstance(Class.forName("java.awt.GridBagConstraints"));
        Object term6090 = newInstance(Class.forName("java.awt.Insets"));
        Object term6105 = newInstance(Class.forName("java.awt.Component$BaselineResizeBehavior"));
        Object term6124 = newInstance(Class.forName("io.codeworth.panelmatic.impl.DefaultComponentFactory"));
        Object term6125 = newInstance(Class.forName("java.awt.ComponentOrientation"));
        Object term6135 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term6158 = newInstance(Class.forName("java.awt.Insets"));
        Object term6163 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term6177 = newInstance(Class.forName("java.awt.Insets"));
        Object term6182 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term6186 = newInstance(Class.forName("java.awt.Insets"));
        Object term6191 = newInstance(Class.forName("io.codeworth.panelmatic.BuilderPool"));
        setIntField(term6055, term6055.getClass(), "gridx", -1);
        setIntField(term6055, term6055.getClass(), "gridy", -1);
        setIntField(term6055, term6055.getClass(), "gridwidth", 1);
        setIntField(term6055, term6055.getClass(), "gridheight", 1);
        setDoubleField(term6055, term6055.getClass(), "weightx", 0.0);
        setDoubleField(term6055, term6055.getClass(), "weighty", 0.0);
        setIntField(term6055, term6055.getClass(), "anchor", 21);
        setIntField(term6055, term6055.getClass(), "fill", 0);
        setIntField(term6064, term6064.getClass(), "top", 1);
        setIntField(term6064, term6064.getClass(), "left", 1);
        setIntField(term6064, term6064.getClass(), "bottom", 1);
        setIntField(term6064, term6064.getClass(), "right", 1);
        setField(term6055, term6055.getClass(), "insets", term6064);
        setIntField(term6055, term6055.getClass(), "ipadx", 0);
        setIntField(term6055, term6055.getClass(), "ipady", 0);
        setIntField(term6055, term6055.getClass(), "tempX", 0);
        setIntField(term6055, term6055.getClass(), "tempY", 0);
        setIntField(term6055, term6055.getClass(), "tempWidth", 0);
        setIntField(term6055, term6055.getClass(), "tempHeight", 0);
        setIntField(term6055, term6055.getClass(), "minWidth", 0);
        setIntField(term6055, term6055.getClass(), "minHeight", 0);
        setIntField(term6055, term6055.getClass(), "ascent", 0);
        setIntField(term6055, term6055.getClass(), "descent", 0);
        setField(term6055, term6055.getClass(), "baselineResizeBehavior", null);
        setIntField(term6055, term6055.getClass(), "centerPadding", 0);
        setIntField(term6055, term6055.getClass(), "centerOffset", 0);
        setField(term6054, term6054.getClass(), "labelConstraints", term6055);
        setIntField(term6081, term6081.getClass(), "gridx", -1);
        setIntField(term6081, term6081.getClass(), "gridy", -1);
        setIntField(term6081, term6081.getClass(), "gridwidth", 1);
        setIntField(term6081, term6081.getClass(), "gridheight", 1);
        setDoubleField(term6081, term6081.getClass(), "weightx", 0.9527281779865117);
        setDoubleField(term6081, term6081.getClass(), "weighty", 0.9828442029246764);
        setIntField(term6081, term6081.getClass(), "anchor", 10);
        setIntField(term6081, term6081.getClass(), "fill", -505439934);
        setIntField(term6090, term6090.getClass(), "top", 0);
        setIntField(term6090, term6090.getClass(), "left", 0);
        setIntField(term6090, term6090.getClass(), "bottom", 0);
        setIntField(term6090, term6090.getClass(), "right", 0);
        setField(term6081, term6081.getClass(), "insets", term6090);
        setIntField(term6081, term6081.getClass(), "ipadx", -344842608);
        setIntField(term6081, term6081.getClass(), "ipady", 941650513);
        setIntField(term6081, term6081.getClass(), "tempX", 444029505);
        setIntField(term6081, term6081.getClass(), "tempY", -1034506028);
        setIntField(term6081, term6081.getClass(), "tempWidth", -1263114719);
        setIntField(term6081, term6081.getClass(), "tempHeight", -894662986);
        setIntField(term6081, term6081.getClass(), "minWidth", 304775596);
        setIntField(term6081, term6081.getClass(), "minHeight", -1347665717);
        setIntField(term6081, term6081.getClass(), "ascent", -1888585309);
        setIntField(term6081, term6081.getClass(), "descent", 683666002);
        setField(term6105, term6105.getClass(), "name", "CENTER_OFFSET");
        setIntField(term6105, term6105.getClass(), "ordinal", 2);
        setField(term6081, term6081.getClass(), "baselineResizeBehavior", term6105);
        setIntField(term6081, term6081.getClass(), "centerPadding", 1596213415);
        setIntField(term6081, term6081.getClass(), "centerOffset", -268815336);
        setField(term6054, term6054.getClass(), "headerConstraints", term6081);
        setField(term6054, term6054.getClass(), "product", null);
        setIntField(term6125, term6125.getClass(), "orientation", 6);
        setField(term6124, term6124.getClass(), "componentOrientation", term6125);
        setField(term6054, term6054.getClass(), "componentFactory", term6124);
        setField(term6054, term6054.getClass(), "currentBuildCustomizers", term6127);
        setField(term6054, term6054.getClass(), "customizerChain", term6131);
        setField(term6135, term6135.getClass(), "lineAlign", enum18);
        setField(term6135, term6135.getClass(), "pageAlign", enum19);
        setBooleanField(term6135, term6135.getClass(), "pageStretch", true);
        setBooleanField(term6135, term6135.getClass(), "lineStretch", true);
        setDoubleField(term6135, term6135.getClass(), "pageGrowFactor", 0.0);
        setIntField(term6158, term6158.getClass(), "top", 1);
        setIntField(term6158, term6158.getClass(), "left", 1);
        setIntField(term6158, term6158.getClass(), "bottom", 3);
        setIntField(term6158, term6158.getClass(), "right", 1);
        setField(term6135, term6135.getClass(), "insets", term6158);
        setField(term6054, term6054.getClass(), "baseComponentBehavior", term6135);
        setField(term6163, term6163.getClass(), "lineAlign", enum20);
        setField(term6163, term6163.getClass(), "pageAlign", enum19);
        setBooleanField(term6163, term6163.getClass(), "pageStretch", false);
        setBooleanField(term6163, term6163.getClass(), "lineStretch", true);
        setDoubleField(term6163, term6163.getClass(), "pageGrowFactor", 0.0);
        setIntField(term6177, term6177.getClass(), "top", 0);
        setIntField(term6177, term6177.getClass(), "left", 0);
        setIntField(term6177, term6177.getClass(), "bottom", 0);
        setIntField(term6177, term6177.getClass(), "right", 0);
        setField(term6163, term6163.getClass(), "insets", term6177);
        setField(term6054, term6054.getClass(), "headerBehavior", term6163);
        setField(term6182, term6182.getClass(), "lineAlign", enum18);
        setField(term6182, term6182.getClass(), "pageAlign", enum19);
        setBooleanField(term6182, term6182.getClass(), "pageStretch", false);
        setBooleanField(term6182, term6182.getClass(), "lineStretch", false);
        setDoubleField(term6182, term6182.getClass(), "pageGrowFactor", 0.0);
        setIntField(term6186, term6186.getClass(), "top", 1);
        setIntField(term6186, term6186.getClass(), "left", 5);
        setIntField(term6186, term6186.getClass(), "bottom", 1);
        setIntField(term6186, term6186.getClass(), "right", 1);
        setField(term6182, term6182.getClass(), "insets", term6186);
        setField(term6054, term6054.getClass(), "labelBehavior", term6182);
        setField(term6191, term6191.getClass(), "builders", term6192);
        setField(term6054, term6054.getClass(), "myPool", term6191);
        setField(term6054, term6054.getClass(), "resourceBundle", null);
        term6198 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term6202 = newInstance(Class.forName("java.awt.Insets"));
        setField(term6198, term6198.getClass(), "lineAlign", enum20);
        setField(term6198, term6198.getClass(), "pageAlign", enum19);
        setBooleanField(term6198, term6198.getClass(), "pageStretch", true);
        setBooleanField(term6198, term6198.getClass(), "lineStretch", true);
        setDoubleField(term6198, term6198.getClass(), "pageGrowFactor", 0.2779719046761513);
        setIntField(term6202, term6202.getClass(), "top", 0);
        setIntField(term6202, term6202.getClass(), "left", 0);
        setIntField(term6202, term6202.getClass(), "bottom", 0);
        setIntField(term6202, term6202.getClass(), "right", 0);
        setField(term6198, term6198.getClass(), "insets", term6202);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.impl.gridbagpanelbuilder.GbPanelBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior");
        Object[] args = new Object[1];
        args[0] = term6198;
        callMethod(klass, "convertBehavior", argTypes, term6054, args);
    }

};


