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

public class AITurnView_findBestTradePlanet_80444954134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1204341;

    public AITurnView_findBestTradePlanet_80444954134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1204341 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1204341, term1204341.getClass(), "label", null);
        setField(term1204341, term1204341.getClass(), "game", null);
        setIntField(term1204341, term1204341.getClass(), "textAnim", 0);
        setIntField(term1204341, term1204341.getClass(), "cx", 0);
        setIntField(term1204341, term1204341.getClass(), "cy", 0);
        setField(term1204341, term1204341.getClass(), "aiThread", null);
        setBooleanField(term1204341, term1204341.getClass(), "readyToMove", false);
        setField(term1204341, term1204341.getClass(), "nextState", null);
        setField(term1204341, term1204341.getClass(), "nextStateObject", null);
        setBooleanField(term1204341, term1204341.getClass(), "isAlignmentXSet", false);
        setFloatField(term1204341, term1204341.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1204341, term1204341.getClass(), "isAlignmentYSet", false);
        setFloatField(term1204341, term1204341.getClass(), "alignmentY", 0.0F);
        setField(term1204341, term1204341.getClass(), "ui", null);
        setField(term1204341, term1204341.getClass(), "listenerList", null);
        setField(term1204341, term1204341.getClass(), "clientProperties", null);
        setField(term1204341, term1204341.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1204341, term1204341.getClass(), "autoscrolls", false);
        setField(term1204341, term1204341.getClass(), "border", null);
        setIntField(term1204341, term1204341.getClass(), "flags", 0);
        setField(term1204341, term1204341.getClass(), "inputVerifier", null);
        setBooleanField(term1204341, term1204341.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1204341, term1204341.getClass(), "paintingChild", null);
        setField(term1204341, term1204341.getClass(), "popupMenu", null);
        setField(term1204341, term1204341.getClass(), "revalidateRunnableScheduled", null);
        setField(term1204341, term1204341.getClass(), "focusInputMap", null);
        setField(term1204341, term1204341.getClass(), "ancestorInputMap", null);
        setField(term1204341, term1204341.getClass(), "windowInputMap", null);
        setField(term1204341, term1204341.getClass(), "actionMap", null);
        setField(term1204341, term1204341.getClass(), "aaHint", null);
        setField(term1204341, term1204341.getClass(), "lcdRenderingHint", null);
        setField(term1204341, term1204341.getClass(), "component", null);
        setField(term1204341, term1204341.getClass(), "layoutMgr", null);
        setField(term1204341, term1204341.getClass(), "dispatcher", null);
        setField(term1204341, term1204341.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1204341, term1204341.getClass(), "focusCycleRoot", false);
        setBooleanField(term1204341, term1204341.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1204341, term1204341.getClass(), "printingThreads", null);
        setBooleanField(term1204341, term1204341.getClass(), "printing", false);
        setField(term1204341, term1204341.getClass(), "containerListener", null);
        setIntField(term1204341, term1204341.getClass(), "listeningChildren", 0);
        setIntField(term1204341, term1204341.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1204341, term1204341.getClass(), "descendantsCount", 0);
        setField(term1204341, term1204341.getClass(), "preserveBackgroundColor", null);
        setIntField(term1204341, term1204341.getClass(), "numOfHWComponents", 0);
        setIntField(term1204341, term1204341.getClass(), "numOfLWComponents", 0);
        setField(term1204341, term1204341.getClass(), "modalComp", null);
        setField(term1204341, term1204341.getClass(), "modalAppContext", null);
        setIntField(term1204341, term1204341.getClass(), "containerSerializedDataVersion", 0);
        setField(term1204341, term1204341.getClass(), "peer", null);
        setField(term1204341, term1204341.getClass(), "parent", null);
        setField(term1204341, term1204341.getClass(), "appContext", null);
        setIntField(term1204341, term1204341.getClass(), "x", 0);
        setIntField(term1204341, term1204341.getClass(), "y", 0);
        setIntField(term1204341, term1204341.getClass(), "width", 0);
        setIntField(term1204341, term1204341.getClass(), "height", 0);
        setField(term1204341, term1204341.getClass(), "foreground", null);
        setField(term1204341, term1204341.getClass(), "background", null);
        setField(term1204341, term1204341.getClass(), "font", null);
        setField(term1204341, term1204341.getClass(), "peerFont", null);
        setField(term1204341, term1204341.getClass(), "cursor", null);
        setField(term1204341, term1204341.getClass(), "locale", null);
        setField(term1204341, term1204341.getClass(), "graphicsConfig", null);
        setField(term1204341, term1204341.getClass(), "bufferStrategy", null);
        setBooleanField(term1204341, term1204341.getClass(), "ignoreRepaint", false);
        setBooleanField(term1204341, term1204341.getClass(), "visible", false);
        setBooleanField(term1204341, term1204341.getClass(), "enabled", false);
        setBooleanField(term1204341, term1204341.getClass(), "valid", false);
        setField(term1204341, term1204341.getClass(), "dropTarget", null);
        setField(term1204341, term1204341.getClass(), "popups", null);
        setField(term1204341, term1204341.getClass(), "name", null);
        setBooleanField(term1204341, term1204341.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1204341, term1204341.getClass(), "focusable", false);
        setIntField(term1204341, term1204341.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1204341, term1204341.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1204341, term1204341.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1204341, term1204341.getClass(), "acc", null);
        setField(term1204341, term1204341.getClass(), "minSize", null);
        setBooleanField(term1204341, term1204341.getClass(), "minSizeSet", false);
        setField(term1204341, term1204341.getClass(), "prefSize", null);
        setBooleanField(term1204341, term1204341.getClass(), "prefSizeSet", false);
        setField(term1204341, term1204341.getClass(), "maxSize", null);
        setBooleanField(term1204341, term1204341.getClass(), "maxSizeSet", false);
        setField(term1204341, term1204341.getClass(), "componentOrientation", null);
        setBooleanField(term1204341, term1204341.getClass(), "newEventsOnly", false);
        setField(term1204341, term1204341.getClass(), "componentListener", null);
        setField(term1204341, term1204341.getClass(), "focusListener", null);
        setField(term1204341, term1204341.getClass(), "hierarchyListener", null);
        setField(term1204341, term1204341.getClass(), "hierarchyBoundsListener", null);
        setField(term1204341, term1204341.getClass(), "keyListener", null);
        setField(term1204341, term1204341.getClass(), "mouseListener", null);
        setField(term1204341, term1204341.getClass(), "mouseMotionListener", null);
        setField(term1204341, term1204341.getClass(), "mouseWheelListener", null);
        setField(term1204341, term1204341.getClass(), "inputMethodListener", null);
        setLongField(term1204341, term1204341.getClass(), "eventMask", 0L);
        setField(term1204341, term1204341.getClass(), "changeSupport", null);
        setField(term1204341, term1204341.getClass(), "objectLock", null);
        setBooleanField(term1204341, term1204341.getClass(), "isPacked", false);
        setIntField(term1204341, term1204341.getClass(), "boundsOp", 0);
        setField(term1204341, term1204341.getClass(), "compoundShape", null);
        setField(term1204341, term1204341.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1204341, term1204341.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1204341, term1204341.getClass(), "backgroundEraseDisabled", false);
        setField(term1204341, term1204341.getClass(), "eventCache", null);
        setBooleanField(term1204341, term1204341.getClass(), "coalescingEnabled", false);
        setBooleanField(term1204341, term1204341.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1204341, term1204341.getClass(), "componentSerializedDataVersion", 0);
        setField(term1204341, term1204341.getClass(), "accessibleContext", null);
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
        callMethod(klass, "findBestTradePlanet", argTypes, term1204341, args);
    }

};


