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

public class Game_fleetMakeMove_28115745614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1999531;
     Object term1999536;
     Object term1999538;

    public Game_fleetMakeMove_28115745614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1999531 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term1999531, term1999531.getClass(), "animationTimer", null);
        setField(term1999531, term1999531.getClass(), "musicTimer", null);
        setField(term1999531, term1999531.getClass(), "starMap", null);
        setField(term1999531, term1999531.getClass(), "players", null);
        setField(term1999531, term1999531.getClass(), "gameState", null);
        setField(term1999531, term1999531.getClass(), "previousState", null);
        setField(term1999531, term1999531.getClass(), "planetView", null);
        setField(term1999531, term1999531.getClass(), "espionageMissionView", null);
        setField(term1999531, term1999531.getClass(), "planetBombingView", null);
        setField(term1999531, term1999531.getClass(), "fleetView", null);
        setField(term1999531, term1999531.getClass(), "shipUpgradeView", null);
        setField(term1999531, term1999531.getClass(), "fleetTradeView", null);
        setField(term1999531, term1999531.getClass(), "mainMenu", null);
        setField(term1999531, term1999531.getClass(), "galaxyCreationView", null);
        setField(term1999531, term1999531.getClass(), "saveGameView", null);
        setField(term1999531, term1999531.getClass(), "helpView", null);
        setField(term1999531, term1999531.getClass(), "loadGameView", null);
        setField(term1999531, term1999531.getClass(), "aiTurnView", null);
        setField(term1999531, term1999531.getClass(), "creditsView", null);
        setField(term1999531, term1999531.getClass(), "endGameView", null);
        setField(term1999531, term1999531.getClass(), "starMapView", null);
        setField(term1999531, term1999531.getClass(), "combatView", null);
        setField(term1999531, term1999531.getClass(), "researchView", null);
        setField(term1999531, term1999531.getClass(), "diplomacyView", null);
        setField(term1999531, term1999531.getClass(), "shipView", null);
        setField(term1999531, term1999531.getClass(), "statView", null);
        setField(term1999531, term1999531.getClass(), "voteView", null);
        setField(term1999531, term1999531.getClass(), "shipDesignView", null);
        setField(term1999531, term1999531.getClass(), "galaxyConfig", null);
        setField(term1999531, term1999531.getClass(), "newsCorpView", null);
        setField(term1999531, term1999531.getClass(), "espionageView", null);
        setField(term1999531, term1999531.getClass(), "historyView", null);
        setField(term1999531, term1999531.getClass(), "optionsView", null);
        setField(term1999531, term1999531.getClass(), "realmView", null);
        setField(term1999531, term1999531.getClass(), "leaderView", null);
        setField(term1999531, term1999531.getClass(), "planetListView", null);
        setField(term1999531, term1999531.getClass(), "ambientLightsView", null);
        setField(term1999531, term1999531.getClass(), "votingSelectionView", null);
        setField(term1999531, term1999531.getClass(), "storyView", null);
        setField(term1999531, term1999531.getClass(), "endStoryView", null);
        setField(term1999531, term1999531.getClass(), "realmSetupView", null);
        setField(term1999531, term1999531.getClass(), "aiRealmSetupView", null);
        setField(term1999531, term1999531.getClass(), "governmentEditorView", null);
        setField(term1999531, term1999531.getClass(), "spaceRaceEditorView", null);
        setField(term1999531, term1999531.getClass(), "changeMessage", null);
        setField(term1999531, term1999531.getClass(), "gameFrame", null);
        setField(term1999531, term1999531.getClass(), "layeredPane", null);
        setField(term1999531, term1999531.getClass(), "configFile", null);
        setBooleanField(term1999531, term1999531.getClass(), "showMiniMapFlag", false);
        setField(term1999531, term1999531.getClass(), "saveFilename", null);
        setField(term1999531, term1999531.getClass(), "bridge", null);
        setBooleanField(term1999531, term1999531.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term1999531, term1999531.getClass(), "fullscreenMode", false);
        setBooleanField(term1999531, term1999531.getClass(), "resolutionChanged", false);
        term1999536 = new Integer(0);
        term1999538 = new Integer(0);
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
        args[2] = term1999536;
        args[3] = term1999538;
        callMethod(klass, "fleetMakeMove", argTypes, term1999531, args);
    }

};


