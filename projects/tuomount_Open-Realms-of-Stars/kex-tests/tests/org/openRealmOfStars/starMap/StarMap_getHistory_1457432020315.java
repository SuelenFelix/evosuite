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

public class StarMap_getHistory_1457432020315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4201308;

    public StarMap_getHistory_1457432020315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4201308 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4201308, term4201308.getClass(), "maxX", 0);
        setIntField(term4201308, term4201308.getClass(), "maxY", 0);
        setField(term4201308, term4201308.getClass(), "tiles", null);
        setField(term4201308, term4201308.getClass(), "tileInfo", null);
        setField(term4201308, term4201308.getClass(), "culture", null);
        setIntField(term4201308, term4201308.getClass(), "cursorX", 0);
        setIntField(term4201308, term4201308.getClass(), "cursorY", 0);
        setIntField(term4201308, term4201308.getClass(), "drawX", 0);
        setIntField(term4201308, term4201308.getClass(), "drawY", 0);
        setField(term4201308, term4201308.getClass(), "sunList", null);
        setField(term4201308, term4201308.getClass(), "planetList", null);
        setField(term4201308, term4201308.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4201308, term4201308.getClass(), "players", null);
        setIntField(term4201308, term4201308.getClass(), "turn", 0);
        setField(term4201308, term4201308.getClass(), "fleetTiles", null);
        setIntField(term4201308, term4201308.getClass(), "aiTurnNumber", 0);
        setField(term4201308, term4201308.getClass(), "aiFleet", null);
        setField(term4201308, term4201308.getClass(), "newsCorpData", null);
        setBooleanField(term4201308, term4201308.getClass(), "debug", false);
        setIntField(term4201308, term4201308.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4201308, term4201308.getClass(), "scoreConquer", 0);
        setIntField(term4201308, term4201308.getClass(), "scoreCulture", 0);
        setIntField(term4201308, term4201308.getClass(), "scoreResearch", 0);
        setIntField(term4201308, term4201308.getClass(), "scoreDiplomacy", 0);
        setIntField(term4201308, term4201308.getClass(), "scorePopulation", 0);
        setField(term4201308, term4201308.getClass(), "history", null);
        setField(term4201308, term4201308.getClass(), "votes", null);
        setBooleanField(term4201308, term4201308.getClass(), "gameEnd", false);
        setBooleanField(term4201308, term4201308.getClass(), "humanLost", false);
        setField(term4201308, term4201308.getClass(), "pirateDifficulty", null);
        setField(term4201308, term4201308.getClass(), "karmaEvents", null);
        setField(term4201308, term4201308.getClass(), "ascensionEvents", null);
        setBooleanField(term4201308, term4201308.getClass(), "tutorialEnabled", false);
        setField(term4201308, term4201308.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4201308, term4201308.getClass(), "allNewsEnabled", false);
        setBooleanField(term4201308, term4201308.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4201308, term4201308.getClass(), "forceRedraw", false);
        setIntField(term4201308, term4201308.getClass(), "zoomLevel", 0);
        setBooleanField(term4201308, term4201308.getClass(), "generateFullGame", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHistory", argTypes, term4201308, args);
    }

};


