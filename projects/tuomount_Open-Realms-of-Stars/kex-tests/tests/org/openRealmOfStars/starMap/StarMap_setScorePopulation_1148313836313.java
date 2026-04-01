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

public class StarMap_setScorePopulation_1148313836313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4201258;
     Object term4201282;

    public StarMap_setScorePopulation_1148313836313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4201258 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4201258, term4201258.getClass(), "maxX", 0);
        setIntField(term4201258, term4201258.getClass(), "maxY", 0);
        setField(term4201258, term4201258.getClass(), "tiles", null);
        setField(term4201258, term4201258.getClass(), "tileInfo", null);
        setField(term4201258, term4201258.getClass(), "culture", null);
        setIntField(term4201258, term4201258.getClass(), "cursorX", 0);
        setIntField(term4201258, term4201258.getClass(), "cursorY", 0);
        setIntField(term4201258, term4201258.getClass(), "drawX", 0);
        setIntField(term4201258, term4201258.getClass(), "drawY", 0);
        setField(term4201258, term4201258.getClass(), "sunList", null);
        setField(term4201258, term4201258.getClass(), "planetList", null);
        setField(term4201258, term4201258.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4201258, term4201258.getClass(), "players", null);
        setIntField(term4201258, term4201258.getClass(), "turn", 0);
        setField(term4201258, term4201258.getClass(), "fleetTiles", null);
        setIntField(term4201258, term4201258.getClass(), "aiTurnNumber", 0);
        setField(term4201258, term4201258.getClass(), "aiFleet", null);
        setField(term4201258, term4201258.getClass(), "newsCorpData", null);
        setBooleanField(term4201258, term4201258.getClass(), "debug", false);
        setIntField(term4201258, term4201258.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4201258, term4201258.getClass(), "scoreConquer", 0);
        setIntField(term4201258, term4201258.getClass(), "scoreCulture", 0);
        setIntField(term4201258, term4201258.getClass(), "scoreResearch", 0);
        setIntField(term4201258, term4201258.getClass(), "scoreDiplomacy", 0);
        setIntField(term4201258, term4201258.getClass(), "scorePopulation", 0);
        setField(term4201258, term4201258.getClass(), "history", null);
        setField(term4201258, term4201258.getClass(), "votes", null);
        setBooleanField(term4201258, term4201258.getClass(), "gameEnd", false);
        setBooleanField(term4201258, term4201258.getClass(), "humanLost", false);
        setField(term4201258, term4201258.getClass(), "pirateDifficulty", null);
        setField(term4201258, term4201258.getClass(), "karmaEvents", null);
        setField(term4201258, term4201258.getClass(), "ascensionEvents", null);
        setBooleanField(term4201258, term4201258.getClass(), "tutorialEnabled", false);
        setField(term4201258, term4201258.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4201258, term4201258.getClass(), "allNewsEnabled", false);
        setBooleanField(term4201258, term4201258.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4201258, term4201258.getClass(), "forceRedraw", false);
        setIntField(term4201258, term4201258.getClass(), "zoomLevel", 0);
        setBooleanField(term4201258, term4201258.getClass(), "generateFullGame", false);
        term4201282 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4201282;
        callMethod(klass, "setScorePopulation", argTypes, term4201258, args);
    }

};


