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
import java.lang.Boolean;

public class ShipHull_getDescription_211887510320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term534925;
     Object term535201;

    public ShipHull_getDescription_211887510320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term535214 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipHullType");
        Field term535213 = ((Class) term535214).getDeclaredField((String) "ORBITAL");
        ((Field) term535213).setAccessible(true);
        Object enum1699 = ((Field) term535213).get((Object) null);
        Class<? extends Object> term535467 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipSize");
        Field term535466 = ((Class) term535467).getDeclaredField((String) "MEDIUM");
        ((Field) term535466).setAccessible(true);
        Object enum1700 = ((Field) term535466).get((Object) null);
        Class<? extends Object> term535727 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term535726 = ((Class) term535727).getDeclaredField((String) "MILITARISTIC");
        ((Field) term535726).setAccessible(true);
        Object enum1701 = ((Field) term535726).get((Object) null);
        Class<? extends Object> term536030 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term536029 = ((Class) term536030).getDeclaredField((String) "EQUAL");
        ((Field) term536029).setAccessible(true);
        Object enum1702 = ((Field) term536029).get((Object) null);
        Class<? extends Object> term536277 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term536276 = ((Class) term536277).getDeclaredField((String) "MALE");
        ((Field) term536276).setAccessible(true);
        Object enum1703 =  ((Field) term536276).get((Object) null);
        Class<? extends Object> term536501 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term536500 = ((Class) term536501).getDeclaredField((String) "FEMALE");
        ((Field) term536500).setAccessible(true);
        Object enum1704 =  ((Field) term536500).get((Object) null);
        ArrayList term535064 = new ArrayList();
        ((ArrayList) term535064).add(enum1703);
        ((ArrayList) term535064).add(enum1704);
        ((ArrayList) term535064).add(enum1704);
        ((ArrayList) term535064).add(enum1704);
        ((ArrayList) term535064).add(enum1704);
        ((ArrayList) term535064).add(enum1704);
        ((ArrayList) term535064).add(enum1703);
        Class<? extends Object> term536741 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term536740 = ((Class) term536741).getDeclaredField((String) "ORANGE_BLUE");
        ((Field) term536740).setAccessible(true);
        Object enum1705 = ((Field) term536740).get((Object) null);
        Object term535142 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term535142, term535142.getClass(), "traitId", null);
        setField(term535142, term535142.getClass(), "traitName", null);
        setField(term535142, term535142.getClass(), "description", null);
        setField(term535142, term535142.getClass(), "group", null);
        setField(term535142, term535142.getClass(), "conflictsWithIds", null);
        setByteField(term535142, term535142.getClass(), "traitPoints", (byte) -16);
        Object term535144 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term535144, term535144.getClass(), "traitId", null);
        setField(term535144, term535144.getClass(), "traitName", null);
        setField(term535144, term535144.getClass(), "description", null);
        setField(term535144, term535144.getClass(), "group", null);
        setField(term535144, term535144.getClass(), "conflictsWithIds", null);
        setByteField(term535144, term535144.getClass(), "traitPoints", (byte) -100);
        Object term535146 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term535146, term535146.getClass(), "traitId", null);
        setField(term535146, term535146.getClass(), "traitName", null);
        setField(term535146, term535146.getClass(), "description", null);
        setField(term535146, term535146.getClass(), "group", null);
        setField(term535146, term535146.getClass(), "conflictsWithIds", null);
        setByteField(term535146, term535146.getClass(), "traitPoints", (byte) -46);
        Object term535148 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term535148, term535148.getClass(), "traitId", null);
        setField(term535148, term535148.getClass(), "traitName", null);
        setField(term535148, term535148.getClass(), "description", null);
        setField(term535148, term535148.getClass(), "group", null);
        setField(term535148, term535148.getClass(), "conflictsWithIds", null);
        setByteField(term535148, term535148.getClass(), "traitPoints", (byte) 18);
        Object term535150 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term535150, term535150.getClass(), "traitId", null);
        setField(term535150, term535150.getClass(), "traitName", null);
        setField(term535150, term535150.getClass(), "description", null);
        setField(term535150, term535150.getClass(), "group", null);
        setField(term535150, term535150.getClass(), "conflictsWithIds", null);
        setByteField(term535150, term535150.getClass(), "traitPoints", (byte) 87);
        Object term535152 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term535152, term535152.getClass(), "traitId", null);
        setField(term535152, term535152.getClass(), "traitName", null);
        setField(term535152, term535152.getClass(), "description", null);
        setField(term535152, term535152.getClass(), "group", null);
        setField(term535152, term535152.getClass(), "conflictsWithIds", null);
        setByteField(term535152, term535152.getClass(), "traitPoints", (byte) 118);
        ArrayList term535140 = new ArrayList();
        ((ArrayList) term535140).add(term535142);
        ((ArrayList) term535140).add(term535144);
        ((ArrayList) term535140).add(term535146);
        ((ArrayList) term535140).add(term535148);
        ((ArrayList) term535140).add(term535150);
        ((ArrayList) term535140).add(term535152);
        Class<? extends Object> term537041 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term537040 = ((Class) term537041).getDeclaredField((String) "STONE_PEOPLE");
        ((Field) term537040).setAccessible(true);
        Object enum1706 = ((Field) term537040).get((Object) null);
        Class<? extends Object> term537354 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term537353 = ((Class) term537354).getDeclaredField((String) "SPACE_MONSTER");
        ((Field) term537353).setAccessible(true);
        Object enum1707 = ((Field) term537353).get((Object) null);
        term534925 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        Object term534966 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term535101 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setIntField(term534925, term534925.getClass(), "index", -1473571403);
        setField(term534925, term534925.getClass(), "name", "JqUaDkkuTO");
        setIntField(term534925, term534925.getClass(), "maxSlot", -33345447);
        setIntField(term534925, term534925.getClass(), "slotHull", -473865390);
        setField(term534925, term534925.getClass(), "hullType", enum1699);
        setField(term534925, term534925.getClass(), "size", enum1700);
        setIntField(term534925, term534925.getClass(), "cost", 1560849509);
        setIntField(term534925, term534925.getClass(), "metalCost", 548082671);
        setIntField(term534925, term534925.getClass(), "imageIndex", 143341138);
        setDoubleField(term534925, term534925.getClass(), "fleetCapacity", 0.2353269756778571);
        setField(term534966, term534966.getClass(), "id", "cIdTROgmXL");
        setField(term534966, term534966.getClass(), "name", "txsvhpGZwt");
        setField(term534966, term534966.getClass(), "nameSingle", "gcDfxldLUD");
        setField(term534966, term534966.getClass(), "attitude", enum1701);
        setField(term534966, term534966.getClass(), "imagePath", "SdeCxZUmQW");
        setField(term534966, term534966.getClass(), "bridgeId", "dwmAJjBRtx");
        setField(term534966, term534966.getClass(), "spaceShipId", "tAEFWQNBKj");
        setField(term534966, term534966.getClass(), "socialSystem", enum1702);
        setField(term534966, term534966.getClass(), "genderList", term535064);
        setField(term534966, term534966.getClass(), "speechSetId", "fcnyiOkOkc");
        setField(term534966, term534966.getClass(), "bridgeEffect", enum1705);
        setField(term535101, term535101.getClass(), "songName", "uFZnvjTicx");
        setField(term535101, term535101.getClass(), "author", "jssrdNpiyJ");
        setField(term535101, term535101.getClass(), "fileName", "RVxeRpTKzR");
        setBooleanField(term535101, term535101.getClass(), "custom", false);
        setIntField(term535101, term535101.getClass(), "fadingLimit", 673245946);
        setField(term534966, term534966.getClass(), "diplomacyMusic", term535101);
        setField(term534966, term534966.getClass(), "traits", term535140);
        setField(term534966, term534966.getClass(), "leaderNameGenerator", enum1706);
        setField(term534966, term534966.getClass(), "description", "hzlOcutDCG");
        setField(term534966, term534966.getClass(), "spaceRaceType", enum1707);
        setField(term534925, term534925.getClass(), "originalBuilder", term534966);
        term535201 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipHull");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term535201;
        callMethod(klass, "getDescription", argTypes, term534925, args);
    }

};


