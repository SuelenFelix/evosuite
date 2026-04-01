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

public class Government_getResearchBonus_179965767714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11671;

    public Government_getResearchBonus_179965767714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11793 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term11792 = ((Class) term11793).getDeclaredField((String) "AI_RULER");
        ((Field) term11792).setAccessible(true);
        Object enum22 = ((Field) term11792).get((Object) null);
        ArrayList term11739 = new ArrayList();
        ((ArrayList) term11739).add((Object)null);
        ((ArrayList) term11739).add((Object)null);
        Object term11734 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term11734, term11734.getClass(), "traitId", "");
        setField(term11734, term11734.getClass(), "traitName", "");
        setField(term11734, term11734.getClass(), "description", "");
        setField(term11734, term11734.getClass(), "group", "");
        setField(term11734, term11734.getClass(), "conflictsWithIds", term11739);
        setByteField(term11734, term11734.getClass(), "traitPoints", (byte) 123);
        ArrayList term11748 = new ArrayList();
        ((ArrayList) term11748).add((Object)null);
        ((ArrayList) term11748).add((Object)null);
        Object term11743 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term11743, term11743.getClass(), "traitId", "");
        setField(term11743, term11743.getClass(), "traitName", "");
        setField(term11743, term11743.getClass(), "description", "");
        setField(term11743, term11743.getClass(), "group", "");
        setField(term11743, term11743.getClass(), "conflictsWithIds", term11748);
        setByteField(term11743, term11743.getClass(), "traitPoints", (byte) -5);
        ArrayList term11757 = new ArrayList();
        ((ArrayList) term11757).add((Object)null);
        ((ArrayList) term11757).add((Object)null);
        ((ArrayList) term11757).add((Object)null);
        ((ArrayList) term11757).add((Object)null);
        ((ArrayList) term11757).add((Object)null);
        Object term11752 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term11752, term11752.getClass(), "traitId", "");
        setField(term11752, term11752.getClass(), "traitName", "");
        setField(term11752, term11752.getClass(), "description", "");
        setField(term11752, term11752.getClass(), "group", "");
        setField(term11752, term11752.getClass(), "conflictsWithIds", term11757);
        setByteField(term11752, term11752.getClass(), "traitPoints", (byte) 84);
        ArrayList term11766 = new ArrayList();
        Object term11761 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term11761, term11761.getClass(), "traitId", "");
        setField(term11761, term11761.getClass(), "traitName", "");
        setField(term11761, term11761.getClass(), "description", "");
        setField(term11761, term11761.getClass(), "group", "");
        setField(term11761, term11761.getClass(), "conflictsWithIds", term11766);
        setByteField(term11761, term11761.getClass(), "traitPoints", (byte) -97);
        ArrayList term11732 = new ArrayList();
        ((ArrayList) term11732).add(term11734);
        ((ArrayList) term11732).add(term11743);
        ((ArrayList) term11732).add(term11752);
        ((ArrayList) term11732).add(term11761);
        term11671 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term11671, term11671.getClass(), "id", "ikTtOgdVYS");
        setField(term11671, term11671.getClass(), "name", "JptuwlirlS");
        setField(term11671, term11671.getClass(), "rulerSelection", enum22);
        setField(term11671, term11671.getClass(), "rulerTitleMale", "TKOMaGswbU");
        setField(term11671, term11671.getClass(), "rulerTitleFemale", "YcTbglHiUq");
        setField(term11671, term11671.getClass(), "traits", term11732);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.Government");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResearchBonus", argTypes, term11671, args);
    }

};


