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

public class Government_getMiningBonus_168029210413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11161;

    public Government_getMiningBonus_168029210413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11335 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term11334 = ((Class) term11335).getDeclaredField((String) "HEGEMONIA_RULER");
        ((Field) term11334).setAccessible(true);
        Object enum21 = ((Field) term11334).get((Object) null);
        ArrayList term11236 = new ArrayList();
        ((ArrayList) term11236).add((Object)null);
        ((ArrayList) term11236).add((Object)null);
        ((ArrayList) term11236).add((Object)null);
        ((ArrayList) term11236).add((Object)null);
        ((ArrayList) term11236).add((Object)null);
        ((ArrayList) term11236).add((Object)null);
        Object term11231 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term11231, term11231.getClass(), "traitId", "");
        setField(term11231, term11231.getClass(), "traitName", "");
        setField(term11231, term11231.getClass(), "description", "");
        setField(term11231, term11231.getClass(), "group", "");
        setField(term11231, term11231.getClass(), "conflictsWithIds", term11236);
        setByteField(term11231, term11231.getClass(), "traitPoints", (byte) 45);
        ArrayList term11245 = new ArrayList();
        ((ArrayList) term11245).add((Object)null);
        ((ArrayList) term11245).add((Object)null);
        ((ArrayList) term11245).add((Object)null);
        ((ArrayList) term11245).add((Object)null);
        ((ArrayList) term11245).add((Object)null);
        ((ArrayList) term11245).add((Object)null);
        ((ArrayList) term11245).add((Object)null);
        Object term11240 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term11240, term11240.getClass(), "traitId", "");
        setField(term11240, term11240.getClass(), "traitName", "");
        setField(term11240, term11240.getClass(), "description", "");
        setField(term11240, term11240.getClass(), "group", "");
        setField(term11240, term11240.getClass(), "conflictsWithIds", term11245);
        setByteField(term11240, term11240.getClass(), "traitPoints", (byte) -39);
        ArrayList term11254 = new ArrayList();
        ((ArrayList) term11254).add((Object)null);
        ((ArrayList) term11254).add((Object)null);
        ((ArrayList) term11254).add((Object)null);
        ((ArrayList) term11254).add((Object)null);
        ((ArrayList) term11254).add((Object)null);
        ((ArrayList) term11254).add((Object)null);
        ((ArrayList) term11254).add((Object)null);
        Object term11249 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term11249, term11249.getClass(), "traitId", "");
        setField(term11249, term11249.getClass(), "traitName", "");
        setField(term11249, term11249.getClass(), "description", "");
        setField(term11249, term11249.getClass(), "group", "");
        setField(term11249, term11249.getClass(), "conflictsWithIds", term11254);
        setByteField(term11249, term11249.getClass(), "traitPoints", (byte) -20);
        ArrayList term11263 = new ArrayList();
        ((ArrayList) term11263).add((Object)null);
        ((ArrayList) term11263).add((Object)null);
        ((ArrayList) term11263).add((Object)null);
        Object term11258 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term11258, term11258.getClass(), "traitId", "");
        setField(term11258, term11258.getClass(), "traitName", "");
        setField(term11258, term11258.getClass(), "description", "");
        setField(term11258, term11258.getClass(), "group", "");
        setField(term11258, term11258.getClass(), "conflictsWithIds", term11263);
        setByteField(term11258, term11258.getClass(), "traitPoints", (byte) 10);
        ArrayList term11272 = new ArrayList();
        ((ArrayList) term11272).add((Object)null);
        ((ArrayList) term11272).add((Object)null);
        ((ArrayList) term11272).add((Object)null);
        ((ArrayList) term11272).add((Object)null);
        ((ArrayList) term11272).add((Object)null);
        ((ArrayList) term11272).add((Object)null);
        ((ArrayList) term11272).add((Object)null);
        Object term11267 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term11267, term11267.getClass(), "traitId", "");
        setField(term11267, term11267.getClass(), "traitName", "");
        setField(term11267, term11267.getClass(), "description", "");
        setField(term11267, term11267.getClass(), "group", "");
        setField(term11267, term11267.getClass(), "conflictsWithIds", term11272);
        setByteField(term11267, term11267.getClass(), "traitPoints", (byte) 77);
        ArrayList term11281 = new ArrayList();
        ((ArrayList) term11281).add((Object)null);
        ((ArrayList) term11281).add((Object)null);
        ((ArrayList) term11281).add((Object)null);
        ((ArrayList) term11281).add((Object)null);
        ((ArrayList) term11281).add((Object)null);
        ((ArrayList) term11281).add((Object)null);
        ((ArrayList) term11281).add((Object)null);
        ((ArrayList) term11281).add((Object)null);
        Object term11276 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term11276, term11276.getClass(), "traitId", "");
        setField(term11276, term11276.getClass(), "traitName", "");
        setField(term11276, term11276.getClass(), "description", "");
        setField(term11276, term11276.getClass(), "group", "");
        setField(term11276, term11276.getClass(), "conflictsWithIds", term11281);
        setByteField(term11276, term11276.getClass(), "traitPoints", (byte) 14);
        ArrayList term11290 = new ArrayList();
        ((ArrayList) term11290).add((Object)null);
        ((ArrayList) term11290).add((Object)null);
        ((ArrayList) term11290).add((Object)null);
        ((ArrayList) term11290).add((Object)null);
        ((ArrayList) term11290).add((Object)null);
        Object term11285 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term11285, term11285.getClass(), "traitId", "");
        setField(term11285, term11285.getClass(), "traitName", "");
        setField(term11285, term11285.getClass(), "description", "");
        setField(term11285, term11285.getClass(), "group", "");
        setField(term11285, term11285.getClass(), "conflictsWithIds", term11290);
        setByteField(term11285, term11285.getClass(), "traitPoints", (byte) -101);
        ArrayList term11299 = new ArrayList();
        ((ArrayList) term11299).add((Object)null);
        ((ArrayList) term11299).add((Object)null);
        ((ArrayList) term11299).add((Object)null);
        ((ArrayList) term11299).add((Object)null);
        ((ArrayList) term11299).add((Object)null);
        ((ArrayList) term11299).add((Object)null);
        ((ArrayList) term11299).add((Object)null);
        ((ArrayList) term11299).add((Object)null);
        ((ArrayList) term11299).add((Object)null);
        Object term11294 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term11294, term11294.getClass(), "traitId", "");
        setField(term11294, term11294.getClass(), "traitName", "");
        setField(term11294, term11294.getClass(), "description", "");
        setField(term11294, term11294.getClass(), "group", "");
        setField(term11294, term11294.getClass(), "conflictsWithIds", term11299);
        setByteField(term11294, term11294.getClass(), "traitPoints", (byte) 35);
        ArrayList term11308 = new ArrayList();
        ((ArrayList) term11308).add((Object)null);
        ((ArrayList) term11308).add((Object)null);
        ((ArrayList) term11308).add((Object)null);
        ((ArrayList) term11308).add((Object)null);
        ((ArrayList) term11308).add((Object)null);
        ((ArrayList) term11308).add((Object)null);
        ((ArrayList) term11308).add((Object)null);
        Object term11303 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term11303, term11303.getClass(), "traitId", "");
        setField(term11303, term11303.getClass(), "traitName", "");
        setField(term11303, term11303.getClass(), "description", "");
        setField(term11303, term11303.getClass(), "group", "");
        setField(term11303, term11303.getClass(), "conflictsWithIds", term11308);
        setByteField(term11303, term11303.getClass(), "traitPoints", (byte) 66);
        ArrayList term11229 = new ArrayList();
        ((ArrayList) term11229).add(term11231);
        ((ArrayList) term11229).add(term11240);
        ((ArrayList) term11229).add(term11249);
        ((ArrayList) term11229).add(term11258);
        ((ArrayList) term11229).add(term11267);
        ((ArrayList) term11229).add(term11276);
        ((ArrayList) term11229).add(term11285);
        ((ArrayList) term11229).add(term11294);
        ((ArrayList) term11229).add(term11303);
        term11161 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term11161, term11161.getClass(), "id", "GTmoNrziyc");
        setField(term11161, term11161.getClass(), "name", "LvztehSlhM");
        setField(term11161, term11161.getClass(), "rulerSelection", enum21);
        setField(term11161, term11161.getClass(), "rulerTitleMale", "njvnWFTMxN");
        setField(term11161, term11161.getClass(), "rulerTitleFemale", "fLRqcTSfzF");
        setField(term11161, term11161.getClass(), "traits", term11229);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.Government");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMiningBonus", argTypes, term11161, args);
    }

};


