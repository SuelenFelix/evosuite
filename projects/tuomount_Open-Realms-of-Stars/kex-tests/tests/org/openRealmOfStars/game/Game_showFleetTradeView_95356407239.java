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

public class Game_showFleetTradeView_95356407239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2090621;

    public Game_showFleetTradeView_95356407239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2090621 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term2090621, term2090621.getClass(), "animationTimer", null);
        setField(term2090621, term2090621.getClass(), "musicTimer", null);
        setField(term2090621, term2090621.getClass(), "starMap", null);
        setField(term2090621, term2090621.getClass(), "players", null);
        setField(term2090621, term2090621.getClass(), "gameState", null);
        setField(term2090621, term2090621.getClass(), "previousState", null);
        setField(term2090621, term2090621.getClass(), "planetView", null);
        setField(term2090621, term2090621.getClass(), "espionageMissionView", null);
        setField(term2090621, term2090621.getClass(), "planetBombingView", null);
        setField(term2090621, term2090621.getClass(), "fleetView", null);
        setField(term2090621, term2090621.getClass(), "shipUpgradeView", null);
        setField(term2090621, term2090621.getClass(), "fleetTradeView", null);
        setField(term2090621, term2090621.getClass(), "mainMenu", null);
        setField(term2090621, term2090621.getClass(), "galaxyCreationView", null);
        setField(term2090621, term2090621.getClass(), "saveGameView", null);
        setField(term2090621, term2090621.getClass(), "helpView", null);
        setField(term2090621, term2090621.getClass(), "loadGameView", null);
        setField(term2090621, term2090621.getClass(), "aiTurnView", null);
        setField(term2090621, term2090621.getClass(), "creditsView", null);
        setField(term2090621, term2090621.getClass(), "endGameView", null);
        setField(term2090621, term2090621.getClass(), "starMapView", null);
        setField(term2090621, term2090621.getClass(), "combatView", null);
        setField(term2090621, term2090621.getClass(), "researchView", null);
        setField(term2090621, term2090621.getClass(), "diplomacyView", null);
        setField(term2090621, term2090621.getClass(), "shipView", null);
        setField(term2090621, term2090621.getClass(), "statView", null);
        setField(term2090621, term2090621.getClass(), "voteView", null);
        setField(term2090621, term2090621.getClass(), "shipDesignView", null);
        setField(term2090621, term2090621.getClass(), "galaxyConfig", null);
        setField(term2090621, term2090621.getClass(), "newsCorpView", null);
        setField(term2090621, term2090621.getClass(), "espionageView", null);
        setField(term2090621, term2090621.getClass(), "historyView", null);
        setField(term2090621, term2090621.getClass(), "optionsView", null);
        setField(term2090621, term2090621.getClass(), "realmView", null);
        setField(term2090621, term2090621.getClass(), "leaderView", null);
        setField(term2090621, term2090621.getClass(), "planetListView", null);
        setField(term2090621, term2090621.getClass(), "ambientLightsView", null);
        setField(term2090621, term2090621.getClass(), "votingSelectionView", null);
        setField(term2090621, term2090621.getClass(), "storyView", null);
        setField(term2090621, term2090621.getClass(), "endStoryView", null);
        setField(term2090621, term2090621.getClass(), "realmSetupView", null);
        setField(term2090621, term2090621.getClass(), "aiRealmSetupView", null);
        setField(term2090621, term2090621.getClass(), "governmentEditorView", null);
        setField(term2090621, term2090621.getClass(), "spaceRaceEditorView", null);
        setField(term2090621, term2090621.getClass(), "changeMessage", null);
        setField(term2090621, term2090621.getClass(), "gameFrame", null);
        setField(term2090621, term2090621.getClass(), "layeredPane", null);
        setField(term2090621, term2090621.getClass(), "configFile", null);
        setBooleanField(term2090621, term2090621.getClass(), "showMiniMapFlag", false);
        setField(term2090621, term2090621.getClass(), "saveFilename", null);
        setField(term2090621, term2090621.getClass(), "bridge", null);
        setBooleanField(term2090621, term2090621.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term2090621, term2090621.getClass(), "fullscreenMode", false);
        setBooleanField(term2090621, term2090621.getClass(), "resolutionChanged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "showFleetTradeView", argTypes, term2090621, args);
    }

};


