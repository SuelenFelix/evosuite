package org.openRealmOfStars.mapTiles;

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
import static org.openRealmOfStars.mapTiles.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class FleetTileInfo_getConflictIndex_24004498610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100927;

    public FleetTileInfo_getConflictIndex_24004498610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term101191 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term101190 = ((Class) term101191).getDeclaredField((String) "MERCHANTICAL");
        ((Field) term101190).setAccessible(true);
        Object enum275 = ((Field) term101190).get((Object) null);
        Class<? extends Object> term101494 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term101493 = ((Class) term101494).getDeclaredField((String) "PATRIARCHY");
        ((Field) term101493).setAccessible(true);
        Object enum276 = ((Field) term101493).get((Object) null);
        ArrayList term101031 = new ArrayList();
        Class<? extends Object> term101766 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term101765 = ((Class) term101766).getDeclaredField((String) "FLOAT_IN_SPACE");
        ((Field) term101765).setAccessible(true);
        Object enum277 = ((Field) term101765).get((Object) null);
        Object term101106 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term101106, term101106.getClass(), "traitId", null);
        setField(term101106, term101106.getClass(), "traitName", null);
        setField(term101106, term101106.getClass(), "description", null);
        setField(term101106, term101106.getClass(), "group", null);
        setField(term101106, term101106.getClass(), "conflictsWithIds", null);
        setByteField(term101106, term101106.getClass(), "traitPoints", (byte) -76);
        Object term101108 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term101108, term101108.getClass(), "traitId", null);
        setField(term101108, term101108.getClass(), "traitName", null);
        setField(term101108, term101108.getClass(), "description", null);
        setField(term101108, term101108.getClass(), "group", null);
        setField(term101108, term101108.getClass(), "conflictsWithIds", null);
        setByteField(term101108, term101108.getClass(), "traitPoints", (byte) -87);
        Object term101110 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term101110, term101110.getClass(), "traitId", null);
        setField(term101110, term101110.getClass(), "traitName", null);
        setField(term101110, term101110.getClass(), "description", null);
        setField(term101110, term101110.getClass(), "group", null);
        setField(term101110, term101110.getClass(), "conflictsWithIds", null);
        setByteField(term101110, term101110.getClass(), "traitPoints", (byte) 108);
        ArrayList term101104 = new ArrayList();
        ((ArrayList) term101104).add(term101106);
        ((ArrayList) term101104).add(term101108);
        ((ArrayList) term101104).add(term101110);
        Class<? extends Object> term102075 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term102074 = ((Class) term102075).getDeclaredField((String) "BIG_PLANT");
        ((Field) term102074).setAccessible(true);
        Object enum278 = ((Field) term102074).get((Object) null);
        Class<? extends Object> term102379 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term102378 = ((Class) term102379).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term102378).setAccessible(true);
        Object enum279 = ((Field) term102378).get((Object) null);
        term100927 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.FleetTileInfo"));
        Object term100928 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term101065 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term100928, term100928.getClass(), "id", "hJCqADrhuV");
        setField(term100928, term100928.getClass(), "name", "RyPUBlRpNZ");
        setField(term100928, term100928.getClass(), "nameSingle", "ardfVpCueq");
        setField(term100928, term100928.getClass(), "attitude", enum275);
        setField(term100928, term100928.getClass(), "imagePath", "wEYAmGJIEF");
        setField(term100928, term100928.getClass(), "bridgeId", "iXEhfXJomO");
        setField(term100928, term100928.getClass(), "spaceShipId", "KEoUMzNdMA");
        setField(term100928, term100928.getClass(), "socialSystem", enum276);
        setField(term100928, term100928.getClass(), "genderList", term101031);
        setField(term100928, term100928.getClass(), "speechSetId", "SOsGYAgpgW");
        setField(term100928, term100928.getClass(), "bridgeEffect", enum277);
        setField(term101065, term101065.getClass(), "songName", "ZBafuLDRDM");
        setField(term101065, term101065.getClass(), "author", "VDnsNuhEvG");
        setField(term101065, term101065.getClass(), "fileName", "DMrfMwXyYT");
        setBooleanField(term101065, term101065.getClass(), "custom", false);
        setIntField(term101065, term101065.getClass(), "fadingLimit", 274237632);
        setField(term100928, term100928.getClass(), "diplomacyMusic", term101065);
        setField(term100928, term100928.getClass(), "traits", term101104);
        setField(term100928, term100928.getClass(), "leaderNameGenerator", enum278);
        setField(term100928, term100928.getClass(), "description", "eUhEGNLBOk");
        setField(term100928, term100928.getClass(), "spaceRaceType", enum279);
        setField(term100927, term100927.getClass(), "race", term100928);
        setIntField(term100927, term100927.getClass(), "imageIndex", -1033663489);
        setIntField(term100927, term100927.getClass(), "playerIndex", 476488543);
        setIntField(term100927, term100927.getClass(), "fleetIndex", -1626915417);
        setIntField(term100927, term100927.getClass(), "planetIndex", 665442653);
        setIntField(term100927, term100927.getClass(), "conflictIndex", 803178808);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.FleetTileInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConflictIndex", argTypes, term100927, args);
    }

};


