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

public class StarMapView_getEndTurnButton_48530858529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term847601;

    public StarMapView_getEndTurnButton_48530858529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term847601 = newInstance(Class.forName("org.openRealmOfStars.game.state.StarMapView"));
        setField(term847601, term847601.getClass(), "map", null);
        setField(term847601, term847601.getClass(), "players", null);
        setField(term847601, term847601.getClass(), "mapPanel", null);
        setField(term847601, term847601.getClass(), "infoPanel", null);
        setField(term847601, term847601.getClass(), "starMapMouseListener", null);
        setField(term847601, term847601.getClass(), "endTurnButton", null);
        setField(term847601, term847601.getClass(), "viewResearchButton", null);
        setField(term847601, term847601.getClass(), "viewSpaceShips", null);
        setField(term847601, term847601.getClass(), "viewStats", null);
        setField(term847601, term847601.getClass(), "viewLeader", null);
        setField(term847601, term847601.getClass(), "credProd", null);
        setField(term847601, term847601.getClass(), "reseProd", null);
        setField(term847601, term847601.getClass(), "happinessMeter", null);
        setField(term847601, term847601.getClass(), "fleetMeter", null);
        setBooleanField(term847601, term847601.getClass(), "readyToMove", false);
        setField(term847601, term847601.getClass(), "msgPanel", null);
        setBooleanField(term847601, term847601.getClass(), "autoFocus", false);
        setField(term847601, term847601.getClass(), "game", null);
        setBooleanField(term847601, term847601.getClass(), "isAlignmentXSet", false);
        setFloatField(term847601, term847601.getClass(), "alignmentX", 0.0F);
        setBooleanField(term847601, term847601.getClass(), "isAlignmentYSet", false);
        setFloatField(term847601, term847601.getClass(), "alignmentY", 0.0F);
        setField(term847601, term847601.getClass(), "ui", null);
        setField(term847601, term847601.getClass(), "listenerList", null);
        setField(term847601, term847601.getClass(), "clientProperties", null);
        setField(term847601, term847601.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term847601, term847601.getClass(), "autoscrolls", false);
        setField(term847601, term847601.getClass(), "border", null);
        setIntField(term847601, term847601.getClass(), "flags", 0);
        setField(term847601, term847601.getClass(), "inputVerifier", null);
        setBooleanField(term847601, term847601.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term847601, term847601.getClass(), "paintingChild", null);
        setField(term847601, term847601.getClass(), "popupMenu", null);
        setField(term847601, term847601.getClass(), "revalidateRunnableScheduled", null);
        setField(term847601, term847601.getClass(), "focusInputMap", null);
        setField(term847601, term847601.getClass(), "ancestorInputMap", null);
        setField(term847601, term847601.getClass(), "windowInputMap", null);
        setField(term847601, term847601.getClass(), "actionMap", null);
        setField(term847601, term847601.getClass(), "aaHint", null);
        setField(term847601, term847601.getClass(), "lcdRenderingHint", null);
        setField(term847601, term847601.getClass(), "component", null);
        setField(term847601, term847601.getClass(), "layoutMgr", null);
        setField(term847601, term847601.getClass(), "dispatcher", null);
        setField(term847601, term847601.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term847601, term847601.getClass(), "focusCycleRoot", false);
        setBooleanField(term847601, term847601.getClass(), "focusTraversalPolicyProvider", false);
        setField(term847601, term847601.getClass(), "printingThreads", null);
        setBooleanField(term847601, term847601.getClass(), "printing", false);
        setField(term847601, term847601.getClass(), "containerListener", null);
        setIntField(term847601, term847601.getClass(), "listeningChildren", 0);
        setIntField(term847601, term847601.getClass(), "listeningBoundsChildren", 0);
        setIntField(term847601, term847601.getClass(), "descendantsCount", 0);
        setField(term847601, term847601.getClass(), "preserveBackgroundColor", null);
        setIntField(term847601, term847601.getClass(), "numOfHWComponents", 0);
        setIntField(term847601, term847601.getClass(), "numOfLWComponents", 0);
        setField(term847601, term847601.getClass(), "modalComp", null);
        setField(term847601, term847601.getClass(), "modalAppContext", null);
        setIntField(term847601, term847601.getClass(), "containerSerializedDataVersion", 0);
        setField(term847601, term847601.getClass(), "peer", null);
        setField(term847601, term847601.getClass(), "parent", null);
        setField(term847601, term847601.getClass(), "appContext", null);
        setIntField(term847601, term847601.getClass(), "x", 0);
        setIntField(term847601, term847601.getClass(), "y", 0);
        setIntField(term847601, term847601.getClass(), "width", 0);
        setIntField(term847601, term847601.getClass(), "height", 0);
        setField(term847601, term847601.getClass(), "foreground", null);
        setField(term847601, term847601.getClass(), "background", null);
        setField(term847601, term847601.getClass(), "font", null);
        setField(term847601, term847601.getClass(), "peerFont", null);
        setField(term847601, term847601.getClass(), "cursor", null);
        setField(term847601, term847601.getClass(), "locale", null);
        setField(term847601, term847601.getClass(), "graphicsConfig", null);
        setField(term847601, term847601.getClass(), "bufferStrategy", null);
        setBooleanField(term847601, term847601.getClass(), "ignoreRepaint", false);
        setBooleanField(term847601, term847601.getClass(), "visible", false);
        setBooleanField(term847601, term847601.getClass(), "enabled", false);
        setBooleanField(term847601, term847601.getClass(), "valid", false);
        setField(term847601, term847601.getClass(), "dropTarget", null);
        setField(term847601, term847601.getClass(), "popups", null);
        setField(term847601, term847601.getClass(), "name", null);
        setBooleanField(term847601, term847601.getClass(), "nameExplicitlySet", false);
        setBooleanField(term847601, term847601.getClass(), "focusable", false);
        setIntField(term847601, term847601.getClass(), "isFocusTraversableOverridden", 0);
        setField(term847601, term847601.getClass(), "focusTraversalKeys", null);
        setBooleanField(term847601, term847601.getClass(), "focusTraversalKeysEnabled", false);
        setField(term847601, term847601.getClass(), "acc", null);
        setField(term847601, term847601.getClass(), "minSize", null);
        setBooleanField(term847601, term847601.getClass(), "minSizeSet", false);
        setField(term847601, term847601.getClass(), "prefSize", null);
        setBooleanField(term847601, term847601.getClass(), "prefSizeSet", false);
        setField(term847601, term847601.getClass(), "maxSize", null);
        setBooleanField(term847601, term847601.getClass(), "maxSizeSet", false);
        setField(term847601, term847601.getClass(), "componentOrientation", null);
        setBooleanField(term847601, term847601.getClass(), "newEventsOnly", false);
        setField(term847601, term847601.getClass(), "componentListener", null);
        setField(term847601, term847601.getClass(), "focusListener", null);
        setField(term847601, term847601.getClass(), "hierarchyListener", null);
        setField(term847601, term847601.getClass(), "hierarchyBoundsListener", null);
        setField(term847601, term847601.getClass(), "keyListener", null);
        setField(term847601, term847601.getClass(), "mouseListener", null);
        setField(term847601, term847601.getClass(), "mouseMotionListener", null);
        setField(term847601, term847601.getClass(), "mouseWheelListener", null);
        setField(term847601, term847601.getClass(), "inputMethodListener", null);
        setLongField(term847601, term847601.getClass(), "eventMask", 0L);
        setField(term847601, term847601.getClass(), "changeSupport", null);
        setField(term847601, term847601.getClass(), "objectLock", null);
        setBooleanField(term847601, term847601.getClass(), "isPacked", false);
        setIntField(term847601, term847601.getClass(), "boundsOp", 0);
        setField(term847601, term847601.getClass(), "compoundShape", null);
        setField(term847601, term847601.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term847601, term847601.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term847601, term847601.getClass(), "backgroundEraseDisabled", false);
        setField(term847601, term847601.getClass(), "eventCache", null);
        setBooleanField(term847601, term847601.getClass(), "coalescingEnabled", false);
        setBooleanField(term847601, term847601.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term847601, term847601.getClass(), "componentSerializedDataVersion", 0);
        setField(term847601, term847601.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.StarMapView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndTurnButton", argTypes, term847601, args);
    }

};


