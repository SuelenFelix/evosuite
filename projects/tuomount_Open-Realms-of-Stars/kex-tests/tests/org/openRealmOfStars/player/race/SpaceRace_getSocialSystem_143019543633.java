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

public class SpaceRace_getSocialSystem_143019543633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term298056;

    public SpaceRace_getSocialSystem_143019543633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term298372 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term298371 = ((Class) term298372).getDeclaredField((String) "SCIENTIFIC");
        ((Field) term298371).setAccessible(true);
        Object enum915 = ((Field) term298371).get((Object) null);
        Class<? extends Object> term298669 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term298668 = ((Class) term298669).getDeclaredField((String) "PATRIARCHY");
        ((Field) term298668).setAccessible(true);
        Object enum916 = ((Field) term298668).get((Object) null);
        Class<? extends Object> term298931 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term298930 = ((Class) term298931).getDeclaredField((String) "NONE");
        ((Field) term298930).setAccessible(true);
        Object enum917 =  ((Field) term298930).get((Object) null);
        Class<? extends Object> term299155 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term299154 = ((Class) term299155).getDeclaredField((String) "FEMALE");
        ((Field) term299154).setAccessible(true);
        Object enum918 =  ((Field) term299154).get((Object) null);
        ArrayList term298157 = new ArrayList();
        ((ArrayList) term298157).add(enum917);
        ((ArrayList) term298157).add(enum918);
        ((ArrayList) term298157).add(enum917);
        ((ArrayList) term298157).add(enum917);
        Class<? extends Object> term299395 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term299394 = ((Class) term299395).getDeclaredField((String) "YELLOW_ALERT");
        ((Field) term299394).setAccessible(true);
        Object enum919 = ((Field) term299394).get((Object) null);
        ArrayList term298243 = new ArrayList();
        ((ArrayList) term298243).add((Object)null);
        ((ArrayList) term298243).add((Object)null);
        ((ArrayList) term298243).add((Object)null);
        ((ArrayList) term298243).add((Object)null);
        ((ArrayList) term298243).add((Object)null);
        ((ArrayList) term298243).add((Object)null);
        ((ArrayList) term298243).add((Object)null);
        ((ArrayList) term298243).add((Object)null);
        Object term298238 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term298238, term298238.getClass(), "traitId", "");
        setField(term298238, term298238.getClass(), "traitName", "");
        setField(term298238, term298238.getClass(), "description", "");
        setField(term298238, term298238.getClass(), "group", "");
        setField(term298238, term298238.getClass(), "conflictsWithIds", term298243);
        setByteField(term298238, term298238.getClass(), "traitPoints", (byte) -32);
        ArrayList term298252 = new ArrayList();
        ((ArrayList) term298252).add((Object)null);
        ((ArrayList) term298252).add((Object)null);
        ((ArrayList) term298252).add((Object)null);
        Object term298247 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term298247, term298247.getClass(), "traitId", "");
        setField(term298247, term298247.getClass(), "traitName", "");
        setField(term298247, term298247.getClass(), "description", "");
        setField(term298247, term298247.getClass(), "group", "");
        setField(term298247, term298247.getClass(), "conflictsWithIds", term298252);
        setByteField(term298247, term298247.getClass(), "traitPoints", (byte) 26);
        ArrayList term298261 = new ArrayList();
        ((ArrayList) term298261).add((Object)null);
        ((ArrayList) term298261).add((Object)null);
        ((ArrayList) term298261).add((Object)null);
        Object term298256 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term298256, term298256.getClass(), "traitId", "");
        setField(term298256, term298256.getClass(), "traitName", "");
        setField(term298256, term298256.getClass(), "description", "");
        setField(term298256, term298256.getClass(), "group", "");
        setField(term298256, term298256.getClass(), "conflictsWithIds", term298261);
        setByteField(term298256, term298256.getClass(), "traitPoints", (byte) 90);
        ArrayList term298270 = new ArrayList();
        ((ArrayList) term298270).add((Object)null);
        ((ArrayList) term298270).add((Object)null);
        ((ArrayList) term298270).add((Object)null);
        ((ArrayList) term298270).add((Object)null);
        ((ArrayList) term298270).add((Object)null);
        ((ArrayList) term298270).add((Object)null);
        ((ArrayList) term298270).add((Object)null);
        ((ArrayList) term298270).add((Object)null);
        ((ArrayList) term298270).add((Object)null);
        Object term298265 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term298265, term298265.getClass(), "traitId", "");
        setField(term298265, term298265.getClass(), "traitName", "");
        setField(term298265, term298265.getClass(), "description", "");
        setField(term298265, term298265.getClass(), "group", "");
        setField(term298265, term298265.getClass(), "conflictsWithIds", term298270);
        setByteField(term298265, term298265.getClass(), "traitPoints", (byte) 56);
        ArrayList term298279 = new ArrayList();
        ((ArrayList) term298279).add((Object)null);
        ((ArrayList) term298279).add((Object)null);
        ((ArrayList) term298279).add((Object)null);
        ((ArrayList) term298279).add((Object)null);
        Object term298274 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term298274, term298274.getClass(), "traitId", "");
        setField(term298274, term298274.getClass(), "traitName", "");
        setField(term298274, term298274.getClass(), "description", "");
        setField(term298274, term298274.getClass(), "group", "");
        setField(term298274, term298274.getClass(), "conflictsWithIds", term298279);
        setByteField(term298274, term298274.getClass(), "traitPoints", (byte) 62);
        ArrayList term298288 = new ArrayList();
        ((ArrayList) term298288).add((Object)null);
        ((ArrayList) term298288).add((Object)null);
        ((ArrayList) term298288).add((Object)null);
        ((ArrayList) term298288).add((Object)null);
        ((ArrayList) term298288).add((Object)null);
        ((ArrayList) term298288).add((Object)null);
        ((ArrayList) term298288).add((Object)null);
        ((ArrayList) term298288).add((Object)null);
        ((ArrayList) term298288).add((Object)null);
        Object term298283 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term298283, term298283.getClass(), "traitId", "");
        setField(term298283, term298283.getClass(), "traitName", "");
        setField(term298283, term298283.getClass(), "description", "");
        setField(term298283, term298283.getClass(), "group", "");
        setField(term298283, term298283.getClass(), "conflictsWithIds", term298288);
        setByteField(term298283, term298283.getClass(), "traitPoints", (byte) -3);
        ArrayList term298297 = new ArrayList();
        ((ArrayList) term298297).add((Object)null);
        ((ArrayList) term298297).add((Object)null);
        Object term298292 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term298292, term298292.getClass(), "traitId", "");
        setField(term298292, term298292.getClass(), "traitName", "");
        setField(term298292, term298292.getClass(), "description", "");
        setField(term298292, term298292.getClass(), "group", "");
        setField(term298292, term298292.getClass(), "conflictsWithIds", term298297);
        setByteField(term298292, term298292.getClass(), "traitPoints", (byte) -89);
        ArrayList term298236 = new ArrayList();
        ((ArrayList) term298236).add(term298238);
        ((ArrayList) term298236).add(term298247);
        ((ArrayList) term298236).add(term298256);
        ((ArrayList) term298236).add(term298265);
        ((ArrayList) term298236).add(term298274);
        ((ArrayList) term298236).add(term298283);
        ((ArrayList) term298236).add(term298292);
        Class<? extends Object> term299698 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term299697 = ((Class) term299698).getDeclaredField((String) "INSECT");
        ((Field) term299697).setAccessible(true);
        Object enum920 = ((Field) term299697).get((Object) null);
        Class<? extends Object> term299993 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term299992 = ((Class) term299993).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term299992).setAccessible(true);
        Object enum921 = ((Field) term299992).get((Object) null);
        term298056 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term298197 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term298056, term298056.getClass(), "id", "ZRaaeHguys");
        setField(term298056, term298056.getClass(), "name", "JyyGlEhItv");
        setField(term298056, term298056.getClass(), "nameSingle", "NAeiHxWYxI");
        setField(term298056, term298056.getClass(), "attitude", enum915);
        setField(term298056, term298056.getClass(), "imagePath", "qSfOhoIMpr");
        setField(term298056, term298056.getClass(), "bridgeId", "bAowmWKEGP");
        setField(term298056, term298056.getClass(), "spaceShipId", "GQZmnRhLyF");
        setField(term298056, term298056.getClass(), "socialSystem", enum916);
        setField(term298056, term298056.getClass(), "genderList", term298157);
        setField(term298056, term298056.getClass(), "speechSetId", "CIJyIgGonf");
        setField(term298056, term298056.getClass(), "bridgeEffect", enum919);
        setField(term298197, term298197.getClass(), "songName", "uhIWNRNIgh");
        setField(term298197, term298197.getClass(), "author", "wFXoQDJRmN");
        setField(term298197, term298197.getClass(), "fileName", "JYcRvcwyES");
        setBooleanField(term298197, term298197.getClass(), "custom", false);
        setIntField(term298197, term298197.getClass(), "fadingLimit", 985381114);
        setField(term298056, term298056.getClass(), "diplomacyMusic", term298197);
        setField(term298056, term298056.getClass(), "traits", term298236);
        setField(term298056, term298056.getClass(), "leaderNameGenerator", enum920);
        setField(term298056, term298056.getClass(), "description", "bJbKGvPggm");
        setField(term298056, term298056.getClass(), "spaceRaceType", enum921);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSocialSystem", argTypes, term298056, args);
    }

};


