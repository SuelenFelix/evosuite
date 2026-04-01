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

public class Game_handleDoubleClicksOnStarMap_800287882213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2305175;

    public Game_handleDoubleClicksOnStarMap_800287882213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2305175 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term2305175, term2305175.getClass(), "animationTimer", null);
        setField(term2305175, term2305175.getClass(), "musicTimer", null);
        setField(term2305175, term2305175.getClass(), "starMap", null);
        setField(term2305175, term2305175.getClass(), "players", null);
        setField(term2305175, term2305175.getClass(), "gameState", null);
        setField(term2305175, term2305175.getClass(), "previousState", null);
        setField(term2305175, term2305175.getClass(), "planetView", null);
        setField(term2305175, term2305175.getClass(), "espionageMissionView", null);
        setField(term2305175, term2305175.getClass(), "planetBombingView", null);
        setField(term2305175, term2305175.getClass(), "fleetView", null);
        setField(term2305175, term2305175.getClass(), "shipUpgradeView", null);
        setField(term2305175, term2305175.getClass(), "fleetTradeView", null);
        setField(term2305175, term2305175.getClass(), "mainMenu", null);
        setField(term2305175, term2305175.getClass(), "galaxyCreationView", null);
        setField(term2305175, term2305175.getClass(), "saveGameView", null);
        setField(term2305175, term2305175.getClass(), "helpView", null);
        setField(term2305175, term2305175.getClass(), "loadGameView", null);
        setField(term2305175, term2305175.getClass(), "aiTurnView", null);
        setField(term2305175, term2305175.getClass(), "creditsView", null);
        setField(term2305175, term2305175.getClass(), "endGameView", null);
        setField(term2305175, term2305175.getClass(), "starMapView", null);
        setField(term2305175, term2305175.getClass(), "combatView", null);
        setField(term2305175, term2305175.getClass(), "researchView", null);
        setField(term2305175, term2305175.getClass(), "diplomacyView", null);
        setField(term2305175, term2305175.getClass(), "shipView", null);
        setField(term2305175, term2305175.getClass(), "statView", null);
        setField(term2305175, term2305175.getClass(), "voteView", null);
        setField(term2305175, term2305175.getClass(), "shipDesignView", null);
        setField(term2305175, term2305175.getClass(), "galaxyConfig", null);
        setField(term2305175, term2305175.getClass(), "newsCorpView", null);
        setField(term2305175, term2305175.getClass(), "espionageView", null);
        setField(term2305175, term2305175.getClass(), "historyView", null);
        setField(term2305175, term2305175.getClass(), "optionsView", null);
        setField(term2305175, term2305175.getClass(), "realmView", null);
        setField(term2305175, term2305175.getClass(), "leaderView", null);
        setField(term2305175, term2305175.getClass(), "planetListView", null);
        setField(term2305175, term2305175.getClass(), "ambientLightsView", null);
        setField(term2305175, term2305175.getClass(), "votingSelectionView", null);
        setField(term2305175, term2305175.getClass(), "storyView", null);
        setField(term2305175, term2305175.getClass(), "endStoryView", null);
        setField(term2305175, term2305175.getClass(), "realmSetupView", null);
        setField(term2305175, term2305175.getClass(), "aiRealmSetupView", null);
        setField(term2305175, term2305175.getClass(), "governmentEditorView", null);
        setField(term2305175, term2305175.getClass(), "spaceRaceEditorView", null);
        setField(term2305175, term2305175.getClass(), "changeMessage", null);
        setField(term2305175, term2305175.getClass(), "gameFrame", null);
        setField(term2305175, term2305175.getClass(), "layeredPane", null);
        setField(term2305175, term2305175.getClass(), "configFile", null);
        setBooleanField(term2305175, term2305175.getClass(), "showMiniMapFlag", false);
        setField(term2305175, term2305175.getClass(), "saveFilename", null);
        setField(term2305175, term2305175.getClass(), "bridge", null);
        setBooleanField(term2305175, term2305175.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term2305175, term2305175.getClass(), "fullscreenMode", false);
        setBooleanField(term2305175, term2305175.getClass(), "resolutionChanged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "handleDoubleClicksOnStarMap", argTypes, term2305175, args);
    }

};


