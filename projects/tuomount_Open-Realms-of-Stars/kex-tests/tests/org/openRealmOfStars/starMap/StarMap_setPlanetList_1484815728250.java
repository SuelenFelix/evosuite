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

public class StarMap_setPlanetList_1484815728250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4199638;

    public StarMap_setPlanetList_1484815728250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4199638 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4199638, term4199638.getClass(), "maxX", 0);
        setIntField(term4199638, term4199638.getClass(), "maxY", 0);
        setField(term4199638, term4199638.getClass(), "tiles", null);
        setField(term4199638, term4199638.getClass(), "tileInfo", null);
        setField(term4199638, term4199638.getClass(), "culture", null);
        setIntField(term4199638, term4199638.getClass(), "cursorX", 0);
        setIntField(term4199638, term4199638.getClass(), "cursorY", 0);
        setIntField(term4199638, term4199638.getClass(), "drawX", 0);
        setIntField(term4199638, term4199638.getClass(), "drawY", 0);
        setField(term4199638, term4199638.getClass(), "sunList", null);
        setField(term4199638, term4199638.getClass(), "planetList", null);
        setField(term4199638, term4199638.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4199638, term4199638.getClass(), "players", null);
        setIntField(term4199638, term4199638.getClass(), "turn", 0);
        setField(term4199638, term4199638.getClass(), "fleetTiles", null);
        setIntField(term4199638, term4199638.getClass(), "aiTurnNumber", 0);
        setField(term4199638, term4199638.getClass(), "aiFleet", null);
        setField(term4199638, term4199638.getClass(), "newsCorpData", null);
        setBooleanField(term4199638, term4199638.getClass(), "debug", false);
        setIntField(term4199638, term4199638.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4199638, term4199638.getClass(), "scoreConquer", 0);
        setIntField(term4199638, term4199638.getClass(), "scoreCulture", 0);
        setIntField(term4199638, term4199638.getClass(), "scoreResearch", 0);
        setIntField(term4199638, term4199638.getClass(), "scoreDiplomacy", 0);
        setIntField(term4199638, term4199638.getClass(), "scorePopulation", 0);
        setField(term4199638, term4199638.getClass(), "history", null);
        setField(term4199638, term4199638.getClass(), "votes", null);
        setBooleanField(term4199638, term4199638.getClass(), "gameEnd", false);
        setBooleanField(term4199638, term4199638.getClass(), "humanLost", false);
        setField(term4199638, term4199638.getClass(), "pirateDifficulty", null);
        setField(term4199638, term4199638.getClass(), "karmaEvents", null);
        setField(term4199638, term4199638.getClass(), "ascensionEvents", null);
        setBooleanField(term4199638, term4199638.getClass(), "tutorialEnabled", false);
        setField(term4199638, term4199638.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4199638, term4199638.getClass(), "allNewsEnabled", false);
        setBooleanField(term4199638, term4199638.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4199638, term4199638.getClass(), "forceRedraw", false);
        setIntField(term4199638, term4199638.getClass(), "zoomLevel", 0);
        setBooleanField(term4199638, term4199638.getClass(), "generateFullGame", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.ArrayList");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlanetList", argTypes, term4199638, args);
    }

};


