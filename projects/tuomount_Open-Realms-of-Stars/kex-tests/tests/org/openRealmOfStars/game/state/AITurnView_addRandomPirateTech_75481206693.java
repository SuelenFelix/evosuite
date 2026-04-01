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

public class AITurnView_addRandomPirateTech_75481206693 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1378262;
     Object term1378307;

    public AITurnView_addRandomPirateTech_75481206693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1378262 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1378262, term1378262.getClass(), "label", null);
        setField(term1378262, term1378262.getClass(), "game", null);
        setIntField(term1378262, term1378262.getClass(), "textAnim", 0);
        setIntField(term1378262, term1378262.getClass(), "cx", 0);
        setIntField(term1378262, term1378262.getClass(), "cy", 0);
        setField(term1378262, term1378262.getClass(), "aiThread", null);
        setBooleanField(term1378262, term1378262.getClass(), "readyToMove", false);
        setField(term1378262, term1378262.getClass(), "nextState", null);
        setField(term1378262, term1378262.getClass(), "nextStateObject", null);
        setBooleanField(term1378262, term1378262.getClass(), "isAlignmentXSet", false);
        setFloatField(term1378262, term1378262.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1378262, term1378262.getClass(), "isAlignmentYSet", false);
        setFloatField(term1378262, term1378262.getClass(), "alignmentY", 0.0F);
        setField(term1378262, term1378262.getClass(), "ui", null);
        setField(term1378262, term1378262.getClass(), "listenerList", null);
        setField(term1378262, term1378262.getClass(), "clientProperties", null);
        setField(term1378262, term1378262.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1378262, term1378262.getClass(), "autoscrolls", false);
        setField(term1378262, term1378262.getClass(), "border", null);
        setIntField(term1378262, term1378262.getClass(), "flags", 0);
        setField(term1378262, term1378262.getClass(), "inputVerifier", null);
        setBooleanField(term1378262, term1378262.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1378262, term1378262.getClass(), "paintingChild", null);
        setField(term1378262, term1378262.getClass(), "popupMenu", null);
        setField(term1378262, term1378262.getClass(), "revalidateRunnableScheduled", null);
        setField(term1378262, term1378262.getClass(), "focusInputMap", null);
        setField(term1378262, term1378262.getClass(), "ancestorInputMap", null);
        setField(term1378262, term1378262.getClass(), "windowInputMap", null);
        setField(term1378262, term1378262.getClass(), "actionMap", null);
        setField(term1378262, term1378262.getClass(), "aaHint", null);
        setField(term1378262, term1378262.getClass(), "lcdRenderingHint", null);
        setField(term1378262, term1378262.getClass(), "component", null);
        setField(term1378262, term1378262.getClass(), "layoutMgr", null);
        setField(term1378262, term1378262.getClass(), "dispatcher", null);
        setField(term1378262, term1378262.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1378262, term1378262.getClass(), "focusCycleRoot", false);
        setBooleanField(term1378262, term1378262.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1378262, term1378262.getClass(), "printingThreads", null);
        setBooleanField(term1378262, term1378262.getClass(), "printing", false);
        setField(term1378262, term1378262.getClass(), "containerListener", null);
        setIntField(term1378262, term1378262.getClass(), "listeningChildren", 0);
        setIntField(term1378262, term1378262.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1378262, term1378262.getClass(), "descendantsCount", 0);
        setField(term1378262, term1378262.getClass(), "preserveBackgroundColor", null);
        setIntField(term1378262, term1378262.getClass(), "numOfHWComponents", 0);
        setIntField(term1378262, term1378262.getClass(), "numOfLWComponents", 0);
        setField(term1378262, term1378262.getClass(), "modalComp", null);
        setField(term1378262, term1378262.getClass(), "modalAppContext", null);
        setIntField(term1378262, term1378262.getClass(), "containerSerializedDataVersion", 0);
        setField(term1378262, term1378262.getClass(), "peer", null);
        setField(term1378262, term1378262.getClass(), "parent", null);
        setField(term1378262, term1378262.getClass(), "appContext", null);
        setIntField(term1378262, term1378262.getClass(), "x", 0);
        setIntField(term1378262, term1378262.getClass(), "y", 0);
        setIntField(term1378262, term1378262.getClass(), "width", 0);
        setIntField(term1378262, term1378262.getClass(), "height", 0);
        setField(term1378262, term1378262.getClass(), "foreground", null);
        setField(term1378262, term1378262.getClass(), "background", null);
        setField(term1378262, term1378262.getClass(), "font", null);
        setField(term1378262, term1378262.getClass(), "peerFont", null);
        setField(term1378262, term1378262.getClass(), "cursor", null);
        setField(term1378262, term1378262.getClass(), "locale", null);
        setField(term1378262, term1378262.getClass(), "graphicsConfig", null);
        setField(term1378262, term1378262.getClass(), "bufferStrategy", null);
        setBooleanField(term1378262, term1378262.getClass(), "ignoreRepaint", false);
        setBooleanField(term1378262, term1378262.getClass(), "visible", false);
        setBooleanField(term1378262, term1378262.getClass(), "enabled", false);
        setBooleanField(term1378262, term1378262.getClass(), "valid", false);
        setField(term1378262, term1378262.getClass(), "dropTarget", null);
        setField(term1378262, term1378262.getClass(), "popups", null);
        setField(term1378262, term1378262.getClass(), "name", null);
        setBooleanField(term1378262, term1378262.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1378262, term1378262.getClass(), "focusable", false);
        setIntField(term1378262, term1378262.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1378262, term1378262.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1378262, term1378262.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1378262, term1378262.getClass(), "acc", null);
        setField(term1378262, term1378262.getClass(), "minSize", null);
        setBooleanField(term1378262, term1378262.getClass(), "minSizeSet", false);
        setField(term1378262, term1378262.getClass(), "prefSize", null);
        setBooleanField(term1378262, term1378262.getClass(), "prefSizeSet", false);
        setField(term1378262, term1378262.getClass(), "maxSize", null);
        setBooleanField(term1378262, term1378262.getClass(), "maxSizeSet", false);
        setField(term1378262, term1378262.getClass(), "componentOrientation", null);
        setBooleanField(term1378262, term1378262.getClass(), "newEventsOnly", false);
        setField(term1378262, term1378262.getClass(), "componentListener", null);
        setField(term1378262, term1378262.getClass(), "focusListener", null);
        setField(term1378262, term1378262.getClass(), "hierarchyListener", null);
        setField(term1378262, term1378262.getClass(), "hierarchyBoundsListener", null);
        setField(term1378262, term1378262.getClass(), "keyListener", null);
        setField(term1378262, term1378262.getClass(), "mouseListener", null);
        setField(term1378262, term1378262.getClass(), "mouseMotionListener", null);
        setField(term1378262, term1378262.getClass(), "mouseWheelListener", null);
        setField(term1378262, term1378262.getClass(), "inputMethodListener", null);
        setLongField(term1378262, term1378262.getClass(), "eventMask", 0L);
        setField(term1378262, term1378262.getClass(), "changeSupport", null);
        setField(term1378262, term1378262.getClass(), "objectLock", null);
        setBooleanField(term1378262, term1378262.getClass(), "isPacked", false);
        setIntField(term1378262, term1378262.getClass(), "boundsOp", 0);
        setField(term1378262, term1378262.getClass(), "compoundShape", null);
        setField(term1378262, term1378262.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1378262, term1378262.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1378262, term1378262.getClass(), "backgroundEraseDisabled", false);
        setField(term1378262, term1378262.getClass(), "eventCache", null);
        setBooleanField(term1378262, term1378262.getClass(), "coalescingEnabled", false);
        setBooleanField(term1378262, term1378262.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1378262, term1378262.getClass(), "componentSerializedDataVersion", 0);
        setField(term1378262, term1378262.getClass(), "accessibleContext", null);
        term1378307 = new Integer(0);
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
        args[2] = term1378307;
        callMethod(klass, "addRandomPirateTech", argTypes, term1378262, args);
    }

};


