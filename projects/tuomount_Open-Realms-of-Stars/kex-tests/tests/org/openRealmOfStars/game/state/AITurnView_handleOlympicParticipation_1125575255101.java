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

public class AITurnView_handleOlympicParticipation_1125575255101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1418853;

    public AITurnView_handleOlympicParticipation_1125575255101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1418853 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1418853, term1418853.getClass(), "label", null);
        setField(term1418853, term1418853.getClass(), "game", null);
        setIntField(term1418853, term1418853.getClass(), "textAnim", 0);
        setIntField(term1418853, term1418853.getClass(), "cx", 0);
        setIntField(term1418853, term1418853.getClass(), "cy", 0);
        setField(term1418853, term1418853.getClass(), "aiThread", null);
        setBooleanField(term1418853, term1418853.getClass(), "readyToMove", false);
        setField(term1418853, term1418853.getClass(), "nextState", null);
        setField(term1418853, term1418853.getClass(), "nextStateObject", null);
        setBooleanField(term1418853, term1418853.getClass(), "isAlignmentXSet", false);
        setFloatField(term1418853, term1418853.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1418853, term1418853.getClass(), "isAlignmentYSet", false);
        setFloatField(term1418853, term1418853.getClass(), "alignmentY", 0.0F);
        setField(term1418853, term1418853.getClass(), "ui", null);
        setField(term1418853, term1418853.getClass(), "listenerList", null);
        setField(term1418853, term1418853.getClass(), "clientProperties", null);
        setField(term1418853, term1418853.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1418853, term1418853.getClass(), "autoscrolls", false);
        setField(term1418853, term1418853.getClass(), "border", null);
        setIntField(term1418853, term1418853.getClass(), "flags", 0);
        setField(term1418853, term1418853.getClass(), "inputVerifier", null);
        setBooleanField(term1418853, term1418853.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1418853, term1418853.getClass(), "paintingChild", null);
        setField(term1418853, term1418853.getClass(), "popupMenu", null);
        setField(term1418853, term1418853.getClass(), "revalidateRunnableScheduled", null);
        setField(term1418853, term1418853.getClass(), "focusInputMap", null);
        setField(term1418853, term1418853.getClass(), "ancestorInputMap", null);
        setField(term1418853, term1418853.getClass(), "windowInputMap", null);
        setField(term1418853, term1418853.getClass(), "actionMap", null);
        setField(term1418853, term1418853.getClass(), "aaHint", null);
        setField(term1418853, term1418853.getClass(), "lcdRenderingHint", null);
        setField(term1418853, term1418853.getClass(), "component", null);
        setField(term1418853, term1418853.getClass(), "layoutMgr", null);
        setField(term1418853, term1418853.getClass(), "dispatcher", null);
        setField(term1418853, term1418853.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1418853, term1418853.getClass(), "focusCycleRoot", false);
        setBooleanField(term1418853, term1418853.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1418853, term1418853.getClass(), "printingThreads", null);
        setBooleanField(term1418853, term1418853.getClass(), "printing", false);
        setField(term1418853, term1418853.getClass(), "containerListener", null);
        setIntField(term1418853, term1418853.getClass(), "listeningChildren", 0);
        setIntField(term1418853, term1418853.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1418853, term1418853.getClass(), "descendantsCount", 0);
        setField(term1418853, term1418853.getClass(), "preserveBackgroundColor", null);
        setIntField(term1418853, term1418853.getClass(), "numOfHWComponents", 0);
        setIntField(term1418853, term1418853.getClass(), "numOfLWComponents", 0);
        setField(term1418853, term1418853.getClass(), "modalComp", null);
        setField(term1418853, term1418853.getClass(), "modalAppContext", null);
        setIntField(term1418853, term1418853.getClass(), "containerSerializedDataVersion", 0);
        setField(term1418853, term1418853.getClass(), "peer", null);
        setField(term1418853, term1418853.getClass(), "parent", null);
        setField(term1418853, term1418853.getClass(), "appContext", null);
        setIntField(term1418853, term1418853.getClass(), "x", 0);
        setIntField(term1418853, term1418853.getClass(), "y", 0);
        setIntField(term1418853, term1418853.getClass(), "width", 0);
        setIntField(term1418853, term1418853.getClass(), "height", 0);
        setField(term1418853, term1418853.getClass(), "foreground", null);
        setField(term1418853, term1418853.getClass(), "background", null);
        setField(term1418853, term1418853.getClass(), "font", null);
        setField(term1418853, term1418853.getClass(), "peerFont", null);
        setField(term1418853, term1418853.getClass(), "cursor", null);
        setField(term1418853, term1418853.getClass(), "locale", null);
        setField(term1418853, term1418853.getClass(), "graphicsConfig", null);
        setField(term1418853, term1418853.getClass(), "bufferStrategy", null);
        setBooleanField(term1418853, term1418853.getClass(), "ignoreRepaint", false);
        setBooleanField(term1418853, term1418853.getClass(), "visible", false);
        setBooleanField(term1418853, term1418853.getClass(), "enabled", false);
        setBooleanField(term1418853, term1418853.getClass(), "valid", false);
        setField(term1418853, term1418853.getClass(), "dropTarget", null);
        setField(term1418853, term1418853.getClass(), "popups", null);
        setField(term1418853, term1418853.getClass(), "name", null);
        setBooleanField(term1418853, term1418853.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1418853, term1418853.getClass(), "focusable", false);
        setIntField(term1418853, term1418853.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1418853, term1418853.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1418853, term1418853.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1418853, term1418853.getClass(), "acc", null);
        setField(term1418853, term1418853.getClass(), "minSize", null);
        setBooleanField(term1418853, term1418853.getClass(), "minSizeSet", false);
        setField(term1418853, term1418853.getClass(), "prefSize", null);
        setBooleanField(term1418853, term1418853.getClass(), "prefSizeSet", false);
        setField(term1418853, term1418853.getClass(), "maxSize", null);
        setBooleanField(term1418853, term1418853.getClass(), "maxSizeSet", false);
        setField(term1418853, term1418853.getClass(), "componentOrientation", null);
        setBooleanField(term1418853, term1418853.getClass(), "newEventsOnly", false);
        setField(term1418853, term1418853.getClass(), "componentListener", null);
        setField(term1418853, term1418853.getClass(), "focusListener", null);
        setField(term1418853, term1418853.getClass(), "hierarchyListener", null);
        setField(term1418853, term1418853.getClass(), "hierarchyBoundsListener", null);
        setField(term1418853, term1418853.getClass(), "keyListener", null);
        setField(term1418853, term1418853.getClass(), "mouseListener", null);
        setField(term1418853, term1418853.getClass(), "mouseMotionListener", null);
        setField(term1418853, term1418853.getClass(), "mouseWheelListener", null);
        setField(term1418853, term1418853.getClass(), "inputMethodListener", null);
        setLongField(term1418853, term1418853.getClass(), "eventMask", 0L);
        setField(term1418853, term1418853.getClass(), "changeSupport", null);
        setField(term1418853, term1418853.getClass(), "objectLock", null);
        setBooleanField(term1418853, term1418853.getClass(), "isPacked", false);
        setIntField(term1418853, term1418853.getClass(), "boundsOp", 0);
        setField(term1418853, term1418853.getClass(), "compoundShape", null);
        setField(term1418853, term1418853.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1418853, term1418853.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1418853, term1418853.getClass(), "backgroundEraseDisabled", false);
        setField(term1418853, term1418853.getClass(), "eventCache", null);
        setBooleanField(term1418853, term1418853.getClass(), "coalescingEnabled", false);
        setBooleanField(term1418853, term1418853.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1418853, term1418853.getClass(), "componentSerializedDataVersion", 0);
        setField(term1418853, term1418853.getClass(), "accessibleContext", null);
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
        callMethod(klass, "handleOlympicParticipation", argTypes, term1418853, args);
    }

};


