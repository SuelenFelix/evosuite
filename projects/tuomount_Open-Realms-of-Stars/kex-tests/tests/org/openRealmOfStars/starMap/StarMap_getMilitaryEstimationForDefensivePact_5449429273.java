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
import java.lang.Boolean;

public class StarMap_getMilitaryEstimationForDefensivePact_5449429273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4200198;
     Object term4200222;
     Object term4200224;
     Object term4200226;

    public StarMap_getMilitaryEstimationForDefensivePact_5449429273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4200198 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4200198, term4200198.getClass(), "maxX", 0);
        setIntField(term4200198, term4200198.getClass(), "maxY", 0);
        setField(term4200198, term4200198.getClass(), "tiles", null);
        setField(term4200198, term4200198.getClass(), "tileInfo", null);
        setField(term4200198, term4200198.getClass(), "culture", null);
        setIntField(term4200198, term4200198.getClass(), "cursorX", 0);
        setIntField(term4200198, term4200198.getClass(), "cursorY", 0);
        setIntField(term4200198, term4200198.getClass(), "drawX", 0);
        setIntField(term4200198, term4200198.getClass(), "drawY", 0);
        setField(term4200198, term4200198.getClass(), "sunList", null);
        setField(term4200198, term4200198.getClass(), "planetList", null);
        setField(term4200198, term4200198.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4200198, term4200198.getClass(), "players", null);
        setIntField(term4200198, term4200198.getClass(), "turn", 0);
        setField(term4200198, term4200198.getClass(), "fleetTiles", null);
        setIntField(term4200198, term4200198.getClass(), "aiTurnNumber", 0);
        setField(term4200198, term4200198.getClass(), "aiFleet", null);
        setField(term4200198, term4200198.getClass(), "newsCorpData", null);
        setBooleanField(term4200198, term4200198.getClass(), "debug", false);
        setIntField(term4200198, term4200198.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4200198, term4200198.getClass(), "scoreConquer", 0);
        setIntField(term4200198, term4200198.getClass(), "scoreCulture", 0);
        setIntField(term4200198, term4200198.getClass(), "scoreResearch", 0);
        setIntField(term4200198, term4200198.getClass(), "scoreDiplomacy", 0);
        setIntField(term4200198, term4200198.getClass(), "scorePopulation", 0);
        setField(term4200198, term4200198.getClass(), "history", null);
        setField(term4200198, term4200198.getClass(), "votes", null);
        setBooleanField(term4200198, term4200198.getClass(), "gameEnd", false);
        setBooleanField(term4200198, term4200198.getClass(), "humanLost", false);
        setField(term4200198, term4200198.getClass(), "pirateDifficulty", null);
        setField(term4200198, term4200198.getClass(), "karmaEvents", null);
        setField(term4200198, term4200198.getClass(), "ascensionEvents", null);
        setBooleanField(term4200198, term4200198.getClass(), "tutorialEnabled", false);
        setField(term4200198, term4200198.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4200198, term4200198.getClass(), "allNewsEnabled", false);
        setBooleanField(term4200198, term4200198.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4200198, term4200198.getClass(), "forceRedraw", false);
        setIntField(term4200198, term4200198.getClass(), "zoomLevel", 0);
        setBooleanField(term4200198, term4200198.getClass(), "generateFullGame", false);
        term4200222 = new Integer(0);
        term4200224 = new Integer(0);
        term4200226 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term4200222;
        args[1] = term4200224;
        args[2] = term4200226;
        callMethod(klass, "getMilitaryEstimationForDefensivePact", argTypes, term4200198, args);
    }

};


