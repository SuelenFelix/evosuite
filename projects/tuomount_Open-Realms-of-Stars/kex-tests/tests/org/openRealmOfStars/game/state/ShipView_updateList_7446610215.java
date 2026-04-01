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

public class ShipView_updateList_7446610215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1953589;

    public ShipView_updateList_7446610215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1953589 = newInstance(Class.forName("org.openRealmOfStars.game.state.ShipView"));
        setField(term1953589, term1953589.getClass(), "player", null);
        setField(term1953589, term1953589.getClass(), "shipList", null);
        setField(term1953589, term1953589.getClass(), "shipImage", null);
        setField(term1953589, term1953589.getClass(), "infoText", null);
        setBooleanField(term1953589, term1953589.getClass(), "copyClicked", false);
        setIntField(term1953589, term1953589.getClass(), "lastSelectedIndex", 0);
        setField(term1953589, term1953589.getClass(), "obsoleteBtn", null);
        setField(term1953589, term1953589.getClass(), "deleteBtn", null);
        setBooleanField(term1953589, term1953589.getClass(), "isAlignmentXSet", false);
        setFloatField(term1953589, term1953589.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1953589, term1953589.getClass(), "isAlignmentYSet", false);
        setFloatField(term1953589, term1953589.getClass(), "alignmentY", 0.0F);
        setField(term1953589, term1953589.getClass(), "ui", null);
        setField(term1953589, term1953589.getClass(), "listenerList", null);
        setField(term1953589, term1953589.getClass(), "clientProperties", null);
        setField(term1953589, term1953589.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1953589, term1953589.getClass(), "autoscrolls", false);
        setField(term1953589, term1953589.getClass(), "border", null);
        setIntField(term1953589, term1953589.getClass(), "flags", 0);
        setField(term1953589, term1953589.getClass(), "inputVerifier", null);
        setBooleanField(term1953589, term1953589.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1953589, term1953589.getClass(), "paintingChild", null);
        setField(term1953589, term1953589.getClass(), "popupMenu", null);
        setField(term1953589, term1953589.getClass(), "revalidateRunnableScheduled", null);
        setField(term1953589, term1953589.getClass(), "focusInputMap", null);
        setField(term1953589, term1953589.getClass(), "ancestorInputMap", null);
        setField(term1953589, term1953589.getClass(), "windowInputMap", null);
        setField(term1953589, term1953589.getClass(), "actionMap", null);
        setField(term1953589, term1953589.getClass(), "aaHint", null);
        setField(term1953589, term1953589.getClass(), "lcdRenderingHint", null);
        setField(term1953589, term1953589.getClass(), "component", null);
        setField(term1953589, term1953589.getClass(), "layoutMgr", null);
        setField(term1953589, term1953589.getClass(), "dispatcher", null);
        setField(term1953589, term1953589.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1953589, term1953589.getClass(), "focusCycleRoot", false);
        setBooleanField(term1953589, term1953589.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1953589, term1953589.getClass(), "printingThreads", null);
        setBooleanField(term1953589, term1953589.getClass(), "printing", false);
        setField(term1953589, term1953589.getClass(), "containerListener", null);
        setIntField(term1953589, term1953589.getClass(), "listeningChildren", 0);
        setIntField(term1953589, term1953589.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1953589, term1953589.getClass(), "descendantsCount", 0);
        setField(term1953589, term1953589.getClass(), "preserveBackgroundColor", null);
        setIntField(term1953589, term1953589.getClass(), "numOfHWComponents", 0);
        setIntField(term1953589, term1953589.getClass(), "numOfLWComponents", 0);
        setField(term1953589, term1953589.getClass(), "modalComp", null);
        setField(term1953589, term1953589.getClass(), "modalAppContext", null);
        setIntField(term1953589, term1953589.getClass(), "containerSerializedDataVersion", 0);
        setField(term1953589, term1953589.getClass(), "peer", null);
        setField(term1953589, term1953589.getClass(), "parent", null);
        setField(term1953589, term1953589.getClass(), "appContext", null);
        setIntField(term1953589, term1953589.getClass(), "x", 0);
        setIntField(term1953589, term1953589.getClass(), "y", 0);
        setIntField(term1953589, term1953589.getClass(), "width", 0);
        setIntField(term1953589, term1953589.getClass(), "height", 0);
        setField(term1953589, term1953589.getClass(), "foreground", null);
        setField(term1953589, term1953589.getClass(), "background", null);
        setField(term1953589, term1953589.getClass(), "font", null);
        setField(term1953589, term1953589.getClass(), "peerFont", null);
        setField(term1953589, term1953589.getClass(), "cursor", null);
        setField(term1953589, term1953589.getClass(), "locale", null);
        setField(term1953589, term1953589.getClass(), "graphicsConfig", null);
        setField(term1953589, term1953589.getClass(), "bufferStrategy", null);
        setBooleanField(term1953589, term1953589.getClass(), "ignoreRepaint", false);
        setBooleanField(term1953589, term1953589.getClass(), "visible", false);
        setBooleanField(term1953589, term1953589.getClass(), "enabled", false);
        setBooleanField(term1953589, term1953589.getClass(), "valid", false);
        setField(term1953589, term1953589.getClass(), "dropTarget", null);
        setField(term1953589, term1953589.getClass(), "popups", null);
        setField(term1953589, term1953589.getClass(), "name", null);
        setBooleanField(term1953589, term1953589.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1953589, term1953589.getClass(), "focusable", false);
        setIntField(term1953589, term1953589.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1953589, term1953589.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1953589, term1953589.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1953589, term1953589.getClass(), "acc", null);
        setField(term1953589, term1953589.getClass(), "minSize", null);
        setBooleanField(term1953589, term1953589.getClass(), "minSizeSet", false);
        setField(term1953589, term1953589.getClass(), "prefSize", null);
        setBooleanField(term1953589, term1953589.getClass(), "prefSizeSet", false);
        setField(term1953589, term1953589.getClass(), "maxSize", null);
        setBooleanField(term1953589, term1953589.getClass(), "maxSizeSet", false);
        setField(term1953589, term1953589.getClass(), "componentOrientation", null);
        setBooleanField(term1953589, term1953589.getClass(), "newEventsOnly", false);
        setField(term1953589, term1953589.getClass(), "componentListener", null);
        setField(term1953589, term1953589.getClass(), "focusListener", null);
        setField(term1953589, term1953589.getClass(), "hierarchyListener", null);
        setField(term1953589, term1953589.getClass(), "hierarchyBoundsListener", null);
        setField(term1953589, term1953589.getClass(), "keyListener", null);
        setField(term1953589, term1953589.getClass(), "mouseListener", null);
        setField(term1953589, term1953589.getClass(), "mouseMotionListener", null);
        setField(term1953589, term1953589.getClass(), "mouseWheelListener", null);
        setField(term1953589, term1953589.getClass(), "inputMethodListener", null);
        setLongField(term1953589, term1953589.getClass(), "eventMask", 0L);
        setField(term1953589, term1953589.getClass(), "changeSupport", null);
        setField(term1953589, term1953589.getClass(), "objectLock", null);
        setBooleanField(term1953589, term1953589.getClass(), "isPacked", false);
        setIntField(term1953589, term1953589.getClass(), "boundsOp", 0);
        setField(term1953589, term1953589.getClass(), "compoundShape", null);
        setField(term1953589, term1953589.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1953589, term1953589.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1953589, term1953589.getClass(), "backgroundEraseDisabled", false);
        setField(term1953589, term1953589.getClass(), "eventCache", null);
        setBooleanField(term1953589, term1953589.getClass(), "coalescingEnabled", false);
        setBooleanField(term1953589, term1953589.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1953589, term1953589.getClass(), "componentSerializedDataVersion", 0);
        setField(term1953589, term1953589.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ShipView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateList", argTypes, term1953589, args);
    }

};


