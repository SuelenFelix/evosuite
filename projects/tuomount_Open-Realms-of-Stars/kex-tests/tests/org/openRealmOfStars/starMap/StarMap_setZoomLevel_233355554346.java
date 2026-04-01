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

public class StarMap_setZoomLevel_233355554346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4202072;
     Object term4202096;

    public StarMap_setZoomLevel_233355554346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4202072 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4202072, term4202072.getClass(), "maxX", 0);
        setIntField(term4202072, term4202072.getClass(), "maxY", 0);
        setField(term4202072, term4202072.getClass(), "tiles", null);
        setField(term4202072, term4202072.getClass(), "tileInfo", null);
        setField(term4202072, term4202072.getClass(), "culture", null);
        setIntField(term4202072, term4202072.getClass(), "cursorX", 0);
        setIntField(term4202072, term4202072.getClass(), "cursorY", 0);
        setIntField(term4202072, term4202072.getClass(), "drawX", 0);
        setIntField(term4202072, term4202072.getClass(), "drawY", 0);
        setField(term4202072, term4202072.getClass(), "sunList", null);
        setField(term4202072, term4202072.getClass(), "planetList", null);
        setField(term4202072, term4202072.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4202072, term4202072.getClass(), "players", null);
        setIntField(term4202072, term4202072.getClass(), "turn", 0);
        setField(term4202072, term4202072.getClass(), "fleetTiles", null);
        setIntField(term4202072, term4202072.getClass(), "aiTurnNumber", 0);
        setField(term4202072, term4202072.getClass(), "aiFleet", null);
        setField(term4202072, term4202072.getClass(), "newsCorpData", null);
        setBooleanField(term4202072, term4202072.getClass(), "debug", false);
        setIntField(term4202072, term4202072.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4202072, term4202072.getClass(), "scoreConquer", 0);
        setIntField(term4202072, term4202072.getClass(), "scoreCulture", 0);
        setIntField(term4202072, term4202072.getClass(), "scoreResearch", 0);
        setIntField(term4202072, term4202072.getClass(), "scoreDiplomacy", 0);
        setIntField(term4202072, term4202072.getClass(), "scorePopulation", 0);
        setField(term4202072, term4202072.getClass(), "history", null);
        setField(term4202072, term4202072.getClass(), "votes", null);
        setBooleanField(term4202072, term4202072.getClass(), "gameEnd", false);
        setBooleanField(term4202072, term4202072.getClass(), "humanLost", false);
        setField(term4202072, term4202072.getClass(), "pirateDifficulty", null);
        setField(term4202072, term4202072.getClass(), "karmaEvents", null);
        setField(term4202072, term4202072.getClass(), "ascensionEvents", null);
        setBooleanField(term4202072, term4202072.getClass(), "tutorialEnabled", false);
        setField(term4202072, term4202072.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4202072, term4202072.getClass(), "allNewsEnabled", false);
        setBooleanField(term4202072, term4202072.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4202072, term4202072.getClass(), "forceRedraw", false);
        setIntField(term4202072, term4202072.getClass(), "zoomLevel", 0);
        setBooleanField(term4202072, term4202072.getClass(), "generateFullGame", false);
        term4202096 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4202096;
        callMethod(klass, "setZoomLevel", argTypes, term4202072, args);
    }

};


