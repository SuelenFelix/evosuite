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
import java.lang.Boolean;

public class ShipView_setCopyClicked_25164143215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1982842;
     Object term1982885;

    public ShipView_setCopyClicked_25164143215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1982842 = newInstance(Class.forName("org.openRealmOfStars.game.state.ShipView"));
        setField(term1982842, term1982842.getClass(), "player", null);
        setField(term1982842, term1982842.getClass(), "shipList", null);
        setField(term1982842, term1982842.getClass(), "shipImage", null);
        setField(term1982842, term1982842.getClass(), "infoText", null);
        setBooleanField(term1982842, term1982842.getClass(), "copyClicked", false);
        setIntField(term1982842, term1982842.getClass(), "lastSelectedIndex", 0);
        setField(term1982842, term1982842.getClass(), "obsoleteBtn", null);
        setField(term1982842, term1982842.getClass(), "deleteBtn", null);
        setBooleanField(term1982842, term1982842.getClass(), "isAlignmentXSet", false);
        setFloatField(term1982842, term1982842.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1982842, term1982842.getClass(), "isAlignmentYSet", false);
        setFloatField(term1982842, term1982842.getClass(), "alignmentY", 0.0F);
        setField(term1982842, term1982842.getClass(), "ui", null);
        setField(term1982842, term1982842.getClass(), "listenerList", null);
        setField(term1982842, term1982842.getClass(), "clientProperties", null);
        setField(term1982842, term1982842.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1982842, term1982842.getClass(), "autoscrolls", false);
        setField(term1982842, term1982842.getClass(), "border", null);
        setIntField(term1982842, term1982842.getClass(), "flags", 0);
        setField(term1982842, term1982842.getClass(), "inputVerifier", null);
        setBooleanField(term1982842, term1982842.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1982842, term1982842.getClass(), "paintingChild", null);
        setField(term1982842, term1982842.getClass(), "popupMenu", null);
        setField(term1982842, term1982842.getClass(), "revalidateRunnableScheduled", null);
        setField(term1982842, term1982842.getClass(), "focusInputMap", null);
        setField(term1982842, term1982842.getClass(), "ancestorInputMap", null);
        setField(term1982842, term1982842.getClass(), "windowInputMap", null);
        setField(term1982842, term1982842.getClass(), "actionMap", null);
        setField(term1982842, term1982842.getClass(), "aaHint", null);
        setField(term1982842, term1982842.getClass(), "lcdRenderingHint", null);
        setField(term1982842, term1982842.getClass(), "component", null);
        setField(term1982842, term1982842.getClass(), "layoutMgr", null);
        setField(term1982842, term1982842.getClass(), "dispatcher", null);
        setField(term1982842, term1982842.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1982842, term1982842.getClass(), "focusCycleRoot", false);
        setBooleanField(term1982842, term1982842.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1982842, term1982842.getClass(), "printingThreads", null);
        setBooleanField(term1982842, term1982842.getClass(), "printing", false);
        setField(term1982842, term1982842.getClass(), "containerListener", null);
        setIntField(term1982842, term1982842.getClass(), "listeningChildren", 0);
        setIntField(term1982842, term1982842.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1982842, term1982842.getClass(), "descendantsCount", 0);
        setField(term1982842, term1982842.getClass(), "preserveBackgroundColor", null);
        setIntField(term1982842, term1982842.getClass(), "numOfHWComponents", 0);
        setIntField(term1982842, term1982842.getClass(), "numOfLWComponents", 0);
        setField(term1982842, term1982842.getClass(), "modalComp", null);
        setField(term1982842, term1982842.getClass(), "modalAppContext", null);
        setIntField(term1982842, term1982842.getClass(), "containerSerializedDataVersion", 0);
        setField(term1982842, term1982842.getClass(), "peer", null);
        setField(term1982842, term1982842.getClass(), "parent", null);
        setField(term1982842, term1982842.getClass(), "appContext", null);
        setIntField(term1982842, term1982842.getClass(), "x", 0);
        setIntField(term1982842, term1982842.getClass(), "y", 0);
        setIntField(term1982842, term1982842.getClass(), "width", 0);
        setIntField(term1982842, term1982842.getClass(), "height", 0);
        setField(term1982842, term1982842.getClass(), "foreground", null);
        setField(term1982842, term1982842.getClass(), "background", null);
        setField(term1982842, term1982842.getClass(), "font", null);
        setField(term1982842, term1982842.getClass(), "peerFont", null);
        setField(term1982842, term1982842.getClass(), "cursor", null);
        setField(term1982842, term1982842.getClass(), "locale", null);
        setField(term1982842, term1982842.getClass(), "graphicsConfig", null);
        setField(term1982842, term1982842.getClass(), "bufferStrategy", null);
        setBooleanField(term1982842, term1982842.getClass(), "ignoreRepaint", false);
        setBooleanField(term1982842, term1982842.getClass(), "visible", false);
        setBooleanField(term1982842, term1982842.getClass(), "enabled", false);
        setBooleanField(term1982842, term1982842.getClass(), "valid", false);
        setField(term1982842, term1982842.getClass(), "dropTarget", null);
        setField(term1982842, term1982842.getClass(), "popups", null);
        setField(term1982842, term1982842.getClass(), "name", null);
        setBooleanField(term1982842, term1982842.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1982842, term1982842.getClass(), "focusable", false);
        setIntField(term1982842, term1982842.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1982842, term1982842.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1982842, term1982842.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1982842, term1982842.getClass(), "acc", null);
        setField(term1982842, term1982842.getClass(), "minSize", null);
        setBooleanField(term1982842, term1982842.getClass(), "minSizeSet", false);
        setField(term1982842, term1982842.getClass(), "prefSize", null);
        setBooleanField(term1982842, term1982842.getClass(), "prefSizeSet", false);
        setField(term1982842, term1982842.getClass(), "maxSize", null);
        setBooleanField(term1982842, term1982842.getClass(), "maxSizeSet", false);
        setField(term1982842, term1982842.getClass(), "componentOrientation", null);
        setBooleanField(term1982842, term1982842.getClass(), "newEventsOnly", false);
        setField(term1982842, term1982842.getClass(), "componentListener", null);
        setField(term1982842, term1982842.getClass(), "focusListener", null);
        setField(term1982842, term1982842.getClass(), "hierarchyListener", null);
        setField(term1982842, term1982842.getClass(), "hierarchyBoundsListener", null);
        setField(term1982842, term1982842.getClass(), "keyListener", null);
        setField(term1982842, term1982842.getClass(), "mouseListener", null);
        setField(term1982842, term1982842.getClass(), "mouseMotionListener", null);
        setField(term1982842, term1982842.getClass(), "mouseWheelListener", null);
        setField(term1982842, term1982842.getClass(), "inputMethodListener", null);
        setLongField(term1982842, term1982842.getClass(), "eventMask", 0L);
        setField(term1982842, term1982842.getClass(), "changeSupport", null);
        setField(term1982842, term1982842.getClass(), "objectLock", null);
        setBooleanField(term1982842, term1982842.getClass(), "isPacked", false);
        setIntField(term1982842, term1982842.getClass(), "boundsOp", 0);
        setField(term1982842, term1982842.getClass(), "compoundShape", null);
        setField(term1982842, term1982842.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1982842, term1982842.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1982842, term1982842.getClass(), "backgroundEraseDisabled", false);
        setField(term1982842, term1982842.getClass(), "eventCache", null);
        setBooleanField(term1982842, term1982842.getClass(), "coalescingEnabled", false);
        setBooleanField(term1982842, term1982842.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1982842, term1982842.getClass(), "componentSerializedDataVersion", 0);
        setField(term1982842, term1982842.getClass(), "accessibleContext", null);
        term1982885 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ShipView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1982885;
        callMethod(klass, "setCopyClicked", argTypes, term1982842, args);
    }

};


