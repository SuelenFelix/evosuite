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

public class IconButton_paintComponent_27380755116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1919;

    public IconButton_paintComponent_27380755116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1919 = newInstance(Class.forName("org.openRealmOfStars.gui.buttons.IconButton"));
        setField(term1919, term1919.getClass(), "notPressedImage", null);
        setField(term1919, term1919.getClass(), "pressedImage", null);
        setField(term1919, term1919.getClass(), "disabledImage", null);
        setField(term1919, term1919.getClass(), "rollOverImage", null);
        setBooleanField(term1919, term1919.getClass(), "border", false);
        setField(term1919, term1919.getClass(), "parent", null);
        setField(term1919, term1919.getClass(), "model", null);
        setField(term1919, term1919.getClass(), "text", null);
        setField(term1919, term1919.getClass(), "margin", null);
        setField(term1919, term1919.getClass(), "defaultMargin", null);
        setField(term1919, term1919.getClass(), "defaultIcon", null);
        setField(term1919, term1919.getClass(), "pressedIcon", null);
        setField(term1919, term1919.getClass(), "disabledIcon", null);
        setField(term1919, term1919.getClass(), "selectedIcon", null);
        setField(term1919, term1919.getClass(), "disabledSelectedIcon", null);
        setField(term1919, term1919.getClass(), "rolloverIcon", null);
        setField(term1919, term1919.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term1919, term1919.getClass(), "paintBorder", false);
        setBooleanField(term1919, term1919.getClass(), "paintFocus", false);
        setBooleanField(term1919, term1919.getClass(), "rolloverEnabled", false);
        setBooleanField(term1919, term1919.getClass(), "contentAreaFilled", false);
        setIntField(term1919, term1919.getClass(), "verticalAlignment", 0);
        setIntField(term1919, term1919.getClass(), "horizontalAlignment", 0);
        setIntField(term1919, term1919.getClass(), "verticalTextPosition", 0);
        setIntField(term1919, term1919.getClass(), "horizontalTextPosition", 0);
        setIntField(term1919, term1919.getClass(), "iconTextGap", 0);
        setIntField(term1919, term1919.getClass(), "mnemonic", 0);
        setIntField(term1919, term1919.getClass(), "mnemonicIndex", 0);
        setLongField(term1919, term1919.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term1919, term1919.getClass(), "borderPaintedSet", false);
        setBooleanField(term1919, term1919.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term1919, term1919.getClass(), "iconTextGapSet", false);
        setBooleanField(term1919, term1919.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term1919, term1919.getClass(), "setLayout", false);
        setBooleanField(term1919, term1919.getClass(), "defaultCapable", false);
        setField(term1919, term1919.getClass(), "handler", null);
        setField(term1919, term1919.getClass(), "changeListener", null);
        setField(term1919, term1919.getClass(), "actionListener", null);
        setField(term1919, term1919.getClass(), "itemListener", null);
        setField(term1919, term1919.getClass(), "changeEvent", null);
        setBooleanField(term1919, term1919.getClass(), "hideActionText", false);
        setField(term1919, term1919.getClass(), "action", null);
        setField(term1919, term1919.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term1919, term1919.getClass(), "isAlignmentXSet", false);
        setFloatField(term1919, term1919.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1919, term1919.getClass(), "isAlignmentYSet", false);
        setFloatField(term1919, term1919.getClass(), "alignmentY", 0.0F);
        setField(term1919, term1919.getClass(), "ui", null);
        setField(term1919, term1919.getClass(), "listenerList", null);
        setField(term1919, term1919.getClass(), "clientProperties", null);
        setField(term1919, term1919.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1919, term1919.getClass(), "autoscrolls", false);
        setField(term1919, term1919.getClass(), "border", null);
        setIntField(term1919, term1919.getClass(), "flags", 0);
        setField(term1919, term1919.getClass(), "inputVerifier", null);
        setBooleanField(term1919, term1919.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1919, term1919.getClass(), "paintingChild", null);
        setField(term1919, term1919.getClass(), "popupMenu", null);
        setField(term1919, term1919.getClass(), "revalidateRunnableScheduled", null);
        setField(term1919, term1919.getClass(), "focusInputMap", null);
        setField(term1919, term1919.getClass(), "ancestorInputMap", null);
        setField(term1919, term1919.getClass(), "windowInputMap", null);
        setField(term1919, term1919.getClass(), "actionMap", null);
        setField(term1919, term1919.getClass(), "aaHint", null);
        setField(term1919, term1919.getClass(), "lcdRenderingHint", null);
        setField(term1919, term1919.getClass(), "component", null);
        setField(term1919, term1919.getClass(), "layoutMgr", null);
        setField(term1919, term1919.getClass(), "dispatcher", null);
        setField(term1919, term1919.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1919, term1919.getClass(), "focusCycleRoot", false);
        setBooleanField(term1919, term1919.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1919, term1919.getClass(), "printingThreads", null);
        setBooleanField(term1919, term1919.getClass(), "printing", false);
        setField(term1919, term1919.getClass(), "containerListener", null);
        setIntField(term1919, term1919.getClass(), "listeningChildren", 0);
        setIntField(term1919, term1919.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1919, term1919.getClass(), "descendantsCount", 0);
        setField(term1919, term1919.getClass(), "preserveBackgroundColor", null);
        setIntField(term1919, term1919.getClass(), "numOfHWComponents", 0);
        setIntField(term1919, term1919.getClass(), "numOfLWComponents", 0);
        setField(term1919, term1919.getClass(), "modalComp", null);
        setField(term1919, term1919.getClass(), "modalAppContext", null);
        setIntField(term1919, term1919.getClass(), "containerSerializedDataVersion", 0);
        setField(term1919, term1919.getClass(), "peer", null);
        setField(term1919, term1919.getClass(), "parent", null);
        setField(term1919, term1919.getClass(), "appContext", null);
        setIntField(term1919, term1919.getClass(), "x", 0);
        setIntField(term1919, term1919.getClass(), "y", 0);
        setIntField(term1919, term1919.getClass(), "width", 0);
        setIntField(term1919, term1919.getClass(), "height", 0);
        setField(term1919, term1919.getClass(), "foreground", null);
        setField(term1919, term1919.getClass(), "background", null);
        setField(term1919, term1919.getClass(), "font", null);
        setField(term1919, term1919.getClass(), "peerFont", null);
        setField(term1919, term1919.getClass(), "cursor", null);
        setField(term1919, term1919.getClass(), "locale", null);
        setField(term1919, term1919.getClass(), "graphicsConfig", null);
        setField(term1919, term1919.getClass(), "bufferStrategy", null);
        setBooleanField(term1919, term1919.getClass(), "ignoreRepaint", false);
        setBooleanField(term1919, term1919.getClass(), "visible", false);
        setBooleanField(term1919, term1919.getClass(), "enabled", false);
        setBooleanField(term1919, term1919.getClass(), "valid", false);
        setField(term1919, term1919.getClass(), "dropTarget", null);
        setField(term1919, term1919.getClass(), "popups", null);
        setField(term1919, term1919.getClass(), "name", null);
        setBooleanField(term1919, term1919.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1919, term1919.getClass(), "focusable", false);
        setIntField(term1919, term1919.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1919, term1919.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1919, term1919.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1919, term1919.getClass(), "acc", null);
        setField(term1919, term1919.getClass(), "minSize", null);
        setBooleanField(term1919, term1919.getClass(), "minSizeSet", false);
        setField(term1919, term1919.getClass(), "prefSize", null);
        setBooleanField(term1919, term1919.getClass(), "prefSizeSet", false);
        setField(term1919, term1919.getClass(), "maxSize", null);
        setBooleanField(term1919, term1919.getClass(), "maxSizeSet", false);
        setField(term1919, term1919.getClass(), "componentOrientation", null);
        setBooleanField(term1919, term1919.getClass(), "newEventsOnly", false);
        setField(term1919, term1919.getClass(), "componentListener", null);
        setField(term1919, term1919.getClass(), "focusListener", null);
        setField(term1919, term1919.getClass(), "hierarchyListener", null);
        setField(term1919, term1919.getClass(), "hierarchyBoundsListener", null);
        setField(term1919, term1919.getClass(), "keyListener", null);
        setField(term1919, term1919.getClass(), "mouseListener", null);
        setField(term1919, term1919.getClass(), "mouseMotionListener", null);
        setField(term1919, term1919.getClass(), "mouseWheelListener", null);
        setField(term1919, term1919.getClass(), "inputMethodListener", null);
        setLongField(term1919, term1919.getClass(), "eventMask", 0L);
        setField(term1919, term1919.getClass(), "changeSupport", null);
        setField(term1919, term1919.getClass(), "objectLock", null);
        setBooleanField(term1919, term1919.getClass(), "isPacked", false);
        setIntField(term1919, term1919.getClass(), "boundsOp", 0);
        setField(term1919, term1919.getClass(), "compoundShape", null);
        setField(term1919, term1919.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1919, term1919.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1919, term1919.getClass(), "backgroundEraseDisabled", false);
        setField(term1919, term1919.getClass(), "eventCache", null);
        setBooleanField(term1919, term1919.getClass(), "coalescingEnabled", false);
        setBooleanField(term1919, term1919.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1919, term1919.getClass(), "componentSerializedDataVersion", 0);
        setField(term1919, term1919.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.buttons.IconButton");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Graphics");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "paintComponent", argTypes, term1919, args);
    }

};


