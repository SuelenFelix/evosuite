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

public class ShipStat_isObsolete_155524661019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220204;

    public ShipStat_isObsolete_155524661019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term220304 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipHullType");
        Field term220303 = ((Class) term220304).getDeclaredField((String) "NORMAL");
        ((Field) term220303).setAccessible(true);
        Object enum714 = ((Field) term220303).get((Object) null);
        Class<? extends Object> term220554 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipSize");
        Field term220553 = ((Class) term220554).getDeclaredField((String) "MEDIUM");
        ((Field) term220553).setAccessible(true);
        Object enum715 = ((Field) term220553).get((Object) null);
        Class<? extends Object> term220784 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term220783 = ((Class) term220784).getDeclaredField((String) "MILITARISTIC");
        ((Field) term220783).setAccessible(true);
        Object enum716 = ((Field) term220783).get((Object) null);
        Class<? extends Object> term221057 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term221056 = ((Class) term221057).getDeclaredField((String) "PATRIARCHY");
        ((Field) term221056).setAccessible(true);
        Object enum717 = ((Field) term221056).get((Object) null);
        ArrayList term220255 = new ArrayList();
        ((ArrayList) term220255).add((Object)null);
        ((ArrayList) term220255).add((Object)null);
        ((ArrayList) term220255).add((Object)null);
        ((ArrayList) term220255).add((Object)null);
        ((ArrayList) term220255).add((Object)null);
        ((ArrayList) term220255).add((Object)null);
        ((ArrayList) term220255).add((Object)null);
        ((ArrayList) term220255).add((Object)null);
        Class<? extends Object> term221319 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term221318 = ((Class) term221319).getDeclaredField((String) "GREEN_CONSOLE");
        ((Field) term221318).setAccessible(true);
        Object enum718 = ((Field) term221318).get((Object) null);
        ArrayList term220264 = new ArrayList();
        ((ArrayList) term220264).add((Object)null);
        Class<? extends Object> term221595 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term221594 = ((Class) term221595).getDeclaredField((String) "DEEP_ANCIENT_MONSTER");
        ((Field) term221594).setAccessible(true);
        Object enum719 = ((Field) term221594).get((Object) null);
        Class<? extends Object> term221922 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term221921 = ((Class) term221922).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term221921).setAccessible(true);
        Object enum720 = ((Field) term221921).get((Object) null);
        ArrayList term220272 = new ArrayList();
        term220204 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipStat"));
        Object term220205 = newInstance(Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign"));
        Object term220218 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        Object term220244 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term220261 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term220205, term220205.getClass(), "name", "qXysRdBrsg");
        setIntField(term220218, term220218.getClass(), "index", -904092395);
        setField(term220218, term220218.getClass(), "name", "hbtKoWkZLU");
        setIntField(term220218, term220218.getClass(), "maxSlot", -1209882989);
        setIntField(term220218, term220218.getClass(), "slotHull", -635477822);
        setField(term220218, term220218.getClass(), "hullType", enum714);
        setField(term220218, term220218.getClass(), "size", enum715);
        setIntField(term220218, term220218.getClass(), "cost", -1577181902);
        setIntField(term220218, term220218.getClass(), "metalCost", 1943392765);
        setIntField(term220218, term220218.getClass(), "imageIndex", -1788693144);
        setDoubleField(term220218, term220218.getClass(), "fleetCapacity", 0.025133051616627267);
        setField(term220244, term220244.getClass(), "id", "");
        setField(term220244, term220244.getClass(), "name", "");
        setField(term220244, term220244.getClass(), "nameSingle", "");
        setField(term220244, term220244.getClass(), "attitude", enum716);
        setField(term220244, term220244.getClass(), "imagePath", "");
        setField(term220244, term220244.getClass(), "bridgeId", "");
        setField(term220244, term220244.getClass(), "spaceShipId", "");
        setField(term220244, term220244.getClass(), "socialSystem", enum717);
        setField(term220244, term220244.getClass(), "genderList", term220255);
        setField(term220244, term220244.getClass(), "speechSetId", "");
        setField(term220244, term220244.getClass(), "bridgeEffect", enum718);
        setField(term220261, term220261.getClass(), "songName", null);
        setField(term220261, term220261.getClass(), "author", null);
        setField(term220261, term220261.getClass(), "fileName", null);
        setBooleanField(term220261, term220261.getClass(), "custom", true);
        setIntField(term220261, term220261.getClass(), "fadingLimit", 1939961371);
        setField(term220244, term220244.getClass(), "diplomacyMusic", term220261);
        setField(term220244, term220244.getClass(), "traits", term220264);
        setField(term220244, term220244.getClass(), "leaderNameGenerator", enum719);
        setField(term220244, term220244.getClass(), "description", "");
        setField(term220244, term220244.getClass(), "spaceRaceType", enum720);
        setField(term220218, term220218.getClass(), "originalBuilder", term220244);
        setField(term220205, term220205.getClass(), "hull", term220218);
        setField(term220205, term220205.getClass(), "components", term220272);
        setField(term220204, term220204.getClass(), "design", term220205);
        setIntField(term220204, term220204.getClass(), "numberOfCombats", 435301324);
        setIntField(term220204, term220204.getClass(), "numberOfVictories", -1422958225);
        setIntField(term220204, term220204.getClass(), "numberOfLoses", 1608477594);
        setIntField(term220204, term220204.getClass(), "numberOfKills", -250008835);
        setIntField(term220204, term220204.getClass(), "numberOfBuilt", -1865187594);
        setIntField(term220204, term220204.getClass(), "numberOfInUse", -1806281595);
        setBooleanField(term220204, term220204.getClass(), "obsolete", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipStat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isObsolete", argTypes, term220204, args);
    }

};


