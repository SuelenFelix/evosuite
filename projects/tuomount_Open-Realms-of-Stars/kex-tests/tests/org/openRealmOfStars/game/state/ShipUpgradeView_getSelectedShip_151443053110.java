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

public class ShipUpgradeView_getSelectedShip_151443053110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term783800;

    public ShipUpgradeView_getSelectedShip_151443053110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term783800 = newInstance(Class.forName("org.openRealmOfStars.game.state.ShipUpgradeView"));
        setField(term783800, term783800.getClass(), "player", null);
        setField(term783800, term783800.getClass(), "planet", null);
        setField(term783800, term783800.getClass(), "fleet", null);
        setField(term783800, term783800.getClass(), "shipImage", null);
        setField(term783800, term783800.getClass(), "infoText", null);
        setField(term783800, term783800.getClass(), "shipListInFleet", null);
        setField(term783800, term783800.getClass(), "upgradeList", null);
        setField(term783800, term783800.getClass(), "metalOnPlanet", null);
        setField(term783800, term783800.getClass(), "credits", null);
        setField(term783800, term783800.getClass(), "totalCost", null);
        setField(term783800, term783800.getClass(), "upgradeButton", null);
        setIntField(term783800, term783800.getClass(), "metalUpgradeCost", 0);
        setIntField(term783800, term783800.getClass(), "prodUpgradeCost", 0);
        setBooleanField(term783800, term783800.getClass(), "isAlignmentXSet", false);
        setFloatField(term783800, term783800.getClass(), "alignmentX", 0.0F);
        setBooleanField(term783800, term783800.getClass(), "isAlignmentYSet", false);
        setFloatField(term783800, term783800.getClass(), "alignmentY", 0.0F);
        setField(term783800, term783800.getClass(), "ui", null);
        setField(term783800, term783800.getClass(), "listenerList", null);
        setField(term783800, term783800.getClass(), "clientProperties", null);
        setField(term783800, term783800.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term783800, term783800.getClass(), "autoscrolls", false);
        setField(term783800, term783800.getClass(), "border", null);
        setIntField(term783800, term783800.getClass(), "flags", 0);
        setField(term783800, term783800.getClass(), "inputVerifier", null);
        setBooleanField(term783800, term783800.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term783800, term783800.getClass(), "paintingChild", null);
        setField(term783800, term783800.getClass(), "popupMenu", null);
        setField(term783800, term783800.getClass(), "revalidateRunnableScheduled", null);
        setField(term783800, term783800.getClass(), "focusInputMap", null);
        setField(term783800, term783800.getClass(), "ancestorInputMap", null);
        setField(term783800, term783800.getClass(), "windowInputMap", null);
        setField(term783800, term783800.getClass(), "actionMap", null);
        setField(term783800, term783800.getClass(), "aaHint", null);
        setField(term783800, term783800.getClass(), "lcdRenderingHint", null);
        setField(term783800, term783800.getClass(), "component", null);
        setField(term783800, term783800.getClass(), "layoutMgr", null);
        setField(term783800, term783800.getClass(), "dispatcher", null);
        setField(term783800, term783800.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term783800, term783800.getClass(), "focusCycleRoot", false);
        setBooleanField(term783800, term783800.getClass(), "focusTraversalPolicyProvider", false);
        setField(term783800, term783800.getClass(), "printingThreads", null);
        setBooleanField(term783800, term783800.getClass(), "printing", false);
        setField(term783800, term783800.getClass(), "containerListener", null);
        setIntField(term783800, term783800.getClass(), "listeningChildren", 0);
        setIntField(term783800, term783800.getClass(), "listeningBoundsChildren", 0);
        setIntField(term783800, term783800.getClass(), "descendantsCount", 0);
        setField(term783800, term783800.getClass(), "preserveBackgroundColor", null);
        setIntField(term783800, term783800.getClass(), "numOfHWComponents", 0);
        setIntField(term783800, term783800.getClass(), "numOfLWComponents", 0);
        setField(term783800, term783800.getClass(), "modalComp", null);
        setField(term783800, term783800.getClass(), "modalAppContext", null);
        setIntField(term783800, term783800.getClass(), "containerSerializedDataVersion", 0);
        setField(term783800, term783800.getClass(), "peer", null);
        setField(term783800, term783800.getClass(), "parent", null);
        setField(term783800, term783800.getClass(), "appContext", null);
        setIntField(term783800, term783800.getClass(), "x", 0);
        setIntField(term783800, term783800.getClass(), "y", 0);
        setIntField(term783800, term783800.getClass(), "width", 0);
        setIntField(term783800, term783800.getClass(), "height", 0);
        setField(term783800, term783800.getClass(), "foreground", null);
        setField(term783800, term783800.getClass(), "background", null);
        setField(term783800, term783800.getClass(), "font", null);
        setField(term783800, term783800.getClass(), "peerFont", null);
        setField(term783800, term783800.getClass(), "cursor", null);
        setField(term783800, term783800.getClass(), "locale", null);
        setField(term783800, term783800.getClass(), "graphicsConfig", null);
        setField(term783800, term783800.getClass(), "bufferStrategy", null);
        setBooleanField(term783800, term783800.getClass(), "ignoreRepaint", false);
        setBooleanField(term783800, term783800.getClass(), "visible", false);
        setBooleanField(term783800, term783800.getClass(), "enabled", false);
        setBooleanField(term783800, term783800.getClass(), "valid", false);
        setField(term783800, term783800.getClass(), "dropTarget", null);
        setField(term783800, term783800.getClass(), "popups", null);
        setField(term783800, term783800.getClass(), "name", null);
        setBooleanField(term783800, term783800.getClass(), "nameExplicitlySet", false);
        setBooleanField(term783800, term783800.getClass(), "focusable", false);
        setIntField(term783800, term783800.getClass(), "isFocusTraversableOverridden", 0);
        setField(term783800, term783800.getClass(), "focusTraversalKeys", null);
        setBooleanField(term783800, term783800.getClass(), "focusTraversalKeysEnabled", false);
        setField(term783800, term783800.getClass(), "acc", null);
        setField(term783800, term783800.getClass(), "minSize", null);
        setBooleanField(term783800, term783800.getClass(), "minSizeSet", false);
        setField(term783800, term783800.getClass(), "prefSize", null);
        setBooleanField(term783800, term783800.getClass(), "prefSizeSet", false);
        setField(term783800, term783800.getClass(), "maxSize", null);
        setBooleanField(term783800, term783800.getClass(), "maxSizeSet", false);
        setField(term783800, term783800.getClass(), "componentOrientation", null);
        setBooleanField(term783800, term783800.getClass(), "newEventsOnly", false);
        setField(term783800, term783800.getClass(), "componentListener", null);
        setField(term783800, term783800.getClass(), "focusListener", null);
        setField(term783800, term783800.getClass(), "hierarchyListener", null);
        setField(term783800, term783800.getClass(), "hierarchyBoundsListener", null);
        setField(term783800, term783800.getClass(), "keyListener", null);
        setField(term783800, term783800.getClass(), "mouseListener", null);
        setField(term783800, term783800.getClass(), "mouseMotionListener", null);
        setField(term783800, term783800.getClass(), "mouseWheelListener", null);
        setField(term783800, term783800.getClass(), "inputMethodListener", null);
        setLongField(term783800, term783800.getClass(), "eventMask", 0L);
        setField(term783800, term783800.getClass(), "changeSupport", null);
        setField(term783800, term783800.getClass(), "objectLock", null);
        setBooleanField(term783800, term783800.getClass(), "isPacked", false);
        setIntField(term783800, term783800.getClass(), "boundsOp", 0);
        setField(term783800, term783800.getClass(), "compoundShape", null);
        setField(term783800, term783800.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term783800, term783800.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term783800, term783800.getClass(), "backgroundEraseDisabled", false);
        setField(term783800, term783800.getClass(), "eventCache", null);
        setBooleanField(term783800, term783800.getClass(), "coalescingEnabled", false);
        setBooleanField(term783800, term783800.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term783800, term783800.getClass(), "componentSerializedDataVersion", 0);
        setField(term783800, term783800.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ShipUpgradeView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSelectedShip", argTypes, term783800, args);
    }

};


