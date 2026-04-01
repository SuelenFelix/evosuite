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

public class TraitCheckBox_getTraitConflictsWithId_48832682614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2473;

    public TraitCheckBox_getTraitConflictsWithId_48832682614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2473 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitCheckBox"));
        setField(term2473, term2473.getClass(), "id", null);
        setField(term2473, term2473.getClass(), "name", null);
        setField(term2473, term2473.getClass(), "description", null);
        setField(term2473, term2473.getClass(), "group", null);
        setField(term2473, term2473.getClass(), "conflictsWithId", null);
        setByteField(term2473, term2473.getClass(), "traitPoints", (byte) 0);
        setField(term2473, term2473.getClass(), "icon", null);
        setIntField(term2473, term2473.getClass(), "type", 0);
        setBooleanField(term2473, term2473.getClass(), "flat", false);
        setField(term2473, term2473.getClass(), "model", null);
        setField(term2473, term2473.getClass(), "text", null);
        setField(term2473, term2473.getClass(), "margin", null);
        setField(term2473, term2473.getClass(), "defaultMargin", null);
        setField(term2473, term2473.getClass(), "defaultIcon", null);
        setField(term2473, term2473.getClass(), "pressedIcon", null);
        setField(term2473, term2473.getClass(), "disabledIcon", null);
        setField(term2473, term2473.getClass(), "selectedIcon", null);
        setField(term2473, term2473.getClass(), "disabledSelectedIcon", null);
        setField(term2473, term2473.getClass(), "rolloverIcon", null);
        setField(term2473, term2473.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term2473, term2473.getClass(), "paintBorder", false);
        setBooleanField(term2473, term2473.getClass(), "paintFocus", false);
        setBooleanField(term2473, term2473.getClass(), "rolloverEnabled", false);
        setBooleanField(term2473, term2473.getClass(), "contentAreaFilled", false);
        setIntField(term2473, term2473.getClass(), "verticalAlignment", 0);
        setIntField(term2473, term2473.getClass(), "horizontalAlignment", 0);
        setIntField(term2473, term2473.getClass(), "verticalTextPosition", 0);
        setIntField(term2473, term2473.getClass(), "horizontalTextPosition", 0);
        setIntField(term2473, term2473.getClass(), "iconTextGap", 0);
        setIntField(term2473, term2473.getClass(), "mnemonic", 0);
        setIntField(term2473, term2473.getClass(), "mnemonicIndex", 0);
        setLongField(term2473, term2473.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term2473, term2473.getClass(), "borderPaintedSet", false);
        setBooleanField(term2473, term2473.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term2473, term2473.getClass(), "iconTextGapSet", false);
        setBooleanField(term2473, term2473.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term2473, term2473.getClass(), "setLayout", false);
        setBooleanField(term2473, term2473.getClass(), "defaultCapable", false);
        setField(term2473, term2473.getClass(), "handler", null);
        setField(term2473, term2473.getClass(), "changeListener", null);
        setField(term2473, term2473.getClass(), "actionListener", null);
        setField(term2473, term2473.getClass(), "itemListener", null);
        setField(term2473, term2473.getClass(), "changeEvent", null);
        setBooleanField(term2473, term2473.getClass(), "hideActionText", false);
        setField(term2473, term2473.getClass(), "action", null);
        setField(term2473, term2473.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term2473, term2473.getClass(), "isAlignmentXSet", false);
        setFloatField(term2473, term2473.getClass(), "alignmentX", 0.0F);
        setBooleanField(term2473, term2473.getClass(), "isAlignmentYSet", false);
        setFloatField(term2473, term2473.getClass(), "alignmentY", 0.0F);
        setField(term2473, term2473.getClass(), "ui", null);
        setField(term2473, term2473.getClass(), "listenerList", null);
        setField(term2473, term2473.getClass(), "clientProperties", null);
        setField(term2473, term2473.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term2473, term2473.getClass(), "autoscrolls", false);
        setField(term2473, term2473.getClass(), "border", null);
        setIntField(term2473, term2473.getClass(), "flags", 0);
        setField(term2473, term2473.getClass(), "inputVerifier", null);
        setBooleanField(term2473, term2473.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term2473, term2473.getClass(), "paintingChild", null);
        setField(term2473, term2473.getClass(), "popupMenu", null);
        setField(term2473, term2473.getClass(), "revalidateRunnableScheduled", null);
        setField(term2473, term2473.getClass(), "focusInputMap", null);
        setField(term2473, term2473.getClass(), "ancestorInputMap", null);
        setField(term2473, term2473.getClass(), "windowInputMap", null);
        setField(term2473, term2473.getClass(), "actionMap", null);
        setField(term2473, term2473.getClass(), "aaHint", null);
        setField(term2473, term2473.getClass(), "lcdRenderingHint", null);
        setField(term2473, term2473.getClass(), "component", null);
        setField(term2473, term2473.getClass(), "layoutMgr", null);
        setField(term2473, term2473.getClass(), "dispatcher", null);
        setField(term2473, term2473.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2473, term2473.getClass(), "focusCycleRoot", false);
        setBooleanField(term2473, term2473.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2473, term2473.getClass(), "printingThreads", null);
        setBooleanField(term2473, term2473.getClass(), "printing", false);
        setField(term2473, term2473.getClass(), "containerListener", null);
        setIntField(term2473, term2473.getClass(), "listeningChildren", 0);
        setIntField(term2473, term2473.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2473, term2473.getClass(), "descendantsCount", 0);
        setField(term2473, term2473.getClass(), "preserveBackgroundColor", null);
        setIntField(term2473, term2473.getClass(), "numOfHWComponents", 0);
        setIntField(term2473, term2473.getClass(), "numOfLWComponents", 0);
        setField(term2473, term2473.getClass(), "modalComp", null);
        setField(term2473, term2473.getClass(), "modalAppContext", null);
        setIntField(term2473, term2473.getClass(), "containerSerializedDataVersion", 0);
        setField(term2473, term2473.getClass(), "peer", null);
        setField(term2473, term2473.getClass(), "parent", null);
        setField(term2473, term2473.getClass(), "appContext", null);
        setIntField(term2473, term2473.getClass(), "x", 0);
        setIntField(term2473, term2473.getClass(), "y", 0);
        setIntField(term2473, term2473.getClass(), "width", 0);
        setIntField(term2473, term2473.getClass(), "height", 0);
        setField(term2473, term2473.getClass(), "foreground", null);
        setField(term2473, term2473.getClass(), "background", null);
        setField(term2473, term2473.getClass(), "font", null);
        setField(term2473, term2473.getClass(), "peerFont", null);
        setField(term2473, term2473.getClass(), "cursor", null);
        setField(term2473, term2473.getClass(), "locale", null);
        setField(term2473, term2473.getClass(), "graphicsConfig", null);
        setField(term2473, term2473.getClass(), "bufferStrategy", null);
        setBooleanField(term2473, term2473.getClass(), "ignoreRepaint", false);
        setBooleanField(term2473, term2473.getClass(), "visible", false);
        setBooleanField(term2473, term2473.getClass(), "enabled", false);
        setBooleanField(term2473, term2473.getClass(), "valid", false);
        setField(term2473, term2473.getClass(), "dropTarget", null);
        setField(term2473, term2473.getClass(), "popups", null);
        setBooleanField(term2473, term2473.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2473, term2473.getClass(), "focusable", false);
        setIntField(term2473, term2473.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2473, term2473.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2473, term2473.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2473, term2473.getClass(), "acc", null);
        setField(term2473, term2473.getClass(), "minSize", null);
        setBooleanField(term2473, term2473.getClass(), "minSizeSet", false);
        setField(term2473, term2473.getClass(), "prefSize", null);
        setBooleanField(term2473, term2473.getClass(), "prefSizeSet", false);
        setField(term2473, term2473.getClass(), "maxSize", null);
        setBooleanField(term2473, term2473.getClass(), "maxSizeSet", false);
        setField(term2473, term2473.getClass(), "componentOrientation", null);
        setBooleanField(term2473, term2473.getClass(), "newEventsOnly", false);
        setField(term2473, term2473.getClass(), "componentListener", null);
        setField(term2473, term2473.getClass(), "focusListener", null);
        setField(term2473, term2473.getClass(), "hierarchyListener", null);
        setField(term2473, term2473.getClass(), "hierarchyBoundsListener", null);
        setField(term2473, term2473.getClass(), "keyListener", null);
        setField(term2473, term2473.getClass(), "mouseListener", null);
        setField(term2473, term2473.getClass(), "mouseMotionListener", null);
        setField(term2473, term2473.getClass(), "mouseWheelListener", null);
        setField(term2473, term2473.getClass(), "inputMethodListener", null);
        setLongField(term2473, term2473.getClass(), "eventMask", 0L);
        setField(term2473, term2473.getClass(), "changeSupport", null);
        setField(term2473, term2473.getClass(), "objectLock", null);
        setBooleanField(term2473, term2473.getClass(), "isPacked", false);
        setIntField(term2473, term2473.getClass(), "boundsOp", 0);
        setField(term2473, term2473.getClass(), "compoundShape", null);
        setField(term2473, term2473.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2473, term2473.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2473, term2473.getClass(), "backgroundEraseDisabled", false);
        setField(term2473, term2473.getClass(), "eventCache", null);
        setBooleanField(term2473, term2473.getClass(), "coalescingEnabled", false);
        setBooleanField(term2473, term2473.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2473, term2473.getClass(), "componentSerializedDataVersion", 0);
        setField(term2473, term2473.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitCheckBox");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTraitConflictsWithId", argTypes, term2473, args);
    }

};


