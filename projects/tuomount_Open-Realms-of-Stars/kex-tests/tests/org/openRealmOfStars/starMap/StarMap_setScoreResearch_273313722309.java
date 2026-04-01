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

public class StarMap_setScoreResearch_273313722309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4201158;
     Object term4201182;

    public StarMap_setScoreResearch_273313722309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4201158 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4201158, term4201158.getClass(), "maxX", 0);
        setIntField(term4201158, term4201158.getClass(), "maxY", 0);
        setField(term4201158, term4201158.getClass(), "tiles", null);
        setField(term4201158, term4201158.getClass(), "tileInfo", null);
        setField(term4201158, term4201158.getClass(), "culture", null);
        setIntField(term4201158, term4201158.getClass(), "cursorX", 0);
        setIntField(term4201158, term4201158.getClass(), "cursorY", 0);
        setIntField(term4201158, term4201158.getClass(), "drawX", 0);
        setIntField(term4201158, term4201158.getClass(), "drawY", 0);
        setField(term4201158, term4201158.getClass(), "sunList", null);
        setField(term4201158, term4201158.getClass(), "planetList", null);
        setField(term4201158, term4201158.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4201158, term4201158.getClass(), "players", null);
        setIntField(term4201158, term4201158.getClass(), "turn", 0);
        setField(term4201158, term4201158.getClass(), "fleetTiles", null);
        setIntField(term4201158, term4201158.getClass(), "aiTurnNumber", 0);
        setField(term4201158, term4201158.getClass(), "aiFleet", null);
        setField(term4201158, term4201158.getClass(), "newsCorpData", null);
        setBooleanField(term4201158, term4201158.getClass(), "debug", false);
        setIntField(term4201158, term4201158.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4201158, term4201158.getClass(), "scoreConquer", 0);
        setIntField(term4201158, term4201158.getClass(), "scoreCulture", 0);
        setIntField(term4201158, term4201158.getClass(), "scoreResearch", 0);
        setIntField(term4201158, term4201158.getClass(), "scoreDiplomacy", 0);
        setIntField(term4201158, term4201158.getClass(), "scorePopulation", 0);
        setField(term4201158, term4201158.getClass(), "history", null);
        setField(term4201158, term4201158.getClass(), "votes", null);
        setBooleanField(term4201158, term4201158.getClass(), "gameEnd", false);
        setBooleanField(term4201158, term4201158.getClass(), "humanLost", false);
        setField(term4201158, term4201158.getClass(), "pirateDifficulty", null);
        setField(term4201158, term4201158.getClass(), "karmaEvents", null);
        setField(term4201158, term4201158.getClass(), "ascensionEvents", null);
        setBooleanField(term4201158, term4201158.getClass(), "tutorialEnabled", false);
        setField(term4201158, term4201158.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4201158, term4201158.getClass(), "allNewsEnabled", false);
        setBooleanField(term4201158, term4201158.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4201158, term4201158.getClass(), "forceRedraw", false);
        setIntField(term4201158, term4201158.getClass(), "zoomLevel", 0);
        setBooleanField(term4201158, term4201158.getClass(), "generateFullGame", false);
        term4201182 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4201182;
        callMethod(klass, "setScoreResearch", argTypes, term4201158, args);
    }

};


