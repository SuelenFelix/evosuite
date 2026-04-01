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

public class ShipUpgradeView_updatePanels_15598325466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term771784;

    public ShipUpgradeView_updatePanels_15598325466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term771784 = newInstance(Class.forName("org.openRealmOfStars.game.state.ShipUpgradeView"));
        setField(term771784, term771784.getClass(), "player", null);
        setField(term771784, term771784.getClass(), "planet", null);
        setField(term771784, term771784.getClass(), "fleet", null);
        setField(term771784, term771784.getClass(), "shipImage", null);
        setField(term771784, term771784.getClass(), "infoText", null);
        setField(term771784, term771784.getClass(), "shipListInFleet", null);
        setField(term771784, term771784.getClass(), "upgradeList", null);
        setField(term771784, term771784.getClass(), "metalOnPlanet", null);
        setField(term771784, term771784.getClass(), "credits", null);
        setField(term771784, term771784.getClass(), "totalCost", null);
        setField(term771784, term771784.getClass(), "upgradeButton", null);
        setIntField(term771784, term771784.getClass(), "metalUpgradeCost", 0);
        setIntField(term771784, term771784.getClass(), "prodUpgradeCost", 0);
        setBooleanField(term771784, term771784.getClass(), "isAlignmentXSet", false);
        setFloatField(term771784, term771784.getClass(), "alignmentX", 0.0F);
        setBooleanField(term771784, term771784.getClass(), "isAlignmentYSet", false);
        setFloatField(term771784, term771784.getClass(), "alignmentY", 0.0F);
        setField(term771784, term771784.getClass(), "ui", null);
        setField(term771784, term771784.getClass(), "listenerList", null);
        setField(term771784, term771784.getClass(), "clientProperties", null);
        setField(term771784, term771784.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term771784, term771784.getClass(), "autoscrolls", false);
        setField(term771784, term771784.getClass(), "border", null);
        setIntField(term771784, term771784.getClass(), "flags", 0);
        setField(term771784, term771784.getClass(), "inputVerifier", null);
        setBooleanField(term771784, term771784.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term771784, term771784.getClass(), "paintingChild", null);
        setField(term771784, term771784.getClass(), "popupMenu", null);
        setField(term771784, term771784.getClass(), "revalidateRunnableScheduled", null);
        setField(term771784, term771784.getClass(), "focusInputMap", null);
        setField(term771784, term771784.getClass(), "ancestorInputMap", null);
        setField(term771784, term771784.getClass(), "windowInputMap", null);
        setField(term771784, term771784.getClass(), "actionMap", null);
        setField(term771784, term771784.getClass(), "aaHint", null);
        setField(term771784, term771784.getClass(), "lcdRenderingHint", null);
        setField(term771784, term771784.getClass(), "component", null);
        setField(term771784, term771784.getClass(), "layoutMgr", null);
        setField(term771784, term771784.getClass(), "dispatcher", null);
        setField(term771784, term771784.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term771784, term771784.getClass(), "focusCycleRoot", false);
        setBooleanField(term771784, term771784.getClass(), "focusTraversalPolicyProvider", false);
        setField(term771784, term771784.getClass(), "printingThreads", null);
        setBooleanField(term771784, term771784.getClass(), "printing", false);
        setField(term771784, term771784.getClass(), "containerListener", null);
        setIntField(term771784, term771784.getClass(), "listeningChildren", 0);
        setIntField(term771784, term771784.getClass(), "listeningBoundsChildren", 0);
        setIntField(term771784, term771784.getClass(), "descendantsCount", 0);
        setField(term771784, term771784.getClass(), "preserveBackgroundColor", null);
        setIntField(term771784, term771784.getClass(), "numOfHWComponents", 0);
        setIntField(term771784, term771784.getClass(), "numOfLWComponents", 0);
        setField(term771784, term771784.getClass(), "modalComp", null);
        setField(term771784, term771784.getClass(), "modalAppContext", null);
        setIntField(term771784, term771784.getClass(), "containerSerializedDataVersion", 0);
        setField(term771784, term771784.getClass(), "peer", null);
        setField(term771784, term771784.getClass(), "parent", null);
        setField(term771784, term771784.getClass(), "appContext", null);
        setIntField(term771784, term771784.getClass(), "x", 0);
        setIntField(term771784, term771784.getClass(), "y", 0);
        setIntField(term771784, term771784.getClass(), "width", 0);
        setIntField(term771784, term771784.getClass(), "height", 0);
        setField(term771784, term771784.getClass(), "foreground", null);
        setField(term771784, term771784.getClass(), "background", null);
        setField(term771784, term771784.getClass(), "font", null);
        setField(term771784, term771784.getClass(), "peerFont", null);
        setField(term771784, term771784.getClass(), "cursor", null);
        setField(term771784, term771784.getClass(), "locale", null);
        setField(term771784, term771784.getClass(), "graphicsConfig", null);
        setField(term771784, term771784.getClass(), "bufferStrategy", null);
        setBooleanField(term771784, term771784.getClass(), "ignoreRepaint", false);
        setBooleanField(term771784, term771784.getClass(), "visible", false);
        setBooleanField(term771784, term771784.getClass(), "enabled", false);
        setBooleanField(term771784, term771784.getClass(), "valid", false);
        setField(term771784, term771784.getClass(), "dropTarget", null);
        setField(term771784, term771784.getClass(), "popups", null);
        setField(term771784, term771784.getClass(), "name", null);
        setBooleanField(term771784, term771784.getClass(), "nameExplicitlySet", false);
        setBooleanField(term771784, term771784.getClass(), "focusable", false);
        setIntField(term771784, term771784.getClass(), "isFocusTraversableOverridden", 0);
        setField(term771784, term771784.getClass(), "focusTraversalKeys", null);
        setBooleanField(term771784, term771784.getClass(), "focusTraversalKeysEnabled", false);
        setField(term771784, term771784.getClass(), "acc", null);
        setField(term771784, term771784.getClass(), "minSize", null);
        setBooleanField(term771784, term771784.getClass(), "minSizeSet", false);
        setField(term771784, term771784.getClass(), "prefSize", null);
        setBooleanField(term771784, term771784.getClass(), "prefSizeSet", false);
        setField(term771784, term771784.getClass(), "maxSize", null);
        setBooleanField(term771784, term771784.getClass(), "maxSizeSet", false);
        setField(term771784, term771784.getClass(), "componentOrientation", null);
        setBooleanField(term771784, term771784.getClass(), "newEventsOnly", false);
        setField(term771784, term771784.getClass(), "componentListener", null);
        setField(term771784, term771784.getClass(), "focusListener", null);
        setField(term771784, term771784.getClass(), "hierarchyListener", null);
        setField(term771784, term771784.getClass(), "hierarchyBoundsListener", null);
        setField(term771784, term771784.getClass(), "keyListener", null);
        setField(term771784, term771784.getClass(), "mouseListener", null);
        setField(term771784, term771784.getClass(), "mouseMotionListener", null);
        setField(term771784, term771784.getClass(), "mouseWheelListener", null);
        setField(term771784, term771784.getClass(), "inputMethodListener", null);
        setLongField(term771784, term771784.getClass(), "eventMask", 0L);
        setField(term771784, term771784.getClass(), "changeSupport", null);
        setField(term771784, term771784.getClass(), "objectLock", null);
        setBooleanField(term771784, term771784.getClass(), "isPacked", false);
        setIntField(term771784, term771784.getClass(), "boundsOp", 0);
        setField(term771784, term771784.getClass(), "compoundShape", null);
        setField(term771784, term771784.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term771784, term771784.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term771784, term771784.getClass(), "backgroundEraseDisabled", false);
        setField(term771784, term771784.getClass(), "eventCache", null);
        setBooleanField(term771784, term771784.getClass(), "coalescingEnabled", false);
        setBooleanField(term771784, term771784.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term771784, term771784.getClass(), "componentSerializedDataVersion", 0);
        setField(term771784, term771784.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ShipUpgradeView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updatePanels", argTypes, term771784, args);
    }

};


