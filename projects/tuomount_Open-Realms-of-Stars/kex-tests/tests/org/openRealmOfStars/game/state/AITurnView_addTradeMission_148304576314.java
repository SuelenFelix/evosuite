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

public class AITurnView_addTradeMission_148304576314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1122650;

    public AITurnView_addTradeMission_148304576314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1122650 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1122650, term1122650.getClass(), "label", null);
        setField(term1122650, term1122650.getClass(), "game", null);
        setIntField(term1122650, term1122650.getClass(), "textAnim", 0);
        setIntField(term1122650, term1122650.getClass(), "cx", 0);
        setIntField(term1122650, term1122650.getClass(), "cy", 0);
        setField(term1122650, term1122650.getClass(), "aiThread", null);
        setBooleanField(term1122650, term1122650.getClass(), "readyToMove", false);
        setField(term1122650, term1122650.getClass(), "nextState", null);
        setField(term1122650, term1122650.getClass(), "nextStateObject", null);
        setBooleanField(term1122650, term1122650.getClass(), "isAlignmentXSet", false);
        setFloatField(term1122650, term1122650.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1122650, term1122650.getClass(), "isAlignmentYSet", false);
        setFloatField(term1122650, term1122650.getClass(), "alignmentY", 0.0F);
        setField(term1122650, term1122650.getClass(), "ui", null);
        setField(term1122650, term1122650.getClass(), "listenerList", null);
        setField(term1122650, term1122650.getClass(), "clientProperties", null);
        setField(term1122650, term1122650.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1122650, term1122650.getClass(), "autoscrolls", false);
        setField(term1122650, term1122650.getClass(), "border", null);
        setIntField(term1122650, term1122650.getClass(), "flags", 0);
        setField(term1122650, term1122650.getClass(), "inputVerifier", null);
        setBooleanField(term1122650, term1122650.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1122650, term1122650.getClass(), "paintingChild", null);
        setField(term1122650, term1122650.getClass(), "popupMenu", null);
        setField(term1122650, term1122650.getClass(), "revalidateRunnableScheduled", null);
        setField(term1122650, term1122650.getClass(), "focusInputMap", null);
        setField(term1122650, term1122650.getClass(), "ancestorInputMap", null);
        setField(term1122650, term1122650.getClass(), "windowInputMap", null);
        setField(term1122650, term1122650.getClass(), "actionMap", null);
        setField(term1122650, term1122650.getClass(), "aaHint", null);
        setField(term1122650, term1122650.getClass(), "lcdRenderingHint", null);
        setField(term1122650, term1122650.getClass(), "component", null);
        setField(term1122650, term1122650.getClass(), "layoutMgr", null);
        setField(term1122650, term1122650.getClass(), "dispatcher", null);
        setField(term1122650, term1122650.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1122650, term1122650.getClass(), "focusCycleRoot", false);
        setBooleanField(term1122650, term1122650.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1122650, term1122650.getClass(), "printingThreads", null);
        setBooleanField(term1122650, term1122650.getClass(), "printing", false);
        setField(term1122650, term1122650.getClass(), "containerListener", null);
        setIntField(term1122650, term1122650.getClass(), "listeningChildren", 0);
        setIntField(term1122650, term1122650.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1122650, term1122650.getClass(), "descendantsCount", 0);
        setField(term1122650, term1122650.getClass(), "preserveBackgroundColor", null);
        setIntField(term1122650, term1122650.getClass(), "numOfHWComponents", 0);
        setIntField(term1122650, term1122650.getClass(), "numOfLWComponents", 0);
        setField(term1122650, term1122650.getClass(), "modalComp", null);
        setField(term1122650, term1122650.getClass(), "modalAppContext", null);
        setIntField(term1122650, term1122650.getClass(), "containerSerializedDataVersion", 0);
        setField(term1122650, term1122650.getClass(), "peer", null);
        setField(term1122650, term1122650.getClass(), "parent", null);
        setField(term1122650, term1122650.getClass(), "appContext", null);
        setIntField(term1122650, term1122650.getClass(), "x", 0);
        setIntField(term1122650, term1122650.getClass(), "y", 0);
        setIntField(term1122650, term1122650.getClass(), "width", 0);
        setIntField(term1122650, term1122650.getClass(), "height", 0);
        setField(term1122650, term1122650.getClass(), "foreground", null);
        setField(term1122650, term1122650.getClass(), "background", null);
        setField(term1122650, term1122650.getClass(), "font", null);
        setField(term1122650, term1122650.getClass(), "peerFont", null);
        setField(term1122650, term1122650.getClass(), "cursor", null);
        setField(term1122650, term1122650.getClass(), "locale", null);
        setField(term1122650, term1122650.getClass(), "graphicsConfig", null);
        setField(term1122650, term1122650.getClass(), "bufferStrategy", null);
        setBooleanField(term1122650, term1122650.getClass(), "ignoreRepaint", false);
        setBooleanField(term1122650, term1122650.getClass(), "visible", false);
        setBooleanField(term1122650, term1122650.getClass(), "enabled", false);
        setBooleanField(term1122650, term1122650.getClass(), "valid", false);
        setField(term1122650, term1122650.getClass(), "dropTarget", null);
        setField(term1122650, term1122650.getClass(), "popups", null);
        setField(term1122650, term1122650.getClass(), "name", null);
        setBooleanField(term1122650, term1122650.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1122650, term1122650.getClass(), "focusable", false);
        setIntField(term1122650, term1122650.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1122650, term1122650.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1122650, term1122650.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1122650, term1122650.getClass(), "acc", null);
        setField(term1122650, term1122650.getClass(), "minSize", null);
        setBooleanField(term1122650, term1122650.getClass(), "minSizeSet", false);
        setField(term1122650, term1122650.getClass(), "prefSize", null);
        setBooleanField(term1122650, term1122650.getClass(), "prefSizeSet", false);
        setField(term1122650, term1122650.getClass(), "maxSize", null);
        setBooleanField(term1122650, term1122650.getClass(), "maxSizeSet", false);
        setField(term1122650, term1122650.getClass(), "componentOrientation", null);
        setBooleanField(term1122650, term1122650.getClass(), "newEventsOnly", false);
        setField(term1122650, term1122650.getClass(), "componentListener", null);
        setField(term1122650, term1122650.getClass(), "focusListener", null);
        setField(term1122650, term1122650.getClass(), "hierarchyListener", null);
        setField(term1122650, term1122650.getClass(), "hierarchyBoundsListener", null);
        setField(term1122650, term1122650.getClass(), "keyListener", null);
        setField(term1122650, term1122650.getClass(), "mouseListener", null);
        setField(term1122650, term1122650.getClass(), "mouseMotionListener", null);
        setField(term1122650, term1122650.getClass(), "mouseWheelListener", null);
        setField(term1122650, term1122650.getClass(), "inputMethodListener", null);
        setLongField(term1122650, term1122650.getClass(), "eventMask", 0L);
        setField(term1122650, term1122650.getClass(), "changeSupport", null);
        setField(term1122650, term1122650.getClass(), "objectLock", null);
        setBooleanField(term1122650, term1122650.getClass(), "isPacked", false);
        setIntField(term1122650, term1122650.getClass(), "boundsOp", 0);
        setField(term1122650, term1122650.getClass(), "compoundShape", null);
        setField(term1122650, term1122650.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1122650, term1122650.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1122650, term1122650.getClass(), "backgroundEraseDisabled", false);
        setField(term1122650, term1122650.getClass(), "eventCache", null);
        setBooleanField(term1122650, term1122650.getClass(), "coalescingEnabled", false);
        setBooleanField(term1122650, term1122650.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1122650, term1122650.getClass(), "componentSerializedDataVersion", 0);
        setField(term1122650, term1122650.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "addTradeMission", argTypes, term1122650, args);
    }

};


