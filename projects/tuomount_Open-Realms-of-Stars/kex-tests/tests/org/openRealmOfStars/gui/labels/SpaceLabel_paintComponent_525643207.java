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

public class SpaceLabel_paintComponent_525643207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355;

    public SpaceLabel_paintComponent_525643207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term355 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.SpaceLabel"));
        setIntField(term355, term355.getClass(), "mnemonic", 0);
        setIntField(term355, term355.getClass(), "mnemonicIndex", 0);
        setField(term355, term355.getClass(), "text", null);
        setField(term355, term355.getClass(), "defaultIcon", null);
        setField(term355, term355.getClass(), "disabledIcon", null);
        setBooleanField(term355, term355.getClass(), "disabledIconSet", false);
        setIntField(term355, term355.getClass(), "verticalAlignment", 0);
        setIntField(term355, term355.getClass(), "horizontalAlignment", 0);
        setIntField(term355, term355.getClass(), "verticalTextPosition", 0);
        setIntField(term355, term355.getClass(), "horizontalTextPosition", 0);
        setIntField(term355, term355.getClass(), "iconTextGap", 0);
        setField(term355, term355.getClass(), "labelFor", null);
        setBooleanField(term355, term355.getClass(), "isAlignmentXSet", false);
        setFloatField(term355, term355.getClass(), "alignmentX", 0.0F);
        setBooleanField(term355, term355.getClass(), "isAlignmentYSet", false);
        setFloatField(term355, term355.getClass(), "alignmentY", 0.0F);
        setField(term355, term355.getClass(), "ui", null);
        setField(term355, term355.getClass(), "listenerList", null);
        setField(term355, term355.getClass(), "clientProperties", null);
        setField(term355, term355.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term355, term355.getClass(), "autoscrolls", false);
        setField(term355, term355.getClass(), "border", null);
        setIntField(term355, term355.getClass(), "flags", 0);
        setField(term355, term355.getClass(), "inputVerifier", null);
        setBooleanField(term355, term355.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term355, term355.getClass(), "paintingChild", null);
        setField(term355, term355.getClass(), "popupMenu", null);
        setField(term355, term355.getClass(), "revalidateRunnableScheduled", null);
        setField(term355, term355.getClass(), "focusInputMap", null);
        setField(term355, term355.getClass(), "ancestorInputMap", null);
        setField(term355, term355.getClass(), "windowInputMap", null);
        setField(term355, term355.getClass(), "actionMap", null);
        setField(term355, term355.getClass(), "aaHint", null);
        setField(term355, term355.getClass(), "lcdRenderingHint", null);
        setField(term355, term355.getClass(), "component", null);
        setField(term355, term355.getClass(), "layoutMgr", null);
        setField(term355, term355.getClass(), "dispatcher", null);
        setField(term355, term355.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term355, term355.getClass(), "focusCycleRoot", false);
        setBooleanField(term355, term355.getClass(), "focusTraversalPolicyProvider", false);
        setField(term355, term355.getClass(), "printingThreads", null);
        setBooleanField(term355, term355.getClass(), "printing", false);
        setField(term355, term355.getClass(), "containerListener", null);
        setIntField(term355, term355.getClass(), "listeningChildren", 0);
        setIntField(term355, term355.getClass(), "listeningBoundsChildren", 0);
        setIntField(term355, term355.getClass(), "descendantsCount", 0);
        setField(term355, term355.getClass(), "preserveBackgroundColor", null);
        setIntField(term355, term355.getClass(), "numOfHWComponents", 0);
        setIntField(term355, term355.getClass(), "numOfLWComponents", 0);
        setField(term355, term355.getClass(), "modalComp", null);
        setField(term355, term355.getClass(), "modalAppContext", null);
        setIntField(term355, term355.getClass(), "containerSerializedDataVersion", 0);
        setField(term355, term355.getClass(), "peer", null);
        setField(term355, term355.getClass(), "parent", null);
        setField(term355, term355.getClass(), "appContext", null);
        setIntField(term355, term355.getClass(), "x", 0);
        setIntField(term355, term355.getClass(), "y", 0);
        setIntField(term355, term355.getClass(), "width", 0);
        setIntField(term355, term355.getClass(), "height", 0);
        setField(term355, term355.getClass(), "foreground", null);
        setField(term355, term355.getClass(), "background", null);
        setField(term355, term355.getClass(), "font", null);
        setField(term355, term355.getClass(), "peerFont", null);
        setField(term355, term355.getClass(), "cursor", null);
        setField(term355, term355.getClass(), "locale", null);
        setField(term355, term355.getClass(), "graphicsConfig", null);
        setField(term355, term355.getClass(), "bufferStrategy", null);
        setBooleanField(term355, term355.getClass(), "ignoreRepaint", false);
        setBooleanField(term355, term355.getClass(), "visible", false);
        setBooleanField(term355, term355.getClass(), "enabled", false);
        setBooleanField(term355, term355.getClass(), "valid", false);
        setField(term355, term355.getClass(), "dropTarget", null);
        setField(term355, term355.getClass(), "popups", null);
        setField(term355, term355.getClass(), "name", null);
        setBooleanField(term355, term355.getClass(), "nameExplicitlySet", false);
        setBooleanField(term355, term355.getClass(), "focusable", false);
        setIntField(term355, term355.getClass(), "isFocusTraversableOverridden", 0);
        setField(term355, term355.getClass(), "focusTraversalKeys", null);
        setBooleanField(term355, term355.getClass(), "focusTraversalKeysEnabled", false);
        setField(term355, term355.getClass(), "acc", null);
        setField(term355, term355.getClass(), "minSize", null);
        setBooleanField(term355, term355.getClass(), "minSizeSet", false);
        setField(term355, term355.getClass(), "prefSize", null);
        setBooleanField(term355, term355.getClass(), "prefSizeSet", false);
        setField(term355, term355.getClass(), "maxSize", null);
        setBooleanField(term355, term355.getClass(), "maxSizeSet", false);
        setField(term355, term355.getClass(), "componentOrientation", null);
        setBooleanField(term355, term355.getClass(), "newEventsOnly", false);
        setField(term355, term355.getClass(), "componentListener", null);
        setField(term355, term355.getClass(), "focusListener", null);
        setField(term355, term355.getClass(), "hierarchyListener", null);
        setField(term355, term355.getClass(), "hierarchyBoundsListener", null);
        setField(term355, term355.getClass(), "keyListener", null);
        setField(term355, term355.getClass(), "mouseListener", null);
        setField(term355, term355.getClass(), "mouseMotionListener", null);
        setField(term355, term355.getClass(), "mouseWheelListener", null);
        setField(term355, term355.getClass(), "inputMethodListener", null);
        setLongField(term355, term355.getClass(), "eventMask", 0L);
        setField(term355, term355.getClass(), "changeSupport", null);
        setField(term355, term355.getClass(), "objectLock", null);
        setBooleanField(term355, term355.getClass(), "isPacked", false);
        setIntField(term355, term355.getClass(), "boundsOp", 0);
        setField(term355, term355.getClass(), "compoundShape", null);
        setField(term355, term355.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term355, term355.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term355, term355.getClass(), "backgroundEraseDisabled", false);
        setField(term355, term355.getClass(), "eventCache", null);
        setBooleanField(term355, term355.getClass(), "coalescingEnabled", false);
        setBooleanField(term355, term355.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term355, term355.getClass(), "componentSerializedDataVersion", 0);
        setField(term355, term355.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.SpaceLabel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Graphics");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "paintComponent", argTypes, term355, args);
    }

};


