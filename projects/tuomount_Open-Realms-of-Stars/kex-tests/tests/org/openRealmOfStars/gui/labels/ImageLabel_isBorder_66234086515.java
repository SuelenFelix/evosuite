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

public class ImageLabel_isBorder_66234086515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1978;

    public ImageLabel_isBorder_66234086515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1978 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.ImageLabel"));
        setField(term1978, term1978.getClass(), "image", null);
        setBooleanField(term1978, term1978.getClass(), "border", false);
        setField(term1978, term1978.getClass(), "fillColor", null);
        setBooleanField(term1978, term1978.getClass(), "center", false);
        setIntField(term1978, term1978.getClass(), "mnemonic", 0);
        setIntField(term1978, term1978.getClass(), "mnemonicIndex", 0);
        setField(term1978, term1978.getClass(), "text", null);
        setField(term1978, term1978.getClass(), "defaultIcon", null);
        setField(term1978, term1978.getClass(), "disabledIcon", null);
        setBooleanField(term1978, term1978.getClass(), "disabledIconSet", false);
        setIntField(term1978, term1978.getClass(), "verticalAlignment", 0);
        setIntField(term1978, term1978.getClass(), "horizontalAlignment", 0);
        setIntField(term1978, term1978.getClass(), "verticalTextPosition", 0);
        setIntField(term1978, term1978.getClass(), "horizontalTextPosition", 0);
        setIntField(term1978, term1978.getClass(), "iconTextGap", 0);
        setField(term1978, term1978.getClass(), "labelFor", null);
        setBooleanField(term1978, term1978.getClass(), "isAlignmentXSet", false);
        setFloatField(term1978, term1978.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1978, term1978.getClass(), "isAlignmentYSet", false);
        setFloatField(term1978, term1978.getClass(), "alignmentY", 0.0F);
        setField(term1978, term1978.getClass(), "ui", null);
        setField(term1978, term1978.getClass(), "listenerList", null);
        setField(term1978, term1978.getClass(), "clientProperties", null);
        setField(term1978, term1978.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1978, term1978.getClass(), "autoscrolls", false);
        setField(term1978, term1978.getClass(), "border", null);
        setIntField(term1978, term1978.getClass(), "flags", 0);
        setField(term1978, term1978.getClass(), "inputVerifier", null);
        setBooleanField(term1978, term1978.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1978, term1978.getClass(), "paintingChild", null);
        setField(term1978, term1978.getClass(), "popupMenu", null);
        setField(term1978, term1978.getClass(), "revalidateRunnableScheduled", null);
        setField(term1978, term1978.getClass(), "focusInputMap", null);
        setField(term1978, term1978.getClass(), "ancestorInputMap", null);
        setField(term1978, term1978.getClass(), "windowInputMap", null);
        setField(term1978, term1978.getClass(), "actionMap", null);
        setField(term1978, term1978.getClass(), "aaHint", null);
        setField(term1978, term1978.getClass(), "lcdRenderingHint", null);
        setField(term1978, term1978.getClass(), "component", null);
        setField(term1978, term1978.getClass(), "layoutMgr", null);
        setField(term1978, term1978.getClass(), "dispatcher", null);
        setField(term1978, term1978.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1978, term1978.getClass(), "focusCycleRoot", false);
        setBooleanField(term1978, term1978.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1978, term1978.getClass(), "printingThreads", null);
        setBooleanField(term1978, term1978.getClass(), "printing", false);
        setField(term1978, term1978.getClass(), "containerListener", null);
        setIntField(term1978, term1978.getClass(), "listeningChildren", 0);
        setIntField(term1978, term1978.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1978, term1978.getClass(), "descendantsCount", 0);
        setField(term1978, term1978.getClass(), "preserveBackgroundColor", null);
        setIntField(term1978, term1978.getClass(), "numOfHWComponents", 0);
        setIntField(term1978, term1978.getClass(), "numOfLWComponents", 0);
        setField(term1978, term1978.getClass(), "modalComp", null);
        setField(term1978, term1978.getClass(), "modalAppContext", null);
        setIntField(term1978, term1978.getClass(), "containerSerializedDataVersion", 0);
        setField(term1978, term1978.getClass(), "peer", null);
        setField(term1978, term1978.getClass(), "parent", null);
        setField(term1978, term1978.getClass(), "appContext", null);
        setIntField(term1978, term1978.getClass(), "x", 0);
        setIntField(term1978, term1978.getClass(), "y", 0);
        setIntField(term1978, term1978.getClass(), "width", 0);
        setIntField(term1978, term1978.getClass(), "height", 0);
        setField(term1978, term1978.getClass(), "foreground", null);
        setField(term1978, term1978.getClass(), "background", null);
        setField(term1978, term1978.getClass(), "font", null);
        setField(term1978, term1978.getClass(), "peerFont", null);
        setField(term1978, term1978.getClass(), "cursor", null);
        setField(term1978, term1978.getClass(), "locale", null);
        setField(term1978, term1978.getClass(), "graphicsConfig", null);
        setField(term1978, term1978.getClass(), "bufferStrategy", null);
        setBooleanField(term1978, term1978.getClass(), "ignoreRepaint", false);
        setBooleanField(term1978, term1978.getClass(), "visible", false);
        setBooleanField(term1978, term1978.getClass(), "enabled", false);
        setBooleanField(term1978, term1978.getClass(), "valid", false);
        setField(term1978, term1978.getClass(), "dropTarget", null);
        setField(term1978, term1978.getClass(), "popups", null);
        setField(term1978, term1978.getClass(), "name", null);
        setBooleanField(term1978, term1978.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1978, term1978.getClass(), "focusable", false);
        setIntField(term1978, term1978.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1978, term1978.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1978, term1978.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1978, term1978.getClass(), "acc", null);
        setField(term1978, term1978.getClass(), "minSize", null);
        setBooleanField(term1978, term1978.getClass(), "minSizeSet", false);
        setField(term1978, term1978.getClass(), "prefSize", null);
        setBooleanField(term1978, term1978.getClass(), "prefSizeSet", false);
        setField(term1978, term1978.getClass(), "maxSize", null);
        setBooleanField(term1978, term1978.getClass(), "maxSizeSet", false);
        setField(term1978, term1978.getClass(), "componentOrientation", null);
        setBooleanField(term1978, term1978.getClass(), "newEventsOnly", false);
        setField(term1978, term1978.getClass(), "componentListener", null);
        setField(term1978, term1978.getClass(), "focusListener", null);
        setField(term1978, term1978.getClass(), "hierarchyListener", null);
        setField(term1978, term1978.getClass(), "hierarchyBoundsListener", null);
        setField(term1978, term1978.getClass(), "keyListener", null);
        setField(term1978, term1978.getClass(), "mouseListener", null);
        setField(term1978, term1978.getClass(), "mouseMotionListener", null);
        setField(term1978, term1978.getClass(), "mouseWheelListener", null);
        setField(term1978, term1978.getClass(), "inputMethodListener", null);
        setLongField(term1978, term1978.getClass(), "eventMask", 0L);
        setField(term1978, term1978.getClass(), "changeSupport", null);
        setField(term1978, term1978.getClass(), "objectLock", null);
        setBooleanField(term1978, term1978.getClass(), "isPacked", false);
        setIntField(term1978, term1978.getClass(), "boundsOp", 0);
        setField(term1978, term1978.getClass(), "compoundShape", null);
        setField(term1978, term1978.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1978, term1978.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1978, term1978.getClass(), "backgroundEraseDisabled", false);
        setField(term1978, term1978.getClass(), "eventCache", null);
        setBooleanField(term1978, term1978.getClass(), "coalescingEnabled", false);
        setBooleanField(term1978, term1978.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1978, term1978.getClass(), "componentSerializedDataVersion", 0);
        setField(term1978, term1978.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.ImageLabel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBorder", argTypes, term1978, args);
    }

};


