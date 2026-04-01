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

public class ImageLabel_isCenter_69562698419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2182;

    public ImageLabel_isCenter_69562698419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2182 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.ImageLabel"));
        setField(term2182, term2182.getClass(), "image", null);
        setBooleanField(term2182, term2182.getClass(), "border", false);
        setField(term2182, term2182.getClass(), "fillColor", null);
        setBooleanField(term2182, term2182.getClass(), "center", false);
        setIntField(term2182, term2182.getClass(), "mnemonic", 0);
        setIntField(term2182, term2182.getClass(), "mnemonicIndex", 0);
        setField(term2182, term2182.getClass(), "text", null);
        setField(term2182, term2182.getClass(), "defaultIcon", null);
        setField(term2182, term2182.getClass(), "disabledIcon", null);
        setBooleanField(term2182, term2182.getClass(), "disabledIconSet", false);
        setIntField(term2182, term2182.getClass(), "verticalAlignment", 0);
        setIntField(term2182, term2182.getClass(), "horizontalAlignment", 0);
        setIntField(term2182, term2182.getClass(), "verticalTextPosition", 0);
        setIntField(term2182, term2182.getClass(), "horizontalTextPosition", 0);
        setIntField(term2182, term2182.getClass(), "iconTextGap", 0);
        setField(term2182, term2182.getClass(), "labelFor", null);
        setBooleanField(term2182, term2182.getClass(), "isAlignmentXSet", false);
        setFloatField(term2182, term2182.getClass(), "alignmentX", 0.0F);
        setBooleanField(term2182, term2182.getClass(), "isAlignmentYSet", false);
        setFloatField(term2182, term2182.getClass(), "alignmentY", 0.0F);
        setField(term2182, term2182.getClass(), "ui", null);
        setField(term2182, term2182.getClass(), "listenerList", null);
        setField(term2182, term2182.getClass(), "clientProperties", null);
        setField(term2182, term2182.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term2182, term2182.getClass(), "autoscrolls", false);
        setField(term2182, term2182.getClass(), "border", null);
        setIntField(term2182, term2182.getClass(), "flags", 0);
        setField(term2182, term2182.getClass(), "inputVerifier", null);
        setBooleanField(term2182, term2182.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term2182, term2182.getClass(), "paintingChild", null);
        setField(term2182, term2182.getClass(), "popupMenu", null);
        setField(term2182, term2182.getClass(), "revalidateRunnableScheduled", null);
        setField(term2182, term2182.getClass(), "focusInputMap", null);
        setField(term2182, term2182.getClass(), "ancestorInputMap", null);
        setField(term2182, term2182.getClass(), "windowInputMap", null);
        setField(term2182, term2182.getClass(), "actionMap", null);
        setField(term2182, term2182.getClass(), "aaHint", null);
        setField(term2182, term2182.getClass(), "lcdRenderingHint", null);
        setField(term2182, term2182.getClass(), "component", null);
        setField(term2182, term2182.getClass(), "layoutMgr", null);
        setField(term2182, term2182.getClass(), "dispatcher", null);
        setField(term2182, term2182.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2182, term2182.getClass(), "focusCycleRoot", false);
        setBooleanField(term2182, term2182.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2182, term2182.getClass(), "printingThreads", null);
        setBooleanField(term2182, term2182.getClass(), "printing", false);
        setField(term2182, term2182.getClass(), "containerListener", null);
        setIntField(term2182, term2182.getClass(), "listeningChildren", 0);
        setIntField(term2182, term2182.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2182, term2182.getClass(), "descendantsCount", 0);
        setField(term2182, term2182.getClass(), "preserveBackgroundColor", null);
        setIntField(term2182, term2182.getClass(), "numOfHWComponents", 0);
        setIntField(term2182, term2182.getClass(), "numOfLWComponents", 0);
        setField(term2182, term2182.getClass(), "modalComp", null);
        setField(term2182, term2182.getClass(), "modalAppContext", null);
        setIntField(term2182, term2182.getClass(), "containerSerializedDataVersion", 0);
        setField(term2182, term2182.getClass(), "peer", null);
        setField(term2182, term2182.getClass(), "parent", null);
        setField(term2182, term2182.getClass(), "appContext", null);
        setIntField(term2182, term2182.getClass(), "x", 0);
        setIntField(term2182, term2182.getClass(), "y", 0);
        setIntField(term2182, term2182.getClass(), "width", 0);
        setIntField(term2182, term2182.getClass(), "height", 0);
        setField(term2182, term2182.getClass(), "foreground", null);
        setField(term2182, term2182.getClass(), "background", null);
        setField(term2182, term2182.getClass(), "font", null);
        setField(term2182, term2182.getClass(), "peerFont", null);
        setField(term2182, term2182.getClass(), "cursor", null);
        setField(term2182, term2182.getClass(), "locale", null);
        setField(term2182, term2182.getClass(), "graphicsConfig", null);
        setField(term2182, term2182.getClass(), "bufferStrategy", null);
        setBooleanField(term2182, term2182.getClass(), "ignoreRepaint", false);
        setBooleanField(term2182, term2182.getClass(), "visible", false);
        setBooleanField(term2182, term2182.getClass(), "enabled", false);
        setBooleanField(term2182, term2182.getClass(), "valid", false);
        setField(term2182, term2182.getClass(), "dropTarget", null);
        setField(term2182, term2182.getClass(), "popups", null);
        setField(term2182, term2182.getClass(), "name", null);
        setBooleanField(term2182, term2182.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2182, term2182.getClass(), "focusable", false);
        setIntField(term2182, term2182.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2182, term2182.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2182, term2182.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2182, term2182.getClass(), "acc", null);
        setField(term2182, term2182.getClass(), "minSize", null);
        setBooleanField(term2182, term2182.getClass(), "minSizeSet", false);
        setField(term2182, term2182.getClass(), "prefSize", null);
        setBooleanField(term2182, term2182.getClass(), "prefSizeSet", false);
        setField(term2182, term2182.getClass(), "maxSize", null);
        setBooleanField(term2182, term2182.getClass(), "maxSizeSet", false);
        setField(term2182, term2182.getClass(), "componentOrientation", null);
        setBooleanField(term2182, term2182.getClass(), "newEventsOnly", false);
        setField(term2182, term2182.getClass(), "componentListener", null);
        setField(term2182, term2182.getClass(), "focusListener", null);
        setField(term2182, term2182.getClass(), "hierarchyListener", null);
        setField(term2182, term2182.getClass(), "hierarchyBoundsListener", null);
        setField(term2182, term2182.getClass(), "keyListener", null);
        setField(term2182, term2182.getClass(), "mouseListener", null);
        setField(term2182, term2182.getClass(), "mouseMotionListener", null);
        setField(term2182, term2182.getClass(), "mouseWheelListener", null);
        setField(term2182, term2182.getClass(), "inputMethodListener", null);
        setLongField(term2182, term2182.getClass(), "eventMask", 0L);
        setField(term2182, term2182.getClass(), "changeSupport", null);
        setField(term2182, term2182.getClass(), "objectLock", null);
        setBooleanField(term2182, term2182.getClass(), "isPacked", false);
        setIntField(term2182, term2182.getClass(), "boundsOp", 0);
        setField(term2182, term2182.getClass(), "compoundShape", null);
        setField(term2182, term2182.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2182, term2182.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2182, term2182.getClass(), "backgroundEraseDisabled", false);
        setField(term2182, term2182.getClass(), "eventCache", null);
        setBooleanField(term2182, term2182.getClass(), "coalescingEnabled", false);
        setBooleanField(term2182, term2182.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2182, term2182.getClass(), "componentSerializedDataVersion", 0);
        setField(term2182, term2182.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.ImageLabel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isCenter", argTypes, term2182, args);
    }

};


