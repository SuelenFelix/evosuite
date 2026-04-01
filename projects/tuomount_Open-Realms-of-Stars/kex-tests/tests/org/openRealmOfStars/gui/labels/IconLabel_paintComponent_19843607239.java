package org.openRealmOfStars.gui.labels;

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
import static org.openRealmOfStars.gui.labels.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class IconLabel_paintComponent_19843607239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31510;

    public IconLabel_paintComponent_19843607239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31510 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.IconLabel"));
        setField(term31510, term31510.getClass(), "icon", null);
        setIntField(term31510, term31510.getClass(), "mnemonic", 0);
        setIntField(term31510, term31510.getClass(), "mnemonicIndex", 0);
        setField(term31510, term31510.getClass(), "text", null);
        setField(term31510, term31510.getClass(), "defaultIcon", null);
        setField(term31510, term31510.getClass(), "disabledIcon", null);
        setBooleanField(term31510, term31510.getClass(), "disabledIconSet", false);
        setIntField(term31510, term31510.getClass(), "verticalAlignment", 0);
        setIntField(term31510, term31510.getClass(), "horizontalAlignment", 0);
        setIntField(term31510, term31510.getClass(), "verticalTextPosition", 0);
        setIntField(term31510, term31510.getClass(), "horizontalTextPosition", 0);
        setIntField(term31510, term31510.getClass(), "iconTextGap", 0);
        setField(term31510, term31510.getClass(), "labelFor", null);
        setBooleanField(term31510, term31510.getClass(), "isAlignmentXSet", false);
        setFloatField(term31510, term31510.getClass(), "alignmentX", 0.0F);
        setBooleanField(term31510, term31510.getClass(), "isAlignmentYSet", false);
        setFloatField(term31510, term31510.getClass(), "alignmentY", 0.0F);
        setField(term31510, term31510.getClass(), "ui", null);
        setField(term31510, term31510.getClass(), "listenerList", null);
        setField(term31510, term31510.getClass(), "clientProperties", null);
        setField(term31510, term31510.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term31510, term31510.getClass(), "autoscrolls", false);
        setField(term31510, term31510.getClass(), "border", null);
        setIntField(term31510, term31510.getClass(), "flags", 0);
        setField(term31510, term31510.getClass(), "inputVerifier", null);
        setBooleanField(term31510, term31510.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term31510, term31510.getClass(), "paintingChild", null);
        setField(term31510, term31510.getClass(), "popupMenu", null);
        setField(term31510, term31510.getClass(), "revalidateRunnableScheduled", null);
        setField(term31510, term31510.getClass(), "focusInputMap", null);
        setField(term31510, term31510.getClass(), "ancestorInputMap", null);
        setField(term31510, term31510.getClass(), "windowInputMap", null);
        setField(term31510, term31510.getClass(), "actionMap", null);
        setField(term31510, term31510.getClass(), "aaHint", null);
        setField(term31510, term31510.getClass(), "lcdRenderingHint", null);
        setField(term31510, term31510.getClass(), "component", null);
        setField(term31510, term31510.getClass(), "layoutMgr", null);
        setField(term31510, term31510.getClass(), "dispatcher", null);
        setField(term31510, term31510.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term31510, term31510.getClass(), "focusCycleRoot", false);
        setBooleanField(term31510, term31510.getClass(), "focusTraversalPolicyProvider", false);
        setField(term31510, term31510.getClass(), "printingThreads", null);
        setBooleanField(term31510, term31510.getClass(), "printing", false);
        setField(term31510, term31510.getClass(), "containerListener", null);
        setIntField(term31510, term31510.getClass(), "listeningChildren", 0);
        setIntField(term31510, term31510.getClass(), "listeningBoundsChildren", 0);
        setIntField(term31510, term31510.getClass(), "descendantsCount", 0);
        setField(term31510, term31510.getClass(), "preserveBackgroundColor", null);
        setIntField(term31510, term31510.getClass(), "numOfHWComponents", 0);
        setIntField(term31510, term31510.getClass(), "numOfLWComponents", 0);
        setField(term31510, term31510.getClass(), "modalComp", null);
        setField(term31510, term31510.getClass(), "modalAppContext", null);
        setIntField(term31510, term31510.getClass(), "containerSerializedDataVersion", 0);
        setField(term31510, term31510.getClass(), "peer", null);
        setField(term31510, term31510.getClass(), "parent", null);
        setField(term31510, term31510.getClass(), "appContext", null);
        setIntField(term31510, term31510.getClass(), "x", 0);
        setIntField(term31510, term31510.getClass(), "y", 0);
        setIntField(term31510, term31510.getClass(), "width", 0);
        setIntField(term31510, term31510.getClass(), "height", 0);
        setField(term31510, term31510.getClass(), "foreground", null);
        setField(term31510, term31510.getClass(), "background", null);
        setField(term31510, term31510.getClass(), "font", null);
        setField(term31510, term31510.getClass(), "peerFont", null);
        setField(term31510, term31510.getClass(), "cursor", null);
        setField(term31510, term31510.getClass(), "locale", null);
        setField(term31510, term31510.getClass(), "graphicsConfig", null);
        setField(term31510, term31510.getClass(), "bufferStrategy", null);
        setBooleanField(term31510, term31510.getClass(), "ignoreRepaint", false);
        setBooleanField(term31510, term31510.getClass(), "visible", false);
        setBooleanField(term31510, term31510.getClass(), "enabled", false);
        setBooleanField(term31510, term31510.getClass(), "valid", false);
        setField(term31510, term31510.getClass(), "dropTarget", null);
        setField(term31510, term31510.getClass(), "popups", null);
        setField(term31510, term31510.getClass(), "name", null);
        setBooleanField(term31510, term31510.getClass(), "nameExplicitlySet", false);
        setBooleanField(term31510, term31510.getClass(), "focusable", false);
        setIntField(term31510, term31510.getClass(), "isFocusTraversableOverridden", 0);
        setField(term31510, term31510.getClass(), "focusTraversalKeys", null);
        setBooleanField(term31510, term31510.getClass(), "focusTraversalKeysEnabled", false);
        setField(term31510, term31510.getClass(), "acc", null);
        setField(term31510, term31510.getClass(), "minSize", null);
        setBooleanField(term31510, term31510.getClass(), "minSizeSet", false);
        setField(term31510, term31510.getClass(), "prefSize", null);
        setBooleanField(term31510, term31510.getClass(), "prefSizeSet", false);
        setField(term31510, term31510.getClass(), "maxSize", null);
        setBooleanField(term31510, term31510.getClass(), "maxSizeSet", false);
        setField(term31510, term31510.getClass(), "componentOrientation", null);
        setBooleanField(term31510, term31510.getClass(), "newEventsOnly", false);
        setField(term31510, term31510.getClass(), "componentListener", null);
        setField(term31510, term31510.getClass(), "focusListener", null);
        setField(term31510, term31510.getClass(), "hierarchyListener", null);
        setField(term31510, term31510.getClass(), "hierarchyBoundsListener", null);
        setField(term31510, term31510.getClass(), "keyListener", null);
        setField(term31510, term31510.getClass(), "mouseListener", null);
        setField(term31510, term31510.getClass(), "mouseMotionListener", null);
        setField(term31510, term31510.getClass(), "mouseWheelListener", null);
        setField(term31510, term31510.getClass(), "inputMethodListener", null);
        setLongField(term31510, term31510.getClass(), "eventMask", 0L);
        setField(term31510, term31510.getClass(), "changeSupport", null);
        setField(term31510, term31510.getClass(), "objectLock", null);
        setBooleanField(term31510, term31510.getClass(), "isPacked", false);
        setIntField(term31510, term31510.getClass(), "boundsOp", 0);
        setField(term31510, term31510.getClass(), "compoundShape", null);
        setField(term31510, term31510.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term31510, term31510.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term31510, term31510.getClass(), "backgroundEraseDisabled", false);
        setField(term31510, term31510.getClass(), "eventCache", null);
        setBooleanField(term31510, term31510.getClass(), "coalescingEnabled", false);
        setBooleanField(term31510, term31510.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term31510, term31510.getClass(), "componentSerializedDataVersion", 0);
        setField(term31510, term31510.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.IconLabel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Graphics");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "paintComponent", argTypes, term31510, args);
    }

};


