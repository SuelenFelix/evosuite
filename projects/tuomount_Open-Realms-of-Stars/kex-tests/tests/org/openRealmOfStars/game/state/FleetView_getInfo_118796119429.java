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

public class FleetView_getInfo_118796119429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term907335;

    public FleetView_getInfo_118796119429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term907335 = newInstance(Class.forName("org.openRealmOfStars.game.state.FleetView"));
        setField(term907335, term907335.getClass(), "totalPeople", null);
        setField(term907335, term907335.getClass(), "metal", null);
        setField(term907335, term907335.getClass(), "ownerLabel", null);
        setField(term907335, term907335.getClass(), "colonistSelection", null);
        setField(term907335, term907335.getClass(), "metalSelection", null);
        setField(term907335, term907335.getClass(), "planet", null);
        setField(term907335, term907335.getClass(), "fleet", null);
        setField(term907335, term907335.getClass(), "fleetList", null);
        setField(term907335, term907335.getClass(), "fleetNameText", null);
        setField(term907335, term907335.getClass(), "shipsInFleet", null);
        setField(term907335, term907335.getClass(), "fleetsInSpace", null);
        setField(term907335, term907335.getClass(), "starbaseFleet", null);
        setField(term907335, term907335.getClass(), "info", null);
        setField(term907335, term907335.getClass(), "imgBase", null);
        setField(term907335, term907335.getClass(), "starMap", null);
        setField(term907335, term907335.getClass(), "conquerBtn", null);
        setField(term907335, term907335.getClass(), "hailBtn", null);
        setBooleanField(term907335, term907335.getClass(), "interactiveView", false);
        setField(term907335, term907335.getClass(), "commanderLabel", null);
        setField(term907335, term907335.getClass(), "leaderViewBtn", null);
        setField(term907335, term907335.getClass(), "espionageMissonBtn", null);
        setField(term907335, term907335.getClass(), "exploreBtn", null);
        setField(term907335, term907335.getClass(), "upgradeBtn", null);
        setField(term907335, term907335.getClass(), "northPlanet", null);
        setField(term907335, term907335.getClass(), "southPlanet", null);
        setField(term907335, term907335.getClass(), "westPlanet", null);
        setField(term907335, term907335.getClass(), "eastPlanet", null);
        setBooleanField(term907335, term907335.getClass(), "isAlignmentXSet", false);
        setFloatField(term907335, term907335.getClass(), "alignmentX", 0.0F);
        setBooleanField(term907335, term907335.getClass(), "isAlignmentYSet", false);
        setFloatField(term907335, term907335.getClass(), "alignmentY", 0.0F);
        setField(term907335, term907335.getClass(), "ui", null);
        setField(term907335, term907335.getClass(), "listenerList", null);
        setField(term907335, term907335.getClass(), "clientProperties", null);
        setField(term907335, term907335.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term907335, term907335.getClass(), "autoscrolls", false);
        setField(term907335, term907335.getClass(), "border", null);
        setIntField(term907335, term907335.getClass(), "flags", 0);
        setField(term907335, term907335.getClass(), "inputVerifier", null);
        setBooleanField(term907335, term907335.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term907335, term907335.getClass(), "paintingChild", null);
        setField(term907335, term907335.getClass(), "popupMenu", null);
        setField(term907335, term907335.getClass(), "revalidateRunnableScheduled", null);
        setField(term907335, term907335.getClass(), "focusInputMap", null);
        setField(term907335, term907335.getClass(), "ancestorInputMap", null);
        setField(term907335, term907335.getClass(), "windowInputMap", null);
        setField(term907335, term907335.getClass(), "actionMap", null);
        setField(term907335, term907335.getClass(), "aaHint", null);
        setField(term907335, term907335.getClass(), "lcdRenderingHint", null);
        setField(term907335, term907335.getClass(), "component", null);
        setField(term907335, term907335.getClass(), "layoutMgr", null);
        setField(term907335, term907335.getClass(), "dispatcher", null);
        setField(term907335, term907335.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term907335, term907335.getClass(), "focusCycleRoot", false);
        setBooleanField(term907335, term907335.getClass(), "focusTraversalPolicyProvider", false);
        setField(term907335, term907335.getClass(), "printingThreads", null);
        setBooleanField(term907335, term907335.getClass(), "printing", false);
        setField(term907335, term907335.getClass(), "containerListener", null);
        setIntField(term907335, term907335.getClass(), "listeningChildren", 0);
        setIntField(term907335, term907335.getClass(), "listeningBoundsChildren", 0);
        setIntField(term907335, term907335.getClass(), "descendantsCount", 0);
        setField(term907335, term907335.getClass(), "preserveBackgroundColor", null);
        setIntField(term907335, term907335.getClass(), "numOfHWComponents", 0);
        setIntField(term907335, term907335.getClass(), "numOfLWComponents", 0);
        setField(term907335, term907335.getClass(), "modalComp", null);
        setField(term907335, term907335.getClass(), "modalAppContext", null);
        setIntField(term907335, term907335.getClass(), "containerSerializedDataVersion", 0);
        setField(term907335, term907335.getClass(), "peer", null);
        setField(term907335, term907335.getClass(), "parent", null);
        setField(term907335, term907335.getClass(), "appContext", null);
        setIntField(term907335, term907335.getClass(), "x", 0);
        setIntField(term907335, term907335.getClass(), "y", 0);
        setIntField(term907335, term907335.getClass(), "width", 0);
        setIntField(term907335, term907335.getClass(), "height", 0);
        setField(term907335, term907335.getClass(), "foreground", null);
        setField(term907335, term907335.getClass(), "background", null);
        setField(term907335, term907335.getClass(), "font", null);
        setField(term907335, term907335.getClass(), "peerFont", null);
        setField(term907335, term907335.getClass(), "cursor", null);
        setField(term907335, term907335.getClass(), "locale", null);
        setField(term907335, term907335.getClass(), "graphicsConfig", null);
        setField(term907335, term907335.getClass(), "bufferStrategy", null);
        setBooleanField(term907335, term907335.getClass(), "ignoreRepaint", false);
        setBooleanField(term907335, term907335.getClass(), "visible", false);
        setBooleanField(term907335, term907335.getClass(), "enabled", false);
        setBooleanField(term907335, term907335.getClass(), "valid", false);
        setField(term907335, term907335.getClass(), "dropTarget", null);
        setField(term907335, term907335.getClass(), "popups", null);
        setField(term907335, term907335.getClass(), "name", null);
        setBooleanField(term907335, term907335.getClass(), "nameExplicitlySet", false);
        setBooleanField(term907335, term907335.getClass(), "focusable", false);
        setIntField(term907335, term907335.getClass(), "isFocusTraversableOverridden", 0);
        setField(term907335, term907335.getClass(), "focusTraversalKeys", null);
        setBooleanField(term907335, term907335.getClass(), "focusTraversalKeysEnabled", false);
        setField(term907335, term907335.getClass(), "acc", null);
        setField(term907335, term907335.getClass(), "minSize", null);
        setBooleanField(term907335, term907335.getClass(), "minSizeSet", false);
        setField(term907335, term907335.getClass(), "prefSize", null);
        setBooleanField(term907335, term907335.getClass(), "prefSizeSet", false);
        setField(term907335, term907335.getClass(), "maxSize", null);
        setBooleanField(term907335, term907335.getClass(), "maxSizeSet", false);
        setField(term907335, term907335.getClass(), "componentOrientation", null);
        setBooleanField(term907335, term907335.getClass(), "newEventsOnly", false);
        setField(term907335, term907335.getClass(), "componentListener", null);
        setField(term907335, term907335.getClass(), "focusListener", null);
        setField(term907335, term907335.getClass(), "hierarchyListener", null);
        setField(term907335, term907335.getClass(), "hierarchyBoundsListener", null);
        setField(term907335, term907335.getClass(), "keyListener", null);
        setField(term907335, term907335.getClass(), "mouseListener", null);
        setField(term907335, term907335.getClass(), "mouseMotionListener", null);
        setField(term907335, term907335.getClass(), "mouseWheelListener", null);
        setField(term907335, term907335.getClass(), "inputMethodListener", null);
        setLongField(term907335, term907335.getClass(), "eventMask", 0L);
        setField(term907335, term907335.getClass(), "changeSupport", null);
        setField(term907335, term907335.getClass(), "objectLock", null);
        setBooleanField(term907335, term907335.getClass(), "isPacked", false);
        setIntField(term907335, term907335.getClass(), "boundsOp", 0);
        setField(term907335, term907335.getClass(), "compoundShape", null);
        setField(term907335, term907335.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term907335, term907335.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term907335, term907335.getClass(), "backgroundEraseDisabled", false);
        setField(term907335, term907335.getClass(), "eventCache", null);
        setBooleanField(term907335, term907335.getClass(), "coalescingEnabled", false);
        setBooleanField(term907335, term907335.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term907335, term907335.getClass(), "componentSerializedDataVersion", 0);
        setField(term907335, term907335.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.FleetView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInfo", argTypes, term907335, args);
    }

};


