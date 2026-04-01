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

public class StarMap_getBestNextVotingForRealm_440795900197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4180775;
     Object term4180799;
     Object term4180801;
     Object term4180803;

    public StarMap_getBestNextVotingForRealm_440795900197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4180775 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4180775, term4180775.getClass(), "maxX", 0);
        setIntField(term4180775, term4180775.getClass(), "maxY", 0);
        setField(term4180775, term4180775.getClass(), "tiles", null);
        setField(term4180775, term4180775.getClass(), "tileInfo", null);
        setField(term4180775, term4180775.getClass(), "culture", null);
        setIntField(term4180775, term4180775.getClass(), "cursorX", 0);
        setIntField(term4180775, term4180775.getClass(), "cursorY", 0);
        setIntField(term4180775, term4180775.getClass(), "drawX", 0);
        setIntField(term4180775, term4180775.getClass(), "drawY", 0);
        setField(term4180775, term4180775.getClass(), "sunList", null);
        setField(term4180775, term4180775.getClass(), "planetList", null);
        setField(term4180775, term4180775.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4180775, term4180775.getClass(), "players", null);
        setIntField(term4180775, term4180775.getClass(), "turn", 0);
        setField(term4180775, term4180775.getClass(), "fleetTiles", null);
        setIntField(term4180775, term4180775.getClass(), "aiTurnNumber", 0);
        setField(term4180775, term4180775.getClass(), "aiFleet", null);
        setField(term4180775, term4180775.getClass(), "newsCorpData", null);
        setBooleanField(term4180775, term4180775.getClass(), "debug", false);
        setIntField(term4180775, term4180775.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4180775, term4180775.getClass(), "scoreConquer", 0);
        setIntField(term4180775, term4180775.getClass(), "scoreCulture", 0);
        setIntField(term4180775, term4180775.getClass(), "scoreResearch", 0);
        setIntField(term4180775, term4180775.getClass(), "scoreDiplomacy", 0);
        setIntField(term4180775, term4180775.getClass(), "scorePopulation", 0);
        setField(term4180775, term4180775.getClass(), "history", null);
        setField(term4180775, term4180775.getClass(), "votes", null);
        setBooleanField(term4180775, term4180775.getClass(), "gameEnd", false);
        setBooleanField(term4180775, term4180775.getClass(), "humanLost", false);
        setField(term4180775, term4180775.getClass(), "pirateDifficulty", null);
        setField(term4180775, term4180775.getClass(), "karmaEvents", null);
        setField(term4180775, term4180775.getClass(), "ascensionEvents", null);
        setBooleanField(term4180775, term4180775.getClass(), "tutorialEnabled", false);
        setField(term4180775, term4180775.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4180775, term4180775.getClass(), "allNewsEnabled", false);
        setBooleanField(term4180775, term4180775.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4180775, term4180775.getClass(), "forceRedraw", false);
        setIntField(term4180775, term4180775.getClass(), "zoomLevel", 0);
        setBooleanField(term4180775, term4180775.getClass(), "generateFullGame", false);
        term4180799 = new Integer(0);
        term4180801 = new Integer(0);
        term4180803 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term4180799;
        args[2] = term4180801;
        args[3] = term4180803;
        callMethod(klass, "getBestNextVotingForRealm", argTypes, term4180775, args);
    }

};


