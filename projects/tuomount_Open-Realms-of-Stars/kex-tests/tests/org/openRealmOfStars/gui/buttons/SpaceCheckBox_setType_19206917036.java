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
import java.lang.Integer;

public class SpaceCheckBox_setType_19206917036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20236;
     Object term20298;

    public SpaceCheckBox_setType_19206917036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20236 = newInstance(Class.forName("org.openRealmOfStars.gui.buttons.SpaceCheckBox"));
        setField(term20236, term20236.getClass(), "icon", null);
        setIntField(term20236, term20236.getClass(), "type", 0);
        setBooleanField(term20236, term20236.getClass(), "flat", false);
        setField(term20236, term20236.getClass(), "model", null);
        setField(term20236, term20236.getClass(), "text", null);
        setField(term20236, term20236.getClass(), "margin", null);
        setField(term20236, term20236.getClass(), "defaultMargin", null);
        setField(term20236, term20236.getClass(), "defaultIcon", null);
        setField(term20236, term20236.getClass(), "pressedIcon", null);
        setField(term20236, term20236.getClass(), "disabledIcon", null);
        setField(term20236, term20236.getClass(), "selectedIcon", null);
        setField(term20236, term20236.getClass(), "disabledSelectedIcon", null);
        setField(term20236, term20236.getClass(), "rolloverIcon", null);
        setField(term20236, term20236.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term20236, term20236.getClass(), "paintBorder", false);
        setBooleanField(term20236, term20236.getClass(), "paintFocus", false);
        setBooleanField(term20236, term20236.getClass(), "rolloverEnabled", false);
        setBooleanField(term20236, term20236.getClass(), "contentAreaFilled", false);
        setIntField(term20236, term20236.getClass(), "verticalAlignment", 0);
        setIntField(term20236, term20236.getClass(), "horizontalAlignment", 0);
        setIntField(term20236, term20236.getClass(), "verticalTextPosition", 0);
        setIntField(term20236, term20236.getClass(), "horizontalTextPosition", 0);
        setIntField(term20236, term20236.getClass(), "iconTextGap", 0);
        setIntField(term20236, term20236.getClass(), "mnemonic", 0);
        setIntField(term20236, term20236.getClass(), "mnemonicIndex", 0);
        setLongField(term20236, term20236.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term20236, term20236.getClass(), "borderPaintedSet", false);
        setBooleanField(term20236, term20236.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term20236, term20236.getClass(), "iconTextGapSet", false);
        setBooleanField(term20236, term20236.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term20236, term20236.getClass(), "setLayout", false);
        setBooleanField(term20236, term20236.getClass(), "defaultCapable", false);
        setField(term20236, term20236.getClass(), "handler", null);
        setField(term20236, term20236.getClass(), "changeListener", null);
        setField(term20236, term20236.getClass(), "actionListener", null);
        setField(term20236, term20236.getClass(), "itemListener", null);
        setField(term20236, term20236.getClass(), "changeEvent", null);
        setBooleanField(term20236, term20236.getClass(), "hideActionText", false);
        setField(term20236, term20236.getClass(), "action", null);
        setField(term20236, term20236.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term20236, term20236.getClass(), "isAlignmentXSet", false);
        setFloatField(term20236, term20236.getClass(), "alignmentX", 0.0F);
        setBooleanField(term20236, term20236.getClass(), "isAlignmentYSet", false);
        setFloatField(term20236, term20236.getClass(), "alignmentY", 0.0F);
        setField(term20236, term20236.getClass(), "ui", null);
        setField(term20236, term20236.getClass(), "listenerList", null);
        setField(term20236, term20236.getClass(), "clientProperties", null);
        setField(term20236, term20236.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term20236, term20236.getClass(), "autoscrolls", false);
        setField(term20236, term20236.getClass(), "border", null);
        setIntField(term20236, term20236.getClass(), "flags", 0);
        setField(term20236, term20236.getClass(), "inputVerifier", null);
        setBooleanField(term20236, term20236.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term20236, term20236.getClass(), "paintingChild", null);
        setField(term20236, term20236.getClass(), "popupMenu", null);
        setField(term20236, term20236.getClass(), "revalidateRunnableScheduled", null);
        setField(term20236, term20236.getClass(), "focusInputMap", null);
        setField(term20236, term20236.getClass(), "ancestorInputMap", null);
        setField(term20236, term20236.getClass(), "windowInputMap", null);
        setField(term20236, term20236.getClass(), "actionMap", null);
        setField(term20236, term20236.getClass(), "aaHint", null);
        setField(term20236, term20236.getClass(), "lcdRenderingHint", null);
        setField(term20236, term20236.getClass(), "component", null);
        setField(term20236, term20236.getClass(), "layoutMgr", null);
        setField(term20236, term20236.getClass(), "dispatcher", null);
        setField(term20236, term20236.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term20236, term20236.getClass(), "focusCycleRoot", false);
        setBooleanField(term20236, term20236.getClass(), "focusTraversalPolicyProvider", false);
        setField(term20236, term20236.getClass(), "printingThreads", null);
        setBooleanField(term20236, term20236.getClass(), "printing", false);
        setField(term20236, term20236.getClass(), "containerListener", null);
        setIntField(term20236, term20236.getClass(), "listeningChildren", 0);
        setIntField(term20236, term20236.getClass(), "listeningBoundsChildren", 0);
        setIntField(term20236, term20236.getClass(), "descendantsCount", 0);
        setField(term20236, term20236.getClass(), "preserveBackgroundColor", null);
        setIntField(term20236, term20236.getClass(), "numOfHWComponents", 0);
        setIntField(term20236, term20236.getClass(), "numOfLWComponents", 0);
        setField(term20236, term20236.getClass(), "modalComp", null);
        setField(term20236, term20236.getClass(), "modalAppContext", null);
        setIntField(term20236, term20236.getClass(), "containerSerializedDataVersion", 0);
        setField(term20236, term20236.getClass(), "peer", null);
        setField(term20236, term20236.getClass(), "parent", null);
        setField(term20236, term20236.getClass(), "appContext", null);
        setIntField(term20236, term20236.getClass(), "x", 0);
        setIntField(term20236, term20236.getClass(), "y", 0);
        setIntField(term20236, term20236.getClass(), "width", 0);
        setIntField(term20236, term20236.getClass(), "height", 0);
        setField(term20236, term20236.getClass(), "foreground", null);
        setField(term20236, term20236.getClass(), "background", null);
        setField(term20236, term20236.getClass(), "font", null);
        setField(term20236, term20236.getClass(), "peerFont", null);
        setField(term20236, term20236.getClass(), "cursor", null);
        setField(term20236, term20236.getClass(), "locale", null);
        setField(term20236, term20236.getClass(), "graphicsConfig", null);
        setField(term20236, term20236.getClass(), "bufferStrategy", null);
        setBooleanField(term20236, term20236.getClass(), "ignoreRepaint", false);
        setBooleanField(term20236, term20236.getClass(), "visible", false);
        setBooleanField(term20236, term20236.getClass(), "enabled", false);
        setBooleanField(term20236, term20236.getClass(), "valid", false);
        setField(term20236, term20236.getClass(), "dropTarget", null);
        setField(term20236, term20236.getClass(), "popups", null);
        setField(term20236, term20236.getClass(), "name", null);
        setBooleanField(term20236, term20236.getClass(), "nameExplicitlySet", false);
        setBooleanField(term20236, term20236.getClass(), "focusable", false);
        setIntField(term20236, term20236.getClass(), "isFocusTraversableOverridden", 0);
        setField(term20236, term20236.getClass(), "focusTraversalKeys", null);
        setBooleanField(term20236, term20236.getClass(), "focusTraversalKeysEnabled", false);
        setField(term20236, term20236.getClass(), "acc", null);
        setField(term20236, term20236.getClass(), "minSize", null);
        setBooleanField(term20236, term20236.getClass(), "minSizeSet", false);
        setField(term20236, term20236.getClass(), "prefSize", null);
        setBooleanField(term20236, term20236.getClass(), "prefSizeSet", false);
        setField(term20236, term20236.getClass(), "maxSize", null);
        setBooleanField(term20236, term20236.getClass(), "maxSizeSet", false);
        setField(term20236, term20236.getClass(), "componentOrientation", null);
        setBooleanField(term20236, term20236.getClass(), "newEventsOnly", false);
        setField(term20236, term20236.getClass(), "componentListener", null);
        setField(term20236, term20236.getClass(), "focusListener", null);
        setField(term20236, term20236.getClass(), "hierarchyListener", null);
        setField(term20236, term20236.getClass(), "hierarchyBoundsListener", null);
        setField(term20236, term20236.getClass(), "keyListener", null);
        setField(term20236, term20236.getClass(), "mouseListener", null);
        setField(term20236, term20236.getClass(), "mouseMotionListener", null);
        setField(term20236, term20236.getClass(), "mouseWheelListener", null);
        setField(term20236, term20236.getClass(), "inputMethodListener", null);
        setLongField(term20236, term20236.getClass(), "eventMask", 0L);
        setField(term20236, term20236.getClass(), "changeSupport", null);
        setField(term20236, term20236.getClass(), "objectLock", null);
        setBooleanField(term20236, term20236.getClass(), "isPacked", false);
        setIntField(term20236, term20236.getClass(), "boundsOp", 0);
        setField(term20236, term20236.getClass(), "compoundShape", null);
        setField(term20236, term20236.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term20236, term20236.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term20236, term20236.getClass(), "backgroundEraseDisabled", false);
        setField(term20236, term20236.getClass(), "eventCache", null);
        setBooleanField(term20236, term20236.getClass(), "coalescingEnabled", false);
        setBooleanField(term20236, term20236.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term20236, term20236.getClass(), "componentSerializedDataVersion", 0);
        setField(term20236, term20236.getClass(), "accessibleContext", null);
        term20298 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.buttons.SpaceCheckBox");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term20298;
        callMethod(klass, "setType", argTypes, term20236, args);
    }

};


