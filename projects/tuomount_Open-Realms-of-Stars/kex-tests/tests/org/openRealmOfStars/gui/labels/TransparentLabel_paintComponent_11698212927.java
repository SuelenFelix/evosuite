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

public class TransparentLabel_paintComponent_11698212927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30247;

    public TransparentLabel_paintComponent_11698212927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30247 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.TransparentLabel"));
        setBooleanField(term30247, term30247.getClass(), "wrap", false);
        setIntField(term30247, term30247.getClass(), "mnemonic", 0);
        setIntField(term30247, term30247.getClass(), "mnemonicIndex", 0);
        setField(term30247, term30247.getClass(), "text", null);
        setField(term30247, term30247.getClass(), "defaultIcon", null);
        setField(term30247, term30247.getClass(), "disabledIcon", null);
        setBooleanField(term30247, term30247.getClass(), "disabledIconSet", false);
        setIntField(term30247, term30247.getClass(), "verticalAlignment", 0);
        setIntField(term30247, term30247.getClass(), "horizontalAlignment", 0);
        setIntField(term30247, term30247.getClass(), "verticalTextPosition", 0);
        setIntField(term30247, term30247.getClass(), "horizontalTextPosition", 0);
        setIntField(term30247, term30247.getClass(), "iconTextGap", 0);
        setField(term30247, term30247.getClass(), "labelFor", null);
        setBooleanField(term30247, term30247.getClass(), "isAlignmentXSet", false);
        setFloatField(term30247, term30247.getClass(), "alignmentX", 0.0F);
        setBooleanField(term30247, term30247.getClass(), "isAlignmentYSet", false);
        setFloatField(term30247, term30247.getClass(), "alignmentY", 0.0F);
        setField(term30247, term30247.getClass(), "ui", null);
        setField(term30247, term30247.getClass(), "listenerList", null);
        setField(term30247, term30247.getClass(), "clientProperties", null);
        setField(term30247, term30247.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term30247, term30247.getClass(), "autoscrolls", false);
        setField(term30247, term30247.getClass(), "border", null);
        setIntField(term30247, term30247.getClass(), "flags", 0);
        setField(term30247, term30247.getClass(), "inputVerifier", null);
        setBooleanField(term30247, term30247.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term30247, term30247.getClass(), "paintingChild", null);
        setField(term30247, term30247.getClass(), "popupMenu", null);
        setField(term30247, term30247.getClass(), "revalidateRunnableScheduled", null);
        setField(term30247, term30247.getClass(), "focusInputMap", null);
        setField(term30247, term30247.getClass(), "ancestorInputMap", null);
        setField(term30247, term30247.getClass(), "windowInputMap", null);
        setField(term30247, term30247.getClass(), "actionMap", null);
        setField(term30247, term30247.getClass(), "aaHint", null);
        setField(term30247, term30247.getClass(), "lcdRenderingHint", null);
        setField(term30247, term30247.getClass(), "component", null);
        setField(term30247, term30247.getClass(), "layoutMgr", null);
        setField(term30247, term30247.getClass(), "dispatcher", null);
        setField(term30247, term30247.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term30247, term30247.getClass(), "focusCycleRoot", false);
        setBooleanField(term30247, term30247.getClass(), "focusTraversalPolicyProvider", false);
        setField(term30247, term30247.getClass(), "printingThreads", null);
        setBooleanField(term30247, term30247.getClass(), "printing", false);
        setField(term30247, term30247.getClass(), "containerListener", null);
        setIntField(term30247, term30247.getClass(), "listeningChildren", 0);
        setIntField(term30247, term30247.getClass(), "listeningBoundsChildren", 0);
        setIntField(term30247, term30247.getClass(), "descendantsCount", 0);
        setField(term30247, term30247.getClass(), "preserveBackgroundColor", null);
        setIntField(term30247, term30247.getClass(), "numOfHWComponents", 0);
        setIntField(term30247, term30247.getClass(), "numOfLWComponents", 0);
        setField(term30247, term30247.getClass(), "modalComp", null);
        setField(term30247, term30247.getClass(), "modalAppContext", null);
        setIntField(term30247, term30247.getClass(), "containerSerializedDataVersion", 0);
        setField(term30247, term30247.getClass(), "peer", null);
        setField(term30247, term30247.getClass(), "parent", null);
        setField(term30247, term30247.getClass(), "appContext", null);
        setIntField(term30247, term30247.getClass(), "x", 0);
        setIntField(term30247, term30247.getClass(), "y", 0);
        setIntField(term30247, term30247.getClass(), "width", 0);
        setIntField(term30247, term30247.getClass(), "height", 0);
        setField(term30247, term30247.getClass(), "foreground", null);
        setField(term30247, term30247.getClass(), "background", null);
        setField(term30247, term30247.getClass(), "font", null);
        setField(term30247, term30247.getClass(), "peerFont", null);
        setField(term30247, term30247.getClass(), "cursor", null);
        setField(term30247, term30247.getClass(), "locale", null);
        setField(term30247, term30247.getClass(), "graphicsConfig", null);
        setField(term30247, term30247.getClass(), "bufferStrategy", null);
        setBooleanField(term30247, term30247.getClass(), "ignoreRepaint", false);
        setBooleanField(term30247, term30247.getClass(), "visible", false);
        setBooleanField(term30247, term30247.getClass(), "enabled", false);
        setBooleanField(term30247, term30247.getClass(), "valid", false);
        setField(term30247, term30247.getClass(), "dropTarget", null);
        setField(term30247, term30247.getClass(), "popups", null);
        setField(term30247, term30247.getClass(), "name", null);
        setBooleanField(term30247, term30247.getClass(), "nameExplicitlySet", false);
        setBooleanField(term30247, term30247.getClass(), "focusable", false);
        setIntField(term30247, term30247.getClass(), "isFocusTraversableOverridden", 0);
        setField(term30247, term30247.getClass(), "focusTraversalKeys", null);
        setBooleanField(term30247, term30247.getClass(), "focusTraversalKeysEnabled", false);
        setField(term30247, term30247.getClass(), "acc", null);
        setField(term30247, term30247.getClass(), "minSize", null);
        setBooleanField(term30247, term30247.getClass(), "minSizeSet", false);
        setField(term30247, term30247.getClass(), "prefSize", null);
        setBooleanField(term30247, term30247.getClass(), "prefSizeSet", false);
        setField(term30247, term30247.getClass(), "maxSize", null);
        setBooleanField(term30247, term30247.getClass(), "maxSizeSet", false);
        setField(term30247, term30247.getClass(), "componentOrientation", null);
        setBooleanField(term30247, term30247.getClass(), "newEventsOnly", false);
        setField(term30247, term30247.getClass(), "componentListener", null);
        setField(term30247, term30247.getClass(), "focusListener", null);
        setField(term30247, term30247.getClass(), "hierarchyListener", null);
        setField(term30247, term30247.getClass(), "hierarchyBoundsListener", null);
        setField(term30247, term30247.getClass(), "keyListener", null);
        setField(term30247, term30247.getClass(), "mouseListener", null);
        setField(term30247, term30247.getClass(), "mouseMotionListener", null);
        setField(term30247, term30247.getClass(), "mouseWheelListener", null);
        setField(term30247, term30247.getClass(), "inputMethodListener", null);
        setLongField(term30247, term30247.getClass(), "eventMask", 0L);
        setField(term30247, term30247.getClass(), "changeSupport", null);
        setField(term30247, term30247.getClass(), "objectLock", null);
        setBooleanField(term30247, term30247.getClass(), "isPacked", false);
        setIntField(term30247, term30247.getClass(), "boundsOp", 0);
        setField(term30247, term30247.getClass(), "compoundShape", null);
        setField(term30247, term30247.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term30247, term30247.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term30247, term30247.getClass(), "backgroundEraseDisabled", false);
        setField(term30247, term30247.getClass(), "eventCache", null);
        setBooleanField(term30247, term30247.getClass(), "coalescingEnabled", false);
        setBooleanField(term30247, term30247.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term30247, term30247.getClass(), "componentSerializedDataVersion", 0);
        setField(term30247, term30247.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.TransparentLabel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Graphics");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "paintComponent", argTypes, term30247, args);
    }

};


