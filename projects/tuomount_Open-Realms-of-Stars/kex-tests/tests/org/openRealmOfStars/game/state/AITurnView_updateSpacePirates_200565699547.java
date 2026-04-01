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

public class AITurnView_updateSpacePirates_200565699547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1307479;
     Object term1307524;

    public AITurnView_updateSpacePirates_200565699547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1307479 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1307479, term1307479.getClass(), "label", null);
        setField(term1307479, term1307479.getClass(), "game", null);
        setIntField(term1307479, term1307479.getClass(), "textAnim", 0);
        setIntField(term1307479, term1307479.getClass(), "cx", 0);
        setIntField(term1307479, term1307479.getClass(), "cy", 0);
        setField(term1307479, term1307479.getClass(), "aiThread", null);
        setBooleanField(term1307479, term1307479.getClass(), "readyToMove", false);
        setField(term1307479, term1307479.getClass(), "nextState", null);
        setField(term1307479, term1307479.getClass(), "nextStateObject", null);
        setBooleanField(term1307479, term1307479.getClass(), "isAlignmentXSet", false);
        setFloatField(term1307479, term1307479.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1307479, term1307479.getClass(), "isAlignmentYSet", false);
        setFloatField(term1307479, term1307479.getClass(), "alignmentY", 0.0F);
        setField(term1307479, term1307479.getClass(), "ui", null);
        setField(term1307479, term1307479.getClass(), "listenerList", null);
        setField(term1307479, term1307479.getClass(), "clientProperties", null);
        setField(term1307479, term1307479.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1307479, term1307479.getClass(), "autoscrolls", false);
        setField(term1307479, term1307479.getClass(), "border", null);
        setIntField(term1307479, term1307479.getClass(), "flags", 0);
        setField(term1307479, term1307479.getClass(), "inputVerifier", null);
        setBooleanField(term1307479, term1307479.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1307479, term1307479.getClass(), "paintingChild", null);
        setField(term1307479, term1307479.getClass(), "popupMenu", null);
        setField(term1307479, term1307479.getClass(), "revalidateRunnableScheduled", null);
        setField(term1307479, term1307479.getClass(), "focusInputMap", null);
        setField(term1307479, term1307479.getClass(), "ancestorInputMap", null);
        setField(term1307479, term1307479.getClass(), "windowInputMap", null);
        setField(term1307479, term1307479.getClass(), "actionMap", null);
        setField(term1307479, term1307479.getClass(), "aaHint", null);
        setField(term1307479, term1307479.getClass(), "lcdRenderingHint", null);
        setField(term1307479, term1307479.getClass(), "component", null);
        setField(term1307479, term1307479.getClass(), "layoutMgr", null);
        setField(term1307479, term1307479.getClass(), "dispatcher", null);
        setField(term1307479, term1307479.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1307479, term1307479.getClass(), "focusCycleRoot", false);
        setBooleanField(term1307479, term1307479.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1307479, term1307479.getClass(), "printingThreads", null);
        setBooleanField(term1307479, term1307479.getClass(), "printing", false);
        setField(term1307479, term1307479.getClass(), "containerListener", null);
        setIntField(term1307479, term1307479.getClass(), "listeningChildren", 0);
        setIntField(term1307479, term1307479.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1307479, term1307479.getClass(), "descendantsCount", 0);
        setField(term1307479, term1307479.getClass(), "preserveBackgroundColor", null);
        setIntField(term1307479, term1307479.getClass(), "numOfHWComponents", 0);
        setIntField(term1307479, term1307479.getClass(), "numOfLWComponents", 0);
        setField(term1307479, term1307479.getClass(), "modalComp", null);
        setField(term1307479, term1307479.getClass(), "modalAppContext", null);
        setIntField(term1307479, term1307479.getClass(), "containerSerializedDataVersion", 0);
        setField(term1307479, term1307479.getClass(), "peer", null);
        setField(term1307479, term1307479.getClass(), "parent", null);
        setField(term1307479, term1307479.getClass(), "appContext", null);
        setIntField(term1307479, term1307479.getClass(), "x", 0);
        setIntField(term1307479, term1307479.getClass(), "y", 0);
        setIntField(term1307479, term1307479.getClass(), "width", 0);
        setIntField(term1307479, term1307479.getClass(), "height", 0);
        setField(term1307479, term1307479.getClass(), "foreground", null);
        setField(term1307479, term1307479.getClass(), "background", null);
        setField(term1307479, term1307479.getClass(), "font", null);
        setField(term1307479, term1307479.getClass(), "peerFont", null);
        setField(term1307479, term1307479.getClass(), "cursor", null);
        setField(term1307479, term1307479.getClass(), "locale", null);
        setField(term1307479, term1307479.getClass(), "graphicsConfig", null);
        setField(term1307479, term1307479.getClass(), "bufferStrategy", null);
        setBooleanField(term1307479, term1307479.getClass(), "ignoreRepaint", false);
        setBooleanField(term1307479, term1307479.getClass(), "visible", false);
        setBooleanField(term1307479, term1307479.getClass(), "enabled", false);
        setBooleanField(term1307479, term1307479.getClass(), "valid", false);
        setField(term1307479, term1307479.getClass(), "dropTarget", null);
        setField(term1307479, term1307479.getClass(), "popups", null);
        setField(term1307479, term1307479.getClass(), "name", null);
        setBooleanField(term1307479, term1307479.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1307479, term1307479.getClass(), "focusable", false);
        setIntField(term1307479, term1307479.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1307479, term1307479.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1307479, term1307479.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1307479, term1307479.getClass(), "acc", null);
        setField(term1307479, term1307479.getClass(), "minSize", null);
        setBooleanField(term1307479, term1307479.getClass(), "minSizeSet", false);
        setField(term1307479, term1307479.getClass(), "prefSize", null);
        setBooleanField(term1307479, term1307479.getClass(), "prefSizeSet", false);
        setField(term1307479, term1307479.getClass(), "maxSize", null);
        setBooleanField(term1307479, term1307479.getClass(), "maxSizeSet", false);
        setField(term1307479, term1307479.getClass(), "componentOrientation", null);
        setBooleanField(term1307479, term1307479.getClass(), "newEventsOnly", false);
        setField(term1307479, term1307479.getClass(), "componentListener", null);
        setField(term1307479, term1307479.getClass(), "focusListener", null);
        setField(term1307479, term1307479.getClass(), "hierarchyListener", null);
        setField(term1307479, term1307479.getClass(), "hierarchyBoundsListener", null);
        setField(term1307479, term1307479.getClass(), "keyListener", null);
        setField(term1307479, term1307479.getClass(), "mouseListener", null);
        setField(term1307479, term1307479.getClass(), "mouseMotionListener", null);
        setField(term1307479, term1307479.getClass(), "mouseWheelListener", null);
        setField(term1307479, term1307479.getClass(), "inputMethodListener", null);
        setLongField(term1307479, term1307479.getClass(), "eventMask", 0L);
        setField(term1307479, term1307479.getClass(), "changeSupport", null);
        setField(term1307479, term1307479.getClass(), "objectLock", null);
        setBooleanField(term1307479, term1307479.getClass(), "isPacked", false);
        setIntField(term1307479, term1307479.getClass(), "boundsOp", 0);
        setField(term1307479, term1307479.getClass(), "compoundShape", null);
        setField(term1307479, term1307479.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1307479, term1307479.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1307479, term1307479.getClass(), "backgroundEraseDisabled", false);
        setField(term1307479, term1307479.getClass(), "eventCache", null);
        setBooleanField(term1307479, term1307479.getClass(), "coalescingEnabled", false);
        setBooleanField(term1307479, term1307479.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1307479, term1307479.getClass(), "componentSerializedDataVersion", 0);
        setField(term1307479, term1307479.getClass(), "accessibleContext", null);
        term1307524 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.PirateDifficultLevel");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term1307524;
        callMethod(klass, "updateSpacePirates", argTypes, term1307479, args);
    }

};


