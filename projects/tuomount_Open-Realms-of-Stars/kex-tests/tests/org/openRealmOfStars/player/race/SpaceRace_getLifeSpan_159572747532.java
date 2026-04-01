package org.openRealmOfStars.player.race;

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
import static org.openRealmOfStars.player.race.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class SpaceRace_getLifeSpan_159572747532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295662;

    public SpaceRace_getLifeSpan_159572747532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term295936 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term295935 = ((Class) term295936).getDeclaredField((String) "AGGRESSIVE");
        ((Field) term295935).setAccessible(true);
        Object enum907 = ((Field) term295935).get((Object) null);
        Class<? extends Object> term296233 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term296232 = ((Class) term296233).getDeclaredField((String) "EQUAL");
        ((Field) term296232).setAccessible(true);
        Object enum908 = ((Field) term296232).get((Object) null);
        Class<? extends Object> term296480 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term296479 = ((Class) term296480).getDeclaredField((String) "FEMALE");
        ((Field) term296479).setAccessible(true);
        Object enum909 =  ((Field) term296479).get((Object) null);
        Class<? extends Object> term296710 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term296709 = ((Class) term296710).getDeclaredField((String) "MALE");
        ((Field) term296709).setAccessible(true);
        Object enum910 =  ((Field) term296709).get((Object) null);
        Class<? extends Object> term296934 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term296933 = ((Class) term296934).getDeclaredField((String) "FEMALE");
        ((Field) term296933).setAccessible(true);
        Object enum911 =  ((Field) term296933).get((Object) null);
        ArrayList term295758 = new ArrayList();
        ((ArrayList) term295758).add(enum909);
        ((ArrayList) term295758).add(enum910);
        ((ArrayList) term295758).add(enum910);
        ((ArrayList) term295758).add(enum911);
        ((ArrayList) term295758).add(enum911);
        Class<? extends Object> term297174 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term297173 = ((Class) term297174).getDeclaredField((String) "ORANGE_BLUE");
        ((Field) term297173).setAccessible(true);
        Object enum912 = ((Field) term297173).get((Object) null);
        ArrayList term295847 = new ArrayList();
        Object term295842 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term295842, term295842.getClass(), "traitId", "");
        setField(term295842, term295842.getClass(), "traitName", "");
        setField(term295842, term295842.getClass(), "description", "");
        setField(term295842, term295842.getClass(), "group", "");
        setField(term295842, term295842.getClass(), "conflictsWithIds", term295847);
        setByteField(term295842, term295842.getClass(), "traitPoints", (byte) 54);
        ArrayList term295856 = new ArrayList();
        Object term295851 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term295851, term295851.getClass(), "traitId", "");
        setField(term295851, term295851.getClass(), "traitName", "");
        setField(term295851, term295851.getClass(), "description", "");
        setField(term295851, term295851.getClass(), "group", "");
        setField(term295851, term295851.getClass(), "conflictsWithIds", term295856);
        setByteField(term295851, term295851.getClass(), "traitPoints", (byte) -100);
        ArrayList term295840 = new ArrayList();
        ((ArrayList) term295840).add(term295842);
        ((ArrayList) term295840).add(term295851);
        Class<? extends Object> term297474 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term297473 = ((Class) term297474).getDeclaredField((String) "LONG_NAMES");
        ((Field) term297473).setAccessible(true);
        Object enum913 = ((Field) term297473).get((Object) null);
        Class<? extends Object> term297781 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term297780 = ((Class) term297781).getDeclaredField((String) "SPACE_MONSTER");
        ((Field) term297780).setAccessible(true);
        Object enum914 = ((Field) term297780).get((Object) null);
        term295662 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term295801 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term295662, term295662.getClass(), "id", "agrDiNiIaA");
        setField(term295662, term295662.getClass(), "name", "WUUmlOfErB");
        setField(term295662, term295662.getClass(), "nameSingle", "OacYqyvsgP");
        setField(term295662, term295662.getClass(), "attitude", enum907);
        setField(term295662, term295662.getClass(), "imagePath", "ednhFNlubd");
        setField(term295662, term295662.getClass(), "bridgeId", "YIcytpxQpg");
        setField(term295662, term295662.getClass(), "spaceShipId", "nLdiDnEtGa");
        setField(term295662, term295662.getClass(), "socialSystem", enum908);
        setField(term295662, term295662.getClass(), "genderList", term295758);
        setField(term295662, term295662.getClass(), "speechSetId", "XepaExohUu");
        setField(term295662, term295662.getClass(), "bridgeEffect", enum912);
        setField(term295801, term295801.getClass(), "songName", "hTcLgWjgVZ");
        setField(term295801, term295801.getClass(), "author", "HJuxBeseep");
        setField(term295801, term295801.getClass(), "fileName", "pJhaEHvvEJ");
        setBooleanField(term295801, term295801.getClass(), "custom", false);
        setIntField(term295801, term295801.getClass(), "fadingLimit", -893412167);
        setField(term295662, term295662.getClass(), "diplomacyMusic", term295801);
        setField(term295662, term295662.getClass(), "traits", term295840);
        setField(term295662, term295662.getClass(), "leaderNameGenerator", enum913);
        setField(term295662, term295662.getClass(), "description", "cDCGHIFISc");
        setField(term295662, term295662.getClass(), "spaceRaceType", enum914);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLifeSpan", argTypes, term295662, args);
    }

};


