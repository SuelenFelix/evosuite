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

public class AITurnView_searchForBlackHole_117193930789 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1378082;

    public AITurnView_searchForBlackHole_117193930789() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1378082 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1378082, term1378082.getClass(), "label", null);
        setField(term1378082, term1378082.getClass(), "game", null);
        setIntField(term1378082, term1378082.getClass(), "textAnim", 0);
        setIntField(term1378082, term1378082.getClass(), "cx", 0);
        setIntField(term1378082, term1378082.getClass(), "cy", 0);
        setField(term1378082, term1378082.getClass(), "aiThread", null);
        setBooleanField(term1378082, term1378082.getClass(), "readyToMove", false);
        setField(term1378082, term1378082.getClass(), "nextState", null);
        setField(term1378082, term1378082.getClass(), "nextStateObject", null);
        setBooleanField(term1378082, term1378082.getClass(), "isAlignmentXSet", false);
        setFloatField(term1378082, term1378082.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1378082, term1378082.getClass(), "isAlignmentYSet", false);
        setFloatField(term1378082, term1378082.getClass(), "alignmentY", 0.0F);
        setField(term1378082, term1378082.getClass(), "ui", null);
        setField(term1378082, term1378082.getClass(), "listenerList", null);
        setField(term1378082, term1378082.getClass(), "clientProperties", null);
        setField(term1378082, term1378082.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1378082, term1378082.getClass(), "autoscrolls", false);
        setField(term1378082, term1378082.getClass(), "border", null);
        setIntField(term1378082, term1378082.getClass(), "flags", 0);
        setField(term1378082, term1378082.getClass(), "inputVerifier", null);
        setBooleanField(term1378082, term1378082.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1378082, term1378082.getClass(), "paintingChild", null);
        setField(term1378082, term1378082.getClass(), "popupMenu", null);
        setField(term1378082, term1378082.getClass(), "revalidateRunnableScheduled", null);
        setField(term1378082, term1378082.getClass(), "focusInputMap", null);
        setField(term1378082, term1378082.getClass(), "ancestorInputMap", null);
        setField(term1378082, term1378082.getClass(), "windowInputMap", null);
        setField(term1378082, term1378082.getClass(), "actionMap", null);
        setField(term1378082, term1378082.getClass(), "aaHint", null);
        setField(term1378082, term1378082.getClass(), "lcdRenderingHint", null);
        setField(term1378082, term1378082.getClass(), "component", null);
        setField(term1378082, term1378082.getClass(), "layoutMgr", null);
        setField(term1378082, term1378082.getClass(), "dispatcher", null);
        setField(term1378082, term1378082.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1378082, term1378082.getClass(), "focusCycleRoot", false);
        setBooleanField(term1378082, term1378082.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1378082, term1378082.getClass(), "printingThreads", null);
        setBooleanField(term1378082, term1378082.getClass(), "printing", false);
        setField(term1378082, term1378082.getClass(), "containerListener", null);
        setIntField(term1378082, term1378082.getClass(), "listeningChildren", 0);
        setIntField(term1378082, term1378082.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1378082, term1378082.getClass(), "descendantsCount", 0);
        setField(term1378082, term1378082.getClass(), "preserveBackgroundColor", null);
        setIntField(term1378082, term1378082.getClass(), "numOfHWComponents", 0);
        setIntField(term1378082, term1378082.getClass(), "numOfLWComponents", 0);
        setField(term1378082, term1378082.getClass(), "modalComp", null);
        setField(term1378082, term1378082.getClass(), "modalAppContext", null);
        setIntField(term1378082, term1378082.getClass(), "containerSerializedDataVersion", 0);
        setField(term1378082, term1378082.getClass(), "peer", null);
        setField(term1378082, term1378082.getClass(), "parent", null);
        setField(term1378082, term1378082.getClass(), "appContext", null);
        setIntField(term1378082, term1378082.getClass(), "x", 0);
        setIntField(term1378082, term1378082.getClass(), "y", 0);
        setIntField(term1378082, term1378082.getClass(), "width", 0);
        setIntField(term1378082, term1378082.getClass(), "height", 0);
        setField(term1378082, term1378082.getClass(), "foreground", null);
        setField(term1378082, term1378082.getClass(), "background", null);
        setField(term1378082, term1378082.getClass(), "font", null);
        setField(term1378082, term1378082.getClass(), "peerFont", null);
        setField(term1378082, term1378082.getClass(), "cursor", null);
        setField(term1378082, term1378082.getClass(), "locale", null);
        setField(term1378082, term1378082.getClass(), "graphicsConfig", null);
        setField(term1378082, term1378082.getClass(), "bufferStrategy", null);
        setBooleanField(term1378082, term1378082.getClass(), "ignoreRepaint", false);
        setBooleanField(term1378082, term1378082.getClass(), "visible", false);
        setBooleanField(term1378082, term1378082.getClass(), "enabled", false);
        setBooleanField(term1378082, term1378082.getClass(), "valid", false);
        setField(term1378082, term1378082.getClass(), "dropTarget", null);
        setField(term1378082, term1378082.getClass(), "popups", null);
        setField(term1378082, term1378082.getClass(), "name", null);
        setBooleanField(term1378082, term1378082.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1378082, term1378082.getClass(), "focusable", false);
        setIntField(term1378082, term1378082.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1378082, term1378082.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1378082, term1378082.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1378082, term1378082.getClass(), "acc", null);
        setField(term1378082, term1378082.getClass(), "minSize", null);
        setBooleanField(term1378082, term1378082.getClass(), "minSizeSet", false);
        setField(term1378082, term1378082.getClass(), "prefSize", null);
        setBooleanField(term1378082, term1378082.getClass(), "prefSizeSet", false);
        setField(term1378082, term1378082.getClass(), "maxSize", null);
        setBooleanField(term1378082, term1378082.getClass(), "maxSizeSet", false);
        setField(term1378082, term1378082.getClass(), "componentOrientation", null);
        setBooleanField(term1378082, term1378082.getClass(), "newEventsOnly", false);
        setField(term1378082, term1378082.getClass(), "componentListener", null);
        setField(term1378082, term1378082.getClass(), "focusListener", null);
        setField(term1378082, term1378082.getClass(), "hierarchyListener", null);
        setField(term1378082, term1378082.getClass(), "hierarchyBoundsListener", null);
        setField(term1378082, term1378082.getClass(), "keyListener", null);
        setField(term1378082, term1378082.getClass(), "mouseListener", null);
        setField(term1378082, term1378082.getClass(), "mouseMotionListener", null);
        setField(term1378082, term1378082.getClass(), "mouseWheelListener", null);
        setField(term1378082, term1378082.getClass(), "inputMethodListener", null);
        setLongField(term1378082, term1378082.getClass(), "eventMask", 0L);
        setField(term1378082, term1378082.getClass(), "changeSupport", null);
        setField(term1378082, term1378082.getClass(), "objectLock", null);
        setBooleanField(term1378082, term1378082.getClass(), "isPacked", false);
        setIntField(term1378082, term1378082.getClass(), "boundsOp", 0);
        setField(term1378082, term1378082.getClass(), "compoundShape", null);
        setField(term1378082, term1378082.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1378082, term1378082.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1378082, term1378082.getClass(), "backgroundEraseDisabled", false);
        setField(term1378082, term1378082.getClass(), "eventCache", null);
        setBooleanField(term1378082, term1378082.getClass(), "coalescingEnabled", false);
        setBooleanField(term1378082, term1378082.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1378082, term1378082.getClass(), "componentSerializedDataVersion", 0);
        setField(term1378082, term1378082.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "searchForBlackHole", argTypes, term1378082, args);
    }

};


