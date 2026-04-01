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

public class AITurnView_handleOlympicDiplomacyBonus_769681666100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1418808;

    public AITurnView_handleOlympicDiplomacyBonus_769681666100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1418808 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1418808, term1418808.getClass(), "label", null);
        setField(term1418808, term1418808.getClass(), "game", null);
        setIntField(term1418808, term1418808.getClass(), "textAnim", 0);
        setIntField(term1418808, term1418808.getClass(), "cx", 0);
        setIntField(term1418808, term1418808.getClass(), "cy", 0);
        setField(term1418808, term1418808.getClass(), "aiThread", null);
        setBooleanField(term1418808, term1418808.getClass(), "readyToMove", false);
        setField(term1418808, term1418808.getClass(), "nextState", null);
        setField(term1418808, term1418808.getClass(), "nextStateObject", null);
        setBooleanField(term1418808, term1418808.getClass(), "isAlignmentXSet", false);
        setFloatField(term1418808, term1418808.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1418808, term1418808.getClass(), "isAlignmentYSet", false);
        setFloatField(term1418808, term1418808.getClass(), "alignmentY", 0.0F);
        setField(term1418808, term1418808.getClass(), "ui", null);
        setField(term1418808, term1418808.getClass(), "listenerList", null);
        setField(term1418808, term1418808.getClass(), "clientProperties", null);
        setField(term1418808, term1418808.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1418808, term1418808.getClass(), "autoscrolls", false);
        setField(term1418808, term1418808.getClass(), "border", null);
        setIntField(term1418808, term1418808.getClass(), "flags", 0);
        setField(term1418808, term1418808.getClass(), "inputVerifier", null);
        setBooleanField(term1418808, term1418808.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1418808, term1418808.getClass(), "paintingChild", null);
        setField(term1418808, term1418808.getClass(), "popupMenu", null);
        setField(term1418808, term1418808.getClass(), "revalidateRunnableScheduled", null);
        setField(term1418808, term1418808.getClass(), "focusInputMap", null);
        setField(term1418808, term1418808.getClass(), "ancestorInputMap", null);
        setField(term1418808, term1418808.getClass(), "windowInputMap", null);
        setField(term1418808, term1418808.getClass(), "actionMap", null);
        setField(term1418808, term1418808.getClass(), "aaHint", null);
        setField(term1418808, term1418808.getClass(), "lcdRenderingHint", null);
        setField(term1418808, term1418808.getClass(), "component", null);
        setField(term1418808, term1418808.getClass(), "layoutMgr", null);
        setField(term1418808, term1418808.getClass(), "dispatcher", null);
        setField(term1418808, term1418808.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1418808, term1418808.getClass(), "focusCycleRoot", false);
        setBooleanField(term1418808, term1418808.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1418808, term1418808.getClass(), "printingThreads", null);
        setBooleanField(term1418808, term1418808.getClass(), "printing", false);
        setField(term1418808, term1418808.getClass(), "containerListener", null);
        setIntField(term1418808, term1418808.getClass(), "listeningChildren", 0);
        setIntField(term1418808, term1418808.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1418808, term1418808.getClass(), "descendantsCount", 0);
        setField(term1418808, term1418808.getClass(), "preserveBackgroundColor", null);
        setIntField(term1418808, term1418808.getClass(), "numOfHWComponents", 0);
        setIntField(term1418808, term1418808.getClass(), "numOfLWComponents", 0);
        setField(term1418808, term1418808.getClass(), "modalComp", null);
        setField(term1418808, term1418808.getClass(), "modalAppContext", null);
        setIntField(term1418808, term1418808.getClass(), "containerSerializedDataVersion", 0);
        setField(term1418808, term1418808.getClass(), "peer", null);
        setField(term1418808, term1418808.getClass(), "parent", null);
        setField(term1418808, term1418808.getClass(), "appContext", null);
        setIntField(term1418808, term1418808.getClass(), "x", 0);
        setIntField(term1418808, term1418808.getClass(), "y", 0);
        setIntField(term1418808, term1418808.getClass(), "width", 0);
        setIntField(term1418808, term1418808.getClass(), "height", 0);
        setField(term1418808, term1418808.getClass(), "foreground", null);
        setField(term1418808, term1418808.getClass(), "background", null);
        setField(term1418808, term1418808.getClass(), "font", null);
        setField(term1418808, term1418808.getClass(), "peerFont", null);
        setField(term1418808, term1418808.getClass(), "cursor", null);
        setField(term1418808, term1418808.getClass(), "locale", null);
        setField(term1418808, term1418808.getClass(), "graphicsConfig", null);
        setField(term1418808, term1418808.getClass(), "bufferStrategy", null);
        setBooleanField(term1418808, term1418808.getClass(), "ignoreRepaint", false);
        setBooleanField(term1418808, term1418808.getClass(), "visible", false);
        setBooleanField(term1418808, term1418808.getClass(), "enabled", false);
        setBooleanField(term1418808, term1418808.getClass(), "valid", false);
        setField(term1418808, term1418808.getClass(), "dropTarget", null);
        setField(term1418808, term1418808.getClass(), "popups", null);
        setField(term1418808, term1418808.getClass(), "name", null);
        setBooleanField(term1418808, term1418808.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1418808, term1418808.getClass(), "focusable", false);
        setIntField(term1418808, term1418808.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1418808, term1418808.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1418808, term1418808.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1418808, term1418808.getClass(), "acc", null);
        setField(term1418808, term1418808.getClass(), "minSize", null);
        setBooleanField(term1418808, term1418808.getClass(), "minSizeSet", false);
        setField(term1418808, term1418808.getClass(), "prefSize", null);
        setBooleanField(term1418808, term1418808.getClass(), "prefSizeSet", false);
        setField(term1418808, term1418808.getClass(), "maxSize", null);
        setBooleanField(term1418808, term1418808.getClass(), "maxSizeSet", false);
        setField(term1418808, term1418808.getClass(), "componentOrientation", null);
        setBooleanField(term1418808, term1418808.getClass(), "newEventsOnly", false);
        setField(term1418808, term1418808.getClass(), "componentListener", null);
        setField(term1418808, term1418808.getClass(), "focusListener", null);
        setField(term1418808, term1418808.getClass(), "hierarchyListener", null);
        setField(term1418808, term1418808.getClass(), "hierarchyBoundsListener", null);
        setField(term1418808, term1418808.getClass(), "keyListener", null);
        setField(term1418808, term1418808.getClass(), "mouseListener", null);
        setField(term1418808, term1418808.getClass(), "mouseMotionListener", null);
        setField(term1418808, term1418808.getClass(), "mouseWheelListener", null);
        setField(term1418808, term1418808.getClass(), "inputMethodListener", null);
        setLongField(term1418808, term1418808.getClass(), "eventMask", 0L);
        setField(term1418808, term1418808.getClass(), "changeSupport", null);
        setField(term1418808, term1418808.getClass(), "objectLock", null);
        setBooleanField(term1418808, term1418808.getClass(), "isPacked", false);
        setIntField(term1418808, term1418808.getClass(), "boundsOp", 0);
        setField(term1418808, term1418808.getClass(), "compoundShape", null);
        setField(term1418808, term1418808.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1418808, term1418808.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1418808, term1418808.getClass(), "backgroundEraseDisabled", false);
        setField(term1418808, term1418808.getClass(), "eventCache", null);
        setBooleanField(term1418808, term1418808.getClass(), "coalescingEnabled", false);
        setBooleanField(term1418808, term1418808.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1418808, term1418808.getClass(), "componentSerializedDataVersion", 0);
        setField(term1418808, term1418808.getClass(), "accessibleContext", null);
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
        callMethod(klass, "handleOlympicDiplomacyBonus", argTypes, term1418808, args);
    }

};


