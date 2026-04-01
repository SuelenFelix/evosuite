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

public class StarMapView_updateMessagePanel_25615365825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term847427;

    public StarMapView_updateMessagePanel_25615365825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term847427 = newInstance(Class.forName("org.openRealmOfStars.game.state.StarMapView"));
        setField(term847427, term847427.getClass(), "map", null);
        setField(term847427, term847427.getClass(), "players", null);
        setField(term847427, term847427.getClass(), "mapPanel", null);
        setField(term847427, term847427.getClass(), "infoPanel", null);
        setField(term847427, term847427.getClass(), "starMapMouseListener", null);
        setField(term847427, term847427.getClass(), "endTurnButton", null);
        setField(term847427, term847427.getClass(), "viewResearchButton", null);
        setField(term847427, term847427.getClass(), "viewSpaceShips", null);
        setField(term847427, term847427.getClass(), "viewStats", null);
        setField(term847427, term847427.getClass(), "viewLeader", null);
        setField(term847427, term847427.getClass(), "credProd", null);
        setField(term847427, term847427.getClass(), "reseProd", null);
        setField(term847427, term847427.getClass(), "happinessMeter", null);
        setField(term847427, term847427.getClass(), "fleetMeter", null);
        setBooleanField(term847427, term847427.getClass(), "readyToMove", false);
        setField(term847427, term847427.getClass(), "msgPanel", null);
        setBooleanField(term847427, term847427.getClass(), "autoFocus", false);
        setField(term847427, term847427.getClass(), "game", null);
        setBooleanField(term847427, term847427.getClass(), "isAlignmentXSet", false);
        setFloatField(term847427, term847427.getClass(), "alignmentX", 0.0F);
        setBooleanField(term847427, term847427.getClass(), "isAlignmentYSet", false);
        setFloatField(term847427, term847427.getClass(), "alignmentY", 0.0F);
        setField(term847427, term847427.getClass(), "ui", null);
        setField(term847427, term847427.getClass(), "listenerList", null);
        setField(term847427, term847427.getClass(), "clientProperties", null);
        setField(term847427, term847427.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term847427, term847427.getClass(), "autoscrolls", false);
        setField(term847427, term847427.getClass(), "border", null);
        setIntField(term847427, term847427.getClass(), "flags", 0);
        setField(term847427, term847427.getClass(), "inputVerifier", null);
        setBooleanField(term847427, term847427.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term847427, term847427.getClass(), "paintingChild", null);
        setField(term847427, term847427.getClass(), "popupMenu", null);
        setField(term847427, term847427.getClass(), "revalidateRunnableScheduled", null);
        setField(term847427, term847427.getClass(), "focusInputMap", null);
        setField(term847427, term847427.getClass(), "ancestorInputMap", null);
        setField(term847427, term847427.getClass(), "windowInputMap", null);
        setField(term847427, term847427.getClass(), "actionMap", null);
        setField(term847427, term847427.getClass(), "aaHint", null);
        setField(term847427, term847427.getClass(), "lcdRenderingHint", null);
        setField(term847427, term847427.getClass(), "component", null);
        setField(term847427, term847427.getClass(), "layoutMgr", null);
        setField(term847427, term847427.getClass(), "dispatcher", null);
        setField(term847427, term847427.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term847427, term847427.getClass(), "focusCycleRoot", false);
        setBooleanField(term847427, term847427.getClass(), "focusTraversalPolicyProvider", false);
        setField(term847427, term847427.getClass(), "printingThreads", null);
        setBooleanField(term847427, term847427.getClass(), "printing", false);
        setField(term847427, term847427.getClass(), "containerListener", null);
        setIntField(term847427, term847427.getClass(), "listeningChildren", 0);
        setIntField(term847427, term847427.getClass(), "listeningBoundsChildren", 0);
        setIntField(term847427, term847427.getClass(), "descendantsCount", 0);
        setField(term847427, term847427.getClass(), "preserveBackgroundColor", null);
        setIntField(term847427, term847427.getClass(), "numOfHWComponents", 0);
        setIntField(term847427, term847427.getClass(), "numOfLWComponents", 0);
        setField(term847427, term847427.getClass(), "modalComp", null);
        setField(term847427, term847427.getClass(), "modalAppContext", null);
        setIntField(term847427, term847427.getClass(), "containerSerializedDataVersion", 0);
        setField(term847427, term847427.getClass(), "peer", null);
        setField(term847427, term847427.getClass(), "parent", null);
        setField(term847427, term847427.getClass(), "appContext", null);
        setIntField(term847427, term847427.getClass(), "x", 0);
        setIntField(term847427, term847427.getClass(), "y", 0);
        setIntField(term847427, term847427.getClass(), "width", 0);
        setIntField(term847427, term847427.getClass(), "height", 0);
        setField(term847427, term847427.getClass(), "foreground", null);
        setField(term847427, term847427.getClass(), "background", null);
        setField(term847427, term847427.getClass(), "font", null);
        setField(term847427, term847427.getClass(), "peerFont", null);
        setField(term847427, term847427.getClass(), "cursor", null);
        setField(term847427, term847427.getClass(), "locale", null);
        setField(term847427, term847427.getClass(), "graphicsConfig", null);
        setField(term847427, term847427.getClass(), "bufferStrategy", null);
        setBooleanField(term847427, term847427.getClass(), "ignoreRepaint", false);
        setBooleanField(term847427, term847427.getClass(), "visible", false);
        setBooleanField(term847427, term847427.getClass(), "enabled", false);
        setBooleanField(term847427, term847427.getClass(), "valid", false);
        setField(term847427, term847427.getClass(), "dropTarget", null);
        setField(term847427, term847427.getClass(), "popups", null);
        setField(term847427, term847427.getClass(), "name", null);
        setBooleanField(term847427, term847427.getClass(), "nameExplicitlySet", false);
        setBooleanField(term847427, term847427.getClass(), "focusable", false);
        setIntField(term847427, term847427.getClass(), "isFocusTraversableOverridden", 0);
        setField(term847427, term847427.getClass(), "focusTraversalKeys", null);
        setBooleanField(term847427, term847427.getClass(), "focusTraversalKeysEnabled", false);
        setField(term847427, term847427.getClass(), "acc", null);
        setField(term847427, term847427.getClass(), "minSize", null);
        setBooleanField(term847427, term847427.getClass(), "minSizeSet", false);
        setField(term847427, term847427.getClass(), "prefSize", null);
        setBooleanField(term847427, term847427.getClass(), "prefSizeSet", false);
        setField(term847427, term847427.getClass(), "maxSize", null);
        setBooleanField(term847427, term847427.getClass(), "maxSizeSet", false);
        setField(term847427, term847427.getClass(), "componentOrientation", null);
        setBooleanField(term847427, term847427.getClass(), "newEventsOnly", false);
        setField(term847427, term847427.getClass(), "componentListener", null);
        setField(term847427, term847427.getClass(), "focusListener", null);
        setField(term847427, term847427.getClass(), "hierarchyListener", null);
        setField(term847427, term847427.getClass(), "hierarchyBoundsListener", null);
        setField(term847427, term847427.getClass(), "keyListener", null);
        setField(term847427, term847427.getClass(), "mouseListener", null);
        setField(term847427, term847427.getClass(), "mouseMotionListener", null);
        setField(term847427, term847427.getClass(), "mouseWheelListener", null);
        setField(term847427, term847427.getClass(), "inputMethodListener", null);
        setLongField(term847427, term847427.getClass(), "eventMask", 0L);
        setField(term847427, term847427.getClass(), "changeSupport", null);
        setField(term847427, term847427.getClass(), "objectLock", null);
        setBooleanField(term847427, term847427.getClass(), "isPacked", false);
        setIntField(term847427, term847427.getClass(), "boundsOp", 0);
        setField(term847427, term847427.getClass(), "compoundShape", null);
        setField(term847427, term847427.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term847427, term847427.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term847427, term847427.getClass(), "backgroundEraseDisabled", false);
        setField(term847427, term847427.getClass(), "eventCache", null);
        setBooleanField(term847427, term847427.getClass(), "coalescingEnabled", false);
        setBooleanField(term847427, term847427.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term847427, term847427.getClass(), "componentSerializedDataVersion", 0);
        setField(term847427, term847427.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.StarMapView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateMessagePanel", argTypes, term847427, args);
    }

};


