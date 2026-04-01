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

public class FleetTileInfo_setPlanetIndex_110812714613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106993;
     Object term107230;

    public FleetTileInfo_setPlanetIndex_110812714613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term107263 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term107262 = ((Class) term107263).getDeclaredField((String) "PEACEFUL");
        ((Field) term107262).setAccessible(true);
        Object enum294 = ((Field) term107262).get((Object) null);
        Class<? extends Object> term107554 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term107553 = ((Class) term107554).getDeclaredField((String) "PATRIARCHY");
        ((Field) term107553).setAccessible(true);
        Object enum295 = ((Field) term107553).get((Object) null);
        Class<? extends Object> term107816 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term107815 = ((Class) term107816).getDeclaredField((String) "MALE");
        ((Field) term107815).setAccessible(true);
        Object enum296 =  ((Field) term107815).get((Object) null);
        Class<? extends Object> term108040 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term108039 = ((Class) term108040).getDeclaredField((String) "MALE");
        ((Field) term108039).setAccessible(true);
        Object enum297 =  ((Field) term108039).get((Object) null);
        ArrayList term107093 = new ArrayList();
        ((ArrayList) term107093).add(enum296);
        ((ArrayList) term107093).add(enum296);
        ((ArrayList) term107093).add(enum297);
        ((ArrayList) term107093).add(enum296);
        Class<? extends Object> term108274 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term108273 = ((Class) term108274).getDeclaredField((String) "JUNGLE");
        ((Field) term108273).setAccessible(true);
        Object enum298 = ((Field) term108273).get((Object) null);
        Object term107166 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term107166, term107166.getClass(), "traitId", null);
        setField(term107166, term107166.getClass(), "traitName", null);
        setField(term107166, term107166.getClass(), "description", null);
        setField(term107166, term107166.getClass(), "group", null);
        setField(term107166, term107166.getClass(), "conflictsWithIds", null);
        setByteField(term107166, term107166.getClass(), "traitPoints", (byte) 121);
        Object term107168 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term107168, term107168.getClass(), "traitId", null);
        setField(term107168, term107168.getClass(), "traitName", null);
        setField(term107168, term107168.getClass(), "description", null);
        setField(term107168, term107168.getClass(), "group", null);
        setField(term107168, term107168.getClass(), "conflictsWithIds", null);
        setByteField(term107168, term107168.getClass(), "traitPoints", (byte) 83);
        Object term107170 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term107170, term107170.getClass(), "traitId", null);
        setField(term107170, term107170.getClass(), "traitName", null);
        setField(term107170, term107170.getClass(), "description", null);
        setField(term107170, term107170.getClass(), "group", null);
        setField(term107170, term107170.getClass(), "conflictsWithIds", null);
        setByteField(term107170, term107170.getClass(), "traitPoints", (byte) -2);
        Object term107172 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term107172, term107172.getClass(), "traitId", null);
        setField(term107172, term107172.getClass(), "traitName", null);
        setField(term107172, term107172.getClass(), "description", null);
        setField(term107172, term107172.getClass(), "group", null);
        setField(term107172, term107172.getClass(), "conflictsWithIds", null);
        setByteField(term107172, term107172.getClass(), "traitPoints", (byte) 101);
        Object term107174 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term107174, term107174.getClass(), "traitId", null);
        setField(term107174, term107174.getClass(), "traitName", null);
        setField(term107174, term107174.getClass(), "description", null);
        setField(term107174, term107174.getClass(), "group", null);
        setField(term107174, term107174.getClass(), "conflictsWithIds", null);
        setByteField(term107174, term107174.getClass(), "traitPoints", (byte) 14);
        Object term107176 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term107176, term107176.getClass(), "traitId", null);
        setField(term107176, term107176.getClass(), "traitName", null);
        setField(term107176, term107176.getClass(), "description", null);
        setField(term107176, term107176.getClass(), "group", null);
        setField(term107176, term107176.getClass(), "conflictsWithIds", null);
        setByteField(term107176, term107176.getClass(), "traitPoints", (byte) 106);
        ArrayList term107164 = new ArrayList();
        ((ArrayList) term107164).add(term107166);
        ((ArrayList) term107164).add(term107168);
        ((ArrayList) term107164).add(term107170);
        ((ArrayList) term107164).add(term107172);
        ((ArrayList) term107164).add(term107174);
        ((ArrayList) term107164).add(term107176);
        Class<? extends Object> term108559 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term108558 = ((Class) term108559).getDeclaredField((String) "DEEP_CREATURE");
        ((Field) term108558).setAccessible(true);
        Object enum299 = ((Field) term108558).get((Object) null);
        Class<? extends Object> term108875 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term108874 = ((Class) term108875).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term108874).setAccessible(true);
        Object enum300 = ((Field) term108874).get((Object) null);
        term106993 = newInstance(Class.forName("org.openRealmOfStars.mapTiles.FleetTileInfo"));
        Object term106994 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term107125 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term106994, term106994.getClass(), "id", "yuvBFZQJBJ");
        setField(term106994, term106994.getClass(), "name", "prymoiXBsv");
        setField(term106994, term106994.getClass(), "nameSingle", "XVkgypnsVx");
        setField(term106994, term106994.getClass(), "attitude", enum294);
        setField(term106994, term106994.getClass(), "imagePath", "TwXzbEYFtG");
        setField(term106994, term106994.getClass(), "bridgeId", "mRdoimcRwz");
        setField(term106994, term106994.getClass(), "spaceShipId", "dxJDKuPPPM");
        setField(term106994, term106994.getClass(), "socialSystem", enum295);
        setField(term106994, term106994.getClass(), "genderList", term107093);
        setField(term106994, term106994.getClass(), "speechSetId", "rXBuuDWXsm");
        setField(term106994, term106994.getClass(), "bridgeEffect", enum298);
        setField(term107125, term107125.getClass(), "songName", "VSvKttZYSC");
        setField(term107125, term107125.getClass(), "author", "bbwxScASWL");
        setField(term107125, term107125.getClass(), "fileName", "BXJdQmJvFh");
        setBooleanField(term107125, term107125.getClass(), "custom", true);
        setIntField(term107125, term107125.getClass(), "fadingLimit", -813178856);
        setField(term106994, term106994.getClass(), "diplomacyMusic", term107125);
        setField(term106994, term106994.getClass(), "traits", term107164);
        setField(term106994, term106994.getClass(), "leaderNameGenerator", enum299);
        setField(term106994, term106994.getClass(), "description", "xxswizwuwy");
        setField(term106994, term106994.getClass(), "spaceRaceType", enum300);
        setField(term106993, term106993.getClass(), "race", term106994);
        setIntField(term106993, term106993.getClass(), "imageIndex", 1591732055);
        setIntField(term106993, term106993.getClass(), "playerIndex", -1580446775);
        setIntField(term106993, term106993.getClass(), "fleetIndex", -1008507790);
        setIntField(term106993, term106993.getClass(), "planetIndex", -1382203900);
        setIntField(term106993, term106993.getClass(), "conflictIndex", -2140997236);
        term107230 = new Integer(-1868254835);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.mapTiles.FleetTileInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term107230;
        callMethod(klass, "setPlanetIndex", argTypes, term106993, args);
    }

};


