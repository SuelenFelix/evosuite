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

public class ShipStat_getDesignStatsAsHtml_2781031217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216239;

    public ShipStat_getDesignStatsAsHtml_2781031217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term216385 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipHullType");
        Field term216384 = ((Class) term216385).getDeclaredField((String) "PRIVATEER");
        ((Field) term216384).setAccessible(true);
        Object enum700 = ((Field) term216384).get((Object) null);
        Class<? extends Object> term216644 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipSize");
        Field term216643 = ((Class) term216644).getDeclaredField((String) "HUGE");
        ((Field) term216643).setAccessible(true);
        Object enum701 = ((Field) term216643).get((Object) null);
        Class<? extends Object> term216868 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term216867 = ((Class) term216868).getDeclaredField((String) "MILITARISTIC");
        ((Field) term216867).setAccessible(true);
        Object enum702 = ((Field) term216867).get((Object) null);
        Class<? extends Object> term217141 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term217140 = ((Class) term217141).getDeclaredField((String) "MATRIARCHY");
        ((Field) term217140).setAccessible(true);
        Object enum703 = ((Field) term217140).get((Object) null);
        ArrayList term216290 = new ArrayList();
        ((ArrayList) term216290).add((Object)null);
        ((ArrayList) term216290).add((Object)null);
        ((ArrayList) term216290).add((Object)null);
        ((ArrayList) term216290).add((Object)null);
        ((ArrayList) term216290).add((Object)null);
        ((ArrayList) term216290).add((Object)null);
        ((ArrayList) term216290).add((Object)null);
        Class<? extends Object> term217403 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term217402 = ((Class) term217403).getDeclaredField((String) "NUKE_FADE");
        ((Field) term217402).setAccessible(true);
        Object enum704 = ((Field) term217402).get((Object) null);
        ArrayList term216299 = new ArrayList();
        ((ArrayList) term216299).add((Object)null);
        ((ArrayList) term216299).add((Object)null);
        ((ArrayList) term216299).add((Object)null);
        ((ArrayList) term216299).add((Object)null);
        ((ArrayList) term216299).add((Object)null);
        ((ArrayList) term216299).add((Object)null);
        Class<? extends Object> term217667 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term217666 = ((Class) term217667).getDeclaredField((String) "ANCIENT_ROMAN");
        ((Field) term217666).setAccessible(true);
        Object enum705 = ((Field) term217666).get((Object) null);
        Class<? extends Object> term217973 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term217972 = ((Class) term217973).getDeclaredField((String) "SPACE_MONSTER");
        ((Field) term217972).setAccessible(true);
        Object enum706 = ((Field) term217972).get((Object) null);
        Object term216309 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term216309, term216309.getClass(), "index", 1393801591);
        setField(term216309, term216309.getClass(), "type", null);
        setIntField(term216309, term216309.getClass(), "cost", -1187577742);
        setIntField(term216309, term216309.getClass(), "metalCost", -793777683);
        setField(term216309, term216309.getClass(), "name", null);
        setIntField(term216309, term216309.getClass(), "energyRequirement", 1741594607);
        setIntField(term216309, term216309.getClass(), "energyResource", 853592734);
        setIntField(term216309, term216309.getClass(), "ftlSpeed", -626491911);
        setIntField(term216309, term216309.getClass(), "speed", -648815069);
        setIntField(term216309, term216309.getClass(), "tacticSpeed", 1501415160);
        setIntField(term216309, term216309.getClass(), "scannerRange", 905044945);
        setIntField(term216309, term216309.getClass(), "cloakDetection", -1878642551);
        setIntField(term216309, term216309.getClass(), "cloaking", 300043927);
        setIntField(term216309, term216309.getClass(), "defenseValue", 2122930718);
        setIntField(term216309, term216309.getClass(), "baySize", -578301288);
        setIntField(term216309, term216309.getClass(), "damage", -977176926);
        setIntField(term216309, term216309.getClass(), "weaponRange", 57300217);
        setIntField(term216309, term216309.getClass(), "initiativeBoost", -296773597);
        setIntField(term216309, term216309.getClass(), "cultureBonus", 1865713857);
        setIntField(term216309, term216309.getClass(), "creditBonus", 1621042327);
        setIntField(term216309, term216309.getClass(), "researchBonus", -1687833420);
        setIntField(term216309, term216309.getClass(), "espionageBonus", -1302564054);
        setIntField(term216309, term216309.getClass(), "fleetCapacityBonus", 1902301591);
        setIntField(term216309, term216309.getClass(), "hitBonus", 1413243835);
        Object term216332 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term216332, term216332.getClass(), "index", 267793727);
        setField(term216332, term216332.getClass(), "type", null);
        setIntField(term216332, term216332.getClass(), "cost", 824213114);
        setIntField(term216332, term216332.getClass(), "metalCost", -1652054445);
        setField(term216332, term216332.getClass(), "name", null);
        setIntField(term216332, term216332.getClass(), "energyRequirement", -2032148548);
        setIntField(term216332, term216332.getClass(), "energyResource", 1592642995);
        setIntField(term216332, term216332.getClass(), "ftlSpeed", 537031810);
        setIntField(term216332, term216332.getClass(), "speed", -1280322093);
        setIntField(term216332, term216332.getClass(), "tacticSpeed", -614078903);
        setIntField(term216332, term216332.getClass(), "scannerRange", 250967452);
        setIntField(term216332, term216332.getClass(), "cloakDetection", -67856100);
        setIntField(term216332, term216332.getClass(), "cloaking", -1760300151);
        setIntField(term216332, term216332.getClass(), "defenseValue", 635198715);
        setIntField(term216332, term216332.getClass(), "baySize", -619729133);
        setIntField(term216332, term216332.getClass(), "damage", -91784171);
        setIntField(term216332, term216332.getClass(), "weaponRange", -1752710731);
        setIntField(term216332, term216332.getClass(), "initiativeBoost", -1991397007);
        setIntField(term216332, term216332.getClass(), "cultureBonus", -1896800756);
        setIntField(term216332, term216332.getClass(), "creditBonus", -855121939);
        setIntField(term216332, term216332.getClass(), "researchBonus", 389647062);
        setIntField(term216332, term216332.getClass(), "espionageBonus", 59254717);
        setIntField(term216332, term216332.getClass(), "fleetCapacityBonus", -1753562901);
        setIntField(term216332, term216332.getClass(), "hitBonus", 1942866138);
        ArrayList term216307 = new ArrayList();
        ((ArrayList) term216307).add(term216309);
        ((ArrayList) term216307).add(term216332);
        term216239 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipStat"));
        Object term216240 = newInstance(Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign"));
        Object term216253 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        Object term216279 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term216296 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term216240, term216240.getClass(), "name", "QrXzPOoTMM");
        setIntField(term216253, term216253.getClass(), "index", -1563918188);
        setField(term216253, term216253.getClass(), "name", "ovDeGFzsPr");
        setIntField(term216253, term216253.getClass(), "maxSlot", 153656028);
        setIntField(term216253, term216253.getClass(), "slotHull", 440521526);
        setField(term216253, term216253.getClass(), "hullType", enum700);
        setField(term216253, term216253.getClass(), "size", enum701);
        setIntField(term216253, term216253.getClass(), "cost", -1106412249);
        setIntField(term216253, term216253.getClass(), "metalCost", -1922114971);
        setIntField(term216253, term216253.getClass(), "imageIndex", -1285495576);
        setDoubleField(term216253, term216253.getClass(), "fleetCapacity", 0.5306473989087822);
        setField(term216279, term216279.getClass(), "id", "");
        setField(term216279, term216279.getClass(), "name", "");
        setField(term216279, term216279.getClass(), "nameSingle", "");
        setField(term216279, term216279.getClass(), "attitude", enum702);
        setField(term216279, term216279.getClass(), "imagePath", "");
        setField(term216279, term216279.getClass(), "bridgeId", "");
        setField(term216279, term216279.getClass(), "spaceShipId", "");
        setField(term216279, term216279.getClass(), "socialSystem", enum703);
        setField(term216279, term216279.getClass(), "genderList", term216290);
        setField(term216279, term216279.getClass(), "speechSetId", "");
        setField(term216279, term216279.getClass(), "bridgeEffect", enum704);
        setField(term216296, term216296.getClass(), "songName", null);
        setField(term216296, term216296.getClass(), "author", null);
        setField(term216296, term216296.getClass(), "fileName", null);
        setBooleanField(term216296, term216296.getClass(), "custom", false);
        setIntField(term216296, term216296.getClass(), "fadingLimit", 605159454);
        setField(term216279, term216279.getClass(), "diplomacyMusic", term216296);
        setField(term216279, term216279.getClass(), "traits", term216299);
        setField(term216279, term216279.getClass(), "leaderNameGenerator", enum705);
        setField(term216279, term216279.getClass(), "description", "");
        setField(term216279, term216279.getClass(), "spaceRaceType", enum706);
        setField(term216253, term216253.getClass(), "originalBuilder", term216279);
        setField(term216240, term216240.getClass(), "hull", term216253);
        setField(term216240, term216240.getClass(), "components", term216307);
        setField(term216239, term216239.getClass(), "design", term216240);
        setIntField(term216239, term216239.getClass(), "numberOfCombats", -628548003);
        setIntField(term216239, term216239.getClass(), "numberOfVictories", -1600050434);
        setIntField(term216239, term216239.getClass(), "numberOfLoses", 2068225629);
        setIntField(term216239, term216239.getClass(), "numberOfKills", 230619154);
        setIntField(term216239, term216239.getClass(), "numberOfBuilt", 939877540);
        setIntField(term216239, term216239.getClass(), "numberOfInUse", -1177910195);
        setBooleanField(term216239, term216239.getClass(), "obsolete", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipStat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDesignStatsAsHtml", argTypes, term216239, args);
    }

};


