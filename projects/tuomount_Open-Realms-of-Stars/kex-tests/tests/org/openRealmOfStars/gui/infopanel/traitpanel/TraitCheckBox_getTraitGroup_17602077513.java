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

public class TraitCheckBox_getTraitGroup_17602077513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2410;

    public TraitCheckBox_getTraitGroup_17602077513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2410 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitCheckBox"));
        setField(term2410, term2410.getClass(), "id", null);
        setField(term2410, term2410.getClass(), "name", null);
        setField(term2410, term2410.getClass(), "description", null);
        setField(term2410, term2410.getClass(), "group", null);
        setField(term2410, term2410.getClass(), "conflictsWithId", null);
        setByteField(term2410, term2410.getClass(), "traitPoints", (byte) 0);
        setField(term2410, term2410.getClass(), "icon", null);
        setIntField(term2410, term2410.getClass(), "type", 0);
        setBooleanField(term2410, term2410.getClass(), "flat", false);
        setField(term2410, term2410.getClass(), "model", null);
        setField(term2410, term2410.getClass(), "text", null);
        setField(term2410, term2410.getClass(), "margin", null);
        setField(term2410, term2410.getClass(), "defaultMargin", null);
        setField(term2410, term2410.getClass(), "defaultIcon", null);
        setField(term2410, term2410.getClass(), "pressedIcon", null);
        setField(term2410, term2410.getClass(), "disabledIcon", null);
        setField(term2410, term2410.getClass(), "selectedIcon", null);
        setField(term2410, term2410.getClass(), "disabledSelectedIcon", null);
        setField(term2410, term2410.getClass(), "rolloverIcon", null);
        setField(term2410, term2410.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term2410, term2410.getClass(), "paintBorder", false);
        setBooleanField(term2410, term2410.getClass(), "paintFocus", false);
        setBooleanField(term2410, term2410.getClass(), "rolloverEnabled", false);
        setBooleanField(term2410, term2410.getClass(), "contentAreaFilled", false);
        setIntField(term2410, term2410.getClass(), "verticalAlignment", 0);
        setIntField(term2410, term2410.getClass(), "horizontalAlignment", 0);
        setIntField(term2410, term2410.getClass(), "verticalTextPosition", 0);
        setIntField(term2410, term2410.getClass(), "horizontalTextPosition", 0);
        setIntField(term2410, term2410.getClass(), "iconTextGap", 0);
        setIntField(term2410, term2410.getClass(), "mnemonic", 0);
        setIntField(term2410, term2410.getClass(), "mnemonicIndex", 0);
        setLongField(term2410, term2410.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term2410, term2410.getClass(), "borderPaintedSet", false);
        setBooleanField(term2410, term2410.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term2410, term2410.getClass(), "iconTextGapSet", false);
        setBooleanField(term2410, term2410.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term2410, term2410.getClass(), "setLayout", false);
        setBooleanField(term2410, term2410.getClass(), "defaultCapable", false);
        setField(term2410, term2410.getClass(), "handler", null);
        setField(term2410, term2410.getClass(), "changeListener", null);
        setField(term2410, term2410.getClass(), "actionListener", null);
        setField(term2410, term2410.getClass(), "itemListener", null);
        setField(term2410, term2410.getClass(), "changeEvent", null);
        setBooleanField(term2410, term2410.getClass(), "hideActionText", false);
        setField(term2410, term2410.getClass(), "action", null);
        setField(term2410, term2410.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term2410, term2410.getClass(), "isAlignmentXSet", false);
        setFloatField(term2410, term2410.getClass(), "alignmentX", 0.0F);
        setBooleanField(term2410, term2410.getClass(), "isAlignmentYSet", false);
        setFloatField(term2410, term2410.getClass(), "alignmentY", 0.0F);
        setField(term2410, term2410.getClass(), "ui", null);
        setField(term2410, term2410.getClass(), "listenerList", null);
        setField(term2410, term2410.getClass(), "clientProperties", null);
        setField(term2410, term2410.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term2410, term2410.getClass(), "autoscrolls", false);
        setField(term2410, term2410.getClass(), "border", null);
        setIntField(term2410, term2410.getClass(), "flags", 0);
        setField(term2410, term2410.getClass(), "inputVerifier", null);
        setBooleanField(term2410, term2410.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term2410, term2410.getClass(), "paintingChild", null);
        setField(term2410, term2410.getClass(), "popupMenu", null);
        setField(term2410, term2410.getClass(), "revalidateRunnableScheduled", null);
        setField(term2410, term2410.getClass(), "focusInputMap", null);
        setField(term2410, term2410.getClass(), "ancestorInputMap", null);
        setField(term2410, term2410.getClass(), "windowInputMap", null);
        setField(term2410, term2410.getClass(), "actionMap", null);
        setField(term2410, term2410.getClass(), "aaHint", null);
        setField(term2410, term2410.getClass(), "lcdRenderingHint", null);
        setField(term2410, term2410.getClass(), "component", null);
        setField(term2410, term2410.getClass(), "layoutMgr", null);
        setField(term2410, term2410.getClass(), "dispatcher", null);
        setField(term2410, term2410.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2410, term2410.getClass(), "focusCycleRoot", false);
        setBooleanField(term2410, term2410.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2410, term2410.getClass(), "printingThreads", null);
        setBooleanField(term2410, term2410.getClass(), "printing", false);
        setField(term2410, term2410.getClass(), "containerListener", null);
        setIntField(term2410, term2410.getClass(), "listeningChildren", 0);
        setIntField(term2410, term2410.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2410, term2410.getClass(), "descendantsCount", 0);
        setField(term2410, term2410.getClass(), "preserveBackgroundColor", null);
        setIntField(term2410, term2410.getClass(), "numOfHWComponents", 0);
        setIntField(term2410, term2410.getClass(), "numOfLWComponents", 0);
        setField(term2410, term2410.getClass(), "modalComp", null);
        setField(term2410, term2410.getClass(), "modalAppContext", null);
        setIntField(term2410, term2410.getClass(), "containerSerializedDataVersion", 0);
        setField(term2410, term2410.getClass(), "peer", null);
        setField(term2410, term2410.getClass(), "parent", null);
        setField(term2410, term2410.getClass(), "appContext", null);
        setIntField(term2410, term2410.getClass(), "x", 0);
        setIntField(term2410, term2410.getClass(), "y", 0);
        setIntField(term2410, term2410.getClass(), "width", 0);
        setIntField(term2410, term2410.getClass(), "height", 0);
        setField(term2410, term2410.getClass(), "foreground", null);
        setField(term2410, term2410.getClass(), "background", null);
        setField(term2410, term2410.getClass(), "font", null);
        setField(term2410, term2410.getClass(), "peerFont", null);
        setField(term2410, term2410.getClass(), "cursor", null);
        setField(term2410, term2410.getClass(), "locale", null);
        setField(term2410, term2410.getClass(), "graphicsConfig", null);
        setField(term2410, term2410.getClass(), "bufferStrategy", null);
        setBooleanField(term2410, term2410.getClass(), "ignoreRepaint", false);
        setBooleanField(term2410, term2410.getClass(), "visible", false);
        setBooleanField(term2410, term2410.getClass(), "enabled", false);
        setBooleanField(term2410, term2410.getClass(), "valid", false);
        setField(term2410, term2410.getClass(), "dropTarget", null);
        setField(term2410, term2410.getClass(), "popups", null);
        setBooleanField(term2410, term2410.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2410, term2410.getClass(), "focusable", false);
        setIntField(term2410, term2410.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2410, term2410.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2410, term2410.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2410, term2410.getClass(), "acc", null);
        setField(term2410, term2410.getClass(), "minSize", null);
        setBooleanField(term2410, term2410.getClass(), "minSizeSet", false);
        setField(term2410, term2410.getClass(), "prefSize", null);
        setBooleanField(term2410, term2410.getClass(), "prefSizeSet", false);
        setField(term2410, term2410.getClass(), "maxSize", null);
        setBooleanField(term2410, term2410.getClass(), "maxSizeSet", false);
        setField(term2410, term2410.getClass(), "componentOrientation", null);
        setBooleanField(term2410, term2410.getClass(), "newEventsOnly", false);
        setField(term2410, term2410.getClass(), "componentListener", null);
        setField(term2410, term2410.getClass(), "focusListener", null);
        setField(term2410, term2410.getClass(), "hierarchyListener", null);
        setField(term2410, term2410.getClass(), "hierarchyBoundsListener", null);
        setField(term2410, term2410.getClass(), "keyListener", null);
        setField(term2410, term2410.getClass(), "mouseListener", null);
        setField(term2410, term2410.getClass(), "mouseMotionListener", null);
        setField(term2410, term2410.getClass(), "mouseWheelListener", null);
        setField(term2410, term2410.getClass(), "inputMethodListener", null);
        setLongField(term2410, term2410.getClass(), "eventMask", 0L);
        setField(term2410, term2410.getClass(), "changeSupport", null);
        setField(term2410, term2410.getClass(), "objectLock", null);
        setBooleanField(term2410, term2410.getClass(), "isPacked", false);
        setIntField(term2410, term2410.getClass(), "boundsOp", 0);
        setField(term2410, term2410.getClass(), "compoundShape", null);
        setField(term2410, term2410.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2410, term2410.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2410, term2410.getClass(), "backgroundEraseDisabled", false);
        setField(term2410, term2410.getClass(), "eventCache", null);
        setBooleanField(term2410, term2410.getClass(), "coalescingEnabled", false);
        setBooleanField(term2410, term2410.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2410, term2410.getClass(), "componentSerializedDataVersion", 0);
        setField(term2410, term2410.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitCheckBox");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTraitGroup", argTypes, term2410, args);
    }

};


