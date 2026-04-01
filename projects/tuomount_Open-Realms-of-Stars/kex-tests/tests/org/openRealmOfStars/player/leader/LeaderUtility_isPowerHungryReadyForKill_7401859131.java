package org.openRealmOfStars.player.leader;

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
import static org.openRealmOfStars.player.leader.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class LeaderUtility_isPowerHungryReadyForKill_7401859131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2213839;

    public LeaderUtility_isPowerHungryReadyForKill_7401859131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2213970 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term2213969 = ((Class) term2213970).getDeclaredField((String) "AI_RULER");
        ((Field) term2213969).setAccessible(true);
        Object enum6771 = ((Field) term2213969).get((Object) null);
        ArrayList term2213907 = new ArrayList();
        ((ArrayList) term2213907).add((Object)null);
        ((ArrayList) term2213907).add((Object)null);
        Object term2213902 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term2213902, term2213902.getClass(), "traitId", "");
        setField(term2213902, term2213902.getClass(), "traitName", "");
        setField(term2213902, term2213902.getClass(), "description", "");
        setField(term2213902, term2213902.getClass(), "group", "");
        setField(term2213902, term2213902.getClass(), "conflictsWithIds", term2213907);
        setByteField(term2213902, term2213902.getClass(), "traitPoints", (byte) 18);
        ArrayList term2213916 = new ArrayList();
        ((ArrayList) term2213916).add((Object)null);
        ((ArrayList) term2213916).add((Object)null);
        Object term2213911 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term2213911, term2213911.getClass(), "traitId", "");
        setField(term2213911, term2213911.getClass(), "traitName", "");
        setField(term2213911, term2213911.getClass(), "description", "");
        setField(term2213911, term2213911.getClass(), "group", "");
        setField(term2213911, term2213911.getClass(), "conflictsWithIds", term2213916);
        setByteField(term2213911, term2213911.getClass(), "traitPoints", (byte) -55);
        ArrayList term2213925 = new ArrayList();
        ((ArrayList) term2213925).add((Object)null);
        ((ArrayList) term2213925).add((Object)null);
        ((ArrayList) term2213925).add((Object)null);
        ((ArrayList) term2213925).add((Object)null);
        ((ArrayList) term2213925).add((Object)null);
        ((ArrayList) term2213925).add((Object)null);
        ((ArrayList) term2213925).add((Object)null);
        Object term2213920 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term2213920, term2213920.getClass(), "traitId", "");
        setField(term2213920, term2213920.getClass(), "traitName", "");
        setField(term2213920, term2213920.getClass(), "description", "");
        setField(term2213920, term2213920.getClass(), "group", "");
        setField(term2213920, term2213920.getClass(), "conflictsWithIds", term2213925);
        setByteField(term2213920, term2213920.getClass(), "traitPoints", (byte) 57);
        ArrayList term2213934 = new ArrayList();
        ((ArrayList) term2213934).add((Object)null);
        ((ArrayList) term2213934).add((Object)null);
        ((ArrayList) term2213934).add((Object)null);
        Object term2213929 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term2213929, term2213929.getClass(), "traitId", "");
        setField(term2213929, term2213929.getClass(), "traitName", "");
        setField(term2213929, term2213929.getClass(), "description", "");
        setField(term2213929, term2213929.getClass(), "group", "");
        setField(term2213929, term2213929.getClass(), "conflictsWithIds", term2213934);
        setByteField(term2213929, term2213929.getClass(), "traitPoints", (byte) 67);
        ArrayList term2213943 = new ArrayList();
        ((ArrayList) term2213943).add((Object)null);
        ((ArrayList) term2213943).add((Object)null);
        ((ArrayList) term2213943).add((Object)null);
        ((ArrayList) term2213943).add((Object)null);
        ((ArrayList) term2213943).add((Object)null);
        Object term2213938 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term2213938, term2213938.getClass(), "traitId", "");
        setField(term2213938, term2213938.getClass(), "traitName", "");
        setField(term2213938, term2213938.getClass(), "description", "");
        setField(term2213938, term2213938.getClass(), "group", "");
        setField(term2213938, term2213938.getClass(), "conflictsWithIds", term2213943);
        setByteField(term2213938, term2213938.getClass(), "traitPoints", (byte) 82);
        ArrayList term2213900 = new ArrayList();
        ((ArrayList) term2213900).add(term2213902);
        ((ArrayList) term2213900).add(term2213911);
        ((ArrayList) term2213900).add(term2213920);
        ((ArrayList) term2213900).add(term2213929);
        ((ArrayList) term2213900).add(term2213938);
        term2213839 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term2213839, term2213839.getClass(), "id", "xdDvFnKNSL");
        setField(term2213839, term2213839.getClass(), "name", "qgzvTemqYT");
        setField(term2213839, term2213839.getClass(), "rulerSelection", enum6771);
        setField(term2213839, term2213839.getClass(), "rulerTitleMale", "LGNsqnBEof");
        setField(term2213839, term2213839.getClass(), "rulerTitleFemale", "VrFQusSyJG");
        setField(term2213839, term2213839.getClass(), "traits", term2213900);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.leader.LeaderUtility");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.government.Government");
        Object[] args = new Object[1];
        args[0] = term2213839;
        callMethod(klass, "isPowerHungryReadyForKill", argTypes, null, args);
    }

};


