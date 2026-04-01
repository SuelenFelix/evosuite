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

public class Game_actionPerformed_165601534219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2305205;

    public Game_actionPerformed_165601534219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2305205 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term2305205, term2305205.getClass(), "animationTimer", null);
        setField(term2305205, term2305205.getClass(), "musicTimer", null);
        setField(term2305205, term2305205.getClass(), "starMap", null);
        setField(term2305205, term2305205.getClass(), "players", null);
        setField(term2305205, term2305205.getClass(), "gameState", null);
        setField(term2305205, term2305205.getClass(), "previousState", null);
        setField(term2305205, term2305205.getClass(), "planetView", null);
        setField(term2305205, term2305205.getClass(), "espionageMissionView", null);
        setField(term2305205, term2305205.getClass(), "planetBombingView", null);
        setField(term2305205, term2305205.getClass(), "fleetView", null);
        setField(term2305205, term2305205.getClass(), "shipUpgradeView", null);
        setField(term2305205, term2305205.getClass(), "fleetTradeView", null);
        setField(term2305205, term2305205.getClass(), "mainMenu", null);
        setField(term2305205, term2305205.getClass(), "galaxyCreationView", null);
        setField(term2305205, term2305205.getClass(), "saveGameView", null);
        setField(term2305205, term2305205.getClass(), "helpView", null);
        setField(term2305205, term2305205.getClass(), "loadGameView", null);
        setField(term2305205, term2305205.getClass(), "aiTurnView", null);
        setField(term2305205, term2305205.getClass(), "creditsView", null);
        setField(term2305205, term2305205.getClass(), "endGameView", null);
        setField(term2305205, term2305205.getClass(), "starMapView", null);
        setField(term2305205, term2305205.getClass(), "combatView", null);
        setField(term2305205, term2305205.getClass(), "researchView", null);
        setField(term2305205, term2305205.getClass(), "diplomacyView", null);
        setField(term2305205, term2305205.getClass(), "shipView", null);
        setField(term2305205, term2305205.getClass(), "statView", null);
        setField(term2305205, term2305205.getClass(), "voteView", null);
        setField(term2305205, term2305205.getClass(), "shipDesignView", null);
        setField(term2305205, term2305205.getClass(), "galaxyConfig", null);
        setField(term2305205, term2305205.getClass(), "newsCorpView", null);
        setField(term2305205, term2305205.getClass(), "espionageView", null);
        setField(term2305205, term2305205.getClass(), "historyView", null);
        setField(term2305205, term2305205.getClass(), "optionsView", null);
        setField(term2305205, term2305205.getClass(), "realmView", null);
        setField(term2305205, term2305205.getClass(), "leaderView", null);
        setField(term2305205, term2305205.getClass(), "planetListView", null);
        setField(term2305205, term2305205.getClass(), "ambientLightsView", null);
        setField(term2305205, term2305205.getClass(), "votingSelectionView", null);
        setField(term2305205, term2305205.getClass(), "storyView", null);
        setField(term2305205, term2305205.getClass(), "endStoryView", null);
        setField(term2305205, term2305205.getClass(), "realmSetupView", null);
        setField(term2305205, term2305205.getClass(), "aiRealmSetupView", null);
        setField(term2305205, term2305205.getClass(), "governmentEditorView", null);
        setField(term2305205, term2305205.getClass(), "spaceRaceEditorView", null);
        setField(term2305205, term2305205.getClass(), "changeMessage", null);
        setField(term2305205, term2305205.getClass(), "gameFrame", null);
        setField(term2305205, term2305205.getClass(), "layeredPane", null);
        setField(term2305205, term2305205.getClass(), "configFile", null);
        setBooleanField(term2305205, term2305205.getClass(), "showMiniMapFlag", false);
        setField(term2305205, term2305205.getClass(), "saveFilename", null);
        setField(term2305205, term2305205.getClass(), "bridge", null);
        setBooleanField(term2305205, term2305205.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term2305205, term2305205.getClass(), "fullscreenMode", false);
        setBooleanField(term2305205, term2305205.getClass(), "resolutionChanged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "actionPerformed", argTypes, term2305205, args);
    }

};


