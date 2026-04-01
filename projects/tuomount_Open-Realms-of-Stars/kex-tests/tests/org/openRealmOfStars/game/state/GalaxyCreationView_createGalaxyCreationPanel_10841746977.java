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

public class GalaxyCreationView_createGalaxyCreationPanel_10841746977 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term363346;

    public GalaxyCreationView_createGalaxyCreationPanel_10841746977() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term363346 = newInstance(Class.forName("org.openRealmOfStars.game.state.GalaxyCreationView"));
        setField(term363346, term363346.getClass(), "comboGalaxySize", null);
        setField(term363346, term363346.getClass(), "comboPlayers", null);
        setField(term363346, term363346.getClass(), "comboDifficulty", null);
        setField(term363346, term363346.getClass(), "comboPlayerPos", null);
        setField(term363346, term363346.getClass(), "comboElderTurns", null);
        setField(term363346, term363346.getClass(), "comboSunDensity", null);
        setField(term363346, term363346.getClass(), "comboPlanetaryEvent", null);
        setField(term363346, term363346.getClass(), "comboScoringVictory", null);
        setField(term363346, term363346.getClass(), "comboScoringCulture", null);
        setField(term363346, term363346.getClass(), "comboScoringDomination", null);
        setField(term363346, term363346.getClass(), "comboScoringScientific", null);
        setField(term363346, term363346.getClass(), "comboScoringDiplomatic", null);
        setField(term363346, term363346.getClass(), "comboScoringPopulation", null);
        setField(term363346, term363346.getClass(), "comboRoguePlanets", null);
        setField(term363346, term363346.getClass(), "comboSpacePirates", null);
        setField(term363346, term363346.getClass(), "comboSpacePirateDifficulty", null);
        setField(term363346, term363346.getClass(), "comboSpaceAnomalies", null);
        setField(term363346, term363346.getClass(), "comboKarmaType", null);
        setField(term363346, term363346.getClass(), "comboKarmaSpeed", null);
        setField(term363346, term363346.getClass(), "tutorialEnabled", null);
        setField(term363346, term363346.getClass(), "aiOnlyGame", null);
        setField(term363346, term363346.getClass(), "allNewsSubscribed", null);
        setField(term363346, term363346.getClass(), "config", null);
        setBooleanField(term363346, term363346.getClass(), "isAlignmentXSet", false);
        setFloatField(term363346, term363346.getClass(), "alignmentX", 0.0F);
        setBooleanField(term363346, term363346.getClass(), "isAlignmentYSet", false);
        setFloatField(term363346, term363346.getClass(), "alignmentY", 0.0F);
        setField(term363346, term363346.getClass(), "ui", null);
        setField(term363346, term363346.getClass(), "listenerList", null);
        setField(term363346, term363346.getClass(), "clientProperties", null);
        setField(term363346, term363346.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term363346, term363346.getClass(), "autoscrolls", false);
        setField(term363346, term363346.getClass(), "border", null);
        setIntField(term363346, term363346.getClass(), "flags", 0);
        setField(term363346, term363346.getClass(), "inputVerifier", null);
        setBooleanField(term363346, term363346.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term363346, term363346.getClass(), "paintingChild", null);
        setField(term363346, term363346.getClass(), "popupMenu", null);
        setField(term363346, term363346.getClass(), "revalidateRunnableScheduled", null);
        setField(term363346, term363346.getClass(), "focusInputMap", null);
        setField(term363346, term363346.getClass(), "ancestorInputMap", null);
        setField(term363346, term363346.getClass(), "windowInputMap", null);
        setField(term363346, term363346.getClass(), "actionMap", null);
        setField(term363346, term363346.getClass(), "aaHint", null);
        setField(term363346, term363346.getClass(), "lcdRenderingHint", null);
        setField(term363346, term363346.getClass(), "component", null);
        setField(term363346, term363346.getClass(), "layoutMgr", null);
        setField(term363346, term363346.getClass(), "dispatcher", null);
        setField(term363346, term363346.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term363346, term363346.getClass(), "focusCycleRoot", false);
        setBooleanField(term363346, term363346.getClass(), "focusTraversalPolicyProvider", false);
        setField(term363346, term363346.getClass(), "printingThreads", null);
        setBooleanField(term363346, term363346.getClass(), "printing", false);
        setField(term363346, term363346.getClass(), "containerListener", null);
        setIntField(term363346, term363346.getClass(), "listeningChildren", 0);
        setIntField(term363346, term363346.getClass(), "listeningBoundsChildren", 0);
        setIntField(term363346, term363346.getClass(), "descendantsCount", 0);
        setField(term363346, term363346.getClass(), "preserveBackgroundColor", null);
        setIntField(term363346, term363346.getClass(), "numOfHWComponents", 0);
        setIntField(term363346, term363346.getClass(), "numOfLWComponents", 0);
        setField(term363346, term363346.getClass(), "modalComp", null);
        setField(term363346, term363346.getClass(), "modalAppContext", null);
        setIntField(term363346, term363346.getClass(), "containerSerializedDataVersion", 0);
        setField(term363346, term363346.getClass(), "peer", null);
        setField(term363346, term363346.getClass(), "parent", null);
        setField(term363346, term363346.getClass(), "appContext", null);
        setIntField(term363346, term363346.getClass(), "x", 0);
        setIntField(term363346, term363346.getClass(), "y", 0);
        setIntField(term363346, term363346.getClass(), "width", 0);
        setIntField(term363346, term363346.getClass(), "height", 0);
        setField(term363346, term363346.getClass(), "foreground", null);
        setField(term363346, term363346.getClass(), "background", null);
        setField(term363346, term363346.getClass(), "font", null);
        setField(term363346, term363346.getClass(), "peerFont", null);
        setField(term363346, term363346.getClass(), "cursor", null);
        setField(term363346, term363346.getClass(), "locale", null);
        setField(term363346, term363346.getClass(), "graphicsConfig", null);
        setField(term363346, term363346.getClass(), "bufferStrategy", null);
        setBooleanField(term363346, term363346.getClass(), "ignoreRepaint", false);
        setBooleanField(term363346, term363346.getClass(), "visible", false);
        setBooleanField(term363346, term363346.getClass(), "enabled", false);
        setBooleanField(term363346, term363346.getClass(), "valid", false);
        setField(term363346, term363346.getClass(), "dropTarget", null);
        setField(term363346, term363346.getClass(), "popups", null);
        setField(term363346, term363346.getClass(), "name", null);
        setBooleanField(term363346, term363346.getClass(), "nameExplicitlySet", false);
        setBooleanField(term363346, term363346.getClass(), "focusable", false);
        setIntField(term363346, term363346.getClass(), "isFocusTraversableOverridden", 0);
        setField(term363346, term363346.getClass(), "focusTraversalKeys", null);
        setBooleanField(term363346, term363346.getClass(), "focusTraversalKeysEnabled", false);
        setField(term363346, term363346.getClass(), "acc", null);
        setField(term363346, term363346.getClass(), "minSize", null);
        setBooleanField(term363346, term363346.getClass(), "minSizeSet", false);
        setField(term363346, term363346.getClass(), "prefSize", null);
        setBooleanField(term363346, term363346.getClass(), "prefSizeSet", false);
        setField(term363346, term363346.getClass(), "maxSize", null);
        setBooleanField(term363346, term363346.getClass(), "maxSizeSet", false);
        setField(term363346, term363346.getClass(), "componentOrientation", null);
        setBooleanField(term363346, term363346.getClass(), "newEventsOnly", false);
        setField(term363346, term363346.getClass(), "componentListener", null);
        setField(term363346, term363346.getClass(), "focusListener", null);
        setField(term363346, term363346.getClass(), "hierarchyListener", null);
        setField(term363346, term363346.getClass(), "hierarchyBoundsListener", null);
        setField(term363346, term363346.getClass(), "keyListener", null);
        setField(term363346, term363346.getClass(), "mouseListener", null);
        setField(term363346, term363346.getClass(), "mouseMotionListener", null);
        setField(term363346, term363346.getClass(), "mouseWheelListener", null);
        setField(term363346, term363346.getClass(), "inputMethodListener", null);
        setLongField(term363346, term363346.getClass(), "eventMask", 0L);
        setField(term363346, term363346.getClass(), "changeSupport", null);
        setField(term363346, term363346.getClass(), "objectLock", null);
        setBooleanField(term363346, term363346.getClass(), "isPacked", false);
        setIntField(term363346, term363346.getClass(), "boundsOp", 0);
        setField(term363346, term363346.getClass(), "compoundShape", null);
        setField(term363346, term363346.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term363346, term363346.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term363346, term363346.getClass(), "backgroundEraseDisabled", false);
        setField(term363346, term363346.getClass(), "eventCache", null);
        setBooleanField(term363346, term363346.getClass(), "coalescingEnabled", false);
        setBooleanField(term363346, term363346.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term363346, term363346.getClass(), "componentSerializedDataVersion", 0);
        setField(term363346, term363346.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.GalaxyCreationView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionListener");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createGalaxyCreationPanel", argTypes, term363346, args);
    }

};


