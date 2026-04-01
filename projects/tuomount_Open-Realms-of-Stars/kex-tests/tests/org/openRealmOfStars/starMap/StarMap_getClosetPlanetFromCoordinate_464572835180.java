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

public class StarMap_getClosetPlanetFromCoordinate_464572835180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4148733;

    public StarMap_getClosetPlanetFromCoordinate_464572835180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4148733 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4148733, term4148733.getClass(), "maxX", 0);
        setIntField(term4148733, term4148733.getClass(), "maxY", 0);
        setField(term4148733, term4148733.getClass(), "tiles", null);
        setField(term4148733, term4148733.getClass(), "tileInfo", null);
        setField(term4148733, term4148733.getClass(), "culture", null);
        setIntField(term4148733, term4148733.getClass(), "cursorX", 0);
        setIntField(term4148733, term4148733.getClass(), "cursorY", 0);
        setIntField(term4148733, term4148733.getClass(), "drawX", 0);
        setIntField(term4148733, term4148733.getClass(), "drawY", 0);
        setField(term4148733, term4148733.getClass(), "sunList", null);
        setField(term4148733, term4148733.getClass(), "planetList", null);
        setField(term4148733, term4148733.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4148733, term4148733.getClass(), "players", null);
        setIntField(term4148733, term4148733.getClass(), "turn", 0);
        setField(term4148733, term4148733.getClass(), "fleetTiles", null);
        setIntField(term4148733, term4148733.getClass(), "aiTurnNumber", 0);
        setField(term4148733, term4148733.getClass(), "aiFleet", null);
        setField(term4148733, term4148733.getClass(), "newsCorpData", null);
        setBooleanField(term4148733, term4148733.getClass(), "debug", false);
        setIntField(term4148733, term4148733.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4148733, term4148733.getClass(), "scoreConquer", 0);
        setIntField(term4148733, term4148733.getClass(), "scoreCulture", 0);
        setIntField(term4148733, term4148733.getClass(), "scoreResearch", 0);
        setIntField(term4148733, term4148733.getClass(), "scoreDiplomacy", 0);
        setIntField(term4148733, term4148733.getClass(), "scorePopulation", 0);
        setField(term4148733, term4148733.getClass(), "history", null);
        setField(term4148733, term4148733.getClass(), "votes", null);
        setBooleanField(term4148733, term4148733.getClass(), "gameEnd", false);
        setBooleanField(term4148733, term4148733.getClass(), "humanLost", false);
        setField(term4148733, term4148733.getClass(), "pirateDifficulty", null);
        setField(term4148733, term4148733.getClass(), "karmaEvents", null);
        setField(term4148733, term4148733.getClass(), "ascensionEvents", null);
        setBooleanField(term4148733, term4148733.getClass(), "tutorialEnabled", false);
        setField(term4148733, term4148733.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4148733, term4148733.getClass(), "allNewsEnabled", false);
        setBooleanField(term4148733, term4148733.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4148733, term4148733.getClass(), "forceRedraw", false);
        setIntField(term4148733, term4148733.getClass(), "zoomLevel", 0);
        setBooleanField(term4148733, term4148733.getClass(), "generateFullGame", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "getClosetPlanetFromCoordinate", argTypes, term4148733, args);
    }

};


