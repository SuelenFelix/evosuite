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

public class StarMap_setForceRedraw_2128014479345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4202046;
     Object term4202070;

    public StarMap_setForceRedraw_2128014479345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4202046 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4202046, term4202046.getClass(), "maxX", 0);
        setIntField(term4202046, term4202046.getClass(), "maxY", 0);
        setField(term4202046, term4202046.getClass(), "tiles", null);
        setField(term4202046, term4202046.getClass(), "tileInfo", null);
        setField(term4202046, term4202046.getClass(), "culture", null);
        setIntField(term4202046, term4202046.getClass(), "cursorX", 0);
        setIntField(term4202046, term4202046.getClass(), "cursorY", 0);
        setIntField(term4202046, term4202046.getClass(), "drawX", 0);
        setIntField(term4202046, term4202046.getClass(), "drawY", 0);
        setField(term4202046, term4202046.getClass(), "sunList", null);
        setField(term4202046, term4202046.getClass(), "planetList", null);
        setField(term4202046, term4202046.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4202046, term4202046.getClass(), "players", null);
        setIntField(term4202046, term4202046.getClass(), "turn", 0);
        setField(term4202046, term4202046.getClass(), "fleetTiles", null);
        setIntField(term4202046, term4202046.getClass(), "aiTurnNumber", 0);
        setField(term4202046, term4202046.getClass(), "aiFleet", null);
        setField(term4202046, term4202046.getClass(), "newsCorpData", null);
        setBooleanField(term4202046, term4202046.getClass(), "debug", false);
        setIntField(term4202046, term4202046.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4202046, term4202046.getClass(), "scoreConquer", 0);
        setIntField(term4202046, term4202046.getClass(), "scoreCulture", 0);
        setIntField(term4202046, term4202046.getClass(), "scoreResearch", 0);
        setIntField(term4202046, term4202046.getClass(), "scoreDiplomacy", 0);
        setIntField(term4202046, term4202046.getClass(), "scorePopulation", 0);
        setField(term4202046, term4202046.getClass(), "history", null);
        setField(term4202046, term4202046.getClass(), "votes", null);
        setBooleanField(term4202046, term4202046.getClass(), "gameEnd", false);
        setBooleanField(term4202046, term4202046.getClass(), "humanLost", false);
        setField(term4202046, term4202046.getClass(), "pirateDifficulty", null);
        setField(term4202046, term4202046.getClass(), "karmaEvents", null);
        setField(term4202046, term4202046.getClass(), "ascensionEvents", null);
        setBooleanField(term4202046, term4202046.getClass(), "tutorialEnabled", false);
        setField(term4202046, term4202046.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4202046, term4202046.getClass(), "allNewsEnabled", false);
        setBooleanField(term4202046, term4202046.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4202046, term4202046.getClass(), "forceRedraw", false);
        setIntField(term4202046, term4202046.getClass(), "zoomLevel", 0);
        setBooleanField(term4202046, term4202046.getClass(), "generateFullGame", false);
        term4202070 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4202070;
        callMethod(klass, "setForceRedraw", argTypes, term4202046, args);
    }

};


