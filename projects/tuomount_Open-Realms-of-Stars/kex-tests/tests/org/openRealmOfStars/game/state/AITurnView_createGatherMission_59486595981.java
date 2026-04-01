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

public class AITurnView_createGatherMission_59486595981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1377722;

    public AITurnView_createGatherMission_59486595981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1377722 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1377722, term1377722.getClass(), "label", null);
        setField(term1377722, term1377722.getClass(), "game", null);
        setIntField(term1377722, term1377722.getClass(), "textAnim", 0);
        setIntField(term1377722, term1377722.getClass(), "cx", 0);
        setIntField(term1377722, term1377722.getClass(), "cy", 0);
        setField(term1377722, term1377722.getClass(), "aiThread", null);
        setBooleanField(term1377722, term1377722.getClass(), "readyToMove", false);
        setField(term1377722, term1377722.getClass(), "nextState", null);
        setField(term1377722, term1377722.getClass(), "nextStateObject", null);
        setBooleanField(term1377722, term1377722.getClass(), "isAlignmentXSet", false);
        setFloatField(term1377722, term1377722.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1377722, term1377722.getClass(), "isAlignmentYSet", false);
        setFloatField(term1377722, term1377722.getClass(), "alignmentY", 0.0F);
        setField(term1377722, term1377722.getClass(), "ui", null);
        setField(term1377722, term1377722.getClass(), "listenerList", null);
        setField(term1377722, term1377722.getClass(), "clientProperties", null);
        setField(term1377722, term1377722.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1377722, term1377722.getClass(), "autoscrolls", false);
        setField(term1377722, term1377722.getClass(), "border", null);
        setIntField(term1377722, term1377722.getClass(), "flags", 0);
        setField(term1377722, term1377722.getClass(), "inputVerifier", null);
        setBooleanField(term1377722, term1377722.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1377722, term1377722.getClass(), "paintingChild", null);
        setField(term1377722, term1377722.getClass(), "popupMenu", null);
        setField(term1377722, term1377722.getClass(), "revalidateRunnableScheduled", null);
        setField(term1377722, term1377722.getClass(), "focusInputMap", null);
        setField(term1377722, term1377722.getClass(), "ancestorInputMap", null);
        setField(term1377722, term1377722.getClass(), "windowInputMap", null);
        setField(term1377722, term1377722.getClass(), "actionMap", null);
        setField(term1377722, term1377722.getClass(), "aaHint", null);
        setField(term1377722, term1377722.getClass(), "lcdRenderingHint", null);
        setField(term1377722, term1377722.getClass(), "component", null);
        setField(term1377722, term1377722.getClass(), "layoutMgr", null);
        setField(term1377722, term1377722.getClass(), "dispatcher", null);
        setField(term1377722, term1377722.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1377722, term1377722.getClass(), "focusCycleRoot", false);
        setBooleanField(term1377722, term1377722.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1377722, term1377722.getClass(), "printingThreads", null);
        setBooleanField(term1377722, term1377722.getClass(), "printing", false);
        setField(term1377722, term1377722.getClass(), "containerListener", null);
        setIntField(term1377722, term1377722.getClass(), "listeningChildren", 0);
        setIntField(term1377722, term1377722.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1377722, term1377722.getClass(), "descendantsCount", 0);
        setField(term1377722, term1377722.getClass(), "preserveBackgroundColor", null);
        setIntField(term1377722, term1377722.getClass(), "numOfHWComponents", 0);
        setIntField(term1377722, term1377722.getClass(), "numOfLWComponents", 0);
        setField(term1377722, term1377722.getClass(), "modalComp", null);
        setField(term1377722, term1377722.getClass(), "modalAppContext", null);
        setIntField(term1377722, term1377722.getClass(), "containerSerializedDataVersion", 0);
        setField(term1377722, term1377722.getClass(), "peer", null);
        setField(term1377722, term1377722.getClass(), "parent", null);
        setField(term1377722, term1377722.getClass(), "appContext", null);
        setIntField(term1377722, term1377722.getClass(), "x", 0);
        setIntField(term1377722, term1377722.getClass(), "y", 0);
        setIntField(term1377722, term1377722.getClass(), "width", 0);
        setIntField(term1377722, term1377722.getClass(), "height", 0);
        setField(term1377722, term1377722.getClass(), "foreground", null);
        setField(term1377722, term1377722.getClass(), "background", null);
        setField(term1377722, term1377722.getClass(), "font", null);
        setField(term1377722, term1377722.getClass(), "peerFont", null);
        setField(term1377722, term1377722.getClass(), "cursor", null);
        setField(term1377722, term1377722.getClass(), "locale", null);
        setField(term1377722, term1377722.getClass(), "graphicsConfig", null);
        setField(term1377722, term1377722.getClass(), "bufferStrategy", null);
        setBooleanField(term1377722, term1377722.getClass(), "ignoreRepaint", false);
        setBooleanField(term1377722, term1377722.getClass(), "visible", false);
        setBooleanField(term1377722, term1377722.getClass(), "enabled", false);
        setBooleanField(term1377722, term1377722.getClass(), "valid", false);
        setField(term1377722, term1377722.getClass(), "dropTarget", null);
        setField(term1377722, term1377722.getClass(), "popups", null);
        setField(term1377722, term1377722.getClass(), "name", null);
        setBooleanField(term1377722, term1377722.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1377722, term1377722.getClass(), "focusable", false);
        setIntField(term1377722, term1377722.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1377722, term1377722.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1377722, term1377722.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1377722, term1377722.getClass(), "acc", null);
        setField(term1377722, term1377722.getClass(), "minSize", null);
        setBooleanField(term1377722, term1377722.getClass(), "minSizeSet", false);
        setField(term1377722, term1377722.getClass(), "prefSize", null);
        setBooleanField(term1377722, term1377722.getClass(), "prefSizeSet", false);
        setField(term1377722, term1377722.getClass(), "maxSize", null);
        setBooleanField(term1377722, term1377722.getClass(), "maxSizeSet", false);
        setField(term1377722, term1377722.getClass(), "componentOrientation", null);
        setBooleanField(term1377722, term1377722.getClass(), "newEventsOnly", false);
        setField(term1377722, term1377722.getClass(), "componentListener", null);
        setField(term1377722, term1377722.getClass(), "focusListener", null);
        setField(term1377722, term1377722.getClass(), "hierarchyListener", null);
        setField(term1377722, term1377722.getClass(), "hierarchyBoundsListener", null);
        setField(term1377722, term1377722.getClass(), "keyListener", null);
        setField(term1377722, term1377722.getClass(), "mouseListener", null);
        setField(term1377722, term1377722.getClass(), "mouseMotionListener", null);
        setField(term1377722, term1377722.getClass(), "mouseWheelListener", null);
        setField(term1377722, term1377722.getClass(), "inputMethodListener", null);
        setLongField(term1377722, term1377722.getClass(), "eventMask", 0L);
        setField(term1377722, term1377722.getClass(), "changeSupport", null);
        setField(term1377722, term1377722.getClass(), "objectLock", null);
        setBooleanField(term1377722, term1377722.getClass(), "isPacked", false);
        setIntField(term1377722, term1377722.getClass(), "boundsOp", 0);
        setField(term1377722, term1377722.getClass(), "compoundShape", null);
        setField(term1377722, term1377722.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1377722, term1377722.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1377722, term1377722.getClass(), "backgroundEraseDisabled", false);
        setField(term1377722, term1377722.getClass(), "eventCache", null);
        setBooleanField(term1377722, term1377722.getClass(), "coalescingEnabled", false);
        setBooleanField(term1377722, term1377722.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1377722, term1377722.getClass(), "componentSerializedDataVersion", 0);
        setField(term1377722, term1377722.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.ai.mission.Mission");
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "createGatherMission", argTypes, term1377722, args);
    }

};


