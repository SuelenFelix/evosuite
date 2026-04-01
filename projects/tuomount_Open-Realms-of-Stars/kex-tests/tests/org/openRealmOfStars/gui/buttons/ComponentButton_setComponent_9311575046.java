package org.openRealmOfStars.gui.buttons;

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
import static org.openRealmOfStars.gui.buttons.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ComponentButton_setComponent_9311575046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19189;
     Object term19251;

    public ComponentButton_setComponent_9311575046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19189 = newInstance(Class.forName("org.openRealmOfStars.gui.buttons.ComponentButton"));
        setField(term19189, term19189.getClass(), "ship", null);
        setIntField(term19189, term19189.getClass(), "index", 0);
        setField(term19189, term19189.getClass(), "icon", null);
        setBooleanField(term19189, term19189.getClass(), "used", false);
        setField(term19189, term19189.getClass(), "model", null);
        setField(term19189, term19189.getClass(), "text", null);
        setField(term19189, term19189.getClass(), "margin", null);
        setField(term19189, term19189.getClass(), "defaultMargin", null);
        setField(term19189, term19189.getClass(), "defaultIcon", null);
        setField(term19189, term19189.getClass(), "pressedIcon", null);
        setField(term19189, term19189.getClass(), "disabledIcon", null);
        setField(term19189, term19189.getClass(), "selectedIcon", null);
        setField(term19189, term19189.getClass(), "disabledSelectedIcon", null);
        setField(term19189, term19189.getClass(), "rolloverIcon", null);
        setField(term19189, term19189.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term19189, term19189.getClass(), "paintBorder", false);
        setBooleanField(term19189, term19189.getClass(), "paintFocus", false);
        setBooleanField(term19189, term19189.getClass(), "rolloverEnabled", false);
        setBooleanField(term19189, term19189.getClass(), "contentAreaFilled", false);
        setIntField(term19189, term19189.getClass(), "verticalAlignment", 0);
        setIntField(term19189, term19189.getClass(), "horizontalAlignment", 0);
        setIntField(term19189, term19189.getClass(), "verticalTextPosition", 0);
        setIntField(term19189, term19189.getClass(), "horizontalTextPosition", 0);
        setIntField(term19189, term19189.getClass(), "iconTextGap", 0);
        setIntField(term19189, term19189.getClass(), "mnemonic", 0);
        setIntField(term19189, term19189.getClass(), "mnemonicIndex", 0);
        setLongField(term19189, term19189.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term19189, term19189.getClass(), "borderPaintedSet", false);
        setBooleanField(term19189, term19189.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term19189, term19189.getClass(), "iconTextGapSet", false);
        setBooleanField(term19189, term19189.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term19189, term19189.getClass(), "setLayout", false);
        setBooleanField(term19189, term19189.getClass(), "defaultCapable", false);
        setField(term19189, term19189.getClass(), "handler", null);
        setField(term19189, term19189.getClass(), "changeListener", null);
        setField(term19189, term19189.getClass(), "actionListener", null);
        setField(term19189, term19189.getClass(), "itemListener", null);
        setField(term19189, term19189.getClass(), "changeEvent", null);
        setBooleanField(term19189, term19189.getClass(), "hideActionText", false);
        setField(term19189, term19189.getClass(), "action", null);
        setField(term19189, term19189.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term19189, term19189.getClass(), "isAlignmentXSet", false);
        setFloatField(term19189, term19189.getClass(), "alignmentX", 0.0F);
        setBooleanField(term19189, term19189.getClass(), "isAlignmentYSet", false);
        setFloatField(term19189, term19189.getClass(), "alignmentY", 0.0F);
        setField(term19189, term19189.getClass(), "ui", null);
        setField(term19189, term19189.getClass(), "listenerList", null);
        setField(term19189, term19189.getClass(), "clientProperties", null);
        setField(term19189, term19189.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term19189, term19189.getClass(), "autoscrolls", false);
        setField(term19189, term19189.getClass(), "border", null);
        setIntField(term19189, term19189.getClass(), "flags", 0);
        setField(term19189, term19189.getClass(), "inputVerifier", null);
        setBooleanField(term19189, term19189.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term19189, term19189.getClass(), "paintingChild", null);
        setField(term19189, term19189.getClass(), "popupMenu", null);
        setField(term19189, term19189.getClass(), "revalidateRunnableScheduled", null);
        setField(term19189, term19189.getClass(), "focusInputMap", null);
        setField(term19189, term19189.getClass(), "ancestorInputMap", null);
        setField(term19189, term19189.getClass(), "windowInputMap", null);
        setField(term19189, term19189.getClass(), "actionMap", null);
        setField(term19189, term19189.getClass(), "aaHint", null);
        setField(term19189, term19189.getClass(), "lcdRenderingHint", null);
        setField(term19189, term19189.getClass(), "component", null);
        setField(term19189, term19189.getClass(), "layoutMgr", null);
        setField(term19189, term19189.getClass(), "dispatcher", null);
        setField(term19189, term19189.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term19189, term19189.getClass(), "focusCycleRoot", false);
        setBooleanField(term19189, term19189.getClass(), "focusTraversalPolicyProvider", false);
        setField(term19189, term19189.getClass(), "printingThreads", null);
        setBooleanField(term19189, term19189.getClass(), "printing", false);
        setField(term19189, term19189.getClass(), "containerListener", null);
        setIntField(term19189, term19189.getClass(), "listeningChildren", 0);
        setIntField(term19189, term19189.getClass(), "listeningBoundsChildren", 0);
        setIntField(term19189, term19189.getClass(), "descendantsCount", 0);
        setField(term19189, term19189.getClass(), "preserveBackgroundColor", null);
        setIntField(term19189, term19189.getClass(), "numOfHWComponents", 0);
        setIntField(term19189, term19189.getClass(), "numOfLWComponents", 0);
        setField(term19189, term19189.getClass(), "modalComp", null);
        setField(term19189, term19189.getClass(), "modalAppContext", null);
        setIntField(term19189, term19189.getClass(), "containerSerializedDataVersion", 0);
        setField(term19189, term19189.getClass(), "peer", null);
        setField(term19189, term19189.getClass(), "parent", null);
        setField(term19189, term19189.getClass(), "appContext", null);
        setIntField(term19189, term19189.getClass(), "x", 0);
        setIntField(term19189, term19189.getClass(), "y", 0);
        setIntField(term19189, term19189.getClass(), "width", 0);
        setIntField(term19189, term19189.getClass(), "height", 0);
        setField(term19189, term19189.getClass(), "foreground", null);
        setField(term19189, term19189.getClass(), "background", null);
        setField(term19189, term19189.getClass(), "font", null);
        setField(term19189, term19189.getClass(), "peerFont", null);
        setField(term19189, term19189.getClass(), "cursor", null);
        setField(term19189, term19189.getClass(), "locale", null);
        setField(term19189, term19189.getClass(), "graphicsConfig", null);
        setField(term19189, term19189.getClass(), "bufferStrategy", null);
        setBooleanField(term19189, term19189.getClass(), "ignoreRepaint", false);
        setBooleanField(term19189, term19189.getClass(), "visible", false);
        setBooleanField(term19189, term19189.getClass(), "enabled", false);
        setBooleanField(term19189, term19189.getClass(), "valid", false);
        setField(term19189, term19189.getClass(), "dropTarget", null);
        setField(term19189, term19189.getClass(), "popups", null);
        setField(term19189, term19189.getClass(), "name", null);
        setBooleanField(term19189, term19189.getClass(), "nameExplicitlySet", false);
        setBooleanField(term19189, term19189.getClass(), "focusable", false);
        setIntField(term19189, term19189.getClass(), "isFocusTraversableOverridden", 0);
        setField(term19189, term19189.getClass(), "focusTraversalKeys", null);
        setBooleanField(term19189, term19189.getClass(), "focusTraversalKeysEnabled", false);
        setField(term19189, term19189.getClass(), "acc", null);
        setField(term19189, term19189.getClass(), "minSize", null);
        setBooleanField(term19189, term19189.getClass(), "minSizeSet", false);
        setField(term19189, term19189.getClass(), "prefSize", null);
        setBooleanField(term19189, term19189.getClass(), "prefSizeSet", false);
        setField(term19189, term19189.getClass(), "maxSize", null);
        setBooleanField(term19189, term19189.getClass(), "maxSizeSet", false);
        setField(term19189, term19189.getClass(), "componentOrientation", null);
        setBooleanField(term19189, term19189.getClass(), "newEventsOnly", false);
        setField(term19189, term19189.getClass(), "componentListener", null);
        setField(term19189, term19189.getClass(), "focusListener", null);
        setField(term19189, term19189.getClass(), "hierarchyListener", null);
        setField(term19189, term19189.getClass(), "hierarchyBoundsListener", null);
        setField(term19189, term19189.getClass(), "keyListener", null);
        setField(term19189, term19189.getClass(), "mouseListener", null);
        setField(term19189, term19189.getClass(), "mouseMotionListener", null);
        setField(term19189, term19189.getClass(), "mouseWheelListener", null);
        setField(term19189, term19189.getClass(), "inputMethodListener", null);
        setLongField(term19189, term19189.getClass(), "eventMask", 0L);
        setField(term19189, term19189.getClass(), "changeSupport", null);
        setField(term19189, term19189.getClass(), "objectLock", null);
        setBooleanField(term19189, term19189.getClass(), "isPacked", false);
        setIntField(term19189, term19189.getClass(), "boundsOp", 0);
        setField(term19189, term19189.getClass(), "compoundShape", null);
        setField(term19189, term19189.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term19189, term19189.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term19189, term19189.getClass(), "backgroundEraseDisabled", false);
        setField(term19189, term19189.getClass(), "eventCache", null);
        setBooleanField(term19189, term19189.getClass(), "coalescingEnabled", false);
        setBooleanField(term19189, term19189.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term19189, term19189.getClass(), "componentSerializedDataVersion", 0);
        setField(term19189, term19189.getClass(), "accessibleContext", null);
        term19251 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.buttons.ComponentButton");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.ship.Ship");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term19251;
        callMethod(klass, "setComponent", argTypes, term19189, args);
    }

};


