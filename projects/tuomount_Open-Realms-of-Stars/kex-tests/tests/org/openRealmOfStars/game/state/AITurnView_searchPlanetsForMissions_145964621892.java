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

public class AITurnView_searchPlanetsForMissions_145964621892 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1418448;

    public AITurnView_searchPlanetsForMissions_145964621892() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1418448 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1418448, term1418448.getClass(), "label", null);
        setField(term1418448, term1418448.getClass(), "game", null);
        setIntField(term1418448, term1418448.getClass(), "textAnim", 0);
        setIntField(term1418448, term1418448.getClass(), "cx", 0);
        setIntField(term1418448, term1418448.getClass(), "cy", 0);
        setField(term1418448, term1418448.getClass(), "aiThread", null);
        setBooleanField(term1418448, term1418448.getClass(), "readyToMove", false);
        setField(term1418448, term1418448.getClass(), "nextState", null);
        setField(term1418448, term1418448.getClass(), "nextStateObject", null);
        setBooleanField(term1418448, term1418448.getClass(), "isAlignmentXSet", false);
        setFloatField(term1418448, term1418448.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1418448, term1418448.getClass(), "isAlignmentYSet", false);
        setFloatField(term1418448, term1418448.getClass(), "alignmentY", 0.0F);
        setField(term1418448, term1418448.getClass(), "ui", null);
        setField(term1418448, term1418448.getClass(), "listenerList", null);
        setField(term1418448, term1418448.getClass(), "clientProperties", null);
        setField(term1418448, term1418448.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1418448, term1418448.getClass(), "autoscrolls", false);
        setField(term1418448, term1418448.getClass(), "border", null);
        setIntField(term1418448, term1418448.getClass(), "flags", 0);
        setField(term1418448, term1418448.getClass(), "inputVerifier", null);
        setBooleanField(term1418448, term1418448.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1418448, term1418448.getClass(), "paintingChild", null);
        setField(term1418448, term1418448.getClass(), "popupMenu", null);
        setField(term1418448, term1418448.getClass(), "revalidateRunnableScheduled", null);
        setField(term1418448, term1418448.getClass(), "focusInputMap", null);
        setField(term1418448, term1418448.getClass(), "ancestorInputMap", null);
        setField(term1418448, term1418448.getClass(), "windowInputMap", null);
        setField(term1418448, term1418448.getClass(), "actionMap", null);
        setField(term1418448, term1418448.getClass(), "aaHint", null);
        setField(term1418448, term1418448.getClass(), "lcdRenderingHint", null);
        setField(term1418448, term1418448.getClass(), "component", null);
        setField(term1418448, term1418448.getClass(), "layoutMgr", null);
        setField(term1418448, term1418448.getClass(), "dispatcher", null);
        setField(term1418448, term1418448.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1418448, term1418448.getClass(), "focusCycleRoot", false);
        setBooleanField(term1418448, term1418448.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1418448, term1418448.getClass(), "printingThreads", null);
        setBooleanField(term1418448, term1418448.getClass(), "printing", false);
        setField(term1418448, term1418448.getClass(), "containerListener", null);
        setIntField(term1418448, term1418448.getClass(), "listeningChildren", 0);
        setIntField(term1418448, term1418448.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1418448, term1418448.getClass(), "descendantsCount", 0);
        setField(term1418448, term1418448.getClass(), "preserveBackgroundColor", null);
        setIntField(term1418448, term1418448.getClass(), "numOfHWComponents", 0);
        setIntField(term1418448, term1418448.getClass(), "numOfLWComponents", 0);
        setField(term1418448, term1418448.getClass(), "modalComp", null);
        setField(term1418448, term1418448.getClass(), "modalAppContext", null);
        setIntField(term1418448, term1418448.getClass(), "containerSerializedDataVersion", 0);
        setField(term1418448, term1418448.getClass(), "peer", null);
        setField(term1418448, term1418448.getClass(), "parent", null);
        setField(term1418448, term1418448.getClass(), "appContext", null);
        setIntField(term1418448, term1418448.getClass(), "x", 0);
        setIntField(term1418448, term1418448.getClass(), "y", 0);
        setIntField(term1418448, term1418448.getClass(), "width", 0);
        setIntField(term1418448, term1418448.getClass(), "height", 0);
        setField(term1418448, term1418448.getClass(), "foreground", null);
        setField(term1418448, term1418448.getClass(), "background", null);
        setField(term1418448, term1418448.getClass(), "font", null);
        setField(term1418448, term1418448.getClass(), "peerFont", null);
        setField(term1418448, term1418448.getClass(), "cursor", null);
        setField(term1418448, term1418448.getClass(), "locale", null);
        setField(term1418448, term1418448.getClass(), "graphicsConfig", null);
        setField(term1418448, term1418448.getClass(), "bufferStrategy", null);
        setBooleanField(term1418448, term1418448.getClass(), "ignoreRepaint", false);
        setBooleanField(term1418448, term1418448.getClass(), "visible", false);
        setBooleanField(term1418448, term1418448.getClass(), "enabled", false);
        setBooleanField(term1418448, term1418448.getClass(), "valid", false);
        setField(term1418448, term1418448.getClass(), "dropTarget", null);
        setField(term1418448, term1418448.getClass(), "popups", null);
        setField(term1418448, term1418448.getClass(), "name", null);
        setBooleanField(term1418448, term1418448.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1418448, term1418448.getClass(), "focusable", false);
        setIntField(term1418448, term1418448.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1418448, term1418448.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1418448, term1418448.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1418448, term1418448.getClass(), "acc", null);
        setField(term1418448, term1418448.getClass(), "minSize", null);
        setBooleanField(term1418448, term1418448.getClass(), "minSizeSet", false);
        setField(term1418448, term1418448.getClass(), "prefSize", null);
        setBooleanField(term1418448, term1418448.getClass(), "prefSizeSet", false);
        setField(term1418448, term1418448.getClass(), "maxSize", null);
        setBooleanField(term1418448, term1418448.getClass(), "maxSizeSet", false);
        setField(term1418448, term1418448.getClass(), "componentOrientation", null);
        setBooleanField(term1418448, term1418448.getClass(), "newEventsOnly", false);
        setField(term1418448, term1418448.getClass(), "componentListener", null);
        setField(term1418448, term1418448.getClass(), "focusListener", null);
        setField(term1418448, term1418448.getClass(), "hierarchyListener", null);
        setField(term1418448, term1418448.getClass(), "hierarchyBoundsListener", null);
        setField(term1418448, term1418448.getClass(), "keyListener", null);
        setField(term1418448, term1418448.getClass(), "mouseListener", null);
        setField(term1418448, term1418448.getClass(), "mouseMotionListener", null);
        setField(term1418448, term1418448.getClass(), "mouseWheelListener", null);
        setField(term1418448, term1418448.getClass(), "inputMethodListener", null);
        setLongField(term1418448, term1418448.getClass(), "eventMask", 0L);
        setField(term1418448, term1418448.getClass(), "changeSupport", null);
        setField(term1418448, term1418448.getClass(), "objectLock", null);
        setBooleanField(term1418448, term1418448.getClass(), "isPacked", false);
        setIntField(term1418448, term1418448.getClass(), "boundsOp", 0);
        setField(term1418448, term1418448.getClass(), "compoundShape", null);
        setField(term1418448, term1418448.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1418448, term1418448.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1418448, term1418448.getClass(), "backgroundEraseDisabled", false);
        setField(term1418448, term1418448.getClass(), "eventCache", null);
        setBooleanField(term1418448, term1418448.getClass(), "coalescingEnabled", false);
        setBooleanField(term1418448, term1418448.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1418448, term1418448.getClass(), "componentSerializedDataVersion", 0);
        setField(term1418448, term1418448.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "searchPlanetsForMissions", argTypes, term1418448, args);
    }

};


