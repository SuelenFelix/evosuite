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

public class AITurnView_handleAIFleet_72896881192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1378217;

    public AITurnView_handleAIFleet_72896881192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1378217 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1378217, term1378217.getClass(), "label", null);
        setField(term1378217, term1378217.getClass(), "game", null);
        setIntField(term1378217, term1378217.getClass(), "textAnim", 0);
        setIntField(term1378217, term1378217.getClass(), "cx", 0);
        setIntField(term1378217, term1378217.getClass(), "cy", 0);
        setField(term1378217, term1378217.getClass(), "aiThread", null);
        setBooleanField(term1378217, term1378217.getClass(), "readyToMove", false);
        setField(term1378217, term1378217.getClass(), "nextState", null);
        setField(term1378217, term1378217.getClass(), "nextStateObject", null);
        setBooleanField(term1378217, term1378217.getClass(), "isAlignmentXSet", false);
        setFloatField(term1378217, term1378217.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1378217, term1378217.getClass(), "isAlignmentYSet", false);
        setFloatField(term1378217, term1378217.getClass(), "alignmentY", 0.0F);
        setField(term1378217, term1378217.getClass(), "ui", null);
        setField(term1378217, term1378217.getClass(), "listenerList", null);
        setField(term1378217, term1378217.getClass(), "clientProperties", null);
        setField(term1378217, term1378217.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1378217, term1378217.getClass(), "autoscrolls", false);
        setField(term1378217, term1378217.getClass(), "border", null);
        setIntField(term1378217, term1378217.getClass(), "flags", 0);
        setField(term1378217, term1378217.getClass(), "inputVerifier", null);
        setBooleanField(term1378217, term1378217.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1378217, term1378217.getClass(), "paintingChild", null);
        setField(term1378217, term1378217.getClass(), "popupMenu", null);
        setField(term1378217, term1378217.getClass(), "revalidateRunnableScheduled", null);
        setField(term1378217, term1378217.getClass(), "focusInputMap", null);
        setField(term1378217, term1378217.getClass(), "ancestorInputMap", null);
        setField(term1378217, term1378217.getClass(), "windowInputMap", null);
        setField(term1378217, term1378217.getClass(), "actionMap", null);
        setField(term1378217, term1378217.getClass(), "aaHint", null);
        setField(term1378217, term1378217.getClass(), "lcdRenderingHint", null);
        setField(term1378217, term1378217.getClass(), "component", null);
        setField(term1378217, term1378217.getClass(), "layoutMgr", null);
        setField(term1378217, term1378217.getClass(), "dispatcher", null);
        setField(term1378217, term1378217.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1378217, term1378217.getClass(), "focusCycleRoot", false);
        setBooleanField(term1378217, term1378217.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1378217, term1378217.getClass(), "printingThreads", null);
        setBooleanField(term1378217, term1378217.getClass(), "printing", false);
        setField(term1378217, term1378217.getClass(), "containerListener", null);
        setIntField(term1378217, term1378217.getClass(), "listeningChildren", 0);
        setIntField(term1378217, term1378217.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1378217, term1378217.getClass(), "descendantsCount", 0);
        setField(term1378217, term1378217.getClass(), "preserveBackgroundColor", null);
        setIntField(term1378217, term1378217.getClass(), "numOfHWComponents", 0);
        setIntField(term1378217, term1378217.getClass(), "numOfLWComponents", 0);
        setField(term1378217, term1378217.getClass(), "modalComp", null);
        setField(term1378217, term1378217.getClass(), "modalAppContext", null);
        setIntField(term1378217, term1378217.getClass(), "containerSerializedDataVersion", 0);
        setField(term1378217, term1378217.getClass(), "peer", null);
        setField(term1378217, term1378217.getClass(), "parent", null);
        setField(term1378217, term1378217.getClass(), "appContext", null);
        setIntField(term1378217, term1378217.getClass(), "x", 0);
        setIntField(term1378217, term1378217.getClass(), "y", 0);
        setIntField(term1378217, term1378217.getClass(), "width", 0);
        setIntField(term1378217, term1378217.getClass(), "height", 0);
        setField(term1378217, term1378217.getClass(), "foreground", null);
        setField(term1378217, term1378217.getClass(), "background", null);
        setField(term1378217, term1378217.getClass(), "font", null);
        setField(term1378217, term1378217.getClass(), "peerFont", null);
        setField(term1378217, term1378217.getClass(), "cursor", null);
        setField(term1378217, term1378217.getClass(), "locale", null);
        setField(term1378217, term1378217.getClass(), "graphicsConfig", null);
        setField(term1378217, term1378217.getClass(), "bufferStrategy", null);
        setBooleanField(term1378217, term1378217.getClass(), "ignoreRepaint", false);
        setBooleanField(term1378217, term1378217.getClass(), "visible", false);
        setBooleanField(term1378217, term1378217.getClass(), "enabled", false);
        setBooleanField(term1378217, term1378217.getClass(), "valid", false);
        setField(term1378217, term1378217.getClass(), "dropTarget", null);
        setField(term1378217, term1378217.getClass(), "popups", null);
        setField(term1378217, term1378217.getClass(), "name", null);
        setBooleanField(term1378217, term1378217.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1378217, term1378217.getClass(), "focusable", false);
        setIntField(term1378217, term1378217.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1378217, term1378217.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1378217, term1378217.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1378217, term1378217.getClass(), "acc", null);
        setField(term1378217, term1378217.getClass(), "minSize", null);
        setBooleanField(term1378217, term1378217.getClass(), "minSizeSet", false);
        setField(term1378217, term1378217.getClass(), "prefSize", null);
        setBooleanField(term1378217, term1378217.getClass(), "prefSizeSet", false);
        setField(term1378217, term1378217.getClass(), "maxSize", null);
        setBooleanField(term1378217, term1378217.getClass(), "maxSizeSet", false);
        setField(term1378217, term1378217.getClass(), "componentOrientation", null);
        setBooleanField(term1378217, term1378217.getClass(), "newEventsOnly", false);
        setField(term1378217, term1378217.getClass(), "componentListener", null);
        setField(term1378217, term1378217.getClass(), "focusListener", null);
        setField(term1378217, term1378217.getClass(), "hierarchyListener", null);
        setField(term1378217, term1378217.getClass(), "hierarchyBoundsListener", null);
        setField(term1378217, term1378217.getClass(), "keyListener", null);
        setField(term1378217, term1378217.getClass(), "mouseListener", null);
        setField(term1378217, term1378217.getClass(), "mouseMotionListener", null);
        setField(term1378217, term1378217.getClass(), "mouseWheelListener", null);
        setField(term1378217, term1378217.getClass(), "inputMethodListener", null);
        setLongField(term1378217, term1378217.getClass(), "eventMask", 0L);
        setField(term1378217, term1378217.getClass(), "changeSupport", null);
        setField(term1378217, term1378217.getClass(), "objectLock", null);
        setBooleanField(term1378217, term1378217.getClass(), "isPacked", false);
        setIntField(term1378217, term1378217.getClass(), "boundsOp", 0);
        setField(term1378217, term1378217.getClass(), "compoundShape", null);
        setField(term1378217, term1378217.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1378217, term1378217.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1378217, term1378217.getClass(), "backgroundEraseDisabled", false);
        setField(term1378217, term1378217.getClass(), "eventCache", null);
        setBooleanField(term1378217, term1378217.getClass(), "coalescingEnabled", false);
        setBooleanField(term1378217, term1378217.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1378217, term1378217.getClass(), "componentSerializedDataVersion", 0);
        setField(term1378217, term1378217.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "handleAIFleet", argTypes, term1378217, args);
    }

};


