package org.openRealmOfStars.player.tech;

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
import static org.openRealmOfStars.player.tech.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class TechList_getBestStarbaseCulture_70226667427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term306885;

    public TechList_getBestStarbaseCulture_70226667427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term306889 = new ArrayList();
        ((ArrayList) term306889).add((Object)null);
        ((ArrayList) term306889).add((Object)null);
        ArrayList term306894 = new ArrayList();
        ((ArrayList) term306894).add((Object)null);
        ((ArrayList) term306894).add((Object)null);
        ArrayList term306899 = new ArrayList();
        ((ArrayList) term306899).add((Object)null);
        ArrayList term306904 = new ArrayList();
        ((ArrayList) term306904).add((Object)null);
        ((ArrayList) term306904).add((Object)null);
        ArrayList term306909 = new ArrayList();
        ((ArrayList) term306909).add((Object)null);
        ((ArrayList) term306909).add((Object)null);
        ((ArrayList) term306909).add((Object)null);
        ((ArrayList) term306909).add((Object)null);
        ((ArrayList) term306909).add((Object)null);
        ((ArrayList) term306909).add((Object)null);
        ((ArrayList) term306909).add((Object)null);
        ((ArrayList) term306909).add((Object)null);
        ((ArrayList) term306909).add((Object)null);
        ArrayList term306914 = new ArrayList();
        ((ArrayList) term306914).add((Object)null);
        ((ArrayList) term306914).add((Object)null);
        ((ArrayList) term306914).add((Object)null);
        ((ArrayList) term306914).add((Object)null);
        ((ArrayList) term306914).add((Object)null);
        ((ArrayList) term306914).add((Object)null);
        ((ArrayList) term306914).add((Object)null);
        ((ArrayList) term306914).add((Object)null);
        ArrayList term306919 = new ArrayList();
        ((ArrayList) term306919).add((Object)null);
        ((ArrayList) term306919).add((Object)null);
        ((ArrayList) term306919).add((Object)null);
        ((ArrayList) term306919).add((Object)null);
        ArrayList term306924 = new ArrayList();
        ((ArrayList) term306924).add((Object)null);
        ((ArrayList) term306924).add((Object)null);
        ((ArrayList) term306924).add((Object)null);
        ((ArrayList) term306924).add((Object)null);
        ((ArrayList) term306924).add((Object)null);
        ((ArrayList) term306924).add((Object)null);
        ((ArrayList) term306924).add((Object)null);
        ((ArrayList) term306924).add((Object)null);
        Class<? extends Object> term307161 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term307160 = ((Class) term307161).getDeclaredField((String) "DIPLOMATIC");
        ((Field) term307160).setAccessible(true);
        Object enum939 = ((Field) term307160).get((Object) null);
        Class<? extends Object> term307458 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term307457 = ((Class) term307458).getDeclaredField((String) "PATRIARCHY");
        ((Field) term307457).setAccessible(true);
        Object enum940 = ((Field) term307457).get((Object) null);
        Class<? extends Object> term307720 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term307719 = ((Class) term307720).getDeclaredField((String) "MALE");
        ((Field) term307719).setAccessible(true);
        Object enum941 =  ((Field) term307719).get((Object) null);
        ArrayList term307036 = new ArrayList();
        ((ArrayList) term307036).add(enum941);
        Class<? extends Object> term307954 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term307953 = ((Class) term307954).getDeclaredField((String) "FLOAT_IN_SPACE");
        ((Field) term307953).setAccessible(true);
        Object enum942 = ((Field) term307953).get((Object) null);
        Object term307078 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term307078, term307078.getClass(), "traitId", null);
        setField(term307078, term307078.getClass(), "traitName", null);
        setField(term307078, term307078.getClass(), "description", null);
        setField(term307078, term307078.getClass(), "group", null);
        setField(term307078, term307078.getClass(), "conflictsWithIds", null);
        setByteField(term307078, term307078.getClass(), "traitPoints", (byte) -3);
        Object term307080 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term307080, term307080.getClass(), "traitId", null);
        setField(term307080, term307080.getClass(), "traitName", null);
        setField(term307080, term307080.getClass(), "description", null);
        setField(term307080, term307080.getClass(), "group", null);
        setField(term307080, term307080.getClass(), "conflictsWithIds", null);
        setByteField(term307080, term307080.getClass(), "traitPoints", (byte) 68);
        ArrayList term307076 = new ArrayList();
        ((ArrayList) term307076).add(term307078);
        ((ArrayList) term307076).add(term307080);
        Class<? extends Object> term308233 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term308232 = ((Class) term308233).getDeclaredField((String) "LONG_NAMES");
        ((Field) term308232).setAccessible(true);
        Object enum943 = ((Field) term308232).get((Object) null);
        Class<? extends Object> term308540 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term308539 = ((Class) term308540).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term308539).setAccessible(true);
        Object enum944 = ((Field) term308539).get((Object) null);
        term306885 = newInstance(Class.forName("org.openRealmOfStars.player.tech.TechList"));
        Object[] term306886 = (Object[]) newObjectArray(Array.newInstance(Class.forName("org.openRealmOfStars.player.tech.TechListForLevel"), 0).getClass(), 1);
        Object[] term306887 = (Object[]) newArray("org.openRealmOfStars.player.tech.TechListForLevel", 8);
        Object term306888 = newInstance(Class.forName("org.openRealmOfStars.player.tech.TechListForLevel"));
        Object term306893 = newInstance(Class.forName("org.openRealmOfStars.player.tech.TechListForLevel"));
        Object term306898 = newInstance(Class.forName("org.openRealmOfStars.player.tech.TechListForLevel"));
        Object term306903 = newInstance(Class.forName("org.openRealmOfStars.player.tech.TechListForLevel"));
        Object term306908 = newInstance(Class.forName("org.openRealmOfStars.player.tech.TechListForLevel"));
        Object term306913 = newInstance(Class.forName("org.openRealmOfStars.player.tech.TechListForLevel"));
        Object term306918 = newInstance(Class.forName("org.openRealmOfStars.player.tech.TechListForLevel"));
        Object term306923 = newInstance(Class.forName("org.openRealmOfStars.player.tech.TechListForLevel"));
        int[] term306928 = (int[]) newIntArray(0);
        int[] term306929 = (int[]) newIntArray(2);
        double[] term306932 = (double[]) newDoubleArray(2);
        Object term306935 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term307073 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term306888, term306888.getClass(), "techList", term306889);
        setIntField(term306888, term306888.getClass(), "level", -232601868);
        setElement(term306887, 0, term306888);
        setField(term306893, term306893.getClass(), "techList", term306894);
        setIntField(term306893, term306893.getClass(), "level", -407675703);
        setElement(term306887, 1, term306893);
        setField(term306898, term306898.getClass(), "techList", term306899);
        setIntField(term306898, term306898.getClass(), "level", -267520884);
        setElement(term306887, 2, term306898);
        setField(term306903, term306903.getClass(), "techList", term306904);
        setIntField(term306903, term306903.getClass(), "level", 1094810824);
        setElement(term306887, 3, term306903);
        setField(term306908, term306908.getClass(), "techList", term306909);
        setIntField(term306908, term306908.getClass(), "level", 73847121);
        setElement(term306887, 4, term306908);
        setField(term306913, term306913.getClass(), "techList", term306914);
        setIntField(term306913, term306913.getClass(), "level", 1721050745);
        setElement(term306887, 5, term306913);
        setField(term306918, term306918.getClass(), "techList", term306919);
        setIntField(term306918, term306918.getClass(), "level", -1980981205);
        setElement(term306887, 6, term306918);
        setField(term306923, term306923.getClass(), "techList", term306924);
        setIntField(term306923, term306923.getClass(), "level", -1530498856);
        setElement(term306887, 7, term306923);
        setElement(term306886, 0, term306887);
        setField(term306885, term306885.getClass(), "techList", term306886);
        setField(term306885, term306885.getClass(), "techLevels", term306928);
        setIntElement(term306929, 0, 1816257051);
        setIntElement(term306929, 1, -541591725);
        setField(term306885, term306885.getClass(), "techFocus", term306929);
        setDoubleElement(term306932, 0, 0.3626177854778667);
        setDoubleElement(term306932, 1, 0.3163771663728089);
        setField(term306885, term306885.getClass(), "techResearchPoint", term306932);
        setField(term306935, term306935.getClass(), "id", "xBEICPrayB");
        setField(term306935, term306935.getClass(), "name", "JedqkPlmuP");
        setField(term306935, term306935.getClass(), "nameSingle", "PDPQtkPUcj");
        setField(term306935, term306935.getClass(), "attitude", enum939);
        setField(term306935, term306935.getClass(), "imagePath", "WjvrIsdCnX");
        setField(term306935, term306935.getClass(), "bridgeId", "hXtnMUXphj");
        setField(term306935, term306935.getClass(), "spaceShipId", "yvZqmxMOJp");
        setField(term306935, term306935.getClass(), "socialSystem", enum940);
        setField(term306935, term306935.getClass(), "genderList", term307036);
        setField(term306935, term306935.getClass(), "speechSetId", "pVzqxthcAx");
        setField(term306935, term306935.getClass(), "bridgeEffect", enum942);
        setField(term307073, term307073.getClass(), "songName", null);
        setField(term307073, term307073.getClass(), "author", null);
        setField(term307073, term307073.getClass(), "fileName", null);
        setBooleanField(term307073, term307073.getClass(), "custom", false);
        setIntField(term307073, term307073.getClass(), "fadingLimit", 0);
        setField(term306935, term306935.getClass(), "diplomacyMusic", term307073);
        setField(term306935, term306935.getClass(), "traits", term307076);
        setField(term306935, term306935.getClass(), "leaderNameGenerator", enum943);
        setField(term306935, term306935.getClass(), "description", "vDdOCxbaae");
        setField(term306935, term306935.getClass(), "spaceRaceType", enum944);
        setField(term306885, term306885.getClass(), "race", term306935);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.TechList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBestStarbaseCulture", argTypes, term306885, args);
    }

};


