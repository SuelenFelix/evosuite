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

public class Game_showRealmView_135777277058 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2141326;

    public Game_showRealmView_135777277058() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2141326 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term2141326, term2141326.getClass(), "animationTimer", null);
        setField(term2141326, term2141326.getClass(), "musicTimer", null);
        setField(term2141326, term2141326.getClass(), "starMap", null);
        setField(term2141326, term2141326.getClass(), "players", null);
        setField(term2141326, term2141326.getClass(), "gameState", null);
        setField(term2141326, term2141326.getClass(), "previousState", null);
        setField(term2141326, term2141326.getClass(), "planetView", null);
        setField(term2141326, term2141326.getClass(), "espionageMissionView", null);
        setField(term2141326, term2141326.getClass(), "planetBombingView", null);
        setField(term2141326, term2141326.getClass(), "fleetView", null);
        setField(term2141326, term2141326.getClass(), "shipUpgradeView", null);
        setField(term2141326, term2141326.getClass(), "fleetTradeView", null);
        setField(term2141326, term2141326.getClass(), "mainMenu", null);
        setField(term2141326, term2141326.getClass(), "galaxyCreationView", null);
        setField(term2141326, term2141326.getClass(), "saveGameView", null);
        setField(term2141326, term2141326.getClass(), "helpView", null);
        setField(term2141326, term2141326.getClass(), "loadGameView", null);
        setField(term2141326, term2141326.getClass(), "aiTurnView", null);
        setField(term2141326, term2141326.getClass(), "creditsView", null);
        setField(term2141326, term2141326.getClass(), "endGameView", null);
        setField(term2141326, term2141326.getClass(), "starMapView", null);
        setField(term2141326, term2141326.getClass(), "combatView", null);
        setField(term2141326, term2141326.getClass(), "researchView", null);
        setField(term2141326, term2141326.getClass(), "diplomacyView", null);
        setField(term2141326, term2141326.getClass(), "shipView", null);
        setField(term2141326, term2141326.getClass(), "statView", null);
        setField(term2141326, term2141326.getClass(), "voteView", null);
        setField(term2141326, term2141326.getClass(), "shipDesignView", null);
        setField(term2141326, term2141326.getClass(), "galaxyConfig", null);
        setField(term2141326, term2141326.getClass(), "newsCorpView", null);
        setField(term2141326, term2141326.getClass(), "espionageView", null);
        setField(term2141326, term2141326.getClass(), "historyView", null);
        setField(term2141326, term2141326.getClass(), "optionsView", null);
        setField(term2141326, term2141326.getClass(), "realmView", null);
        setField(term2141326, term2141326.getClass(), "leaderView", null);
        setField(term2141326, term2141326.getClass(), "planetListView", null);
        setField(term2141326, term2141326.getClass(), "ambientLightsView", null);
        setField(term2141326, term2141326.getClass(), "votingSelectionView", null);
        setField(term2141326, term2141326.getClass(), "storyView", null);
        setField(term2141326, term2141326.getClass(), "endStoryView", null);
        setField(term2141326, term2141326.getClass(), "realmSetupView", null);
        setField(term2141326, term2141326.getClass(), "aiRealmSetupView", null);
        setField(term2141326, term2141326.getClass(), "governmentEditorView", null);
        setField(term2141326, term2141326.getClass(), "spaceRaceEditorView", null);
        setField(term2141326, term2141326.getClass(), "changeMessage", null);
        setField(term2141326, term2141326.getClass(), "gameFrame", null);
        setField(term2141326, term2141326.getClass(), "layeredPane", null);
        setField(term2141326, term2141326.getClass(), "configFile", null);
        setBooleanField(term2141326, term2141326.getClass(), "showMiniMapFlag", false);
        setField(term2141326, term2141326.getClass(), "saveFilename", null);
        setField(term2141326, term2141326.getClass(), "bridge", null);
        setBooleanField(term2141326, term2141326.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term2141326, term2141326.getClass(), "fullscreenMode", false);
        setBooleanField(term2141326, term2141326.getClass(), "resolutionChanged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "showRealmView", argTypes, term2141326, args);
    }

};


