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

public class AITurnView_calculateCorruptionLevel_604400732103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1418943;

    public AITurnView_calculateCorruptionLevel_604400732103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1418943 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1418943, term1418943.getClass(), "label", null);
        setField(term1418943, term1418943.getClass(), "game", null);
        setIntField(term1418943, term1418943.getClass(), "textAnim", 0);
        setIntField(term1418943, term1418943.getClass(), "cx", 0);
        setIntField(term1418943, term1418943.getClass(), "cy", 0);
        setField(term1418943, term1418943.getClass(), "aiThread", null);
        setBooleanField(term1418943, term1418943.getClass(), "readyToMove", false);
        setField(term1418943, term1418943.getClass(), "nextState", null);
        setField(term1418943, term1418943.getClass(), "nextStateObject", null);
        setBooleanField(term1418943, term1418943.getClass(), "isAlignmentXSet", false);
        setFloatField(term1418943, term1418943.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1418943, term1418943.getClass(), "isAlignmentYSet", false);
        setFloatField(term1418943, term1418943.getClass(), "alignmentY", 0.0F);
        setField(term1418943, term1418943.getClass(), "ui", null);
        setField(term1418943, term1418943.getClass(), "listenerList", null);
        setField(term1418943, term1418943.getClass(), "clientProperties", null);
        setField(term1418943, term1418943.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1418943, term1418943.getClass(), "autoscrolls", false);
        setField(term1418943, term1418943.getClass(), "border", null);
        setIntField(term1418943, term1418943.getClass(), "flags", 0);
        setField(term1418943, term1418943.getClass(), "inputVerifier", null);
        setBooleanField(term1418943, term1418943.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1418943, term1418943.getClass(), "paintingChild", null);
        setField(term1418943, term1418943.getClass(), "popupMenu", null);
        setField(term1418943, term1418943.getClass(), "revalidateRunnableScheduled", null);
        setField(term1418943, term1418943.getClass(), "focusInputMap", null);
        setField(term1418943, term1418943.getClass(), "ancestorInputMap", null);
        setField(term1418943, term1418943.getClass(), "windowInputMap", null);
        setField(term1418943, term1418943.getClass(), "actionMap", null);
        setField(term1418943, term1418943.getClass(), "aaHint", null);
        setField(term1418943, term1418943.getClass(), "lcdRenderingHint", null);
        setField(term1418943, term1418943.getClass(), "component", null);
        setField(term1418943, term1418943.getClass(), "layoutMgr", null);
        setField(term1418943, term1418943.getClass(), "dispatcher", null);
        setField(term1418943, term1418943.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1418943, term1418943.getClass(), "focusCycleRoot", false);
        setBooleanField(term1418943, term1418943.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1418943, term1418943.getClass(), "printingThreads", null);
        setBooleanField(term1418943, term1418943.getClass(), "printing", false);
        setField(term1418943, term1418943.getClass(), "containerListener", null);
        setIntField(term1418943, term1418943.getClass(), "listeningChildren", 0);
        setIntField(term1418943, term1418943.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1418943, term1418943.getClass(), "descendantsCount", 0);
        setField(term1418943, term1418943.getClass(), "preserveBackgroundColor", null);
        setIntField(term1418943, term1418943.getClass(), "numOfHWComponents", 0);
        setIntField(term1418943, term1418943.getClass(), "numOfLWComponents", 0);
        setField(term1418943, term1418943.getClass(), "modalComp", null);
        setField(term1418943, term1418943.getClass(), "modalAppContext", null);
        setIntField(term1418943, term1418943.getClass(), "containerSerializedDataVersion", 0);
        setField(term1418943, term1418943.getClass(), "peer", null);
        setField(term1418943, term1418943.getClass(), "parent", null);
        setField(term1418943, term1418943.getClass(), "appContext", null);
        setIntField(term1418943, term1418943.getClass(), "x", 0);
        setIntField(term1418943, term1418943.getClass(), "y", 0);
        setIntField(term1418943, term1418943.getClass(), "width", 0);
        setIntField(term1418943, term1418943.getClass(), "height", 0);
        setField(term1418943, term1418943.getClass(), "foreground", null);
        setField(term1418943, term1418943.getClass(), "background", null);
        setField(term1418943, term1418943.getClass(), "font", null);
        setField(term1418943, term1418943.getClass(), "peerFont", null);
        setField(term1418943, term1418943.getClass(), "cursor", null);
        setField(term1418943, term1418943.getClass(), "locale", null);
        setField(term1418943, term1418943.getClass(), "graphicsConfig", null);
        setField(term1418943, term1418943.getClass(), "bufferStrategy", null);
        setBooleanField(term1418943, term1418943.getClass(), "ignoreRepaint", false);
        setBooleanField(term1418943, term1418943.getClass(), "visible", false);
        setBooleanField(term1418943, term1418943.getClass(), "enabled", false);
        setBooleanField(term1418943, term1418943.getClass(), "valid", false);
        setField(term1418943, term1418943.getClass(), "dropTarget", null);
        setField(term1418943, term1418943.getClass(), "popups", null);
        setField(term1418943, term1418943.getClass(), "name", null);
        setBooleanField(term1418943, term1418943.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1418943, term1418943.getClass(), "focusable", false);
        setIntField(term1418943, term1418943.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1418943, term1418943.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1418943, term1418943.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1418943, term1418943.getClass(), "acc", null);
        setField(term1418943, term1418943.getClass(), "minSize", null);
        setBooleanField(term1418943, term1418943.getClass(), "minSizeSet", false);
        setField(term1418943, term1418943.getClass(), "prefSize", null);
        setBooleanField(term1418943, term1418943.getClass(), "prefSizeSet", false);
        setField(term1418943, term1418943.getClass(), "maxSize", null);
        setBooleanField(term1418943, term1418943.getClass(), "maxSizeSet", false);
        setField(term1418943, term1418943.getClass(), "componentOrientation", null);
        setBooleanField(term1418943, term1418943.getClass(), "newEventsOnly", false);
        setField(term1418943, term1418943.getClass(), "componentListener", null);
        setField(term1418943, term1418943.getClass(), "focusListener", null);
        setField(term1418943, term1418943.getClass(), "hierarchyListener", null);
        setField(term1418943, term1418943.getClass(), "hierarchyBoundsListener", null);
        setField(term1418943, term1418943.getClass(), "keyListener", null);
        setField(term1418943, term1418943.getClass(), "mouseListener", null);
        setField(term1418943, term1418943.getClass(), "mouseMotionListener", null);
        setField(term1418943, term1418943.getClass(), "mouseWheelListener", null);
        setField(term1418943, term1418943.getClass(), "inputMethodListener", null);
        setLongField(term1418943, term1418943.getClass(), "eventMask", 0L);
        setField(term1418943, term1418943.getClass(), "changeSupport", null);
        setField(term1418943, term1418943.getClass(), "objectLock", null);
        setBooleanField(term1418943, term1418943.getClass(), "isPacked", false);
        setIntField(term1418943, term1418943.getClass(), "boundsOp", 0);
        setField(term1418943, term1418943.getClass(), "compoundShape", null);
        setField(term1418943, term1418943.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1418943, term1418943.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1418943, term1418943.getClass(), "backgroundEraseDisabled", false);
        setField(term1418943, term1418943.getClass(), "eventCache", null);
        setBooleanField(term1418943, term1418943.getClass(), "coalescingEnabled", false);
        setBooleanField(term1418943, term1418943.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1418943, term1418943.getClass(), "componentSerializedDataVersion", 0);
        setField(term1418943, term1418943.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "calculateCorruptionLevel", argTypes, term1418943, args);
    }

};


