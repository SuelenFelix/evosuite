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

public class ComponentButton_isUsed_9985893848 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19315;

    public ComponentButton_isUsed_9985893848() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19315 = newInstance(Class.forName("org.openRealmOfStars.gui.buttons.ComponentButton"));
        setField(term19315, term19315.getClass(), "ship", null);
        setIntField(term19315, term19315.getClass(), "index", 0);
        setField(term19315, term19315.getClass(), "icon", null);
        setBooleanField(term19315, term19315.getClass(), "used", false);
        setField(term19315, term19315.getClass(), "model", null);
        setField(term19315, term19315.getClass(), "text", null);
        setField(term19315, term19315.getClass(), "margin", null);
        setField(term19315, term19315.getClass(), "defaultMargin", null);
        setField(term19315, term19315.getClass(), "defaultIcon", null);
        setField(term19315, term19315.getClass(), "pressedIcon", null);
        setField(term19315, term19315.getClass(), "disabledIcon", null);
        setField(term19315, term19315.getClass(), "selectedIcon", null);
        setField(term19315, term19315.getClass(), "disabledSelectedIcon", null);
        setField(term19315, term19315.getClass(), "rolloverIcon", null);
        setField(term19315, term19315.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term19315, term19315.getClass(), "paintBorder", false);
        setBooleanField(term19315, term19315.getClass(), "paintFocus", false);
        setBooleanField(term19315, term19315.getClass(), "rolloverEnabled", false);
        setBooleanField(term19315, term19315.getClass(), "contentAreaFilled", false);
        setIntField(term19315, term19315.getClass(), "verticalAlignment", 0);
        setIntField(term19315, term19315.getClass(), "horizontalAlignment", 0);
        setIntField(term19315, term19315.getClass(), "verticalTextPosition", 0);
        setIntField(term19315, term19315.getClass(), "horizontalTextPosition", 0);
        setIntField(term19315, term19315.getClass(), "iconTextGap", 0);
        setIntField(term19315, term19315.getClass(), "mnemonic", 0);
        setIntField(term19315, term19315.getClass(), "mnemonicIndex", 0);
        setLongField(term19315, term19315.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term19315, term19315.getClass(), "borderPaintedSet", false);
        setBooleanField(term19315, term19315.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term19315, term19315.getClass(), "iconTextGapSet", false);
        setBooleanField(term19315, term19315.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term19315, term19315.getClass(), "setLayout", false);
        setBooleanField(term19315, term19315.getClass(), "defaultCapable", false);
        setField(term19315, term19315.getClass(), "handler", null);
        setField(term19315, term19315.getClass(), "changeListener", null);
        setField(term19315, term19315.getClass(), "actionListener", null);
        setField(term19315, term19315.getClass(), "itemListener", null);
        setField(term19315, term19315.getClass(), "changeEvent", null);
        setBooleanField(term19315, term19315.getClass(), "hideActionText", false);
        setField(term19315, term19315.getClass(), "action", null);
        setField(term19315, term19315.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term19315, term19315.getClass(), "isAlignmentXSet", false);
        setFloatField(term19315, term19315.getClass(), "alignmentX", 0.0F);
        setBooleanField(term19315, term19315.getClass(), "isAlignmentYSet", false);
        setFloatField(term19315, term19315.getClass(), "alignmentY", 0.0F);
        setField(term19315, term19315.getClass(), "ui", null);
        setField(term19315, term19315.getClass(), "listenerList", null);
        setField(term19315, term19315.getClass(), "clientProperties", null);
        setField(term19315, term19315.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term19315, term19315.getClass(), "autoscrolls", false);
        setField(term19315, term19315.getClass(), "border", null);
        setIntField(term19315, term19315.getClass(), "flags", 0);
        setField(term19315, term19315.getClass(), "inputVerifier", null);
        setBooleanField(term19315, term19315.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term19315, term19315.getClass(), "paintingChild", null);
        setField(term19315, term19315.getClass(), "popupMenu", null);
        setField(term19315, term19315.getClass(), "revalidateRunnableScheduled", null);
        setField(term19315, term19315.getClass(), "focusInputMap", null);
        setField(term19315, term19315.getClass(), "ancestorInputMap", null);
        setField(term19315, term19315.getClass(), "windowInputMap", null);
        setField(term19315, term19315.getClass(), "actionMap", null);
        setField(term19315, term19315.getClass(), "aaHint", null);
        setField(term19315, term19315.getClass(), "lcdRenderingHint", null);
        setField(term19315, term19315.getClass(), "component", null);
        setField(term19315, term19315.getClass(), "layoutMgr", null);
        setField(term19315, term19315.getClass(), "dispatcher", null);
        setField(term19315, term19315.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term19315, term19315.getClass(), "focusCycleRoot", false);
        setBooleanField(term19315, term19315.getClass(), "focusTraversalPolicyProvider", false);
        setField(term19315, term19315.getClass(), "printingThreads", null);
        setBooleanField(term19315, term19315.getClass(), "printing", false);
        setField(term19315, term19315.getClass(), "containerListener", null);
        setIntField(term19315, term19315.getClass(), "listeningChildren", 0);
        setIntField(term19315, term19315.getClass(), "listeningBoundsChildren", 0);
        setIntField(term19315, term19315.getClass(), "descendantsCount", 0);
        setField(term19315, term19315.getClass(), "preserveBackgroundColor", null);
        setIntField(term19315, term19315.getClass(), "numOfHWComponents", 0);
        setIntField(term19315, term19315.getClass(), "numOfLWComponents", 0);
        setField(term19315, term19315.getClass(), "modalComp", null);
        setField(term19315, term19315.getClass(), "modalAppContext", null);
        setIntField(term19315, term19315.getClass(), "containerSerializedDataVersion", 0);
        setField(term19315, term19315.getClass(), "peer", null);
        setField(term19315, term19315.getClass(), "parent", null);
        setField(term19315, term19315.getClass(), "appContext", null);
        setIntField(term19315, term19315.getClass(), "x", 0);
        setIntField(term19315, term19315.getClass(), "y", 0);
        setIntField(term19315, term19315.getClass(), "width", 0);
        setIntField(term19315, term19315.getClass(), "height", 0);
        setField(term19315, term19315.getClass(), "foreground", null);
        setField(term19315, term19315.getClass(), "background", null);
        setField(term19315, term19315.getClass(), "font", null);
        setField(term19315, term19315.getClass(), "peerFont", null);
        setField(term19315, term19315.getClass(), "cursor", null);
        setField(term19315, term19315.getClass(), "locale", null);
        setField(term19315, term19315.getClass(), "graphicsConfig", null);
        setField(term19315, term19315.getClass(), "bufferStrategy", null);
        setBooleanField(term19315, term19315.getClass(), "ignoreRepaint", false);
        setBooleanField(term19315, term19315.getClass(), "visible", false);
        setBooleanField(term19315, term19315.getClass(), "enabled", false);
        setBooleanField(term19315, term19315.getClass(), "valid", false);
        setField(term19315, term19315.getClass(), "dropTarget", null);
        setField(term19315, term19315.getClass(), "popups", null);
        setField(term19315, term19315.getClass(), "name", null);
        setBooleanField(term19315, term19315.getClass(), "nameExplicitlySet", false);
        setBooleanField(term19315, term19315.getClass(), "focusable", false);
        setIntField(term19315, term19315.getClass(), "isFocusTraversableOverridden", 0);
        setField(term19315, term19315.getClass(), "focusTraversalKeys", null);
        setBooleanField(term19315, term19315.getClass(), "focusTraversalKeysEnabled", false);
        setField(term19315, term19315.getClass(), "acc", null);
        setField(term19315, term19315.getClass(), "minSize", null);
        setBooleanField(term19315, term19315.getClass(), "minSizeSet", false);
        setField(term19315, term19315.getClass(), "prefSize", null);
        setBooleanField(term19315, term19315.getClass(), "prefSizeSet", false);
        setField(term19315, term19315.getClass(), "maxSize", null);
        setBooleanField(term19315, term19315.getClass(), "maxSizeSet", false);
        setField(term19315, term19315.getClass(), "componentOrientation", null);
        setBooleanField(term19315, term19315.getClass(), "newEventsOnly", false);
        setField(term19315, term19315.getClass(), "componentListener", null);
        setField(term19315, term19315.getClass(), "focusListener", null);
        setField(term19315, term19315.getClass(), "hierarchyListener", null);
        setField(term19315, term19315.getClass(), "hierarchyBoundsListener", null);
        setField(term19315, term19315.getClass(), "keyListener", null);
        setField(term19315, term19315.getClass(), "mouseListener", null);
        setField(term19315, term19315.getClass(), "mouseMotionListener", null);
        setField(term19315, term19315.getClass(), "mouseWheelListener", null);
        setField(term19315, term19315.getClass(), "inputMethodListener", null);
        setLongField(term19315, term19315.getClass(), "eventMask", 0L);
        setField(term19315, term19315.getClass(), "changeSupport", null);
        setField(term19315, term19315.getClass(), "objectLock", null);
        setBooleanField(term19315, term19315.getClass(), "isPacked", false);
        setIntField(term19315, term19315.getClass(), "boundsOp", 0);
        setField(term19315, term19315.getClass(), "compoundShape", null);
        setField(term19315, term19315.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term19315, term19315.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term19315, term19315.getClass(), "backgroundEraseDisabled", false);
        setField(term19315, term19315.getClass(), "eventCache", null);
        setBooleanField(term19315, term19315.getClass(), "coalescingEnabled", false);
        setBooleanField(term19315, term19315.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term19315, term19315.getClass(), "componentSerializedDataVersion", 0);
        setField(term19315, term19315.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.buttons.ComponentButton");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isUsed", argTypes, term19315, args);
    }

};


