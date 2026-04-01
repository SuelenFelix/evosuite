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
import java.lang.Integer;

public class ShipUpgradeView_getValueColor_61409974715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term795828;
     Object term795871;
     Object term795873;

    public ShipUpgradeView_getValueColor_61409974715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term795828 = newInstance(Class.forName("org.openRealmOfStars.game.state.ShipUpgradeView"));
        setField(term795828, term795828.getClass(), "player", null);
        setField(term795828, term795828.getClass(), "planet", null);
        setField(term795828, term795828.getClass(), "fleet", null);
        setField(term795828, term795828.getClass(), "shipImage", null);
        setField(term795828, term795828.getClass(), "infoText", null);
        setField(term795828, term795828.getClass(), "shipListInFleet", null);
        setField(term795828, term795828.getClass(), "upgradeList", null);
        setField(term795828, term795828.getClass(), "metalOnPlanet", null);
        setField(term795828, term795828.getClass(), "credits", null);
        setField(term795828, term795828.getClass(), "totalCost", null);
        setField(term795828, term795828.getClass(), "upgradeButton", null);
        setIntField(term795828, term795828.getClass(), "metalUpgradeCost", 0);
        setIntField(term795828, term795828.getClass(), "prodUpgradeCost", 0);
        setBooleanField(term795828, term795828.getClass(), "isAlignmentXSet", false);
        setFloatField(term795828, term795828.getClass(), "alignmentX", 0.0F);
        setBooleanField(term795828, term795828.getClass(), "isAlignmentYSet", false);
        setFloatField(term795828, term795828.getClass(), "alignmentY", 0.0F);
        setField(term795828, term795828.getClass(), "ui", null);
        setField(term795828, term795828.getClass(), "listenerList", null);
        setField(term795828, term795828.getClass(), "clientProperties", null);
        setField(term795828, term795828.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term795828, term795828.getClass(), "autoscrolls", false);
        setField(term795828, term795828.getClass(), "border", null);
        setIntField(term795828, term795828.getClass(), "flags", 0);
        setField(term795828, term795828.getClass(), "inputVerifier", null);
        setBooleanField(term795828, term795828.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term795828, term795828.getClass(), "paintingChild", null);
        setField(term795828, term795828.getClass(), "popupMenu", null);
        setField(term795828, term795828.getClass(), "revalidateRunnableScheduled", null);
        setField(term795828, term795828.getClass(), "focusInputMap", null);
        setField(term795828, term795828.getClass(), "ancestorInputMap", null);
        setField(term795828, term795828.getClass(), "windowInputMap", null);
        setField(term795828, term795828.getClass(), "actionMap", null);
        setField(term795828, term795828.getClass(), "aaHint", null);
        setField(term795828, term795828.getClass(), "lcdRenderingHint", null);
        setField(term795828, term795828.getClass(), "component", null);
        setField(term795828, term795828.getClass(), "layoutMgr", null);
        setField(term795828, term795828.getClass(), "dispatcher", null);
        setField(term795828, term795828.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term795828, term795828.getClass(), "focusCycleRoot", false);
        setBooleanField(term795828, term795828.getClass(), "focusTraversalPolicyProvider", false);
        setField(term795828, term795828.getClass(), "printingThreads", null);
        setBooleanField(term795828, term795828.getClass(), "printing", false);
        setField(term795828, term795828.getClass(), "containerListener", null);
        setIntField(term795828, term795828.getClass(), "listeningChildren", 0);
        setIntField(term795828, term795828.getClass(), "listeningBoundsChildren", 0);
        setIntField(term795828, term795828.getClass(), "descendantsCount", 0);
        setField(term795828, term795828.getClass(), "preserveBackgroundColor", null);
        setIntField(term795828, term795828.getClass(), "numOfHWComponents", 0);
        setIntField(term795828, term795828.getClass(), "numOfLWComponents", 0);
        setField(term795828, term795828.getClass(), "modalComp", null);
        setField(term795828, term795828.getClass(), "modalAppContext", null);
        setIntField(term795828, term795828.getClass(), "containerSerializedDataVersion", 0);
        setField(term795828, term795828.getClass(), "peer", null);
        setField(term795828, term795828.getClass(), "parent", null);
        setField(term795828, term795828.getClass(), "appContext", null);
        setIntField(term795828, term795828.getClass(), "x", 0);
        setIntField(term795828, term795828.getClass(), "y", 0);
        setIntField(term795828, term795828.getClass(), "width", 0);
        setIntField(term795828, term795828.getClass(), "height", 0);
        setField(term795828, term795828.getClass(), "foreground", null);
        setField(term795828, term795828.getClass(), "background", null);
        setField(term795828, term795828.getClass(), "font", null);
        setField(term795828, term795828.getClass(), "peerFont", null);
        setField(term795828, term795828.getClass(), "cursor", null);
        setField(term795828, term795828.getClass(), "locale", null);
        setField(term795828, term795828.getClass(), "graphicsConfig", null);
        setField(term795828, term795828.getClass(), "bufferStrategy", null);
        setBooleanField(term795828, term795828.getClass(), "ignoreRepaint", false);
        setBooleanField(term795828, term795828.getClass(), "visible", false);
        setBooleanField(term795828, term795828.getClass(), "enabled", false);
        setBooleanField(term795828, term795828.getClass(), "valid", false);
        setField(term795828, term795828.getClass(), "dropTarget", null);
        setField(term795828, term795828.getClass(), "popups", null);
        setField(term795828, term795828.getClass(), "name", null);
        setBooleanField(term795828, term795828.getClass(), "nameExplicitlySet", false);
        setBooleanField(term795828, term795828.getClass(), "focusable", false);
        setIntField(term795828, term795828.getClass(), "isFocusTraversableOverridden", 0);
        setField(term795828, term795828.getClass(), "focusTraversalKeys", null);
        setBooleanField(term795828, term795828.getClass(), "focusTraversalKeysEnabled", false);
        setField(term795828, term795828.getClass(), "acc", null);
        setField(term795828, term795828.getClass(), "minSize", null);
        setBooleanField(term795828, term795828.getClass(), "minSizeSet", false);
        setField(term795828, term795828.getClass(), "prefSize", null);
        setBooleanField(term795828, term795828.getClass(), "prefSizeSet", false);
        setField(term795828, term795828.getClass(), "maxSize", null);
        setBooleanField(term795828, term795828.getClass(), "maxSizeSet", false);
        setField(term795828, term795828.getClass(), "componentOrientation", null);
        setBooleanField(term795828, term795828.getClass(), "newEventsOnly", false);
        setField(term795828, term795828.getClass(), "componentListener", null);
        setField(term795828, term795828.getClass(), "focusListener", null);
        setField(term795828, term795828.getClass(), "hierarchyListener", null);
        setField(term795828, term795828.getClass(), "hierarchyBoundsListener", null);
        setField(term795828, term795828.getClass(), "keyListener", null);
        setField(term795828, term795828.getClass(), "mouseListener", null);
        setField(term795828, term795828.getClass(), "mouseMotionListener", null);
        setField(term795828, term795828.getClass(), "mouseWheelListener", null);
        setField(term795828, term795828.getClass(), "inputMethodListener", null);
        setLongField(term795828, term795828.getClass(), "eventMask", 0L);
        setField(term795828, term795828.getClass(), "changeSupport", null);
        setField(term795828, term795828.getClass(), "objectLock", null);
        setBooleanField(term795828, term795828.getClass(), "isPacked", false);
        setIntField(term795828, term795828.getClass(), "boundsOp", 0);
        setField(term795828, term795828.getClass(), "compoundShape", null);
        setField(term795828, term795828.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term795828, term795828.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term795828, term795828.getClass(), "backgroundEraseDisabled", false);
        setField(term795828, term795828.getClass(), "eventCache", null);
        setBooleanField(term795828, term795828.getClass(), "coalescingEnabled", false);
        setBooleanField(term795828, term795828.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term795828, term795828.getClass(), "componentSerializedDataVersion", 0);
        setField(term795828, term795828.getClass(), "accessibleContext", null);
        term795871 = new Integer(0);
        term795873 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ShipUpgradeView");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term795871;
        args[1] = term795873;
        callMethod(klass, "getValueColor", argTypes, term795828, args);
    }

};


