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

public class Game_showOptionsView_323509801152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2304862;

    public Game_showOptionsView_323509801152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2304862 = newInstance(Class.forName("org.openRealmOfStars.game.Game"));
        setField(term2304862, term2304862.getClass(), "animationTimer", null);
        setField(term2304862, term2304862.getClass(), "musicTimer", null);
        setField(term2304862, term2304862.getClass(), "starMap", null);
        setField(term2304862, term2304862.getClass(), "players", null);
        setField(term2304862, term2304862.getClass(), "gameState", null);
        setField(term2304862, term2304862.getClass(), "previousState", null);
        setField(term2304862, term2304862.getClass(), "planetView", null);
        setField(term2304862, term2304862.getClass(), "espionageMissionView", null);
        setField(term2304862, term2304862.getClass(), "planetBombingView", null);
        setField(term2304862, term2304862.getClass(), "fleetView", null);
        setField(term2304862, term2304862.getClass(), "shipUpgradeView", null);
        setField(term2304862, term2304862.getClass(), "fleetTradeView", null);
        setField(term2304862, term2304862.getClass(), "mainMenu", null);
        setField(term2304862, term2304862.getClass(), "galaxyCreationView", null);
        setField(term2304862, term2304862.getClass(), "saveGameView", null);
        setField(term2304862, term2304862.getClass(), "helpView", null);
        setField(term2304862, term2304862.getClass(), "loadGameView", null);
        setField(term2304862, term2304862.getClass(), "aiTurnView", null);
        setField(term2304862, term2304862.getClass(), "creditsView", null);
        setField(term2304862, term2304862.getClass(), "endGameView", null);
        setField(term2304862, term2304862.getClass(), "starMapView", null);
        setField(term2304862, term2304862.getClass(), "combatView", null);
        setField(term2304862, term2304862.getClass(), "researchView", null);
        setField(term2304862, term2304862.getClass(), "diplomacyView", null);
        setField(term2304862, term2304862.getClass(), "shipView", null);
        setField(term2304862, term2304862.getClass(), "statView", null);
        setField(term2304862, term2304862.getClass(), "voteView", null);
        setField(term2304862, term2304862.getClass(), "shipDesignView", null);
        setField(term2304862, term2304862.getClass(), "galaxyConfig", null);
        setField(term2304862, term2304862.getClass(), "newsCorpView", null);
        setField(term2304862, term2304862.getClass(), "espionageView", null);
        setField(term2304862, term2304862.getClass(), "historyView", null);
        setField(term2304862, term2304862.getClass(), "optionsView", null);
        setField(term2304862, term2304862.getClass(), "realmView", null);
        setField(term2304862, term2304862.getClass(), "leaderView", null);
        setField(term2304862, term2304862.getClass(), "planetListView", null);
        setField(term2304862, term2304862.getClass(), "ambientLightsView", null);
        setField(term2304862, term2304862.getClass(), "votingSelectionView", null);
        setField(term2304862, term2304862.getClass(), "storyView", null);
        setField(term2304862, term2304862.getClass(), "endStoryView", null);
        setField(term2304862, term2304862.getClass(), "realmSetupView", null);
        setField(term2304862, term2304862.getClass(), "aiRealmSetupView", null);
        setField(term2304862, term2304862.getClass(), "governmentEditorView", null);
        setField(term2304862, term2304862.getClass(), "spaceRaceEditorView", null);
        setField(term2304862, term2304862.getClass(), "changeMessage", null);
        setField(term2304862, term2304862.getClass(), "gameFrame", null);
        setField(term2304862, term2304862.getClass(), "layeredPane", null);
        setField(term2304862, term2304862.getClass(), "configFile", null);
        setBooleanField(term2304862, term2304862.getClass(), "showMiniMapFlag", false);
        setField(term2304862, term2304862.getClass(), "saveFilename", null);
        setField(term2304862, term2304862.getClass(), "bridge", null);
        setBooleanField(term2304862, term2304862.getClass(), "factoryRestartNeeded", false);
        setBooleanField(term2304862, term2304862.getClass(), "fullscreenMode", false);
        setBooleanField(term2304862, term2304862.getClass(), "resolutionChanged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.Game");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "showOptionsView", argTypes, term2304862, args);
    }

};


