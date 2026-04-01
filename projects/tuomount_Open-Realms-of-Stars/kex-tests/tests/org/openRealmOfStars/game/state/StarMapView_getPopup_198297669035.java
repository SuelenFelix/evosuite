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

public class StarMapView_getPopup_198297669035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term847861;

    public StarMapView_getPopup_198297669035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term847861 = newInstance(Class.forName("org.openRealmOfStars.game.state.StarMapView"));
        setField(term847861, term847861.getClass(), "map", null);
        setField(term847861, term847861.getClass(), "players", null);
        setField(term847861, term847861.getClass(), "mapPanel", null);
        setField(term847861, term847861.getClass(), "infoPanel", null);
        setField(term847861, term847861.getClass(), "starMapMouseListener", null);
        setField(term847861, term847861.getClass(), "endTurnButton", null);
        setField(term847861, term847861.getClass(), "viewResearchButton", null);
        setField(term847861, term847861.getClass(), "viewSpaceShips", null);
        setField(term847861, term847861.getClass(), "viewStats", null);
        setField(term847861, term847861.getClass(), "viewLeader", null);
        setField(term847861, term847861.getClass(), "credProd", null);
        setField(term847861, term847861.getClass(), "reseProd", null);
        setField(term847861, term847861.getClass(), "happinessMeter", null);
        setField(term847861, term847861.getClass(), "fleetMeter", null);
        setBooleanField(term847861, term847861.getClass(), "readyToMove", false);
        setField(term847861, term847861.getClass(), "msgPanel", null);
        setBooleanField(term847861, term847861.getClass(), "autoFocus", false);
        setField(term847861, term847861.getClass(), "game", null);
        setBooleanField(term847861, term847861.getClass(), "isAlignmentXSet", false);
        setFloatField(term847861, term847861.getClass(), "alignmentX", 0.0F);
        setBooleanField(term847861, term847861.getClass(), "isAlignmentYSet", false);
        setFloatField(term847861, term847861.getClass(), "alignmentY", 0.0F);
        setField(term847861, term847861.getClass(), "ui", null);
        setField(term847861, term847861.getClass(), "listenerList", null);
        setField(term847861, term847861.getClass(), "clientProperties", null);
        setField(term847861, term847861.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term847861, term847861.getClass(), "autoscrolls", false);
        setField(term847861, term847861.getClass(), "border", null);
        setIntField(term847861, term847861.getClass(), "flags", 0);
        setField(term847861, term847861.getClass(), "inputVerifier", null);
        setBooleanField(term847861, term847861.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term847861, term847861.getClass(), "paintingChild", null);
        setField(term847861, term847861.getClass(), "popupMenu", null);
        setField(term847861, term847861.getClass(), "revalidateRunnableScheduled", null);
        setField(term847861, term847861.getClass(), "focusInputMap", null);
        setField(term847861, term847861.getClass(), "ancestorInputMap", null);
        setField(term847861, term847861.getClass(), "windowInputMap", null);
        setField(term847861, term847861.getClass(), "actionMap", null);
        setField(term847861, term847861.getClass(), "aaHint", null);
        setField(term847861, term847861.getClass(), "lcdRenderingHint", null);
        setField(term847861, term847861.getClass(), "component", null);
        setField(term847861, term847861.getClass(), "layoutMgr", null);
        setField(term847861, term847861.getClass(), "dispatcher", null);
        setField(term847861, term847861.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term847861, term847861.getClass(), "focusCycleRoot", false);
        setBooleanField(term847861, term847861.getClass(), "focusTraversalPolicyProvider", false);
        setField(term847861, term847861.getClass(), "printingThreads", null);
        setBooleanField(term847861, term847861.getClass(), "printing", false);
        setField(term847861, term847861.getClass(), "containerListener", null);
        setIntField(term847861, term847861.getClass(), "listeningChildren", 0);
        setIntField(term847861, term847861.getClass(), "listeningBoundsChildren", 0);
        setIntField(term847861, term847861.getClass(), "descendantsCount", 0);
        setField(term847861, term847861.getClass(), "preserveBackgroundColor", null);
        setIntField(term847861, term847861.getClass(), "numOfHWComponents", 0);
        setIntField(term847861, term847861.getClass(), "numOfLWComponents", 0);
        setField(term847861, term847861.getClass(), "modalComp", null);
        setField(term847861, term847861.getClass(), "modalAppContext", null);
        setIntField(term847861, term847861.getClass(), "containerSerializedDataVersion", 0);
        setField(term847861, term847861.getClass(), "peer", null);
        setField(term847861, term847861.getClass(), "parent", null);
        setField(term847861, term847861.getClass(), "appContext", null);
        setIntField(term847861, term847861.getClass(), "x", 0);
        setIntField(term847861, term847861.getClass(), "y", 0);
        setIntField(term847861, term847861.getClass(), "width", 0);
        setIntField(term847861, term847861.getClass(), "height", 0);
        setField(term847861, term847861.getClass(), "foreground", null);
        setField(term847861, term847861.getClass(), "background", null);
        setField(term847861, term847861.getClass(), "font", null);
        setField(term847861, term847861.getClass(), "peerFont", null);
        setField(term847861, term847861.getClass(), "cursor", null);
        setField(term847861, term847861.getClass(), "locale", null);
        setField(term847861, term847861.getClass(), "graphicsConfig", null);
        setField(term847861, term847861.getClass(), "bufferStrategy", null);
        setBooleanField(term847861, term847861.getClass(), "ignoreRepaint", false);
        setBooleanField(term847861, term847861.getClass(), "visible", false);
        setBooleanField(term847861, term847861.getClass(), "enabled", false);
        setBooleanField(term847861, term847861.getClass(), "valid", false);
        setField(term847861, term847861.getClass(), "dropTarget", null);
        setField(term847861, term847861.getClass(), "popups", null);
        setField(term847861, term847861.getClass(), "name", null);
        setBooleanField(term847861, term847861.getClass(), "nameExplicitlySet", false);
        setBooleanField(term847861, term847861.getClass(), "focusable", false);
        setIntField(term847861, term847861.getClass(), "isFocusTraversableOverridden", 0);
        setField(term847861, term847861.getClass(), "focusTraversalKeys", null);
        setBooleanField(term847861, term847861.getClass(), "focusTraversalKeysEnabled", false);
        setField(term847861, term847861.getClass(), "acc", null);
        setField(term847861, term847861.getClass(), "minSize", null);
        setBooleanField(term847861, term847861.getClass(), "minSizeSet", false);
        setField(term847861, term847861.getClass(), "prefSize", null);
        setBooleanField(term847861, term847861.getClass(), "prefSizeSet", false);
        setField(term847861, term847861.getClass(), "maxSize", null);
        setBooleanField(term847861, term847861.getClass(), "maxSizeSet", false);
        setField(term847861, term847861.getClass(), "componentOrientation", null);
        setBooleanField(term847861, term847861.getClass(), "newEventsOnly", false);
        setField(term847861, term847861.getClass(), "componentListener", null);
        setField(term847861, term847861.getClass(), "focusListener", null);
        setField(term847861, term847861.getClass(), "hierarchyListener", null);
        setField(term847861, term847861.getClass(), "hierarchyBoundsListener", null);
        setField(term847861, term847861.getClass(), "keyListener", null);
        setField(term847861, term847861.getClass(), "mouseListener", null);
        setField(term847861, term847861.getClass(), "mouseMotionListener", null);
        setField(term847861, term847861.getClass(), "mouseWheelListener", null);
        setField(term847861, term847861.getClass(), "inputMethodListener", null);
        setLongField(term847861, term847861.getClass(), "eventMask", 0L);
        setField(term847861, term847861.getClass(), "changeSupport", null);
        setField(term847861, term847861.getClass(), "objectLock", null);
        setBooleanField(term847861, term847861.getClass(), "isPacked", false);
        setIntField(term847861, term847861.getClass(), "boundsOp", 0);
        setField(term847861, term847861.getClass(), "compoundShape", null);
        setField(term847861, term847861.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term847861, term847861.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term847861, term847861.getClass(), "backgroundEraseDisabled", false);
        setField(term847861, term847861.getClass(), "eventCache", null);
        setBooleanField(term847861, term847861.getClass(), "coalescingEnabled", false);
        setBooleanField(term847861, term847861.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term847861, term847861.getClass(), "componentSerializedDataVersion", 0);
        setField(term847861, term847861.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.StarMapView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPopup", argTypes, term847861, args);
    }

};


