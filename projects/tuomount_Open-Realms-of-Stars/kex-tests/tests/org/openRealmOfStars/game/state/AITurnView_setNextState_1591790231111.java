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

public class AITurnView_setNextState_1591790231111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1379074;

    public AITurnView_setNextState_1591790231111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1379074 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1379074, term1379074.getClass(), "label", null);
        setField(term1379074, term1379074.getClass(), "game", null);
        setIntField(term1379074, term1379074.getClass(), "textAnim", 0);
        setIntField(term1379074, term1379074.getClass(), "cx", 0);
        setIntField(term1379074, term1379074.getClass(), "cy", 0);
        setField(term1379074, term1379074.getClass(), "aiThread", null);
        setBooleanField(term1379074, term1379074.getClass(), "readyToMove", false);
        setField(term1379074, term1379074.getClass(), "nextState", null);
        setField(term1379074, term1379074.getClass(), "nextStateObject", null);
        setBooleanField(term1379074, term1379074.getClass(), "isAlignmentXSet", false);
        setFloatField(term1379074, term1379074.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1379074, term1379074.getClass(), "isAlignmentYSet", false);
        setFloatField(term1379074, term1379074.getClass(), "alignmentY", 0.0F);
        setField(term1379074, term1379074.getClass(), "ui", null);
        setField(term1379074, term1379074.getClass(), "listenerList", null);
        setField(term1379074, term1379074.getClass(), "clientProperties", null);
        setField(term1379074, term1379074.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1379074, term1379074.getClass(), "autoscrolls", false);
        setField(term1379074, term1379074.getClass(), "border", null);
        setIntField(term1379074, term1379074.getClass(), "flags", 0);
        setField(term1379074, term1379074.getClass(), "inputVerifier", null);
        setBooleanField(term1379074, term1379074.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1379074, term1379074.getClass(), "paintingChild", null);
        setField(term1379074, term1379074.getClass(), "popupMenu", null);
        setField(term1379074, term1379074.getClass(), "revalidateRunnableScheduled", null);
        setField(term1379074, term1379074.getClass(), "focusInputMap", null);
        setField(term1379074, term1379074.getClass(), "ancestorInputMap", null);
        setField(term1379074, term1379074.getClass(), "windowInputMap", null);
        setField(term1379074, term1379074.getClass(), "actionMap", null);
        setField(term1379074, term1379074.getClass(), "aaHint", null);
        setField(term1379074, term1379074.getClass(), "lcdRenderingHint", null);
        setField(term1379074, term1379074.getClass(), "component", null);
        setField(term1379074, term1379074.getClass(), "layoutMgr", null);
        setField(term1379074, term1379074.getClass(), "dispatcher", null);
        setField(term1379074, term1379074.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1379074, term1379074.getClass(), "focusCycleRoot", false);
        setBooleanField(term1379074, term1379074.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1379074, term1379074.getClass(), "printingThreads", null);
        setBooleanField(term1379074, term1379074.getClass(), "printing", false);
        setField(term1379074, term1379074.getClass(), "containerListener", null);
        setIntField(term1379074, term1379074.getClass(), "listeningChildren", 0);
        setIntField(term1379074, term1379074.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1379074, term1379074.getClass(), "descendantsCount", 0);
        setField(term1379074, term1379074.getClass(), "preserveBackgroundColor", null);
        setIntField(term1379074, term1379074.getClass(), "numOfHWComponents", 0);
        setIntField(term1379074, term1379074.getClass(), "numOfLWComponents", 0);
        setField(term1379074, term1379074.getClass(), "modalComp", null);
        setField(term1379074, term1379074.getClass(), "modalAppContext", null);
        setIntField(term1379074, term1379074.getClass(), "containerSerializedDataVersion", 0);
        setField(term1379074, term1379074.getClass(), "peer", null);
        setField(term1379074, term1379074.getClass(), "parent", null);
        setField(term1379074, term1379074.getClass(), "appContext", null);
        setIntField(term1379074, term1379074.getClass(), "x", 0);
        setIntField(term1379074, term1379074.getClass(), "y", 0);
        setIntField(term1379074, term1379074.getClass(), "width", 0);
        setIntField(term1379074, term1379074.getClass(), "height", 0);
        setField(term1379074, term1379074.getClass(), "foreground", null);
        setField(term1379074, term1379074.getClass(), "background", null);
        setField(term1379074, term1379074.getClass(), "font", null);
        setField(term1379074, term1379074.getClass(), "peerFont", null);
        setField(term1379074, term1379074.getClass(), "cursor", null);
        setField(term1379074, term1379074.getClass(), "locale", null);
        setField(term1379074, term1379074.getClass(), "graphicsConfig", null);
        setField(term1379074, term1379074.getClass(), "bufferStrategy", null);
        setBooleanField(term1379074, term1379074.getClass(), "ignoreRepaint", false);
        setBooleanField(term1379074, term1379074.getClass(), "visible", false);
        setBooleanField(term1379074, term1379074.getClass(), "enabled", false);
        setBooleanField(term1379074, term1379074.getClass(), "valid", false);
        setField(term1379074, term1379074.getClass(), "dropTarget", null);
        setField(term1379074, term1379074.getClass(), "popups", null);
        setField(term1379074, term1379074.getClass(), "name", null);
        setBooleanField(term1379074, term1379074.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1379074, term1379074.getClass(), "focusable", false);
        setIntField(term1379074, term1379074.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1379074, term1379074.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1379074, term1379074.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1379074, term1379074.getClass(), "acc", null);
        setField(term1379074, term1379074.getClass(), "minSize", null);
        setBooleanField(term1379074, term1379074.getClass(), "minSizeSet", false);
        setField(term1379074, term1379074.getClass(), "prefSize", null);
        setBooleanField(term1379074, term1379074.getClass(), "prefSizeSet", false);
        setField(term1379074, term1379074.getClass(), "maxSize", null);
        setBooleanField(term1379074, term1379074.getClass(), "maxSizeSet", false);
        setField(term1379074, term1379074.getClass(), "componentOrientation", null);
        setBooleanField(term1379074, term1379074.getClass(), "newEventsOnly", false);
        setField(term1379074, term1379074.getClass(), "componentListener", null);
        setField(term1379074, term1379074.getClass(), "focusListener", null);
        setField(term1379074, term1379074.getClass(), "hierarchyListener", null);
        setField(term1379074, term1379074.getClass(), "hierarchyBoundsListener", null);
        setField(term1379074, term1379074.getClass(), "keyListener", null);
        setField(term1379074, term1379074.getClass(), "mouseListener", null);
        setField(term1379074, term1379074.getClass(), "mouseMotionListener", null);
        setField(term1379074, term1379074.getClass(), "mouseWheelListener", null);
        setField(term1379074, term1379074.getClass(), "inputMethodListener", null);
        setLongField(term1379074, term1379074.getClass(), "eventMask", 0L);
        setField(term1379074, term1379074.getClass(), "changeSupport", null);
        setField(term1379074, term1379074.getClass(), "objectLock", null);
        setBooleanField(term1379074, term1379074.getClass(), "isPacked", false);
        setIntField(term1379074, term1379074.getClass(), "boundsOp", 0);
        setField(term1379074, term1379074.getClass(), "compoundShape", null);
        setField(term1379074, term1379074.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1379074, term1379074.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1379074, term1379074.getClass(), "backgroundEraseDisabled", false);
        setField(term1379074, term1379074.getClass(), "eventCache", null);
        setBooleanField(term1379074, term1379074.getClass(), "coalescingEnabled", false);
        setBooleanField(term1379074, term1379074.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1379074, term1379074.getClass(), "componentSerializedDataVersion", 0);
        setField(term1379074, term1379074.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.game.GameState");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "setNextState", argTypes, term1379074, args);
    }

};


