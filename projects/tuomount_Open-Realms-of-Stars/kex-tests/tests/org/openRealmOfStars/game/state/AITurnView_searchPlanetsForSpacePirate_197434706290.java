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

public class AITurnView_searchPlanetsForSpacePirate_197434706290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1378127;

    public AITurnView_searchPlanetsForSpacePirate_197434706290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1378127 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1378127, term1378127.getClass(), "label", null);
        setField(term1378127, term1378127.getClass(), "game", null);
        setIntField(term1378127, term1378127.getClass(), "textAnim", 0);
        setIntField(term1378127, term1378127.getClass(), "cx", 0);
        setIntField(term1378127, term1378127.getClass(), "cy", 0);
        setField(term1378127, term1378127.getClass(), "aiThread", null);
        setBooleanField(term1378127, term1378127.getClass(), "readyToMove", false);
        setField(term1378127, term1378127.getClass(), "nextState", null);
        setField(term1378127, term1378127.getClass(), "nextStateObject", null);
        setBooleanField(term1378127, term1378127.getClass(), "isAlignmentXSet", false);
        setFloatField(term1378127, term1378127.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1378127, term1378127.getClass(), "isAlignmentYSet", false);
        setFloatField(term1378127, term1378127.getClass(), "alignmentY", 0.0F);
        setField(term1378127, term1378127.getClass(), "ui", null);
        setField(term1378127, term1378127.getClass(), "listenerList", null);
        setField(term1378127, term1378127.getClass(), "clientProperties", null);
        setField(term1378127, term1378127.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1378127, term1378127.getClass(), "autoscrolls", false);
        setField(term1378127, term1378127.getClass(), "border", null);
        setIntField(term1378127, term1378127.getClass(), "flags", 0);
        setField(term1378127, term1378127.getClass(), "inputVerifier", null);
        setBooleanField(term1378127, term1378127.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1378127, term1378127.getClass(), "paintingChild", null);
        setField(term1378127, term1378127.getClass(), "popupMenu", null);
        setField(term1378127, term1378127.getClass(), "revalidateRunnableScheduled", null);
        setField(term1378127, term1378127.getClass(), "focusInputMap", null);
        setField(term1378127, term1378127.getClass(), "ancestorInputMap", null);
        setField(term1378127, term1378127.getClass(), "windowInputMap", null);
        setField(term1378127, term1378127.getClass(), "actionMap", null);
        setField(term1378127, term1378127.getClass(), "aaHint", null);
        setField(term1378127, term1378127.getClass(), "lcdRenderingHint", null);
        setField(term1378127, term1378127.getClass(), "component", null);
        setField(term1378127, term1378127.getClass(), "layoutMgr", null);
        setField(term1378127, term1378127.getClass(), "dispatcher", null);
        setField(term1378127, term1378127.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1378127, term1378127.getClass(), "focusCycleRoot", false);
        setBooleanField(term1378127, term1378127.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1378127, term1378127.getClass(), "printingThreads", null);
        setBooleanField(term1378127, term1378127.getClass(), "printing", false);
        setField(term1378127, term1378127.getClass(), "containerListener", null);
        setIntField(term1378127, term1378127.getClass(), "listeningChildren", 0);
        setIntField(term1378127, term1378127.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1378127, term1378127.getClass(), "descendantsCount", 0);
        setField(term1378127, term1378127.getClass(), "preserveBackgroundColor", null);
        setIntField(term1378127, term1378127.getClass(), "numOfHWComponents", 0);
        setIntField(term1378127, term1378127.getClass(), "numOfLWComponents", 0);
        setField(term1378127, term1378127.getClass(), "modalComp", null);
        setField(term1378127, term1378127.getClass(), "modalAppContext", null);
        setIntField(term1378127, term1378127.getClass(), "containerSerializedDataVersion", 0);
        setField(term1378127, term1378127.getClass(), "peer", null);
        setField(term1378127, term1378127.getClass(), "parent", null);
        setField(term1378127, term1378127.getClass(), "appContext", null);
        setIntField(term1378127, term1378127.getClass(), "x", 0);
        setIntField(term1378127, term1378127.getClass(), "y", 0);
        setIntField(term1378127, term1378127.getClass(), "width", 0);
        setIntField(term1378127, term1378127.getClass(), "height", 0);
        setField(term1378127, term1378127.getClass(), "foreground", null);
        setField(term1378127, term1378127.getClass(), "background", null);
        setField(term1378127, term1378127.getClass(), "font", null);
        setField(term1378127, term1378127.getClass(), "peerFont", null);
        setField(term1378127, term1378127.getClass(), "cursor", null);
        setField(term1378127, term1378127.getClass(), "locale", null);
        setField(term1378127, term1378127.getClass(), "graphicsConfig", null);
        setField(term1378127, term1378127.getClass(), "bufferStrategy", null);
        setBooleanField(term1378127, term1378127.getClass(), "ignoreRepaint", false);
        setBooleanField(term1378127, term1378127.getClass(), "visible", false);
        setBooleanField(term1378127, term1378127.getClass(), "enabled", false);
        setBooleanField(term1378127, term1378127.getClass(), "valid", false);
        setField(term1378127, term1378127.getClass(), "dropTarget", null);
        setField(term1378127, term1378127.getClass(), "popups", null);
        setField(term1378127, term1378127.getClass(), "name", null);
        setBooleanField(term1378127, term1378127.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1378127, term1378127.getClass(), "focusable", false);
        setIntField(term1378127, term1378127.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1378127, term1378127.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1378127, term1378127.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1378127, term1378127.getClass(), "acc", null);
        setField(term1378127, term1378127.getClass(), "minSize", null);
        setBooleanField(term1378127, term1378127.getClass(), "minSizeSet", false);
        setField(term1378127, term1378127.getClass(), "prefSize", null);
        setBooleanField(term1378127, term1378127.getClass(), "prefSizeSet", false);
        setField(term1378127, term1378127.getClass(), "maxSize", null);
        setBooleanField(term1378127, term1378127.getClass(), "maxSizeSet", false);
        setField(term1378127, term1378127.getClass(), "componentOrientation", null);
        setBooleanField(term1378127, term1378127.getClass(), "newEventsOnly", false);
        setField(term1378127, term1378127.getClass(), "componentListener", null);
        setField(term1378127, term1378127.getClass(), "focusListener", null);
        setField(term1378127, term1378127.getClass(), "hierarchyListener", null);
        setField(term1378127, term1378127.getClass(), "hierarchyBoundsListener", null);
        setField(term1378127, term1378127.getClass(), "keyListener", null);
        setField(term1378127, term1378127.getClass(), "mouseListener", null);
        setField(term1378127, term1378127.getClass(), "mouseMotionListener", null);
        setField(term1378127, term1378127.getClass(), "mouseWheelListener", null);
        setField(term1378127, term1378127.getClass(), "inputMethodListener", null);
        setLongField(term1378127, term1378127.getClass(), "eventMask", 0L);
        setField(term1378127, term1378127.getClass(), "changeSupport", null);
        setField(term1378127, term1378127.getClass(), "objectLock", null);
        setBooleanField(term1378127, term1378127.getClass(), "isPacked", false);
        setIntField(term1378127, term1378127.getClass(), "boundsOp", 0);
        setField(term1378127, term1378127.getClass(), "compoundShape", null);
        setField(term1378127, term1378127.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1378127, term1378127.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1378127, term1378127.getClass(), "backgroundEraseDisabled", false);
        setField(term1378127, term1378127.getClass(), "eventCache", null);
        setBooleanField(term1378127, term1378127.getClass(), "coalescingEnabled", false);
        setBooleanField(term1378127, term1378127.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1378127, term1378127.getClass(), "componentSerializedDataVersion", 0);
        setField(term1378127, term1378127.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "searchPlanetsForSpacePirate", argTypes, term1378127, args);
    }

};


