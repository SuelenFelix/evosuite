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

public class Game_showStoryView_1879468032159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2304897;

    public Game_showStoryView_1879468032159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2304897 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term2304897, term2304897.getClass(), "animationTimer", null);
        setField(term2304897, term2304897.getClass(), "musicTimer", null);
        setField(term2304897, term2304897.getClass(), "starMap", null);
        setField(term2304897, term2304897.getClass(), "players", null);
        setField(term2304897, term2304897.getClass(), "gameState", null);
        setField(term2304897, term2304897.getClass(), "previousState", null);
        setField(term2304897, term2304897.getClass(), "planetView", null);
        setField(term2304897, term2304897.getClass(), "espionageMissionView", null);
        setField(term2304897, term2304897.getClass(), "planetBombingView", null);
        setField(term2304897, term2304897.getClass(), "fleetView", null);
        setField(term2304897, term2304897.getClass(), "shipUpgradeView", null);
        setField(term2304897, term2304897.getClass(), "fleetTradeView", null);
        setField(term2304897, term2304897.getClass(), "mainMenu", null);
        setField(term2304897, term2304897.getClass(), "galaxyCreationView", null);
        setField(term2304897, term2304897.getClass(), "saveGameView", null);
        setField(term2304897, term2304897.getClass(), "helpView", null);
        setField(term2304897, term2304897.getClass(), "loadGameView", null);
        setField(term2304897, term2304897.getClass(), "aiTurnView", null);
        setField(term2304897, term2304897.getClass(), "creditsView", null);
        setField(term2304897, term2304897.getClass(), "endGameView", null);
        setField(term2304897, term2304897.getClass(), "starMapView", null);
        setField(term2304897, term2304897.getClass(), "combatView", null);
        setField(term2304897, term2304897.getClass(), "researchView", null);
        setField(term2304897, term2304897.getClass(), "diplomacyView", null);
        setField(term2304897, term2304897.getClass(), "shipView", null);
        setField(term2304897, term2304897.getClass(), "statView", null);
        setField(term2304897, term2304897.getClass(), "voteView", null);
        setField(term2304897, term2304897.getClass(), "shipDesignView", null);
        setField(term2304897, term2304897.getClass(), "galaxyConfig", null);
        setField(term2304897, term2304897.getClass(), "newsCorpView", null);
        setField(term2304897, term2304897.getClass(), "espionageView", null);
        setField(term2304897, term2304897.getClass(), "historyView", null);
        setField(term2304897, term2304897.getClass(), "optionsView", null);
        setField(term2304897, term2304897.getClass(), "realmView", null);
        setField(term2304897, term2304897.getClass(), "leaderView", null);
        setField(term2304897, term2304897.getClass(), "planetListView", null);
        setField(term2304897, term2304897.getClass(), "ambientLightsView", null);
        setField(term2304897, term2304897.getClass(), "votingSelectionView", null);
        setField(term2304897, term2304897.getClass(), "storyView", null);
        setField(term2304897, term2304897.getClass(), "endStoryView", null);
        setField(term2304897, term2304897.getClass(), "realmSetupView", null);
        setField(term2304897, term2304897.getClass(), "aiRealmSetupView", null);
        setField(term2304897, term2304897.getClass(), "governmentEditorView", null);
        setField(term2304897, term2304897.getClass(), "spaceRaceEditorView", null);
        setField(term2304897, term2304897.getClass(), "changeMessage", null);
        setField(term2304897, term2304897.getClass(), "gameFrame", null);
        setField(term2304897, term2304897.getClass(), "layeredPane", null);
        setField(term2304897, term2304897.getClass(), "configFile", null);
        setBooleanField(term2304897, term2304897.getClass(), "showMiniMapFlag", false);
        setField(term2304897, term2304897.getClass(), "saveFilename", null);
        setField(term2304897, term2304897.getClass(), "bridge", null);
        setBooleanField(term2304897, term2304897.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term2304897, term2304897.getClass(), "fullscreenMode", false);
        setBooleanField(term2304897, term2304897.getClass(), "resolutionChanged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "showStoryView", argTypes, term2304897, args);
    }

};


