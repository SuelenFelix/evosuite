package org.openRealmOfStars.player.government;

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
import static org.openRealmOfStars.player.government.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class Government_isAggressive_183112961931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19462;

    public Government_isAggressive_183112961931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19606 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term19605 = ((Class) term19606).getDeclaredField((String) "STRONG_RULER");
        ((Field) term19605).setAccessible(true);
        Object enum39 = ((Field) term19605).get((Object) null);
        ArrayList term19534 = new ArrayList();
        ((ArrayList) term19534).add((Object)null);
        ((ArrayList) term19534).add((Object)null);
        ((ArrayList) term19534).add((Object)null);
        ((ArrayList) term19534).add((Object)null);
        ((ArrayList) term19534).add((Object)null);
        ((ArrayList) term19534).add((Object)null);
        ((ArrayList) term19534).add((Object)null);
        Object term19529 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term19529, term19529.getClass(), "traitId", "");
        setField(term19529, term19529.getClass(), "traitName", "");
        setField(term19529, term19529.getClass(), "description", "");
        setField(term19529, term19529.getClass(), "group", "");
        setField(term19529, term19529.getClass(), "conflictsWithIds", term19534);
        setByteField(term19529, term19529.getClass(), "traitPoints", (byte) 34);
        ArrayList term19543 = new ArrayList();
        ((ArrayList) term19543).add((Object)null);
        ((ArrayList) term19543).add((Object)null);
        ((ArrayList) term19543).add((Object)null);
        ((ArrayList) term19543).add((Object)null);
        ((ArrayList) term19543).add((Object)null);
        Object term19538 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term19538, term19538.getClass(), "traitId", "");
        setField(term19538, term19538.getClass(), "traitName", "");
        setField(term19538, term19538.getClass(), "description", "");
        setField(term19538, term19538.getClass(), "group", "");
        setField(term19538, term19538.getClass(), "conflictsWithIds", term19543);
        setByteField(term19538, term19538.getClass(), "traitPoints", (byte) -126);
        ArrayList term19552 = new ArrayList();
        ((ArrayList) term19552).add((Object)null);
        ((ArrayList) term19552).add((Object)null);
        ((ArrayList) term19552).add((Object)null);
        ((ArrayList) term19552).add((Object)null);
        Object term19547 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term19547, term19547.getClass(), "traitId", "");
        setField(term19547, term19547.getClass(), "traitName", "");
        setField(term19547, term19547.getClass(), "description", "");
        setField(term19547, term19547.getClass(), "group", "");
        setField(term19547, term19547.getClass(), "conflictsWithIds", term19552);
        setByteField(term19547, term19547.getClass(), "traitPoints", (byte) 12);
        ArrayList term19561 = new ArrayList();
        ((ArrayList) term19561).add((Object)null);
        Object term19556 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term19556, term19556.getClass(), "traitId", "");
        setField(term19556, term19556.getClass(), "traitName", "");
        setField(term19556, term19556.getClass(), "description", "");
        setField(term19556, term19556.getClass(), "group", "");
        setField(term19556, term19556.getClass(), "conflictsWithIds", term19561);
        setByteField(term19556, term19556.getClass(), "traitPoints", (byte) -75);
        ArrayList term19570 = new ArrayList();
        ((ArrayList) term19570).add((Object)null);
        ((ArrayList) term19570).add((Object)null);
        ((ArrayList) term19570).add((Object)null);
        ((ArrayList) term19570).add((Object)null);
        ((ArrayList) term19570).add((Object)null);
        Object term19565 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term19565, term19565.getClass(), "traitId", "");
        setField(term19565, term19565.getClass(), "traitName", "");
        setField(term19565, term19565.getClass(), "description", "");
        setField(term19565, term19565.getClass(), "group", "");
        setField(term19565, term19565.getClass(), "conflictsWithIds", term19570);
        setByteField(term19565, term19565.getClass(), "traitPoints", (byte) 69);
        ArrayList term19579 = new ArrayList();
        ((ArrayList) term19579).add((Object)null);
        ((ArrayList) term19579).add((Object)null);
        ((ArrayList) term19579).add((Object)null);
        Object term19574 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term19574, term19574.getClass(), "traitId", "");
        setField(term19574, term19574.getClass(), "traitName", "");
        setField(term19574, term19574.getClass(), "description", "");
        setField(term19574, term19574.getClass(), "group", "");
        setField(term19574, term19574.getClass(), "conflictsWithIds", term19579);
        setByteField(term19574, term19574.getClass(), "traitPoints", (byte) -6);
        ArrayList term19527 = new ArrayList();
        ((ArrayList) term19527).add(term19529);
        ((ArrayList) term19527).add(term19538);
        ((ArrayList) term19527).add(term19547);
        ((ArrayList) term19527).add(term19556);
        ((ArrayList) term19527).add(term19565);
        ((ArrayList) term19527).add(term19574);
        term19462 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term19462, term19462.getClass(), "id", "PECfBejlfo");
        setField(term19462, term19462.getClass(), "name", "SDbDgydVpg");
        setField(term19462, term19462.getClass(), "rulerSelection", enum39);
        setField(term19462, term19462.getClass(), "rulerTitleMale", "EEMaiNkiOH");
        setField(term19462, term19462.getClass(), "rulerTitleFemale", "sFdmTylvqh");
        setField(term19462, term19462.getClass(), "traits", term19527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.Government");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAggressive", argTypes, term19462, args);
    }

};


