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

public class TraitCheckBox_getTraitDescription_11661962012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2347;

    public TraitCheckBox_getTraitDescription_11661962012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2347 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitCheckBox"));
        setField(term2347, term2347.getClass(), "id", null);
        setField(term2347, term2347.getClass(), "name", null);
        setField(term2347, term2347.getClass(), "description", null);
        setField(term2347, term2347.getClass(), "group", null);
        setField(term2347, term2347.getClass(), "conflictsWithId", null);
        setByteField(term2347, term2347.getClass(), "traitPoints", (byte) 0);
        setField(term2347, term2347.getClass(), "icon", null);
        setIntField(term2347, term2347.getClass(), "type", 0);
        setBooleanField(term2347, term2347.getClass(), "flat", false);
        setField(term2347, term2347.getClass(), "model", null);
        setField(term2347, term2347.getClass(), "text", null);
        setField(term2347, term2347.getClass(), "margin", null);
        setField(term2347, term2347.getClass(), "defaultMargin", null);
        setField(term2347, term2347.getClass(), "defaultIcon", null);
        setField(term2347, term2347.getClass(), "pressedIcon", null);
        setField(term2347, term2347.getClass(), "disabledIcon", null);
        setField(term2347, term2347.getClass(), "selectedIcon", null);
        setField(term2347, term2347.getClass(), "disabledSelectedIcon", null);
        setField(term2347, term2347.getClass(), "rolloverIcon", null);
        setField(term2347, term2347.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term2347, term2347.getClass(), "paintBorder", false);
        setBooleanField(term2347, term2347.getClass(), "paintFocus", false);
        setBooleanField(term2347, term2347.getClass(), "rolloverEnabled", false);
        setBooleanField(term2347, term2347.getClass(), "contentAreaFilled", false);
        setIntField(term2347, term2347.getClass(), "verticalAlignment", 0);
        setIntField(term2347, term2347.getClass(), "horizontalAlignment", 0);
        setIntField(term2347, term2347.getClass(), "verticalTextPosition", 0);
        setIntField(term2347, term2347.getClass(), "horizontalTextPosition", 0);
        setIntField(term2347, term2347.getClass(), "iconTextGap", 0);
        setIntField(term2347, term2347.getClass(), "mnemonic", 0);
        setIntField(term2347, term2347.getClass(), "mnemonicIndex", 0);
        setLongField(term2347, term2347.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term2347, term2347.getClass(), "borderPaintedSet", false);
        setBooleanField(term2347, term2347.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term2347, term2347.getClass(), "iconTextGapSet", false);
        setBooleanField(term2347, term2347.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term2347, term2347.getClass(), "setLayout", false);
        setBooleanField(term2347, term2347.getClass(), "defaultCapable", false);
        setField(term2347, term2347.getClass(), "handler", null);
        setField(term2347, term2347.getClass(), "changeListener", null);
        setField(term2347, term2347.getClass(), "actionListener", null);
        setField(term2347, term2347.getClass(), "itemListener", null);
        setField(term2347, term2347.getClass(), "changeEvent", null);
        setBooleanField(term2347, term2347.getClass(), "hideActionText", false);
        setField(term2347, term2347.getClass(), "action", null);
        setField(term2347, term2347.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term2347, term2347.getClass(), "isAlignmentXSet", false);
        setFloatField(term2347, term2347.getClass(), "alignmentX", 0.0F);
        setBooleanField(term2347, term2347.getClass(), "isAlignmentYSet", false);
        setFloatField(term2347, term2347.getClass(), "alignmentY", 0.0F);
        setField(term2347, term2347.getClass(), "ui", null);
        setField(term2347, term2347.getClass(), "listenerList", null);
        setField(term2347, term2347.getClass(), "clientProperties", null);
        setField(term2347, term2347.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term2347, term2347.getClass(), "autoscrolls", false);
        setField(term2347, term2347.getClass(), "border", null);
        setIntField(term2347, term2347.getClass(), "flags", 0);
        setField(term2347, term2347.getClass(), "inputVerifier", null);
        setBooleanField(term2347, term2347.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term2347, term2347.getClass(), "paintingChild", null);
        setField(term2347, term2347.getClass(), "popupMenu", null);
        setField(term2347, term2347.getClass(), "revalidateRunnableScheduled", null);
        setField(term2347, term2347.getClass(), "focusInputMap", null);
        setField(term2347, term2347.getClass(), "ancestorInputMap", null);
        setField(term2347, term2347.getClass(), "windowInputMap", null);
        setField(term2347, term2347.getClass(), "actionMap", null);
        setField(term2347, term2347.getClass(), "aaHint", null);
        setField(term2347, term2347.getClass(), "lcdRenderingHint", null);
        setField(term2347, term2347.getClass(), "component", null);
        setField(term2347, term2347.getClass(), "layoutMgr", null);
        setField(term2347, term2347.getClass(), "dispatcher", null);
        setField(term2347, term2347.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2347, term2347.getClass(), "focusCycleRoot", false);
        setBooleanField(term2347, term2347.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2347, term2347.getClass(), "printingThreads", null);
        setBooleanField(term2347, term2347.getClass(), "printing", false);
        setField(term2347, term2347.getClass(), "containerListener", null);
        setIntField(term2347, term2347.getClass(), "listeningChildren", 0);
        setIntField(term2347, term2347.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2347, term2347.getClass(), "descendantsCount", 0);
        setField(term2347, term2347.getClass(), "preserveBackgroundColor", null);
        setIntField(term2347, term2347.getClass(), "numOfHWComponents", 0);
        setIntField(term2347, term2347.getClass(), "numOfLWComponents", 0);
        setField(term2347, term2347.getClass(), "modalComp", null);
        setField(term2347, term2347.getClass(), "modalAppContext", null);
        setIntField(term2347, term2347.getClass(), "containerSerializedDataVersion", 0);
        setField(term2347, term2347.getClass(), "peer", null);
        setField(term2347, term2347.getClass(), "parent", null);
        setField(term2347, term2347.getClass(), "appContext", null);
        setIntField(term2347, term2347.getClass(), "x", 0);
        setIntField(term2347, term2347.getClass(), "y", 0);
        setIntField(term2347, term2347.getClass(), "width", 0);
        setIntField(term2347, term2347.getClass(), "height", 0);
        setField(term2347, term2347.getClass(), "foreground", null);
        setField(term2347, term2347.getClass(), "background", null);
        setField(term2347, term2347.getClass(), "font", null);
        setField(term2347, term2347.getClass(), "peerFont", null);
        setField(term2347, term2347.getClass(), "cursor", null);
        setField(term2347, term2347.getClass(), "locale", null);
        setField(term2347, term2347.getClass(), "graphicsConfig", null);
        setField(term2347, term2347.getClass(), "bufferStrategy", null);
        setBooleanField(term2347, term2347.getClass(), "ignoreRepaint", false);
        setBooleanField(term2347, term2347.getClass(), "visible", false);
        setBooleanField(term2347, term2347.getClass(), "enabled", false);
        setBooleanField(term2347, term2347.getClass(), "valid", false);
        setField(term2347, term2347.getClass(), "dropTarget", null);
        setField(term2347, term2347.getClass(), "popups", null);
        setBooleanField(term2347, term2347.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2347, term2347.getClass(), "focusable", false);
        setIntField(term2347, term2347.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2347, term2347.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2347, term2347.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2347, term2347.getClass(), "acc", null);
        setField(term2347, term2347.getClass(), "minSize", null);
        setBooleanField(term2347, term2347.getClass(), "minSizeSet", false);
        setField(term2347, term2347.getClass(), "prefSize", null);
        setBooleanField(term2347, term2347.getClass(), "prefSizeSet", false);
        setField(term2347, term2347.getClass(), "maxSize", null);
        setBooleanField(term2347, term2347.getClass(), "maxSizeSet", false);
        setField(term2347, term2347.getClass(), "componentOrientation", null);
        setBooleanField(term2347, term2347.getClass(), "newEventsOnly", false);
        setField(term2347, term2347.getClass(), "componentListener", null);
        setField(term2347, term2347.getClass(), "focusListener", null);
        setField(term2347, term2347.getClass(), "hierarchyListener", null);
        setField(term2347, term2347.getClass(), "hierarchyBoundsListener", null);
        setField(term2347, term2347.getClass(), "keyListener", null);
        setField(term2347, term2347.getClass(), "mouseListener", null);
        setField(term2347, term2347.getClass(), "mouseMotionListener", null);
        setField(term2347, term2347.getClass(), "mouseWheelListener", null);
        setField(term2347, term2347.getClass(), "inputMethodListener", null);
        setLongField(term2347, term2347.getClass(), "eventMask", 0L);
        setField(term2347, term2347.getClass(), "changeSupport", null);
        setField(term2347, term2347.getClass(), "objectLock", null);
        setBooleanField(term2347, term2347.getClass(), "isPacked", false);
        setIntField(term2347, term2347.getClass(), "boundsOp", 0);
        setField(term2347, term2347.getClass(), "compoundShape", null);
        setField(term2347, term2347.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2347, term2347.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2347, term2347.getClass(), "backgroundEraseDisabled", false);
        setField(term2347, term2347.getClass(), "eventCache", null);
        setBooleanField(term2347, term2347.getClass(), "coalescingEnabled", false);
        setBooleanField(term2347, term2347.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2347, term2347.getClass(), "componentSerializedDataVersion", 0);
        setField(term2347, term2347.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitCheckBox");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTraitDescription", argTypes, term2347, args);
    }

};


