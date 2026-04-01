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

public class AITurnView_searchDeepSpaceAnchors_157079381784 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1377857;

    public AITurnView_searchDeepSpaceAnchors_157079381784() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1377857 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1377857, term1377857.getClass(), "label", null);
        setField(term1377857, term1377857.getClass(), "game", null);
        setIntField(term1377857, term1377857.getClass(), "textAnim", 0);
        setIntField(term1377857, term1377857.getClass(), "cx", 0);
        setIntField(term1377857, term1377857.getClass(), "cy", 0);
        setField(term1377857, term1377857.getClass(), "aiThread", null);
        setBooleanField(term1377857, term1377857.getClass(), "readyToMove", false);
        setField(term1377857, term1377857.getClass(), "nextState", null);
        setField(term1377857, term1377857.getClass(), "nextStateObject", null);
        setBooleanField(term1377857, term1377857.getClass(), "isAlignmentXSet", false);
        setFloatField(term1377857, term1377857.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1377857, term1377857.getClass(), "isAlignmentYSet", false);
        setFloatField(term1377857, term1377857.getClass(), "alignmentY", 0.0F);
        setField(term1377857, term1377857.getClass(), "ui", null);
        setField(term1377857, term1377857.getClass(), "listenerList", null);
        setField(term1377857, term1377857.getClass(), "clientProperties", null);
        setField(term1377857, term1377857.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1377857, term1377857.getClass(), "autoscrolls", false);
        setField(term1377857, term1377857.getClass(), "border", null);
        setIntField(term1377857, term1377857.getClass(), "flags", 0);
        setField(term1377857, term1377857.getClass(), "inputVerifier", null);
        setBooleanField(term1377857, term1377857.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1377857, term1377857.getClass(), "paintingChild", null);
        setField(term1377857, term1377857.getClass(), "popupMenu", null);
        setField(term1377857, term1377857.getClass(), "revalidateRunnableScheduled", null);
        setField(term1377857, term1377857.getClass(), "focusInputMap", null);
        setField(term1377857, term1377857.getClass(), "ancestorInputMap", null);
        setField(term1377857, term1377857.getClass(), "windowInputMap", null);
        setField(term1377857, term1377857.getClass(), "actionMap", null);
        setField(term1377857, term1377857.getClass(), "aaHint", null);
        setField(term1377857, term1377857.getClass(), "lcdRenderingHint", null);
        setField(term1377857, term1377857.getClass(), "component", null);
        setField(term1377857, term1377857.getClass(), "layoutMgr", null);
        setField(term1377857, term1377857.getClass(), "dispatcher", null);
        setField(term1377857, term1377857.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1377857, term1377857.getClass(), "focusCycleRoot", false);
        setBooleanField(term1377857, term1377857.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1377857, term1377857.getClass(), "printingThreads", null);
        setBooleanField(term1377857, term1377857.getClass(), "printing", false);
        setField(term1377857, term1377857.getClass(), "containerListener", null);
        setIntField(term1377857, term1377857.getClass(), "listeningChildren", 0);
        setIntField(term1377857, term1377857.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1377857, term1377857.getClass(), "descendantsCount", 0);
        setField(term1377857, term1377857.getClass(), "preserveBackgroundColor", null);
        setIntField(term1377857, term1377857.getClass(), "numOfHWComponents", 0);
        setIntField(term1377857, term1377857.getClass(), "numOfLWComponents", 0);
        setField(term1377857, term1377857.getClass(), "modalComp", null);
        setField(term1377857, term1377857.getClass(), "modalAppContext", null);
        setIntField(term1377857, term1377857.getClass(), "containerSerializedDataVersion", 0);
        setField(term1377857, term1377857.getClass(), "peer", null);
        setField(term1377857, term1377857.getClass(), "parent", null);
        setField(term1377857, term1377857.getClass(), "appContext", null);
        setIntField(term1377857, term1377857.getClass(), "x", 0);
        setIntField(term1377857, term1377857.getClass(), "y", 0);
        setIntField(term1377857, term1377857.getClass(), "width", 0);
        setIntField(term1377857, term1377857.getClass(), "height", 0);
        setField(term1377857, term1377857.getClass(), "foreground", null);
        setField(term1377857, term1377857.getClass(), "background", null);
        setField(term1377857, term1377857.getClass(), "font", null);
        setField(term1377857, term1377857.getClass(), "peerFont", null);
        setField(term1377857, term1377857.getClass(), "cursor", null);
        setField(term1377857, term1377857.getClass(), "locale", null);
        setField(term1377857, term1377857.getClass(), "graphicsConfig", null);
        setField(term1377857, term1377857.getClass(), "bufferStrategy", null);
        setBooleanField(term1377857, term1377857.getClass(), "ignoreRepaint", false);
        setBooleanField(term1377857, term1377857.getClass(), "visible", false);
        setBooleanField(term1377857, term1377857.getClass(), "enabled", false);
        setBooleanField(term1377857, term1377857.getClass(), "valid", false);
        setField(term1377857, term1377857.getClass(), "dropTarget", null);
        setField(term1377857, term1377857.getClass(), "popups", null);
        setField(term1377857, term1377857.getClass(), "name", null);
        setBooleanField(term1377857, term1377857.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1377857, term1377857.getClass(), "focusable", false);
        setIntField(term1377857, term1377857.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1377857, term1377857.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1377857, term1377857.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1377857, term1377857.getClass(), "acc", null);
        setField(term1377857, term1377857.getClass(), "minSize", null);
        setBooleanField(term1377857, term1377857.getClass(), "minSizeSet", false);
        setField(term1377857, term1377857.getClass(), "prefSize", null);
        setBooleanField(term1377857, term1377857.getClass(), "prefSizeSet", false);
        setField(term1377857, term1377857.getClass(), "maxSize", null);
        setBooleanField(term1377857, term1377857.getClass(), "maxSizeSet", false);
        setField(term1377857, term1377857.getClass(), "componentOrientation", null);
        setBooleanField(term1377857, term1377857.getClass(), "newEventsOnly", false);
        setField(term1377857, term1377857.getClass(), "componentListener", null);
        setField(term1377857, term1377857.getClass(), "focusListener", null);
        setField(term1377857, term1377857.getClass(), "hierarchyListener", null);
        setField(term1377857, term1377857.getClass(), "hierarchyBoundsListener", null);
        setField(term1377857, term1377857.getClass(), "keyListener", null);
        setField(term1377857, term1377857.getClass(), "mouseListener", null);
        setField(term1377857, term1377857.getClass(), "mouseMotionListener", null);
        setField(term1377857, term1377857.getClass(), "mouseWheelListener", null);
        setField(term1377857, term1377857.getClass(), "inputMethodListener", null);
        setLongField(term1377857, term1377857.getClass(), "eventMask", 0L);
        setField(term1377857, term1377857.getClass(), "changeSupport", null);
        setField(term1377857, term1377857.getClass(), "objectLock", null);
        setBooleanField(term1377857, term1377857.getClass(), "isPacked", false);
        setIntField(term1377857, term1377857.getClass(), "boundsOp", 0);
        setField(term1377857, term1377857.getClass(), "compoundShape", null);
        setField(term1377857, term1377857.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1377857, term1377857.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1377857, term1377857.getClass(), "backgroundEraseDisabled", false);
        setField(term1377857, term1377857.getClass(), "eventCache", null);
        setBooleanField(term1377857, term1377857.getClass(), "coalescingEnabled", false);
        setBooleanField(term1377857, term1377857.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1377857, term1377857.getClass(), "componentSerializedDataVersion", 0);
        setField(term1377857, term1377857.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "searchDeepSpaceAnchors", argTypes, term1377857, args);
    }

};


