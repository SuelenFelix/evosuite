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
import java.lang.Boolean;

public class AITurnView_updateSpacePirates_200565798745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1298984;
     Object term1299029;

    public AITurnView_updateSpacePirates_200565798745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1298984 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1298984, term1298984.getClass(), "label", null);
        setField(term1298984, term1298984.getClass(), "game", null);
        setIntField(term1298984, term1298984.getClass(), "textAnim", 0);
        setIntField(term1298984, term1298984.getClass(), "cx", 0);
        setIntField(term1298984, term1298984.getClass(), "cy", 0);
        setField(term1298984, term1298984.getClass(), "aiThread", null);
        setBooleanField(term1298984, term1298984.getClass(), "readyToMove", false);
        setField(term1298984, term1298984.getClass(), "nextState", null);
        setField(term1298984, term1298984.getClass(), "nextStateObject", null);
        setBooleanField(term1298984, term1298984.getClass(), "isAlignmentXSet", false);
        setFloatField(term1298984, term1298984.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1298984, term1298984.getClass(), "isAlignmentYSet", false);
        setFloatField(term1298984, term1298984.getClass(), "alignmentY", 0.0F);
        setField(term1298984, term1298984.getClass(), "ui", null);
        setField(term1298984, term1298984.getClass(), "listenerList", null);
        setField(term1298984, term1298984.getClass(), "clientProperties", null);
        setField(term1298984, term1298984.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1298984, term1298984.getClass(), "autoscrolls", false);
        setField(term1298984, term1298984.getClass(), "border", null);
        setIntField(term1298984, term1298984.getClass(), "flags", 0);
        setField(term1298984, term1298984.getClass(), "inputVerifier", null);
        setBooleanField(term1298984, term1298984.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1298984, term1298984.getClass(), "paintingChild", null);
        setField(term1298984, term1298984.getClass(), "popupMenu", null);
        setField(term1298984, term1298984.getClass(), "revalidateRunnableScheduled", null);
        setField(term1298984, term1298984.getClass(), "focusInputMap", null);
        setField(term1298984, term1298984.getClass(), "ancestorInputMap", null);
        setField(term1298984, term1298984.getClass(), "windowInputMap", null);
        setField(term1298984, term1298984.getClass(), "actionMap", null);
        setField(term1298984, term1298984.getClass(), "aaHint", null);
        setField(term1298984, term1298984.getClass(), "lcdRenderingHint", null);
        setField(term1298984, term1298984.getClass(), "component", null);
        setField(term1298984, term1298984.getClass(), "layoutMgr", null);
        setField(term1298984, term1298984.getClass(), "dispatcher", null);
        setField(term1298984, term1298984.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1298984, term1298984.getClass(), "focusCycleRoot", false);
        setBooleanField(term1298984, term1298984.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1298984, term1298984.getClass(), "printingThreads", null);
        setBooleanField(term1298984, term1298984.getClass(), "printing", false);
        setField(term1298984, term1298984.getClass(), "containerListener", null);
        setIntField(term1298984, term1298984.getClass(), "listeningChildren", 0);
        setIntField(term1298984, term1298984.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1298984, term1298984.getClass(), "descendantsCount", 0);
        setField(term1298984, term1298984.getClass(), "preserveBackgroundColor", null);
        setIntField(term1298984, term1298984.getClass(), "numOfHWComponents", 0);
        setIntField(term1298984, term1298984.getClass(), "numOfLWComponents", 0);
        setField(term1298984, term1298984.getClass(), "modalComp", null);
        setField(term1298984, term1298984.getClass(), "modalAppContext", null);
        setIntField(term1298984, term1298984.getClass(), "containerSerializedDataVersion", 0);
        setField(term1298984, term1298984.getClass(), "peer", null);
        setField(term1298984, term1298984.getClass(), "parent", null);
        setField(term1298984, term1298984.getClass(), "appContext", null);
        setIntField(term1298984, term1298984.getClass(), "x", 0);
        setIntField(term1298984, term1298984.getClass(), "y", 0);
        setIntField(term1298984, term1298984.getClass(), "width", 0);
        setIntField(term1298984, term1298984.getClass(), "height", 0);
        setField(term1298984, term1298984.getClass(), "foreground", null);
        setField(term1298984, term1298984.getClass(), "background", null);
        setField(term1298984, term1298984.getClass(), "font", null);
        setField(term1298984, term1298984.getClass(), "peerFont", null);
        setField(term1298984, term1298984.getClass(), "cursor", null);
        setField(term1298984, term1298984.getClass(), "locale", null);
        setField(term1298984, term1298984.getClass(), "graphicsConfig", null);
        setField(term1298984, term1298984.getClass(), "bufferStrategy", null);
        setBooleanField(term1298984, term1298984.getClass(), "ignoreRepaint", false);
        setBooleanField(term1298984, term1298984.getClass(), "visible", false);
        setBooleanField(term1298984, term1298984.getClass(), "enabled", false);
        setBooleanField(term1298984, term1298984.getClass(), "valid", false);
        setField(term1298984, term1298984.getClass(), "dropTarget", null);
        setField(term1298984, term1298984.getClass(), "popups", null);
        setField(term1298984, term1298984.getClass(), "name", null);
        setBooleanField(term1298984, term1298984.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1298984, term1298984.getClass(), "focusable", false);
        setIntField(term1298984, term1298984.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1298984, term1298984.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1298984, term1298984.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1298984, term1298984.getClass(), "acc", null);
        setField(term1298984, term1298984.getClass(), "minSize", null);
        setBooleanField(term1298984, term1298984.getClass(), "minSizeSet", false);
        setField(term1298984, term1298984.getClass(), "prefSize", null);
        setBooleanField(term1298984, term1298984.getClass(), "prefSizeSet", false);
        setField(term1298984, term1298984.getClass(), "maxSize", null);
        setBooleanField(term1298984, term1298984.getClass(), "maxSizeSet", false);
        setField(term1298984, term1298984.getClass(), "componentOrientation", null);
        setBooleanField(term1298984, term1298984.getClass(), "newEventsOnly", false);
        setField(term1298984, term1298984.getClass(), "componentListener", null);
        setField(term1298984, term1298984.getClass(), "focusListener", null);
        setField(term1298984, term1298984.getClass(), "hierarchyListener", null);
        setField(term1298984, term1298984.getClass(), "hierarchyBoundsListener", null);
        setField(term1298984, term1298984.getClass(), "keyListener", null);
        setField(term1298984, term1298984.getClass(), "mouseListener", null);
        setField(term1298984, term1298984.getClass(), "mouseMotionListener", null);
        setField(term1298984, term1298984.getClass(), "mouseWheelListener", null);
        setField(term1298984, term1298984.getClass(), "inputMethodListener", null);
        setLongField(term1298984, term1298984.getClass(), "eventMask", 0L);
        setField(term1298984, term1298984.getClass(), "changeSupport", null);
        setField(term1298984, term1298984.getClass(), "objectLock", null);
        setBooleanField(term1298984, term1298984.getClass(), "isPacked", false);
        setIntField(term1298984, term1298984.getClass(), "boundsOp", 0);
        setField(term1298984, term1298984.getClass(), "compoundShape", null);
        setField(term1298984, term1298984.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1298984, term1298984.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1298984, term1298984.getClass(), "backgroundEraseDisabled", false);
        setField(term1298984, term1298984.getClass(), "eventCache", null);
        setBooleanField(term1298984, term1298984.getClass(), "coalescingEnabled", false);
        setBooleanField(term1298984, term1298984.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1298984, term1298984.getClass(), "componentSerializedDataVersion", 0);
        setField(term1298984, term1298984.getClass(), "accessibleContext", null);
        term1299029 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.PirateDifficultLevel");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term1299029;
        callMethod(klass, "updateSpacePirates", argTypes, term1298984, args);
    }

};


