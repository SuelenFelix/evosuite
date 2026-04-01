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

public class TraitCheckBox_getTraitPoints_164404544215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2536;

    public TraitCheckBox_getTraitPoints_164404544215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2536 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitCheckBox"));
        setField(term2536, term2536.getClass(), "id", null);
        setField(term2536, term2536.getClass(), "name", null);
        setField(term2536, term2536.getClass(), "description", null);
        setField(term2536, term2536.getClass(), "group", null);
        setField(term2536, term2536.getClass(), "conflictsWithId", null);
        setByteField(term2536, term2536.getClass(), "traitPoints", (byte) 0);
        setField(term2536, term2536.getClass(), "icon", null);
        setIntField(term2536, term2536.getClass(), "type", 0);
        setBooleanField(term2536, term2536.getClass(), "flat", false);
        setField(term2536, term2536.getClass(), "model", null);
        setField(term2536, term2536.getClass(), "text", null);
        setField(term2536, term2536.getClass(), "margin", null);
        setField(term2536, term2536.getClass(), "defaultMargin", null);
        setField(term2536, term2536.getClass(), "defaultIcon", null);
        setField(term2536, term2536.getClass(), "pressedIcon", null);
        setField(term2536, term2536.getClass(), "disabledIcon", null);
        setField(term2536, term2536.getClass(), "selectedIcon", null);
        setField(term2536, term2536.getClass(), "disabledSelectedIcon", null);
        setField(term2536, term2536.getClass(), "rolloverIcon", null);
        setField(term2536, term2536.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term2536, term2536.getClass(), "paintBorder", false);
        setBooleanField(term2536, term2536.getClass(), "paintFocus", false);
        setBooleanField(term2536, term2536.getClass(), "rolloverEnabled", false);
        setBooleanField(term2536, term2536.getClass(), "contentAreaFilled", false);
        setIntField(term2536, term2536.getClass(), "verticalAlignment", 0);
        setIntField(term2536, term2536.getClass(), "horizontalAlignment", 0);
        setIntField(term2536, term2536.getClass(), "verticalTextPosition", 0);
        setIntField(term2536, term2536.getClass(), "horizontalTextPosition", 0);
        setIntField(term2536, term2536.getClass(), "iconTextGap", 0);
        setIntField(term2536, term2536.getClass(), "mnemonic", 0);
        setIntField(term2536, term2536.getClass(), "mnemonicIndex", 0);
        setLongField(term2536, term2536.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term2536, term2536.getClass(), "borderPaintedSet", false);
        setBooleanField(term2536, term2536.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term2536, term2536.getClass(), "iconTextGapSet", false);
        setBooleanField(term2536, term2536.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term2536, term2536.getClass(), "setLayout", false);
        setBooleanField(term2536, term2536.getClass(), "defaultCapable", false);
        setField(term2536, term2536.getClass(), "handler", null);
        setField(term2536, term2536.getClass(), "changeListener", null);
        setField(term2536, term2536.getClass(), "actionListener", null);
        setField(term2536, term2536.getClass(), "itemListener", null);
        setField(term2536, term2536.getClass(), "changeEvent", null);
        setBooleanField(term2536, term2536.getClass(), "hideActionText", false);
        setField(term2536, term2536.getClass(), "action", null);
        setField(term2536, term2536.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term2536, term2536.getClass(), "isAlignmentXSet", false);
        setFloatField(term2536, term2536.getClass(), "alignmentX", 0.0F);
        setBooleanField(term2536, term2536.getClass(), "isAlignmentYSet", false);
        setFloatField(term2536, term2536.getClass(), "alignmentY", 0.0F);
        setField(term2536, term2536.getClass(), "ui", null);
        setField(term2536, term2536.getClass(), "listenerList", null);
        setField(term2536, term2536.getClass(), "clientProperties", null);
        setField(term2536, term2536.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term2536, term2536.getClass(), "autoscrolls", false);
        setField(term2536, term2536.getClass(), "border", null);
        setIntField(term2536, term2536.getClass(), "flags", 0);
        setField(term2536, term2536.getClass(), "inputVerifier", null);
        setBooleanField(term2536, term2536.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term2536, term2536.getClass(), "paintingChild", null);
        setField(term2536, term2536.getClass(), "popupMenu", null);
        setField(term2536, term2536.getClass(), "revalidateRunnableScheduled", null);
        setField(term2536, term2536.getClass(), "focusInputMap", null);
        setField(term2536, term2536.getClass(), "ancestorInputMap", null);
        setField(term2536, term2536.getClass(), "windowInputMap", null);
        setField(term2536, term2536.getClass(), "actionMap", null);
        setField(term2536, term2536.getClass(), "aaHint", null);
        setField(term2536, term2536.getClass(), "lcdRenderingHint", null);
        setField(term2536, term2536.getClass(), "component", null);
        setField(term2536, term2536.getClass(), "layoutMgr", null);
        setField(term2536, term2536.getClass(), "dispatcher", null);
        setField(term2536, term2536.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2536, term2536.getClass(), "focusCycleRoot", false);
        setBooleanField(term2536, term2536.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2536, term2536.getClass(), "printingThreads", null);
        setBooleanField(term2536, term2536.getClass(), "printing", false);
        setField(term2536, term2536.getClass(), "containerListener", null);
        setIntField(term2536, term2536.getClass(), "listeningChildren", 0);
        setIntField(term2536, term2536.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2536, term2536.getClass(), "descendantsCount", 0);
        setField(term2536, term2536.getClass(), "preserveBackgroundColor", null);
        setIntField(term2536, term2536.getClass(), "numOfHWComponents", 0);
        setIntField(term2536, term2536.getClass(), "numOfLWComponents", 0);
        setField(term2536, term2536.getClass(), "modalComp", null);
        setField(term2536, term2536.getClass(), "modalAppContext", null);
        setIntField(term2536, term2536.getClass(), "containerSerializedDataVersion", 0);
        setField(term2536, term2536.getClass(), "peer", null);
        setField(term2536, term2536.getClass(), "parent", null);
        setField(term2536, term2536.getClass(), "appContext", null);
        setIntField(term2536, term2536.getClass(), "x", 0);
        setIntField(term2536, term2536.getClass(), "y", 0);
        setIntField(term2536, term2536.getClass(), "width", 0);
        setIntField(term2536, term2536.getClass(), "height", 0);
        setField(term2536, term2536.getClass(), "foreground", null);
        setField(term2536, term2536.getClass(), "background", null);
        setField(term2536, term2536.getClass(), "font", null);
        setField(term2536, term2536.getClass(), "peerFont", null);
        setField(term2536, term2536.getClass(), "cursor", null);
        setField(term2536, term2536.getClass(), "locale", null);
        setField(term2536, term2536.getClass(), "graphicsConfig", null);
        setField(term2536, term2536.getClass(), "bufferStrategy", null);
        setBooleanField(term2536, term2536.getClass(), "ignoreRepaint", false);
        setBooleanField(term2536, term2536.getClass(), "visible", false);
        setBooleanField(term2536, term2536.getClass(), "enabled", false);
        setBooleanField(term2536, term2536.getClass(), "valid", false);
        setField(term2536, term2536.getClass(), "dropTarget", null);
        setField(term2536, term2536.getClass(), "popups", null);
        setBooleanField(term2536, term2536.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2536, term2536.getClass(), "focusable", false);
        setIntField(term2536, term2536.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2536, term2536.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2536, term2536.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2536, term2536.getClass(), "acc", null);
        setField(term2536, term2536.getClass(), "minSize", null);
        setBooleanField(term2536, term2536.getClass(), "minSizeSet", false);
        setField(term2536, term2536.getClass(), "prefSize", null);
        setBooleanField(term2536, term2536.getClass(), "prefSizeSet", false);
        setField(term2536, term2536.getClass(), "maxSize", null);
        setBooleanField(term2536, term2536.getClass(), "maxSizeSet", false);
        setField(term2536, term2536.getClass(), "componentOrientation", null);
        setBooleanField(term2536, term2536.getClass(), "newEventsOnly", false);
        setField(term2536, term2536.getClass(), "componentListener", null);
        setField(term2536, term2536.getClass(), "focusListener", null);
        setField(term2536, term2536.getClass(), "hierarchyListener", null);
        setField(term2536, term2536.getClass(), "hierarchyBoundsListener", null);
        setField(term2536, term2536.getClass(), "keyListener", null);
        setField(term2536, term2536.getClass(), "mouseListener", null);
        setField(term2536, term2536.getClass(), "mouseMotionListener", null);
        setField(term2536, term2536.getClass(), "mouseWheelListener", null);
        setField(term2536, term2536.getClass(), "inputMethodListener", null);
        setLongField(term2536, term2536.getClass(), "eventMask", 0L);
        setField(term2536, term2536.getClass(), "changeSupport", null);
        setField(term2536, term2536.getClass(), "objectLock", null);
        setBooleanField(term2536, term2536.getClass(), "isPacked", false);
        setIntField(term2536, term2536.getClass(), "boundsOp", 0);
        setField(term2536, term2536.getClass(), "compoundShape", null);
        setField(term2536, term2536.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2536, term2536.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2536, term2536.getClass(), "backgroundEraseDisabled", false);
        setField(term2536, term2536.getClass(), "eventCache", null);
        setBooleanField(term2536, term2536.getClass(), "coalescingEnabled", false);
        setBooleanField(term2536, term2536.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2536, term2536.getClass(), "componentSerializedDataVersion", 0);
        setField(term2536, term2536.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitCheckBox");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTraitPoints", argTypes, term2536, args);
    }

};


