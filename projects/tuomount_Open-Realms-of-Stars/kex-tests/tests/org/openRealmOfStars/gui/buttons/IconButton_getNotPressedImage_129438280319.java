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

public class IconButton_getNotPressedImage_129438280319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2102;

    public IconButton_getNotPressedImage_129438280319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2102 = newInstance(Class.forName("org.openRealmOfStars.gui.buttons.IconButton"));
        setField(term2102, term2102.getClass(), "notPressedImage", null);
        setField(term2102, term2102.getClass(), "pressedImage", null);
        setField(term2102, term2102.getClass(), "disabledImage", null);
        setField(term2102, term2102.getClass(), "rollOverImage", null);
        setBooleanField(term2102, term2102.getClass(), "border", false);
        setField(term2102, term2102.getClass(), "parent", null);
        setField(term2102, term2102.getClass(), "model", null);
        setField(term2102, term2102.getClass(), "text", null);
        setField(term2102, term2102.getClass(), "margin", null);
        setField(term2102, term2102.getClass(), "defaultMargin", null);
        setField(term2102, term2102.getClass(), "defaultIcon", null);
        setField(term2102, term2102.getClass(), "pressedIcon", null);
        setField(term2102, term2102.getClass(), "disabledIcon", null);
        setField(term2102, term2102.getClass(), "selectedIcon", null);
        setField(term2102, term2102.getClass(), "disabledSelectedIcon", null);
        setField(term2102, term2102.getClass(), "rolloverIcon", null);
        setField(term2102, term2102.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term2102, term2102.getClass(), "paintBorder", false);
        setBooleanField(term2102, term2102.getClass(), "paintFocus", false);
        setBooleanField(term2102, term2102.getClass(), "rolloverEnabled", false);
        setBooleanField(term2102, term2102.getClass(), "contentAreaFilled", false);
        setIntField(term2102, term2102.getClass(), "verticalAlignment", 0);
        setIntField(term2102, term2102.getClass(), "horizontalAlignment", 0);
        setIntField(term2102, term2102.getClass(), "verticalTextPosition", 0);
        setIntField(term2102, term2102.getClass(), "horizontalTextPosition", 0);
        setIntField(term2102, term2102.getClass(), "iconTextGap", 0);
        setIntField(term2102, term2102.getClass(), "mnemonic", 0);
        setIntField(term2102, term2102.getClass(), "mnemonicIndex", 0);
        setLongField(term2102, term2102.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term2102, term2102.getClass(), "borderPaintedSet", false);
        setBooleanField(term2102, term2102.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term2102, term2102.getClass(), "iconTextGapSet", false);
        setBooleanField(term2102, term2102.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term2102, term2102.getClass(), "setLayout", false);
        setBooleanField(term2102, term2102.getClass(), "defaultCapable", false);
        setField(term2102, term2102.getClass(), "handler", null);
        setField(term2102, term2102.getClass(), "changeListener", null);
        setField(term2102, term2102.getClass(), "actionListener", null);
        setField(term2102, term2102.getClass(), "itemListener", null);
        setField(term2102, term2102.getClass(), "changeEvent", null);
        setBooleanField(term2102, term2102.getClass(), "hideActionText", false);
        setField(term2102, term2102.getClass(), "action", null);
        setField(term2102, term2102.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term2102, term2102.getClass(), "isAlignmentXSet", false);
        setFloatField(term2102, term2102.getClass(), "alignmentX", 0.0F);
        setBooleanField(term2102, term2102.getClass(), "isAlignmentYSet", false);
        setFloatField(term2102, term2102.getClass(), "alignmentY", 0.0F);
        setField(term2102, term2102.getClass(), "ui", null);
        setField(term2102, term2102.getClass(), "listenerList", null);
        setField(term2102, term2102.getClass(), "clientProperties", null);
        setField(term2102, term2102.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term2102, term2102.getClass(), "autoscrolls", false);
        setField(term2102, term2102.getClass(), "border", null);
        setIntField(term2102, term2102.getClass(), "flags", 0);
        setField(term2102, term2102.getClass(), "inputVerifier", null);
        setBooleanField(term2102, term2102.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term2102, term2102.getClass(), "paintingChild", null);
        setField(term2102, term2102.getClass(), "popupMenu", null);
        setField(term2102, term2102.getClass(), "revalidateRunnableScheduled", null);
        setField(term2102, term2102.getClass(), "focusInputMap", null);
        setField(term2102, term2102.getClass(), "ancestorInputMap", null);
        setField(term2102, term2102.getClass(), "windowInputMap", null);
        setField(term2102, term2102.getClass(), "actionMap", null);
        setField(term2102, term2102.getClass(), "aaHint", null);
        setField(term2102, term2102.getClass(), "lcdRenderingHint", null);
        setField(term2102, term2102.getClass(), "component", null);
        setField(term2102, term2102.getClass(), "layoutMgr", null);
        setField(term2102, term2102.getClass(), "dispatcher", null);
        setField(term2102, term2102.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2102, term2102.getClass(), "focusCycleRoot", false);
        setBooleanField(term2102, term2102.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2102, term2102.getClass(), "printingThreads", null);
        setBooleanField(term2102, term2102.getClass(), "printing", false);
        setField(term2102, term2102.getClass(), "containerListener", null);
        setIntField(term2102, term2102.getClass(), "listeningChildren", 0);
        setIntField(term2102, term2102.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2102, term2102.getClass(), "descendantsCount", 0);
        setField(term2102, term2102.getClass(), "preserveBackgroundColor", null);
        setIntField(term2102, term2102.getClass(), "numOfHWComponents", 0);
        setIntField(term2102, term2102.getClass(), "numOfLWComponents", 0);
        setField(term2102, term2102.getClass(), "modalComp", null);
        setField(term2102, term2102.getClass(), "modalAppContext", null);
        setIntField(term2102, term2102.getClass(), "containerSerializedDataVersion", 0);
        setField(term2102, term2102.getClass(), "peer", null);
        setField(term2102, term2102.getClass(), "parent", null);
        setField(term2102, term2102.getClass(), "appContext", null);
        setIntField(term2102, term2102.getClass(), "x", 0);
        setIntField(term2102, term2102.getClass(), "y", 0);
        setIntField(term2102, term2102.getClass(), "width", 0);
        setIntField(term2102, term2102.getClass(), "height", 0);
        setField(term2102, term2102.getClass(), "foreground", null);
        setField(term2102, term2102.getClass(), "background", null);
        setField(term2102, term2102.getClass(), "font", null);
        setField(term2102, term2102.getClass(), "peerFont", null);
        setField(term2102, term2102.getClass(), "cursor", null);
        setField(term2102, term2102.getClass(), "locale", null);
        setField(term2102, term2102.getClass(), "graphicsConfig", null);
        setField(term2102, term2102.getClass(), "bufferStrategy", null);
        setBooleanField(term2102, term2102.getClass(), "ignoreRepaint", false);
        setBooleanField(term2102, term2102.getClass(), "visible", false);
        setBooleanField(term2102, term2102.getClass(), "enabled", false);
        setBooleanField(term2102, term2102.getClass(), "valid", false);
        setField(term2102, term2102.getClass(), "dropTarget", null);
        setField(term2102, term2102.getClass(), "popups", null);
        setField(term2102, term2102.getClass(), "name", null);
        setBooleanField(term2102, term2102.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2102, term2102.getClass(), "focusable", false);
        setIntField(term2102, term2102.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2102, term2102.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2102, term2102.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2102, term2102.getClass(), "acc", null);
        setField(term2102, term2102.getClass(), "minSize", null);
        setBooleanField(term2102, term2102.getClass(), "minSizeSet", false);
        setField(term2102, term2102.getClass(), "prefSize", null);
        setBooleanField(term2102, term2102.getClass(), "prefSizeSet", false);
        setField(term2102, term2102.getClass(), "maxSize", null);
        setBooleanField(term2102, term2102.getClass(), "maxSizeSet", false);
        setField(term2102, term2102.getClass(), "componentOrientation", null);
        setBooleanField(term2102, term2102.getClass(), "newEventsOnly", false);
        setField(term2102, term2102.getClass(), "componentListener", null);
        setField(term2102, term2102.getClass(), "focusListener", null);
        setField(term2102, term2102.getClass(), "hierarchyListener", null);
        setField(term2102, term2102.getClass(), "hierarchyBoundsListener", null);
        setField(term2102, term2102.getClass(), "keyListener", null);
        setField(term2102, term2102.getClass(), "mouseListener", null);
        setField(term2102, term2102.getClass(), "mouseMotionListener", null);
        setField(term2102, term2102.getClass(), "mouseWheelListener", null);
        setField(term2102, term2102.getClass(), "inputMethodListener", null);
        setLongField(term2102, term2102.getClass(), "eventMask", 0L);
        setField(term2102, term2102.getClass(), "changeSupport", null);
        setField(term2102, term2102.getClass(), "objectLock", null);
        setBooleanField(term2102, term2102.getClass(), "isPacked", false);
        setIntField(term2102, term2102.getClass(), "boundsOp", 0);
        setField(term2102, term2102.getClass(), "compoundShape", null);
        setField(term2102, term2102.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2102, term2102.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2102, term2102.getClass(), "backgroundEraseDisabled", false);
        setField(term2102, term2102.getClass(), "eventCache", null);
        setBooleanField(term2102, term2102.getClass(), "coalescingEnabled", false);
        setBooleanField(term2102, term2102.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2102, term2102.getClass(), "componentSerializedDataVersion", 0);
        setField(term2102, term2102.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.buttons.IconButton");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNotPressedImage", argTypes, term2102, args);
    }

};


