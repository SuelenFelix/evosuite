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

public class Game_isFullscreenMode_1784157367139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2304795;

    public Game_isFullscreenMode_1784157367139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2304795 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term2304795, term2304795.getClass(), "animationTimer", null);
        setField(term2304795, term2304795.getClass(), "musicTimer", null);
        setField(term2304795, term2304795.getClass(), "starMap", null);
        setField(term2304795, term2304795.getClass(), "players", null);
        setField(term2304795, term2304795.getClass(), "gameState", null);
        setField(term2304795, term2304795.getClass(), "previousState", null);
        setField(term2304795, term2304795.getClass(), "planetView", null);
        setField(term2304795, term2304795.getClass(), "espionageMissionView", null);
        setField(term2304795, term2304795.getClass(), "planetBombingView", null);
        setField(term2304795, term2304795.getClass(), "fleetView", null);
        setField(term2304795, term2304795.getClass(), "shipUpgradeView", null);
        setField(term2304795, term2304795.getClass(), "fleetTradeView", null);
        setField(term2304795, term2304795.getClass(), "mainMenu", null);
        setField(term2304795, term2304795.getClass(), "galaxyCreationView", null);
        setField(term2304795, term2304795.getClass(), "saveGameView", null);
        setField(term2304795, term2304795.getClass(), "helpView", null);
        setField(term2304795, term2304795.getClass(), "loadGameView", null);
        setField(term2304795, term2304795.getClass(), "aiTurnView", null);
        setField(term2304795, term2304795.getClass(), "creditsView", null);
        setField(term2304795, term2304795.getClass(), "endGameView", null);
        setField(term2304795, term2304795.getClass(), "starMapView", null);
        setField(term2304795, term2304795.getClass(), "combatView", null);
        setField(term2304795, term2304795.getClass(), "researchView", null);
        setField(term2304795, term2304795.getClass(), "diplomacyView", null);
        setField(term2304795, term2304795.getClass(), "shipView", null);
        setField(term2304795, term2304795.getClass(), "statView", null);
        setField(term2304795, term2304795.getClass(), "voteView", null);
        setField(term2304795, term2304795.getClass(), "shipDesignView", null);
        setField(term2304795, term2304795.getClass(), "galaxyConfig", null);
        setField(term2304795, term2304795.getClass(), "newsCorpView", null);
        setField(term2304795, term2304795.getClass(), "espionageView", null);
        setField(term2304795, term2304795.getClass(), "historyView", null);
        setField(term2304795, term2304795.getClass(), "optionsView", null);
        setField(term2304795, term2304795.getClass(), "realmView", null);
        setField(term2304795, term2304795.getClass(), "leaderView", null);
        setField(term2304795, term2304795.getClass(), "planetListView", null);
        setField(term2304795, term2304795.getClass(), "ambientLightsView", null);
        setField(term2304795, term2304795.getClass(), "votingSelectionView", null);
        setField(term2304795, term2304795.getClass(), "storyView", null);
        setField(term2304795, term2304795.getClass(), "endStoryView", null);
        setField(term2304795, term2304795.getClass(), "realmSetupView", null);
        setField(term2304795, term2304795.getClass(), "aiRealmSetupView", null);
        setField(term2304795, term2304795.getClass(), "governmentEditorView", null);
        setField(term2304795, term2304795.getClass(), "spaceRaceEditorView", null);
        setField(term2304795, term2304795.getClass(), "changeMessage", null);
        setField(term2304795, term2304795.getClass(), "gameFrame", null);
        setField(term2304795, term2304795.getClass(), "layeredPane", null);
        setField(term2304795, term2304795.getClass(), "configFile", null);
        setBooleanField(term2304795, term2304795.getClass(), "showMiniMapFlag", false);
        setField(term2304795, term2304795.getClass(), "saveFilename", null);
        setField(term2304795, term2304795.getClass(), "bridge", null);
        setBooleanField(term2304795, term2304795.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term2304795, term2304795.getClass(), "fullscreenMode", false);
        setBooleanField(term2304795, term2304795.getClass(), "resolutionChanged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFullscreenMode", argTypes, term2304795, args);
    }

};


