package org.openRealmOfStars.gui.list;

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
import static org.openRealmOfStars.gui.list.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ProductionListRenderer_ProductionLabel_paintComponent_15090013803 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78521;

    public ProductionListRenderer_ProductionLabel_paintComponent_15090013803() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78521 = newInstance(Class.forName("org.openRealmOfStars.gui.list.ProductionListRenderer$ProductionLabel"));
        setIntField(term78521, term78521.getClass(), "mnemonic", 0);
        setIntField(term78521, term78521.getClass(), "mnemonicIndex", 0);
        setField(term78521, term78521.getClass(), "text", null);
        setField(term78521, term78521.getClass(), "defaultIcon", null);
        setField(term78521, term78521.getClass(), "disabledIcon", null);
        setBooleanField(term78521, term78521.getClass(), "disabledIconSet", false);
        setIntField(term78521, term78521.getClass(), "verticalAlignment", 0);
        setIntField(term78521, term78521.getClass(), "horizontalAlignment", 0);
        setIntField(term78521, term78521.getClass(), "verticalTextPosition", 0);
        setIntField(term78521, term78521.getClass(), "horizontalTextPosition", 0);
        setIntField(term78521, term78521.getClass(), "iconTextGap", 0);
        setField(term78521, term78521.getClass(), "labelFor", null);
        setBooleanField(term78521, term78521.getClass(), "isAlignmentXSet", false);
        setFloatField(term78521, term78521.getClass(), "alignmentX", 0.0F);
        setBooleanField(term78521, term78521.getClass(), "isAlignmentYSet", false);
        setFloatField(term78521, term78521.getClass(), "alignmentY", 0.0F);
        setField(term78521, term78521.getClass(), "ui", null);
        setField(term78521, term78521.getClass(), "listenerList", null);
        setField(term78521, term78521.getClass(), "clientProperties", null);
        setField(term78521, term78521.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term78521, term78521.getClass(), "autoscrolls", false);
        setField(term78521, term78521.getClass(), "border", null);
        setIntField(term78521, term78521.getClass(), "flags", 0);
        setField(term78521, term78521.getClass(), "inputVerifier", null);
        setBooleanField(term78521, term78521.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term78521, term78521.getClass(), "paintingChild", null);
        setField(term78521, term78521.getClass(), "popupMenu", null);
        setField(term78521, term78521.getClass(), "revalidateRunnableScheduled", null);
        setField(term78521, term78521.getClass(), "focusInputMap", null);
        setField(term78521, term78521.getClass(), "ancestorInputMap", null);
        setField(term78521, term78521.getClass(), "windowInputMap", null);
        setField(term78521, term78521.getClass(), "actionMap", null);
        setField(term78521, term78521.getClass(), "aaHint", null);
        setField(term78521, term78521.getClass(), "lcdRenderingHint", null);
        setField(term78521, term78521.getClass(), "component", null);
        setField(term78521, term78521.getClass(), "layoutMgr", null);
        setField(term78521, term78521.getClass(), "dispatcher", null);
        setField(term78521, term78521.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term78521, term78521.getClass(), "focusCycleRoot", false);
        setBooleanField(term78521, term78521.getClass(), "focusTraversalPolicyProvider", false);
        setField(term78521, term78521.getClass(), "printingThreads", null);
        setBooleanField(term78521, term78521.getClass(), "printing", false);
        setField(term78521, term78521.getClass(), "containerListener", null);
        setIntField(term78521, term78521.getClass(), "listeningChildren", 0);
        setIntField(term78521, term78521.getClass(), "listeningBoundsChildren", 0);
        setIntField(term78521, term78521.getClass(), "descendantsCount", 0);
        setField(term78521, term78521.getClass(), "preserveBackgroundColor", null);
        setIntField(term78521, term78521.getClass(), "numOfHWComponents", 0);
        setIntField(term78521, term78521.getClass(), "numOfLWComponents", 0);
        setField(term78521, term78521.getClass(), "modalComp", null);
        setField(term78521, term78521.getClass(), "modalAppContext", null);
        setIntField(term78521, term78521.getClass(), "containerSerializedDataVersion", 0);
        setField(term78521, term78521.getClass(), "peer", null);
        setField(term78521, term78521.getClass(), "parent", null);
        setField(term78521, term78521.getClass(), "appContext", null);
        setIntField(term78521, term78521.getClass(), "x", 0);
        setIntField(term78521, term78521.getClass(), "y", 0);
        setIntField(term78521, term78521.getClass(), "width", 0);
        setIntField(term78521, term78521.getClass(), "height", 0);
        setField(term78521, term78521.getClass(), "foreground", null);
        setField(term78521, term78521.getClass(), "background", null);
        setField(term78521, term78521.getClass(), "font", null);
        setField(term78521, term78521.getClass(), "peerFont", null);
        setField(term78521, term78521.getClass(), "cursor", null);
        setField(term78521, term78521.getClass(), "locale", null);
        setField(term78521, term78521.getClass(), "graphicsConfig", null);
        setField(term78521, term78521.getClass(), "bufferStrategy", null);
        setBooleanField(term78521, term78521.getClass(), "ignoreRepaint", false);
        setBooleanField(term78521, term78521.getClass(), "visible", false);
        setBooleanField(term78521, term78521.getClass(), "enabled", false);
        setBooleanField(term78521, term78521.getClass(), "valid", false);
        setField(term78521, term78521.getClass(), "dropTarget", null);
        setField(term78521, term78521.getClass(), "popups", null);
        setField(term78521, term78521.getClass(), "name", null);
        setBooleanField(term78521, term78521.getClass(), "nameExplicitlySet", false);
        setBooleanField(term78521, term78521.getClass(), "focusable", false);
        setIntField(term78521, term78521.getClass(), "isFocusTraversableOverridden", 0);
        setField(term78521, term78521.getClass(), "focusTraversalKeys", null);
        setBooleanField(term78521, term78521.getClass(), "focusTraversalKeysEnabled", false);
        setField(term78521, term78521.getClass(), "acc", null);
        setField(term78521, term78521.getClass(), "minSize", null);
        setBooleanField(term78521, term78521.getClass(), "minSizeSet", false);
        setField(term78521, term78521.getClass(), "prefSize", null);
        setBooleanField(term78521, term78521.getClass(), "prefSizeSet", false);
        setField(term78521, term78521.getClass(), "maxSize", null);
        setBooleanField(term78521, term78521.getClass(), "maxSizeSet", false);
        setField(term78521, term78521.getClass(), "componentOrientation", null);
        setBooleanField(term78521, term78521.getClass(), "newEventsOnly", false);
        setField(term78521, term78521.getClass(), "componentListener", null);
        setField(term78521, term78521.getClass(), "focusListener", null);
        setField(term78521, term78521.getClass(), "hierarchyListener", null);
        setField(term78521, term78521.getClass(), "hierarchyBoundsListener", null);
        setField(term78521, term78521.getClass(), "keyListener", null);
        setField(term78521, term78521.getClass(), "mouseListener", null);
        setField(term78521, term78521.getClass(), "mouseMotionListener", null);
        setField(term78521, term78521.getClass(), "mouseWheelListener", null);
        setField(term78521, term78521.getClass(), "inputMethodListener", null);
        setLongField(term78521, term78521.getClass(), "eventMask", 0L);
        setField(term78521, term78521.getClass(), "changeSupport", null);
        setField(term78521, term78521.getClass(), "objectLock", null);
        setBooleanField(term78521, term78521.getClass(), "isPacked", false);
        setIntField(term78521, term78521.getClass(), "boundsOp", 0);
        setField(term78521, term78521.getClass(), "compoundShape", null);
        setField(term78521, term78521.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term78521, term78521.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term78521, term78521.getClass(), "backgroundEraseDisabled", false);
        setField(term78521, term78521.getClass(), "eventCache", null);
        setBooleanField(term78521, term78521.getClass(), "coalescingEnabled", false);
        setBooleanField(term78521, term78521.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term78521, term78521.getClass(), "componentSerializedDataVersion", 0);
        setField(term78521, term78521.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.list.ProductionListRenderer$ProductionLabel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Graphics");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "paintComponent", argTypes, term78521, args);
    }

};


