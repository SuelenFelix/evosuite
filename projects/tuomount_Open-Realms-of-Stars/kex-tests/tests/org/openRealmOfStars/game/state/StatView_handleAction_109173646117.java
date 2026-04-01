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

public class StatView_handleAction_109173646117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term376724;

    public StatView_handleAction_109173646117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term376724 = newInstance(Class.forName("org.openRealmOfStars.game.state.StatView"));
        setField(term376724, term376724.getClass(), "backBtn", null);
        setBooleanField(term376724, term376724.getClass(), "highestScore", false);
        setBooleanField(term376724, term376724.getClass(), "highestCulture", false);
        setBooleanField(term376724, term376724.getClass(), "highestHomePlanets", false);
        setBooleanField(term376724, term376724.getClass(), "highestTowers", false);
        setBooleanField(term376724, term376724.getClass(), "highestScience", false);
        setBooleanField(term376724, term376724.getClass(), "highestPopulation", false);
        setField(term376724, term376724.getClass(), "starMap", null);
        setField(term376724, term376724.getClass(), "winningCombo", null);
        setBooleanField(term376724, term376724.getClass(), "isAlignmentXSet", false);
        setFloatField(term376724, term376724.getClass(), "alignmentX", 0.0F);
        setBooleanField(term376724, term376724.getClass(), "isAlignmentYSet", false);
        setFloatField(term376724, term376724.getClass(), "alignmentY", 0.0F);
        setField(term376724, term376724.getClass(), "ui", null);
        setField(term376724, term376724.getClass(), "listenerList", null);
        setField(term376724, term376724.getClass(), "clientProperties", null);
        setField(term376724, term376724.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term376724, term376724.getClass(), "autoscrolls", false);
        setField(term376724, term376724.getClass(), "border", null);
        setIntField(term376724, term376724.getClass(), "flags", 0);
        setField(term376724, term376724.getClass(), "inputVerifier", null);
        setBooleanField(term376724, term376724.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term376724, term376724.getClass(), "paintingChild", null);
        setField(term376724, term376724.getClass(), "popupMenu", null);
        setField(term376724, term376724.getClass(), "revalidateRunnableScheduled", null);
        setField(term376724, term376724.getClass(), "focusInputMap", null);
        setField(term376724, term376724.getClass(), "ancestorInputMap", null);
        setField(term376724, term376724.getClass(), "windowInputMap", null);
        setField(term376724, term376724.getClass(), "actionMap", null);
        setField(term376724, term376724.getClass(), "aaHint", null);
        setField(term376724, term376724.getClass(), "lcdRenderingHint", null);
        setField(term376724, term376724.getClass(), "component", null);
        setField(term376724, term376724.getClass(), "layoutMgr", null);
        setField(term376724, term376724.getClass(), "dispatcher", null);
        setField(term376724, term376724.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term376724, term376724.getClass(), "focusCycleRoot", false);
        setBooleanField(term376724, term376724.getClass(), "focusTraversalPolicyProvider", false);
        setField(term376724, term376724.getClass(), "printingThreads", null);
        setBooleanField(term376724, term376724.getClass(), "printing", false);
        setField(term376724, term376724.getClass(), "containerListener", null);
        setIntField(term376724, term376724.getClass(), "listeningChildren", 0);
        setIntField(term376724, term376724.getClass(), "listeningBoundsChildren", 0);
        setIntField(term376724, term376724.getClass(), "descendantsCount", 0);
        setField(term376724, term376724.getClass(), "preserveBackgroundColor", null);
        setIntField(term376724, term376724.getClass(), "numOfHWComponents", 0);
        setIntField(term376724, term376724.getClass(), "numOfLWComponents", 0);
        setField(term376724, term376724.getClass(), "modalComp", null);
        setField(term376724, term376724.getClass(), "modalAppContext", null);
        setIntField(term376724, term376724.getClass(), "containerSerializedDataVersion", 0);
        setField(term376724, term376724.getClass(), "peer", null);
        setField(term376724, term376724.getClass(), "parent", null);
        setField(term376724, term376724.getClass(), "appContext", null);
        setIntField(term376724, term376724.getClass(), "x", 0);
        setIntField(term376724, term376724.getClass(), "y", 0);
        setIntField(term376724, term376724.getClass(), "width", 0);
        setIntField(term376724, term376724.getClass(), "height", 0);
        setField(term376724, term376724.getClass(), "foreground", null);
        setField(term376724, term376724.getClass(), "background", null);
        setField(term376724, term376724.getClass(), "font", null);
        setField(term376724, term376724.getClass(), "peerFont", null);
        setField(term376724, term376724.getClass(), "cursor", null);
        setField(term376724, term376724.getClass(), "locale", null);
        setField(term376724, term376724.getClass(), "graphicsConfig", null);
        setField(term376724, term376724.getClass(), "bufferStrategy", null);
        setBooleanField(term376724, term376724.getClass(), "ignoreRepaint", false);
        setBooleanField(term376724, term376724.getClass(), "visible", false);
        setBooleanField(term376724, term376724.getClass(), "enabled", false);
        setBooleanField(term376724, term376724.getClass(), "valid", false);
        setField(term376724, term376724.getClass(), "dropTarget", null);
        setField(term376724, term376724.getClass(), "popups", null);
        setField(term376724, term376724.getClass(), "name", null);
        setBooleanField(term376724, term376724.getClass(), "nameExplicitlySet", false);
        setBooleanField(term376724, term376724.getClass(), "focusable", false);
        setIntField(term376724, term376724.getClass(), "isFocusTraversableOverridden", 0);
        setField(term376724, term376724.getClass(), "focusTraversalKeys", null);
        setBooleanField(term376724, term376724.getClass(), "focusTraversalKeysEnabled", false);
        setField(term376724, term376724.getClass(), "acc", null);
        setField(term376724, term376724.getClass(), "minSize", null);
        setBooleanField(term376724, term376724.getClass(), "minSizeSet", false);
        setField(term376724, term376724.getClass(), "prefSize", null);
        setBooleanField(term376724, term376724.getClass(), "prefSizeSet", false);
        setField(term376724, term376724.getClass(), "maxSize", null);
        setBooleanField(term376724, term376724.getClass(), "maxSizeSet", false);
        setField(term376724, term376724.getClass(), "componentOrientation", null);
        setBooleanField(term376724, term376724.getClass(), "newEventsOnly", false);
        setField(term376724, term376724.getClass(), "componentListener", null);
        setField(term376724, term376724.getClass(), "focusListener", null);
        setField(term376724, term376724.getClass(), "hierarchyListener", null);
        setField(term376724, term376724.getClass(), "hierarchyBoundsListener", null);
        setField(term376724, term376724.getClass(), "keyListener", null);
        setField(term376724, term376724.getClass(), "mouseListener", null);
        setField(term376724, term376724.getClass(), "mouseMotionListener", null);
        setField(term376724, term376724.getClass(), "mouseWheelListener", null);
        setField(term376724, term376724.getClass(), "inputMethodListener", null);
        setLongField(term376724, term376724.getClass(), "eventMask", 0L);
        setField(term376724, term376724.getClass(), "changeSupport", null);
        setField(term376724, term376724.getClass(), "objectLock", null);
        setBooleanField(term376724, term376724.getClass(), "isPacked", false);
        setIntField(term376724, term376724.getClass(), "boundsOp", 0);
        setField(term376724, term376724.getClass(), "compoundShape", null);
        setField(term376724, term376724.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term376724, term376724.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term376724, term376724.getClass(), "backgroundEraseDisabled", false);
        setField(term376724, term376724.getClass(), "eventCache", null);
        setBooleanField(term376724, term376724.getClass(), "coalescingEnabled", false);
        setBooleanField(term376724, term376724.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term376724, term376724.getClass(), "componentSerializedDataVersion", 0);
        setField(term376724, term376724.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.StatView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleAction", argTypes, term376724, args);
    }

};


