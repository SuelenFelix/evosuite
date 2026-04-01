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

public class AITurnView_searchForBlackHole_117193930790 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1418358;

    public AITurnView_searchForBlackHole_117193930790() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1418358 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1418358, term1418358.getClass(), "label", null);
        setField(term1418358, term1418358.getClass(), "game", null);
        setIntField(term1418358, term1418358.getClass(), "textAnim", 0);
        setIntField(term1418358, term1418358.getClass(), "cx", 0);
        setIntField(term1418358, term1418358.getClass(), "cy", 0);
        setField(term1418358, term1418358.getClass(), "aiThread", null);
        setBooleanField(term1418358, term1418358.getClass(), "readyToMove", false);
        setField(term1418358, term1418358.getClass(), "nextState", null);
        setField(term1418358, term1418358.getClass(), "nextStateObject", null);
        setBooleanField(term1418358, term1418358.getClass(), "isAlignmentXSet", false);
        setFloatField(term1418358, term1418358.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1418358, term1418358.getClass(), "isAlignmentYSet", false);
        setFloatField(term1418358, term1418358.getClass(), "alignmentY", 0.0F);
        setField(term1418358, term1418358.getClass(), "ui", null);
        setField(term1418358, term1418358.getClass(), "listenerList", null);
        setField(term1418358, term1418358.getClass(), "clientProperties", null);
        setField(term1418358, term1418358.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1418358, term1418358.getClass(), "autoscrolls", false);
        setField(term1418358, term1418358.getClass(), "border", null);
        setIntField(term1418358, term1418358.getClass(), "flags", 0);
        setField(term1418358, term1418358.getClass(), "inputVerifier", null);
        setBooleanField(term1418358, term1418358.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1418358, term1418358.getClass(), "paintingChild", null);
        setField(term1418358, term1418358.getClass(), "popupMenu", null);
        setField(term1418358, term1418358.getClass(), "revalidateRunnableScheduled", null);
        setField(term1418358, term1418358.getClass(), "focusInputMap", null);
        setField(term1418358, term1418358.getClass(), "ancestorInputMap", null);
        setField(term1418358, term1418358.getClass(), "windowInputMap", null);
        setField(term1418358, term1418358.getClass(), "actionMap", null);
        setField(term1418358, term1418358.getClass(), "aaHint", null);
        setField(term1418358, term1418358.getClass(), "lcdRenderingHint", null);
        setField(term1418358, term1418358.getClass(), "component", null);
        setField(term1418358, term1418358.getClass(), "layoutMgr", null);
        setField(term1418358, term1418358.getClass(), "dispatcher", null);
        setField(term1418358, term1418358.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1418358, term1418358.getClass(), "focusCycleRoot", false);
        setBooleanField(term1418358, term1418358.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1418358, term1418358.getClass(), "printingThreads", null);
        setBooleanField(term1418358, term1418358.getClass(), "printing", false);
        setField(term1418358, term1418358.getClass(), "containerListener", null);
        setIntField(term1418358, term1418358.getClass(), "listeningChildren", 0);
        setIntField(term1418358, term1418358.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1418358, term1418358.getClass(), "descendantsCount", 0);
        setField(term1418358, term1418358.getClass(), "preserveBackgroundColor", null);
        setIntField(term1418358, term1418358.getClass(), "numOfHWComponents", 0);
        setIntField(term1418358, term1418358.getClass(), "numOfLWComponents", 0);
        setField(term1418358, term1418358.getClass(), "modalComp", null);
        setField(term1418358, term1418358.getClass(), "modalAppContext", null);
        setIntField(term1418358, term1418358.getClass(), "containerSerializedDataVersion", 0);
        setField(term1418358, term1418358.getClass(), "peer", null);
        setField(term1418358, term1418358.getClass(), "parent", null);
        setField(term1418358, term1418358.getClass(), "appContext", null);
        setIntField(term1418358, term1418358.getClass(), "x", 0);
        setIntField(term1418358, term1418358.getClass(), "y", 0);
        setIntField(term1418358, term1418358.getClass(), "width", 0);
        setIntField(term1418358, term1418358.getClass(), "height", 0);
        setField(term1418358, term1418358.getClass(), "foreground", null);
        setField(term1418358, term1418358.getClass(), "background", null);
        setField(term1418358, term1418358.getClass(), "font", null);
        setField(term1418358, term1418358.getClass(), "peerFont", null);
        setField(term1418358, term1418358.getClass(), "cursor", null);
        setField(term1418358, term1418358.getClass(), "locale", null);
        setField(term1418358, term1418358.getClass(), "graphicsConfig", null);
        setField(term1418358, term1418358.getClass(), "bufferStrategy", null);
        setBooleanField(term1418358, term1418358.getClass(), "ignoreRepaint", false);
        setBooleanField(term1418358, term1418358.getClass(), "visible", false);
        setBooleanField(term1418358, term1418358.getClass(), "enabled", false);
        setBooleanField(term1418358, term1418358.getClass(), "valid", false);
        setField(term1418358, term1418358.getClass(), "dropTarget", null);
        setField(term1418358, term1418358.getClass(), "popups", null);
        setField(term1418358, term1418358.getClass(), "name", null);
        setBooleanField(term1418358, term1418358.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1418358, term1418358.getClass(), "focusable", false);
        setIntField(term1418358, term1418358.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1418358, term1418358.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1418358, term1418358.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1418358, term1418358.getClass(), "acc", null);
        setField(term1418358, term1418358.getClass(), "minSize", null);
        setBooleanField(term1418358, term1418358.getClass(), "minSizeSet", false);
        setField(term1418358, term1418358.getClass(), "prefSize", null);
        setBooleanField(term1418358, term1418358.getClass(), "prefSizeSet", false);
        setField(term1418358, term1418358.getClass(), "maxSize", null);
        setBooleanField(term1418358, term1418358.getClass(), "maxSizeSet", false);
        setField(term1418358, term1418358.getClass(), "componentOrientation", null);
        setBooleanField(term1418358, term1418358.getClass(), "newEventsOnly", false);
        setField(term1418358, term1418358.getClass(), "componentListener", null);
        setField(term1418358, term1418358.getClass(), "focusListener", null);
        setField(term1418358, term1418358.getClass(), "hierarchyListener", null);
        setField(term1418358, term1418358.getClass(), "hierarchyBoundsListener", null);
        setField(term1418358, term1418358.getClass(), "keyListener", null);
        setField(term1418358, term1418358.getClass(), "mouseListener", null);
        setField(term1418358, term1418358.getClass(), "mouseMotionListener", null);
        setField(term1418358, term1418358.getClass(), "mouseWheelListener", null);
        setField(term1418358, term1418358.getClass(), "inputMethodListener", null);
        setLongField(term1418358, term1418358.getClass(), "eventMask", 0L);
        setField(term1418358, term1418358.getClass(), "changeSupport", null);
        setField(term1418358, term1418358.getClass(), "objectLock", null);
        setBooleanField(term1418358, term1418358.getClass(), "isPacked", false);
        setIntField(term1418358, term1418358.getClass(), "boundsOp", 0);
        setField(term1418358, term1418358.getClass(), "compoundShape", null);
        setField(term1418358, term1418358.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1418358, term1418358.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1418358, term1418358.getClass(), "backgroundEraseDisabled", false);
        setField(term1418358, term1418358.getClass(), "eventCache", null);
        setBooleanField(term1418358, term1418358.getClass(), "coalescingEnabled", false);
        setBooleanField(term1418358, term1418358.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1418358, term1418358.getClass(), "componentSerializedDataVersion", 0);
        setField(term1418358, term1418358.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "searchForBlackHole", argTypes, term1418358, args);
    }

};


