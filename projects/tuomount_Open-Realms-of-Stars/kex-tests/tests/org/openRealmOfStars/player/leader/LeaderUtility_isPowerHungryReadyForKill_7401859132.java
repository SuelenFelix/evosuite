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

public class LeaderUtility_isPowerHungryReadyForKill_7401859132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term597808;

    public LeaderUtility_isPowerHungryReadyForKill_7401859132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term597961 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term597960 = ((Class) term597961).getDeclaredField((String) "STRONG_RULER");
        ((Field) term597960).setAccessible(true);
        Object enum1921 = ((Field) term597960).get((Object) null);
        ArrayList term597880 = new ArrayList();
        ((ArrayList) term597880).add((Object)null);
        ((ArrayList) term597880).add((Object)null);
        ((ArrayList) term597880).add((Object)null);
        ((ArrayList) term597880).add((Object)null);
        ((ArrayList) term597880).add((Object)null);
        ((ArrayList) term597880).add((Object)null);
        ((ArrayList) term597880).add((Object)null);
        ((ArrayList) term597880).add((Object)null);
        ((ArrayList) term597880).add((Object)null);
        Object term597875 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term597875, term597875.getClass(), "traitId", "");
        setField(term597875, term597875.getClass(), "traitName", "");
        setField(term597875, term597875.getClass(), "description", "");
        setField(term597875, term597875.getClass(), "group", "");
        setField(term597875, term597875.getClass(), "conflictsWithIds", term597880);
        setByteField(term597875, term597875.getClass(), "traitPoints", (byte) -120);
        ArrayList term597889 = new ArrayList();
        ((ArrayList) term597889).add((Object)null);
        ((ArrayList) term597889).add((Object)null);
        ((ArrayList) term597889).add((Object)null);
        Object term597884 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term597884, term597884.getClass(), "traitId", "");
        setField(term597884, term597884.getClass(), "traitName", "");
        setField(term597884, term597884.getClass(), "description", "");
        setField(term597884, term597884.getClass(), "group", "");
        setField(term597884, term597884.getClass(), "conflictsWithIds", term597889);
        setByteField(term597884, term597884.getClass(), "traitPoints", (byte) 58);
        ArrayList term597898 = new ArrayList();
        ((ArrayList) term597898).add((Object)null);
        ((ArrayList) term597898).add((Object)null);
        ((ArrayList) term597898).add((Object)null);
        ((ArrayList) term597898).add((Object)null);
        Object term597893 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term597893, term597893.getClass(), "traitId", "");
        setField(term597893, term597893.getClass(), "traitName", "");
        setField(term597893, term597893.getClass(), "description", "");
        setField(term597893, term597893.getClass(), "group", "");
        setField(term597893, term597893.getClass(), "conflictsWithIds", term597898);
        setByteField(term597893, term597893.getClass(), "traitPoints", (byte) -97);
        ArrayList term597907 = new ArrayList();
        ((ArrayList) term597907).add((Object)null);
        ((ArrayList) term597907).add((Object)null);
        ((ArrayList) term597907).add((Object)null);
        ((ArrayList) term597907).add((Object)null);
        ((ArrayList) term597907).add((Object)null);
        Object term597902 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term597902, term597902.getClass(), "traitId", "");
        setField(term597902, term597902.getClass(), "traitName", "");
        setField(term597902, term597902.getClass(), "description", "");
        setField(term597902, term597902.getClass(), "group", "");
        setField(term597902, term597902.getClass(), "conflictsWithIds", term597907);
        setByteField(term597902, term597902.getClass(), "traitPoints", (byte) 85);
        ArrayList term597916 = new ArrayList();
        ((ArrayList) term597916).add((Object)null);
        Object term597911 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term597911, term597911.getClass(), "traitId", "");
        setField(term597911, term597911.getClass(), "traitName", "");
        setField(term597911, term597911.getClass(), "description", "");
        setField(term597911, term597911.getClass(), "group", "");
        setField(term597911, term597911.getClass(), "conflictsWithIds", term597916);
        setByteField(term597911, term597911.getClass(), "traitPoints", (byte) -62);
        ArrayList term597925 = new ArrayList();
        ((ArrayList) term597925).add((Object)null);
        ((ArrayList) term597925).add((Object)null);
        ((ArrayList) term597925).add((Object)null);
        ((ArrayList) term597925).add((Object)null);
        ((ArrayList) term597925).add((Object)null);
        ((ArrayList) term597925).add((Object)null);
        ((ArrayList) term597925).add((Object)null);
        ((ArrayList) term597925).add((Object)null);
        ((ArrayList) term597925).add((Object)null);
        Object term597920 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term597920, term597920.getClass(), "traitId", "");
        setField(term597920, term597920.getClass(), "traitName", "");
        setField(term597920, term597920.getClass(), "description", "");
        setField(term597920, term597920.getClass(), "group", "");
        setField(term597920, term597920.getClass(), "conflictsWithIds", term597925);
        setByteField(term597920, term597920.getClass(), "traitPoints", (byte) 100);
        ArrayList term597934 = new ArrayList();
        ((ArrayList) term597934).add((Object)null);
        ((ArrayList) term597934).add((Object)null);
        ((ArrayList) term597934).add((Object)null);
        Object term597929 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term597929, term597929.getClass(), "traitId", "");
        setField(term597929, term597929.getClass(), "traitName", "");
        setField(term597929, term597929.getClass(), "description", "");
        setField(term597929, term597929.getClass(), "group", "");
        setField(term597929, term597929.getClass(), "conflictsWithIds", term597934);
        setByteField(term597929, term597929.getClass(), "traitPoints", (byte) -81);
        ArrayList term597873 = new ArrayList();
        ((ArrayList) term597873).add(term597875);
        ((ArrayList) term597873).add(term597884);
        ((ArrayList) term597873).add(term597893);
        ((ArrayList) term597873).add(term597902);
        ((ArrayList) term597873).add(term597911);
        ((ArrayList) term597873).add(term597920);
        ((ArrayList) term597873).add(term597929);
        term597808 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term597808, term597808.getClass(), "id", "IKkVaVXBsQ");
        setField(term597808, term597808.getClass(), "name", "RiKEEpfJDt");
        setField(term597808, term597808.getClass(), "rulerSelection", enum1921);
        setField(term597808, term597808.getClass(), "rulerTitleMale", "DTsGHvYoJK");
        setField(term597808, term597808.getClass(), "rulerTitleFemale", "tpQfHUlVep");
        setField(term597808, term597808.getClass(), "traits", term597873);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.leader.LeaderUtility");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.government.Government");
        Object[] args = new Object[1];
        args[0] = term597808;
        callMethod(klass, "isPowerHungryReadyForKill", argTypes, null, args);
    }

};


