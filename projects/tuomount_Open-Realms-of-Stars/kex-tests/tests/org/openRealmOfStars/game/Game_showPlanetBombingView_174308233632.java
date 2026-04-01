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

public class Game_showPlanetBombingView_174308233632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2066300;

    public Game_showPlanetBombingView_174308233632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2066300 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term2066300, term2066300.getClass(), "animationTimer", null);
        setField(term2066300, term2066300.getClass(), "musicTimer", null);
        setField(term2066300, term2066300.getClass(), "starMap", null);
        setField(term2066300, term2066300.getClass(), "players", null);
        setField(term2066300, term2066300.getClass(), "gameState", null);
        setField(term2066300, term2066300.getClass(), "previousState", null);
        setField(term2066300, term2066300.getClass(), "planetView", null);
        setField(term2066300, term2066300.getClass(), "espionageMissionView", null);
        setField(term2066300, term2066300.getClass(), "planetBombingView", null);
        setField(term2066300, term2066300.getClass(), "fleetView", null);
        setField(term2066300, term2066300.getClass(), "shipUpgradeView", null);
        setField(term2066300, term2066300.getClass(), "fleetTradeView", null);
        setField(term2066300, term2066300.getClass(), "mainMenu", null);
        setField(term2066300, term2066300.getClass(), "galaxyCreationView", null);
        setField(term2066300, term2066300.getClass(), "saveGameView", null);
        setField(term2066300, term2066300.getClass(), "helpView", null);
        setField(term2066300, term2066300.getClass(), "loadGameView", null);
        setField(term2066300, term2066300.getClass(), "aiTurnView", null);
        setField(term2066300, term2066300.getClass(), "creditsView", null);
        setField(term2066300, term2066300.getClass(), "endGameView", null);
        setField(term2066300, term2066300.getClass(), "starMapView", null);
        setField(term2066300, term2066300.getClass(), "combatView", null);
        setField(term2066300, term2066300.getClass(), "researchView", null);
        setField(term2066300, term2066300.getClass(), "diplomacyView", null);
        setField(term2066300, term2066300.getClass(), "shipView", null);
        setField(term2066300, term2066300.getClass(), "statView", null);
        setField(term2066300, term2066300.getClass(), "voteView", null);
        setField(term2066300, term2066300.getClass(), "shipDesignView", null);
        setField(term2066300, term2066300.getClass(), "galaxyConfig", null);
        setField(term2066300, term2066300.getClass(), "newsCorpView", null);
        setField(term2066300, term2066300.getClass(), "espionageView", null);
        setField(term2066300, term2066300.getClass(), "historyView", null);
        setField(term2066300, term2066300.getClass(), "optionsView", null);
        setField(term2066300, term2066300.getClass(), "realmView", null);
        setField(term2066300, term2066300.getClass(), "leaderView", null);
        setField(term2066300, term2066300.getClass(), "planetListView", null);
        setField(term2066300, term2066300.getClass(), "ambientLightsView", null);
        setField(term2066300, term2066300.getClass(), "votingSelectionView", null);
        setField(term2066300, term2066300.getClass(), "storyView", null);
        setField(term2066300, term2066300.getClass(), "endStoryView", null);
        setField(term2066300, term2066300.getClass(), "realmSetupView", null);
        setField(term2066300, term2066300.getClass(), "aiRealmSetupView", null);
        setField(term2066300, term2066300.getClass(), "governmentEditorView", null);
        setField(term2066300, term2066300.getClass(), "spaceRaceEditorView", null);
        setField(term2066300, term2066300.getClass(), "changeMessage", null);
        setField(term2066300, term2066300.getClass(), "gameFrame", null);
        setField(term2066300, term2066300.getClass(), "layeredPane", null);
        setField(term2066300, term2066300.getClass(), "configFile", null);
        setBooleanField(term2066300, term2066300.getClass(), "showMiniMapFlag", false);
        setField(term2066300, term2066300.getClass(), "saveFilename", null);
        setField(term2066300, term2066300.getClass(), "bridge", null);
        setBooleanField(term2066300, term2066300.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term2066300, term2066300.getClass(), "fullscreenMode", false);
        setBooleanField(term2066300, term2066300.getClass(), "resolutionChanged", false);
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
        callMethod(klass, "showPlanetBombingView", argTypes, term2066300, args);
    }

};


