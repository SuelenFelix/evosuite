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

public class StarMap_findSuitablePlanetForPirates_61258091313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3770391;
     Object term3770415;
     Object term3770417;

    public StarMap_findSuitablePlanetForPirates_61258091313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3770391 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term3770391, term3770391.getClass(), "maxX", 0);
        setIntField(term3770391, term3770391.getClass(), "maxY", 0);
        setField(term3770391, term3770391.getClass(), "tiles", null);
        setField(term3770391, term3770391.getClass(), "tileInfo", null);
        setField(term3770391, term3770391.getClass(), "culture", null);
        setIntField(term3770391, term3770391.getClass(), "cursorX", 0);
        setIntField(term3770391, term3770391.getClass(), "cursorY", 0);
        setIntField(term3770391, term3770391.getClass(), "drawX", 0);
        setIntField(term3770391, term3770391.getClass(), "drawY", 0);
        setField(term3770391, term3770391.getClass(), "sunList", null);
        setField(term3770391, term3770391.getClass(), "planetList", null);
        setField(term3770391, term3770391.getClass(), "ascensionPlanetCoordinate", null);
        setField(term3770391, term3770391.getClass(), "players", null);
        setIntField(term3770391, term3770391.getClass(), "turn", 0);
        setField(term3770391, term3770391.getClass(), "fleetTiles", null);
        setIntField(term3770391, term3770391.getClass(), "aiTurnNumber", 0);
        setField(term3770391, term3770391.getClass(), "aiFleet", null);
        setField(term3770391, term3770391.getClass(), "newsCorpData", null);
        setBooleanField(term3770391, term3770391.getClass(), "debug", false);
        setIntField(term3770391, term3770391.getClass(), "scoreVictoryTurn", 0);
        setIntField(term3770391, term3770391.getClass(), "scoreConquer", 0);
        setIntField(term3770391, term3770391.getClass(), "scoreCulture", 0);
        setIntField(term3770391, term3770391.getClass(), "scoreResearch", 0);
        setIntField(term3770391, term3770391.getClass(), "scoreDiplomacy", 0);
        setIntField(term3770391, term3770391.getClass(), "scorePopulation", 0);
        setField(term3770391, term3770391.getClass(), "history", null);
        setField(term3770391, term3770391.getClass(), "votes", null);
        setBooleanField(term3770391, term3770391.getClass(), "gameEnd", false);
        setBooleanField(term3770391, term3770391.getClass(), "humanLost", false);
        setField(term3770391, term3770391.getClass(), "pirateDifficulty", null);
        setField(term3770391, term3770391.getClass(), "karmaEvents", null);
        setField(term3770391, term3770391.getClass(), "ascensionEvents", null);
        setBooleanField(term3770391, term3770391.getClass(), "tutorialEnabled", false);
        setField(term3770391, term3770391.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term3770391, term3770391.getClass(), "allNewsEnabled", false);
        setBooleanField(term3770391, term3770391.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term3770391, term3770391.getClass(), "forceRedraw", false);
        setIntField(term3770391, term3770391.getClass(), "zoomLevel", 0);
        setBooleanField(term3770391, term3770391.getClass(), "generateFullGame", false);
        term3770415 = new Integer(0);
        term3770417 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term3770415;
        args[2] = term3770417;
        callMethod(klass, "findSuitablePlanetForPirates", argTypes, term3770391, args);
    }

};


