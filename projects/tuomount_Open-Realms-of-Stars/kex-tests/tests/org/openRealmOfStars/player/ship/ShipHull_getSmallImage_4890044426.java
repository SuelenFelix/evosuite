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

public class ShipHull_getSmallImage_4890044426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term496881;

    public ShipHull_getSmallImage_4890044426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term497173 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipHullType");
        Field term497172 = ((Class) term497173).getDeclaredField((String) "PRIVATEER");
        ((Field) term497172).setAccessible(true);
        Object enum1571 = ((Field) term497172).get((Object) null);
        Class<? extends Object> term497432 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipSize");
        Field term497431 = ((Class) term497432).getDeclaredField((String) "MINOR");
        ((Field) term497431).setAccessible(true);
        Object enum1572 = ((Field) term497431).get((Object) null);
        Class<? extends Object> term497689 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term497688 = ((Class) term497689).getDeclaredField((String) "DIPLOMATIC");
        ((Field) term497688).setAccessible(true);
        Object enum1573 = ((Field) term497688).get((Object) null);
        Class<? extends Object> term497986 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term497985 = ((Class) term497986).getDeclaredField((String) "PATRIARCHY");
        ((Field) term497985).setAccessible(true);
        Object enum1574 = ((Field) term497985).get((Object) null);
        Class<? extends Object> term498248 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term498247 = ((Class) term498248).getDeclaredField((String) "FEMALE");
        ((Field) term498247).setAccessible(true);
        Object enum1575 =  ((Field) term498247).get((Object) null);
        Class<? extends Object> term498478 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term498477 = ((Class) term498478).getDeclaredField((String) "FEMALE");
        ((Field) term498477).setAccessible(true);
        Object enum1576 =  ((Field) term498477).get((Object) null);
        Class<? extends Object> term498708 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term498707 = ((Class) term498708).getDeclaredField((String) "MALE");
        ((Field) term498707).setAccessible(true);
        Object enum1577 =  ((Field) term498707).get((Object) null);
        ArrayList term497024 = new ArrayList();
        ((ArrayList) term497024).add(enum1575);
        ((ArrayList) term497024).add(enum1576);
        ((ArrayList) term497024).add(enum1575);
        ((ArrayList) term497024).add(enum1575);
        ((ArrayList) term497024).add(enum1575);
        ((ArrayList) term497024).add(enum1577);
        ((ArrayList) term497024).add(enum1575);
        ((ArrayList) term497024).add(enum1577);
        Class<? extends Object> term498942 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term498941 = ((Class) term498942).getDeclaredField((String) "SPACE_CONSOLE2");
        ((Field) term498941).setAccessible(true);
        Object enum1578 = ((Field) term498941).get((Object) null);
        Object term497108 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term497108, term497108.getClass(), "traitId", null);
        setField(term497108, term497108.getClass(), "traitName", null);
        setField(term497108, term497108.getClass(), "description", null);
        setField(term497108, term497108.getClass(), "group", null);
        setField(term497108, term497108.getClass(), "conflictsWithIds", null);
        setByteField(term497108, term497108.getClass(), "traitPoints", (byte) -24);
        Object term497110 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term497110, term497110.getClass(), "traitId", null);
        setField(term497110, term497110.getClass(), "traitName", null);
        setField(term497110, term497110.getClass(), "description", null);
        setField(term497110, term497110.getClass(), "group", null);
        setField(term497110, term497110.getClass(), "conflictsWithIds", null);
        setByteField(term497110, term497110.getClass(), "traitPoints", (byte) 11);
        Object term497112 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term497112, term497112.getClass(), "traitId", null);
        setField(term497112, term497112.getClass(), "traitName", null);
        setField(term497112, term497112.getClass(), "description", null);
        setField(term497112, term497112.getClass(), "group", null);
        setField(term497112, term497112.getClass(), "conflictsWithIds", null);
        setByteField(term497112, term497112.getClass(), "traitPoints", (byte) 47);
        Object term497114 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term497114, term497114.getClass(), "traitId", null);
        setField(term497114, term497114.getClass(), "traitName", null);
        setField(term497114, term497114.getClass(), "description", null);
        setField(term497114, term497114.getClass(), "group", null);
        setField(term497114, term497114.getClass(), "conflictsWithIds", null);
        setByteField(term497114, term497114.getClass(), "traitPoints", (byte) 121);
        ArrayList term497106 = new ArrayList();
        ((ArrayList) term497106).add(term497108);
        ((ArrayList) term497106).add(term497110);
        ((ArrayList) term497106).add(term497112);
        ((ArrayList) term497106).add(term497114);
        Class<? extends Object> term499251 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term499250 = ((Class) term499251).getDeclaredField((String) "STONE_PEOPLE");
        ((Field) term499250).setAccessible(true);
        Object enum1579 = ((Field) term499250).get((Object) null);
        Class<? extends Object> term499564 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term499563 = ((Class) term499564).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term499563).setAccessible(true);
        Object enum1580 = ((Field) term499563).get((Object) null);
        term496881 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        Object term496923 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term497067 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setIntField(term496881, term496881.getClass(), "index", 1517040936);
        setField(term496881, term496881.getClass(), "name", "WwEWKSmjkw");
        setIntField(term496881, term496881.getClass(), "maxSlot", -1061313238);
        setIntField(term496881, term496881.getClass(), "slotHull", -1148437143);
        setField(term496881, term496881.getClass(), "hullType", enum1571);
        setField(term496881, term496881.getClass(), "size", enum1572);
        setIntField(term496881, term496881.getClass(), "cost", 215253072);
        setIntField(term496881, term496881.getClass(), "metalCost", 812148008);
        setIntField(term496881, term496881.getClass(), "imageIndex", -636265339);
        setDoubleField(term496881, term496881.getClass(), "fleetCapacity", 0.8046904246652031);
        setField(term496923, term496923.getClass(), "id", "rJsAlhwtho");
        setField(term496923, term496923.getClass(), "name", "ViPPMTBQpx");
        setField(term496923, term496923.getClass(), "nameSingle", "URIHtqSRbl");
        setField(term496923, term496923.getClass(), "attitude", enum1573);
        setField(term496923, term496923.getClass(), "imagePath", "GmzeyuSiId");
        setField(term496923, term496923.getClass(), "bridgeId", "TzTgdBjicJ");
        setField(term496923, term496923.getClass(), "spaceShipId", "YQeHIhsjLc");
        setField(term496923, term496923.getClass(), "socialSystem", enum1574);
        setField(term496923, term496923.getClass(), "genderList", term497024);
        setField(term496923, term496923.getClass(), "speechSetId", "nQZbRxPqNd");
        setField(term496923, term496923.getClass(), "bridgeEffect", enum1578);
        setField(term497067, term497067.getClass(), "songName", "yuUiVhpeab");
        setField(term497067, term497067.getClass(), "author", "kakhqlEqNc");
        setField(term497067, term497067.getClass(), "fileName", "KbEBQtbxfu");
        setBooleanField(term497067, term497067.getClass(), "custom", false);
        setIntField(term497067, term497067.getClass(), "fadingLimit", 1987820060);
        setField(term496923, term496923.getClass(), "diplomacyMusic", term497067);
        setField(term496923, term496923.getClass(), "traits", term497106);
        setField(term496923, term496923.getClass(), "leaderNameGenerator", enum1579);
        setField(term496923, term496923.getClass(), "description", "hXWavoaOql");
        setField(term496923, term496923.getClass(), "spaceRaceType", enum1580);
        setField(term496881, term496881.getClass(), "originalBuilder", term496923);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipHull");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSmallImage", argTypes, term496881, args);
    }

};


