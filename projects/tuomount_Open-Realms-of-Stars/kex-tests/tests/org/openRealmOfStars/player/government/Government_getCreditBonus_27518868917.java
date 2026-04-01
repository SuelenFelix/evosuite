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

public class Government_getCreditBonus_27518868917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13021;

    public Government_getCreditBonus_27518868917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13141 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term13140 = ((Class) term13141).getDeclaredField((String) "HEGEMONIA_RULER");
        ((Field) term13140).setAccessible(true);
        Object enum25 = ((Field) term13140).get((Object) null);
        ArrayList term13096 = new ArrayList();
        ((ArrayList) term13096).add((Object)null);
        ((ArrayList) term13096).add((Object)null);
        ((ArrayList) term13096).add((Object)null);
        ((ArrayList) term13096).add((Object)null);
        ((ArrayList) term13096).add((Object)null);
        ((ArrayList) term13096).add((Object)null);
        ((ArrayList) term13096).add((Object)null);
        Object term13091 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term13091, term13091.getClass(), "traitId", "");
        setField(term13091, term13091.getClass(), "traitName", "");
        setField(term13091, term13091.getClass(), "description", "");
        setField(term13091, term13091.getClass(), "group", "");
        setField(term13091, term13091.getClass(), "conflictsWithIds", term13096);
        setByteField(term13091, term13091.getClass(), "traitPoints", (byte) 66);
        ArrayList term13105 = new ArrayList();
        ((ArrayList) term13105).add((Object)null);
        Object term13100 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term13100, term13100.getClass(), "traitId", "");
        setField(term13100, term13100.getClass(), "traitName", "");
        setField(term13100, term13100.getClass(), "description", "");
        setField(term13100, term13100.getClass(), "group", "");
        setField(term13100, term13100.getClass(), "conflictsWithIds", term13105);
        setByteField(term13100, term13100.getClass(), "traitPoints", (byte) -112);
        ArrayList term13114 = new ArrayList();
        ((ArrayList) term13114).add((Object)null);
        ((ArrayList) term13114).add((Object)null);
        ((ArrayList) term13114).add((Object)null);
        ((ArrayList) term13114).add((Object)null);
        ((ArrayList) term13114).add((Object)null);
        ((ArrayList) term13114).add((Object)null);
        Object term13109 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term13109, term13109.getClass(), "traitId", "");
        setField(term13109, term13109.getClass(), "traitName", "");
        setField(term13109, term13109.getClass(), "description", "");
        setField(term13109, term13109.getClass(), "group", "");
        setField(term13109, term13109.getClass(), "conflictsWithIds", term13114);
        setByteField(term13109, term13109.getClass(), "traitPoints", (byte) 81);
        ArrayList term13089 = new ArrayList();
        ((ArrayList) term13089).add(term13091);
        ((ArrayList) term13089).add(term13100);
        ((ArrayList) term13089).add(term13109);
        term13021 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term13021, term13021.getClass(), "id", "gwTUlYNpjM");
        setField(term13021, term13021.getClass(), "name", "uXYojRmxrM");
        setField(term13021, term13021.getClass(), "rulerSelection", enum25);
        setField(term13021, term13021.getClass(), "rulerTitleMale", "cxRwRcodud");
        setField(term13021, term13021.getClass(), "rulerTitleFemale", "GDGBPlYeLn");
        setField(term13021, term13021.getClass(), "traits", term13089);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.Government");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreditBonus", argTypes, term13021, args);
    }

};


