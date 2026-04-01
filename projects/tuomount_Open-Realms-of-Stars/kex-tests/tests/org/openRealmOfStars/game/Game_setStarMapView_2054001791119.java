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

public class Game_setStarMapView_2054001791119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2264899;

    public Game_setStarMapView_2054001791119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2264899 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term2264899, term2264899.getClass(), "animationTimer", null);
        setField(term2264899, term2264899.getClass(), "musicTimer", null);
        setField(term2264899, term2264899.getClass(), "starMap", null);
        setField(term2264899, term2264899.getClass(), "players", null);
        setField(term2264899, term2264899.getClass(), "gameState", null);
        setField(term2264899, term2264899.getClass(), "previousState", null);
        setField(term2264899, term2264899.getClass(), "planetView", null);
        setField(term2264899, term2264899.getClass(), "espionageMissionView", null);
        setField(term2264899, term2264899.getClass(), "planetBombingView", null);
        setField(term2264899, term2264899.getClass(), "fleetView", null);
        setField(term2264899, term2264899.getClass(), "shipUpgradeView", null);
        setField(term2264899, term2264899.getClass(), "fleetTradeView", null);
        setField(term2264899, term2264899.getClass(), "mainMenu", null);
        setField(term2264899, term2264899.getClass(), "galaxyCreationView", null);
        setField(term2264899, term2264899.getClass(), "saveGameView", null);
        setField(term2264899, term2264899.getClass(), "helpView", null);
        setField(term2264899, term2264899.getClass(), "loadGameView", null);
        setField(term2264899, term2264899.getClass(), "aiTurnView", null);
        setField(term2264899, term2264899.getClass(), "creditsView", null);
        setField(term2264899, term2264899.getClass(), "endGameView", null);
        setField(term2264899, term2264899.getClass(), "starMapView", null);
        setField(term2264899, term2264899.getClass(), "combatView", null);
        setField(term2264899, term2264899.getClass(), "researchView", null);
        setField(term2264899, term2264899.getClass(), "diplomacyView", null);
        setField(term2264899, term2264899.getClass(), "shipView", null);
        setField(term2264899, term2264899.getClass(), "statView", null);
        setField(term2264899, term2264899.getClass(), "voteView", null);
        setField(term2264899, term2264899.getClass(), "shipDesignView", null);
        setField(term2264899, term2264899.getClass(), "galaxyConfig", null);
        setField(term2264899, term2264899.getClass(), "newsCorpView", null);
        setField(term2264899, term2264899.getClass(), "espionageView", null);
        setField(term2264899, term2264899.getClass(), "historyView", null);
        setField(term2264899, term2264899.getClass(), "optionsView", null);
        setField(term2264899, term2264899.getClass(), "realmView", null);
        setField(term2264899, term2264899.getClass(), "leaderView", null);
        setField(term2264899, term2264899.getClass(), "planetListView", null);
        setField(term2264899, term2264899.getClass(), "ambientLightsView", null);
        setField(term2264899, term2264899.getClass(), "votingSelectionView", null);
        setField(term2264899, term2264899.getClass(), "storyView", null);
        setField(term2264899, term2264899.getClass(), "endStoryView", null);
        setField(term2264899, term2264899.getClass(), "realmSetupView", null);
        setField(term2264899, term2264899.getClass(), "aiRealmSetupView", null);
        setField(term2264899, term2264899.getClass(), "governmentEditorView", null);
        setField(term2264899, term2264899.getClass(), "spaceRaceEditorView", null);
        setField(term2264899, term2264899.getClass(), "changeMessage", null);
        setField(term2264899, term2264899.getClass(), "gameFrame", null);
        setField(term2264899, term2264899.getClass(), "layeredPane", null);
        setField(term2264899, term2264899.getClass(), "configFile", null);
        setBooleanField(term2264899, term2264899.getClass(), "showMiniMapFlag", false);
        setField(term2264899, term2264899.getClass(), "saveFilename", null);
        setField(term2264899, term2264899.getClass(), "bridge", null);
        setBooleanField(term2264899, term2264899.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term2264899, term2264899.getClass(), "fullscreenMode", false);
        setBooleanField(term2264899, term2264899.getClass(), "resolutionChanged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.game.state.StarMapView");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setStarMapView", argTypes, term2264899, args);
    }

};


