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

public class AITurnView_handlePromises_90390911095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1378354;

    public AITurnView_handlePromises_90390911095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1378354 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1378354, term1378354.getClass(), "label", null);
        setField(term1378354, term1378354.getClass(), "game", null);
        setIntField(term1378354, term1378354.getClass(), "textAnim", 0);
        setIntField(term1378354, term1378354.getClass(), "cx", 0);
        setIntField(term1378354, term1378354.getClass(), "cy", 0);
        setField(term1378354, term1378354.getClass(), "aiThread", null);
        setBooleanField(term1378354, term1378354.getClass(), "readyToMove", false);
        setField(term1378354, term1378354.getClass(), "nextState", null);
        setField(term1378354, term1378354.getClass(), "nextStateObject", null);
        setBooleanField(term1378354, term1378354.getClass(), "isAlignmentXSet", false);
        setFloatField(term1378354, term1378354.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1378354, term1378354.getClass(), "isAlignmentYSet", false);
        setFloatField(term1378354, term1378354.getClass(), "alignmentY", 0.0F);
        setField(term1378354, term1378354.getClass(), "ui", null);
        setField(term1378354, term1378354.getClass(), "listenerList", null);
        setField(term1378354, term1378354.getClass(), "clientProperties", null);
        setField(term1378354, term1378354.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1378354, term1378354.getClass(), "autoscrolls", false);
        setField(term1378354, term1378354.getClass(), "border", null);
        setIntField(term1378354, term1378354.getClass(), "flags", 0);
        setField(term1378354, term1378354.getClass(), "inputVerifier", null);
        setBooleanField(term1378354, term1378354.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1378354, term1378354.getClass(), "paintingChild", null);
        setField(term1378354, term1378354.getClass(), "popupMenu", null);
        setField(term1378354, term1378354.getClass(), "revalidateRunnableScheduled", null);
        setField(term1378354, term1378354.getClass(), "focusInputMap", null);
        setField(term1378354, term1378354.getClass(), "ancestorInputMap", null);
        setField(term1378354, term1378354.getClass(), "windowInputMap", null);
        setField(term1378354, term1378354.getClass(), "actionMap", null);
        setField(term1378354, term1378354.getClass(), "aaHint", null);
        setField(term1378354, term1378354.getClass(), "lcdRenderingHint", null);
        setField(term1378354, term1378354.getClass(), "component", null);
        setField(term1378354, term1378354.getClass(), "layoutMgr", null);
        setField(term1378354, term1378354.getClass(), "dispatcher", null);
        setField(term1378354, term1378354.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1378354, term1378354.getClass(), "focusCycleRoot", false);
        setBooleanField(term1378354, term1378354.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1378354, term1378354.getClass(), "printingThreads", null);
        setBooleanField(term1378354, term1378354.getClass(), "printing", false);
        setField(term1378354, term1378354.getClass(), "containerListener", null);
        setIntField(term1378354, term1378354.getClass(), "listeningChildren", 0);
        setIntField(term1378354, term1378354.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1378354, term1378354.getClass(), "descendantsCount", 0);
        setField(term1378354, term1378354.getClass(), "preserveBackgroundColor", null);
        setIntField(term1378354, term1378354.getClass(), "numOfHWComponents", 0);
        setIntField(term1378354, term1378354.getClass(), "numOfLWComponents", 0);
        setField(term1378354, term1378354.getClass(), "modalComp", null);
        setField(term1378354, term1378354.getClass(), "modalAppContext", null);
        setIntField(term1378354, term1378354.getClass(), "containerSerializedDataVersion", 0);
        setField(term1378354, term1378354.getClass(), "peer", null);
        setField(term1378354, term1378354.getClass(), "parent", null);
        setField(term1378354, term1378354.getClass(), "appContext", null);
        setIntField(term1378354, term1378354.getClass(), "x", 0);
        setIntField(term1378354, term1378354.getClass(), "y", 0);
        setIntField(term1378354, term1378354.getClass(), "width", 0);
        setIntField(term1378354, term1378354.getClass(), "height", 0);
        setField(term1378354, term1378354.getClass(), "foreground", null);
        setField(term1378354, term1378354.getClass(), "background", null);
        setField(term1378354, term1378354.getClass(), "font", null);
        setField(term1378354, term1378354.getClass(), "peerFont", null);
        setField(term1378354, term1378354.getClass(), "cursor", null);
        setField(term1378354, term1378354.getClass(), "locale", null);
        setField(term1378354, term1378354.getClass(), "graphicsConfig", null);
        setField(term1378354, term1378354.getClass(), "bufferStrategy", null);
        setBooleanField(term1378354, term1378354.getClass(), "ignoreRepaint", false);
        setBooleanField(term1378354, term1378354.getClass(), "visible", false);
        setBooleanField(term1378354, term1378354.getClass(), "enabled", false);
        setBooleanField(term1378354, term1378354.getClass(), "valid", false);
        setField(term1378354, term1378354.getClass(), "dropTarget", null);
        setField(term1378354, term1378354.getClass(), "popups", null);
        setField(term1378354, term1378354.getClass(), "name", null);
        setBooleanField(term1378354, term1378354.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1378354, term1378354.getClass(), "focusable", false);
        setIntField(term1378354, term1378354.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1378354, term1378354.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1378354, term1378354.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1378354, term1378354.getClass(), "acc", null);
        setField(term1378354, term1378354.getClass(), "minSize", null);
        setBooleanField(term1378354, term1378354.getClass(), "minSizeSet", false);
        setField(term1378354, term1378354.getClass(), "prefSize", null);
        setBooleanField(term1378354, term1378354.getClass(), "prefSizeSet", false);
        setField(term1378354, term1378354.getClass(), "maxSize", null);
        setBooleanField(term1378354, term1378354.getClass(), "maxSizeSet", false);
        setField(term1378354, term1378354.getClass(), "componentOrientation", null);
        setBooleanField(term1378354, term1378354.getClass(), "newEventsOnly", false);
        setField(term1378354, term1378354.getClass(), "componentListener", null);
        setField(term1378354, term1378354.getClass(), "focusListener", null);
        setField(term1378354, term1378354.getClass(), "hierarchyListener", null);
        setField(term1378354, term1378354.getClass(), "hierarchyBoundsListener", null);
        setField(term1378354, term1378354.getClass(), "keyListener", null);
        setField(term1378354, term1378354.getClass(), "mouseListener", null);
        setField(term1378354, term1378354.getClass(), "mouseMotionListener", null);
        setField(term1378354, term1378354.getClass(), "mouseWheelListener", null);
        setField(term1378354, term1378354.getClass(), "inputMethodListener", null);
        setLongField(term1378354, term1378354.getClass(), "eventMask", 0L);
        setField(term1378354, term1378354.getClass(), "changeSupport", null);
        setField(term1378354, term1378354.getClass(), "objectLock", null);
        setBooleanField(term1378354, term1378354.getClass(), "isPacked", false);
        setIntField(term1378354, term1378354.getClass(), "boundsOp", 0);
        setField(term1378354, term1378354.getClass(), "compoundShape", null);
        setField(term1378354, term1378354.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1378354, term1378354.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1378354, term1378354.getClass(), "backgroundEraseDisabled", false);
        setField(term1378354, term1378354.getClass(), "eventCache", null);
        setBooleanField(term1378354, term1378354.getClass(), "coalescingEnabled", false);
        setBooleanField(term1378354, term1378354.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1378354, term1378354.getClass(), "componentSerializedDataVersion", 0);
        setField(term1378354, term1378354.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.vote.Vote");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerList");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "handlePromises", argTypes, term1378354, args);
    }

};


