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

public class ShipUpgradeView_updateUpgradePossibilities_173536549612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term789589;

    public ShipUpgradeView_updateUpgradePossibilities_173536549612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term789589 = newInstance(Class.forName("org.openRealmOfStars.game.state.ShipUpgradeView"));
        setField(term789589, term789589.getClass(), "player", null);
        setField(term789589, term789589.getClass(), "planet", null);
        setField(term789589, term789589.getClass(), "fleet", null);
        setField(term789589, term789589.getClass(), "shipImage", null);
        setField(term789589, term789589.getClass(), "infoText", null);
        setField(term789589, term789589.getClass(), "shipListInFleet", null);
        setField(term789589, term789589.getClass(), "upgradeList", null);
        setField(term789589, term789589.getClass(), "metalOnPlanet", null);
        setField(term789589, term789589.getClass(), "credits", null);
        setField(term789589, term789589.getClass(), "totalCost", null);
        setField(term789589, term789589.getClass(), "upgradeButton", null);
        setIntField(term789589, term789589.getClass(), "metalUpgradeCost", 0);
        setIntField(term789589, term789589.getClass(), "prodUpgradeCost", 0);
        setBooleanField(term789589, term789589.getClass(), "isAlignmentXSet", false);
        setFloatField(term789589, term789589.getClass(), "alignmentX", 0.0F);
        setBooleanField(term789589, term789589.getClass(), "isAlignmentYSet", false);
        setFloatField(term789589, term789589.getClass(), "alignmentY", 0.0F);
        setField(term789589, term789589.getClass(), "ui", null);
        setField(term789589, term789589.getClass(), "listenerList", null);
        setField(term789589, term789589.getClass(), "clientProperties", null);
        setField(term789589, term789589.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term789589, term789589.getClass(), "autoscrolls", false);
        setField(term789589, term789589.getClass(), "border", null);
        setIntField(term789589, term789589.getClass(), "flags", 0);
        setField(term789589, term789589.getClass(), "inputVerifier", null);
        setBooleanField(term789589, term789589.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term789589, term789589.getClass(), "paintingChild", null);
        setField(term789589, term789589.getClass(), "popupMenu", null);
        setField(term789589, term789589.getClass(), "revalidateRunnableScheduled", null);
        setField(term789589, term789589.getClass(), "focusInputMap", null);
        setField(term789589, term789589.getClass(), "ancestorInputMap", null);
        setField(term789589, term789589.getClass(), "windowInputMap", null);
        setField(term789589, term789589.getClass(), "actionMap", null);
        setField(term789589, term789589.getClass(), "aaHint", null);
        setField(term789589, term789589.getClass(), "lcdRenderingHint", null);
        setField(term789589, term789589.getClass(), "component", null);
        setField(term789589, term789589.getClass(), "layoutMgr", null);
        setField(term789589, term789589.getClass(), "dispatcher", null);
        setField(term789589, term789589.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term789589, term789589.getClass(), "focusCycleRoot", false);
        setBooleanField(term789589, term789589.getClass(), "focusTraversalPolicyProvider", false);
        setField(term789589, term789589.getClass(), "printingThreads", null);
        setBooleanField(term789589, term789589.getClass(), "printing", false);
        setField(term789589, term789589.getClass(), "containerListener", null);
        setIntField(term789589, term789589.getClass(), "listeningChildren", 0);
        setIntField(term789589, term789589.getClass(), "listeningBoundsChildren", 0);
        setIntField(term789589, term789589.getClass(), "descendantsCount", 0);
        setField(term789589, term789589.getClass(), "preserveBackgroundColor", null);
        setIntField(term789589, term789589.getClass(), "numOfHWComponents", 0);
        setIntField(term789589, term789589.getClass(), "numOfLWComponents", 0);
        setField(term789589, term789589.getClass(), "modalComp", null);
        setField(term789589, term789589.getClass(), "modalAppContext", null);
        setIntField(term789589, term789589.getClass(), "containerSerializedDataVersion", 0);
        setField(term789589, term789589.getClass(), "peer", null);
        setField(term789589, term789589.getClass(), "parent", null);
        setField(term789589, term789589.getClass(), "appContext", null);
        setIntField(term789589, term789589.getClass(), "x", 0);
        setIntField(term789589, term789589.getClass(), "y", 0);
        setIntField(term789589, term789589.getClass(), "width", 0);
        setIntField(term789589, term789589.getClass(), "height", 0);
        setField(term789589, term789589.getClass(), "foreground", null);
        setField(term789589, term789589.getClass(), "background", null);
        setField(term789589, term789589.getClass(), "font", null);
        setField(term789589, term789589.getClass(), "peerFont", null);
        setField(term789589, term789589.getClass(), "cursor", null);
        setField(term789589, term789589.getClass(), "locale", null);
        setField(term789589, term789589.getClass(), "graphicsConfig", null);
        setField(term789589, term789589.getClass(), "bufferStrategy", null);
        setBooleanField(term789589, term789589.getClass(), "ignoreRepaint", false);
        setBooleanField(term789589, term789589.getClass(), "visible", false);
        setBooleanField(term789589, term789589.getClass(), "enabled", false);
        setBooleanField(term789589, term789589.getClass(), "valid", false);
        setField(term789589, term789589.getClass(), "dropTarget", null);
        setField(term789589, term789589.getClass(), "popups", null);
        setField(term789589, term789589.getClass(), "name", null);
        setBooleanField(term789589, term789589.getClass(), "nameExplicitlySet", false);
        setBooleanField(term789589, term789589.getClass(), "focusable", false);
        setIntField(term789589, term789589.getClass(), "isFocusTraversableOverridden", 0);
        setField(term789589, term789589.getClass(), "focusTraversalKeys", null);
        setBooleanField(term789589, term789589.getClass(), "focusTraversalKeysEnabled", false);
        setField(term789589, term789589.getClass(), "acc", null);
        setField(term789589, term789589.getClass(), "minSize", null);
        setBooleanField(term789589, term789589.getClass(), "minSizeSet", false);
        setField(term789589, term789589.getClass(), "prefSize", null);
        setBooleanField(term789589, term789589.getClass(), "prefSizeSet", false);
        setField(term789589, term789589.getClass(), "maxSize", null);
        setBooleanField(term789589, term789589.getClass(), "maxSizeSet", false);
        setField(term789589, term789589.getClass(), "componentOrientation", null);
        setBooleanField(term789589, term789589.getClass(), "newEventsOnly", false);
        setField(term789589, term789589.getClass(), "componentListener", null);
        setField(term789589, term789589.getClass(), "focusListener", null);
        setField(term789589, term789589.getClass(), "hierarchyListener", null);
        setField(term789589, term789589.getClass(), "hierarchyBoundsListener", null);
        setField(term789589, term789589.getClass(), "keyListener", null);
        setField(term789589, term789589.getClass(), "mouseListener", null);
        setField(term789589, term789589.getClass(), "mouseMotionListener", null);
        setField(term789589, term789589.getClass(), "mouseWheelListener", null);
        setField(term789589, term789589.getClass(), "inputMethodListener", null);
        setLongField(term789589, term789589.getClass(), "eventMask", 0L);
        setField(term789589, term789589.getClass(), "changeSupport", null);
        setField(term789589, term789589.getClass(), "objectLock", null);
        setBooleanField(term789589, term789589.getClass(), "isPacked", false);
        setIntField(term789589, term789589.getClass(), "boundsOp", 0);
        setField(term789589, term789589.getClass(), "compoundShape", null);
        setField(term789589, term789589.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term789589, term789589.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term789589, term789589.getClass(), "backgroundEraseDisabled", false);
        setField(term789589, term789589.getClass(), "eventCache", null);
        setBooleanField(term789589, term789589.getClass(), "coalescingEnabled", false);
        setBooleanField(term789589, term789589.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term789589, term789589.getClass(), "componentSerializedDataVersion", 0);
        setField(term789589, term789589.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ShipUpgradeView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateUpgradePossibilities", argTypes, term789589, args);
    }

};


