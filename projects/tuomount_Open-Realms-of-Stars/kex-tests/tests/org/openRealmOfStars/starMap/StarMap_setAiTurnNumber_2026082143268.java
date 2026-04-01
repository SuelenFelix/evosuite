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

public class StarMap_setAiTurnNumber_2026082143268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4200072;
     Object term4200096;

    public StarMap_setAiTurnNumber_2026082143268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4200072 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMap"));
        setIntField(term4200072, term4200072.getClass(), "maxX", 0);
        setIntField(term4200072, term4200072.getClass(), "maxY", 0);
        setField(term4200072, term4200072.getClass(), "tiles", null);
        setField(term4200072, term4200072.getClass(), "tileInfo", null);
        setField(term4200072, term4200072.getClass(), "culture", null);
        setIntField(term4200072, term4200072.getClass(), "cursorX", 0);
        setIntField(term4200072, term4200072.getClass(), "cursorY", 0);
        setIntField(term4200072, term4200072.getClass(), "drawX", 0);
        setIntField(term4200072, term4200072.getClass(), "drawY", 0);
        setField(term4200072, term4200072.getClass(), "sunList", null);
        setField(term4200072, term4200072.getClass(), "planetList", null);
        setField(term4200072, term4200072.getClass(), "ascensionPlanetCoordinate", null);
        setField(term4200072, term4200072.getClass(), "players", null);
        setIntField(term4200072, term4200072.getClass(), "turn", 0);
        setField(term4200072, term4200072.getClass(), "fleetTiles", null);
        setIntField(term4200072, term4200072.getClass(), "aiTurnNumber", 0);
        setField(term4200072, term4200072.getClass(), "aiFleet", null);
        setField(term4200072, term4200072.getClass(), "newsCorpData", null);
        setBooleanField(term4200072, term4200072.getClass(), "debug", false);
        setIntField(term4200072, term4200072.getClass(), "scoreVictoryTurn", 0);
        setIntField(term4200072, term4200072.getClass(), "scoreConquer", 0);
        setIntField(term4200072, term4200072.getClass(), "scoreCulture", 0);
        setIntField(term4200072, term4200072.getClass(), "scoreResearch", 0);
        setIntField(term4200072, term4200072.getClass(), "scoreDiplomacy", 0);
        setIntField(term4200072, term4200072.getClass(), "scorePopulation", 0);
        setField(term4200072, term4200072.getClass(), "history", null);
        setField(term4200072, term4200072.getClass(), "votes", null);
        setBooleanField(term4200072, term4200072.getClass(), "gameEnd", false);
        setBooleanField(term4200072, term4200072.getClass(), "humanLost", false);
        setField(term4200072, term4200072.getClass(), "pirateDifficulty", null);
        setField(term4200072, term4200072.getClass(), "karmaEvents", null);
        setField(term4200072, term4200072.getClass(), "ascensionEvents", null);
        setBooleanField(term4200072, term4200072.getClass(), "tutorialEnabled", false);
        setField(term4200072, term4200072.getClass(), "shownTutorialIndexes", null);
        setBooleanField(term4200072, term4200072.getClass(), "allNewsEnabled", false);
        setBooleanField(term4200072, term4200072.getClass(), "aiOrAutomateTakingMoves", false);
        setBooleanField(term4200072, term4200072.getClass(), "forceRedraw", false);
        setIntField(term4200072, term4200072.getClass(), "zoomLevel", 0);
        setBooleanField(term4200072, term4200072.getClass(), "generateFullGame", false);
        term4200096 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4200096;
        callMethod(klass, "setAiTurnNumber", argTypes, term4200072, args);
    }

};


