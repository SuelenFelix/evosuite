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

public class StarMap_getMaxY_645432924222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4198908;

    public StarMap_getMaxY_645432924222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4198908 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4198908, term4198908.getClass(), "maxX", 0);
        setIntField(term4198908, term4198908.getClass(), "maxY", 0);
        setField(term4198908, term4198908.getClass(), "tiles", null);
        setField(term4198908, term4198908.getClass(), "tileInfo", null);
        setField(term4198908, term4198908.getClass(), "culture", null);
        setIntField(term4198908, term4198908.getClass(), "cursorX", 0);
        setIntField(term4198908, term4198908.getClass(), "cursorY", 0);
        setIntField(term4198908, term4198908.getClass(), "drawX", 0);
        setIntField(term4198908, term4198908.getClass(), "drawY", 0);
        setField(term4198908, term4198908.getClass(), "sunList", null);
        setField(term4198908, term4198908.getClass(), "planetList", null);
        setField(term4198908, term4198908.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4198908, term4198908.getClass(), "players", null);
        setIntField(term4198908, term4198908.getClass(), "turn", 0);
        setField(term4198908, term4198908.getClass(), "fleetTiles", null);
        setIntField(term4198908, term4198908.getClass(), "aiTurnNumber", 0);
        setField(term4198908, term4198908.getClass(), "aiFleet", null);
        setField(term4198908, term4198908.getClass(), "newsCorpData", null);
        setBooleanField(term4198908, term4198908.getClass(), "debug", false);
        setIntField(term4198908, term4198908.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4198908, term4198908.getClass(), "scoreConquer", 0);
        setIntField(term4198908, term4198908.getClass(), "scoreCulture", 0);
        setIntField(term4198908, term4198908.getClass(), "scoreResearch", 0);
        setIntField(term4198908, term4198908.getClass(), "scoreDiplomacy", 0);
        setIntField(term4198908, term4198908.getClass(), "scorePopulation", 0);
        setField(term4198908, term4198908.getClass(), "history", null);
        setField(term4198908, term4198908.getClass(), "votes", null);
        setBooleanField(term4198908, term4198908.getClass(), "gameEnd", false);
        setBooleanField(term4198908, term4198908.getClass(), "humanLost", false);
        setField(term4198908, term4198908.getClass(), "pirateDifficulty", null);
        setField(term4198908, term4198908.getClass(), "karmaEvents", null);
        setField(term4198908, term4198908.getClass(), "ascensionEvents", null);
        setBooleanField(term4198908, term4198908.getClass(), "tutorialEnabled", false);
        setField(term4198908, term4198908.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4198908, term4198908.getClass(), "allNewsEnabled", false);
        setBooleanField(term4198908, term4198908.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4198908, term4198908.getClass(), "forceRedraw", false);
        setIntField(term4198908, term4198908.getClass(), "zoomLevel", 0);
        setBooleanField(term4198908, term4198908.getClass(), "generateFullGame", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxY", argTypes, term4198908, args);
    }

};


