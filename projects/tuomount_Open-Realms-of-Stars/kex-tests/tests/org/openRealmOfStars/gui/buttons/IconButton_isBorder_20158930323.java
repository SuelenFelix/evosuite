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

public class IconButton_isBorder_20158930323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2348;

    public IconButton_isBorder_20158930323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2348 = newInstance(Class.forName("org.openRealmOfStars.gui.buttons.IconButton"));
        setField(term2348, term2348.getClass(), "notPressedImage", null);
        setField(term2348, term2348.getClass(), "pressedImage", null);
        setField(term2348, term2348.getClass(), "disabledImage", null);
        setField(term2348, term2348.getClass(), "rollOverImage", null);
        setBooleanField(term2348, term2348.getClass(), "border", false);
        setField(term2348, term2348.getClass(), "parent", null);
        setField(term2348, term2348.getClass(), "model", null);
        setField(term2348, term2348.getClass(), "text", null);
        setField(term2348, term2348.getClass(), "margin", null);
        setField(term2348, term2348.getClass(), "defaultMargin", null);
        setField(term2348, term2348.getClass(), "defaultIcon", null);
        setField(term2348, term2348.getClass(), "pressedIcon", null);
        setField(term2348, term2348.getClass(), "disabledIcon", null);
        setField(term2348, term2348.getClass(), "selectedIcon", null);
        setField(term2348, term2348.getClass(), "disabledSelectedIcon", null);
        setField(term2348, term2348.getClass(), "rolloverIcon", null);
        setField(term2348, term2348.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term2348, term2348.getClass(), "paintBorder", false);
        setBooleanField(term2348, term2348.getClass(), "paintFocus", false);
        setBooleanField(term2348, term2348.getClass(), "rolloverEnabled", false);
        setBooleanField(term2348, term2348.getClass(), "contentAreaFilled", false);
        setIntField(term2348, term2348.getClass(), "verticalAlignment", 0);
        setIntField(term2348, term2348.getClass(), "horizontalAlignment", 0);
        setIntField(term2348, term2348.getClass(), "verticalTextPosition", 0);
        setIntField(term2348, term2348.getClass(), "horizontalTextPosition", 0);
        setIntField(term2348, term2348.getClass(), "iconTextGap", 0);
        setIntField(term2348, term2348.getClass(), "mnemonic", 0);
        setIntField(term2348, term2348.getClass(), "mnemonicIndex", 0);
        setLongField(term2348, term2348.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term2348, term2348.getClass(), "borderPaintedSet", false);
        setBooleanField(term2348, term2348.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term2348, term2348.getClass(), "iconTextGapSet", false);
        setBooleanField(term2348, term2348.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term2348, term2348.getClass(), "setLayout", false);
        setBooleanField(term2348, term2348.getClass(), "defaultCapable", false);
        setField(term2348, term2348.getClass(), "handler", null);
        setField(term2348, term2348.getClass(), "changeListener", null);
        setField(term2348, term2348.getClass(), "actionListener", null);
        setField(term2348, term2348.getClass(), "itemListener", null);
        setField(term2348, term2348.getClass(), "changeEvent", null);
        setBooleanField(term2348, term2348.getClass(), "hideActionText", false);
        setField(term2348, term2348.getClass(), "action", null);
        setField(term2348, term2348.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term2348, term2348.getClass(), "isAlignmentXSet", false);
        setFloatField(term2348, term2348.getClass(), "alignmentX", 0.0F);
        setBooleanField(term2348, term2348.getClass(), "isAlignmentYSet", false);
        setFloatField(term2348, term2348.getClass(), "alignmentY", 0.0F);
        setField(term2348, term2348.getClass(), "ui", null);
        setField(term2348, term2348.getClass(), "listenerList", null);
        setField(term2348, term2348.getClass(), "clientProperties", null);
        setField(term2348, term2348.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term2348, term2348.getClass(), "autoscrolls", false);
        setField(term2348, term2348.getClass(), "border", null);
        setIntField(term2348, term2348.getClass(), "flags", 0);
        setField(term2348, term2348.getClass(), "inputVerifier", null);
        setBooleanField(term2348, term2348.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term2348, term2348.getClass(), "paintingChild", null);
        setField(term2348, term2348.getClass(), "popupMenu", null);
        setField(term2348, term2348.getClass(), "revalidateRunnableScheduled", null);
        setField(term2348, term2348.getClass(), "focusInputMap", null);
        setField(term2348, term2348.getClass(), "ancestorInputMap", null);
        setField(term2348, term2348.getClass(), "windowInputMap", null);
        setField(term2348, term2348.getClass(), "actionMap", null);
        setField(term2348, term2348.getClass(), "aaHint", null);
        setField(term2348, term2348.getClass(), "lcdRenderingHint", null);
        setField(term2348, term2348.getClass(), "component", null);
        setField(term2348, term2348.getClass(), "layoutMgr", null);
        setField(term2348, term2348.getClass(), "dispatcher", null);
        setField(term2348, term2348.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2348, term2348.getClass(), "focusCycleRoot", false);
        setBooleanField(term2348, term2348.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2348, term2348.getClass(), "printingThreads", null);
        setBooleanField(term2348, term2348.getClass(), "printing", false);
        setField(term2348, term2348.getClass(), "containerListener", null);
        setIntField(term2348, term2348.getClass(), "listeningChildren", 0);
        setIntField(term2348, term2348.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2348, term2348.getClass(), "descendantsCount", 0);
        setField(term2348, term2348.getClass(), "preserveBackgroundColor", null);
        setIntField(term2348, term2348.getClass(), "numOfHWComponents", 0);
        setIntField(term2348, term2348.getClass(), "numOfLWComponents", 0);
        setField(term2348, term2348.getClass(), "modalComp", null);
        setField(term2348, term2348.getClass(), "modalAppContext", null);
        setIntField(term2348, term2348.getClass(), "containerSerializedDataVersion", 0);
        setField(term2348, term2348.getClass(), "peer", null);
        setField(term2348, term2348.getClass(), "parent", null);
        setField(term2348, term2348.getClass(), "appContext", null);
        setIntField(term2348, term2348.getClass(), "x", 0);
        setIntField(term2348, term2348.getClass(), "y", 0);
        setIntField(term2348, term2348.getClass(), "width", 0);
        setIntField(term2348, term2348.getClass(), "height", 0);
        setField(term2348, term2348.getClass(), "foreground", null);
        setField(term2348, term2348.getClass(), "background", null);
        setField(term2348, term2348.getClass(), "font", null);
        setField(term2348, term2348.getClass(), "peerFont", null);
        setField(term2348, term2348.getClass(), "cursor", null);
        setField(term2348, term2348.getClass(), "locale", null);
        setField(term2348, term2348.getClass(), "graphicsConfig", null);
        setField(term2348, term2348.getClass(), "bufferStrategy", null);
        setBooleanField(term2348, term2348.getClass(), "ignoreRepaint", false);
        setBooleanField(term2348, term2348.getClass(), "visible", false);
        setBooleanField(term2348, term2348.getClass(), "enabled", false);
        setBooleanField(term2348, term2348.getClass(), "valid", false);
        setField(term2348, term2348.getClass(), "dropTarget", null);
        setField(term2348, term2348.getClass(), "popups", null);
        setField(term2348, term2348.getClass(), "name", null);
        setBooleanField(term2348, term2348.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2348, term2348.getClass(), "focusable", false);
        setIntField(term2348, term2348.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2348, term2348.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2348, term2348.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2348, term2348.getClass(), "acc", null);
        setField(term2348, term2348.getClass(), "minSize", null);
        setBooleanField(term2348, term2348.getClass(), "minSizeSet", false);
        setField(term2348, term2348.getClass(), "prefSize", null);
        setBooleanField(term2348, term2348.getClass(), "prefSizeSet", false);
        setField(term2348, term2348.getClass(), "maxSize", null);
        setBooleanField(term2348, term2348.getClass(), "maxSizeSet", false);
        setField(term2348, term2348.getClass(), "componentOrientation", null);
        setBooleanField(term2348, term2348.getClass(), "newEventsOnly", false);
        setField(term2348, term2348.getClass(), "componentListener", null);
        setField(term2348, term2348.getClass(), "focusListener", null);
        setField(term2348, term2348.getClass(), "hierarchyListener", null);
        setField(term2348, term2348.getClass(), "hierarchyBoundsListener", null);
        setField(term2348, term2348.getClass(), "keyListener", null);
        setField(term2348, term2348.getClass(), "mouseListener", null);
        setField(term2348, term2348.getClass(), "mouseMotionListener", null);
        setField(term2348, term2348.getClass(), "mouseWheelListener", null);
        setField(term2348, term2348.getClass(), "inputMethodListener", null);
        setLongField(term2348, term2348.getClass(), "eventMask", 0L);
        setField(term2348, term2348.getClass(), "changeSupport", null);
        setField(term2348, term2348.getClass(), "objectLock", null);
        setBooleanField(term2348, term2348.getClass(), "isPacked", false);
        setIntField(term2348, term2348.getClass(), "boundsOp", 0);
        setField(term2348, term2348.getClass(), "compoundShape", null);
        setField(term2348, term2348.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2348, term2348.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2348, term2348.getClass(), "backgroundEraseDisabled", false);
        setField(term2348, term2348.getClass(), "eventCache", null);
        setBooleanField(term2348, term2348.getClass(), "coalescingEnabled", false);
        setBooleanField(term2348, term2348.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2348, term2348.getClass(), "componentSerializedDataVersion", 0);
        setField(term2348, term2348.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.buttons.IconButton");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBorder", argTypes, term2348, args);
    }

};


