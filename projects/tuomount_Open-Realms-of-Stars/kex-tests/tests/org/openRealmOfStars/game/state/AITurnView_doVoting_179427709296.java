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

public class AITurnView_doVoting_179427709296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1418628;

    public AITurnView_doVoting_179427709296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1418628 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1418628, term1418628.getClass(), "label", null);
        setField(term1418628, term1418628.getClass(), "game", null);
        setIntField(term1418628, term1418628.getClass(), "textAnim", 0);
        setIntField(term1418628, term1418628.getClass(), "cx", 0);
        setIntField(term1418628, term1418628.getClass(), "cy", 0);
        setField(term1418628, term1418628.getClass(), "aiThread", null);
        setBooleanField(term1418628, term1418628.getClass(), "readyToMove", false);
        setField(term1418628, term1418628.getClass(), "nextState", null);
        setField(term1418628, term1418628.getClass(), "nextStateObject", null);
        setBooleanField(term1418628, term1418628.getClass(), "isAlignmentXSet", false);
        setFloatField(term1418628, term1418628.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1418628, term1418628.getClass(), "isAlignmentYSet", false);
        setFloatField(term1418628, term1418628.getClass(), "alignmentY", 0.0F);
        setField(term1418628, term1418628.getClass(), "ui", null);
        setField(term1418628, term1418628.getClass(), "listenerList", null);
        setField(term1418628, term1418628.getClass(), "clientProperties", null);
        setField(term1418628, term1418628.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1418628, term1418628.getClass(), "autoscrolls", false);
        setField(term1418628, term1418628.getClass(), "border", null);
        setIntField(term1418628, term1418628.getClass(), "flags", 0);
        setField(term1418628, term1418628.getClass(), "inputVerifier", null);
        setBooleanField(term1418628, term1418628.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1418628, term1418628.getClass(), "paintingChild", null);
        setField(term1418628, term1418628.getClass(), "popupMenu", null);
        setField(term1418628, term1418628.getClass(), "revalidateRunnableScheduled", null);
        setField(term1418628, term1418628.getClass(), "focusInputMap", null);
        setField(term1418628, term1418628.getClass(), "ancestorInputMap", null);
        setField(term1418628, term1418628.getClass(), "windowInputMap", null);
        setField(term1418628, term1418628.getClass(), "actionMap", null);
        setField(term1418628, term1418628.getClass(), "aaHint", null);
        setField(term1418628, term1418628.getClass(), "lcdRenderingHint", null);
        setField(term1418628, term1418628.getClass(), "component", null);
        setField(term1418628, term1418628.getClass(), "layoutMgr", null);
        setField(term1418628, term1418628.getClass(), "dispatcher", null);
        setField(term1418628, term1418628.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1418628, term1418628.getClass(), "focusCycleRoot", false);
        setBooleanField(term1418628, term1418628.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1418628, term1418628.getClass(), "printingThreads", null);
        setBooleanField(term1418628, term1418628.getClass(), "printing", false);
        setField(term1418628, term1418628.getClass(), "containerListener", null);
        setIntField(term1418628, term1418628.getClass(), "listeningChildren", 0);
        setIntField(term1418628, term1418628.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1418628, term1418628.getClass(), "descendantsCount", 0);
        setField(term1418628, term1418628.getClass(), "preserveBackgroundColor", null);
        setIntField(term1418628, term1418628.getClass(), "numOfHWComponents", 0);
        setIntField(term1418628, term1418628.getClass(), "numOfLWComponents", 0);
        setField(term1418628, term1418628.getClass(), "modalComp", null);
        setField(term1418628, term1418628.getClass(), "modalAppContext", null);
        setIntField(term1418628, term1418628.getClass(), "containerSerializedDataVersion", 0);
        setField(term1418628, term1418628.getClass(), "peer", null);
        setField(term1418628, term1418628.getClass(), "parent", null);
        setField(term1418628, term1418628.getClass(), "appContext", null);
        setIntField(term1418628, term1418628.getClass(), "x", 0);
        setIntField(term1418628, term1418628.getClass(), "y", 0);
        setIntField(term1418628, term1418628.getClass(), "width", 0);
        setIntField(term1418628, term1418628.getClass(), "height", 0);
        setField(term1418628, term1418628.getClass(), "foreground", null);
        setField(term1418628, term1418628.getClass(), "background", null);
        setField(term1418628, term1418628.getClass(), "font", null);
        setField(term1418628, term1418628.getClass(), "peerFont", null);
        setField(term1418628, term1418628.getClass(), "cursor", null);
        setField(term1418628, term1418628.getClass(), "locale", null);
        setField(term1418628, term1418628.getClass(), "graphicsConfig", null);
        setField(term1418628, term1418628.getClass(), "bufferStrategy", null);
        setBooleanField(term1418628, term1418628.getClass(), "ignoreRepaint", false);
        setBooleanField(term1418628, term1418628.getClass(), "visible", false);
        setBooleanField(term1418628, term1418628.getClass(), "enabled", false);
        setBooleanField(term1418628, term1418628.getClass(), "valid", false);
        setField(term1418628, term1418628.getClass(), "dropTarget", null);
        setField(term1418628, term1418628.getClass(), "popups", null);
        setField(term1418628, term1418628.getClass(), "name", null);
        setBooleanField(term1418628, term1418628.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1418628, term1418628.getClass(), "focusable", false);
        setIntField(term1418628, term1418628.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1418628, term1418628.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1418628, term1418628.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1418628, term1418628.getClass(), "acc", null);
        setField(term1418628, term1418628.getClass(), "minSize", null);
        setBooleanField(term1418628, term1418628.getClass(), "minSizeSet", false);
        setField(term1418628, term1418628.getClass(), "prefSize", null);
        setBooleanField(term1418628, term1418628.getClass(), "prefSizeSet", false);
        setField(term1418628, term1418628.getClass(), "maxSize", null);
        setBooleanField(term1418628, term1418628.getClass(), "maxSizeSet", false);
        setField(term1418628, term1418628.getClass(), "componentOrientation", null);
        setBooleanField(term1418628, term1418628.getClass(), "newEventsOnly", false);
        setField(term1418628, term1418628.getClass(), "componentListener", null);
        setField(term1418628, term1418628.getClass(), "focusListener", null);
        setField(term1418628, term1418628.getClass(), "hierarchyListener", null);
        setField(term1418628, term1418628.getClass(), "hierarchyBoundsListener", null);
        setField(term1418628, term1418628.getClass(), "keyListener", null);
        setField(term1418628, term1418628.getClass(), "mouseListener", null);
        setField(term1418628, term1418628.getClass(), "mouseMotionListener", null);
        setField(term1418628, term1418628.getClass(), "mouseWheelListener", null);
        setField(term1418628, term1418628.getClass(), "inputMethodListener", null);
        setLongField(term1418628, term1418628.getClass(), "eventMask", 0L);
        setField(term1418628, term1418628.getClass(), "changeSupport", null);
        setField(term1418628, term1418628.getClass(), "objectLock", null);
        setBooleanField(term1418628, term1418628.getClass(), "isPacked", false);
        setIntField(term1418628, term1418628.getClass(), "boundsOp", 0);
        setField(term1418628, term1418628.getClass(), "compoundShape", null);
        setField(term1418628, term1418628.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1418628, term1418628.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1418628, term1418628.getClass(), "backgroundEraseDisabled", false);
        setField(term1418628, term1418628.getClass(), "eventCache", null);
        setBooleanField(term1418628, term1418628.getClass(), "coalescingEnabled", false);
        setBooleanField(term1418628, term1418628.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1418628, term1418628.getClass(), "componentSerializedDataVersion", 0);
        setField(term1418628, term1418628.getClass(), "accessibleContext", null);
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
        callMethod(klass, "doVoting", argTypes, term1418628, args);
    }

};


