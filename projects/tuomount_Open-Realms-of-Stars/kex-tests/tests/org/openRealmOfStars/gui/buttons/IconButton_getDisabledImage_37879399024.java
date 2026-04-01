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

public class IconButton_getDisabledImage_37879399024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2409;

    public IconButton_getDisabledImage_37879399024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2409 = newInstance(Class.forName("org.openRealmOfStars.gui.buttons.IconButton"));
        setField(term2409, term2409.getClass(), "notPressedImage", null);
        setField(term2409, term2409.getClass(), "pressedImage", null);
        setField(term2409, term2409.getClass(), "disabledImage", null);
        setField(term2409, term2409.getClass(), "rollOverImage", null);
        setBooleanField(term2409, term2409.getClass(), "border", false);
        setField(term2409, term2409.getClass(), "parent", null);
        setField(term2409, term2409.getClass(), "model", null);
        setField(term2409, term2409.getClass(), "text", null);
        setField(term2409, term2409.getClass(), "margin", null);
        setField(term2409, term2409.getClass(), "defaultMargin", null);
        setField(term2409, term2409.getClass(), "defaultIcon", null);
        setField(term2409, term2409.getClass(), "pressedIcon", null);
        setField(term2409, term2409.getClass(), "disabledIcon", null);
        setField(term2409, term2409.getClass(), "selectedIcon", null);
        setField(term2409, term2409.getClass(), "disabledSelectedIcon", null);
        setField(term2409, term2409.getClass(), "rolloverIcon", null);
        setField(term2409, term2409.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term2409, term2409.getClass(), "paintBorder", false);
        setBooleanField(term2409, term2409.getClass(), "paintFocus", false);
        setBooleanField(term2409, term2409.getClass(), "rolloverEnabled", false);
        setBooleanField(term2409, term2409.getClass(), "contentAreaFilled", false);
        setIntField(term2409, term2409.getClass(), "verticalAlignment", 0);
        setIntField(term2409, term2409.getClass(), "horizontalAlignment", 0);
        setIntField(term2409, term2409.getClass(), "verticalTextPosition", 0);
        setIntField(term2409, term2409.getClass(), "horizontalTextPosition", 0);
        setIntField(term2409, term2409.getClass(), "iconTextGap", 0);
        setIntField(term2409, term2409.getClass(), "mnemonic", 0);
        setIntField(term2409, term2409.getClass(), "mnemonicIndex", 0);
        setLongField(term2409, term2409.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term2409, term2409.getClass(), "borderPaintedSet", false);
        setBooleanField(term2409, term2409.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term2409, term2409.getClass(), "iconTextGapSet", false);
        setBooleanField(term2409, term2409.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term2409, term2409.getClass(), "setLayout", false);
        setBooleanField(term2409, term2409.getClass(), "defaultCapable", false);
        setField(term2409, term2409.getClass(), "handler", null);
        setField(term2409, term2409.getClass(), "changeListener", null);
        setField(term2409, term2409.getClass(), "actionListener", null);
        setField(term2409, term2409.getClass(), "itemListener", null);
        setField(term2409, term2409.getClass(), "changeEvent", null);
        setBooleanField(term2409, term2409.getClass(), "hideActionText", false);
        setField(term2409, term2409.getClass(), "action", null);
        setField(term2409, term2409.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term2409, term2409.getClass(), "isAlignmentXSet", false);
        setFloatField(term2409, term2409.getClass(), "alignmentX", 0.0F);
        setBooleanField(term2409, term2409.getClass(), "isAlignmentYSet", false);
        setFloatField(term2409, term2409.getClass(), "alignmentY", 0.0F);
        setField(term2409, term2409.getClass(), "ui", null);
        setField(term2409, term2409.getClass(), "listenerList", null);
        setField(term2409, term2409.getClass(), "clientProperties", null);
        setField(term2409, term2409.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term2409, term2409.getClass(), "autoscrolls", false);
        setField(term2409, term2409.getClass(), "border", null);
        setIntField(term2409, term2409.getClass(), "flags", 0);
        setField(term2409, term2409.getClass(), "inputVerifier", null);
        setBooleanField(term2409, term2409.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term2409, term2409.getClass(), "paintingChild", null);
        setField(term2409, term2409.getClass(), "popupMenu", null);
        setField(term2409, term2409.getClass(), "revalidateRunnableScheduled", null);
        setField(term2409, term2409.getClass(), "focusInputMap", null);
        setField(term2409, term2409.getClass(), "ancestorInputMap", null);
        setField(term2409, term2409.getClass(), "windowInputMap", null);
        setField(term2409, term2409.getClass(), "actionMap", null);
        setField(term2409, term2409.getClass(), "aaHint", null);
        setField(term2409, term2409.getClass(), "lcdRenderingHint", null);
        setField(term2409, term2409.getClass(), "component", null);
        setField(term2409, term2409.getClass(), "layoutMgr", null);
        setField(term2409, term2409.getClass(), "dispatcher", null);
        setField(term2409, term2409.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2409, term2409.getClass(), "focusCycleRoot", false);
        setBooleanField(term2409, term2409.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2409, term2409.getClass(), "printingThreads", null);
        setBooleanField(term2409, term2409.getClass(), "printing", false);
        setField(term2409, term2409.getClass(), "containerListener", null);
        setIntField(term2409, term2409.getClass(), "listeningChildren", 0);
        setIntField(term2409, term2409.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2409, term2409.getClass(), "descendantsCount", 0);
        setField(term2409, term2409.getClass(), "preserveBackgroundColor", null);
        setIntField(term2409, term2409.getClass(), "numOfHWComponents", 0);
        setIntField(term2409, term2409.getClass(), "numOfLWComponents", 0);
        setField(term2409, term2409.getClass(), "modalComp", null);
        setField(term2409, term2409.getClass(), "modalAppContext", null);
        setIntField(term2409, term2409.getClass(), "containerSerializedDataVersion", 0);
        setField(term2409, term2409.getClass(), "peer", null);
        setField(term2409, term2409.getClass(), "parent", null);
        setField(term2409, term2409.getClass(), "appContext", null);
        setIntField(term2409, term2409.getClass(), "x", 0);
        setIntField(term2409, term2409.getClass(), "y", 0);
        setIntField(term2409, term2409.getClass(), "width", 0);
        setIntField(term2409, term2409.getClass(), "height", 0);
        setField(term2409, term2409.getClass(), "foreground", null);
        setField(term2409, term2409.getClass(), "background", null);
        setField(term2409, term2409.getClass(), "font", null);
        setField(term2409, term2409.getClass(), "peerFont", null);
        setField(term2409, term2409.getClass(), "cursor", null);
        setField(term2409, term2409.getClass(), "locale", null);
        setField(term2409, term2409.getClass(), "graphicsConfig", null);
        setField(term2409, term2409.getClass(), "bufferStrategy", null);
        setBooleanField(term2409, term2409.getClass(), "ignoreRepaint", false);
        setBooleanField(term2409, term2409.getClass(), "visible", false);
        setBooleanField(term2409, term2409.getClass(), "enabled", false);
        setBooleanField(term2409, term2409.getClass(), "valid", false);
        setField(term2409, term2409.getClass(), "dropTarget", null);
        setField(term2409, term2409.getClass(), "popups", null);
        setField(term2409, term2409.getClass(), "name", null);
        setBooleanField(term2409, term2409.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2409, term2409.getClass(), "focusable", false);
        setIntField(term2409, term2409.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2409, term2409.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2409, term2409.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2409, term2409.getClass(), "acc", null);
        setField(term2409, term2409.getClass(), "minSize", null);
        setBooleanField(term2409, term2409.getClass(), "minSizeSet", false);
        setField(term2409, term2409.getClass(), "prefSize", null);
        setBooleanField(term2409, term2409.getClass(), "prefSizeSet", false);
        setField(term2409, term2409.getClass(), "maxSize", null);
        setBooleanField(term2409, term2409.getClass(), "maxSizeSet", false);
        setField(term2409, term2409.getClass(), "componentOrientation", null);
        setBooleanField(term2409, term2409.getClass(), "newEventsOnly", false);
        setField(term2409, term2409.getClass(), "componentListener", null);
        setField(term2409, term2409.getClass(), "focusListener", null);
        setField(term2409, term2409.getClass(), "hierarchyListener", null);
        setField(term2409, term2409.getClass(), "hierarchyBoundsListener", null);
        setField(term2409, term2409.getClass(), "keyListener", null);
        setField(term2409, term2409.getClass(), "mouseListener", null);
        setField(term2409, term2409.getClass(), "mouseMotionListener", null);
        setField(term2409, term2409.getClass(), "mouseWheelListener", null);
        setField(term2409, term2409.getClass(), "inputMethodListener", null);
        setLongField(term2409, term2409.getClass(), "eventMask", 0L);
        setField(term2409, term2409.getClass(), "changeSupport", null);
        setField(term2409, term2409.getClass(), "objectLock", null);
        setBooleanField(term2409, term2409.getClass(), "isPacked", false);
        setIntField(term2409, term2409.getClass(), "boundsOp", 0);
        setField(term2409, term2409.getClass(), "compoundShape", null);
        setField(term2409, term2409.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2409, term2409.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2409, term2409.getClass(), "backgroundEraseDisabled", false);
        setField(term2409, term2409.getClass(), "eventCache", null);
        setBooleanField(term2409, term2409.getClass(), "coalescingEnabled", false);
        setBooleanField(term2409, term2409.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2409, term2409.getClass(), "componentSerializedDataVersion", 0);
        setField(term2409, term2409.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.buttons.IconButton");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDisabledImage", argTypes, term2409, args);
    }

};


