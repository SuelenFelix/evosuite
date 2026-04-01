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

public class StarMap_calculateCenterOfRealm_614250708336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4201822;
     Object term4201846;

    public StarMap_calculateCenterOfRealm_614250708336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4201822 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4201822, term4201822.getClass(), "maxX", 0);
        setIntField(term4201822, term4201822.getClass(), "maxY", 0);
        setField(term4201822, term4201822.getClass(), "tiles", null);
        setField(term4201822, term4201822.getClass(), "tileInfo", null);
        setField(term4201822, term4201822.getClass(), "culture", null);
        setIntField(term4201822, term4201822.getClass(), "cursorX", 0);
        setIntField(term4201822, term4201822.getClass(), "cursorY", 0);
        setIntField(term4201822, term4201822.getClass(), "drawX", 0);
        setIntField(term4201822, term4201822.getClass(), "drawY", 0);
        setField(term4201822, term4201822.getClass(), "sunList", null);
        setField(term4201822, term4201822.getClass(), "planetList", null);
        setField(term4201822, term4201822.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4201822, term4201822.getClass(), "players", null);
        setIntField(term4201822, term4201822.getClass(), "turn", 0);
        setField(term4201822, term4201822.getClass(), "fleetTiles", null);
        setIntField(term4201822, term4201822.getClass(), "aiTurnNumber", 0);
        setField(term4201822, term4201822.getClass(), "aiFleet", null);
        setField(term4201822, term4201822.getClass(), "newsCorpData", null);
        setBooleanField(term4201822, term4201822.getClass(), "debug", false);
        setIntField(term4201822, term4201822.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4201822, term4201822.getClass(), "scoreConquer", 0);
        setIntField(term4201822, term4201822.getClass(), "scoreCulture", 0);
        setIntField(term4201822, term4201822.getClass(), "scoreResearch", 0);
        setIntField(term4201822, term4201822.getClass(), "scoreDiplomacy", 0);
        setIntField(term4201822, term4201822.getClass(), "scorePopulation", 0);
        setField(term4201822, term4201822.getClass(), "history", null);
        setField(term4201822, term4201822.getClass(), "votes", null);
        setBooleanField(term4201822, term4201822.getClass(), "gameEnd", false);
        setBooleanField(term4201822, term4201822.getClass(), "humanLost", false);
        setField(term4201822, term4201822.getClass(), "pirateDifficulty", null);
        setField(term4201822, term4201822.getClass(), "karmaEvents", null);
        setField(term4201822, term4201822.getClass(), "ascensionEvents", null);
        setBooleanField(term4201822, term4201822.getClass(), "tutorialEnabled", false);
        setField(term4201822, term4201822.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4201822, term4201822.getClass(), "allNewsEnabled", false);
        setBooleanField(term4201822, term4201822.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4201822, term4201822.getClass(), "forceRedraw", false);
        setIntField(term4201822, term4201822.getClass(), "zoomLevel", 0);
        setBooleanField(term4201822, term4201822.getClass(), "generateFullGame", false);
        term4201846 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4201846;
        callMethod(klass, "calculateCenterOfRealm", argTypes, term4201822, args);
    }

};


