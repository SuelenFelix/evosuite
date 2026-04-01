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

public class ShipStat_toString_15814252418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218248;

    public ShipStat_toString_15814252418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term218371 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipHullType");
        Field term218370 = ((Class) term218371).getDeclaredField((String) "ORBITAL");
        ((Field) term218370).setAccessible(true);
        Object enum707 = ((Field) term218370).get((Object) null);
        Class<? extends Object> term218624 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipSize");
        Field term218623 = ((Class) term218624).getDeclaredField((String) "MEDIUM");
        ((Field) term218623).setAccessible(true);
        Object enum708 = ((Field) term218623).get((Object) null);
        Class<? extends Object> term218854 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.Attitude");
        Field term218853 = ((Class) term218854).getDeclaredField((String) "SCIENTIFIC");
        ((Field) term218853).setAccessible(true);
        Object enum709 = ((Field) term218853).get((Object) null);
        Class<? extends Object> term219121 = Class.forName((String) "org.openRealmOfStars.player.race.SocialSystem");
        Field term219120 = ((Class) term219121).getDeclaredField((String) "EQUAL");
        ((Field) term219120).setAccessible(true);
        Object enum710 = ((Field) term219120).get((Object) null);
        ArrayList term218299 = new ArrayList();
        ((ArrayList) term218299).add((Object)null);
        ((ArrayList) term218299).add((Object)null);
        ((ArrayList) term218299).add((Object)null);
        ((ArrayList) term218299).add((Object)null);
        ((ArrayList) term218299).add((Object)null);
        ((ArrayList) term218299).add((Object)null);
        ((ArrayList) term218299).add((Object)null);
        ((ArrayList) term218299).add((Object)null);
        Class<? extends Object> term219368 = Class.forName((String) "org.openRealmOfStars.ambient.BridgeCommandType");
        Field term219367 = ((Class) term219368).getDeclaredField((String) "WARM_WHITE");
        ((Field) term219367).setAccessible(true);
        Object enum711 = ((Field) term219367).get((Object) null);
        ArrayList term218308 = new ArrayList();
        ((ArrayList) term218308).add((Object)null);
        ((ArrayList) term218308).add((Object)null);
        ((ArrayList) term218308).add((Object)null);
        ((ArrayList) term218308).add((Object)null);
        ((ArrayList) term218308).add((Object)null);
        Class<? extends Object> term219635 = Class.forName((String) "org.openRealmOfStars.player.leader.NameGeneratorType");
        Field term219634 = ((Class) term219635).getDeclaredField((String) "SPACE_ORC");
        ((Field) term219634).setAccessible(true);
        Object enum712 = ((Field) term219634).get((Object) null);
        Class<? extends Object> term219929 = Class.forName((String) "org.openRealmOfStars.player.race.SpaceRaceType");
        Field term219928 = ((Class) term219929).getDeclaredField((String) "SPACE_MONSTER");
        ((Field) term219928).setAccessible(true);
        Object enum713 = ((Field) term219928).get((Object) null);
        Object term218318 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term218318, term218318.getClass(), "index", -373348260);
        setField(term218318, term218318.getClass(), "type", null);
        setIntField(term218318, term218318.getClass(), "cost", -476546497);
        setIntField(term218318, term218318.getClass(), "metalCost", 1196854753);
        setField(term218318, term218318.getClass(), "name", null);
        setIntField(term218318, term218318.getClass(), "energyRequirement", -59756804);
        setIntField(term218318, term218318.getClass(), "energyResource", 535818399);
        setIntField(term218318, term218318.getClass(), "ftlSpeed", 1397433354);
        setIntField(term218318, term218318.getClass(), "speed", -135791025);
        setIntField(term218318, term218318.getClass(), "tacticSpeed", 59811366);
        setIntField(term218318, term218318.getClass(), "scannerRange", 874873727);
        setIntField(term218318, term218318.getClass(), "cloakDetection", 729829705);
        setIntField(term218318, term218318.getClass(), "cloaking", 713554336);
        setIntField(term218318, term218318.getClass(), "defenseValue", 196738357);
        setIntField(term218318, term218318.getClass(), "baySize", 466094589);
        setIntField(term218318, term218318.getClass(), "damage", -1165526360);
        setIntField(term218318, term218318.getClass(), "weaponRange", -1358499449);
        setIntField(term218318, term218318.getClass(), "initiativeBoost", -1565850896);
        setIntField(term218318, term218318.getClass(), "cultureBonus", 1480628140);
        setIntField(term218318, term218318.getClass(), "creditBonus", -1804417815);
        setIntField(term218318, term218318.getClass(), "researchBonus", -988341618);
        setIntField(term218318, term218318.getClass(), "espionageBonus", 892061109);
        setIntField(term218318, term218318.getClass(), "fleetCapacityBonus", 1044749648);
        setIntField(term218318, term218318.getClass(), "hitBonus", -2066536273);
        ArrayList term218316 = new ArrayList();
        ((ArrayList) term218316).add(term218318);
        term218248 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipStat"));
        Object term218249 = newInstance(Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign"));
        Object term218262 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipHull"));
        Object term218288 = newInstance(Class.forName("org.openRealmOfStars.player.race.SpaceRace"));
        Object term218305 = newInstance(Class.forName("org.openRealmOfStars.audio.music.MusicFileInfo"));
        setField(term218249, term218249.getClass(), "name", "SSClrWPMGg");
        setIntField(term218262, term218262.getClass(), "index", 2096168037);
        setField(term218262, term218262.getClass(), "name", "pWwlfpmeFT");
        setIntField(term218262, term218262.getClass(), "maxSlot", -681093302);
        setIntField(term218262, term218262.getClass(), "slotHull", 1008385565);
        setField(term218262, term218262.getClass(), "hullType", enum707);
        setField(term218262, term218262.getClass(), "size", enum708);
        setIntField(term218262, term218262.getClass(), "cost", -1408656420);
        setIntField(term218262, term218262.getClass(), "metalCost", 1356166325);
        setIntField(term218262, term218262.getClass(), "imageIndex", 36575353);
        setDoubleField(term218262, term218262.getClass(), "fleetCapacity", 0.022483645678509023);
        setField(term218288, term218288.getClass(), "id", "");
        setField(term218288, term218288.getClass(), "name", "");
        setField(term218288, term218288.getClass(), "nameSingle", "");
        setField(term218288, term218288.getClass(), "attitude", enum709);
        setField(term218288, term218288.getClass(), "imagePath", "");
        setField(term218288, term218288.getClass(), "bridgeId", "");
        setField(term218288, term218288.getClass(), "spaceShipId", "");
        setField(term218288, term218288.getClass(), "socialSystem", enum710);
        setField(term218288, term218288.getClass(), "genderList", term218299);
        setField(term218288, term218288.getClass(), "speechSetId", "");
        setField(term218288, term218288.getClass(), "bridgeEffect", enum711);
        setField(term218305, term218305.getClass(), "songName", null);
        setField(term218305, term218305.getClass(), "author", null);
        setField(term218305, term218305.getClass(), "fileName", null);
        setBooleanField(term218305, term218305.getClass(), "custom", true);
        setIntField(term218305, term218305.getClass(), "fadingLimit", 1173070286);
        setField(term218288, term218288.getClass(), "diplomacyMusic", term218305);
        setField(term218288, term218288.getClass(), "traits", term218308);
        setField(term218288, term218288.getClass(), "leaderNameGenerator", enum712);
        setField(term218288, term218288.getClass(), "description", "");
        setField(term218288, term218288.getClass(), "spaceRaceType", enum713);
        setField(term218262, term218262.getClass(), "originalBuilder", term218288);
        setField(term218249, term218249.getClass(), "hull", term218262);
        setField(term218249, term218249.getClass(), "components", term218316);
        setField(term218248, term218248.getClass(), "design", term218249);
        setIntField(term218248, term218248.getClass(), "numberOfCombats", -1532896934);
        setIntField(term218248, term218248.getClass(), "numberOfVictories", -1907871387);
        setIntField(term218248, term218248.getClass(), "numberOfLoses", 11100609);
        setIntField(term218248, term218248.getClass(), "numberOfKills", -747715686);
        setIntField(term218248, term218248.getClass(), "numberOfBuilt", -1565507534);
        setIntField(term218248, term218248.getClass(), "numberOfInUse", -1665001312);
        setBooleanField(term218248, term218248.getClass(), "obsolete", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipStat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term218248, args);
    }

};


