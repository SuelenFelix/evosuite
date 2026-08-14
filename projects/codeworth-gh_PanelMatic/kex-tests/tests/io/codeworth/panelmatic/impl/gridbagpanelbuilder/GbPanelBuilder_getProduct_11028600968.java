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

public class GbPanelBuilder_getProduct_11028600968 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7058;

    public GbPanelBuilder_getProduct_11028600968() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7131 = new ArrayList();
        ((ArrayList) term7131).add((Object)null);
        ((ArrayList) term7131).add((Object)null);
        ((ArrayList) term7131).add((Object)null);
        ((ArrayList) term7131).add((Object)null);
        ((ArrayList) term7131).add((Object)null);
        ((ArrayList) term7131).add((Object)null);
        ArrayList term7135 = new ArrayList();
        Class<? extends Object> term7216 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term7215 = ((Class) term7216).getDeclaredField((String) "START");
        ((Field) term7215).setAccessible(true);
        Object enum21 = ((Field) term7215).get((Object) null);
        Class<? extends Object> term7493 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.PageAlign");
        Field term7492 = ((Class) term7493).getDeclaredField((String) "MIDDLE");
        ((Field) term7492).setAccessible(true);
        Object enum22 = ((Field) term7492).get((Object) null);
        Class<? extends Object> term7773 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term7772 = ((Class) term7773).getDeclaredField((String) "CENTER");
        ((Field) term7772).setAccessible(true);
        Object enum23 = ((Field) term7772).get((Object) null);
        HashMap term7197 = new HashMap();
        Set<Object> term8052 =  ((Map) term7197).keySet();
        HashSet term7196 = new HashSet((Collection<? extends Object>) term8052);
        term7058 = newInstance(Class.forName("io.codeworth.panelmatic.impl.gridbagpanelbuilder.GbPanelBuilder"));
        Object term7059 = newInstance(Class.forName("java.awt.GridBagConstraints"));
        Object term7068 = newInstance(Class.forName("java.awt.Insets"));
        Object term7085 = newInstance(Class.forName("java.awt.GridBagConstraints"));
        Object term7094 = newInstance(Class.forName("java.awt.Insets"));
        Object term7109 = newInstance(Class.forName("java.awt.Component$BaselineResizeBehavior"));
        Object term7128 = newInstance(Class.forName("io.codeworth.panelmatic.impl.DefaultComponentFactory"));
        Object term7129 = newInstance(Class.forName("java.awt.ComponentOrientation"));
        Object term7139 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term7162 = newInstance(Class.forName("java.awt.Insets"));
        Object term7167 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term7181 = newInstance(Class.forName("java.awt.Insets"));
        Object term7186 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term7190 = newInstance(Class.forName("java.awt.Insets"));
        Object term7195 = newInstance(Class.forName("io.codeworth.panelmatic.BuilderPool"));
        setIntField(term7059, term7059.getClass(), "gridx", -1);
        setIntField(term7059, term7059.getClass(), "gridy", -1);
        setIntField(term7059, term7059.getClass(), "gridwidth", 1);
        setIntField(term7059, term7059.getClass(), "gridheight", 1);
        setDoubleField(term7059, term7059.getClass(), "weightx", 0.0);
        setDoubleField(term7059, term7059.getClass(), "weighty", 0.0);
        setIntField(term7059, term7059.getClass(), "anchor", 21);
        setIntField(term7059, term7059.getClass(), "fill", 0);
        setIntField(term7068, term7068.getClass(), "top", 1);
        setIntField(term7068, term7068.getClass(), "left", 1);
        setIntField(term7068, term7068.getClass(), "bottom", 1);
        setIntField(term7068, term7068.getClass(), "right", 1);
        setField(term7059, term7059.getClass(), "insets", term7068);
        setIntField(term7059, term7059.getClass(), "ipadx", 0);
        setIntField(term7059, term7059.getClass(), "ipady", 0);
        setIntField(term7059, term7059.getClass(), "tempX", 0);
        setIntField(term7059, term7059.getClass(), "tempY", 0);
        setIntField(term7059, term7059.getClass(), "tempWidth", 0);
        setIntField(term7059, term7059.getClass(), "tempHeight", 0);
        setIntField(term7059, term7059.getClass(), "minWidth", 0);
        setIntField(term7059, term7059.getClass(), "minHeight", 0);
        setIntField(term7059, term7059.getClass(), "ascent", 0);
        setIntField(term7059, term7059.getClass(), "descent", 0);
        setField(term7059, term7059.getClass(), "baselineResizeBehavior", null);
        setIntField(term7059, term7059.getClass(), "centerPadding", 0);
        setIntField(term7059, term7059.getClass(), "centerOffset", 0);
        setField(term7058, term7058.getClass(), "labelConstraints", term7059);
        setIntField(term7085, term7085.getClass(), "gridx", -1);
        setIntField(term7085, term7085.getClass(), "gridy", -1);
        setIntField(term7085, term7085.getClass(), "gridwidth", 1);
        setIntField(term7085, term7085.getClass(), "gridheight", 1);
        setDoubleField(term7085, term7085.getClass(), "weightx", 0.6436713023569729);
        setDoubleField(term7085, term7085.getClass(), "weighty", 0.7332741045694002);
        setIntField(term7085, term7085.getClass(), "anchor", 10);
        setIntField(term7085, term7085.getClass(), "fill", 339854490);
        setIntField(term7094, term7094.getClass(), "top", 0);
        setIntField(term7094, term7094.getClass(), "left", 0);
        setIntField(term7094, term7094.getClass(), "bottom", 0);
        setIntField(term7094, term7094.getClass(), "right", 0);
        setField(term7085, term7085.getClass(), "insets", term7094);
        setIntField(term7085, term7085.getClass(), "ipadx", -615654495);
        setIntField(term7085, term7085.getClass(), "ipady", -1476117762);
        setIntField(term7085, term7085.getClass(), "tempX", -341962980);
        setIntField(term7085, term7085.getClass(), "tempY", 1532716628);
        setIntField(term7085, term7085.getClass(), "tempWidth", -1801760683);
        setIntField(term7085, term7085.getClass(), "tempHeight", 1141317871);
        setIntField(term7085, term7085.getClass(), "minWidth", 890669485);
        setIntField(term7085, term7085.getClass(), "minHeight", 691577392);
        setIntField(term7085, term7085.getClass(), "ascent", -893623680);
        setIntField(term7085, term7085.getClass(), "descent", -1963434938);
        setField(term7109, term7109.getClass(), "name", "CENTER_OFFSET");
        setIntField(term7109, term7109.getClass(), "ordinal", 2);
        setField(term7085, term7085.getClass(), "baselineResizeBehavior", term7109);
        setIntField(term7085, term7085.getClass(), "centerPadding", 906181092);
        setIntField(term7085, term7085.getClass(), "centerOffset", 1045657203);
        setField(term7058, term7058.getClass(), "headerConstraints", term7085);
        setField(term7058, term7058.getClass(), "product", null);
        setIntField(term7129, term7129.getClass(), "orientation", 6);
        setField(term7128, term7128.getClass(), "componentOrientation", term7129);
        setField(term7058, term7058.getClass(), "componentFactory", term7128);
        setField(term7058, term7058.getClass(), "currentBuildCustomizers", term7131);
        setField(term7058, term7058.getClass(), "customizerChain", term7135);
        setField(term7139, term7139.getClass(), "lineAlign", enum21);
        setField(term7139, term7139.getClass(), "pageAlign", enum22);
        setBooleanField(term7139, term7139.getClass(), "pageStretch", true);
        setBooleanField(term7139, term7139.getClass(), "lineStretch", true);
        setDoubleField(term7139, term7139.getClass(), "pageGrowFactor", 0.0);
        setIntField(term7162, term7162.getClass(), "top", 1);
        setIntField(term7162, term7162.getClass(), "left", 1);
        setIntField(term7162, term7162.getClass(), "bottom", 3);
        setIntField(term7162, term7162.getClass(), "right", 1);
        setField(term7139, term7139.getClass(), "insets", term7162);
        setField(term7058, term7058.getClass(), "baseComponentBehavior", term7139);
        setField(term7167, term7167.getClass(), "lineAlign", enum23);
        setField(term7167, term7167.getClass(), "pageAlign", enum22);
        setBooleanField(term7167, term7167.getClass(), "pageStretch", false);
        setBooleanField(term7167, term7167.getClass(), "lineStretch", true);
        setDoubleField(term7167, term7167.getClass(), "pageGrowFactor", 0.0);
        setIntField(term7181, term7181.getClass(), "top", 0);
        setIntField(term7181, term7181.getClass(), "left", 0);
        setIntField(term7181, term7181.getClass(), "bottom", 0);
        setIntField(term7181, term7181.getClass(), "right", 0);
        setField(term7167, term7167.getClass(), "insets", term7181);
        setField(term7058, term7058.getClass(), "headerBehavior", term7167);
        setField(term7186, term7186.getClass(), "lineAlign", enum21);
        setField(term7186, term7186.getClass(), "pageAlign", enum22);
        setBooleanField(term7186, term7186.getClass(), "pageStretch", false);
        setBooleanField(term7186, term7186.getClass(), "lineStretch", false);
        setDoubleField(term7186, term7186.getClass(), "pageGrowFactor", 0.0);
        setIntField(term7190, term7190.getClass(), "top", 1);
        setIntField(term7190, term7190.getClass(), "left", 5);
        setIntField(term7190, term7190.getClass(), "bottom", 1);
        setIntField(term7190, term7190.getClass(), "right", 1);
        setField(term7186, term7186.getClass(), "insets", term7190);
        setField(term7058, term7058.getClass(), "labelBehavior", term7186);
        setField(term7195, term7195.getClass(), "builders", term7196);
        setField(term7058, term7058.getClass(), "myPool", term7195);
        setField(term7058, term7058.getClass(), "resourceBundle", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.impl.gridbagpanelbuilder.GbPanelBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProduct", argTypes, term7058, args);
    }

};


