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

public class Game_getConflictingFleet_126756150312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1989974;
     Object term1989979;
     Object term1989981;

    public Game_getConflictingFleet_126756150312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1989974 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term1989974, term1989974.getClass(), "animationTimer", null);
        setField(term1989974, term1989974.getClass(), "musicTimer", null);
        setField(term1989974, term1989974.getClass(), "starMap", null);
        setField(term1989974, term1989974.getClass(), "players", null);
        setField(term1989974, term1989974.getClass(), "gameState", null);
        setField(term1989974, term1989974.getClass(), "previousState", null);
        setField(term1989974, term1989974.getClass(), "planetView", null);
        setField(term1989974, term1989974.getClass(), "espionageMissionView", null);
        setField(term1989974, term1989974.getClass(), "planetBombingView", null);
        setField(term1989974, term1989974.getClass(), "fleetView", null);
        setField(term1989974, term1989974.getClass(), "shipUpgradeView", null);
        setField(term1989974, term1989974.getClass(), "fleetTradeView", null);
        setField(term1989974, term1989974.getClass(), "mainMenu", null);
        setField(term1989974, term1989974.getClass(), "galaxyCreationView", null);
        setField(term1989974, term1989974.getClass(), "saveGameView", null);
        setField(term1989974, term1989974.getClass(), "helpView", null);
        setField(term1989974, term1989974.getClass(), "loadGameView", null);
        setField(term1989974, term1989974.getClass(), "aiTurnView", null);
        setField(term1989974, term1989974.getClass(), "creditsView", null);
        setField(term1989974, term1989974.getClass(), "endGameView", null);
        setField(term1989974, term1989974.getClass(), "starMapView", null);
        setField(term1989974, term1989974.getClass(), "combatView", null);
        setField(term1989974, term1989974.getClass(), "researchView", null);
        setField(term1989974, term1989974.getClass(), "diplomacyView", null);
        setField(term1989974, term1989974.getClass(), "shipView", null);
        setField(term1989974, term1989974.getClass(), "statView", null);
        setField(term1989974, term1989974.getClass(), "voteView", null);
        setField(term1989974, term1989974.getClass(), "shipDesignView", null);
        setField(term1989974, term1989974.getClass(), "galaxyConfig", null);
        setField(term1989974, term1989974.getClass(), "newsCorpView", null);
        setField(term1989974, term1989974.getClass(), "espionageView", null);
        setField(term1989974, term1989974.getClass(), "historyView", null);
        setField(term1989974, term1989974.getClass(), "optionsView", null);
        setField(term1989974, term1989974.getClass(), "realmView", null);
        setField(term1989974, term1989974.getClass(), "leaderView", null);
        setField(term1989974, term1989974.getClass(), "planetListView", null);
        setField(term1989974, term1989974.getClass(), "ambientLightsView", null);
        setField(term1989974, term1989974.getClass(), "votingSelectionView", null);
        setField(term1989974, term1989974.getClass(), "storyView", null);
        setField(term1989974, term1989974.getClass(), "endStoryView", null);
        setField(term1989974, term1989974.getClass(), "realmSetupView", null);
        setField(term1989974, term1989974.getClass(), "aiRealmSetupView", null);
        setField(term1989974, term1989974.getClass(), "governmentEditorView", null);
        setField(term1989974, term1989974.getClass(), "spaceRaceEditorView", null);
        setField(term1989974, term1989974.getClass(), "changeMessage", null);
        setField(term1989974, term1989974.getClass(), "gameFrame", null);
        setField(term1989974, term1989974.getClass(), "layeredPane", null);
        setField(term1989974, term1989974.getClass(), "configFile", null);
        setBooleanField(term1989974, term1989974.getClass(), "showMiniMapFlag", false);
        setField(term1989974, term1989974.getClass(), "saveFilename", null);
        setField(term1989974, term1989974.getClass(), "bridge", null);
        setBooleanField(term1989974, term1989974.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term1989974, term1989974.getClass(), "fullscreenMode", false);
        setBooleanField(term1989974, term1989974.getClass(), "resolutionChanged", false);
        term1989979 = new Integer(0);
        term1989981 = new Integer(0);
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
        args[2] = term1989979;
        args[3] = term1989981;
        callMethod(klass, "getConflictingFleet", argTypes, term1989974, args);
    }

};


