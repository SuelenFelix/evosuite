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

public class IntelligenceList_getIntelligenceLevel3Estimate_16044594314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12274;

    public IntelligenceList_getIntelligenceLevel3Estimate_16044594314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12303 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term12302 = ((Class) term12303).getDeclaredField((String) "OWN_REALM");
        ((Field) term12302).setAccessible(true);
        Object enum36 = ((Field) term12302).get((Object) null);
        Object term12282 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term12282, term12282.getClass(), "type", enum36);
        setIntField(term12282, term12282.getClass(), "value", 538259104);
        setField(term12282, term12282.getClass(), "description", "");
        Class<? extends Object> term12632 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term12631 = ((Class) term12632).getDeclaredField((String) "TRADE");
        ((Field) term12631).setAccessible(true);
        Object enum37 = ((Field) term12631).get((Object) null);
        Object term12287 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term12287, term12287.getClass(), "type", enum37);
        setIntField(term12287, term12287.getClass(), "value", 96566506);
        setField(term12287, term12287.getClass(), "description", "");
        Class<? extends Object> term12949 = Class.forName((String) "org.openRealmOfStars.player.espionage.IntelligenceBonusType");
        Field term12948 = ((Class) term12949).getDeclaredField((String) "CHATTERBOX");
        ((Field) term12948).setAccessible(true);
        Object enum38 = ((Field) term12948).get((Object) null);
        Object term12292 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term12292, term12292.getClass(), "type", enum38);
        setIntField(term12292, term12292.getClass(), "value", -343325701);
        setField(term12292, term12292.getClass(), "description", "");
        Object term12297 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceBonus"));
        setField(term12297, term12297.getClass(), "type", enum37);
        setIntField(term12297, term12297.getClass(), "value", 107945604);
        setField(term12297, term12297.getClass(), "description", "");
        ArrayList term12280 = new ArrayList();
        ((ArrayList) term12280).add(term12282);
        ((ArrayList) term12280).add(term12287);
        ((ArrayList) term12280).add(term12292);
        ((ArrayList) term12280).add(term12297);
        term12274 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList"));
        setIntField(term12274, term12274.getClass(), "playerIndex", -375014958);
        setIntField(term12274, term12274.getClass(), "intelligenceLevel1Estimate", 1107176718);
        setIntField(term12274, term12274.getClass(), "intelligenceLevel3Estimate", 480137250);
        setIntField(term12274, term12274.getClass(), "intelligenceLevel5Estimate", -341152642);
        setIntField(term12274, term12274.getClass(), "intelligenceLevel7Estimate", -2015854073);
        setField(term12274, term12274.getClass(), "list", term12280);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIntelligenceLevel3Estimate", argTypes, term12274, args);
    }

};


