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

public class AITurnView_doVoting_179427709294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1378309;

    public AITurnView_doVoting_179427709294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1378309 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1378309, term1378309.getClass(), "label", null);
        setField(term1378309, term1378309.getClass(), "game", null);
        setIntField(term1378309, term1378309.getClass(), "textAnim", 0);
        setIntField(term1378309, term1378309.getClass(), "cx", 0);
        setIntField(term1378309, term1378309.getClass(), "cy", 0);
        setField(term1378309, term1378309.getClass(), "aiThread", null);
        setBooleanField(term1378309, term1378309.getClass(), "readyToMove", false);
        setField(term1378309, term1378309.getClass(), "nextState", null);
        setField(term1378309, term1378309.getClass(), "nextStateObject", null);
        setBooleanField(term1378309, term1378309.getClass(), "isAlignmentXSet", false);
        setFloatField(term1378309, term1378309.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1378309, term1378309.getClass(), "isAlignmentYSet", false);
        setFloatField(term1378309, term1378309.getClass(), "alignmentY", 0.0F);
        setField(term1378309, term1378309.getClass(), "ui", null);
        setField(term1378309, term1378309.getClass(), "listenerList", null);
        setField(term1378309, term1378309.getClass(), "clientProperties", null);
        setField(term1378309, term1378309.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1378309, term1378309.getClass(), "autoscrolls", false);
        setField(term1378309, term1378309.getClass(), "border", null);
        setIntField(term1378309, term1378309.getClass(), "flags", 0);
        setField(term1378309, term1378309.getClass(), "inputVerifier", null);
        setBooleanField(term1378309, term1378309.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1378309, term1378309.getClass(), "paintingChild", null);
        setField(term1378309, term1378309.getClass(), "popupMenu", null);
        setField(term1378309, term1378309.getClass(), "revalidateRunnableScheduled", null);
        setField(term1378309, term1378309.getClass(), "focusInputMap", null);
        setField(term1378309, term1378309.getClass(), "ancestorInputMap", null);
        setField(term1378309, term1378309.getClass(), "windowInputMap", null);
        setField(term1378309, term1378309.getClass(), "actionMap", null);
        setField(term1378309, term1378309.getClass(), "aaHint", null);
        setField(term1378309, term1378309.getClass(), "lcdRenderingHint", null);
        setField(term1378309, term1378309.getClass(), "component", null);
        setField(term1378309, term1378309.getClass(), "layoutMgr", null);
        setField(term1378309, term1378309.getClass(), "dispatcher", null);
        setField(term1378309, term1378309.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1378309, term1378309.getClass(), "focusCycleRoot", false);
        setBooleanField(term1378309, term1378309.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1378309, term1378309.getClass(), "printingThreads", null);
        setBooleanField(term1378309, term1378309.getClass(), "printing", false);
        setField(term1378309, term1378309.getClass(), "containerListener", null);
        setIntField(term1378309, term1378309.getClass(), "listeningChildren", 0);
        setIntField(term1378309, term1378309.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1378309, term1378309.getClass(), "descendantsCount", 0);
        setField(term1378309, term1378309.getClass(), "preserveBackgroundColor", null);
        setIntField(term1378309, term1378309.getClass(), "numOfHWComponents", 0);
        setIntField(term1378309, term1378309.getClass(), "numOfLWComponents", 0);
        setField(term1378309, term1378309.getClass(), "modalComp", null);
        setField(term1378309, term1378309.getClass(), "modalAppContext", null);
        setIntField(term1378309, term1378309.getClass(), "containerSerializedDataVersion", 0);
        setField(term1378309, term1378309.getClass(), "peer", null);
        setField(term1378309, term1378309.getClass(), "parent", null);
        setField(term1378309, term1378309.getClass(), "appContext", null);
        setIntField(term1378309, term1378309.getClass(), "x", 0);
        setIntField(term1378309, term1378309.getClass(), "y", 0);
        setIntField(term1378309, term1378309.getClass(), "width", 0);
        setIntField(term1378309, term1378309.getClass(), "height", 0);
        setField(term1378309, term1378309.getClass(), "foreground", null);
        setField(term1378309, term1378309.getClass(), "background", null);
        setField(term1378309, term1378309.getClass(), "font", null);
        setField(term1378309, term1378309.getClass(), "peerFont", null);
        setField(term1378309, term1378309.getClass(), "cursor", null);
        setField(term1378309, term1378309.getClass(), "locale", null);
        setField(term1378309, term1378309.getClass(), "graphicsConfig", null);
        setField(term1378309, term1378309.getClass(), "bufferStrategy", null);
        setBooleanField(term1378309, term1378309.getClass(), "ignoreRepaint", false);
        setBooleanField(term1378309, term1378309.getClass(), "visible", false);
        setBooleanField(term1378309, term1378309.getClass(), "enabled", false);
        setBooleanField(term1378309, term1378309.getClass(), "valid", false);
        setField(term1378309, term1378309.getClass(), "dropTarget", null);
        setField(term1378309, term1378309.getClass(), "popups", null);
        setField(term1378309, term1378309.getClass(), "name", null);
        setBooleanField(term1378309, term1378309.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1378309, term1378309.getClass(), "focusable", false);
        setIntField(term1378309, term1378309.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1378309, term1378309.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1378309, term1378309.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1378309, term1378309.getClass(), "acc", null);
        setField(term1378309, term1378309.getClass(), "minSize", null);
        setBooleanField(term1378309, term1378309.getClass(), "minSizeSet", false);
        setField(term1378309, term1378309.getClass(), "prefSize", null);
        setBooleanField(term1378309, term1378309.getClass(), "prefSizeSet", false);
        setField(term1378309, term1378309.getClass(), "maxSize", null);
        setBooleanField(term1378309, term1378309.getClass(), "maxSizeSet", false);
        setField(term1378309, term1378309.getClass(), "componentOrientation", null);
        setBooleanField(term1378309, term1378309.getClass(), "newEventsOnly", false);
        setField(term1378309, term1378309.getClass(), "componentListener", null);
        setField(term1378309, term1378309.getClass(), "focusListener", null);
        setField(term1378309, term1378309.getClass(), "hierarchyListener", null);
        setField(term1378309, term1378309.getClass(), "hierarchyBoundsListener", null);
        setField(term1378309, term1378309.getClass(), "keyListener", null);
        setField(term1378309, term1378309.getClass(), "mouseListener", null);
        setField(term1378309, term1378309.getClass(), "mouseMotionListener", null);
        setField(term1378309, term1378309.getClass(), "mouseWheelListener", null);
        setField(term1378309, term1378309.getClass(), "inputMethodListener", null);
        setLongField(term1378309, term1378309.getClass(), "eventMask", 0L);
        setField(term1378309, term1378309.getClass(), "changeSupport", null);
        setField(term1378309, term1378309.getClass(), "objectLock", null);
        setBooleanField(term1378309, term1378309.getClass(), "isPacked", false);
        setIntField(term1378309, term1378309.getClass(), "boundsOp", 0);
        setField(term1378309, term1378309.getClass(), "compoundShape", null);
        setField(term1378309, term1378309.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1378309, term1378309.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1378309, term1378309.getClass(), "backgroundEraseDisabled", false);
        setField(term1378309, term1378309.getClass(), "eventCache", null);
        setBooleanField(term1378309, term1378309.getClass(), "coalescingEnabled", false);
        setBooleanField(term1378309, term1378309.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1378309, term1378309.getClass(), "componentSerializedDataVersion", 0);
        setField(term1378309, term1378309.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.vote.Vote");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerList");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "doVoting", argTypes, term1378309, args);
    }

};


