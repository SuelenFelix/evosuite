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

public class ImageLabel_setImage_59604264212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1823;

    public ImageLabel_setImage_59604264212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1823 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.ImageLabel"));
        setField(term1823, term1823.getClass(), "image", null);
        setBooleanField(term1823, term1823.getClass(), "border", false);
        setField(term1823, term1823.getClass(), "fillColor", null);
        setBooleanField(term1823, term1823.getClass(), "center", false);
        setIntField(term1823, term1823.getClass(), "mnemonic", 0);
        setIntField(term1823, term1823.getClass(), "mnemonicIndex", 0);
        setField(term1823, term1823.getClass(), "text", null);
        setField(term1823, term1823.getClass(), "defaultIcon", null);
        setField(term1823, term1823.getClass(), "disabledIcon", null);
        setBooleanField(term1823, term1823.getClass(), "disabledIconSet", false);
        setIntField(term1823, term1823.getClass(), "verticalAlignment", 0);
        setIntField(term1823, term1823.getClass(), "horizontalAlignment", 0);
        setIntField(term1823, term1823.getClass(), "verticalTextPosition", 0);
        setIntField(term1823, term1823.getClass(), "horizontalTextPosition", 0);
        setIntField(term1823, term1823.getClass(), "iconTextGap", 0);
        setField(term1823, term1823.getClass(), "labelFor", null);
        setBooleanField(term1823, term1823.getClass(), "isAlignmentXSet", false);
        setFloatField(term1823, term1823.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1823, term1823.getClass(), "isAlignmentYSet", false);
        setFloatField(term1823, term1823.getClass(), "alignmentY", 0.0F);
        setField(term1823, term1823.getClass(), "ui", null);
        setField(term1823, term1823.getClass(), "listenerList", null);
        setField(term1823, term1823.getClass(), "clientProperties", null);
        setField(term1823, term1823.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1823, term1823.getClass(), "autoscrolls", false);
        setField(term1823, term1823.getClass(), "border", null);
        setIntField(term1823, term1823.getClass(), "flags", 0);
        setField(term1823, term1823.getClass(), "inputVerifier", null);
        setBooleanField(term1823, term1823.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1823, term1823.getClass(), "paintingChild", null);
        setField(term1823, term1823.getClass(), "popupMenu", null);
        setField(term1823, term1823.getClass(), "revalidateRunnableScheduled", null);
        setField(term1823, term1823.getClass(), "focusInputMap", null);
        setField(term1823, term1823.getClass(), "ancestorInputMap", null);
        setField(term1823, term1823.getClass(), "windowInputMap", null);
        setField(term1823, term1823.getClass(), "actionMap", null);
        setField(term1823, term1823.getClass(), "aaHint", null);
        setField(term1823, term1823.getClass(), "lcdRenderingHint", null);
        setField(term1823, term1823.getClass(), "component", null);
        setField(term1823, term1823.getClass(), "layoutMgr", null);
        setField(term1823, term1823.getClass(), "dispatcher", null);
        setField(term1823, term1823.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1823, term1823.getClass(), "focusCycleRoot", false);
        setBooleanField(term1823, term1823.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1823, term1823.getClass(), "printingThreads", null);
        setBooleanField(term1823, term1823.getClass(), "printing", false);
        setField(term1823, term1823.getClass(), "containerListener", null);
        setIntField(term1823, term1823.getClass(), "listeningChildren", 0);
        setIntField(term1823, term1823.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1823, term1823.getClass(), "descendantsCount", 0);
        setField(term1823, term1823.getClass(), "preserveBackgroundColor", null);
        setIntField(term1823, term1823.getClass(), "numOfHWComponents", 0);
        setIntField(term1823, term1823.getClass(), "numOfLWComponents", 0);
        setField(term1823, term1823.getClass(), "modalComp", null);
        setField(term1823, term1823.getClass(), "modalAppContext", null);
        setIntField(term1823, term1823.getClass(), "containerSerializedDataVersion", 0);
        setField(term1823, term1823.getClass(), "peer", null);
        setField(term1823, term1823.getClass(), "parent", null);
        setField(term1823, term1823.getClass(), "appContext", null);
        setIntField(term1823, term1823.getClass(), "x", 0);
        setIntField(term1823, term1823.getClass(), "y", 0);
        setIntField(term1823, term1823.getClass(), "width", 0);
        setIntField(term1823, term1823.getClass(), "height", 0);
        setField(term1823, term1823.getClass(), "foreground", null);
        setField(term1823, term1823.getClass(), "background", null);
        setField(term1823, term1823.getClass(), "font", null);
        setField(term1823, term1823.getClass(), "peerFont", null);
        setField(term1823, term1823.getClass(), "cursor", null);
        setField(term1823, term1823.getClass(), "locale", null);
        setField(term1823, term1823.getClass(), "graphicsConfig", null);
        setField(term1823, term1823.getClass(), "bufferStrategy", null);
        setBooleanField(term1823, term1823.getClass(), "ignoreRepaint", false);
        setBooleanField(term1823, term1823.getClass(), "visible", false);
        setBooleanField(term1823, term1823.getClass(), "enabled", false);
        setBooleanField(term1823, term1823.getClass(), "valid", false);
        setField(term1823, term1823.getClass(), "dropTarget", null);
        setField(term1823, term1823.getClass(), "popups", null);
        setField(term1823, term1823.getClass(), "name", null);
        setBooleanField(term1823, term1823.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1823, term1823.getClass(), "focusable", false);
        setIntField(term1823, term1823.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1823, term1823.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1823, term1823.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1823, term1823.getClass(), "acc", null);
        setField(term1823, term1823.getClass(), "minSize", null);
        setBooleanField(term1823, term1823.getClass(), "minSizeSet", false);
        setField(term1823, term1823.getClass(), "prefSize", null);
        setBooleanField(term1823, term1823.getClass(), "prefSizeSet", false);
        setField(term1823, term1823.getClass(), "maxSize", null);
        setBooleanField(term1823, term1823.getClass(), "maxSizeSet", false);
        setField(term1823, term1823.getClass(), "componentOrientation", null);
        setBooleanField(term1823, term1823.getClass(), "newEventsOnly", false);
        setField(term1823, term1823.getClass(), "componentListener", null);
        setField(term1823, term1823.getClass(), "focusListener", null);
        setField(term1823, term1823.getClass(), "hierarchyListener", null);
        setField(term1823, term1823.getClass(), "hierarchyBoundsListener", null);
        setField(term1823, term1823.getClass(), "keyListener", null);
        setField(term1823, term1823.getClass(), "mouseListener", null);
        setField(term1823, term1823.getClass(), "mouseMotionListener", null);
        setField(term1823, term1823.getClass(), "mouseWheelListener", null);
        setField(term1823, term1823.getClass(), "inputMethodListener", null);
        setLongField(term1823, term1823.getClass(), "eventMask", 0L);
        setField(term1823, term1823.getClass(), "changeSupport", null);
        setField(term1823, term1823.getClass(), "objectLock", null);
        setBooleanField(term1823, term1823.getClass(), "isPacked", false);
        setIntField(term1823, term1823.getClass(), "boundsOp", 0);
        setField(term1823, term1823.getClass(), "compoundShape", null);
        setField(term1823, term1823.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1823, term1823.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1823, term1823.getClass(), "backgroundEraseDisabled", false);
        setField(term1823, term1823.getClass(), "eventCache", null);
        setBooleanField(term1823, term1823.getClass(), "coalescingEnabled", false);
        setBooleanField(term1823, term1823.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1823, term1823.getClass(), "componentSerializedDataVersion", 0);
        setField(term1823, term1823.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.ImageLabel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setImage", argTypes, term1823, args);
    }

};


