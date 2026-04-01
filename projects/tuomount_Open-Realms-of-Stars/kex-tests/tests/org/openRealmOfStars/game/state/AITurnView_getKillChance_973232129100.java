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

public class AITurnView_getKillChance_973232129100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1378579;

    public AITurnView_getKillChance_973232129100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1378579 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1378579, term1378579.getClass(), "label", null);
        setField(term1378579, term1378579.getClass(), "game", null);
        setIntField(term1378579, term1378579.getClass(), "textAnim", 0);
        setIntField(term1378579, term1378579.getClass(), "cx", 0);
        setIntField(term1378579, term1378579.getClass(), "cy", 0);
        setField(term1378579, term1378579.getClass(), "aiThread", null);
        setBooleanField(term1378579, term1378579.getClass(), "readyToMove", false);
        setField(term1378579, term1378579.getClass(), "nextState", null);
        setField(term1378579, term1378579.getClass(), "nextStateObject", null);
        setBooleanField(term1378579, term1378579.getClass(), "isAlignmentXSet", false);
        setFloatField(term1378579, term1378579.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1378579, term1378579.getClass(), "isAlignmentYSet", false);
        setFloatField(term1378579, term1378579.getClass(), "alignmentY", 0.0F);
        setField(term1378579, term1378579.getClass(), "ui", null);
        setField(term1378579, term1378579.getClass(), "listenerList", null);
        setField(term1378579, term1378579.getClass(), "clientProperties", null);
        setField(term1378579, term1378579.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1378579, term1378579.getClass(), "autoscrolls", false);
        setField(term1378579, term1378579.getClass(), "border", null);
        setIntField(term1378579, term1378579.getClass(), "flags", 0);
        setField(term1378579, term1378579.getClass(), "inputVerifier", null);
        setBooleanField(term1378579, term1378579.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1378579, term1378579.getClass(), "paintingChild", null);
        setField(term1378579, term1378579.getClass(), "popupMenu", null);
        setField(term1378579, term1378579.getClass(), "revalidateRunnableScheduled", null);
        setField(term1378579, term1378579.getClass(), "focusInputMap", null);
        setField(term1378579, term1378579.getClass(), "ancestorInputMap", null);
        setField(term1378579, term1378579.getClass(), "windowInputMap", null);
        setField(term1378579, term1378579.getClass(), "actionMap", null);
        setField(term1378579, term1378579.getClass(), "aaHint", null);
        setField(term1378579, term1378579.getClass(), "lcdRenderingHint", null);
        setField(term1378579, term1378579.getClass(), "component", null);
        setField(term1378579, term1378579.getClass(), "layoutMgr", null);
        setField(term1378579, term1378579.getClass(), "dispatcher", null);
        setField(term1378579, term1378579.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1378579, term1378579.getClass(), "focusCycleRoot", false);
        setBooleanField(term1378579, term1378579.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1378579, term1378579.getClass(), "printingThreads", null);
        setBooleanField(term1378579, term1378579.getClass(), "printing", false);
        setField(term1378579, term1378579.getClass(), "containerListener", null);
        setIntField(term1378579, term1378579.getClass(), "listeningChildren", 0);
        setIntField(term1378579, term1378579.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1378579, term1378579.getClass(), "descendantsCount", 0);
        setField(term1378579, term1378579.getClass(), "preserveBackgroundColor", null);
        setIntField(term1378579, term1378579.getClass(), "numOfHWComponents", 0);
        setIntField(term1378579, term1378579.getClass(), "numOfLWComponents", 0);
        setField(term1378579, term1378579.getClass(), "modalComp", null);
        setField(term1378579, term1378579.getClass(), "modalAppContext", null);
        setIntField(term1378579, term1378579.getClass(), "containerSerializedDataVersion", 0);
        setField(term1378579, term1378579.getClass(), "peer", null);
        setField(term1378579, term1378579.getClass(), "parent", null);
        setField(term1378579, term1378579.getClass(), "appContext", null);
        setIntField(term1378579, term1378579.getClass(), "x", 0);
        setIntField(term1378579, term1378579.getClass(), "y", 0);
        setIntField(term1378579, term1378579.getClass(), "width", 0);
        setIntField(term1378579, term1378579.getClass(), "height", 0);
        setField(term1378579, term1378579.getClass(), "foreground", null);
        setField(term1378579, term1378579.getClass(), "background", null);
        setField(term1378579, term1378579.getClass(), "font", null);
        setField(term1378579, term1378579.getClass(), "peerFont", null);
        setField(term1378579, term1378579.getClass(), "cursor", null);
        setField(term1378579, term1378579.getClass(), "locale", null);
        setField(term1378579, term1378579.getClass(), "graphicsConfig", null);
        setField(term1378579, term1378579.getClass(), "bufferStrategy", null);
        setBooleanField(term1378579, term1378579.getClass(), "ignoreRepaint", false);
        setBooleanField(term1378579, term1378579.getClass(), "visible", false);
        setBooleanField(term1378579, term1378579.getClass(), "enabled", false);
        setBooleanField(term1378579, term1378579.getClass(), "valid", false);
        setField(term1378579, term1378579.getClass(), "dropTarget", null);
        setField(term1378579, term1378579.getClass(), "popups", null);
        setField(term1378579, term1378579.getClass(), "name", null);
        setBooleanField(term1378579, term1378579.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1378579, term1378579.getClass(), "focusable", false);
        setIntField(term1378579, term1378579.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1378579, term1378579.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1378579, term1378579.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1378579, term1378579.getClass(), "acc", null);
        setField(term1378579, term1378579.getClass(), "minSize", null);
        setBooleanField(term1378579, term1378579.getClass(), "minSizeSet", false);
        setField(term1378579, term1378579.getClass(), "prefSize", null);
        setBooleanField(term1378579, term1378579.getClass(), "prefSizeSet", false);
        setField(term1378579, term1378579.getClass(), "maxSize", null);
        setBooleanField(term1378579, term1378579.getClass(), "maxSizeSet", false);
        setField(term1378579, term1378579.getClass(), "componentOrientation", null);
        setBooleanField(term1378579, term1378579.getClass(), "newEventsOnly", false);
        setField(term1378579, term1378579.getClass(), "componentListener", null);
        setField(term1378579, term1378579.getClass(), "focusListener", null);
        setField(term1378579, term1378579.getClass(), "hierarchyListener", null);
        setField(term1378579, term1378579.getClass(), "hierarchyBoundsListener", null);
        setField(term1378579, term1378579.getClass(), "keyListener", null);
        setField(term1378579, term1378579.getClass(), "mouseListener", null);
        setField(term1378579, term1378579.getClass(), "mouseMotionListener", null);
        setField(term1378579, term1378579.getClass(), "mouseWheelListener", null);
        setField(term1378579, term1378579.getClass(), "inputMethodListener", null);
        setLongField(term1378579, term1378579.getClass(), "eventMask", 0L);
        setField(term1378579, term1378579.getClass(), "changeSupport", null);
        setField(term1378579, term1378579.getClass(), "objectLock", null);
        setBooleanField(term1378579, term1378579.getClass(), "isPacked", false);
        setIntField(term1378579, term1378579.getClass(), "boundsOp", 0);
        setField(term1378579, term1378579.getClass(), "compoundShape", null);
        setField(term1378579, term1378579.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1378579, term1378579.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1378579, term1378579.getClass(), "backgroundEraseDisabled", false);
        setField(term1378579, term1378579.getClass(), "eventCache", null);
        setBooleanField(term1378579, term1378579.getClass(), "coalescingEnabled", false);
        setBooleanField(term1378579, term1378579.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1378579, term1378579.getClass(), "componentSerializedDataVersion", 0);
        setField(term1378579, term1378579.getClass(), "accessibleContext", null);
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
        callMethod(klass, "getKillChance", argTypes, term1378579, args);
    }

};


