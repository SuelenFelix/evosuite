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

public class FleetView_valueChanged_40445307835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term923583;

    public FleetView_valueChanged_40445307835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term923583 = newInstance(Class.forName("org.openRealmOfStars.game.state.FleetView"));
        setField(term923583, term923583.getClass(), "totalPeople", null);
        setField(term923583, term923583.getClass(), "metal", null);
        setField(term923583, term923583.getClass(), "ownerLabel", null);
        setField(term923583, term923583.getClass(), "colonistSelection", null);
        setField(term923583, term923583.getClass(), "metalSelection", null);
        setField(term923583, term923583.getClass(), "planet", null);
        setField(term923583, term923583.getClass(), "fleet", null);
        setField(term923583, term923583.getClass(), "fleetList", null);
        setField(term923583, term923583.getClass(), "fleetNameText", null);
        setField(term923583, term923583.getClass(), "shipsInFleet", null);
        setField(term923583, term923583.getClass(), "fleetsInSpace", null);
        setField(term923583, term923583.getClass(), "starbaseFleet", null);
        setField(term923583, term923583.getClass(), "info", null);
        setField(term923583, term923583.getClass(), "imgBase", null);
        setField(term923583, term923583.getClass(), "starMap", null);
        setField(term923583, term923583.getClass(), "conquerBtn", null);
        setField(term923583, term923583.getClass(), "hailBtn", null);
        setBooleanField(term923583, term923583.getClass(), "interactiveView", false);
        setField(term923583, term923583.getClass(), "commanderLabel", null);
        setField(term923583, term923583.getClass(), "leaderViewBtn", null);
        setField(term923583, term923583.getClass(), "espionageMissonBtn", null);
        setField(term923583, term923583.getClass(), "exploreBtn", null);
        setField(term923583, term923583.getClass(), "upgradeBtn", null);
        setField(term923583, term923583.getClass(), "northPlanet", null);
        setField(term923583, term923583.getClass(), "southPlanet", null);
        setField(term923583, term923583.getClass(), "westPlanet", null);
        setField(term923583, term923583.getClass(), "eastPlanet", null);
        setBooleanField(term923583, term923583.getClass(), "isAlignmentXSet", false);
        setFloatField(term923583, term923583.getClass(), "alignmentX", 0.0F);
        setBooleanField(term923583, term923583.getClass(), "isAlignmentYSet", false);
        setFloatField(term923583, term923583.getClass(), "alignmentY", 0.0F);
        setField(term923583, term923583.getClass(), "ui", null);
        setField(term923583, term923583.getClass(), "listenerList", null);
        setField(term923583, term923583.getClass(), "clientProperties", null);
        setField(term923583, term923583.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term923583, term923583.getClass(), "autoscrolls", false);
        setField(term923583, term923583.getClass(), "border", null);
        setIntField(term923583, term923583.getClass(), "flags", 0);
        setField(term923583, term923583.getClass(), "inputVerifier", null);
        setBooleanField(term923583, term923583.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term923583, term923583.getClass(), "paintingChild", null);
        setField(term923583, term923583.getClass(), "popupMenu", null);
        setField(term923583, term923583.getClass(), "revalidateRunnableScheduled", null);
        setField(term923583, term923583.getClass(), "focusInputMap", null);
        setField(term923583, term923583.getClass(), "ancestorInputMap", null);
        setField(term923583, term923583.getClass(), "windowInputMap", null);
        setField(term923583, term923583.getClass(), "actionMap", null);
        setField(term923583, term923583.getClass(), "aaHint", null);
        setField(term923583, term923583.getClass(), "lcdRenderingHint", null);
        setField(term923583, term923583.getClass(), "component", null);
        setField(term923583, term923583.getClass(), "layoutMgr", null);
        setField(term923583, term923583.getClass(), "dispatcher", null);
        setField(term923583, term923583.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term923583, term923583.getClass(), "focusCycleRoot", false);
        setBooleanField(term923583, term923583.getClass(), "focusTraversalPolicyProvider", false);
        setField(term923583, term923583.getClass(), "printingThreads", null);
        setBooleanField(term923583, term923583.getClass(), "printing", false);
        setField(term923583, term923583.getClass(), "containerListener", null);
        setIntField(term923583, term923583.getClass(), "listeningChildren", 0);
        setIntField(term923583, term923583.getClass(), "listeningBoundsChildren", 0);
        setIntField(term923583, term923583.getClass(), "descendantsCount", 0);
        setField(term923583, term923583.getClass(), "preserveBackgroundColor", null);
        setIntField(term923583, term923583.getClass(), "numOfHWComponents", 0);
        setIntField(term923583, term923583.getClass(), "numOfLWComponents", 0);
        setField(term923583, term923583.getClass(), "modalComp", null);
        setField(term923583, term923583.getClass(), "modalAppContext", null);
        setIntField(term923583, term923583.getClass(), "containerSerializedDataVersion", 0);
        setField(term923583, term923583.getClass(), "peer", null);
        setField(term923583, term923583.getClass(), "parent", null);
        setField(term923583, term923583.getClass(), "appContext", null);
        setIntField(term923583, term923583.getClass(), "x", 0);
        setIntField(term923583, term923583.getClass(), "y", 0);
        setIntField(term923583, term923583.getClass(), "width", 0);
        setIntField(term923583, term923583.getClass(), "height", 0);
        setField(term923583, term923583.getClass(), "foreground", null);
        setField(term923583, term923583.getClass(), "background", null);
        setField(term923583, term923583.getClass(), "font", null);
        setField(term923583, term923583.getClass(), "peerFont", null);
        setField(term923583, term923583.getClass(), "cursor", null);
        setField(term923583, term923583.getClass(), "locale", null);
        setField(term923583, term923583.getClass(), "graphicsConfig", null);
        setField(term923583, term923583.getClass(), "bufferStrategy", null);
        setBooleanField(term923583, term923583.getClass(), "ignoreRepaint", false);
        setBooleanField(term923583, term923583.getClass(), "visible", false);
        setBooleanField(term923583, term923583.getClass(), "enabled", false);
        setBooleanField(term923583, term923583.getClass(), "valid", false);
        setField(term923583, term923583.getClass(), "dropTarget", null);
        setField(term923583, term923583.getClass(), "popups", null);
        setField(term923583, term923583.getClass(), "name", null);
        setBooleanField(term923583, term923583.getClass(), "nameExplicitlySet", false);
        setBooleanField(term923583, term923583.getClass(), "focusable", false);
        setIntField(term923583, term923583.getClass(), "isFocusTraversableOverridden", 0);
        setField(term923583, term923583.getClass(), "focusTraversalKeys", null);
        setBooleanField(term923583, term923583.getClass(), "focusTraversalKeysEnabled", false);
        setField(term923583, term923583.getClass(), "acc", null);
        setField(term923583, term923583.getClass(), "minSize", null);
        setBooleanField(term923583, term923583.getClass(), "minSizeSet", false);
        setField(term923583, term923583.getClass(), "prefSize", null);
        setBooleanField(term923583, term923583.getClass(), "prefSizeSet", false);
        setField(term923583, term923583.getClass(), "maxSize", null);
        setBooleanField(term923583, term923583.getClass(), "maxSizeSet", false);
        setField(term923583, term923583.getClass(), "componentOrientation", null);
        setBooleanField(term923583, term923583.getClass(), "newEventsOnly", false);
        setField(term923583, term923583.getClass(), "componentListener", null);
        setField(term923583, term923583.getClass(), "focusListener", null);
        setField(term923583, term923583.getClass(), "hierarchyListener", null);
        setField(term923583, term923583.getClass(), "hierarchyBoundsListener", null);
        setField(term923583, term923583.getClass(), "keyListener", null);
        setField(term923583, term923583.getClass(), "mouseListener", null);
        setField(term923583, term923583.getClass(), "mouseMotionListener", null);
        setField(term923583, term923583.getClass(), "mouseWheelListener", null);
        setField(term923583, term923583.getClass(), "inputMethodListener", null);
        setLongField(term923583, term923583.getClass(), "eventMask", 0L);
        setField(term923583, term923583.getClass(), "changeSupport", null);
        setField(term923583, term923583.getClass(), "objectLock", null);
        setBooleanField(term923583, term923583.getClass(), "isPacked", false);
        setIntField(term923583, term923583.getClass(), "boundsOp", 0);
        setField(term923583, term923583.getClass(), "compoundShape", null);
        setField(term923583, term923583.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term923583, term923583.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term923583, term923583.getClass(), "backgroundEraseDisabled", false);
        setField(term923583, term923583.getClass(), "eventCache", null);
        setBooleanField(term923583, term923583.getClass(), "coalescingEnabled", false);
        setBooleanField(term923583, term923583.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term923583, term923583.getClass(), "componentSerializedDataVersion", 0);
        setField(term923583, term923583.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.FleetView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.event.ListSelectionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "valueChanged", argTypes, term923583, args);
    }

};


