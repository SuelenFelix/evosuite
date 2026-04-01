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

public class GalaxyCreationView_estimateGalaxySizeToolTip_17784948510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term363469;

    public GalaxyCreationView_estimateGalaxySizeToolTip_17784948510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term363469 = newInstance(Class.forName("org.openRealmOfStars.game.state.GalaxyCreationView"));
        setField(term363469, term363469.getClass(), "comboGalaxySize", null);
        setField(term363469, term363469.getClass(), "comboPlayers", null);
        setField(term363469, term363469.getClass(), "comboDifficulty", null);
        setField(term363469, term363469.getClass(), "comboPlayerPos", null);
        setField(term363469, term363469.getClass(), "comboElderTurns", null);
        setField(term363469, term363469.getClass(), "comboSunDensity", null);
        setField(term363469, term363469.getClass(), "comboPlanetaryEvent", null);
        setField(term363469, term363469.getClass(), "comboScoringVictory", null);
        setField(term363469, term363469.getClass(), "comboScoringCulture", null);
        setField(term363469, term363469.getClass(), "comboScoringDomination", null);
        setField(term363469, term363469.getClass(), "comboScoringScientific", null);
        setField(term363469, term363469.getClass(), "comboScoringDiplomatic", null);
        setField(term363469, term363469.getClass(), "comboScoringPopulation", null);
        setField(term363469, term363469.getClass(), "comboRoguePlanets", null);
        setField(term363469, term363469.getClass(), "comboSpacePirates", null);
        setField(term363469, term363469.getClass(), "comboSpacePirateDifficulty", null);
        setField(term363469, term363469.getClass(), "comboSpaceAnomalies", null);
        setField(term363469, term363469.getClass(), "comboKarmaType", null);
        setField(term363469, term363469.getClass(), "comboKarmaSpeed", null);
        setField(term363469, term363469.getClass(), "tutorialEnabled", null);
        setField(term363469, term363469.getClass(), "aiOnlyGame", null);
        setField(term363469, term363469.getClass(), "allNewsSubscribed", null);
        setField(term363469, term363469.getClass(), "config", null);
        setBooleanField(term363469, term363469.getClass(), "isAlignmentXSet", false);
        setFloatField(term363469, term363469.getClass(), "alignmentX", 0.0F);
        setBooleanField(term363469, term363469.getClass(), "isAlignmentYSet", false);
        setFloatField(term363469, term363469.getClass(), "alignmentY", 0.0F);
        setField(term363469, term363469.getClass(), "ui", null);
        setField(term363469, term363469.getClass(), "listenerList", null);
        setField(term363469, term363469.getClass(), "clientProperties", null);
        setField(term363469, term363469.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term363469, term363469.getClass(), "autoscrolls", false);
        setField(term363469, term363469.getClass(), "border", null);
        setIntField(term363469, term363469.getClass(), "flags", 0);
        setField(term363469, term363469.getClass(), "inputVerifier", null);
        setBooleanField(term363469, term363469.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term363469, term363469.getClass(), "paintingChild", null);
        setField(term363469, term363469.getClass(), "popupMenu", null);
        setField(term363469, term363469.getClass(), "revalidateRunnableScheduled", null);
        setField(term363469, term363469.getClass(), "focusInputMap", null);
        setField(term363469, term363469.getClass(), "ancestorInputMap", null);
        setField(term363469, term363469.getClass(), "windowInputMap", null);
        setField(term363469, term363469.getClass(), "actionMap", null);
        setField(term363469, term363469.getClass(), "aaHint", null);
        setField(term363469, term363469.getClass(), "lcdRenderingHint", null);
        setField(term363469, term363469.getClass(), "component", null);
        setField(term363469, term363469.getClass(), "layoutMgr", null);
        setField(term363469, term363469.getClass(), "dispatcher", null);
        setField(term363469, term363469.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term363469, term363469.getClass(), "focusCycleRoot", false);
        setBooleanField(term363469, term363469.getClass(), "focusTraversalPolicyProvider", false);
        setField(term363469, term363469.getClass(), "printingThreads", null);
        setBooleanField(term363469, term363469.getClass(), "printing", false);
        setField(term363469, term363469.getClass(), "containerListener", null);
        setIntField(term363469, term363469.getClass(), "listeningChildren", 0);
        setIntField(term363469, term363469.getClass(), "listeningBoundsChildren", 0);
        setIntField(term363469, term363469.getClass(), "descendantsCount", 0);
        setField(term363469, term363469.getClass(), "preserveBackgroundColor", null);
        setIntField(term363469, term363469.getClass(), "numOfHWComponents", 0);
        setIntField(term363469, term363469.getClass(), "numOfLWComponents", 0);
        setField(term363469, term363469.getClass(), "modalComp", null);
        setField(term363469, term363469.getClass(), "modalAppContext", null);
        setIntField(term363469, term363469.getClass(), "containerSerializedDataVersion", 0);
        setField(term363469, term363469.getClass(), "peer", null);
        setField(term363469, term363469.getClass(), "parent", null);
        setField(term363469, term363469.getClass(), "appContext", null);
        setIntField(term363469, term363469.getClass(), "x", 0);
        setIntField(term363469, term363469.getClass(), "y", 0);
        setIntField(term363469, term363469.getClass(), "width", 0);
        setIntField(term363469, term363469.getClass(), "height", 0);
        setField(term363469, term363469.getClass(), "foreground", null);
        setField(term363469, term363469.getClass(), "background", null);
        setField(term363469, term363469.getClass(), "font", null);
        setField(term363469, term363469.getClass(), "peerFont", null);
        setField(term363469, term363469.getClass(), "cursor", null);
        setField(term363469, term363469.getClass(), "locale", null);
        setField(term363469, term363469.getClass(), "graphicsConfig", null);
        setField(term363469, term363469.getClass(), "bufferStrategy", null);
        setBooleanField(term363469, term363469.getClass(), "ignoreRepaint", false);
        setBooleanField(term363469, term363469.getClass(), "visible", false);
        setBooleanField(term363469, term363469.getClass(), "enabled", false);
        setBooleanField(term363469, term363469.getClass(), "valid", false);
        setField(term363469, term363469.getClass(), "dropTarget", null);
        setField(term363469, term363469.getClass(), "popups", null);
        setField(term363469, term363469.getClass(), "name", null);
        setBooleanField(term363469, term363469.getClass(), "nameExplicitlySet", false);
        setBooleanField(term363469, term363469.getClass(), "focusable", false);
        setIntField(term363469, term363469.getClass(), "isFocusTraversableOverridden", 0);
        setField(term363469, term363469.getClass(), "focusTraversalKeys", null);
        setBooleanField(term363469, term363469.getClass(), "focusTraversalKeysEnabled", false);
        setField(term363469, term363469.getClass(), "acc", null);
        setField(term363469, term363469.getClass(), "minSize", null);
        setBooleanField(term363469, term363469.getClass(), "minSizeSet", false);
        setField(term363469, term363469.getClass(), "prefSize", null);
        setBooleanField(term363469, term363469.getClass(), "prefSizeSet", false);
        setField(term363469, term363469.getClass(), "maxSize", null);
        setBooleanField(term363469, term363469.getClass(), "maxSizeSet", false);
        setField(term363469, term363469.getClass(), "componentOrientation", null);
        setBooleanField(term363469, term363469.getClass(), "newEventsOnly", false);
        setField(term363469, term363469.getClass(), "componentListener", null);
        setField(term363469, term363469.getClass(), "focusListener", null);
        setField(term363469, term363469.getClass(), "hierarchyListener", null);
        setField(term363469, term363469.getClass(), "hierarchyBoundsListener", null);
        setField(term363469, term363469.getClass(), "keyListener", null);
        setField(term363469, term363469.getClass(), "mouseListener", null);
        setField(term363469, term363469.getClass(), "mouseMotionListener", null);
        setField(term363469, term363469.getClass(), "mouseWheelListener", null);
        setField(term363469, term363469.getClass(), "inputMethodListener", null);
        setLongField(term363469, term363469.getClass(), "eventMask", 0L);
        setField(term363469, term363469.getClass(), "changeSupport", null);
        setField(term363469, term363469.getClass(), "objectLock", null);
        setBooleanField(term363469, term363469.getClass(), "isPacked", false);
        setIntField(term363469, term363469.getClass(), "boundsOp", 0);
        setField(term363469, term363469.getClass(), "compoundShape", null);
        setField(term363469, term363469.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term363469, term363469.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term363469, term363469.getClass(), "backgroundEraseDisabled", false);
        setField(term363469, term363469.getClass(), "eventCache", null);
        setBooleanField(term363469, term363469.getClass(), "coalescingEnabled", false);
        setBooleanField(term363469, term363469.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term363469, term363469.getClass(), "componentSerializedDataVersion", 0);
        setField(term363469, term363469.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.GalaxyCreationView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "estimateGalaxySizeToolTip", argTypes, term363469, args);
    }

};


