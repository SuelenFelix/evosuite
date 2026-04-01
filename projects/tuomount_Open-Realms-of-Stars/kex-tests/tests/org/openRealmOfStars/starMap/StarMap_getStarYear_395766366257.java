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

public class StarMap_getStarYear_395766366257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4199806;

    public StarMap_getStarYear_395766366257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4199806 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4199806, term4199806.getClass(), "maxX", 0);
        setIntField(term4199806, term4199806.getClass(), "maxY", 0);
        setField(term4199806, term4199806.getClass(), "tiles", null);
        setField(term4199806, term4199806.getClass(), "tileInfo", null);
        setField(term4199806, term4199806.getClass(), "culture", null);
        setIntField(term4199806, term4199806.getClass(), "cursorX", 0);
        setIntField(term4199806, term4199806.getClass(), "cursorY", 0);
        setIntField(term4199806, term4199806.getClass(), "drawX", 0);
        setIntField(term4199806, term4199806.getClass(), "drawY", 0);
        setField(term4199806, term4199806.getClass(), "sunList", null);
        setField(term4199806, term4199806.getClass(), "planetList", null);
        setField(term4199806, term4199806.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4199806, term4199806.getClass(), "players", null);
        setIntField(term4199806, term4199806.getClass(), "turn", 0);
        setField(term4199806, term4199806.getClass(), "fleetTiles", null);
        setIntField(term4199806, term4199806.getClass(), "aiTurnNumber", 0);
        setField(term4199806, term4199806.getClass(), "aiFleet", null);
        setField(term4199806, term4199806.getClass(), "newsCorpData", null);
        setBooleanField(term4199806, term4199806.getClass(), "debug", false);
        setIntField(term4199806, term4199806.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4199806, term4199806.getClass(), "scoreConquer", 0);
        setIntField(term4199806, term4199806.getClass(), "scoreCulture", 0);
        setIntField(term4199806, term4199806.getClass(), "scoreResearch", 0);
        setIntField(term4199806, term4199806.getClass(), "scoreDiplomacy", 0);
        setIntField(term4199806, term4199806.getClass(), "scorePopulation", 0);
        setField(term4199806, term4199806.getClass(), "history", null);
        setField(term4199806, term4199806.getClass(), "votes", null);
        setBooleanField(term4199806, term4199806.getClass(), "gameEnd", false);
        setBooleanField(term4199806, term4199806.getClass(), "humanLost", false);
        setField(term4199806, term4199806.getClass(), "pirateDifficulty", null);
        setField(term4199806, term4199806.getClass(), "karmaEvents", null);
        setField(term4199806, term4199806.getClass(), "ascensionEvents", null);
        setBooleanField(term4199806, term4199806.getClass(), "tutorialEnabled", false);
        setField(term4199806, term4199806.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4199806, term4199806.getClass(), "allNewsEnabled", false);
        setBooleanField(term4199806, term4199806.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4199806, term4199806.getClass(), "forceRedraw", false);
        setIntField(term4199806, term4199806.getClass(), "zoomLevel", 0);
        setBooleanField(term4199806, term4199806.getClass(), "generateFullGame", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStarYear", argTypes, term4199806, args);
    }

};


