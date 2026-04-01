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

public class SpaceButton_setSpaceIcon_14771651167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3391;

    public SpaceButton_setSpaceIcon_14771651167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3391 = newInstance(Class.forName("org.openRealmOfStars.gui.buttons.SpaceButton"));
        setField(term3391, term3391.getClass(), "icon", null);
        setField(term3391, term3391.getClass(), "model", null);
        setField(term3391, term3391.getClass(), "text", null);
        setField(term3391, term3391.getClass(), "margin", null);
        setField(term3391, term3391.getClass(), "defaultMargin", null);
        setField(term3391, term3391.getClass(), "defaultIcon", null);
        setField(term3391, term3391.getClass(), "pressedIcon", null);
        setField(term3391, term3391.getClass(), "disabledIcon", null);
        setField(term3391, term3391.getClass(), "selectedIcon", null);
        setField(term3391, term3391.getClass(), "disabledSelectedIcon", null);
        setField(term3391, term3391.getClass(), "rolloverIcon", null);
        setField(term3391, term3391.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term3391, term3391.getClass(), "paintBorder", false);
        setBooleanField(term3391, term3391.getClass(), "paintFocus", false);
        setBooleanField(term3391, term3391.getClass(), "rolloverEnabled", false);
        setBooleanField(term3391, term3391.getClass(), "contentAreaFilled", false);
        setIntField(term3391, term3391.getClass(), "verticalAlignment", 0);
        setIntField(term3391, term3391.getClass(), "horizontalAlignment", 0);
        setIntField(term3391, term3391.getClass(), "verticalTextPosition", 0);
        setIntField(term3391, term3391.getClass(), "horizontalTextPosition", 0);
        setIntField(term3391, term3391.getClass(), "iconTextGap", 0);
        setIntField(term3391, term3391.getClass(), "mnemonic", 0);
        setIntField(term3391, term3391.getClass(), "mnemonicIndex", 0);
        setLongField(term3391, term3391.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term3391, term3391.getClass(), "borderPaintedSet", false);
        setBooleanField(term3391, term3391.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term3391, term3391.getClass(), "iconTextGapSet", false);
        setBooleanField(term3391, term3391.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term3391, term3391.getClass(), "setLayout", false);
        setBooleanField(term3391, term3391.getClass(), "defaultCapable", false);
        setField(term3391, term3391.getClass(), "handler", null);
        setField(term3391, term3391.getClass(), "changeListener", null);
        setField(term3391, term3391.getClass(), "actionListener", null);
        setField(term3391, term3391.getClass(), "itemListener", null);
        setField(term3391, term3391.getClass(), "changeEvent", null);
        setBooleanField(term3391, term3391.getClass(), "hideActionText", false);
        setField(term3391, term3391.getClass(), "action", null);
        setField(term3391, term3391.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term3391, term3391.getClass(), "isAlignmentXSet", false);
        setFloatField(term3391, term3391.getClass(), "alignmentX", 0.0F);
        setBooleanField(term3391, term3391.getClass(), "isAlignmentYSet", false);
        setFloatField(term3391, term3391.getClass(), "alignmentY", 0.0F);
        setField(term3391, term3391.getClass(), "ui", null);
        setField(term3391, term3391.getClass(), "listenerList", null);
        setField(term3391, term3391.getClass(), "clientProperties", null);
        setField(term3391, term3391.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term3391, term3391.getClass(), "autoscrolls", false);
        setField(term3391, term3391.getClass(), "border", null);
        setIntField(term3391, term3391.getClass(), "flags", 0);
        setField(term3391, term3391.getClass(), "inputVerifier", null);
        setBooleanField(term3391, term3391.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term3391, term3391.getClass(), "paintingChild", null);
        setField(term3391, term3391.getClass(), "popupMenu", null);
        setField(term3391, term3391.getClass(), "revalidateRunnableScheduled", null);
        setField(term3391, term3391.getClass(), "focusInputMap", null);
        setField(term3391, term3391.getClass(), "ancestorInputMap", null);
        setField(term3391, term3391.getClass(), "windowInputMap", null);
        setField(term3391, term3391.getClass(), "actionMap", null);
        setField(term3391, term3391.getClass(), "aaHint", null);
        setField(term3391, term3391.getClass(), "lcdRenderingHint", null);
        setField(term3391, term3391.getClass(), "component", null);
        setField(term3391, term3391.getClass(), "layoutMgr", null);
        setField(term3391, term3391.getClass(), "dispatcher", null);
        setField(term3391, term3391.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term3391, term3391.getClass(), "focusCycleRoot", false);
        setBooleanField(term3391, term3391.getClass(), "focusTraversalPolicyProvider", false);
        setField(term3391, term3391.getClass(), "printingThreads", null);
        setBooleanField(term3391, term3391.getClass(), "printing", false);
        setField(term3391, term3391.getClass(), "containerListener", null);
        setIntField(term3391, term3391.getClass(), "listeningChildren", 0);
        setIntField(term3391, term3391.getClass(), "listeningBoundsChildren", 0);
        setIntField(term3391, term3391.getClass(), "descendantsCount", 0);
        setField(term3391, term3391.getClass(), "preserveBackgroundColor", null);
        setIntField(term3391, term3391.getClass(), "numOfHWComponents", 0);
        setIntField(term3391, term3391.getClass(), "numOfLWComponents", 0);
        setField(term3391, term3391.getClass(), "modalComp", null);
        setField(term3391, term3391.getClass(), "modalAppContext", null);
        setIntField(term3391, term3391.getClass(), "containerSerializedDataVersion", 0);
        setField(term3391, term3391.getClass(), "peer", null);
        setField(term3391, term3391.getClass(), "parent", null);
        setField(term3391, term3391.getClass(), "appContext", null);
        setIntField(term3391, term3391.getClass(), "x", 0);
        setIntField(term3391, term3391.getClass(), "y", 0);
        setIntField(term3391, term3391.getClass(), "width", 0);
        setIntField(term3391, term3391.getClass(), "height", 0);
        setField(term3391, term3391.getClass(), "foreground", null);
        setField(term3391, term3391.getClass(), "background", null);
        setField(term3391, term3391.getClass(), "font", null);
        setField(term3391, term3391.getClass(), "peerFont", null);
        setField(term3391, term3391.getClass(), "cursor", null);
        setField(term3391, term3391.getClass(), "locale", null);
        setField(term3391, term3391.getClass(), "graphicsConfig", null);
        setField(term3391, term3391.getClass(), "bufferStrategy", null);
        setBooleanField(term3391, term3391.getClass(), "ignoreRepaint", false);
        setBooleanField(term3391, term3391.getClass(), "visible", false);
        setBooleanField(term3391, term3391.getClass(), "enabled", false);
        setBooleanField(term3391, term3391.getClass(), "valid", false);
        setField(term3391, term3391.getClass(), "dropTarget", null);
        setField(term3391, term3391.getClass(), "popups", null);
        setField(term3391, term3391.getClass(), "name", null);
        setBooleanField(term3391, term3391.getClass(), "nameExplicitlySet", false);
        setBooleanField(term3391, term3391.getClass(), "focusable", false);
        setIntField(term3391, term3391.getClass(), "isFocusTraversableOverridden", 0);
        setField(term3391, term3391.getClass(), "focusTraversalKeys", null);
        setBooleanField(term3391, term3391.getClass(), "focusTraversalKeysEnabled", false);
        setField(term3391, term3391.getClass(), "acc", null);
        setField(term3391, term3391.getClass(), "minSize", null);
        setBooleanField(term3391, term3391.getClass(), "minSizeSet", false);
        setField(term3391, term3391.getClass(), "prefSize", null);
        setBooleanField(term3391, term3391.getClass(), "prefSizeSet", false);
        setField(term3391, term3391.getClass(), "maxSize", null);
        setBooleanField(term3391, term3391.getClass(), "maxSizeSet", false);
        setField(term3391, term3391.getClass(), "componentOrientation", null);
        setBooleanField(term3391, term3391.getClass(), "newEventsOnly", false);
        setField(term3391, term3391.getClass(), "componentListener", null);
        setField(term3391, term3391.getClass(), "focusListener", null);
        setField(term3391, term3391.getClass(), "hierarchyListener", null);
        setField(term3391, term3391.getClass(), "hierarchyBoundsListener", null);
        setField(term3391, term3391.getClass(), "keyListener", null);
        setField(term3391, term3391.getClass(), "mouseListener", null);
        setField(term3391, term3391.getClass(), "mouseMotionListener", null);
        setField(term3391, term3391.getClass(), "mouseWheelListener", null);
        setField(term3391, term3391.getClass(), "inputMethodListener", null);
        setLongField(term3391, term3391.getClass(), "eventMask", 0L);
        setField(term3391, term3391.getClass(), "changeSupport", null);
        setField(term3391, term3391.getClass(), "objectLock", null);
        setBooleanField(term3391, term3391.getClass(), "isPacked", false);
        setIntField(term3391, term3391.getClass(), "boundsOp", 0);
        setField(term3391, term3391.getClass(), "compoundShape", null);
        setField(term3391, term3391.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term3391, term3391.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term3391, term3391.getClass(), "backgroundEraseDisabled", false);
        setField(term3391, term3391.getClass(), "eventCache", null);
        setBooleanField(term3391, term3391.getClass(), "coalescingEnabled", false);
        setBooleanField(term3391, term3391.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term3391, term3391.getClass(), "componentSerializedDataVersion", 0);
        setField(term3391, term3391.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.buttons.SpaceButton");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.gui.icons.Icon16x16");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSpaceIcon", argTypes, term3391, args);
    }

};


