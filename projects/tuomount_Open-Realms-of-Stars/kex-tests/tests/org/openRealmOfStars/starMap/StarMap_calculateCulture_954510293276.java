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

public class StarMap_calculateCulture_954510293276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4200286;
     Object term4200310;
     Object term4200312;
     Object term4200314;
     Object term4200316;

    public StarMap_calculateCulture_954510293276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4200286 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4200286, term4200286.getClass(), "maxX", 0);
        setIntField(term4200286, term4200286.getClass(), "maxY", 0);
        setField(term4200286, term4200286.getClass(), "tiles", null);
        setField(term4200286, term4200286.getClass(), "tileInfo", null);
        setField(term4200286, term4200286.getClass(), "culture", null);
        setIntField(term4200286, term4200286.getClass(), "cursorX", 0);
        setIntField(term4200286, term4200286.getClass(), "cursorY", 0);
        setIntField(term4200286, term4200286.getClass(), "drawX", 0);
        setIntField(term4200286, term4200286.getClass(), "drawY", 0);
        setField(term4200286, term4200286.getClass(), "sunList", null);
        setField(term4200286, term4200286.getClass(), "planetList", null);
        setField(term4200286, term4200286.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4200286, term4200286.getClass(), "players", null);
        setIntField(term4200286, term4200286.getClass(), "turn", 0);
        setField(term4200286, term4200286.getClass(), "fleetTiles", null);
        setIntField(term4200286, term4200286.getClass(), "aiTurnNumber", 0);
        setField(term4200286, term4200286.getClass(), "aiFleet", null);
        setField(term4200286, term4200286.getClass(), "newsCorpData", null);
        setBooleanField(term4200286, term4200286.getClass(), "debug", false);
        setIntField(term4200286, term4200286.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4200286, term4200286.getClass(), "scoreConquer", 0);
        setIntField(term4200286, term4200286.getClass(), "scoreCulture", 0);
        setIntField(term4200286, term4200286.getClass(), "scoreResearch", 0);
        setIntField(term4200286, term4200286.getClass(), "scoreDiplomacy", 0);
        setIntField(term4200286, term4200286.getClass(), "scorePopulation", 0);
        setField(term4200286, term4200286.getClass(), "history", null);
        setField(term4200286, term4200286.getClass(), "votes", null);
        setBooleanField(term4200286, term4200286.getClass(), "gameEnd", false);
        setBooleanField(term4200286, term4200286.getClass(), "humanLost", false);
        setField(term4200286, term4200286.getClass(), "pirateDifficulty", null);
        setField(term4200286, term4200286.getClass(), "karmaEvents", null);
        setField(term4200286, term4200286.getClass(), "ascensionEvents", null);
        setBooleanField(term4200286, term4200286.getClass(), "tutorialEnabled", false);
        setField(term4200286, term4200286.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4200286, term4200286.getClass(), "allNewsEnabled", false);
        setBooleanField(term4200286, term4200286.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4200286, term4200286.getClass(), "forceRedraw", false);
        setIntField(term4200286, term4200286.getClass(), "zoomLevel", 0);
        setBooleanField(term4200286, term4200286.getClass(), "generateFullGame", false);
        term4200310 = new Integer(0);
        term4200312 = new Integer(0);
        term4200314 = new Integer(0);
        term4200316 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term4200310;
        args[1] = term4200312;
        args[2] = term4200314;
        args[3] = term4200316;
        callMethod(klass, "calculateCulture", argTypes, term4200286, args);
    }

};


