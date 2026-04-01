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

public class Game_setLoadedGame_235524132121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2267706;

    public Game_setLoadedGame_235524132121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2267706 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term2267706, term2267706.getClass(), "animationTimer", null);
        setField(term2267706, term2267706.getClass(), "musicTimer", null);
        setField(term2267706, term2267706.getClass(), "starMap", null);
        setField(term2267706, term2267706.getClass(), "players", null);
        setField(term2267706, term2267706.getClass(), "gameState", null);
        setField(term2267706, term2267706.getClass(), "previousState", null);
        setField(term2267706, term2267706.getClass(), "planetView", null);
        setField(term2267706, term2267706.getClass(), "espionageMissionView", null);
        setField(term2267706, term2267706.getClass(), "planetBombingView", null);
        setField(term2267706, term2267706.getClass(), "fleetView", null);
        setField(term2267706, term2267706.getClass(), "shipUpgradeView", null);
        setField(term2267706, term2267706.getClass(), "fleetTradeView", null);
        setField(term2267706, term2267706.getClass(), "mainMenu", null);
        setField(term2267706, term2267706.getClass(), "galaxyCreationView", null);
        setField(term2267706, term2267706.getClass(), "saveGameView", null);
        setField(term2267706, term2267706.getClass(), "helpView", null);
        setField(term2267706, term2267706.getClass(), "loadGameView", null);
        setField(term2267706, term2267706.getClass(), "aiTurnView", null);
        setField(term2267706, term2267706.getClass(), "creditsView", null);
        setField(term2267706, term2267706.getClass(), "endGameView", null);
        setField(term2267706, term2267706.getClass(), "starMapView", null);
        setField(term2267706, term2267706.getClass(), "combatView", null);
        setField(term2267706, term2267706.getClass(), "researchView", null);
        setField(term2267706, term2267706.getClass(), "diplomacyView", null);
        setField(term2267706, term2267706.getClass(), "shipView", null);
        setField(term2267706, term2267706.getClass(), "statView", null);
        setField(term2267706, term2267706.getClass(), "voteView", null);
        setField(term2267706, term2267706.getClass(), "shipDesignView", null);
        setField(term2267706, term2267706.getClass(), "galaxyConfig", null);
        setField(term2267706, term2267706.getClass(), "newsCorpView", null);
        setField(term2267706, term2267706.getClass(), "espionageView", null);
        setField(term2267706, term2267706.getClass(), "historyView", null);
        setField(term2267706, term2267706.getClass(), "optionsView", null);
        setField(term2267706, term2267706.getClass(), "realmView", null);
        setField(term2267706, term2267706.getClass(), "leaderView", null);
        setField(term2267706, term2267706.getClass(), "planetListView", null);
        setField(term2267706, term2267706.getClass(), "ambientLightsView", null);
        setField(term2267706, term2267706.getClass(), "votingSelectionView", null);
        setField(term2267706, term2267706.getClass(), "storyView", null);
        setField(term2267706, term2267706.getClass(), "endStoryView", null);
        setField(term2267706, term2267706.getClass(), "realmSetupView", null);
        setField(term2267706, term2267706.getClass(), "aiRealmSetupView", null);
        setField(term2267706, term2267706.getClass(), "governmentEditorView", null);
        setField(term2267706, term2267706.getClass(), "spaceRaceEditorView", null);
        setField(term2267706, term2267706.getClass(), "changeMessage", null);
        setField(term2267706, term2267706.getClass(), "gameFrame", null);
        setField(term2267706, term2267706.getClass(), "layeredPane", null);
        setField(term2267706, term2267706.getClass(), "configFile", null);
        setBooleanField(term2267706, term2267706.getClass(), "showMiniMapFlag", false);
        setField(term2267706, term2267706.getClass(), "saveFilename", null);
        setField(term2267706, term2267706.getClass(), "bridge", null);
        setBooleanField(term2267706, term2267706.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term2267706, term2267706.getClass(), "fullscreenMode", false);
        setBooleanField(term2267706, term2267706.getClass(), "resolutionChanged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLoadedGame", argTypes, term2267706, args);
    }

};


