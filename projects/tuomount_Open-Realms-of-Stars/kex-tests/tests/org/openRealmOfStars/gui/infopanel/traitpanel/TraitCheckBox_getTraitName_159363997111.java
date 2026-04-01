package org.openRealmOfStars.gui.infopanel.traitpanel;

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
import static org.openRealmOfStars.gui.infopanel.traitpanel.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TraitCheckBox_getTraitName_159363997111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2284;

    public TraitCheckBox_getTraitName_159363997111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2284 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitCheckBox"));
        setField(term2284, term2284.getClass(), "id", null);
        setField(term2284, term2284.getClass(), "name", null);
        setField(term2284, term2284.getClass(), "description", null);
        setField(term2284, term2284.getClass(), "group", null);
        setField(term2284, term2284.getClass(), "conflictsWithId", null);
        setByteField(term2284, term2284.getClass(), "traitPoints", (byte) 0);
        setField(term2284, term2284.getClass(), "icon", null);
        setIntField(term2284, term2284.getClass(), "type", 0);
        setBooleanField(term2284, term2284.getClass(), "flat", false);
        setField(term2284, term2284.getClass(), "model", null);
        setField(term2284, term2284.getClass(), "text", null);
        setField(term2284, term2284.getClass(), "margin", null);
        setField(term2284, term2284.getClass(), "defaultMargin", null);
        setField(term2284, term2284.getClass(), "defaultIcon", null);
        setField(term2284, term2284.getClass(), "pressedIcon", null);
        setField(term2284, term2284.getClass(), "disabledIcon", null);
        setField(term2284, term2284.getClass(), "selectedIcon", null);
        setField(term2284, term2284.getClass(), "disabledSelectedIcon", null);
        setField(term2284, term2284.getClass(), "rolloverIcon", null);
        setField(term2284, term2284.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term2284, term2284.getClass(), "paintBorder", false);
        setBooleanField(term2284, term2284.getClass(), "paintFocus", false);
        setBooleanField(term2284, term2284.getClass(), "rolloverEnabled", false);
        setBooleanField(term2284, term2284.getClass(), "contentAreaFilled", false);
        setIntField(term2284, term2284.getClass(), "verticalAlignment", 0);
        setIntField(term2284, term2284.getClass(), "horizontalAlignment", 0);
        setIntField(term2284, term2284.getClass(), "verticalTextPosition", 0);
        setIntField(term2284, term2284.getClass(), "horizontalTextPosition", 0);
        setIntField(term2284, term2284.getClass(), "iconTextGap", 0);
        setIntField(term2284, term2284.getClass(), "mnemonic", 0);
        setIntField(term2284, term2284.getClass(), "mnemonicIndex", 0);
        setLongField(term2284, term2284.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term2284, term2284.getClass(), "borderPaintedSet", false);
        setBooleanField(term2284, term2284.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term2284, term2284.getClass(), "iconTextGapSet", false);
        setBooleanField(term2284, term2284.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term2284, term2284.getClass(), "setLayout", false);
        setBooleanField(term2284, term2284.getClass(), "defaultCapable", false);
        setField(term2284, term2284.getClass(), "handler", null);
        setField(term2284, term2284.getClass(), "changeListener", null);
        setField(term2284, term2284.getClass(), "actionListener", null);
        setField(term2284, term2284.getClass(), "itemListener", null);
        setField(term2284, term2284.getClass(), "changeEvent", null);
        setBooleanField(term2284, term2284.getClass(), "hideActionText", false);
        setField(term2284, term2284.getClass(), "action", null);
        setField(term2284, term2284.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term2284, term2284.getClass(), "isAlignmentXSet", false);
        setFloatField(term2284, term2284.getClass(), "alignmentX", 0.0F);
        setBooleanField(term2284, term2284.getClass(), "isAlignmentYSet", false);
        setFloatField(term2284, term2284.getClass(), "alignmentY", 0.0F);
        setField(term2284, term2284.getClass(), "ui", null);
        setField(term2284, term2284.getClass(), "listenerList", null);
        setField(term2284, term2284.getClass(), "clientProperties", null);
        setField(term2284, term2284.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term2284, term2284.getClass(), "autoscrolls", false);
        setField(term2284, term2284.getClass(), "border", null);
        setIntField(term2284, term2284.getClass(), "flags", 0);
        setField(term2284, term2284.getClass(), "inputVerifier", null);
        setBooleanField(term2284, term2284.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term2284, term2284.getClass(), "paintingChild", null);
        setField(term2284, term2284.getClass(), "popupMenu", null);
        setField(term2284, term2284.getClass(), "revalidateRunnableScheduled", null);
        setField(term2284, term2284.getClass(), "focusInputMap", null);
        setField(term2284, term2284.getClass(), "ancestorInputMap", null);
        setField(term2284, term2284.getClass(), "windowInputMap", null);
        setField(term2284, term2284.getClass(), "actionMap", null);
        setField(term2284, term2284.getClass(), "aaHint", null);
        setField(term2284, term2284.getClass(), "lcdRenderingHint", null);
        setField(term2284, term2284.getClass(), "component", null);
        setField(term2284, term2284.getClass(), "layoutMgr", null);
        setField(term2284, term2284.getClass(), "dispatcher", null);
        setField(term2284, term2284.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2284, term2284.getClass(), "focusCycleRoot", false);
        setBooleanField(term2284, term2284.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2284, term2284.getClass(), "printingThreads", null);
        setBooleanField(term2284, term2284.getClass(), "printing", false);
        setField(term2284, term2284.getClass(), "containerListener", null);
        setIntField(term2284, term2284.getClass(), "listeningChildren", 0);
        setIntField(term2284, term2284.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2284, term2284.getClass(), "descendantsCount", 0);
        setField(term2284, term2284.getClass(), "preserveBackgroundColor", null);
        setIntField(term2284, term2284.getClass(), "numOfHWComponents", 0);
        setIntField(term2284, term2284.getClass(), "numOfLWComponents", 0);
        setField(term2284, term2284.getClass(), "modalComp", null);
        setField(term2284, term2284.getClass(), "modalAppContext", null);
        setIntField(term2284, term2284.getClass(), "containerSerializedDataVersion", 0);
        setField(term2284, term2284.getClass(), "peer", null);
        setField(term2284, term2284.getClass(), "parent", null);
        setField(term2284, term2284.getClass(), "appContext", null);
        setIntField(term2284, term2284.getClass(), "x", 0);
        setIntField(term2284, term2284.getClass(), "y", 0);
        setIntField(term2284, term2284.getClass(), "width", 0);
        setIntField(term2284, term2284.getClass(), "height", 0);
        setField(term2284, term2284.getClass(), "foreground", null);
        setField(term2284, term2284.getClass(), "background", null);
        setField(term2284, term2284.getClass(), "font", null);
        setField(term2284, term2284.getClass(), "peerFont", null);
        setField(term2284, term2284.getClass(), "cursor", null);
        setField(term2284, term2284.getClass(), "locale", null);
        setField(term2284, term2284.getClass(), "graphicsConfig", null);
        setField(term2284, term2284.getClass(), "bufferStrategy", null);
        setBooleanField(term2284, term2284.getClass(), "ignoreRepaint", false);
        setBooleanField(term2284, term2284.getClass(), "visible", false);
        setBooleanField(term2284, term2284.getClass(), "enabled", false);
        setBooleanField(term2284, term2284.getClass(), "valid", false);
        setField(term2284, term2284.getClass(), "dropTarget", null);
        setField(term2284, term2284.getClass(), "popups", null);
        setBooleanField(term2284, term2284.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2284, term2284.getClass(), "focusable", false);
        setIntField(term2284, term2284.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2284, term2284.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2284, term2284.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2284, term2284.getClass(), "acc", null);
        setField(term2284, term2284.getClass(), "minSize", null);
        setBooleanField(term2284, term2284.getClass(), "minSizeSet", false);
        setField(term2284, term2284.getClass(), "prefSize", null);
        setBooleanField(term2284, term2284.getClass(), "prefSizeSet", false);
        setField(term2284, term2284.getClass(), "maxSize", null);
        setBooleanField(term2284, term2284.getClass(), "maxSizeSet", false);
        setField(term2284, term2284.getClass(), "componentOrientation", null);
        setBooleanField(term2284, term2284.getClass(), "newEventsOnly", false);
        setField(term2284, term2284.getClass(), "componentListener", null);
        setField(term2284, term2284.getClass(), "focusListener", null);
        setField(term2284, term2284.getClass(), "hierarchyListener", null);
        setField(term2284, term2284.getClass(), "hierarchyBoundsListener", null);
        setField(term2284, term2284.getClass(), "keyListener", null);
        setField(term2284, term2284.getClass(), "mouseListener", null);
        setField(term2284, term2284.getClass(), "mouseMotionListener", null);
        setField(term2284, term2284.getClass(), "mouseWheelListener", null);
        setField(term2284, term2284.getClass(), "inputMethodListener", null);
        setLongField(term2284, term2284.getClass(), "eventMask", 0L);
        setField(term2284, term2284.getClass(), "changeSupport", null);
        setField(term2284, term2284.getClass(), "objectLock", null);
        setBooleanField(term2284, term2284.getClass(), "isPacked", false);
        setIntField(term2284, term2284.getClass(), "boundsOp", 0);
        setField(term2284, term2284.getClass(), "compoundShape", null);
        setField(term2284, term2284.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2284, term2284.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2284, term2284.getClass(), "backgroundEraseDisabled", false);
        setField(term2284, term2284.getClass(), "eventCache", null);
        setBooleanField(term2284, term2284.getClass(), "coalescingEnabled", false);
        setBooleanField(term2284, term2284.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2284, term2284.getClass(), "componentSerializedDataVersion", 0);
        setField(term2284, term2284.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitCheckBox");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTraitName", argTypes, term2284, args);
    }

};


