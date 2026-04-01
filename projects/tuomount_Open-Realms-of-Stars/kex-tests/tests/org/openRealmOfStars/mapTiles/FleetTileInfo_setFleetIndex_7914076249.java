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
import java.lang.Integer;

public class FleetTileInfo_setFleetIndex_7914076249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98777;
     Object term99016;

    public FleetTileInfo_setFleetIndex_7914076249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term99049 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term99048 = ((Class) term99049).getDeclaredField((String) "PEACEFUL");
        ((Field) term99048).setAccessible(true);
        Object enum268 = ((Field) term99048).get((Object) null);
        Class<? extends Object> term99340 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term99339 = ((Class) term99340).getDeclaredField((String) "MATRIARCHY");
        ((Field) term99339).setAccessible(true);
        Object enum269 = ((Field) term99339).get((Object) null);
        Class<? extends Object> term99602 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term99601 = ((Class) term99602).getDeclaredField((String) "FEMALE");
        ((Field) term99601).setAccessible(true);
        Object enum270 =  ((Field) term99601).get((Object) null);
        Class<? extends Object> term99832 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term99831 = ((Class) term99832).getDeclaredField((String) "NONE");
        ((Field) term99831).setAccessible(true);
        Object enum271 =  ((Field) term99831).get((Object) null);
        ArrayList term98877 = new ArrayList();
        ((ArrayList) term98877).add(enum270);
        ((ArrayList) term98877).add(enum271);
        ((ArrayList) term98877).add(enum271);
        ((ArrayList) term98877).add(enum270);
        ((ArrayList) term98877).add(enum270);
        ((ArrayList) term98877).add(enum270);
        ((ArrayList) term98877).add(enum270);
        Class<? extends Object> term100066 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term100065 = ((Class) term100066).getDeclaredField((String) "FADE_IN");
        ((Field) term100065).setAccessible(true);
        Object enum272 = ((Field) term100065).get((Object) null);
        Object term98951 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term98951, term98951.getClass(), "traitId", null);
        setField(term98951, term98951.getClass(), "traitName", null);
        setField(term98951, term98951.getClass(), "description", null);
        setField(term98951, term98951.getClass(), "group", null);
        setField(term98951, term98951.getClass(), "conflictsWithIds", null);
        setByteField(term98951, term98951.getClass(), "traitPoints", (byte) -43);
        Object term98953 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term98953, term98953.getClass(), "traitId", null);
        setField(term98953, term98953.getClass(), "traitName", null);
        setField(term98953, term98953.getClass(), "description", null);
        setField(term98953, term98953.getClass(), "group", null);
        setField(term98953, term98953.getClass(), "conflictsWithIds", null);
        setByteField(term98953, term98953.getClass(), "traitPoints", (byte) 35);
        Object term98955 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term98955, term98955.getClass(), "traitId", null);
        setField(term98955, term98955.getClass(), "traitName", null);
        setField(term98955, term98955.getClass(), "description", null);
        setField(term98955, term98955.getClass(), "group", null);
        setField(term98955, term98955.getClass(), "conflictsWithIds", null);
        setByteField(term98955, term98955.getClass(), "traitPoints", (byte) 62);
        Object term98957 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term98957, term98957.getClass(), "traitId", null);
        setField(term98957, term98957.getClass(), "traitName", null);
        setField(term98957, term98957.getClass(), "description", null);
        setField(term98957, term98957.getClass(), "group", null);
        setField(term98957, term98957.getClass(), "conflictsWithIds", null);
        setByteField(term98957, term98957.getClass(), "traitPoints", (byte) 90);
        Object term98959 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term98959, term98959.getClass(), "traitId", null);
        setField(term98959, term98959.getClass(), "traitName", null);
        setField(term98959, term98959.getClass(), "description", null);
        setField(term98959, term98959.getClass(), "group", null);
        setField(term98959, term98959.getClass(), "conflictsWithIds", null);
        setByteField(term98959, term98959.getClass(), "traitPoints", (byte) -40);
        Object term98961 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term98961, term98961.getClass(), "traitId", null);
        setField(term98961, term98961.getClass(), "traitName", null);
        setField(term98961, term98961.getClass(), "description", null);
        setField(term98961, term98961.getClass(), "group", null);
        setField(term98961, term98961.getClass(), "conflictsWithIds", null);
        setByteField(term98961, term98961.getClass(), "traitPoints", (byte) 79);
        Object term98963 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term98963, term98963.getClass(), "traitId", null);
        setField(term98963, term98963.getClass(), "traitName", null);
        setField(term98963, term98963.getClass(), "description", null);
        setField(term98963, term98963.getClass(), "group", null);
        setField(term98963, term98963.getClass(), "conflictsWithIds", null);
        setByteField(term98963, term98963.getClass(), "traitPoints", (byte) -102);
        Object term98965 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term98965, term98965.getClass(), "traitId", null);
        setField(term98965, term98965.getClass(), "traitName", null);
        setField(term98965, term98965.getClass(), "description", null);
        setField(term98965, term98965.getClass(), "group", null);
        setField(term98965, term98965.getClass(), "conflictsWithIds", null);
        setByteField(term98965, term98965.getClass(), "traitPoints", (byte) 55);
        Object term98967 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term98967, term98967.getClass(), "traitId", null);
        setField(term98967, term98967.getClass(), "traitName", null);
        setField(term98967, term98967.getClass(), "description", null);
        setField(term98967, term98967.getClass(), "group", null);
        setField(term98967, term98967.getClass(), "conflictsWithIds", null);
        setByteField(term98967, term98967.getClass(), "traitPoints", (byte) -63);
        ArrayList term98949 = new ArrayList();
        ((ArrayList) term98949).add(term98951);
        ((ArrayList) term98949).add(term98953);
        ((ArrayList) term98949).add(term98955);
        ((ArrayList) term98949).add(term98957);
        ((ArrayList) term98949).add(term98959);
        ((ArrayList) term98949).add(term98961);
        ((ArrayList) term98949).add(term98963);
        ((ArrayList) term98949).add(term98965);
        ((ArrayList) term98949).add(term98967);
        Class<? extends Object> term100354 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term100353 = ((Class) term100354).getDeclaredField((String) "ANCIENT_ROMAN");
        ((Field) term100353).setAccessible(true);
        Object enum273 = ((Field) term100353).get((Object) null);
        Class<? extends Object> term100670 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term100669 = ((Class) term100670).getDeclaredField((String) "REGULAR");
        ((Field) term100669).setAccessible(true);
        Object enum274 = ((Field) term100669).get((Object) null);
        term98777 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.FleetTileInfo"));
        Object term98778 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term98910 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term98778, term98778.getClass(), "id", "jesZbitPYU");
        setField(term98778, term98778.getClass(), "name", "oIbEvXxpda");
        setField(term98778, term98778.getClass(), "nameSingle", "QyHVDeaOqb");
        setField(term98778, term98778.getClass(), "attitude", enum268);
        setField(term98778, term98778.getClass(), "imagePath", "ZwnEWySrcE");
        setField(term98778, term98778.getClass(), "bridgeId", "laQWfyDqCq");
        setField(term98778, term98778.getClass(), "spaceShipId", "gMFGfpbPZE");
        setField(term98778, term98778.getClass(), "socialSystem", enum269);
        setField(term98778, term98778.getClass(), "genderList", term98877);
        setField(term98778, term98778.getClass(), "speechSetId", "QcfydYbOGP");
        setField(term98778, term98778.getClass(), "bridgeEffect", enum272);
        setField(term98910, term98910.getClass(), "songName", "FdMzwKizAk");
        setField(term98910, term98910.getClass(), "author", "jjwHVTqCkP");
        setField(term98910, term98910.getClass(), "fileName", "uUAkxSFPyL");
        setBooleanField(term98910, term98910.getClass(), "custom", true);
        setIntField(term98910, term98910.getClass(), "fadingLimit", -77377900);
        setField(term98778, term98778.getClass(), "diplomacyMusic", term98910);
        setField(term98778, term98778.getClass(), "traits", term98949);
        setField(term98778, term98778.getClass(), "leaderNameGenerator", enum273);
        setField(term98778, term98778.getClass(), "description", "uJhRRqAnDP");
        setField(term98778, term98778.getClass(), "spaceRaceType", enum274);
        setField(term98777, term98777.getClass(), "race", term98778);
        setIntField(term98777, term98777.getClass(), "imageIndex", 199979610);
        setIntField(term98777, term98777.getClass(), "playerIndex", -605796164);
        setIntField(term98777, term98777.getClass(), "fleetIndex", -931072478);
        setIntField(term98777, term98777.getClass(), "planetIndex", 2032311568);
        setIntField(term98777, term98777.getClass(), "conflictIndex", 92598850);
        term99016 = new Integer(1856498878);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.FleetTileInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term99016;
        callMethod(klass, "setFleetIndex", argTypes, term98777, args);
    }

};


