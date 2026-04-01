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

public class IconButton_setDisabledImage_128395798825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2470;

    public IconButton_setDisabledImage_128395798825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2470 = newInstance(Class.forName("org.openRealmOfStars.gui.buttons.IconButton"));
        setField(term2470, term2470.getClass(), "notPressedImage", null);
        setField(term2470, term2470.getClass(), "pressedImage", null);
        setField(term2470, term2470.getClass(), "disabledImage", null);
        setField(term2470, term2470.getClass(), "rollOverImage", null);
        setBooleanField(term2470, term2470.getClass(), "border", false);
        setField(term2470, term2470.getClass(), "parent", null);
        setField(term2470, term2470.getClass(), "model", null);
        setField(term2470, term2470.getClass(), "text", null);
        setField(term2470, term2470.getClass(), "margin", null);
        setField(term2470, term2470.getClass(), "defaultMargin", null);
        setField(term2470, term2470.getClass(), "defaultIcon", null);
        setField(term2470, term2470.getClass(), "pressedIcon", null);
        setField(term2470, term2470.getClass(), "disabledIcon", null);
        setField(term2470, term2470.getClass(), "selectedIcon", null);
        setField(term2470, term2470.getClass(), "disabledSelectedIcon", null);
        setField(term2470, term2470.getClass(), "rolloverIcon", null);
        setField(term2470, term2470.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term2470, term2470.getClass(), "paintBorder", false);
        setBooleanField(term2470, term2470.getClass(), "paintFocus", false);
        setBooleanField(term2470, term2470.getClass(), "rolloverEnabled", false);
        setBooleanField(term2470, term2470.getClass(), "contentAreaFilled", false);
        setIntField(term2470, term2470.getClass(), "verticalAlignment", 0);
        setIntField(term2470, term2470.getClass(), "horizontalAlignment", 0);
        setIntField(term2470, term2470.getClass(), "verticalTextPosition", 0);
        setIntField(term2470, term2470.getClass(), "horizontalTextPosition", 0);
        setIntField(term2470, term2470.getClass(), "iconTextGap", 0);
        setIntField(term2470, term2470.getClass(), "mnemonic", 0);
        setIntField(term2470, term2470.getClass(), "mnemonicIndex", 0);
        setLongField(term2470, term2470.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term2470, term2470.getClass(), "borderPaintedSet", false);
        setBooleanField(term2470, term2470.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term2470, term2470.getClass(), "iconTextGapSet", false);
        setBooleanField(term2470, term2470.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term2470, term2470.getClass(), "setLayout", false);
        setBooleanField(term2470, term2470.getClass(), "defaultCapable", false);
        setField(term2470, term2470.getClass(), "handler", null);
        setField(term2470, term2470.getClass(), "changeListener", null);
        setField(term2470, term2470.getClass(), "actionListener", null);
        setField(term2470, term2470.getClass(), "itemListener", null);
        setField(term2470, term2470.getClass(), "changeEvent", null);
        setBooleanField(term2470, term2470.getClass(), "hideActionText", false);
        setField(term2470, term2470.getClass(), "action", null);
        setField(term2470, term2470.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term2470, term2470.getClass(), "isAlignmentXSet", false);
        setFloatField(term2470, term2470.getClass(), "alignmentX", 0.0F);
        setBooleanField(term2470, term2470.getClass(), "isAlignmentYSet", false);
        setFloatField(term2470, term2470.getClass(), "alignmentY", 0.0F);
        setField(term2470, term2470.getClass(), "ui", null);
        setField(term2470, term2470.getClass(), "listenerList", null);
        setField(term2470, term2470.getClass(), "clientProperties", null);
        setField(term2470, term2470.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term2470, term2470.getClass(), "autoscrolls", false);
        setField(term2470, term2470.getClass(), "border", null);
        setIntField(term2470, term2470.getClass(), "flags", 0);
        setField(term2470, term2470.getClass(), "inputVerifier", null);
        setBooleanField(term2470, term2470.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term2470, term2470.getClass(), "paintingChild", null);
        setField(term2470, term2470.getClass(), "popupMenu", null);
        setField(term2470, term2470.getClass(), "revalidateRunnableScheduled", null);
        setField(term2470, term2470.getClass(), "focusInputMap", null);
        setField(term2470, term2470.getClass(), "ancestorInputMap", null);
        setField(term2470, term2470.getClass(), "windowInputMap", null);
        setField(term2470, term2470.getClass(), "actionMap", null);
        setField(term2470, term2470.getClass(), "aaHint", null);
        setField(term2470, term2470.getClass(), "lcdRenderingHint", null);
        setField(term2470, term2470.getClass(), "component", null);
        setField(term2470, term2470.getClass(), "layoutMgr", null);
        setField(term2470, term2470.getClass(), "dispatcher", null);
        setField(term2470, term2470.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2470, term2470.getClass(), "focusCycleRoot", false);
        setBooleanField(term2470, term2470.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2470, term2470.getClass(), "printingThreads", null);
        setBooleanField(term2470, term2470.getClass(), "printing", false);
        setField(term2470, term2470.getClass(), "containerListener", null);
        setIntField(term2470, term2470.getClass(), "listeningChildren", 0);
        setIntField(term2470, term2470.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2470, term2470.getClass(), "descendantsCount", 0);
        setField(term2470, term2470.getClass(), "preserveBackgroundColor", null);
        setIntField(term2470, term2470.getClass(), "numOfHWComponents", 0);
        setIntField(term2470, term2470.getClass(), "numOfLWComponents", 0);
        setField(term2470, term2470.getClass(), "modalComp", null);
        setField(term2470, term2470.getClass(), "modalAppContext", null);
        setIntField(term2470, term2470.getClass(), "containerSerializedDataVersion", 0);
        setField(term2470, term2470.getClass(), "peer", null);
        setField(term2470, term2470.getClass(), "parent", null);
        setField(term2470, term2470.getClass(), "appContext", null);
        setIntField(term2470, term2470.getClass(), "x", 0);
        setIntField(term2470, term2470.getClass(), "y", 0);
        setIntField(term2470, term2470.getClass(), "width", 0);
        setIntField(term2470, term2470.getClass(), "height", 0);
        setField(term2470, term2470.getClass(), "foreground", null);
        setField(term2470, term2470.getClass(), "background", null);
        setField(term2470, term2470.getClass(), "font", null);
        setField(term2470, term2470.getClass(), "peerFont", null);
        setField(term2470, term2470.getClass(), "cursor", null);
        setField(term2470, term2470.getClass(), "locale", null);
        setField(term2470, term2470.getClass(), "graphicsConfig", null);
        setField(term2470, term2470.getClass(), "bufferStrategy", null);
        setBooleanField(term2470, term2470.getClass(), "ignoreRepaint", false);
        setBooleanField(term2470, term2470.getClass(), "visible", false);
        setBooleanField(term2470, term2470.getClass(), "enabled", false);
        setBooleanField(term2470, term2470.getClass(), "valid", false);
        setField(term2470, term2470.getClass(), "dropTarget", null);
        setField(term2470, term2470.getClass(), "popups", null);
        setField(term2470, term2470.getClass(), "name", null);
        setBooleanField(term2470, term2470.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2470, term2470.getClass(), "focusable", false);
        setIntField(term2470, term2470.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2470, term2470.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2470, term2470.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2470, term2470.getClass(), "acc", null);
        setField(term2470, term2470.getClass(), "minSize", null);
        setBooleanField(term2470, term2470.getClass(), "minSizeSet", false);
        setField(term2470, term2470.getClass(), "prefSize", null);
        setBooleanField(term2470, term2470.getClass(), "prefSizeSet", false);
        setField(term2470, term2470.getClass(), "maxSize", null);
        setBooleanField(term2470, term2470.getClass(), "maxSizeSet", false);
        setField(term2470, term2470.getClass(), "componentOrientation", null);
        setBooleanField(term2470, term2470.getClass(), "newEventsOnly", false);
        setField(term2470, term2470.getClass(), "componentListener", null);
        setField(term2470, term2470.getClass(), "focusListener", null);
        setField(term2470, term2470.getClass(), "hierarchyListener", null);
        setField(term2470, term2470.getClass(), "hierarchyBoundsListener", null);
        setField(term2470, term2470.getClass(), "keyListener", null);
        setField(term2470, term2470.getClass(), "mouseListener", null);
        setField(term2470, term2470.getClass(), "mouseMotionListener", null);
        setField(term2470, term2470.getClass(), "mouseWheelListener", null);
        setField(term2470, term2470.getClass(), "inputMethodListener", null);
        setLongField(term2470, term2470.getClass(), "eventMask", 0L);
        setField(term2470, term2470.getClass(), "changeSupport", null);
        setField(term2470, term2470.getClass(), "objectLock", null);
        setBooleanField(term2470, term2470.getClass(), "isPacked", false);
        setIntField(term2470, term2470.getClass(), "boundsOp", 0);
        setField(term2470, term2470.getClass(), "compoundShape", null);
        setField(term2470, term2470.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2470, term2470.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2470, term2470.getClass(), "backgroundEraseDisabled", false);
        setField(term2470, term2470.getClass(), "eventCache", null);
        setBooleanField(term2470, term2470.getClass(), "coalescingEnabled", false);
        setBooleanField(term2470, term2470.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2470, term2470.getClass(), "componentSerializedDataVersion", 0);
        setField(term2470, term2470.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.buttons.IconButton");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDisabledImage", argTypes, term2470, args);
    }

};


