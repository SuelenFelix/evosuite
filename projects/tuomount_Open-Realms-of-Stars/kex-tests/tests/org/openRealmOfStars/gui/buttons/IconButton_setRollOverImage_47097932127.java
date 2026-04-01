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

public class IconButton_setRollOverImage_47097932127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2592;

    public IconButton_setRollOverImage_47097932127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2592 = newInstance(Class.forName("org.openRealmOfStars.gui.buttons.IconButton"));
        setField(term2592, term2592.getClass(), "notPressedImage", null);
        setField(term2592, term2592.getClass(), "pressedImage", null);
        setField(term2592, term2592.getClass(), "disabledImage", null);
        setField(term2592, term2592.getClass(), "rollOverImage", null);
        setBooleanField(term2592, term2592.getClass(), "border", false);
        setField(term2592, term2592.getClass(), "parent", null);
        setField(term2592, term2592.getClass(), "model", null);
        setField(term2592, term2592.getClass(), "text", null);
        setField(term2592, term2592.getClass(), "margin", null);
        setField(term2592, term2592.getClass(), "defaultMargin", null);
        setField(term2592, term2592.getClass(), "defaultIcon", null);
        setField(term2592, term2592.getClass(), "pressedIcon", null);
        setField(term2592, term2592.getClass(), "disabledIcon", null);
        setField(term2592, term2592.getClass(), "selectedIcon", null);
        setField(term2592, term2592.getClass(), "disabledSelectedIcon", null);
        setField(term2592, term2592.getClass(), "rolloverIcon", null);
        setField(term2592, term2592.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term2592, term2592.getClass(), "paintBorder", false);
        setBooleanField(term2592, term2592.getClass(), "paintFocus", false);
        setBooleanField(term2592, term2592.getClass(), "rolloverEnabled", false);
        setBooleanField(term2592, term2592.getClass(), "contentAreaFilled", false);
        setIntField(term2592, term2592.getClass(), "verticalAlignment", 0);
        setIntField(term2592, term2592.getClass(), "horizontalAlignment", 0);
        setIntField(term2592, term2592.getClass(), "verticalTextPosition", 0);
        setIntField(term2592, term2592.getClass(), "horizontalTextPosition", 0);
        setIntField(term2592, term2592.getClass(), "iconTextGap", 0);
        setIntField(term2592, term2592.getClass(), "mnemonic", 0);
        setIntField(term2592, term2592.getClass(), "mnemonicIndex", 0);
        setLongField(term2592, term2592.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term2592, term2592.getClass(), "borderPaintedSet", false);
        setBooleanField(term2592, term2592.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term2592, term2592.getClass(), "iconTextGapSet", false);
        setBooleanField(term2592, term2592.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term2592, term2592.getClass(), "setLayout", false);
        setBooleanField(term2592, term2592.getClass(), "defaultCapable", false);
        setField(term2592, term2592.getClass(), "handler", null);
        setField(term2592, term2592.getClass(), "changeListener", null);
        setField(term2592, term2592.getClass(), "actionListener", null);
        setField(term2592, term2592.getClass(), "itemListener", null);
        setField(term2592, term2592.getClass(), "changeEvent", null);
        setBooleanField(term2592, term2592.getClass(), "hideActionText", false);
        setField(term2592, term2592.getClass(), "action", null);
        setField(term2592, term2592.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term2592, term2592.getClass(), "isAlignmentXSet", false);
        setFloatField(term2592, term2592.getClass(), "alignmentX", 0.0F);
        setBooleanField(term2592, term2592.getClass(), "isAlignmentYSet", false);
        setFloatField(term2592, term2592.getClass(), "alignmentY", 0.0F);
        setField(term2592, term2592.getClass(), "ui", null);
        setField(term2592, term2592.getClass(), "listenerList", null);
        setField(term2592, term2592.getClass(), "clientProperties", null);
        setField(term2592, term2592.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term2592, term2592.getClass(), "autoscrolls", false);
        setField(term2592, term2592.getClass(), "border", null);
        setIntField(term2592, term2592.getClass(), "flags", 0);
        setField(term2592, term2592.getClass(), "inputVerifier", null);
        setBooleanField(term2592, term2592.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term2592, term2592.getClass(), "paintingChild", null);
        setField(term2592, term2592.getClass(), "popupMenu", null);
        setField(term2592, term2592.getClass(), "revalidateRunnableScheduled", null);
        setField(term2592, term2592.getClass(), "focusInputMap", null);
        setField(term2592, term2592.getClass(), "ancestorInputMap", null);
        setField(term2592, term2592.getClass(), "windowInputMap", null);
        setField(term2592, term2592.getClass(), "actionMap", null);
        setField(term2592, term2592.getClass(), "aaHint", null);
        setField(term2592, term2592.getClass(), "lcdRenderingHint", null);
        setField(term2592, term2592.getClass(), "component", null);
        setField(term2592, term2592.getClass(), "layoutMgr", null);
        setField(term2592, term2592.getClass(), "dispatcher", null);
        setField(term2592, term2592.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2592, term2592.getClass(), "focusCycleRoot", false);
        setBooleanField(term2592, term2592.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2592, term2592.getClass(), "printingThreads", null);
        setBooleanField(term2592, term2592.getClass(), "printing", false);
        setField(term2592, term2592.getClass(), "containerListener", null);
        setIntField(term2592, term2592.getClass(), "listeningChildren", 0);
        setIntField(term2592, term2592.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2592, term2592.getClass(), "descendantsCount", 0);
        setField(term2592, term2592.getClass(), "preserveBackgroundColor", null);
        setIntField(term2592, term2592.getClass(), "numOfHWComponents", 0);
        setIntField(term2592, term2592.getClass(), "numOfLWComponents", 0);
        setField(term2592, term2592.getClass(), "modalComp", null);
        setField(term2592, term2592.getClass(), "modalAppContext", null);
        setIntField(term2592, term2592.getClass(), "containerSerializedDataVersion", 0);
        setField(term2592, term2592.getClass(), "peer", null);
        setField(term2592, term2592.getClass(), "parent", null);
        setField(term2592, term2592.getClass(), "appContext", null);
        setIntField(term2592, term2592.getClass(), "x", 0);
        setIntField(term2592, term2592.getClass(), "y", 0);
        setIntField(term2592, term2592.getClass(), "width", 0);
        setIntField(term2592, term2592.getClass(), "height", 0);
        setField(term2592, term2592.getClass(), "foreground", null);
        setField(term2592, term2592.getClass(), "background", null);
        setField(term2592, term2592.getClass(), "font", null);
        setField(term2592, term2592.getClass(), "peerFont", null);
        setField(term2592, term2592.getClass(), "cursor", null);
        setField(term2592, term2592.getClass(), "locale", null);
        setField(term2592, term2592.getClass(), "graphicsConfig", null);
        setField(term2592, term2592.getClass(), "bufferStrategy", null);
        setBooleanField(term2592, term2592.getClass(), "ignoreRepaint", false);
        setBooleanField(term2592, term2592.getClass(), "visible", false);
        setBooleanField(term2592, term2592.getClass(), "enabled", false);
        setBooleanField(term2592, term2592.getClass(), "valid", false);
        setField(term2592, term2592.getClass(), "dropTarget", null);
        setField(term2592, term2592.getClass(), "popups", null);
        setField(term2592, term2592.getClass(), "name", null);
        setBooleanField(term2592, term2592.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2592, term2592.getClass(), "focusable", false);
        setIntField(term2592, term2592.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2592, term2592.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2592, term2592.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2592, term2592.getClass(), "acc", null);
        setField(term2592, term2592.getClass(), "minSize", null);
        setBooleanField(term2592, term2592.getClass(), "minSizeSet", false);
        setField(term2592, term2592.getClass(), "prefSize", null);
        setBooleanField(term2592, term2592.getClass(), "prefSizeSet", false);
        setField(term2592, term2592.getClass(), "maxSize", null);
        setBooleanField(term2592, term2592.getClass(), "maxSizeSet", false);
        setField(term2592, term2592.getClass(), "componentOrientation", null);
        setBooleanField(term2592, term2592.getClass(), "newEventsOnly", false);
        setField(term2592, term2592.getClass(), "componentListener", null);
        setField(term2592, term2592.getClass(), "focusListener", null);
        setField(term2592, term2592.getClass(), "hierarchyListener", null);
        setField(term2592, term2592.getClass(), "hierarchyBoundsListener", null);
        setField(term2592, term2592.getClass(), "keyListener", null);
        setField(term2592, term2592.getClass(), "mouseListener", null);
        setField(term2592, term2592.getClass(), "mouseMotionListener", null);
        setField(term2592, term2592.getClass(), "mouseWheelListener", null);
        setField(term2592, term2592.getClass(), "inputMethodListener", null);
        setLongField(term2592, term2592.getClass(), "eventMask", 0L);
        setField(term2592, term2592.getClass(), "changeSupport", null);
        setField(term2592, term2592.getClass(), "objectLock", null);
        setBooleanField(term2592, term2592.getClass(), "isPacked", false);
        setIntField(term2592, term2592.getClass(), "boundsOp", 0);
        setField(term2592, term2592.getClass(), "compoundShape", null);
        setField(term2592, term2592.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2592, term2592.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2592, term2592.getClass(), "backgroundEraseDisabled", false);
        setField(term2592, term2592.getClass(), "eventCache", null);
        setBooleanField(term2592, term2592.getClass(), "coalescingEnabled", false);
        setBooleanField(term2592, term2592.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2592, term2592.getClass(), "componentSerializedDataVersion", 0);
        setField(term2592, term2592.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.buttons.IconButton");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRollOverImage", argTypes, term2592, args);
    }

};


