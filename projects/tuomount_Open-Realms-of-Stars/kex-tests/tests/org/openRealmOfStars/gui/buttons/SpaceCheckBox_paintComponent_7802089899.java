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

public class SpaceCheckBox_paintComponent_7802089899 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20424;

    public SpaceCheckBox_paintComponent_7802089899() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20424 = newInstance(Class.forName("org.openRealmOfStars.gui.buttons.SpaceCheckBox"));
        setField(term20424, term20424.getClass(), "icon", null);
        setIntField(term20424, term20424.getClass(), "type", 0);
        setBooleanField(term20424, term20424.getClass(), "flat", false);
        setField(term20424, term20424.getClass(), "model", null);
        setField(term20424, term20424.getClass(), "text", null);
        setField(term20424, term20424.getClass(), "margin", null);
        setField(term20424, term20424.getClass(), "defaultMargin", null);
        setField(term20424, term20424.getClass(), "defaultIcon", null);
        setField(term20424, term20424.getClass(), "pressedIcon", null);
        setField(term20424, term20424.getClass(), "disabledIcon", null);
        setField(term20424, term20424.getClass(), "selectedIcon", null);
        setField(term20424, term20424.getClass(), "disabledSelectedIcon", null);
        setField(term20424, term20424.getClass(), "rolloverIcon", null);
        setField(term20424, term20424.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term20424, term20424.getClass(), "paintBorder", false);
        setBooleanField(term20424, term20424.getClass(), "paintFocus", false);
        setBooleanField(term20424, term20424.getClass(), "rolloverEnabled", false);
        setBooleanField(term20424, term20424.getClass(), "contentAreaFilled", false);
        setIntField(term20424, term20424.getClass(), "verticalAlignment", 0);
        setIntField(term20424, term20424.getClass(), "horizontalAlignment", 0);
        setIntField(term20424, term20424.getClass(), "verticalTextPosition", 0);
        setIntField(term20424, term20424.getClass(), "horizontalTextPosition", 0);
        setIntField(term20424, term20424.getClass(), "iconTextGap", 0);
        setIntField(term20424, term20424.getClass(), "mnemonic", 0);
        setIntField(term20424, term20424.getClass(), "mnemonicIndex", 0);
        setLongField(term20424, term20424.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term20424, term20424.getClass(), "borderPaintedSet", false);
        setBooleanField(term20424, term20424.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term20424, term20424.getClass(), "iconTextGapSet", false);
        setBooleanField(term20424, term20424.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term20424, term20424.getClass(), "setLayout", false);
        setBooleanField(term20424, term20424.getClass(), "defaultCapable", false);
        setField(term20424, term20424.getClass(), "handler", null);
        setField(term20424, term20424.getClass(), "changeListener", null);
        setField(term20424, term20424.getClass(), "actionListener", null);
        setField(term20424, term20424.getClass(), "itemListener", null);
        setField(term20424, term20424.getClass(), "changeEvent", null);
        setBooleanField(term20424, term20424.getClass(), "hideActionText", false);
        setField(term20424, term20424.getClass(), "action", null);
        setField(term20424, term20424.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term20424, term20424.getClass(), "isAlignmentXSet", false);
        setFloatField(term20424, term20424.getClass(), "alignmentX", 0.0F);
        setBooleanField(term20424, term20424.getClass(), "isAlignmentYSet", false);
        setFloatField(term20424, term20424.getClass(), "alignmentY", 0.0F);
        setField(term20424, term20424.getClass(), "ui", null);
        setField(term20424, term20424.getClass(), "listenerList", null);
        setField(term20424, term20424.getClass(), "clientProperties", null);
        setField(term20424, term20424.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term20424, term20424.getClass(), "autoscrolls", false);
        setField(term20424, term20424.getClass(), "border", null);
        setIntField(term20424, term20424.getClass(), "flags", 0);
        setField(term20424, term20424.getClass(), "inputVerifier", null);
        setBooleanField(term20424, term20424.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term20424, term20424.getClass(), "paintingChild", null);
        setField(term20424, term20424.getClass(), "popupMenu", null);
        setField(term20424, term20424.getClass(), "revalidateRunnableScheduled", null);
        setField(term20424, term20424.getClass(), "focusInputMap", null);
        setField(term20424, term20424.getClass(), "ancestorInputMap", null);
        setField(term20424, term20424.getClass(), "windowInputMap", null);
        setField(term20424, term20424.getClass(), "actionMap", null);
        setField(term20424, term20424.getClass(), "aaHint", null);
        setField(term20424, term20424.getClass(), "lcdRenderingHint", null);
        setField(term20424, term20424.getClass(), "component", null);
        setField(term20424, term20424.getClass(), "layoutMgr", null);
        setField(term20424, term20424.getClass(), "dispatcher", null);
        setField(term20424, term20424.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term20424, term20424.getClass(), "focusCycleRoot", false);
        setBooleanField(term20424, term20424.getClass(), "focusTraversalPolicyProvider", false);
        setField(term20424, term20424.getClass(), "printingThreads", null);
        setBooleanField(term20424, term20424.getClass(), "printing", false);
        setField(term20424, term20424.getClass(), "containerListener", null);
        setIntField(term20424, term20424.getClass(), "listeningChildren", 0);
        setIntField(term20424, term20424.getClass(), "listeningBoundsChildren", 0);
        setIntField(term20424, term20424.getClass(), "descendantsCount", 0);
        setField(term20424, term20424.getClass(), "preserveBackgroundColor", null);
        setIntField(term20424, term20424.getClass(), "numOfHWComponents", 0);
        setIntField(term20424, term20424.getClass(), "numOfLWComponents", 0);
        setField(term20424, term20424.getClass(), "modalComp", null);
        setField(term20424, term20424.getClass(), "modalAppContext", null);
        setIntField(term20424, term20424.getClass(), "containerSerializedDataVersion", 0);
        setField(term20424, term20424.getClass(), "peer", null);
        setField(term20424, term20424.getClass(), "parent", null);
        setField(term20424, term20424.getClass(), "appContext", null);
        setIntField(term20424, term20424.getClass(), "x", 0);
        setIntField(term20424, term20424.getClass(), "y", 0);
        setIntField(term20424, term20424.getClass(), "width", 0);
        setIntField(term20424, term20424.getClass(), "height", 0);
        setField(term20424, term20424.getClass(), "foreground", null);
        setField(term20424, term20424.getClass(), "background", null);
        setField(term20424, term20424.getClass(), "font", null);
        setField(term20424, term20424.getClass(), "peerFont", null);
        setField(term20424, term20424.getClass(), "cursor", null);
        setField(term20424, term20424.getClass(), "locale", null);
        setField(term20424, term20424.getClass(), "graphicsConfig", null);
        setField(term20424, term20424.getClass(), "bufferStrategy", null);
        setBooleanField(term20424, term20424.getClass(), "ignoreRepaint", false);
        setBooleanField(term20424, term20424.getClass(), "visible", false);
        setBooleanField(term20424, term20424.getClass(), "enabled", false);
        setBooleanField(term20424, term20424.getClass(), "valid", false);
        setField(term20424, term20424.getClass(), "dropTarget", null);
        setField(term20424, term20424.getClass(), "popups", null);
        setField(term20424, term20424.getClass(), "name", null);
        setBooleanField(term20424, term20424.getClass(), "nameExplicitlySet", false);
        setBooleanField(term20424, term20424.getClass(), "focusable", false);
        setIntField(term20424, term20424.getClass(), "isFocusTraversableOverridden", 0);
        setField(term20424, term20424.getClass(), "focusTraversalKeys", null);
        setBooleanField(term20424, term20424.getClass(), "focusTraversalKeysEnabled", false);
        setField(term20424, term20424.getClass(), "acc", null);
        setField(term20424, term20424.getClass(), "minSize", null);
        setBooleanField(term20424, term20424.getClass(), "minSizeSet", false);
        setField(term20424, term20424.getClass(), "prefSize", null);
        setBooleanField(term20424, term20424.getClass(), "prefSizeSet", false);
        setField(term20424, term20424.getClass(), "maxSize", null);
        setBooleanField(term20424, term20424.getClass(), "maxSizeSet", false);
        setField(term20424, term20424.getClass(), "componentOrientation", null);
        setBooleanField(term20424, term20424.getClass(), "newEventsOnly", false);
        setField(term20424, term20424.getClass(), "componentListener", null);
        setField(term20424, term20424.getClass(), "focusListener", null);
        setField(term20424, term20424.getClass(), "hierarchyListener", null);
        setField(term20424, term20424.getClass(), "hierarchyBoundsListener", null);
        setField(term20424, term20424.getClass(), "keyListener", null);
        setField(term20424, term20424.getClass(), "mouseListener", null);
        setField(term20424, term20424.getClass(), "mouseMotionListener", null);
        setField(term20424, term20424.getClass(), "mouseWheelListener", null);
        setField(term20424, term20424.getClass(), "inputMethodListener", null);
        setLongField(term20424, term20424.getClass(), "eventMask", 0L);
        setField(term20424, term20424.getClass(), "changeSupport", null);
        setField(term20424, term20424.getClass(), "objectLock", null);
        setBooleanField(term20424, term20424.getClass(), "isPacked", false);
        setIntField(term20424, term20424.getClass(), "boundsOp", 0);
        setField(term20424, term20424.getClass(), "compoundShape", null);
        setField(term20424, term20424.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term20424, term20424.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term20424, term20424.getClass(), "backgroundEraseDisabled", false);
        setField(term20424, term20424.getClass(), "eventCache", null);
        setBooleanField(term20424, term20424.getClass(), "coalescingEnabled", false);
        setBooleanField(term20424, term20424.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term20424, term20424.getClass(), "componentSerializedDataVersion", 0);
        setField(term20424, term20424.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.buttons.SpaceCheckBox");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Graphics");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "paintComponent", argTypes, term20424, args);
    }

};


