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

public class StarMap_messageBasedOnTiles_887837593105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3979474;
     Object term3979498;
     Object term3979500;

    public StarMap_messageBasedOnTiles_887837593105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3979474 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term3979474, term3979474.getClass(), "maxX", 0);
        setIntField(term3979474, term3979474.getClass(), "maxY", 0);
        setField(term3979474, term3979474.getClass(), "tiles", null);
        setField(term3979474, term3979474.getClass(), "tileInfo", null);
        setField(term3979474, term3979474.getClass(), "culture", null);
        setIntField(term3979474, term3979474.getClass(), "cursorX", 0);
        setIntField(term3979474, term3979474.getClass(), "cursorY", 0);
        setIntField(term3979474, term3979474.getClass(), "drawX", 0);
        setIntField(term3979474, term3979474.getClass(), "drawY", 0);
        setField(term3979474, term3979474.getClass(), "sunList", null);
        setField(term3979474, term3979474.getClass(), "planetList", null);
        setField(term3979474, term3979474.getClass(), "ascensionPlanetCoordinate", null);
        setField(term3979474, term3979474.getClass(), "players", null);
        setIntField(term3979474, term3979474.getClass(), "turn", 0);
        setField(term3979474, term3979474.getClass(), "fleetTiles", null);
        setIntField(term3979474, term3979474.getClass(), "aiTurnNumber", 0);
        setField(term3979474, term3979474.getClass(), "aiFleet", null);
        setField(term3979474, term3979474.getClass(), "newsCorpData", null);
        setBooleanField(term3979474, term3979474.getClass(), "debug", false);
        setIntField(term3979474, term3979474.getClass(), "scoreVictoryTurn", 0);
        setIntField(term3979474, term3979474.getClass(), "scoreConquer", 0);
        setIntField(term3979474, term3979474.getClass(), "scoreCulture", 0);
        setIntField(term3979474, term3979474.getClass(), "scoreResearch", 0);
        setIntField(term3979474, term3979474.getClass(), "scoreDiplomacy", 0);
        setIntField(term3979474, term3979474.getClass(), "scorePopulation", 0);
        setField(term3979474, term3979474.getClass(), "history", null);
        setField(term3979474, term3979474.getClass(), "votes", null);
        setBooleanField(term3979474, term3979474.getClass(), "gameEnd", false);
        setBooleanField(term3979474, term3979474.getClass(), "humanLost", false);
        setField(term3979474, term3979474.getClass(), "pirateDifficulty", null);
        setField(term3979474, term3979474.getClass(), "karmaEvents", null);
        setField(term3979474, term3979474.getClass(), "ascensionEvents", null);
        setBooleanField(term3979474, term3979474.getClass(), "tutorialEnabled", false);
        setField(term3979474, term3979474.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term3979474, term3979474.getClass(), "allNewsEnabled", false);
        setBooleanField(term3979474, term3979474.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term3979474, term3979474.getClass(), "forceRedraw", false);
        setIntField(term3979474, term3979474.getClass(), "zoomLevel", 0);
        setBooleanField(term3979474, term3979474.getClass(), "generateFullGame", false);
        term3979498 = new Integer(0);
        term3979500 = new Integer(0);
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
        args[1] = term3979498;
        args[2] = term3979500;
        args[3] = null;
        callMethod(klass, "messageBasedOnTiles", argTypes, term3979474, args);
    }

};


