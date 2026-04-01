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

public class SpaceCheckBox_setSpaceIcon_1577427718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20362;

    public SpaceCheckBox_setSpaceIcon_1577427718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20362 = newInstance(Class.forName("org.openRealmOfStars.gui.buttons.SpaceCheckBox"));
        setField(term20362, term20362.getClass(), "icon", null);
        setIntField(term20362, term20362.getClass(), "type", 0);
        setBooleanField(term20362, term20362.getClass(), "flat", false);
        setField(term20362, term20362.getClass(), "model", null);
        setField(term20362, term20362.getClass(), "text", null);
        setField(term20362, term20362.getClass(), "margin", null);
        setField(term20362, term20362.getClass(), "defaultMargin", null);
        setField(term20362, term20362.getClass(), "defaultIcon", null);
        setField(term20362, term20362.getClass(), "pressedIcon", null);
        setField(term20362, term20362.getClass(), "disabledIcon", null);
        setField(term20362, term20362.getClass(), "selectedIcon", null);
        setField(term20362, term20362.getClass(), "disabledSelectedIcon", null);
        setField(term20362, term20362.getClass(), "rolloverIcon", null);
        setField(term20362, term20362.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term20362, term20362.getClass(), "paintBorder", false);
        setBooleanField(term20362, term20362.getClass(), "paintFocus", false);
        setBooleanField(term20362, term20362.getClass(), "rolloverEnabled", false);
        setBooleanField(term20362, term20362.getClass(), "contentAreaFilled", false);
        setIntField(term20362, term20362.getClass(), "verticalAlignment", 0);
        setIntField(term20362, term20362.getClass(), "horizontalAlignment", 0);
        setIntField(term20362, term20362.getClass(), "verticalTextPosition", 0);
        setIntField(term20362, term20362.getClass(), "horizontalTextPosition", 0);
        setIntField(term20362, term20362.getClass(), "iconTextGap", 0);
        setIntField(term20362, term20362.getClass(), "mnemonic", 0);
        setIntField(term20362, term20362.getClass(), "mnemonicIndex", 0);
        setLongField(term20362, term20362.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term20362, term20362.getClass(), "borderPaintedSet", false);
        setBooleanField(term20362, term20362.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term20362, term20362.getClass(), "iconTextGapSet", false);
        setBooleanField(term20362, term20362.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term20362, term20362.getClass(), "setLayout", false);
        setBooleanField(term20362, term20362.getClass(), "defaultCapable", false);
        setField(term20362, term20362.getClass(), "handler", null);
        setField(term20362, term20362.getClass(), "changeListener", null);
        setField(term20362, term20362.getClass(), "actionListener", null);
        setField(term20362, term20362.getClass(), "itemListener", null);
        setField(term20362, term20362.getClass(), "changeEvent", null);
        setBooleanField(term20362, term20362.getClass(), "hideActionText", false);
        setField(term20362, term20362.getClass(), "action", null);
        setField(term20362, term20362.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term20362, term20362.getClass(), "isAlignmentXSet", false);
        setFloatField(term20362, term20362.getClass(), "alignmentX", 0.0F);
        setBooleanField(term20362, term20362.getClass(), "isAlignmentYSet", false);
        setFloatField(term20362, term20362.getClass(), "alignmentY", 0.0F);
        setField(term20362, term20362.getClass(), "ui", null);
        setField(term20362, term20362.getClass(), "listenerList", null);
        setField(term20362, term20362.getClass(), "clientProperties", null);
        setField(term20362, term20362.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term20362, term20362.getClass(), "autoscrolls", false);
        setField(term20362, term20362.getClass(), "border", null);
        setIntField(term20362, term20362.getClass(), "flags", 0);
        setField(term20362, term20362.getClass(), "inputVerifier", null);
        setBooleanField(term20362, term20362.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term20362, term20362.getClass(), "paintingChild", null);
        setField(term20362, term20362.getClass(), "popupMenu", null);
        setField(term20362, term20362.getClass(), "revalidateRunnableScheduled", null);
        setField(term20362, term20362.getClass(), "focusInputMap", null);
        setField(term20362, term20362.getClass(), "ancestorInputMap", null);
        setField(term20362, term20362.getClass(), "windowInputMap", null);
        setField(term20362, term20362.getClass(), "actionMap", null);
        setField(term20362, term20362.getClass(), "aaHint", null);
        setField(term20362, term20362.getClass(), "lcdRenderingHint", null);
        setField(term20362, term20362.getClass(), "component", null);
        setField(term20362, term20362.getClass(), "layoutMgr", null);
        setField(term20362, term20362.getClass(), "dispatcher", null);
        setField(term20362, term20362.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term20362, term20362.getClass(), "focusCycleRoot", false);
        setBooleanField(term20362, term20362.getClass(), "focusTraversalPolicyProvider", false);
        setField(term20362, term20362.getClass(), "printingThreads", null);
        setBooleanField(term20362, term20362.getClass(), "printing", false);
        setField(term20362, term20362.getClass(), "containerListener", null);
        setIntField(term20362, term20362.getClass(), "listeningChildren", 0);
        setIntField(term20362, term20362.getClass(), "listeningBoundsChildren", 0);
        setIntField(term20362, term20362.getClass(), "descendantsCount", 0);
        setField(term20362, term20362.getClass(), "preserveBackgroundColor", null);
        setIntField(term20362, term20362.getClass(), "numOfHWComponents", 0);
        setIntField(term20362, term20362.getClass(), "numOfLWComponents", 0);
        setField(term20362, term20362.getClass(), "modalComp", null);
        setField(term20362, term20362.getClass(), "modalAppContext", null);
        setIntField(term20362, term20362.getClass(), "containerSerializedDataVersion", 0);
        setField(term20362, term20362.getClass(), "peer", null);
        setField(term20362, term20362.getClass(), "parent", null);
        setField(term20362, term20362.getClass(), "appContext", null);
        setIntField(term20362, term20362.getClass(), "x", 0);
        setIntField(term20362, term20362.getClass(), "y", 0);
        setIntField(term20362, term20362.getClass(), "width", 0);
        setIntField(term20362, term20362.getClass(), "height", 0);
        setField(term20362, term20362.getClass(), "foreground", null);
        setField(term20362, term20362.getClass(), "background", null);
        setField(term20362, term20362.getClass(), "font", null);
        setField(term20362, term20362.getClass(), "peerFont", null);
        setField(term20362, term20362.getClass(), "cursor", null);
        setField(term20362, term20362.getClass(), "locale", null);
        setField(term20362, term20362.getClass(), "graphicsConfig", null);
        setField(term20362, term20362.getClass(), "bufferStrategy", null);
        setBooleanField(term20362, term20362.getClass(), "ignoreRepaint", false);
        setBooleanField(term20362, term20362.getClass(), "visible", false);
        setBooleanField(term20362, term20362.getClass(), "enabled", false);
        setBooleanField(term20362, term20362.getClass(), "valid", false);
        setField(term20362, term20362.getClass(), "dropTarget", null);
        setField(term20362, term20362.getClass(), "popups", null);
        setField(term20362, term20362.getClass(), "name", null);
        setBooleanField(term20362, term20362.getClass(), "nameExplicitlySet", false);
        setBooleanField(term20362, term20362.getClass(), "focusable", false);
        setIntField(term20362, term20362.getClass(), "isFocusTraversableOverridden", 0);
        setField(term20362, term20362.getClass(), "focusTraversalKeys", null);
        setBooleanField(term20362, term20362.getClass(), "focusTraversalKeysEnabled", false);
        setField(term20362, term20362.getClass(), "acc", null);
        setField(term20362, term20362.getClass(), "minSize", null);
        setBooleanField(term20362, term20362.getClass(), "minSizeSet", false);
        setField(term20362, term20362.getClass(), "prefSize", null);
        setBooleanField(term20362, term20362.getClass(), "prefSizeSet", false);
        setField(term20362, term20362.getClass(), "maxSize", null);
        setBooleanField(term20362, term20362.getClass(), "maxSizeSet", false);
        setField(term20362, term20362.getClass(), "componentOrientation", null);
        setBooleanField(term20362, term20362.getClass(), "newEventsOnly", false);
        setField(term20362, term20362.getClass(), "componentListener", null);
        setField(term20362, term20362.getClass(), "focusListener", null);
        setField(term20362, term20362.getClass(), "hierarchyListener", null);
        setField(term20362, term20362.getClass(), "hierarchyBoundsListener", null);
        setField(term20362, term20362.getClass(), "keyListener", null);
        setField(term20362, term20362.getClass(), "mouseListener", null);
        setField(term20362, term20362.getClass(), "mouseMotionListener", null);
        setField(term20362, term20362.getClass(), "mouseWheelListener", null);
        setField(term20362, term20362.getClass(), "inputMethodListener", null);
        setLongField(term20362, term20362.getClass(), "eventMask", 0L);
        setField(term20362, term20362.getClass(), "changeSupport", null);
        setField(term20362, term20362.getClass(), "objectLock", null);
        setBooleanField(term20362, term20362.getClass(), "isPacked", false);
        setIntField(term20362, term20362.getClass(), "boundsOp", 0);
        setField(term20362, term20362.getClass(), "compoundShape", null);
        setField(term20362, term20362.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term20362, term20362.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term20362, term20362.getClass(), "backgroundEraseDisabled", false);
        setField(term20362, term20362.getClass(), "eventCache", null);
        setBooleanField(term20362, term20362.getClass(), "coalescingEnabled", false);
        setBooleanField(term20362, term20362.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term20362, term20362.getClass(), "componentSerializedDataVersion", 0);
        setField(term20362, term20362.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.buttons.SpaceCheckBox");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.gui.icons.Icon16x16");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSpaceIcon", argTypes, term20362, args);
    }

};


