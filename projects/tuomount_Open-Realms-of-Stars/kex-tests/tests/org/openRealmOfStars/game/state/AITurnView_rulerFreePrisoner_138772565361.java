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

public class AITurnView_rulerFreePrisoner_138772565361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1382386;

    public AITurnView_rulerFreePrisoner_138772565361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1382386 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1382386, term1382386.getClass(), "label", null);
        setField(term1382386, term1382386.getClass(), "game", null);
        setIntField(term1382386, term1382386.getClass(), "textAnim", 0);
        setIntField(term1382386, term1382386.getClass(), "cx", 0);
        setIntField(term1382386, term1382386.getClass(), "cy", 0);
        setField(term1382386, term1382386.getClass(), "aiThread", null);
        setBooleanField(term1382386, term1382386.getClass(), "readyToMove", false);
        setField(term1382386, term1382386.getClass(), "nextState", null);
        setField(term1382386, term1382386.getClass(), "nextStateObject", null);
        setBooleanField(term1382386, term1382386.getClass(), "isAlignmentXSet", false);
        setFloatField(term1382386, term1382386.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1382386, term1382386.getClass(), "isAlignmentYSet", false);
        setFloatField(term1382386, term1382386.getClass(), "alignmentY", 0.0F);
        setField(term1382386, term1382386.getClass(), "ui", null);
        setField(term1382386, term1382386.getClass(), "listenerList", null);
        setField(term1382386, term1382386.getClass(), "clientProperties", null);
        setField(term1382386, term1382386.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1382386, term1382386.getClass(), "autoscrolls", false);
        setField(term1382386, term1382386.getClass(), "border", null);
        setIntField(term1382386, term1382386.getClass(), "flags", 0);
        setField(term1382386, term1382386.getClass(), "inputVerifier", null);
        setBooleanField(term1382386, term1382386.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1382386, term1382386.getClass(), "paintingChild", null);
        setField(term1382386, term1382386.getClass(), "popupMenu", null);
        setField(term1382386, term1382386.getClass(), "revalidateRunnableScheduled", null);
        setField(term1382386, term1382386.getClass(), "focusInputMap", null);
        setField(term1382386, term1382386.getClass(), "ancestorInputMap", null);
        setField(term1382386, term1382386.getClass(), "windowInputMap", null);
        setField(term1382386, term1382386.getClass(), "actionMap", null);
        setField(term1382386, term1382386.getClass(), "aaHint", null);
        setField(term1382386, term1382386.getClass(), "lcdRenderingHint", null);
        setField(term1382386, term1382386.getClass(), "component", null);
        setField(term1382386, term1382386.getClass(), "layoutMgr", null);
        setField(term1382386, term1382386.getClass(), "dispatcher", null);
        setField(term1382386, term1382386.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1382386, term1382386.getClass(), "focusCycleRoot", false);
        setBooleanField(term1382386, term1382386.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1382386, term1382386.getClass(), "printingThreads", null);
        setBooleanField(term1382386, term1382386.getClass(), "printing", false);
        setField(term1382386, term1382386.getClass(), "containerListener", null);
        setIntField(term1382386, term1382386.getClass(), "listeningChildren", 0);
        setIntField(term1382386, term1382386.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1382386, term1382386.getClass(), "descendantsCount", 0);
        setField(term1382386, term1382386.getClass(), "preserveBackgroundColor", null);
        setIntField(term1382386, term1382386.getClass(), "numOfHWComponents", 0);
        setIntField(term1382386, term1382386.getClass(), "numOfLWComponents", 0);
        setField(term1382386, term1382386.getClass(), "modalComp", null);
        setField(term1382386, term1382386.getClass(), "modalAppContext", null);
        setIntField(term1382386, term1382386.getClass(), "containerSerializedDataVersion", 0);
        setField(term1382386, term1382386.getClass(), "peer", null);
        setField(term1382386, term1382386.getClass(), "parent", null);
        setField(term1382386, term1382386.getClass(), "appContext", null);
        setIntField(term1382386, term1382386.getClass(), "x", 0);
        setIntField(term1382386, term1382386.getClass(), "y", 0);
        setIntField(term1382386, term1382386.getClass(), "width", 0);
        setIntField(term1382386, term1382386.getClass(), "height", 0);
        setField(term1382386, term1382386.getClass(), "foreground", null);
        setField(term1382386, term1382386.getClass(), "background", null);
        setField(term1382386, term1382386.getClass(), "font", null);
        setField(term1382386, term1382386.getClass(), "peerFont", null);
        setField(term1382386, term1382386.getClass(), "cursor", null);
        setField(term1382386, term1382386.getClass(), "locale", null);
        setField(term1382386, term1382386.getClass(), "graphicsConfig", null);
        setField(term1382386, term1382386.getClass(), "bufferStrategy", null);
        setBooleanField(term1382386, term1382386.getClass(), "ignoreRepaint", false);
        setBooleanField(term1382386, term1382386.getClass(), "visible", false);
        setBooleanField(term1382386, term1382386.getClass(), "enabled", false);
        setBooleanField(term1382386, term1382386.getClass(), "valid", false);
        setField(term1382386, term1382386.getClass(), "dropTarget", null);
        setField(term1382386, term1382386.getClass(), "popups", null);
        setField(term1382386, term1382386.getClass(), "name", null);
        setBooleanField(term1382386, term1382386.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1382386, term1382386.getClass(), "focusable", false);
        setIntField(term1382386, term1382386.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1382386, term1382386.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1382386, term1382386.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1382386, term1382386.getClass(), "acc", null);
        setField(term1382386, term1382386.getClass(), "minSize", null);
        setBooleanField(term1382386, term1382386.getClass(), "minSizeSet", false);
        setField(term1382386, term1382386.getClass(), "prefSize", null);
        setBooleanField(term1382386, term1382386.getClass(), "prefSizeSet", false);
        setField(term1382386, term1382386.getClass(), "maxSize", null);
        setBooleanField(term1382386, term1382386.getClass(), "maxSizeSet", false);
        setField(term1382386, term1382386.getClass(), "componentOrientation", null);
        setBooleanField(term1382386, term1382386.getClass(), "newEventsOnly", false);
        setField(term1382386, term1382386.getClass(), "componentListener", null);
        setField(term1382386, term1382386.getClass(), "focusListener", null);
        setField(term1382386, term1382386.getClass(), "hierarchyListener", null);
        setField(term1382386, term1382386.getClass(), "hierarchyBoundsListener", null);
        setField(term1382386, term1382386.getClass(), "keyListener", null);
        setField(term1382386, term1382386.getClass(), "mouseListener", null);
        setField(term1382386, term1382386.getClass(), "mouseMotionListener", null);
        setField(term1382386, term1382386.getClass(), "mouseWheelListener", null);
        setField(term1382386, term1382386.getClass(), "inputMethodListener", null);
        setLongField(term1382386, term1382386.getClass(), "eventMask", 0L);
        setField(term1382386, term1382386.getClass(), "changeSupport", null);
        setField(term1382386, term1382386.getClass(), "objectLock", null);
        setBooleanField(term1382386, term1382386.getClass(), "isPacked", false);
        setIntField(term1382386, term1382386.getClass(), "boundsOp", 0);
        setField(term1382386, term1382386.getClass(), "compoundShape", null);
        setField(term1382386, term1382386.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1382386, term1382386.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1382386, term1382386.getClass(), "backgroundEraseDisabled", false);
        setField(term1382386, term1382386.getClass(), "eventCache", null);
        setBooleanField(term1382386, term1382386.getClass(), "coalescingEnabled", false);
        setBooleanField(term1382386, term1382386.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1382386, term1382386.getClass(), "componentSerializedDataVersion", 0);
        setField(term1382386, term1382386.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "rulerFreePrisoner", argTypes, term1382386, args);
    }

};


