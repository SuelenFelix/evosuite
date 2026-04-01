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

public class SpaceRace_addGender_45177439138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term310473;
     Object enum959;

    public SpaceRace_addGender_45177439138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term310744 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term310743 = ((Class) term310744).getDeclaredField((String) "SCIENTIFIC");
        ((Field) term310743).setAccessible(true);
        Object enum956 = ((Field) term310743).get((Object) null);
        Class<? extends Object> term311041 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term311040 = ((Class) term311041).getDeclaredField((String) "PATRIARCHY");
        ((Field) term311040).setAccessible(true);
        Object enum957 = ((Field) term311040).get((Object) null);
        Class<? extends Object> term311303 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term311302 = ((Class) term311303).getDeclaredField((String) "FEMALE");
        ((Field) term311302).setAccessible(true);
        Object enum958 =  ((Field) term311302).get((Object) null);
        Class<? extends Object> term311533 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term311532 = ((Class) term311533).getDeclaredField((String) "FEMALE");
        ((Field) term311532).setAccessible(true);
        enum959 =  ((Field) term311532).get((Object) null);
        ArrayList term310574 = new ArrayList();
        ((ArrayList) term310574).add(enum958);
        ((ArrayList) term310574).add(enum959);
        ((ArrayList) term310574).add(enum958);
        ((ArrayList) term310574).add(enum959);
        Class<? extends Object> term311773 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term311772 = ((Class) term311773).getDeclaredField((String) "DARK_ORANGE");
        ((Field) term311772).setAccessible(true);
        Object enum960 = ((Field) term311772).get((Object) null);
        ArrayList term310659 = new ArrayList();
        ((ArrayList) term310659).add((Object)null);
        ((ArrayList) term310659).add((Object)null);
        ((ArrayList) term310659).add((Object)null);
        ((ArrayList) term310659).add((Object)null);
        ((ArrayList) term310659).add((Object)null);
        ((ArrayList) term310659).add((Object)null);
        ((ArrayList) term310659).add((Object)null);
        ((ArrayList) term310659).add((Object)null);
        ((ArrayList) term310659).add((Object)null);
        Object term310654 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term310654, term310654.getClass(), "traitId", "");
        setField(term310654, term310654.getClass(), "traitName", "");
        setField(term310654, term310654.getClass(), "description", "");
        setField(term310654, term310654.getClass(), "group", "");
        setField(term310654, term310654.getClass(), "conflictsWithIds", term310659);
        setByteField(term310654, term310654.getClass(), "traitPoints", (byte) 84);
        ArrayList term310668 = new ArrayList();
        ((ArrayList) term310668).add((Object)null);
        ((ArrayList) term310668).add((Object)null);
        ((ArrayList) term310668).add((Object)null);
        ((ArrayList) term310668).add((Object)null);
        ((ArrayList) term310668).add((Object)null);
        ((ArrayList) term310668).add((Object)null);
        ((ArrayList) term310668).add((Object)null);
        ((ArrayList) term310668).add((Object)null);
        ((ArrayList) term310668).add((Object)null);
        Object term310663 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term310663, term310663.getClass(), "traitId", "");
        setField(term310663, term310663.getClass(), "traitName", "");
        setField(term310663, term310663.getClass(), "description", "");
        setField(term310663, term310663.getClass(), "group", "");
        setField(term310663, term310663.getClass(), "conflictsWithIds", term310668);
        setByteField(term310663, term310663.getClass(), "traitPoints", (byte) 1);
        ArrayList term310652 = new ArrayList();
        ((ArrayList) term310652).add(term310654);
        ((ArrayList) term310652).add(term310663);
        Class<? extends Object> term312073 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term312072 = ((Class) term312073).getDeclaredField((String) "PIRATE");
        ((Field) term312072).setAccessible(true);
        Object enum961 = ((Field) term312072).get((Object) null);
        Class<? extends Object> term312368 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term312367 = ((Class) term312368).getDeclaredField((String) "SPACE_MONSTER");
        ((Field) term312367).setAccessible(true);
        Object enum962 = ((Field) term312367).get((Object) null);
        term310473 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term310613 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term310473, term310473.getClass(), "id", "NdCqWFAKtC");
        setField(term310473, term310473.getClass(), "name", "brggoDHwgJ");
        setField(term310473, term310473.getClass(), "nameSingle", "mDOxbNsMUA");
        setField(term310473, term310473.getClass(), "attitude", enum956);
        setField(term310473, term310473.getClass(), "imagePath", "wmcOIwaOzF");
        setField(term310473, term310473.getClass(), "bridgeId", "tvKxAKjRmt");
        setField(term310473, term310473.getClass(), "spaceShipId", "YqKucvfPsH");
        setField(term310473, term310473.getClass(), "socialSystem", enum957);
        setField(term310473, term310473.getClass(), "genderList", term310574);
        setField(term310473, term310473.getClass(), "speechSetId", "yJJLpUySXp");
        setField(term310473, term310473.getClass(), "bridgeEffect", enum960);
        setField(term310613, term310613.getClass(), "songName", "ZoRLfUSUqr");
        setField(term310613, term310613.getClass(), "author", "OvmJqKnwXe");
        setField(term310613, term310613.getClass(), "fileName", "nrshoMEpRL");
        setBooleanField(term310613, term310613.getClass(), "custom", true);
        setIntField(term310613, term310613.getClass(), "fadingLimit", -892566680);
        setField(term310473, term310473.getClass(), "diplomacyMusic", term310613);
        setField(term310473, term310473.getClass(), "traits", term310652);
        setField(term310473, term310473.getClass(), "leaderNameGenerator", enum961);
        setField(term310473, term310473.getClass(), "description", "LScHUVQpVE");
        setField(term310473, term310473.getClass(), "spaceRaceType", enum962);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.leader.Gender");
        Object[] args = new Object[1];
        args[0] = enum959;
        callMethod(klass, "addGender", argTypes, term310473, args);
    }

};


