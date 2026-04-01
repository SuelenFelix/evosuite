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

public class StarMap_getGameLengthState_1167475778314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4201284;

    public StarMap_getGameLengthState_1167475778314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4201284 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4201284, term4201284.getClass(), "maxX", 0);
        setIntField(term4201284, term4201284.getClass(), "maxY", 0);
        setField(term4201284, term4201284.getClass(), "tiles", null);
        setField(term4201284, term4201284.getClass(), "tileInfo", null);
        setField(term4201284, term4201284.getClass(), "culture", null);
        setIntField(term4201284, term4201284.getClass(), "cursorX", 0);
        setIntField(term4201284, term4201284.getClass(), "cursorY", 0);
        setIntField(term4201284, term4201284.getClass(), "drawX", 0);
        setIntField(term4201284, term4201284.getClass(), "drawY", 0);
        setField(term4201284, term4201284.getClass(), "sunList", null);
        setField(term4201284, term4201284.getClass(), "planetList", null);
        setField(term4201284, term4201284.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4201284, term4201284.getClass(), "players", null);
        setIntField(term4201284, term4201284.getClass(), "turn", 0);
        setField(term4201284, term4201284.getClass(), "fleetTiles", null);
        setIntField(term4201284, term4201284.getClass(), "aiTurnNumber", 0);
        setField(term4201284, term4201284.getClass(), "aiFleet", null);
        setField(term4201284, term4201284.getClass(), "newsCorpData", null);
        setBooleanField(term4201284, term4201284.getClass(), "debug", false);
        setIntField(term4201284, term4201284.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4201284, term4201284.getClass(), "scoreConquer", 0);
        setIntField(term4201284, term4201284.getClass(), "scoreCulture", 0);
        setIntField(term4201284, term4201284.getClass(), "scoreResearch", 0);
        setIntField(term4201284, term4201284.getClass(), "scoreDiplomacy", 0);
        setIntField(term4201284, term4201284.getClass(), "scorePopulation", 0);
        setField(term4201284, term4201284.getClass(), "history", null);
        setField(term4201284, term4201284.getClass(), "votes", null);
        setBooleanField(term4201284, term4201284.getClass(), "gameEnd", false);
        setBooleanField(term4201284, term4201284.getClass(), "humanLost", false);
        setField(term4201284, term4201284.getClass(), "pirateDifficulty", null);
        setField(term4201284, term4201284.getClass(), "karmaEvents", null);
        setField(term4201284, term4201284.getClass(), "ascensionEvents", null);
        setBooleanField(term4201284, term4201284.getClass(), "tutorialEnabled", false);
        setField(term4201284, term4201284.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4201284, term4201284.getClass(), "allNewsEnabled", false);
        setBooleanField(term4201284, term4201284.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4201284, term4201284.getClass(), "forceRedraw", false);
        setIntField(term4201284, term4201284.getClass(), "zoomLevel", 0);
        setBooleanField(term4201284, term4201284.getClass(), "generateFullGame", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGameLengthState", argTypes, term4201284, args);
    }

};


