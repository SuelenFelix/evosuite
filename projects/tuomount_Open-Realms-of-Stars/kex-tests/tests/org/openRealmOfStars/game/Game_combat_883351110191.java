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

public class Game_combat_883351110191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2305059;

    public Game_combat_883351110191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2305059 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term2305059, term2305059.getClass(), "animationTimer", null);
        setField(term2305059, term2305059.getClass(), "musicTimer", null);
        setField(term2305059, term2305059.getClass(), "starMap", null);
        setField(term2305059, term2305059.getClass(), "players", null);
        setField(term2305059, term2305059.getClass(), "gameState", null);
        setField(term2305059, term2305059.getClass(), "previousState", null);
        setField(term2305059, term2305059.getClass(), "planetView", null);
        setField(term2305059, term2305059.getClass(), "espionageMissionView", null);
        setField(term2305059, term2305059.getClass(), "planetBombingView", null);
        setField(term2305059, term2305059.getClass(), "fleetView", null);
        setField(term2305059, term2305059.getClass(), "shipUpgradeView", null);
        setField(term2305059, term2305059.getClass(), "fleetTradeView", null);
        setField(term2305059, term2305059.getClass(), "mainMenu", null);
        setField(term2305059, term2305059.getClass(), "galaxyCreationView", null);
        setField(term2305059, term2305059.getClass(), "saveGameView", null);
        setField(term2305059, term2305059.getClass(), "helpView", null);
        setField(term2305059, term2305059.getClass(), "loadGameView", null);
        setField(term2305059, term2305059.getClass(), "aiTurnView", null);
        setField(term2305059, term2305059.getClass(), "creditsView", null);
        setField(term2305059, term2305059.getClass(), "endGameView", null);
        setField(term2305059, term2305059.getClass(), "starMapView", null);
        setField(term2305059, term2305059.getClass(), "combatView", null);
        setField(term2305059, term2305059.getClass(), "researchView", null);
        setField(term2305059, term2305059.getClass(), "diplomacyView", null);
        setField(term2305059, term2305059.getClass(), "shipView", null);
        setField(term2305059, term2305059.getClass(), "statView", null);
        setField(term2305059, term2305059.getClass(), "voteView", null);
        setField(term2305059, term2305059.getClass(), "shipDesignView", null);
        setField(term2305059, term2305059.getClass(), "galaxyConfig", null);
        setField(term2305059, term2305059.getClass(), "newsCorpView", null);
        setField(term2305059, term2305059.getClass(), "espionageView", null);
        setField(term2305059, term2305059.getClass(), "historyView", null);
        setField(term2305059, term2305059.getClass(), "optionsView", null);
        setField(term2305059, term2305059.getClass(), "realmView", null);
        setField(term2305059, term2305059.getClass(), "leaderView", null);
        setField(term2305059, term2305059.getClass(), "planetListView", null);
        setField(term2305059, term2305059.getClass(), "ambientLightsView", null);
        setField(term2305059, term2305059.getClass(), "votingSelectionView", null);
        setField(term2305059, term2305059.getClass(), "storyView", null);
        setField(term2305059, term2305059.getClass(), "endStoryView", null);
        setField(term2305059, term2305059.getClass(), "realmSetupView", null);
        setField(term2305059, term2305059.getClass(), "aiRealmSetupView", null);
        setField(term2305059, term2305059.getClass(), "governmentEditorView", null);
        setField(term2305059, term2305059.getClass(), "spaceRaceEditorView", null);
        setField(term2305059, term2305059.getClass(), "changeMessage", null);
        setField(term2305059, term2305059.getClass(), "gameFrame", null);
        setField(term2305059, term2305059.getClass(), "layeredPane", null);
        setField(term2305059, term2305059.getClass(), "configFile", null);
        setBooleanField(term2305059, term2305059.getClass(), "showMiniMapFlag", false);
        setField(term2305059, term2305059.getClass(), "saveFilename", null);
        setField(term2305059, term2305059.getClass(), "bridge", null);
        setBooleanField(term2305059, term2305059.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term2305059, term2305059.getClass(), "fullscreenMode", false);
        setBooleanField(term2305059, term2305059.getClass(), "resolutionChanged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "combat", argTypes, term2305059, args);
    }

};


