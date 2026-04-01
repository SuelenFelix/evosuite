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
import java.lang.Boolean;

public class IconButton_setBorder_171033952922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2285;
     Object term2346;

    public IconButton_setBorder_171033952922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2285 = newInstance(Class.forName("org.openRealmOfStars.gui.buttons.IconButton"));
        setField(term2285, term2285.getClass(), "notPressedImage", null);
        setField(term2285, term2285.getClass(), "pressedImage", null);
        setField(term2285, term2285.getClass(), "disabledImage", null);
        setField(term2285, term2285.getClass(), "rollOverImage", null);
        setBooleanField(term2285, term2285.getClass(), "border", false);
        setField(term2285, term2285.getClass(), "parent", null);
        setField(term2285, term2285.getClass(), "model", null);
        setField(term2285, term2285.getClass(), "text", null);
        setField(term2285, term2285.getClass(), "margin", null);
        setField(term2285, term2285.getClass(), "defaultMargin", null);
        setField(term2285, term2285.getClass(), "defaultIcon", null);
        setField(term2285, term2285.getClass(), "pressedIcon", null);
        setField(term2285, term2285.getClass(), "disabledIcon", null);
        setField(term2285, term2285.getClass(), "selectedIcon", null);
        setField(term2285, term2285.getClass(), "disabledSelectedIcon", null);
        setField(term2285, term2285.getClass(), "rolloverIcon", null);
        setField(term2285, term2285.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term2285, term2285.getClass(), "paintBorder", false);
        setBooleanField(term2285, term2285.getClass(), "paintFocus", false);
        setBooleanField(term2285, term2285.getClass(), "rolloverEnabled", false);
        setBooleanField(term2285, term2285.getClass(), "contentAreaFilled", false);
        setIntField(term2285, term2285.getClass(), "verticalAlignment", 0);
        setIntField(term2285, term2285.getClass(), "horizontalAlignment", 0);
        setIntField(term2285, term2285.getClass(), "verticalTextPosition", 0);
        setIntField(term2285, term2285.getClass(), "horizontalTextPosition", 0);
        setIntField(term2285, term2285.getClass(), "iconTextGap", 0);
        setIntField(term2285, term2285.getClass(), "mnemonic", 0);
        setIntField(term2285, term2285.getClass(), "mnemonicIndex", 0);
        setLongField(term2285, term2285.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term2285, term2285.getClass(), "borderPaintedSet", false);
        setBooleanField(term2285, term2285.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term2285, term2285.getClass(), "iconTextGapSet", false);
        setBooleanField(term2285, term2285.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term2285, term2285.getClass(), "setLayout", false);
        setBooleanField(term2285, term2285.getClass(), "defaultCapable", false);
        setField(term2285, term2285.getClass(), "handler", null);
        setField(term2285, term2285.getClass(), "changeListener", null);
        setField(term2285, term2285.getClass(), "actionListener", null);
        setField(term2285, term2285.getClass(), "itemListener", null);
        setField(term2285, term2285.getClass(), "changeEvent", null);
        setBooleanField(term2285, term2285.getClass(), "hideActionText", false);
        setField(term2285, term2285.getClass(), "action", null);
        setField(term2285, term2285.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term2285, term2285.getClass(), "isAlignmentXSet", false);
        setFloatField(term2285, term2285.getClass(), "alignmentX", 0.0F);
        setBooleanField(term2285, term2285.getClass(), "isAlignmentYSet", false);
        setFloatField(term2285, term2285.getClass(), "alignmentY", 0.0F);
        setField(term2285, term2285.getClass(), "ui", null);
        setField(term2285, term2285.getClass(), "listenerList", null);
        setField(term2285, term2285.getClass(), "clientProperties", null);
        setField(term2285, term2285.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term2285, term2285.getClass(), "autoscrolls", false);
        setField(term2285, term2285.getClass(), "border", null);
        setIntField(term2285, term2285.getClass(), "flags", 0);
        setField(term2285, term2285.getClass(), "inputVerifier", null);
        setBooleanField(term2285, term2285.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term2285, term2285.getClass(), "paintingChild", null);
        setField(term2285, term2285.getClass(), "popupMenu", null);
        setField(term2285, term2285.getClass(), "revalidateRunnableScheduled", null);
        setField(term2285, term2285.getClass(), "focusInputMap", null);
        setField(term2285, term2285.getClass(), "ancestorInputMap", null);
        setField(term2285, term2285.getClass(), "windowInputMap", null);
        setField(term2285, term2285.getClass(), "actionMap", null);
        setField(term2285, term2285.getClass(), "aaHint", null);
        setField(term2285, term2285.getClass(), "lcdRenderingHint", null);
        setField(term2285, term2285.getClass(), "component", null);
        setField(term2285, term2285.getClass(), "layoutMgr", null);
        setField(term2285, term2285.getClass(), "dispatcher", null);
        setField(term2285, term2285.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2285, term2285.getClass(), "focusCycleRoot", false);
        setBooleanField(term2285, term2285.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2285, term2285.getClass(), "printingThreads", null);
        setBooleanField(term2285, term2285.getClass(), "printing", false);
        setField(term2285, term2285.getClass(), "containerListener", null);
        setIntField(term2285, term2285.getClass(), "listeningChildren", 0);
        setIntField(term2285, term2285.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2285, term2285.getClass(), "descendantsCount", 0);
        setField(term2285, term2285.getClass(), "preserveBackgroundColor", null);
        setIntField(term2285, term2285.getClass(), "numOfHWComponents", 0);
        setIntField(term2285, term2285.getClass(), "numOfLWComponents", 0);
        setField(term2285, term2285.getClass(), "modalComp", null);
        setField(term2285, term2285.getClass(), "modalAppContext", null);
        setIntField(term2285, term2285.getClass(), "containerSerializedDataVersion", 0);
        setField(term2285, term2285.getClass(), "peer", null);
        setField(term2285, term2285.getClass(), "parent", null);
        setField(term2285, term2285.getClass(), "appContext", null);
        setIntField(term2285, term2285.getClass(), "x", 0);
        setIntField(term2285, term2285.getClass(), "y", 0);
        setIntField(term2285, term2285.getClass(), "width", 0);
        setIntField(term2285, term2285.getClass(), "height", 0);
        setField(term2285, term2285.getClass(), "foreground", null);
        setField(term2285, term2285.getClass(), "background", null);
        setField(term2285, term2285.getClass(), "font", null);
        setField(term2285, term2285.getClass(), "peerFont", null);
        setField(term2285, term2285.getClass(), "cursor", null);
        setField(term2285, term2285.getClass(), "locale", null);
        setField(term2285, term2285.getClass(), "graphicsConfig", null);
        setField(term2285, term2285.getClass(), "bufferStrategy", null);
        setBooleanField(term2285, term2285.getClass(), "ignoreRepaint", false);
        setBooleanField(term2285, term2285.getClass(), "visible", false);
        setBooleanField(term2285, term2285.getClass(), "enabled", false);
        setBooleanField(term2285, term2285.getClass(), "valid", false);
        setField(term2285, term2285.getClass(), "dropTarget", null);
        setField(term2285, term2285.getClass(), "popups", null);
        setField(term2285, term2285.getClass(), "name", null);
        setBooleanField(term2285, term2285.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2285, term2285.getClass(), "focusable", false);
        setIntField(term2285, term2285.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2285, term2285.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2285, term2285.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2285, term2285.getClass(), "acc", null);
        setField(term2285, term2285.getClass(), "minSize", null);
        setBooleanField(term2285, term2285.getClass(), "minSizeSet", false);
        setField(term2285, term2285.getClass(), "prefSize", null);
        setBooleanField(term2285, term2285.getClass(), "prefSizeSet", false);
        setField(term2285, term2285.getClass(), "maxSize", null);
        setBooleanField(term2285, term2285.getClass(), "maxSizeSet", false);
        setField(term2285, term2285.getClass(), "componentOrientation", null);
        setBooleanField(term2285, term2285.getClass(), "newEventsOnly", false);
        setField(term2285, term2285.getClass(), "componentListener", null);
        setField(term2285, term2285.getClass(), "focusListener", null);
        setField(term2285, term2285.getClass(), "hierarchyListener", null);
        setField(term2285, term2285.getClass(), "hierarchyBoundsListener", null);
        setField(term2285, term2285.getClass(), "keyListener", null);
        setField(term2285, term2285.getClass(), "mouseListener", null);
        setField(term2285, term2285.getClass(), "mouseMotionListener", null);
        setField(term2285, term2285.getClass(), "mouseWheelListener", null);
        setField(term2285, term2285.getClass(), "inputMethodListener", null);
        setLongField(term2285, term2285.getClass(), "eventMask", 0L);
        setField(term2285, term2285.getClass(), "changeSupport", null);
        setField(term2285, term2285.getClass(), "objectLock", null);
        setBooleanField(term2285, term2285.getClass(), "isPacked", false);
        setIntField(term2285, term2285.getClass(), "boundsOp", 0);
        setField(term2285, term2285.getClass(), "compoundShape", null);
        setField(term2285, term2285.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2285, term2285.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2285, term2285.getClass(), "backgroundEraseDisabled", false);
        setField(term2285, term2285.getClass(), "eventCache", null);
        setBooleanField(term2285, term2285.getClass(), "coalescingEnabled", false);
        setBooleanField(term2285, term2285.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2285, term2285.getClass(), "componentSerializedDataVersion", 0);
        setField(term2285, term2285.getClass(), "accessibleContext", null);
        term2346 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.buttons.IconButton");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2346;
        callMethod(klass, "setBorder", argTypes, term2285, args);
    }

};


