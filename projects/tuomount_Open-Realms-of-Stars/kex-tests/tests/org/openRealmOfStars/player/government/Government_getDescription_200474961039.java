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
import java.lang.Boolean;

public class Government_getDescription_200474961039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23235;
     Object term23327;
     Object term23329;

    public Government_getDescription_200474961039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23352 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term23351 = ((Class) term23352).getDeclaredField((String) "AI_RULER");
        ((Field) term23351).setAccessible(true);
        Object enum47 = ((Field) term23351).get((Object) null);
        ArrayList term23303 = new ArrayList();
        ((ArrayList) term23303).add((Object)null);
        ((ArrayList) term23303).add((Object)null);
        ((ArrayList) term23303).add((Object)null);
        ((ArrayList) term23303).add((Object)null);
        ((ArrayList) term23303).add((Object)null);
        Object term23298 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term23298, term23298.getClass(), "traitId", "");
        setField(term23298, term23298.getClass(), "traitName", "");
        setField(term23298, term23298.getClass(), "description", "");
        setField(term23298, term23298.getClass(), "group", "");
        setField(term23298, term23298.getClass(), "conflictsWithIds", term23303);
        setByteField(term23298, term23298.getClass(), "traitPoints", (byte) -27);
        ArrayList term23312 = new ArrayList();
        ((ArrayList) term23312).add((Object)null);
        ((ArrayList) term23312).add((Object)null);
        Object term23307 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term23307, term23307.getClass(), "traitId", "");
        setField(term23307, term23307.getClass(), "traitName", "");
        setField(term23307, term23307.getClass(), "description", "");
        setField(term23307, term23307.getClass(), "group", "");
        setField(term23307, term23307.getClass(), "conflictsWithIds", term23312);
        setByteField(term23307, term23307.getClass(), "traitPoints", (byte) 120);
        ArrayList term23321 = new ArrayList();
        ((ArrayList) term23321).add((Object)null);
        ((ArrayList) term23321).add((Object)null);
        ((ArrayList) term23321).add((Object)null);
        ((ArrayList) term23321).add((Object)null);
        ((ArrayList) term23321).add((Object)null);
        Object term23316 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term23316, term23316.getClass(), "traitId", "");
        setField(term23316, term23316.getClass(), "traitName", "");
        setField(term23316, term23316.getClass(), "description", "");
        setField(term23316, term23316.getClass(), "group", "");
        setField(term23316, term23316.getClass(), "conflictsWithIds", term23321);
        setByteField(term23316, term23316.getClass(), "traitPoints", (byte) -25);
        ArrayList term23296 = new ArrayList();
        ((ArrayList) term23296).add(term23298);
        ((ArrayList) term23296).add(term23307);
        ((ArrayList) term23296).add(term23316);
        term23235 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term23235, term23235.getClass(), "id", "byyepwHlHN");
        setField(term23235, term23235.getClass(), "name", "akVNsUcFra");
        setField(term23235, term23235.getClass(), "rulerSelection", enum47);
        setField(term23235, term23235.getClass(), "rulerTitleMale", "BKiHMTzLoY");
        setField(term23235, term23235.getClass(), "rulerTitleFemale", "arrHHpXCBD");
        setField(term23235, term23235.getClass(), "traits", term23296);
        term23327 = new Boolean(false);
        term23329 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.Government");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term23327;
        args[1] = term23329;
        callMethod(klass, "getDescription", argTypes, term23235, args);
    }

};


