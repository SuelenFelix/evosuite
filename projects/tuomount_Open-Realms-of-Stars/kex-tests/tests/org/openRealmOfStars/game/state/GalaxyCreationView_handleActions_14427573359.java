package org.openRealmOfStars.game.state;

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
import static org.openRealmOfStars.game.state.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GalaxyCreationView_handleActions_14427573359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term363428;

    public GalaxyCreationView_handleActions_14427573359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term363428 = newInstance(Class.forName("org.openRealmOfStars.game.state.GalaxyCreationView"));
        setField(term363428, term363428.getClass(), "comboGalaxySize", null);
        setField(term363428, term363428.getClass(), "comboPlayers", null);
        setField(term363428, term363428.getClass(), "comboDifficulty", null);
        setField(term363428, term363428.getClass(), "comboPlayerPos", null);
        setField(term363428, term363428.getClass(), "comboElderTurns", null);
        setField(term363428, term363428.getClass(), "comboSunDensity", null);
        setField(term363428, term363428.getClass(), "comboPlanetaryEvent", null);
        setField(term363428, term363428.getClass(), "comboScoringVictory", null);
        setField(term363428, term363428.getClass(), "comboScoringCulture", null);
        setField(term363428, term363428.getClass(), "comboScoringDomination", null);
        setField(term363428, term363428.getClass(), "comboScoringScientific", null);
        setField(term363428, term363428.getClass(), "comboScoringDiplomatic", null);
        setField(term363428, term363428.getClass(), "comboScoringPopulation", null);
        setField(term363428, term363428.getClass(), "comboRoguePlanets", null);
        setField(term363428, term363428.getClass(), "comboSpacePirates", null);
        setField(term363428, term363428.getClass(), "comboSpacePirateDifficulty", null);
        setField(term363428, term363428.getClass(), "comboSpaceAnomalies", null);
        setField(term363428, term363428.getClass(), "comboKarmaType", null);
        setField(term363428, term363428.getClass(), "comboKarmaSpeed", null);
        setField(term363428, term363428.getClass(), "tutorialEnabled", null);
        setField(term363428, term363428.getClass(), "aiOnlyGame", null);
        setField(term363428, term363428.getClass(), "allNewsSubscribed", null);
        setField(term363428, term363428.getClass(), "config", null);
        setBooleanField(term363428, term363428.getClass(), "isAlignmentXSet", false);
        setFloatField(term363428, term363428.getClass(), "alignmentX", 0.0F);
        setBooleanField(term363428, term363428.getClass(), "isAlignmentYSet", false);
        setFloatField(term363428, term363428.getClass(), "alignmentY", 0.0F);
        setField(term363428, term363428.getClass(), "ui", null);
        setField(term363428, term363428.getClass(), "listenerList", null);
        setField(term363428, term363428.getClass(), "clientProperties", null);
        setField(term363428, term363428.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term363428, term363428.getClass(), "autoscrolls", false);
        setField(term363428, term363428.getClass(), "border", null);
        setIntField(term363428, term363428.getClass(), "flags", 0);
        setField(term363428, term363428.getClass(), "inputVerifier", null);
        setBooleanField(term363428, term363428.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term363428, term363428.getClass(), "paintingChild", null);
        setField(term363428, term363428.getClass(), "popupMenu", null);
        setField(term363428, term363428.getClass(), "revalidateRunnableScheduled", null);
        setField(term363428, term363428.getClass(), "focusInputMap", null);
        setField(term363428, term363428.getClass(), "ancestorInputMap", null);
        setField(term363428, term363428.getClass(), "windowInputMap", null);
        setField(term363428, term363428.getClass(), "actionMap", null);
        setField(term363428, term363428.getClass(), "aaHint", null);
        setField(term363428, term363428.getClass(), "lcdRenderingHint", null);
        setField(term363428, term363428.getClass(), "component", null);
        setField(term363428, term363428.getClass(), "layoutMgr", null);
        setField(term363428, term363428.getClass(), "dispatcher", null);
        setField(term363428, term363428.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term363428, term363428.getClass(), "focusCycleRoot", false);
        setBooleanField(term363428, term363428.getClass(), "focusTraversalPolicyProvider", false);
        setField(term363428, term363428.getClass(), "printingThreads", null);
        setBooleanField(term363428, term363428.getClass(), "printing", false);
        setField(term363428, term363428.getClass(), "containerListener", null);
        setIntField(term363428, term363428.getClass(), "listeningChildren", 0);
        setIntField(term363428, term363428.getClass(), "listeningBoundsChildren", 0);
        setIntField(term363428, term363428.getClass(), "descendantsCount", 0);
        setField(term363428, term363428.getClass(), "preserveBackgroundColor", null);
        setIntField(term363428, term363428.getClass(), "numOfHWComponents", 0);
        setIntField(term363428, term363428.getClass(), "numOfLWComponents", 0);
        setField(term363428, term363428.getClass(), "modalComp", null);
        setField(term363428, term363428.getClass(), "modalAppContext", null);
        setIntField(term363428, term363428.getClass(), "containerSerializedDataVersion", 0);
        setField(term363428, term363428.getClass(), "peer", null);
        setField(term363428, term363428.getClass(), "parent", null);
        setField(term363428, term363428.getClass(), "appContext", null);
        setIntField(term363428, term363428.getClass(), "x", 0);
        setIntField(term363428, term363428.getClass(), "y", 0);
        setIntField(term363428, term363428.getClass(), "width", 0);
        setIntField(term363428, term363428.getClass(), "height", 0);
        setField(term363428, term363428.getClass(), "foreground", null);
        setField(term363428, term363428.getClass(), "background", null);
        setField(term363428, term363428.getClass(), "font", null);
        setField(term363428, term363428.getClass(), "peerFont", null);
        setField(term363428, term363428.getClass(), "cursor", null);
        setField(term363428, term363428.getClass(), "locale", null);
        setField(term363428, term363428.getClass(), "graphicsConfig", null);
        setField(term363428, term363428.getClass(), "bufferStrategy", null);
        setBooleanField(term363428, term363428.getClass(), "ignoreRepaint", false);
        setBooleanField(term363428, term363428.getClass(), "visible", false);
        setBooleanField(term363428, term363428.getClass(), "enabled", false);
        setBooleanField(term363428, term363428.getClass(), "valid", false);
        setField(term363428, term363428.getClass(), "dropTarget", null);
        setField(term363428, term363428.getClass(), "popups", null);
        setField(term363428, term363428.getClass(), "name", null);
        setBooleanField(term363428, term363428.getClass(), "nameExplicitlySet", false);
        setBooleanField(term363428, term363428.getClass(), "focusable", false);
        setIntField(term363428, term363428.getClass(), "isFocusTraversableOverridden", 0);
        setField(term363428, term363428.getClass(), "focusTraversalKeys", null);
        setBooleanField(term363428, term363428.getClass(), "focusTraversalKeysEnabled", false);
        setField(term363428, term363428.getClass(), "acc", null);
        setField(term363428, term363428.getClass(), "minSize", null);
        setBooleanField(term363428, term363428.getClass(), "minSizeSet", false);
        setField(term363428, term363428.getClass(), "prefSize", null);
        setBooleanField(term363428, term363428.getClass(), "prefSizeSet", false);
        setField(term363428, term363428.getClass(), "maxSize", null);
        setBooleanField(term363428, term363428.getClass(), "maxSizeSet", false);
        setField(term363428, term363428.getClass(), "componentOrientation", null);
        setBooleanField(term363428, term363428.getClass(), "newEventsOnly", false);
        setField(term363428, term363428.getClass(), "componentListener", null);
        setField(term363428, term363428.getClass(), "focusListener", null);
        setField(term363428, term363428.getClass(), "hierarchyListener", null);
        setField(term363428, term363428.getClass(), "hierarchyBoundsListener", null);
        setField(term363428, term363428.getClass(), "keyListener", null);
        setField(term363428, term363428.getClass(), "mouseListener", null);
        setField(term363428, term363428.getClass(), "mouseMotionListener", null);
        setField(term363428, term363428.getClass(), "mouseWheelListener", null);
        setField(term363428, term363428.getClass(), "inputMethodListener", null);
        setLongField(term363428, term363428.getClass(), "eventMask", 0L);
        setField(term363428, term363428.getClass(), "changeSupport", null);
        setField(term363428, term363428.getClass(), "objectLock", null);
        setBooleanField(term363428, term363428.getClass(), "isPacked", false);
        setIntField(term363428, term363428.getClass(), "boundsOp", 0);
        setField(term363428, term363428.getClass(), "compoundShape", null);
        setField(term363428, term363428.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term363428, term363428.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term363428, term363428.getClass(), "backgroundEraseDisabled", false);
        setField(term363428, term363428.getClass(), "eventCache", null);
        setBooleanField(term363428, term363428.getClass(), "coalescingEnabled", false);
        setBooleanField(term363428, term363428.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term363428, term363428.getClass(), "componentSerializedDataVersion", 0);
        setField(term363428, term363428.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.GalaxyCreationView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleActions", argTypes, term363428, args);
    }

};


