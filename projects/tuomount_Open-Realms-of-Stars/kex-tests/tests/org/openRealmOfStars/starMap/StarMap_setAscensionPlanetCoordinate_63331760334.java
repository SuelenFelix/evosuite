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

public class StarMap_setAscensionPlanetCoordinate_63331760334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4201774;

    public StarMap_setAscensionPlanetCoordinate_63331760334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4201774 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4201774, term4201774.getClass(), "maxX", 0);
        setIntField(term4201774, term4201774.getClass(), "maxY", 0);
        setField(term4201774, term4201774.getClass(), "tiles", null);
        setField(term4201774, term4201774.getClass(), "tileInfo", null);
        setField(term4201774, term4201774.getClass(), "culture", null);
        setIntField(term4201774, term4201774.getClass(), "cursorX", 0);
        setIntField(term4201774, term4201774.getClass(), "cursorY", 0);
        setIntField(term4201774, term4201774.getClass(), "drawX", 0);
        setIntField(term4201774, term4201774.getClass(), "drawY", 0);
        setField(term4201774, term4201774.getClass(), "sunList", null);
        setField(term4201774, term4201774.getClass(), "planetList", null);
        setField(term4201774, term4201774.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4201774, term4201774.getClass(), "players", null);
        setIntField(term4201774, term4201774.getClass(), "turn", 0);
        setField(term4201774, term4201774.getClass(), "fleetTiles", null);
        setIntField(term4201774, term4201774.getClass(), "aiTurnNumber", 0);
        setField(term4201774, term4201774.getClass(), "aiFleet", null);
        setField(term4201774, term4201774.getClass(), "newsCorpData", null);
        setBooleanField(term4201774, term4201774.getClass(), "debug", false);
        setIntField(term4201774, term4201774.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4201774, term4201774.getClass(), "scoreConquer", 0);
        setIntField(term4201774, term4201774.getClass(), "scoreCulture", 0);
        setIntField(term4201774, term4201774.getClass(), "scoreResearch", 0);
        setIntField(term4201774, term4201774.getClass(), "scoreDiplomacy", 0);
        setIntField(term4201774, term4201774.getClass(), "scorePopulation", 0);
        setField(term4201774, term4201774.getClass(), "history", null);
        setField(term4201774, term4201774.getClass(), "votes", null);
        setBooleanField(term4201774, term4201774.getClass(), "gameEnd", false);
        setBooleanField(term4201774, term4201774.getClass(), "humanLost", false);
        setField(term4201774, term4201774.getClass(), "pirateDifficulty", null);
        setField(term4201774, term4201774.getClass(), "karmaEvents", null);
        setField(term4201774, term4201774.getClass(), "ascensionEvents", null);
        setBooleanField(term4201774, term4201774.getClass(), "tutorialEnabled", false);
        setField(term4201774, term4201774.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4201774, term4201774.getClass(), "allNewsEnabled", false);
        setBooleanField(term4201774, term4201774.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4201774, term4201774.getClass(), "forceRedraw", false);
        setIntField(term4201774, term4201774.getClass(), "zoomLevel", 0);
        setBooleanField(term4201774, term4201774.getClass(), "generateFullGame", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setAscensionPlanetCoordinate", argTypes, term4201774, args);
    }

};


