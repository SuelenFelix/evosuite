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

public class AITurnView_addDestroyStarbaseMission_16596028316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1130903;

    public AITurnView_addDestroyStarbaseMission_16596028316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1130903 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1130903, term1130903.getClass(), "label", null);
        setField(term1130903, term1130903.getClass(), "game", null);
        setIntField(term1130903, term1130903.getClass(), "textAnim", 0);
        setIntField(term1130903, term1130903.getClass(), "cx", 0);
        setIntField(term1130903, term1130903.getClass(), "cy", 0);
        setField(term1130903, term1130903.getClass(), "aiThread", null);
        setBooleanField(term1130903, term1130903.getClass(), "readyToMove", false);
        setField(term1130903, term1130903.getClass(), "nextState", null);
        setField(term1130903, term1130903.getClass(), "nextStateObject", null);
        setBooleanField(term1130903, term1130903.getClass(), "isAlignmentXSet", false);
        setFloatField(term1130903, term1130903.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1130903, term1130903.getClass(), "isAlignmentYSet", false);
        setFloatField(term1130903, term1130903.getClass(), "alignmentY", 0.0F);
        setField(term1130903, term1130903.getClass(), "ui", null);
        setField(term1130903, term1130903.getClass(), "listenerList", null);
        setField(term1130903, term1130903.getClass(), "clientProperties", null);
        setField(term1130903, term1130903.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1130903, term1130903.getClass(), "autoscrolls", false);
        setField(term1130903, term1130903.getClass(), "border", null);
        setIntField(term1130903, term1130903.getClass(), "flags", 0);
        setField(term1130903, term1130903.getClass(), "inputVerifier", null);
        setBooleanField(term1130903, term1130903.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1130903, term1130903.getClass(), "paintingChild", null);
        setField(term1130903, term1130903.getClass(), "popupMenu", null);
        setField(term1130903, term1130903.getClass(), "revalidateRunnableScheduled", null);
        setField(term1130903, term1130903.getClass(), "focusInputMap", null);
        setField(term1130903, term1130903.getClass(), "ancestorInputMap", null);
        setField(term1130903, term1130903.getClass(), "windowInputMap", null);
        setField(term1130903, term1130903.getClass(), "actionMap", null);
        setField(term1130903, term1130903.getClass(), "aaHint", null);
        setField(term1130903, term1130903.getClass(), "lcdRenderingHint", null);
        setField(term1130903, term1130903.getClass(), "component", null);
        setField(term1130903, term1130903.getClass(), "layoutMgr", null);
        setField(term1130903, term1130903.getClass(), "dispatcher", null);
        setField(term1130903, term1130903.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1130903, term1130903.getClass(), "focusCycleRoot", false);
        setBooleanField(term1130903, term1130903.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1130903, term1130903.getClass(), "printingThreads", null);
        setBooleanField(term1130903, term1130903.getClass(), "printing", false);
        setField(term1130903, term1130903.getClass(), "containerListener", null);
        setIntField(term1130903, term1130903.getClass(), "listeningChildren", 0);
        setIntField(term1130903, term1130903.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1130903, term1130903.getClass(), "descendantsCount", 0);
        setField(term1130903, term1130903.getClass(), "preserveBackgroundColor", null);
        setIntField(term1130903, term1130903.getClass(), "numOfHWComponents", 0);
        setIntField(term1130903, term1130903.getClass(), "numOfLWComponents", 0);
        setField(term1130903, term1130903.getClass(), "modalComp", null);
        setField(term1130903, term1130903.getClass(), "modalAppContext", null);
        setIntField(term1130903, term1130903.getClass(), "containerSerializedDataVersion", 0);
        setField(term1130903, term1130903.getClass(), "peer", null);
        setField(term1130903, term1130903.getClass(), "parent", null);
        setField(term1130903, term1130903.getClass(), "appContext", null);
        setIntField(term1130903, term1130903.getClass(), "x", 0);
        setIntField(term1130903, term1130903.getClass(), "y", 0);
        setIntField(term1130903, term1130903.getClass(), "width", 0);
        setIntField(term1130903, term1130903.getClass(), "height", 0);
        setField(term1130903, term1130903.getClass(), "foreground", null);
        setField(term1130903, term1130903.getClass(), "background", null);
        setField(term1130903, term1130903.getClass(), "font", null);
        setField(term1130903, term1130903.getClass(), "peerFont", null);
        setField(term1130903, term1130903.getClass(), "cursor", null);
        setField(term1130903, term1130903.getClass(), "locale", null);
        setField(term1130903, term1130903.getClass(), "graphicsConfig", null);
        setField(term1130903, term1130903.getClass(), "bufferStrategy", null);
        setBooleanField(term1130903, term1130903.getClass(), "ignoreRepaint", false);
        setBooleanField(term1130903, term1130903.getClass(), "visible", false);
        setBooleanField(term1130903, term1130903.getClass(), "enabled", false);
        setBooleanField(term1130903, term1130903.getClass(), "valid", false);
        setField(term1130903, term1130903.getClass(), "dropTarget", null);
        setField(term1130903, term1130903.getClass(), "popups", null);
        setField(term1130903, term1130903.getClass(), "name", null);
        setBooleanField(term1130903, term1130903.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1130903, term1130903.getClass(), "focusable", false);
        setIntField(term1130903, term1130903.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1130903, term1130903.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1130903, term1130903.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1130903, term1130903.getClass(), "acc", null);
        setField(term1130903, term1130903.getClass(), "minSize", null);
        setBooleanField(term1130903, term1130903.getClass(), "minSizeSet", false);
        setField(term1130903, term1130903.getClass(), "prefSize", null);
        setBooleanField(term1130903, term1130903.getClass(), "prefSizeSet", false);
        setField(term1130903, term1130903.getClass(), "maxSize", null);
        setBooleanField(term1130903, term1130903.getClass(), "maxSizeSet", false);
        setField(term1130903, term1130903.getClass(), "componentOrientation", null);
        setBooleanField(term1130903, term1130903.getClass(), "newEventsOnly", false);
        setField(term1130903, term1130903.getClass(), "componentListener", null);
        setField(term1130903, term1130903.getClass(), "focusListener", null);
        setField(term1130903, term1130903.getClass(), "hierarchyListener", null);
        setField(term1130903, term1130903.getClass(), "hierarchyBoundsListener", null);
        setField(term1130903, term1130903.getClass(), "keyListener", null);
        setField(term1130903, term1130903.getClass(), "mouseListener", null);
        setField(term1130903, term1130903.getClass(), "mouseMotionListener", null);
        setField(term1130903, term1130903.getClass(), "mouseWheelListener", null);
        setField(term1130903, term1130903.getClass(), "inputMethodListener", null);
        setLongField(term1130903, term1130903.getClass(), "eventMask", 0L);
        setField(term1130903, term1130903.getClass(), "changeSupport", null);
        setField(term1130903, term1130903.getClass(), "objectLock", null);
        setBooleanField(term1130903, term1130903.getClass(), "isPacked", false);
        setIntField(term1130903, term1130903.getClass(), "boundsOp", 0);
        setField(term1130903, term1130903.getClass(), "compoundShape", null);
        setField(term1130903, term1130903.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1130903, term1130903.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1130903, term1130903.getClass(), "backgroundEraseDisabled", false);
        setField(term1130903, term1130903.getClass(), "eventCache", null);
        setBooleanField(term1130903, term1130903.getClass(), "coalescingEnabled", false);
        setBooleanField(term1130903, term1130903.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1130903, term1130903.getClass(), "componentSerializedDataVersion", 0);
        setField(term1130903, term1130903.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.Coordinate");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "addDestroyStarbaseMission", argTypes, term1130903, args);
    }

};


