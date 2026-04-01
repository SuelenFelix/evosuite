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

public class Game_planetView_630306322189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2305049;

    public Game_planetView_630306322189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2305049 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term2305049, term2305049.getClass(), "animationTimer", null);
        setField(term2305049, term2305049.getClass(), "musicTimer", null);
        setField(term2305049, term2305049.getClass(), "starMap", null);
        setField(term2305049, term2305049.getClass(), "players", null);
        setField(term2305049, term2305049.getClass(), "gameState", null);
        setField(term2305049, term2305049.getClass(), "previousState", null);
        setField(term2305049, term2305049.getClass(), "planetView", null);
        setField(term2305049, term2305049.getClass(), "espionageMissionView", null);
        setField(term2305049, term2305049.getClass(), "planetBombingView", null);
        setField(term2305049, term2305049.getClass(), "fleetView", null);
        setField(term2305049, term2305049.getClass(), "shipUpgradeView", null);
        setField(term2305049, term2305049.getClass(), "fleetTradeView", null);
        setField(term2305049, term2305049.getClass(), "mainMenu", null);
        setField(term2305049, term2305049.getClass(), "galaxyCreationView", null);
        setField(term2305049, term2305049.getClass(), "saveGameView", null);
        setField(term2305049, term2305049.getClass(), "helpView", null);
        setField(term2305049, term2305049.getClass(), "loadGameView", null);
        setField(term2305049, term2305049.getClass(), "aiTurnView", null);
        setField(term2305049, term2305049.getClass(), "creditsView", null);
        setField(term2305049, term2305049.getClass(), "endGameView", null);
        setField(term2305049, term2305049.getClass(), "starMapView", null);
        setField(term2305049, term2305049.getClass(), "combatView", null);
        setField(term2305049, term2305049.getClass(), "researchView", null);
        setField(term2305049, term2305049.getClass(), "diplomacyView", null);
        setField(term2305049, term2305049.getClass(), "shipView", null);
        setField(term2305049, term2305049.getClass(), "statView", null);
        setField(term2305049, term2305049.getClass(), "voteView", null);
        setField(term2305049, term2305049.getClass(), "shipDesignView", null);
        setField(term2305049, term2305049.getClass(), "galaxyConfig", null);
        setField(term2305049, term2305049.getClass(), "newsCorpView", null);
        setField(term2305049, term2305049.getClass(), "espionageView", null);
        setField(term2305049, term2305049.getClass(), "historyView", null);
        setField(term2305049, term2305049.getClass(), "optionsView", null);
        setField(term2305049, term2305049.getClass(), "realmView", null);
        setField(term2305049, term2305049.getClass(), "leaderView", null);
        setField(term2305049, term2305049.getClass(), "planetListView", null);
        setField(term2305049, term2305049.getClass(), "ambientLightsView", null);
        setField(term2305049, term2305049.getClass(), "votingSelectionView", null);
        setField(term2305049, term2305049.getClass(), "storyView", null);
        setField(term2305049, term2305049.getClass(), "endStoryView", null);
        setField(term2305049, term2305049.getClass(), "realmSetupView", null);
        setField(term2305049, term2305049.getClass(), "aiRealmSetupView", null);
        setField(term2305049, term2305049.getClass(), "governmentEditorView", null);
        setField(term2305049, term2305049.getClass(), "spaceRaceEditorView", null);
        setField(term2305049, term2305049.getClass(), "changeMessage", null);
        setField(term2305049, term2305049.getClass(), "gameFrame", null);
        setField(term2305049, term2305049.getClass(), "layeredPane", null);
        setField(term2305049, term2305049.getClass(), "configFile", null);
        setBooleanField(term2305049, term2305049.getClass(), "showMiniMapFlag", false);
        setField(term2305049, term2305049.getClass(), "saveFilename", null);
        setField(term2305049, term2305049.getClass(), "bridge", null);
        setBooleanField(term2305049, term2305049.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term2305049, term2305049.getClass(), "fullscreenMode", false);
        setBooleanField(term2305049, term2305049.getClass(), "resolutionChanged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.message.Message");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "planetView", argTypes, term2305049, args);
    }

};


