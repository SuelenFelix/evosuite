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

public class StarMap_defineKarmaEvents_1688398138209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4198592;
     Object term4198616;

    public StarMap_defineKarmaEvents_1688398138209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4198592 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4198592, term4198592.getClass(), "maxX", 0);
        setIntField(term4198592, term4198592.getClass(), "maxY", 0);
        setField(term4198592, term4198592.getClass(), "tiles", null);
        setField(term4198592, term4198592.getClass(), "tileInfo", null);
        setField(term4198592, term4198592.getClass(), "culture", null);
        setIntField(term4198592, term4198592.getClass(), "cursorX", 0);
        setIntField(term4198592, term4198592.getClass(), "cursorY", 0);
        setIntField(term4198592, term4198592.getClass(), "drawX", 0);
        setIntField(term4198592, term4198592.getClass(), "drawY", 0);
        setField(term4198592, term4198592.getClass(), "sunList", null);
        setField(term4198592, term4198592.getClass(), "planetList", null);
        setField(term4198592, term4198592.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4198592, term4198592.getClass(), "players", null);
        setIntField(term4198592, term4198592.getClass(), "turn", 0);
        setField(term4198592, term4198592.getClass(), "fleetTiles", null);
        setIntField(term4198592, term4198592.getClass(), "aiTurnNumber", 0);
        setField(term4198592, term4198592.getClass(), "aiFleet", null);
        setField(term4198592, term4198592.getClass(), "newsCorpData", null);
        setBooleanField(term4198592, term4198592.getClass(), "debug", false);
        setIntField(term4198592, term4198592.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4198592, term4198592.getClass(), "scoreConquer", 0);
        setIntField(term4198592, term4198592.getClass(), "scoreCulture", 0);
        setIntField(term4198592, term4198592.getClass(), "scoreResearch", 0);
        setIntField(term4198592, term4198592.getClass(), "scoreDiplomacy", 0);
        setIntField(term4198592, term4198592.getClass(), "scorePopulation", 0);
        setField(term4198592, term4198592.getClass(), "history", null);
        setField(term4198592, term4198592.getClass(), "votes", null);
        setBooleanField(term4198592, term4198592.getClass(), "gameEnd", false);
        setBooleanField(term4198592, term4198592.getClass(), "humanLost", false);
        setField(term4198592, term4198592.getClass(), "pirateDifficulty", null);
        setField(term4198592, term4198592.getClass(), "karmaEvents", null);
        setField(term4198592, term4198592.getClass(), "ascensionEvents", null);
        setBooleanField(term4198592, term4198592.getClass(), "tutorialEnabled", false);
        setField(term4198592, term4198592.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4198592, term4198592.getClass(), "allNewsEnabled", false);
        setBooleanField(term4198592, term4198592.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4198592, term4198592.getClass(), "forceRedraw", false);
        setIntField(term4198592, term4198592.getClass(), "zoomLevel", 0);
        setBooleanField(term4198592, term4198592.getClass(), "generateFullGame", false);
        term4198616 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.event.karmaEvents.KarmaType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term4198616;
        callMethod(klass, "defineKarmaEvents", argTypes, term4198592, args);
    }

};


