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

public class SpaceButton_createToolTip_2018527826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3331;

    public SpaceButton_createToolTip_2018527826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3331 = newInstance(Class.forName("org.openRealmOfStars.gui.buttons.SpaceButton"));
        setField(term3331, term3331.getClass(), "icon", null);
        setField(term3331, term3331.getClass(), "model", null);
        setField(term3331, term3331.getClass(), "text", null);
        setField(term3331, term3331.getClass(), "margin", null);
        setField(term3331, term3331.getClass(), "defaultMargin", null);
        setField(term3331, term3331.getClass(), "defaultIcon", null);
        setField(term3331, term3331.getClass(), "pressedIcon", null);
        setField(term3331, term3331.getClass(), "disabledIcon", null);
        setField(term3331, term3331.getClass(), "selectedIcon", null);
        setField(term3331, term3331.getClass(), "disabledSelectedIcon", null);
        setField(term3331, term3331.getClass(), "rolloverIcon", null);
        setField(term3331, term3331.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term3331, term3331.getClass(), "paintBorder", false);
        setBooleanField(term3331, term3331.getClass(), "paintFocus", false);
        setBooleanField(term3331, term3331.getClass(), "rolloverEnabled", false);
        setBooleanField(term3331, term3331.getClass(), "contentAreaFilled", false);
        setIntField(term3331, term3331.getClass(), "verticalAlignment", 0);
        setIntField(term3331, term3331.getClass(), "horizontalAlignment", 0);
        setIntField(term3331, term3331.getClass(), "verticalTextPosition", 0);
        setIntField(term3331, term3331.getClass(), "horizontalTextPosition", 0);
        setIntField(term3331, term3331.getClass(), "iconTextGap", 0);
        setIntField(term3331, term3331.getClass(), "mnemonic", 0);
        setIntField(term3331, term3331.getClass(), "mnemonicIndex", 0);
        setLongField(term3331, term3331.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term3331, term3331.getClass(), "borderPaintedSet", false);
        setBooleanField(term3331, term3331.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term3331, term3331.getClass(), "iconTextGapSet", false);
        setBooleanField(term3331, term3331.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term3331, term3331.getClass(), "setLayout", false);
        setBooleanField(term3331, term3331.getClass(), "defaultCapable", false);
        setField(term3331, term3331.getClass(), "handler", null);
        setField(term3331, term3331.getClass(), "changeListener", null);
        setField(term3331, term3331.getClass(), "actionListener", null);
        setField(term3331, term3331.getClass(), "itemListener", null);
        setField(term3331, term3331.getClass(), "changeEvent", null);
        setBooleanField(term3331, term3331.getClass(), "hideActionText", false);
        setField(term3331, term3331.getClass(), "action", null);
        setField(term3331, term3331.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term3331, term3331.getClass(), "isAlignmentXSet", false);
        setFloatField(term3331, term3331.getClass(), "alignmentX", 0.0F);
        setBooleanField(term3331, term3331.getClass(), "isAlignmentYSet", false);
        setFloatField(term3331, term3331.getClass(), "alignmentY", 0.0F);
        setField(term3331, term3331.getClass(), "ui", null);
        setField(term3331, term3331.getClass(), "listenerList", null);
        setField(term3331, term3331.getClass(), "clientProperties", null);
        setField(term3331, term3331.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term3331, term3331.getClass(), "autoscrolls", false);
        setField(term3331, term3331.getClass(), "border", null);
        setIntField(term3331, term3331.getClass(), "flags", 0);
        setField(term3331, term3331.getClass(), "inputVerifier", null);
        setBooleanField(term3331, term3331.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term3331, term3331.getClass(), "paintingChild", null);
        setField(term3331, term3331.getClass(), "popupMenu", null);
        setField(term3331, term3331.getClass(), "revalidateRunnableScheduled", null);
        setField(term3331, term3331.getClass(), "focusInputMap", null);
        setField(term3331, term3331.getClass(), "ancestorInputMap", null);
        setField(term3331, term3331.getClass(), "windowInputMap", null);
        setField(term3331, term3331.getClass(), "actionMap", null);
        setField(term3331, term3331.getClass(), "aaHint", null);
        setField(term3331, term3331.getClass(), "lcdRenderingHint", null);
        setField(term3331, term3331.getClass(), "component", null);
        setField(term3331, term3331.getClass(), "layoutMgr", null);
        setField(term3331, term3331.getClass(), "dispatcher", null);
        setField(term3331, term3331.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term3331, term3331.getClass(), "focusCycleRoot", false);
        setBooleanField(term3331, term3331.getClass(), "focusTraversalPolicyProvider", false);
        setField(term3331, term3331.getClass(), "printingThreads", null);
        setBooleanField(term3331, term3331.getClass(), "printing", false);
        setField(term3331, term3331.getClass(), "containerListener", null);
        setIntField(term3331, term3331.getClass(), "listeningChildren", 0);
        setIntField(term3331, term3331.getClass(), "listeningBoundsChildren", 0);
        setIntField(term3331, term3331.getClass(), "descendantsCount", 0);
        setField(term3331, term3331.getClass(), "preserveBackgroundColor", null);
        setIntField(term3331, term3331.getClass(), "numOfHWComponents", 0);
        setIntField(term3331, term3331.getClass(), "numOfLWComponents", 0);
        setField(term3331, term3331.getClass(), "modalComp", null);
        setField(term3331, term3331.getClass(), "modalAppContext", null);
        setIntField(term3331, term3331.getClass(), "containerSerializedDataVersion", 0);
        setField(term3331, term3331.getClass(), "peer", null);
        setField(term3331, term3331.getClass(), "parent", null);
        setField(term3331, term3331.getClass(), "appContext", null);
        setIntField(term3331, term3331.getClass(), "x", 0);
        setIntField(term3331, term3331.getClass(), "y", 0);
        setIntField(term3331, term3331.getClass(), "width", 0);
        setIntField(term3331, term3331.getClass(), "height", 0);
        setField(term3331, term3331.getClass(), "foreground", null);
        setField(term3331, term3331.getClass(), "background", null);
        setField(term3331, term3331.getClass(), "font", null);
        setField(term3331, term3331.getClass(), "peerFont", null);
        setField(term3331, term3331.getClass(), "cursor", null);
        setField(term3331, term3331.getClass(), "locale", null);
        setField(term3331, term3331.getClass(), "graphicsConfig", null);
        setField(term3331, term3331.getClass(), "bufferStrategy", null);
        setBooleanField(term3331, term3331.getClass(), "ignoreRepaint", false);
        setBooleanField(term3331, term3331.getClass(), "visible", false);
        setBooleanField(term3331, term3331.getClass(), "enabled", false);
        setBooleanField(term3331, term3331.getClass(), "valid", false);
        setField(term3331, term3331.getClass(), "dropTarget", null);
        setField(term3331, term3331.getClass(), "popups", null);
        setField(term3331, term3331.getClass(), "name", null);
        setBooleanField(term3331, term3331.getClass(), "nameExplicitlySet", false);
        setBooleanField(term3331, term3331.getClass(), "focusable", false);
        setIntField(term3331, term3331.getClass(), "isFocusTraversableOverridden", 0);
        setField(term3331, term3331.getClass(), "focusTraversalKeys", null);
        setBooleanField(term3331, term3331.getClass(), "focusTraversalKeysEnabled", false);
        setField(term3331, term3331.getClass(), "acc", null);
        setField(term3331, term3331.getClass(), "minSize", null);
        setBooleanField(term3331, term3331.getClass(), "minSizeSet", false);
        setField(term3331, term3331.getClass(), "prefSize", null);
        setBooleanField(term3331, term3331.getClass(), "prefSizeSet", false);
        setField(term3331, term3331.getClass(), "maxSize", null);
        setBooleanField(term3331, term3331.getClass(), "maxSizeSet", false);
        setField(term3331, term3331.getClass(), "componentOrientation", null);
        setBooleanField(term3331, term3331.getClass(), "newEventsOnly", false);
        setField(term3331, term3331.getClass(), "componentListener", null);
        setField(term3331, term3331.getClass(), "focusListener", null);
        setField(term3331, term3331.getClass(), "hierarchyListener", null);
        setField(term3331, term3331.getClass(), "hierarchyBoundsListener", null);
        setField(term3331, term3331.getClass(), "keyListener", null);
        setField(term3331, term3331.getClass(), "mouseListener", null);
        setField(term3331, term3331.getClass(), "mouseMotionListener", null);
        setField(term3331, term3331.getClass(), "mouseWheelListener", null);
        setField(term3331, term3331.getClass(), "inputMethodListener", null);
        setLongField(term3331, term3331.getClass(), "eventMask", 0L);
        setField(term3331, term3331.getClass(), "changeSupport", null);
        setField(term3331, term3331.getClass(), "objectLock", null);
        setBooleanField(term3331, term3331.getClass(), "isPacked", false);
        setIntField(term3331, term3331.getClass(), "boundsOp", 0);
        setField(term3331, term3331.getClass(), "compoundShape", null);
        setField(term3331, term3331.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term3331, term3331.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term3331, term3331.getClass(), "backgroundEraseDisabled", false);
        setField(term3331, term3331.getClass(), "eventCache", null);
        setBooleanField(term3331, term3331.getClass(), "coalescingEnabled", false);
        setBooleanField(term3331, term3331.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term3331, term3331.getClass(), "componentSerializedDataVersion", 0);
        setField(term3331, term3331.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.buttons.SpaceButton");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term3331, args);
    }

};


