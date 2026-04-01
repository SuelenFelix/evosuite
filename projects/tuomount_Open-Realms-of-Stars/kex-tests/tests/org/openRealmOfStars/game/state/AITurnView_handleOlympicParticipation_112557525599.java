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

public class AITurnView_handleOlympicParticipation_112557525599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1378534;

    public AITurnView_handleOlympicParticipation_112557525599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1378534 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1378534, term1378534.getClass(), "label", null);
        setField(term1378534, term1378534.getClass(), "game", null);
        setIntField(term1378534, term1378534.getClass(), "textAnim", 0);
        setIntField(term1378534, term1378534.getClass(), "cx", 0);
        setIntField(term1378534, term1378534.getClass(), "cy", 0);
        setField(term1378534, term1378534.getClass(), "aiThread", null);
        setBooleanField(term1378534, term1378534.getClass(), "readyToMove", false);
        setField(term1378534, term1378534.getClass(), "nextState", null);
        setField(term1378534, term1378534.getClass(), "nextStateObject", null);
        setBooleanField(term1378534, term1378534.getClass(), "isAlignmentXSet", false);
        setFloatField(term1378534, term1378534.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1378534, term1378534.getClass(), "isAlignmentYSet", false);
        setFloatField(term1378534, term1378534.getClass(), "alignmentY", 0.0F);
        setField(term1378534, term1378534.getClass(), "ui", null);
        setField(term1378534, term1378534.getClass(), "listenerList", null);
        setField(term1378534, term1378534.getClass(), "clientProperties", null);
        setField(term1378534, term1378534.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1378534, term1378534.getClass(), "autoscrolls", false);
        setField(term1378534, term1378534.getClass(), "border", null);
        setIntField(term1378534, term1378534.getClass(), "flags", 0);
        setField(term1378534, term1378534.getClass(), "inputVerifier", null);
        setBooleanField(term1378534, term1378534.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1378534, term1378534.getClass(), "paintingChild", null);
        setField(term1378534, term1378534.getClass(), "popupMenu", null);
        setField(term1378534, term1378534.getClass(), "revalidateRunnableScheduled", null);
        setField(term1378534, term1378534.getClass(), "focusInputMap", null);
        setField(term1378534, term1378534.getClass(), "ancestorInputMap", null);
        setField(term1378534, term1378534.getClass(), "windowInputMap", null);
        setField(term1378534, term1378534.getClass(), "actionMap", null);
        setField(term1378534, term1378534.getClass(), "aaHint", null);
        setField(term1378534, term1378534.getClass(), "lcdRenderingHint", null);
        setField(term1378534, term1378534.getClass(), "component", null);
        setField(term1378534, term1378534.getClass(), "layoutMgr", null);
        setField(term1378534, term1378534.getClass(), "dispatcher", null);
        setField(term1378534, term1378534.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1378534, term1378534.getClass(), "focusCycleRoot", false);
        setBooleanField(term1378534, term1378534.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1378534, term1378534.getClass(), "printingThreads", null);
        setBooleanField(term1378534, term1378534.getClass(), "printing", false);
        setField(term1378534, term1378534.getClass(), "containerListener", null);
        setIntField(term1378534, term1378534.getClass(), "listeningChildren", 0);
        setIntField(term1378534, term1378534.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1378534, term1378534.getClass(), "descendantsCount", 0);
        setField(term1378534, term1378534.getClass(), "preserveBackgroundColor", null);
        setIntField(term1378534, term1378534.getClass(), "numOfHWComponents", 0);
        setIntField(term1378534, term1378534.getClass(), "numOfLWComponents", 0);
        setField(term1378534, term1378534.getClass(), "modalComp", null);
        setField(term1378534, term1378534.getClass(), "modalAppContext", null);
        setIntField(term1378534, term1378534.getClass(), "containerSerializedDataVersion", 0);
        setField(term1378534, term1378534.getClass(), "peer", null);
        setField(term1378534, term1378534.getClass(), "parent", null);
        setField(term1378534, term1378534.getClass(), "appContext", null);
        setIntField(term1378534, term1378534.getClass(), "x", 0);
        setIntField(term1378534, term1378534.getClass(), "y", 0);
        setIntField(term1378534, term1378534.getClass(), "width", 0);
        setIntField(term1378534, term1378534.getClass(), "height", 0);
        setField(term1378534, term1378534.getClass(), "foreground", null);
        setField(term1378534, term1378534.getClass(), "background", null);
        setField(term1378534, term1378534.getClass(), "font", null);
        setField(term1378534, term1378534.getClass(), "peerFont", null);
        setField(term1378534, term1378534.getClass(), "cursor", null);
        setField(term1378534, term1378534.getClass(), "locale", null);
        setField(term1378534, term1378534.getClass(), "graphicsConfig", null);
        setField(term1378534, term1378534.getClass(), "bufferStrategy", null);
        setBooleanField(term1378534, term1378534.getClass(), "ignoreRepaint", false);
        setBooleanField(term1378534, term1378534.getClass(), "visible", false);
        setBooleanField(term1378534, term1378534.getClass(), "enabled", false);
        setBooleanField(term1378534, term1378534.getClass(), "valid", false);
        setField(term1378534, term1378534.getClass(), "dropTarget", null);
        setField(term1378534, term1378534.getClass(), "popups", null);
        setField(term1378534, term1378534.getClass(), "name", null);
        setBooleanField(term1378534, term1378534.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1378534, term1378534.getClass(), "focusable", false);
        setIntField(term1378534, term1378534.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1378534, term1378534.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1378534, term1378534.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1378534, term1378534.getClass(), "acc", null);
        setField(term1378534, term1378534.getClass(), "minSize", null);
        setBooleanField(term1378534, term1378534.getClass(), "minSizeSet", false);
        setField(term1378534, term1378534.getClass(), "prefSize", null);
        setBooleanField(term1378534, term1378534.getClass(), "prefSizeSet", false);
        setField(term1378534, term1378534.getClass(), "maxSize", null);
        setBooleanField(term1378534, term1378534.getClass(), "maxSizeSet", false);
        setField(term1378534, term1378534.getClass(), "componentOrientation", null);
        setBooleanField(term1378534, term1378534.getClass(), "newEventsOnly", false);
        setField(term1378534, term1378534.getClass(), "componentListener", null);
        setField(term1378534, term1378534.getClass(), "focusListener", null);
        setField(term1378534, term1378534.getClass(), "hierarchyListener", null);
        setField(term1378534, term1378534.getClass(), "hierarchyBoundsListener", null);
        setField(term1378534, term1378534.getClass(), "keyListener", null);
        setField(term1378534, term1378534.getClass(), "mouseListener", null);
        setField(term1378534, term1378534.getClass(), "mouseMotionListener", null);
        setField(term1378534, term1378534.getClass(), "mouseWheelListener", null);
        setField(term1378534, term1378534.getClass(), "inputMethodListener", null);
        setLongField(term1378534, term1378534.getClass(), "eventMask", 0L);
        setField(term1378534, term1378534.getClass(), "changeSupport", null);
        setField(term1378534, term1378534.getClass(), "objectLock", null);
        setBooleanField(term1378534, term1378534.getClass(), "isPacked", false);
        setIntField(term1378534, term1378534.getClass(), "boundsOp", 0);
        setField(term1378534, term1378534.getClass(), "compoundShape", null);
        setField(term1378534, term1378534.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1378534, term1378534.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1378534, term1378534.getClass(), "backgroundEraseDisabled", false);
        setField(term1378534, term1378534.getClass(), "eventCache", null);
        setBooleanField(term1378534, term1378534.getClass(), "coalescingEnabled", false);
        setBooleanField(term1378534, term1378534.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1378534, term1378534.getClass(), "componentSerializedDataVersion", 0);
        setField(term1378534, term1378534.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.vote.Votes");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerList");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "handleOlympicParticipation", argTypes, term1378534, args);
    }

};


