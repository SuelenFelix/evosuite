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

public class StarMap_getCurrentPlayerInfo_1820988919285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4200532;

    public StarMap_getCurrentPlayerInfo_1820988919285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4200532 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4200532, term4200532.getClass(), "maxX", 0);
        setIntField(term4200532, term4200532.getClass(), "maxY", 0);
        setField(term4200532, term4200532.getClass(), "tiles", null);
        setField(term4200532, term4200532.getClass(), "tileInfo", null);
        setField(term4200532, term4200532.getClass(), "culture", null);
        setIntField(term4200532, term4200532.getClass(), "cursorX", 0);
        setIntField(term4200532, term4200532.getClass(), "cursorY", 0);
        setIntField(term4200532, term4200532.getClass(), "drawX", 0);
        setIntField(term4200532, term4200532.getClass(), "drawY", 0);
        setField(term4200532, term4200532.getClass(), "sunList", null);
        setField(term4200532, term4200532.getClass(), "planetList", null);
        setField(term4200532, term4200532.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4200532, term4200532.getClass(), "players", null);
        setIntField(term4200532, term4200532.getClass(), "turn", 0);
        setField(term4200532, term4200532.getClass(), "fleetTiles", null);
        setIntField(term4200532, term4200532.getClass(), "aiTurnNumber", 0);
        setField(term4200532, term4200532.getClass(), "aiFleet", null);
        setField(term4200532, term4200532.getClass(), "newsCorpData", null);
        setBooleanField(term4200532, term4200532.getClass(), "debug", false);
        setIntField(term4200532, term4200532.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4200532, term4200532.getClass(), "scoreConquer", 0);
        setIntField(term4200532, term4200532.getClass(), "scoreCulture", 0);
        setIntField(term4200532, term4200532.getClass(), "scoreResearch", 0);
        setIntField(term4200532, term4200532.getClass(), "scoreDiplomacy", 0);
        setIntField(term4200532, term4200532.getClass(), "scorePopulation", 0);
        setField(term4200532, term4200532.getClass(), "history", null);
        setField(term4200532, term4200532.getClass(), "votes", null);
        setBooleanField(term4200532, term4200532.getClass(), "gameEnd", false);
        setBooleanField(term4200532, term4200532.getClass(), "humanLost", false);
        setField(term4200532, term4200532.getClass(), "pirateDifficulty", null);
        setField(term4200532, term4200532.getClass(), "karmaEvents", null);
        setField(term4200532, term4200532.getClass(), "ascensionEvents", null);
        setBooleanField(term4200532, term4200532.getClass(), "tutorialEnabled", false);
        setField(term4200532, term4200532.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4200532, term4200532.getClass(), "allNewsEnabled", false);
        setBooleanField(term4200532, term4200532.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4200532, term4200532.getClass(), "forceRedraw", false);
        setIntField(term4200532, term4200532.getClass(), "zoomLevel", 0);
        setBooleanField(term4200532, term4200532.getClass(), "generateFullGame", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrentPlayerInfo", argTypes, term4200532, args);
    }

};


