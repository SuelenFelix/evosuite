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

public class ShipHull_getName_9837338328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term502295;

    public ShipHull_getName_9837338328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term502576 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipHullType");
        Field term502575 = ((Class) term502576).getDeclaredField((String) "PROBE");
        ((Field) term502575).setAccessible(true);
        Object enum1589 = ((Field) term502575).get((Object) null);
        Class<? extends Object> term502823 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipSize");
        Field term502822 = ((Class) term502823).getDeclaredField((String) "HUGE");
        ((Field) term502822).setAccessible(true);
        Object enum1590 = ((Field) term502822).get((Object) null);
        Class<? extends Object> term503077 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term503076 = ((Class) term503077).getDeclaredField((String) "LOGICAL");
        ((Field) term503076).setAccessible(true);
        Object enum1591 = ((Field) term503076).get((Object) null);
        Class<? extends Object> term503365 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term503364 = ((Class) term503365).getDeclaredField((String) "MATRIARCHY");
        ((Field) term503364).setAccessible(true);
        Object enum1592 = ((Field) term503364).get((Object) null);
        Class<? extends Object> term503627 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term503626 = ((Class) term503627).getDeclaredField((String) "MALE");
        ((Field) term503626).setAccessible(true);
        Object enum1593 =  ((Field) term503626).get((Object) null);
        Class<? extends Object> term503851 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term503850 = ((Class) term503851).getDeclaredField((String) "MALE");
        ((Field) term503850).setAccessible(true);
        Object enum1594 =  ((Field) term503850).get((Object) null);
        Class<? extends Object> term504075 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term504074 = ((Class) term504075).getDeclaredField((String) "FEMALE");
        ((Field) term504074).setAccessible(true);
        Object enum1595 =  ((Field) term504074).get((Object) null);
        ArrayList term502430 = new ArrayList();
        ((ArrayList) term502430).add(enum1593);
        ((ArrayList) term502430).add(enum1594);
        ((ArrayList) term502430).add(enum1593);
        ((ArrayList) term502430).add(enum1594);
        ((ArrayList) term502430).add(enum1595);
        ((ArrayList) term502430).add(enum1595);
        ((ArrayList) term502430).add(enum1595);
        ((ArrayList) term502430).add(enum1595);
        ((ArrayList) term502430).add(enum1594);
        Class<? extends Object> term504315 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term504314 = ((Class) term504315).getDeclaredField((String) "BRIGHT_CYAN");
        ((Field) term504314).setAccessible(true);
        Object enum1596 = ((Field) term504314).get((Object) null);
        Object term502511 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term502511, term502511.getClass(), "traitId", null);
        setField(term502511, term502511.getClass(), "traitName", null);
        setField(term502511, term502511.getClass(), "description", null);
        setField(term502511, term502511.getClass(), "group", null);
        setField(term502511, term502511.getClass(), "conflictsWithIds", null);
        setByteField(term502511, term502511.getClass(), "traitPoints", (byte) -111);
        Object term502513 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term502513, term502513.getClass(), "traitId", null);
        setField(term502513, term502513.getClass(), "traitName", null);
        setField(term502513, term502513.getClass(), "description", null);
        setField(term502513, term502513.getClass(), "group", null);
        setField(term502513, term502513.getClass(), "conflictsWithIds", null);
        setByteField(term502513, term502513.getClass(), "traitPoints", (byte) 1);
        Object term502515 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term502515, term502515.getClass(), "traitId", null);
        setField(term502515, term502515.getClass(), "traitName", null);
        setField(term502515, term502515.getClass(), "description", null);
        setField(term502515, term502515.getClass(), "group", null);
        setField(term502515, term502515.getClass(), "conflictsWithIds", null);
        setByteField(term502515, term502515.getClass(), "traitPoints", (byte) -65);
        Object term502517 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term502517, term502517.getClass(), "traitId", null);
        setField(term502517, term502517.getClass(), "traitName", null);
        setField(term502517, term502517.getClass(), "description", null);
        setField(term502517, term502517.getClass(), "group", null);
        setField(term502517, term502517.getClass(), "conflictsWithIds", null);
        setByteField(term502517, term502517.getClass(), "traitPoints", (byte) -116);
        Object term502519 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term502519, term502519.getClass(), "traitId", null);
        setField(term502519, term502519.getClass(), "traitName", null);
        setField(term502519, term502519.getClass(), "description", null);
        setField(term502519, term502519.getClass(), "group", null);
        setField(term502519, term502519.getClass(), "conflictsWithIds", null);
        setByteField(term502519, term502519.getClass(), "traitPoints", (byte) -52);
        Object term502521 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term502521, term502521.getClass(), "traitId", null);
        setField(term502521, term502521.getClass(), "traitName", null);
        setField(term502521, term502521.getClass(), "description", null);
        setField(term502521, term502521.getClass(), "group", null);
        setField(term502521, term502521.getClass(), "conflictsWithIds", null);
        setByteField(term502521, term502521.getClass(), "traitPoints", (byte) -24);
        Object term502523 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term502523, term502523.getClass(), "traitId", null);
        setField(term502523, term502523.getClass(), "traitName", null);
        setField(term502523, term502523.getClass(), "description", null);
        setField(term502523, term502523.getClass(), "group", null);
        setField(term502523, term502523.getClass(), "conflictsWithIds", null);
        setByteField(term502523, term502523.getClass(), "traitPoints", (byte) -91);
        ArrayList term502509 = new ArrayList();
        ((ArrayList) term502509).add(term502511);
        ((ArrayList) term502509).add(term502513);
        ((ArrayList) term502509).add(term502515);
        ((ArrayList) term502509).add(term502517);
        ((ArrayList) term502509).add(term502519);
        ((ArrayList) term502509).add(term502521);
        ((ArrayList) term502509).add(term502523);
        Class<? extends Object> term504615 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term504614 = ((Class) term504615).getDeclaredField((String) "SCIFI_HUMAN");
        ((Field) term504614).setAccessible(true);
        Object enum1597 = ((Field) term504614).get((Object) null);
        Class<? extends Object> term504925 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term504924 = ((Class) term504925).getDeclaredField((String) "REGULAR");
        ((Field) term504924).setAccessible(true);
        Object enum1598 = ((Field) term504924).get((Object) null);
        term502295 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        Object term502332 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term502470 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setIntField(term502295, term502295.getClass(), "index", -6894071);
        setField(term502295, term502295.getClass(), "name", "nUKWXpkdOn");
        setIntField(term502295, term502295.getClass(), "maxSlot", 958532517);
        setIntField(term502295, term502295.getClass(), "slotHull", 1383798608);
        setField(term502295, term502295.getClass(), "hullType", enum1589);
        setField(term502295, term502295.getClass(), "size", enum1590);
        setIntField(term502295, term502295.getClass(), "cost", -238731977);
        setIntField(term502295, term502295.getClass(), "metalCost", -602134389);
        setIntField(term502295, term502295.getClass(), "imageIndex", 298623505);
        setDoubleField(term502295, term502295.getClass(), "fleetCapacity", 0.9711083796772954);
        setField(term502332, term502332.getClass(), "id", "bjxyKMjXrD");
        setField(term502332, term502332.getClass(), "name", "ryGcwvKsnG");
        setField(term502332, term502332.getClass(), "nameSingle", "YfYzzRDpwX");
        setField(term502332, term502332.getClass(), "attitude", enum1591);
        setField(term502332, term502332.getClass(), "imagePath", "iLdntHNLlb");
        setField(term502332, term502332.getClass(), "bridgeId", "dmtvGoPFMz");
        setField(term502332, term502332.getClass(), "spaceShipId", "omCAshLFBc");
        setField(term502332, term502332.getClass(), "socialSystem", enum1592);
        setField(term502332, term502332.getClass(), "genderList", term502430);
        setField(term502332, term502332.getClass(), "speechSetId", "FOiAoOHenu");
        setField(term502332, term502332.getClass(), "bridgeEffect", enum1596);
        setField(term502470, term502470.getClass(), "songName", "oBoiwmmBsG");
        setField(term502470, term502470.getClass(), "author", "RkVhhbbrDb");
        setField(term502470, term502470.getClass(), "fileName", "YRIQOuomci");
        setBooleanField(term502470, term502470.getClass(), "custom", false);
        setIntField(term502470, term502470.getClass(), "fadingLimit", -45942937);
        setField(term502332, term502332.getClass(), "diplomacyMusic", term502470);
        setField(term502332, term502332.getClass(), "traits", term502509);
        setField(term502332, term502332.getClass(), "leaderNameGenerator", enum1597);
        setField(term502332, term502332.getClass(), "description", "WaKfMegDHZ");
        setField(term502332, term502332.getClass(), "spaceRaceType", enum1598);
        setField(term502295, term502295.getClass(), "originalBuilder", term502332);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipHull");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term502295, args);
    }

};


