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

public class StarMap_ascensionEventsOnTiles_1961904821111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4004482;
     Object term4004506;
     Object term4004508;

    public StarMap_ascensionEventsOnTiles_1961904821111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4004482 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4004482, term4004482.getClass(), "maxX", 0);
        setIntField(term4004482, term4004482.getClass(), "maxY", 0);
        setField(term4004482, term4004482.getClass(), "tiles", null);
        setField(term4004482, term4004482.getClass(), "tileInfo", null);
        setField(term4004482, term4004482.getClass(), "culture", null);
        setIntField(term4004482, term4004482.getClass(), "cursorX", 0);
        setIntField(term4004482, term4004482.getClass(), "cursorY", 0);
        setIntField(term4004482, term4004482.getClass(), "drawX", 0);
        setIntField(term4004482, term4004482.getClass(), "drawY", 0);
        setField(term4004482, term4004482.getClass(), "sunList", null);
        setField(term4004482, term4004482.getClass(), "planetList", null);
        setField(term4004482, term4004482.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4004482, term4004482.getClass(), "players", null);
        setIntField(term4004482, term4004482.getClass(), "turn", 0);
        setField(term4004482, term4004482.getClass(), "fleetTiles", null);
        setIntField(term4004482, term4004482.getClass(), "aiTurnNumber", 0);
        setField(term4004482, term4004482.getClass(), "aiFleet", null);
        setField(term4004482, term4004482.getClass(), "newsCorpData", null);
        setBooleanField(term4004482, term4004482.getClass(), "debug", false);
        setIntField(term4004482, term4004482.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4004482, term4004482.getClass(), "scoreConquer", 0);
        setIntField(term4004482, term4004482.getClass(), "scoreCulture", 0);
        setIntField(term4004482, term4004482.getClass(), "scoreResearch", 0);
        setIntField(term4004482, term4004482.getClass(), "scoreDiplomacy", 0);
        setIntField(term4004482, term4004482.getClass(), "scorePopulation", 0);
        setField(term4004482, term4004482.getClass(), "history", null);
        setField(term4004482, term4004482.getClass(), "votes", null);
        setBooleanField(term4004482, term4004482.getClass(), "gameEnd", false);
        setBooleanField(term4004482, term4004482.getClass(), "humanLost", false);
        setField(term4004482, term4004482.getClass(), "pirateDifficulty", null);
        setField(term4004482, term4004482.getClass(), "karmaEvents", null);
        setField(term4004482, term4004482.getClass(), "ascensionEvents", null);
        setBooleanField(term4004482, term4004482.getClass(), "tutorialEnabled", false);
        setField(term4004482, term4004482.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4004482, term4004482.getClass(), "allNewsEnabled", false);
        setBooleanField(term4004482, term4004482.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4004482, term4004482.getClass(), "forceRedraw", false);
        setIntField(term4004482, term4004482.getClass(), "zoomLevel", 0);
        setBooleanField(term4004482, term4004482.getClass(), "generateFullGame", false);
        term4004506 = new Integer(0);
        term4004508 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term4004506;
        args[2] = term4004508;
        args[3] = null;
        callMethod(klass, "ascensionEventsOnTiles", argTypes, term4004482, args);
    }

};


