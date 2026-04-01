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
import java.lang.Boolean;

public class StarMapView_setAutoFocus_111552503328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term847556;
     Object term847599;

    public StarMapView_setAutoFocus_111552503328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term847556 = newInstance(Class.forName("org.openRealmOfStars.game.state.StarMapView"));
        setField(term847556, term847556.getClass(), "map", null);
        setField(term847556, term847556.getClass(), "players", null);
        setField(term847556, term847556.getClass(), "mapPanel", null);
        setField(term847556, term847556.getClass(), "infoPanel", null);
        setField(term847556, term847556.getClass(), "starMapMouseListener", null);
        setField(term847556, term847556.getClass(), "endTurnButton", null);
        setField(term847556, term847556.getClass(), "viewResearchButton", null);
        setField(term847556, term847556.getClass(), "viewSpaceShips", null);
        setField(term847556, term847556.getClass(), "viewStats", null);
        setField(term847556, term847556.getClass(), "viewLeader", null);
        setField(term847556, term847556.getClass(), "credProd", null);
        setField(term847556, term847556.getClass(), "reseProd", null);
        setField(term847556, term847556.getClass(), "happinessMeter", null);
        setField(term847556, term847556.getClass(), "fleetMeter", null);
        setBooleanField(term847556, term847556.getClass(), "readyToMove", false);
        setField(term847556, term847556.getClass(), "msgPanel", null);
        setBooleanField(term847556, term847556.getClass(), "autoFocus", false);
        setField(term847556, term847556.getClass(), "game", null);
        setBooleanField(term847556, term847556.getClass(), "isAlignmentXSet", false);
        setFloatField(term847556, term847556.getClass(), "alignmentX", 0.0F);
        setBooleanField(term847556, term847556.getClass(), "isAlignmentYSet", false);
        setFloatField(term847556, term847556.getClass(), "alignmentY", 0.0F);
        setField(term847556, term847556.getClass(), "ui", null);
        setField(term847556, term847556.getClass(), "listenerList", null);
        setField(term847556, term847556.getClass(), "clientProperties", null);
        setField(term847556, term847556.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term847556, term847556.getClass(), "autoscrolls", false);
        setField(term847556, term847556.getClass(), "border", null);
        setIntField(term847556, term847556.getClass(), "flags", 0);
        setField(term847556, term847556.getClass(), "inputVerifier", null);
        setBooleanField(term847556, term847556.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term847556, term847556.getClass(), "paintingChild", null);
        setField(term847556, term847556.getClass(), "popupMenu", null);
        setField(term847556, term847556.getClass(), "revalidateRunnableScheduled", null);
        setField(term847556, term847556.getClass(), "focusInputMap", null);
        setField(term847556, term847556.getClass(), "ancestorInputMap", null);
        setField(term847556, term847556.getClass(), "windowInputMap", null);
        setField(term847556, term847556.getClass(), "actionMap", null);
        setField(term847556, term847556.getClass(), "aaHint", null);
        setField(term847556, term847556.getClass(), "lcdRenderingHint", null);
        setField(term847556, term847556.getClass(), "component", null);
        setField(term847556, term847556.getClass(), "layoutMgr", null);
        setField(term847556, term847556.getClass(), "dispatcher", null);
        setField(term847556, term847556.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term847556, term847556.getClass(), "focusCycleRoot", false);
        setBooleanField(term847556, term847556.getClass(), "focusTraversalPolicyProvider", false);
        setField(term847556, term847556.getClass(), "printingThreads", null);
        setBooleanField(term847556, term847556.getClass(), "printing", false);
        setField(term847556, term847556.getClass(), "containerListener", null);
        setIntField(term847556, term847556.getClass(), "listeningChildren", 0);
        setIntField(term847556, term847556.getClass(), "listeningBoundsChildren", 0);
        setIntField(term847556, term847556.getClass(), "descendantsCount", 0);
        setField(term847556, term847556.getClass(), "preserveBackgroundColor", null);
        setIntField(term847556, term847556.getClass(), "numOfHWComponents", 0);
        setIntField(term847556, term847556.getClass(), "numOfLWComponents", 0);
        setField(term847556, term847556.getClass(), "modalComp", null);
        setField(term847556, term847556.getClass(), "modalAppContext", null);
        setIntField(term847556, term847556.getClass(), "containerSerializedDataVersion", 0);
        setField(term847556, term847556.getClass(), "peer", null);
        setField(term847556, term847556.getClass(), "parent", null);
        setField(term847556, term847556.getClass(), "appContext", null);
        setIntField(term847556, term847556.getClass(), "x", 0);
        setIntField(term847556, term847556.getClass(), "y", 0);
        setIntField(term847556, term847556.getClass(), "width", 0);
        setIntField(term847556, term847556.getClass(), "height", 0);
        setField(term847556, term847556.getClass(), "foreground", null);
        setField(term847556, term847556.getClass(), "background", null);
        setField(term847556, term847556.getClass(), "font", null);
        setField(term847556, term847556.getClass(), "peerFont", null);
        setField(term847556, term847556.getClass(), "cursor", null);
        setField(term847556, term847556.getClass(), "locale", null);
        setField(term847556, term847556.getClass(), "graphicsConfig", null);
        setField(term847556, term847556.getClass(), "bufferStrategy", null);
        setBooleanField(term847556, term847556.getClass(), "ignoreRepaint", false);
        setBooleanField(term847556, term847556.getClass(), "visible", false);
        setBooleanField(term847556, term847556.getClass(), "enabled", false);
        setBooleanField(term847556, term847556.getClass(), "valid", false);
        setField(term847556, term847556.getClass(), "dropTarget", null);
        setField(term847556, term847556.getClass(), "popups", null);
        setField(term847556, term847556.getClass(), "name", null);
        setBooleanField(term847556, term847556.getClass(), "nameExplicitlySet", false);
        setBooleanField(term847556, term847556.getClass(), "focusable", false);
        setIntField(term847556, term847556.getClass(), "isFocusTraversableOverridden", 0);
        setField(term847556, term847556.getClass(), "focusTraversalKeys", null);
        setBooleanField(term847556, term847556.getClass(), "focusTraversalKeysEnabled", false);
        setField(term847556, term847556.getClass(), "acc", null);
        setField(term847556, term847556.getClass(), "minSize", null);
        setBooleanField(term847556, term847556.getClass(), "minSizeSet", false);
        setField(term847556, term847556.getClass(), "prefSize", null);
        setBooleanField(term847556, term847556.getClass(), "prefSizeSet", false);
        setField(term847556, term847556.getClass(), "maxSize", null);
        setBooleanField(term847556, term847556.getClass(), "maxSizeSet", false);
        setField(term847556, term847556.getClass(), "componentOrientation", null);
        setBooleanField(term847556, term847556.getClass(), "newEventsOnly", false);
        setField(term847556, term847556.getClass(), "componentListener", null);
        setField(term847556, term847556.getClass(), "focusListener", null);
        setField(term847556, term847556.getClass(), "hierarchyListener", null);
        setField(term847556, term847556.getClass(), "hierarchyBoundsListener", null);
        setField(term847556, term847556.getClass(), "keyListener", null);
        setField(term847556, term847556.getClass(), "mouseListener", null);
        setField(term847556, term847556.getClass(), "mouseMotionListener", null);
        setField(term847556, term847556.getClass(), "mouseWheelListener", null);
        setField(term847556, term847556.getClass(), "inputMethodListener", null);
        setLongField(term847556, term847556.getClass(), "eventMask", 0L);
        setField(term847556, term847556.getClass(), "changeSupport", null);
        setField(term847556, term847556.getClass(), "objectLock", null);
        setBooleanField(term847556, term847556.getClass(), "isPacked", false);
        setIntField(term847556, term847556.getClass(), "boundsOp", 0);
        setField(term847556, term847556.getClass(), "compoundShape", null);
        setField(term847556, term847556.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term847556, term847556.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term847556, term847556.getClass(), "backgroundEraseDisabled", false);
        setField(term847556, term847556.getClass(), "eventCache", null);
        setBooleanField(term847556, term847556.getClass(), "coalescingEnabled", false);
        setBooleanField(term847556, term847556.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term847556, term847556.getClass(), "componentSerializedDataVersion", 0);
        setField(term847556, term847556.getClass(), "accessibleContext", null);
        term847599 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.StarMapView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term847599;
        callMethod(klass, "setAutoFocus", argTypes, term847556, args);
    }

};


