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

public class SpaceRace_getAllTraits_2095542208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240251;

    public SpaceRace_getAllTraits_2095542208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term240552 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term240551 = ((Class) term240552).getDeclaredField((String) "LOGICAL");
        ((Field) term240551).setAccessible(true);
        Object enum729 = ((Field) term240551).get((Object) null);
        Class<? extends Object> term240840 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term240839 = ((Class) term240840).getDeclaredField((String) "MATRIARCHY");
        ((Field) term240839).setAccessible(true);
        Object enum730 = ((Field) term240839).get((Object) null);
        Class<? extends Object> term241102 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term241101 = ((Class) term241102).getDeclaredField((String) "NONE");
        ((Field) term241101).setAccessible(true);
        Object enum731 =  ((Field) term241101).get((Object) null);
        Class<? extends Object> term241326 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term241325 = ((Class) term241326).getDeclaredField((String) "NONE");
        ((Field) term241325).setAccessible(true);
        Object enum732 =  ((Field) term241325).get((Object) null);
        ArrayList term240349 = new ArrayList();
        ((ArrayList) term240349).add(enum731);
        ((ArrayList) term240349).add(enum731);
        ((ArrayList) term240349).add(enum732);
        Class<? extends Object> term241560 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term241559 = ((Class) term241560).getDeclaredField((String) "RED_ALERT");
        ((Field) term241559).setAccessible(true);
        Object enum733 = ((Field) term241559).get((Object) null);
        ArrayList term240432 = new ArrayList();
        ((ArrayList) term240432).add((Object)null);
        ((ArrayList) term240432).add((Object)null);
        ((ArrayList) term240432).add((Object)null);
        ((ArrayList) term240432).add((Object)null);
        ((ArrayList) term240432).add((Object)null);
        Object term240427 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term240427, term240427.getClass(), "traitId", "");
        setField(term240427, term240427.getClass(), "traitName", "");
        setField(term240427, term240427.getClass(), "description", "");
        setField(term240427, term240427.getClass(), "group", "");
        setField(term240427, term240427.getClass(), "conflictsWithIds", term240432);
        setByteField(term240427, term240427.getClass(), "traitPoints", (byte) 118);
        ArrayList term240441 = new ArrayList();
        ((ArrayList) term240441).add((Object)null);
        Object term240436 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term240436, term240436.getClass(), "traitId", "");
        setField(term240436, term240436.getClass(), "traitName", "");
        setField(term240436, term240436.getClass(), "description", "");
        setField(term240436, term240436.getClass(), "group", "");
        setField(term240436, term240436.getClass(), "conflictsWithIds", term240441);
        setByteField(term240436, term240436.getClass(), "traitPoints", (byte) -90);
        ArrayList term240450 = new ArrayList();
        ((ArrayList) term240450).add((Object)null);
        Object term240445 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term240445, term240445.getClass(), "traitId", "");
        setField(term240445, term240445.getClass(), "traitName", "");
        setField(term240445, term240445.getClass(), "description", "");
        setField(term240445, term240445.getClass(), "group", "");
        setField(term240445, term240445.getClass(), "conflictsWithIds", term240450);
        setByteField(term240445, term240445.getClass(), "traitPoints", (byte) -117);
        ArrayList term240459 = new ArrayList();
        ((ArrayList) term240459).add((Object)null);
        ((ArrayList) term240459).add((Object)null);
        ((ArrayList) term240459).add((Object)null);
        ((ArrayList) term240459).add((Object)null);
        ((ArrayList) term240459).add((Object)null);
        Object term240454 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term240454, term240454.getClass(), "traitId", "");
        setField(term240454, term240454.getClass(), "traitName", "");
        setField(term240454, term240454.getClass(), "description", "");
        setField(term240454, term240454.getClass(), "group", "");
        setField(term240454, term240454.getClass(), "conflictsWithIds", term240459);
        setByteField(term240454, term240454.getClass(), "traitPoints", (byte) 124);
        ArrayList term240468 = new ArrayList();
        Object term240463 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term240463, term240463.getClass(), "traitId", "");
        setField(term240463, term240463.getClass(), "traitName", "");
        setField(term240463, term240463.getClass(), "description", "");
        setField(term240463, term240463.getClass(), "group", "");
        setField(term240463, term240463.getClass(), "conflictsWithIds", term240468);
        setByteField(term240463, term240463.getClass(), "traitPoints", (byte) -61);
        ArrayList term240425 = new ArrayList();
        ((ArrayList) term240425).add(term240427);
        ((ArrayList) term240425).add(term240436);
        ((ArrayList) term240425).add(term240445);
        ((ArrayList) term240425).add(term240454);
        ((ArrayList) term240425).add(term240463);
        Class<? extends Object> term241854 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term241853 = ((Class) term241854).getDeclaredField((String) "DEEP_ANCIENT_MONSTER");
        ((Field) term241853).setAccessible(true);
        Object enum734 = ((Field) term241853).get((Object) null);
        Class<? extends Object> term242191 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term242190 = ((Class) term242191).getDeclaredField((String) "REGULAR");
        ((Field) term242190).setAccessible(true);
        Object enum735 = ((Field) term242190).get((Object) null);
        term240251 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term240386 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term240251, term240251.getClass(), "id", "gKKImQZJPQ");
        setField(term240251, term240251.getClass(), "name", "jZFSoRfUbm");
        setField(term240251, term240251.getClass(), "nameSingle", "xownqtBHHL");
        setField(term240251, term240251.getClass(), "attitude", enum729);
        setField(term240251, term240251.getClass(), "imagePath", "skprvHzjjg");
        setField(term240251, term240251.getClass(), "bridgeId", "OEhrSgqRGn");
        setField(term240251, term240251.getClass(), "spaceShipId", "fpnyXuhrlN");
        setField(term240251, term240251.getClass(), "socialSystem", enum730);
        setField(term240251, term240251.getClass(), "genderList", term240349);
        setField(term240251, term240251.getClass(), "speechSetId", "ciFNeIqDbW");
        setField(term240251, term240251.getClass(), "bridgeEffect", enum733);
        setField(term240386, term240386.getClass(), "songName", "WNyBDbLYTY");
        setField(term240386, term240386.getClass(), "author", "TUffiPUBII");
        setField(term240386, term240386.getClass(), "fileName", "vomUfvYKsJ");
        setBooleanField(term240386, term240386.getClass(), "custom", true);
        setIntField(term240386, term240386.getClass(), "fadingLimit", -1515149854);
        setField(term240251, term240251.getClass(), "diplomacyMusic", term240386);
        setField(term240251, term240251.getClass(), "traits", term240425);
        setField(term240251, term240251.getClass(), "leaderNameGenerator", enum734);
        setField(term240251, term240251.getClass(), "description", "sssJhNdUjG");
        setField(term240251, term240251.getClass(), "spaceRaceType", enum735);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllTraits", argTypes, term240251, args);
    }

};


