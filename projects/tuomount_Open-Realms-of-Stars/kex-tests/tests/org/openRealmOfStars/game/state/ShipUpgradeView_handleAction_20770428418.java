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

public class ShipUpgradeView_handleAction_20770428418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term777221;

    public ShipUpgradeView_handleAction_20770428418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term777221 = newInstance(Class.forName("org.openRealmOfStars.game.state.ShipUpgradeView"));
        setField(term777221, term777221.getClass(), "player", null);
        setField(term777221, term777221.getClass(), "planet", null);
        setField(term777221, term777221.getClass(), "fleet", null);
        setField(term777221, term777221.getClass(), "shipImage", null);
        setField(term777221, term777221.getClass(), "infoText", null);
        setField(term777221, term777221.getClass(), "shipListInFleet", null);
        setField(term777221, term777221.getClass(), "upgradeList", null);
        setField(term777221, term777221.getClass(), "metalOnPlanet", null);
        setField(term777221, term777221.getClass(), "credits", null);
        setField(term777221, term777221.getClass(), "totalCost", null);
        setField(term777221, term777221.getClass(), "upgradeButton", null);
        setIntField(term777221, term777221.getClass(), "metalUpgradeCost", 0);
        setIntField(term777221, term777221.getClass(), "prodUpgradeCost", 0);
        setBooleanField(term777221, term777221.getClass(), "isAlignmentXSet", false);
        setFloatField(term777221, term777221.getClass(), "alignmentX", 0.0F);
        setBooleanField(term777221, term777221.getClass(), "isAlignmentYSet", false);
        setFloatField(term777221, term777221.getClass(), "alignmentY", 0.0F);
        setField(term777221, term777221.getClass(), "ui", null);
        setField(term777221, term777221.getClass(), "listenerList", null);
        setField(term777221, term777221.getClass(), "clientProperties", null);
        setField(term777221, term777221.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term777221, term777221.getClass(), "autoscrolls", false);
        setField(term777221, term777221.getClass(), "border", null);
        setIntField(term777221, term777221.getClass(), "flags", 0);
        setField(term777221, term777221.getClass(), "inputVerifier", null);
        setBooleanField(term777221, term777221.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term777221, term777221.getClass(), "paintingChild", null);
        setField(term777221, term777221.getClass(), "popupMenu", null);
        setField(term777221, term777221.getClass(), "revalidateRunnableScheduled", null);
        setField(term777221, term777221.getClass(), "focusInputMap", null);
        setField(term777221, term777221.getClass(), "ancestorInputMap", null);
        setField(term777221, term777221.getClass(), "windowInputMap", null);
        setField(term777221, term777221.getClass(), "actionMap", null);
        setField(term777221, term777221.getClass(), "aaHint", null);
        setField(term777221, term777221.getClass(), "lcdRenderingHint", null);
        setField(term777221, term777221.getClass(), "component", null);
        setField(term777221, term777221.getClass(), "layoutMgr", null);
        setField(term777221, term777221.getClass(), "dispatcher", null);
        setField(term777221, term777221.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term777221, term777221.getClass(), "focusCycleRoot", false);
        setBooleanField(term777221, term777221.getClass(), "focusTraversalPolicyProvider", false);
        setField(term777221, term777221.getClass(), "printingThreads", null);
        setBooleanField(term777221, term777221.getClass(), "printing", false);
        setField(term777221, term777221.getClass(), "containerListener", null);
        setIntField(term777221, term777221.getClass(), "listeningChildren", 0);
        setIntField(term777221, term777221.getClass(), "listeningBoundsChildren", 0);
        setIntField(term777221, term777221.getClass(), "descendantsCount", 0);
        setField(term777221, term777221.getClass(), "preserveBackgroundColor", null);
        setIntField(term777221, term777221.getClass(), "numOfHWComponents", 0);
        setIntField(term777221, term777221.getClass(), "numOfLWComponents", 0);
        setField(term777221, term777221.getClass(), "modalComp", null);
        setField(term777221, term777221.getClass(), "modalAppContext", null);
        setIntField(term777221, term777221.getClass(), "containerSerializedDataVersion", 0);
        setField(term777221, term777221.getClass(), "peer", null);
        setField(term777221, term777221.getClass(), "parent", null);
        setField(term777221, term777221.getClass(), "appContext", null);
        setIntField(term777221, term777221.getClass(), "x", 0);
        setIntField(term777221, term777221.getClass(), "y", 0);
        setIntField(term777221, term777221.getClass(), "width", 0);
        setIntField(term777221, term777221.getClass(), "height", 0);
        setField(term777221, term777221.getClass(), "foreground", null);
        setField(term777221, term777221.getClass(), "background", null);
        setField(term777221, term777221.getClass(), "font", null);
        setField(term777221, term777221.getClass(), "peerFont", null);
        setField(term777221, term777221.getClass(), "cursor", null);
        setField(term777221, term777221.getClass(), "locale", null);
        setField(term777221, term777221.getClass(), "graphicsConfig", null);
        setField(term777221, term777221.getClass(), "bufferStrategy", null);
        setBooleanField(term777221, term777221.getClass(), "ignoreRepaint", false);
        setBooleanField(term777221, term777221.getClass(), "visible", false);
        setBooleanField(term777221, term777221.getClass(), "enabled", false);
        setBooleanField(term777221, term777221.getClass(), "valid", false);
        setField(term777221, term777221.getClass(), "dropTarget", null);
        setField(term777221, term777221.getClass(), "popups", null);
        setField(term777221, term777221.getClass(), "name", null);
        setBooleanField(term777221, term777221.getClass(), "nameExplicitlySet", false);
        setBooleanField(term777221, term777221.getClass(), "focusable", false);
        setIntField(term777221, term777221.getClass(), "isFocusTraversableOverridden", 0);
        setField(term777221, term777221.getClass(), "focusTraversalKeys", null);
        setBooleanField(term777221, term777221.getClass(), "focusTraversalKeysEnabled", false);
        setField(term777221, term777221.getClass(), "acc", null);
        setField(term777221, term777221.getClass(), "minSize", null);
        setBooleanField(term777221, term777221.getClass(), "minSizeSet", false);
        setField(term777221, term777221.getClass(), "prefSize", null);
        setBooleanField(term777221, term777221.getClass(), "prefSizeSet", false);
        setField(term777221, term777221.getClass(), "maxSize", null);
        setBooleanField(term777221, term777221.getClass(), "maxSizeSet", false);
        setField(term777221, term777221.getClass(), "componentOrientation", null);
        setBooleanField(term777221, term777221.getClass(), "newEventsOnly", false);
        setField(term777221, term777221.getClass(), "componentListener", null);
        setField(term777221, term777221.getClass(), "focusListener", null);
        setField(term777221, term777221.getClass(), "hierarchyListener", null);
        setField(term777221, term777221.getClass(), "hierarchyBoundsListener", null);
        setField(term777221, term777221.getClass(), "keyListener", null);
        setField(term777221, term777221.getClass(), "mouseListener", null);
        setField(term777221, term777221.getClass(), "mouseMotionListener", null);
        setField(term777221, term777221.getClass(), "mouseWheelListener", null);
        setField(term777221, term777221.getClass(), "inputMethodListener", null);
        setLongField(term777221, term777221.getClass(), "eventMask", 0L);
        setField(term777221, term777221.getClass(), "changeSupport", null);
        setField(term777221, term777221.getClass(), "objectLock", null);
        setBooleanField(term777221, term777221.getClass(), "isPacked", false);
        setIntField(term777221, term777221.getClass(), "boundsOp", 0);
        setField(term777221, term777221.getClass(), "compoundShape", null);
        setField(term777221, term777221.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term777221, term777221.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term777221, term777221.getClass(), "backgroundEraseDisabled", false);
        setField(term777221, term777221.getClass(), "eventCache", null);
        setBooleanField(term777221, term777221.getClass(), "coalescingEnabled", false);
        setBooleanField(term777221, term777221.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term777221, term777221.getClass(), "componentSerializedDataVersion", 0);
        setField(term777221, term777221.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ShipUpgradeView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleAction", argTypes, term777221, args);
    }

};


