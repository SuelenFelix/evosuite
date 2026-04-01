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

public class AITurnView_handleAiTurn_1135467706106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1378849;

    public AITurnView_handleAiTurn_1135467706106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1378849 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1378849, term1378849.getClass(), "label", null);
        setField(term1378849, term1378849.getClass(), "game", null);
        setIntField(term1378849, term1378849.getClass(), "textAnim", 0);
        setIntField(term1378849, term1378849.getClass(), "cx", 0);
        setIntField(term1378849, term1378849.getClass(), "cy", 0);
        setField(term1378849, term1378849.getClass(), "aiThread", null);
        setBooleanField(term1378849, term1378849.getClass(), "readyToMove", false);
        setField(term1378849, term1378849.getClass(), "nextState", null);
        setField(term1378849, term1378849.getClass(), "nextStateObject", null);
        setBooleanField(term1378849, term1378849.getClass(), "isAlignmentXSet", false);
        setFloatField(term1378849, term1378849.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1378849, term1378849.getClass(), "isAlignmentYSet", false);
        setFloatField(term1378849, term1378849.getClass(), "alignmentY", 0.0F);
        setField(term1378849, term1378849.getClass(), "ui", null);
        setField(term1378849, term1378849.getClass(), "listenerList", null);
        setField(term1378849, term1378849.getClass(), "clientProperties", null);
        setField(term1378849, term1378849.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1378849, term1378849.getClass(), "autoscrolls", false);
        setField(term1378849, term1378849.getClass(), "border", null);
        setIntField(term1378849, term1378849.getClass(), "flags", 0);
        setField(term1378849, term1378849.getClass(), "inputVerifier", null);
        setBooleanField(term1378849, term1378849.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1378849, term1378849.getClass(), "paintingChild", null);
        setField(term1378849, term1378849.getClass(), "popupMenu", null);
        setField(term1378849, term1378849.getClass(), "revalidateRunnableScheduled", null);
        setField(term1378849, term1378849.getClass(), "focusInputMap", null);
        setField(term1378849, term1378849.getClass(), "ancestorInputMap", null);
        setField(term1378849, term1378849.getClass(), "windowInputMap", null);
        setField(term1378849, term1378849.getClass(), "actionMap", null);
        setField(term1378849, term1378849.getClass(), "aaHint", null);
        setField(term1378849, term1378849.getClass(), "lcdRenderingHint", null);
        setField(term1378849, term1378849.getClass(), "component", null);
        setField(term1378849, term1378849.getClass(), "layoutMgr", null);
        setField(term1378849, term1378849.getClass(), "dispatcher", null);
        setField(term1378849, term1378849.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1378849, term1378849.getClass(), "focusCycleRoot", false);
        setBooleanField(term1378849, term1378849.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1378849, term1378849.getClass(), "printingThreads", null);
        setBooleanField(term1378849, term1378849.getClass(), "printing", false);
        setField(term1378849, term1378849.getClass(), "containerListener", null);
        setIntField(term1378849, term1378849.getClass(), "listeningChildren", 0);
        setIntField(term1378849, term1378849.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1378849, term1378849.getClass(), "descendantsCount", 0);
        setField(term1378849, term1378849.getClass(), "preserveBackgroundColor", null);
        setIntField(term1378849, term1378849.getClass(), "numOfHWComponents", 0);
        setIntField(term1378849, term1378849.getClass(), "numOfLWComponents", 0);
        setField(term1378849, term1378849.getClass(), "modalComp", null);
        setField(term1378849, term1378849.getClass(), "modalAppContext", null);
        setIntField(term1378849, term1378849.getClass(), "containerSerializedDataVersion", 0);
        setField(term1378849, term1378849.getClass(), "peer", null);
        setField(term1378849, term1378849.getClass(), "parent", null);
        setField(term1378849, term1378849.getClass(), "appContext", null);
        setIntField(term1378849, term1378849.getClass(), "x", 0);
        setIntField(term1378849, term1378849.getClass(), "y", 0);
        setIntField(term1378849, term1378849.getClass(), "width", 0);
        setIntField(term1378849, term1378849.getClass(), "height", 0);
        setField(term1378849, term1378849.getClass(), "foreground", null);
        setField(term1378849, term1378849.getClass(), "background", null);
        setField(term1378849, term1378849.getClass(), "font", null);
        setField(term1378849, term1378849.getClass(), "peerFont", null);
        setField(term1378849, term1378849.getClass(), "cursor", null);
        setField(term1378849, term1378849.getClass(), "locale", null);
        setField(term1378849, term1378849.getClass(), "graphicsConfig", null);
        setField(term1378849, term1378849.getClass(), "bufferStrategy", null);
        setBooleanField(term1378849, term1378849.getClass(), "ignoreRepaint", false);
        setBooleanField(term1378849, term1378849.getClass(), "visible", false);
        setBooleanField(term1378849, term1378849.getClass(), "enabled", false);
        setBooleanField(term1378849, term1378849.getClass(), "valid", false);
        setField(term1378849, term1378849.getClass(), "dropTarget", null);
        setField(term1378849, term1378849.getClass(), "popups", null);
        setField(term1378849, term1378849.getClass(), "name", null);
        setBooleanField(term1378849, term1378849.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1378849, term1378849.getClass(), "focusable", false);
        setIntField(term1378849, term1378849.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1378849, term1378849.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1378849, term1378849.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1378849, term1378849.getClass(), "acc", null);
        setField(term1378849, term1378849.getClass(), "minSize", null);
        setBooleanField(term1378849, term1378849.getClass(), "minSizeSet", false);
        setField(term1378849, term1378849.getClass(), "prefSize", null);
        setBooleanField(term1378849, term1378849.getClass(), "prefSizeSet", false);
        setField(term1378849, term1378849.getClass(), "maxSize", null);
        setBooleanField(term1378849, term1378849.getClass(), "maxSizeSet", false);
        setField(term1378849, term1378849.getClass(), "componentOrientation", null);
        setBooleanField(term1378849, term1378849.getClass(), "newEventsOnly", false);
        setField(term1378849, term1378849.getClass(), "componentListener", null);
        setField(term1378849, term1378849.getClass(), "focusListener", null);
        setField(term1378849, term1378849.getClass(), "hierarchyListener", null);
        setField(term1378849, term1378849.getClass(), "hierarchyBoundsListener", null);
        setField(term1378849, term1378849.getClass(), "keyListener", null);
        setField(term1378849, term1378849.getClass(), "mouseListener", null);
        setField(term1378849, term1378849.getClass(), "mouseMotionListener", null);
        setField(term1378849, term1378849.getClass(), "mouseWheelListener", null);
        setField(term1378849, term1378849.getClass(), "inputMethodListener", null);
        setLongField(term1378849, term1378849.getClass(), "eventMask", 0L);
        setField(term1378849, term1378849.getClass(), "changeSupport", null);
        setField(term1378849, term1378849.getClass(), "objectLock", null);
        setBooleanField(term1378849, term1378849.getClass(), "isPacked", false);
        setIntField(term1378849, term1378849.getClass(), "boundsOp", 0);
        setField(term1378849, term1378849.getClass(), "compoundShape", null);
        setField(term1378849, term1378849.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1378849, term1378849.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1378849, term1378849.getClass(), "backgroundEraseDisabled", false);
        setField(term1378849, term1378849.getClass(), "eventCache", null);
        setBooleanField(term1378849, term1378849.getClass(), "coalescingEnabled", false);
        setBooleanField(term1378849, term1378849.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1378849, term1378849.getClass(), "componentSerializedDataVersion", 0);
        setField(term1378849, term1378849.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "handleAiTurn", argTypes, term1378849, args);
    }

};


