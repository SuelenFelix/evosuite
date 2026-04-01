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

public class AITurnView_updateStarMapToNextTurn_1623702215104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1378759;

    public AITurnView_updateStarMapToNextTurn_1623702215104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1378759 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1378759, term1378759.getClass(), "label", null);
        setField(term1378759, term1378759.getClass(), "game", null);
        setIntField(term1378759, term1378759.getClass(), "textAnim", 0);
        setIntField(term1378759, term1378759.getClass(), "cx", 0);
        setIntField(term1378759, term1378759.getClass(), "cy", 0);
        setField(term1378759, term1378759.getClass(), "aiThread", null);
        setBooleanField(term1378759, term1378759.getClass(), "readyToMove", false);
        setField(term1378759, term1378759.getClass(), "nextState", null);
        setField(term1378759, term1378759.getClass(), "nextStateObject", null);
        setBooleanField(term1378759, term1378759.getClass(), "isAlignmentXSet", false);
        setFloatField(term1378759, term1378759.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1378759, term1378759.getClass(), "isAlignmentYSet", false);
        setFloatField(term1378759, term1378759.getClass(), "alignmentY", 0.0F);
        setField(term1378759, term1378759.getClass(), "ui", null);
        setField(term1378759, term1378759.getClass(), "listenerList", null);
        setField(term1378759, term1378759.getClass(), "clientProperties", null);
        setField(term1378759, term1378759.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1378759, term1378759.getClass(), "autoscrolls", false);
        setField(term1378759, term1378759.getClass(), "border", null);
        setIntField(term1378759, term1378759.getClass(), "flags", 0);
        setField(term1378759, term1378759.getClass(), "inputVerifier", null);
        setBooleanField(term1378759, term1378759.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1378759, term1378759.getClass(), "paintingChild", null);
        setField(term1378759, term1378759.getClass(), "popupMenu", null);
        setField(term1378759, term1378759.getClass(), "revalidateRunnableScheduled", null);
        setField(term1378759, term1378759.getClass(), "focusInputMap", null);
        setField(term1378759, term1378759.getClass(), "ancestorInputMap", null);
        setField(term1378759, term1378759.getClass(), "windowInputMap", null);
        setField(term1378759, term1378759.getClass(), "actionMap", null);
        setField(term1378759, term1378759.getClass(), "aaHint", null);
        setField(term1378759, term1378759.getClass(), "lcdRenderingHint", null);
        setField(term1378759, term1378759.getClass(), "component", null);
        setField(term1378759, term1378759.getClass(), "layoutMgr", null);
        setField(term1378759, term1378759.getClass(), "dispatcher", null);
        setField(term1378759, term1378759.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1378759, term1378759.getClass(), "focusCycleRoot", false);
        setBooleanField(term1378759, term1378759.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1378759, term1378759.getClass(), "printingThreads", null);
        setBooleanField(term1378759, term1378759.getClass(), "printing", false);
        setField(term1378759, term1378759.getClass(), "containerListener", null);
        setIntField(term1378759, term1378759.getClass(), "listeningChildren", 0);
        setIntField(term1378759, term1378759.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1378759, term1378759.getClass(), "descendantsCount", 0);
        setField(term1378759, term1378759.getClass(), "preserveBackgroundColor", null);
        setIntField(term1378759, term1378759.getClass(), "numOfHWComponents", 0);
        setIntField(term1378759, term1378759.getClass(), "numOfLWComponents", 0);
        setField(term1378759, term1378759.getClass(), "modalComp", null);
        setField(term1378759, term1378759.getClass(), "modalAppContext", null);
        setIntField(term1378759, term1378759.getClass(), "containerSerializedDataVersion", 0);
        setField(term1378759, term1378759.getClass(), "peer", null);
        setField(term1378759, term1378759.getClass(), "parent", null);
        setField(term1378759, term1378759.getClass(), "appContext", null);
        setIntField(term1378759, term1378759.getClass(), "x", 0);
        setIntField(term1378759, term1378759.getClass(), "y", 0);
        setIntField(term1378759, term1378759.getClass(), "width", 0);
        setIntField(term1378759, term1378759.getClass(), "height", 0);
        setField(term1378759, term1378759.getClass(), "foreground", null);
        setField(term1378759, term1378759.getClass(), "background", null);
        setField(term1378759, term1378759.getClass(), "font", null);
        setField(term1378759, term1378759.getClass(), "peerFont", null);
        setField(term1378759, term1378759.getClass(), "cursor", null);
        setField(term1378759, term1378759.getClass(), "locale", null);
        setField(term1378759, term1378759.getClass(), "graphicsConfig", null);
        setField(term1378759, term1378759.getClass(), "bufferStrategy", null);
        setBooleanField(term1378759, term1378759.getClass(), "ignoreRepaint", false);
        setBooleanField(term1378759, term1378759.getClass(), "visible", false);
        setBooleanField(term1378759, term1378759.getClass(), "enabled", false);
        setBooleanField(term1378759, term1378759.getClass(), "valid", false);
        setField(term1378759, term1378759.getClass(), "dropTarget", null);
        setField(term1378759, term1378759.getClass(), "popups", null);
        setField(term1378759, term1378759.getClass(), "name", null);
        setBooleanField(term1378759, term1378759.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1378759, term1378759.getClass(), "focusable", false);
        setIntField(term1378759, term1378759.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1378759, term1378759.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1378759, term1378759.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1378759, term1378759.getClass(), "acc", null);
        setField(term1378759, term1378759.getClass(), "minSize", null);
        setBooleanField(term1378759, term1378759.getClass(), "minSizeSet", false);
        setField(term1378759, term1378759.getClass(), "prefSize", null);
        setBooleanField(term1378759, term1378759.getClass(), "prefSizeSet", false);
        setField(term1378759, term1378759.getClass(), "maxSize", null);
        setBooleanField(term1378759, term1378759.getClass(), "maxSizeSet", false);
        setField(term1378759, term1378759.getClass(), "componentOrientation", null);
        setBooleanField(term1378759, term1378759.getClass(), "newEventsOnly", false);
        setField(term1378759, term1378759.getClass(), "componentListener", null);
        setField(term1378759, term1378759.getClass(), "focusListener", null);
        setField(term1378759, term1378759.getClass(), "hierarchyListener", null);
        setField(term1378759, term1378759.getClass(), "hierarchyBoundsListener", null);
        setField(term1378759, term1378759.getClass(), "keyListener", null);
        setField(term1378759, term1378759.getClass(), "mouseListener", null);
        setField(term1378759, term1378759.getClass(), "mouseMotionListener", null);
        setField(term1378759, term1378759.getClass(), "mouseWheelListener", null);
        setField(term1378759, term1378759.getClass(), "inputMethodListener", null);
        setLongField(term1378759, term1378759.getClass(), "eventMask", 0L);
        setField(term1378759, term1378759.getClass(), "changeSupport", null);
        setField(term1378759, term1378759.getClass(), "objectLock", null);
        setBooleanField(term1378759, term1378759.getClass(), "isPacked", false);
        setIntField(term1378759, term1378759.getClass(), "boundsOp", 0);
        setField(term1378759, term1378759.getClass(), "compoundShape", null);
        setField(term1378759, term1378759.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1378759, term1378759.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1378759, term1378759.getClass(), "backgroundEraseDisabled", false);
        setField(term1378759, term1378759.getClass(), "eventCache", null);
        setBooleanField(term1378759, term1378759.getClass(), "coalescingEnabled", false);
        setBooleanField(term1378759, term1378759.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1378759, term1378759.getClass(), "componentSerializedDataVersion", 0);
        setField(term1378759, term1378759.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateStarMapToNextTurn", argTypes, term1378759, args);
    }

};


