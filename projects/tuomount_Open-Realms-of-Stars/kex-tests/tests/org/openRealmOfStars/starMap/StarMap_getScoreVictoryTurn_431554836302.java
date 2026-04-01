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

public class StarMap_getScoreVictoryTurn_431554836302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4200984;

    public StarMap_getScoreVictoryTurn_431554836302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4200984 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4200984, term4200984.getClass(), "maxX", 0);
        setIntField(term4200984, term4200984.getClass(), "maxY", 0);
        setField(term4200984, term4200984.getClass(), "tiles", null);
        setField(term4200984, term4200984.getClass(), "tileInfo", null);
        setField(term4200984, term4200984.getClass(), "culture", null);
        setIntField(term4200984, term4200984.getClass(), "cursorX", 0);
        setIntField(term4200984, term4200984.getClass(), "cursorY", 0);
        setIntField(term4200984, term4200984.getClass(), "drawX", 0);
        setIntField(term4200984, term4200984.getClass(), "drawY", 0);
        setField(term4200984, term4200984.getClass(), "sunList", null);
        setField(term4200984, term4200984.getClass(), "planetList", null);
        setField(term4200984, term4200984.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4200984, term4200984.getClass(), "players", null);
        setIntField(term4200984, term4200984.getClass(), "turn", 0);
        setField(term4200984, term4200984.getClass(), "fleetTiles", null);
        setIntField(term4200984, term4200984.getClass(), "aiTurnNumber", 0);
        setField(term4200984, term4200984.getClass(), "aiFleet", null);
        setField(term4200984, term4200984.getClass(), "newsCorpData", null);
        setBooleanField(term4200984, term4200984.getClass(), "debug", false);
        setIntField(term4200984, term4200984.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4200984, term4200984.getClass(), "scoreConquer", 0);
        setIntField(term4200984, term4200984.getClass(), "scoreCulture", 0);
        setIntField(term4200984, term4200984.getClass(), "scoreResearch", 0);
        setIntField(term4200984, term4200984.getClass(), "scoreDiplomacy", 0);
        setIntField(term4200984, term4200984.getClass(), "scorePopulation", 0);
        setField(term4200984, term4200984.getClass(), "history", null);
        setField(term4200984, term4200984.getClass(), "votes", null);
        setBooleanField(term4200984, term4200984.getClass(), "gameEnd", false);
        setBooleanField(term4200984, term4200984.getClass(), "humanLost", false);
        setField(term4200984, term4200984.getClass(), "pirateDifficulty", null);
        setField(term4200984, term4200984.getClass(), "karmaEvents", null);
        setField(term4200984, term4200984.getClass(), "ascensionEvents", null);
        setBooleanField(term4200984, term4200984.getClass(), "tutorialEnabled", false);
        setField(term4200984, term4200984.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4200984, term4200984.getClass(), "allNewsEnabled", false);
        setBooleanField(term4200984, term4200984.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4200984, term4200984.getClass(), "forceRedraw", false);
        setIntField(term4200984, term4200984.getClass(), "zoomLevel", 0);
        setBooleanField(term4200984, term4200984.getClass(), "generateFullGame", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScoreVictoryTurn", argTypes, term4200984, args);
    }

};


