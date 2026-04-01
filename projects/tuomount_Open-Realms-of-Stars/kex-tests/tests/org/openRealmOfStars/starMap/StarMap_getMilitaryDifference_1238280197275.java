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
import java.lang.Boolean;

public class StarMap_getMilitaryDifference_1238280197275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4200256;
     Object term4200280;
     Object term4200282;
     Object term4200284;

    public StarMap_getMilitaryDifference_1238280197275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4200256 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4200256, term4200256.getClass(), "maxX", 0);
        setIntField(term4200256, term4200256.getClass(), "maxY", 0);
        setField(term4200256, term4200256.getClass(), "tiles", null);
        setField(term4200256, term4200256.getClass(), "tileInfo", null);
        setField(term4200256, term4200256.getClass(), "culture", null);
        setIntField(term4200256, term4200256.getClass(), "cursorX", 0);
        setIntField(term4200256, term4200256.getClass(), "cursorY", 0);
        setIntField(term4200256, term4200256.getClass(), "drawX", 0);
        setIntField(term4200256, term4200256.getClass(), "drawY", 0);
        setField(term4200256, term4200256.getClass(), "sunList", null);
        setField(term4200256, term4200256.getClass(), "planetList", null);
        setField(term4200256, term4200256.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4200256, term4200256.getClass(), "players", null);
        setIntField(term4200256, term4200256.getClass(), "turn", 0);
        setField(term4200256, term4200256.getClass(), "fleetTiles", null);
        setIntField(term4200256, term4200256.getClass(), "aiTurnNumber", 0);
        setField(term4200256, term4200256.getClass(), "aiFleet", null);
        setField(term4200256, term4200256.getClass(), "newsCorpData", null);
        setBooleanField(term4200256, term4200256.getClass(), "debug", false);
        setIntField(term4200256, term4200256.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4200256, term4200256.getClass(), "scoreConquer", 0);
        setIntField(term4200256, term4200256.getClass(), "scoreCulture", 0);
        setIntField(term4200256, term4200256.getClass(), "scoreResearch", 0);
        setIntField(term4200256, term4200256.getClass(), "scoreDiplomacy", 0);
        setIntField(term4200256, term4200256.getClass(), "scorePopulation", 0);
        setField(term4200256, term4200256.getClass(), "history", null);
        setField(term4200256, term4200256.getClass(), "votes", null);
        setBooleanField(term4200256, term4200256.getClass(), "gameEnd", false);
        setBooleanField(term4200256, term4200256.getClass(), "humanLost", false);
        setField(term4200256, term4200256.getClass(), "pirateDifficulty", null);
        setField(term4200256, term4200256.getClass(), "karmaEvents", null);
        setField(term4200256, term4200256.getClass(), "ascensionEvents", null);
        setBooleanField(term4200256, term4200256.getClass(), "tutorialEnabled", false);
        setField(term4200256, term4200256.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4200256, term4200256.getClass(), "allNewsEnabled", false);
        setBooleanField(term4200256, term4200256.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4200256, term4200256.getClass(), "forceRedraw", false);
        setIntField(term4200256, term4200256.getClass(), "zoomLevel", 0);
        setBooleanField(term4200256, term4200256.getClass(), "generateFullGame", false);
        term4200280 = new Integer(0);
        term4200282 = new Integer(0);
        term4200284 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term4200280;
        args[1] = term4200282;
        args[2] = term4200284;
        callMethod(klass, "getMilitaryDifference", argTypes, term4200256, args);
    }

};


