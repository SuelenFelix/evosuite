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

public class StarMap_getAIFleet_1722478407265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4200000;

    public StarMap_getAIFleet_1722478407265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4200000 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4200000, term4200000.getClass(), "maxX", 0);
        setIntField(term4200000, term4200000.getClass(), "maxY", 0);
        setField(term4200000, term4200000.getClass(), "tiles", null);
        setField(term4200000, term4200000.getClass(), "tileInfo", null);
        setField(term4200000, term4200000.getClass(), "culture", null);
        setIntField(term4200000, term4200000.getClass(), "cursorX", 0);
        setIntField(term4200000, term4200000.getClass(), "cursorY", 0);
        setIntField(term4200000, term4200000.getClass(), "drawX", 0);
        setIntField(term4200000, term4200000.getClass(), "drawY", 0);
        setField(term4200000, term4200000.getClass(), "sunList", null);
        setField(term4200000, term4200000.getClass(), "planetList", null);
        setField(term4200000, term4200000.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4200000, term4200000.getClass(), "players", null);
        setIntField(term4200000, term4200000.getClass(), "turn", 0);
        setField(term4200000, term4200000.getClass(), "fleetTiles", null);
        setIntField(term4200000, term4200000.getClass(), "aiTurnNumber", 0);
        setField(term4200000, term4200000.getClass(), "aiFleet", null);
        setField(term4200000, term4200000.getClass(), "newsCorpData", null);
        setBooleanField(term4200000, term4200000.getClass(), "debug", false);
        setIntField(term4200000, term4200000.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4200000, term4200000.getClass(), "scoreConquer", 0);
        setIntField(term4200000, term4200000.getClass(), "scoreCulture", 0);
        setIntField(term4200000, term4200000.getClass(), "scoreResearch", 0);
        setIntField(term4200000, term4200000.getClass(), "scoreDiplomacy", 0);
        setIntField(term4200000, term4200000.getClass(), "scorePopulation", 0);
        setField(term4200000, term4200000.getClass(), "history", null);
        setField(term4200000, term4200000.getClass(), "votes", null);
        setBooleanField(term4200000, term4200000.getClass(), "gameEnd", false);
        setBooleanField(term4200000, term4200000.getClass(), "humanLost", false);
        setField(term4200000, term4200000.getClass(), "pirateDifficulty", null);
        setField(term4200000, term4200000.getClass(), "karmaEvents", null);
        setField(term4200000, term4200000.getClass(), "ascensionEvents", null);
        setBooleanField(term4200000, term4200000.getClass(), "tutorialEnabled", false);
        setField(term4200000, term4200000.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4200000, term4200000.getClass(), "allNewsEnabled", false);
        setBooleanField(term4200000, term4200000.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4200000, term4200000.getClass(), "forceRedraw", false);
        setIntField(term4200000, term4200000.getClass(), "zoomLevel", 0);
        setBooleanField(term4200000, term4200000.getClass(), "generateFullGame", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAIFleet", argTypes, term4200000, args);
    }

};


