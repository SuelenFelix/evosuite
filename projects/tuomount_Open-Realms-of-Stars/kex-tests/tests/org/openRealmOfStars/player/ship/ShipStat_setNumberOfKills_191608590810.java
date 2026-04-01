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

public class ShipStat_setNumberOfKills_191608590810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202012;
     Object term202137;

    public ShipStat_setNumberOfKills_191608590810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term202160 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipHullType");
        Field term202159 = ((Class) term202160).getDeclaredField((String) "NORMAL");
        ((Field) term202159).setAccessible(true);
        Object enum651 = ((Field) term202159).get((Object) null);
        Class<? extends Object> term202410 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipSize");
        Field term202409 = ((Class) term202410).getDeclaredField((String) "HUGE");
        ((Field) term202409).setAccessible(true);
        Object enum652 = ((Field) term202409).get((Object) null);
        Class<? extends Object> term202634 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term202633 = ((Class) term202634).getDeclaredField((String) "BACKSTABBING");
        ((Field) term202633).setAccessible(true);
        Object enum653 = ((Field) term202633).get((Object) null);
        Class<? extends Object> term202907 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term202906 = ((Class) term202907).getDeclaredField((String) "EQUAL");
        ((Field) term202906).setAccessible(true);
        Object enum654 = ((Field) term202906).get((Object) null);
        ArrayList term202063 = new ArrayList();
        ((ArrayList) term202063).add((Object)null);
        ((ArrayList) term202063).add((Object)null);
        ((ArrayList) term202063).add((Object)null);
        ((ArrayList) term202063).add((Object)null);
        ((ArrayList) term202063).add((Object)null);
        ((ArrayList) term202063).add((Object)null);
        Class<? extends Object> term203154 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term203153 = ((Class) term203154).getDeclaredField((String) "DARK_RED");
        ((Field) term203153).setAccessible(true);
        Object enum655 = ((Field) term203153).get((Object) null);
        ArrayList term202072 = new ArrayList();
        ((ArrayList) term202072).add((Object)null);
        ((ArrayList) term202072).add((Object)null);
        ((ArrayList) term202072).add((Object)null);
        ((ArrayList) term202072).add((Object)null);
        ((ArrayList) term202072).add((Object)null);
        Class<? extends Object> term203415 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term203414 = ((Class) term203415).getDeclaredField((String) "DEEP_CREATURE");
        ((Field) term203414).setAccessible(true);
        Object enum656 = ((Field) term203414).get((Object) null);
        Class<? extends Object> term203721 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term203720 = ((Class) term203721).getDeclaredField((String) "REGULAR");
        ((Field) term203720).setAccessible(true);
        Object enum657 = ((Field) term203720).get((Object) null);
        Object term202082 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term202082, term202082.getClass(), "index", 1093205391);
        setField(term202082, term202082.getClass(), "type", null);
        setIntField(term202082, term202082.getClass(), "cost", 712406676);
        setIntField(term202082, term202082.getClass(), "metalCost", -689175370);
        setField(term202082, term202082.getClass(), "name", null);
        setIntField(term202082, term202082.getClass(), "energyRequirement", 1928157231);
        setIntField(term202082, term202082.getClass(), "energyResource", -2074171560);
        setIntField(term202082, term202082.getClass(), "ftlSpeed", -1484133359);
        setIntField(term202082, term202082.getClass(), "speed", -221900568);
        setIntField(term202082, term202082.getClass(), "tacticSpeed", -660551612);
        setIntField(term202082, term202082.getClass(), "scannerRange", -1263481774);
        setIntField(term202082, term202082.getClass(), "cloakDetection", 304959828);
        setIntField(term202082, term202082.getClass(), "cloaking", -398737037);
        setIntField(term202082, term202082.getClass(), "defenseValue", 108801223);
        setIntField(term202082, term202082.getClass(), "baySize", 1181798962);
        setIntField(term202082, term202082.getClass(), "damage", 1950935768);
        setIntField(term202082, term202082.getClass(), "weaponRange", -733715380);
        setIntField(term202082, term202082.getClass(), "initiativeBoost", 1537598422);
        setIntField(term202082, term202082.getClass(), "cultureBonus", 2011217936);
        setIntField(term202082, term202082.getClass(), "creditBonus", 490201050);
        setIntField(term202082, term202082.getClass(), "researchBonus", 1544509853);
        setIntField(term202082, term202082.getClass(), "espionageBonus", -837360714);
        setIntField(term202082, term202082.getClass(), "fleetCapacityBonus", -605017762);
        setIntField(term202082, term202082.getClass(), "hitBonus", -1606452163);
        Object term202105 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term202105, term202105.getClass(), "index", -1590822439);
        setField(term202105, term202105.getClass(), "type", null);
        setIntField(term202105, term202105.getClass(), "cost", -141055649);
        setIntField(term202105, term202105.getClass(), "metalCost", 2045269013);
        setField(term202105, term202105.getClass(), "name", null);
        setIntField(term202105, term202105.getClass(), "energyRequirement", 1260268717);
        setIntField(term202105, term202105.getClass(), "energyResource", -601011951);
        setIntField(term202105, term202105.getClass(), "ftlSpeed", 700386109);
        setIntField(term202105, term202105.getClass(), "speed", -2030563792);
        setIntField(term202105, term202105.getClass(), "tacticSpeed", 659265799);
        setIntField(term202105, term202105.getClass(), "scannerRange", -2000221306);
        setIntField(term202105, term202105.getClass(), "cloakDetection", -1480264652);
        setIntField(term202105, term202105.getClass(), "cloaking", 950199901);
        setIntField(term202105, term202105.getClass(), "defenseValue", -566918920);
        setIntField(term202105, term202105.getClass(), "baySize", -516485250);
        setIntField(term202105, term202105.getClass(), "damage", -1315484955);
        setIntField(term202105, term202105.getClass(), "weaponRange", 1864285170);
        setIntField(term202105, term202105.getClass(), "initiativeBoost", -1621410076);
        setIntField(term202105, term202105.getClass(), "cultureBonus", -239419301);
        setIntField(term202105, term202105.getClass(), "creditBonus", 1572833583);
        setIntField(term202105, term202105.getClass(), "researchBonus", -404366819);
        setIntField(term202105, term202105.getClass(), "espionageBonus", 417600776);
        setIntField(term202105, term202105.getClass(), "fleetCapacityBonus", -821143832);
        setIntField(term202105, term202105.getClass(), "hitBonus", -1416902664);
        ArrayList term202080 = new ArrayList();
        ((ArrayList) term202080).add(term202082);
        ((ArrayList) term202080).add(term202105);
        term202012 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipStat"));
        Object term202013 = newInstance(Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign"));
        Object term202026 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        Object term202052 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term202069 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term202013, term202013.getClass(), "name", "YStxlrcedL");
        setIntField(term202026, term202026.getClass(), "index", 885547834);
        setField(term202026, term202026.getClass(), "name", "mDLwflwlja");
        setIntField(term202026, term202026.getClass(), "maxSlot", 950260961);
        setIntField(term202026, term202026.getClass(), "slotHull", 1260887150);
        setField(term202026, term202026.getClass(), "hullType", enum651);
        setField(term202026, term202026.getClass(), "size", enum652);
        setIntField(term202026, term202026.getClass(), "cost", -1320147216);
        setIntField(term202026, term202026.getClass(), "metalCost", -2003639421);
        setIntField(term202026, term202026.getClass(), "imageIndex", -1986137013);
        setDoubleField(term202026, term202026.getClass(), "fleetCapacity", 0.7919370314903882);
        setField(term202052, term202052.getClass(), "id", "");
        setField(term202052, term202052.getClass(), "name", "");
        setField(term202052, term202052.getClass(), "nameSingle", "");
        setField(term202052, term202052.getClass(), "attitude", enum653);
        setField(term202052, term202052.getClass(), "imagePath", "");
        setField(term202052, term202052.getClass(), "bridgeId", "");
        setField(term202052, term202052.getClass(), "spaceShipId", "");
        setField(term202052, term202052.getClass(), "socialSystem", enum654);
        setField(term202052, term202052.getClass(), "genderList", term202063);
        setField(term202052, term202052.getClass(), "speechSetId", "");
        setField(term202052, term202052.getClass(), "bridgeEffect", enum655);
        setField(term202069, term202069.getClass(), "songName", null);
        setField(term202069, term202069.getClass(), "author", null);
        setField(term202069, term202069.getClass(), "fileName", null);
        setBooleanField(term202069, term202069.getClass(), "custom", false);
        setIntField(term202069, term202069.getClass(), "fadingLimit", 1067010136);
        setField(term202052, term202052.getClass(), "diplomacyMusic", term202069);
        setField(term202052, term202052.getClass(), "traits", term202072);
        setField(term202052, term202052.getClass(), "leaderNameGenerator", enum656);
        setField(term202052, term202052.getClass(), "description", "");
        setField(term202052, term202052.getClass(), "spaceRaceType", enum657);
        setField(term202026, term202026.getClass(), "originalBuilder", term202052);
        setField(term202013, term202013.getClass(), "hull", term202026);
        setField(term202013, term202013.getClass(), "components", term202080);
        setField(term202012, term202012.getClass(), "design", term202013);
        setIntField(term202012, term202012.getClass(), "numberOfCombats", -1435299233);
        setIntField(term202012, term202012.getClass(), "numberOfVictories", -1100306206);
        setIntField(term202012, term202012.getClass(), "numberOfLoses", 68958966);
        setIntField(term202012, term202012.getClass(), "numberOfKills", 349586221);
        setIntField(term202012, term202012.getClass(), "numberOfBuilt", -2038396357);
        setIntField(term202012, term202012.getClass(), "numberOfInUse", -1334161201);
        setBooleanField(term202012, term202012.getClass(), "obsolete", false);
        term202137 = new Integer(-2125960665);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipStat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term202137;
        callMethod(klass, "setNumberOfKills", argTypes, term202012, args);
    }

};


