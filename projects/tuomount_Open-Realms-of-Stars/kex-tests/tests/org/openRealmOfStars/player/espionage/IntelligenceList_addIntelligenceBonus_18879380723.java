package org.openRealmOfStars.player.espionage;

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
import static org.openRealmOfStars.player.espionage.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

public class IntelligenceList_addIntelligenceBonus_18879380723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2105;
     Object enum7;
     Object term2139;

    public IntelligenceList_addIntelligenceBonus_18879380723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2154 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term2153 = ((Class) term2154).getDeclaredField((String) "OWN_REALM");
        ((Field) term2153).setAccessible(true);
        Object enum6 = ((Field) term2153).get((Object) null);
        Object term2113 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term2113, term2113.getClass(), "type", enum6);
        setIntField(term2113, term2113.getClass(), "value", 1135664017);
        setField(term2113, term2113.getClass(), "description", "");
        Class<? extends Object> term2483 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term2482 = ((Class) term2483).getDeclaredField((String) "SPY_FLEET");
        ((Field) term2482).setAccessible(true);
        enum7 = ((Field) term2482).get((Object) null);
        Object term2118 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term2118, term2118.getClass(), "type", enum7);
        setIntField(term2118, term2118.getClass(), "value", 590364439);
        setField(term2118, term2118.getClass(), "description", "");
        Object term2123 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term2123, term2123.getClass(), "type", enum7);
        setIntField(term2123, term2123.getClass(), "value", 865208305);
        setField(term2123, term2123.getClass(), "description", "");
        Object term2126 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term2126, term2126.getClass(), "type", enum6);
        setIntField(term2126, term2126.getClass(), "value", -1275173084);
        setField(term2126, term2126.getClass(), "description", "");
        Class<? extends Object> term2812 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term2811 = ((Class) term2812).getDeclaredField((String) "OWN_REALM");
        ((Field) term2811).setAccessible(true);
        Object enum8 = ((Field) term2811).get((Object) null);
        Object term2129 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term2129, term2129.getClass(), "type", enum8);
        setIntField(term2129, term2129.getClass(), "value", -244121226);
        setField(term2129, term2129.getClass(), "description", "");
        Object term2134 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term2134, term2134.getClass(), "type", enum6);
        setIntField(term2134, term2134.getClass(), "value", -203030934);
        setField(term2134, term2134.getClass(), "description", "");
        ArrayList term2111 = new ArrayList();
        ((ArrayList) term2111).add(term2113);
        ((ArrayList) term2111).add(term2118);
        ((ArrayList) term2111).add(term2123);
        ((ArrayList) term2111).add(term2126);
        ((ArrayList) term2111).add(term2129);
        ((ArrayList) term2111).add(term2134);
        term2105 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList"));
        setIntField(term2105, term2105.getClass(), "playerIndex", -655067527);
        setIntField(term2105, term2105.getClass(), "intelligenceLevel1Estimate", -6029667);
        setIntField(term2105, term2105.getClass(), "intelligenceLevel3Estimate", -2068769794);
        setIntField(term2105, term2105.getClass(), "intelligenceLevel5Estimate", -117576464);
        setIntField(term2105, term2105.getClass(), "intelligenceLevel7Estimate", -1007160944);
        setField(term2105, term2105.getClass(), "list", term2111);
        term2139 = new Integer(-1179120542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = enum7;
        args[1] = term2139;
        args[2] = "aJlieCFVtF";
        callMethod(klass, "addIntelligenceBonus", argTypes, term2105, args);
    }

};


