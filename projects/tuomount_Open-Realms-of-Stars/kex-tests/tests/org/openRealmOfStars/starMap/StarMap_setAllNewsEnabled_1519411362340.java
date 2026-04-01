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

public class StarMap_setAllNewsEnabled_1519411362340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4201922;
     Object term4201946;

    public StarMap_setAllNewsEnabled_1519411362340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4201922 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4201922, term4201922.getClass(), "maxX", 0);
        setIntField(term4201922, term4201922.getClass(), "maxY", 0);
        setField(term4201922, term4201922.getClass(), "tiles", null);
        setField(term4201922, term4201922.getClass(), "tileInfo", null);
        setField(term4201922, term4201922.getClass(), "culture", null);
        setIntField(term4201922, term4201922.getClass(), "cursorX", 0);
        setIntField(term4201922, term4201922.getClass(), "cursorY", 0);
        setIntField(term4201922, term4201922.getClass(), "drawX", 0);
        setIntField(term4201922, term4201922.getClass(), "drawY", 0);
        setField(term4201922, term4201922.getClass(), "sunList", null);
        setField(term4201922, term4201922.getClass(), "planetList", null);
        setField(term4201922, term4201922.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4201922, term4201922.getClass(), "players", null);
        setIntField(term4201922, term4201922.getClass(), "turn", 0);
        setField(term4201922, term4201922.getClass(), "fleetTiles", null);
        setIntField(term4201922, term4201922.getClass(), "aiTurnNumber", 0);
        setField(term4201922, term4201922.getClass(), "aiFleet", null);
        setField(term4201922, term4201922.getClass(), "newsCorpData", null);
        setBooleanField(term4201922, term4201922.getClass(), "debug", false);
        setIntField(term4201922, term4201922.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4201922, term4201922.getClass(), "scoreConquer", 0);
        setIntField(term4201922, term4201922.getClass(), "scoreCulture", 0);
        setIntField(term4201922, term4201922.getClass(), "scoreResearch", 0);
        setIntField(term4201922, term4201922.getClass(), "scoreDiplomacy", 0);
        setIntField(term4201922, term4201922.getClass(), "scorePopulation", 0);
        setField(term4201922, term4201922.getClass(), "history", null);
        setField(term4201922, term4201922.getClass(), "votes", null);
        setBooleanField(term4201922, term4201922.getClass(), "gameEnd", false);
        setBooleanField(term4201922, term4201922.getClass(), "humanLost", false);
        setField(term4201922, term4201922.getClass(), "pirateDifficulty", null);
        setField(term4201922, term4201922.getClass(), "karmaEvents", null);
        setField(term4201922, term4201922.getClass(), "ascensionEvents", null);
        setBooleanField(term4201922, term4201922.getClass(), "tutorialEnabled", false);
        setField(term4201922, term4201922.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4201922, term4201922.getClass(), "allNewsEnabled", false);
        setBooleanField(term4201922, term4201922.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4201922, term4201922.getClass(), "forceRedraw", false);
        setIntField(term4201922, term4201922.getClass(), "zoomLevel", 0);
        setBooleanField(term4201922, term4201922.getClass(), "generateFullGame", false);
        term4201946 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4201946;
        callMethod(klass, "setAllNewsEnabled", argTypes, term4201922, args);
    }

};


