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
import java.lang.Integer;
import java.lang.Boolean;

public class StarMap_getNearestSolarSystem_144716151825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3819037;
     Object term3819061;
     Object term3819063;
     Object term3819065;

    public StarMap_getNearestSolarSystem_144716151825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3819037 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term3819037, term3819037.getClass(), "maxX", 0);
        setIntField(term3819037, term3819037.getClass(), "maxY", 0);
        setField(term3819037, term3819037.getClass(), "tiles", null);
        setField(term3819037, term3819037.getClass(), "tileInfo", null);
        setField(term3819037, term3819037.getClass(), "culture", null);
        setIntField(term3819037, term3819037.getClass(), "cursorX", 0);
        setIntField(term3819037, term3819037.getClass(), "cursorY", 0);
        setIntField(term3819037, term3819037.getClass(), "drawX", 0);
        setIntField(term3819037, term3819037.getClass(), "drawY", 0);
        setField(term3819037, term3819037.getClass(), "sunList", null);
        setField(term3819037, term3819037.getClass(), "planetList", null);
        setField(term3819037, term3819037.getClass(), "ascensionPlanetCoordinate", null);
        setField(term3819037, term3819037.getClass(), "players", null);
        setIntField(term3819037, term3819037.getClass(), "turn", 0);
        setField(term3819037, term3819037.getClass(), "fleetTiles", null);
        setIntField(term3819037, term3819037.getClass(), "aiTurnNumber", 0);
        setField(term3819037, term3819037.getClass(), "aiFleet", null);
        setField(term3819037, term3819037.getClass(), "newsCorpData", null);
        setBooleanField(term3819037, term3819037.getClass(), "debug", false);
        setIntField(term3819037, term3819037.getClass(), "scoreVictoryTurn", 0);
        setIntField(term3819037, term3819037.getClass(), "scoreConquer", 0);
        setIntField(term3819037, term3819037.getClass(), "scoreCulture", 0);
        setIntField(term3819037, term3819037.getClass(), "scoreResearch", 0);
        setIntField(term3819037, term3819037.getClass(), "scoreDiplomacy", 0);
        setIntField(term3819037, term3819037.getClass(), "scorePopulation", 0);
        setField(term3819037, term3819037.getClass(), "history", null);
        setField(term3819037, term3819037.getClass(), "votes", null);
        setBooleanField(term3819037, term3819037.getClass(), "gameEnd", false);
        setBooleanField(term3819037, term3819037.getClass(), "humanLost", false);
        setField(term3819037, term3819037.getClass(), "pirateDifficulty", null);
        setField(term3819037, term3819037.getClass(), "karmaEvents", null);
        setField(term3819037, term3819037.getClass(), "ascensionEvents", null);
        setBooleanField(term3819037, term3819037.getClass(), "tutorialEnabled", false);
        setField(term3819037, term3819037.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term3819037, term3819037.getClass(), "allNewsEnabled", false);
        setBooleanField(term3819037, term3819037.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term3819037, term3819037.getClass(), "forceRedraw", false);
        setIntField(term3819037, term3819037.getClass(), "zoomLevel", 0);
        setBooleanField(term3819037, term3819037.getClass(), "generateFullGame", false);
        term3819061 = new Integer(0);
        term3819063 = new Integer(0);
        term3819065 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[3] = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        argTypes[4] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[5] = boolean.class;
        Object[] args = new Object[6];
        args[0] = term3819061;
        args[1] = term3819063;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = term3819065;
        callMethod(klass, "getNearestSolarSystem", argTypes, term3819037, args);
    }

};


