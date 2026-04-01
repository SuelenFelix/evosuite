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

public class ShipUpgradeView_showDifference_6661261914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term766249;

    public ShipUpgradeView_showDifference_6661261914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term766249 = newInstance(Class.forName("org.openRealmOfStars.game.state.ShipUpgradeView"));
        setField(term766249, term766249.getClass(), "player", null);
        setField(term766249, term766249.getClass(), "planet", null);
        setField(term766249, term766249.getClass(), "fleet", null);
        setField(term766249, term766249.getClass(), "shipImage", null);
        setField(term766249, term766249.getClass(), "infoText", null);
        setField(term766249, term766249.getClass(), "shipListInFleet", null);
        setField(term766249, term766249.getClass(), "upgradeList", null);
        setField(term766249, term766249.getClass(), "metalOnPlanet", null);
        setField(term766249, term766249.getClass(), "credits", null);
        setField(term766249, term766249.getClass(), "totalCost", null);
        setField(term766249, term766249.getClass(), "upgradeButton", null);
        setIntField(term766249, term766249.getClass(), "metalUpgradeCost", 0);
        setIntField(term766249, term766249.getClass(), "prodUpgradeCost", 0);
        setBooleanField(term766249, term766249.getClass(), "isAlignmentXSet", false);
        setFloatField(term766249, term766249.getClass(), "alignmentX", 0.0F);
        setBooleanField(term766249, term766249.getClass(), "isAlignmentYSet", false);
        setFloatField(term766249, term766249.getClass(), "alignmentY", 0.0F);
        setField(term766249, term766249.getClass(), "ui", null);
        setField(term766249, term766249.getClass(), "listenerList", null);
        setField(term766249, term766249.getClass(), "clientProperties", null);
        setField(term766249, term766249.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term766249, term766249.getClass(), "autoscrolls", false);
        setField(term766249, term766249.getClass(), "border", null);
        setIntField(term766249, term766249.getClass(), "flags", 0);
        setField(term766249, term766249.getClass(), "inputVerifier", null);
        setBooleanField(term766249, term766249.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term766249, term766249.getClass(), "paintingChild", null);
        setField(term766249, term766249.getClass(), "popupMenu", null);
        setField(term766249, term766249.getClass(), "revalidateRunnableScheduled", null);
        setField(term766249, term766249.getClass(), "focusInputMap", null);
        setField(term766249, term766249.getClass(), "ancestorInputMap", null);
        setField(term766249, term766249.getClass(), "windowInputMap", null);
        setField(term766249, term766249.getClass(), "actionMap", null);
        setField(term766249, term766249.getClass(), "aaHint", null);
        setField(term766249, term766249.getClass(), "lcdRenderingHint", null);
        setField(term766249, term766249.getClass(), "component", null);
        setField(term766249, term766249.getClass(), "layoutMgr", null);
        setField(term766249, term766249.getClass(), "dispatcher", null);
        setField(term766249, term766249.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term766249, term766249.getClass(), "focusCycleRoot", false);
        setBooleanField(term766249, term766249.getClass(), "focusTraversalPolicyProvider", false);
        setField(term766249, term766249.getClass(), "printingThreads", null);
        setBooleanField(term766249, term766249.getClass(), "printing", false);
        setField(term766249, term766249.getClass(), "containerListener", null);
        setIntField(term766249, term766249.getClass(), "listeningChildren", 0);
        setIntField(term766249, term766249.getClass(), "listeningBoundsChildren", 0);
        setIntField(term766249, term766249.getClass(), "descendantsCount", 0);
        setField(term766249, term766249.getClass(), "preserveBackgroundColor", null);
        setIntField(term766249, term766249.getClass(), "numOfHWComponents", 0);
        setIntField(term766249, term766249.getClass(), "numOfLWComponents", 0);
        setField(term766249, term766249.getClass(), "modalComp", null);
        setField(term766249, term766249.getClass(), "modalAppContext", null);
        setIntField(term766249, term766249.getClass(), "containerSerializedDataVersion", 0);
        setField(term766249, term766249.getClass(), "peer", null);
        setField(term766249, term766249.getClass(), "parent", null);
        setField(term766249, term766249.getClass(), "appContext", null);
        setIntField(term766249, term766249.getClass(), "x", 0);
        setIntField(term766249, term766249.getClass(), "y", 0);
        setIntField(term766249, term766249.getClass(), "width", 0);
        setIntField(term766249, term766249.getClass(), "height", 0);
        setField(term766249, term766249.getClass(), "foreground", null);
        setField(term766249, term766249.getClass(), "background", null);
        setField(term766249, term766249.getClass(), "font", null);
        setField(term766249, term766249.getClass(), "peerFont", null);
        setField(term766249, term766249.getClass(), "cursor", null);
        setField(term766249, term766249.getClass(), "locale", null);
        setField(term766249, term766249.getClass(), "graphicsConfig", null);
        setField(term766249, term766249.getClass(), "bufferStrategy", null);
        setBooleanField(term766249, term766249.getClass(), "ignoreRepaint", false);
        setBooleanField(term766249, term766249.getClass(), "visible", false);
        setBooleanField(term766249, term766249.getClass(), "enabled", false);
        setBooleanField(term766249, term766249.getClass(), "valid", false);
        setField(term766249, term766249.getClass(), "dropTarget", null);
        setField(term766249, term766249.getClass(), "popups", null);
        setField(term766249, term766249.getClass(), "name", null);
        setBooleanField(term766249, term766249.getClass(), "nameExplicitlySet", false);
        setBooleanField(term766249, term766249.getClass(), "focusable", false);
        setIntField(term766249, term766249.getClass(), "isFocusTraversableOverridden", 0);
        setField(term766249, term766249.getClass(), "focusTraversalKeys", null);
        setBooleanField(term766249, term766249.getClass(), "focusTraversalKeysEnabled", false);
        setField(term766249, term766249.getClass(), "acc", null);
        setField(term766249, term766249.getClass(), "minSize", null);
        setBooleanField(term766249, term766249.getClass(), "minSizeSet", false);
        setField(term766249, term766249.getClass(), "prefSize", null);
        setBooleanField(term766249, term766249.getClass(), "prefSizeSet", false);
        setField(term766249, term766249.getClass(), "maxSize", null);
        setBooleanField(term766249, term766249.getClass(), "maxSizeSet", false);
        setField(term766249, term766249.getClass(), "componentOrientation", null);
        setBooleanField(term766249, term766249.getClass(), "newEventsOnly", false);
        setField(term766249, term766249.getClass(), "componentListener", null);
        setField(term766249, term766249.getClass(), "focusListener", null);
        setField(term766249, term766249.getClass(), "hierarchyListener", null);
        setField(term766249, term766249.getClass(), "hierarchyBoundsListener", null);
        setField(term766249, term766249.getClass(), "keyListener", null);
        setField(term766249, term766249.getClass(), "mouseListener", null);
        setField(term766249, term766249.getClass(), "mouseMotionListener", null);
        setField(term766249, term766249.getClass(), "mouseWheelListener", null);
        setField(term766249, term766249.getClass(), "inputMethodListener", null);
        setLongField(term766249, term766249.getClass(), "eventMask", 0L);
        setField(term766249, term766249.getClass(), "changeSupport", null);
        setField(term766249, term766249.getClass(), "objectLock", null);
        setBooleanField(term766249, term766249.getClass(), "isPacked", false);
        setIntField(term766249, term766249.getClass(), "boundsOp", 0);
        setField(term766249, term766249.getClass(), "compoundShape", null);
        setField(term766249, term766249.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term766249, term766249.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term766249, term766249.getClass(), "backgroundEraseDisabled", false);
        setField(term766249, term766249.getClass(), "eventCache", null);
        setBooleanField(term766249, term766249.getClass(), "coalescingEnabled", false);
        setBooleanField(term766249, term766249.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term766249, term766249.getClass(), "componentSerializedDataVersion", 0);
        setField(term766249, term766249.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ShipUpgradeView");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.ship.Ship");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "showDifference", argTypes, term766249, args);
    }

};


