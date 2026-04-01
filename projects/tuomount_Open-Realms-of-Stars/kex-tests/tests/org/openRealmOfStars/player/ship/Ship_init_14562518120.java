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
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class Ship_init_14562518120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term541161;

    public Ship_init_14562518120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term541367 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipHullType");
        Field term541366 = ((Class) term541367).getDeclaredField((String) "FREIGHTER");
        ((Field) term541366).setAccessible(true);
        Object enum1719 = ((Field) term541366).get((Object) null);
        Class<? extends Object> term541626 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipSize");
        Field term541625 = ((Class) term541626).getDeclaredField((String) "SMALL");
        ((Field) term541625).setAccessible(true);
        Object enum1720 = ((Field) term541625).get((Object) null);
        Class<? extends Object> term541883 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term541882 = ((Class) term541883).getDeclaredField((String) "PEACEFUL");
        ((Field) term541882).setAccessible(true);
        Object enum1721 = ((Field) term541882).get((Object) null);
        Class<? extends Object> term542174 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term542173 = ((Class) term542174).getDeclaredField((String) "EQUAL");
        ((Field) term542173).setAccessible(true);
        Object enum1722 = ((Field) term542173).get((Object) null);
        ArrayList term541295 = new ArrayList();
        ((ArrayList) term541295).add((Object)null);
        ((ArrayList) term541295).add((Object)null);
        ((ArrayList) term541295).add((Object)null);
        ((ArrayList) term541295).add((Object)null);
        Class<? extends Object> term542431 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term542430 = ((Class) term542431).getDeclaredField((String) "BLUEISH_WHITE");
        ((Field) term542430).setAccessible(true);
        Object enum1723 = ((Field) term542430).get((Object) null);
        ArrayList term541320 = new ArrayList();
        ((ArrayList) term541320).add((Object)null);
        ((ArrayList) term541320).add((Object)null);
        Class<? extends Object> term542707 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term542706 = ((Class) term542707).getDeclaredField((String) "FEMALE_ROBOT");
        ((Field) term542706).setAccessible(true);
        Object enum1724 = ((Field) term542706).get((Object) null);
        Class<? extends Object> term543020 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term543019 = ((Class) term543020).getDeclaredField((String) "REGULAR");
        ((Field) term543019).setAccessible(true);
        Object enum1725 = ((Field) term543019).get((Object) null);
        ArrayList term541342 = new ArrayList();
        term541161 = newInstance(Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign"));
        Object term541174 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        Object term541216 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term541314 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term541161, term541161.getClass(), "name", "JRQlLonBxC");
        setIntField(term541174, term541174.getClass(), "index", -1117580978);
        setField(term541174, term541174.getClass(), "name", "DtcbgxVotW");
        setIntField(term541174, term541174.getClass(), "maxSlot", 208521517);
        setIntField(term541174, term541174.getClass(), "slotHull", 778044540);
        setField(term541174, term541174.getClass(), "hullType", enum1719);
        setField(term541174, term541174.getClass(), "size", enum1720);
        setIntField(term541174, term541174.getClass(), "cost", -803580264);
        setIntField(term541174, term541174.getClass(), "metalCost", 131178867);
        setIntField(term541174, term541174.getClass(), "imageIndex", -255580652);
        setDoubleField(term541174, term541174.getClass(), "fleetCapacity", 0.6816920131943206);
        setField(term541216, term541216.getClass(), "id", "XgtkWJhDrr");
        setField(term541216, term541216.getClass(), "name", "aoJqAZOUJz");
        setField(term541216, term541216.getClass(), "nameSingle", "WsATyGNPZU");
        setField(term541216, term541216.getClass(), "attitude", enum1721);
        setField(term541216, term541216.getClass(), "imagePath", "DANmFlRIuU");
        setField(term541216, term541216.getClass(), "bridgeId", "iYncdDHnkA");
        setField(term541216, term541216.getClass(), "spaceShipId", "riFklUwKMI");
        setField(term541216, term541216.getClass(), "socialSystem", enum1722);
        setField(term541216, term541216.getClass(), "genderList", term541295);
        setField(term541216, term541216.getClass(), "speechSetId", "LHduRqftkV");
        setField(term541216, term541216.getClass(), "bridgeEffect", enum1723);
        setField(term541314, term541314.getClass(), "songName", "");
        setField(term541314, term541314.getClass(), "author", "");
        setField(term541314, term541314.getClass(), "fileName", "");
        setBooleanField(term541314, term541314.getClass(), "custom", true);
        setIntField(term541314, term541314.getClass(), "fadingLimit", -1732441524);
        setField(term541216, term541216.getClass(), "diplomacyMusic", term541314);
        setField(term541216, term541216.getClass(), "traits", term541320);
        setField(term541216, term541216.getClass(), "leaderNameGenerator", enum1724);
        setField(term541216, term541216.getClass(), "description", "kkYDHznTak");
        setField(term541216, term541216.getClass(), "spaceRaceType", enum1725);
        setField(term541174, term541174.getClass(), "originalBuilder", term541216);
        setField(term541161, term541161.getClass(), "hull", term541174);
        setField(term541161, term541161.getClass(), "components", term541342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.Ship");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign");
        Object[] args = new Object[1];
        args[0] = term541161;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


