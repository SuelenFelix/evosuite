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

public class IconButton_getPressedImage_17442744421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2224;

    public IconButton_getPressedImage_17442744421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2224 = newInstance(Class.forName("org.openRealmOfStars.gui.buttons.IconButton"));
        setField(term2224, term2224.getClass(), "notPressedImage", null);
        setField(term2224, term2224.getClass(), "pressedImage", null);
        setField(term2224, term2224.getClass(), "disabledImage", null);
        setField(term2224, term2224.getClass(), "rollOverImage", null);
        setBooleanField(term2224, term2224.getClass(), "border", false);
        setField(term2224, term2224.getClass(), "parent", null);
        setField(term2224, term2224.getClass(), "model", null);
        setField(term2224, term2224.getClass(), "text", null);
        setField(term2224, term2224.getClass(), "margin", null);
        setField(term2224, term2224.getClass(), "defaultMargin", null);
        setField(term2224, term2224.getClass(), "defaultIcon", null);
        setField(term2224, term2224.getClass(), "pressedIcon", null);
        setField(term2224, term2224.getClass(), "disabledIcon", null);
        setField(term2224, term2224.getClass(), "selectedIcon", null);
        setField(term2224, term2224.getClass(), "disabledSelectedIcon", null);
        setField(term2224, term2224.getClass(), "rolloverIcon", null);
        setField(term2224, term2224.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term2224, term2224.getClass(), "paintBorder", false);
        setBooleanField(term2224, term2224.getClass(), "paintFocus", false);
        setBooleanField(term2224, term2224.getClass(), "rolloverEnabled", false);
        setBooleanField(term2224, term2224.getClass(), "contentAreaFilled", false);
        setIntField(term2224, term2224.getClass(), "verticalAlignment", 0);
        setIntField(term2224, term2224.getClass(), "horizontalAlignment", 0);
        setIntField(term2224, term2224.getClass(), "verticalTextPosition", 0);
        setIntField(term2224, term2224.getClass(), "horizontalTextPosition", 0);
        setIntField(term2224, term2224.getClass(), "iconTextGap", 0);
        setIntField(term2224, term2224.getClass(), "mnemonic", 0);
        setIntField(term2224, term2224.getClass(), "mnemonicIndex", 0);
        setLongField(term2224, term2224.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term2224, term2224.getClass(), "borderPaintedSet", false);
        setBooleanField(term2224, term2224.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term2224, term2224.getClass(), "iconTextGapSet", false);
        setBooleanField(term2224, term2224.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term2224, term2224.getClass(), "setLayout", false);
        setBooleanField(term2224, term2224.getClass(), "defaultCapable", false);
        setField(term2224, term2224.getClass(), "handler", null);
        setField(term2224, term2224.getClass(), "changeListener", null);
        setField(term2224, term2224.getClass(), "actionListener", null);
        setField(term2224, term2224.getClass(), "itemListener", null);
        setField(term2224, term2224.getClass(), "changeEvent", null);
        setBooleanField(term2224, term2224.getClass(), "hideActionText", false);
        setField(term2224, term2224.getClass(), "action", null);
        setField(term2224, term2224.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term2224, term2224.getClass(), "isAlignmentXSet", false);
        setFloatField(term2224, term2224.getClass(), "alignmentX", 0.0F);
        setBooleanField(term2224, term2224.getClass(), "isAlignmentYSet", false);
        setFloatField(term2224, term2224.getClass(), "alignmentY", 0.0F);
        setField(term2224, term2224.getClass(), "ui", null);
        setField(term2224, term2224.getClass(), "listenerList", null);
        setField(term2224, term2224.getClass(), "clientProperties", null);
        setField(term2224, term2224.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term2224, term2224.getClass(), "autoscrolls", false);
        setField(term2224, term2224.getClass(), "border", null);
        setIntField(term2224, term2224.getClass(), "flags", 0);
        setField(term2224, term2224.getClass(), "inputVerifier", null);
        setBooleanField(term2224, term2224.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term2224, term2224.getClass(), "paintingChild", null);
        setField(term2224, term2224.getClass(), "popupMenu", null);
        setField(term2224, term2224.getClass(), "revalidateRunnableScheduled", null);
        setField(term2224, term2224.getClass(), "focusInputMap", null);
        setField(term2224, term2224.getClass(), "ancestorInputMap", null);
        setField(term2224, term2224.getClass(), "windowInputMap", null);
        setField(term2224, term2224.getClass(), "actionMap", null);
        setField(term2224, term2224.getClass(), "aaHint", null);
        setField(term2224, term2224.getClass(), "lcdRenderingHint", null);
        setField(term2224, term2224.getClass(), "component", null);
        setField(term2224, term2224.getClass(), "layoutMgr", null);
        setField(term2224, term2224.getClass(), "dispatcher", null);
        setField(term2224, term2224.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2224, term2224.getClass(), "focusCycleRoot", false);
        setBooleanField(term2224, term2224.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2224, term2224.getClass(), "printingThreads", null);
        setBooleanField(term2224, term2224.getClass(), "printing", false);
        setField(term2224, term2224.getClass(), "containerListener", null);
        setIntField(term2224, term2224.getClass(), "listeningChildren", 0);
        setIntField(term2224, term2224.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2224, term2224.getClass(), "descendantsCount", 0);
        setField(term2224, term2224.getClass(), "preserveBackgroundColor", null);
        setIntField(term2224, term2224.getClass(), "numOfHWComponents", 0);
        setIntField(term2224, term2224.getClass(), "numOfLWComponents", 0);
        setField(term2224, term2224.getClass(), "modalComp", null);
        setField(term2224, term2224.getClass(), "modalAppContext", null);
        setIntField(term2224, term2224.getClass(), "containerSerializedDataVersion", 0);
        setField(term2224, term2224.getClass(), "peer", null);
        setField(term2224, term2224.getClass(), "parent", null);
        setField(term2224, term2224.getClass(), "appContext", null);
        setIntField(term2224, term2224.getClass(), "x", 0);
        setIntField(term2224, term2224.getClass(), "y", 0);
        setIntField(term2224, term2224.getClass(), "width", 0);
        setIntField(term2224, term2224.getClass(), "height", 0);
        setField(term2224, term2224.getClass(), "foreground", null);
        setField(term2224, term2224.getClass(), "background", null);
        setField(term2224, term2224.getClass(), "font", null);
        setField(term2224, term2224.getClass(), "peerFont", null);
        setField(term2224, term2224.getClass(), "cursor", null);
        setField(term2224, term2224.getClass(), "locale", null);
        setField(term2224, term2224.getClass(), "graphicsConfig", null);
        setField(term2224, term2224.getClass(), "bufferStrategy", null);
        setBooleanField(term2224, term2224.getClass(), "ignoreRepaint", false);
        setBooleanField(term2224, term2224.getClass(), "visible", false);
        setBooleanField(term2224, term2224.getClass(), "enabled", false);
        setBooleanField(term2224, term2224.getClass(), "valid", false);
        setField(term2224, term2224.getClass(), "dropTarget", null);
        setField(term2224, term2224.getClass(), "popups", null);
        setField(term2224, term2224.getClass(), "name", null);
        setBooleanField(term2224, term2224.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2224, term2224.getClass(), "focusable", false);
        setIntField(term2224, term2224.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2224, term2224.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2224, term2224.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2224, term2224.getClass(), "acc", null);
        setField(term2224, term2224.getClass(), "minSize", null);
        setBooleanField(term2224, term2224.getClass(), "minSizeSet", false);
        setField(term2224, term2224.getClass(), "prefSize", null);
        setBooleanField(term2224, term2224.getClass(), "prefSizeSet", false);
        setField(term2224, term2224.getClass(), "maxSize", null);
        setBooleanField(term2224, term2224.getClass(), "maxSizeSet", false);
        setField(term2224, term2224.getClass(), "componentOrientation", null);
        setBooleanField(term2224, term2224.getClass(), "newEventsOnly", false);
        setField(term2224, term2224.getClass(), "componentListener", null);
        setField(term2224, term2224.getClass(), "focusListener", null);
        setField(term2224, term2224.getClass(), "hierarchyListener", null);
        setField(term2224, term2224.getClass(), "hierarchyBoundsListener", null);
        setField(term2224, term2224.getClass(), "keyListener", null);
        setField(term2224, term2224.getClass(), "mouseListener", null);
        setField(term2224, term2224.getClass(), "mouseMotionListener", null);
        setField(term2224, term2224.getClass(), "mouseWheelListener", null);
        setField(term2224, term2224.getClass(), "inputMethodListener", null);
        setLongField(term2224, term2224.getClass(), "eventMask", 0L);
        setField(term2224, term2224.getClass(), "changeSupport", null);
        setField(term2224, term2224.getClass(), "objectLock", null);
        setBooleanField(term2224, term2224.getClass(), "isPacked", false);
        setIntField(term2224, term2224.getClass(), "boundsOp", 0);
        setField(term2224, term2224.getClass(), "compoundShape", null);
        setField(term2224, term2224.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2224, term2224.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2224, term2224.getClass(), "backgroundEraseDisabled", false);
        setField(term2224, term2224.getClass(), "eventCache", null);
        setBooleanField(term2224, term2224.getClass(), "coalescingEnabled", false);
        setBooleanField(term2224, term2224.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2224, term2224.getClass(), "componentSerializedDataVersion", 0);
        setField(term2224, term2224.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.buttons.IconButton");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPressedImage", argTypes, term2224, args);
    }

};


