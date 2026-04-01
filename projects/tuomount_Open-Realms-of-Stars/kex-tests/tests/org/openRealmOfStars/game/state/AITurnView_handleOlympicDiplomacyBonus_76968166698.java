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

public class AITurnView_handleOlympicDiplomacyBonus_76968166698 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1378489;

    public AITurnView_handleOlympicDiplomacyBonus_76968166698() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1378489 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1378489, term1378489.getClass(), "label", null);
        setField(term1378489, term1378489.getClass(), "game", null);
        setIntField(term1378489, term1378489.getClass(), "textAnim", 0);
        setIntField(term1378489, term1378489.getClass(), "cx", 0);
        setIntField(term1378489, term1378489.getClass(), "cy", 0);
        setField(term1378489, term1378489.getClass(), "aiThread", null);
        setBooleanField(term1378489, term1378489.getClass(), "readyToMove", false);
        setField(term1378489, term1378489.getClass(), "nextState", null);
        setField(term1378489, term1378489.getClass(), "nextStateObject", null);
        setBooleanField(term1378489, term1378489.getClass(), "isAlignmentXSet", false);
        setFloatField(term1378489, term1378489.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1378489, term1378489.getClass(), "isAlignmentYSet", false);
        setFloatField(term1378489, term1378489.getClass(), "alignmentY", 0.0F);
        setField(term1378489, term1378489.getClass(), "ui", null);
        setField(term1378489, term1378489.getClass(), "listenerList", null);
        setField(term1378489, term1378489.getClass(), "clientProperties", null);
        setField(term1378489, term1378489.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1378489, term1378489.getClass(), "autoscrolls", false);
        setField(term1378489, term1378489.getClass(), "border", null);
        setIntField(term1378489, term1378489.getClass(), "flags", 0);
        setField(term1378489, term1378489.getClass(), "inputVerifier", null);
        setBooleanField(term1378489, term1378489.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1378489, term1378489.getClass(), "paintingChild", null);
        setField(term1378489, term1378489.getClass(), "popupMenu", null);
        setField(term1378489, term1378489.getClass(), "revalidateRunnableScheduled", null);
        setField(term1378489, term1378489.getClass(), "focusInputMap", null);
        setField(term1378489, term1378489.getClass(), "ancestorInputMap", null);
        setField(term1378489, term1378489.getClass(), "windowInputMap", null);
        setField(term1378489, term1378489.getClass(), "actionMap", null);
        setField(term1378489, term1378489.getClass(), "aaHint", null);
        setField(term1378489, term1378489.getClass(), "lcdRenderingHint", null);
        setField(term1378489, term1378489.getClass(), "component", null);
        setField(term1378489, term1378489.getClass(), "layoutMgr", null);
        setField(term1378489, term1378489.getClass(), "dispatcher", null);
        setField(term1378489, term1378489.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1378489, term1378489.getClass(), "focusCycleRoot", false);
        setBooleanField(term1378489, term1378489.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1378489, term1378489.getClass(), "printingThreads", null);
        setBooleanField(term1378489, term1378489.getClass(), "printing", false);
        setField(term1378489, term1378489.getClass(), "containerListener", null);
        setIntField(term1378489, term1378489.getClass(), "listeningChildren", 0);
        setIntField(term1378489, term1378489.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1378489, term1378489.getClass(), "descendantsCount", 0);
        setField(term1378489, term1378489.getClass(), "preserveBackgroundColor", null);
        setIntField(term1378489, term1378489.getClass(), "numOfHWComponents", 0);
        setIntField(term1378489, term1378489.getClass(), "numOfLWComponents", 0);
        setField(term1378489, term1378489.getClass(), "modalComp", null);
        setField(term1378489, term1378489.getClass(), "modalAppContext", null);
        setIntField(term1378489, term1378489.getClass(), "containerSerializedDataVersion", 0);
        setField(term1378489, term1378489.getClass(), "peer", null);
        setField(term1378489, term1378489.getClass(), "parent", null);
        setField(term1378489, term1378489.getClass(), "appContext", null);
        setIntField(term1378489, term1378489.getClass(), "x", 0);
        setIntField(term1378489, term1378489.getClass(), "y", 0);
        setIntField(term1378489, term1378489.getClass(), "width", 0);
        setIntField(term1378489, term1378489.getClass(), "height", 0);
        setField(term1378489, term1378489.getClass(), "foreground", null);
        setField(term1378489, term1378489.getClass(), "background", null);
        setField(term1378489, term1378489.getClass(), "font", null);
        setField(term1378489, term1378489.getClass(), "peerFont", null);
        setField(term1378489, term1378489.getClass(), "cursor", null);
        setField(term1378489, term1378489.getClass(), "locale", null);
        setField(term1378489, term1378489.getClass(), "graphicsConfig", null);
        setField(term1378489, term1378489.getClass(), "bufferStrategy", null);
        setBooleanField(term1378489, term1378489.getClass(), "ignoreRepaint", false);
        setBooleanField(term1378489, term1378489.getClass(), "visible", false);
        setBooleanField(term1378489, term1378489.getClass(), "enabled", false);
        setBooleanField(term1378489, term1378489.getClass(), "valid", false);
        setField(term1378489, term1378489.getClass(), "dropTarget", null);
        setField(term1378489, term1378489.getClass(), "popups", null);
        setField(term1378489, term1378489.getClass(), "name", null);
        setBooleanField(term1378489, term1378489.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1378489, term1378489.getClass(), "focusable", false);
        setIntField(term1378489, term1378489.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1378489, term1378489.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1378489, term1378489.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1378489, term1378489.getClass(), "acc", null);
        setField(term1378489, term1378489.getClass(), "minSize", null);
        setBooleanField(term1378489, term1378489.getClass(), "minSizeSet", false);
        setField(term1378489, term1378489.getClass(), "prefSize", null);
        setBooleanField(term1378489, term1378489.getClass(), "prefSizeSet", false);
        setField(term1378489, term1378489.getClass(), "maxSize", null);
        setBooleanField(term1378489, term1378489.getClass(), "maxSizeSet", false);
        setField(term1378489, term1378489.getClass(), "componentOrientation", null);
        setBooleanField(term1378489, term1378489.getClass(), "newEventsOnly", false);
        setField(term1378489, term1378489.getClass(), "componentListener", null);
        setField(term1378489, term1378489.getClass(), "focusListener", null);
        setField(term1378489, term1378489.getClass(), "hierarchyListener", null);
        setField(term1378489, term1378489.getClass(), "hierarchyBoundsListener", null);
        setField(term1378489, term1378489.getClass(), "keyListener", null);
        setField(term1378489, term1378489.getClass(), "mouseListener", null);
        setField(term1378489, term1378489.getClass(), "mouseMotionListener", null);
        setField(term1378489, term1378489.getClass(), "mouseWheelListener", null);
        setField(term1378489, term1378489.getClass(), "inputMethodListener", null);
        setLongField(term1378489, term1378489.getClass(), "eventMask", 0L);
        setField(term1378489, term1378489.getClass(), "changeSupport", null);
        setField(term1378489, term1378489.getClass(), "objectLock", null);
        setBooleanField(term1378489, term1378489.getClass(), "isPacked", false);
        setIntField(term1378489, term1378489.getClass(), "boundsOp", 0);
        setField(term1378489, term1378489.getClass(), "compoundShape", null);
        setField(term1378489, term1378489.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1378489, term1378489.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1378489, term1378489.getClass(), "backgroundEraseDisabled", false);
        setField(term1378489, term1378489.getClass(), "eventCache", null);
        setBooleanField(term1378489, term1378489.getClass(), "coalescingEnabled", false);
        setBooleanField(term1378489, term1378489.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1378489, term1378489.getClass(), "componentSerializedDataVersion", 0);
        setField(term1378489, term1378489.getClass(), "accessibleContext", null);
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
        callMethod(klass, "handleOlympicDiplomacyBonus", argTypes, term1378489, args);
    }

};


