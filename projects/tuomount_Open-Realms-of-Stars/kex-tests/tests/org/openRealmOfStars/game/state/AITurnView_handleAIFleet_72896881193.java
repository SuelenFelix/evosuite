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

public class AITurnView_handleAIFleet_72896881193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1418493;

    public AITurnView_handleAIFleet_72896881193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1418493 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1418493, term1418493.getClass(), "label", null);
        setField(term1418493, term1418493.getClass(), "game", null);
        setIntField(term1418493, term1418493.getClass(), "textAnim", 0);
        setIntField(term1418493, term1418493.getClass(), "cx", 0);
        setIntField(term1418493, term1418493.getClass(), "cy", 0);
        setField(term1418493, term1418493.getClass(), "aiThread", null);
        setBooleanField(term1418493, term1418493.getClass(), "readyToMove", false);
        setField(term1418493, term1418493.getClass(), "nextState", null);
        setField(term1418493, term1418493.getClass(), "nextStateObject", null);
        setBooleanField(term1418493, term1418493.getClass(), "isAlignmentXSet", false);
        setFloatField(term1418493, term1418493.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1418493, term1418493.getClass(), "isAlignmentYSet", false);
        setFloatField(term1418493, term1418493.getClass(), "alignmentY", 0.0F);
        setField(term1418493, term1418493.getClass(), "ui", null);
        setField(term1418493, term1418493.getClass(), "listenerList", null);
        setField(term1418493, term1418493.getClass(), "clientProperties", null);
        setField(term1418493, term1418493.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1418493, term1418493.getClass(), "autoscrolls", false);
        setField(term1418493, term1418493.getClass(), "border", null);
        setIntField(term1418493, term1418493.getClass(), "flags", 0);
        setField(term1418493, term1418493.getClass(), "inputVerifier", null);
        setBooleanField(term1418493, term1418493.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1418493, term1418493.getClass(), "paintingChild", null);
        setField(term1418493, term1418493.getClass(), "popupMenu", null);
        setField(term1418493, term1418493.getClass(), "revalidateRunnableScheduled", null);
        setField(term1418493, term1418493.getClass(), "focusInputMap", null);
        setField(term1418493, term1418493.getClass(), "ancestorInputMap", null);
        setField(term1418493, term1418493.getClass(), "windowInputMap", null);
        setField(term1418493, term1418493.getClass(), "actionMap", null);
        setField(term1418493, term1418493.getClass(), "aaHint", null);
        setField(term1418493, term1418493.getClass(), "lcdRenderingHint", null);
        setField(term1418493, term1418493.getClass(), "component", null);
        setField(term1418493, term1418493.getClass(), "layoutMgr", null);
        setField(term1418493, term1418493.getClass(), "dispatcher", null);
        setField(term1418493, term1418493.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1418493, term1418493.getClass(), "focusCycleRoot", false);
        setBooleanField(term1418493, term1418493.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1418493, term1418493.getClass(), "printingThreads", null);
        setBooleanField(term1418493, term1418493.getClass(), "printing", false);
        setField(term1418493, term1418493.getClass(), "containerListener", null);
        setIntField(term1418493, term1418493.getClass(), "listeningChildren", 0);
        setIntField(term1418493, term1418493.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1418493, term1418493.getClass(), "descendantsCount", 0);
        setField(term1418493, term1418493.getClass(), "preserveBackgroundColor", null);
        setIntField(term1418493, term1418493.getClass(), "numOfHWComponents", 0);
        setIntField(term1418493, term1418493.getClass(), "numOfLWComponents", 0);
        setField(term1418493, term1418493.getClass(), "modalComp", null);
        setField(term1418493, term1418493.getClass(), "modalAppContext", null);
        setIntField(term1418493, term1418493.getClass(), "containerSerializedDataVersion", 0);
        setField(term1418493, term1418493.getClass(), "peer", null);
        setField(term1418493, term1418493.getClass(), "parent", null);
        setField(term1418493, term1418493.getClass(), "appContext", null);
        setIntField(term1418493, term1418493.getClass(), "x", 0);
        setIntField(term1418493, term1418493.getClass(), "y", 0);
        setIntField(term1418493, term1418493.getClass(), "width", 0);
        setIntField(term1418493, term1418493.getClass(), "height", 0);
        setField(term1418493, term1418493.getClass(), "foreground", null);
        setField(term1418493, term1418493.getClass(), "background", null);
        setField(term1418493, term1418493.getClass(), "font", null);
        setField(term1418493, term1418493.getClass(), "peerFont", null);
        setField(term1418493, term1418493.getClass(), "cursor", null);
        setField(term1418493, term1418493.getClass(), "locale", null);
        setField(term1418493, term1418493.getClass(), "graphicsConfig", null);
        setField(term1418493, term1418493.getClass(), "bufferStrategy", null);
        setBooleanField(term1418493, term1418493.getClass(), "ignoreRepaint", false);
        setBooleanField(term1418493, term1418493.getClass(), "visible", false);
        setBooleanField(term1418493, term1418493.getClass(), "enabled", false);
        setBooleanField(term1418493, term1418493.getClass(), "valid", false);
        setField(term1418493, term1418493.getClass(), "dropTarget", null);
        setField(term1418493, term1418493.getClass(), "popups", null);
        setField(term1418493, term1418493.getClass(), "name", null);
        setBooleanField(term1418493, term1418493.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1418493, term1418493.getClass(), "focusable", false);
        setIntField(term1418493, term1418493.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1418493, term1418493.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1418493, term1418493.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1418493, term1418493.getClass(), "acc", null);
        setField(term1418493, term1418493.getClass(), "minSize", null);
        setBooleanField(term1418493, term1418493.getClass(), "minSizeSet", false);
        setField(term1418493, term1418493.getClass(), "prefSize", null);
        setBooleanField(term1418493, term1418493.getClass(), "prefSizeSet", false);
        setField(term1418493, term1418493.getClass(), "maxSize", null);
        setBooleanField(term1418493, term1418493.getClass(), "maxSizeSet", false);
        setField(term1418493, term1418493.getClass(), "componentOrientation", null);
        setBooleanField(term1418493, term1418493.getClass(), "newEventsOnly", false);
        setField(term1418493, term1418493.getClass(), "componentListener", null);
        setField(term1418493, term1418493.getClass(), "focusListener", null);
        setField(term1418493, term1418493.getClass(), "hierarchyListener", null);
        setField(term1418493, term1418493.getClass(), "hierarchyBoundsListener", null);
        setField(term1418493, term1418493.getClass(), "keyListener", null);
        setField(term1418493, term1418493.getClass(), "mouseListener", null);
        setField(term1418493, term1418493.getClass(), "mouseMotionListener", null);
        setField(term1418493, term1418493.getClass(), "mouseWheelListener", null);
        setField(term1418493, term1418493.getClass(), "inputMethodListener", null);
        setLongField(term1418493, term1418493.getClass(), "eventMask", 0L);
        setField(term1418493, term1418493.getClass(), "changeSupport", null);
        setField(term1418493, term1418493.getClass(), "objectLock", null);
        setBooleanField(term1418493, term1418493.getClass(), "isPacked", false);
        setIntField(term1418493, term1418493.getClass(), "boundsOp", 0);
        setField(term1418493, term1418493.getClass(), "compoundShape", null);
        setField(term1418493, term1418493.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1418493, term1418493.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1418493, term1418493.getClass(), "backgroundEraseDisabled", false);
        setField(term1418493, term1418493.getClass(), "eventCache", null);
        setBooleanField(term1418493, term1418493.getClass(), "coalescingEnabled", false);
        setBooleanField(term1418493, term1418493.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1418493, term1418493.getClass(), "componentSerializedDataVersion", 0);
        setField(term1418493, term1418493.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "handleAIFleet", argTypes, term1418493, args);
    }

};


