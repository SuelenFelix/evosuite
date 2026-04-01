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

public class ImageLabel_setFillColor_87397810418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2131;

    public ImageLabel_setFillColor_87397810418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2131 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.ImageLabel"));
        setField(term2131, term2131.getClass(), "image", null);
        setBooleanField(term2131, term2131.getClass(), "border", false);
        setField(term2131, term2131.getClass(), "fillColor", null);
        setBooleanField(term2131, term2131.getClass(), "center", false);
        setIntField(term2131, term2131.getClass(), "mnemonic", 0);
        setIntField(term2131, term2131.getClass(), "mnemonicIndex", 0);
        setField(term2131, term2131.getClass(), "text", null);
        setField(term2131, term2131.getClass(), "defaultIcon", null);
        setField(term2131, term2131.getClass(), "disabledIcon", null);
        setBooleanField(term2131, term2131.getClass(), "disabledIconSet", false);
        setIntField(term2131, term2131.getClass(), "verticalAlignment", 0);
        setIntField(term2131, term2131.getClass(), "horizontalAlignment", 0);
        setIntField(term2131, term2131.getClass(), "verticalTextPosition", 0);
        setIntField(term2131, term2131.getClass(), "horizontalTextPosition", 0);
        setIntField(term2131, term2131.getClass(), "iconTextGap", 0);
        setField(term2131, term2131.getClass(), "labelFor", null);
        setBooleanField(term2131, term2131.getClass(), "isAlignmentXSet", false);
        setFloatField(term2131, term2131.getClass(), "alignmentX", 0.0F);
        setBooleanField(term2131, term2131.getClass(), "isAlignmentYSet", false);
        setFloatField(term2131, term2131.getClass(), "alignmentY", 0.0F);
        setField(term2131, term2131.getClass(), "ui", null);
        setField(term2131, term2131.getClass(), "listenerList", null);
        setField(term2131, term2131.getClass(), "clientProperties", null);
        setField(term2131, term2131.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term2131, term2131.getClass(), "autoscrolls", false);
        setField(term2131, term2131.getClass(), "border", null);
        setIntField(term2131, term2131.getClass(), "flags", 0);
        setField(term2131, term2131.getClass(), "inputVerifier", null);
        setBooleanField(term2131, term2131.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term2131, term2131.getClass(), "paintingChild", null);
        setField(term2131, term2131.getClass(), "popupMenu", null);
        setField(term2131, term2131.getClass(), "revalidateRunnableScheduled", null);
        setField(term2131, term2131.getClass(), "focusInputMap", null);
        setField(term2131, term2131.getClass(), "ancestorInputMap", null);
        setField(term2131, term2131.getClass(), "windowInputMap", null);
        setField(term2131, term2131.getClass(), "actionMap", null);
        setField(term2131, term2131.getClass(), "aaHint", null);
        setField(term2131, term2131.getClass(), "lcdRenderingHint", null);
        setField(term2131, term2131.getClass(), "component", null);
        setField(term2131, term2131.getClass(), "layoutMgr", null);
        setField(term2131, term2131.getClass(), "dispatcher", null);
        setField(term2131, term2131.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2131, term2131.getClass(), "focusCycleRoot", false);
        setBooleanField(term2131, term2131.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2131, term2131.getClass(), "printingThreads", null);
        setBooleanField(term2131, term2131.getClass(), "printing", false);
        setField(term2131, term2131.getClass(), "containerListener", null);
        setIntField(term2131, term2131.getClass(), "listeningChildren", 0);
        setIntField(term2131, term2131.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2131, term2131.getClass(), "descendantsCount", 0);
        setField(term2131, term2131.getClass(), "preserveBackgroundColor", null);
        setIntField(term2131, term2131.getClass(), "numOfHWComponents", 0);
        setIntField(term2131, term2131.getClass(), "numOfLWComponents", 0);
        setField(term2131, term2131.getClass(), "modalComp", null);
        setField(term2131, term2131.getClass(), "modalAppContext", null);
        setIntField(term2131, term2131.getClass(), "containerSerializedDataVersion", 0);
        setField(term2131, term2131.getClass(), "peer", null);
        setField(term2131, term2131.getClass(), "parent", null);
        setField(term2131, term2131.getClass(), "appContext", null);
        setIntField(term2131, term2131.getClass(), "x", 0);
        setIntField(term2131, term2131.getClass(), "y", 0);
        setIntField(term2131, term2131.getClass(), "width", 0);
        setIntField(term2131, term2131.getClass(), "height", 0);
        setField(term2131, term2131.getClass(), "foreground", null);
        setField(term2131, term2131.getClass(), "background", null);
        setField(term2131, term2131.getClass(), "font", null);
        setField(term2131, term2131.getClass(), "peerFont", null);
        setField(term2131, term2131.getClass(), "cursor", null);
        setField(term2131, term2131.getClass(), "locale", null);
        setField(term2131, term2131.getClass(), "graphicsConfig", null);
        setField(term2131, term2131.getClass(), "bufferStrategy", null);
        setBooleanField(term2131, term2131.getClass(), "ignoreRepaint", false);
        setBooleanField(term2131, term2131.getClass(), "visible", false);
        setBooleanField(term2131, term2131.getClass(), "enabled", false);
        setBooleanField(term2131, term2131.getClass(), "valid", false);
        setField(term2131, term2131.getClass(), "dropTarget", null);
        setField(term2131, term2131.getClass(), "popups", null);
        setField(term2131, term2131.getClass(), "name", null);
        setBooleanField(term2131, term2131.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2131, term2131.getClass(), "focusable", false);
        setIntField(term2131, term2131.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2131, term2131.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2131, term2131.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2131, term2131.getClass(), "acc", null);
        setField(term2131, term2131.getClass(), "minSize", null);
        setBooleanField(term2131, term2131.getClass(), "minSizeSet", false);
        setField(term2131, term2131.getClass(), "prefSize", null);
        setBooleanField(term2131, term2131.getClass(), "prefSizeSet", false);
        setField(term2131, term2131.getClass(), "maxSize", null);
        setBooleanField(term2131, term2131.getClass(), "maxSizeSet", false);
        setField(term2131, term2131.getClass(), "componentOrientation", null);
        setBooleanField(term2131, term2131.getClass(), "newEventsOnly", false);
        setField(term2131, term2131.getClass(), "componentListener", null);
        setField(term2131, term2131.getClass(), "focusListener", null);
        setField(term2131, term2131.getClass(), "hierarchyListener", null);
        setField(term2131, term2131.getClass(), "hierarchyBoundsListener", null);
        setField(term2131, term2131.getClass(), "keyListener", null);
        setField(term2131, term2131.getClass(), "mouseListener", null);
        setField(term2131, term2131.getClass(), "mouseMotionListener", null);
        setField(term2131, term2131.getClass(), "mouseWheelListener", null);
        setField(term2131, term2131.getClass(), "inputMethodListener", null);
        setLongField(term2131, term2131.getClass(), "eventMask", 0L);
        setField(term2131, term2131.getClass(), "changeSupport", null);
        setField(term2131, term2131.getClass(), "objectLock", null);
        setBooleanField(term2131, term2131.getClass(), "isPacked", false);
        setIntField(term2131, term2131.getClass(), "boundsOp", 0);
        setField(term2131, term2131.getClass(), "compoundShape", null);
        setField(term2131, term2131.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2131, term2131.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2131, term2131.getClass(), "backgroundEraseDisabled", false);
        setField(term2131, term2131.getClass(), "eventCache", null);
        setBooleanField(term2131, term2131.getClass(), "coalescingEnabled", false);
        setBooleanField(term2131, term2131.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2131, term2131.getClass(), "componentSerializedDataVersion", 0);
        setField(term2131, term2131.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.ImageLabel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Color");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFillColor", argTypes, term2131, args);
    }

};


