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

public class FleetView_updatePanel_14292924079 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term870977;

    public FleetView_updatePanel_14292924079() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term870977 = newInstance(Class.forName("org.openRealmOfStars.game.state.FleetView"));
        setField(term870977, term870977.getClass(), "totalPeople", null);
        setField(term870977, term870977.getClass(), "metal", null);
        setField(term870977, term870977.getClass(), "ownerLabel", null);
        setField(term870977, term870977.getClass(), "colonistSelection", null);
        setField(term870977, term870977.getClass(), "metalSelection", null);
        setField(term870977, term870977.getClass(), "planet", null);
        setField(term870977, term870977.getClass(), "fleet", null);
        setField(term870977, term870977.getClass(), "fleetList", null);
        setField(term870977, term870977.getClass(), "fleetNameText", null);
        setField(term870977, term870977.getClass(), "shipsInFleet", null);
        setField(term870977, term870977.getClass(), "fleetsInSpace", null);
        setField(term870977, term870977.getClass(), "starbaseFleet", null);
        setField(term870977, term870977.getClass(), "info", null);
        setField(term870977, term870977.getClass(), "imgBase", null);
        setField(term870977, term870977.getClass(), "starMap", null);
        setField(term870977, term870977.getClass(), "conquerBtn", null);
        setField(term870977, term870977.getClass(), "hailBtn", null);
        setBooleanField(term870977, term870977.getClass(), "interactiveView", false);
        setField(term870977, term870977.getClass(), "commanderLabel", null);
        setField(term870977, term870977.getClass(), "leaderViewBtn", null);
        setField(term870977, term870977.getClass(), "espionageMissonBtn", null);
        setField(term870977, term870977.getClass(), "exploreBtn", null);
        setField(term870977, term870977.getClass(), "upgradeBtn", null);
        setField(term870977, term870977.getClass(), "northPlanet", null);
        setField(term870977, term870977.getClass(), "southPlanet", null);
        setField(term870977, term870977.getClass(), "westPlanet", null);
        setField(term870977, term870977.getClass(), "eastPlanet", null);
        setBooleanField(term870977, term870977.getClass(), "isAlignmentXSet", false);
        setFloatField(term870977, term870977.getClass(), "alignmentX", 0.0F);
        setBooleanField(term870977, term870977.getClass(), "isAlignmentYSet", false);
        setFloatField(term870977, term870977.getClass(), "alignmentY", 0.0F);
        setField(term870977, term870977.getClass(), "ui", null);
        setField(term870977, term870977.getClass(), "listenerList", null);
        setField(term870977, term870977.getClass(), "clientProperties", null);
        setField(term870977, term870977.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term870977, term870977.getClass(), "autoscrolls", false);
        setField(term870977, term870977.getClass(), "border", null);
        setIntField(term870977, term870977.getClass(), "flags", 0);
        setField(term870977, term870977.getClass(), "inputVerifier", null);
        setBooleanField(term870977, term870977.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term870977, term870977.getClass(), "paintingChild", null);
        setField(term870977, term870977.getClass(), "popupMenu", null);
        setField(term870977, term870977.getClass(), "revalidateRunnableScheduled", null);
        setField(term870977, term870977.getClass(), "focusInputMap", null);
        setField(term870977, term870977.getClass(), "ancestorInputMap", null);
        setField(term870977, term870977.getClass(), "windowInputMap", null);
        setField(term870977, term870977.getClass(), "actionMap", null);
        setField(term870977, term870977.getClass(), "aaHint", null);
        setField(term870977, term870977.getClass(), "lcdRenderingHint", null);
        setField(term870977, term870977.getClass(), "component", null);
        setField(term870977, term870977.getClass(), "layoutMgr", null);
        setField(term870977, term870977.getClass(), "dispatcher", null);
        setField(term870977, term870977.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term870977, term870977.getClass(), "focusCycleRoot", false);
        setBooleanField(term870977, term870977.getClass(), "focusTraversalPolicyProvider", false);
        setField(term870977, term870977.getClass(), "printingThreads", null);
        setBooleanField(term870977, term870977.getClass(), "printing", false);
        setField(term870977, term870977.getClass(), "containerListener", null);
        setIntField(term870977, term870977.getClass(), "listeningChildren", 0);
        setIntField(term870977, term870977.getClass(), "listeningBoundsChildren", 0);
        setIntField(term870977, term870977.getClass(), "descendantsCount", 0);
        setField(term870977, term870977.getClass(), "preserveBackgroundColor", null);
        setIntField(term870977, term870977.getClass(), "numOfHWComponents", 0);
        setIntField(term870977, term870977.getClass(), "numOfLWComponents", 0);
        setField(term870977, term870977.getClass(), "modalComp", null);
        setField(term870977, term870977.getClass(), "modalAppContext", null);
        setIntField(term870977, term870977.getClass(), "containerSerializedDataVersion", 0);
        setField(term870977, term870977.getClass(), "peer", null);
        setField(term870977, term870977.getClass(), "parent", null);
        setField(term870977, term870977.getClass(), "appContext", null);
        setIntField(term870977, term870977.getClass(), "x", 0);
        setIntField(term870977, term870977.getClass(), "y", 0);
        setIntField(term870977, term870977.getClass(), "width", 0);
        setIntField(term870977, term870977.getClass(), "height", 0);
        setField(term870977, term870977.getClass(), "foreground", null);
        setField(term870977, term870977.getClass(), "background", null);
        setField(term870977, term870977.getClass(), "font", null);
        setField(term870977, term870977.getClass(), "peerFont", null);
        setField(term870977, term870977.getClass(), "cursor", null);
        setField(term870977, term870977.getClass(), "locale", null);
        setField(term870977, term870977.getClass(), "graphicsConfig", null);
        setField(term870977, term870977.getClass(), "bufferStrategy", null);
        setBooleanField(term870977, term870977.getClass(), "ignoreRepaint", false);
        setBooleanField(term870977, term870977.getClass(), "visible", false);
        setBooleanField(term870977, term870977.getClass(), "enabled", false);
        setBooleanField(term870977, term870977.getClass(), "valid", false);
        setField(term870977, term870977.getClass(), "dropTarget", null);
        setField(term870977, term870977.getClass(), "popups", null);
        setField(term870977, term870977.getClass(), "name", null);
        setBooleanField(term870977, term870977.getClass(), "nameExplicitlySet", false);
        setBooleanField(term870977, term870977.getClass(), "focusable", false);
        setIntField(term870977, term870977.getClass(), "isFocusTraversableOverridden", 0);
        setField(term870977, term870977.getClass(), "focusTraversalKeys", null);
        setBooleanField(term870977, term870977.getClass(), "focusTraversalKeysEnabled", false);
        setField(term870977, term870977.getClass(), "acc", null);
        setField(term870977, term870977.getClass(), "minSize", null);
        setBooleanField(term870977, term870977.getClass(), "minSizeSet", false);
        setField(term870977, term870977.getClass(), "prefSize", null);
        setBooleanField(term870977, term870977.getClass(), "prefSizeSet", false);
        setField(term870977, term870977.getClass(), "maxSize", null);
        setBooleanField(term870977, term870977.getClass(), "maxSizeSet", false);
        setField(term870977, term870977.getClass(), "componentOrientation", null);
        setBooleanField(term870977, term870977.getClass(), "newEventsOnly", false);
        setField(term870977, term870977.getClass(), "componentListener", null);
        setField(term870977, term870977.getClass(), "focusListener", null);
        setField(term870977, term870977.getClass(), "hierarchyListener", null);
        setField(term870977, term870977.getClass(), "hierarchyBoundsListener", null);
        setField(term870977, term870977.getClass(), "keyListener", null);
        setField(term870977, term870977.getClass(), "mouseListener", null);
        setField(term870977, term870977.getClass(), "mouseMotionListener", null);
        setField(term870977, term870977.getClass(), "mouseWheelListener", null);
        setField(term870977, term870977.getClass(), "inputMethodListener", null);
        setLongField(term870977, term870977.getClass(), "eventMask", 0L);
        setField(term870977, term870977.getClass(), "changeSupport", null);
        setField(term870977, term870977.getClass(), "objectLock", null);
        setBooleanField(term870977, term870977.getClass(), "isPacked", false);
        setIntField(term870977, term870977.getClass(), "boundsOp", 0);
        setField(term870977, term870977.getClass(), "compoundShape", null);
        setField(term870977, term870977.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term870977, term870977.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term870977, term870977.getClass(), "backgroundEraseDisabled", false);
        setField(term870977, term870977.getClass(), "eventCache", null);
        setBooleanField(term870977, term870977.getClass(), "coalescingEnabled", false);
        setBooleanField(term870977, term870977.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term870977, term870977.getClass(), "componentSerializedDataVersion", 0);
        setField(term870977, term870977.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.FleetView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updatePanel", argTypes, term870977, args);
    }

};


