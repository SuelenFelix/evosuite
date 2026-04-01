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

public class AITurnView_getNextStateObject_1335192051110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1379029;

    public AITurnView_getNextStateObject_1335192051110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1379029 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1379029, term1379029.getClass(), "label", null);
        setField(term1379029, term1379029.getClass(), "game", null);
        setIntField(term1379029, term1379029.getClass(), "textAnim", 0);
        setIntField(term1379029, term1379029.getClass(), "cx", 0);
        setIntField(term1379029, term1379029.getClass(), "cy", 0);
        setField(term1379029, term1379029.getClass(), "aiThread", null);
        setBooleanField(term1379029, term1379029.getClass(), "readyToMove", false);
        setField(term1379029, term1379029.getClass(), "nextState", null);
        setField(term1379029, term1379029.getClass(), "nextStateObject", null);
        setBooleanField(term1379029, term1379029.getClass(), "isAlignmentXSet", false);
        setFloatField(term1379029, term1379029.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1379029, term1379029.getClass(), "isAlignmentYSet", false);
        setFloatField(term1379029, term1379029.getClass(), "alignmentY", 0.0F);
        setField(term1379029, term1379029.getClass(), "ui", null);
        setField(term1379029, term1379029.getClass(), "listenerList", null);
        setField(term1379029, term1379029.getClass(), "clientProperties", null);
        setField(term1379029, term1379029.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1379029, term1379029.getClass(), "autoscrolls", false);
        setField(term1379029, term1379029.getClass(), "border", null);
        setIntField(term1379029, term1379029.getClass(), "flags", 0);
        setField(term1379029, term1379029.getClass(), "inputVerifier", null);
        setBooleanField(term1379029, term1379029.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1379029, term1379029.getClass(), "paintingChild", null);
        setField(term1379029, term1379029.getClass(), "popupMenu", null);
        setField(term1379029, term1379029.getClass(), "revalidateRunnableScheduled", null);
        setField(term1379029, term1379029.getClass(), "focusInputMap", null);
        setField(term1379029, term1379029.getClass(), "ancestorInputMap", null);
        setField(term1379029, term1379029.getClass(), "windowInputMap", null);
        setField(term1379029, term1379029.getClass(), "actionMap", null);
        setField(term1379029, term1379029.getClass(), "aaHint", null);
        setField(term1379029, term1379029.getClass(), "lcdRenderingHint", null);
        setField(term1379029, term1379029.getClass(), "component", null);
        setField(term1379029, term1379029.getClass(), "layoutMgr", null);
        setField(term1379029, term1379029.getClass(), "dispatcher", null);
        setField(term1379029, term1379029.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1379029, term1379029.getClass(), "focusCycleRoot", false);
        setBooleanField(term1379029, term1379029.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1379029, term1379029.getClass(), "printingThreads", null);
        setBooleanField(term1379029, term1379029.getClass(), "printing", false);
        setField(term1379029, term1379029.getClass(), "containerListener", null);
        setIntField(term1379029, term1379029.getClass(), "listeningChildren", 0);
        setIntField(term1379029, term1379029.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1379029, term1379029.getClass(), "descendantsCount", 0);
        setField(term1379029, term1379029.getClass(), "preserveBackgroundColor", null);
        setIntField(term1379029, term1379029.getClass(), "numOfHWComponents", 0);
        setIntField(term1379029, term1379029.getClass(), "numOfLWComponents", 0);
        setField(term1379029, term1379029.getClass(), "modalComp", null);
        setField(term1379029, term1379029.getClass(), "modalAppContext", null);
        setIntField(term1379029, term1379029.getClass(), "containerSerializedDataVersion", 0);
        setField(term1379029, term1379029.getClass(), "peer", null);
        setField(term1379029, term1379029.getClass(), "parent", null);
        setField(term1379029, term1379029.getClass(), "appContext", null);
        setIntField(term1379029, term1379029.getClass(), "x", 0);
        setIntField(term1379029, term1379029.getClass(), "y", 0);
        setIntField(term1379029, term1379029.getClass(), "width", 0);
        setIntField(term1379029, term1379029.getClass(), "height", 0);
        setField(term1379029, term1379029.getClass(), "foreground", null);
        setField(term1379029, term1379029.getClass(), "background", null);
        setField(term1379029, term1379029.getClass(), "font", null);
        setField(term1379029, term1379029.getClass(), "peerFont", null);
        setField(term1379029, term1379029.getClass(), "cursor", null);
        setField(term1379029, term1379029.getClass(), "locale", null);
        setField(term1379029, term1379029.getClass(), "graphicsConfig", null);
        setField(term1379029, term1379029.getClass(), "bufferStrategy", null);
        setBooleanField(term1379029, term1379029.getClass(), "ignoreRepaint", false);
        setBooleanField(term1379029, term1379029.getClass(), "visible", false);
        setBooleanField(term1379029, term1379029.getClass(), "enabled", false);
        setBooleanField(term1379029, term1379029.getClass(), "valid", false);
        setField(term1379029, term1379029.getClass(), "dropTarget", null);
        setField(term1379029, term1379029.getClass(), "popups", null);
        setField(term1379029, term1379029.getClass(), "name", null);
        setBooleanField(term1379029, term1379029.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1379029, term1379029.getClass(), "focusable", false);
        setIntField(term1379029, term1379029.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1379029, term1379029.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1379029, term1379029.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1379029, term1379029.getClass(), "acc", null);
        setField(term1379029, term1379029.getClass(), "minSize", null);
        setBooleanField(term1379029, term1379029.getClass(), "minSizeSet", false);
        setField(term1379029, term1379029.getClass(), "prefSize", null);
        setBooleanField(term1379029, term1379029.getClass(), "prefSizeSet", false);
        setField(term1379029, term1379029.getClass(), "maxSize", null);
        setBooleanField(term1379029, term1379029.getClass(), "maxSizeSet", false);
        setField(term1379029, term1379029.getClass(), "componentOrientation", null);
        setBooleanField(term1379029, term1379029.getClass(), "newEventsOnly", false);
        setField(term1379029, term1379029.getClass(), "componentListener", null);
        setField(term1379029, term1379029.getClass(), "focusListener", null);
        setField(term1379029, term1379029.getClass(), "hierarchyListener", null);
        setField(term1379029, term1379029.getClass(), "hierarchyBoundsListener", null);
        setField(term1379029, term1379029.getClass(), "keyListener", null);
        setField(term1379029, term1379029.getClass(), "mouseListener", null);
        setField(term1379029, term1379029.getClass(), "mouseMotionListener", null);
        setField(term1379029, term1379029.getClass(), "mouseWheelListener", null);
        setField(term1379029, term1379029.getClass(), "inputMethodListener", null);
        setLongField(term1379029, term1379029.getClass(), "eventMask", 0L);
        setField(term1379029, term1379029.getClass(), "changeSupport", null);
        setField(term1379029, term1379029.getClass(), "objectLock", null);
        setBooleanField(term1379029, term1379029.getClass(), "isPacked", false);
        setIntField(term1379029, term1379029.getClass(), "boundsOp", 0);
        setField(term1379029, term1379029.getClass(), "compoundShape", null);
        setField(term1379029, term1379029.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1379029, term1379029.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1379029, term1379029.getClass(), "backgroundEraseDisabled", false);
        setField(term1379029, term1379029.getClass(), "eventCache", null);
        setBooleanField(term1379029, term1379029.getClass(), "coalescingEnabled", false);
        setBooleanField(term1379029, term1379029.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1379029, term1379029.getClass(), "componentSerializedDataVersion", 0);
        setField(term1379029, term1379029.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNextStateObject", argTypes, term1379029, args);
    }

};


