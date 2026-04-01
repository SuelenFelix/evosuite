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

public class StarMapView_checkForConflict_95622275337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term847949;

    public StarMapView_checkForConflict_95622275337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term847949 = newInstance(Class.forName("org.openRealmOfStars.game.state.StarMapView"));
        setField(term847949, term847949.getClass(), "map", null);
        setField(term847949, term847949.getClass(), "players", null);
        setField(term847949, term847949.getClass(), "mapPanel", null);
        setField(term847949, term847949.getClass(), "infoPanel", null);
        setField(term847949, term847949.getClass(), "starMapMouseListener", null);
        setField(term847949, term847949.getClass(), "endTurnButton", null);
        setField(term847949, term847949.getClass(), "viewResearchButton", null);
        setField(term847949, term847949.getClass(), "viewSpaceShips", null);
        setField(term847949, term847949.getClass(), "viewStats", null);
        setField(term847949, term847949.getClass(), "viewLeader", null);
        setField(term847949, term847949.getClass(), "credProd", null);
        setField(term847949, term847949.getClass(), "reseProd", null);
        setField(term847949, term847949.getClass(), "happinessMeter", null);
        setField(term847949, term847949.getClass(), "fleetMeter", null);
        setBooleanField(term847949, term847949.getClass(), "readyToMove", false);
        setField(term847949, term847949.getClass(), "msgPanel", null);
        setBooleanField(term847949, term847949.getClass(), "autoFocus", false);
        setField(term847949, term847949.getClass(), "game", null);
        setBooleanField(term847949, term847949.getClass(), "isAlignmentXSet", false);
        setFloatField(term847949, term847949.getClass(), "alignmentX", 0.0F);
        setBooleanField(term847949, term847949.getClass(), "isAlignmentYSet", false);
        setFloatField(term847949, term847949.getClass(), "alignmentY", 0.0F);
        setField(term847949, term847949.getClass(), "ui", null);
        setField(term847949, term847949.getClass(), "listenerList", null);
        setField(term847949, term847949.getClass(), "clientProperties", null);
        setField(term847949, term847949.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term847949, term847949.getClass(), "autoscrolls", false);
        setField(term847949, term847949.getClass(), "border", null);
        setIntField(term847949, term847949.getClass(), "flags", 0);
        setField(term847949, term847949.getClass(), "inputVerifier", null);
        setBooleanField(term847949, term847949.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term847949, term847949.getClass(), "paintingChild", null);
        setField(term847949, term847949.getClass(), "popupMenu", null);
        setField(term847949, term847949.getClass(), "revalidateRunnableScheduled", null);
        setField(term847949, term847949.getClass(), "focusInputMap", null);
        setField(term847949, term847949.getClass(), "ancestorInputMap", null);
        setField(term847949, term847949.getClass(), "windowInputMap", null);
        setField(term847949, term847949.getClass(), "actionMap", null);
        setField(term847949, term847949.getClass(), "aaHint", null);
        setField(term847949, term847949.getClass(), "lcdRenderingHint", null);
        setField(term847949, term847949.getClass(), "component", null);
        setField(term847949, term847949.getClass(), "layoutMgr", null);
        setField(term847949, term847949.getClass(), "dispatcher", null);
        setField(term847949, term847949.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term847949, term847949.getClass(), "focusCycleRoot", false);
        setBooleanField(term847949, term847949.getClass(), "focusTraversalPolicyProvider", false);
        setField(term847949, term847949.getClass(), "printingThreads", null);
        setBooleanField(term847949, term847949.getClass(), "printing", false);
        setField(term847949, term847949.getClass(), "containerListener", null);
        setIntField(term847949, term847949.getClass(), "listeningChildren", 0);
        setIntField(term847949, term847949.getClass(), "listeningBoundsChildren", 0);
        setIntField(term847949, term847949.getClass(), "descendantsCount", 0);
        setField(term847949, term847949.getClass(), "preserveBackgroundColor", null);
        setIntField(term847949, term847949.getClass(), "numOfHWComponents", 0);
        setIntField(term847949, term847949.getClass(), "numOfLWComponents", 0);
        setField(term847949, term847949.getClass(), "modalComp", null);
        setField(term847949, term847949.getClass(), "modalAppContext", null);
        setIntField(term847949, term847949.getClass(), "containerSerializedDataVersion", 0);
        setField(term847949, term847949.getClass(), "peer", null);
        setField(term847949, term847949.getClass(), "parent", null);
        setField(term847949, term847949.getClass(), "appContext", null);
        setIntField(term847949, term847949.getClass(), "x", 0);
        setIntField(term847949, term847949.getClass(), "y", 0);
        setIntField(term847949, term847949.getClass(), "width", 0);
        setIntField(term847949, term847949.getClass(), "height", 0);
        setField(term847949, term847949.getClass(), "foreground", null);
        setField(term847949, term847949.getClass(), "background", null);
        setField(term847949, term847949.getClass(), "font", null);
        setField(term847949, term847949.getClass(), "peerFont", null);
        setField(term847949, term847949.getClass(), "cursor", null);
        setField(term847949, term847949.getClass(), "locale", null);
        setField(term847949, term847949.getClass(), "graphicsConfig", null);
        setField(term847949, term847949.getClass(), "bufferStrategy", null);
        setBooleanField(term847949, term847949.getClass(), "ignoreRepaint", false);
        setBooleanField(term847949, term847949.getClass(), "visible", false);
        setBooleanField(term847949, term847949.getClass(), "enabled", false);
        setBooleanField(term847949, term847949.getClass(), "valid", false);
        setField(term847949, term847949.getClass(), "dropTarget", null);
        setField(term847949, term847949.getClass(), "popups", null);
        setField(term847949, term847949.getClass(), "name", null);
        setBooleanField(term847949, term847949.getClass(), "nameExplicitlySet", false);
        setBooleanField(term847949, term847949.getClass(), "focusable", false);
        setIntField(term847949, term847949.getClass(), "isFocusTraversableOverridden", 0);
        setField(term847949, term847949.getClass(), "focusTraversalKeys", null);
        setBooleanField(term847949, term847949.getClass(), "focusTraversalKeysEnabled", false);
        setField(term847949, term847949.getClass(), "acc", null);
        setField(term847949, term847949.getClass(), "minSize", null);
        setBooleanField(term847949, term847949.getClass(), "minSizeSet", false);
        setField(term847949, term847949.getClass(), "prefSize", null);
        setBooleanField(term847949, term847949.getClass(), "prefSizeSet", false);
        setField(term847949, term847949.getClass(), "maxSize", null);
        setBooleanField(term847949, term847949.getClass(), "maxSizeSet", false);
        setField(term847949, term847949.getClass(), "componentOrientation", null);
        setBooleanField(term847949, term847949.getClass(), "newEventsOnly", false);
        setField(term847949, term847949.getClass(), "componentListener", null);
        setField(term847949, term847949.getClass(), "focusListener", null);
        setField(term847949, term847949.getClass(), "hierarchyListener", null);
        setField(term847949, term847949.getClass(), "hierarchyBoundsListener", null);
        setField(term847949, term847949.getClass(), "keyListener", null);
        setField(term847949, term847949.getClass(), "mouseListener", null);
        setField(term847949, term847949.getClass(), "mouseMotionListener", null);
        setField(term847949, term847949.getClass(), "mouseWheelListener", null);
        setField(term847949, term847949.getClass(), "inputMethodListener", null);
        setLongField(term847949, term847949.getClass(), "eventMask", 0L);
        setField(term847949, term847949.getClass(), "changeSupport", null);
        setField(term847949, term847949.getClass(), "objectLock", null);
        setBooleanField(term847949, term847949.getClass(), "isPacked", false);
        setIntField(term847949, term847949.getClass(), "boundsOp", 0);
        setField(term847949, term847949.getClass(), "compoundShape", null);
        setField(term847949, term847949.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term847949, term847949.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term847949, term847949.getClass(), "backgroundEraseDisabled", false);
        setField(term847949, term847949.getClass(), "eventCache", null);
        setBooleanField(term847949, term847949.getClass(), "coalescingEnabled", false);
        setBooleanField(term847949, term847949.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term847949, term847949.getClass(), "componentSerializedDataVersion", 0);
        setField(term847949, term847949.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.StarMapView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkForConflict", argTypes, term847949, args);
    }

};


