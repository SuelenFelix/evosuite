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

public class StarMap_hasHumanMet_277906874192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4170694;

    public StarMap_hasHumanMet_277906874192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4170694 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4170694, term4170694.getClass(), "maxX", 0);
        setIntField(term4170694, term4170694.getClass(), "maxY", 0);
        setField(term4170694, term4170694.getClass(), "tiles", null);
        setField(term4170694, term4170694.getClass(), "tileInfo", null);
        setField(term4170694, term4170694.getClass(), "culture", null);
        setIntField(term4170694, term4170694.getClass(), "cursorX", 0);
        setIntField(term4170694, term4170694.getClass(), "cursorY", 0);
        setIntField(term4170694, term4170694.getClass(), "drawX", 0);
        setIntField(term4170694, term4170694.getClass(), "drawY", 0);
        setField(term4170694, term4170694.getClass(), "sunList", null);
        setField(term4170694, term4170694.getClass(), "planetList", null);
        setField(term4170694, term4170694.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4170694, term4170694.getClass(), "players", null);
        setIntField(term4170694, term4170694.getClass(), "turn", 0);
        setField(term4170694, term4170694.getClass(), "fleetTiles", null);
        setIntField(term4170694, term4170694.getClass(), "aiTurnNumber", 0);
        setField(term4170694, term4170694.getClass(), "aiFleet", null);
        setField(term4170694, term4170694.getClass(), "newsCorpData", null);
        setBooleanField(term4170694, term4170694.getClass(), "debug", false);
        setIntField(term4170694, term4170694.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4170694, term4170694.getClass(), "scoreConquer", 0);
        setIntField(term4170694, term4170694.getClass(), "scoreCulture", 0);
        setIntField(term4170694, term4170694.getClass(), "scoreResearch", 0);
        setIntField(term4170694, term4170694.getClass(), "scoreDiplomacy", 0);
        setIntField(term4170694, term4170694.getClass(), "scorePopulation", 0);
        setField(term4170694, term4170694.getClass(), "history", null);
        setField(term4170694, term4170694.getClass(), "votes", null);
        setBooleanField(term4170694, term4170694.getClass(), "gameEnd", false);
        setBooleanField(term4170694, term4170694.getClass(), "humanLost", false);
        setField(term4170694, term4170694.getClass(), "pirateDifficulty", null);
        setField(term4170694, term4170694.getClass(), "karmaEvents", null);
        setField(term4170694, term4170694.getClass(), "ascensionEvents", null);
        setBooleanField(term4170694, term4170694.getClass(), "tutorialEnabled", false);
        setField(term4170694, term4170694.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4170694, term4170694.getClass(), "allNewsEnabled", false);
        setBooleanField(term4170694, term4170694.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4170694, term4170694.getClass(), "forceRedraw", false);
        setIntField(term4170694, term4170694.getClass(), "zoomLevel", 0);
        setBooleanField(term4170694, term4170694.getClass(), "generateFullGame", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "hasHumanMet", argTypes, term4170694, args);
    }

};


