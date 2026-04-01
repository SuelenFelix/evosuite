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

public class AITurnView_searchForBorderCrossing_56737494887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1377992;

    public AITurnView_searchForBorderCrossing_56737494887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1377992 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1377992, term1377992.getClass(), "label", null);
        setField(term1377992, term1377992.getClass(), "game", null);
        setIntField(term1377992, term1377992.getClass(), "textAnim", 0);
        setIntField(term1377992, term1377992.getClass(), "cx", 0);
        setIntField(term1377992, term1377992.getClass(), "cy", 0);
        setField(term1377992, term1377992.getClass(), "aiThread", null);
        setBooleanField(term1377992, term1377992.getClass(), "readyToMove", false);
        setField(term1377992, term1377992.getClass(), "nextState", null);
        setField(term1377992, term1377992.getClass(), "nextStateObject", null);
        setBooleanField(term1377992, term1377992.getClass(), "isAlignmentXSet", false);
        setFloatField(term1377992, term1377992.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1377992, term1377992.getClass(), "isAlignmentYSet", false);
        setFloatField(term1377992, term1377992.getClass(), "alignmentY", 0.0F);
        setField(term1377992, term1377992.getClass(), "ui", null);
        setField(term1377992, term1377992.getClass(), "listenerList", null);
        setField(term1377992, term1377992.getClass(), "clientProperties", null);
        setField(term1377992, term1377992.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1377992, term1377992.getClass(), "autoscrolls", false);
        setField(term1377992, term1377992.getClass(), "border", null);
        setIntField(term1377992, term1377992.getClass(), "flags", 0);
        setField(term1377992, term1377992.getClass(), "inputVerifier", null);
        setBooleanField(term1377992, term1377992.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1377992, term1377992.getClass(), "paintingChild", null);
        setField(term1377992, term1377992.getClass(), "popupMenu", null);
        setField(term1377992, term1377992.getClass(), "revalidateRunnableScheduled", null);
        setField(term1377992, term1377992.getClass(), "focusInputMap", null);
        setField(term1377992, term1377992.getClass(), "ancestorInputMap", null);
        setField(term1377992, term1377992.getClass(), "windowInputMap", null);
        setField(term1377992, term1377992.getClass(), "actionMap", null);
        setField(term1377992, term1377992.getClass(), "aaHint", null);
        setField(term1377992, term1377992.getClass(), "lcdRenderingHint", null);
        setField(term1377992, term1377992.getClass(), "component", null);
        setField(term1377992, term1377992.getClass(), "layoutMgr", null);
        setField(term1377992, term1377992.getClass(), "dispatcher", null);
        setField(term1377992, term1377992.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1377992, term1377992.getClass(), "focusCycleRoot", false);
        setBooleanField(term1377992, term1377992.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1377992, term1377992.getClass(), "printingThreads", null);
        setBooleanField(term1377992, term1377992.getClass(), "printing", false);
        setField(term1377992, term1377992.getClass(), "containerListener", null);
        setIntField(term1377992, term1377992.getClass(), "listeningChildren", 0);
        setIntField(term1377992, term1377992.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1377992, term1377992.getClass(), "descendantsCount", 0);
        setField(term1377992, term1377992.getClass(), "preserveBackgroundColor", null);
        setIntField(term1377992, term1377992.getClass(), "numOfHWComponents", 0);
        setIntField(term1377992, term1377992.getClass(), "numOfLWComponents", 0);
        setField(term1377992, term1377992.getClass(), "modalComp", null);
        setField(term1377992, term1377992.getClass(), "modalAppContext", null);
        setIntField(term1377992, term1377992.getClass(), "containerSerializedDataVersion", 0);
        setField(term1377992, term1377992.getClass(), "peer", null);
        setField(term1377992, term1377992.getClass(), "parent", null);
        setField(term1377992, term1377992.getClass(), "appContext", null);
        setIntField(term1377992, term1377992.getClass(), "x", 0);
        setIntField(term1377992, term1377992.getClass(), "y", 0);
        setIntField(term1377992, term1377992.getClass(), "width", 0);
        setIntField(term1377992, term1377992.getClass(), "height", 0);
        setField(term1377992, term1377992.getClass(), "foreground", null);
        setField(term1377992, term1377992.getClass(), "background", null);
        setField(term1377992, term1377992.getClass(), "font", null);
        setField(term1377992, term1377992.getClass(), "peerFont", null);
        setField(term1377992, term1377992.getClass(), "cursor", null);
        setField(term1377992, term1377992.getClass(), "locale", null);
        setField(term1377992, term1377992.getClass(), "graphicsConfig", null);
        setField(term1377992, term1377992.getClass(), "bufferStrategy", null);
        setBooleanField(term1377992, term1377992.getClass(), "ignoreRepaint", false);
        setBooleanField(term1377992, term1377992.getClass(), "visible", false);
        setBooleanField(term1377992, term1377992.getClass(), "enabled", false);
        setBooleanField(term1377992, term1377992.getClass(), "valid", false);
        setField(term1377992, term1377992.getClass(), "dropTarget", null);
        setField(term1377992, term1377992.getClass(), "popups", null);
        setField(term1377992, term1377992.getClass(), "name", null);
        setBooleanField(term1377992, term1377992.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1377992, term1377992.getClass(), "focusable", false);
        setIntField(term1377992, term1377992.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1377992, term1377992.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1377992, term1377992.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1377992, term1377992.getClass(), "acc", null);
        setField(term1377992, term1377992.getClass(), "minSize", null);
        setBooleanField(term1377992, term1377992.getClass(), "minSizeSet", false);
        setField(term1377992, term1377992.getClass(), "prefSize", null);
        setBooleanField(term1377992, term1377992.getClass(), "prefSizeSet", false);
        setField(term1377992, term1377992.getClass(), "maxSize", null);
        setBooleanField(term1377992, term1377992.getClass(), "maxSizeSet", false);
        setField(term1377992, term1377992.getClass(), "componentOrientation", null);
        setBooleanField(term1377992, term1377992.getClass(), "newEventsOnly", false);
        setField(term1377992, term1377992.getClass(), "componentListener", null);
        setField(term1377992, term1377992.getClass(), "focusListener", null);
        setField(term1377992, term1377992.getClass(), "hierarchyListener", null);
        setField(term1377992, term1377992.getClass(), "hierarchyBoundsListener", null);
        setField(term1377992, term1377992.getClass(), "keyListener", null);
        setField(term1377992, term1377992.getClass(), "mouseListener", null);
        setField(term1377992, term1377992.getClass(), "mouseMotionListener", null);
        setField(term1377992, term1377992.getClass(), "mouseWheelListener", null);
        setField(term1377992, term1377992.getClass(), "inputMethodListener", null);
        setLongField(term1377992, term1377992.getClass(), "eventMask", 0L);
        setField(term1377992, term1377992.getClass(), "changeSupport", null);
        setField(term1377992, term1377992.getClass(), "objectLock", null);
        setBooleanField(term1377992, term1377992.getClass(), "isPacked", false);
        setIntField(term1377992, term1377992.getClass(), "boundsOp", 0);
        setField(term1377992, term1377992.getClass(), "compoundShape", null);
        setField(term1377992, term1377992.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1377992, term1377992.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1377992, term1377992.getClass(), "backgroundEraseDisabled", false);
        setField(term1377992, term1377992.getClass(), "eventCache", null);
        setBooleanField(term1377992, term1377992.getClass(), "coalescingEnabled", false);
        setBooleanField(term1377992, term1377992.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1377992, term1377992.getClass(), "componentSerializedDataVersion", 0);
        setField(term1377992, term1377992.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "searchForBorderCrossing", argTypes, term1377992, args);
    }

};


