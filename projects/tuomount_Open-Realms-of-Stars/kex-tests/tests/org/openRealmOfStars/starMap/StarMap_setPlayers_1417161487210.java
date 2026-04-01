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

public class StarMap_setPlayers_1417161487210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4198618;

    public StarMap_setPlayers_1417161487210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4198618 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4198618, term4198618.getClass(), "maxX", 0);
        setIntField(term4198618, term4198618.getClass(), "maxY", 0);
        setField(term4198618, term4198618.getClass(), "tiles", null);
        setField(term4198618, term4198618.getClass(), "tileInfo", null);
        setField(term4198618, term4198618.getClass(), "culture", null);
        setIntField(term4198618, term4198618.getClass(), "cursorX", 0);
        setIntField(term4198618, term4198618.getClass(), "cursorY", 0);
        setIntField(term4198618, term4198618.getClass(), "drawX", 0);
        setIntField(term4198618, term4198618.getClass(), "drawY", 0);
        setField(term4198618, term4198618.getClass(), "sunList", null);
        setField(term4198618, term4198618.getClass(), "planetList", null);
        setField(term4198618, term4198618.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4198618, term4198618.getClass(), "players", null);
        setIntField(term4198618, term4198618.getClass(), "turn", 0);
        setField(term4198618, term4198618.getClass(), "fleetTiles", null);
        setIntField(term4198618, term4198618.getClass(), "aiTurnNumber", 0);
        setField(term4198618, term4198618.getClass(), "aiFleet", null);
        setField(term4198618, term4198618.getClass(), "newsCorpData", null);
        setBooleanField(term4198618, term4198618.getClass(), "debug", false);
        setIntField(term4198618, term4198618.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4198618, term4198618.getClass(), "scoreConquer", 0);
        setIntField(term4198618, term4198618.getClass(), "scoreCulture", 0);
        setIntField(term4198618, term4198618.getClass(), "scoreResearch", 0);
        setIntField(term4198618, term4198618.getClass(), "scoreDiplomacy", 0);
        setIntField(term4198618, term4198618.getClass(), "scorePopulation", 0);
        setField(term4198618, term4198618.getClass(), "history", null);
        setField(term4198618, term4198618.getClass(), "votes", null);
        setBooleanField(term4198618, term4198618.getClass(), "gameEnd", false);
        setBooleanField(term4198618, term4198618.getClass(), "humanLost", false);
        setField(term4198618, term4198618.getClass(), "pirateDifficulty", null);
        setField(term4198618, term4198618.getClass(), "karmaEvents", null);
        setField(term4198618, term4198618.getClass(), "ascensionEvents", null);
        setBooleanField(term4198618, term4198618.getClass(), "tutorialEnabled", false);
        setField(term4198618, term4198618.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4198618, term4198618.getClass(), "allNewsEnabled", false);
        setBooleanField(term4198618, term4198618.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4198618, term4198618.getClass(), "forceRedraw", false);
        setIntField(term4198618, term4198618.getClass(), "zoomLevel", 0);
        setBooleanField(term4198618, term4198618.getClass(), "generateFullGame", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerList");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlayers", argTypes, term4198618, args);
    }

};


