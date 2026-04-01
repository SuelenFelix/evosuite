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

public class AITurnView_handlePromises_90390911097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1418673;

    public AITurnView_handlePromises_90390911097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1418673 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1418673, term1418673.getClass(), "label", null);
        setField(term1418673, term1418673.getClass(), "game", null);
        setIntField(term1418673, term1418673.getClass(), "textAnim", 0);
        setIntField(term1418673, term1418673.getClass(), "cx", 0);
        setIntField(term1418673, term1418673.getClass(), "cy", 0);
        setField(term1418673, term1418673.getClass(), "aiThread", null);
        setBooleanField(term1418673, term1418673.getClass(), "readyToMove", false);
        setField(term1418673, term1418673.getClass(), "nextState", null);
        setField(term1418673, term1418673.getClass(), "nextStateObject", null);
        setBooleanField(term1418673, term1418673.getClass(), "isAlignmentXSet", false);
        setFloatField(term1418673, term1418673.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1418673, term1418673.getClass(), "isAlignmentYSet", false);
        setFloatField(term1418673, term1418673.getClass(), "alignmentY", 0.0F);
        setField(term1418673, term1418673.getClass(), "ui", null);
        setField(term1418673, term1418673.getClass(), "listenerList", null);
        setField(term1418673, term1418673.getClass(), "clientProperties", null);
        setField(term1418673, term1418673.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1418673, term1418673.getClass(), "autoscrolls", false);
        setField(term1418673, term1418673.getClass(), "border", null);
        setIntField(term1418673, term1418673.getClass(), "flags", 0);
        setField(term1418673, term1418673.getClass(), "inputVerifier", null);
        setBooleanField(term1418673, term1418673.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1418673, term1418673.getClass(), "paintingChild", null);
        setField(term1418673, term1418673.getClass(), "popupMenu", null);
        setField(term1418673, term1418673.getClass(), "revalidateRunnableScheduled", null);
        setField(term1418673, term1418673.getClass(), "focusInputMap", null);
        setField(term1418673, term1418673.getClass(), "ancestorInputMap", null);
        setField(term1418673, term1418673.getClass(), "windowInputMap", null);
        setField(term1418673, term1418673.getClass(), "actionMap", null);
        setField(term1418673, term1418673.getClass(), "aaHint", null);
        setField(term1418673, term1418673.getClass(), "lcdRenderingHint", null);
        setField(term1418673, term1418673.getClass(), "component", null);
        setField(term1418673, term1418673.getClass(), "layoutMgr", null);
        setField(term1418673, term1418673.getClass(), "dispatcher", null);
        setField(term1418673, term1418673.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1418673, term1418673.getClass(), "focusCycleRoot", false);
        setBooleanField(term1418673, term1418673.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1418673, term1418673.getClass(), "printingThreads", null);
        setBooleanField(term1418673, term1418673.getClass(), "printing", false);
        setField(term1418673, term1418673.getClass(), "containerListener", null);
        setIntField(term1418673, term1418673.getClass(), "listeningChildren", 0);
        setIntField(term1418673, term1418673.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1418673, term1418673.getClass(), "descendantsCount", 0);
        setField(term1418673, term1418673.getClass(), "preserveBackgroundColor", null);
        setIntField(term1418673, term1418673.getClass(), "numOfHWComponents", 0);
        setIntField(term1418673, term1418673.getClass(), "numOfLWComponents", 0);
        setField(term1418673, term1418673.getClass(), "modalComp", null);
        setField(term1418673, term1418673.getClass(), "modalAppContext", null);
        setIntField(term1418673, term1418673.getClass(), "containerSerializedDataVersion", 0);
        setField(term1418673, term1418673.getClass(), "peer", null);
        setField(term1418673, term1418673.getClass(), "parent", null);
        setField(term1418673, term1418673.getClass(), "appContext", null);
        setIntField(term1418673, term1418673.getClass(), "x", 0);
        setIntField(term1418673, term1418673.getClass(), "y", 0);
        setIntField(term1418673, term1418673.getClass(), "width", 0);
        setIntField(term1418673, term1418673.getClass(), "height", 0);
        setField(term1418673, term1418673.getClass(), "foreground", null);
        setField(term1418673, term1418673.getClass(), "background", null);
        setField(term1418673, term1418673.getClass(), "font", null);
        setField(term1418673, term1418673.getClass(), "peerFont", null);
        setField(term1418673, term1418673.getClass(), "cursor", null);
        setField(term1418673, term1418673.getClass(), "locale", null);
        setField(term1418673, term1418673.getClass(), "graphicsConfig", null);
        setField(term1418673, term1418673.getClass(), "bufferStrategy", null);
        setBooleanField(term1418673, term1418673.getClass(), "ignoreRepaint", false);
        setBooleanField(term1418673, term1418673.getClass(), "visible", false);
        setBooleanField(term1418673, term1418673.getClass(), "enabled", false);
        setBooleanField(term1418673, term1418673.getClass(), "valid", false);
        setField(term1418673, term1418673.getClass(), "dropTarget", null);
        setField(term1418673, term1418673.getClass(), "popups", null);
        setField(term1418673, term1418673.getClass(), "name", null);
        setBooleanField(term1418673, term1418673.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1418673, term1418673.getClass(), "focusable", false);
        setIntField(term1418673, term1418673.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1418673, term1418673.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1418673, term1418673.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1418673, term1418673.getClass(), "acc", null);
        setField(term1418673, term1418673.getClass(), "minSize", null);
        setBooleanField(term1418673, term1418673.getClass(), "minSizeSet", false);
        setField(term1418673, term1418673.getClass(), "prefSize", null);
        setBooleanField(term1418673, term1418673.getClass(), "prefSizeSet", false);
        setField(term1418673, term1418673.getClass(), "maxSize", null);
        setBooleanField(term1418673, term1418673.getClass(), "maxSizeSet", false);
        setField(term1418673, term1418673.getClass(), "componentOrientation", null);
        setBooleanField(term1418673, term1418673.getClass(), "newEventsOnly", false);
        setField(term1418673, term1418673.getClass(), "componentListener", null);
        setField(term1418673, term1418673.getClass(), "focusListener", null);
        setField(term1418673, term1418673.getClass(), "hierarchyListener", null);
        setField(term1418673, term1418673.getClass(), "hierarchyBoundsListener", null);
        setField(term1418673, term1418673.getClass(), "keyListener", null);
        setField(term1418673, term1418673.getClass(), "mouseListener", null);
        setField(term1418673, term1418673.getClass(), "mouseMotionListener", null);
        setField(term1418673, term1418673.getClass(), "mouseWheelListener", null);
        setField(term1418673, term1418673.getClass(), "inputMethodListener", null);
        setLongField(term1418673, term1418673.getClass(), "eventMask", 0L);
        setField(term1418673, term1418673.getClass(), "changeSupport", null);
        setField(term1418673, term1418673.getClass(), "objectLock", null);
        setBooleanField(term1418673, term1418673.getClass(), "isPacked", false);
        setIntField(term1418673, term1418673.getClass(), "boundsOp", 0);
        setField(term1418673, term1418673.getClass(), "compoundShape", null);
        setField(term1418673, term1418673.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1418673, term1418673.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1418673, term1418673.getClass(), "backgroundEraseDisabled", false);
        setField(term1418673, term1418673.getClass(), "eventCache", null);
        setBooleanField(term1418673, term1418673.getClass(), "coalescingEnabled", false);
        setBooleanField(term1418673, term1418673.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1418673, term1418673.getClass(), "componentSerializedDataVersion", 0);
        setField(term1418673, term1418673.getClass(), "accessibleContext", null);
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
        callMethod(klass, "handlePromises", argTypes, term1418673, args);
    }

};


