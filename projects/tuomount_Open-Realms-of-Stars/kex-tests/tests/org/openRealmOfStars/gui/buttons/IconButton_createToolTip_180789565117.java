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

public class IconButton_createToolTip_180789565117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1980;

    public IconButton_createToolTip_180789565117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1980 = newInstance(Class.forName("org.openRealmOfStars.gui.buttons.IconButton"));
        setField(term1980, term1980.getClass(), "notPressedImage", null);
        setField(term1980, term1980.getClass(), "pressedImage", null);
        setField(term1980, term1980.getClass(), "disabledImage", null);
        setField(term1980, term1980.getClass(), "rollOverImage", null);
        setBooleanField(term1980, term1980.getClass(), "border", false);
        setField(term1980, term1980.getClass(), "parent", null);
        setField(term1980, term1980.getClass(), "model", null);
        setField(term1980, term1980.getClass(), "text", null);
        setField(term1980, term1980.getClass(), "margin", null);
        setField(term1980, term1980.getClass(), "defaultMargin", null);
        setField(term1980, term1980.getClass(), "defaultIcon", null);
        setField(term1980, term1980.getClass(), "pressedIcon", null);
        setField(term1980, term1980.getClass(), "disabledIcon", null);
        setField(term1980, term1980.getClass(), "selectedIcon", null);
        setField(term1980, term1980.getClass(), "disabledSelectedIcon", null);
        setField(term1980, term1980.getClass(), "rolloverIcon", null);
        setField(term1980, term1980.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term1980, term1980.getClass(), "paintBorder", false);
        setBooleanField(term1980, term1980.getClass(), "paintFocus", false);
        setBooleanField(term1980, term1980.getClass(), "rolloverEnabled", false);
        setBooleanField(term1980, term1980.getClass(), "contentAreaFilled", false);
        setIntField(term1980, term1980.getClass(), "verticalAlignment", 0);
        setIntField(term1980, term1980.getClass(), "horizontalAlignment", 0);
        setIntField(term1980, term1980.getClass(), "verticalTextPosition", 0);
        setIntField(term1980, term1980.getClass(), "horizontalTextPosition", 0);
        setIntField(term1980, term1980.getClass(), "iconTextGap", 0);
        setIntField(term1980, term1980.getClass(), "mnemonic", 0);
        setIntField(term1980, term1980.getClass(), "mnemonicIndex", 0);
        setLongField(term1980, term1980.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term1980, term1980.getClass(), "borderPaintedSet", false);
        setBooleanField(term1980, term1980.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term1980, term1980.getClass(), "iconTextGapSet", false);
        setBooleanField(term1980, term1980.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term1980, term1980.getClass(), "setLayout", false);
        setBooleanField(term1980, term1980.getClass(), "defaultCapable", false);
        setField(term1980, term1980.getClass(), "handler", null);
        setField(term1980, term1980.getClass(), "changeListener", null);
        setField(term1980, term1980.getClass(), "actionListener", null);
        setField(term1980, term1980.getClass(), "itemListener", null);
        setField(term1980, term1980.getClass(), "changeEvent", null);
        setBooleanField(term1980, term1980.getClass(), "hideActionText", false);
        setField(term1980, term1980.getClass(), "action", null);
        setField(term1980, term1980.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term1980, term1980.getClass(), "isAlignmentXSet", false);
        setFloatField(term1980, term1980.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1980, term1980.getClass(), "isAlignmentYSet", false);
        setFloatField(term1980, term1980.getClass(), "alignmentY", 0.0F);
        setField(term1980, term1980.getClass(), "ui", null);
        setField(term1980, term1980.getClass(), "listenerList", null);
        setField(term1980, term1980.getClass(), "clientProperties", null);
        setField(term1980, term1980.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1980, term1980.getClass(), "autoscrolls", false);
        setField(term1980, term1980.getClass(), "border", null);
        setIntField(term1980, term1980.getClass(), "flags", 0);
        setField(term1980, term1980.getClass(), "inputVerifier", null);
        setBooleanField(term1980, term1980.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1980, term1980.getClass(), "paintingChild", null);
        setField(term1980, term1980.getClass(), "popupMenu", null);
        setField(term1980, term1980.getClass(), "revalidateRunnableScheduled", null);
        setField(term1980, term1980.getClass(), "focusInputMap", null);
        setField(term1980, term1980.getClass(), "ancestorInputMap", null);
        setField(term1980, term1980.getClass(), "windowInputMap", null);
        setField(term1980, term1980.getClass(), "actionMap", null);
        setField(term1980, term1980.getClass(), "aaHint", null);
        setField(term1980, term1980.getClass(), "lcdRenderingHint", null);
        setField(term1980, term1980.getClass(), "component", null);
        setField(term1980, term1980.getClass(), "layoutMgr", null);
        setField(term1980, term1980.getClass(), "dispatcher", null);
        setField(term1980, term1980.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1980, term1980.getClass(), "focusCycleRoot", false);
        setBooleanField(term1980, term1980.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1980, term1980.getClass(), "printingThreads", null);
        setBooleanField(term1980, term1980.getClass(), "printing", false);
        setField(term1980, term1980.getClass(), "containerListener", null);
        setIntField(term1980, term1980.getClass(), "listeningChildren", 0);
        setIntField(term1980, term1980.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1980, term1980.getClass(), "descendantsCount", 0);
        setField(term1980, term1980.getClass(), "preserveBackgroundColor", null);
        setIntField(term1980, term1980.getClass(), "numOfHWComponents", 0);
        setIntField(term1980, term1980.getClass(), "numOfLWComponents", 0);
        setField(term1980, term1980.getClass(), "modalComp", null);
        setField(term1980, term1980.getClass(), "modalAppContext", null);
        setIntField(term1980, term1980.getClass(), "containerSerializedDataVersion", 0);
        setField(term1980, term1980.getClass(), "peer", null);
        setField(term1980, term1980.getClass(), "parent", null);
        setField(term1980, term1980.getClass(), "appContext", null);
        setIntField(term1980, term1980.getClass(), "x", 0);
        setIntField(term1980, term1980.getClass(), "y", 0);
        setIntField(term1980, term1980.getClass(), "width", 0);
        setIntField(term1980, term1980.getClass(), "height", 0);
        setField(term1980, term1980.getClass(), "foreground", null);
        setField(term1980, term1980.getClass(), "background", null);
        setField(term1980, term1980.getClass(), "font", null);
        setField(term1980, term1980.getClass(), "peerFont", null);
        setField(term1980, term1980.getClass(), "cursor", null);
        setField(term1980, term1980.getClass(), "locale", null);
        setField(term1980, term1980.getClass(), "graphicsConfig", null);
        setField(term1980, term1980.getClass(), "bufferStrategy", null);
        setBooleanField(term1980, term1980.getClass(), "ignoreRepaint", false);
        setBooleanField(term1980, term1980.getClass(), "visible", false);
        setBooleanField(term1980, term1980.getClass(), "enabled", false);
        setBooleanField(term1980, term1980.getClass(), "valid", false);
        setField(term1980, term1980.getClass(), "dropTarget", null);
        setField(term1980, term1980.getClass(), "popups", null);
        setField(term1980, term1980.getClass(), "name", null);
        setBooleanField(term1980, term1980.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1980, term1980.getClass(), "focusable", false);
        setIntField(term1980, term1980.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1980, term1980.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1980, term1980.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1980, term1980.getClass(), "acc", null);
        setField(term1980, term1980.getClass(), "minSize", null);
        setBooleanField(term1980, term1980.getClass(), "minSizeSet", false);
        setField(term1980, term1980.getClass(), "prefSize", null);
        setBooleanField(term1980, term1980.getClass(), "prefSizeSet", false);
        setField(term1980, term1980.getClass(), "maxSize", null);
        setBooleanField(term1980, term1980.getClass(), "maxSizeSet", false);
        setField(term1980, term1980.getClass(), "componentOrientation", null);
        setBooleanField(term1980, term1980.getClass(), "newEventsOnly", false);
        setField(term1980, term1980.getClass(), "componentListener", null);
        setField(term1980, term1980.getClass(), "focusListener", null);
        setField(term1980, term1980.getClass(), "hierarchyListener", null);
        setField(term1980, term1980.getClass(), "hierarchyBoundsListener", null);
        setField(term1980, term1980.getClass(), "keyListener", null);
        setField(term1980, term1980.getClass(), "mouseListener", null);
        setField(term1980, term1980.getClass(), "mouseMotionListener", null);
        setField(term1980, term1980.getClass(), "mouseWheelListener", null);
        setField(term1980, term1980.getClass(), "inputMethodListener", null);
        setLongField(term1980, term1980.getClass(), "eventMask", 0L);
        setField(term1980, term1980.getClass(), "changeSupport", null);
        setField(term1980, term1980.getClass(), "objectLock", null);
        setBooleanField(term1980, term1980.getClass(), "isPacked", false);
        setIntField(term1980, term1980.getClass(), "boundsOp", 0);
        setField(term1980, term1980.getClass(), "compoundShape", null);
        setField(term1980, term1980.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1980, term1980.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1980, term1980.getClass(), "backgroundEraseDisabled", false);
        setField(term1980, term1980.getClass(), "eventCache", null);
        setBooleanField(term1980, term1980.getClass(), "coalescingEnabled", false);
        setBooleanField(term1980, term1980.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1980, term1980.getClass(), "componentSerializedDataVersion", 0);
        setField(term1980, term1980.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.buttons.IconButton");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term1980, args);
    }

};


