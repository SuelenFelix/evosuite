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

public class ShipHull_getDefenseValueByShipHullSize_138205919419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term532002;

    public ShipHull_getDefenseValueByShipHullSize_138205919419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term532292 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipHullType");
        Field term532291 = ((Class) term532292).getDeclaredField((String) "STARBASE");
        ((Field) term532291).setAccessible(true);
        Object enum1689 = ((Field) term532291).get((Object) null);
        Class<? extends Object> term532548 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipSize");
        Field term532547 = ((Class) term532548).getDeclaredField((String) "HUGE");
        ((Field) term532547).setAccessible(true);
        Object enum1690 = ((Field) term532547).get((Object) null);
        Class<? extends Object> term532802 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term532801 = ((Class) term532802).getDeclaredField((String) "LOGICAL");
        ((Field) term532801).setAccessible(true);
        Object enum1691 = ((Field) term532801).get((Object) null);
        Class<? extends Object> term533090 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term533089 = ((Class) term533090).getDeclaredField((String) "PATRIARCHY");
        ((Field) term533089).setAccessible(true);
        Object enum1692 = ((Field) term533089).get((Object) null);
        Class<? extends Object> term533352 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term533351 = ((Class) term533352).getDeclaredField((String) "NONE");
        ((Field) term533351).setAccessible(true);
        Object enum1693 =  ((Field) term533351).get((Object) null);
        Class<? extends Object> term533576 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term533575 = ((Class) term533576).getDeclaredField((String) "MALE");
        ((Field) term533575).setAccessible(true);
        Object enum1694 =  ((Field) term533575).get((Object) null);
        Class<? extends Object> term533800 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term533799 = ((Class) term533800).getDeclaredField((String) "FEMALE");
        ((Field) term533799).setAccessible(true);
        Object enum1695 =  ((Field) term533799).get((Object) null);
        ArrayList term532140 = new ArrayList();
        ((ArrayList) term532140).add(enum1693);
        ((ArrayList) term532140).add(enum1693);
        ((ArrayList) term532140).add(enum1694);
        ((ArrayList) term532140).add(enum1693);
        ((ArrayList) term532140).add(enum1694);
        ((ArrayList) term532140).add(enum1693);
        ((ArrayList) term532140).add(enum1695);
        Class<? extends Object> term534040 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term534039 = ((Class) term534040).getDeclaredField((String) "SPACE_CONSOLE2");
        ((Field) term534039).setAccessible(true);
        Object enum1696 = ((Field) term534039).get((Object) null);
        Object term532224 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term532224, term532224.getClass(), "traitId", null);
        setField(term532224, term532224.getClass(), "traitName", null);
        setField(term532224, term532224.getClass(), "description", null);
        setField(term532224, term532224.getClass(), "group", null);
        setField(term532224, term532224.getClass(), "conflictsWithIds", null);
        setByteField(term532224, term532224.getClass(), "traitPoints", (byte) 44);
        Object term532226 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term532226, term532226.getClass(), "traitId", null);
        setField(term532226, term532226.getClass(), "traitName", null);
        setField(term532226, term532226.getClass(), "description", null);
        setField(term532226, term532226.getClass(), "group", null);
        setField(term532226, term532226.getClass(), "conflictsWithIds", null);
        setByteField(term532226, term532226.getClass(), "traitPoints", (byte) 60);
        Object term532228 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term532228, term532228.getClass(), "traitId", null);
        setField(term532228, term532228.getClass(), "traitName", null);
        setField(term532228, term532228.getClass(), "description", null);
        setField(term532228, term532228.getClass(), "group", null);
        setField(term532228, term532228.getClass(), "conflictsWithIds", null);
        setByteField(term532228, term532228.getClass(), "traitPoints", (byte) 94);
        Object term532230 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term532230, term532230.getClass(), "traitId", null);
        setField(term532230, term532230.getClass(), "traitName", null);
        setField(term532230, term532230.getClass(), "description", null);
        setField(term532230, term532230.getClass(), "group", null);
        setField(term532230, term532230.getClass(), "conflictsWithIds", null);
        setByteField(term532230, term532230.getClass(), "traitPoints", (byte) 19);
        Object term532232 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term532232, term532232.getClass(), "traitId", null);
        setField(term532232, term532232.getClass(), "traitName", null);
        setField(term532232, term532232.getClass(), "description", null);
        setField(term532232, term532232.getClass(), "group", null);
        setField(term532232, term532232.getClass(), "conflictsWithIds", null);
        setByteField(term532232, term532232.getClass(), "traitPoints", (byte) 15);
        Object term532234 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term532234, term532234.getClass(), "traitId", null);
        setField(term532234, term532234.getClass(), "traitName", null);
        setField(term532234, term532234.getClass(), "description", null);
        setField(term532234, term532234.getClass(), "group", null);
        setField(term532234, term532234.getClass(), "conflictsWithIds", null);
        setByteField(term532234, term532234.getClass(), "traitPoints", (byte) -19);
        Object term532236 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term532236, term532236.getClass(), "traitId", null);
        setField(term532236, term532236.getClass(), "traitName", null);
        setField(term532236, term532236.getClass(), "description", null);
        setField(term532236, term532236.getClass(), "group", null);
        setField(term532236, term532236.getClass(), "conflictsWithIds", null);
        setByteField(term532236, term532236.getClass(), "traitPoints", (byte) -55);
        ArrayList term532222 = new ArrayList();
        ((ArrayList) term532222).add(term532224);
        ((ArrayList) term532222).add(term532226);
        ((ArrayList) term532222).add(term532228);
        ((ArrayList) term532222).add(term532230);
        ((ArrayList) term532222).add(term532232);
        ((ArrayList) term532222).add(term532234);
        ((ArrayList) term532222).add(term532236);
        Class<? extends Object> term534349 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term534348 = ((Class) term534349).getDeclaredField((String) "BIG_PLANT");
        ((Field) term534348).setAccessible(true);
        Object enum1697 = ((Field) term534348).get((Object) null);
        Class<? extends Object> term534653 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term534652 = ((Class) term534653).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term534652).setAccessible(true);
        Object enum1698 = ((Field) term534652).get((Object) null);
        term532002 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        Object term532042 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term532183 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setIntField(term532002, term532002.getClass(), "index", -1991471366);
        setField(term532002, term532002.getClass(), "name", "fIoQOZeoVK");
        setIntField(term532002, term532002.getClass(), "maxSlot", -951732964);
        setIntField(term532002, term532002.getClass(), "slotHull", 810582577);
        setField(term532002, term532002.getClass(), "hullType", enum1689);
        setField(term532002, term532002.getClass(), "size", enum1690);
        setIntField(term532002, term532002.getClass(), "cost", -481913428);
        setIntField(term532002, term532002.getClass(), "metalCost", 1878857053);
        setIntField(term532002, term532002.getClass(), "imageIndex", -1703968608);
        setDoubleField(term532002, term532002.getClass(), "fleetCapacity", 0.20309716492940588);
        setField(term532042, term532042.getClass(), "id", "tTkJxeMIhG");
        setField(term532042, term532042.getClass(), "name", "dZFkTlgeNK");
        setField(term532042, term532042.getClass(), "nameSingle", "fIpDMwXuFo");
        setField(term532042, term532042.getClass(), "attitude", enum1691);
        setField(term532042, term532042.getClass(), "imagePath", "JOzegoretC");
        setField(term532042, term532042.getClass(), "bridgeId", "tPXOigwNgS");
        setField(term532042, term532042.getClass(), "spaceShipId", "DJloaaFcGd");
        setField(term532042, term532042.getClass(), "socialSystem", enum1692);
        setField(term532042, term532042.getClass(), "genderList", term532140);
        setField(term532042, term532042.getClass(), "speechSetId", "qtJfVtqXwz");
        setField(term532042, term532042.getClass(), "bridgeEffect", enum1696);
        setField(term532183, term532183.getClass(), "songName", "rPuqsGPaYs");
        setField(term532183, term532183.getClass(), "author", "ytaTlbXdUL");
        setField(term532183, term532183.getClass(), "fileName", "OPVZFRAEHh");
        setBooleanField(term532183, term532183.getClass(), "custom", true);
        setIntField(term532183, term532183.getClass(), "fadingLimit", -1516989582);
        setField(term532042, term532042.getClass(), "diplomacyMusic", term532183);
        setField(term532042, term532042.getClass(), "traits", term532222);
        setField(term532042, term532042.getClass(), "leaderNameGenerator", enum1697);
        setField(term532042, term532042.getClass(), "description", "AFRqPQlDTP");
        setField(term532042, term532042.getClass(), "spaceRaceType", enum1698);
        setField(term532002, term532002.getClass(), "originalBuilder", term532042);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipHull");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDefenseValueByShipHullSize", argTypes, term532002, args);
    }

};


