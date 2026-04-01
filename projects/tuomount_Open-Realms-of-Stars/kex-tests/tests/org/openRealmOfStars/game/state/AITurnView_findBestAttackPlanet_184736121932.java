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

public class AITurnView_findBestAttackPlanet_184736121932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1189760;

    public AITurnView_findBestAttackPlanet_184736121932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1189760 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1189760, term1189760.getClass(), "label", null);
        setField(term1189760, term1189760.getClass(), "game", null);
        setIntField(term1189760, term1189760.getClass(), "textAnim", 0);
        setIntField(term1189760, term1189760.getClass(), "cx", 0);
        setIntField(term1189760, term1189760.getClass(), "cy", 0);
        setField(term1189760, term1189760.getClass(), "aiThread", null);
        setBooleanField(term1189760, term1189760.getClass(), "readyToMove", false);
        setField(term1189760, term1189760.getClass(), "nextState", null);
        setField(term1189760, term1189760.getClass(), "nextStateObject", null);
        setBooleanField(term1189760, term1189760.getClass(), "isAlignmentXSet", false);
        setFloatField(term1189760, term1189760.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1189760, term1189760.getClass(), "isAlignmentYSet", false);
        setFloatField(term1189760, term1189760.getClass(), "alignmentY", 0.0F);
        setField(term1189760, term1189760.getClass(), "ui", null);
        setField(term1189760, term1189760.getClass(), "listenerList", null);
        setField(term1189760, term1189760.getClass(), "clientProperties", null);
        setField(term1189760, term1189760.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1189760, term1189760.getClass(), "autoscrolls", false);
        setField(term1189760, term1189760.getClass(), "border", null);
        setIntField(term1189760, term1189760.getClass(), "flags", 0);
        setField(term1189760, term1189760.getClass(), "inputVerifier", null);
        setBooleanField(term1189760, term1189760.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1189760, term1189760.getClass(), "paintingChild", null);
        setField(term1189760, term1189760.getClass(), "popupMenu", null);
        setField(term1189760, term1189760.getClass(), "revalidateRunnableScheduled", null);
        setField(term1189760, term1189760.getClass(), "focusInputMap", null);
        setField(term1189760, term1189760.getClass(), "ancestorInputMap", null);
        setField(term1189760, term1189760.getClass(), "windowInputMap", null);
        setField(term1189760, term1189760.getClass(), "actionMap", null);
        setField(term1189760, term1189760.getClass(), "aaHint", null);
        setField(term1189760, term1189760.getClass(), "lcdRenderingHint", null);
        setField(term1189760, term1189760.getClass(), "component", null);
        setField(term1189760, term1189760.getClass(), "layoutMgr", null);
        setField(term1189760, term1189760.getClass(), "dispatcher", null);
        setField(term1189760, term1189760.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1189760, term1189760.getClass(), "focusCycleRoot", false);
        setBooleanField(term1189760, term1189760.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1189760, term1189760.getClass(), "printingThreads", null);
        setBooleanField(term1189760, term1189760.getClass(), "printing", false);
        setField(term1189760, term1189760.getClass(), "containerListener", null);
        setIntField(term1189760, term1189760.getClass(), "listeningChildren", 0);
        setIntField(term1189760, term1189760.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1189760, term1189760.getClass(), "descendantsCount", 0);
        setField(term1189760, term1189760.getClass(), "preserveBackgroundColor", null);
        setIntField(term1189760, term1189760.getClass(), "numOfHWComponents", 0);
        setIntField(term1189760, term1189760.getClass(), "numOfLWComponents", 0);
        setField(term1189760, term1189760.getClass(), "modalComp", null);
        setField(term1189760, term1189760.getClass(), "modalAppContext", null);
        setIntField(term1189760, term1189760.getClass(), "containerSerializedDataVersion", 0);
        setField(term1189760, term1189760.getClass(), "peer", null);
        setField(term1189760, term1189760.getClass(), "parent", null);
        setField(term1189760, term1189760.getClass(), "appContext", null);
        setIntField(term1189760, term1189760.getClass(), "x", 0);
        setIntField(term1189760, term1189760.getClass(), "y", 0);
        setIntField(term1189760, term1189760.getClass(), "width", 0);
        setIntField(term1189760, term1189760.getClass(), "height", 0);
        setField(term1189760, term1189760.getClass(), "foreground", null);
        setField(term1189760, term1189760.getClass(), "background", null);
        setField(term1189760, term1189760.getClass(), "font", null);
        setField(term1189760, term1189760.getClass(), "peerFont", null);
        setField(term1189760, term1189760.getClass(), "cursor", null);
        setField(term1189760, term1189760.getClass(), "locale", null);
        setField(term1189760, term1189760.getClass(), "graphicsConfig", null);
        setField(term1189760, term1189760.getClass(), "bufferStrategy", null);
        setBooleanField(term1189760, term1189760.getClass(), "ignoreRepaint", false);
        setBooleanField(term1189760, term1189760.getClass(), "visible", false);
        setBooleanField(term1189760, term1189760.getClass(), "enabled", false);
        setBooleanField(term1189760, term1189760.getClass(), "valid", false);
        setField(term1189760, term1189760.getClass(), "dropTarget", null);
        setField(term1189760, term1189760.getClass(), "popups", null);
        setField(term1189760, term1189760.getClass(), "name", null);
        setBooleanField(term1189760, term1189760.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1189760, term1189760.getClass(), "focusable", false);
        setIntField(term1189760, term1189760.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1189760, term1189760.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1189760, term1189760.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1189760, term1189760.getClass(), "acc", null);
        setField(term1189760, term1189760.getClass(), "minSize", null);
        setBooleanField(term1189760, term1189760.getClass(), "minSizeSet", false);
        setField(term1189760, term1189760.getClass(), "prefSize", null);
        setBooleanField(term1189760, term1189760.getClass(), "prefSizeSet", false);
        setField(term1189760, term1189760.getClass(), "maxSize", null);
        setBooleanField(term1189760, term1189760.getClass(), "maxSizeSet", false);
        setField(term1189760, term1189760.getClass(), "componentOrientation", null);
        setBooleanField(term1189760, term1189760.getClass(), "newEventsOnly", false);
        setField(term1189760, term1189760.getClass(), "componentListener", null);
        setField(term1189760, term1189760.getClass(), "focusListener", null);
        setField(term1189760, term1189760.getClass(), "hierarchyListener", null);
        setField(term1189760, term1189760.getClass(), "hierarchyBoundsListener", null);
        setField(term1189760, term1189760.getClass(), "keyListener", null);
        setField(term1189760, term1189760.getClass(), "mouseListener", null);
        setField(term1189760, term1189760.getClass(), "mouseMotionListener", null);
        setField(term1189760, term1189760.getClass(), "mouseWheelListener", null);
        setField(term1189760, term1189760.getClass(), "inputMethodListener", null);
        setLongField(term1189760, term1189760.getClass(), "eventMask", 0L);
        setField(term1189760, term1189760.getClass(), "changeSupport", null);
        setField(term1189760, term1189760.getClass(), "objectLock", null);
        setBooleanField(term1189760, term1189760.getClass(), "isPacked", false);
        setIntField(term1189760, term1189760.getClass(), "boundsOp", 0);
        setField(term1189760, term1189760.getClass(), "compoundShape", null);
        setField(term1189760, term1189760.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1189760, term1189760.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1189760, term1189760.getClass(), "backgroundEraseDisabled", false);
        setField(term1189760, term1189760.getClass(), "eventCache", null);
        setBooleanField(term1189760, term1189760.getClass(), "coalescingEnabled", false);
        setBooleanField(term1189760, term1189760.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1189760, term1189760.getClass(), "componentSerializedDataVersion", 0);
        setField(term1189760, term1189760.getClass(), "accessibleContext", null);
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
        callMethod(klass, "findBestAttackPlanet", argTypes, term1189760, args);
    }

};


