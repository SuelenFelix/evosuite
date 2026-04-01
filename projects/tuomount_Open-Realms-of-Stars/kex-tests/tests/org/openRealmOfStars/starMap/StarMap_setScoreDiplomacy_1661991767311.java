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

public class StarMap_setScoreDiplomacy_1661991767311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4201208;
     Object term4201232;

    public StarMap_setScoreDiplomacy_1661991767311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4201208 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4201208, term4201208.getClass(), "maxX", 0);
        setIntField(term4201208, term4201208.getClass(), "maxY", 0);
        setField(term4201208, term4201208.getClass(), "tiles", null);
        setField(term4201208, term4201208.getClass(), "tileInfo", null);
        setField(term4201208, term4201208.getClass(), "culture", null);
        setIntField(term4201208, term4201208.getClass(), "cursorX", 0);
        setIntField(term4201208, term4201208.getClass(), "cursorY", 0);
        setIntField(term4201208, term4201208.getClass(), "drawX", 0);
        setIntField(term4201208, term4201208.getClass(), "drawY", 0);
        setField(term4201208, term4201208.getClass(), "sunList", null);
        setField(term4201208, term4201208.getClass(), "planetList", null);
        setField(term4201208, term4201208.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4201208, term4201208.getClass(), "players", null);
        setIntField(term4201208, term4201208.getClass(), "turn", 0);
        setField(term4201208, term4201208.getClass(), "fleetTiles", null);
        setIntField(term4201208, term4201208.getClass(), "aiTurnNumber", 0);
        setField(term4201208, term4201208.getClass(), "aiFleet", null);
        setField(term4201208, term4201208.getClass(), "newsCorpData", null);
        setBooleanField(term4201208, term4201208.getClass(), "debug", false);
        setIntField(term4201208, term4201208.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4201208, term4201208.getClass(), "scoreConquer", 0);
        setIntField(term4201208, term4201208.getClass(), "scoreCulture", 0);
        setIntField(term4201208, term4201208.getClass(), "scoreResearch", 0);
        setIntField(term4201208, term4201208.getClass(), "scoreDiplomacy", 0);
        setIntField(term4201208, term4201208.getClass(), "scorePopulation", 0);
        setField(term4201208, term4201208.getClass(), "history", null);
        setField(term4201208, term4201208.getClass(), "votes", null);
        setBooleanField(term4201208, term4201208.getClass(), "gameEnd", false);
        setBooleanField(term4201208, term4201208.getClass(), "humanLost", false);
        setField(term4201208, term4201208.getClass(), "pirateDifficulty", null);
        setField(term4201208, term4201208.getClass(), "karmaEvents", null);
        setField(term4201208, term4201208.getClass(), "ascensionEvents", null);
        setBooleanField(term4201208, term4201208.getClass(), "tutorialEnabled", false);
        setField(term4201208, term4201208.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4201208, term4201208.getClass(), "allNewsEnabled", false);
        setBooleanField(term4201208, term4201208.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4201208, term4201208.getClass(), "forceRedraw", false);
        setIntField(term4201208, term4201208.getClass(), "zoomLevel", 0);
        setBooleanField(term4201208, term4201208.getClass(), "generateFullGame", false);
        term4201232 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4201232;
        callMethod(klass, "setScoreDiplomacy", argTypes, term4201208, args);
    }

};


