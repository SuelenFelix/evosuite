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

public class AITurnView_addSporeAttackMission_184332805812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1108693;

    public AITurnView_addSporeAttackMission_184332805812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1108693 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1108693, term1108693.getClass(), "label", null);
        setField(term1108693, term1108693.getClass(), "game", null);
        setIntField(term1108693, term1108693.getClass(), "textAnim", 0);
        setIntField(term1108693, term1108693.getClass(), "cx", 0);
        setIntField(term1108693, term1108693.getClass(), "cy", 0);
        setField(term1108693, term1108693.getClass(), "aiThread", null);
        setBooleanField(term1108693, term1108693.getClass(), "readyToMove", false);
        setField(term1108693, term1108693.getClass(), "nextState", null);
        setField(term1108693, term1108693.getClass(), "nextStateObject", null);
        setBooleanField(term1108693, term1108693.getClass(), "isAlignmentXSet", false);
        setFloatField(term1108693, term1108693.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1108693, term1108693.getClass(), "isAlignmentYSet", false);
        setFloatField(term1108693, term1108693.getClass(), "alignmentY", 0.0F);
        setField(term1108693, term1108693.getClass(), "ui", null);
        setField(term1108693, term1108693.getClass(), "listenerList", null);
        setField(term1108693, term1108693.getClass(), "clientProperties", null);
        setField(term1108693, term1108693.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1108693, term1108693.getClass(), "autoscrolls", false);
        setField(term1108693, term1108693.getClass(), "border", null);
        setIntField(term1108693, term1108693.getClass(), "flags", 0);
        setField(term1108693, term1108693.getClass(), "inputVerifier", null);
        setBooleanField(term1108693, term1108693.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1108693, term1108693.getClass(), "paintingChild", null);
        setField(term1108693, term1108693.getClass(), "popupMenu", null);
        setField(term1108693, term1108693.getClass(), "revalidateRunnableScheduled", null);
        setField(term1108693, term1108693.getClass(), "focusInputMap", null);
        setField(term1108693, term1108693.getClass(), "ancestorInputMap", null);
        setField(term1108693, term1108693.getClass(), "windowInputMap", null);
        setField(term1108693, term1108693.getClass(), "actionMap", null);
        setField(term1108693, term1108693.getClass(), "aaHint", null);
        setField(term1108693, term1108693.getClass(), "lcdRenderingHint", null);
        setField(term1108693, term1108693.getClass(), "component", null);
        setField(term1108693, term1108693.getClass(), "layoutMgr", null);
        setField(term1108693, term1108693.getClass(), "dispatcher", null);
        setField(term1108693, term1108693.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1108693, term1108693.getClass(), "focusCycleRoot", false);
        setBooleanField(term1108693, term1108693.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1108693, term1108693.getClass(), "printingThreads", null);
        setBooleanField(term1108693, term1108693.getClass(), "printing", false);
        setField(term1108693, term1108693.getClass(), "containerListener", null);
        setIntField(term1108693, term1108693.getClass(), "listeningChildren", 0);
        setIntField(term1108693, term1108693.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1108693, term1108693.getClass(), "descendantsCount", 0);
        setField(term1108693, term1108693.getClass(), "preserveBackgroundColor", null);
        setIntField(term1108693, term1108693.getClass(), "numOfHWComponents", 0);
        setIntField(term1108693, term1108693.getClass(), "numOfLWComponents", 0);
        setField(term1108693, term1108693.getClass(), "modalComp", null);
        setField(term1108693, term1108693.getClass(), "modalAppContext", null);
        setIntField(term1108693, term1108693.getClass(), "containerSerializedDataVersion", 0);
        setField(term1108693, term1108693.getClass(), "peer", null);
        setField(term1108693, term1108693.getClass(), "parent", null);
        setField(term1108693, term1108693.getClass(), "appContext", null);
        setIntField(term1108693, term1108693.getClass(), "x", 0);
        setIntField(term1108693, term1108693.getClass(), "y", 0);
        setIntField(term1108693, term1108693.getClass(), "width", 0);
        setIntField(term1108693, term1108693.getClass(), "height", 0);
        setField(term1108693, term1108693.getClass(), "foreground", null);
        setField(term1108693, term1108693.getClass(), "background", null);
        setField(term1108693, term1108693.getClass(), "font", null);
        setField(term1108693, term1108693.getClass(), "peerFont", null);
        setField(term1108693, term1108693.getClass(), "cursor", null);
        setField(term1108693, term1108693.getClass(), "locale", null);
        setField(term1108693, term1108693.getClass(), "graphicsConfig", null);
        setField(term1108693, term1108693.getClass(), "bufferStrategy", null);
        setBooleanField(term1108693, term1108693.getClass(), "ignoreRepaint", false);
        setBooleanField(term1108693, term1108693.getClass(), "visible", false);
        setBooleanField(term1108693, term1108693.getClass(), "enabled", false);
        setBooleanField(term1108693, term1108693.getClass(), "valid", false);
        setField(term1108693, term1108693.getClass(), "dropTarget", null);
        setField(term1108693, term1108693.getClass(), "popups", null);
        setField(term1108693, term1108693.getClass(), "name", null);
        setBooleanField(term1108693, term1108693.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1108693, term1108693.getClass(), "focusable", false);
        setIntField(term1108693, term1108693.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1108693, term1108693.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1108693, term1108693.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1108693, term1108693.getClass(), "acc", null);
        setField(term1108693, term1108693.getClass(), "minSize", null);
        setBooleanField(term1108693, term1108693.getClass(), "minSizeSet", false);
        setField(term1108693, term1108693.getClass(), "prefSize", null);
        setBooleanField(term1108693, term1108693.getClass(), "prefSizeSet", false);
        setField(term1108693, term1108693.getClass(), "maxSize", null);
        setBooleanField(term1108693, term1108693.getClass(), "maxSizeSet", false);
        setField(term1108693, term1108693.getClass(), "componentOrientation", null);
        setBooleanField(term1108693, term1108693.getClass(), "newEventsOnly", false);
        setField(term1108693, term1108693.getClass(), "componentListener", null);
        setField(term1108693, term1108693.getClass(), "focusListener", null);
        setField(term1108693, term1108693.getClass(), "hierarchyListener", null);
        setField(term1108693, term1108693.getClass(), "hierarchyBoundsListener", null);
        setField(term1108693, term1108693.getClass(), "keyListener", null);
        setField(term1108693, term1108693.getClass(), "mouseListener", null);
        setField(term1108693, term1108693.getClass(), "mouseMotionListener", null);
        setField(term1108693, term1108693.getClass(), "mouseWheelListener", null);
        setField(term1108693, term1108693.getClass(), "inputMethodListener", null);
        setLongField(term1108693, term1108693.getClass(), "eventMask", 0L);
        setField(term1108693, term1108693.getClass(), "changeSupport", null);
        setField(term1108693, term1108693.getClass(), "objectLock", null);
        setBooleanField(term1108693, term1108693.getClass(), "isPacked", false);
        setIntField(term1108693, term1108693.getClass(), "boundsOp", 0);
        setField(term1108693, term1108693.getClass(), "compoundShape", null);
        setField(term1108693, term1108693.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1108693, term1108693.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1108693, term1108693.getClass(), "backgroundEraseDisabled", false);
        setField(term1108693, term1108693.getClass(), "eventCache", null);
        setBooleanField(term1108693, term1108693.getClass(), "coalescingEnabled", false);
        setBooleanField(term1108693, term1108693.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1108693, term1108693.getClass(), "componentSerializedDataVersion", 0);
        setField(term1108693, term1108693.getClass(), "accessibleContext", null);
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
        callMethod(klass, "addSporeAttackMission", argTypes, term1108693, args);
    }

};


