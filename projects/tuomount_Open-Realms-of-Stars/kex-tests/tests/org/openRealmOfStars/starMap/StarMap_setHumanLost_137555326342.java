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
import java.lang.Boolean;

public class StarMap_setHumanLost_137555326342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4201972;
     Object term4201996;

    public StarMap_setHumanLost_137555326342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4201972 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4201972, term4201972.getClass(), "maxX", 0);
        setIntField(term4201972, term4201972.getClass(), "maxY", 0);
        setField(term4201972, term4201972.getClass(), "tiles", null);
        setField(term4201972, term4201972.getClass(), "tileInfo", null);
        setField(term4201972, term4201972.getClass(), "culture", null);
        setIntField(term4201972, term4201972.getClass(), "cursorX", 0);
        setIntField(term4201972, term4201972.getClass(), "cursorY", 0);
        setIntField(term4201972, term4201972.getClass(), "drawX", 0);
        setIntField(term4201972, term4201972.getClass(), "drawY", 0);
        setField(term4201972, term4201972.getClass(), "sunList", null);
        setField(term4201972, term4201972.getClass(), "planetList", null);
        setField(term4201972, term4201972.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4201972, term4201972.getClass(), "players", null);
        setIntField(term4201972, term4201972.getClass(), "turn", 0);
        setField(term4201972, term4201972.getClass(), "fleetTiles", null);
        setIntField(term4201972, term4201972.getClass(), "aiTurnNumber", 0);
        setField(term4201972, term4201972.getClass(), "aiFleet", null);
        setField(term4201972, term4201972.getClass(), "newsCorpData", null);
        setBooleanField(term4201972, term4201972.getClass(), "debug", false);
        setIntField(term4201972, term4201972.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4201972, term4201972.getClass(), "scoreConquer", 0);
        setIntField(term4201972, term4201972.getClass(), "scoreCulture", 0);
        setIntField(term4201972, term4201972.getClass(), "scoreResearch", 0);
        setIntField(term4201972, term4201972.getClass(), "scoreDiplomacy", 0);
        setIntField(term4201972, term4201972.getClass(), "scorePopulation", 0);
        setField(term4201972, term4201972.getClass(), "history", null);
        setField(term4201972, term4201972.getClass(), "votes", null);
        setBooleanField(term4201972, term4201972.getClass(), "gameEnd", false);
        setBooleanField(term4201972, term4201972.getClass(), "humanLost", false);
        setField(term4201972, term4201972.getClass(), "pirateDifficulty", null);
        setField(term4201972, term4201972.getClass(), "karmaEvents", null);
        setField(term4201972, term4201972.getClass(), "ascensionEvents", null);
        setBooleanField(term4201972, term4201972.getClass(), "tutorialEnabled", false);
        setField(term4201972, term4201972.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4201972, term4201972.getClass(), "allNewsEnabled", false);
        setBooleanField(term4201972, term4201972.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4201972, term4201972.getClass(), "forceRedraw", false);
        setIntField(term4201972, term4201972.getClass(), "zoomLevel", 0);
        setBooleanField(term4201972, term4201972.getClass(), "generateFullGame", false);
        term4201996 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4201996;
        callMethod(klass, "setHumanLost", argTypes, term4201972, args);
    }

};


