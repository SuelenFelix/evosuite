package org.openRealmOfStars.player.ship.shipdesign;

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
import static org.openRealmOfStars.player.ship.shipdesign.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class ShipDesign_init_16043854230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ShipDesign_init_16043854230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term353 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipHullType");
        Field term352 = ((Class) term353).getDeclaredField((String) "FREIGHTER");
        ((Field) term352).setAccessible(true);
        Object enum0 = ((Field) term352).get((Object) null);
        Class<? extends Object> term657 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipSize");
        Field term656 = ((Class) term657).getDeclaredField((String) "MEDIUM");
        ((Field) term656).setAccessible(true);
        Object enum1 = ((Field) term656).get((Object) null);
        Class<? extends Object> term1046 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term1045 = ((Class) term1046).getDeclaredField((String) "PEACEFUL");
        ((Field) term1045).setAccessible(true);
        Object enum2 = ((Field) term1045).get((Object) null);
        Class<? extends Object> term1374 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term1373 = ((Class) term1374).getDeclaredField((String) "PATRIARCHY");
        ((Field) term1373).setAccessible(true);
        Object enum3 = ((Field) term1373).get((Object) null);
        Class<? extends Object> term1665 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term1664 = ((Class) term1665).getDeclaredField((String) "MALE");
        ((Field) term1664).setAccessible(true);
        Object enum4 =  ((Field) term1664).get((Object) null);
        Class<? extends Object> term1889 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term1888 = ((Class) term1889).getDeclaredField((String) "NONE");
        ((Field) term1888).setAccessible(true);
        Object enum5 =  ((Field) term1888).get((Object) null);
        Class<? extends Object> term2113 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term2112 = ((Class) term2113).getDeclaredField((String) "FEMALE");
        ((Field) term2112).setAccessible(true);
        Object enum6 =  ((Field) term2112).get((Object) null);
        ArrayList term143 = new ArrayList();
        ((ArrayList) term143).add(enum4);
        ((ArrayList) term143).add(enum5);
        ((ArrayList) term143).add(enum4);
        ((ArrayList) term143).add(enum5);
        ((ArrayList) term143).add(enum6);
        Class<? extends Object> term2732 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term2731 = ((Class) term2732).getDeclaredField((String) "JUNGLE");
        ((Field) term2731).setAccessible(true);
        Object enum7 = ((Field) term2731).get((Object) null);
        Object term219 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term219, term219.getClass(), "traitId", null);
        setField(term219, term219.getClass(), "traitName", null);
        setField(term219, term219.getClass(), "description", null);
        setField(term219, term219.getClass(), "group", null);
        setField(term219, term219.getClass(), "conflictsWithIds", null);
        setByteField(term219, term219.getClass(), "traitPoints", (byte) 47);
        Object term221 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term221, term221.getClass(), "traitId", null);
        setField(term221, term221.getClass(), "traitName", null);
        setField(term221, term221.getClass(), "description", null);
        setField(term221, term221.getClass(), "group", null);
        setField(term221, term221.getClass(), "conflictsWithIds", null);
        setByteField(term221, term221.getClass(), "traitPoints", (byte) 48);
        Object term223 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term223, term223.getClass(), "traitId", null);
        setField(term223, term223.getClass(), "traitName", null);
        setField(term223, term223.getClass(), "description", null);
        setField(term223, term223.getClass(), "group", null);
        setField(term223, term223.getClass(), "conflictsWithIds", null);
        setByteField(term223, term223.getClass(), "traitPoints", (byte) 89);
        Object term225 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term225, term225.getClass(), "traitId", null);
        setField(term225, term225.getClass(), "traitName", null);
        setField(term225, term225.getClass(), "description", null);
        setField(term225, term225.getClass(), "group", null);
        setField(term225, term225.getClass(), "conflictsWithIds", null);
        setByteField(term225, term225.getClass(), "traitPoints", (byte) 75);
        ArrayList term217 = new ArrayList();
        ((ArrayList) term217).add(term219);
        ((ArrayList) term217).add(term221);
        ((ArrayList) term217).add(term223);
        ((ArrayList) term217).add(term225);
        Class<? extends Object> term3284 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term3283 = ((Class) term3284).getDeclaredField((String) "EVIL_CREATURE");
        ((Field) term3283).setAccessible(true);
        Object enum8 = ((Field) term3283).get((Object) null);
        Class<? extends Object> term3644 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term3643 = ((Class) term3644).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term3643).setAccessible(true);
        Object enum9 = ((Field) term3643).get((Object) null);
        term1 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        Object term44 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term178 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setIntField(term1, term1.getClass(), "index", 568599855);
        setField(term1, term1.getClass(), "name", "PAEBtnZtTD");
        setIntField(term1, term1.getClass(), "maxSlot", 1162663216);
        setIntField(term1, term1.getClass(), "slotHull", 1484323161);
        setField(term1, term1.getClass(), "hullType", enum0);
        setField(term1, term1.getClass(), "size", enum1);
        setIntField(term1, term1.getClass(), "cost", 391863371);
        setIntField(term1, term1.getClass(), "metalCost", -1922583790);
        setIntField(term1, term1.getClass(), "imageIndex", -616727354);
        setDoubleField(term1, term1.getClass(), "fleetCapacity", 0.13238746331190498);
        setField(term44, term44.getClass(), "id", "sjlJAEtRrb");
        setField(term44, term44.getClass(), "name", "MuLcgQHgqz");
        setField(term44, term44.getClass(), "nameSingle", "xxtlPwDYFs");
        setField(term44, term44.getClass(), "attitude", enum2);
        setField(term44, term44.getClass(), "imagePath", "jJCZpVmanW");
        setField(term44, term44.getClass(), "bridgeId", "EGtDIRbSSb");
        setField(term44, term44.getClass(), "spaceShipId", "SzjVpOQTyS");
        setField(term44, term44.getClass(), "socialSystem", enum3);
        setField(term44, term44.getClass(), "genderList", term143);
        setField(term44, term44.getClass(), "speechSetId", "MjGYSRKTNF");
        setField(term44, term44.getClass(), "bridgeEffect", enum7);
        setField(term178, term178.getClass(), "songName", "hRNSzYYIrc");
        setField(term178, term178.getClass(), "author", "RMFIsYGgne");
        setField(term178, term178.getClass(), "fileName", "NRdvgJlhkX");
        setBooleanField(term178, term178.getClass(), "custom", false);
        setIntField(term178, term178.getClass(), "fadingLimit", -1955890973);
        setField(term44, term44.getClass(), "diplomacyMusic", term178);
        setField(term44, term44.getClass(), "traits", term217);
        setField(term44, term44.getClass(), "leaderNameGenerator", enum8);
        setField(term44, term44.getClass(), "description", "UlajhuVLaP");
        setField(term44, term44.getClass(), "spaceRaceType", enum9);
        setField(term1, term1.getClass(), "originalBuilder", term44);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.ship.ShipHull");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


