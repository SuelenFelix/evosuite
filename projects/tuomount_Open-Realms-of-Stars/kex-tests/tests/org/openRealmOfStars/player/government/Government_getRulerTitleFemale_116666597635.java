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

public class Government_getRulerTitleFemale_116666597635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21357;

    public Government_getRulerTitleFemale_116666597635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21512 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term21511 = ((Class) term21512).getDeclaredField((String) "HEIR_TO_THRONE");
        ((Field) term21511).setAccessible(true);
        Object enum43 = ((Field) term21511).get((Object) null);
        ArrayList term21431 = new ArrayList();
        ((ArrayList) term21431).add((Object)null);
        ((ArrayList) term21431).add((Object)null);
        ((ArrayList) term21431).add((Object)null);
        ((ArrayList) term21431).add((Object)null);
        ((ArrayList) term21431).add((Object)null);
        ((ArrayList) term21431).add((Object)null);
        ((ArrayList) term21431).add((Object)null);
        Object term21426 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term21426, term21426.getClass(), "traitId", "");
        setField(term21426, term21426.getClass(), "traitName", "");
        setField(term21426, term21426.getClass(), "description", "");
        setField(term21426, term21426.getClass(), "group", "");
        setField(term21426, term21426.getClass(), "conflictsWithIds", term21431);
        setByteField(term21426, term21426.getClass(), "traitPoints", (byte) -121);
        ArrayList term21440 = new ArrayList();
        ((ArrayList) term21440).add((Object)null);
        ((ArrayList) term21440).add((Object)null);
        ((ArrayList) term21440).add((Object)null);
        ((ArrayList) term21440).add((Object)null);
        ((ArrayList) term21440).add((Object)null);
        Object term21435 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term21435, term21435.getClass(), "traitId", "");
        setField(term21435, term21435.getClass(), "traitName", "");
        setField(term21435, term21435.getClass(), "description", "");
        setField(term21435, term21435.getClass(), "group", "");
        setField(term21435, term21435.getClass(), "conflictsWithIds", term21440);
        setByteField(term21435, term21435.getClass(), "traitPoints", (byte) -50);
        ArrayList term21449 = new ArrayList();
        ((ArrayList) term21449).add((Object)null);
        ((ArrayList) term21449).add((Object)null);
        ((ArrayList) term21449).add((Object)null);
        ((ArrayList) term21449).add((Object)null);
        ((ArrayList) term21449).add((Object)null);
        ((ArrayList) term21449).add((Object)null);
        ((ArrayList) term21449).add((Object)null);
        ((ArrayList) term21449).add((Object)null);
        Object term21444 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term21444, term21444.getClass(), "traitId", "");
        setField(term21444, term21444.getClass(), "traitName", "");
        setField(term21444, term21444.getClass(), "description", "");
        setField(term21444, term21444.getClass(), "group", "");
        setField(term21444, term21444.getClass(), "conflictsWithIds", term21449);
        setByteField(term21444, term21444.getClass(), "traitPoints", (byte) -79);
        ArrayList term21458 = new ArrayList();
        ((ArrayList) term21458).add((Object)null);
        ((ArrayList) term21458).add((Object)null);
        ((ArrayList) term21458).add((Object)null);
        ((ArrayList) term21458).add((Object)null);
        ((ArrayList) term21458).add((Object)null);
        ((ArrayList) term21458).add((Object)null);
        ((ArrayList) term21458).add((Object)null);
        Object term21453 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term21453, term21453.getClass(), "traitId", "");
        setField(term21453, term21453.getClass(), "traitName", "");
        setField(term21453, term21453.getClass(), "description", "");
        setField(term21453, term21453.getClass(), "group", "");
        setField(term21453, term21453.getClass(), "conflictsWithIds", term21458);
        setByteField(term21453, term21453.getClass(), "traitPoints", (byte) 110);
        ArrayList term21467 = new ArrayList();
        ((ArrayList) term21467).add((Object)null);
        ((ArrayList) term21467).add((Object)null);
        ((ArrayList) term21467).add((Object)null);
        ((ArrayList) term21467).add((Object)null);
        ((ArrayList) term21467).add((Object)null);
        ((ArrayList) term21467).add((Object)null);
        ((ArrayList) term21467).add((Object)null);
        ((ArrayList) term21467).add((Object)null);
        Object term21462 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term21462, term21462.getClass(), "traitId", "");
        setField(term21462, term21462.getClass(), "traitName", "");
        setField(term21462, term21462.getClass(), "description", "");
        setField(term21462, term21462.getClass(), "group", "");
        setField(term21462, term21462.getClass(), "conflictsWithIds", term21467);
        setByteField(term21462, term21462.getClass(), "traitPoints", (byte) -111);
        ArrayList term21476 = new ArrayList();
        ((ArrayList) term21476).add((Object)null);
        ((ArrayList) term21476).add((Object)null);
        ((ArrayList) term21476).add((Object)null);
        Object term21471 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term21471, term21471.getClass(), "traitId", "");
        setField(term21471, term21471.getClass(), "traitName", "");
        setField(term21471, term21471.getClass(), "description", "");
        setField(term21471, term21471.getClass(), "group", "");
        setField(term21471, term21471.getClass(), "conflictsWithIds", term21476);
        setByteField(term21471, term21471.getClass(), "traitPoints", (byte) -54);
        ArrayList term21485 = new ArrayList();
        ((ArrayList) term21485).add((Object)null);
        ((ArrayList) term21485).add((Object)null);
        Object term21480 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term21480, term21480.getClass(), "traitId", "");
        setField(term21480, term21480.getClass(), "traitName", "");
        setField(term21480, term21480.getClass(), "description", "");
        setField(term21480, term21480.getClass(), "group", "");
        setField(term21480, term21480.getClass(), "conflictsWithIds", term21485);
        setByteField(term21480, term21480.getClass(), "traitPoints", (byte) -25);
        ArrayList term21424 = new ArrayList();
        ((ArrayList) term21424).add(term21426);
        ((ArrayList) term21424).add(term21435);
        ((ArrayList) term21424).add(term21444);
        ((ArrayList) term21424).add(term21453);
        ((ArrayList) term21424).add(term21462);
        ((ArrayList) term21424).add(term21471);
        ((ArrayList) term21424).add(term21480);
        term21357 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term21357, term21357.getClass(), "id", "ZBLFNFVEHD");
        setField(term21357, term21357.getClass(), "name", "miNxpUfOyL");
        setField(term21357, term21357.getClass(), "rulerSelection", enum43);
        setField(term21357, term21357.getClass(), "rulerTitleMale", "BAPTojeHRU");
        setField(term21357, term21357.getClass(), "rulerTitleFemale", "uqDEIRoVVf");
        setField(term21357, term21357.getClass(), "traits", term21424);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.Government");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRulerTitleFemale", argTypes, term21357, args);
    }

};


