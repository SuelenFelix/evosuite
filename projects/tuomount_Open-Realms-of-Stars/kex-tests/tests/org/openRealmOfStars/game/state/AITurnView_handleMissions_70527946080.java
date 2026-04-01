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

public class AITurnView_handleMissions_70527946080 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1417908;

    public AITurnView_handleMissions_70527946080() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1417908 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1417908, term1417908.getClass(), "label", null);
        setField(term1417908, term1417908.getClass(), "game", null);
        setIntField(term1417908, term1417908.getClass(), "textAnim", 0);
        setIntField(term1417908, term1417908.getClass(), "cx", 0);
        setIntField(term1417908, term1417908.getClass(), "cy", 0);
        setField(term1417908, term1417908.getClass(), "aiThread", null);
        setBooleanField(term1417908, term1417908.getClass(), "readyToMove", false);
        setField(term1417908, term1417908.getClass(), "nextState", null);
        setField(term1417908, term1417908.getClass(), "nextStateObject", null);
        setBooleanField(term1417908, term1417908.getClass(), "isAlignmentXSet", false);
        setFloatField(term1417908, term1417908.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1417908, term1417908.getClass(), "isAlignmentYSet", false);
        setFloatField(term1417908, term1417908.getClass(), "alignmentY", 0.0F);
        setField(term1417908, term1417908.getClass(), "ui", null);
        setField(term1417908, term1417908.getClass(), "listenerList", null);
        setField(term1417908, term1417908.getClass(), "clientProperties", null);
        setField(term1417908, term1417908.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1417908, term1417908.getClass(), "autoscrolls", false);
        setField(term1417908, term1417908.getClass(), "border", null);
        setIntField(term1417908, term1417908.getClass(), "flags", 0);
        setField(term1417908, term1417908.getClass(), "inputVerifier", null);
        setBooleanField(term1417908, term1417908.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1417908, term1417908.getClass(), "paintingChild", null);
        setField(term1417908, term1417908.getClass(), "popupMenu", null);
        setField(term1417908, term1417908.getClass(), "revalidateRunnableScheduled", null);
        setField(term1417908, term1417908.getClass(), "focusInputMap", null);
        setField(term1417908, term1417908.getClass(), "ancestorInputMap", null);
        setField(term1417908, term1417908.getClass(), "windowInputMap", null);
        setField(term1417908, term1417908.getClass(), "actionMap", null);
        setField(term1417908, term1417908.getClass(), "aaHint", null);
        setField(term1417908, term1417908.getClass(), "lcdRenderingHint", null);
        setField(term1417908, term1417908.getClass(), "component", null);
        setField(term1417908, term1417908.getClass(), "layoutMgr", null);
        setField(term1417908, term1417908.getClass(), "dispatcher", null);
        setField(term1417908, term1417908.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1417908, term1417908.getClass(), "focusCycleRoot", false);
        setBooleanField(term1417908, term1417908.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1417908, term1417908.getClass(), "printingThreads", null);
        setBooleanField(term1417908, term1417908.getClass(), "printing", false);
        setField(term1417908, term1417908.getClass(), "containerListener", null);
        setIntField(term1417908, term1417908.getClass(), "listeningChildren", 0);
        setIntField(term1417908, term1417908.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1417908, term1417908.getClass(), "descendantsCount", 0);
        setField(term1417908, term1417908.getClass(), "preserveBackgroundColor", null);
        setIntField(term1417908, term1417908.getClass(), "numOfHWComponents", 0);
        setIntField(term1417908, term1417908.getClass(), "numOfLWComponents", 0);
        setField(term1417908, term1417908.getClass(), "modalComp", null);
        setField(term1417908, term1417908.getClass(), "modalAppContext", null);
        setIntField(term1417908, term1417908.getClass(), "containerSerializedDataVersion", 0);
        setField(term1417908, term1417908.getClass(), "peer", null);
        setField(term1417908, term1417908.getClass(), "parent", null);
        setField(term1417908, term1417908.getClass(), "appContext", null);
        setIntField(term1417908, term1417908.getClass(), "x", 0);
        setIntField(term1417908, term1417908.getClass(), "y", 0);
        setIntField(term1417908, term1417908.getClass(), "width", 0);
        setIntField(term1417908, term1417908.getClass(), "height", 0);
        setField(term1417908, term1417908.getClass(), "foreground", null);
        setField(term1417908, term1417908.getClass(), "background", null);
        setField(term1417908, term1417908.getClass(), "font", null);
        setField(term1417908, term1417908.getClass(), "peerFont", null);
        setField(term1417908, term1417908.getClass(), "cursor", null);
        setField(term1417908, term1417908.getClass(), "locale", null);
        setField(term1417908, term1417908.getClass(), "graphicsConfig", null);
        setField(term1417908, term1417908.getClass(), "bufferStrategy", null);
        setBooleanField(term1417908, term1417908.getClass(), "ignoreRepaint", false);
        setBooleanField(term1417908, term1417908.getClass(), "visible", false);
        setBooleanField(term1417908, term1417908.getClass(), "enabled", false);
        setBooleanField(term1417908, term1417908.getClass(), "valid", false);
        setField(term1417908, term1417908.getClass(), "dropTarget", null);
        setField(term1417908, term1417908.getClass(), "popups", null);
        setField(term1417908, term1417908.getClass(), "name", null);
        setBooleanField(term1417908, term1417908.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1417908, term1417908.getClass(), "focusable", false);
        setIntField(term1417908, term1417908.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1417908, term1417908.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1417908, term1417908.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1417908, term1417908.getClass(), "acc", null);
        setField(term1417908, term1417908.getClass(), "minSize", null);
        setBooleanField(term1417908, term1417908.getClass(), "minSizeSet", false);
        setField(term1417908, term1417908.getClass(), "prefSize", null);
        setBooleanField(term1417908, term1417908.getClass(), "prefSizeSet", false);
        setField(term1417908, term1417908.getClass(), "maxSize", null);
        setBooleanField(term1417908, term1417908.getClass(), "maxSizeSet", false);
        setField(term1417908, term1417908.getClass(), "componentOrientation", null);
        setBooleanField(term1417908, term1417908.getClass(), "newEventsOnly", false);
        setField(term1417908, term1417908.getClass(), "componentListener", null);
        setField(term1417908, term1417908.getClass(), "focusListener", null);
        setField(term1417908, term1417908.getClass(), "hierarchyListener", null);
        setField(term1417908, term1417908.getClass(), "hierarchyBoundsListener", null);
        setField(term1417908, term1417908.getClass(), "keyListener", null);
        setField(term1417908, term1417908.getClass(), "mouseListener", null);
        setField(term1417908, term1417908.getClass(), "mouseMotionListener", null);
        setField(term1417908, term1417908.getClass(), "mouseWheelListener", null);
        setField(term1417908, term1417908.getClass(), "inputMethodListener", null);
        setLongField(term1417908, term1417908.getClass(), "eventMask", 0L);
        setField(term1417908, term1417908.getClass(), "changeSupport", null);
        setField(term1417908, term1417908.getClass(), "objectLock", null);
        setBooleanField(term1417908, term1417908.getClass(), "isPacked", false);
        setIntField(term1417908, term1417908.getClass(), "boundsOp", 0);
        setField(term1417908, term1417908.getClass(), "compoundShape", null);
        setField(term1417908, term1417908.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1417908, term1417908.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1417908, term1417908.getClass(), "backgroundEraseDisabled", false);
        setField(term1417908, term1417908.getClass(), "eventCache", null);
        setBooleanField(term1417908, term1417908.getClass(), "coalescingEnabled", false);
        setBooleanField(term1417908, term1417908.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1417908, term1417908.getClass(), "componentSerializedDataVersion", 0);
        setField(term1417908, term1417908.getClass(), "accessibleContext", null);
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
        callMethod(klass, "handleMissions", argTypes, term1417908, args);
    }

};


