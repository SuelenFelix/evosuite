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
import java.lang.Integer;

public class AITurnView_addRandomPirateTech_75481206642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1283509;
     Object term1283554;

    public AITurnView_addRandomPirateTech_75481206642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1283509 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1283509, term1283509.getClass(), "label", null);
        setField(term1283509, term1283509.getClass(), "game", null);
        setIntField(term1283509, term1283509.getClass(), "textAnim", 0);
        setIntField(term1283509, term1283509.getClass(), "cx", 0);
        setIntField(term1283509, term1283509.getClass(), "cy", 0);
        setField(term1283509, term1283509.getClass(), "aiThread", null);
        setBooleanField(term1283509, term1283509.getClass(), "readyToMove", false);
        setField(term1283509, term1283509.getClass(), "nextState", null);
        setField(term1283509, term1283509.getClass(), "nextStateObject", null);
        setBooleanField(term1283509, term1283509.getClass(), "isAlignmentXSet", false);
        setFloatField(term1283509, term1283509.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1283509, term1283509.getClass(), "isAlignmentYSet", false);
        setFloatField(term1283509, term1283509.getClass(), "alignmentY", 0.0F);
        setField(term1283509, term1283509.getClass(), "ui", null);
        setField(term1283509, term1283509.getClass(), "listenerList", null);
        setField(term1283509, term1283509.getClass(), "clientProperties", null);
        setField(term1283509, term1283509.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1283509, term1283509.getClass(), "autoscrolls", false);
        setField(term1283509, term1283509.getClass(), "border", null);
        setIntField(term1283509, term1283509.getClass(), "flags", 0);
        setField(term1283509, term1283509.getClass(), "inputVerifier", null);
        setBooleanField(term1283509, term1283509.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1283509, term1283509.getClass(), "paintingChild", null);
        setField(term1283509, term1283509.getClass(), "popupMenu", null);
        setField(term1283509, term1283509.getClass(), "revalidateRunnableScheduled", null);
        setField(term1283509, term1283509.getClass(), "focusInputMap", null);
        setField(term1283509, term1283509.getClass(), "ancestorInputMap", null);
        setField(term1283509, term1283509.getClass(), "windowInputMap", null);
        setField(term1283509, term1283509.getClass(), "actionMap", null);
        setField(term1283509, term1283509.getClass(), "aaHint", null);
        setField(term1283509, term1283509.getClass(), "lcdRenderingHint", null);
        setField(term1283509, term1283509.getClass(), "component", null);
        setField(term1283509, term1283509.getClass(), "layoutMgr", null);
        setField(term1283509, term1283509.getClass(), "dispatcher", null);
        setField(term1283509, term1283509.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1283509, term1283509.getClass(), "focusCycleRoot", false);
        setBooleanField(term1283509, term1283509.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1283509, term1283509.getClass(), "printingThreads", null);
        setBooleanField(term1283509, term1283509.getClass(), "printing", false);
        setField(term1283509, term1283509.getClass(), "containerListener", null);
        setIntField(term1283509, term1283509.getClass(), "listeningChildren", 0);
        setIntField(term1283509, term1283509.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1283509, term1283509.getClass(), "descendantsCount", 0);
        setField(term1283509, term1283509.getClass(), "preserveBackgroundColor", null);
        setIntField(term1283509, term1283509.getClass(), "numOfHWComponents", 0);
        setIntField(term1283509, term1283509.getClass(), "numOfLWComponents", 0);
        setField(term1283509, term1283509.getClass(), "modalComp", null);
        setField(term1283509, term1283509.getClass(), "modalAppContext", null);
        setIntField(term1283509, term1283509.getClass(), "containerSerializedDataVersion", 0);
        setField(term1283509, term1283509.getClass(), "peer", null);
        setField(term1283509, term1283509.getClass(), "parent", null);
        setField(term1283509, term1283509.getClass(), "appContext", null);
        setIntField(term1283509, term1283509.getClass(), "x", 0);
        setIntField(term1283509, term1283509.getClass(), "y", 0);
        setIntField(term1283509, term1283509.getClass(), "width", 0);
        setIntField(term1283509, term1283509.getClass(), "height", 0);
        setField(term1283509, term1283509.getClass(), "foreground", null);
        setField(term1283509, term1283509.getClass(), "background", null);
        setField(term1283509, term1283509.getClass(), "font", null);
        setField(term1283509, term1283509.getClass(), "peerFont", null);
        setField(term1283509, term1283509.getClass(), "cursor", null);
        setField(term1283509, term1283509.getClass(), "locale", null);
        setField(term1283509, term1283509.getClass(), "graphicsConfig", null);
        setField(term1283509, term1283509.getClass(), "bufferStrategy", null);
        setBooleanField(term1283509, term1283509.getClass(), "ignoreRepaint", false);
        setBooleanField(term1283509, term1283509.getClass(), "visible", false);
        setBooleanField(term1283509, term1283509.getClass(), "enabled", false);
        setBooleanField(term1283509, term1283509.getClass(), "valid", false);
        setField(term1283509, term1283509.getClass(), "dropTarget", null);
        setField(term1283509, term1283509.getClass(), "popups", null);
        setField(term1283509, term1283509.getClass(), "name", null);
        setBooleanField(term1283509, term1283509.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1283509, term1283509.getClass(), "focusable", false);
        setIntField(term1283509, term1283509.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1283509, term1283509.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1283509, term1283509.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1283509, term1283509.getClass(), "acc", null);
        setField(term1283509, term1283509.getClass(), "minSize", null);
        setBooleanField(term1283509, term1283509.getClass(), "minSizeSet", false);
        setField(term1283509, term1283509.getClass(), "prefSize", null);
        setBooleanField(term1283509, term1283509.getClass(), "prefSizeSet", false);
        setField(term1283509, term1283509.getClass(), "maxSize", null);
        setBooleanField(term1283509, term1283509.getClass(), "maxSizeSet", false);
        setField(term1283509, term1283509.getClass(), "componentOrientation", null);
        setBooleanField(term1283509, term1283509.getClass(), "newEventsOnly", false);
        setField(term1283509, term1283509.getClass(), "componentListener", null);
        setField(term1283509, term1283509.getClass(), "focusListener", null);
        setField(term1283509, term1283509.getClass(), "hierarchyListener", null);
        setField(term1283509, term1283509.getClass(), "hierarchyBoundsListener", null);
        setField(term1283509, term1283509.getClass(), "keyListener", null);
        setField(term1283509, term1283509.getClass(), "mouseListener", null);
        setField(term1283509, term1283509.getClass(), "mouseMotionListener", null);
        setField(term1283509, term1283509.getClass(), "mouseWheelListener", null);
        setField(term1283509, term1283509.getClass(), "inputMethodListener", null);
        setLongField(term1283509, term1283509.getClass(), "eventMask", 0L);
        setField(term1283509, term1283509.getClass(), "changeSupport", null);
        setField(term1283509, term1283509.getClass(), "objectLock", null);
        setBooleanField(term1283509, term1283509.getClass(), "isPacked", false);
        setIntField(term1283509, term1283509.getClass(), "boundsOp", 0);
        setField(term1283509, term1283509.getClass(), "compoundShape", null);
        setField(term1283509, term1283509.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1283509, term1283509.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1283509, term1283509.getClass(), "backgroundEraseDisabled", false);
        setField(term1283509, term1283509.getClass(), "eventCache", null);
        setBooleanField(term1283509, term1283509.getClass(), "coalescingEnabled", false);
        setBooleanField(term1283509, term1283509.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1283509, term1283509.getClass(), "componentSerializedDataVersion", 0);
        setField(term1283509, term1283509.getClass(), "accessibleContext", null);
        term1283554 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.tech.TechType");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term1283554;
        callMethod(klass, "addRandomPirateTech", argTypes, term1283509, args);
    }

};


