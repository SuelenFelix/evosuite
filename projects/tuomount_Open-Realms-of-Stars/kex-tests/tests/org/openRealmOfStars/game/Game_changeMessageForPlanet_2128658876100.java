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

public class Game_changeMessageForPlanet_2128658876100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2220374;

    public Game_changeMessageForPlanet_2128658876100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2220374 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term2220374, term2220374.getClass(), "animationTimer", null);
        setField(term2220374, term2220374.getClass(), "musicTimer", null);
        setField(term2220374, term2220374.getClass(), "starMap", null);
        setField(term2220374, term2220374.getClass(), "players", null);
        setField(term2220374, term2220374.getClass(), "gameState", null);
        setField(term2220374, term2220374.getClass(), "previousState", null);
        setField(term2220374, term2220374.getClass(), "planetView", null);
        setField(term2220374, term2220374.getClass(), "espionageMissionView", null);
        setField(term2220374, term2220374.getClass(), "planetBombingView", null);
        setField(term2220374, term2220374.getClass(), "fleetView", null);
        setField(term2220374, term2220374.getClass(), "shipUpgradeView", null);
        setField(term2220374, term2220374.getClass(), "fleetTradeView", null);
        setField(term2220374, term2220374.getClass(), "mainMenu", null);
        setField(term2220374, term2220374.getClass(), "galaxyCreationView", null);
        setField(term2220374, term2220374.getClass(), "saveGameView", null);
        setField(term2220374, term2220374.getClass(), "helpView", null);
        setField(term2220374, term2220374.getClass(), "loadGameView", null);
        setField(term2220374, term2220374.getClass(), "aiTurnView", null);
        setField(term2220374, term2220374.getClass(), "creditsView", null);
        setField(term2220374, term2220374.getClass(), "endGameView", null);
        setField(term2220374, term2220374.getClass(), "starMapView", null);
        setField(term2220374, term2220374.getClass(), "combatView", null);
        setField(term2220374, term2220374.getClass(), "researchView", null);
        setField(term2220374, term2220374.getClass(), "diplomacyView", null);
        setField(term2220374, term2220374.getClass(), "shipView", null);
        setField(term2220374, term2220374.getClass(), "statView", null);
        setField(term2220374, term2220374.getClass(), "voteView", null);
        setField(term2220374, term2220374.getClass(), "shipDesignView", null);
        setField(term2220374, term2220374.getClass(), "galaxyConfig", null);
        setField(term2220374, term2220374.getClass(), "newsCorpView", null);
        setField(term2220374, term2220374.getClass(), "espionageView", null);
        setField(term2220374, term2220374.getClass(), "historyView", null);
        setField(term2220374, term2220374.getClass(), "optionsView", null);
        setField(term2220374, term2220374.getClass(), "realmView", null);
        setField(term2220374, term2220374.getClass(), "leaderView", null);
        setField(term2220374, term2220374.getClass(), "planetListView", null);
        setField(term2220374, term2220374.getClass(), "ambientLightsView", null);
        setField(term2220374, term2220374.getClass(), "votingSelectionView", null);
        setField(term2220374, term2220374.getClass(), "storyView", null);
        setField(term2220374, term2220374.getClass(), "endStoryView", null);
        setField(term2220374, term2220374.getClass(), "realmSetupView", null);
        setField(term2220374, term2220374.getClass(), "aiRealmSetupView", null);
        setField(term2220374, term2220374.getClass(), "governmentEditorView", null);
        setField(term2220374, term2220374.getClass(), "spaceRaceEditorView", null);
        setField(term2220374, term2220374.getClass(), "changeMessage", null);
        setField(term2220374, term2220374.getClass(), "gameFrame", null);
        setField(term2220374, term2220374.getClass(), "layeredPane", null);
        setField(term2220374, term2220374.getClass(), "configFile", null);
        setBooleanField(term2220374, term2220374.getClass(), "showMiniMapFlag", false);
        setField(term2220374, term2220374.getClass(), "saveFilename", null);
        setField(term2220374, term2220374.getClass(), "bridge", null);
        setBooleanField(term2220374, term2220374.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term2220374, term2220374.getClass(), "fullscreenMode", false);
        setBooleanField(term2220374, term2220374.getClass(), "resolutionChanged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "changeMessageForPlanet", argTypes, term2220374, args);
    }

};


