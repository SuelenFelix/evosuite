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
import java.lang.Boolean;

public class ImageLabel_setCenter_81312324220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2233;
     Object term2284;

    public ImageLabel_setCenter_81312324220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2233 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.ImageLabel"));
        setField(term2233, term2233.getClass(), "image", null);
        setBooleanField(term2233, term2233.getClass(), "border", false);
        setField(term2233, term2233.getClass(), "fillColor", null);
        setBooleanField(term2233, term2233.getClass(), "center", false);
        setIntField(term2233, term2233.getClass(), "mnemonic", 0);
        setIntField(term2233, term2233.getClass(), "mnemonicIndex", 0);
        setField(term2233, term2233.getClass(), "text", null);
        setField(term2233, term2233.getClass(), "defaultIcon", null);
        setField(term2233, term2233.getClass(), "disabledIcon", null);
        setBooleanField(term2233, term2233.getClass(), "disabledIconSet", false);
        setIntField(term2233, term2233.getClass(), "verticalAlignment", 0);
        setIntField(term2233, term2233.getClass(), "horizontalAlignment", 0);
        setIntField(term2233, term2233.getClass(), "verticalTextPosition", 0);
        setIntField(term2233, term2233.getClass(), "horizontalTextPosition", 0);
        setIntField(term2233, term2233.getClass(), "iconTextGap", 0);
        setField(term2233, term2233.getClass(), "labelFor", null);
        setBooleanField(term2233, term2233.getClass(), "isAlignmentXSet", false);
        setFloatField(term2233, term2233.getClass(), "alignmentX", 0.0F);
        setBooleanField(term2233, term2233.getClass(), "isAlignmentYSet", false);
        setFloatField(term2233, term2233.getClass(), "alignmentY", 0.0F);
        setField(term2233, term2233.getClass(), "ui", null);
        setField(term2233, term2233.getClass(), "listenerList", null);
        setField(term2233, term2233.getClass(), "clientProperties", null);
        setField(term2233, term2233.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term2233, term2233.getClass(), "autoscrolls", false);
        setField(term2233, term2233.getClass(), "border", null);
        setIntField(term2233, term2233.getClass(), "flags", 0);
        setField(term2233, term2233.getClass(), "inputVerifier", null);
        setBooleanField(term2233, term2233.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term2233, term2233.getClass(), "paintingChild", null);
        setField(term2233, term2233.getClass(), "popupMenu", null);
        setField(term2233, term2233.getClass(), "revalidateRunnableScheduled", null);
        setField(term2233, term2233.getClass(), "focusInputMap", null);
        setField(term2233, term2233.getClass(), "ancestorInputMap", null);
        setField(term2233, term2233.getClass(), "windowInputMap", null);
        setField(term2233, term2233.getClass(), "actionMap", null);
        setField(term2233, term2233.getClass(), "aaHint", null);
        setField(term2233, term2233.getClass(), "lcdRenderingHint", null);
        setField(term2233, term2233.getClass(), "component", null);
        setField(term2233, term2233.getClass(), "layoutMgr", null);
        setField(term2233, term2233.getClass(), "dispatcher", null);
        setField(term2233, term2233.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2233, term2233.getClass(), "focusCycleRoot", false);
        setBooleanField(term2233, term2233.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2233, term2233.getClass(), "printingThreads", null);
        setBooleanField(term2233, term2233.getClass(), "printing", false);
        setField(term2233, term2233.getClass(), "containerListener", null);
        setIntField(term2233, term2233.getClass(), "listeningChildren", 0);
        setIntField(term2233, term2233.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2233, term2233.getClass(), "descendantsCount", 0);
        setField(term2233, term2233.getClass(), "preserveBackgroundColor", null);
        setIntField(term2233, term2233.getClass(), "numOfHWComponents", 0);
        setIntField(term2233, term2233.getClass(), "numOfLWComponents", 0);
        setField(term2233, term2233.getClass(), "modalComp", null);
        setField(term2233, term2233.getClass(), "modalAppContext", null);
        setIntField(term2233, term2233.getClass(), "containerSerializedDataVersion", 0);
        setField(term2233, term2233.getClass(), "peer", null);
        setField(term2233, term2233.getClass(), "parent", null);
        setField(term2233, term2233.getClass(), "appContext", null);
        setIntField(term2233, term2233.getClass(), "x", 0);
        setIntField(term2233, term2233.getClass(), "y", 0);
        setIntField(term2233, term2233.getClass(), "width", 0);
        setIntField(term2233, term2233.getClass(), "height", 0);
        setField(term2233, term2233.getClass(), "foreground", null);
        setField(term2233, term2233.getClass(), "background", null);
        setField(term2233, term2233.getClass(), "font", null);
        setField(term2233, term2233.getClass(), "peerFont", null);
        setField(term2233, term2233.getClass(), "cursor", null);
        setField(term2233, term2233.getClass(), "locale", null);
        setField(term2233, term2233.getClass(), "graphicsConfig", null);
        setField(term2233, term2233.getClass(), "bufferStrategy", null);
        setBooleanField(term2233, term2233.getClass(), "ignoreRepaint", false);
        setBooleanField(term2233, term2233.getClass(), "visible", false);
        setBooleanField(term2233, term2233.getClass(), "enabled", false);
        setBooleanField(term2233, term2233.getClass(), "valid", false);
        setField(term2233, term2233.getClass(), "dropTarget", null);
        setField(term2233, term2233.getClass(), "popups", null);
        setField(term2233, term2233.getClass(), "name", null);
        setBooleanField(term2233, term2233.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2233, term2233.getClass(), "focusable", false);
        setIntField(term2233, term2233.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2233, term2233.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2233, term2233.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2233, term2233.getClass(), "acc", null);
        setField(term2233, term2233.getClass(), "minSize", null);
        setBooleanField(term2233, term2233.getClass(), "minSizeSet", false);
        setField(term2233, term2233.getClass(), "prefSize", null);
        setBooleanField(term2233, term2233.getClass(), "prefSizeSet", false);
        setField(term2233, term2233.getClass(), "maxSize", null);
        setBooleanField(term2233, term2233.getClass(), "maxSizeSet", false);
        setField(term2233, term2233.getClass(), "componentOrientation", null);
        setBooleanField(term2233, term2233.getClass(), "newEventsOnly", false);
        setField(term2233, term2233.getClass(), "componentListener", null);
        setField(term2233, term2233.getClass(), "focusListener", null);
        setField(term2233, term2233.getClass(), "hierarchyListener", null);
        setField(term2233, term2233.getClass(), "hierarchyBoundsListener", null);
        setField(term2233, term2233.getClass(), "keyListener", null);
        setField(term2233, term2233.getClass(), "mouseListener", null);
        setField(term2233, term2233.getClass(), "mouseMotionListener", null);
        setField(term2233, term2233.getClass(), "mouseWheelListener", null);
        setField(term2233, term2233.getClass(), "inputMethodListener", null);
        setLongField(term2233, term2233.getClass(), "eventMask", 0L);
        setField(term2233, term2233.getClass(), "changeSupport", null);
        setField(term2233, term2233.getClass(), "objectLock", null);
        setBooleanField(term2233, term2233.getClass(), "isPacked", false);
        setIntField(term2233, term2233.getClass(), "boundsOp", 0);
        setField(term2233, term2233.getClass(), "compoundShape", null);
        setField(term2233, term2233.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2233, term2233.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2233, term2233.getClass(), "backgroundEraseDisabled", false);
        setField(term2233, term2233.getClass(), "eventCache", null);
        setBooleanField(term2233, term2233.getClass(), "coalescingEnabled", false);
        setBooleanField(term2233, term2233.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2233, term2233.getClass(), "componentSerializedDataVersion", 0);
        setField(term2233, term2233.getClass(), "accessibleContext", null);
        term2284 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.ImageLabel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2284;
        callMethod(klass, "setCenter", argTypes, term2233, args);
    }

};


