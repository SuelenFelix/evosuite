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

public class AITurnView_searchPlanetsForMissions_145964621891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1378172;

    public AITurnView_searchPlanetsForMissions_145964621891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1378172 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1378172, term1378172.getClass(), "label", null);
        setField(term1378172, term1378172.getClass(), "game", null);
        setIntField(term1378172, term1378172.getClass(), "textAnim", 0);
        setIntField(term1378172, term1378172.getClass(), "cx", 0);
        setIntField(term1378172, term1378172.getClass(), "cy", 0);
        setField(term1378172, term1378172.getClass(), "aiThread", null);
        setBooleanField(term1378172, term1378172.getClass(), "readyToMove", false);
        setField(term1378172, term1378172.getClass(), "nextState", null);
        setField(term1378172, term1378172.getClass(), "nextStateObject", null);
        setBooleanField(term1378172, term1378172.getClass(), "isAlignmentXSet", false);
        setFloatField(term1378172, term1378172.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1378172, term1378172.getClass(), "isAlignmentYSet", false);
        setFloatField(term1378172, term1378172.getClass(), "alignmentY", 0.0F);
        setField(term1378172, term1378172.getClass(), "ui", null);
        setField(term1378172, term1378172.getClass(), "listenerList", null);
        setField(term1378172, term1378172.getClass(), "clientProperties", null);
        setField(term1378172, term1378172.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1378172, term1378172.getClass(), "autoscrolls", false);
        setField(term1378172, term1378172.getClass(), "border", null);
        setIntField(term1378172, term1378172.getClass(), "flags", 0);
        setField(term1378172, term1378172.getClass(), "inputVerifier", null);
        setBooleanField(term1378172, term1378172.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1378172, term1378172.getClass(), "paintingChild", null);
        setField(term1378172, term1378172.getClass(), "popupMenu", null);
        setField(term1378172, term1378172.getClass(), "revalidateRunnableScheduled", null);
        setField(term1378172, term1378172.getClass(), "focusInputMap", null);
        setField(term1378172, term1378172.getClass(), "ancestorInputMap", null);
        setField(term1378172, term1378172.getClass(), "windowInputMap", null);
        setField(term1378172, term1378172.getClass(), "actionMap", null);
        setField(term1378172, term1378172.getClass(), "aaHint", null);
        setField(term1378172, term1378172.getClass(), "lcdRenderingHint", null);
        setField(term1378172, term1378172.getClass(), "component", null);
        setField(term1378172, term1378172.getClass(), "layoutMgr", null);
        setField(term1378172, term1378172.getClass(), "dispatcher", null);
        setField(term1378172, term1378172.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1378172, term1378172.getClass(), "focusCycleRoot", false);
        setBooleanField(term1378172, term1378172.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1378172, term1378172.getClass(), "printingThreads", null);
        setBooleanField(term1378172, term1378172.getClass(), "printing", false);
        setField(term1378172, term1378172.getClass(), "containerListener", null);
        setIntField(term1378172, term1378172.getClass(), "listeningChildren", 0);
        setIntField(term1378172, term1378172.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1378172, term1378172.getClass(), "descendantsCount", 0);
        setField(term1378172, term1378172.getClass(), "preserveBackgroundColor", null);
        setIntField(term1378172, term1378172.getClass(), "numOfHWComponents", 0);
        setIntField(term1378172, term1378172.getClass(), "numOfLWComponents", 0);
        setField(term1378172, term1378172.getClass(), "modalComp", null);
        setField(term1378172, term1378172.getClass(), "modalAppContext", null);
        setIntField(term1378172, term1378172.getClass(), "containerSerializedDataVersion", 0);
        setField(term1378172, term1378172.getClass(), "peer", null);
        setField(term1378172, term1378172.getClass(), "parent", null);
        setField(term1378172, term1378172.getClass(), "appContext", null);
        setIntField(term1378172, term1378172.getClass(), "x", 0);
        setIntField(term1378172, term1378172.getClass(), "y", 0);
        setIntField(term1378172, term1378172.getClass(), "width", 0);
        setIntField(term1378172, term1378172.getClass(), "height", 0);
        setField(term1378172, term1378172.getClass(), "foreground", null);
        setField(term1378172, term1378172.getClass(), "background", null);
        setField(term1378172, term1378172.getClass(), "font", null);
        setField(term1378172, term1378172.getClass(), "peerFont", null);
        setField(term1378172, term1378172.getClass(), "cursor", null);
        setField(term1378172, term1378172.getClass(), "locale", null);
        setField(term1378172, term1378172.getClass(), "graphicsConfig", null);
        setField(term1378172, term1378172.getClass(), "bufferStrategy", null);
        setBooleanField(term1378172, term1378172.getClass(), "ignoreRepaint", false);
        setBooleanField(term1378172, term1378172.getClass(), "visible", false);
        setBooleanField(term1378172, term1378172.getClass(), "enabled", false);
        setBooleanField(term1378172, term1378172.getClass(), "valid", false);
        setField(term1378172, term1378172.getClass(), "dropTarget", null);
        setField(term1378172, term1378172.getClass(), "popups", null);
        setField(term1378172, term1378172.getClass(), "name", null);
        setBooleanField(term1378172, term1378172.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1378172, term1378172.getClass(), "focusable", false);
        setIntField(term1378172, term1378172.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1378172, term1378172.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1378172, term1378172.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1378172, term1378172.getClass(), "acc", null);
        setField(term1378172, term1378172.getClass(), "minSize", null);
        setBooleanField(term1378172, term1378172.getClass(), "minSizeSet", false);
        setField(term1378172, term1378172.getClass(), "prefSize", null);
        setBooleanField(term1378172, term1378172.getClass(), "prefSizeSet", false);
        setField(term1378172, term1378172.getClass(), "maxSize", null);
        setBooleanField(term1378172, term1378172.getClass(), "maxSizeSet", false);
        setField(term1378172, term1378172.getClass(), "componentOrientation", null);
        setBooleanField(term1378172, term1378172.getClass(), "newEventsOnly", false);
        setField(term1378172, term1378172.getClass(), "componentListener", null);
        setField(term1378172, term1378172.getClass(), "focusListener", null);
        setField(term1378172, term1378172.getClass(), "hierarchyListener", null);
        setField(term1378172, term1378172.getClass(), "hierarchyBoundsListener", null);
        setField(term1378172, term1378172.getClass(), "keyListener", null);
        setField(term1378172, term1378172.getClass(), "mouseListener", null);
        setField(term1378172, term1378172.getClass(), "mouseMotionListener", null);
        setField(term1378172, term1378172.getClass(), "mouseWheelListener", null);
        setField(term1378172, term1378172.getClass(), "inputMethodListener", null);
        setLongField(term1378172, term1378172.getClass(), "eventMask", 0L);
        setField(term1378172, term1378172.getClass(), "changeSupport", null);
        setField(term1378172, term1378172.getClass(), "objectLock", null);
        setBooleanField(term1378172, term1378172.getClass(), "isPacked", false);
        setIntField(term1378172, term1378172.getClass(), "boundsOp", 0);
        setField(term1378172, term1378172.getClass(), "compoundShape", null);
        setField(term1378172, term1378172.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1378172, term1378172.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1378172, term1378172.getClass(), "backgroundEraseDisabled", false);
        setField(term1378172, term1378172.getClass(), "eventCache", null);
        setBooleanField(term1378172, term1378172.getClass(), "coalescingEnabled", false);
        setBooleanField(term1378172, term1378172.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1378172, term1378172.getClass(), "componentSerializedDataVersion", 0);
        setField(term1378172, term1378172.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "searchPlanetsForMissions", argTypes, term1378172, args);
    }

};


