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

public class StarMap_addSpacePirateLair_5250245638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3741056;
     Object term3741080;
     Object term3741082;

    public StarMap_addSpacePirateLair_5250245638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3741056 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term3741056, term3741056.getClass(), "maxX", 0);
        setIntField(term3741056, term3741056.getClass(), "maxY", 0);
        setField(term3741056, term3741056.getClass(), "tiles", null);
        setField(term3741056, term3741056.getClass(), "tileInfo", null);
        setField(term3741056, term3741056.getClass(), "culture", null);
        setIntField(term3741056, term3741056.getClass(), "cursorX", 0);
        setIntField(term3741056, term3741056.getClass(), "cursorY", 0);
        setIntField(term3741056, term3741056.getClass(), "drawX", 0);
        setIntField(term3741056, term3741056.getClass(), "drawY", 0);
        setField(term3741056, term3741056.getClass(), "sunList", null);
        setField(term3741056, term3741056.getClass(), "planetList", null);
        setField(term3741056, term3741056.getClass(), "ascensionPlanetCoordinate", null);
        setField(term3741056, term3741056.getClass(), "players", null);
        setIntField(term3741056, term3741056.getClass(), "turn", 0);
        setField(term3741056, term3741056.getClass(), "fleetTiles", null);
        setIntField(term3741056, term3741056.getClass(), "aiTurnNumber", 0);
        setField(term3741056, term3741056.getClass(), "aiFleet", null);
        setField(term3741056, term3741056.getClass(), "newsCorpData", null);
        setBooleanField(term3741056, term3741056.getClass(), "debug", false);
        setIntField(term3741056, term3741056.getClass(), "scoreVictoryTurn", 0);
        setIntField(term3741056, term3741056.getClass(), "scoreConquer", 0);
        setIntField(term3741056, term3741056.getClass(), "scoreCulture", 0);
        setIntField(term3741056, term3741056.getClass(), "scoreResearch", 0);
        setIntField(term3741056, term3741056.getClass(), "scoreDiplomacy", 0);
        setIntField(term3741056, term3741056.getClass(), "scorePopulation", 0);
        setField(term3741056, term3741056.getClass(), "history", null);
        setField(term3741056, term3741056.getClass(), "votes", null);
        setBooleanField(term3741056, term3741056.getClass(), "gameEnd", false);
        setBooleanField(term3741056, term3741056.getClass(), "humanLost", false);
        setField(term3741056, term3741056.getClass(), "pirateDifficulty", null);
        setField(term3741056, term3741056.getClass(), "karmaEvents", null);
        setField(term3741056, term3741056.getClass(), "ascensionEvents", null);
        setBooleanField(term3741056, term3741056.getClass(), "tutorialEnabled", false);
        setField(term3741056, term3741056.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term3741056, term3741056.getClass(), "allNewsEnabled", false);
        setBooleanField(term3741056, term3741056.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term3741056, term3741056.getClass(), "forceRedraw", false);
        setIntField(term3741056, term3741056.getClass(), "zoomLevel", 0);
        setBooleanField(term3741056, term3741056.getClass(), "generateFullGame", false);
        term3741080 = new Integer(0);
        term3741082 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[3];
        args[0] = term3741080;
        args[1] = term3741082;
        args[2] = null;
        callMethod(klass, "addSpacePirateLair", argTypes, term3741056, args);
    }

};


