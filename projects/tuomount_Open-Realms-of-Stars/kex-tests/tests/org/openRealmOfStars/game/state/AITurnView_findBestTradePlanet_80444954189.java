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

public class AITurnView_findBestTradePlanet_80444954189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1418313;

    public AITurnView_findBestTradePlanet_80444954189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1418313 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1418313, term1418313.getClass(), "label", null);
        setField(term1418313, term1418313.getClass(), "game", null);
        setIntField(term1418313, term1418313.getClass(), "textAnim", 0);
        setIntField(term1418313, term1418313.getClass(), "cx", 0);
        setIntField(term1418313, term1418313.getClass(), "cy", 0);
        setField(term1418313, term1418313.getClass(), "aiThread", null);
        setBooleanField(term1418313, term1418313.getClass(), "readyToMove", false);
        setField(term1418313, term1418313.getClass(), "nextState", null);
        setField(term1418313, term1418313.getClass(), "nextStateObject", null);
        setBooleanField(term1418313, term1418313.getClass(), "isAlignmentXSet", false);
        setFloatField(term1418313, term1418313.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1418313, term1418313.getClass(), "isAlignmentYSet", false);
        setFloatField(term1418313, term1418313.getClass(), "alignmentY", 0.0F);
        setField(term1418313, term1418313.getClass(), "ui", null);
        setField(term1418313, term1418313.getClass(), "listenerList", null);
        setField(term1418313, term1418313.getClass(), "clientProperties", null);
        setField(term1418313, term1418313.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1418313, term1418313.getClass(), "autoscrolls", false);
        setField(term1418313, term1418313.getClass(), "border", null);
        setIntField(term1418313, term1418313.getClass(), "flags", 0);
        setField(term1418313, term1418313.getClass(), "inputVerifier", null);
        setBooleanField(term1418313, term1418313.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1418313, term1418313.getClass(), "paintingChild", null);
        setField(term1418313, term1418313.getClass(), "popupMenu", null);
        setField(term1418313, term1418313.getClass(), "revalidateRunnableScheduled", null);
        setField(term1418313, term1418313.getClass(), "focusInputMap", null);
        setField(term1418313, term1418313.getClass(), "ancestorInputMap", null);
        setField(term1418313, term1418313.getClass(), "windowInputMap", null);
        setField(term1418313, term1418313.getClass(), "actionMap", null);
        setField(term1418313, term1418313.getClass(), "aaHint", null);
        setField(term1418313, term1418313.getClass(), "lcdRenderingHint", null);
        setField(term1418313, term1418313.getClass(), "component", null);
        setField(term1418313, term1418313.getClass(), "layoutMgr", null);
        setField(term1418313, term1418313.getClass(), "dispatcher", null);
        setField(term1418313, term1418313.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1418313, term1418313.getClass(), "focusCycleRoot", false);
        setBooleanField(term1418313, term1418313.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1418313, term1418313.getClass(), "printingThreads", null);
        setBooleanField(term1418313, term1418313.getClass(), "printing", false);
        setField(term1418313, term1418313.getClass(), "containerListener", null);
        setIntField(term1418313, term1418313.getClass(), "listeningChildren", 0);
        setIntField(term1418313, term1418313.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1418313, term1418313.getClass(), "descendantsCount", 0);
        setField(term1418313, term1418313.getClass(), "preserveBackgroundColor", null);
        setIntField(term1418313, term1418313.getClass(), "numOfHWComponents", 0);
        setIntField(term1418313, term1418313.getClass(), "numOfLWComponents", 0);
        setField(term1418313, term1418313.getClass(), "modalComp", null);
        setField(term1418313, term1418313.getClass(), "modalAppContext", null);
        setIntField(term1418313, term1418313.getClass(), "containerSerializedDataVersion", 0);
        setField(term1418313, term1418313.getClass(), "peer", null);
        setField(term1418313, term1418313.getClass(), "parent", null);
        setField(term1418313, term1418313.getClass(), "appContext", null);
        setIntField(term1418313, term1418313.getClass(), "x", 0);
        setIntField(term1418313, term1418313.getClass(), "y", 0);
        setIntField(term1418313, term1418313.getClass(), "width", 0);
        setIntField(term1418313, term1418313.getClass(), "height", 0);
        setField(term1418313, term1418313.getClass(), "foreground", null);
        setField(term1418313, term1418313.getClass(), "background", null);
        setField(term1418313, term1418313.getClass(), "font", null);
        setField(term1418313, term1418313.getClass(), "peerFont", null);
        setField(term1418313, term1418313.getClass(), "cursor", null);
        setField(term1418313, term1418313.getClass(), "locale", null);
        setField(term1418313, term1418313.getClass(), "graphicsConfig", null);
        setField(term1418313, term1418313.getClass(), "bufferStrategy", null);
        setBooleanField(term1418313, term1418313.getClass(), "ignoreRepaint", false);
        setBooleanField(term1418313, term1418313.getClass(), "visible", false);
        setBooleanField(term1418313, term1418313.getClass(), "enabled", false);
        setBooleanField(term1418313, term1418313.getClass(), "valid", false);
        setField(term1418313, term1418313.getClass(), "dropTarget", null);
        setField(term1418313, term1418313.getClass(), "popups", null);
        setField(term1418313, term1418313.getClass(), "name", null);
        setBooleanField(term1418313, term1418313.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1418313, term1418313.getClass(), "focusable", false);
        setIntField(term1418313, term1418313.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1418313, term1418313.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1418313, term1418313.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1418313, term1418313.getClass(), "acc", null);
        setField(term1418313, term1418313.getClass(), "minSize", null);
        setBooleanField(term1418313, term1418313.getClass(), "minSizeSet", false);
        setField(term1418313, term1418313.getClass(), "prefSize", null);
        setBooleanField(term1418313, term1418313.getClass(), "prefSizeSet", false);
        setField(term1418313, term1418313.getClass(), "maxSize", null);
        setBooleanField(term1418313, term1418313.getClass(), "maxSizeSet", false);
        setField(term1418313, term1418313.getClass(), "componentOrientation", null);
        setBooleanField(term1418313, term1418313.getClass(), "newEventsOnly", false);
        setField(term1418313, term1418313.getClass(), "componentListener", null);
        setField(term1418313, term1418313.getClass(), "focusListener", null);
        setField(term1418313, term1418313.getClass(), "hierarchyListener", null);
        setField(term1418313, term1418313.getClass(), "hierarchyBoundsListener", null);
        setField(term1418313, term1418313.getClass(), "keyListener", null);
        setField(term1418313, term1418313.getClass(), "mouseListener", null);
        setField(term1418313, term1418313.getClass(), "mouseMotionListener", null);
        setField(term1418313, term1418313.getClass(), "mouseWheelListener", null);
        setField(term1418313, term1418313.getClass(), "inputMethodListener", null);
        setLongField(term1418313, term1418313.getClass(), "eventMask", 0L);
        setField(term1418313, term1418313.getClass(), "changeSupport", null);
        setField(term1418313, term1418313.getClass(), "objectLock", null);
        setBooleanField(term1418313, term1418313.getClass(), "isPacked", false);
        setIntField(term1418313, term1418313.getClass(), "boundsOp", 0);
        setField(term1418313, term1418313.getClass(), "compoundShape", null);
        setField(term1418313, term1418313.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1418313, term1418313.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1418313, term1418313.getClass(), "backgroundEraseDisabled", false);
        setField(term1418313, term1418313.getClass(), "eventCache", null);
        setBooleanField(term1418313, term1418313.getClass(), "coalescingEnabled", false);
        setBooleanField(term1418313, term1418313.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1418313, term1418313.getClass(), "componentSerializedDataVersion", 0);
        setField(term1418313, term1418313.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "findBestTradePlanet", argTypes, term1418313, args);
    }

};


