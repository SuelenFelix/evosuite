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

public class GbPanelBuilder_getImpl_16194565476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5075;

    public GbPanelBuilder_getImpl_16194565476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5140 = new ArrayList();
        ((ArrayList) term5140).add((Object)null);
        ((ArrayList) term5140).add((Object)null);
        ((ArrayList) term5140).add((Object)null);
        ((ArrayList) term5140).add((Object)null);
        ((ArrayList) term5140).add((Object)null);
        ((ArrayList) term5140).add((Object)null);
        ArrayList term5144 = new ArrayList();
        Class<? extends Object> term5217 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term5216 = ((Class) term5217).getDeclaredField((String) "START");
        ((Field) term5216).setAccessible(true);
        Object enum15 = ((Field) term5216).get((Object) null);
        Class<? extends Object> term5494 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.PageAlign");
        Field term5493 = ((Class) term5494).getDeclaredField((String) "MIDDLE");
        ((Field) term5493).setAccessible(true);
        Object enum16 = ((Field) term5493).get((Object) null);
        Class<? extends Object> term5774 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term5773 = ((Class) term5774).getDeclaredField((String) "CENTER");
        ((Field) term5773).setAccessible(true);
        Object enum17 = ((Field) term5773).get((Object) null);
        HashMap term5206 = new HashMap();
        Set<Object> term6053 =  ((Map) term5206).keySet();
        HashSet term5205 = new HashSet((Collection<? extends Object>) term6053);
        term5075 = newInstance(Class.forName("io.codeworth.panelmatic.impl.gridbagpanelbuilder.GbPanelBuilder"));
        Object term5076 = newInstance(Class.forName("java.awt.GridBagConstraints"));
        Object term5085 = newInstance(Class.forName("java.awt.Insets"));
        Object term5102 = newInstance(Class.forName("java.awt.GridBagConstraints"));
        Object term5111 = newInstance(Class.forName("java.awt.Insets"));
        Object term5126 = newInstance(Class.forName("java.awt.Component$BaselineResizeBehavior"));
        Object term5137 = newInstance(Class.forName("io.codeworth.panelmatic.impl.DefaultComponentFactory"));
        Object term5138 = newInstance(Class.forName("java.awt.ComponentOrientation"));
        Object term5148 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term5171 = newInstance(Class.forName("java.awt.Insets"));
        Object term5176 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term5190 = newInstance(Class.forName("java.awt.Insets"));
        Object term5195 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term5199 = newInstance(Class.forName("java.awt.Insets"));
        Object term5204 = newInstance(Class.forName("io.codeworth.panelmatic.BuilderPool"));
        setIntField(term5076, term5076.getClass(), "gridx", -1);
        setIntField(term5076, term5076.getClass(), "gridy", -1);
        setIntField(term5076, term5076.getClass(), "gridwidth", 1);
        setIntField(term5076, term5076.getClass(), "gridheight", 1);
        setDoubleField(term5076, term5076.getClass(), "weightx", 0.0);
        setDoubleField(term5076, term5076.getClass(), "weighty", 0.0);
        setIntField(term5076, term5076.getClass(), "anchor", 21);
        setIntField(term5076, term5076.getClass(), "fill", 0);
        setIntField(term5085, term5085.getClass(), "top", 1);
        setIntField(term5085, term5085.getClass(), "left", 1);
        setIntField(term5085, term5085.getClass(), "bottom", 1);
        setIntField(term5085, term5085.getClass(), "right", 1);
        setField(term5076, term5076.getClass(), "insets", term5085);
        setIntField(term5076, term5076.getClass(), "ipadx", 0);
        setIntField(term5076, term5076.getClass(), "ipady", 0);
        setIntField(term5076, term5076.getClass(), "tempX", 0);
        setIntField(term5076, term5076.getClass(), "tempY", 0);
        setIntField(term5076, term5076.getClass(), "tempWidth", 0);
        setIntField(term5076, term5076.getClass(), "tempHeight", 0);
        setIntField(term5076, term5076.getClass(), "minWidth", 0);
        setIntField(term5076, term5076.getClass(), "minHeight", 0);
        setIntField(term5076, term5076.getClass(), "ascent", 0);
        setIntField(term5076, term5076.getClass(), "descent", 0);
        setField(term5076, term5076.getClass(), "baselineResizeBehavior", null);
        setIntField(term5076, term5076.getClass(), "centerPadding", 0);
        setIntField(term5076, term5076.getClass(), "centerOffset", 0);
        setField(term5075, term5075.getClass(), "labelConstraints", term5076);
        setIntField(term5102, term5102.getClass(), "gridx", -1);
        setIntField(term5102, term5102.getClass(), "gridy", -1);
        setIntField(term5102, term5102.getClass(), "gridwidth", 1);
        setIntField(term5102, term5102.getClass(), "gridheight", 1);
        setDoubleField(term5102, term5102.getClass(), "weightx", 0.1374549299694151);
        setDoubleField(term5102, term5102.getClass(), "weighty", 0.7031006357544823);
        setIntField(term5102, term5102.getClass(), "anchor", 10);
        setIntField(term5102, term5102.getClass(), "fill", 1063420942);
        setIntField(term5111, term5111.getClass(), "top", 0);
        setIntField(term5111, term5111.getClass(), "left", 0);
        setIntField(term5111, term5111.getClass(), "bottom", 0);
        setIntField(term5111, term5111.getClass(), "right", 0);
        setField(term5102, term5102.getClass(), "insets", term5111);
        setIntField(term5102, term5102.getClass(), "ipadx", 1375330971);
        setIntField(term5102, term5102.getClass(), "ipady", -478195677);
        setIntField(term5102, term5102.getClass(), "tempX", 972867650);
        setIntField(term5102, term5102.getClass(), "tempY", 1655935355);
        setIntField(term5102, term5102.getClass(), "tempWidth", -481533957);
        setIntField(term5102, term5102.getClass(), "tempHeight", 1240914516);
        setIntField(term5102, term5102.getClass(), "minWidth", -1465035361);
        setIntField(term5102, term5102.getClass(), "minHeight", 1090617576);
        setIntField(term5102, term5102.getClass(), "ascent", -1547384488);
        setIntField(term5102, term5102.getClass(), "descent", 1442160736);
        setField(term5126, term5126.getClass(), "name", "OTHER");
        setIntField(term5126, term5126.getClass(), "ordinal", 3);
        setField(term5102, term5102.getClass(), "baselineResizeBehavior", term5126);
        setIntField(term5102, term5102.getClass(), "centerPadding", 1114000454);
        setIntField(term5102, term5102.getClass(), "centerOffset", -556405712);
        setField(term5075, term5075.getClass(), "headerConstraints", term5102);
        setField(term5075, term5075.getClass(), "product", null);
        setIntField(term5138, term5138.getClass(), "orientation", 6);
        setField(term5137, term5137.getClass(), "componentOrientation", term5138);
        setField(term5075, term5075.getClass(), "componentFactory", term5137);
        setField(term5075, term5075.getClass(), "currentBuildCustomizers", term5140);
        setField(term5075, term5075.getClass(), "customizerChain", term5144);
        setField(term5148, term5148.getClass(), "lineAlign", enum15);
        setField(term5148, term5148.getClass(), "pageAlign", enum16);
        setBooleanField(term5148, term5148.getClass(), "pageStretch", true);
        setBooleanField(term5148, term5148.getClass(), "lineStretch", true);
        setDoubleField(term5148, term5148.getClass(), "pageGrowFactor", 0.0);
        setIntField(term5171, term5171.getClass(), "top", 1);
        setIntField(term5171, term5171.getClass(), "left", 1);
        setIntField(term5171, term5171.getClass(), "bottom", 3);
        setIntField(term5171, term5171.getClass(), "right", 1);
        setField(term5148, term5148.getClass(), "insets", term5171);
        setField(term5075, term5075.getClass(), "baseComponentBehavior", term5148);
        setField(term5176, term5176.getClass(), "lineAlign", enum17);
        setField(term5176, term5176.getClass(), "pageAlign", enum16);
        setBooleanField(term5176, term5176.getClass(), "pageStretch", false);
        setBooleanField(term5176, term5176.getClass(), "lineStretch", true);
        setDoubleField(term5176, term5176.getClass(), "pageGrowFactor", 0.0);
        setIntField(term5190, term5190.getClass(), "top", 0);
        setIntField(term5190, term5190.getClass(), "left", 0);
        setIntField(term5190, term5190.getClass(), "bottom", 0);
        setIntField(term5190, term5190.getClass(), "right", 0);
        setField(term5176, term5176.getClass(), "insets", term5190);
        setField(term5075, term5075.getClass(), "headerBehavior", term5176);
        setField(term5195, term5195.getClass(), "lineAlign", enum15);
        setField(term5195, term5195.getClass(), "pageAlign", enum16);
        setBooleanField(term5195, term5195.getClass(), "pageStretch", false);
        setBooleanField(term5195, term5195.getClass(), "lineStretch", false);
        setDoubleField(term5195, term5195.getClass(), "pageGrowFactor", 0.0);
        setIntField(term5199, term5199.getClass(), "top", 1);
        setIntField(term5199, term5199.getClass(), "left", 5);
        setIntField(term5199, term5199.getClass(), "bottom", 1);
        setIntField(term5199, term5199.getClass(), "right", 1);
        setField(term5195, term5195.getClass(), "insets", term5199);
        setField(term5075, term5075.getClass(), "labelBehavior", term5195);
        setField(term5204, term5204.getClass(), "builders", term5205);
        setField(term5075, term5075.getClass(), "myPool", term5204);
        setField(term5075, term5075.getClass(), "resourceBundle", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.impl.gridbagpanelbuilder.GbPanelBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImpl", argTypes, term5075, args);
    }

};


