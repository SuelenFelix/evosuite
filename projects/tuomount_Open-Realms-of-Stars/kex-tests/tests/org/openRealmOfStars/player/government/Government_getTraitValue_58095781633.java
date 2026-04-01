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

public class Government_getTraitValue_58095781633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20386;

    public Government_getTraitValue_58095781633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20560 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term20559 = ((Class) term20560).getDeclaredField((String) "HEGEMONIA_RULER");
        ((Field) term20559).setAccessible(true);
        Object enum41 = ((Field) term20559).get((Object) null);
        ArrayList term20461 = new ArrayList();
        ((ArrayList) term20461).add((Object)null);
        ((ArrayList) term20461).add((Object)null);
        Object term20456 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term20456, term20456.getClass(), "traitId", "");
        setField(term20456, term20456.getClass(), "traitName", "");
        setField(term20456, term20456.getClass(), "description", "");
        setField(term20456, term20456.getClass(), "group", "");
        setField(term20456, term20456.getClass(), "conflictsWithIds", term20461);
        setByteField(term20456, term20456.getClass(), "traitPoints", (byte) -123);
        ArrayList term20470 = new ArrayList();
        ((ArrayList) term20470).add((Object)null);
        ((ArrayList) term20470).add((Object)null);
        ((ArrayList) term20470).add((Object)null);
        ((ArrayList) term20470).add((Object)null);
        ((ArrayList) term20470).add((Object)null);
        Object term20465 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term20465, term20465.getClass(), "traitId", "");
        setField(term20465, term20465.getClass(), "traitName", "");
        setField(term20465, term20465.getClass(), "description", "");
        setField(term20465, term20465.getClass(), "group", "");
        setField(term20465, term20465.getClass(), "conflictsWithIds", term20470);
        setByteField(term20465, term20465.getClass(), "traitPoints", (byte) -76);
        ArrayList term20479 = new ArrayList();
        ((ArrayList) term20479).add((Object)null);
        ((ArrayList) term20479).add((Object)null);
        ((ArrayList) term20479).add((Object)null);
        ((ArrayList) term20479).add((Object)null);
        ((ArrayList) term20479).add((Object)null);
        ((ArrayList) term20479).add((Object)null);
        ((ArrayList) term20479).add((Object)null);
        ((ArrayList) term20479).add((Object)null);
        ((ArrayList) term20479).add((Object)null);
        Object term20474 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term20474, term20474.getClass(), "traitId", "");
        setField(term20474, term20474.getClass(), "traitName", "");
        setField(term20474, term20474.getClass(), "description", "");
        setField(term20474, term20474.getClass(), "group", "");
        setField(term20474, term20474.getClass(), "conflictsWithIds", term20479);
        setByteField(term20474, term20474.getClass(), "traitPoints", (byte) -115);
        ArrayList term20488 = new ArrayList();
        ((ArrayList) term20488).add((Object)null);
        ((ArrayList) term20488).add((Object)null);
        Object term20483 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term20483, term20483.getClass(), "traitId", "");
        setField(term20483, term20483.getClass(), "traitName", "");
        setField(term20483, term20483.getClass(), "description", "");
        setField(term20483, term20483.getClass(), "group", "");
        setField(term20483, term20483.getClass(), "conflictsWithIds", term20488);
        setByteField(term20483, term20483.getClass(), "traitPoints", (byte) -48);
        ArrayList term20497 = new ArrayList();
        ((ArrayList) term20497).add((Object)null);
        ((ArrayList) term20497).add((Object)null);
        ((ArrayList) term20497).add((Object)null);
        ((ArrayList) term20497).add((Object)null);
        ((ArrayList) term20497).add((Object)null);
        ((ArrayList) term20497).add((Object)null);
        ((ArrayList) term20497).add((Object)null);
        Object term20492 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term20492, term20492.getClass(), "traitId", "");
        setField(term20492, term20492.getClass(), "traitName", "");
        setField(term20492, term20492.getClass(), "description", "");
        setField(term20492, term20492.getClass(), "group", "");
        setField(term20492, term20492.getClass(), "conflictsWithIds", term20497);
        setByteField(term20492, term20492.getClass(), "traitPoints", (byte) 126);
        ArrayList term20506 = new ArrayList();
        ((ArrayList) term20506).add((Object)null);
        ((ArrayList) term20506).add((Object)null);
        ((ArrayList) term20506).add((Object)null);
        Object term20501 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term20501, term20501.getClass(), "traitId", "");
        setField(term20501, term20501.getClass(), "traitName", "");
        setField(term20501, term20501.getClass(), "description", "");
        setField(term20501, term20501.getClass(), "group", "");
        setField(term20501, term20501.getClass(), "conflictsWithIds", term20506);
        setByteField(term20501, term20501.getClass(), "traitPoints", (byte) -2);
        ArrayList term20515 = new ArrayList();
        ((ArrayList) term20515).add((Object)null);
        ((ArrayList) term20515).add((Object)null);
        ((ArrayList) term20515).add((Object)null);
        ((ArrayList) term20515).add((Object)null);
        ((ArrayList) term20515).add((Object)null);
        ((ArrayList) term20515).add((Object)null);
        ((ArrayList) term20515).add((Object)null);
        Object term20510 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term20510, term20510.getClass(), "traitId", "");
        setField(term20510, term20510.getClass(), "traitName", "");
        setField(term20510, term20510.getClass(), "description", "");
        setField(term20510, term20510.getClass(), "group", "");
        setField(term20510, term20510.getClass(), "conflictsWithIds", term20515);
        setByteField(term20510, term20510.getClass(), "traitPoints", (byte) 103);
        ArrayList term20524 = new ArrayList();
        ((ArrayList) term20524).add((Object)null);
        ((ArrayList) term20524).add((Object)null);
        ((ArrayList) term20524).add((Object)null);
        ((ArrayList) term20524).add((Object)null);
        ((ArrayList) term20524).add((Object)null);
        ((ArrayList) term20524).add((Object)null);
        ((ArrayList) term20524).add((Object)null);
        ((ArrayList) term20524).add((Object)null);
        Object term20519 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term20519, term20519.getClass(), "traitId", "");
        setField(term20519, term20519.getClass(), "traitName", "");
        setField(term20519, term20519.getClass(), "description", "");
        setField(term20519, term20519.getClass(), "group", "");
        setField(term20519, term20519.getClass(), "conflictsWithIds", term20524);
        setByteField(term20519, term20519.getClass(), "traitPoints", (byte) 23);
        ArrayList term20533 = new ArrayList();
        ((ArrayList) term20533).add((Object)null);
        ((ArrayList) term20533).add((Object)null);
        Object term20528 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term20528, term20528.getClass(), "traitId", "");
        setField(term20528, term20528.getClass(), "traitName", "");
        setField(term20528, term20528.getClass(), "description", "");
        setField(term20528, term20528.getClass(), "group", "");
        setField(term20528, term20528.getClass(), "conflictsWithIds", term20533);
        setByteField(term20528, term20528.getClass(), "traitPoints", (byte) 96);
        ArrayList term20454 = new ArrayList();
        ((ArrayList) term20454).add(term20456);
        ((ArrayList) term20454).add(term20465);
        ((ArrayList) term20454).add(term20474);
        ((ArrayList) term20454).add(term20483);
        ((ArrayList) term20454).add(term20492);
        ((ArrayList) term20454).add(term20501);
        ((ArrayList) term20454).add(term20510);
        ((ArrayList) term20454).add(term20519);
        ((ArrayList) term20454).add(term20528);
        term20386 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term20386, term20386.getClass(), "id", "oShLCaneoQ");
        setField(term20386, term20386.getClass(), "name", "nwKkzNpzyC");
        setField(term20386, term20386.getClass(), "rulerSelection", enum41);
        setField(term20386, term20386.getClass(), "rulerTitleMale", "CwrsdYnHpH");
        setField(term20386, term20386.getClass(), "rulerTitleFemale", "jifjXNXluS");
        setField(term20386, term20386.getClass(), "traits", term20454);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.Government");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTraitValue", argTypes, term20386, args);
    }

};


