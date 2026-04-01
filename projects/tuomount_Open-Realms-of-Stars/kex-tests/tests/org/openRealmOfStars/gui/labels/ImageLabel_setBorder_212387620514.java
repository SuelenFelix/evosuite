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

public class ImageLabel_setBorder_212387620514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1925;
     Object term1976;

    public ImageLabel_setBorder_212387620514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1925 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.ImageLabel"));
        setField(term1925, term1925.getClass(), "image", null);
        setBooleanField(term1925, term1925.getClass(), "border", false);
        setField(term1925, term1925.getClass(), "fillColor", null);
        setBooleanField(term1925, term1925.getClass(), "center", false);
        setIntField(term1925, term1925.getClass(), "mnemonic", 0);
        setIntField(term1925, term1925.getClass(), "mnemonicIndex", 0);
        setField(term1925, term1925.getClass(), "text", null);
        setField(term1925, term1925.getClass(), "defaultIcon", null);
        setField(term1925, term1925.getClass(), "disabledIcon", null);
        setBooleanField(term1925, term1925.getClass(), "disabledIconSet", false);
        setIntField(term1925, term1925.getClass(), "verticalAlignment", 0);
        setIntField(term1925, term1925.getClass(), "horizontalAlignment", 0);
        setIntField(term1925, term1925.getClass(), "verticalTextPosition", 0);
        setIntField(term1925, term1925.getClass(), "horizontalTextPosition", 0);
        setIntField(term1925, term1925.getClass(), "iconTextGap", 0);
        setField(term1925, term1925.getClass(), "labelFor", null);
        setBooleanField(term1925, term1925.getClass(), "isAlignmentXSet", false);
        setFloatField(term1925, term1925.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1925, term1925.getClass(), "isAlignmentYSet", false);
        setFloatField(term1925, term1925.getClass(), "alignmentY", 0.0F);
        setField(term1925, term1925.getClass(), "ui", null);
        setField(term1925, term1925.getClass(), "listenerList", null);
        setField(term1925, term1925.getClass(), "clientProperties", null);
        setField(term1925, term1925.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1925, term1925.getClass(), "autoscrolls", false);
        setField(term1925, term1925.getClass(), "border", null);
        setIntField(term1925, term1925.getClass(), "flags", 0);
        setField(term1925, term1925.getClass(), "inputVerifier", null);
        setBooleanField(term1925, term1925.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1925, term1925.getClass(), "paintingChild", null);
        setField(term1925, term1925.getClass(), "popupMenu", null);
        setField(term1925, term1925.getClass(), "revalidateRunnableScheduled", null);
        setField(term1925, term1925.getClass(), "focusInputMap", null);
        setField(term1925, term1925.getClass(), "ancestorInputMap", null);
        setField(term1925, term1925.getClass(), "windowInputMap", null);
        setField(term1925, term1925.getClass(), "actionMap", null);
        setField(term1925, term1925.getClass(), "aaHint", null);
        setField(term1925, term1925.getClass(), "lcdRenderingHint", null);
        setField(term1925, term1925.getClass(), "component", null);
        setField(term1925, term1925.getClass(), "layoutMgr", null);
        setField(term1925, term1925.getClass(), "dispatcher", null);
        setField(term1925, term1925.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1925, term1925.getClass(), "focusCycleRoot", false);
        setBooleanField(term1925, term1925.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1925, term1925.getClass(), "printingThreads", null);
        setBooleanField(term1925, term1925.getClass(), "printing", false);
        setField(term1925, term1925.getClass(), "containerListener", null);
        setIntField(term1925, term1925.getClass(), "listeningChildren", 0);
        setIntField(term1925, term1925.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1925, term1925.getClass(), "descendantsCount", 0);
        setField(term1925, term1925.getClass(), "preserveBackgroundColor", null);
        setIntField(term1925, term1925.getClass(), "numOfHWComponents", 0);
        setIntField(term1925, term1925.getClass(), "numOfLWComponents", 0);
        setField(term1925, term1925.getClass(), "modalComp", null);
        setField(term1925, term1925.getClass(), "modalAppContext", null);
        setIntField(term1925, term1925.getClass(), "containerSerializedDataVersion", 0);
        setField(term1925, term1925.getClass(), "peer", null);
        setField(term1925, term1925.getClass(), "parent", null);
        setField(term1925, term1925.getClass(), "appContext", null);
        setIntField(term1925, term1925.getClass(), "x", 0);
        setIntField(term1925, term1925.getClass(), "y", 0);
        setIntField(term1925, term1925.getClass(), "width", 0);
        setIntField(term1925, term1925.getClass(), "height", 0);
        setField(term1925, term1925.getClass(), "foreground", null);
        setField(term1925, term1925.getClass(), "background", null);
        setField(term1925, term1925.getClass(), "font", null);
        setField(term1925, term1925.getClass(), "peerFont", null);
        setField(term1925, term1925.getClass(), "cursor", null);
        setField(term1925, term1925.getClass(), "locale", null);
        setField(term1925, term1925.getClass(), "graphicsConfig", null);
        setField(term1925, term1925.getClass(), "bufferStrategy", null);
        setBooleanField(term1925, term1925.getClass(), "ignoreRepaint", false);
        setBooleanField(term1925, term1925.getClass(), "visible", false);
        setBooleanField(term1925, term1925.getClass(), "enabled", false);
        setBooleanField(term1925, term1925.getClass(), "valid", false);
        setField(term1925, term1925.getClass(), "dropTarget", null);
        setField(term1925, term1925.getClass(), "popups", null);
        setField(term1925, term1925.getClass(), "name", null);
        setBooleanField(term1925, term1925.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1925, term1925.getClass(), "focusable", false);
        setIntField(term1925, term1925.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1925, term1925.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1925, term1925.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1925, term1925.getClass(), "acc", null);
        setField(term1925, term1925.getClass(), "minSize", null);
        setBooleanField(term1925, term1925.getClass(), "minSizeSet", false);
        setField(term1925, term1925.getClass(), "prefSize", null);
        setBooleanField(term1925, term1925.getClass(), "prefSizeSet", false);
        setField(term1925, term1925.getClass(), "maxSize", null);
        setBooleanField(term1925, term1925.getClass(), "maxSizeSet", false);
        setField(term1925, term1925.getClass(), "componentOrientation", null);
        setBooleanField(term1925, term1925.getClass(), "newEventsOnly", false);
        setField(term1925, term1925.getClass(), "componentListener", null);
        setField(term1925, term1925.getClass(), "focusListener", null);
        setField(term1925, term1925.getClass(), "hierarchyListener", null);
        setField(term1925, term1925.getClass(), "hierarchyBoundsListener", null);
        setField(term1925, term1925.getClass(), "keyListener", null);
        setField(term1925, term1925.getClass(), "mouseListener", null);
        setField(term1925, term1925.getClass(), "mouseMotionListener", null);
        setField(term1925, term1925.getClass(), "mouseWheelListener", null);
        setField(term1925, term1925.getClass(), "inputMethodListener", null);
        setLongField(term1925, term1925.getClass(), "eventMask", 0L);
        setField(term1925, term1925.getClass(), "changeSupport", null);
        setField(term1925, term1925.getClass(), "objectLock", null);
        setBooleanField(term1925, term1925.getClass(), "isPacked", false);
        setIntField(term1925, term1925.getClass(), "boundsOp", 0);
        setField(term1925, term1925.getClass(), "compoundShape", null);
        setField(term1925, term1925.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1925, term1925.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1925, term1925.getClass(), "backgroundEraseDisabled", false);
        setField(term1925, term1925.getClass(), "eventCache", null);
        setBooleanField(term1925, term1925.getClass(), "coalescingEnabled", false);
        setBooleanField(term1925, term1925.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1925, term1925.getClass(), "componentSerializedDataVersion", 0);
        setField(term1925, term1925.getClass(), "accessibleContext", null);
        term1976 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.ImageLabel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1976;
        callMethod(klass, "setBorder", argTypes, term1925, args);
    }

};


