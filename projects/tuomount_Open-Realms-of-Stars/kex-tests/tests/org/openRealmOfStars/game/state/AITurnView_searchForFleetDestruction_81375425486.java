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

public class AITurnView_searchForFleetDestruction_81375425486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1377947;

    public AITurnView_searchForFleetDestruction_81375425486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1377947 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1377947, term1377947.getClass(), "label", null);
        setField(term1377947, term1377947.getClass(), "game", null);
        setIntField(term1377947, term1377947.getClass(), "textAnim", 0);
        setIntField(term1377947, term1377947.getClass(), "cx", 0);
        setIntField(term1377947, term1377947.getClass(), "cy", 0);
        setField(term1377947, term1377947.getClass(), "aiThread", null);
        setBooleanField(term1377947, term1377947.getClass(), "readyToMove", false);
        setField(term1377947, term1377947.getClass(), "nextState", null);
        setField(term1377947, term1377947.getClass(), "nextStateObject", null);
        setBooleanField(term1377947, term1377947.getClass(), "isAlignmentXSet", false);
        setFloatField(term1377947, term1377947.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1377947, term1377947.getClass(), "isAlignmentYSet", false);
        setFloatField(term1377947, term1377947.getClass(), "alignmentY", 0.0F);
        setField(term1377947, term1377947.getClass(), "ui", null);
        setField(term1377947, term1377947.getClass(), "listenerList", null);
        setField(term1377947, term1377947.getClass(), "clientProperties", null);
        setField(term1377947, term1377947.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1377947, term1377947.getClass(), "autoscrolls", false);
        setField(term1377947, term1377947.getClass(), "border", null);
        setIntField(term1377947, term1377947.getClass(), "flags", 0);
        setField(term1377947, term1377947.getClass(), "inputVerifier", null);
        setBooleanField(term1377947, term1377947.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1377947, term1377947.getClass(), "paintingChild", null);
        setField(term1377947, term1377947.getClass(), "popupMenu", null);
        setField(term1377947, term1377947.getClass(), "revalidateRunnableScheduled", null);
        setField(term1377947, term1377947.getClass(), "focusInputMap", null);
        setField(term1377947, term1377947.getClass(), "ancestorInputMap", null);
        setField(term1377947, term1377947.getClass(), "windowInputMap", null);
        setField(term1377947, term1377947.getClass(), "actionMap", null);
        setField(term1377947, term1377947.getClass(), "aaHint", null);
        setField(term1377947, term1377947.getClass(), "lcdRenderingHint", null);
        setField(term1377947, term1377947.getClass(), "component", null);
        setField(term1377947, term1377947.getClass(), "layoutMgr", null);
        setField(term1377947, term1377947.getClass(), "dispatcher", null);
        setField(term1377947, term1377947.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1377947, term1377947.getClass(), "focusCycleRoot", false);
        setBooleanField(term1377947, term1377947.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1377947, term1377947.getClass(), "printingThreads", null);
        setBooleanField(term1377947, term1377947.getClass(), "printing", false);
        setField(term1377947, term1377947.getClass(), "containerListener", null);
        setIntField(term1377947, term1377947.getClass(), "listeningChildren", 0);
        setIntField(term1377947, term1377947.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1377947, term1377947.getClass(), "descendantsCount", 0);
        setField(term1377947, term1377947.getClass(), "preserveBackgroundColor", null);
        setIntField(term1377947, term1377947.getClass(), "numOfHWComponents", 0);
        setIntField(term1377947, term1377947.getClass(), "numOfLWComponents", 0);
        setField(term1377947, term1377947.getClass(), "modalComp", null);
        setField(term1377947, term1377947.getClass(), "modalAppContext", null);
        setIntField(term1377947, term1377947.getClass(), "containerSerializedDataVersion", 0);
        setField(term1377947, term1377947.getClass(), "peer", null);
        setField(term1377947, term1377947.getClass(), "parent", null);
        setField(term1377947, term1377947.getClass(), "appContext", null);
        setIntField(term1377947, term1377947.getClass(), "x", 0);
        setIntField(term1377947, term1377947.getClass(), "y", 0);
        setIntField(term1377947, term1377947.getClass(), "width", 0);
        setIntField(term1377947, term1377947.getClass(), "height", 0);
        setField(term1377947, term1377947.getClass(), "foreground", null);
        setField(term1377947, term1377947.getClass(), "background", null);
        setField(term1377947, term1377947.getClass(), "font", null);
        setField(term1377947, term1377947.getClass(), "peerFont", null);
        setField(term1377947, term1377947.getClass(), "cursor", null);
        setField(term1377947, term1377947.getClass(), "locale", null);
        setField(term1377947, term1377947.getClass(), "graphicsConfig", null);
        setField(term1377947, term1377947.getClass(), "bufferStrategy", null);
        setBooleanField(term1377947, term1377947.getClass(), "ignoreRepaint", false);
        setBooleanField(term1377947, term1377947.getClass(), "visible", false);
        setBooleanField(term1377947, term1377947.getClass(), "enabled", false);
        setBooleanField(term1377947, term1377947.getClass(), "valid", false);
        setField(term1377947, term1377947.getClass(), "dropTarget", null);
        setField(term1377947, term1377947.getClass(), "popups", null);
        setField(term1377947, term1377947.getClass(), "name", null);
        setBooleanField(term1377947, term1377947.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1377947, term1377947.getClass(), "focusable", false);
        setIntField(term1377947, term1377947.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1377947, term1377947.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1377947, term1377947.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1377947, term1377947.getClass(), "acc", null);
        setField(term1377947, term1377947.getClass(), "minSize", null);
        setBooleanField(term1377947, term1377947.getClass(), "minSizeSet", false);
        setField(term1377947, term1377947.getClass(), "prefSize", null);
        setBooleanField(term1377947, term1377947.getClass(), "prefSizeSet", false);
        setField(term1377947, term1377947.getClass(), "maxSize", null);
        setBooleanField(term1377947, term1377947.getClass(), "maxSizeSet", false);
        setField(term1377947, term1377947.getClass(), "componentOrientation", null);
        setBooleanField(term1377947, term1377947.getClass(), "newEventsOnly", false);
        setField(term1377947, term1377947.getClass(), "componentListener", null);
        setField(term1377947, term1377947.getClass(), "focusListener", null);
        setField(term1377947, term1377947.getClass(), "hierarchyListener", null);
        setField(term1377947, term1377947.getClass(), "hierarchyBoundsListener", null);
        setField(term1377947, term1377947.getClass(), "keyListener", null);
        setField(term1377947, term1377947.getClass(), "mouseListener", null);
        setField(term1377947, term1377947.getClass(), "mouseMotionListener", null);
        setField(term1377947, term1377947.getClass(), "mouseWheelListener", null);
        setField(term1377947, term1377947.getClass(), "inputMethodListener", null);
        setLongField(term1377947, term1377947.getClass(), "eventMask", 0L);
        setField(term1377947, term1377947.getClass(), "changeSupport", null);
        setField(term1377947, term1377947.getClass(), "objectLock", null);
        setBooleanField(term1377947, term1377947.getClass(), "isPacked", false);
        setIntField(term1377947, term1377947.getClass(), "boundsOp", 0);
        setField(term1377947, term1377947.getClass(), "compoundShape", null);
        setField(term1377947, term1377947.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1377947, term1377947.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1377947, term1377947.getClass(), "backgroundEraseDisabled", false);
        setField(term1377947, term1377947.getClass(), "eventCache", null);
        setBooleanField(term1377947, term1377947.getClass(), "coalescingEnabled", false);
        setBooleanField(term1377947, term1377947.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1377947, term1377947.getClass(), "componentSerializedDataVersion", 0);
        setField(term1377947, term1377947.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "searchForFleetDestruction", argTypes, term1377947, args);
    }

};


