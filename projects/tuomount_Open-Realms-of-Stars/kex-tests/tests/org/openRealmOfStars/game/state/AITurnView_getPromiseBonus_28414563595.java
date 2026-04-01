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

public class AITurnView_getPromiseBonus_28414563595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1418583;

    public AITurnView_getPromiseBonus_28414563595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1418583 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1418583, term1418583.getClass(), "label", null);
        setField(term1418583, term1418583.getClass(), "game", null);
        setIntField(term1418583, term1418583.getClass(), "textAnim", 0);
        setIntField(term1418583, term1418583.getClass(), "cx", 0);
        setIntField(term1418583, term1418583.getClass(), "cy", 0);
        setField(term1418583, term1418583.getClass(), "aiThread", null);
        setBooleanField(term1418583, term1418583.getClass(), "readyToMove", false);
        setField(term1418583, term1418583.getClass(), "nextState", null);
        setField(term1418583, term1418583.getClass(), "nextStateObject", null);
        setBooleanField(term1418583, term1418583.getClass(), "isAlignmentXSet", false);
        setFloatField(term1418583, term1418583.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1418583, term1418583.getClass(), "isAlignmentYSet", false);
        setFloatField(term1418583, term1418583.getClass(), "alignmentY", 0.0F);
        setField(term1418583, term1418583.getClass(), "ui", null);
        setField(term1418583, term1418583.getClass(), "listenerList", null);
        setField(term1418583, term1418583.getClass(), "clientProperties", null);
        setField(term1418583, term1418583.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1418583, term1418583.getClass(), "autoscrolls", false);
        setField(term1418583, term1418583.getClass(), "border", null);
        setIntField(term1418583, term1418583.getClass(), "flags", 0);
        setField(term1418583, term1418583.getClass(), "inputVerifier", null);
        setBooleanField(term1418583, term1418583.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1418583, term1418583.getClass(), "paintingChild", null);
        setField(term1418583, term1418583.getClass(), "popupMenu", null);
        setField(term1418583, term1418583.getClass(), "revalidateRunnableScheduled", null);
        setField(term1418583, term1418583.getClass(), "focusInputMap", null);
        setField(term1418583, term1418583.getClass(), "ancestorInputMap", null);
        setField(term1418583, term1418583.getClass(), "windowInputMap", null);
        setField(term1418583, term1418583.getClass(), "actionMap", null);
        setField(term1418583, term1418583.getClass(), "aaHint", null);
        setField(term1418583, term1418583.getClass(), "lcdRenderingHint", null);
        setField(term1418583, term1418583.getClass(), "component", null);
        setField(term1418583, term1418583.getClass(), "layoutMgr", null);
        setField(term1418583, term1418583.getClass(), "dispatcher", null);
        setField(term1418583, term1418583.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1418583, term1418583.getClass(), "focusCycleRoot", false);
        setBooleanField(term1418583, term1418583.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1418583, term1418583.getClass(), "printingThreads", null);
        setBooleanField(term1418583, term1418583.getClass(), "printing", false);
        setField(term1418583, term1418583.getClass(), "containerListener", null);
        setIntField(term1418583, term1418583.getClass(), "listeningChildren", 0);
        setIntField(term1418583, term1418583.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1418583, term1418583.getClass(), "descendantsCount", 0);
        setField(term1418583, term1418583.getClass(), "preserveBackgroundColor", null);
        setIntField(term1418583, term1418583.getClass(), "numOfHWComponents", 0);
        setIntField(term1418583, term1418583.getClass(), "numOfLWComponents", 0);
        setField(term1418583, term1418583.getClass(), "modalComp", null);
        setField(term1418583, term1418583.getClass(), "modalAppContext", null);
        setIntField(term1418583, term1418583.getClass(), "containerSerializedDataVersion", 0);
        setField(term1418583, term1418583.getClass(), "peer", null);
        setField(term1418583, term1418583.getClass(), "parent", null);
        setField(term1418583, term1418583.getClass(), "appContext", null);
        setIntField(term1418583, term1418583.getClass(), "x", 0);
        setIntField(term1418583, term1418583.getClass(), "y", 0);
        setIntField(term1418583, term1418583.getClass(), "width", 0);
        setIntField(term1418583, term1418583.getClass(), "height", 0);
        setField(term1418583, term1418583.getClass(), "foreground", null);
        setField(term1418583, term1418583.getClass(), "background", null);
        setField(term1418583, term1418583.getClass(), "font", null);
        setField(term1418583, term1418583.getClass(), "peerFont", null);
        setField(term1418583, term1418583.getClass(), "cursor", null);
        setField(term1418583, term1418583.getClass(), "locale", null);
        setField(term1418583, term1418583.getClass(), "graphicsConfig", null);
        setField(term1418583, term1418583.getClass(), "bufferStrategy", null);
        setBooleanField(term1418583, term1418583.getClass(), "ignoreRepaint", false);
        setBooleanField(term1418583, term1418583.getClass(), "visible", false);
        setBooleanField(term1418583, term1418583.getClass(), "enabled", false);
        setBooleanField(term1418583, term1418583.getClass(), "valid", false);
        setField(term1418583, term1418583.getClass(), "dropTarget", null);
        setField(term1418583, term1418583.getClass(), "popups", null);
        setField(term1418583, term1418583.getClass(), "name", null);
        setBooleanField(term1418583, term1418583.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1418583, term1418583.getClass(), "focusable", false);
        setIntField(term1418583, term1418583.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1418583, term1418583.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1418583, term1418583.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1418583, term1418583.getClass(), "acc", null);
        setField(term1418583, term1418583.getClass(), "minSize", null);
        setBooleanField(term1418583, term1418583.getClass(), "minSizeSet", false);
        setField(term1418583, term1418583.getClass(), "prefSize", null);
        setBooleanField(term1418583, term1418583.getClass(), "prefSizeSet", false);
        setField(term1418583, term1418583.getClass(), "maxSize", null);
        setBooleanField(term1418583, term1418583.getClass(), "maxSizeSet", false);
        setField(term1418583, term1418583.getClass(), "componentOrientation", null);
        setBooleanField(term1418583, term1418583.getClass(), "newEventsOnly", false);
        setField(term1418583, term1418583.getClass(), "componentListener", null);
        setField(term1418583, term1418583.getClass(), "focusListener", null);
        setField(term1418583, term1418583.getClass(), "hierarchyListener", null);
        setField(term1418583, term1418583.getClass(), "hierarchyBoundsListener", null);
        setField(term1418583, term1418583.getClass(), "keyListener", null);
        setField(term1418583, term1418583.getClass(), "mouseListener", null);
        setField(term1418583, term1418583.getClass(), "mouseMotionListener", null);
        setField(term1418583, term1418583.getClass(), "mouseWheelListener", null);
        setField(term1418583, term1418583.getClass(), "inputMethodListener", null);
        setLongField(term1418583, term1418583.getClass(), "eventMask", 0L);
        setField(term1418583, term1418583.getClass(), "changeSupport", null);
        setField(term1418583, term1418583.getClass(), "objectLock", null);
        setBooleanField(term1418583, term1418583.getClass(), "isPacked", false);
        setIntField(term1418583, term1418583.getClass(), "boundsOp", 0);
        setField(term1418583, term1418583.getClass(), "compoundShape", null);
        setField(term1418583, term1418583.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1418583, term1418583.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1418583, term1418583.getClass(), "backgroundEraseDisabled", false);
        setField(term1418583, term1418583.getClass(), "eventCache", null);
        setBooleanField(term1418583, term1418583.getClass(), "coalescingEnabled", false);
        setBooleanField(term1418583, term1418583.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1418583, term1418583.getClass(), "componentSerializedDataVersion", 0);
        setField(term1418583, term1418583.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerList");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "getPromiseBonus", argTypes, term1418583, args);
    }

};


