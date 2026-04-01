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

public class StarMap_countArtificialPlanets_135812939111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3761304;

    public StarMap_countArtificialPlanets_135812939111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3761304 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term3761304, term3761304.getClass(), "maxX", 0);
        setIntField(term3761304, term3761304.getClass(), "maxY", 0);
        setField(term3761304, term3761304.getClass(), "tiles", null);
        setField(term3761304, term3761304.getClass(), "tileInfo", null);
        setField(term3761304, term3761304.getClass(), "culture", null);
        setIntField(term3761304, term3761304.getClass(), "cursorX", 0);
        setIntField(term3761304, term3761304.getClass(), "cursorY", 0);
        setIntField(term3761304, term3761304.getClass(), "drawX", 0);
        setIntField(term3761304, term3761304.getClass(), "drawY", 0);
        setField(term3761304, term3761304.getClass(), "sunList", null);
        setField(term3761304, term3761304.getClass(), "planetList", null);
        setField(term3761304, term3761304.getClass(), "ascensionPlanetCoordinate", null);
        setField(term3761304, term3761304.getClass(), "players", null);
        setIntField(term3761304, term3761304.getClass(), "turn", 0);
        setField(term3761304, term3761304.getClass(), "fleetTiles", null);
        setIntField(term3761304, term3761304.getClass(), "aiTurnNumber", 0);
        setField(term3761304, term3761304.getClass(), "aiFleet", null);
        setField(term3761304, term3761304.getClass(), "newsCorpData", null);
        setBooleanField(term3761304, term3761304.getClass(), "debug", false);
        setIntField(term3761304, term3761304.getClass(), "scoreVictoryTurn", 0);
        setIntField(term3761304, term3761304.getClass(), "scoreConquer", 0);
        setIntField(term3761304, term3761304.getClass(), "scoreCulture", 0);
        setIntField(term3761304, term3761304.getClass(), "scoreResearch", 0);
        setIntField(term3761304, term3761304.getClass(), "scoreDiplomacy", 0);
        setIntField(term3761304, term3761304.getClass(), "scorePopulation", 0);
        setField(term3761304, term3761304.getClass(), "history", null);
        setField(term3761304, term3761304.getClass(), "votes", null);
        setBooleanField(term3761304, term3761304.getClass(), "gameEnd", false);
        setBooleanField(term3761304, term3761304.getClass(), "humanLost", false);
        setField(term3761304, term3761304.getClass(), "pirateDifficulty", null);
        setField(term3761304, term3761304.getClass(), "karmaEvents", null);
        setField(term3761304, term3761304.getClass(), "ascensionEvents", null);
        setBooleanField(term3761304, term3761304.getClass(), "tutorialEnabled", false);
        setField(term3761304, term3761304.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term3761304, term3761304.getClass(), "allNewsEnabled", false);
        setBooleanField(term3761304, term3761304.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term3761304, term3761304.getClass(), "forceRedraw", false);
        setIntField(term3761304, term3761304.getClass(), "zoomLevel", 0);
        setBooleanField(term3761304, term3761304.getClass(), "generateFullGame", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "countArtificialPlanets", argTypes, term3761304, args);
    }

};


