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

public class AITurnView_handleActions_24977325107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1378894;

    public AITurnView_handleActions_24977325107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1378894 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1378894, term1378894.getClass(), "label", null);
        setField(term1378894, term1378894.getClass(), "game", null);
        setIntField(term1378894, term1378894.getClass(), "textAnim", 0);
        setIntField(term1378894, term1378894.getClass(), "cx", 0);
        setIntField(term1378894, term1378894.getClass(), "cy", 0);
        setField(term1378894, term1378894.getClass(), "aiThread", null);
        setBooleanField(term1378894, term1378894.getClass(), "readyToMove", false);
        setField(term1378894, term1378894.getClass(), "nextState", null);
        setField(term1378894, term1378894.getClass(), "nextStateObject", null);
        setBooleanField(term1378894, term1378894.getClass(), "isAlignmentXSet", false);
        setFloatField(term1378894, term1378894.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1378894, term1378894.getClass(), "isAlignmentYSet", false);
        setFloatField(term1378894, term1378894.getClass(), "alignmentY", 0.0F);
        setField(term1378894, term1378894.getClass(), "ui", null);
        setField(term1378894, term1378894.getClass(), "listenerList", null);
        setField(term1378894, term1378894.getClass(), "clientProperties", null);
        setField(term1378894, term1378894.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1378894, term1378894.getClass(), "autoscrolls", false);
        setField(term1378894, term1378894.getClass(), "border", null);
        setIntField(term1378894, term1378894.getClass(), "flags", 0);
        setField(term1378894, term1378894.getClass(), "inputVerifier", null);
        setBooleanField(term1378894, term1378894.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1378894, term1378894.getClass(), "paintingChild", null);
        setField(term1378894, term1378894.getClass(), "popupMenu", null);
        setField(term1378894, term1378894.getClass(), "revalidateRunnableScheduled", null);
        setField(term1378894, term1378894.getClass(), "focusInputMap", null);
        setField(term1378894, term1378894.getClass(), "ancestorInputMap", null);
        setField(term1378894, term1378894.getClass(), "windowInputMap", null);
        setField(term1378894, term1378894.getClass(), "actionMap", null);
        setField(term1378894, term1378894.getClass(), "aaHint", null);
        setField(term1378894, term1378894.getClass(), "lcdRenderingHint", null);
        setField(term1378894, term1378894.getClass(), "component", null);
        setField(term1378894, term1378894.getClass(), "layoutMgr", null);
        setField(term1378894, term1378894.getClass(), "dispatcher", null);
        setField(term1378894, term1378894.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1378894, term1378894.getClass(), "focusCycleRoot", false);
        setBooleanField(term1378894, term1378894.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1378894, term1378894.getClass(), "printingThreads", null);
        setBooleanField(term1378894, term1378894.getClass(), "printing", false);
        setField(term1378894, term1378894.getClass(), "containerListener", null);
        setIntField(term1378894, term1378894.getClass(), "listeningChildren", 0);
        setIntField(term1378894, term1378894.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1378894, term1378894.getClass(), "descendantsCount", 0);
        setField(term1378894, term1378894.getClass(), "preserveBackgroundColor", null);
        setIntField(term1378894, term1378894.getClass(), "numOfHWComponents", 0);
        setIntField(term1378894, term1378894.getClass(), "numOfLWComponents", 0);
        setField(term1378894, term1378894.getClass(), "modalComp", null);
        setField(term1378894, term1378894.getClass(), "modalAppContext", null);
        setIntField(term1378894, term1378894.getClass(), "containerSerializedDataVersion", 0);
        setField(term1378894, term1378894.getClass(), "peer", null);
        setField(term1378894, term1378894.getClass(), "parent", null);
        setField(term1378894, term1378894.getClass(), "appContext", null);
        setIntField(term1378894, term1378894.getClass(), "x", 0);
        setIntField(term1378894, term1378894.getClass(), "y", 0);
        setIntField(term1378894, term1378894.getClass(), "width", 0);
        setIntField(term1378894, term1378894.getClass(), "height", 0);
        setField(term1378894, term1378894.getClass(), "foreground", null);
        setField(term1378894, term1378894.getClass(), "background", null);
        setField(term1378894, term1378894.getClass(), "font", null);
        setField(term1378894, term1378894.getClass(), "peerFont", null);
        setField(term1378894, term1378894.getClass(), "cursor", null);
        setField(term1378894, term1378894.getClass(), "locale", null);
        setField(term1378894, term1378894.getClass(), "graphicsConfig", null);
        setField(term1378894, term1378894.getClass(), "bufferStrategy", null);
        setBooleanField(term1378894, term1378894.getClass(), "ignoreRepaint", false);
        setBooleanField(term1378894, term1378894.getClass(), "visible", false);
        setBooleanField(term1378894, term1378894.getClass(), "enabled", false);
        setBooleanField(term1378894, term1378894.getClass(), "valid", false);
        setField(term1378894, term1378894.getClass(), "dropTarget", null);
        setField(term1378894, term1378894.getClass(), "popups", null);
        setField(term1378894, term1378894.getClass(), "name", null);
        setBooleanField(term1378894, term1378894.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1378894, term1378894.getClass(), "focusable", false);
        setIntField(term1378894, term1378894.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1378894, term1378894.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1378894, term1378894.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1378894, term1378894.getClass(), "acc", null);
        setField(term1378894, term1378894.getClass(), "minSize", null);
        setBooleanField(term1378894, term1378894.getClass(), "minSizeSet", false);
        setField(term1378894, term1378894.getClass(), "prefSize", null);
        setBooleanField(term1378894, term1378894.getClass(), "prefSizeSet", false);
        setField(term1378894, term1378894.getClass(), "maxSize", null);
        setBooleanField(term1378894, term1378894.getClass(), "maxSizeSet", false);
        setField(term1378894, term1378894.getClass(), "componentOrientation", null);
        setBooleanField(term1378894, term1378894.getClass(), "newEventsOnly", false);
        setField(term1378894, term1378894.getClass(), "componentListener", null);
        setField(term1378894, term1378894.getClass(), "focusListener", null);
        setField(term1378894, term1378894.getClass(), "hierarchyListener", null);
        setField(term1378894, term1378894.getClass(), "hierarchyBoundsListener", null);
        setField(term1378894, term1378894.getClass(), "keyListener", null);
        setField(term1378894, term1378894.getClass(), "mouseListener", null);
        setField(term1378894, term1378894.getClass(), "mouseMotionListener", null);
        setField(term1378894, term1378894.getClass(), "mouseWheelListener", null);
        setField(term1378894, term1378894.getClass(), "inputMethodListener", null);
        setLongField(term1378894, term1378894.getClass(), "eventMask", 0L);
        setField(term1378894, term1378894.getClass(), "changeSupport", null);
        setField(term1378894, term1378894.getClass(), "objectLock", null);
        setBooleanField(term1378894, term1378894.getClass(), "isPacked", false);
        setIntField(term1378894, term1378894.getClass(), "boundsOp", 0);
        setField(term1378894, term1378894.getClass(), "compoundShape", null);
        setField(term1378894, term1378894.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1378894, term1378894.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1378894, term1378894.getClass(), "backgroundEraseDisabled", false);
        setField(term1378894, term1378894.getClass(), "eventCache", null);
        setBooleanField(term1378894, term1378894.getClass(), "coalescingEnabled", false);
        setBooleanField(term1378894, term1378894.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1378894, term1378894.getClass(), "componentSerializedDataVersion", 0);
        setField(term1378894, term1378894.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleActions", argTypes, term1378894, args);
    }

};


