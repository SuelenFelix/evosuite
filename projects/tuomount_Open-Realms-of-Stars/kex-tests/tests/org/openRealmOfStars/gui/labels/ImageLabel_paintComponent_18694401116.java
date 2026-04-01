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

public class ImageLabel_paintComponent_18694401116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2029;

    public ImageLabel_paintComponent_18694401116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2029 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.ImageLabel"));
        setField(term2029, term2029.getClass(), "image", null);
        setBooleanField(term2029, term2029.getClass(), "border", false);
        setField(term2029, term2029.getClass(), "fillColor", null);
        setBooleanField(term2029, term2029.getClass(), "center", false);
        setIntField(term2029, term2029.getClass(), "mnemonic", 0);
        setIntField(term2029, term2029.getClass(), "mnemonicIndex", 0);
        setField(term2029, term2029.getClass(), "text", null);
        setField(term2029, term2029.getClass(), "defaultIcon", null);
        setField(term2029, term2029.getClass(), "disabledIcon", null);
        setBooleanField(term2029, term2029.getClass(), "disabledIconSet", false);
        setIntField(term2029, term2029.getClass(), "verticalAlignment", 0);
        setIntField(term2029, term2029.getClass(), "horizontalAlignment", 0);
        setIntField(term2029, term2029.getClass(), "verticalTextPosition", 0);
        setIntField(term2029, term2029.getClass(), "horizontalTextPosition", 0);
        setIntField(term2029, term2029.getClass(), "iconTextGap", 0);
        setField(term2029, term2029.getClass(), "labelFor", null);
        setBooleanField(term2029, term2029.getClass(), "isAlignmentXSet", false);
        setFloatField(term2029, term2029.getClass(), "alignmentX", 0.0F);
        setBooleanField(term2029, term2029.getClass(), "isAlignmentYSet", false);
        setFloatField(term2029, term2029.getClass(), "alignmentY", 0.0F);
        setField(term2029, term2029.getClass(), "ui", null);
        setField(term2029, term2029.getClass(), "listenerList", null);
        setField(term2029, term2029.getClass(), "clientProperties", null);
        setField(term2029, term2029.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term2029, term2029.getClass(), "autoscrolls", false);
        setField(term2029, term2029.getClass(), "border", null);
        setIntField(term2029, term2029.getClass(), "flags", 0);
        setField(term2029, term2029.getClass(), "inputVerifier", null);
        setBooleanField(term2029, term2029.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term2029, term2029.getClass(), "paintingChild", null);
        setField(term2029, term2029.getClass(), "popupMenu", null);
        setField(term2029, term2029.getClass(), "revalidateRunnableScheduled", null);
        setField(term2029, term2029.getClass(), "focusInputMap", null);
        setField(term2029, term2029.getClass(), "ancestorInputMap", null);
        setField(term2029, term2029.getClass(), "windowInputMap", null);
        setField(term2029, term2029.getClass(), "actionMap", null);
        setField(term2029, term2029.getClass(), "aaHint", null);
        setField(term2029, term2029.getClass(), "lcdRenderingHint", null);
        setField(term2029, term2029.getClass(), "component", null);
        setField(term2029, term2029.getClass(), "layoutMgr", null);
        setField(term2029, term2029.getClass(), "dispatcher", null);
        setField(term2029, term2029.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2029, term2029.getClass(), "focusCycleRoot", false);
        setBooleanField(term2029, term2029.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2029, term2029.getClass(), "printingThreads", null);
        setBooleanField(term2029, term2029.getClass(), "printing", false);
        setField(term2029, term2029.getClass(), "containerListener", null);
        setIntField(term2029, term2029.getClass(), "listeningChildren", 0);
        setIntField(term2029, term2029.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2029, term2029.getClass(), "descendantsCount", 0);
        setField(term2029, term2029.getClass(), "preserveBackgroundColor", null);
        setIntField(term2029, term2029.getClass(), "numOfHWComponents", 0);
        setIntField(term2029, term2029.getClass(), "numOfLWComponents", 0);
        setField(term2029, term2029.getClass(), "modalComp", null);
        setField(term2029, term2029.getClass(), "modalAppContext", null);
        setIntField(term2029, term2029.getClass(), "containerSerializedDataVersion", 0);
        setField(term2029, term2029.getClass(), "peer", null);
        setField(term2029, term2029.getClass(), "parent", null);
        setField(term2029, term2029.getClass(), "appContext", null);
        setIntField(term2029, term2029.getClass(), "x", 0);
        setIntField(term2029, term2029.getClass(), "y", 0);
        setIntField(term2029, term2029.getClass(), "width", 0);
        setIntField(term2029, term2029.getClass(), "height", 0);
        setField(term2029, term2029.getClass(), "foreground", null);
        setField(term2029, term2029.getClass(), "background", null);
        setField(term2029, term2029.getClass(), "font", null);
        setField(term2029, term2029.getClass(), "peerFont", null);
        setField(term2029, term2029.getClass(), "cursor", null);
        setField(term2029, term2029.getClass(), "locale", null);
        setField(term2029, term2029.getClass(), "graphicsConfig", null);
        setField(term2029, term2029.getClass(), "bufferStrategy", null);
        setBooleanField(term2029, term2029.getClass(), "ignoreRepaint", false);
        setBooleanField(term2029, term2029.getClass(), "visible", false);
        setBooleanField(term2029, term2029.getClass(), "enabled", false);
        setBooleanField(term2029, term2029.getClass(), "valid", false);
        setField(term2029, term2029.getClass(), "dropTarget", null);
        setField(term2029, term2029.getClass(), "popups", null);
        setField(term2029, term2029.getClass(), "name", null);
        setBooleanField(term2029, term2029.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2029, term2029.getClass(), "focusable", false);
        setIntField(term2029, term2029.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2029, term2029.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2029, term2029.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2029, term2029.getClass(), "acc", null);
        setField(term2029, term2029.getClass(), "minSize", null);
        setBooleanField(term2029, term2029.getClass(), "minSizeSet", false);
        setField(term2029, term2029.getClass(), "prefSize", null);
        setBooleanField(term2029, term2029.getClass(), "prefSizeSet", false);
        setField(term2029, term2029.getClass(), "maxSize", null);
        setBooleanField(term2029, term2029.getClass(), "maxSizeSet", false);
        setField(term2029, term2029.getClass(), "componentOrientation", null);
        setBooleanField(term2029, term2029.getClass(), "newEventsOnly", false);
        setField(term2029, term2029.getClass(), "componentListener", null);
        setField(term2029, term2029.getClass(), "focusListener", null);
        setField(term2029, term2029.getClass(), "hierarchyListener", null);
        setField(term2029, term2029.getClass(), "hierarchyBoundsListener", null);
        setField(term2029, term2029.getClass(), "keyListener", null);
        setField(term2029, term2029.getClass(), "mouseListener", null);
        setField(term2029, term2029.getClass(), "mouseMotionListener", null);
        setField(term2029, term2029.getClass(), "mouseWheelListener", null);
        setField(term2029, term2029.getClass(), "inputMethodListener", null);
        setLongField(term2029, term2029.getClass(), "eventMask", 0L);
        setField(term2029, term2029.getClass(), "changeSupport", null);
        setField(term2029, term2029.getClass(), "objectLock", null);
        setBooleanField(term2029, term2029.getClass(), "isPacked", false);
        setIntField(term2029, term2029.getClass(), "boundsOp", 0);
        setField(term2029, term2029.getClass(), "compoundShape", null);
        setField(term2029, term2029.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2029, term2029.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2029, term2029.getClass(), "backgroundEraseDisabled", false);
        setField(term2029, term2029.getClass(), "eventCache", null);
        setBooleanField(term2029, term2029.getClass(), "coalescingEnabled", false);
        setBooleanField(term2029, term2029.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2029, term2029.getClass(), "componentSerializedDataVersion", 0);
        setField(term2029, term2029.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.ImageLabel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Graphics");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "paintComponent", argTypes, term2029, args);
    }

};


