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

public class ShipView_isCopyClicked_56741905013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1976840;

    public ShipView_isCopyClicked_56741905013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1976840 = newInstance(Class.forName("org.openRealmOfStars.game.state.ShipView"));
        setField(term1976840, term1976840.getClass(), "player", null);
        setField(term1976840, term1976840.getClass(), "shipList", null);
        setField(term1976840, term1976840.getClass(), "shipImage", null);
        setField(term1976840, term1976840.getClass(), "infoText", null);
        setBooleanField(term1976840, term1976840.getClass(), "copyClicked", false);
        setIntField(term1976840, term1976840.getClass(), "lastSelectedIndex", 0);
        setField(term1976840, term1976840.getClass(), "obsoleteBtn", null);
        setField(term1976840, term1976840.getClass(), "deleteBtn", null);
        setBooleanField(term1976840, term1976840.getClass(), "isAlignmentXSet", false);
        setFloatField(term1976840, term1976840.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1976840, term1976840.getClass(), "isAlignmentYSet", false);
        setFloatField(term1976840, term1976840.getClass(), "alignmentY", 0.0F);
        setField(term1976840, term1976840.getClass(), "ui", null);
        setField(term1976840, term1976840.getClass(), "listenerList", null);
        setField(term1976840, term1976840.getClass(), "clientProperties", null);
        setField(term1976840, term1976840.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1976840, term1976840.getClass(), "autoscrolls", false);
        setField(term1976840, term1976840.getClass(), "border", null);
        setIntField(term1976840, term1976840.getClass(), "flags", 0);
        setField(term1976840, term1976840.getClass(), "inputVerifier", null);
        setBooleanField(term1976840, term1976840.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1976840, term1976840.getClass(), "paintingChild", null);
        setField(term1976840, term1976840.getClass(), "popupMenu", null);
        setField(term1976840, term1976840.getClass(), "revalidateRunnableScheduled", null);
        setField(term1976840, term1976840.getClass(), "focusInputMap", null);
        setField(term1976840, term1976840.getClass(), "ancestorInputMap", null);
        setField(term1976840, term1976840.getClass(), "windowInputMap", null);
        setField(term1976840, term1976840.getClass(), "actionMap", null);
        setField(term1976840, term1976840.getClass(), "aaHint", null);
        setField(term1976840, term1976840.getClass(), "lcdRenderingHint", null);
        setField(term1976840, term1976840.getClass(), "component", null);
        setField(term1976840, term1976840.getClass(), "layoutMgr", null);
        setField(term1976840, term1976840.getClass(), "dispatcher", null);
        setField(term1976840, term1976840.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1976840, term1976840.getClass(), "focusCycleRoot", false);
        setBooleanField(term1976840, term1976840.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1976840, term1976840.getClass(), "printingThreads", null);
        setBooleanField(term1976840, term1976840.getClass(), "printing", false);
        setField(term1976840, term1976840.getClass(), "containerListener", null);
        setIntField(term1976840, term1976840.getClass(), "listeningChildren", 0);
        setIntField(term1976840, term1976840.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1976840, term1976840.getClass(), "descendantsCount", 0);
        setField(term1976840, term1976840.getClass(), "preserveBackgroundColor", null);
        setIntField(term1976840, term1976840.getClass(), "numOfHWComponents", 0);
        setIntField(term1976840, term1976840.getClass(), "numOfLWComponents", 0);
        setField(term1976840, term1976840.getClass(), "modalComp", null);
        setField(term1976840, term1976840.getClass(), "modalAppContext", null);
        setIntField(term1976840, term1976840.getClass(), "containerSerializedDataVersion", 0);
        setField(term1976840, term1976840.getClass(), "peer", null);
        setField(term1976840, term1976840.getClass(), "parent", null);
        setField(term1976840, term1976840.getClass(), "appContext", null);
        setIntField(term1976840, term1976840.getClass(), "x", 0);
        setIntField(term1976840, term1976840.getClass(), "y", 0);
        setIntField(term1976840, term1976840.getClass(), "width", 0);
        setIntField(term1976840, term1976840.getClass(), "height", 0);
        setField(term1976840, term1976840.getClass(), "foreground", null);
        setField(term1976840, term1976840.getClass(), "background", null);
        setField(term1976840, term1976840.getClass(), "font", null);
        setField(term1976840, term1976840.getClass(), "peerFont", null);
        setField(term1976840, term1976840.getClass(), "cursor", null);
        setField(term1976840, term1976840.getClass(), "locale", null);
        setField(term1976840, term1976840.getClass(), "graphicsConfig", null);
        setField(term1976840, term1976840.getClass(), "bufferStrategy", null);
        setBooleanField(term1976840, term1976840.getClass(), "ignoreRepaint", false);
        setBooleanField(term1976840, term1976840.getClass(), "visible", false);
        setBooleanField(term1976840, term1976840.getClass(), "enabled", false);
        setBooleanField(term1976840, term1976840.getClass(), "valid", false);
        setField(term1976840, term1976840.getClass(), "dropTarget", null);
        setField(term1976840, term1976840.getClass(), "popups", null);
        setField(term1976840, term1976840.getClass(), "name", null);
        setBooleanField(term1976840, term1976840.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1976840, term1976840.getClass(), "focusable", false);
        setIntField(term1976840, term1976840.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1976840, term1976840.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1976840, term1976840.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1976840, term1976840.getClass(), "acc", null);
        setField(term1976840, term1976840.getClass(), "minSize", null);
        setBooleanField(term1976840, term1976840.getClass(), "minSizeSet", false);
        setField(term1976840, term1976840.getClass(), "prefSize", null);
        setBooleanField(term1976840, term1976840.getClass(), "prefSizeSet", false);
        setField(term1976840, term1976840.getClass(), "maxSize", null);
        setBooleanField(term1976840, term1976840.getClass(), "maxSizeSet", false);
        setField(term1976840, term1976840.getClass(), "componentOrientation", null);
        setBooleanField(term1976840, term1976840.getClass(), "newEventsOnly", false);
        setField(term1976840, term1976840.getClass(), "componentListener", null);
        setField(term1976840, term1976840.getClass(), "focusListener", null);
        setField(term1976840, term1976840.getClass(), "hierarchyListener", null);
        setField(term1976840, term1976840.getClass(), "hierarchyBoundsListener", null);
        setField(term1976840, term1976840.getClass(), "keyListener", null);
        setField(term1976840, term1976840.getClass(), "mouseListener", null);
        setField(term1976840, term1976840.getClass(), "mouseMotionListener", null);
        setField(term1976840, term1976840.getClass(), "mouseWheelListener", null);
        setField(term1976840, term1976840.getClass(), "inputMethodListener", null);
        setLongField(term1976840, term1976840.getClass(), "eventMask", 0L);
        setField(term1976840, term1976840.getClass(), "changeSupport", null);
        setField(term1976840, term1976840.getClass(), "objectLock", null);
        setBooleanField(term1976840, term1976840.getClass(), "isPacked", false);
        setIntField(term1976840, term1976840.getClass(), "boundsOp", 0);
        setField(term1976840, term1976840.getClass(), "compoundShape", null);
        setField(term1976840, term1976840.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1976840, term1976840.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1976840, term1976840.getClass(), "backgroundEraseDisabled", false);
        setField(term1976840, term1976840.getClass(), "eventCache", null);
        setBooleanField(term1976840, term1976840.getClass(), "coalescingEnabled", false);
        setBooleanField(term1976840, term1976840.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1976840, term1976840.getClass(), "componentSerializedDataVersion", 0);
        setField(term1976840, term1976840.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ShipView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isCopyClicked", argTypes, term1976840, args);
    }

};


