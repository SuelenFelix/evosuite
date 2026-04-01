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

public class StarMap_fightWithFleet_112980961769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3902089;
     Object term3902113;
     Object term3902115;

    public StarMap_fightWithFleet_112980961769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3902089 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term3902089, term3902089.getClass(), "maxX", 0);
        setIntField(term3902089, term3902089.getClass(), "maxY", 0);
        setField(term3902089, term3902089.getClass(), "tiles", null);
        setField(term3902089, term3902089.getClass(), "tileInfo", null);
        setField(term3902089, term3902089.getClass(), "culture", null);
        setIntField(term3902089, term3902089.getClass(), "cursorX", 0);
        setIntField(term3902089, term3902089.getClass(), "cursorY", 0);
        setIntField(term3902089, term3902089.getClass(), "drawX", 0);
        setIntField(term3902089, term3902089.getClass(), "drawY", 0);
        setField(term3902089, term3902089.getClass(), "sunList", null);
        setField(term3902089, term3902089.getClass(), "planetList", null);
        setField(term3902089, term3902089.getClass(), "ascensionPlanetCoordinate", null);
        setField(term3902089, term3902089.getClass(), "players", null);
        setIntField(term3902089, term3902089.getClass(), "turn", 0);
        setField(term3902089, term3902089.getClass(), "fleetTiles", null);
        setIntField(term3902089, term3902089.getClass(), "aiTurnNumber", 0);
        setField(term3902089, term3902089.getClass(), "aiFleet", null);
        setField(term3902089, term3902089.getClass(), "newsCorpData", null);
        setBooleanField(term3902089, term3902089.getClass(), "debug", false);
        setIntField(term3902089, term3902089.getClass(), "scoreVictoryTurn", 0);
        setIntField(term3902089, term3902089.getClass(), "scoreConquer", 0);
        setIntField(term3902089, term3902089.getClass(), "scoreCulture", 0);
        setIntField(term3902089, term3902089.getClass(), "scoreResearch", 0);
        setIntField(term3902089, term3902089.getClass(), "scoreDiplomacy", 0);
        setIntField(term3902089, term3902089.getClass(), "scorePopulation", 0);
        setField(term3902089, term3902089.getClass(), "history", null);
        setField(term3902089, term3902089.getClass(), "votes", null);
        setBooleanField(term3902089, term3902089.getClass(), "gameEnd", false);
        setBooleanField(term3902089, term3902089.getClass(), "humanLost", false);
        setField(term3902089, term3902089.getClass(), "pirateDifficulty", null);
        setField(term3902089, term3902089.getClass(), "karmaEvents", null);
        setField(term3902089, term3902089.getClass(), "ascensionEvents", null);
        setBooleanField(term3902089, term3902089.getClass(), "tutorialEnabled", false);
        setField(term3902089, term3902089.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term3902089, term3902089.getClass(), "allNewsEnabled", false);
        setBooleanField(term3902089, term3902089.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term3902089, term3902089.getClass(), "forceRedraw", false);
        setIntField(term3902089, term3902089.getClass(), "zoomLevel", 0);
        setBooleanField(term3902089, term3902089.getClass(), "generateFullGame", false);
        term3902113 = new Integer(0);
        term3902115 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        argTypes[3] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[4];
        args[0] = term3902113;
        args[1] = term3902115;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "fightWithFleet", argTypes, term3902089, args);
    }

};


