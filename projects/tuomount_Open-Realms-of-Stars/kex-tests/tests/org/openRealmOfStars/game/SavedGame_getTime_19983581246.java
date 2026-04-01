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

public class SavedGame_getTime_19983581246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241225;

    public SavedGame_getTime_19983581246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term241546 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term241545 = ((Class) term241546).getDeclaredField((String) "EXPANSIONIST");
        ((Field) term241545).setAccessible(true);
        Object enum397 = ((Field) term241545).get((Object) null);
        Class<? extends Object> term241849 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term241848 = ((Class) term241849).getDeclaredField((String) "EQUAL");
        ((Field) term241848).setAccessible(true);
        Object enum398 = ((Field) term241848).get((Object) null);
        Class<? extends Object> term242096 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term242095 = ((Class) term242096).getDeclaredField((String) "MALE");
        ((Field) term242095).setAccessible(true);
        Object enum399 =  ((Field) term242095).get((Object) null);
        Class<? extends Object> term242320 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term242319 = ((Class) term242320).getDeclaredField((String) "FEMALE");
        ((Field) term242319).setAccessible(true);
        Object enum400 =  ((Field) term242319).get((Object) null);
        Class<? extends Object> term242550 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term242549 = ((Class) term242550).getDeclaredField((String) "MALE");
        ((Field) term242549).setAccessible(true);
        Object enum401 =  ((Field) term242549).get((Object) null);
        ArrayList term241324 = new ArrayList();
        ((ArrayList) term241324).add(enum399);
        ((ArrayList) term241324).add(enum400);
        ((ArrayList) term241324).add(enum400);
        ((ArrayList) term241324).add(enum399);
        ((ArrayList) term241324).add(enum400);
        ((ArrayList) term241324).add(enum401);
        ((ArrayList) term241324).add(enum400);
        ((ArrayList) term241324).add(enum401);
        ((ArrayList) term241324).add(enum401);
        Class<? extends Object> term242784 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term242783 = ((Class) term242784).getDeclaredField((String) "ORANGE_BLUE");
        ((Field) term242783).setAccessible(true);
        Object enum402 = ((Field) term242783).get((Object) null);
        Object term241405 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term241405, term241405.getClass(), "traitId", null);
        setField(term241405, term241405.getClass(), "traitName", null);
        setField(term241405, term241405.getClass(), "description", null);
        setField(term241405, term241405.getClass(), "group", null);
        setField(term241405, term241405.getClass(), "conflictsWithIds", null);
        setByteField(term241405, term241405.getClass(), "traitPoints", (byte) -53);
        Object term241407 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term241407, term241407.getClass(), "traitId", null);
        setField(term241407, term241407.getClass(), "traitName", null);
        setField(term241407, term241407.getClass(), "description", null);
        setField(term241407, term241407.getClass(), "group", null);
        setField(term241407, term241407.getClass(), "conflictsWithIds", null);
        setByteField(term241407, term241407.getClass(), "traitPoints", (byte) 46);
        Object term241409 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term241409, term241409.getClass(), "traitId", null);
        setField(term241409, term241409.getClass(), "traitName", null);
        setField(term241409, term241409.getClass(), "description", null);
        setField(term241409, term241409.getClass(), "group", null);
        setField(term241409, term241409.getClass(), "conflictsWithIds", null);
        setByteField(term241409, term241409.getClass(), "traitPoints", (byte) -106);
        Object term241411 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term241411, term241411.getClass(), "traitId", null);
        setField(term241411, term241411.getClass(), "traitName", null);
        setField(term241411, term241411.getClass(), "description", null);
        setField(term241411, term241411.getClass(), "group", null);
        setField(term241411, term241411.getClass(), "conflictsWithIds", null);
        setByteField(term241411, term241411.getClass(), "traitPoints", (byte) 3);
        Object term241413 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term241413, term241413.getClass(), "traitId", null);
        setField(term241413, term241413.getClass(), "traitName", null);
        setField(term241413, term241413.getClass(), "description", null);
        setField(term241413, term241413.getClass(), "group", null);
        setField(term241413, term241413.getClass(), "conflictsWithIds", null);
        setByteField(term241413, term241413.getClass(), "traitPoints", (byte) 120);
        Object term241415 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term241415, term241415.getClass(), "traitId", null);
        setField(term241415, term241415.getClass(), "traitName", null);
        setField(term241415, term241415.getClass(), "description", null);
        setField(term241415, term241415.getClass(), "group", null);
        setField(term241415, term241415.getClass(), "conflictsWithIds", null);
        setByteField(term241415, term241415.getClass(), "traitPoints", (byte) 120);
        Object term241417 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term241417, term241417.getClass(), "traitId", null);
        setField(term241417, term241417.getClass(), "traitName", null);
        setField(term241417, term241417.getClass(), "description", null);
        setField(term241417, term241417.getClass(), "group", null);
        setField(term241417, term241417.getClass(), "conflictsWithIds", null);
        setByteField(term241417, term241417.getClass(), "traitPoints", (byte) -126);
        Object term241419 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term241419, term241419.getClass(), "traitId", null);
        setField(term241419, term241419.getClass(), "traitName", null);
        setField(term241419, term241419.getClass(), "description", null);
        setField(term241419, term241419.getClass(), "group", null);
        setField(term241419, term241419.getClass(), "conflictsWithIds", null);
        setByteField(term241419, term241419.getClass(), "traitPoints", (byte) -44);
        Object term241421 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term241421, term241421.getClass(), "traitId", null);
        setField(term241421, term241421.getClass(), "traitName", null);
        setField(term241421, term241421.getClass(), "description", null);
        setField(term241421, term241421.getClass(), "group", null);
        setField(term241421, term241421.getClass(), "conflictsWithIds", null);
        setByteField(term241421, term241421.getClass(), "traitPoints", (byte) -119);
        ArrayList term241403 = new ArrayList();
        ((ArrayList) term241403).add(term241405);
        ((ArrayList) term241403).add(term241407);
        ((ArrayList) term241403).add(term241409);
        ((ArrayList) term241403).add(term241411);
        ((ArrayList) term241403).add(term241413);
        ((ArrayList) term241403).add(term241415);
        ((ArrayList) term241403).add(term241417);
        ((ArrayList) term241403).add(term241419);
        ((ArrayList) term241403).add(term241421);
        Class<? extends Object> term243084 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term243083 = ((Class) term243084).getDeclaredField((String) "PIRATE");
        ((Field) term243083).setAccessible(true);
        Object enum403 = ((Field) term243083).get((Object) null);
        Class<? extends Object> term243379 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term243378 = ((Class) term243379).getDeclaredField((String) "SPACE_MONSTER");
        ((Field) term243378).setAccessible(true);
        Object enum404 = ((Field) term243378).get((Object) null);
        term241225 = newInstance(Class.forName("org.openRealmOfStars.game.SavedGame"));
        Object term241226 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term241364 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term241226, term241226.getClass(), "id", "raishRurKx");
        setField(term241226, term241226.getClass(), "name", "PpeSAmBPlT");
        setField(term241226, term241226.getClass(), "nameSingle", "XmRRZpyFKp");
        setField(term241226, term241226.getClass(), "attitude", enum397);
        setField(term241226, term241226.getClass(), "imagePath", "QXOnXJGHZk");
        setField(term241226, term241226.getClass(), "bridgeId", "tckSURIPmO");
        setField(term241226, term241226.getClass(), "spaceShipId", "GZSnqwBCPQ");
        setField(term241226, term241226.getClass(), "socialSystem", enum398);
        setField(term241226, term241226.getClass(), "genderList", term241324);
        setField(term241226, term241226.getClass(), "speechSetId", "zxdSWLKWYw");
        setField(term241226, term241226.getClass(), "bridgeEffect", enum402);
        setField(term241364, term241364.getClass(), "songName", "VurQtsudbR");
        setField(term241364, term241364.getClass(), "author", "KdIGyBXZVB");
        setField(term241364, term241364.getClass(), "fileName", "eKvGCdbyoP");
        setBooleanField(term241364, term241364.getClass(), "custom", true);
        setIntField(term241364, term241364.getClass(), "fadingLimit", 2045269013);
        setField(term241226, term241226.getClass(), "diplomacyMusic", term241364);
        setField(term241226, term241226.getClass(), "traits", term241403);
        setField(term241226, term241226.getClass(), "leaderNameGenerator", enum403);
        setField(term241226, term241226.getClass(), "description", "laVtzInYkB");
        setField(term241226, term241226.getClass(), "spaceRaceType", enum404);
        setField(term241225, term241225.getClass(), "playerRace", term241226);
        setIntField(term241225, term241225.getClass(), "starYear", 1260268717);
        setIntField(term241225, term241225.getClass(), "realms", -601011951);
        setField(term241225, term241225.getClass(), "galaxySize", "QlMgZrPWFc");
        setField(term241225, term241225.getClass(), "filename", "RBFdhcXDVw");
        setField(term241225, term241225.getClass(), "empireName", "xVeXohNyns");
        setField(term241225, term241225.getClass(), "creationTime", "GPeSysvTtW");
        setLongField(term241225, term241225.getClass(), "creationTimeMillis", 7009926388951271268L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.SavedGame");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTime", argTypes, term241225, args);
    }

};


