package org.openRealmOfStars.starMap;

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
import static org.openRealmOfStars.starMap.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;
import java.lang.Boolean;

public class GalaxyConfig_setEnableTutorial_103067923055 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1822784;
     Object term1823130;

    public GalaxyConfig_setEnableTutorial_103067923055() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1823203 = Class.forName((String) "org.openRealmOfStars.player.PlayerColor");
        Field term1823202 = ((Class) term1823203).getDeclaredField((String) "GREEN");
        ((Field) term1823202).setAccessible(true);
        Object enum5466 = ((Field) term1823202).get((Object) null);
        Class<? extends Object> term1823420 = Class.forName((String) "org.openRealmOfStars.player.PlayerColor");
        Field term1823419 = ((Class) term1823420).getDeclaredField((String) "ROSE");
        ((Field) term1823419).setAccessible(true);
        Object enum5467 = ((Field) term1823419).get((Object) null);
        Class<? extends Object> term1823634 = Class.forName((String) "org.openRealmOfStars.player.PlayerColor");
        Field term1823633 = ((Class) term1823634).getDeclaredField((String) "PURPLE");
        ((Field) term1823633).setAccessible(true);
        Object enum5468 = ((Field) term1823633).get((Object) null);
        Class<? extends Object> term1823854 = Class.forName((String) "org.openRealmOfStars.player.PlayerColor");
        Field term1823853 = ((Class) term1823854).getDeclaredField((String) "BLACK");
        ((Field) term1823853).setAccessible(true);
        Object enum5469 = ((Field) term1823853).get((Object) null);
        Class<? extends Object> term1824071 = Class.forName((String) "org.openRealmOfStars.player.PlayerColor");
        Field term1824070 = ((Class) term1824071).getDeclaredField((String) "WHITE");
        ((Field) term1824070).setAccessible(true);
        Object enum5470 = ((Field) term1824070).get((Object) null);
        Class<? extends Object> term1824288 = Class.forName((String) "org.openRealmOfStars.player.PlayerColor");
        Field term1824287 = ((Class) term1824288).getDeclaredField((String) "SKY");
        ((Field) term1824287).setAccessible(true);
        Object enum5471 = ((Field) term1824287).get((Object) null);
        Class<? extends Object> term1824499 = Class.forName((String) "org.openRealmOfStars.player.PlayerColor");
        Field term1824498 = ((Class) term1824499).getDeclaredField((String) "PINK");
        ((Field) term1824498).setAccessible(true);
        Object enum5472 = ((Field) term1824498).get((Object) null);
        Class<? extends Object> term1824713 = Class.forName((String) "org.openRealmOfStars.player.AiDifficulty");
        Field term1824712 = ((Class) term1824713).getDeclaredField((String) "NORMAL");
        ((Field) term1824712).setAccessible(true);
        Object enum5473 = ((Field) term1824712).get((Object) null);
        Class<? extends Object> term1824938 = Class.forName((String) "org.openRealmOfStars.player.AiDifficulty");
        Field term1824937 = ((Class) term1824938).getDeclaredField((String) "WEAK");
        ((Field) term1824937).setAccessible(true);
        Object enum5474 = ((Field) term1824937).get((Object) null);
        Class<? extends Object> term1825175 = Class.forName((String) "org.openRealmOfStars.player.scenario.StartingScenarioType");
        Field term1825174 = ((Class) term1825175).getDeclaredField((String) "DOOMED");
        ((Field) term1825174).setAccessible(true);
        Object enum5475 = ((Field) term1825174).get((Object) null);
        Class<? extends Object> term1825505 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.WaterLevelType");
        Field term1825504 = ((Class) term1825505).getDeclaredField((String) "BARREN");
        ((Field) term1825504).setAccessible(true);
        Object enum5476 = ((Field) term1825504).get((Object) null);
        Class<? extends Object> term1825810 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.TemperatureType");
        Field term1825809 = ((Class) term1825810).getDeclaredField((String) "HOT");
        ((Field) term1825809).setAccessible(true);
        Object enum5477 = ((Field) term1825809).get((Object) null);
        ArrayList term1823074 = new ArrayList();
        ((ArrayList) term1823074).add((Object)null);
        ((ArrayList) term1823074).add((Object)null);
        ((ArrayList) term1823074).add((Object)null);
        ((ArrayList) term1823074).add((Object)null);
        ArrayList term1823078 = new ArrayList();
        ((ArrayList) term1823078).add((Object)null);
        ((ArrayList) term1823078).add((Object)null);
        ((ArrayList) term1823078).add((Object)null);
        ((ArrayList) term1823078).add((Object)null);
        ((ArrayList) term1823078).add((Object)null);
        ((ArrayList) term1823078).add((Object)null);
        Class<? extends Object> term1826111 = Class.forName((String) "org.openRealmOfStars.starMap.PirateDifficultLevel");
        Field term1826110 = ((Class) term1826111).getDeclaredField((String) "HARD");
        ((Field) term1826110).setAccessible(true);
        Object enum5478 = ((Field) term1826110).get((Object) null);
        Class<? extends Object> term1826375 = Class.forName((String) "org.openRealmOfStars.starMap.event.karmaEvents.KarmaType");
        Field term1826374 = ((Class) term1826375).getDeclaredField((String) "SECOND_FIRST_AND_LAST");
        ((Field) term1826374).setAccessible(true);
        Object enum5479 = ((Field) term1826374).get((Object) null);
        term1822784 = newInstance(Class.forName("org.openRealmOfStars.starMap.GalaxyConfig"));
        Object[] term1822792 = (Object[]) newArray("org.openRealmOfStars.player.race.SpaceRace", 0);
        Object[] term1822793 = (Object[]) newArray("java.lang.String", 7);
        Object[] term1822878 = (Object[]) newArray("org.openRealmOfStars.player.government.Government", 0);
        Object[] term1822879 = (Object[]) newArray("org.openRealmOfStars.player.PlayerColor", 8);
        Object[] term1822993 = (Object[]) newArray("org.openRealmOfStars.player.AiDifficulty", 6);
        boolean[] term1823012 = (boolean[]) newBooleanArray(8);
        Object[] term1823021 = (Object[]) newArray("org.openRealmOfStars.player.scenario.StartingScenario", 1);
        Object term1823022 = newInstance(Class.forName("org.openRealmOfStars.player.scenario.StartingScenario"));
        setIntField(term1822784, term1822784.getClass(), "sizeX", 9836574);
        setIntField(term1822784, term1822784.getClass(), "sizeY", -958075323);
        setIntField(term1822784, term1822784.getClass(), "galaxySizeIndex", 1360899658);
        setIntField(term1822784, term1822784.getClass(), "maxPlayers", 1945903561);
        setIntField(term1822784, term1822784.getClass(), "solarSystemDistance", -287144379);
        setIntField(term1822784, term1822784.getClass(), "sunDensityIndex", 1895993371);
        setIntField(term1822784, term1822784.getClass(), "startingPosition", 626535999);
        setField(term1822784, term1822784.getClass(), "playerRaces", term1822792);
        setElement(term1822793, 0, "HwSXbMSPro");
        setElement(term1822793, 1, "ubESwhALoh");
        setElement(term1822793, 2, "RgDKXTQwwK");
        setElement(term1822793, 3, "NWtztUWrAJ");
        setElement(term1822793, 4, "iLLKULqmUO");
        setElement(term1822793, 5, "MfzamAzSxa");
        setElement(term1822793, 6, "BDmsYUnVDK");
        setField(term1822784, term1822784.getClass(), "playerName", term1822793);
        setField(term1822784, term1822784.getClass(), "playerGovernment", term1822878);
        setElement(term1822879, 0, enum5466);
        setElement(term1822879, 1, enum5467);
        setElement(term1822879, 2, enum5468);
        setElement(term1822879, 3, enum5469);
        setElement(term1822879, 4, enum5470);
        setElement(term1822879, 5, enum5471);
        setElement(term1822879, 6, enum5472);
        setElement(term1822879, 7, enum5472);
        setField(term1822784, term1822784.getClass(), "playerColors", term1822879);
        setElement(term1822993, 0, enum5473);
        setElement(term1822993, 1, enum5474);
        setElement(term1822993, 2, enum5474);
        setElement(term1822993, 3, enum5473);
        setElement(term1822993, 4, enum5474);
        setElement(term1822993, 5, enum5473);
        setField(term1822784, term1822784.getClass(), "playerDifficult", term1822993);
        setBooleanElement(term1823012, 0, true);
        setBooleanElement(term1823012, 1, true);
        setBooleanElement(term1823012, 3, true);
        setBooleanElement(term1823012, 4, true);
        setField(term1822784, term1822784.getClass(), "playerElderRealm", term1823012);
        setField(term1823022, term1823022.getClass(), "id", "hzbnhvgnYW");
        setField(term1823022, term1823022.getClass(), "type", enum5475);
        setField(term1823022, term1823022.getClass(), "name", "HtWYwYzAWx");
        setField(term1823022, term1823022.getClass(), "description", "hOkWCmLuri");
        setIntField(term1823022, term1823022.getClass(), "numberOfScouts", 1391662590);
        setIntField(term1823022, term1823022.getClass(), "numberOfColonyShips", 1023554604);
        setIntField(term1823022, term1823022.getClass(), "startingCredit", -83364655);
        setField(term1823022, term1823022.getClass(), "waterLevel", enum5476);
        setField(term1823022, term1823022.getClass(), "temperature", enum5477);
        setIntField(term1823022, term1823022.getClass(), "planetSize", -1646008418);
        setIntField(term1823022, term1823022.getClass(), "population", 1971377542);
        setIntField(term1823022, term1823022.getClass(), "colonyPop", 914697578);
        setField(term1823022, term1823022.getClass(), "extraTech", term1823074);
        setField(term1823022, term1823022.getClass(), "buildings", term1823078);
        setElement(term1823021, 0, term1823022);
        setField(term1822784, term1822784.getClass(), "startingScenario", term1823021);
        setIntField(term1822784, term1822784.getClass(), "chanceForPlanetaryEvent", -47821755);
        setIntField(term1822784, term1822784.getClass(), "numberOfRoguePlanets", 127216093);
        setIntField(term1822784, term1822784.getClass(), "scoringVictoryTurns", 779740075);
        setIntField(term1822784, term1822784.getClass(), "scoringCulture", -2139084947);
        setIntField(term1822784, term1822784.getClass(), "scoringConquer", -1289340673);
        setIntField(term1822784, term1822784.getClass(), "scoringResearch", 600455845);
        setIntField(term1822784, term1822784.getClass(), "scoringDiplomacy", 482402236);
        setIntField(term1822784, term1822784.getClass(), "scoringPopulation", 1407171702);
        setIntField(term1822784, term1822784.getClass(), "spacePiratesLevel", -1749044654);
        setField(term1822784, term1822784.getClass(), "spacePiratesDifficulty", enum5478);
        setField(term1822784, term1822784.getClass(), "karmaType", enum5479);
        setIntField(term1822784, term1822784.getClass(), "karmaSpeed", -352682933);
        setIntField(term1822784, term1822784.getClass(), "spaceAnomaliesLevel", 1856698773);
        setIntField(term1822784, term1822784.getClass(), "elderHeadStart", 756297107);
        setBooleanField(term1822784, term1822784.getClass(), "enableTutorial", true);
        setBooleanField(term1822784, term1822784.getClass(), "aiOnly", true);
        setField(term1822784, term1822784.getClass(), "difficultyLevel", enum5473);
        setBooleanField(term1822784, term1822784.getClass(), "allNews", false);
        term1823130 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.GalaxyConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1823130;
        callMethod(klass, "setEnableTutorial", argTypes, term1822784, args);
    }

};


