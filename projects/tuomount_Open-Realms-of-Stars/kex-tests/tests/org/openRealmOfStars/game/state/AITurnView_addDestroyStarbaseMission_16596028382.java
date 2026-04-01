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

public class AITurnView_addDestroyStarbaseMission_16596028382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1417998;

    public AITurnView_addDestroyStarbaseMission_16596028382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1417998 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1417998, term1417998.getClass(), "label", null);
        setField(term1417998, term1417998.getClass(), "game", null);
        setIntField(term1417998, term1417998.getClass(), "textAnim", 0);
        setIntField(term1417998, term1417998.getClass(), "cx", 0);
        setIntField(term1417998, term1417998.getClass(), "cy", 0);
        setField(term1417998, term1417998.getClass(), "aiThread", null);
        setBooleanField(term1417998, term1417998.getClass(), "readyToMove", false);
        setField(term1417998, term1417998.getClass(), "nextState", null);
        setField(term1417998, term1417998.getClass(), "nextStateObject", null);
        setBooleanField(term1417998, term1417998.getClass(), "isAlignmentXSet", false);
        setFloatField(term1417998, term1417998.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1417998, term1417998.getClass(), "isAlignmentYSet", false);
        setFloatField(term1417998, term1417998.getClass(), "alignmentY", 0.0F);
        setField(term1417998, term1417998.getClass(), "ui", null);
        setField(term1417998, term1417998.getClass(), "listenerList", null);
        setField(term1417998, term1417998.getClass(), "clientProperties", null);
        setField(term1417998, term1417998.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1417998, term1417998.getClass(), "autoscrolls", false);
        setField(term1417998, term1417998.getClass(), "border", null);
        setIntField(term1417998, term1417998.getClass(), "flags", 0);
        setField(term1417998, term1417998.getClass(), "inputVerifier", null);
        setBooleanField(term1417998, term1417998.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1417998, term1417998.getClass(), "paintingChild", null);
        setField(term1417998, term1417998.getClass(), "popupMenu", null);
        setField(term1417998, term1417998.getClass(), "revalidateRunnableScheduled", null);
        setField(term1417998, term1417998.getClass(), "focusInputMap", null);
        setField(term1417998, term1417998.getClass(), "ancestorInputMap", null);
        setField(term1417998, term1417998.getClass(), "windowInputMap", null);
        setField(term1417998, term1417998.getClass(), "actionMap", null);
        setField(term1417998, term1417998.getClass(), "aaHint", null);
        setField(term1417998, term1417998.getClass(), "lcdRenderingHint", null);
        setField(term1417998, term1417998.getClass(), "component", null);
        setField(term1417998, term1417998.getClass(), "layoutMgr", null);
        setField(term1417998, term1417998.getClass(), "dispatcher", null);
        setField(term1417998, term1417998.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1417998, term1417998.getClass(), "focusCycleRoot", false);
        setBooleanField(term1417998, term1417998.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1417998, term1417998.getClass(), "printingThreads", null);
        setBooleanField(term1417998, term1417998.getClass(), "printing", false);
        setField(term1417998, term1417998.getClass(), "containerListener", null);
        setIntField(term1417998, term1417998.getClass(), "listeningChildren", 0);
        setIntField(term1417998, term1417998.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1417998, term1417998.getClass(), "descendantsCount", 0);
        setField(term1417998, term1417998.getClass(), "preserveBackgroundColor", null);
        setIntField(term1417998, term1417998.getClass(), "numOfHWComponents", 0);
        setIntField(term1417998, term1417998.getClass(), "numOfLWComponents", 0);
        setField(term1417998, term1417998.getClass(), "modalComp", null);
        setField(term1417998, term1417998.getClass(), "modalAppContext", null);
        setIntField(term1417998, term1417998.getClass(), "containerSerializedDataVersion", 0);
        setField(term1417998, term1417998.getClass(), "peer", null);
        setField(term1417998, term1417998.getClass(), "parent", null);
        setField(term1417998, term1417998.getClass(), "appContext", null);
        setIntField(term1417998, term1417998.getClass(), "x", 0);
        setIntField(term1417998, term1417998.getClass(), "y", 0);
        setIntField(term1417998, term1417998.getClass(), "width", 0);
        setIntField(term1417998, term1417998.getClass(), "height", 0);
        setField(term1417998, term1417998.getClass(), "foreground", null);
        setField(term1417998, term1417998.getClass(), "background", null);
        setField(term1417998, term1417998.getClass(), "font", null);
        setField(term1417998, term1417998.getClass(), "peerFont", null);
        setField(term1417998, term1417998.getClass(), "cursor", null);
        setField(term1417998, term1417998.getClass(), "locale", null);
        setField(term1417998, term1417998.getClass(), "graphicsConfig", null);
        setField(term1417998, term1417998.getClass(), "bufferStrategy", null);
        setBooleanField(term1417998, term1417998.getClass(), "ignoreRepaint", false);
        setBooleanField(term1417998, term1417998.getClass(), "visible", false);
        setBooleanField(term1417998, term1417998.getClass(), "enabled", false);
        setBooleanField(term1417998, term1417998.getClass(), "valid", false);
        setField(term1417998, term1417998.getClass(), "dropTarget", null);
        setField(term1417998, term1417998.getClass(), "popups", null);
        setField(term1417998, term1417998.getClass(), "name", null);
        setBooleanField(term1417998, term1417998.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1417998, term1417998.getClass(), "focusable", false);
        setIntField(term1417998, term1417998.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1417998, term1417998.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1417998, term1417998.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1417998, term1417998.getClass(), "acc", null);
        setField(term1417998, term1417998.getClass(), "minSize", null);
        setBooleanField(term1417998, term1417998.getClass(), "minSizeSet", false);
        setField(term1417998, term1417998.getClass(), "prefSize", null);
        setBooleanField(term1417998, term1417998.getClass(), "prefSizeSet", false);
        setField(term1417998, term1417998.getClass(), "maxSize", null);
        setBooleanField(term1417998, term1417998.getClass(), "maxSizeSet", false);
        setField(term1417998, term1417998.getClass(), "componentOrientation", null);
        setBooleanField(term1417998, term1417998.getClass(), "newEventsOnly", false);
        setField(term1417998, term1417998.getClass(), "componentListener", null);
        setField(term1417998, term1417998.getClass(), "focusListener", null);
        setField(term1417998, term1417998.getClass(), "hierarchyListener", null);
        setField(term1417998, term1417998.getClass(), "hierarchyBoundsListener", null);
        setField(term1417998, term1417998.getClass(), "keyListener", null);
        setField(term1417998, term1417998.getClass(), "mouseListener", null);
        setField(term1417998, term1417998.getClass(), "mouseMotionListener", null);
        setField(term1417998, term1417998.getClass(), "mouseWheelListener", null);
        setField(term1417998, term1417998.getClass(), "inputMethodListener", null);
        setLongField(term1417998, term1417998.getClass(), "eventMask", 0L);
        setField(term1417998, term1417998.getClass(), "changeSupport", null);
        setField(term1417998, term1417998.getClass(), "objectLock", null);
        setBooleanField(term1417998, term1417998.getClass(), "isPacked", false);
        setIntField(term1417998, term1417998.getClass(), "boundsOp", 0);
        setField(term1417998, term1417998.getClass(), "compoundShape", null);
        setField(term1417998, term1417998.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1417998, term1417998.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1417998, term1417998.getClass(), "backgroundEraseDisabled", false);
        setField(term1417998, term1417998.getClass(), "eventCache", null);
        setBooleanField(term1417998, term1417998.getClass(), "coalescingEnabled", false);
        setBooleanField(term1417998, term1417998.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1417998, term1417998.getClass(), "componentSerializedDataVersion", 0);
        setField(term1417998, term1417998.getClass(), "accessibleContext", null);
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
        callMethod(klass, "addDestroyStarbaseMission", argTypes, term1417998, args);
    }

};


