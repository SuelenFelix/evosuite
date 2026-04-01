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

public class ImageLabel_getFillColor_160794680817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2080;

    public ImageLabel_getFillColor_160794680817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2080 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.ImageLabel"));
        setField(term2080, term2080.getClass(), "image", null);
        setBooleanField(term2080, term2080.getClass(), "border", false);
        setField(term2080, term2080.getClass(), "fillColor", null);
        setBooleanField(term2080, term2080.getClass(), "center", false);
        setIntField(term2080, term2080.getClass(), "mnemonic", 0);
        setIntField(term2080, term2080.getClass(), "mnemonicIndex", 0);
        setField(term2080, term2080.getClass(), "text", null);
        setField(term2080, term2080.getClass(), "defaultIcon", null);
        setField(term2080, term2080.getClass(), "disabledIcon", null);
        setBooleanField(term2080, term2080.getClass(), "disabledIconSet", false);
        setIntField(term2080, term2080.getClass(), "verticalAlignment", 0);
        setIntField(term2080, term2080.getClass(), "horizontalAlignment", 0);
        setIntField(term2080, term2080.getClass(), "verticalTextPosition", 0);
        setIntField(term2080, term2080.getClass(), "horizontalTextPosition", 0);
        setIntField(term2080, term2080.getClass(), "iconTextGap", 0);
        setField(term2080, term2080.getClass(), "labelFor", null);
        setBooleanField(term2080, term2080.getClass(), "isAlignmentXSet", false);
        setFloatField(term2080, term2080.getClass(), "alignmentX", 0.0F);
        setBooleanField(term2080, term2080.getClass(), "isAlignmentYSet", false);
        setFloatField(term2080, term2080.getClass(), "alignmentY", 0.0F);
        setField(term2080, term2080.getClass(), "ui", null);
        setField(term2080, term2080.getClass(), "listenerList", null);
        setField(term2080, term2080.getClass(), "clientProperties", null);
        setField(term2080, term2080.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term2080, term2080.getClass(), "autoscrolls", false);
        setField(term2080, term2080.getClass(), "border", null);
        setIntField(term2080, term2080.getClass(), "flags", 0);
        setField(term2080, term2080.getClass(), "inputVerifier", null);
        setBooleanField(term2080, term2080.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term2080, term2080.getClass(), "paintingChild", null);
        setField(term2080, term2080.getClass(), "popupMenu", null);
        setField(term2080, term2080.getClass(), "revalidateRunnableScheduled", null);
        setField(term2080, term2080.getClass(), "focusInputMap", null);
        setField(term2080, term2080.getClass(), "ancestorInputMap", null);
        setField(term2080, term2080.getClass(), "windowInputMap", null);
        setField(term2080, term2080.getClass(), "actionMap", null);
        setField(term2080, term2080.getClass(), "aaHint", null);
        setField(term2080, term2080.getClass(), "lcdRenderingHint", null);
        setField(term2080, term2080.getClass(), "component", null);
        setField(term2080, term2080.getClass(), "layoutMgr", null);
        setField(term2080, term2080.getClass(), "dispatcher", null);
        setField(term2080, term2080.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2080, term2080.getClass(), "focusCycleRoot", false);
        setBooleanField(term2080, term2080.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2080, term2080.getClass(), "printingThreads", null);
        setBooleanField(term2080, term2080.getClass(), "printing", false);
        setField(term2080, term2080.getClass(), "containerListener", null);
        setIntField(term2080, term2080.getClass(), "listeningChildren", 0);
        setIntField(term2080, term2080.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2080, term2080.getClass(), "descendantsCount", 0);
        setField(term2080, term2080.getClass(), "preserveBackgroundColor", null);
        setIntField(term2080, term2080.getClass(), "numOfHWComponents", 0);
        setIntField(term2080, term2080.getClass(), "numOfLWComponents", 0);
        setField(term2080, term2080.getClass(), "modalComp", null);
        setField(term2080, term2080.getClass(), "modalAppContext", null);
        setIntField(term2080, term2080.getClass(), "containerSerializedDataVersion", 0);
        setField(term2080, term2080.getClass(), "peer", null);
        setField(term2080, term2080.getClass(), "parent", null);
        setField(term2080, term2080.getClass(), "appContext", null);
        setIntField(term2080, term2080.getClass(), "x", 0);
        setIntField(term2080, term2080.getClass(), "y", 0);
        setIntField(term2080, term2080.getClass(), "width", 0);
        setIntField(term2080, term2080.getClass(), "height", 0);
        setField(term2080, term2080.getClass(), "foreground", null);
        setField(term2080, term2080.getClass(), "background", null);
        setField(term2080, term2080.getClass(), "font", null);
        setField(term2080, term2080.getClass(), "peerFont", null);
        setField(term2080, term2080.getClass(), "cursor", null);
        setField(term2080, term2080.getClass(), "locale", null);
        setField(term2080, term2080.getClass(), "graphicsConfig", null);
        setField(term2080, term2080.getClass(), "bufferStrategy", null);
        setBooleanField(term2080, term2080.getClass(), "ignoreRepaint", false);
        setBooleanField(term2080, term2080.getClass(), "visible", false);
        setBooleanField(term2080, term2080.getClass(), "enabled", false);
        setBooleanField(term2080, term2080.getClass(), "valid", false);
        setField(term2080, term2080.getClass(), "dropTarget", null);
        setField(term2080, term2080.getClass(), "popups", null);
        setField(term2080, term2080.getClass(), "name", null);
        setBooleanField(term2080, term2080.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2080, term2080.getClass(), "focusable", false);
        setIntField(term2080, term2080.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2080, term2080.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2080, term2080.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2080, term2080.getClass(), "acc", null);
        setField(term2080, term2080.getClass(), "minSize", null);
        setBooleanField(term2080, term2080.getClass(), "minSizeSet", false);
        setField(term2080, term2080.getClass(), "prefSize", null);
        setBooleanField(term2080, term2080.getClass(), "prefSizeSet", false);
        setField(term2080, term2080.getClass(), "maxSize", null);
        setBooleanField(term2080, term2080.getClass(), "maxSizeSet", false);
        setField(term2080, term2080.getClass(), "componentOrientation", null);
        setBooleanField(term2080, term2080.getClass(), "newEventsOnly", false);
        setField(term2080, term2080.getClass(), "componentListener", null);
        setField(term2080, term2080.getClass(), "focusListener", null);
        setField(term2080, term2080.getClass(), "hierarchyListener", null);
        setField(term2080, term2080.getClass(), "hierarchyBoundsListener", null);
        setField(term2080, term2080.getClass(), "keyListener", null);
        setField(term2080, term2080.getClass(), "mouseListener", null);
        setField(term2080, term2080.getClass(), "mouseMotionListener", null);
        setField(term2080, term2080.getClass(), "mouseWheelListener", null);
        setField(term2080, term2080.getClass(), "inputMethodListener", null);
        setLongField(term2080, term2080.getClass(), "eventMask", 0L);
        setField(term2080, term2080.getClass(), "changeSupport", null);
        setField(term2080, term2080.getClass(), "objectLock", null);
        setBooleanField(term2080, term2080.getClass(), "isPacked", false);
        setIntField(term2080, term2080.getClass(), "boundsOp", 0);
        setField(term2080, term2080.getClass(), "compoundShape", null);
        setField(term2080, term2080.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2080, term2080.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2080, term2080.getClass(), "backgroundEraseDisabled", false);
        setField(term2080, term2080.getClass(), "eventCache", null);
        setBooleanField(term2080, term2080.getClass(), "coalescingEnabled", false);
        setBooleanField(term2080, term2080.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2080, term2080.getClass(), "componentSerializedDataVersion", 0);
        setField(term2080, term2080.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.ImageLabel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFillColor", argTypes, term2080, args);
    }

};


