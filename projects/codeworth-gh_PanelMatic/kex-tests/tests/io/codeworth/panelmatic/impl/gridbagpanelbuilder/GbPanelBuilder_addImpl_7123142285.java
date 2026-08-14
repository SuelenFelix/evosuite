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

public class GbPanelBuilder_addImpl_7123142285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4071;
     Object term4215;

    public GbPanelBuilder_addImpl_7123142285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4144 = new ArrayList();
        ((ArrayList) term4144).add((Object)null);
        ArrayList term4148 = new ArrayList();
        Class<? extends Object> term4238 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term4237 = ((Class) term4238).getDeclaredField((String) "START");
        ((Field) term4237).setAccessible(true);
        Object enum12 = ((Field) term4237).get((Object) null);
        Class<? extends Object> term4515 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.PageAlign");
        Field term4514 = ((Class) term4515).getDeclaredField((String) "MIDDLE");
        ((Field) term4514).setAccessible(true);
        Object enum13 = ((Field) term4514).get((Object) null);
        Class<? extends Object> term4795 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term4794 = ((Class) term4795).getDeclaredField((String) "CENTER");
        ((Field) term4794).setAccessible(true);
        Object enum14 = ((Field) term4794).get((Object) null);
        HashMap term4210 = new HashMap();
        Set<Object> term5074 =  ((Map) term4210).keySet();
        HashSet term4209 = new HashSet((Collection<? extends Object>) term5074);
        term4071 = newInstance(Class.forName("io.codeworth.panelmatic.impl.gridbagpanelbuilder.GbPanelBuilder"));
        Object term4072 = newInstance(Class.forName("java.awt.GridBagConstraints"));
        Object term4081 = newInstance(Class.forName("java.awt.Insets"));
        Object term4098 = newInstance(Class.forName("java.awt.GridBagConstraints"));
        Object term4107 = newInstance(Class.forName("java.awt.Insets"));
        Object term4122 = newInstance(Class.forName("java.awt.Component$BaselineResizeBehavior"));
        Object term4141 = newInstance(Class.forName("io.codeworth.panelmatic.impl.DefaultComponentFactory"));
        Object term4142 = newInstance(Class.forName("java.awt.ComponentOrientation"));
        Object term4152 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term4175 = newInstance(Class.forName("java.awt.Insets"));
        Object term4180 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term4194 = newInstance(Class.forName("java.awt.Insets"));
        Object term4199 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term4203 = newInstance(Class.forName("java.awt.Insets"));
        Object term4208 = newInstance(Class.forName("io.codeworth.panelmatic.BuilderPool"));
        setIntField(term4072, term4072.getClass(), "gridx", -1);
        setIntField(term4072, term4072.getClass(), "gridy", -1);
        setIntField(term4072, term4072.getClass(), "gridwidth", 1);
        setIntField(term4072, term4072.getClass(), "gridheight", 1);
        setDoubleField(term4072, term4072.getClass(), "weightx", 0.0);
        setDoubleField(term4072, term4072.getClass(), "weighty", 0.0);
        setIntField(term4072, term4072.getClass(), "anchor", 21);
        setIntField(term4072, term4072.getClass(), "fill", 0);
        setIntField(term4081, term4081.getClass(), "top", 1);
        setIntField(term4081, term4081.getClass(), "left", 1);
        setIntField(term4081, term4081.getClass(), "bottom", 1);
        setIntField(term4081, term4081.getClass(), "right", 1);
        setField(term4072, term4072.getClass(), "insets", term4081);
        setIntField(term4072, term4072.getClass(), "ipadx", 0);
        setIntField(term4072, term4072.getClass(), "ipady", 0);
        setIntField(term4072, term4072.getClass(), "tempX", 0);
        setIntField(term4072, term4072.getClass(), "tempY", 0);
        setIntField(term4072, term4072.getClass(), "tempWidth", 0);
        setIntField(term4072, term4072.getClass(), "tempHeight", 0);
        setIntField(term4072, term4072.getClass(), "minWidth", 0);
        setIntField(term4072, term4072.getClass(), "minHeight", 0);
        setIntField(term4072, term4072.getClass(), "ascent", 0);
        setIntField(term4072, term4072.getClass(), "descent", 0);
        setField(term4072, term4072.getClass(), "baselineResizeBehavior", null);
        setIntField(term4072, term4072.getClass(), "centerPadding", 0);
        setIntField(term4072, term4072.getClass(), "centerOffset", 0);
        setField(term4071, term4071.getClass(), "labelConstraints", term4072);
        setIntField(term4098, term4098.getClass(), "gridx", -1);
        setIntField(term4098, term4098.getClass(), "gridy", -1);
        setIntField(term4098, term4098.getClass(), "gridwidth", 1);
        setIntField(term4098, term4098.getClass(), "gridheight", 1);
        setDoubleField(term4098, term4098.getClass(), "weightx", 0.8474802076607362);
        setDoubleField(term4098, term4098.getClass(), "weighty", 0.5183269973490326);
        setIntField(term4098, term4098.getClass(), "anchor", 10);
        setIntField(term4098, term4098.getClass(), "fill", -1371869594);
        setIntField(term4107, term4107.getClass(), "top", 0);
        setIntField(term4107, term4107.getClass(), "left", 0);
        setIntField(term4107, term4107.getClass(), "bottom", 0);
        setIntField(term4107, term4107.getClass(), "right", 0);
        setField(term4098, term4098.getClass(), "insets", term4107);
        setIntField(term4098, term4098.getClass(), "ipadx", -2095575670);
        setIntField(term4098, term4098.getClass(), "ipady", 1225272962);
        setIntField(term4098, term4098.getClass(), "tempX", 1324040357);
        setIntField(term4098, term4098.getClass(), "tempY", -1588772968);
        setIntField(term4098, term4098.getClass(), "tempWidth", -93135961);
        setIntField(term4098, term4098.getClass(), "tempHeight", -112921587);
        setIntField(term4098, term4098.getClass(), "minWidth", 933028652);
        setIntField(term4098, term4098.getClass(), "minHeight", 287287233);
        setIntField(term4098, term4098.getClass(), "ascent", 962840079);
        setIntField(term4098, term4098.getClass(), "descent", 1540719661);
        setField(term4122, term4122.getClass(), "name", "CENTER_OFFSET");
        setIntField(term4122, term4122.getClass(), "ordinal", 2);
        setField(term4098, term4098.getClass(), "baselineResizeBehavior", term4122);
        setIntField(term4098, term4098.getClass(), "centerPadding", 1265463001);
        setIntField(term4098, term4098.getClass(), "centerOffset", 335112684);
        setField(term4071, term4071.getClass(), "headerConstraints", term4098);
        setField(term4071, term4071.getClass(), "product", null);
        setIntField(term4142, term4142.getClass(), "orientation", 6);
        setField(term4141, term4141.getClass(), "componentOrientation", term4142);
        setField(term4071, term4071.getClass(), "componentFactory", term4141);
        setField(term4071, term4071.getClass(), "currentBuildCustomizers", term4144);
        setField(term4071, term4071.getClass(), "customizerChain", term4148);
        setField(term4152, term4152.getClass(), "lineAlign", enum12);
        setField(term4152, term4152.getClass(), "pageAlign", enum13);
        setBooleanField(term4152, term4152.getClass(), "pageStretch", true);
        setBooleanField(term4152, term4152.getClass(), "lineStretch", true);
        setDoubleField(term4152, term4152.getClass(), "pageGrowFactor", 0.0);
        setIntField(term4175, term4175.getClass(), "top", 1);
        setIntField(term4175, term4175.getClass(), "left", 1);
        setIntField(term4175, term4175.getClass(), "bottom", 3);
        setIntField(term4175, term4175.getClass(), "right", 1);
        setField(term4152, term4152.getClass(), "insets", term4175);
        setField(term4071, term4071.getClass(), "baseComponentBehavior", term4152);
        setField(term4180, term4180.getClass(), "lineAlign", enum14);
        setField(term4180, term4180.getClass(), "pageAlign", enum13);
        setBooleanField(term4180, term4180.getClass(), "pageStretch", false);
        setBooleanField(term4180, term4180.getClass(), "lineStretch", true);
        setDoubleField(term4180, term4180.getClass(), "pageGrowFactor", 0.0);
        setIntField(term4194, term4194.getClass(), "top", 0);
        setIntField(term4194, term4194.getClass(), "left", 0);
        setIntField(term4194, term4194.getClass(), "bottom", 0);
        setIntField(term4194, term4194.getClass(), "right", 0);
        setField(term4180, term4180.getClass(), "insets", term4194);
        setField(term4071, term4071.getClass(), "headerBehavior", term4180);
        setField(term4199, term4199.getClass(), "lineAlign", enum12);
        setField(term4199, term4199.getClass(), "pageAlign", enum13);
        setBooleanField(term4199, term4199.getClass(), "pageStretch", false);
        setBooleanField(term4199, term4199.getClass(), "lineStretch", false);
        setDoubleField(term4199, term4199.getClass(), "pageGrowFactor", 0.0);
        setIntField(term4203, term4203.getClass(), "top", 1);
        setIntField(term4203, term4203.getClass(), "left", 5);
        setIntField(term4203, term4203.getClass(), "bottom", 1);
        setIntField(term4203, term4203.getClass(), "right", 1);
        setField(term4199, term4199.getClass(), "insets", term4203);
        setField(term4071, term4071.getClass(), "labelBehavior", term4199);
        setField(term4208, term4208.getClass(), "builders", term4209);
        setField(term4071, term4071.getClass(), "myPool", term4208);
        setField(term4071, term4071.getClass(), "resourceBundle", null);
        term4215 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term4219 = newInstance(Class.forName("java.awt.Insets"));
        setField(term4215, term4215.getClass(), "lineAlign", enum14);
        setField(term4215, term4215.getClass(), "pageAlign", enum13);
        setBooleanField(term4215, term4215.getClass(), "pageStretch", true);
        setBooleanField(term4215, term4215.getClass(), "lineStretch", true);
        setDoubleField(term4215, term4215.getClass(), "pageGrowFactor", 0.7655020693602768);
        setIntField(term4219, term4219.getClass(), "top", 0);
        setIntField(term4219, term4219.getClass(), "left", 0);
        setIntField(term4219, term4219.getClass(), "bottom", 0);
        setIntField(term4219, term4219.getClass(), "right", 0);
        setField(term4215, term4215.getClass(), "insets", term4219);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.impl.gridbagpanelbuilder.GbPanelBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("javax.swing.JComponent");
        argTypes[1] = Class.forName("javax.swing.JComponent");
        argTypes[2] = Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term4215;
        callMethod(klass, "addImpl", argTypes, term4071, args);
    }

};


