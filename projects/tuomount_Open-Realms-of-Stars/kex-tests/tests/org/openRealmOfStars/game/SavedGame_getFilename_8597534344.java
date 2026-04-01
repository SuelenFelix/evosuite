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

public class SavedGame_getFilename_8597534344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236478;

    public SavedGame_getFilename_8597534344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term236789 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term236788 = ((Class) term236789).getDeclaredField((String) "BACKSTABBING");
        ((Field) term236788).setAccessible(true);
        Object enum382 = ((Field) term236788).get((Object) null);
        Class<? extends Object> term237092 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term237091 = ((Class) term237092).getDeclaredField((String) "MATRIARCHY");
        ((Field) term237091).setAccessible(true);
        Object enum383 = ((Field) term237091).get((Object) null);
        Class<? extends Object> term237354 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term237353 = ((Class) term237354).getDeclaredField((String) "FEMALE");
        ((Field) term237353).setAccessible(true);
        Object enum384 =  ((Field) term237353).get((Object) null);
        Class<? extends Object> term237584 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term237583 = ((Class) term237584).getDeclaredField((String) "NONE");
        ((Field) term237583).setAccessible(true);
        Object enum385 =  ((Field) term237583).get((Object) null);
        ArrayList term236582 = new ArrayList();
        ((ArrayList) term236582).add(enum384);
        ((ArrayList) term236582).add(enum385);
        ((ArrayList) term236582).add(enum384);
        ((ArrayList) term236582).add(enum385);
        Class<? extends Object> term237818 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term237817 = ((Class) term237818).getDeclaredField((String) "RED_ALERT");
        ((Field) term237817).setAccessible(true);
        Object enum386 = ((Field) term237817).get((Object) null);
        Object term236658 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term236658, term236658.getClass(), "traitId", null);
        setField(term236658, term236658.getClass(), "traitName", null);
        setField(term236658, term236658.getClass(), "description", null);
        setField(term236658, term236658.getClass(), "group", null);
        setField(term236658, term236658.getClass(), "conflictsWithIds", null);
        setByteField(term236658, term236658.getClass(), "traitPoints", (byte) -113);
        Object term236660 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term236660, term236660.getClass(), "traitId", null);
        setField(term236660, term236660.getClass(), "traitName", null);
        setField(term236660, term236660.getClass(), "description", null);
        setField(term236660, term236660.getClass(), "group", null);
        setField(term236660, term236660.getClass(), "conflictsWithIds", null);
        setByteField(term236660, term236660.getClass(), "traitPoints", (byte) -1);
        ArrayList term236656 = new ArrayList();
        ((ArrayList) term236656).add(term236658);
        ((ArrayList) term236656).add(term236660);
        Class<? extends Object> term238112 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term238111 = ((Class) term238112).getDeclaredField((String) "GASEOUS_CREATURE");
        ((Field) term238111).setAccessible(true);
        Object enum387 = ((Field) term238111).get((Object) null);
        Class<? extends Object> term238437 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term238436 = ((Class) term238437).getDeclaredField((String) "REGULAR");
        ((Field) term238436).setAccessible(true);
        Object enum388 = ((Field) term238436).get((Object) null);
        term236478 = newInstance(Class.forName("org.openRealmOfStars.game.SavedGame"));
        Object term236479 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term236617 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term236479, term236479.getClass(), "id", "PzUYNYWLsN");
        setField(term236479, term236479.getClass(), "name", "rGvXtIHjBI");
        setField(term236479, term236479.getClass(), "nameSingle", "PKJkUkzual");
        setField(term236479, term236479.getClass(), "attitude", enum382);
        setField(term236479, term236479.getClass(), "imagePath", "WYcqisofgT");
        setField(term236479, term236479.getClass(), "bridgeId", "vVYrwXQCzi");
        setField(term236479, term236479.getClass(), "spaceShipId", "urqqtlYppy");
        setField(term236479, term236479.getClass(), "socialSystem", enum383);
        setField(term236479, term236479.getClass(), "genderList", term236582);
        setField(term236479, term236479.getClass(), "speechSetId", "znNUsUuegd");
        setField(term236479, term236479.getClass(), "bridgeEffect", enum386);
        setField(term236617, term236617.getClass(), "songName", "TvOdQLksId");
        setField(term236617, term236617.getClass(), "author", "gbrBAjYfeF");
        setField(term236617, term236617.getClass(), "fileName", "oQyDIyWghi");
        setBooleanField(term236617, term236617.getClass(), "custom", false);
        setIntField(term236617, term236617.getClass(), "fadingLimit", 1544509853);
        setField(term236479, term236479.getClass(), "diplomacyMusic", term236617);
        setField(term236479, term236479.getClass(), "traits", term236656);
        setField(term236479, term236479.getClass(), "leaderNameGenerator", enum387);
        setField(term236479, term236479.getClass(), "description", "mDIAdszXHc");
        setField(term236479, term236479.getClass(), "spaceRaceType", enum388);
        setField(term236478, term236478.getClass(), "playerRace", term236479);
        setIntField(term236478, term236478.getClass(), "starYear", -837360714);
        setIntField(term236478, term236478.getClass(), "realms", -605017762);
        setField(term236478, term236478.getClass(), "galaxySize", "GYljRejWKI");
        setField(term236478, term236478.getClass(), "filename", "AwXWFyuuXB");
        setField(term236478, term236478.getClass(), "empireName", "hHUEukVMwn");
        setField(term236478, term236478.getClass(), "creationTime", "yvAOmWOExs");
        setLongField(term236478, term236478.getClass(), "creationTimeMillis", -4365849114644724155L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.SavedGame");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFilename", argTypes, term236478, args);
    }

};


