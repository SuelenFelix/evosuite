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

public class SpaceButton_getSpaceIcon_15041434488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3451;

    public SpaceButton_getSpaceIcon_15041434488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3451 = newInstance(Class.forName("org.openRealmOfStars.gui.buttons.SpaceButton"));
        setField(term3451, term3451.getClass(), "icon", null);
        setField(term3451, term3451.getClass(), "model", null);
        setField(term3451, term3451.getClass(), "text", null);
        setField(term3451, term3451.getClass(), "margin", null);
        setField(term3451, term3451.getClass(), "defaultMargin", null);
        setField(term3451, term3451.getClass(), "defaultIcon", null);
        setField(term3451, term3451.getClass(), "pressedIcon", null);
        setField(term3451, term3451.getClass(), "disabledIcon", null);
        setField(term3451, term3451.getClass(), "selectedIcon", null);
        setField(term3451, term3451.getClass(), "disabledSelectedIcon", null);
        setField(term3451, term3451.getClass(), "rolloverIcon", null);
        setField(term3451, term3451.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term3451, term3451.getClass(), "paintBorder", false);
        setBooleanField(term3451, term3451.getClass(), "paintFocus", false);
        setBooleanField(term3451, term3451.getClass(), "rolloverEnabled", false);
        setBooleanField(term3451, term3451.getClass(), "contentAreaFilled", false);
        setIntField(term3451, term3451.getClass(), "verticalAlignment", 0);
        setIntField(term3451, term3451.getClass(), "horizontalAlignment", 0);
        setIntField(term3451, term3451.getClass(), "verticalTextPosition", 0);
        setIntField(term3451, term3451.getClass(), "horizontalTextPosition", 0);
        setIntField(term3451, term3451.getClass(), "iconTextGap", 0);
        setIntField(term3451, term3451.getClass(), "mnemonic", 0);
        setIntField(term3451, term3451.getClass(), "mnemonicIndex", 0);
        setLongField(term3451, term3451.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term3451, term3451.getClass(), "borderPaintedSet", false);
        setBooleanField(term3451, term3451.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term3451, term3451.getClass(), "iconTextGapSet", false);
        setBooleanField(term3451, term3451.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term3451, term3451.getClass(), "setLayout", false);
        setBooleanField(term3451, term3451.getClass(), "defaultCapable", false);
        setField(term3451, term3451.getClass(), "handler", null);
        setField(term3451, term3451.getClass(), "changeListener", null);
        setField(term3451, term3451.getClass(), "actionListener", null);
        setField(term3451, term3451.getClass(), "itemListener", null);
        setField(term3451, term3451.getClass(), "changeEvent", null);
        setBooleanField(term3451, term3451.getClass(), "hideActionText", false);
        setField(term3451, term3451.getClass(), "action", null);
        setField(term3451, term3451.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term3451, term3451.getClass(), "isAlignmentXSet", false);
        setFloatField(term3451, term3451.getClass(), "alignmentX", 0.0F);
        setBooleanField(term3451, term3451.getClass(), "isAlignmentYSet", false);
        setFloatField(term3451, term3451.getClass(), "alignmentY", 0.0F);
        setField(term3451, term3451.getClass(), "ui", null);
        setField(term3451, term3451.getClass(), "listenerList", null);
        setField(term3451, term3451.getClass(), "clientProperties", null);
        setField(term3451, term3451.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term3451, term3451.getClass(), "autoscrolls", false);
        setField(term3451, term3451.getClass(), "border", null);
        setIntField(term3451, term3451.getClass(), "flags", 0);
        setField(term3451, term3451.getClass(), "inputVerifier", null);
        setBooleanField(term3451, term3451.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term3451, term3451.getClass(), "paintingChild", null);
        setField(term3451, term3451.getClass(), "popupMenu", null);
        setField(term3451, term3451.getClass(), "revalidateRunnableScheduled", null);
        setField(term3451, term3451.getClass(), "focusInputMap", null);
        setField(term3451, term3451.getClass(), "ancestorInputMap", null);
        setField(term3451, term3451.getClass(), "windowInputMap", null);
        setField(term3451, term3451.getClass(), "actionMap", null);
        setField(term3451, term3451.getClass(), "aaHint", null);
        setField(term3451, term3451.getClass(), "lcdRenderingHint", null);
        setField(term3451, term3451.getClass(), "component", null);
        setField(term3451, term3451.getClass(), "layoutMgr", null);
        setField(term3451, term3451.getClass(), "dispatcher", null);
        setField(term3451, term3451.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term3451, term3451.getClass(), "focusCycleRoot", false);
        setBooleanField(term3451, term3451.getClass(), "focusTraversalPolicyProvider", false);
        setField(term3451, term3451.getClass(), "printingThreads", null);
        setBooleanField(term3451, term3451.getClass(), "printing", false);
        setField(term3451, term3451.getClass(), "containerListener", null);
        setIntField(term3451, term3451.getClass(), "listeningChildren", 0);
        setIntField(term3451, term3451.getClass(), "listeningBoundsChildren", 0);
        setIntField(term3451, term3451.getClass(), "descendantsCount", 0);
        setField(term3451, term3451.getClass(), "preserveBackgroundColor", null);
        setIntField(term3451, term3451.getClass(), "numOfHWComponents", 0);
        setIntField(term3451, term3451.getClass(), "numOfLWComponents", 0);
        setField(term3451, term3451.getClass(), "modalComp", null);
        setField(term3451, term3451.getClass(), "modalAppContext", null);
        setIntField(term3451, term3451.getClass(), "containerSerializedDataVersion", 0);
        setField(term3451, term3451.getClass(), "peer", null);
        setField(term3451, term3451.getClass(), "parent", null);
        setField(term3451, term3451.getClass(), "appContext", null);
        setIntField(term3451, term3451.getClass(), "x", 0);
        setIntField(term3451, term3451.getClass(), "y", 0);
        setIntField(term3451, term3451.getClass(), "width", 0);
        setIntField(term3451, term3451.getClass(), "height", 0);
        setField(term3451, term3451.getClass(), "foreground", null);
        setField(term3451, term3451.getClass(), "background", null);
        setField(term3451, term3451.getClass(), "font", null);
        setField(term3451, term3451.getClass(), "peerFont", null);
        setField(term3451, term3451.getClass(), "cursor", null);
        setField(term3451, term3451.getClass(), "locale", null);
        setField(term3451, term3451.getClass(), "graphicsConfig", null);
        setField(term3451, term3451.getClass(), "bufferStrategy", null);
        setBooleanField(term3451, term3451.getClass(), "ignoreRepaint", false);
        setBooleanField(term3451, term3451.getClass(), "visible", false);
        setBooleanField(term3451, term3451.getClass(), "enabled", false);
        setBooleanField(term3451, term3451.getClass(), "valid", false);
        setField(term3451, term3451.getClass(), "dropTarget", null);
        setField(term3451, term3451.getClass(), "popups", null);
        setField(term3451, term3451.getClass(), "name", null);
        setBooleanField(term3451, term3451.getClass(), "nameExplicitlySet", false);
        setBooleanField(term3451, term3451.getClass(), "focusable", false);
        setIntField(term3451, term3451.getClass(), "isFocusTraversableOverridden", 0);
        setField(term3451, term3451.getClass(), "focusTraversalKeys", null);
        setBooleanField(term3451, term3451.getClass(), "focusTraversalKeysEnabled", false);
        setField(term3451, term3451.getClass(), "acc", null);
        setField(term3451, term3451.getClass(), "minSize", null);
        setBooleanField(term3451, term3451.getClass(), "minSizeSet", false);
        setField(term3451, term3451.getClass(), "prefSize", null);
        setBooleanField(term3451, term3451.getClass(), "prefSizeSet", false);
        setField(term3451, term3451.getClass(), "maxSize", null);
        setBooleanField(term3451, term3451.getClass(), "maxSizeSet", false);
        setField(term3451, term3451.getClass(), "componentOrientation", null);
        setBooleanField(term3451, term3451.getClass(), "newEventsOnly", false);
        setField(term3451, term3451.getClass(), "componentListener", null);
        setField(term3451, term3451.getClass(), "focusListener", null);
        setField(term3451, term3451.getClass(), "hierarchyListener", null);
        setField(term3451, term3451.getClass(), "hierarchyBoundsListener", null);
        setField(term3451, term3451.getClass(), "keyListener", null);
        setField(term3451, term3451.getClass(), "mouseListener", null);
        setField(term3451, term3451.getClass(), "mouseMotionListener", null);
        setField(term3451, term3451.getClass(), "mouseWheelListener", null);
        setField(term3451, term3451.getClass(), "inputMethodListener", null);
        setLongField(term3451, term3451.getClass(), "eventMask", 0L);
        setField(term3451, term3451.getClass(), "changeSupport", null);
        setField(term3451, term3451.getClass(), "objectLock", null);
        setBooleanField(term3451, term3451.getClass(), "isPacked", false);
        setIntField(term3451, term3451.getClass(), "boundsOp", 0);
        setField(term3451, term3451.getClass(), "compoundShape", null);
        setField(term3451, term3451.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term3451, term3451.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term3451, term3451.getClass(), "backgroundEraseDisabled", false);
        setField(term3451, term3451.getClass(), "eventCache", null);
        setBooleanField(term3451, term3451.getClass(), "coalescingEnabled", false);
        setBooleanField(term3451, term3451.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term3451, term3451.getClass(), "componentSerializedDataVersion", 0);
        setField(term3451, term3451.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.buttons.SpaceButton");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSpaceIcon", argTypes, term3451, args);
    }

};


