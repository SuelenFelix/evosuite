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

public class Game_main_192357689205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2305133;

    public Game_main_192357689205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2305133 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term2305133, term2305133.getClass(), "animationTimer", null);
        setField(term2305133, term2305133.getClass(), "musicTimer", null);
        setField(term2305133, term2305133.getClass(), "starMap", null);
        setField(term2305133, term2305133.getClass(), "players", null);
        setField(term2305133, term2305133.getClass(), "gameState", null);
        setField(term2305133, term2305133.getClass(), "previousState", null);
        setField(term2305133, term2305133.getClass(), "planetView", null);
        setField(term2305133, term2305133.getClass(), "espionageMissionView", null);
        setField(term2305133, term2305133.getClass(), "planetBombingView", null);
        setField(term2305133, term2305133.getClass(), "fleetView", null);
        setField(term2305133, term2305133.getClass(), "shipUpgradeView", null);
        setField(term2305133, term2305133.getClass(), "fleetTradeView", null);
        setField(term2305133, term2305133.getClass(), "mainMenu", null);
        setField(term2305133, term2305133.getClass(), "galaxyCreationView", null);
        setField(term2305133, term2305133.getClass(), "saveGameView", null);
        setField(term2305133, term2305133.getClass(), "helpView", null);
        setField(term2305133, term2305133.getClass(), "loadGameView", null);
        setField(term2305133, term2305133.getClass(), "aiTurnView", null);
        setField(term2305133, term2305133.getClass(), "creditsView", null);
        setField(term2305133, term2305133.getClass(), "endGameView", null);
        setField(term2305133, term2305133.getClass(), "starMapView", null);
        setField(term2305133, term2305133.getClass(), "combatView", null);
        setField(term2305133, term2305133.getClass(), "researchView", null);
        setField(term2305133, term2305133.getClass(), "diplomacyView", null);
        setField(term2305133, term2305133.getClass(), "shipView", null);
        setField(term2305133, term2305133.getClass(), "statView", null);
        setField(term2305133, term2305133.getClass(), "voteView", null);
        setField(term2305133, term2305133.getClass(), "shipDesignView", null);
        setField(term2305133, term2305133.getClass(), "galaxyConfig", null);
        setField(term2305133, term2305133.getClass(), "newsCorpView", null);
        setField(term2305133, term2305133.getClass(), "espionageView", null);
        setField(term2305133, term2305133.getClass(), "historyView", null);
        setField(term2305133, term2305133.getClass(), "optionsView", null);
        setField(term2305133, term2305133.getClass(), "realmView", null);
        setField(term2305133, term2305133.getClass(), "leaderView", null);
        setField(term2305133, term2305133.getClass(), "planetListView", null);
        setField(term2305133, term2305133.getClass(), "ambientLightsView", null);
        setField(term2305133, term2305133.getClass(), "votingSelectionView", null);
        setField(term2305133, term2305133.getClass(), "storyView", null);
        setField(term2305133, term2305133.getClass(), "endStoryView", null);
        setField(term2305133, term2305133.getClass(), "realmSetupView", null);
        setField(term2305133, term2305133.getClass(), "aiRealmSetupView", null);
        setField(term2305133, term2305133.getClass(), "governmentEditorView", null);
        setField(term2305133, term2305133.getClass(), "spaceRaceEditorView", null);
        setField(term2305133, term2305133.getClass(), "changeMessage", null);
        setField(term2305133, term2305133.getClass(), "gameFrame", null);
        setField(term2305133, term2305133.getClass(), "layeredPane", null);
        setField(term2305133, term2305133.getClass(), "configFile", null);
        setBooleanField(term2305133, term2305133.getClass(), "showMiniMapFlag", false);
        setField(term2305133, term2305133.getClass(), "saveFilename", null);
        setField(term2305133, term2305133.getClass(), "bridge", null);
        setBooleanField(term2305133, term2305133.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term2305133, term2305133.getClass(), "fullscreenMode", false);
        setBooleanField(term2305133, term2305133.getClass(), "resolutionChanged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "main", argTypes, term2305133, args);
    }

};


