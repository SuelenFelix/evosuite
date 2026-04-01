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

public class AITurnView_updateSinglePirateTech_91373319094 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1418538;

    public AITurnView_updateSinglePirateTech_91373319094() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1418538 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1418538, term1418538.getClass(), "label", null);
        setField(term1418538, term1418538.getClass(), "game", null);
        setIntField(term1418538, term1418538.getClass(), "textAnim", 0);
        setIntField(term1418538, term1418538.getClass(), "cx", 0);
        setIntField(term1418538, term1418538.getClass(), "cy", 0);
        setField(term1418538, term1418538.getClass(), "aiThread", null);
        setBooleanField(term1418538, term1418538.getClass(), "readyToMove", false);
        setField(term1418538, term1418538.getClass(), "nextState", null);
        setField(term1418538, term1418538.getClass(), "nextStateObject", null);
        setBooleanField(term1418538, term1418538.getClass(), "isAlignmentXSet", false);
        setFloatField(term1418538, term1418538.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1418538, term1418538.getClass(), "isAlignmentYSet", false);
        setFloatField(term1418538, term1418538.getClass(), "alignmentY", 0.0F);
        setField(term1418538, term1418538.getClass(), "ui", null);
        setField(term1418538, term1418538.getClass(), "listenerList", null);
        setField(term1418538, term1418538.getClass(), "clientProperties", null);
        setField(term1418538, term1418538.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1418538, term1418538.getClass(), "autoscrolls", false);
        setField(term1418538, term1418538.getClass(), "border", null);
        setIntField(term1418538, term1418538.getClass(), "flags", 0);
        setField(term1418538, term1418538.getClass(), "inputVerifier", null);
        setBooleanField(term1418538, term1418538.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1418538, term1418538.getClass(), "paintingChild", null);
        setField(term1418538, term1418538.getClass(), "popupMenu", null);
        setField(term1418538, term1418538.getClass(), "revalidateRunnableScheduled", null);
        setField(term1418538, term1418538.getClass(), "focusInputMap", null);
        setField(term1418538, term1418538.getClass(), "ancestorInputMap", null);
        setField(term1418538, term1418538.getClass(), "windowInputMap", null);
        setField(term1418538, term1418538.getClass(), "actionMap", null);
        setField(term1418538, term1418538.getClass(), "aaHint", null);
        setField(term1418538, term1418538.getClass(), "lcdRenderingHint", null);
        setField(term1418538, term1418538.getClass(), "component", null);
        setField(term1418538, term1418538.getClass(), "layoutMgr", null);
        setField(term1418538, term1418538.getClass(), "dispatcher", null);
        setField(term1418538, term1418538.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1418538, term1418538.getClass(), "focusCycleRoot", false);
        setBooleanField(term1418538, term1418538.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1418538, term1418538.getClass(), "printingThreads", null);
        setBooleanField(term1418538, term1418538.getClass(), "printing", false);
        setField(term1418538, term1418538.getClass(), "containerListener", null);
        setIntField(term1418538, term1418538.getClass(), "listeningChildren", 0);
        setIntField(term1418538, term1418538.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1418538, term1418538.getClass(), "descendantsCount", 0);
        setField(term1418538, term1418538.getClass(), "preserveBackgroundColor", null);
        setIntField(term1418538, term1418538.getClass(), "numOfHWComponents", 0);
        setIntField(term1418538, term1418538.getClass(), "numOfLWComponents", 0);
        setField(term1418538, term1418538.getClass(), "modalComp", null);
        setField(term1418538, term1418538.getClass(), "modalAppContext", null);
        setIntField(term1418538, term1418538.getClass(), "containerSerializedDataVersion", 0);
        setField(term1418538, term1418538.getClass(), "peer", null);
        setField(term1418538, term1418538.getClass(), "parent", null);
        setField(term1418538, term1418538.getClass(), "appContext", null);
        setIntField(term1418538, term1418538.getClass(), "x", 0);
        setIntField(term1418538, term1418538.getClass(), "y", 0);
        setIntField(term1418538, term1418538.getClass(), "width", 0);
        setIntField(term1418538, term1418538.getClass(), "height", 0);
        setField(term1418538, term1418538.getClass(), "foreground", null);
        setField(term1418538, term1418538.getClass(), "background", null);
        setField(term1418538, term1418538.getClass(), "font", null);
        setField(term1418538, term1418538.getClass(), "peerFont", null);
        setField(term1418538, term1418538.getClass(), "cursor", null);
        setField(term1418538, term1418538.getClass(), "locale", null);
        setField(term1418538, term1418538.getClass(), "graphicsConfig", null);
        setField(term1418538, term1418538.getClass(), "bufferStrategy", null);
        setBooleanField(term1418538, term1418538.getClass(), "ignoreRepaint", false);
        setBooleanField(term1418538, term1418538.getClass(), "visible", false);
        setBooleanField(term1418538, term1418538.getClass(), "enabled", false);
        setBooleanField(term1418538, term1418538.getClass(), "valid", false);
        setField(term1418538, term1418538.getClass(), "dropTarget", null);
        setField(term1418538, term1418538.getClass(), "popups", null);
        setField(term1418538, term1418538.getClass(), "name", null);
        setBooleanField(term1418538, term1418538.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1418538, term1418538.getClass(), "focusable", false);
        setIntField(term1418538, term1418538.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1418538, term1418538.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1418538, term1418538.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1418538, term1418538.getClass(), "acc", null);
        setField(term1418538, term1418538.getClass(), "minSize", null);
        setBooleanField(term1418538, term1418538.getClass(), "minSizeSet", false);
        setField(term1418538, term1418538.getClass(), "prefSize", null);
        setBooleanField(term1418538, term1418538.getClass(), "prefSizeSet", false);
        setField(term1418538, term1418538.getClass(), "maxSize", null);
        setBooleanField(term1418538, term1418538.getClass(), "maxSizeSet", false);
        setField(term1418538, term1418538.getClass(), "componentOrientation", null);
        setBooleanField(term1418538, term1418538.getClass(), "newEventsOnly", false);
        setField(term1418538, term1418538.getClass(), "componentListener", null);
        setField(term1418538, term1418538.getClass(), "focusListener", null);
        setField(term1418538, term1418538.getClass(), "hierarchyListener", null);
        setField(term1418538, term1418538.getClass(), "hierarchyBoundsListener", null);
        setField(term1418538, term1418538.getClass(), "keyListener", null);
        setField(term1418538, term1418538.getClass(), "mouseListener", null);
        setField(term1418538, term1418538.getClass(), "mouseMotionListener", null);
        setField(term1418538, term1418538.getClass(), "mouseWheelListener", null);
        setField(term1418538, term1418538.getClass(), "inputMethodListener", null);
        setLongField(term1418538, term1418538.getClass(), "eventMask", 0L);
        setField(term1418538, term1418538.getClass(), "changeSupport", null);
        setField(term1418538, term1418538.getClass(), "objectLock", null);
        setBooleanField(term1418538, term1418538.getClass(), "isPacked", false);
        setIntField(term1418538, term1418538.getClass(), "boundsOp", 0);
        setField(term1418538, term1418538.getClass(), "compoundShape", null);
        setField(term1418538, term1418538.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1418538, term1418538.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1418538, term1418538.getClass(), "backgroundEraseDisabled", false);
        setField(term1418538, term1418538.getClass(), "eventCache", null);
        setBooleanField(term1418538, term1418538.getClass(), "coalescingEnabled", false);
        setBooleanField(term1418538, term1418538.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1418538, term1418538.getClass(), "componentSerializedDataVersion", 0);
        setField(term1418538, term1418538.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.PirateDifficultLevel");
        argTypes[2] = Class.forName("org.openRealmOfStars.player.tech.TechType");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "updateSinglePirateTech", argTypes, term1418538, args);
    }

};


