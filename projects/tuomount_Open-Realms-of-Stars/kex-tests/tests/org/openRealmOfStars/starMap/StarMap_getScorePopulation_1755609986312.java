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

public class StarMap_getScorePopulation_1755609986312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4201234;

    public StarMap_getScorePopulation_1755609986312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4201234 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4201234, term4201234.getClass(), "maxX", 0);
        setIntField(term4201234, term4201234.getClass(), "maxY", 0);
        setField(term4201234, term4201234.getClass(), "tiles", null);
        setField(term4201234, term4201234.getClass(), "tileInfo", null);
        setField(term4201234, term4201234.getClass(), "culture", null);
        setIntField(term4201234, term4201234.getClass(), "cursorX", 0);
        setIntField(term4201234, term4201234.getClass(), "cursorY", 0);
        setIntField(term4201234, term4201234.getClass(), "drawX", 0);
        setIntField(term4201234, term4201234.getClass(), "drawY", 0);
        setField(term4201234, term4201234.getClass(), "sunList", null);
        setField(term4201234, term4201234.getClass(), "planetList", null);
        setField(term4201234, term4201234.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4201234, term4201234.getClass(), "players", null);
        setIntField(term4201234, term4201234.getClass(), "turn", 0);
        setField(term4201234, term4201234.getClass(), "fleetTiles", null);
        setIntField(term4201234, term4201234.getClass(), "aiTurnNumber", 0);
        setField(term4201234, term4201234.getClass(), "aiFleet", null);
        setField(term4201234, term4201234.getClass(), "newsCorpData", null);
        setBooleanField(term4201234, term4201234.getClass(), "debug", false);
        setIntField(term4201234, term4201234.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4201234, term4201234.getClass(), "scoreConquer", 0);
        setIntField(term4201234, term4201234.getClass(), "scoreCulture", 0);
        setIntField(term4201234, term4201234.getClass(), "scoreResearch", 0);
        setIntField(term4201234, term4201234.getClass(), "scoreDiplomacy", 0);
        setIntField(term4201234, term4201234.getClass(), "scorePopulation", 0);
        setField(term4201234, term4201234.getClass(), "history", null);
        setField(term4201234, term4201234.getClass(), "votes", null);
        setBooleanField(term4201234, term4201234.getClass(), "gameEnd", false);
        setBooleanField(term4201234, term4201234.getClass(), "humanLost", false);
        setField(term4201234, term4201234.getClass(), "pirateDifficulty", null);
        setField(term4201234, term4201234.getClass(), "karmaEvents", null);
        setField(term4201234, term4201234.getClass(), "ascensionEvents", null);
        setBooleanField(term4201234, term4201234.getClass(), "tutorialEnabled", false);
        setField(term4201234, term4201234.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4201234, term4201234.getClass(), "allNewsEnabled", false);
        setBooleanField(term4201234, term4201234.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4201234, term4201234.getClass(), "forceRedraw", false);
        setIntField(term4201234, term4201234.getClass(), "zoomLevel", 0);
        setBooleanField(term4201234, term4201234.getClass(), "generateFullGame", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScorePopulation", argTypes, term4201234, args);
    }

};


