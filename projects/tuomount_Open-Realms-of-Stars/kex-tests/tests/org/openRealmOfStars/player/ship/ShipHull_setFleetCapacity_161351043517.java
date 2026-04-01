package org.openRealmOfStars.player.ship;

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
import static org.openRealmOfStars.player.ship.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Double;

public class ShipHull_setFleetCapacity_161351043517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term526869;
     Object term527120;

    public ShipHull_setFleetCapacity_161351043517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term527133 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipHullType");
        Field term527132 = ((Class) term527133).getDeclaredField((String) "PROBE");
        ((Field) term527132).setAccessible(true);
        Object enum1672 = ((Field) term527132).get((Object) null);
        Class<? extends Object> term527380 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipSize");
        Field term527379 = ((Class) term527380).getDeclaredField((String) "SMALL");
        ((Field) term527379).setAccessible(true);
        Object enum1673 = ((Field) term527379).get((Object) null);
        Class<? extends Object> term527637 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term527636 = ((Class) term527637).getDeclaredField((String) "DIPLOMATIC");
        ((Field) term527636).setAccessible(true);
        Object enum1674 = ((Field) term527636).get((Object) null);
        Class<? extends Object> term527934 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term527933 = ((Class) term527934).getDeclaredField((String) "EQUAL");
        ((Field) term527933).setAccessible(true);
        Object enum1675 = ((Field) term527933).get((Object) null);
        ArrayList term527003 = new ArrayList();
        Class<? extends Object> term528191 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term528190 = ((Class) term528191).getDeclaredField((String) "NUKE_START");
        ((Field) term528190).setAccessible(true);
        Object enum1676 = ((Field) term528190).get((Object) null);
        Object term527074 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term527074, term527074.getClass(), "traitId", null);
        setField(term527074, term527074.getClass(), "traitName", null);
        setField(term527074, term527074.getClass(), "description", null);
        setField(term527074, term527074.getClass(), "group", null);
        setField(term527074, term527074.getClass(), "conflictsWithIds", null);
        setByteField(term527074, term527074.getClass(), "traitPoints", (byte) -110);
        ArrayList term527072 = new ArrayList();
        ((ArrayList) term527072).add(term527074);
        Class<? extends Object> term528488 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term528487 = ((Class) term528488).getDeclaredField((String) "SPACE_ORC");
        ((Field) term528487).setAccessible(true);
        Object enum1677 = ((Field) term528487).get((Object) null);
        Class<? extends Object> term528792 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term528791 = ((Class) term528792).getDeclaredField((String) "SPACE_MONSTER");
        ((Field) term528791).setAccessible(true);
        Object enum1678 = ((Field) term528791).get((Object) null);
        term526869 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        Object term526907 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term527033 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setIntField(term526869, term526869.getClass(), "index", -365807826);
        setField(term526869, term526869.getClass(), "name", "ZztKsgSkHX");
        setIntField(term526869, term526869.getClass(), "maxSlot", -1527783758);
        setIntField(term526869, term526869.getClass(), "slotHull", 1611976687);
        setField(term526869, term526869.getClass(), "hullType", enum1672);
        setField(term526869, term526869.getClass(), "size", enum1673);
        setIntField(term526869, term526869.getClass(), "cost", -1847574054);
        setIntField(term526869, term526869.getClass(), "metalCost", -1096876519);
        setIntField(term526869, term526869.getClass(), "imageIndex", -1260030158);
        setDoubleField(term526869, term526869.getClass(), "fleetCapacity", 0.3505219043338702);
        setField(term526907, term526907.getClass(), "id", "taCiThbobc");
        setField(term526907, term526907.getClass(), "name", "xlApFwpDKn");
        setField(term526907, term526907.getClass(), "nameSingle", "jXgNLKcRBx");
        setField(term526907, term526907.getClass(), "attitude", enum1674);
        setField(term526907, term526907.getClass(), "imagePath", "OsFcDUKtJs");
        setField(term526907, term526907.getClass(), "bridgeId", "ccKkfIWfHx");
        setField(term526907, term526907.getClass(), "spaceShipId", "GcWOaFtXuP");
        setField(term526907, term526907.getClass(), "socialSystem", enum1675);
        setField(term526907, term526907.getClass(), "genderList", term527003);
        setField(term526907, term526907.getClass(), "speechSetId", "wXBKBnDCES");
        setField(term526907, term526907.getClass(), "bridgeEffect", enum1676);
        setField(term527033, term527033.getClass(), "songName", "tIsiPqGOqK");
        setField(term527033, term527033.getClass(), "author", "bqnCUgRFQQ");
        setField(term527033, term527033.getClass(), "fileName", "fDtpiKvQmR");
        setBooleanField(term527033, term527033.getClass(), "custom", true);
        setIntField(term527033, term527033.getClass(), "fadingLimit", -1556763879);
        setField(term526907, term526907.getClass(), "diplomacyMusic", term527033);
        setField(term526907, term526907.getClass(), "traits", term527072);
        setField(term526907, term526907.getClass(), "leaderNameGenerator", enum1677);
        setField(term526907, term526907.getClass(), "description", "ribkbLXDFH");
        setField(term526907, term526907.getClass(), "spaceRaceType", enum1678);
        setField(term526869, term526869.getClass(), "originalBuilder", term526907);
        term527120 = new Double(0.9926072201505048);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipHull");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term527120;
        callMethod(klass, "setFleetCapacity", argTypes, term526869, args);
    }

};


