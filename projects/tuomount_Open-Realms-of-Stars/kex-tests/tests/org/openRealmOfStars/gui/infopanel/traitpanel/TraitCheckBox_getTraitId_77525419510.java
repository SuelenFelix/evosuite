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

public class TraitCheckBox_getTraitId_77525419510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2221;

    public TraitCheckBox_getTraitId_77525419510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2221 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitCheckBox"));
        setField(term2221, term2221.getClass(), "id", null);
        setField(term2221, term2221.getClass(), "name", null);
        setField(term2221, term2221.getClass(), "description", null);
        setField(term2221, term2221.getClass(), "group", null);
        setField(term2221, term2221.getClass(), "conflictsWithId", null);
        setByteField(term2221, term2221.getClass(), "traitPoints", (byte) 0);
        setField(term2221, term2221.getClass(), "icon", null);
        setIntField(term2221, term2221.getClass(), "type", 0);
        setBooleanField(term2221, term2221.getClass(), "flat", false);
        setField(term2221, term2221.getClass(), "model", null);
        setField(term2221, term2221.getClass(), "text", null);
        setField(term2221, term2221.getClass(), "margin", null);
        setField(term2221, term2221.getClass(), "defaultMargin", null);
        setField(term2221, term2221.getClass(), "defaultIcon", null);
        setField(term2221, term2221.getClass(), "pressedIcon", null);
        setField(term2221, term2221.getClass(), "disabledIcon", null);
        setField(term2221, term2221.getClass(), "selectedIcon", null);
        setField(term2221, term2221.getClass(), "disabledSelectedIcon", null);
        setField(term2221, term2221.getClass(), "rolloverIcon", null);
        setField(term2221, term2221.getClass(), "rolloverSelectedIcon", null);
        setBooleanField(term2221, term2221.getClass(), "paintBorder", false);
        setBooleanField(term2221, term2221.getClass(), "paintFocus", false);
        setBooleanField(term2221, term2221.getClass(), "rolloverEnabled", false);
        setBooleanField(term2221, term2221.getClass(), "contentAreaFilled", false);
        setIntField(term2221, term2221.getClass(), "verticalAlignment", 0);
        setIntField(term2221, term2221.getClass(), "horizontalAlignment", 0);
        setIntField(term2221, term2221.getClass(), "verticalTextPosition", 0);
        setIntField(term2221, term2221.getClass(), "horizontalTextPosition", 0);
        setIntField(term2221, term2221.getClass(), "iconTextGap", 0);
        setIntField(term2221, term2221.getClass(), "mnemonic", 0);
        setIntField(term2221, term2221.getClass(), "mnemonicIndex", 0);
        setLongField(term2221, term2221.getClass(), "multiClickThreshhold", 0L);
        setBooleanField(term2221, term2221.getClass(), "borderPaintedSet", false);
        setBooleanField(term2221, term2221.getClass(), "rolloverEnabledSet", false);
        setBooleanField(term2221, term2221.getClass(), "iconTextGapSet", false);
        setBooleanField(term2221, term2221.getClass(), "contentAreaFilledSet", false);
        setBooleanField(term2221, term2221.getClass(), "setLayout", false);
        setBooleanField(term2221, term2221.getClass(), "defaultCapable", false);
        setField(term2221, term2221.getClass(), "handler", null);
        setField(term2221, term2221.getClass(), "changeListener", null);
        setField(term2221, term2221.getClass(), "actionListener", null);
        setField(term2221, term2221.getClass(), "itemListener", null);
        setField(term2221, term2221.getClass(), "changeEvent", null);
        setBooleanField(term2221, term2221.getClass(), "hideActionText", false);
        setField(term2221, term2221.getClass(), "action", null);
        setField(term2221, term2221.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term2221, term2221.getClass(), "isAlignmentXSet", false);
        setFloatField(term2221, term2221.getClass(), "alignmentX", 0.0F);
        setBooleanField(term2221, term2221.getClass(), "isAlignmentYSet", false);
        setFloatField(term2221, term2221.getClass(), "alignmentY", 0.0F);
        setField(term2221, term2221.getClass(), "ui", null);
        setField(term2221, term2221.getClass(), "listenerList", null);
        setField(term2221, term2221.getClass(), "clientProperties", null);
        setField(term2221, term2221.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term2221, term2221.getClass(), "autoscrolls", false);
        setField(term2221, term2221.getClass(), "border", null);
        setIntField(term2221, term2221.getClass(), "flags", 0);
        setField(term2221, term2221.getClass(), "inputVerifier", null);
        setBooleanField(term2221, term2221.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term2221, term2221.getClass(), "paintingChild", null);
        setField(term2221, term2221.getClass(), "popupMenu", null);
        setField(term2221, term2221.getClass(), "revalidateRunnableScheduled", null);
        setField(term2221, term2221.getClass(), "focusInputMap", null);
        setField(term2221, term2221.getClass(), "ancestorInputMap", null);
        setField(term2221, term2221.getClass(), "windowInputMap", null);
        setField(term2221, term2221.getClass(), "actionMap", null);
        setField(term2221, term2221.getClass(), "aaHint", null);
        setField(term2221, term2221.getClass(), "lcdRenderingHint", null);
        setField(term2221, term2221.getClass(), "component", null);
        setField(term2221, term2221.getClass(), "layoutMgr", null);
        setField(term2221, term2221.getClass(), "dispatcher", null);
        setField(term2221, term2221.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2221, term2221.getClass(), "focusCycleRoot", false);
        setBooleanField(term2221, term2221.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2221, term2221.getClass(), "printingThreads", null);
        setBooleanField(term2221, term2221.getClass(), "printing", false);
        setField(term2221, term2221.getClass(), "containerListener", null);
        setIntField(term2221, term2221.getClass(), "listeningChildren", 0);
        setIntField(term2221, term2221.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2221, term2221.getClass(), "descendantsCount", 0);
        setField(term2221, term2221.getClass(), "preserveBackgroundColor", null);
        setIntField(term2221, term2221.getClass(), "numOfHWComponents", 0);
        setIntField(term2221, term2221.getClass(), "numOfLWComponents", 0);
        setField(term2221, term2221.getClass(), "modalComp", null);
        setField(term2221, term2221.getClass(), "modalAppContext", null);
        setIntField(term2221, term2221.getClass(), "containerSerializedDataVersion", 0);
        setField(term2221, term2221.getClass(), "peer", null);
        setField(term2221, term2221.getClass(), "parent", null);
        setField(term2221, term2221.getClass(), "appContext", null);
        setIntField(term2221, term2221.getClass(), "x", 0);
        setIntField(term2221, term2221.getClass(), "y", 0);
        setIntField(term2221, term2221.getClass(), "width", 0);
        setIntField(term2221, term2221.getClass(), "height", 0);
        setField(term2221, term2221.getClass(), "foreground", null);
        setField(term2221, term2221.getClass(), "background", null);
        setField(term2221, term2221.getClass(), "font", null);
        setField(term2221, term2221.getClass(), "peerFont", null);
        setField(term2221, term2221.getClass(), "cursor", null);
        setField(term2221, term2221.getClass(), "locale", null);
        setField(term2221, term2221.getClass(), "graphicsConfig", null);
        setField(term2221, term2221.getClass(), "bufferStrategy", null);
        setBooleanField(term2221, term2221.getClass(), "ignoreRepaint", false);
        setBooleanField(term2221, term2221.getClass(), "visible", false);
        setBooleanField(term2221, term2221.getClass(), "enabled", false);
        setBooleanField(term2221, term2221.getClass(), "valid", false);
        setField(term2221, term2221.getClass(), "dropTarget", null);
        setField(term2221, term2221.getClass(), "popups", null);
        setBooleanField(term2221, term2221.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2221, term2221.getClass(), "focusable", false);
        setIntField(term2221, term2221.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2221, term2221.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2221, term2221.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2221, term2221.getClass(), "acc", null);
        setField(term2221, term2221.getClass(), "minSize", null);
        setBooleanField(term2221, term2221.getClass(), "minSizeSet", false);
        setField(term2221, term2221.getClass(), "prefSize", null);
        setBooleanField(term2221, term2221.getClass(), "prefSizeSet", false);
        setField(term2221, term2221.getClass(), "maxSize", null);
        setBooleanField(term2221, term2221.getClass(), "maxSizeSet", false);
        setField(term2221, term2221.getClass(), "componentOrientation", null);
        setBooleanField(term2221, term2221.getClass(), "newEventsOnly", false);
        setField(term2221, term2221.getClass(), "componentListener", null);
        setField(term2221, term2221.getClass(), "focusListener", null);
        setField(term2221, term2221.getClass(), "hierarchyListener", null);
        setField(term2221, term2221.getClass(), "hierarchyBoundsListener", null);
        setField(term2221, term2221.getClass(), "keyListener", null);
        setField(term2221, term2221.getClass(), "mouseListener", null);
        setField(term2221, term2221.getClass(), "mouseMotionListener", null);
        setField(term2221, term2221.getClass(), "mouseWheelListener", null);
        setField(term2221, term2221.getClass(), "inputMethodListener", null);
        setLongField(term2221, term2221.getClass(), "eventMask", 0L);
        setField(term2221, term2221.getClass(), "changeSupport", null);
        setField(term2221, term2221.getClass(), "objectLock", null);
        setBooleanField(term2221, term2221.getClass(), "isPacked", false);
        setIntField(term2221, term2221.getClass(), "boundsOp", 0);
        setField(term2221, term2221.getClass(), "compoundShape", null);
        setField(term2221, term2221.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2221, term2221.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2221, term2221.getClass(), "backgroundEraseDisabled", false);
        setField(term2221, term2221.getClass(), "eventCache", null);
        setBooleanField(term2221, term2221.getClass(), "coalescingEnabled", false);
        setBooleanField(term2221, term2221.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2221, term2221.getClass(), "componentSerializedDataVersion", 0);
        setField(term2221, term2221.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitCheckBox");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTraitId", argTypes, term2221, args);
    }

};


