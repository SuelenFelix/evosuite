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

public class IconButton_setNotPressedImage_189932623118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2041;

    public IconButton_setNotPressedImage_189932623118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2041 = newInstance(Class.forName("org.openRealmOfStars.gui.buttons.IconButton"));
        setField(term2041, term2041.getClass(), "notPressedImage", null);
        setField(term2041, term2041.getClass(), "pressedImage", null);
        setField(term2041, term2041.getClass(), "disabledImage", null);
        setField(term2041, term2041.getClass(), "rollOverImage", null);
        setBooleanField(term2041, term2041.getClass(), "border", false);
        setField(term2041, term2041.getClass(), "parent", null);
        setField(term2041, term2041.getClass(), "model", null);
        setField(term2041, term2041.getClass(), "text", null);
        setField(term2041, term2041.getClass(), "margin", null);
        setField(term2041, term2041.getClass(), "defaultMargin", null);
        setField(term2041, term2041.getClass(), "defaultIcon", null);
        setField(term2041, term2041.getClass(), "pressedIcon", null);
        setField(term2041, term2041.getClass(), "disabledIcon", null);
        setField(term2041, term2041.getClass(), "selectedIcon", null);
        setField(term2041, term2041.getClass(), "disabledSelectedIcon", null);
        setField(term2041, term2041.getClass(), "rolloverIcon", null);
        setField(term2041, term2041.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term2041, term2041.getClass(), "paintBorder", false);
        setBooleanField(term2041, term2041.getClass(), "paintFocus", false);
        setBooleanField(term2041, term2041.getClass(), "rolloverEnabled", false);
        setBooleanField(term2041, term2041.getClass(), "contentAreaFilled", false);
        setIntField(term2041, term2041.getClass(), "verticalAlignment", 0);
        setIntField(term2041, term2041.getClass(), "horizontalAlignment", 0);
        setIntField(term2041, term2041.getClass(), "verticalTextPosition", 0);
        setIntField(term2041, term2041.getClass(), "horizontalTextPosition", 0);
        setIntField(term2041, term2041.getClass(), "iconTextGap", 0);
        setIntField(term2041, term2041.getClass(), "mnemonic", 0);
        setIntField(term2041, term2041.getClass(), "mnemonicIndex", 0);
        setLongField(term2041, term2041.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term2041, term2041.getClass(), "borderPaintedSet", false);
        setBooleanField(term2041, term2041.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term2041, term2041.getClass(), "iconTextGapSet", false);
        setBooleanField(term2041, term2041.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term2041, term2041.getClass(), "setLayout", false);
        setBooleanField(term2041, term2041.getClass(), "defaultCapable", false);
        setField(term2041, term2041.getClass(), "handler", null);
        setField(term2041, term2041.getClass(), "changeListener", null);
        setField(term2041, term2041.getClass(), "actionListener", null);
        setField(term2041, term2041.getClass(), "itemListener", null);
        setField(term2041, term2041.getClass(), "changeEvent", null);
        setBooleanField(term2041, term2041.getClass(), "hideActionText", false);
        setField(term2041, term2041.getClass(), "action", null);
        setField(term2041, term2041.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term2041, term2041.getClass(), "isAlignmentXSet", false);
        setFloatField(term2041, term2041.getClass(), "alignmentX", 0.0F);
        setBooleanField(term2041, term2041.getClass(), "isAlignmentYSet", false);
        setFloatField(term2041, term2041.getClass(), "alignmentY", 0.0F);
        setField(term2041, term2041.getClass(), "ui", null);
        setField(term2041, term2041.getClass(), "listenerList", null);
        setField(term2041, term2041.getClass(), "clientProperties", null);
        setField(term2041, term2041.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term2041, term2041.getClass(), "autoscrolls", false);
        setField(term2041, term2041.getClass(), "border", null);
        setIntField(term2041, term2041.getClass(), "flags", 0);
        setField(term2041, term2041.getClass(), "inputVerifier", null);
        setBooleanField(term2041, term2041.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term2041, term2041.getClass(), "paintingChild", null);
        setField(term2041, term2041.getClass(), "popupMenu", null);
        setField(term2041, term2041.getClass(), "revalidateRunnableScheduled", null);
        setField(term2041, term2041.getClass(), "focusInputMap", null);
        setField(term2041, term2041.getClass(), "ancestorInputMap", null);
        setField(term2041, term2041.getClass(), "windowInputMap", null);
        setField(term2041, term2041.getClass(), "actionMap", null);
        setField(term2041, term2041.getClass(), "aaHint", null);
        setField(term2041, term2041.getClass(), "lcdRenderingHint", null);
        setField(term2041, term2041.getClass(), "component", null);
        setField(term2041, term2041.getClass(), "layoutMgr", null);
        setField(term2041, term2041.getClass(), "dispatcher", null);
        setField(term2041, term2041.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2041, term2041.getClass(), "focusCycleRoot", false);
        setBooleanField(term2041, term2041.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2041, term2041.getClass(), "printingThreads", null);
        setBooleanField(term2041, term2041.getClass(), "printing", false);
        setField(term2041, term2041.getClass(), "containerListener", null);
        setIntField(term2041, term2041.getClass(), "listeningChildren", 0);
        setIntField(term2041, term2041.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2041, term2041.getClass(), "descendantsCount", 0);
        setField(term2041, term2041.getClass(), "preserveBackgroundColor", null);
        setIntField(term2041, term2041.getClass(), "numOfHWComponents", 0);
        setIntField(term2041, term2041.getClass(), "numOfLWComponents", 0);
        setField(term2041, term2041.getClass(), "modalComp", null);
        setField(term2041, term2041.getClass(), "modalAppContext", null);
        setIntField(term2041, term2041.getClass(), "containerSerializedDataVersion", 0);
        setField(term2041, term2041.getClass(), "peer", null);
        setField(term2041, term2041.getClass(), "parent", null);
        setField(term2041, term2041.getClass(), "appContext", null);
        setIntField(term2041, term2041.getClass(), "x", 0);
        setIntField(term2041, term2041.getClass(), "y", 0);
        setIntField(term2041, term2041.getClass(), "width", 0);
        setIntField(term2041, term2041.getClass(), "height", 0);
        setField(term2041, term2041.getClass(), "foreground", null);
        setField(term2041, term2041.getClass(), "background", null);
        setField(term2041, term2041.getClass(), "font", null);
        setField(term2041, term2041.getClass(), "peerFont", null);
        setField(term2041, term2041.getClass(), "cursor", null);
        setField(term2041, term2041.getClass(), "locale", null);
        setField(term2041, term2041.getClass(), "graphicsConfig", null);
        setField(term2041, term2041.getClass(), "bufferStrategy", null);
        setBooleanField(term2041, term2041.getClass(), "ignoreRepaint", false);
        setBooleanField(term2041, term2041.getClass(), "visible", false);
        setBooleanField(term2041, term2041.getClass(), "enabled", false);
        setBooleanField(term2041, term2041.getClass(), "valid", false);
        setField(term2041, term2041.getClass(), "dropTarget", null);
        setField(term2041, term2041.getClass(), "popups", null);
        setField(term2041, term2041.getClass(), "name", null);
        setBooleanField(term2041, term2041.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2041, term2041.getClass(), "focusable", false);
        setIntField(term2041, term2041.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2041, term2041.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2041, term2041.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2041, term2041.getClass(), "acc", null);
        setField(term2041, term2041.getClass(), "minSize", null);
        setBooleanField(term2041, term2041.getClass(), "minSizeSet", false);
        setField(term2041, term2041.getClass(), "prefSize", null);
        setBooleanField(term2041, term2041.getClass(), "prefSizeSet", false);
        setField(term2041, term2041.getClass(), "maxSize", null);
        setBooleanField(term2041, term2041.getClass(), "maxSizeSet", false);
        setField(term2041, term2041.getClass(), "componentOrientation", null);
        setBooleanField(term2041, term2041.getClass(), "newEventsOnly", false);
        setField(term2041, term2041.getClass(), "componentListener", null);
        setField(term2041, term2041.getClass(), "focusListener", null);
        setField(term2041, term2041.getClass(), "hierarchyListener", null);
        setField(term2041, term2041.getClass(), "hierarchyBoundsListener", null);
        setField(term2041, term2041.getClass(), "keyListener", null);
        setField(term2041, term2041.getClass(), "mouseListener", null);
        setField(term2041, term2041.getClass(), "mouseMotionListener", null);
        setField(term2041, term2041.getClass(), "mouseWheelListener", null);
        setField(term2041, term2041.getClass(), "inputMethodListener", null);
        setLongField(term2041, term2041.getClass(), "eventMask", 0L);
        setField(term2041, term2041.getClass(), "changeSupport", null);
        setField(term2041, term2041.getClass(), "objectLock", null);
        setBooleanField(term2041, term2041.getClass(), "isPacked", false);
        setIntField(term2041, term2041.getClass(), "boundsOp", 0);
        setField(term2041, term2041.getClass(), "compoundShape", null);
        setField(term2041, term2041.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2041, term2041.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2041, term2041.getClass(), "backgroundEraseDisabled", false);
        setField(term2041, term2041.getClass(), "eventCache", null);
        setBooleanField(term2041, term2041.getClass(), "coalescingEnabled", false);
        setBooleanField(term2041, term2041.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2041, term2041.getClass(), "componentSerializedDataVersion", 0);
        setField(term2041, term2041.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.buttons.IconButton");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setNotPressedImage", argTypes, term2041, args);
    }

};


