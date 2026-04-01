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

public class StarMap_getPlanetByCoordinate_1257750081245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4199510;
     Object term4199534;
     Object term4199536;

    public StarMap_getPlanetByCoordinate_1257750081245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4199510 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4199510, term4199510.getClass(), "maxX", 0);
        setIntField(term4199510, term4199510.getClass(), "maxY", 0);
        setField(term4199510, term4199510.getClass(), "tiles", null);
        setField(term4199510, term4199510.getClass(), "tileInfo", null);
        setField(term4199510, term4199510.getClass(), "culture", null);
        setIntField(term4199510, term4199510.getClass(), "cursorX", 0);
        setIntField(term4199510, term4199510.getClass(), "cursorY", 0);
        setIntField(term4199510, term4199510.getClass(), "drawX", 0);
        setIntField(term4199510, term4199510.getClass(), "drawY", 0);
        setField(term4199510, term4199510.getClass(), "sunList", null);
        setField(term4199510, term4199510.getClass(), "planetList", null);
        setField(term4199510, term4199510.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4199510, term4199510.getClass(), "players", null);
        setIntField(term4199510, term4199510.getClass(), "turn", 0);
        setField(term4199510, term4199510.getClass(), "fleetTiles", null);
        setIntField(term4199510, term4199510.getClass(), "aiTurnNumber", 0);
        setField(term4199510, term4199510.getClass(), "aiFleet", null);
        setField(term4199510, term4199510.getClass(), "newsCorpData", null);
        setBooleanField(term4199510, term4199510.getClass(), "debug", false);
        setIntField(term4199510, term4199510.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4199510, term4199510.getClass(), "scoreConquer", 0);
        setIntField(term4199510, term4199510.getClass(), "scoreCulture", 0);
        setIntField(term4199510, term4199510.getClass(), "scoreResearch", 0);
        setIntField(term4199510, term4199510.getClass(), "scoreDiplomacy", 0);
        setIntField(term4199510, term4199510.getClass(), "scorePopulation", 0);
        setField(term4199510, term4199510.getClass(), "history", null);
        setField(term4199510, term4199510.getClass(), "votes", null);
        setBooleanField(term4199510, term4199510.getClass(), "gameEnd", false);
        setBooleanField(term4199510, term4199510.getClass(), "humanLost", false);
        setField(term4199510, term4199510.getClass(), "pirateDifficulty", null);
        setField(term4199510, term4199510.getClass(), "karmaEvents", null);
        setField(term4199510, term4199510.getClass(), "ascensionEvents", null);
        setBooleanField(term4199510, term4199510.getClass(), "tutorialEnabled", false);
        setField(term4199510, term4199510.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4199510, term4199510.getClass(), "allNewsEnabled", false);
        setBooleanField(term4199510, term4199510.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4199510, term4199510.getClass(), "forceRedraw", false);
        setIntField(term4199510, term4199510.getClass(), "zoomLevel", 0);
        setBooleanField(term4199510, term4199510.getClass(), "generateFullGame", false);
        term4199534 = new Integer(0);
        term4199536 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4199534;
        args[1] = term4199536;
        callMethod(klass, "getPlanetByCoordinate", argTypes, term4199510, args);
    }

};


