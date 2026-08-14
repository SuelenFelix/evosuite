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

public class GbPanelBuilder_addHeaderImpl_16643738094 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3072;

    public GbPanelBuilder_addHeaderImpl_16643738094() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3147 = new ArrayList();
        ((ArrayList) term3147).add((Object)null);
        ((ArrayList) term3147).add((Object)null);
        ((ArrayList) term3147).add((Object)null);
        ((ArrayList) term3147).add((Object)null);
        ArrayList term3151 = new ArrayList();
        Class<? extends Object> term3234 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term3233 = ((Class) term3234).getDeclaredField((String) "START");
        ((Field) term3233).setAccessible(true);
        Object enum9 = ((Field) term3233).get((Object) null);
        Class<? extends Object> term3511 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.PageAlign");
        Field term3510 = ((Class) term3511).getDeclaredField((String) "MIDDLE");
        ((Field) term3510).setAccessible(true);
        Object enum10 = ((Field) term3510).get((Object) null);
        Class<? extends Object> term3791 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term3790 = ((Class) term3791).getDeclaredField((String) "CENTER");
        ((Field) term3790).setAccessible(true);
        Object enum11 = ((Field) term3790).get((Object) null);
        HashMap term3213 = new HashMap();
        Set<Object> term4070 =  ((Map) term3213).keySet();
        HashSet term3212 = new HashSet((Collection<? extends Object>) term4070);
        term3072 = newInstance(Class.forName("io.codeworth.panelmatic.impl.gridbagpanelbuilder.GbPanelBuilder"));
        Object term3073 = newInstance(Class.forName("java.awt.GridBagConstraints"));
        Object term3082 = newInstance(Class.forName("java.awt.Insets"));
        Object term3099 = newInstance(Class.forName("java.awt.GridBagConstraints"));
        Object term3108 = newInstance(Class.forName("java.awt.Insets"));
        Object term3123 = newInstance(Class.forName("java.awt.Component$BaselineResizeBehavior"));
        Object term3144 = newInstance(Class.forName("io.codeworth.panelmatic.impl.DefaultComponentFactory"));
        Object term3145 = newInstance(Class.forName("java.awt.ComponentOrientation"));
        Object term3155 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term3178 = newInstance(Class.forName("java.awt.Insets"));
        Object term3183 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term3197 = newInstance(Class.forName("java.awt.Insets"));
        Object term3202 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term3206 = newInstance(Class.forName("java.awt.Insets"));
        Object term3211 = newInstance(Class.forName("io.codeworth.panelmatic.BuilderPool"));
        setIntField(term3073, term3073.getClass(), "gridx", -1);
        setIntField(term3073, term3073.getClass(), "gridy", -1);
        setIntField(term3073, term3073.getClass(), "gridwidth", 1);
        setIntField(term3073, term3073.getClass(), "gridheight", 1);
        setDoubleField(term3073, term3073.getClass(), "weightx", 0.0);
        setDoubleField(term3073, term3073.getClass(), "weighty", 0.0);
        setIntField(term3073, term3073.getClass(), "anchor", 21);
        setIntField(term3073, term3073.getClass(), "fill", 0);
        setIntField(term3082, term3082.getClass(), "top", 1);
        setIntField(term3082, term3082.getClass(), "left", 1);
        setIntField(term3082, term3082.getClass(), "bottom", 1);
        setIntField(term3082, term3082.getClass(), "right", 1);
        setField(term3073, term3073.getClass(), "insets", term3082);
        setIntField(term3073, term3073.getClass(), "ipadx", 0);
        setIntField(term3073, term3073.getClass(), "ipady", 0);
        setIntField(term3073, term3073.getClass(), "tempX", 0);
        setIntField(term3073, term3073.getClass(), "tempY", 0);
        setIntField(term3073, term3073.getClass(), "tempWidth", 0);
        setIntField(term3073, term3073.getClass(), "tempHeight", 0);
        setIntField(term3073, term3073.getClass(), "minWidth", 0);
        setIntField(term3073, term3073.getClass(), "minHeight", 0);
        setIntField(term3073, term3073.getClass(), "ascent", 0);
        setIntField(term3073, term3073.getClass(), "descent", 0);
        setField(term3073, term3073.getClass(), "baselineResizeBehavior", null);
        setIntField(term3073, term3073.getClass(), "centerPadding", 0);
        setIntField(term3073, term3073.getClass(), "centerOffset", 0);
        setField(term3072, term3072.getClass(), "labelConstraints", term3073);
        setIntField(term3099, term3099.getClass(), "gridx", -1);
        setIntField(term3099, term3099.getClass(), "gridy", -1);
        setIntField(term3099, term3099.getClass(), "gridwidth", 1);
        setIntField(term3099, term3099.getClass(), "gridheight", 1);
        setDoubleField(term3099, term3099.getClass(), "weightx", 0.6076495596892013);
        setDoubleField(term3099, term3099.getClass(), "weighty", 0.37773193782763337);
        setIntField(term3099, term3099.getClass(), "anchor", 10);
        setIntField(term3099, term3099.getClass(), "fill", -1968847291);
        setIntField(term3108, term3108.getClass(), "top", 0);
        setIntField(term3108, term3108.getClass(), "left", 0);
        setIntField(term3108, term3108.getClass(), "bottom", 0);
        setIntField(term3108, term3108.getClass(), "right", 0);
        setField(term3099, term3099.getClass(), "insets", term3108);
        setIntField(term3099, term3099.getClass(), "ipadx", 579005622);
        setIntField(term3099, term3099.getClass(), "ipady", -14890619);
        setIntField(term3099, term3099.getClass(), "tempX", 1632125673);
        setIntField(term3099, term3099.getClass(), "tempY", 454281060);
        setIntField(term3099, term3099.getClass(), "tempWidth", -1786399638);
        setIntField(term3099, term3099.getClass(), "tempHeight", 2055867847);
        setIntField(term3099, term3099.getClass(), "minWidth", -1048298087);
        setIntField(term3099, term3099.getClass(), "minHeight", 292681826);
        setIntField(term3099, term3099.getClass(), "ascent", 458147407);
        setIntField(term3099, term3099.getClass(), "descent", -184153539);
        setField(term3123, term3123.getClass(), "name", "CONSTANT_ASCENT");
        setIntField(term3123, term3123.getClass(), "ordinal", 0);
        setField(term3099, term3099.getClass(), "baselineResizeBehavior", term3123);
        setIntField(term3099, term3099.getClass(), "centerPadding", 493620644);
        setIntField(term3099, term3099.getClass(), "centerOffset", 1328271830);
        setField(term3072, term3072.getClass(), "headerConstraints", term3099);
        setField(term3072, term3072.getClass(), "product", null);
        setIntField(term3145, term3145.getClass(), "orientation", 6);
        setField(term3144, term3144.getClass(), "componentOrientation", term3145);
        setField(term3072, term3072.getClass(), "componentFactory", term3144);
        setField(term3072, term3072.getClass(), "currentBuildCustomizers", term3147);
        setField(term3072, term3072.getClass(), "customizerChain", term3151);
        setField(term3155, term3155.getClass(), "lineAlign", enum9);
        setField(term3155, term3155.getClass(), "pageAlign", enum10);
        setBooleanField(term3155, term3155.getClass(), "pageStretch", true);
        setBooleanField(term3155, term3155.getClass(), "lineStretch", true);
        setDoubleField(term3155, term3155.getClass(), "pageGrowFactor", 0.0);
        setIntField(term3178, term3178.getClass(), "top", 1);
        setIntField(term3178, term3178.getClass(), "left", 1);
        setIntField(term3178, term3178.getClass(), "bottom", 3);
        setIntField(term3178, term3178.getClass(), "right", 1);
        setField(term3155, term3155.getClass(), "insets", term3178);
        setField(term3072, term3072.getClass(), "baseComponentBehavior", term3155);
        setField(term3183, term3183.getClass(), "lineAlign", enum11);
        setField(term3183, term3183.getClass(), "pageAlign", enum10);
        setBooleanField(term3183, term3183.getClass(), "pageStretch", false);
        setBooleanField(term3183, term3183.getClass(), "lineStretch", true);
        setDoubleField(term3183, term3183.getClass(), "pageGrowFactor", 0.0);
        setIntField(term3197, term3197.getClass(), "top", 0);
        setIntField(term3197, term3197.getClass(), "left", 0);
        setIntField(term3197, term3197.getClass(), "bottom", 0);
        setIntField(term3197, term3197.getClass(), "right", 0);
        setField(term3183, term3183.getClass(), "insets", term3197);
        setField(term3072, term3072.getClass(), "headerBehavior", term3183);
        setField(term3202, term3202.getClass(), "lineAlign", enum9);
        setField(term3202, term3202.getClass(), "pageAlign", enum10);
        setBooleanField(term3202, term3202.getClass(), "pageStretch", false);
        setBooleanField(term3202, term3202.getClass(), "lineStretch", false);
        setDoubleField(term3202, term3202.getClass(), "pageGrowFactor", 0.0);
        setIntField(term3206, term3206.getClass(), "top", 1);
        setIntField(term3206, term3206.getClass(), "left", 5);
        setIntField(term3206, term3206.getClass(), "bottom", 1);
        setIntField(term3206, term3206.getClass(), "right", 1);
        setField(term3202, term3202.getClass(), "insets", term3206);
        setField(term3072, term3072.getClass(), "labelBehavior", term3202);
        setField(term3211, term3211.getClass(), "builders", term3212);
        setField(term3072, term3072.getClass(), "myPool", term3211);
        setField(term3072, term3072.getClass(), "resourceBundle", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.impl.gridbagpanelbuilder.GbPanelBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.JComponent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addHeaderImpl", argTypes, term3072, args);
    }

};


