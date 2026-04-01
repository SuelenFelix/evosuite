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

public class FleetView_getPlanet_94869939315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term884451;

    public FleetView_getPlanet_94869939315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term884451 = newInstance(Class.forName("org.openRealmOfStars.game.state.FleetView"));
        setField(term884451, term884451.getClass(), "totalPeople", null);
        setField(term884451, term884451.getClass(), "metal", null);
        setField(term884451, term884451.getClass(), "ownerLabel", null);
        setField(term884451, term884451.getClass(), "colonistSelection", null);
        setField(term884451, term884451.getClass(), "metalSelection", null);
        setField(term884451, term884451.getClass(), "planet", null);
        setField(term884451, term884451.getClass(), "fleet", null);
        setField(term884451, term884451.getClass(), "fleetList", null);
        setField(term884451, term884451.getClass(), "fleetNameText", null);
        setField(term884451, term884451.getClass(), "shipsInFleet", null);
        setField(term884451, term884451.getClass(), "fleetsInSpace", null);
        setField(term884451, term884451.getClass(), "starbaseFleet", null);
        setField(term884451, term884451.getClass(), "info", null);
        setField(term884451, term884451.getClass(), "imgBase", null);
        setField(term884451, term884451.getClass(), "starMap", null);
        setField(term884451, term884451.getClass(), "conquerBtn", null);
        setField(term884451, term884451.getClass(), "hailBtn", null);
        setBooleanField(term884451, term884451.getClass(), "interactiveView", false);
        setField(term884451, term884451.getClass(), "commanderLabel", null);
        setField(term884451, term884451.getClass(), "leaderViewBtn", null);
        setField(term884451, term884451.getClass(), "espionageMissonBtn", null);
        setField(term884451, term884451.getClass(), "exploreBtn", null);
        setField(term884451, term884451.getClass(), "upgradeBtn", null);
        setField(term884451, term884451.getClass(), "northPlanet", null);
        setField(term884451, term884451.getClass(), "southPlanet", null);
        setField(term884451, term884451.getClass(), "westPlanet", null);
        setField(term884451, term884451.getClass(), "eastPlanet", null);
        setBooleanField(term884451, term884451.getClass(), "isAlignmentXSet", false);
        setFloatField(term884451, term884451.getClass(), "alignmentX", 0.0F);
        setBooleanField(term884451, term884451.getClass(), "isAlignmentYSet", false);
        setFloatField(term884451, term884451.getClass(), "alignmentY", 0.0F);
        setField(term884451, term884451.getClass(), "ui", null);
        setField(term884451, term884451.getClass(), "listenerList", null);
        setField(term884451, term884451.getClass(), "clientProperties", null);
        setField(term884451, term884451.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term884451, term884451.getClass(), "autoscrolls", false);
        setField(term884451, term884451.getClass(), "border", null);
        setIntField(term884451, term884451.getClass(), "flags", 0);
        setField(term884451, term884451.getClass(), "inputVerifier", null);
        setBooleanField(term884451, term884451.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term884451, term884451.getClass(), "paintingChild", null);
        setField(term884451, term884451.getClass(), "popupMenu", null);
        setField(term884451, term884451.getClass(), "revalidateRunnableScheduled", null);
        setField(term884451, term884451.getClass(), "focusInputMap", null);
        setField(term884451, term884451.getClass(), "ancestorInputMap", null);
        setField(term884451, term884451.getClass(), "windowInputMap", null);
        setField(term884451, term884451.getClass(), "actionMap", null);
        setField(term884451, term884451.getClass(), "aaHint", null);
        setField(term884451, term884451.getClass(), "lcdRenderingHint", null);
        setField(term884451, term884451.getClass(), "component", null);
        setField(term884451, term884451.getClass(), "layoutMgr", null);
        setField(term884451, term884451.getClass(), "dispatcher", null);
        setField(term884451, term884451.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term884451, term884451.getClass(), "focusCycleRoot", false);
        setBooleanField(term884451, term884451.getClass(), "focusTraversalPolicyProvider", false);
        setField(term884451, term884451.getClass(), "printingThreads", null);
        setBooleanField(term884451, term884451.getClass(), "printing", false);
        setField(term884451, term884451.getClass(), "containerListener", null);
        setIntField(term884451, term884451.getClass(), "listeningChildren", 0);
        setIntField(term884451, term884451.getClass(), "listeningBoundsChildren", 0);
        setIntField(term884451, term884451.getClass(), "descendantsCount", 0);
        setField(term884451, term884451.getClass(), "preserveBackgroundColor", null);
        setIntField(term884451, term884451.getClass(), "numOfHWComponents", 0);
        setIntField(term884451, term884451.getClass(), "numOfLWComponents", 0);
        setField(term884451, term884451.getClass(), "modalComp", null);
        setField(term884451, term884451.getClass(), "modalAppContext", null);
        setIntField(term884451, term884451.getClass(), "containerSerializedDataVersion", 0);
        setField(term884451, term884451.getClass(), "peer", null);
        setField(term884451, term884451.getClass(), "parent", null);
        setField(term884451, term884451.getClass(), "appContext", null);
        setIntField(term884451, term884451.getClass(), "x", 0);
        setIntField(term884451, term884451.getClass(), "y", 0);
        setIntField(term884451, term884451.getClass(), "width", 0);
        setIntField(term884451, term884451.getClass(), "height", 0);
        setField(term884451, term884451.getClass(), "foreground", null);
        setField(term884451, term884451.getClass(), "background", null);
        setField(term884451, term884451.getClass(), "font", null);
        setField(term884451, term884451.getClass(), "peerFont", null);
        setField(term884451, term884451.getClass(), "cursor", null);
        setField(term884451, term884451.getClass(), "locale", null);
        setField(term884451, term884451.getClass(), "graphicsConfig", null);
        setField(term884451, term884451.getClass(), "bufferStrategy", null);
        setBooleanField(term884451, term884451.getClass(), "ignoreRepaint", false);
        setBooleanField(term884451, term884451.getClass(), "visible", false);
        setBooleanField(term884451, term884451.getClass(), "enabled", false);
        setBooleanField(term884451, term884451.getClass(), "valid", false);
        setField(term884451, term884451.getClass(), "dropTarget", null);
        setField(term884451, term884451.getClass(), "popups", null);
        setField(term884451, term884451.getClass(), "name", null);
        setBooleanField(term884451, term884451.getClass(), "nameExplicitlySet", false);
        setBooleanField(term884451, term884451.getClass(), "focusable", false);
        setIntField(term884451, term884451.getClass(), "isFocusTraversableOverridden", 0);
        setField(term884451, term884451.getClass(), "focusTraversalKeys", null);
        setBooleanField(term884451, term884451.getClass(), "focusTraversalKeysEnabled", false);
        setField(term884451, term884451.getClass(), "acc", null);
        setField(term884451, term884451.getClass(), "minSize", null);
        setBooleanField(term884451, term884451.getClass(), "minSizeSet", false);
        setField(term884451, term884451.getClass(), "prefSize", null);
        setBooleanField(term884451, term884451.getClass(), "prefSizeSet", false);
        setField(term884451, term884451.getClass(), "maxSize", null);
        setBooleanField(term884451, term884451.getClass(), "maxSizeSet", false);
        setField(term884451, term884451.getClass(), "componentOrientation", null);
        setBooleanField(term884451, term884451.getClass(), "newEventsOnly", false);
        setField(term884451, term884451.getClass(), "componentListener", null);
        setField(term884451, term884451.getClass(), "focusListener", null);
        setField(term884451, term884451.getClass(), "hierarchyListener", null);
        setField(term884451, term884451.getClass(), "hierarchyBoundsListener", null);
        setField(term884451, term884451.getClass(), "keyListener", null);
        setField(term884451, term884451.getClass(), "mouseListener", null);
        setField(term884451, term884451.getClass(), "mouseMotionListener", null);
        setField(term884451, term884451.getClass(), "mouseWheelListener", null);
        setField(term884451, term884451.getClass(), "inputMethodListener", null);
        setLongField(term884451, term884451.getClass(), "eventMask", 0L);
        setField(term884451, term884451.getClass(), "changeSupport", null);
        setField(term884451, term884451.getClass(), "objectLock", null);
        setBooleanField(term884451, term884451.getClass(), "isPacked", false);
        setIntField(term884451, term884451.getClass(), "boundsOp", 0);
        setField(term884451, term884451.getClass(), "compoundShape", null);
        setField(term884451, term884451.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term884451, term884451.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term884451, term884451.getClass(), "backgroundEraseDisabled", false);
        setField(term884451, term884451.getClass(), "eventCache", null);
        setBooleanField(term884451, term884451.getClass(), "coalescingEnabled", false);
        setBooleanField(term884451, term884451.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term884451, term884451.getClass(), "componentSerializedDataVersion", 0);
        setField(term884451, term884451.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.FleetView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlanet", argTypes, term884451, args);
    }

};


