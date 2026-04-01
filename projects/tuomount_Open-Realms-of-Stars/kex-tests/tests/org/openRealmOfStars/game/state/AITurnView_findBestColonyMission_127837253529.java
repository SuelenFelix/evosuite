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

public class AITurnView_findBestColonyMission_127837253529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1167331;

    public AITurnView_findBestColonyMission_127837253529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1167331 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1167331, term1167331.getClass(), "label", null);
        setField(term1167331, term1167331.getClass(), "game", null);
        setIntField(term1167331, term1167331.getClass(), "textAnim", 0);
        setIntField(term1167331, term1167331.getClass(), "cx", 0);
        setIntField(term1167331, term1167331.getClass(), "cy", 0);
        setField(term1167331, term1167331.getClass(), "aiThread", null);
        setBooleanField(term1167331, term1167331.getClass(), "readyToMove", false);
        setField(term1167331, term1167331.getClass(), "nextState", null);
        setField(term1167331, term1167331.getClass(), "nextStateObject", null);
        setBooleanField(term1167331, term1167331.getClass(), "isAlignmentXSet", false);
        setFloatField(term1167331, term1167331.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1167331, term1167331.getClass(), "isAlignmentYSet", false);
        setFloatField(term1167331, term1167331.getClass(), "alignmentY", 0.0F);
        setField(term1167331, term1167331.getClass(), "ui", null);
        setField(term1167331, term1167331.getClass(), "listenerList", null);
        setField(term1167331, term1167331.getClass(), "clientProperties", null);
        setField(term1167331, term1167331.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1167331, term1167331.getClass(), "autoscrolls", false);
        setField(term1167331, term1167331.getClass(), "border", null);
        setIntField(term1167331, term1167331.getClass(), "flags", 0);
        setField(term1167331, term1167331.getClass(), "inputVerifier", null);
        setBooleanField(term1167331, term1167331.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1167331, term1167331.getClass(), "paintingChild", null);
        setField(term1167331, term1167331.getClass(), "popupMenu", null);
        setField(term1167331, term1167331.getClass(), "revalidateRunnableScheduled", null);
        setField(term1167331, term1167331.getClass(), "focusInputMap", null);
        setField(term1167331, term1167331.getClass(), "ancestorInputMap", null);
        setField(term1167331, term1167331.getClass(), "windowInputMap", null);
        setField(term1167331, term1167331.getClass(), "actionMap", null);
        setField(term1167331, term1167331.getClass(), "aaHint", null);
        setField(term1167331, term1167331.getClass(), "lcdRenderingHint", null);
        setField(term1167331, term1167331.getClass(), "component", null);
        setField(term1167331, term1167331.getClass(), "layoutMgr", null);
        setField(term1167331, term1167331.getClass(), "dispatcher", null);
        setField(term1167331, term1167331.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1167331, term1167331.getClass(), "focusCycleRoot", false);
        setBooleanField(term1167331, term1167331.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1167331, term1167331.getClass(), "printingThreads", null);
        setBooleanField(term1167331, term1167331.getClass(), "printing", false);
        setField(term1167331, term1167331.getClass(), "containerListener", null);
        setIntField(term1167331, term1167331.getClass(), "listeningChildren", 0);
        setIntField(term1167331, term1167331.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1167331, term1167331.getClass(), "descendantsCount", 0);
        setField(term1167331, term1167331.getClass(), "preserveBackgroundColor", null);
        setIntField(term1167331, term1167331.getClass(), "numOfHWComponents", 0);
        setIntField(term1167331, term1167331.getClass(), "numOfLWComponents", 0);
        setField(term1167331, term1167331.getClass(), "modalComp", null);
        setField(term1167331, term1167331.getClass(), "modalAppContext", null);
        setIntField(term1167331, term1167331.getClass(), "containerSerializedDataVersion", 0);
        setField(term1167331, term1167331.getClass(), "peer", null);
        setField(term1167331, term1167331.getClass(), "parent", null);
        setField(term1167331, term1167331.getClass(), "appContext", null);
        setIntField(term1167331, term1167331.getClass(), "x", 0);
        setIntField(term1167331, term1167331.getClass(), "y", 0);
        setIntField(term1167331, term1167331.getClass(), "width", 0);
        setIntField(term1167331, term1167331.getClass(), "height", 0);
        setField(term1167331, term1167331.getClass(), "foreground", null);
        setField(term1167331, term1167331.getClass(), "background", null);
        setField(term1167331, term1167331.getClass(), "font", null);
        setField(term1167331, term1167331.getClass(), "peerFont", null);
        setField(term1167331, term1167331.getClass(), "cursor", null);
        setField(term1167331, term1167331.getClass(), "locale", null);
        setField(term1167331, term1167331.getClass(), "graphicsConfig", null);
        setField(term1167331, term1167331.getClass(), "bufferStrategy", null);
        setBooleanField(term1167331, term1167331.getClass(), "ignoreRepaint", false);
        setBooleanField(term1167331, term1167331.getClass(), "visible", false);
        setBooleanField(term1167331, term1167331.getClass(), "enabled", false);
        setBooleanField(term1167331, term1167331.getClass(), "valid", false);
        setField(term1167331, term1167331.getClass(), "dropTarget", null);
        setField(term1167331, term1167331.getClass(), "popups", null);
        setField(term1167331, term1167331.getClass(), "name", null);
        setBooleanField(term1167331, term1167331.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1167331, term1167331.getClass(), "focusable", false);
        setIntField(term1167331, term1167331.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1167331, term1167331.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1167331, term1167331.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1167331, term1167331.getClass(), "acc", null);
        setField(term1167331, term1167331.getClass(), "minSize", null);
        setBooleanField(term1167331, term1167331.getClass(), "minSizeSet", false);
        setField(term1167331, term1167331.getClass(), "prefSize", null);
        setBooleanField(term1167331, term1167331.getClass(), "prefSizeSet", false);
        setField(term1167331, term1167331.getClass(), "maxSize", null);
        setBooleanField(term1167331, term1167331.getClass(), "maxSizeSet", false);
        setField(term1167331, term1167331.getClass(), "componentOrientation", null);
        setBooleanField(term1167331, term1167331.getClass(), "newEventsOnly", false);
        setField(term1167331, term1167331.getClass(), "componentListener", null);
        setField(term1167331, term1167331.getClass(), "focusListener", null);
        setField(term1167331, term1167331.getClass(), "hierarchyListener", null);
        setField(term1167331, term1167331.getClass(), "hierarchyBoundsListener", null);
        setField(term1167331, term1167331.getClass(), "keyListener", null);
        setField(term1167331, term1167331.getClass(), "mouseListener", null);
        setField(term1167331, term1167331.getClass(), "mouseMotionListener", null);
        setField(term1167331, term1167331.getClass(), "mouseWheelListener", null);
        setField(term1167331, term1167331.getClass(), "inputMethodListener", null);
        setLongField(term1167331, term1167331.getClass(), "eventMask", 0L);
        setField(term1167331, term1167331.getClass(), "changeSupport", null);
        setField(term1167331, term1167331.getClass(), "objectLock", null);
        setBooleanField(term1167331, term1167331.getClass(), "isPacked", false);
        setIntField(term1167331, term1167331.getClass(), "boundsOp", 0);
        setField(term1167331, term1167331.getClass(), "compoundShape", null);
        setField(term1167331, term1167331.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1167331, term1167331.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1167331, term1167331.getClass(), "backgroundEraseDisabled", false);
        setField(term1167331, term1167331.getClass(), "eventCache", null);
        setBooleanField(term1167331, term1167331.getClass(), "coalescingEnabled", false);
        setBooleanField(term1167331, term1167331.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1167331, term1167331.getClass(), "componentSerializedDataVersion", 0);
        setField(term1167331, term1167331.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        argTypes[1] = Class.forName("java.util.ArrayList");
        argTypes[2] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "findBestColonyMission", argTypes, term1167331, args);
    }

};


