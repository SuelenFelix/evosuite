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

public class StarMapView_isAutoFocus_211387101927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term847513;

    public StarMapView_isAutoFocus_211387101927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term847513 = newInstance(Class.forName("org.openRealmOfStars.game.state.StarMapView"));
        setField(term847513, term847513.getClass(), "map", null);
        setField(term847513, term847513.getClass(), "players", null);
        setField(term847513, term847513.getClass(), "mapPanel", null);
        setField(term847513, term847513.getClass(), "infoPanel", null);
        setField(term847513, term847513.getClass(), "starMapMouseListener", null);
        setField(term847513, term847513.getClass(), "endTurnButton", null);
        setField(term847513, term847513.getClass(), "viewResearchButton", null);
        setField(term847513, term847513.getClass(), "viewSpaceShips", null);
        setField(term847513, term847513.getClass(), "viewStats", null);
        setField(term847513, term847513.getClass(), "viewLeader", null);
        setField(term847513, term847513.getClass(), "credProd", null);
        setField(term847513, term847513.getClass(), "reseProd", null);
        setField(term847513, term847513.getClass(), "happinessMeter", null);
        setField(term847513, term847513.getClass(), "fleetMeter", null);
        setBooleanField(term847513, term847513.getClass(), "readyToMove", false);
        setField(term847513, term847513.getClass(), "msgPanel", null);
        setBooleanField(term847513, term847513.getClass(), "autoFocus", false);
        setField(term847513, term847513.getClass(), "game", null);
        setBooleanField(term847513, term847513.getClass(), "isAlignmentXSet", false);
        setFloatField(term847513, term847513.getClass(), "alignmentX", 0.0F);
        setBooleanField(term847513, term847513.getClass(), "isAlignmentYSet", false);
        setFloatField(term847513, term847513.getClass(), "alignmentY", 0.0F);
        setField(term847513, term847513.getClass(), "ui", null);
        setField(term847513, term847513.getClass(), "listenerList", null);
        setField(term847513, term847513.getClass(), "clientProperties", null);
        setField(term847513, term847513.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term847513, term847513.getClass(), "autoscrolls", false);
        setField(term847513, term847513.getClass(), "border", null);
        setIntField(term847513, term847513.getClass(), "flags", 0);
        setField(term847513, term847513.getClass(), "inputVerifier", null);
        setBooleanField(term847513, term847513.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term847513, term847513.getClass(), "paintingChild", null);
        setField(term847513, term847513.getClass(), "popupMenu", null);
        setField(term847513, term847513.getClass(), "revalidateRunnableScheduled", null);
        setField(term847513, term847513.getClass(), "focusInputMap", null);
        setField(term847513, term847513.getClass(), "ancestorInputMap", null);
        setField(term847513, term847513.getClass(), "windowInputMap", null);
        setField(term847513, term847513.getClass(), "actionMap", null);
        setField(term847513, term847513.getClass(), "aaHint", null);
        setField(term847513, term847513.getClass(), "lcdRenderingHint", null);
        setField(term847513, term847513.getClass(), "component", null);
        setField(term847513, term847513.getClass(), "layoutMgr", null);
        setField(term847513, term847513.getClass(), "dispatcher", null);
        setField(term847513, term847513.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term847513, term847513.getClass(), "focusCycleRoot", false);
        setBooleanField(term847513, term847513.getClass(), "focusTraversalPolicyProvider", false);
        setField(term847513, term847513.getClass(), "printingThreads", null);
        setBooleanField(term847513, term847513.getClass(), "printing", false);
        setField(term847513, term847513.getClass(), "containerListener", null);
        setIntField(term847513, term847513.getClass(), "listeningChildren", 0);
        setIntField(term847513, term847513.getClass(), "listeningBoundsChildren", 0);
        setIntField(term847513, term847513.getClass(), "descendantsCount", 0);
        setField(term847513, term847513.getClass(), "preserveBackgroundColor", null);
        setIntField(term847513, term847513.getClass(), "numOfHWComponents", 0);
        setIntField(term847513, term847513.getClass(), "numOfLWComponents", 0);
        setField(term847513, term847513.getClass(), "modalComp", null);
        setField(term847513, term847513.getClass(), "modalAppContext", null);
        setIntField(term847513, term847513.getClass(), "containerSerializedDataVersion", 0);
        setField(term847513, term847513.getClass(), "peer", null);
        setField(term847513, term847513.getClass(), "parent", null);
        setField(term847513, term847513.getClass(), "appContext", null);
        setIntField(term847513, term847513.getClass(), "x", 0);
        setIntField(term847513, term847513.getClass(), "y", 0);
        setIntField(term847513, term847513.getClass(), "width", 0);
        setIntField(term847513, term847513.getClass(), "height", 0);
        setField(term847513, term847513.getClass(), "foreground", null);
        setField(term847513, term847513.getClass(), "background", null);
        setField(term847513, term847513.getClass(), "font", null);
        setField(term847513, term847513.getClass(), "peerFont", null);
        setField(term847513, term847513.getClass(), "cursor", null);
        setField(term847513, term847513.getClass(), "locale", null);
        setField(term847513, term847513.getClass(), "graphicsConfig", null);
        setField(term847513, term847513.getClass(), "bufferStrategy", null);
        setBooleanField(term847513, term847513.getClass(), "ignoreRepaint", false);
        setBooleanField(term847513, term847513.getClass(), "visible", false);
        setBooleanField(term847513, term847513.getClass(), "enabled", false);
        setBooleanField(term847513, term847513.getClass(), "valid", false);
        setField(term847513, term847513.getClass(), "dropTarget", null);
        setField(term847513, term847513.getClass(), "popups", null);
        setField(term847513, term847513.getClass(), "name", null);
        setBooleanField(term847513, term847513.getClass(), "nameExplicitlySet", false);
        setBooleanField(term847513, term847513.getClass(), "focusable", false);
        setIntField(term847513, term847513.getClass(), "isFocusTraversableOverridden", 0);
        setField(term847513, term847513.getClass(), "focusTraversalKeys", null);
        setBooleanField(term847513, term847513.getClass(), "focusTraversalKeysEnabled", false);
        setField(term847513, term847513.getClass(), "acc", null);
        setField(term847513, term847513.getClass(), "minSize", null);
        setBooleanField(term847513, term847513.getClass(), "minSizeSet", false);
        setField(term847513, term847513.getClass(), "prefSize", null);
        setBooleanField(term847513, term847513.getClass(), "prefSizeSet", false);
        setField(term847513, term847513.getClass(), "maxSize", null);
        setBooleanField(term847513, term847513.getClass(), "maxSizeSet", false);
        setField(term847513, term847513.getClass(), "componentOrientation", null);
        setBooleanField(term847513, term847513.getClass(), "newEventsOnly", false);
        setField(term847513, term847513.getClass(), "componentListener", null);
        setField(term847513, term847513.getClass(), "focusListener", null);
        setField(term847513, term847513.getClass(), "hierarchyListener", null);
        setField(term847513, term847513.getClass(), "hierarchyBoundsListener", null);
        setField(term847513, term847513.getClass(), "keyListener", null);
        setField(term847513, term847513.getClass(), "mouseListener", null);
        setField(term847513, term847513.getClass(), "mouseMotionListener", null);
        setField(term847513, term847513.getClass(), "mouseWheelListener", null);
        setField(term847513, term847513.getClass(), "inputMethodListener", null);
        setLongField(term847513, term847513.getClass(), "eventMask", 0L);
        setField(term847513, term847513.getClass(), "changeSupport", null);
        setField(term847513, term847513.getClass(), "objectLock", null);
        setBooleanField(term847513, term847513.getClass(), "isPacked", false);
        setIntField(term847513, term847513.getClass(), "boundsOp", 0);
        setField(term847513, term847513.getClass(), "compoundShape", null);
        setField(term847513, term847513.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term847513, term847513.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term847513, term847513.getClass(), "backgroundEraseDisabled", false);
        setField(term847513, term847513.getClass(), "eventCache", null);
        setBooleanField(term847513, term847513.getClass(), "coalescingEnabled", false);
        setBooleanField(term847513, term847513.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term847513, term847513.getClass(), "componentSerializedDataVersion", 0);
        setField(term847513, term847513.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.StarMapView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAutoFocus", argTypes, term847513, args);
    }

};


