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

public class StarMap_tutorialBasedOnTiles_782600994107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3988100;
     Object term3988124;
     Object term3988126;

    public StarMap_tutorialBasedOnTiles_782600994107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3988100 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term3988100, term3988100.getClass(), "maxX", 0);
        setIntField(term3988100, term3988100.getClass(), "maxY", 0);
        setField(term3988100, term3988100.getClass(), "tiles", null);
        setField(term3988100, term3988100.getClass(), "tileInfo", null);
        setField(term3988100, term3988100.getClass(), "culture", null);
        setIntField(term3988100, term3988100.getClass(), "cursorX", 0);
        setIntField(term3988100, term3988100.getClass(), "cursorY", 0);
        setIntField(term3988100, term3988100.getClass(), "drawX", 0);
        setIntField(term3988100, term3988100.getClass(), "drawY", 0);
        setField(term3988100, term3988100.getClass(), "sunList", null);
        setField(term3988100, term3988100.getClass(), "planetList", null);
        setField(term3988100, term3988100.getClass(), "ascensionPlanetCoordinate", null);
        setField(term3988100, term3988100.getClass(), "players", null);
        setIntField(term3988100, term3988100.getClass(), "turn", 0);
        setField(term3988100, term3988100.getClass(), "fleetTiles", null);
        setIntField(term3988100, term3988100.getClass(), "aiTurnNumber", 0);
        setField(term3988100, term3988100.getClass(), "aiFleet", null);
        setField(term3988100, term3988100.getClass(), "newsCorpData", null);
        setBooleanField(term3988100, term3988100.getClass(), "debug", false);
        setIntField(term3988100, term3988100.getClass(), "scoreVictoryTurn", 0);
        setIntField(term3988100, term3988100.getClass(), "scoreConquer", 0);
        setIntField(term3988100, term3988100.getClass(), "scoreCulture", 0);
        setIntField(term3988100, term3988100.getClass(), "scoreResearch", 0);
        setIntField(term3988100, term3988100.getClass(), "scoreDiplomacy", 0);
        setIntField(term3988100, term3988100.getClass(), "scorePopulation", 0);
        setField(term3988100, term3988100.getClass(), "history", null);
        setField(term3988100, term3988100.getClass(), "votes", null);
        setBooleanField(term3988100, term3988100.getClass(), "gameEnd", false);
        setBooleanField(term3988100, term3988100.getClass(), "humanLost", false);
        setField(term3988100, term3988100.getClass(), "pirateDifficulty", null);
        setField(term3988100, term3988100.getClass(), "karmaEvents", null);
        setField(term3988100, term3988100.getClass(), "ascensionEvents", null);
        setBooleanField(term3988100, term3988100.getClass(), "tutorialEnabled", false);
        setField(term3988100, term3988100.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term3988100, term3988100.getClass(), "allNewsEnabled", false);
        setBooleanField(term3988100, term3988100.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term3988100, term3988100.getClass(), "forceRedraw", false);
        setIntField(term3988100, term3988100.getClass(), "zoomLevel", 0);
        setBooleanField(term3988100, term3988100.getClass(), "generateFullGame", false);
        term3988124 = new Integer(0);
        term3988126 = new Integer(0);
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
        args[1] = term3988124;
        args[2] = term3988126;
        callMethod(klass, "tutorialBasedOnTiles", argTypes, term3988100, args);
    }

};


