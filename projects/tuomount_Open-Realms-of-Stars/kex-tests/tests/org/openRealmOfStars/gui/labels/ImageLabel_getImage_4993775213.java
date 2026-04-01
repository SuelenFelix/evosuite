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

public class ImageLabel_getImage_4993775213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1874;

    public ImageLabel_getImage_4993775213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1874 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.ImageLabel"));
        setField(term1874, term1874.getClass(), "image", null);
        setBooleanField(term1874, term1874.getClass(), "border", false);
        setField(term1874, term1874.getClass(), "fillColor", null);
        setBooleanField(term1874, term1874.getClass(), "center", false);
        setIntField(term1874, term1874.getClass(), "mnemonic", 0);
        setIntField(term1874, term1874.getClass(), "mnemonicIndex", 0);
        setField(term1874, term1874.getClass(), "text", null);
        setField(term1874, term1874.getClass(), "defaultIcon", null);
        setField(term1874, term1874.getClass(), "disabledIcon", null);
        setBooleanField(term1874, term1874.getClass(), "disabledIconSet", false);
        setIntField(term1874, term1874.getClass(), "verticalAlignment", 0);
        setIntField(term1874, term1874.getClass(), "horizontalAlignment", 0);
        setIntField(term1874, term1874.getClass(), "verticalTextPosition", 0);
        setIntField(term1874, term1874.getClass(), "horizontalTextPosition", 0);
        setIntField(term1874, term1874.getClass(), "iconTextGap", 0);
        setField(term1874, term1874.getClass(), "labelFor", null);
        setBooleanField(term1874, term1874.getClass(), "isAlignmentXSet", false);
        setFloatField(term1874, term1874.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1874, term1874.getClass(), "isAlignmentYSet", false);
        setFloatField(term1874, term1874.getClass(), "alignmentY", 0.0F);
        setField(term1874, term1874.getClass(), "ui", null);
        setField(term1874, term1874.getClass(), "listenerList", null);
        setField(term1874, term1874.getClass(), "clientProperties", null);
        setField(term1874, term1874.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1874, term1874.getClass(), "autoscrolls", false);
        setField(term1874, term1874.getClass(), "border", null);
        setIntField(term1874, term1874.getClass(), "flags", 0);
        setField(term1874, term1874.getClass(), "inputVerifier", null);
        setBooleanField(term1874, term1874.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1874, term1874.getClass(), "paintingChild", null);
        setField(term1874, term1874.getClass(), "popupMenu", null);
        setField(term1874, term1874.getClass(), "revalidateRunnableScheduled", null);
        setField(term1874, term1874.getClass(), "focusInputMap", null);
        setField(term1874, term1874.getClass(), "ancestorInputMap", null);
        setField(term1874, term1874.getClass(), "windowInputMap", null);
        setField(term1874, term1874.getClass(), "actionMap", null);
        setField(term1874, term1874.getClass(), "aaHint", null);
        setField(term1874, term1874.getClass(), "lcdRenderingHint", null);
        setField(term1874, term1874.getClass(), "component", null);
        setField(term1874, term1874.getClass(), "layoutMgr", null);
        setField(term1874, term1874.getClass(), "dispatcher", null);
        setField(term1874, term1874.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1874, term1874.getClass(), "focusCycleRoot", false);
        setBooleanField(term1874, term1874.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1874, term1874.getClass(), "printingThreads", null);
        setBooleanField(term1874, term1874.getClass(), "printing", false);
        setField(term1874, term1874.getClass(), "containerListener", null);
        setIntField(term1874, term1874.getClass(), "listeningChildren", 0);
        setIntField(term1874, term1874.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1874, term1874.getClass(), "descendantsCount", 0);
        setField(term1874, term1874.getClass(), "preserveBackgroundColor", null);
        setIntField(term1874, term1874.getClass(), "numOfHWComponents", 0);
        setIntField(term1874, term1874.getClass(), "numOfLWComponents", 0);
        setField(term1874, term1874.getClass(), "modalComp", null);
        setField(term1874, term1874.getClass(), "modalAppContext", null);
        setIntField(term1874, term1874.getClass(), "containerSerializedDataVersion", 0);
        setField(term1874, term1874.getClass(), "peer", null);
        setField(term1874, term1874.getClass(), "parent", null);
        setField(term1874, term1874.getClass(), "appContext", null);
        setIntField(term1874, term1874.getClass(), "x", 0);
        setIntField(term1874, term1874.getClass(), "y", 0);
        setIntField(term1874, term1874.getClass(), "width", 0);
        setIntField(term1874, term1874.getClass(), "height", 0);
        setField(term1874, term1874.getClass(), "foreground", null);
        setField(term1874, term1874.getClass(), "background", null);
        setField(term1874, term1874.getClass(), "font", null);
        setField(term1874, term1874.getClass(), "peerFont", null);
        setField(term1874, term1874.getClass(), "cursor", null);
        setField(term1874, term1874.getClass(), "locale", null);
        setField(term1874, term1874.getClass(), "graphicsConfig", null);
        setField(term1874, term1874.getClass(), "bufferStrategy", null);
        setBooleanField(term1874, term1874.getClass(), "ignoreRepaint", false);
        setBooleanField(term1874, term1874.getClass(), "visible", false);
        setBooleanField(term1874, term1874.getClass(), "enabled", false);
        setBooleanField(term1874, term1874.getClass(), "valid", false);
        setField(term1874, term1874.getClass(), "dropTarget", null);
        setField(term1874, term1874.getClass(), "popups", null);
        setField(term1874, term1874.getClass(), "name", null);
        setBooleanField(term1874, term1874.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1874, term1874.getClass(), "focusable", false);
        setIntField(term1874, term1874.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1874, term1874.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1874, term1874.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1874, term1874.getClass(), "acc", null);
        setField(term1874, term1874.getClass(), "minSize", null);
        setBooleanField(term1874, term1874.getClass(), "minSizeSet", false);
        setField(term1874, term1874.getClass(), "prefSize", null);
        setBooleanField(term1874, term1874.getClass(), "prefSizeSet", false);
        setField(term1874, term1874.getClass(), "maxSize", null);
        setBooleanField(term1874, term1874.getClass(), "maxSizeSet", false);
        setField(term1874, term1874.getClass(), "componentOrientation", null);
        setBooleanField(term1874, term1874.getClass(), "newEventsOnly", false);
        setField(term1874, term1874.getClass(), "componentListener", null);
        setField(term1874, term1874.getClass(), "focusListener", null);
        setField(term1874, term1874.getClass(), "hierarchyListener", null);
        setField(term1874, term1874.getClass(), "hierarchyBoundsListener", null);
        setField(term1874, term1874.getClass(), "keyListener", null);
        setField(term1874, term1874.getClass(), "mouseListener", null);
        setField(term1874, term1874.getClass(), "mouseMotionListener", null);
        setField(term1874, term1874.getClass(), "mouseWheelListener", null);
        setField(term1874, term1874.getClass(), "inputMethodListener", null);
        setLongField(term1874, term1874.getClass(), "eventMask", 0L);
        setField(term1874, term1874.getClass(), "changeSupport", null);
        setField(term1874, term1874.getClass(), "objectLock", null);
        setBooleanField(term1874, term1874.getClass(), "isPacked", false);
        setIntField(term1874, term1874.getClass(), "boundsOp", 0);
        setField(term1874, term1874.getClass(), "compoundShape", null);
        setField(term1874, term1874.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1874, term1874.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1874, term1874.getClass(), "backgroundEraseDisabled", false);
        setField(term1874, term1874.getClass(), "eventCache", null);
        setBooleanField(term1874, term1874.getClass(), "coalescingEnabled", false);
        setBooleanField(term1874, term1874.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1874, term1874.getClass(), "componentSerializedDataVersion", 0);
        setField(term1874, term1874.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.ImageLabel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImage", argTypes, term1874, args);
    }

};


