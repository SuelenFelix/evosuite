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

public class Government_toString_3386958422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15279;

    public Government_toString_3386958422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15416 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term15415 = ((Class) term15416).getDeclaredField((String) "ELECTION_TYPE1");
        ((Field) term15415).setAccessible(true);
        Object enum30 = ((Field) term15415).get((Object) null);
        ArrayList term15353 = new ArrayList();
        ((ArrayList) term15353).add((Object)null);
        ((ArrayList) term15353).add((Object)null);
        ((ArrayList) term15353).add((Object)null);
        Object term15348 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term15348, term15348.getClass(), "traitId", "");
        setField(term15348, term15348.getClass(), "traitName", "");
        setField(term15348, term15348.getClass(), "description", "");
        setField(term15348, term15348.getClass(), "group", "");
        setField(term15348, term15348.getClass(), "conflictsWithIds", term15353);
        setByteField(term15348, term15348.getClass(), "traitPoints", (byte) -2);
        ArrayList term15362 = new ArrayList();
        Object term15357 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term15357, term15357.getClass(), "traitId", "");
        setField(term15357, term15357.getClass(), "traitName", "");
        setField(term15357, term15357.getClass(), "description", "");
        setField(term15357, term15357.getClass(), "group", "");
        setField(term15357, term15357.getClass(), "conflictsWithIds", term15362);
        setByteField(term15357, term15357.getClass(), "traitPoints", (byte) 28);
        ArrayList term15371 = new ArrayList();
        ((ArrayList) term15371).add((Object)null);
        Object term15366 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term15366, term15366.getClass(), "traitId", "");
        setField(term15366, term15366.getClass(), "traitName", "");
        setField(term15366, term15366.getClass(), "description", "");
        setField(term15366, term15366.getClass(), "group", "");
        setField(term15366, term15366.getClass(), "conflictsWithIds", term15371);
        setByteField(term15366, term15366.getClass(), "traitPoints", (byte) 84);
        ArrayList term15380 = new ArrayList();
        ((ArrayList) term15380).add((Object)null);
        ((ArrayList) term15380).add((Object)null);
        ((ArrayList) term15380).add((Object)null);
        Object term15375 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term15375, term15375.getClass(), "traitId", "");
        setField(term15375, term15375.getClass(), "traitName", "");
        setField(term15375, term15375.getClass(), "description", "");
        setField(term15375, term15375.getClass(), "group", "");
        setField(term15375, term15375.getClass(), "conflictsWithIds", term15380);
        setByteField(term15375, term15375.getClass(), "traitPoints", (byte) 85);
        ArrayList term15389 = new ArrayList();
        ((ArrayList) term15389).add((Object)null);
        ((ArrayList) term15389).add((Object)null);
        ((ArrayList) term15389).add((Object)null);
        ((ArrayList) term15389).add((Object)null);
        Object term15384 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term15384, term15384.getClass(), "traitId", "");
        setField(term15384, term15384.getClass(), "traitName", "");
        setField(term15384, term15384.getClass(), "description", "");
        setField(term15384, term15384.getClass(), "group", "");
        setField(term15384, term15384.getClass(), "conflictsWithIds", term15389);
        setByteField(term15384, term15384.getClass(), "traitPoints", (byte) -17);
        ArrayList term15346 = new ArrayList();
        ((ArrayList) term15346).add(term15348);
        ((ArrayList) term15346).add(term15357);
        ((ArrayList) term15346).add(term15366);
        ((ArrayList) term15346).add(term15375);
        ((ArrayList) term15346).add(term15384);
        term15279 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term15279, term15279.getClass(), "id", "CLsbWobdgS");
        setField(term15279, term15279.getClass(), "name", "TbYrjEyFPc");
        setField(term15279, term15279.getClass(), "rulerSelection", enum30);
        setField(term15279, term15279.getClass(), "rulerTitleMale", "muefchpJiZ");
        setField(term15279, term15279.getClass(), "rulerTitleFemale", "tuYaAqvYrh");
        setField(term15279, term15279.getClass(), "traits", term15346);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.Government");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term15279, args);
    }

};


