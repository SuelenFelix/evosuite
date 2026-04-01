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

public class Game_getPreviousState_1452629676237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2305297;

    public Game_getPreviousState_1452629676237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2305297 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term2305297, term2305297.getClass(), "animationTimer", null);
        setField(term2305297, term2305297.getClass(), "musicTimer", null);
        setField(term2305297, term2305297.getClass(), "starMap", null);
        setField(term2305297, term2305297.getClass(), "players", null);
        setField(term2305297, term2305297.getClass(), "gameState", null);
        setField(term2305297, term2305297.getClass(), "previousState", null);
        setField(term2305297, term2305297.getClass(), "planetView", null);
        setField(term2305297, term2305297.getClass(), "espionageMissionView", null);
        setField(term2305297, term2305297.getClass(), "planetBombingView", null);
        setField(term2305297, term2305297.getClass(), "fleetView", null);
        setField(term2305297, term2305297.getClass(), "shipUpgradeView", null);
        setField(term2305297, term2305297.getClass(), "fleetTradeView", null);
        setField(term2305297, term2305297.getClass(), "mainMenu", null);
        setField(term2305297, term2305297.getClass(), "galaxyCreationView", null);
        setField(term2305297, term2305297.getClass(), "saveGameView", null);
        setField(term2305297, term2305297.getClass(), "helpView", null);
        setField(term2305297, term2305297.getClass(), "loadGameView", null);
        setField(term2305297, term2305297.getClass(), "aiTurnView", null);
        setField(term2305297, term2305297.getClass(), "creditsView", null);
        setField(term2305297, term2305297.getClass(), "endGameView", null);
        setField(term2305297, term2305297.getClass(), "starMapView", null);
        setField(term2305297, term2305297.getClass(), "combatView", null);
        setField(term2305297, term2305297.getClass(), "researchView", null);
        setField(term2305297, term2305297.getClass(), "diplomacyView", null);
        setField(term2305297, term2305297.getClass(), "shipView", null);
        setField(term2305297, term2305297.getClass(), "statView", null);
        setField(term2305297, term2305297.getClass(), "voteView", null);
        setField(term2305297, term2305297.getClass(), "shipDesignView", null);
        setField(term2305297, term2305297.getClass(), "galaxyConfig", null);
        setField(term2305297, term2305297.getClass(), "newsCorpView", null);
        setField(term2305297, term2305297.getClass(), "espionageView", null);
        setField(term2305297, term2305297.getClass(), "historyView", null);
        setField(term2305297, term2305297.getClass(), "optionsView", null);
        setField(term2305297, term2305297.getClass(), "realmView", null);
        setField(term2305297, term2305297.getClass(), "leaderView", null);
        setField(term2305297, term2305297.getClass(), "planetListView", null);
        setField(term2305297, term2305297.getClass(), "ambientLightsView", null);
        setField(term2305297, term2305297.getClass(), "votingSelectionView", null);
        setField(term2305297, term2305297.getClass(), "storyView", null);
        setField(term2305297, term2305297.getClass(), "endStoryView", null);
        setField(term2305297, term2305297.getClass(), "realmSetupView", null);
        setField(term2305297, term2305297.getClass(), "aiRealmSetupView", null);
        setField(term2305297, term2305297.getClass(), "governmentEditorView", null);
        setField(term2305297, term2305297.getClass(), "spaceRaceEditorView", null);
        setField(term2305297, term2305297.getClass(), "changeMessage", null);
        setField(term2305297, term2305297.getClass(), "gameFrame", null);
        setField(term2305297, term2305297.getClass(), "layeredPane", null);
        setField(term2305297, term2305297.getClass(), "configFile", null);
        setBooleanField(term2305297, term2305297.getClass(), "showMiniMapFlag", false);
        setField(term2305297, term2305297.getClass(), "saveFilename", null);
        setField(term2305297, term2305297.getClass(), "bridge", null);
        setBooleanField(term2305297, term2305297.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term2305297, term2305297.getClass(), "fullscreenMode", false);
        setBooleanField(term2305297, term2305297.getClass(), "resolutionChanged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPreviousState", argTypes, term2305297, args);
    }

};


