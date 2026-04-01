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
import java.lang.Integer;

public class Game_getConflictingRealm_111553299010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1980062;
     Object term1980067;
     Object term1980069;

    public Game_getConflictingRealm_111553299010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1980062 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term1980062, term1980062.getClass(), "animationTimer", null);
        setField(term1980062, term1980062.getClass(), "musicTimer", null);
        setField(term1980062, term1980062.getClass(), "starMap", null);
        setField(term1980062, term1980062.getClass(), "players", null);
        setField(term1980062, term1980062.getClass(), "gameState", null);
        setField(term1980062, term1980062.getClass(), "previousState", null);
        setField(term1980062, term1980062.getClass(), "planetView", null);
        setField(term1980062, term1980062.getClass(), "espionageMissionView", null);
        setField(term1980062, term1980062.getClass(), "planetBombingView", null);
        setField(term1980062, term1980062.getClass(), "fleetView", null);
        setField(term1980062, term1980062.getClass(), "shipUpgradeView", null);
        setField(term1980062, term1980062.getClass(), "fleetTradeView", null);
        setField(term1980062, term1980062.getClass(), "mainMenu", null);
        setField(term1980062, term1980062.getClass(), "galaxyCreationView", null);
        setField(term1980062, term1980062.getClass(), "saveGameView", null);
        setField(term1980062, term1980062.getClass(), "helpView", null);
        setField(term1980062, term1980062.getClass(), "loadGameView", null);
        setField(term1980062, term1980062.getClass(), "aiTurnView", null);
        setField(term1980062, term1980062.getClass(), "creditsView", null);
        setField(term1980062, term1980062.getClass(), "endGameView", null);
        setField(term1980062, term1980062.getClass(), "starMapView", null);
        setField(term1980062, term1980062.getClass(), "combatView", null);
        setField(term1980062, term1980062.getClass(), "researchView", null);
        setField(term1980062, term1980062.getClass(), "diplomacyView", null);
        setField(term1980062, term1980062.getClass(), "shipView", null);
        setField(term1980062, term1980062.getClass(), "statView", null);
        setField(term1980062, term1980062.getClass(), "voteView", null);
        setField(term1980062, term1980062.getClass(), "shipDesignView", null);
        setField(term1980062, term1980062.getClass(), "galaxyConfig", null);
        setField(term1980062, term1980062.getClass(), "newsCorpView", null);
        setField(term1980062, term1980062.getClass(), "espionageView", null);
        setField(term1980062, term1980062.getClass(), "historyView", null);
        setField(term1980062, term1980062.getClass(), "optionsView", null);
        setField(term1980062, term1980062.getClass(), "realmView", null);
        setField(term1980062, term1980062.getClass(), "leaderView", null);
        setField(term1980062, term1980062.getClass(), "planetListView", null);
        setField(term1980062, term1980062.getClass(), "ambientLightsView", null);
        setField(term1980062, term1980062.getClass(), "votingSelectionView", null);
        setField(term1980062, term1980062.getClass(), "storyView", null);
        setField(term1980062, term1980062.getClass(), "endStoryView", null);
        setField(term1980062, term1980062.getClass(), "realmSetupView", null);
        setField(term1980062, term1980062.getClass(), "aiRealmSetupView", null);
        setField(term1980062, term1980062.getClass(), "governmentEditorView", null);
        setField(term1980062, term1980062.getClass(), "spaceRaceEditorView", null);
        setField(term1980062, term1980062.getClass(), "changeMessage", null);
        setField(term1980062, term1980062.getClass(), "gameFrame", null);
        setField(term1980062, term1980062.getClass(), "layeredPane", null);
        setField(term1980062, term1980062.getClass(), "configFile", null);
        setBooleanField(term1980062, term1980062.getClass(), "showMiniMapFlag", false);
        setField(term1980062, term1980062.getClass(), "saveFilename", null);
        setField(term1980062, term1980062.getClass(), "bridge", null);
        setBooleanField(term1980062, term1980062.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term1980062, term1980062.getClass(), "fullscreenMode", false);
        setBooleanField(term1980062, term1980062.getClass(), "resolutionChanged", false);
        term1980067 = new Integer(0);
        term1980069 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term1980067;
        args[3] = term1980069;
        callMethod(klass, "getConflictingRealm", argTypes, term1980062, args);
    }

};


