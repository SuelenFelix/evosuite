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

public class IconButton_setPressedImage_59760140220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2163;

    public IconButton_setPressedImage_59760140220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2163 = newInstance(Class.forName("org.openRealmOfStars.gui.buttons.IconButton"));
        setField(term2163, term2163.getClass(), "notPressedImage", null);
        setField(term2163, term2163.getClass(), "pressedImage", null);
        setField(term2163, term2163.getClass(), "disabledImage", null);
        setField(term2163, term2163.getClass(), "rollOverImage", null);
        setBooleanField(term2163, term2163.getClass(), "border", false);
        setField(term2163, term2163.getClass(), "parent", null);
        setField(term2163, term2163.getClass(), "model", null);
        setField(term2163, term2163.getClass(), "text", null);
        setField(term2163, term2163.getClass(), "margin", null);
        setField(term2163, term2163.getClass(), "defaultMargin", null);
        setField(term2163, term2163.getClass(), "defaultIcon", null);
        setField(term2163, term2163.getClass(), "pressedIcon", null);
        setField(term2163, term2163.getClass(), "disabledIcon", null);
        setField(term2163, term2163.getClass(), "selectedIcon", null);
        setField(term2163, term2163.getClass(), "disabledSelectedIcon", null);
        setField(term2163, term2163.getClass(), "rolloverIcon", null);
        setField(term2163, term2163.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term2163, term2163.getClass(), "paintBorder", false);
        setBooleanField(term2163, term2163.getClass(), "paintFocus", false);
        setBooleanField(term2163, term2163.getClass(), "rolloverEnabled", false);
        setBooleanField(term2163, term2163.getClass(), "contentAreaFilled", false);
        setIntField(term2163, term2163.getClass(), "verticalAlignment", 0);
        setIntField(term2163, term2163.getClass(), "horizontalAlignment", 0);
        setIntField(term2163, term2163.getClass(), "verticalTextPosition", 0);
        setIntField(term2163, term2163.getClass(), "horizontalTextPosition", 0);
        setIntField(term2163, term2163.getClass(), "iconTextGap", 0);
        setIntField(term2163, term2163.getClass(), "mnemonic", 0);
        setIntField(term2163, term2163.getClass(), "mnemonicIndex", 0);
        setLongField(term2163, term2163.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term2163, term2163.getClass(), "borderPaintedSet", false);
        setBooleanField(term2163, term2163.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term2163, term2163.getClass(), "iconTextGapSet", false);
        setBooleanField(term2163, term2163.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term2163, term2163.getClass(), "setLayout", false);
        setBooleanField(term2163, term2163.getClass(), "defaultCapable", false);
        setField(term2163, term2163.getClass(), "handler", null);
        setField(term2163, term2163.getClass(), "changeListener", null);
        setField(term2163, term2163.getClass(), "actionListener", null);
        setField(term2163, term2163.getClass(), "itemListener", null);
        setField(term2163, term2163.getClass(), "changeEvent", null);
        setBooleanField(term2163, term2163.getClass(), "hideActionText", false);
        setField(term2163, term2163.getClass(), "action", null);
        setField(term2163, term2163.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term2163, term2163.getClass(), "isAlignmentXSet", false);
        setFloatField(term2163, term2163.getClass(), "alignmentX", 0.0F);
        setBooleanField(term2163, term2163.getClass(), "isAlignmentYSet", false);
        setFloatField(term2163, term2163.getClass(), "alignmentY", 0.0F);
        setField(term2163, term2163.getClass(), "ui", null);
        setField(term2163, term2163.getClass(), "listenerList", null);
        setField(term2163, term2163.getClass(), "clientProperties", null);
        setField(term2163, term2163.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term2163, term2163.getClass(), "autoscrolls", false);
        setField(term2163, term2163.getClass(), "border", null);
        setIntField(term2163, term2163.getClass(), "flags", 0);
        setField(term2163, term2163.getClass(), "inputVerifier", null);
        setBooleanField(term2163, term2163.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term2163, term2163.getClass(), "paintingChild", null);
        setField(term2163, term2163.getClass(), "popupMenu", null);
        setField(term2163, term2163.getClass(), "revalidateRunnableScheduled", null);
        setField(term2163, term2163.getClass(), "focusInputMap", null);
        setField(term2163, term2163.getClass(), "ancestorInputMap", null);
        setField(term2163, term2163.getClass(), "windowInputMap", null);
        setField(term2163, term2163.getClass(), "actionMap", null);
        setField(term2163, term2163.getClass(), "aaHint", null);
        setField(term2163, term2163.getClass(), "lcdRenderingHint", null);
        setField(term2163, term2163.getClass(), "component", null);
        setField(term2163, term2163.getClass(), "layoutMgr", null);
        setField(term2163, term2163.getClass(), "dispatcher", null);
        setField(term2163, term2163.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2163, term2163.getClass(), "focusCycleRoot", false);
        setBooleanField(term2163, term2163.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2163, term2163.getClass(), "printingThreads", null);
        setBooleanField(term2163, term2163.getClass(), "printing", false);
        setField(term2163, term2163.getClass(), "containerListener", null);
        setIntField(term2163, term2163.getClass(), "listeningChildren", 0);
        setIntField(term2163, term2163.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2163, term2163.getClass(), "descendantsCount", 0);
        setField(term2163, term2163.getClass(), "preserveBackgroundColor", null);
        setIntField(term2163, term2163.getClass(), "numOfHWComponents", 0);
        setIntField(term2163, term2163.getClass(), "numOfLWComponents", 0);
        setField(term2163, term2163.getClass(), "modalComp", null);
        setField(term2163, term2163.getClass(), "modalAppContext", null);
        setIntField(term2163, term2163.getClass(), "containerSerializedDataVersion", 0);
        setField(term2163, term2163.getClass(), "peer", null);
        setField(term2163, term2163.getClass(), "parent", null);
        setField(term2163, term2163.getClass(), "appContext", null);
        setIntField(term2163, term2163.getClass(), "x", 0);
        setIntField(term2163, term2163.getClass(), "y", 0);
        setIntField(term2163, term2163.getClass(), "width", 0);
        setIntField(term2163, term2163.getClass(), "height", 0);
        setField(term2163, term2163.getClass(), "foreground", null);
        setField(term2163, term2163.getClass(), "background", null);
        setField(term2163, term2163.getClass(), "font", null);
        setField(term2163, term2163.getClass(), "peerFont", null);
        setField(term2163, term2163.getClass(), "cursor", null);
        setField(term2163, term2163.getClass(), "locale", null);
        setField(term2163, term2163.getClass(), "graphicsConfig", null);
        setField(term2163, term2163.getClass(), "bufferStrategy", null);
        setBooleanField(term2163, term2163.getClass(), "ignoreRepaint", false);
        setBooleanField(term2163, term2163.getClass(), "visible", false);
        setBooleanField(term2163, term2163.getClass(), "enabled", false);
        setBooleanField(term2163, term2163.getClass(), "valid", false);
        setField(term2163, term2163.getClass(), "dropTarget", null);
        setField(term2163, term2163.getClass(), "popups", null);
        setField(term2163, term2163.getClass(), "name", null);
        setBooleanField(term2163, term2163.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2163, term2163.getClass(), "focusable", false);
        setIntField(term2163, term2163.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2163, term2163.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2163, term2163.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2163, term2163.getClass(), "acc", null);
        setField(term2163, term2163.getClass(), "minSize", null);
        setBooleanField(term2163, term2163.getClass(), "minSizeSet", false);
        setField(term2163, term2163.getClass(), "prefSize", null);
        setBooleanField(term2163, term2163.getClass(), "prefSizeSet", false);
        setField(term2163, term2163.getClass(), "maxSize", null);
        setBooleanField(term2163, term2163.getClass(), "maxSizeSet", false);
        setField(term2163, term2163.getClass(), "componentOrientation", null);
        setBooleanField(term2163, term2163.getClass(), "newEventsOnly", false);
        setField(term2163, term2163.getClass(), "componentListener", null);
        setField(term2163, term2163.getClass(), "focusListener", null);
        setField(term2163, term2163.getClass(), "hierarchyListener", null);
        setField(term2163, term2163.getClass(), "hierarchyBoundsListener", null);
        setField(term2163, term2163.getClass(), "keyListener", null);
        setField(term2163, term2163.getClass(), "mouseListener", null);
        setField(term2163, term2163.getClass(), "mouseMotionListener", null);
        setField(term2163, term2163.getClass(), "mouseWheelListener", null);
        setField(term2163, term2163.getClass(), "inputMethodListener", null);
        setLongField(term2163, term2163.getClass(), "eventMask", 0L);
        setField(term2163, term2163.getClass(), "changeSupport", null);
        setField(term2163, term2163.getClass(), "objectLock", null);
        setBooleanField(term2163, term2163.getClass(), "isPacked", false);
        setIntField(term2163, term2163.getClass(), "boundsOp", 0);
        setField(term2163, term2163.getClass(), "compoundShape", null);
        setField(term2163, term2163.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2163, term2163.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2163, term2163.getClass(), "backgroundEraseDisabled", false);
        setField(term2163, term2163.getClass(), "eventCache", null);
        setBooleanField(term2163, term2163.getClass(), "coalescingEnabled", false);
        setBooleanField(term2163, term2163.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2163, term2163.getClass(), "componentSerializedDataVersion", 0);
        setField(term2163, term2163.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.buttons.IconButton");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPressedImage", argTypes, term2163, args);
    }

};


