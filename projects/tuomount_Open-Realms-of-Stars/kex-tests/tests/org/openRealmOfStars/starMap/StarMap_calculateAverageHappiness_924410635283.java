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

public class StarMap_calculateAverageHappiness_924410635283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4200478;
     Object term4200502;

    public StarMap_calculateAverageHappiness_924410635283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4200478 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4200478, term4200478.getClass(), "maxX", 0);
        setIntField(term4200478, term4200478.getClass(), "maxY", 0);
        setField(term4200478, term4200478.getClass(), "tiles", null);
        setField(term4200478, term4200478.getClass(), "tileInfo", null);
        setField(term4200478, term4200478.getClass(), "culture", null);
        setIntField(term4200478, term4200478.getClass(), "cursorX", 0);
        setIntField(term4200478, term4200478.getClass(), "cursorY", 0);
        setIntField(term4200478, term4200478.getClass(), "drawX", 0);
        setIntField(term4200478, term4200478.getClass(), "drawY", 0);
        setField(term4200478, term4200478.getClass(), "sunList", null);
        setField(term4200478, term4200478.getClass(), "planetList", null);
        setField(term4200478, term4200478.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4200478, term4200478.getClass(), "players", null);
        setIntField(term4200478, term4200478.getClass(), "turn", 0);
        setField(term4200478, term4200478.getClass(), "fleetTiles", null);
        setIntField(term4200478, term4200478.getClass(), "aiTurnNumber", 0);
        setField(term4200478, term4200478.getClass(), "aiFleet", null);
        setField(term4200478, term4200478.getClass(), "newsCorpData", null);
        setBooleanField(term4200478, term4200478.getClass(), "debug", false);
        setIntField(term4200478, term4200478.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4200478, term4200478.getClass(), "scoreConquer", 0);
        setIntField(term4200478, term4200478.getClass(), "scoreCulture", 0);
        setIntField(term4200478, term4200478.getClass(), "scoreResearch", 0);
        setIntField(term4200478, term4200478.getClass(), "scoreDiplomacy", 0);
        setIntField(term4200478, term4200478.getClass(), "scorePopulation", 0);
        setField(term4200478, term4200478.getClass(), "history", null);
        setField(term4200478, term4200478.getClass(), "votes", null);
        setBooleanField(term4200478, term4200478.getClass(), "gameEnd", false);
        setBooleanField(term4200478, term4200478.getClass(), "humanLost", false);
        setField(term4200478, term4200478.getClass(), "pirateDifficulty", null);
        setField(term4200478, term4200478.getClass(), "karmaEvents", null);
        setField(term4200478, term4200478.getClass(), "ascensionEvents", null);
        setBooleanField(term4200478, term4200478.getClass(), "tutorialEnabled", false);
        setField(term4200478, term4200478.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4200478, term4200478.getClass(), "allNewsEnabled", false);
        setBooleanField(term4200478, term4200478.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4200478, term4200478.getClass(), "forceRedraw", false);
        setIntField(term4200478, term4200478.getClass(), "zoomLevel", 0);
        setBooleanField(term4200478, term4200478.getClass(), "generateFullGame", false);
        term4200502 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4200502;
        callMethod(klass, "calculateAverageHappiness", argTypes, term4200478, args);
    }

};


