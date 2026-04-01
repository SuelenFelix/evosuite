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

public class AITurnView_handleMissions_7052794604 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1054388;

    public AITurnView_handleMissions_7052794604() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1054388 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1054388, term1054388.getClass(), "label", null);
        setField(term1054388, term1054388.getClass(), "game", null);
        setIntField(term1054388, term1054388.getClass(), "textAnim", 0);
        setIntField(term1054388, term1054388.getClass(), "cx", 0);
        setIntField(term1054388, term1054388.getClass(), "cy", 0);
        setField(term1054388, term1054388.getClass(), "aiThread", null);
        setBooleanField(term1054388, term1054388.getClass(), "readyToMove", false);
        setField(term1054388, term1054388.getClass(), "nextState", null);
        setField(term1054388, term1054388.getClass(), "nextStateObject", null);
        setBooleanField(term1054388, term1054388.getClass(), "isAlignmentXSet", false);
        setFloatField(term1054388, term1054388.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1054388, term1054388.getClass(), "isAlignmentYSet", false);
        setFloatField(term1054388, term1054388.getClass(), "alignmentY", 0.0F);
        setField(term1054388, term1054388.getClass(), "ui", null);
        setField(term1054388, term1054388.getClass(), "listenerList", null);
        setField(term1054388, term1054388.getClass(), "clientProperties", null);
        setField(term1054388, term1054388.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1054388, term1054388.getClass(), "autoscrolls", false);
        setField(term1054388, term1054388.getClass(), "border", null);
        setIntField(term1054388, term1054388.getClass(), "flags", 0);
        setField(term1054388, term1054388.getClass(), "inputVerifier", null);
        setBooleanField(term1054388, term1054388.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1054388, term1054388.getClass(), "paintingChild", null);
        setField(term1054388, term1054388.getClass(), "popupMenu", null);
        setField(term1054388, term1054388.getClass(), "revalidateRunnableScheduled", null);
        setField(term1054388, term1054388.getClass(), "focusInputMap", null);
        setField(term1054388, term1054388.getClass(), "ancestorInputMap", null);
        setField(term1054388, term1054388.getClass(), "windowInputMap", null);
        setField(term1054388, term1054388.getClass(), "actionMap", null);
        setField(term1054388, term1054388.getClass(), "aaHint", null);
        setField(term1054388, term1054388.getClass(), "lcdRenderingHint", null);
        setField(term1054388, term1054388.getClass(), "component", null);
        setField(term1054388, term1054388.getClass(), "layoutMgr", null);
        setField(term1054388, term1054388.getClass(), "dispatcher", null);
        setField(term1054388, term1054388.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1054388, term1054388.getClass(), "focusCycleRoot", false);
        setBooleanField(term1054388, term1054388.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1054388, term1054388.getClass(), "printingThreads", null);
        setBooleanField(term1054388, term1054388.getClass(), "printing", false);
        setField(term1054388, term1054388.getClass(), "containerListener", null);
        setIntField(term1054388, term1054388.getClass(), "listeningChildren", 0);
        setIntField(term1054388, term1054388.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1054388, term1054388.getClass(), "descendantsCount", 0);
        setField(term1054388, term1054388.getClass(), "preserveBackgroundColor", null);
        setIntField(term1054388, term1054388.getClass(), "numOfHWComponents", 0);
        setIntField(term1054388, term1054388.getClass(), "numOfLWComponents", 0);
        setField(term1054388, term1054388.getClass(), "modalComp", null);
        setField(term1054388, term1054388.getClass(), "modalAppContext", null);
        setIntField(term1054388, term1054388.getClass(), "containerSerializedDataVersion", 0);
        setField(term1054388, term1054388.getClass(), "peer", null);
        setField(term1054388, term1054388.getClass(), "parent", null);
        setField(term1054388, term1054388.getClass(), "appContext", null);
        setIntField(term1054388, term1054388.getClass(), "x", 0);
        setIntField(term1054388, term1054388.getClass(), "y", 0);
        setIntField(term1054388, term1054388.getClass(), "width", 0);
        setIntField(term1054388, term1054388.getClass(), "height", 0);
        setField(term1054388, term1054388.getClass(), "foreground", null);
        setField(term1054388, term1054388.getClass(), "background", null);
        setField(term1054388, term1054388.getClass(), "font", null);
        setField(term1054388, term1054388.getClass(), "peerFont", null);
        setField(term1054388, term1054388.getClass(), "cursor", null);
        setField(term1054388, term1054388.getClass(), "locale", null);
        setField(term1054388, term1054388.getClass(), "graphicsConfig", null);
        setField(term1054388, term1054388.getClass(), "bufferStrategy", null);
        setBooleanField(term1054388, term1054388.getClass(), "ignoreRepaint", false);
        setBooleanField(term1054388, term1054388.getClass(), "visible", false);
        setBooleanField(term1054388, term1054388.getClass(), "enabled", false);
        setBooleanField(term1054388, term1054388.getClass(), "valid", false);
        setField(term1054388, term1054388.getClass(), "dropTarget", null);
        setField(term1054388, term1054388.getClass(), "popups", null);
        setField(term1054388, term1054388.getClass(), "name", null);
        setBooleanField(term1054388, term1054388.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1054388, term1054388.getClass(), "focusable", false);
        setIntField(term1054388, term1054388.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1054388, term1054388.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1054388, term1054388.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1054388, term1054388.getClass(), "acc", null);
        setField(term1054388, term1054388.getClass(), "minSize", null);
        setBooleanField(term1054388, term1054388.getClass(), "minSizeSet", false);
        setField(term1054388, term1054388.getClass(), "prefSize", null);
        setBooleanField(term1054388, term1054388.getClass(), "prefSizeSet", false);
        setField(term1054388, term1054388.getClass(), "maxSize", null);
        setBooleanField(term1054388, term1054388.getClass(), "maxSizeSet", false);
        setField(term1054388, term1054388.getClass(), "componentOrientation", null);
        setBooleanField(term1054388, term1054388.getClass(), "newEventsOnly", false);
        setField(term1054388, term1054388.getClass(), "componentListener", null);
        setField(term1054388, term1054388.getClass(), "focusListener", null);
        setField(term1054388, term1054388.getClass(), "hierarchyListener", null);
        setField(term1054388, term1054388.getClass(), "hierarchyBoundsListener", null);
        setField(term1054388, term1054388.getClass(), "keyListener", null);
        setField(term1054388, term1054388.getClass(), "mouseListener", null);
        setField(term1054388, term1054388.getClass(), "mouseMotionListener", null);
        setField(term1054388, term1054388.getClass(), "mouseWheelListener", null);
        setField(term1054388, term1054388.getClass(), "inputMethodListener", null);
        setLongField(term1054388, term1054388.getClass(), "eventMask", 0L);
        setField(term1054388, term1054388.getClass(), "changeSupport", null);
        setField(term1054388, term1054388.getClass(), "objectLock", null);
        setBooleanField(term1054388, term1054388.getClass(), "isPacked", false);
        setIntField(term1054388, term1054388.getClass(), "boundsOp", 0);
        setField(term1054388, term1054388.getClass(), "compoundShape", null);
        setField(term1054388, term1054388.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1054388, term1054388.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1054388, term1054388.getClass(), "backgroundEraseDisabled", false);
        setField(term1054388, term1054388.getClass(), "eventCache", null);
        setBooleanField(term1054388, term1054388.getClass(), "coalescingEnabled", false);
        setBooleanField(term1054388, term1054388.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1054388, term1054388.getClass(), "componentSerializedDataVersion", 0);
        setField(term1054388, term1054388.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "handleMissions", argTypes, term1054388, args);
    }

};


