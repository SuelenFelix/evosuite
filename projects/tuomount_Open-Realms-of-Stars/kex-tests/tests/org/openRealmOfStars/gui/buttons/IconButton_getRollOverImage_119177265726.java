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

public class IconButton_getRollOverImage_119177265726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2531;

    public IconButton_getRollOverImage_119177265726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2531 = newInstance(Class.forName("org.openRealmOfStars.gui.buttons.IconButton"));
        setField(term2531, term2531.getClass(), "notPressedImage", null);
        setField(term2531, term2531.getClass(), "pressedImage", null);
        setField(term2531, term2531.getClass(), "disabledImage", null);
        setField(term2531, term2531.getClass(), "rollOverImage", null);
        setBooleanField(term2531, term2531.getClass(), "border", false);
        setField(term2531, term2531.getClass(), "parent", null);
        setField(term2531, term2531.getClass(), "model", null);
        setField(term2531, term2531.getClass(), "text", null);
        setField(term2531, term2531.getClass(), "margin", null);
        setField(term2531, term2531.getClass(), "defaultMargin", null);
        setField(term2531, term2531.getClass(), "defaultIcon", null);
        setField(term2531, term2531.getClass(), "pressedIcon", null);
        setField(term2531, term2531.getClass(), "disabledIcon", null);
        setField(term2531, term2531.getClass(), "selectedIcon", null);
        setField(term2531, term2531.getClass(), "disabledSelectedIcon", null);
        setField(term2531, term2531.getClass(), "rolloverIcon", null);
        setField(term2531, term2531.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term2531, term2531.getClass(), "paintBorder", false);
        setBooleanField(term2531, term2531.getClass(), "paintFocus", false);
        setBooleanField(term2531, term2531.getClass(), "rolloverEnabled", false);
        setBooleanField(term2531, term2531.getClass(), "contentAreaFilled", false);
        setIntField(term2531, term2531.getClass(), "verticalAlignment", 0);
        setIntField(term2531, term2531.getClass(), "horizontalAlignment", 0);
        setIntField(term2531, term2531.getClass(), "verticalTextPosition", 0);
        setIntField(term2531, term2531.getClass(), "horizontalTextPosition", 0);
        setIntField(term2531, term2531.getClass(), "iconTextGap", 0);
        setIntField(term2531, term2531.getClass(), "mnemonic", 0);
        setIntField(term2531, term2531.getClass(), "mnemonicIndex", 0);
        setLongField(term2531, term2531.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term2531, term2531.getClass(), "borderPaintedSet", false);
        setBooleanField(term2531, term2531.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term2531, term2531.getClass(), "iconTextGapSet", false);
        setBooleanField(term2531, term2531.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term2531, term2531.getClass(), "setLayout", false);
        setBooleanField(term2531, term2531.getClass(), "defaultCapable", false);
        setField(term2531, term2531.getClass(), "handler", null);
        setField(term2531, term2531.getClass(), "changeListener", null);
        setField(term2531, term2531.getClass(), "actionListener", null);
        setField(term2531, term2531.getClass(), "itemListener", null);
        setField(term2531, term2531.getClass(), "changeEvent", null);
        setBooleanField(term2531, term2531.getClass(), "hideActionText", false);
        setField(term2531, term2531.getClass(), "action", null);
        setField(term2531, term2531.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term2531, term2531.getClass(), "isAlignmentXSet", false);
        setFloatField(term2531, term2531.getClass(), "alignmentX", 0.0F);
        setBooleanField(term2531, term2531.getClass(), "isAlignmentYSet", false);
        setFloatField(term2531, term2531.getClass(), "alignmentY", 0.0F);
        setField(term2531, term2531.getClass(), "ui", null);
        setField(term2531, term2531.getClass(), "listenerList", null);
        setField(term2531, term2531.getClass(), "clientProperties", null);
        setField(term2531, term2531.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term2531, term2531.getClass(), "autoscrolls", false);
        setField(term2531, term2531.getClass(), "border", null);
        setIntField(term2531, term2531.getClass(), "flags", 0);
        setField(term2531, term2531.getClass(), "inputVerifier", null);
        setBooleanField(term2531, term2531.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term2531, term2531.getClass(), "paintingChild", null);
        setField(term2531, term2531.getClass(), "popupMenu", null);
        setField(term2531, term2531.getClass(), "revalidateRunnableScheduled", null);
        setField(term2531, term2531.getClass(), "focusInputMap", null);
        setField(term2531, term2531.getClass(), "ancestorInputMap", null);
        setField(term2531, term2531.getClass(), "windowInputMap", null);
        setField(term2531, term2531.getClass(), "actionMap", null);
        setField(term2531, term2531.getClass(), "aaHint", null);
        setField(term2531, term2531.getClass(), "lcdRenderingHint", null);
        setField(term2531, term2531.getClass(), "component", null);
        setField(term2531, term2531.getClass(), "layoutMgr", null);
        setField(term2531, term2531.getClass(), "dispatcher", null);
        setField(term2531, term2531.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2531, term2531.getClass(), "focusCycleRoot", false);
        setBooleanField(term2531, term2531.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2531, term2531.getClass(), "printingThreads", null);
        setBooleanField(term2531, term2531.getClass(), "printing", false);
        setField(term2531, term2531.getClass(), "containerListener", null);
        setIntField(term2531, term2531.getClass(), "listeningChildren", 0);
        setIntField(term2531, term2531.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2531, term2531.getClass(), "descendantsCount", 0);
        setField(term2531, term2531.getClass(), "preserveBackgroundColor", null);
        setIntField(term2531, term2531.getClass(), "numOfHWComponents", 0);
        setIntField(term2531, term2531.getClass(), "numOfLWComponents", 0);
        setField(term2531, term2531.getClass(), "modalComp", null);
        setField(term2531, term2531.getClass(), "modalAppContext", null);
        setIntField(term2531, term2531.getClass(), "containerSerializedDataVersion", 0);
        setField(term2531, term2531.getClass(), "peer", null);
        setField(term2531, term2531.getClass(), "parent", null);
        setField(term2531, term2531.getClass(), "appContext", null);
        setIntField(term2531, term2531.getClass(), "x", 0);
        setIntField(term2531, term2531.getClass(), "y", 0);
        setIntField(term2531, term2531.getClass(), "width", 0);
        setIntField(term2531, term2531.getClass(), "height", 0);
        setField(term2531, term2531.getClass(), "foreground", null);
        setField(term2531, term2531.getClass(), "background", null);
        setField(term2531, term2531.getClass(), "font", null);
        setField(term2531, term2531.getClass(), "peerFont", null);
        setField(term2531, term2531.getClass(), "cursor", null);
        setField(term2531, term2531.getClass(), "locale", null);
        setField(term2531, term2531.getClass(), "graphicsConfig", null);
        setField(term2531, term2531.getClass(), "bufferStrategy", null);
        setBooleanField(term2531, term2531.getClass(), "ignoreRepaint", false);
        setBooleanField(term2531, term2531.getClass(), "visible", false);
        setBooleanField(term2531, term2531.getClass(), "enabled", false);
        setBooleanField(term2531, term2531.getClass(), "valid", false);
        setField(term2531, term2531.getClass(), "dropTarget", null);
        setField(term2531, term2531.getClass(), "popups", null);
        setField(term2531, term2531.getClass(), "name", null);
        setBooleanField(term2531, term2531.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2531, term2531.getClass(), "focusable", false);
        setIntField(term2531, term2531.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2531, term2531.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2531, term2531.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2531, term2531.getClass(), "acc", null);
        setField(term2531, term2531.getClass(), "minSize", null);
        setBooleanField(term2531, term2531.getClass(), "minSizeSet", false);
        setField(term2531, term2531.getClass(), "prefSize", null);
        setBooleanField(term2531, term2531.getClass(), "prefSizeSet", false);
        setField(term2531, term2531.getClass(), "maxSize", null);
        setBooleanField(term2531, term2531.getClass(), "maxSizeSet", false);
        setField(term2531, term2531.getClass(), "componentOrientation", null);
        setBooleanField(term2531, term2531.getClass(), "newEventsOnly", false);
        setField(term2531, term2531.getClass(), "componentListener", null);
        setField(term2531, term2531.getClass(), "focusListener", null);
        setField(term2531, term2531.getClass(), "hierarchyListener", null);
        setField(term2531, term2531.getClass(), "hierarchyBoundsListener", null);
        setField(term2531, term2531.getClass(), "keyListener", null);
        setField(term2531, term2531.getClass(), "mouseListener", null);
        setField(term2531, term2531.getClass(), "mouseMotionListener", null);
        setField(term2531, term2531.getClass(), "mouseWheelListener", null);
        setField(term2531, term2531.getClass(), "inputMethodListener", null);
        setLongField(term2531, term2531.getClass(), "eventMask", 0L);
        setField(term2531, term2531.getClass(), "changeSupport", null);
        setField(term2531, term2531.getClass(), "objectLock", null);
        setBooleanField(term2531, term2531.getClass(), "isPacked", false);
        setIntField(term2531, term2531.getClass(), "boundsOp", 0);
        setField(term2531, term2531.getClass(), "compoundShape", null);
        setField(term2531, term2531.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2531, term2531.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2531, term2531.getClass(), "backgroundEraseDisabled", false);
        setField(term2531, term2531.getClass(), "eventCache", null);
        setBooleanField(term2531, term2531.getClass(), "coalescingEnabled", false);
        setBooleanField(term2531, term2531.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2531, term2531.getClass(), "componentSerializedDataVersion", 0);
        setField(term2531, term2531.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.buttons.IconButton");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRollOverImage", argTypes, term2531, args);
    }

};


