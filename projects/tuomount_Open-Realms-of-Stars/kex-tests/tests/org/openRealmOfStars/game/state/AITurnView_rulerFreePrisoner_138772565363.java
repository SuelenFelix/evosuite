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

public class AITurnView_rulerFreePrisoner_138772565363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1339788;

    public AITurnView_rulerFreePrisoner_138772565363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1339788 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1339788, term1339788.getClass(), "label", null);
        setField(term1339788, term1339788.getClass(), "game", null);
        setIntField(term1339788, term1339788.getClass(), "textAnim", 0);
        setIntField(term1339788, term1339788.getClass(), "cx", 0);
        setIntField(term1339788, term1339788.getClass(), "cy", 0);
        setField(term1339788, term1339788.getClass(), "aiThread", null);
        setBooleanField(term1339788, term1339788.getClass(), "readyToMove", false);
        setField(term1339788, term1339788.getClass(), "nextState", null);
        setField(term1339788, term1339788.getClass(), "nextStateObject", null);
        setBooleanField(term1339788, term1339788.getClass(), "isAlignmentXSet", false);
        setFloatField(term1339788, term1339788.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1339788, term1339788.getClass(), "isAlignmentYSet", false);
        setFloatField(term1339788, term1339788.getClass(), "alignmentY", 0.0F);
        setField(term1339788, term1339788.getClass(), "ui", null);
        setField(term1339788, term1339788.getClass(), "listenerList", null);
        setField(term1339788, term1339788.getClass(), "clientProperties", null);
        setField(term1339788, term1339788.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1339788, term1339788.getClass(), "autoscrolls", false);
        setField(term1339788, term1339788.getClass(), "border", null);
        setIntField(term1339788, term1339788.getClass(), "flags", 0);
        setField(term1339788, term1339788.getClass(), "inputVerifier", null);
        setBooleanField(term1339788, term1339788.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1339788, term1339788.getClass(), "paintingChild", null);
        setField(term1339788, term1339788.getClass(), "popupMenu", null);
        setField(term1339788, term1339788.getClass(), "revalidateRunnableScheduled", null);
        setField(term1339788, term1339788.getClass(), "focusInputMap", null);
        setField(term1339788, term1339788.getClass(), "ancestorInputMap", null);
        setField(term1339788, term1339788.getClass(), "windowInputMap", null);
        setField(term1339788, term1339788.getClass(), "actionMap", null);
        setField(term1339788, term1339788.getClass(), "aaHint", null);
        setField(term1339788, term1339788.getClass(), "lcdRenderingHint", null);
        setField(term1339788, term1339788.getClass(), "component", null);
        setField(term1339788, term1339788.getClass(), "layoutMgr", null);
        setField(term1339788, term1339788.getClass(), "dispatcher", null);
        setField(term1339788, term1339788.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1339788, term1339788.getClass(), "focusCycleRoot", false);
        setBooleanField(term1339788, term1339788.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1339788, term1339788.getClass(), "printingThreads", null);
        setBooleanField(term1339788, term1339788.getClass(), "printing", false);
        setField(term1339788, term1339788.getClass(), "containerListener", null);
        setIntField(term1339788, term1339788.getClass(), "listeningChildren", 0);
        setIntField(term1339788, term1339788.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1339788, term1339788.getClass(), "descendantsCount", 0);
        setField(term1339788, term1339788.getClass(), "preserveBackgroundColor", null);
        setIntField(term1339788, term1339788.getClass(), "numOfHWComponents", 0);
        setIntField(term1339788, term1339788.getClass(), "numOfLWComponents", 0);
        setField(term1339788, term1339788.getClass(), "modalComp", null);
        setField(term1339788, term1339788.getClass(), "modalAppContext", null);
        setIntField(term1339788, term1339788.getClass(), "containerSerializedDataVersion", 0);
        setField(term1339788, term1339788.getClass(), "peer", null);
        setField(term1339788, term1339788.getClass(), "parent", null);
        setField(term1339788, term1339788.getClass(), "appContext", null);
        setIntField(term1339788, term1339788.getClass(), "x", 0);
        setIntField(term1339788, term1339788.getClass(), "y", 0);
        setIntField(term1339788, term1339788.getClass(), "width", 0);
        setIntField(term1339788, term1339788.getClass(), "height", 0);
        setField(term1339788, term1339788.getClass(), "foreground", null);
        setField(term1339788, term1339788.getClass(), "background", null);
        setField(term1339788, term1339788.getClass(), "font", null);
        setField(term1339788, term1339788.getClass(), "peerFont", null);
        setField(term1339788, term1339788.getClass(), "cursor", null);
        setField(term1339788, term1339788.getClass(), "locale", null);
        setField(term1339788, term1339788.getClass(), "graphicsConfig", null);
        setField(term1339788, term1339788.getClass(), "bufferStrategy", null);
        setBooleanField(term1339788, term1339788.getClass(), "ignoreRepaint", false);
        setBooleanField(term1339788, term1339788.getClass(), "visible", false);
        setBooleanField(term1339788, term1339788.getClass(), "enabled", false);
        setBooleanField(term1339788, term1339788.getClass(), "valid", false);
        setField(term1339788, term1339788.getClass(), "dropTarget", null);
        setField(term1339788, term1339788.getClass(), "popups", null);
        setField(term1339788, term1339788.getClass(), "name", null);
        setBooleanField(term1339788, term1339788.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1339788, term1339788.getClass(), "focusable", false);
        setIntField(term1339788, term1339788.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1339788, term1339788.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1339788, term1339788.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1339788, term1339788.getClass(), "acc", null);
        setField(term1339788, term1339788.getClass(), "minSize", null);
        setBooleanField(term1339788, term1339788.getClass(), "minSizeSet", false);
        setField(term1339788, term1339788.getClass(), "prefSize", null);
        setBooleanField(term1339788, term1339788.getClass(), "prefSizeSet", false);
        setField(term1339788, term1339788.getClass(), "maxSize", null);
        setBooleanField(term1339788, term1339788.getClass(), "maxSizeSet", false);
        setField(term1339788, term1339788.getClass(), "componentOrientation", null);
        setBooleanField(term1339788, term1339788.getClass(), "newEventsOnly", false);
        setField(term1339788, term1339788.getClass(), "componentListener", null);
        setField(term1339788, term1339788.getClass(), "focusListener", null);
        setField(term1339788, term1339788.getClass(), "hierarchyListener", null);
        setField(term1339788, term1339788.getClass(), "hierarchyBoundsListener", null);
        setField(term1339788, term1339788.getClass(), "keyListener", null);
        setField(term1339788, term1339788.getClass(), "mouseListener", null);
        setField(term1339788, term1339788.getClass(), "mouseMotionListener", null);
        setField(term1339788, term1339788.getClass(), "mouseWheelListener", null);
        setField(term1339788, term1339788.getClass(), "inputMethodListener", null);
        setLongField(term1339788, term1339788.getClass(), "eventMask", 0L);
        setField(term1339788, term1339788.getClass(), "changeSupport", null);
        setField(term1339788, term1339788.getClass(), "objectLock", null);
        setBooleanField(term1339788, term1339788.getClass(), "isPacked", false);
        setIntField(term1339788, term1339788.getClass(), "boundsOp", 0);
        setField(term1339788, term1339788.getClass(), "compoundShape", null);
        setField(term1339788, term1339788.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1339788, term1339788.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1339788, term1339788.getClass(), "backgroundEraseDisabled", false);
        setField(term1339788, term1339788.getClass(), "eventCache", null);
        setBooleanField(term1339788, term1339788.getClass(), "coalescingEnabled", false);
        setBooleanField(term1339788, term1339788.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1339788, term1339788.getClass(), "componentSerializedDataVersion", 0);
        setField(term1339788, term1339788.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "rulerFreePrisoner", argTypes, term1339788, args);
    }

};


