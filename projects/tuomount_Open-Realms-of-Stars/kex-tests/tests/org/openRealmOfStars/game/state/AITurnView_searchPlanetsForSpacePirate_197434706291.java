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

public class AITurnView_searchPlanetsForSpacePirate_197434706291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1418403;

    public AITurnView_searchPlanetsForSpacePirate_197434706291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1418403 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1418403, term1418403.getClass(), "label", null);
        setField(term1418403, term1418403.getClass(), "game", null);
        setIntField(term1418403, term1418403.getClass(), "textAnim", 0);
        setIntField(term1418403, term1418403.getClass(), "cx", 0);
        setIntField(term1418403, term1418403.getClass(), "cy", 0);
        setField(term1418403, term1418403.getClass(), "aiThread", null);
        setBooleanField(term1418403, term1418403.getClass(), "readyToMove", false);
        setField(term1418403, term1418403.getClass(), "nextState", null);
        setField(term1418403, term1418403.getClass(), "nextStateObject", null);
        setBooleanField(term1418403, term1418403.getClass(), "isAlignmentXSet", false);
        setFloatField(term1418403, term1418403.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1418403, term1418403.getClass(), "isAlignmentYSet", false);
        setFloatField(term1418403, term1418403.getClass(), "alignmentY", 0.0F);
        setField(term1418403, term1418403.getClass(), "ui", null);
        setField(term1418403, term1418403.getClass(), "listenerList", null);
        setField(term1418403, term1418403.getClass(), "clientProperties", null);
        setField(term1418403, term1418403.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1418403, term1418403.getClass(), "autoscrolls", false);
        setField(term1418403, term1418403.getClass(), "border", null);
        setIntField(term1418403, term1418403.getClass(), "flags", 0);
        setField(term1418403, term1418403.getClass(), "inputVerifier", null);
        setBooleanField(term1418403, term1418403.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1418403, term1418403.getClass(), "paintingChild", null);
        setField(term1418403, term1418403.getClass(), "popupMenu", null);
        setField(term1418403, term1418403.getClass(), "revalidateRunnableScheduled", null);
        setField(term1418403, term1418403.getClass(), "focusInputMap", null);
        setField(term1418403, term1418403.getClass(), "ancestorInputMap", null);
        setField(term1418403, term1418403.getClass(), "windowInputMap", null);
        setField(term1418403, term1418403.getClass(), "actionMap", null);
        setField(term1418403, term1418403.getClass(), "aaHint", null);
        setField(term1418403, term1418403.getClass(), "lcdRenderingHint", null);
        setField(term1418403, term1418403.getClass(), "component", null);
        setField(term1418403, term1418403.getClass(), "layoutMgr", null);
        setField(term1418403, term1418403.getClass(), "dispatcher", null);
        setField(term1418403, term1418403.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1418403, term1418403.getClass(), "focusCycleRoot", false);
        setBooleanField(term1418403, term1418403.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1418403, term1418403.getClass(), "printingThreads", null);
        setBooleanField(term1418403, term1418403.getClass(), "printing", false);
        setField(term1418403, term1418403.getClass(), "containerListener", null);
        setIntField(term1418403, term1418403.getClass(), "listeningChildren", 0);
        setIntField(term1418403, term1418403.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1418403, term1418403.getClass(), "descendantsCount", 0);
        setField(term1418403, term1418403.getClass(), "preserveBackgroundColor", null);
        setIntField(term1418403, term1418403.getClass(), "numOfHWComponents", 0);
        setIntField(term1418403, term1418403.getClass(), "numOfLWComponents", 0);
        setField(term1418403, term1418403.getClass(), "modalComp", null);
        setField(term1418403, term1418403.getClass(), "modalAppContext", null);
        setIntField(term1418403, term1418403.getClass(), "containerSerializedDataVersion", 0);
        setField(term1418403, term1418403.getClass(), "peer", null);
        setField(term1418403, term1418403.getClass(), "parent", null);
        setField(term1418403, term1418403.getClass(), "appContext", null);
        setIntField(term1418403, term1418403.getClass(), "x", 0);
        setIntField(term1418403, term1418403.getClass(), "y", 0);
        setIntField(term1418403, term1418403.getClass(), "width", 0);
        setIntField(term1418403, term1418403.getClass(), "height", 0);
        setField(term1418403, term1418403.getClass(), "foreground", null);
        setField(term1418403, term1418403.getClass(), "background", null);
        setField(term1418403, term1418403.getClass(), "font", null);
        setField(term1418403, term1418403.getClass(), "peerFont", null);
        setField(term1418403, term1418403.getClass(), "cursor", null);
        setField(term1418403, term1418403.getClass(), "locale", null);
        setField(term1418403, term1418403.getClass(), "graphicsConfig", null);
        setField(term1418403, term1418403.getClass(), "bufferStrategy", null);
        setBooleanField(term1418403, term1418403.getClass(), "ignoreRepaint", false);
        setBooleanField(term1418403, term1418403.getClass(), "visible", false);
        setBooleanField(term1418403, term1418403.getClass(), "enabled", false);
        setBooleanField(term1418403, term1418403.getClass(), "valid", false);
        setField(term1418403, term1418403.getClass(), "dropTarget", null);
        setField(term1418403, term1418403.getClass(), "popups", null);
        setField(term1418403, term1418403.getClass(), "name", null);
        setBooleanField(term1418403, term1418403.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1418403, term1418403.getClass(), "focusable", false);
        setIntField(term1418403, term1418403.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1418403, term1418403.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1418403, term1418403.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1418403, term1418403.getClass(), "acc", null);
        setField(term1418403, term1418403.getClass(), "minSize", null);
        setBooleanField(term1418403, term1418403.getClass(), "minSizeSet", false);
        setField(term1418403, term1418403.getClass(), "prefSize", null);
        setBooleanField(term1418403, term1418403.getClass(), "prefSizeSet", false);
        setField(term1418403, term1418403.getClass(), "maxSize", null);
        setBooleanField(term1418403, term1418403.getClass(), "maxSizeSet", false);
        setField(term1418403, term1418403.getClass(), "componentOrientation", null);
        setBooleanField(term1418403, term1418403.getClass(), "newEventsOnly", false);
        setField(term1418403, term1418403.getClass(), "componentListener", null);
        setField(term1418403, term1418403.getClass(), "focusListener", null);
        setField(term1418403, term1418403.getClass(), "hierarchyListener", null);
        setField(term1418403, term1418403.getClass(), "hierarchyBoundsListener", null);
        setField(term1418403, term1418403.getClass(), "keyListener", null);
        setField(term1418403, term1418403.getClass(), "mouseListener", null);
        setField(term1418403, term1418403.getClass(), "mouseMotionListener", null);
        setField(term1418403, term1418403.getClass(), "mouseWheelListener", null);
        setField(term1418403, term1418403.getClass(), "inputMethodListener", null);
        setLongField(term1418403, term1418403.getClass(), "eventMask", 0L);
        setField(term1418403, term1418403.getClass(), "changeSupport", null);
        setField(term1418403, term1418403.getClass(), "objectLock", null);
        setBooleanField(term1418403, term1418403.getClass(), "isPacked", false);
        setIntField(term1418403, term1418403.getClass(), "boundsOp", 0);
        setField(term1418403, term1418403.getClass(), "compoundShape", null);
        setField(term1418403, term1418403.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1418403, term1418403.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1418403, term1418403.getClass(), "backgroundEraseDisabled", false);
        setField(term1418403, term1418403.getClass(), "eventCache", null);
        setBooleanField(term1418403, term1418403.getClass(), "coalescingEnabled", false);
        setBooleanField(term1418403, term1418403.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1418403, term1418403.getClass(), "componentSerializedDataVersion", 0);
        setField(term1418403, term1418403.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "searchPlanetsForSpacePirate", argTypes, term1418403, args);
    }

};


