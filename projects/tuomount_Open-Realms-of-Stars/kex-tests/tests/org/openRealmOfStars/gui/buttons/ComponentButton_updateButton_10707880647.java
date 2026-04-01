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

public class ComponentButton_updateButton_10707880647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19253;

    public ComponentButton_updateButton_10707880647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19253 = newInstance(Class.forName("org.openRealmOfStars.gui.buttons.ComponentButton"));
        setField(term19253, term19253.getClass(), "ship", null);
        setIntField(term19253, term19253.getClass(), "index", 0);
        setField(term19253, term19253.getClass(), "icon", null);
        setBooleanField(term19253, term19253.getClass(), "used", false);
        setField(term19253, term19253.getClass(), "model", null);
        setField(term19253, term19253.getClass(), "text", null);
        setField(term19253, term19253.getClass(), "margin", null);
        setField(term19253, term19253.getClass(), "defaultMargin", null);
        setField(term19253, term19253.getClass(), "defaultIcon", null);
        setField(term19253, term19253.getClass(), "pressedIcon", null);
        setField(term19253, term19253.getClass(), "disabledIcon", null);
        setField(term19253, term19253.getClass(), "selectedIcon", null);
        setField(term19253, term19253.getClass(), "disabledSelectedIcon", null);
        setField(term19253, term19253.getClass(), "rolloverIcon", null);
        setField(term19253, term19253.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term19253, term19253.getClass(), "paintBorder", false);
        setBooleanField(term19253, term19253.getClass(), "paintFocus", false);
        setBooleanField(term19253, term19253.getClass(), "rolloverEnabled", false);
        setBooleanField(term19253, term19253.getClass(), "contentAreaFilled", false);
        setIntField(term19253, term19253.getClass(), "verticalAlignment", 0);
        setIntField(term19253, term19253.getClass(), "horizontalAlignment", 0);
        setIntField(term19253, term19253.getClass(), "verticalTextPosition", 0);
        setIntField(term19253, term19253.getClass(), "horizontalTextPosition", 0);
        setIntField(term19253, term19253.getClass(), "iconTextGap", 0);
        setIntField(term19253, term19253.getClass(), "mnemonic", 0);
        setIntField(term19253, term19253.getClass(), "mnemonicIndex", 0);
        setLongField(term19253, term19253.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term19253, term19253.getClass(), "borderPaintedSet", false);
        setBooleanField(term19253, term19253.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term19253, term19253.getClass(), "iconTextGapSet", false);
        setBooleanField(term19253, term19253.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term19253, term19253.getClass(), "setLayout", false);
        setBooleanField(term19253, term19253.getClass(), "defaultCapable", false);
        setField(term19253, term19253.getClass(), "handler", null);
        setField(term19253, term19253.getClass(), "changeListener", null);
        setField(term19253, term19253.getClass(), "actionListener", null);
        setField(term19253, term19253.getClass(), "itemListener", null);
        setField(term19253, term19253.getClass(), "changeEvent", null);
        setBooleanField(term19253, term19253.getClass(), "hideActionText", false);
        setField(term19253, term19253.getClass(), "action", null);
        setField(term19253, term19253.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term19253, term19253.getClass(), "isAlignmentXSet", false);
        setFloatField(term19253, term19253.getClass(), "alignmentX", 0.0F);
        setBooleanField(term19253, term19253.getClass(), "isAlignmentYSet", false);
        setFloatField(term19253, term19253.getClass(), "alignmentY", 0.0F);
        setField(term19253, term19253.getClass(), "ui", null);
        setField(term19253, term19253.getClass(), "listenerList", null);
        setField(term19253, term19253.getClass(), "clientProperties", null);
        setField(term19253, term19253.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term19253, term19253.getClass(), "autoscrolls", false);
        setField(term19253, term19253.getClass(), "border", null);
        setIntField(term19253, term19253.getClass(), "flags", 0);
        setField(term19253, term19253.getClass(), "inputVerifier", null);
        setBooleanField(term19253, term19253.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term19253, term19253.getClass(), "paintingChild", null);
        setField(term19253, term19253.getClass(), "popupMenu", null);
        setField(term19253, term19253.getClass(), "revalidateRunnableScheduled", null);
        setField(term19253, term19253.getClass(), "focusInputMap", null);
        setField(term19253, term19253.getClass(), "ancestorInputMap", null);
        setField(term19253, term19253.getClass(), "windowInputMap", null);
        setField(term19253, term19253.getClass(), "actionMap", null);
        setField(term19253, term19253.getClass(), "aaHint", null);
        setField(term19253, term19253.getClass(), "lcdRenderingHint", null);
        setField(term19253, term19253.getClass(), "component", null);
        setField(term19253, term19253.getClass(), "layoutMgr", null);
        setField(term19253, term19253.getClass(), "dispatcher", null);
        setField(term19253, term19253.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term19253, term19253.getClass(), "focusCycleRoot", false);
        setBooleanField(term19253, term19253.getClass(), "focusTraversalPolicyProvider", false);
        setField(term19253, term19253.getClass(), "printingThreads", null);
        setBooleanField(term19253, term19253.getClass(), "printing", false);
        setField(term19253, term19253.getClass(), "containerListener", null);
        setIntField(term19253, term19253.getClass(), "listeningChildren", 0);
        setIntField(term19253, term19253.getClass(), "listeningBoundsChildren", 0);
        setIntField(term19253, term19253.getClass(), "descendantsCount", 0);
        setField(term19253, term19253.getClass(), "preserveBackgroundColor", null);
        setIntField(term19253, term19253.getClass(), "numOfHWComponents", 0);
        setIntField(term19253, term19253.getClass(), "numOfLWComponents", 0);
        setField(term19253, term19253.getClass(), "modalComp", null);
        setField(term19253, term19253.getClass(), "modalAppContext", null);
        setIntField(term19253, term19253.getClass(), "containerSerializedDataVersion", 0);
        setField(term19253, term19253.getClass(), "peer", null);
        setField(term19253, term19253.getClass(), "parent", null);
        setField(term19253, term19253.getClass(), "appContext", null);
        setIntField(term19253, term19253.getClass(), "x", 0);
        setIntField(term19253, term19253.getClass(), "y", 0);
        setIntField(term19253, term19253.getClass(), "width", 0);
        setIntField(term19253, term19253.getClass(), "height", 0);
        setField(term19253, term19253.getClass(), "foreground", null);
        setField(term19253, term19253.getClass(), "background", null);
        setField(term19253, term19253.getClass(), "font", null);
        setField(term19253, term19253.getClass(), "peerFont", null);
        setField(term19253, term19253.getClass(), "cursor", null);
        setField(term19253, term19253.getClass(), "locale", null);
        setField(term19253, term19253.getClass(), "graphicsConfig", null);
        setField(term19253, term19253.getClass(), "bufferStrategy", null);
        setBooleanField(term19253, term19253.getClass(), "ignoreRepaint", false);
        setBooleanField(term19253, term19253.getClass(), "visible", false);
        setBooleanField(term19253, term19253.getClass(), "enabled", false);
        setBooleanField(term19253, term19253.getClass(), "valid", false);
        setField(term19253, term19253.getClass(), "dropTarget", null);
        setField(term19253, term19253.getClass(), "popups", null);
        setField(term19253, term19253.getClass(), "name", null);
        setBooleanField(term19253, term19253.getClass(), "nameExplicitlySet", false);
        setBooleanField(term19253, term19253.getClass(), "focusable", false);
        setIntField(term19253, term19253.getClass(), "isFocusTraversableOverridden", 0);
        setField(term19253, term19253.getClass(), "focusTraversalKeys", null);
        setBooleanField(term19253, term19253.getClass(), "focusTraversalKeysEnabled", false);
        setField(term19253, term19253.getClass(), "acc", null);
        setField(term19253, term19253.getClass(), "minSize", null);
        setBooleanField(term19253, term19253.getClass(), "minSizeSet", false);
        setField(term19253, term19253.getClass(), "prefSize", null);
        setBooleanField(term19253, term19253.getClass(), "prefSizeSet", false);
        setField(term19253, term19253.getClass(), "maxSize", null);
        setBooleanField(term19253, term19253.getClass(), "maxSizeSet", false);
        setField(term19253, term19253.getClass(), "componentOrientation", null);
        setBooleanField(term19253, term19253.getClass(), "newEventsOnly", false);
        setField(term19253, term19253.getClass(), "componentListener", null);
        setField(term19253, term19253.getClass(), "focusListener", null);
        setField(term19253, term19253.getClass(), "hierarchyListener", null);
        setField(term19253, term19253.getClass(), "hierarchyBoundsListener", null);
        setField(term19253, term19253.getClass(), "keyListener", null);
        setField(term19253, term19253.getClass(), "mouseListener", null);
        setField(term19253, term19253.getClass(), "mouseMotionListener", null);
        setField(term19253, term19253.getClass(), "mouseWheelListener", null);
        setField(term19253, term19253.getClass(), "inputMethodListener", null);
        setLongField(term19253, term19253.getClass(), "eventMask", 0L);
        setField(term19253, term19253.getClass(), "changeSupport", null);
        setField(term19253, term19253.getClass(), "objectLock", null);
        setBooleanField(term19253, term19253.getClass(), "isPacked", false);
        setIntField(term19253, term19253.getClass(), "boundsOp", 0);
        setField(term19253, term19253.getClass(), "compoundShape", null);
        setField(term19253, term19253.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term19253, term19253.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term19253, term19253.getClass(), "backgroundEraseDisabled", false);
        setField(term19253, term19253.getClass(), "eventCache", null);
        setBooleanField(term19253, term19253.getClass(), "coalescingEnabled", false);
        setBooleanField(term19253, term19253.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term19253, term19253.getClass(), "componentSerializedDataVersion", 0);
        setField(term19253, term19253.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.buttons.ComponentButton");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateButton", argTypes, term19253, args);
    }

};


