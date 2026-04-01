package org.openRealmOfStars.game;

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
import static org.openRealmOfStars.game.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class SavedGame_getGalaxySize_13909336803 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233999;

    public SavedGame_getGalaxySize_13909336803() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term234321 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term234320 = ((Class) term234321).getDeclaredField((String) "MERCHANTICAL");
        ((Field) term234320).setAccessible(true);
        Object enum374 = ((Field) term234320).get((Object) null);
        Class<? extends Object> term234624 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term234623 = ((Class) term234624).getDeclaredField((String) "MATRIARCHY");
        ((Field) term234623).setAccessible(true);
        Object enum375 = ((Field) term234623).get((Object) null);
        Class<? extends Object> term234886 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term234885 = ((Class) term234886).getDeclaredField((String) "FEMALE");
        ((Field) term234885).setAccessible(true);
        Object enum376 =  ((Field) term234885).get((Object) null);
        Class<? extends Object> term235116 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term235115 = ((Class) term235116).getDeclaredField((String) "NONE");
        ((Field) term235115).setAccessible(true);
        Object enum377 =  ((Field) term235115).get((Object) null);
        Class<? extends Object> term235340 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term235339 = ((Class) term235340).getDeclaredField((String) "FEMALE");
        ((Field) term235339).setAccessible(true);
        Object enum378 =  ((Field) term235339).get((Object) null);
        ArrayList term234103 = new ArrayList();
        ((ArrayList) term234103).add(enum376);
        ((ArrayList) term234103).add(enum377);
        ((ArrayList) term234103).add(enum377);
        ((ArrayList) term234103).add(enum378);
        ((ArrayList) term234103).add(enum376);
        ((ArrayList) term234103).add(enum377);
        ((ArrayList) term234103).add(enum376);
        ((ArrayList) term234103).add(enum376);
        ((ArrayList) term234103).add(enum376);
        Class<? extends Object> term235580 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term235579 = ((Class) term235580).getDeclaredField((String) "DARK_RED");
        ((Field) term235579).setAccessible(true);
        Object enum379 = ((Field) term235579).get((Object) null);
        Object term234181 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term234181, term234181.getClass(), "traitId", null);
        setField(term234181, term234181.getClass(), "traitName", null);
        setField(term234181, term234181.getClass(), "description", null);
        setField(term234181, term234181.getClass(), "group", null);
        setField(term234181, term234181.getClass(), "conflictsWithIds", null);
        setByteField(term234181, term234181.getClass(), "traitPoints", (byte) -128);
        Object term234183 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term234183, term234183.getClass(), "traitId", null);
        setField(term234183, term234183.getClass(), "traitName", null);
        setField(term234183, term234183.getClass(), "description", null);
        setField(term234183, term234183.getClass(), "group", null);
        setField(term234183, term234183.getClass(), "conflictsWithIds", null);
        setByteField(term234183, term234183.getClass(), "traitPoints", (byte) -52);
        Object term234185 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term234185, term234185.getClass(), "traitId", null);
        setField(term234185, term234185.getClass(), "traitName", null);
        setField(term234185, term234185.getClass(), "description", null);
        setField(term234185, term234185.getClass(), "group", null);
        setField(term234185, term234185.getClass(), "conflictsWithIds", null);
        setByteField(term234185, term234185.getClass(), "traitPoints", (byte) -48);
        Object term234187 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term234187, term234187.getClass(), "traitId", null);
        setField(term234187, term234187.getClass(), "traitName", null);
        setField(term234187, term234187.getClass(), "description", null);
        setField(term234187, term234187.getClass(), "group", null);
        setField(term234187, term234187.getClass(), "conflictsWithIds", null);
        setByteField(term234187, term234187.getClass(), "traitPoints", (byte) -15);
        Object term234189 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term234189, term234189.getClass(), "traitId", null);
        setField(term234189, term234189.getClass(), "traitName", null);
        setField(term234189, term234189.getClass(), "description", null);
        setField(term234189, term234189.getClass(), "group", null);
        setField(term234189, term234189.getClass(), "conflictsWithIds", null);
        setByteField(term234189, term234189.getClass(), "traitPoints", (byte) -117);
        Object term234191 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term234191, term234191.getClass(), "traitId", null);
        setField(term234191, term234191.getClass(), "traitName", null);
        setField(term234191, term234191.getClass(), "description", null);
        setField(term234191, term234191.getClass(), "group", null);
        setField(term234191, term234191.getClass(), "conflictsWithIds", null);
        setByteField(term234191, term234191.getClass(), "traitPoints", (byte) 45);
        Object term234193 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term234193, term234193.getClass(), "traitId", null);
        setField(term234193, term234193.getClass(), "traitName", null);
        setField(term234193, term234193.getClass(), "description", null);
        setField(term234193, term234193.getClass(), "group", null);
        setField(term234193, term234193.getClass(), "conflictsWithIds", null);
        setByteField(term234193, term234193.getClass(), "traitPoints", (byte) 60);
        Object term234195 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term234195, term234195.getClass(), "traitId", null);
        setField(term234195, term234195.getClass(), "traitName", null);
        setField(term234195, term234195.getClass(), "description", null);
        setField(term234195, term234195.getClass(), "group", null);
        setField(term234195, term234195.getClass(), "conflictsWithIds", null);
        setByteField(term234195, term234195.getClass(), "traitPoints", (byte) 22);
        Object term234197 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term234197, term234197.getClass(), "traitId", null);
        setField(term234197, term234197.getClass(), "traitName", null);
        setField(term234197, term234197.getClass(), "description", null);
        setField(term234197, term234197.getClass(), "group", null);
        setField(term234197, term234197.getClass(), "conflictsWithIds", null);
        setByteField(term234197, term234197.getClass(), "traitPoints", (byte) -98);
        ArrayList term234179 = new ArrayList();
        ((ArrayList) term234179).add(term234181);
        ((ArrayList) term234179).add(term234183);
        ((ArrayList) term234179).add(term234185);
        ((ArrayList) term234179).add(term234187);
        ((ArrayList) term234179).add(term234189);
        ((ArrayList) term234179).add(term234191);
        ((ArrayList) term234179).add(term234193);
        ((ArrayList) term234179).add(term234195);
        ((ArrayList) term234179).add(term234197);
        Class<? extends Object> term235871 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term235870 = ((Class) term235871).getDeclaredField((String) "SCIFI_HUMAN");
        ((Field) term235870).setAccessible(true);
        Object enum380 = ((Field) term235870).get((Object) null);
        Class<? extends Object> term236181 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term236180 = ((Class) term236181).getDeclaredField((String) "REGULAR");
        ((Field) term236180).setAccessible(true);
        Object enum381 = ((Field) term236180).get((Object) null);
        term233999 = newInstance(Class.forName("org.openRealmOfStars.game.SavedGame"));
        Object term234000 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term234140 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term234000, term234000.getClass(), "id", "ScVMeCBvvv");
        setField(term234000, term234000.getClass(), "name", "xysssjuOdh");
        setField(term234000, term234000.getClass(), "nameSingle", "LQWvIhnGeL");
        setField(term234000, term234000.getClass(), "attitude", enum374);
        setField(term234000, term234000.getClass(), "imagePath", "fSsmODkNFb");
        setField(term234000, term234000.getClass(), "bridgeId", "jXaYbKgogd");
        setField(term234000, term234000.getClass(), "spaceShipId", "MxPRraPVdF");
        setField(term234000, term234000.getClass(), "socialSystem", enum375);
        setField(term234000, term234000.getClass(), "genderList", term234103);
        setField(term234000, term234000.getClass(), "speechSetId", "dnWHLTYWVU");
        setField(term234000, term234000.getClass(), "bridgeEffect", enum379);
        setField(term234140, term234140.getClass(), "songName", "AOSOeWGCwi");
        setField(term234140, term234140.getClass(), "author", "pBmevrFCmp");
        setField(term234140, term234140.getClass(), "fileName", "DOCvwqbYDn");
        setBooleanField(term234140, term234140.getClass(), "custom", false);
        setIntField(term234140, term234140.getClass(), "fadingLimit", 1537598422);
        setField(term234000, term234000.getClass(), "diplomacyMusic", term234140);
        setField(term234000, term234000.getClass(), "traits", term234179);
        setField(term234000, term234000.getClass(), "leaderNameGenerator", enum380);
        setField(term234000, term234000.getClass(), "description", "uuwidsQbSs");
        setField(term234000, term234000.getClass(), "spaceRaceType", enum381);
        setField(term233999, term233999.getClass(), "playerRace", term234000);
        setIntField(term233999, term233999.getClass(), "starYear", 2011217936);
        setIntField(term233999, term233999.getClass(), "realms", 490201050);
        setField(term233999, term233999.getClass(), "galaxySize", "rXLmNRoJfU");
        setField(term233999, term233999.getClass(), "filename", "dWaVZloZWE");
        setField(term233999, term233999.getClass(), "empireName", "vgZFgEliKc");
        setField(term233999, term233999.getClass(), "creationTime", "cwNMyoCqHJ");
        setLongField(term233999, term233999.getClass(), "creationTimeMillis", 8059786003080744426L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.SavedGame");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGalaxySize", argTypes, term233999, args);
    }

};


