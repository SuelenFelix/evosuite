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

public class AITurnView_getKillChance_973232129102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1418898;

    public AITurnView_getKillChance_973232129102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1418898 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1418898, term1418898.getClass(), "label", null);
        setField(term1418898, term1418898.getClass(), "game", null);
        setIntField(term1418898, term1418898.getClass(), "textAnim", 0);
        setIntField(term1418898, term1418898.getClass(), "cx", 0);
        setIntField(term1418898, term1418898.getClass(), "cy", 0);
        setField(term1418898, term1418898.getClass(), "aiThread", null);
        setBooleanField(term1418898, term1418898.getClass(), "readyToMove", false);
        setField(term1418898, term1418898.getClass(), "nextState", null);
        setField(term1418898, term1418898.getClass(), "nextStateObject", null);
        setBooleanField(term1418898, term1418898.getClass(), "isAlignmentXSet", false);
        setFloatField(term1418898, term1418898.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1418898, term1418898.getClass(), "isAlignmentYSet", false);
        setFloatField(term1418898, term1418898.getClass(), "alignmentY", 0.0F);
        setField(term1418898, term1418898.getClass(), "ui", null);
        setField(term1418898, term1418898.getClass(), "listenerList", null);
        setField(term1418898, term1418898.getClass(), "clientProperties", null);
        setField(term1418898, term1418898.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1418898, term1418898.getClass(), "autoscrolls", false);
        setField(term1418898, term1418898.getClass(), "border", null);
        setIntField(term1418898, term1418898.getClass(), "flags", 0);
        setField(term1418898, term1418898.getClass(), "inputVerifier", null);
        setBooleanField(term1418898, term1418898.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1418898, term1418898.getClass(), "paintingChild", null);
        setField(term1418898, term1418898.getClass(), "popupMenu", null);
        setField(term1418898, term1418898.getClass(), "revalidateRunnableScheduled", null);
        setField(term1418898, term1418898.getClass(), "focusInputMap", null);
        setField(term1418898, term1418898.getClass(), "ancestorInputMap", null);
        setField(term1418898, term1418898.getClass(), "windowInputMap", null);
        setField(term1418898, term1418898.getClass(), "actionMap", null);
        setField(term1418898, term1418898.getClass(), "aaHint", null);
        setField(term1418898, term1418898.getClass(), "lcdRenderingHint", null);
        setField(term1418898, term1418898.getClass(), "component", null);
        setField(term1418898, term1418898.getClass(), "layoutMgr", null);
        setField(term1418898, term1418898.getClass(), "dispatcher", null);
        setField(term1418898, term1418898.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1418898, term1418898.getClass(), "focusCycleRoot", false);
        setBooleanField(term1418898, term1418898.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1418898, term1418898.getClass(), "printingThreads", null);
        setBooleanField(term1418898, term1418898.getClass(), "printing", false);
        setField(term1418898, term1418898.getClass(), "containerListener", null);
        setIntField(term1418898, term1418898.getClass(), "listeningChildren", 0);
        setIntField(term1418898, term1418898.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1418898, term1418898.getClass(), "descendantsCount", 0);
        setField(term1418898, term1418898.getClass(), "preserveBackgroundColor", null);
        setIntField(term1418898, term1418898.getClass(), "numOfHWComponents", 0);
        setIntField(term1418898, term1418898.getClass(), "numOfLWComponents", 0);
        setField(term1418898, term1418898.getClass(), "modalComp", null);
        setField(term1418898, term1418898.getClass(), "modalAppContext", null);
        setIntField(term1418898, term1418898.getClass(), "containerSerializedDataVersion", 0);
        setField(term1418898, term1418898.getClass(), "peer", null);
        setField(term1418898, term1418898.getClass(), "parent", null);
        setField(term1418898, term1418898.getClass(), "appContext", null);
        setIntField(term1418898, term1418898.getClass(), "x", 0);
        setIntField(term1418898, term1418898.getClass(), "y", 0);
        setIntField(term1418898, term1418898.getClass(), "width", 0);
        setIntField(term1418898, term1418898.getClass(), "height", 0);
        setField(term1418898, term1418898.getClass(), "foreground", null);
        setField(term1418898, term1418898.getClass(), "background", null);
        setField(term1418898, term1418898.getClass(), "font", null);
        setField(term1418898, term1418898.getClass(), "peerFont", null);
        setField(term1418898, term1418898.getClass(), "cursor", null);
        setField(term1418898, term1418898.getClass(), "locale", null);
        setField(term1418898, term1418898.getClass(), "graphicsConfig", null);
        setField(term1418898, term1418898.getClass(), "bufferStrategy", null);
        setBooleanField(term1418898, term1418898.getClass(), "ignoreRepaint", false);
        setBooleanField(term1418898, term1418898.getClass(), "visible", false);
        setBooleanField(term1418898, term1418898.getClass(), "enabled", false);
        setBooleanField(term1418898, term1418898.getClass(), "valid", false);
        setField(term1418898, term1418898.getClass(), "dropTarget", null);
        setField(term1418898, term1418898.getClass(), "popups", null);
        setField(term1418898, term1418898.getClass(), "name", null);
        setBooleanField(term1418898, term1418898.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1418898, term1418898.getClass(), "focusable", false);
        setIntField(term1418898, term1418898.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1418898, term1418898.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1418898, term1418898.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1418898, term1418898.getClass(), "acc", null);
        setField(term1418898, term1418898.getClass(), "minSize", null);
        setBooleanField(term1418898, term1418898.getClass(), "minSizeSet", false);
        setField(term1418898, term1418898.getClass(), "prefSize", null);
        setBooleanField(term1418898, term1418898.getClass(), "prefSizeSet", false);
        setField(term1418898, term1418898.getClass(), "maxSize", null);
        setBooleanField(term1418898, term1418898.getClass(), "maxSizeSet", false);
        setField(term1418898, term1418898.getClass(), "componentOrientation", null);
        setBooleanField(term1418898, term1418898.getClass(), "newEventsOnly", false);
        setField(term1418898, term1418898.getClass(), "componentListener", null);
        setField(term1418898, term1418898.getClass(), "focusListener", null);
        setField(term1418898, term1418898.getClass(), "hierarchyListener", null);
        setField(term1418898, term1418898.getClass(), "hierarchyBoundsListener", null);
        setField(term1418898, term1418898.getClass(), "keyListener", null);
        setField(term1418898, term1418898.getClass(), "mouseListener", null);
        setField(term1418898, term1418898.getClass(), "mouseMotionListener", null);
        setField(term1418898, term1418898.getClass(), "mouseWheelListener", null);
        setField(term1418898, term1418898.getClass(), "inputMethodListener", null);
        setLongField(term1418898, term1418898.getClass(), "eventMask", 0L);
        setField(term1418898, term1418898.getClass(), "changeSupport", null);
        setField(term1418898, term1418898.getClass(), "objectLock", null);
        setBooleanField(term1418898, term1418898.getClass(), "isPacked", false);
        setIntField(term1418898, term1418898.getClass(), "boundsOp", 0);
        setField(term1418898, term1418898.getClass(), "compoundShape", null);
        setField(term1418898, term1418898.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1418898, term1418898.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1418898, term1418898.getClass(), "backgroundEraseDisabled", false);
        setField(term1418898, term1418898.getClass(), "eventCache", null);
        setBooleanField(term1418898, term1418898.getClass(), "coalescingEnabled", false);
        setBooleanField(term1418898, term1418898.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1418898, term1418898.getClass(), "componentSerializedDataVersion", 0);
        setField(term1418898, term1418898.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.leader.Leader");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.leader.Leader");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "getKillChance", argTypes, term1418898, args);
    }

};


