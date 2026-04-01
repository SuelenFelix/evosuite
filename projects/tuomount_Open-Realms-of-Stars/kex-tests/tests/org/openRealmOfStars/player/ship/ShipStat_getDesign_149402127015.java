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

public class ShipStat_getDesign_149402127015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212303;

    public ShipStat_getDesign_149402127015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term212449 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipHullType");
        Field term212448 = ((Class) term212449).getDeclaredField((String) "PROBE");
        ((Field) term212448).setAccessible(true);
        Object enum686 = ((Field) term212448).get((Object) null);
        Class<? extends Object> term212696 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipSize");
        Field term212695 = ((Class) term212696).getDeclaredField((String) "SMALL");
        ((Field) term212695).setAccessible(true);
        Object enum687 = ((Field) term212695).get((Object) null);
        Class<? extends Object> term212923 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term212922 = ((Class) term212923).getDeclaredField((String) "PEACEFUL");
        ((Field) term212922).setAccessible(true);
        Object enum688 = ((Field) term212922).get((Object) null);
        Class<? extends Object> term213184 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term213183 = ((Class) term213184).getDeclaredField((String) "PATRIARCHY");
        ((Field) term213183).setAccessible(true);
        Object enum689 = ((Field) term213183).get((Object) null);
        ArrayList term212354 = new ArrayList();
        ((ArrayList) term212354).add((Object)null);
        ((ArrayList) term212354).add((Object)null);
        ((ArrayList) term212354).add((Object)null);
        ((ArrayList) term212354).add((Object)null);
        ((ArrayList) term212354).add((Object)null);
        ((ArrayList) term212354).add((Object)null);
        ((ArrayList) term212354).add((Object)null);
        ((ArrayList) term212354).add((Object)null);
        ((ArrayList) term212354).add((Object)null);
        Class<? extends Object> term213446 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term213445 = ((Class) term213446).getDeclaredField((String) "FADE_IN_START");
        ((Field) term213445).setAccessible(true);
        Object enum690 = ((Field) term213445).get((Object) null);
        ArrayList term212363 = new ArrayList();
        ((ArrayList) term212363).add((Object)null);
        ((ArrayList) term212363).add((Object)null);
        ((ArrayList) term212363).add((Object)null);
        ((ArrayList) term212363).add((Object)null);
        ((ArrayList) term212363).add((Object)null);
        ((ArrayList) term212363).add((Object)null);
        ((ArrayList) term212363).add((Object)null);
        ((ArrayList) term212363).add((Object)null);
        ((ArrayList) term212363).add((Object)null);
        Class<? extends Object> term213722 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term213721 = ((Class) term213722).getDeclaredField((String) "ANCIENT_NORDIC");
        ((Field) term213721).setAccessible(true);
        Object enum691 = ((Field) term213721).get((Object) null);
        Class<? extends Object> term214031 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term214030 = ((Class) term214031).getDeclaredField((String) "REGULAR");
        ((Field) term214030).setAccessible(true);
        Object enum692 = ((Field) term214030).get((Object) null);
        Object term212373 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term212373, term212373.getClass(), "index", -1565507430);
        setField(term212373, term212373.getClass(), "type", null);
        setIntField(term212373, term212373.getClass(), "cost", -1974437877);
        setIntField(term212373, term212373.getClass(), "metalCost", -910087562);
        setField(term212373, term212373.getClass(), "name", null);
        setIntField(term212373, term212373.getClass(), "energyRequirement", -478100700);
        setIntField(term212373, term212373.getClass(), "energyResource", -644350910);
        setIntField(term212373, term212373.getClass(), "ftlSpeed", 1392174755);
        setIntField(term212373, term212373.getClass(), "speed", 542384961);
        setIntField(term212373, term212373.getClass(), "tacticSpeed", 821706893);
        setIntField(term212373, term212373.getClass(), "scannerRange", -624144007);
        setIntField(term212373, term212373.getClass(), "cloakDetection", 869208951);
        setIntField(term212373, term212373.getClass(), "cloaking", -1001034291);
        setIntField(term212373, term212373.getClass(), "defenseValue", -1612288598);
        setIntField(term212373, term212373.getClass(), "baySize", 1512583982);
        setIntField(term212373, term212373.getClass(), "damage", 554400317);
        setIntField(term212373, term212373.getClass(), "weaponRange", 1771270508);
        setIntField(term212373, term212373.getClass(), "initiativeBoost", 2025369602);
        setIntField(term212373, term212373.getClass(), "cultureBonus", 1229764972);
        setIntField(term212373, term212373.getClass(), "creditBonus", -202016645);
        setIntField(term212373, term212373.getClass(), "researchBonus", -1135802429);
        setIntField(term212373, term212373.getClass(), "espionageBonus", -354346702);
        setIntField(term212373, term212373.getClass(), "fleetCapacityBonus", -471266285);
        setIntField(term212373, term212373.getClass(), "hitBonus", -1203375064);
        Object term212396 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term212396, term212396.getClass(), "index", -849622887);
        setField(term212396, term212396.getClass(), "type", null);
        setIntField(term212396, term212396.getClass(), "cost", -631297994);
        setIntField(term212396, term212396.getClass(), "metalCost", 864666826);
        setField(term212396, term212396.getClass(), "name", null);
        setIntField(term212396, term212396.getClass(), "energyRequirement", 40323219);
        setIntField(term212396, term212396.getClass(), "energyResource", -2020163854);
        setIntField(term212396, term212396.getClass(), "ftlSpeed", -806823193);
        setIntField(term212396, term212396.getClass(), "speed", 128449587);
        setIntField(term212396, term212396.getClass(), "tacticSpeed", 1470799236);
        setIntField(term212396, term212396.getClass(), "scannerRange", -2013078692);
        setIntField(term212396, term212396.getClass(), "cloakDetection", -911027260);
        setIntField(term212396, term212396.getClass(), "cloaking", 1971287649);
        setIntField(term212396, term212396.getClass(), "defenseValue", -1688662880);
        setIntField(term212396, term212396.getClass(), "baySize", 635942792);
        setIntField(term212396, term212396.getClass(), "damage", -126969868);
        setIntField(term212396, term212396.getClass(), "weaponRange", 1605804678);
        setIntField(term212396, term212396.getClass(), "initiativeBoost", -1830340335);
        setIntField(term212396, term212396.getClass(), "cultureBonus", 439648027);
        setIntField(term212396, term212396.getClass(), "creditBonus", 702556555);
        setIntField(term212396, term212396.getClass(), "researchBonus", 1868194288);
        setIntField(term212396, term212396.getClass(), "espionageBonus", 517487974);
        setIntField(term212396, term212396.getClass(), "fleetCapacityBonus", -1609952826);
        setIntField(term212396, term212396.getClass(), "hitBonus", -2135129588);
        ArrayList term212371 = new ArrayList();
        ((ArrayList) term212371).add(term212373);
        ((ArrayList) term212371).add(term212396);
        term212303 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipStat"));
        Object term212304 = newInstance(Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign"));
        Object term212317 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        Object term212343 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term212360 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term212304, term212304.getClass(), "name", "zomtOAIouP");
        setIntField(term212317, term212317.getClass(), "index", 296055711);
        setField(term212317, term212317.getClass(), "name", "pwHkUmkBGN");
        setIntField(term212317, term212317.getClass(), "maxSlot", 465864250);
        setIntField(term212317, term212317.getClass(), "slotHull", 941713404);
        setField(term212317, term212317.getClass(), "hullType", enum686);
        setField(term212317, term212317.getClass(), "size", enum687);
        setIntField(term212317, term212317.getClass(), "cost", 585296192);
        setIntField(term212317, term212317.getClass(), "metalCost", -2093946527);
        setIntField(term212317, term212317.getClass(), "imageIndex", 312776664);
        setDoubleField(term212317, term212317.getClass(), "fleetCapacity", 0.9126850255993704);
        setField(term212343, term212343.getClass(), "id", "");
        setField(term212343, term212343.getClass(), "name", "");
        setField(term212343, term212343.getClass(), "nameSingle", "");
        setField(term212343, term212343.getClass(), "attitude", enum688);
        setField(term212343, term212343.getClass(), "imagePath", "");
        setField(term212343, term212343.getClass(), "bridgeId", "");
        setField(term212343, term212343.getClass(), "spaceShipId", "");
        setField(term212343, term212343.getClass(), "socialSystem", enum689);
        setField(term212343, term212343.getClass(), "genderList", term212354);
        setField(term212343, term212343.getClass(), "speechSetId", "");
        setField(term212343, term212343.getClass(), "bridgeEffect", enum690);
        setField(term212360, term212360.getClass(), "songName", null);
        setField(term212360, term212360.getClass(), "author", null);
        setField(term212360, term212360.getClass(), "fileName", null);
        setBooleanField(term212360, term212360.getClass(), "custom", true);
        setIntField(term212360, term212360.getClass(), "fadingLimit", 243025663);
        setField(term212343, term212343.getClass(), "diplomacyMusic", term212360);
        setField(term212343, term212343.getClass(), "traits", term212363);
        setField(term212343, term212343.getClass(), "leaderNameGenerator", enum691);
        setField(term212343, term212343.getClass(), "description", "");
        setField(term212343, term212343.getClass(), "spaceRaceType", enum692);
        setField(term212317, term212317.getClass(), "originalBuilder", term212343);
        setField(term212304, term212304.getClass(), "hull", term212317);
        setField(term212304, term212304.getClass(), "components", term212371);
        setField(term212303, term212303.getClass(), "design", term212304);
        setIntField(term212303, term212303.getClass(), "numberOfCombats", -1453667786);
        setIntField(term212303, term212303.getClass(), "numberOfVictories", 390534071);
        setIntField(term212303, term212303.getClass(), "numberOfLoses", 134001300);
        setIntField(term212303, term212303.getClass(), "numberOfKills", -1533628114);
        setIntField(term212303, term212303.getClass(), "numberOfBuilt", 886396590);
        setIntField(term212303, term212303.getClass(), "numberOfInUse", -1864639476);
        setBooleanField(term212303, term212303.getClass(), "obsolete", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipStat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDesign", argTypes, term212303, args);
    }

};


