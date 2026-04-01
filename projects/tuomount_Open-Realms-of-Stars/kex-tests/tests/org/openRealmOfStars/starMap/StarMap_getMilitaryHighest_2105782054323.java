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

public class StarMap_getMilitaryHighest_2105782054323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4201502;

    public StarMap_getMilitaryHighest_2105782054323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4201502 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4201502, term4201502.getClass(), "maxX", 0);
        setIntField(term4201502, term4201502.getClass(), "maxY", 0);
        setField(term4201502, term4201502.getClass(), "tiles", null);
        setField(term4201502, term4201502.getClass(), "tileInfo", null);
        setField(term4201502, term4201502.getClass(), "culture", null);
        setIntField(term4201502, term4201502.getClass(), "cursorX", 0);
        setIntField(term4201502, term4201502.getClass(), "cursorY", 0);
        setIntField(term4201502, term4201502.getClass(), "drawX", 0);
        setIntField(term4201502, term4201502.getClass(), "drawY", 0);
        setField(term4201502, term4201502.getClass(), "sunList", null);
        setField(term4201502, term4201502.getClass(), "planetList", null);
        setField(term4201502, term4201502.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4201502, term4201502.getClass(), "players", null);
        setIntField(term4201502, term4201502.getClass(), "turn", 0);
        setField(term4201502, term4201502.getClass(), "fleetTiles", null);
        setIntField(term4201502, term4201502.getClass(), "aiTurnNumber", 0);
        setField(term4201502, term4201502.getClass(), "aiFleet", null);
        setField(term4201502, term4201502.getClass(), "newsCorpData", null);
        setBooleanField(term4201502, term4201502.getClass(), "debug", false);
        setIntField(term4201502, term4201502.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4201502, term4201502.getClass(), "scoreConquer", 0);
        setIntField(term4201502, term4201502.getClass(), "scoreCulture", 0);
        setIntField(term4201502, term4201502.getClass(), "scoreResearch", 0);
        setIntField(term4201502, term4201502.getClass(), "scoreDiplomacy", 0);
        setIntField(term4201502, term4201502.getClass(), "scorePopulation", 0);
        setField(term4201502, term4201502.getClass(), "history", null);
        setField(term4201502, term4201502.getClass(), "votes", null);
        setBooleanField(term4201502, term4201502.getClass(), "gameEnd", false);
        setBooleanField(term4201502, term4201502.getClass(), "humanLost", false);
        setField(term4201502, term4201502.getClass(), "pirateDifficulty", null);
        setField(term4201502, term4201502.getClass(), "karmaEvents", null);
        setField(term4201502, term4201502.getClass(), "ascensionEvents", null);
        setBooleanField(term4201502, term4201502.getClass(), "tutorialEnabled", false);
        setField(term4201502, term4201502.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4201502, term4201502.getClass(), "allNewsEnabled", false);
        setBooleanField(term4201502, term4201502.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4201502, term4201502.getClass(), "forceRedraw", false);
        setIntField(term4201502, term4201502.getClass(), "zoomLevel", 0);
        setBooleanField(term4201502, term4201502.getClass(), "generateFullGame", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMilitaryHighest", argTypes, term4201502, args);
    }

};


