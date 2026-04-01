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

public class StarMap_addSpacePirateColony_1540366313211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4198642;
     Object term4198666;
     Object term4198668;

    public StarMap_addSpacePirateColony_1540366313211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4198642 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4198642, term4198642.getClass(), "maxX", 0);
        setIntField(term4198642, term4198642.getClass(), "maxY", 0);
        setField(term4198642, term4198642.getClass(), "tiles", null);
        setField(term4198642, term4198642.getClass(), "tileInfo", null);
        setField(term4198642, term4198642.getClass(), "culture", null);
        setIntField(term4198642, term4198642.getClass(), "cursorX", 0);
        setIntField(term4198642, term4198642.getClass(), "cursorY", 0);
        setIntField(term4198642, term4198642.getClass(), "drawX", 0);
        setIntField(term4198642, term4198642.getClass(), "drawY", 0);
        setField(term4198642, term4198642.getClass(), "sunList", null);
        setField(term4198642, term4198642.getClass(), "planetList", null);
        setField(term4198642, term4198642.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4198642, term4198642.getClass(), "players", null);
        setIntField(term4198642, term4198642.getClass(), "turn", 0);
        setField(term4198642, term4198642.getClass(), "fleetTiles", null);
        setIntField(term4198642, term4198642.getClass(), "aiTurnNumber", 0);
        setField(term4198642, term4198642.getClass(), "aiFleet", null);
        setField(term4198642, term4198642.getClass(), "newsCorpData", null);
        setBooleanField(term4198642, term4198642.getClass(), "debug", false);
        setIntField(term4198642, term4198642.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4198642, term4198642.getClass(), "scoreConquer", 0);
        setIntField(term4198642, term4198642.getClass(), "scoreCulture", 0);
        setIntField(term4198642, term4198642.getClass(), "scoreResearch", 0);
        setIntField(term4198642, term4198642.getClass(), "scoreDiplomacy", 0);
        setIntField(term4198642, term4198642.getClass(), "scorePopulation", 0);
        setField(term4198642, term4198642.getClass(), "history", null);
        setField(term4198642, term4198642.getClass(), "votes", null);
        setBooleanField(term4198642, term4198642.getClass(), "gameEnd", false);
        setBooleanField(term4198642, term4198642.getClass(), "humanLost", false);
        setField(term4198642, term4198642.getClass(), "pirateDifficulty", null);
        setField(term4198642, term4198642.getClass(), "karmaEvents", null);
        setField(term4198642, term4198642.getClass(), "ascensionEvents", null);
        setBooleanField(term4198642, term4198642.getClass(), "tutorialEnabled", false);
        setField(term4198642, term4198642.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4198642, term4198642.getClass(), "allNewsEnabled", false);
        setBooleanField(term4198642, term4198642.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4198642, term4198642.getClass(), "forceRedraw", false);
        setIntField(term4198642, term4198642.getClass(), "zoomLevel", 0);
        setBooleanField(term4198642, term4198642.getClass(), "generateFullGame", false);
        term4198666 = new Integer(0);
        term4198668 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[3];
        args[0] = term4198666;
        args[1] = term4198668;
        args[2] = null;
        callMethod(klass, "addSpacePirateColony", argTypes, term4198642, args);
    }

};


