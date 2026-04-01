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

public class AITurnView_searchForInterceptFleets_93733847785 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1377902;

    public AITurnView_searchForInterceptFleets_93733847785() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1377902 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1377902, term1377902.getClass(), "label", null);
        setField(term1377902, term1377902.getClass(), "game", null);
        setIntField(term1377902, term1377902.getClass(), "textAnim", 0);
        setIntField(term1377902, term1377902.getClass(), "cx", 0);
        setIntField(term1377902, term1377902.getClass(), "cy", 0);
        setField(term1377902, term1377902.getClass(), "aiThread", null);
        setBooleanField(term1377902, term1377902.getClass(), "readyToMove", false);
        setField(term1377902, term1377902.getClass(), "nextState", null);
        setField(term1377902, term1377902.getClass(), "nextStateObject", null);
        setBooleanField(term1377902, term1377902.getClass(), "isAlignmentXSet", false);
        setFloatField(term1377902, term1377902.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1377902, term1377902.getClass(), "isAlignmentYSet", false);
        setFloatField(term1377902, term1377902.getClass(), "alignmentY", 0.0F);
        setField(term1377902, term1377902.getClass(), "ui", null);
        setField(term1377902, term1377902.getClass(), "listenerList", null);
        setField(term1377902, term1377902.getClass(), "clientProperties", null);
        setField(term1377902, term1377902.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1377902, term1377902.getClass(), "autoscrolls", false);
        setField(term1377902, term1377902.getClass(), "border", null);
        setIntField(term1377902, term1377902.getClass(), "flags", 0);
        setField(term1377902, term1377902.getClass(), "inputVerifier", null);
        setBooleanField(term1377902, term1377902.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1377902, term1377902.getClass(), "paintingChild", null);
        setField(term1377902, term1377902.getClass(), "popupMenu", null);
        setField(term1377902, term1377902.getClass(), "revalidateRunnableScheduled", null);
        setField(term1377902, term1377902.getClass(), "focusInputMap", null);
        setField(term1377902, term1377902.getClass(), "ancestorInputMap", null);
        setField(term1377902, term1377902.getClass(), "windowInputMap", null);
        setField(term1377902, term1377902.getClass(), "actionMap", null);
        setField(term1377902, term1377902.getClass(), "aaHint", null);
        setField(term1377902, term1377902.getClass(), "lcdRenderingHint", null);
        setField(term1377902, term1377902.getClass(), "component", null);
        setField(term1377902, term1377902.getClass(), "layoutMgr", null);
        setField(term1377902, term1377902.getClass(), "dispatcher", null);
        setField(term1377902, term1377902.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1377902, term1377902.getClass(), "focusCycleRoot", false);
        setBooleanField(term1377902, term1377902.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1377902, term1377902.getClass(), "printingThreads", null);
        setBooleanField(term1377902, term1377902.getClass(), "printing", false);
        setField(term1377902, term1377902.getClass(), "containerListener", null);
        setIntField(term1377902, term1377902.getClass(), "listeningChildren", 0);
        setIntField(term1377902, term1377902.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1377902, term1377902.getClass(), "descendantsCount", 0);
        setField(term1377902, term1377902.getClass(), "preserveBackgroundColor", null);
        setIntField(term1377902, term1377902.getClass(), "numOfHWComponents", 0);
        setIntField(term1377902, term1377902.getClass(), "numOfLWComponents", 0);
        setField(term1377902, term1377902.getClass(), "modalComp", null);
        setField(term1377902, term1377902.getClass(), "modalAppContext", null);
        setIntField(term1377902, term1377902.getClass(), "containerSerializedDataVersion", 0);
        setField(term1377902, term1377902.getClass(), "peer", null);
        setField(term1377902, term1377902.getClass(), "parent", null);
        setField(term1377902, term1377902.getClass(), "appContext", null);
        setIntField(term1377902, term1377902.getClass(), "x", 0);
        setIntField(term1377902, term1377902.getClass(), "y", 0);
        setIntField(term1377902, term1377902.getClass(), "width", 0);
        setIntField(term1377902, term1377902.getClass(), "height", 0);
        setField(term1377902, term1377902.getClass(), "foreground", null);
        setField(term1377902, term1377902.getClass(), "background", null);
        setField(term1377902, term1377902.getClass(), "font", null);
        setField(term1377902, term1377902.getClass(), "peerFont", null);
        setField(term1377902, term1377902.getClass(), "cursor", null);
        setField(term1377902, term1377902.getClass(), "locale", null);
        setField(term1377902, term1377902.getClass(), "graphicsConfig", null);
        setField(term1377902, term1377902.getClass(), "bufferStrategy", null);
        setBooleanField(term1377902, term1377902.getClass(), "ignoreRepaint", false);
        setBooleanField(term1377902, term1377902.getClass(), "visible", false);
        setBooleanField(term1377902, term1377902.getClass(), "enabled", false);
        setBooleanField(term1377902, term1377902.getClass(), "valid", false);
        setField(term1377902, term1377902.getClass(), "dropTarget", null);
        setField(term1377902, term1377902.getClass(), "popups", null);
        setField(term1377902, term1377902.getClass(), "name", null);
        setBooleanField(term1377902, term1377902.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1377902, term1377902.getClass(), "focusable", false);
        setIntField(term1377902, term1377902.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1377902, term1377902.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1377902, term1377902.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1377902, term1377902.getClass(), "acc", null);
        setField(term1377902, term1377902.getClass(), "minSize", null);
        setBooleanField(term1377902, term1377902.getClass(), "minSizeSet", false);
        setField(term1377902, term1377902.getClass(), "prefSize", null);
        setBooleanField(term1377902, term1377902.getClass(), "prefSizeSet", false);
        setField(term1377902, term1377902.getClass(), "maxSize", null);
        setBooleanField(term1377902, term1377902.getClass(), "maxSizeSet", false);
        setField(term1377902, term1377902.getClass(), "componentOrientation", null);
        setBooleanField(term1377902, term1377902.getClass(), "newEventsOnly", false);
        setField(term1377902, term1377902.getClass(), "componentListener", null);
        setField(term1377902, term1377902.getClass(), "focusListener", null);
        setField(term1377902, term1377902.getClass(), "hierarchyListener", null);
        setField(term1377902, term1377902.getClass(), "hierarchyBoundsListener", null);
        setField(term1377902, term1377902.getClass(), "keyListener", null);
        setField(term1377902, term1377902.getClass(), "mouseListener", null);
        setField(term1377902, term1377902.getClass(), "mouseMotionListener", null);
        setField(term1377902, term1377902.getClass(), "mouseWheelListener", null);
        setField(term1377902, term1377902.getClass(), "inputMethodListener", null);
        setLongField(term1377902, term1377902.getClass(), "eventMask", 0L);
        setField(term1377902, term1377902.getClass(), "changeSupport", null);
        setField(term1377902, term1377902.getClass(), "objectLock", null);
        setBooleanField(term1377902, term1377902.getClass(), "isPacked", false);
        setIntField(term1377902, term1377902.getClass(), "boundsOp", 0);
        setField(term1377902, term1377902.getClass(), "compoundShape", null);
        setField(term1377902, term1377902.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1377902, term1377902.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1377902, term1377902.getClass(), "backgroundEraseDisabled", false);
        setField(term1377902, term1377902.getClass(), "eventCache", null);
        setBooleanField(term1377902, term1377902.getClass(), "coalescingEnabled", false);
        setBooleanField(term1377902, term1377902.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1377902, term1377902.getClass(), "componentSerializedDataVersion", 0);
        setField(term1377902, term1377902.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "searchForInterceptFleets", argTypes, term1377902, args);
    }

};


