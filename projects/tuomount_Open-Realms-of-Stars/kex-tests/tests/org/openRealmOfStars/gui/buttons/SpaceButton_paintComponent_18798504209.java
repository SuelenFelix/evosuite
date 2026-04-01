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

public class SpaceButton_paintComponent_18798504209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3511;

    public SpaceButton_paintComponent_18798504209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3511 = newInstance(Class.forName("org.openRealmOfStars.gui.buttons.SpaceButton"));
        setField(term3511, term3511.getClass(), "icon", null);
        setField(term3511, term3511.getClass(), "model", null);
        setField(term3511, term3511.getClass(), "text", null);
        setField(term3511, term3511.getClass(), "margin", null);
        setField(term3511, term3511.getClass(), "defaultMargin", null);
        setField(term3511, term3511.getClass(), "defaultIcon", null);
        setField(term3511, term3511.getClass(), "pressedIcon", null);
        setField(term3511, term3511.getClass(), "disabledIcon", null);
        setField(term3511, term3511.getClass(), "selectedIcon", null);
        setField(term3511, term3511.getClass(), "disabledSelectedIcon", null);
        setField(term3511, term3511.getClass(), "rolloverIcon", null);
        setField(term3511, term3511.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term3511, term3511.getClass(), "paintBorder", false);
        setBooleanField(term3511, term3511.getClass(), "paintFocus", false);
        setBooleanField(term3511, term3511.getClass(), "rolloverEnabled", false);
        setBooleanField(term3511, term3511.getClass(), "contentAreaFilled", false);
        setIntField(term3511, term3511.getClass(), "verticalAlignment", 0);
        setIntField(term3511, term3511.getClass(), "horizontalAlignment", 0);
        setIntField(term3511, term3511.getClass(), "verticalTextPosition", 0);
        setIntField(term3511, term3511.getClass(), "horizontalTextPosition", 0);
        setIntField(term3511, term3511.getClass(), "iconTextGap", 0);
        setIntField(term3511, term3511.getClass(), "mnemonic", 0);
        setIntField(term3511, term3511.getClass(), "mnemonicIndex", 0);
        setLongField(term3511, term3511.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term3511, term3511.getClass(), "borderPaintedSet", false);
        setBooleanField(term3511, term3511.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term3511, term3511.getClass(), "iconTextGapSet", false);
        setBooleanField(term3511, term3511.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term3511, term3511.getClass(), "setLayout", false);
        setBooleanField(term3511, term3511.getClass(), "defaultCapable", false);
        setField(term3511, term3511.getClass(), "handler", null);
        setField(term3511, term3511.getClass(), "changeListener", null);
        setField(term3511, term3511.getClass(), "actionListener", null);
        setField(term3511, term3511.getClass(), "itemListener", null);
        setField(term3511, term3511.getClass(), "changeEvent", null);
        setBooleanField(term3511, term3511.getClass(), "hideActionText", false);
        setField(term3511, term3511.getClass(), "action", null);
        setField(term3511, term3511.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term3511, term3511.getClass(), "isAlignmentXSet", false);
        setFloatField(term3511, term3511.getClass(), "alignmentX", 0.0F);
        setBooleanField(term3511, term3511.getClass(), "isAlignmentYSet", false);
        setFloatField(term3511, term3511.getClass(), "alignmentY", 0.0F);
        setField(term3511, term3511.getClass(), "ui", null);
        setField(term3511, term3511.getClass(), "listenerList", null);
        setField(term3511, term3511.getClass(), "clientProperties", null);
        setField(term3511, term3511.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term3511, term3511.getClass(), "autoscrolls", false);
        setField(term3511, term3511.getClass(), "border", null);
        setIntField(term3511, term3511.getClass(), "flags", 0);
        setField(term3511, term3511.getClass(), "inputVerifier", null);
        setBooleanField(term3511, term3511.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term3511, term3511.getClass(), "paintingChild", null);
        setField(term3511, term3511.getClass(), "popupMenu", null);
        setField(term3511, term3511.getClass(), "revalidateRunnableScheduled", null);
        setField(term3511, term3511.getClass(), "focusInputMap", null);
        setField(term3511, term3511.getClass(), "ancestorInputMap", null);
        setField(term3511, term3511.getClass(), "windowInputMap", null);
        setField(term3511, term3511.getClass(), "actionMap", null);
        setField(term3511, term3511.getClass(), "aaHint", null);
        setField(term3511, term3511.getClass(), "lcdRenderingHint", null);
        setField(term3511, term3511.getClass(), "component", null);
        setField(term3511, term3511.getClass(), "layoutMgr", null);
        setField(term3511, term3511.getClass(), "dispatcher", null);
        setField(term3511, term3511.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term3511, term3511.getClass(), "focusCycleRoot", false);
        setBooleanField(term3511, term3511.getClass(), "focusTraversalPolicyProvider", false);
        setField(term3511, term3511.getClass(), "printingThreads", null);
        setBooleanField(term3511, term3511.getClass(), "printing", false);
        setField(term3511, term3511.getClass(), "containerListener", null);
        setIntField(term3511, term3511.getClass(), "listeningChildren", 0);
        setIntField(term3511, term3511.getClass(), "listeningBoundsChildren", 0);
        setIntField(term3511, term3511.getClass(), "descendantsCount", 0);
        setField(term3511, term3511.getClass(), "preserveBackgroundColor", null);
        setIntField(term3511, term3511.getClass(), "numOfHWComponents", 0);
        setIntField(term3511, term3511.getClass(), "numOfLWComponents", 0);
        setField(term3511, term3511.getClass(), "modalComp", null);
        setField(term3511, term3511.getClass(), "modalAppContext", null);
        setIntField(term3511, term3511.getClass(), "containerSerializedDataVersion", 0);
        setField(term3511, term3511.getClass(), "peer", null);
        setField(term3511, term3511.getClass(), "parent", null);
        setField(term3511, term3511.getClass(), "appContext", null);
        setIntField(term3511, term3511.getClass(), "x", 0);
        setIntField(term3511, term3511.getClass(), "y", 0);
        setIntField(term3511, term3511.getClass(), "width", 0);
        setIntField(term3511, term3511.getClass(), "height", 0);
        setField(term3511, term3511.getClass(), "foreground", null);
        setField(term3511, term3511.getClass(), "background", null);
        setField(term3511, term3511.getClass(), "font", null);
        setField(term3511, term3511.getClass(), "peerFont", null);
        setField(term3511, term3511.getClass(), "cursor", null);
        setField(term3511, term3511.getClass(), "locale", null);
        setField(term3511, term3511.getClass(), "graphicsConfig", null);
        setField(term3511, term3511.getClass(), "bufferStrategy", null);
        setBooleanField(term3511, term3511.getClass(), "ignoreRepaint", false);
        setBooleanField(term3511, term3511.getClass(), "visible", false);
        setBooleanField(term3511, term3511.getClass(), "enabled", false);
        setBooleanField(term3511, term3511.getClass(), "valid", false);
        setField(term3511, term3511.getClass(), "dropTarget", null);
        setField(term3511, term3511.getClass(), "popups", null);
        setField(term3511, term3511.getClass(), "name", null);
        setBooleanField(term3511, term3511.getClass(), "nameExplicitlySet", false);
        setBooleanField(term3511, term3511.getClass(), "focusable", false);
        setIntField(term3511, term3511.getClass(), "isFocusTraversableOverridden", 0);
        setField(term3511, term3511.getClass(), "focusTraversalKeys", null);
        setBooleanField(term3511, term3511.getClass(), "focusTraversalKeysEnabled", false);
        setField(term3511, term3511.getClass(), "acc", null);
        setField(term3511, term3511.getClass(), "minSize", null);
        setBooleanField(term3511, term3511.getClass(), "minSizeSet", false);
        setField(term3511, term3511.getClass(), "prefSize", null);
        setBooleanField(term3511, term3511.getClass(), "prefSizeSet", false);
        setField(term3511, term3511.getClass(), "maxSize", null);
        setBooleanField(term3511, term3511.getClass(), "maxSizeSet", false);
        setField(term3511, term3511.getClass(), "componentOrientation", null);
        setBooleanField(term3511, term3511.getClass(), "newEventsOnly", false);
        setField(term3511, term3511.getClass(), "componentListener", null);
        setField(term3511, term3511.getClass(), "focusListener", null);
        setField(term3511, term3511.getClass(), "hierarchyListener", null);
        setField(term3511, term3511.getClass(), "hierarchyBoundsListener", null);
        setField(term3511, term3511.getClass(), "keyListener", null);
        setField(term3511, term3511.getClass(), "mouseListener", null);
        setField(term3511, term3511.getClass(), "mouseMotionListener", null);
        setField(term3511, term3511.getClass(), "mouseWheelListener", null);
        setField(term3511, term3511.getClass(), "inputMethodListener", null);
        setLongField(term3511, term3511.getClass(), "eventMask", 0L);
        setField(term3511, term3511.getClass(), "changeSupport", null);
        setField(term3511, term3511.getClass(), "objectLock", null);
        setBooleanField(term3511, term3511.getClass(), "isPacked", false);
        setIntField(term3511, term3511.getClass(), "boundsOp", 0);
        setField(term3511, term3511.getClass(), "compoundShape", null);
        setField(term3511, term3511.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term3511, term3511.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term3511, term3511.getClass(), "backgroundEraseDisabled", false);
        setField(term3511, term3511.getClass(), "eventCache", null);
        setBooleanField(term3511, term3511.getClass(), "coalescingEnabled", false);
        setBooleanField(term3511, term3511.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term3511, term3511.getClass(), "componentSerializedDataVersion", 0);
        setField(term3511, term3511.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.buttons.SpaceButton");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Graphics");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "paintComponent", argTypes, term3511, args);
    }

};


