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

public class SpaceCheckBox_createToolTip_14330551057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20300;

    public SpaceCheckBox_createToolTip_14330551057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20300 = newInstance(Class.forName("org.openRealmOfStars.gui.buttons.SpaceCheckBox"));
        setField(term20300, term20300.getClass(), "icon", null);
        setIntField(term20300, term20300.getClass(), "type", 0);
        setBooleanField(term20300, term20300.getClass(), "flat", false);
        setField(term20300, term20300.getClass(), "model", null);
        setField(term20300, term20300.getClass(), "text", null);
        setField(term20300, term20300.getClass(), "margin", null);
        setField(term20300, term20300.getClass(), "defaultMargin", null);
        setField(term20300, term20300.getClass(), "defaultIcon", null);
        setField(term20300, term20300.getClass(), "pressedIcon", null);
        setField(term20300, term20300.getClass(), "disabledIcon", null);
        setField(term20300, term20300.getClass(), "selectedIcon", null);
        setField(term20300, term20300.getClass(), "disabledSelectedIcon", null);
        setField(term20300, term20300.getClass(), "rolloverIcon", null);
        setField(term20300, term20300.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term20300, term20300.getClass(), "paintBorder", false);
        setBooleanField(term20300, term20300.getClass(), "paintFocus", false);
        setBooleanField(term20300, term20300.getClass(), "rolloverEnabled", false);
        setBooleanField(term20300, term20300.getClass(), "contentAreaFilled", false);
        setIntField(term20300, term20300.getClass(), "verticalAlignment", 0);
        setIntField(term20300, term20300.getClass(), "horizontalAlignment", 0);
        setIntField(term20300, term20300.getClass(), "verticalTextPosition", 0);
        setIntField(term20300, term20300.getClass(), "horizontalTextPosition", 0);
        setIntField(term20300, term20300.getClass(), "iconTextGap", 0);
        setIntField(term20300, term20300.getClass(), "mnemonic", 0);
        setIntField(term20300, term20300.getClass(), "mnemonicIndex", 0);
        setLongField(term20300, term20300.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term20300, term20300.getClass(), "borderPaintedSet", false);
        setBooleanField(term20300, term20300.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term20300, term20300.getClass(), "iconTextGapSet", false);
        setBooleanField(term20300, term20300.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term20300, term20300.getClass(), "setLayout", false);
        setBooleanField(term20300, term20300.getClass(), "defaultCapable", false);
        setField(term20300, term20300.getClass(), "handler", null);
        setField(term20300, term20300.getClass(), "changeListener", null);
        setField(term20300, term20300.getClass(), "actionListener", null);
        setField(term20300, term20300.getClass(), "itemListener", null);
        setField(term20300, term20300.getClass(), "changeEvent", null);
        setBooleanField(term20300, term20300.getClass(), "hideActionText", false);
        setField(term20300, term20300.getClass(), "action", null);
        setField(term20300, term20300.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term20300, term20300.getClass(), "isAlignmentXSet", false);
        setFloatField(term20300, term20300.getClass(), "alignmentX", 0.0F);
        setBooleanField(term20300, term20300.getClass(), "isAlignmentYSet", false);
        setFloatField(term20300, term20300.getClass(), "alignmentY", 0.0F);
        setField(term20300, term20300.getClass(), "ui", null);
        setField(term20300, term20300.getClass(), "listenerList", null);
        setField(term20300, term20300.getClass(), "clientProperties", null);
        setField(term20300, term20300.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term20300, term20300.getClass(), "autoscrolls", false);
        setField(term20300, term20300.getClass(), "border", null);
        setIntField(term20300, term20300.getClass(), "flags", 0);
        setField(term20300, term20300.getClass(), "inputVerifier", null);
        setBooleanField(term20300, term20300.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term20300, term20300.getClass(), "paintingChild", null);
        setField(term20300, term20300.getClass(), "popupMenu", null);
        setField(term20300, term20300.getClass(), "revalidateRunnableScheduled", null);
        setField(term20300, term20300.getClass(), "focusInputMap", null);
        setField(term20300, term20300.getClass(), "ancestorInputMap", null);
        setField(term20300, term20300.getClass(), "windowInputMap", null);
        setField(term20300, term20300.getClass(), "actionMap", null);
        setField(term20300, term20300.getClass(), "aaHint", null);
        setField(term20300, term20300.getClass(), "lcdRenderingHint", null);
        setField(term20300, term20300.getClass(), "component", null);
        setField(term20300, term20300.getClass(), "layoutMgr", null);
        setField(term20300, term20300.getClass(), "dispatcher", null);
        setField(term20300, term20300.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term20300, term20300.getClass(), "focusCycleRoot", false);
        setBooleanField(term20300, term20300.getClass(), "focusTraversalPolicyProvider", false);
        setField(term20300, term20300.getClass(), "printingThreads", null);
        setBooleanField(term20300, term20300.getClass(), "printing", false);
        setField(term20300, term20300.getClass(), "containerListener", null);
        setIntField(term20300, term20300.getClass(), "listeningChildren", 0);
        setIntField(term20300, term20300.getClass(), "listeningBoundsChildren", 0);
        setIntField(term20300, term20300.getClass(), "descendantsCount", 0);
        setField(term20300, term20300.getClass(), "preserveBackgroundColor", null);
        setIntField(term20300, term20300.getClass(), "numOfHWComponents", 0);
        setIntField(term20300, term20300.getClass(), "numOfLWComponents", 0);
        setField(term20300, term20300.getClass(), "modalComp", null);
        setField(term20300, term20300.getClass(), "modalAppContext", null);
        setIntField(term20300, term20300.getClass(), "containerSerializedDataVersion", 0);
        setField(term20300, term20300.getClass(), "peer", null);
        setField(term20300, term20300.getClass(), "parent", null);
        setField(term20300, term20300.getClass(), "appContext", null);
        setIntField(term20300, term20300.getClass(), "x", 0);
        setIntField(term20300, term20300.getClass(), "y", 0);
        setIntField(term20300, term20300.getClass(), "width", 0);
        setIntField(term20300, term20300.getClass(), "height", 0);
        setField(term20300, term20300.getClass(), "foreground", null);
        setField(term20300, term20300.getClass(), "background", null);
        setField(term20300, term20300.getClass(), "font", null);
        setField(term20300, term20300.getClass(), "peerFont", null);
        setField(term20300, term20300.getClass(), "cursor", null);
        setField(term20300, term20300.getClass(), "locale", null);
        setField(term20300, term20300.getClass(), "graphicsConfig", null);
        setField(term20300, term20300.getClass(), "bufferStrategy", null);
        setBooleanField(term20300, term20300.getClass(), "ignoreRepaint", false);
        setBooleanField(term20300, term20300.getClass(), "visible", false);
        setBooleanField(term20300, term20300.getClass(), "enabled", false);
        setBooleanField(term20300, term20300.getClass(), "valid", false);
        setField(term20300, term20300.getClass(), "dropTarget", null);
        setField(term20300, term20300.getClass(), "popups", null);
        setField(term20300, term20300.getClass(), "name", null);
        setBooleanField(term20300, term20300.getClass(), "nameExplicitlySet", false);
        setBooleanField(term20300, term20300.getClass(), "focusable", false);
        setIntField(term20300, term20300.getClass(), "isFocusTraversableOverridden", 0);
        setField(term20300, term20300.getClass(), "focusTraversalKeys", null);
        setBooleanField(term20300, term20300.getClass(), "focusTraversalKeysEnabled", false);
        setField(term20300, term20300.getClass(), "acc", null);
        setField(term20300, term20300.getClass(), "minSize", null);
        setBooleanField(term20300, term20300.getClass(), "minSizeSet", false);
        setField(term20300, term20300.getClass(), "prefSize", null);
        setBooleanField(term20300, term20300.getClass(), "prefSizeSet", false);
        setField(term20300, term20300.getClass(), "maxSize", null);
        setBooleanField(term20300, term20300.getClass(), "maxSizeSet", false);
        setField(term20300, term20300.getClass(), "componentOrientation", null);
        setBooleanField(term20300, term20300.getClass(), "newEventsOnly", false);
        setField(term20300, term20300.getClass(), "componentListener", null);
        setField(term20300, term20300.getClass(), "focusListener", null);
        setField(term20300, term20300.getClass(), "hierarchyListener", null);
        setField(term20300, term20300.getClass(), "hierarchyBoundsListener", null);
        setField(term20300, term20300.getClass(), "keyListener", null);
        setField(term20300, term20300.getClass(), "mouseListener", null);
        setField(term20300, term20300.getClass(), "mouseMotionListener", null);
        setField(term20300, term20300.getClass(), "mouseWheelListener", null);
        setField(term20300, term20300.getClass(), "inputMethodListener", null);
        setLongField(term20300, term20300.getClass(), "eventMask", 0L);
        setField(term20300, term20300.getClass(), "changeSupport", null);
        setField(term20300, term20300.getClass(), "objectLock", null);
        setBooleanField(term20300, term20300.getClass(), "isPacked", false);
        setIntField(term20300, term20300.getClass(), "boundsOp", 0);
        setField(term20300, term20300.getClass(), "compoundShape", null);
        setField(term20300, term20300.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term20300, term20300.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term20300, term20300.getClass(), "backgroundEraseDisabled", false);
        setField(term20300, term20300.getClass(), "eventCache", null);
        setBooleanField(term20300, term20300.getClass(), "coalescingEnabled", false);
        setBooleanField(term20300, term20300.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term20300, term20300.getClass(), "componentSerializedDataVersion", 0);
        setField(term20300, term20300.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.buttons.SpaceCheckBox");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term20300, args);
    }

};


