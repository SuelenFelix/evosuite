package org.openRealmOfStars.game;

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
import static org.openRealmOfStars.game.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class Game_makeNewGame_1475101943193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2305069;
     Object term2305074;

    public Game_makeNewGame_1475101943193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2305069 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term2305069, term2305069.getClass(), "animationTimer", null);
        setField(term2305069, term2305069.getClass(), "musicTimer", null);
        setField(term2305069, term2305069.getClass(), "starMap", null);
        setField(term2305069, term2305069.getClass(), "players", null);
        setField(term2305069, term2305069.getClass(), "gameState", null);
        setField(term2305069, term2305069.getClass(), "previousState", null);
        setField(term2305069, term2305069.getClass(), "planetView", null);
        setField(term2305069, term2305069.getClass(), "espionageMissionView", null);
        setField(term2305069, term2305069.getClass(), "planetBombingView", null);
        setField(term2305069, term2305069.getClass(), "fleetView", null);
        setField(term2305069, term2305069.getClass(), "shipUpgradeView", null);
        setField(term2305069, term2305069.getClass(), "fleetTradeView", null);
        setField(term2305069, term2305069.getClass(), "mainMenu", null);
        setField(term2305069, term2305069.getClass(), "galaxyCreationView", null);
        setField(term2305069, term2305069.getClass(), "saveGameView", null);
        setField(term2305069, term2305069.getClass(), "helpView", null);
        setField(term2305069, term2305069.getClass(), "loadGameView", null);
        setField(term2305069, term2305069.getClass(), "aiTurnView", null);
        setField(term2305069, term2305069.getClass(), "creditsView", null);
        setField(term2305069, term2305069.getClass(), "endGameView", null);
        setField(term2305069, term2305069.getClass(), "starMapView", null);
        setField(term2305069, term2305069.getClass(), "combatView", null);
        setField(term2305069, term2305069.getClass(), "researchView", null);
        setField(term2305069, term2305069.getClass(), "diplomacyView", null);
        setField(term2305069, term2305069.getClass(), "shipView", null);
        setField(term2305069, term2305069.getClass(), "statView", null);
        setField(term2305069, term2305069.getClass(), "voteView", null);
        setField(term2305069, term2305069.getClass(), "shipDesignView", null);
        setField(term2305069, term2305069.getClass(), "galaxyConfig", null);
        setField(term2305069, term2305069.getClass(), "newsCorpView", null);
        setField(term2305069, term2305069.getClass(), "espionageView", null);
        setField(term2305069, term2305069.getClass(), "historyView", null);
        setField(term2305069, term2305069.getClass(), "optionsView", null);
        setField(term2305069, term2305069.getClass(), "realmView", null);
        setField(term2305069, term2305069.getClass(), "leaderView", null);
        setField(term2305069, term2305069.getClass(), "planetListView", null);
        setField(term2305069, term2305069.getClass(), "ambientLightsView", null);
        setField(term2305069, term2305069.getClass(), "votingSelectionView", null);
        setField(term2305069, term2305069.getClass(), "storyView", null);
        setField(term2305069, term2305069.getClass(), "endStoryView", null);
        setField(term2305069, term2305069.getClass(), "realmSetupView", null);
        setField(term2305069, term2305069.getClass(), "aiRealmSetupView", null);
        setField(term2305069, term2305069.getClass(), "governmentEditorView", null);
        setField(term2305069, term2305069.getClass(), "spaceRaceEditorView", null);
        setField(term2305069, term2305069.getClass(), "changeMessage", null);
        setField(term2305069, term2305069.getClass(), "gameFrame", null);
        setField(term2305069, term2305069.getClass(), "layeredPane", null);
        setField(term2305069, term2305069.getClass(), "configFile", null);
        setBooleanField(term2305069, term2305069.getClass(), "showMiniMapFlag", false);
        setField(term2305069, term2305069.getClass(), "saveFilename", null);
        setField(term2305069, term2305069.getClass(), "bridge", null);
        setBooleanField(term2305069, term2305069.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term2305069, term2305069.getClass(), "fullscreenMode", false);
        setBooleanField(term2305069, term2305069.getClass(), "resolutionChanged", false);
        term2305074 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2305074;
        callMethod(klass, "makeNewGame", argTypes, term2305069, args);
    }

};


