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

public class Game_showPlanetView_144900469024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2031282;
     Object term2031287;

    public Game_showPlanetView_144900469024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2031282 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term2031282, term2031282.getClass(), "animationTimer", null);
        setField(term2031282, term2031282.getClass(), "musicTimer", null);
        setField(term2031282, term2031282.getClass(), "starMap", null);
        setField(term2031282, term2031282.getClass(), "players", null);
        setField(term2031282, term2031282.getClass(), "gameState", null);
        setField(term2031282, term2031282.getClass(), "previousState", null);
        setField(term2031282, term2031282.getClass(), "planetView", null);
        setField(term2031282, term2031282.getClass(), "espionageMissionView", null);
        setField(term2031282, term2031282.getClass(), "planetBombingView", null);
        setField(term2031282, term2031282.getClass(), "fleetView", null);
        setField(term2031282, term2031282.getClass(), "shipUpgradeView", null);
        setField(term2031282, term2031282.getClass(), "fleetTradeView", null);
        setField(term2031282, term2031282.getClass(), "mainMenu", null);
        setField(term2031282, term2031282.getClass(), "galaxyCreationView", null);
        setField(term2031282, term2031282.getClass(), "saveGameView", null);
        setField(term2031282, term2031282.getClass(), "helpView", null);
        setField(term2031282, term2031282.getClass(), "loadGameView", null);
        setField(term2031282, term2031282.getClass(), "aiTurnView", null);
        setField(term2031282, term2031282.getClass(), "creditsView", null);
        setField(term2031282, term2031282.getClass(), "endGameView", null);
        setField(term2031282, term2031282.getClass(), "starMapView", null);
        setField(term2031282, term2031282.getClass(), "combatView", null);
        setField(term2031282, term2031282.getClass(), "researchView", null);
        setField(term2031282, term2031282.getClass(), "diplomacyView", null);
        setField(term2031282, term2031282.getClass(), "shipView", null);
        setField(term2031282, term2031282.getClass(), "statView", null);
        setField(term2031282, term2031282.getClass(), "voteView", null);
        setField(term2031282, term2031282.getClass(), "shipDesignView", null);
        setField(term2031282, term2031282.getClass(), "galaxyConfig", null);
        setField(term2031282, term2031282.getClass(), "newsCorpView", null);
        setField(term2031282, term2031282.getClass(), "espionageView", null);
        setField(term2031282, term2031282.getClass(), "historyView", null);
        setField(term2031282, term2031282.getClass(), "optionsView", null);
        setField(term2031282, term2031282.getClass(), "realmView", null);
        setField(term2031282, term2031282.getClass(), "leaderView", null);
        setField(term2031282, term2031282.getClass(), "planetListView", null);
        setField(term2031282, term2031282.getClass(), "ambientLightsView", null);
        setField(term2031282, term2031282.getClass(), "votingSelectionView", null);
        setField(term2031282, term2031282.getClass(), "storyView", null);
        setField(term2031282, term2031282.getClass(), "endStoryView", null);
        setField(term2031282, term2031282.getClass(), "realmSetupView", null);
        setField(term2031282, term2031282.getClass(), "aiRealmSetupView", null);
        setField(term2031282, term2031282.getClass(), "governmentEditorView", null);
        setField(term2031282, term2031282.getClass(), "spaceRaceEditorView", null);
        setField(term2031282, term2031282.getClass(), "changeMessage", null);
        setField(term2031282, term2031282.getClass(), "gameFrame", null);
        setField(term2031282, term2031282.getClass(), "layeredPane", null);
        setField(term2031282, term2031282.getClass(), "configFile", null);
        setBooleanField(term2031282, term2031282.getClass(), "showMiniMapFlag", false);
        setField(term2031282, term2031282.getClass(), "saveFilename", null);
        setField(term2031282, term2031282.getClass(), "bridge", null);
        setBooleanField(term2031282, term2031282.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term2031282, term2031282.getClass(), "fullscreenMode", false);
        setBooleanField(term2031282, term2031282.getClass(), "resolutionChanged", false);
        term2031287 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term2031287;
        callMethod(klass, "showPlanetView", argTypes, term2031282, args);
    }

};


