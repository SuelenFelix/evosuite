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

public class ShipStat_getNumberOfKills_9924250029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200000;

    public ShipStat_getNumberOfKills_9924250029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term200146 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipHullType");
        Field term200145 = ((Class) term200146).getDeclaredField((String) "STARBASE");
        ((Field) term200145).setAccessible(true);
        Object enum644 = ((Field) term200145).get((Object) null);
        Class<? extends Object> term200402 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipSize");
        Field term200401 = ((Class) term200402).getDeclaredField((String) "LARGE");
        ((Field) term200401).setAccessible(true);
        Object enum645 = ((Field) term200401).get((Object) null);
        Class<? extends Object> term200629 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term200628 = ((Class) term200629).getDeclaredField((String) "EXPANSIONIST");
        ((Field) term200628).setAccessible(true);
        Object enum646 = ((Field) term200628).get((Object) null);
        Class<? extends Object> term200902 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term200901 = ((Class) term200902).getDeclaredField((String) "MATRIARCHY");
        ((Field) term200901).setAccessible(true);
        Object enum647 = ((Field) term200901).get((Object) null);
        ArrayList term200051 = new ArrayList();
        Class<? extends Object> term201164 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term201163 = ((Class) term201164).getDeclaredField((String) "TEST");
        ((Field) term201163).setAccessible(true);
        Object enum648 = ((Field) term201163).get((Object) null);
        ArrayList term200060 = new ArrayList();
        ((ArrayList) term200060).add((Object)null);
        ((ArrayList) term200060).add((Object)null);
        Class<? extends Object> term201413 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term201412 = ((Class) term201413).getDeclaredField((String) "DEEP_ANCIENT_MONSTER");
        ((Field) term201412).setAccessible(true);
        Object enum649 = ((Field) term201412).get((Object) null);
        Class<? extends Object> term201740 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term201739 = ((Class) term201740).getDeclaredField((String) "SPACE_PIRATE");
        ((Field) term201739).setAccessible(true);
        Object enum650 = ((Field) term201739).get((Object) null);
        Object term200070 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term200070, term200070.getClass(), "index", 683645623);
        setField(term200070, term200070.getClass(), "type", null);
        setIntField(term200070, term200070.getClass(), "cost", -1807588897);
        setIntField(term200070, term200070.getClass(), "metalCost", 702237858);
        setField(term200070, term200070.getClass(), "name", null);
        setIntField(term200070, term200070.getClass(), "energyRequirement", -70803343);
        setIntField(term200070, term200070.getClass(), "energyResource", -2147305933);
        setIntField(term200070, term200070.getClass(), "ftlSpeed", 1174830017);
        setIntField(term200070, term200070.getClass(), "speed", 2140219446);
        setIntField(term200070, term200070.getClass(), "tacticSpeed", -417525632);
        setIntField(term200070, term200070.getClass(), "scannerRange", 1228187048);
        setIntField(term200070, term200070.getClass(), "cloakDetection", -809028643);
        setIntField(term200070, term200070.getClass(), "cloaking", -1322926388);
        setIntField(term200070, term200070.getClass(), "defenseValue", 701619360);
        setIntField(term200070, term200070.getClass(), "baySize", 930820216);
        setIntField(term200070, term200070.getClass(), "damage", -1573368178);
        setIntField(term200070, term200070.getClass(), "weaponRange", -1007994686);
        setIntField(term200070, term200070.getClass(), "initiativeBoost", -849828336);
        setIntField(term200070, term200070.getClass(), "cultureBonus", 184687223);
        setIntField(term200070, term200070.getClass(), "creditBonus", 1768023420);
        setIntField(term200070, term200070.getClass(), "researchBonus", -409163006);
        setIntField(term200070, term200070.getClass(), "espionageBonus", 1632107117);
        setIntField(term200070, term200070.getClass(), "fleetCapacityBonus", -351038803);
        setIntField(term200070, term200070.getClass(), "hitBonus", 1899735308);
        Object term200093 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term200093, term200093.getClass(), "index", -1204343453);
        setField(term200093, term200093.getClass(), "type", null);
        setIntField(term200093, term200093.getClass(), "cost", 1796650051);
        setIntField(term200093, term200093.getClass(), "metalCost", -1736291750);
        setField(term200093, term200093.getClass(), "name", null);
        setIntField(term200093, term200093.getClass(), "energyRequirement", 490095898);
        setIntField(term200093, term200093.getClass(), "energyResource", -2115800242);
        setIntField(term200093, term200093.getClass(), "ftlSpeed", 518344933);
        setIntField(term200093, term200093.getClass(), "speed", -168855495);
        setIntField(term200093, term200093.getClass(), "tacticSpeed", -810951451);
        setIntField(term200093, term200093.getClass(), "scannerRange", -347223388);
        setIntField(term200093, term200093.getClass(), "cloakDetection", -1473884288);
        setIntField(term200093, term200093.getClass(), "cloaking", 995576841);
        setIntField(term200093, term200093.getClass(), "defenseValue", 35377738);
        setIntField(term200093, term200093.getClass(), "baySize", -1203460897);
        setIntField(term200093, term200093.getClass(), "damage", 461696366);
        setIntField(term200093, term200093.getClass(), "weaponRange", -1208838584);
        setIntField(term200093, term200093.getClass(), "initiativeBoost", 800934965);
        setIntField(term200093, term200093.getClass(), "cultureBonus", -648802697);
        setIntField(term200093, term200093.getClass(), "creditBonus", -1853172793);
        setIntField(term200093, term200093.getClass(), "researchBonus", 1629792321);
        setIntField(term200093, term200093.getClass(), "espionageBonus", 1671901268);
        setIntField(term200093, term200093.getClass(), "fleetCapacityBonus", 664189062);
        setIntField(term200093, term200093.getClass(), "hitBonus", 142248510);
        ArrayList term200068 = new ArrayList();
        ((ArrayList) term200068).add(term200070);
        ((ArrayList) term200068).add(term200093);
        term200000 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipStat"));
        Object term200001 = newInstance(Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign"));
        Object term200014 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        Object term200040 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term200057 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term200001, term200001.getClass(), "name", "nqNHstnjtW");
        setIntField(term200014, term200014.getClass(), "index", -356798505);
        setField(term200014, term200014.getClass(), "name", "xWqIkjeUFn");
        setIntField(term200014, term200014.getClass(), "maxSlot", 1298263326);
        setIntField(term200014, term200014.getClass(), "slotHull", 1534262946);
        setField(term200014, term200014.getClass(), "hullType", enum644);
        setField(term200014, term200014.getClass(), "size", enum645);
        setIntField(term200014, term200014.getClass(), "cost", -732512836);
        setIntField(term200014, term200014.getClass(), "metalCost", -583097103);
        setIntField(term200014, term200014.getClass(), "imageIndex", 390772759);
        setDoubleField(term200014, term200014.getClass(), "fleetCapacity", 0.20737514139742264);
        setField(term200040, term200040.getClass(), "id", "");
        setField(term200040, term200040.getClass(), "name", "");
        setField(term200040, term200040.getClass(), "nameSingle", "");
        setField(term200040, term200040.getClass(), "attitude", enum646);
        setField(term200040, term200040.getClass(), "imagePath", "");
        setField(term200040, term200040.getClass(), "bridgeId", "");
        setField(term200040, term200040.getClass(), "spaceShipId", "");
        setField(term200040, term200040.getClass(), "socialSystem", enum647);
        setField(term200040, term200040.getClass(), "genderList", term200051);
        setField(term200040, term200040.getClass(), "speechSetId", "");
        setField(term200040, term200040.getClass(), "bridgeEffect", enum648);
        setField(term200057, term200057.getClass(), "songName", null);
        setField(term200057, term200057.getClass(), "author", null);
        setField(term200057, term200057.getClass(), "fileName", null);
        setBooleanField(term200057, term200057.getClass(), "custom", false);
        setIntField(term200057, term200057.getClass(), "fadingLimit", 121280572);
        setField(term200040, term200040.getClass(), "diplomacyMusic", term200057);
        setField(term200040, term200040.getClass(), "traits", term200060);
        setField(term200040, term200040.getClass(), "leaderNameGenerator", enum649);
        setField(term200040, term200040.getClass(), "description", "");
        setField(term200040, term200040.getClass(), "spaceRaceType", enum650);
        setField(term200014, term200014.getClass(), "originalBuilder", term200040);
        setField(term200001, term200001.getClass(), "hull", term200014);
        setField(term200001, term200001.getClass(), "components", term200068);
        setField(term200000, term200000.getClass(), "design", term200001);
        setIntField(term200000, term200000.getClass(), "numberOfCombats", -216485815);
        setIntField(term200000, term200000.getClass(), "numberOfVictories", -2089843700);
        setIntField(term200000, term200000.getClass(), "numberOfLoses", 1415280814);
        setIntField(term200000, term200000.getClass(), "numberOfKills", -1126317271);
        setIntField(term200000, term200000.getClass(), "numberOfBuilt", -131983803);
        setIntField(term200000, term200000.getClass(), "numberOfInUse", -939562832);
        setBooleanField(term200000, term200000.getClass(), "obsolete", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipStat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNumberOfKills", argTypes, term200000, args);
    }

};


