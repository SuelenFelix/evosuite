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
import java.lang.Integer;

public class ShipStat_setNumberOfBuilt_143569971512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206057;
     Object term206182;

    public ShipStat_setNumberOfBuilt_143569971512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term206205 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipHullType");
        Field term206204 = ((Class) term206205).getDeclaredField((String) "STARBASE");
        ((Field) term206204).setAccessible(true);
        Object enum665 = ((Field) term206204).get((Object) null);
        Class<? extends Object> term206461 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipSize");
        Field term206460 = ((Class) term206461).getDeclaredField((String) "MEDIUM");
        ((Field) term206460).setAccessible(true);
        Object enum666 = ((Field) term206460).get((Object) null);
        Class<? extends Object> term206691 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term206690 = ((Class) term206691).getDeclaredField((String) "LOGICAL");
        ((Field) term206690).setAccessible(true);
        Object enum667 = ((Field) term206690).get((Object) null);
        Class<? extends Object> term206949 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term206948 = ((Class) term206949).getDeclaredField((String) "MATRIARCHY");
        ((Field) term206948).setAccessible(true);
        Object enum668 = ((Field) term206948).get((Object) null);
        ArrayList term206108 = new ArrayList();
        ((ArrayList) term206108).add((Object)null);
        ((ArrayList) term206108).add((Object)null);
        Class<? extends Object> term207211 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term207210 = ((Class) term207211).getDeclaredField((String) "DARK_RED");
        ((Field) term207210).setAccessible(true);
        Object enum669 = ((Field) term207210).get((Object) null);
        ArrayList term206117 = new ArrayList();
        Class<? extends Object> term207472 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term207471 = ((Class) term207472).getDeclaredField((String) "ANCIENT_NORDIC");
        ((Field) term207471).setAccessible(true);
        Object enum670 = ((Field) term207471).get((Object) null);
        Class<? extends Object> term207781 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term207780 = ((Class) term207781).getDeclaredField((String) "SPACE_MONSTER");
        ((Field) term207780).setAccessible(true);
        Object enum671 = ((Field) term207780).get((Object) null);
        Object term206127 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term206127, term206127.getClass(), "index", 1522351738);
        setField(term206127, term206127.getClass(), "type", null);
        setIntField(term206127, term206127.getClass(), "cost", 1017805089);
        setIntField(term206127, term206127.getClass(), "metalCost", -1625168727);
        setField(term206127, term206127.getClass(), "name", null);
        setIntField(term206127, term206127.getClass(), "energyRequirement", 1507365243);
        setIntField(term206127, term206127.getClass(), "energyResource", -1212284162);
        setIntField(term206127, term206127.getClass(), "ftlSpeed", -1956243783);
        setIntField(term206127, term206127.getClass(), "speed", 33967357);
        setIntField(term206127, term206127.getClass(), "tacticSpeed", -1227252559);
        setIntField(term206127, term206127.getClass(), "scannerRange", 1636889912);
        setIntField(term206127, term206127.getClass(), "cloakDetection", 1695339680);
        setIntField(term206127, term206127.getClass(), "cloaking", 79521146);
        setIntField(term206127, term206127.getClass(), "defenseValue", 1295906354);
        setIntField(term206127, term206127.getClass(), "baySize", 980180400);
        setIntField(term206127, term206127.getClass(), "damage", -128299328);
        setIntField(term206127, term206127.getClass(), "weaponRange", 668320250);
        setIntField(term206127, term206127.getClass(), "initiativeBoost", -2078852356);
        setIntField(term206127, term206127.getClass(), "cultureBonus", 381868688);
        setIntField(term206127, term206127.getClass(), "creditBonus", -1312990054);
        setIntField(term206127, term206127.getClass(), "researchBonus", -741512095);
        setIntField(term206127, term206127.getClass(), "espionageBonus", 1514556613);
        setIntField(term206127, term206127.getClass(), "fleetCapacityBonus", 678621067);
        setIntField(term206127, term206127.getClass(), "hitBonus", -133223081);
        Object term206150 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term206150, term206150.getClass(), "index", 1890767141);
        setField(term206150, term206150.getClass(), "type", null);
        setIntField(term206150, term206150.getClass(), "cost", -1943101906);
        setIntField(term206150, term206150.getClass(), "metalCost", 2055548921);
        setField(term206150, term206150.getClass(), "name", null);
        setIntField(term206150, term206150.getClass(), "energyRequirement", -946368228);
        setIntField(term206150, term206150.getClass(), "energyResource", -1303810032);
        setIntField(term206150, term206150.getClass(), "ftlSpeed", -489320904);
        setIntField(term206150, term206150.getClass(), "speed", -1264556218);
        setIntField(term206150, term206150.getClass(), "tacticSpeed", 989594530);
        setIntField(term206150, term206150.getClass(), "scannerRange", -1044228796);
        setIntField(term206150, term206150.getClass(), "cloakDetection", -1143503114);
        setIntField(term206150, term206150.getClass(), "cloaking", -1645386867);
        setIntField(term206150, term206150.getClass(), "defenseValue", -176403451);
        setIntField(term206150, term206150.getClass(), "baySize", 546610816);
        setIntField(term206150, term206150.getClass(), "damage", -100412540);
        setIntField(term206150, term206150.getClass(), "weaponRange", 1721386623);
        setIntField(term206150, term206150.getClass(), "initiativeBoost", -1262959141);
        setIntField(term206150, term206150.getClass(), "cultureBonus", -1778216800);
        setIntField(term206150, term206150.getClass(), "creditBonus", 101409079);
        setIntField(term206150, term206150.getClass(), "researchBonus", 667385993);
        setIntField(term206150, term206150.getClass(), "espionageBonus", 1869326215);
        setIntField(term206150, term206150.getClass(), "fleetCapacityBonus", 1721500010);
        setIntField(term206150, term206150.getClass(), "hitBonus", 347987989);
        ArrayList term206125 = new ArrayList();
        ((ArrayList) term206125).add(term206127);
        ((ArrayList) term206125).add(term206150);
        term206057 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipStat"));
        Object term206058 = newInstance(Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign"));
        Object term206071 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        Object term206097 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term206114 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term206058, term206058.getClass(), "name", "ROGqSdboUf");
        setIntField(term206071, term206071.getClass(), "index", -514683546);
        setField(term206071, term206071.getClass(), "name", "NfGNgrTcyY");
        setIntField(term206071, term206071.getClass(), "maxSlot", 1234114047);
        setIntField(term206071, term206071.getClass(), "slotHull", 781355790);
        setField(term206071, term206071.getClass(), "hullType", enum665);
        setField(term206071, term206071.getClass(), "size", enum666);
        setIntField(term206071, term206071.getClass(), "cost", 549100322);
        setIntField(term206071, term206071.getClass(), "metalCost", 398153902);
        setIntField(term206071, term206071.getClass(), "imageIndex", 377234030);
        setDoubleField(term206071, term206071.getClass(), "fleetCapacity", 0.3227335400819148);
        setField(term206097, term206097.getClass(), "id", "");
        setField(term206097, term206097.getClass(), "name", "");
        setField(term206097, term206097.getClass(), "nameSingle", "");
        setField(term206097, term206097.getClass(), "attitude", enum667);
        setField(term206097, term206097.getClass(), "imagePath", "");
        setField(term206097, term206097.getClass(), "bridgeId", "");
        setField(term206097, term206097.getClass(), "spaceShipId", "");
        setField(term206097, term206097.getClass(), "socialSystem", enum668);
        setField(term206097, term206097.getClass(), "genderList", term206108);
        setField(term206097, term206097.getClass(), "speechSetId", "");
        setField(term206097, term206097.getClass(), "bridgeEffect", enum669);
        setField(term206114, term206114.getClass(), "songName", null);
        setField(term206114, term206114.getClass(), "author", null);
        setField(term206114, term206114.getClass(), "fileName", null);
        setBooleanField(term206114, term206114.getClass(), "custom", false);
        setIntField(term206114, term206114.getClass(), "fadingLimit", 1874512723);
        setField(term206097, term206097.getClass(), "diplomacyMusic", term206114);
        setField(term206097, term206097.getClass(), "traits", term206117);
        setField(term206097, term206097.getClass(), "leaderNameGenerator", enum670);
        setField(term206097, term206097.getClass(), "description", "");
        setField(term206097, term206097.getClass(), "spaceRaceType", enum671);
        setField(term206071, term206071.getClass(), "originalBuilder", term206097);
        setField(term206058, term206058.getClass(), "hull", term206071);
        setField(term206058, term206058.getClass(), "components", term206125);
        setField(term206057, term206057.getClass(), "design", term206058);
        setIntField(term206057, term206057.getClass(), "numberOfCombats", 967236150);
        setIntField(term206057, term206057.getClass(), "numberOfVictories", 1128257999);
        setIntField(term206057, term206057.getClass(), "numberOfLoses", -1294526073);
        setIntField(term206057, term206057.getClass(), "numberOfKills", 1308295);
        setIntField(term206057, term206057.getClass(), "numberOfBuilt", -1992871983);
        setIntField(term206057, term206057.getClass(), "numberOfInUse", -746244948);
        setBooleanField(term206057, term206057.getClass(), "obsolete", true);
        term206182 = new Integer(-1545293106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipStat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term206182;
        callMethod(klass, "setNumberOfBuilt", argTypes, term206057, args);
    }

};


