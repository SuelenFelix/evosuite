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

public class GalaxyConfig_getSizeY_1506410719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1387689;

    public GalaxyConfig_getSizeY_1506410719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1387954 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term1387953 = ((Class) term1387954).getDeclaredField((String) "ELECTION_TYPE1");
        ((Field) term1387953).setAccessible(true);
        Object enum4153 = ((Field) term1387953).get((Object) null);
        ArrayList term1387776 = new ArrayList();
        ((ArrayList) term1387776).add((Object)null);
        ((ArrayList) term1387776).add((Object)null);
        ((ArrayList) term1387776).add((Object)null);
        ((ArrayList) term1387776).add((Object)null);
        ((ArrayList) term1387776).add((Object)null);
        ((ArrayList) term1387776).add((Object)null);
        ((ArrayList) term1387776).add((Object)null);
        ((ArrayList) term1387776).add((Object)null);
        Class<? extends Object> term1388308 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term1388307 = ((Class) term1388308).getDeclaredField((String) "CEO_AS_A_RULER");
        ((Field) term1388307).setAccessible(true);
        Object enum4154 = ((Field) term1388307).get((Object) null);
        ArrayList term1387832 = new ArrayList();
        Class<? extends Object> term1388642 = Class.forName((String) "org.openRealmOfStars.player.PlayerColor");
        Field term1388641 = ((Class) term1388642).getDeclaredField((String) "GRAY");
        ((Field) term1388641).setAccessible(true);
        Object enum4155 = ((Field) term1388641).get((Object) null);
        Class<? extends Object> term1388856 = Class.forName((String) "org.openRealmOfStars.player.AiDifficulty");
        Field term1388855 = ((Class) term1388856).getDeclaredField((String) "WEAK");
        ((Field) term1388855).setAccessible(true);
        Object enum4156 = ((Field) term1388855).get((Object) null);
        Class<? extends Object> term1389075 = Class.forName((String) "org.openRealmOfStars.starMap.PirateDifficultLevel");
        Field term1389074 = ((Class) term1389075).getDeclaredField((String) "HARD");
        ((Field) term1389074).setAccessible(true);
        Object enum4157 = ((Field) term1389074).get((Object) null);
        Class<? extends Object> term1389339 = Class.forName((String) "org.openRealmOfStars.starMap.event.karmaEvents.KarmaType");
        Field term1389338 = ((Class) term1389339).getDeclaredField((String) "DISABLED");
        ((Field) term1389338).setAccessible(true);
        Object enum4158 = ((Field) term1389338).get((Object) null);
        Class<? extends Object> term1389650 = Class.forName((String) "org.openRealmOfStars.player.AiDifficulty");
        Field term1389649 = ((Class) term1389650).getDeclaredField((String) "CHALLENGING");
        ((Field) term1389649).setAccessible(true);
        Object enum4159 = ((Field) term1389649).get((Object) null);
        term1387689 = newInstance(Class.forName("org.openRealmOfStars.starMap.GalaxyConfig"));
        Object[] term1387697 = (Object[]) newArray("org.openRealmOfStars.player.race.SpaceRace", 0);
        Object[] term1387698 = (Object[]) newArray("java.lang.String", 2);
        Object[] term1387723 = (Object[]) newArray("org.openRealmOfStars.player.government.Government", 2);
        Object term1387724 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        Object term1387780 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        Object[] term1387836 = (Object[]) newArray("org.openRealmOfStars.player.PlayerColor", 1);
        Object[] term1387852 = (Object[]) newArray("org.openRealmOfStars.player.AiDifficulty", 1);
        boolean[] term1387861 = (boolean[]) newBooleanArray(0);
        Object[] term1387862 = (Object[]) newArray("org.openRealmOfStars.player.scenario.StartingScenario", 0);
        setIntField(term1387689, term1387689.getClass(), "sizeX", 773914244);
        setIntField(term1387689, term1387689.getClass(), "sizeY", 1061464228);
        setIntField(term1387689, term1387689.getClass(), "galaxySizeIndex", 1788610937);
        setIntField(term1387689, term1387689.getClass(), "maxPlayers", 1848725440);
        setIntField(term1387689, term1387689.getClass(), "solarSystemDistance", 1057277141);
        setIntField(term1387689, term1387689.getClass(), "sunDensityIndex", 262631432);
        setIntField(term1387689, term1387689.getClass(), "startingPosition", 155080700);
        setField(term1387689, term1387689.getClass(), "playerRaces", term1387697);
        setElement(term1387698, 0, "rThBYKGuGX");
        setElement(term1387698, 1, "ZVUcXgvMlJ");
        setField(term1387689, term1387689.getClass(), "playerName", term1387698);
        setField(term1387724, term1387724.getClass(), "id", "FiwWkDOjKM");
        setField(term1387724, term1387724.getClass(), "name", "UDIHELxsEL");
        setField(term1387724, term1387724.getClass(), "rulerSelection", enum4153);
        setField(term1387724, term1387724.getClass(), "rulerTitleMale", "xJYvDCSups");
        setField(term1387724, term1387724.getClass(), "rulerTitleFemale", "AxSMIqTMgp");
        setField(term1387724, term1387724.getClass(), "traits", term1387776);
        setElement(term1387723, 0, term1387724);
        setField(term1387780, term1387780.getClass(), "id", "OzSXIFOLPb");
        setField(term1387780, term1387780.getClass(), "name", "NmHlBEBQwY");
        setField(term1387780, term1387780.getClass(), "rulerSelection", enum4154);
        setField(term1387780, term1387780.getClass(), "rulerTitleMale", "bGfdwbcmic");
        setField(term1387780, term1387780.getClass(), "rulerTitleFemale", "qdGyTCDvyi");
        setField(term1387780, term1387780.getClass(), "traits", term1387832);
        setElement(term1387723, 1, term1387780);
        setField(term1387689, term1387689.getClass(), "playerGovernment", term1387723);
        setElement(term1387836, 0, enum4155);
        setField(term1387689, term1387689.getClass(), "playerColors", term1387836);
        setElement(term1387852, 0, enum4156);
        setField(term1387689, term1387689.getClass(), "playerDifficult", term1387852);
        setField(term1387689, term1387689.getClass(), "playerElderRealm", term1387861);
        setField(term1387689, term1387689.getClass(), "startingScenario", term1387862);
        setIntField(term1387689, term1387689.getClass(), "chanceForPlanetaryEvent", -1964074071);
        setIntField(term1387689, term1387689.getClass(), "numberOfRoguePlanets", 962510438);
        setIntField(term1387689, term1387689.getClass(), "scoringVictoryTurns", 1815203635);
        setIntField(term1387689, term1387689.getClass(), "scoringCulture", -2131582329);
        setIntField(term1387689, term1387689.getClass(), "scoringConquer", -125038597);
        setIntField(term1387689, term1387689.getClass(), "scoringResearch", -516474942);
        setIntField(term1387689, term1387689.getClass(), "scoringDiplomacy", 1808224364);
        setIntField(term1387689, term1387689.getClass(), "scoringPopulation", 484156902);
        setIntField(term1387689, term1387689.getClass(), "spacePiratesLevel", -1761895501);
        setField(term1387689, term1387689.getClass(), "spacePiratesDifficulty", enum4157);
        setField(term1387689, term1387689.getClass(), "karmaType", enum4158);
        setIntField(term1387689, term1387689.getClass(), "karmaSpeed", 495190567);
        setIntField(term1387689, term1387689.getClass(), "spaceAnomaliesLevel", -1304021142);
        setIntField(term1387689, term1387689.getClass(), "elderHeadStart", -1528349343);
        setBooleanField(term1387689, term1387689.getClass(), "enableTutorial", false);
        setBooleanField(term1387689, term1387689.getClass(), "aiOnly", false);
        setField(term1387689, term1387689.getClass(), "difficultyLevel", enum4159);
        setBooleanField(term1387689, term1387689.getClass(), "allNews", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.GalaxyConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSizeY", argTypes, term1387689, args);
    }

};


