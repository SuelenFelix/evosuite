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

public class ShipHull_getSize_126534173812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term513292;

    public ShipHull_getSize_126534173812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term513566 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipHullType");
        Field term513565 = ((Class) term513566).getDeclaredField((String) "PRIVATEER");
        ((Field) term513565).setAccessible(true);
        Object enum1626 = ((Field) term513565).get((Object) null);
        Class<? extends Object> term513825 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipSize");
        Field term513824 = ((Class) term513825).getDeclaredField((String) "HUGE");
        ((Field) term513824).setAccessible(true);
        Object enum1627 = ((Field) term513824).get((Object) null);
        Class<? extends Object> term514079 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term514078 = ((Class) term514079).getDeclaredField((String) "AGGRESSIVE");
        ((Field) term514078).setAccessible(true);
        Object enum1628 = ((Field) term514078).get((Object) null);
        Class<? extends Object> term514376 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term514375 = ((Class) term514376).getDeclaredField((String) "PATRIARCHY");
        ((Field) term514375).setAccessible(true);
        Object enum1629 = ((Field) term514375).get((Object) null);
        Class<? extends Object> term514638 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term514637 = ((Class) term514638).getDeclaredField((String) "FEMALE");
        ((Field) term514637).setAccessible(true);
        Object enum1630 =  ((Field) term514637).get((Object) null);
        Class<? extends Object> term514868 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term514867 = ((Class) term514868).getDeclaredField((String) "FEMALE");
        ((Field) term514867).setAccessible(true);
        Object enum1631 =  ((Field) term514867).get((Object) null);
        ArrayList term513434 = new ArrayList();
        ((ArrayList) term513434).add(enum1630);
        ((ArrayList) term513434).add(enum1631);
        ((ArrayList) term513434).add(enum1631);
        ((ArrayList) term513434).add(enum1630);
        Class<? extends Object> term515108 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term515107 = ((Class) term515108).getDeclaredField((String) "SPACE_CONSOLE2");
        ((Field) term515107).setAccessible(true);
        Object enum1632 = ((Field) term515107).get((Object) null);
        ArrayList term513513 = new ArrayList();
        Class<? extends Object> term515417 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term515416 = ((Class) term515417).getDeclaredField((String) "PIRATE");
        ((Field) term515416).setAccessible(true);
        Object enum1633 = ((Field) term515416).get((Object) null);
        Class<? extends Object> term515712 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term515711 = ((Class) term515712).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term515711).setAccessible(true);
        Object enum1634 = ((Field) term515711).get((Object) null);
        term513292 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        Object term513333 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term513474 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setIntField(term513292, term513292.getClass(), "index", 1841239584);
        setField(term513292, term513292.getClass(), "name", "UzEeKtsLXK");
        setIntField(term513292, term513292.getClass(), "maxSlot", 1759632148);
        setIntField(term513292, term513292.getClass(), "slotHull", -929628156);
        setField(term513292, term513292.getClass(), "hullType", enum1626);
        setField(term513292, term513292.getClass(), "size", enum1627);
        setIntField(term513292, term513292.getClass(), "cost", 1662377107);
        setIntField(term513292, term513292.getClass(), "metalCost", -270785615);
        setIntField(term513292, term513292.getClass(), "imageIndex", 1707036301);
        setDoubleField(term513292, term513292.getClass(), "fleetCapacity", 0.9898207968242465);
        setField(term513333, term513333.getClass(), "id", "DGEFqUrMDr");
        setField(term513333, term513333.getClass(), "name", "yPMBJDQAOz");
        setField(term513333, term513333.getClass(), "nameSingle", "oqsgYMFTfZ");
        setField(term513333, term513333.getClass(), "attitude", enum1628);
        setField(term513333, term513333.getClass(), "imagePath", "iAFNdbRIVG");
        setField(term513333, term513333.getClass(), "bridgeId", "AGnFhhQyih");
        setField(term513333, term513333.getClass(), "spaceShipId", "IRAQJIbBQm");
        setField(term513333, term513333.getClass(), "socialSystem", enum1629);
        setField(term513333, term513333.getClass(), "genderList", term513434);
        setField(term513333, term513333.getClass(), "speechSetId", "oUWxwMXaWa");
        setField(term513333, term513333.getClass(), "bridgeEffect", enum1632);
        setField(term513474, term513474.getClass(), "songName", "OVuedhrXPK");
        setField(term513474, term513474.getClass(), "author", "eNLegmDnty");
        setField(term513474, term513474.getClass(), "fileName", "vvPLFWLFiF");
        setBooleanField(term513474, term513474.getClass(), "custom", true);
        setIntField(term513474, term513474.getClass(), "fadingLimit", 19933800);
        setField(term513333, term513333.getClass(), "diplomacyMusic", term513474);
        setField(term513333, term513333.getClass(), "traits", term513513);
        setField(term513333, term513333.getClass(), "leaderNameGenerator", enum1633);
        setField(term513333, term513333.getClass(), "description", "yVOYltBxzA");
        setField(term513333, term513333.getClass(), "spaceRaceType", enum1634);
        setField(term513292, term513292.getClass(), "originalBuilder", term513333);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipHull");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSize", argTypes, term513292, args);
    }

};


