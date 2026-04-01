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
import java.lang.Boolean;

public class ShipStat_setObsolete_104845730820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222194;
     Object term222319;

    public ShipStat_setObsolete_104845730820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term222342 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipHullType");
        Field term222341 = ((Class) term222342).getDeclaredField((String) "ORBITAL");
        ((Field) term222341).setAccessible(true);
        Object enum721 = ((Field) term222341).get((Object) null);
        Class<? extends Object> term222595 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipSize");
        Field term222594 = ((Class) term222595).getDeclaredField((String) "MINOR");
        ((Field) term222594).setAccessible(true);
        Object enum722 = ((Field) term222594).get((Object) null);
        Class<? extends Object> term222822 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term222821 = ((Class) term222822).getDeclaredField((String) "BACKSTABBING");
        ((Field) term222821).setAccessible(true);
        Object enum723 = ((Field) term222821).get((Object) null);
        Class<? extends Object> term223095 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term223094 = ((Class) term223095).getDeclaredField((String) "EQUAL");
        ((Field) term223094).setAccessible(true);
        Object enum724 = ((Field) term223094).get((Object) null);
        ArrayList term222245 = new ArrayList();
        ((ArrayList) term222245).add((Object)null);
        ((ArrayList) term222245).add((Object)null);
        ((ArrayList) term222245).add((Object)null);
        ((ArrayList) term222245).add((Object)null);
        ((ArrayList) term222245).add((Object)null);
        ((ArrayList) term222245).add((Object)null);
        ((ArrayList) term222245).add((Object)null);
        Class<? extends Object> term223342 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term223341 = ((Class) term223342).getDeclaredField((String) "DARK_RED");
        ((Field) term223341).setAccessible(true);
        Object enum725 = ((Field) term223341).get((Object) null);
        ArrayList term222254 = new ArrayList();
        ((ArrayList) term222254).add((Object)null);
        ((ArrayList) term222254).add((Object)null);
        ((ArrayList) term222254).add((Object)null);
        ((ArrayList) term222254).add((Object)null);
        ((ArrayList) term222254).add((Object)null);
        ((ArrayList) term222254).add((Object)null);
        ((ArrayList) term222254).add((Object)null);
        ((ArrayList) term222254).add((Object)null);
        ((ArrayList) term222254).add((Object)null);
        Class<? extends Object> term223603 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term223602 = ((Class) term223603).getDeclaredField((String) "DEEP_CREATURE");
        ((Field) term223602).setAccessible(true);
        Object enum726 = ((Field) term223602).get((Object) null);
        Class<? extends Object> term223909 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term223908 = ((Class) term223909).getDeclaredField((String) "SPACE_MONSTER");
        ((Field) term223908).setAccessible(true);
        Object enum727 = ((Field) term223908).get((Object) null);
        Object term222264 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term222264, term222264.getClass(), "index", 1527507424);
        setField(term222264, term222264.getClass(), "type", null);
        setIntField(term222264, term222264.getClass(), "cost", -2100070024);
        setIntField(term222264, term222264.getClass(), "metalCost", 1206642688);
        setField(term222264, term222264.getClass(), "name", null);
        setIntField(term222264, term222264.getClass(), "energyRequirement", 224560582);
        setIntField(term222264, term222264.getClass(), "energyResource", 1608206239);
        setIntField(term222264, term222264.getClass(), "ftlSpeed", -989652648);
        setIntField(term222264, term222264.getClass(), "speed", 234527042);
        setIntField(term222264, term222264.getClass(), "tacticSpeed", -1070770514);
        setIntField(term222264, term222264.getClass(), "scannerRange", 1004064636);
        setIntField(term222264, term222264.getClass(), "cloakDetection", -1815732679);
        setIntField(term222264, term222264.getClass(), "cloaking", -2141382740);
        setIntField(term222264, term222264.getClass(), "defenseValue", -1545135290);
        setIntField(term222264, term222264.getClass(), "baySize", -802934163);
        setIntField(term222264, term222264.getClass(), "damage", -1934019263);
        setIntField(term222264, term222264.getClass(), "weaponRange", 530191772);
        setIntField(term222264, term222264.getClass(), "initiativeBoost", 698731814);
        setIntField(term222264, term222264.getClass(), "cultureBonus", -1282557913);
        setIntField(term222264, term222264.getClass(), "creditBonus", -2080692202);
        setIntField(term222264, term222264.getClass(), "researchBonus", 601982968);
        setIntField(term222264, term222264.getClass(), "espionageBonus", -999152791);
        setIntField(term222264, term222264.getClass(), "fleetCapacityBonus", 771966144);
        setIntField(term222264, term222264.getClass(), "hitBonus", -270951499);
        Object term222287 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term222287, term222287.getClass(), "index", 1283219056);
        setField(term222287, term222287.getClass(), "type", null);
        setIntField(term222287, term222287.getClass(), "cost", 1914052513);
        setIntField(term222287, term222287.getClass(), "metalCost", -1810525034);
        setField(term222287, term222287.getClass(), "name", null);
        setIntField(term222287, term222287.getClass(), "energyRequirement", -2104858494);
        setIntField(term222287, term222287.getClass(), "energyResource", 1665727494);
        setIntField(term222287, term222287.getClass(), "ftlSpeed", 487781899);
        setIntField(term222287, term222287.getClass(), "speed", 322622063);
        setIntField(term222287, term222287.getClass(), "tacticSpeed", -1768300641);
        setIntField(term222287, term222287.getClass(), "scannerRange", 996684751);
        setIntField(term222287, term222287.getClass(), "cloakDetection", 1947256067);
        setIntField(term222287, term222287.getClass(), "cloaking", -2111706143);
        setIntField(term222287, term222287.getClass(), "defenseValue", 1147638144);
        setIntField(term222287, term222287.getClass(), "baySize", 1513541114);
        setIntField(term222287, term222287.getClass(), "damage", 558747577);
        setIntField(term222287, term222287.getClass(), "weaponRange", 532432884);
        setIntField(term222287, term222287.getClass(), "initiativeBoost", 177236415);
        setIntField(term222287, term222287.getClass(), "cultureBonus", -2132027119);
        setIntField(term222287, term222287.getClass(), "creditBonus", -2101727195);
        setIntField(term222287, term222287.getClass(), "researchBonus", 2111423493);
        setIntField(term222287, term222287.getClass(), "espionageBonus", -1312934868);
        setIntField(term222287, term222287.getClass(), "fleetCapacityBonus", 603212671);
        setIntField(term222287, term222287.getClass(), "hitBonus", 751318072);
        ArrayList term222262 = new ArrayList();
        ((ArrayList) term222262).add(term222264);
        ((ArrayList) term222262).add(term222287);
        term222194 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipStat"));
        Object term222195 = newInstance(Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign"));
        Object term222208 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        Object term222234 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term222251 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term222195, term222195.getClass(), "name", "PyaMftIAzC");
        setIntField(term222208, term222208.getClass(), "index", -1207788939);
        setField(term222208, term222208.getClass(), "name", "QiSmNdQUzl");
        setIntField(term222208, term222208.getClass(), "maxSlot", -1116962728);
        setIntField(term222208, term222208.getClass(), "slotHull", 1420647748);
        setField(term222208, term222208.getClass(), "hullType", enum721);
        setField(term222208, term222208.getClass(), "size", enum722);
        setIntField(term222208, term222208.getClass(), "cost", 1179379876);
        setIntField(term222208, term222208.getClass(), "metalCost", -1997441951);
        setIntField(term222208, term222208.getClass(), "imageIndex", -138340336);
        setDoubleField(term222208, term222208.getClass(), "fleetCapacity", 0.016575281023182953);
        setField(term222234, term222234.getClass(), "id", "");
        setField(term222234, term222234.getClass(), "name", "");
        setField(term222234, term222234.getClass(), "nameSingle", "");
        setField(term222234, term222234.getClass(), "attitude", enum723);
        setField(term222234, term222234.getClass(), "imagePath", "");
        setField(term222234, term222234.getClass(), "bridgeId", "");
        setField(term222234, term222234.getClass(), "spaceShipId", "");
        setField(term222234, term222234.getClass(), "socialSystem", enum724);
        setField(term222234, term222234.getClass(), "genderList", term222245);
        setField(term222234, term222234.getClass(), "speechSetId", "");
        setField(term222234, term222234.getClass(), "bridgeEffect", enum725);
        setField(term222251, term222251.getClass(), "songName", null);
        setField(term222251, term222251.getClass(), "author", null);
        setField(term222251, term222251.getClass(), "fileName", null);
        setBooleanField(term222251, term222251.getClass(), "custom", false);
        setIntField(term222251, term222251.getClass(), "fadingLimit", 233375431);
        setField(term222234, term222234.getClass(), "diplomacyMusic", term222251);
        setField(term222234, term222234.getClass(), "traits", term222254);
        setField(term222234, term222234.getClass(), "leaderNameGenerator", enum726);
        setField(term222234, term222234.getClass(), "description", "");
        setField(term222234, term222234.getClass(), "spaceRaceType", enum727);
        setField(term222208, term222208.getClass(), "originalBuilder", term222234);
        setField(term222195, term222195.getClass(), "hull", term222208);
        setField(term222195, term222195.getClass(), "components", term222262);
        setField(term222194, term222194.getClass(), "design", term222195);
        setIntField(term222194, term222194.getClass(), "numberOfCombats", 1804409580);
        setIntField(term222194, term222194.getClass(), "numberOfVictories", -1690181848);
        setIntField(term222194, term222194.getClass(), "numberOfLoses", 2007546193);
        setIntField(term222194, term222194.getClass(), "numberOfKills", 499702355);
        setIntField(term222194, term222194.getClass(), "numberOfBuilt", 1045240417);
        setIntField(term222194, term222194.getClass(), "numberOfInUse", -1436610766);
        setBooleanField(term222194, term222194.getClass(), "obsolete", false);
        term222319 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipStat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term222319;
        callMethod(klass, "setObsolete", argTypes, term222194, args);
    }

};


