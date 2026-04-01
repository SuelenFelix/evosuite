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

public class ComponentButton_setUsed_1875991949 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19377;
     Object term19439;

    public ComponentButton_setUsed_1875991949() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19377 = newInstance(Class.forName("org.openRealmOfStars.gui.buttons.ComponentButton"));
        setField(term19377, term19377.getClass(), "ship", null);
        setIntField(term19377, term19377.getClass(), "index", 0);
        setField(term19377, term19377.getClass(), "icon", null);
        setBooleanField(term19377, term19377.getClass(), "used", false);
        setField(term19377, term19377.getClass(), "model", null);
        setField(term19377, term19377.getClass(), "text", null);
        setField(term19377, term19377.getClass(), "margin", null);
        setField(term19377, term19377.getClass(), "defaultMargin", null);
        setField(term19377, term19377.getClass(), "defaultIcon", null);
        setField(term19377, term19377.getClass(), "pressedIcon", null);
        setField(term19377, term19377.getClass(), "disabledIcon", null);
        setField(term19377, term19377.getClass(), "selectedIcon", null);
        setField(term19377, term19377.getClass(), "disabledSelectedIcon", null);
        setField(term19377, term19377.getClass(), "rolloverIcon", null);
        setField(term19377, term19377.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term19377, term19377.getClass(), "paintBorder", false);
        setBooleanField(term19377, term19377.getClass(), "paintFocus", false);
        setBooleanField(term19377, term19377.getClass(), "rolloverEnabled", false);
        setBooleanField(term19377, term19377.getClass(), "contentAreaFilled", false);
        setIntField(term19377, term19377.getClass(), "verticalAlignment", 0);
        setIntField(term19377, term19377.getClass(), "horizontalAlignment", 0);
        setIntField(term19377, term19377.getClass(), "verticalTextPosition", 0);
        setIntField(term19377, term19377.getClass(), "horizontalTextPosition", 0);
        setIntField(term19377, term19377.getClass(), "iconTextGap", 0);
        setIntField(term19377, term19377.getClass(), "mnemonic", 0);
        setIntField(term19377, term19377.getClass(), "mnemonicIndex", 0);
        setLongField(term19377, term19377.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term19377, term19377.getClass(), "borderPaintedSet", false);
        setBooleanField(term19377, term19377.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term19377, term19377.getClass(), "iconTextGapSet", false);
        setBooleanField(term19377, term19377.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term19377, term19377.getClass(), "setLayout", false);
        setBooleanField(term19377, term19377.getClass(), "defaultCapable", false);
        setField(term19377, term19377.getClass(), "handler", null);
        setField(term19377, term19377.getClass(), "changeListener", null);
        setField(term19377, term19377.getClass(), "actionListener", null);
        setField(term19377, term19377.getClass(), "itemListener", null);
        setField(term19377, term19377.getClass(), "changeEvent", null);
        setBooleanField(term19377, term19377.getClass(), "hideActionText", false);
        setField(term19377, term19377.getClass(), "action", null);
        setField(term19377, term19377.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term19377, term19377.getClass(), "isAlignmentXSet", false);
        setFloatField(term19377, term19377.getClass(), "alignmentX", 0.0F);
        setBooleanField(term19377, term19377.getClass(), "isAlignmentYSet", false);
        setFloatField(term19377, term19377.getClass(), "alignmentY", 0.0F);
        setField(term19377, term19377.getClass(), "ui", null);
        setField(term19377, term19377.getClass(), "listenerList", null);
        setField(term19377, term19377.getClass(), "clientProperties", null);
        setField(term19377, term19377.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term19377, term19377.getClass(), "autoscrolls", false);
        setField(term19377, term19377.getClass(), "border", null);
        setIntField(term19377, term19377.getClass(), "flags", 0);
        setField(term19377, term19377.getClass(), "inputVerifier", null);
        setBooleanField(term19377, term19377.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term19377, term19377.getClass(), "paintingChild", null);
        setField(term19377, term19377.getClass(), "popupMenu", null);
        setField(term19377, term19377.getClass(), "revalidateRunnableScheduled", null);
        setField(term19377, term19377.getClass(), "focusInputMap", null);
        setField(term19377, term19377.getClass(), "ancestorInputMap", null);
        setField(term19377, term19377.getClass(), "windowInputMap", null);
        setField(term19377, term19377.getClass(), "actionMap", null);
        setField(term19377, term19377.getClass(), "aaHint", null);
        setField(term19377, term19377.getClass(), "lcdRenderingHint", null);
        setField(term19377, term19377.getClass(), "component", null);
        setField(term19377, term19377.getClass(), "layoutMgr", null);
        setField(term19377, term19377.getClass(), "dispatcher", null);
        setField(term19377, term19377.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term19377, term19377.getClass(), "focusCycleRoot", false);
        setBooleanField(term19377, term19377.getClass(), "focusTraversalPolicyProvider", false);
        setField(term19377, term19377.getClass(), "printingThreads", null);
        setBooleanField(term19377, term19377.getClass(), "printing", false);
        setField(term19377, term19377.getClass(), "containerListener", null);
        setIntField(term19377, term19377.getClass(), "listeningChildren", 0);
        setIntField(term19377, term19377.getClass(), "listeningBoundsChildren", 0);
        setIntField(term19377, term19377.getClass(), "descendantsCount", 0);
        setField(term19377, term19377.getClass(), "preserveBackgroundColor", null);
        setIntField(term19377, term19377.getClass(), "numOfHWComponents", 0);
        setIntField(term19377, term19377.getClass(), "numOfLWComponents", 0);
        setField(term19377, term19377.getClass(), "modalComp", null);
        setField(term19377, term19377.getClass(), "modalAppContext", null);
        setIntField(term19377, term19377.getClass(), "containerSerializedDataVersion", 0);
        setField(term19377, term19377.getClass(), "peer", null);
        setField(term19377, term19377.getClass(), "parent", null);
        setField(term19377, term19377.getClass(), "appContext", null);
        setIntField(term19377, term19377.getClass(), "x", 0);
        setIntField(term19377, term19377.getClass(), "y", 0);
        setIntField(term19377, term19377.getClass(), "width", 0);
        setIntField(term19377, term19377.getClass(), "height", 0);
        setField(term19377, term19377.getClass(), "foreground", null);
        setField(term19377, term19377.getClass(), "background", null);
        setField(term19377, term19377.getClass(), "font", null);
        setField(term19377, term19377.getClass(), "peerFont", null);
        setField(term19377, term19377.getClass(), "cursor", null);
        setField(term19377, term19377.getClass(), "locale", null);
        setField(term19377, term19377.getClass(), "graphicsConfig", null);
        setField(term19377, term19377.getClass(), "bufferStrategy", null);
        setBooleanField(term19377, term19377.getClass(), "ignoreRepaint", false);
        setBooleanField(term19377, term19377.getClass(), "visible", false);
        setBooleanField(term19377, term19377.getClass(), "enabled", false);
        setBooleanField(term19377, term19377.getClass(), "valid", false);
        setField(term19377, term19377.getClass(), "dropTarget", null);
        setField(term19377, term19377.getClass(), "popups", null);
        setField(term19377, term19377.getClass(), "name", null);
        setBooleanField(term19377, term19377.getClass(), "nameExplicitlySet", false);
        setBooleanField(term19377, term19377.getClass(), "focusable", false);
        setIntField(term19377, term19377.getClass(), "isFocusTraversableOverridden", 0);
        setField(term19377, term19377.getClass(), "focusTraversalKeys", null);
        setBooleanField(term19377, term19377.getClass(), "focusTraversalKeysEnabled", false);
        setField(term19377, term19377.getClass(), "acc", null);
        setField(term19377, term19377.getClass(), "minSize", null);
        setBooleanField(term19377, term19377.getClass(), "minSizeSet", false);
        setField(term19377, term19377.getClass(), "prefSize", null);
        setBooleanField(term19377, term19377.getClass(), "prefSizeSet", false);
        setField(term19377, term19377.getClass(), "maxSize", null);
        setBooleanField(term19377, term19377.getClass(), "maxSizeSet", false);
        setField(term19377, term19377.getClass(), "componentOrientation", null);
        setBooleanField(term19377, term19377.getClass(), "newEventsOnly", false);
        setField(term19377, term19377.getClass(), "componentListener", null);
        setField(term19377, term19377.getClass(), "focusListener", null);
        setField(term19377, term19377.getClass(), "hierarchyListener", null);
        setField(term19377, term19377.getClass(), "hierarchyBoundsListener", null);
        setField(term19377, term19377.getClass(), "keyListener", null);
        setField(term19377, term19377.getClass(), "mouseListener", null);
        setField(term19377, term19377.getClass(), "mouseMotionListener", null);
        setField(term19377, term19377.getClass(), "mouseWheelListener", null);
        setField(term19377, term19377.getClass(), "inputMethodListener", null);
        setLongField(term19377, term19377.getClass(), "eventMask", 0L);
        setField(term19377, term19377.getClass(), "changeSupport", null);
        setField(term19377, term19377.getClass(), "objectLock", null);
        setBooleanField(term19377, term19377.getClass(), "isPacked", false);
        setIntField(term19377, term19377.getClass(), "boundsOp", 0);
        setField(term19377, term19377.getClass(), "compoundShape", null);
        setField(term19377, term19377.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term19377, term19377.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term19377, term19377.getClass(), "backgroundEraseDisabled", false);
        setField(term19377, term19377.getClass(), "eventCache", null);
        setBooleanField(term19377, term19377.getClass(), "coalescingEnabled", false);
        setBooleanField(term19377, term19377.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term19377, term19377.getClass(), "componentSerializedDataVersion", 0);
        setField(term19377, term19377.getClass(), "accessibleContext", null);
        term19439 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.buttons.ComponentButton");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term19439;
        callMethod(klass, "setUsed", argTypes, term19377, args);
    }

};


