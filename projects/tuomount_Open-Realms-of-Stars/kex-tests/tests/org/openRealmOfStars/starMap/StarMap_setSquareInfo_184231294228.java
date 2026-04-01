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
import java.lang.Byte;

public class StarMap_setSquareInfo_184231294228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4199070;
     Object term4199094;
     Object term4199096;
     Object term4199098;
     Object term4199100;

    public StarMap_setSquareInfo_184231294228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4199070 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4199070, term4199070.getClass(), "maxX", 0);
        setIntField(term4199070, term4199070.getClass(), "maxY", 0);
        setField(term4199070, term4199070.getClass(), "tiles", null);
        setField(term4199070, term4199070.getClass(), "tileInfo", null);
        setField(term4199070, term4199070.getClass(), "culture", null);
        setIntField(term4199070, term4199070.getClass(), "cursorX", 0);
        setIntField(term4199070, term4199070.getClass(), "cursorY", 0);
        setIntField(term4199070, term4199070.getClass(), "drawX", 0);
        setIntField(term4199070, term4199070.getClass(), "drawY", 0);
        setField(term4199070, term4199070.getClass(), "sunList", null);
        setField(term4199070, term4199070.getClass(), "planetList", null);
        setField(term4199070, term4199070.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4199070, term4199070.getClass(), "players", null);
        setIntField(term4199070, term4199070.getClass(), "turn", 0);
        setField(term4199070, term4199070.getClass(), "fleetTiles", null);
        setIntField(term4199070, term4199070.getClass(), "aiTurnNumber", 0);
        setField(term4199070, term4199070.getClass(), "aiFleet", null);
        setField(term4199070, term4199070.getClass(), "newsCorpData", null);
        setBooleanField(term4199070, term4199070.getClass(), "debug", false);
        setIntField(term4199070, term4199070.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4199070, term4199070.getClass(), "scoreConquer", 0);
        setIntField(term4199070, term4199070.getClass(), "scoreCulture", 0);
        setIntField(term4199070, term4199070.getClass(), "scoreResearch", 0);
        setIntField(term4199070, term4199070.getClass(), "scoreDiplomacy", 0);
        setIntField(term4199070, term4199070.getClass(), "scorePopulation", 0);
        setField(term4199070, term4199070.getClass(), "history", null);
        setField(term4199070, term4199070.getClass(), "votes", null);
        setBooleanField(term4199070, term4199070.getClass(), "gameEnd", false);
        setBooleanField(term4199070, term4199070.getClass(), "humanLost", false);
        setField(term4199070, term4199070.getClass(), "pirateDifficulty", null);
        setField(term4199070, term4199070.getClass(), "karmaEvents", null);
        setField(term4199070, term4199070.getClass(), "ascensionEvents", null);
        setBooleanField(term4199070, term4199070.getClass(), "tutorialEnabled", false);
        setField(term4199070, term4199070.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4199070, term4199070.getClass(), "allNewsEnabled", false);
        setBooleanField(term4199070, term4199070.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4199070, term4199070.getClass(), "forceRedraw", false);
        setIntField(term4199070, term4199070.getClass(), "zoomLevel", 0);
        setBooleanField(term4199070, term4199070.getClass(), "generateFullGame", false);
        term4199094 = new Integer(0);
        term4199096 = new Integer(0);
        term4199098 = new Byte((byte) 0);
        term4199100 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = byte.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term4199094;
        args[1] = term4199096;
        args[2] = term4199098;
        args[3] = term4199100;
        callMethod(klass, "setSquareInfo", argTypes, term4199070, args);
    }

};


