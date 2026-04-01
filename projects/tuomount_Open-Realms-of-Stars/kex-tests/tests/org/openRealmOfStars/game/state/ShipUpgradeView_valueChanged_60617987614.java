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

public class ShipUpgradeView_valueChanged_60617987614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term795785;

    public ShipUpgradeView_valueChanged_60617987614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term795785 = newInstance(Class.forName("org.openRealmOfStars.game.state.ShipUpgradeView"));
        setField(term795785, term795785.getClass(), "player", null);
        setField(term795785, term795785.getClass(), "planet", null);
        setField(term795785, term795785.getClass(), "fleet", null);
        setField(term795785, term795785.getClass(), "shipImage", null);
        setField(term795785, term795785.getClass(), "infoText", null);
        setField(term795785, term795785.getClass(), "shipListInFleet", null);
        setField(term795785, term795785.getClass(), "upgradeList", null);
        setField(term795785, term795785.getClass(), "metalOnPlanet", null);
        setField(term795785, term795785.getClass(), "credits", null);
        setField(term795785, term795785.getClass(), "totalCost", null);
        setField(term795785, term795785.getClass(), "upgradeButton", null);
        setIntField(term795785, term795785.getClass(), "metalUpgradeCost", 0);
        setIntField(term795785, term795785.getClass(), "prodUpgradeCost", 0);
        setBooleanField(term795785, term795785.getClass(), "isAlignmentXSet", false);
        setFloatField(term795785, term795785.getClass(), "alignmentX", 0.0F);
        setBooleanField(term795785, term795785.getClass(), "isAlignmentYSet", false);
        setFloatField(term795785, term795785.getClass(), "alignmentY", 0.0F);
        setField(term795785, term795785.getClass(), "ui", null);
        setField(term795785, term795785.getClass(), "listenerList", null);
        setField(term795785, term795785.getClass(), "clientProperties", null);
        setField(term795785, term795785.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term795785, term795785.getClass(), "autoscrolls", false);
        setField(term795785, term795785.getClass(), "border", null);
        setIntField(term795785, term795785.getClass(), "flags", 0);
        setField(term795785, term795785.getClass(), "inputVerifier", null);
        setBooleanField(term795785, term795785.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term795785, term795785.getClass(), "paintingChild", null);
        setField(term795785, term795785.getClass(), "popupMenu", null);
        setField(term795785, term795785.getClass(), "revalidateRunnableScheduled", null);
        setField(term795785, term795785.getClass(), "focusInputMap", null);
        setField(term795785, term795785.getClass(), "ancestorInputMap", null);
        setField(term795785, term795785.getClass(), "windowInputMap", null);
        setField(term795785, term795785.getClass(), "actionMap", null);
        setField(term795785, term795785.getClass(), "aaHint", null);
        setField(term795785, term795785.getClass(), "lcdRenderingHint", null);
        setField(term795785, term795785.getClass(), "component", null);
        setField(term795785, term795785.getClass(), "layoutMgr", null);
        setField(term795785, term795785.getClass(), "dispatcher", null);
        setField(term795785, term795785.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term795785, term795785.getClass(), "focusCycleRoot", false);
        setBooleanField(term795785, term795785.getClass(), "focusTraversalPolicyProvider", false);
        setField(term795785, term795785.getClass(), "printingThreads", null);
        setBooleanField(term795785, term795785.getClass(), "printing", false);
        setField(term795785, term795785.getClass(), "containerListener", null);
        setIntField(term795785, term795785.getClass(), "listeningChildren", 0);
        setIntField(term795785, term795785.getClass(), "listeningBoundsChildren", 0);
        setIntField(term795785, term795785.getClass(), "descendantsCount", 0);
        setField(term795785, term795785.getClass(), "preserveBackgroundColor", null);
        setIntField(term795785, term795785.getClass(), "numOfHWComponents", 0);
        setIntField(term795785, term795785.getClass(), "numOfLWComponents", 0);
        setField(term795785, term795785.getClass(), "modalComp", null);
        setField(term795785, term795785.getClass(), "modalAppContext", null);
        setIntField(term795785, term795785.getClass(), "containerSerializedDataVersion", 0);
        setField(term795785, term795785.getClass(), "peer", null);
        setField(term795785, term795785.getClass(), "parent", null);
        setField(term795785, term795785.getClass(), "appContext", null);
        setIntField(term795785, term795785.getClass(), "x", 0);
        setIntField(term795785, term795785.getClass(), "y", 0);
        setIntField(term795785, term795785.getClass(), "width", 0);
        setIntField(term795785, term795785.getClass(), "height", 0);
        setField(term795785, term795785.getClass(), "foreground", null);
        setField(term795785, term795785.getClass(), "background", null);
        setField(term795785, term795785.getClass(), "font", null);
        setField(term795785, term795785.getClass(), "peerFont", null);
        setField(term795785, term795785.getClass(), "cursor", null);
        setField(term795785, term795785.getClass(), "locale", null);
        setField(term795785, term795785.getClass(), "graphicsConfig", null);
        setField(term795785, term795785.getClass(), "bufferStrategy", null);
        setBooleanField(term795785, term795785.getClass(), "ignoreRepaint", false);
        setBooleanField(term795785, term795785.getClass(), "visible", false);
        setBooleanField(term795785, term795785.getClass(), "enabled", false);
        setBooleanField(term795785, term795785.getClass(), "valid", false);
        setField(term795785, term795785.getClass(), "dropTarget", null);
        setField(term795785, term795785.getClass(), "popups", null);
        setField(term795785, term795785.getClass(), "name", null);
        setBooleanField(term795785, term795785.getClass(), "nameExplicitlySet", false);
        setBooleanField(term795785, term795785.getClass(), "focusable", false);
        setIntField(term795785, term795785.getClass(), "isFocusTraversableOverridden", 0);
        setField(term795785, term795785.getClass(), "focusTraversalKeys", null);
        setBooleanField(term795785, term795785.getClass(), "focusTraversalKeysEnabled", false);
        setField(term795785, term795785.getClass(), "acc", null);
        setField(term795785, term795785.getClass(), "minSize", null);
        setBooleanField(term795785, term795785.getClass(), "minSizeSet", false);
        setField(term795785, term795785.getClass(), "prefSize", null);
        setBooleanField(term795785, term795785.getClass(), "prefSizeSet", false);
        setField(term795785, term795785.getClass(), "maxSize", null);
        setBooleanField(term795785, term795785.getClass(), "maxSizeSet", false);
        setField(term795785, term795785.getClass(), "componentOrientation", null);
        setBooleanField(term795785, term795785.getClass(), "newEventsOnly", false);
        setField(term795785, term795785.getClass(), "componentListener", null);
        setField(term795785, term795785.getClass(), "focusListener", null);
        setField(term795785, term795785.getClass(), "hierarchyListener", null);
        setField(term795785, term795785.getClass(), "hierarchyBoundsListener", null);
        setField(term795785, term795785.getClass(), "keyListener", null);
        setField(term795785, term795785.getClass(), "mouseListener", null);
        setField(term795785, term795785.getClass(), "mouseMotionListener", null);
        setField(term795785, term795785.getClass(), "mouseWheelListener", null);
        setField(term795785, term795785.getClass(), "inputMethodListener", null);
        setLongField(term795785, term795785.getClass(), "eventMask", 0L);
        setField(term795785, term795785.getClass(), "changeSupport", null);
        setField(term795785, term795785.getClass(), "objectLock", null);
        setBooleanField(term795785, term795785.getClass(), "isPacked", false);
        setIntField(term795785, term795785.getClass(), "boundsOp", 0);
        setField(term795785, term795785.getClass(), "compoundShape", null);
        setField(term795785, term795785.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term795785, term795785.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term795785, term795785.getClass(), "backgroundEraseDisabled", false);
        setField(term795785, term795785.getClass(), "eventCache", null);
        setBooleanField(term795785, term795785.getClass(), "coalescingEnabled", false);
        setBooleanField(term795785, term795785.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term795785, term795785.getClass(), "componentSerializedDataVersion", 0);
        setField(term795785, term795785.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ShipUpgradeView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.event.ListSelectionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "valueChanged", argTypes, term795785, args);
    }

};


