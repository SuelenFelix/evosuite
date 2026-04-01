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

public class SavedGame_getEmpireName_19034147505 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238734;

    public SavedGame_getEmpireName_19034147505() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term239059 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term239058 = ((Class) term239059).getDeclaredField((String) "MILITARISTIC");
        ((Field) term239058).setAccessible(true);
        Object enum389 = ((Field) term239058).get((Object) null);
        Class<? extends Object> term239362 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term239361 = ((Class) term239362).getDeclaredField((String) "EQUAL");
        ((Field) term239361).setAccessible(true);
        Object enum390 = ((Field) term239361).get((Object) null);
        Class<? extends Object> term239609 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term239608 = ((Class) term239609).getDeclaredField((String) "MALE");
        ((Field) term239608).setAccessible(true);
        Object enum391 =  ((Field) term239608).get((Object) null);
        Class<? extends Object> term239833 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term239832 = ((Class) term239833).getDeclaredField((String) "NONE");
        ((Field) term239832).setAccessible(true);
        Object enum392 =  ((Field) term239832).get((Object) null);
        Class<? extends Object> term240057 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term240056 = ((Class) term240057).getDeclaredField((String) "FEMALE");
        ((Field) term240056).setAccessible(true);
        Object enum393 =  ((Field) term240056).get((Object) null);
        ArrayList term238833 = new ArrayList();
        ((ArrayList) term238833).add(enum391);
        ((ArrayList) term238833).add(enum392);
        ((ArrayList) term238833).add(enum393);
        ((ArrayList) term238833).add(enum391);
        ((ArrayList) term238833).add(enum391);
        ((ArrayList) term238833).add(enum393);
        ((ArrayList) term238833).add(enum391);
        ((ArrayList) term238833).add(enum393);
        Class<? extends Object> term240297 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term240296 = ((Class) term240297).getDeclaredField((String) "DARK_ORANGE");
        ((Field) term240296).setAccessible(true);
        Object enum394 = ((Field) term240296).get((Object) null);
        Object term238914 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term238914, term238914.getClass(), "traitId", null);
        setField(term238914, term238914.getClass(), "traitName", null);
        setField(term238914, term238914.getClass(), "description", null);
        setField(term238914, term238914.getClass(), "group", null);
        setField(term238914, term238914.getClass(), "conflictsWithIds", null);
        setByteField(term238914, term238914.getClass(), "traitPoints", (byte) -84);
        Object term238916 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term238916, term238916.getClass(), "traitId", null);
        setField(term238916, term238916.getClass(), "traitName", null);
        setField(term238916, term238916.getClass(), "description", null);
        setField(term238916, term238916.getClass(), "group", null);
        setField(term238916, term238916.getClass(), "conflictsWithIds", null);
        setByteField(term238916, term238916.getClass(), "traitPoints", (byte) 34);
        Object term238918 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term238918, term238918.getClass(), "traitId", null);
        setField(term238918, term238918.getClass(), "traitName", null);
        setField(term238918, term238918.getClass(), "description", null);
        setField(term238918, term238918.getClass(), "group", null);
        setField(term238918, term238918.getClass(), "conflictsWithIds", null);
        setByteField(term238918, term238918.getClass(), "traitPoints", (byte) -125);
        Object term238920 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term238920, term238920.getClass(), "traitId", null);
        setField(term238920, term238920.getClass(), "traitName", null);
        setField(term238920, term238920.getClass(), "description", null);
        setField(term238920, term238920.getClass(), "group", null);
        setField(term238920, term238920.getClass(), "conflictsWithIds", null);
        setByteField(term238920, term238920.getClass(), "traitPoints", (byte) 11);
        Object term238922 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term238922, term238922.getClass(), "traitId", null);
        setField(term238922, term238922.getClass(), "traitName", null);
        setField(term238922, term238922.getClass(), "description", null);
        setField(term238922, term238922.getClass(), "group", null);
        setField(term238922, term238922.getClass(), "conflictsWithIds", null);
        setByteField(term238922, term238922.getClass(), "traitPoints", (byte) 50);
        Object term238924 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term238924, term238924.getClass(), "traitId", null);
        setField(term238924, term238924.getClass(), "traitName", null);
        setField(term238924, term238924.getClass(), "description", null);
        setField(term238924, term238924.getClass(), "group", null);
        setField(term238924, term238924.getClass(), "conflictsWithIds", null);
        setByteField(term238924, term238924.getClass(), "traitPoints", (byte) 86);
        Object term238926 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term238926, term238926.getClass(), "traitId", null);
        setField(term238926, term238926.getClass(), "traitName", null);
        setField(term238926, term238926.getClass(), "description", null);
        setField(term238926, term238926.getClass(), "group", null);
        setField(term238926, term238926.getClass(), "conflictsWithIds", null);
        setByteField(term238926, term238926.getClass(), "traitPoints", (byte) -96);
        Object term238928 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term238928, term238928.getClass(), "traitId", null);
        setField(term238928, term238928.getClass(), "traitName", null);
        setField(term238928, term238928.getClass(), "description", null);
        setField(term238928, term238928.getClass(), "group", null);
        setField(term238928, term238928.getClass(), "conflictsWithIds", null);
        setByteField(term238928, term238928.getClass(), "traitPoints", (byte) 18);
        ArrayList term238912 = new ArrayList();
        ((ArrayList) term238912).add(term238914);
        ((ArrayList) term238912).add(term238916);
        ((ArrayList) term238912).add(term238918);
        ((ArrayList) term238912).add(term238920);
        ((ArrayList) term238912).add(term238922);
        ((ArrayList) term238912).add(term238924);
        ((ArrayList) term238912).add(term238926);
        ((ArrayList) term238912).add(term238928);
        Class<? extends Object> term240597 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term240596 = ((Class) term240597).getDeclaredField((String) "STONE_PEOPLE");
        ((Field) term240596).setAccessible(true);
        Object enum395 = ((Field) term240596).get((Object) null);
        Class<? extends Object> term240910 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term240909 = ((Class) term240910).getDeclaredField((String) "SPACE_MONSTER");
        ((Field) term240909).setAccessible(true);
        Object enum396 = ((Field) term240909).get((Object) null);
        term238734 = newInstance(Class.forName("org.openRealmOfStars.game.SavedGame"));
        Object term238735 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term238873 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term238735, term238735.getClass(), "id", "DmsJwEkQmO");
        setField(term238735, term238735.getClass(), "name", "HzibsEDFOp");
        setField(term238735, term238735.getClass(), "nameSingle", "nxccuKoVbt");
        setField(term238735, term238735.getClass(), "attitude", enum389);
        setField(term238735, term238735.getClass(), "imagePath", "fgSbKLymzA");
        setField(term238735, term238735.getClass(), "bridgeId", "kSFJgZpdtf");
        setField(term238735, term238735.getClass(), "spaceShipId", "ujNUCJKMUq");
        setField(term238735, term238735.getClass(), "socialSystem", enum390);
        setField(term238735, term238735.getClass(), "genderList", term238833);
        setField(term238735, term238735.getClass(), "speechSetId", "oQFejbSARv");
        setField(term238735, term238735.getClass(), "bridgeEffect", enum394);
        setField(term238873, term238873.getClass(), "songName", "DzSvjuoClh");
        setField(term238873, term238873.getClass(), "author", "mKfcJwCzHA");
        setField(term238873, term238873.getClass(), "fileName", "aAolDGKlZL");
        setBooleanField(term238873, term238873.getClass(), "custom", false);
        setIntField(term238873, term238873.getClass(), "fadingLimit", -1606452163);
        setField(term238735, term238735.getClass(), "diplomacyMusic", term238873);
        setField(term238735, term238735.getClass(), "traits", term238912);
        setField(term238735, term238735.getClass(), "leaderNameGenerator", enum395);
        setField(term238735, term238735.getClass(), "description", "wNfBmUuDuP");
        setField(term238735, term238735.getClass(), "spaceRaceType", enum396);
        setField(term238734, term238734.getClass(), "playerRace", term238735);
        setIntField(term238734, term238734.getClass(), "starYear", -1590822439);
        setIntField(term238734, term238734.getClass(), "realms", -141055649);
        setField(term238734, term238734.getClass(), "galaxySize", "lNTNKavUNL");
        setField(term238734, term238734.getClass(), "filename", "BXfmFjgpOy");
        setField(term238734, term238734.getClass(), "empireName", "JCeHaSFOWK");
        setField(term238734, term238734.getClass(), "creationTime", "PNtiQWTZzA");
        setLongField(term238734, term238734.getClass(), "creationTimeMillis", 2486810210675247493L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.SavedGame");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmpireName", argTypes, term238734, args);
    }

};


