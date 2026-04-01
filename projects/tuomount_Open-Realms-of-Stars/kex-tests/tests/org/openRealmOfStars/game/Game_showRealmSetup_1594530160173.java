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

public class Game_showRealmSetup_1594530160173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2304967;
     Object term2304972;

    public Game_showRealmSetup_1594530160173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2304967 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term2304967, term2304967.getClass(), "animationTimer", null);
        setField(term2304967, term2304967.getClass(), "musicTimer", null);
        setField(term2304967, term2304967.getClass(), "starMap", null);
        setField(term2304967, term2304967.getClass(), "players", null);
        setField(term2304967, term2304967.getClass(), "gameState", null);
        setField(term2304967, term2304967.getClass(), "previousState", null);
        setField(term2304967, term2304967.getClass(), "planetView", null);
        setField(term2304967, term2304967.getClass(), "espionageMissionView", null);
        setField(term2304967, term2304967.getClass(), "planetBombingView", null);
        setField(term2304967, term2304967.getClass(), "fleetView", null);
        setField(term2304967, term2304967.getClass(), "shipUpgradeView", null);
        setField(term2304967, term2304967.getClass(), "fleetTradeView", null);
        setField(term2304967, term2304967.getClass(), "mainMenu", null);
        setField(term2304967, term2304967.getClass(), "galaxyCreationView", null);
        setField(term2304967, term2304967.getClass(), "saveGameView", null);
        setField(term2304967, term2304967.getClass(), "helpView", null);
        setField(term2304967, term2304967.getClass(), "loadGameView", null);
        setField(term2304967, term2304967.getClass(), "aiTurnView", null);
        setField(term2304967, term2304967.getClass(), "creditsView", null);
        setField(term2304967, term2304967.getClass(), "endGameView", null);
        setField(term2304967, term2304967.getClass(), "starMapView", null);
        setField(term2304967, term2304967.getClass(), "combatView", null);
        setField(term2304967, term2304967.getClass(), "researchView", null);
        setField(term2304967, term2304967.getClass(), "diplomacyView", null);
        setField(term2304967, term2304967.getClass(), "shipView", null);
        setField(term2304967, term2304967.getClass(), "statView", null);
        setField(term2304967, term2304967.getClass(), "voteView", null);
        setField(term2304967, term2304967.getClass(), "shipDesignView", null);
        setField(term2304967, term2304967.getClass(), "galaxyConfig", null);
        setField(term2304967, term2304967.getClass(), "newsCorpView", null);
        setField(term2304967, term2304967.getClass(), "espionageView", null);
        setField(term2304967, term2304967.getClass(), "historyView", null);
        setField(term2304967, term2304967.getClass(), "optionsView", null);
        setField(term2304967, term2304967.getClass(), "realmView", null);
        setField(term2304967, term2304967.getClass(), "leaderView", null);
        setField(term2304967, term2304967.getClass(), "planetListView", null);
        setField(term2304967, term2304967.getClass(), "ambientLightsView", null);
        setField(term2304967, term2304967.getClass(), "votingSelectionView", null);
        setField(term2304967, term2304967.getClass(), "storyView", null);
        setField(term2304967, term2304967.getClass(), "endStoryView", null);
        setField(term2304967, term2304967.getClass(), "realmSetupView", null);
        setField(term2304967, term2304967.getClass(), "aiRealmSetupView", null);
        setField(term2304967, term2304967.getClass(), "governmentEditorView", null);
        setField(term2304967, term2304967.getClass(), "spaceRaceEditorView", null);
        setField(term2304967, term2304967.getClass(), "changeMessage", null);
        setField(term2304967, term2304967.getClass(), "gameFrame", null);
        setField(term2304967, term2304967.getClass(), "layeredPane", null);
        setField(term2304967, term2304967.getClass(), "configFile", null);
        setBooleanField(term2304967, term2304967.getClass(), "showMiniMapFlag", false);
        setField(term2304967, term2304967.getClass(), "saveFilename", null);
        setField(term2304967, term2304967.getClass(), "bridge", null);
        setBooleanField(term2304967, term2304967.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term2304967, term2304967.getClass(), "fullscreenMode", false);
        setBooleanField(term2304967, term2304967.getClass(), "resolutionChanged", false);
        term2304972 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2304972;
        callMethod(klass, "showRealmSetup", argTypes, term2304967, args);
    }

};


