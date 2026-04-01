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

public class AITurnView_getNextState_777679202109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1378984;

    public AITurnView_getNextState_777679202109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1378984 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1378984, term1378984.getClass(), "label", null);
        setField(term1378984, term1378984.getClass(), "game", null);
        setIntField(term1378984, term1378984.getClass(), "textAnim", 0);
        setIntField(term1378984, term1378984.getClass(), "cx", 0);
        setIntField(term1378984, term1378984.getClass(), "cy", 0);
        setField(term1378984, term1378984.getClass(), "aiThread", null);
        setBooleanField(term1378984, term1378984.getClass(), "readyToMove", false);
        setField(term1378984, term1378984.getClass(), "nextState", null);
        setField(term1378984, term1378984.getClass(), "nextStateObject", null);
        setBooleanField(term1378984, term1378984.getClass(), "isAlignmentXSet", false);
        setFloatField(term1378984, term1378984.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1378984, term1378984.getClass(), "isAlignmentYSet", false);
        setFloatField(term1378984, term1378984.getClass(), "alignmentY", 0.0F);
        setField(term1378984, term1378984.getClass(), "ui", null);
        setField(term1378984, term1378984.getClass(), "listenerList", null);
        setField(term1378984, term1378984.getClass(), "clientProperties", null);
        setField(term1378984, term1378984.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1378984, term1378984.getClass(), "autoscrolls", false);
        setField(term1378984, term1378984.getClass(), "border", null);
        setIntField(term1378984, term1378984.getClass(), "flags", 0);
        setField(term1378984, term1378984.getClass(), "inputVerifier", null);
        setBooleanField(term1378984, term1378984.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1378984, term1378984.getClass(), "paintingChild", null);
        setField(term1378984, term1378984.getClass(), "popupMenu", null);
        setField(term1378984, term1378984.getClass(), "revalidateRunnableScheduled", null);
        setField(term1378984, term1378984.getClass(), "focusInputMap", null);
        setField(term1378984, term1378984.getClass(), "ancestorInputMap", null);
        setField(term1378984, term1378984.getClass(), "windowInputMap", null);
        setField(term1378984, term1378984.getClass(), "actionMap", null);
        setField(term1378984, term1378984.getClass(), "aaHint", null);
        setField(term1378984, term1378984.getClass(), "lcdRenderingHint", null);
        setField(term1378984, term1378984.getClass(), "component", null);
        setField(term1378984, term1378984.getClass(), "layoutMgr", null);
        setField(term1378984, term1378984.getClass(), "dispatcher", null);
        setField(term1378984, term1378984.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1378984, term1378984.getClass(), "focusCycleRoot", false);
        setBooleanField(term1378984, term1378984.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1378984, term1378984.getClass(), "printingThreads", null);
        setBooleanField(term1378984, term1378984.getClass(), "printing", false);
        setField(term1378984, term1378984.getClass(), "containerListener", null);
        setIntField(term1378984, term1378984.getClass(), "listeningChildren", 0);
        setIntField(term1378984, term1378984.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1378984, term1378984.getClass(), "descendantsCount", 0);
        setField(term1378984, term1378984.getClass(), "preserveBackgroundColor", null);
        setIntField(term1378984, term1378984.getClass(), "numOfHWComponents", 0);
        setIntField(term1378984, term1378984.getClass(), "numOfLWComponents", 0);
        setField(term1378984, term1378984.getClass(), "modalComp", null);
        setField(term1378984, term1378984.getClass(), "modalAppContext", null);
        setIntField(term1378984, term1378984.getClass(), "containerSerializedDataVersion", 0);
        setField(term1378984, term1378984.getClass(), "peer", null);
        setField(term1378984, term1378984.getClass(), "parent", null);
        setField(term1378984, term1378984.getClass(), "appContext", null);
        setIntField(term1378984, term1378984.getClass(), "x", 0);
        setIntField(term1378984, term1378984.getClass(), "y", 0);
        setIntField(term1378984, term1378984.getClass(), "width", 0);
        setIntField(term1378984, term1378984.getClass(), "height", 0);
        setField(term1378984, term1378984.getClass(), "foreground", null);
        setField(term1378984, term1378984.getClass(), "background", null);
        setField(term1378984, term1378984.getClass(), "font", null);
        setField(term1378984, term1378984.getClass(), "peerFont", null);
        setField(term1378984, term1378984.getClass(), "cursor", null);
        setField(term1378984, term1378984.getClass(), "locale", null);
        setField(term1378984, term1378984.getClass(), "graphicsConfig", null);
        setField(term1378984, term1378984.getClass(), "bufferStrategy", null);
        setBooleanField(term1378984, term1378984.getClass(), "ignoreRepaint", false);
        setBooleanField(term1378984, term1378984.getClass(), "visible", false);
        setBooleanField(term1378984, term1378984.getClass(), "enabled", false);
        setBooleanField(term1378984, term1378984.getClass(), "valid", false);
        setField(term1378984, term1378984.getClass(), "dropTarget", null);
        setField(term1378984, term1378984.getClass(), "popups", null);
        setField(term1378984, term1378984.getClass(), "name", null);
        setBooleanField(term1378984, term1378984.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1378984, term1378984.getClass(), "focusable", false);
        setIntField(term1378984, term1378984.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1378984, term1378984.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1378984, term1378984.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1378984, term1378984.getClass(), "acc", null);
        setField(term1378984, term1378984.getClass(), "minSize", null);
        setBooleanField(term1378984, term1378984.getClass(), "minSizeSet", false);
        setField(term1378984, term1378984.getClass(), "prefSize", null);
        setBooleanField(term1378984, term1378984.getClass(), "prefSizeSet", false);
        setField(term1378984, term1378984.getClass(), "maxSize", null);
        setBooleanField(term1378984, term1378984.getClass(), "maxSizeSet", false);
        setField(term1378984, term1378984.getClass(), "componentOrientation", null);
        setBooleanField(term1378984, term1378984.getClass(), "newEventsOnly", false);
        setField(term1378984, term1378984.getClass(), "componentListener", null);
        setField(term1378984, term1378984.getClass(), "focusListener", null);
        setField(term1378984, term1378984.getClass(), "hierarchyListener", null);
        setField(term1378984, term1378984.getClass(), "hierarchyBoundsListener", null);
        setField(term1378984, term1378984.getClass(), "keyListener", null);
        setField(term1378984, term1378984.getClass(), "mouseListener", null);
        setField(term1378984, term1378984.getClass(), "mouseMotionListener", null);
        setField(term1378984, term1378984.getClass(), "mouseWheelListener", null);
        setField(term1378984, term1378984.getClass(), "inputMethodListener", null);
        setLongField(term1378984, term1378984.getClass(), "eventMask", 0L);
        setField(term1378984, term1378984.getClass(), "changeSupport", null);
        setField(term1378984, term1378984.getClass(), "objectLock", null);
        setBooleanField(term1378984, term1378984.getClass(), "isPacked", false);
        setIntField(term1378984, term1378984.getClass(), "boundsOp", 0);
        setField(term1378984, term1378984.getClass(), "compoundShape", null);
        setField(term1378984, term1378984.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1378984, term1378984.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1378984, term1378984.getClass(), "backgroundEraseDisabled", false);
        setField(term1378984, term1378984.getClass(), "eventCache", null);
        setBooleanField(term1378984, term1378984.getClass(), "coalescingEnabled", false);
        setBooleanField(term1378984, term1378984.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1378984, term1378984.getClass(), "componentSerializedDataVersion", 0);
        setField(term1378984, term1378984.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNextState", argTypes, term1378984, args);
    }

};


