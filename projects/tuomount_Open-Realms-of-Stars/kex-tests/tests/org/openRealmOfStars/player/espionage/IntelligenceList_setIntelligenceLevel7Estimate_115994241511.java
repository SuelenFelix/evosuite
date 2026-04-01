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

public class IntelligenceList_setIntelligenceLevel7Estimate_115994241511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9201;
     Object term9246;

    public IntelligenceList_setIntelligenceLevel7Estimate_115994241511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9249 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term9248 = ((Class) term9249).getDeclaredField((String) "CHATTERBOX");
        ((Field) term9248).setAccessible(true);
        Object enum27 = ((Field) term9248).get((Object) null);
        Object term9209 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term9209, term9209.getClass(), "type", enum27);
        setIntField(term9209, term9209.getClass(), "value", -1034506028);
        setField(term9209, term9209.getClass(), "description", "");
        Class<? extends Object> term9581 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term9580 = ((Class) term9581).getDeclaredField((String) "OWN_REALM");
        ((Field) term9580).setAccessible(true);
        Object enum28 = ((Field) term9580).get((Object) null);
        Object term9214 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term9214, term9214.getClass(), "type", enum28);
        setIntField(term9214, term9214.getClass(), "value", -1263114719);
        setField(term9214, term9214.getClass(), "description", "");
        Class<? extends Object> term9910 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term9909 = ((Class) term9910).getDeclaredField((String) "TRADE");
        ((Field) term9909).setAccessible(true);
        Object enum29 = ((Field) term9909).get((Object) null);
        Object term9219 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term9219, term9219.getClass(), "type", enum29);
        setIntField(term9219, term9219.getClass(), "value", -894662986);
        setField(term9219, term9219.getClass(), "description", "");
        Class<? extends Object> term10227 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term10226 = ((Class) term10227).getDeclaredField((String) "CHATTERBOX");
        ((Field) term10226).setAccessible(true);
        Object enum30 = ((Field) term10226).get((Object) null);
        Object term9224 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term9224, term9224.getClass(), "type", enum30);
        setIntField(term9224, term9224.getClass(), "value", 304775596);
        setField(term9224, term9224.getClass(), "description", "");
        Object term9229 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term9229, term9229.getClass(), "type", enum29);
        setIntField(term9229, term9229.getClass(), "value", -1347665717);
        setField(term9229, term9229.getClass(), "description", "");
        Object term9232 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term9232, term9232.getClass(), "type", enum28);
        setIntField(term9232, term9232.getClass(), "value", -1888585309);
        setField(term9232, term9232.getClass(), "description", "");
        Object term9235 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term9235, term9235.getClass(), "type", enum30);
        setIntField(term9235, term9235.getClass(), "value", 683666002);
        setField(term9235, term9235.getClass(), "description", "");
        Object term9238 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term9238, term9238.getClass(), "type", enum28);
        setIntField(term9238, term9238.getClass(), "value", 1596213415);
        setField(term9238, term9238.getClass(), "description", "");
        Object term9241 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term9241, term9241.getClass(), "type", enum27);
        setIntField(term9241, term9241.getClass(), "value", -268815336);
        setField(term9241, term9241.getClass(), "description", "");
        ArrayList term9207 = new ArrayList();
        ((ArrayList) term9207).add(term9209);
        ((ArrayList) term9207).add(term9214);
        ((ArrayList) term9207).add(term9219);
        ((ArrayList) term9207).add(term9224);
        ((ArrayList) term9207).add(term9229);
        ((ArrayList) term9207).add(term9232);
        ((ArrayList) term9207).add(term9235);
        ((ArrayList) term9207).add(term9238);
        ((ArrayList) term9207).add(term9241);
        term9201 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList"));
        setIntField(term9201, term9201.getClass(), "playerIndex", -1845499264);
        setIntField(term9201, term9201.getClass(), "intelligenceLevel1Estimate", -505439934);
        setIntField(term9201, term9201.getClass(), "intelligenceLevel3Estimate", -344842608);
        setIntField(term9201, term9201.getClass(), "intelligenceLevel5Estimate", 941650513);
        setIntField(term9201, term9201.getClass(), "intelligenceLevel7Estimate", 444029505);
        setField(term9201, term9201.getClass(), "list", term9207);
        term9246 = new Integer(-1210583429);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term9246;
        callMethod(klass, "setIntelligenceLevel7Estimate", argTypes, term9201, args);
    }

};


