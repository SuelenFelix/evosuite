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

public class TransparentLabel_createToolTip_9118819106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30197;

    public TransparentLabel_createToolTip_9118819106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30197 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.TransparentLabel"));
        setBooleanField(term30197, term30197.getClass(), "wrap", false);
        setIntField(term30197, term30197.getClass(), "mnemonic", 0);
        setIntField(term30197, term30197.getClass(), "mnemonicIndex", 0);
        setField(term30197, term30197.getClass(), "text", null);
        setField(term30197, term30197.getClass(), "defaultIcon", null);
        setField(term30197, term30197.getClass(), "disabledIcon", null);
        setBooleanField(term30197, term30197.getClass(), "disabledIconSet", false);
        setIntField(term30197, term30197.getClass(), "verticalAlignment", 0);
        setIntField(term30197, term30197.getClass(), "horizontalAlignment", 0);
        setIntField(term30197, term30197.getClass(), "verticalTextPosition", 0);
        setIntField(term30197, term30197.getClass(), "horizontalTextPosition", 0);
        setIntField(term30197, term30197.getClass(), "iconTextGap", 0);
        setField(term30197, term30197.getClass(), "labelFor", null);
        setBooleanField(term30197, term30197.getClass(), "isAlignmentXSet", false);
        setFloatField(term30197, term30197.getClass(), "alignmentX", 0.0F);
        setBooleanField(term30197, term30197.getClass(), "isAlignmentYSet", false);
        setFloatField(term30197, term30197.getClass(), "alignmentY", 0.0F);
        setField(term30197, term30197.getClass(), "ui", null);
        setField(term30197, term30197.getClass(), "listenerList", null);
        setField(term30197, term30197.getClass(), "clientProperties", null);
        setField(term30197, term30197.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term30197, term30197.getClass(), "autoscrolls", false);
        setField(term30197, term30197.getClass(), "border", null);
        setIntField(term30197, term30197.getClass(), "flags", 0);
        setField(term30197, term30197.getClass(), "inputVerifier", null);
        setBooleanField(term30197, term30197.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term30197, term30197.getClass(), "paintingChild", null);
        setField(term30197, term30197.getClass(), "popupMenu", null);
        setField(term30197, term30197.getClass(), "revalidateRunnableScheduled", null);
        setField(term30197, term30197.getClass(), "focusInputMap", null);
        setField(term30197, term30197.getClass(), "ancestorInputMap", null);
        setField(term30197, term30197.getClass(), "windowInputMap", null);
        setField(term30197, term30197.getClass(), "actionMap", null);
        setField(term30197, term30197.getClass(), "aaHint", null);
        setField(term30197, term30197.getClass(), "lcdRenderingHint", null);
        setField(term30197, term30197.getClass(), "component", null);
        setField(term30197, term30197.getClass(), "layoutMgr", null);
        setField(term30197, term30197.getClass(), "dispatcher", null);
        setField(term30197, term30197.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term30197, term30197.getClass(), "focusCycleRoot", false);
        setBooleanField(term30197, term30197.getClass(), "focusTraversalPolicyProvider", false);
        setField(term30197, term30197.getClass(), "printingThreads", null);
        setBooleanField(term30197, term30197.getClass(), "printing", false);
        setField(term30197, term30197.getClass(), "containerListener", null);
        setIntField(term30197, term30197.getClass(), "listeningChildren", 0);
        setIntField(term30197, term30197.getClass(), "listeningBoundsChildren", 0);
        setIntField(term30197, term30197.getClass(), "descendantsCount", 0);
        setField(term30197, term30197.getClass(), "preserveBackgroundColor", null);
        setIntField(term30197, term30197.getClass(), "numOfHWComponents", 0);
        setIntField(term30197, term30197.getClass(), "numOfLWComponents", 0);
        setField(term30197, term30197.getClass(), "modalComp", null);
        setField(term30197, term30197.getClass(), "modalAppContext", null);
        setIntField(term30197, term30197.getClass(), "containerSerializedDataVersion", 0);
        setField(term30197, term30197.getClass(), "peer", null);
        setField(term30197, term30197.getClass(), "parent", null);
        setField(term30197, term30197.getClass(), "appContext", null);
        setIntField(term30197, term30197.getClass(), "x", 0);
        setIntField(term30197, term30197.getClass(), "y", 0);
        setIntField(term30197, term30197.getClass(), "width", 0);
        setIntField(term30197, term30197.getClass(), "height", 0);
        setField(term30197, term30197.getClass(), "foreground", null);
        setField(term30197, term30197.getClass(), "background", null);
        setField(term30197, term30197.getClass(), "font", null);
        setField(term30197, term30197.getClass(), "peerFont", null);
        setField(term30197, term30197.getClass(), "cursor", null);
        setField(term30197, term30197.getClass(), "locale", null);
        setField(term30197, term30197.getClass(), "graphicsConfig", null);
        setField(term30197, term30197.getClass(), "bufferStrategy", null);
        setBooleanField(term30197, term30197.getClass(), "ignoreRepaint", false);
        setBooleanField(term30197, term30197.getClass(), "visible", false);
        setBooleanField(term30197, term30197.getClass(), "enabled", false);
        setBooleanField(term30197, term30197.getClass(), "valid", false);
        setField(term30197, term30197.getClass(), "dropTarget", null);
        setField(term30197, term30197.getClass(), "popups", null);
        setField(term30197, term30197.getClass(), "name", null);
        setBooleanField(term30197, term30197.getClass(), "nameExplicitlySet", false);
        setBooleanField(term30197, term30197.getClass(), "focusable", false);
        setIntField(term30197, term30197.getClass(), "isFocusTraversableOverridden", 0);
        setField(term30197, term30197.getClass(), "focusTraversalKeys", null);
        setBooleanField(term30197, term30197.getClass(), "focusTraversalKeysEnabled", false);
        setField(term30197, term30197.getClass(), "acc", null);
        setField(term30197, term30197.getClass(), "minSize", null);
        setBooleanField(term30197, term30197.getClass(), "minSizeSet", false);
        setField(term30197, term30197.getClass(), "prefSize", null);
        setBooleanField(term30197, term30197.getClass(), "prefSizeSet", false);
        setField(term30197, term30197.getClass(), "maxSize", null);
        setBooleanField(term30197, term30197.getClass(), "maxSizeSet", false);
        setField(term30197, term30197.getClass(), "componentOrientation", null);
        setBooleanField(term30197, term30197.getClass(), "newEventsOnly", false);
        setField(term30197, term30197.getClass(), "componentListener", null);
        setField(term30197, term30197.getClass(), "focusListener", null);
        setField(term30197, term30197.getClass(), "hierarchyListener", null);
        setField(term30197, term30197.getClass(), "hierarchyBoundsListener", null);
        setField(term30197, term30197.getClass(), "keyListener", null);
        setField(term30197, term30197.getClass(), "mouseListener", null);
        setField(term30197, term30197.getClass(), "mouseMotionListener", null);
        setField(term30197, term30197.getClass(), "mouseWheelListener", null);
        setField(term30197, term30197.getClass(), "inputMethodListener", null);
        setLongField(term30197, term30197.getClass(), "eventMask", 0L);
        setField(term30197, term30197.getClass(), "changeSupport", null);
        setField(term30197, term30197.getClass(), "objectLock", null);
        setBooleanField(term30197, term30197.getClass(), "isPacked", false);
        setIntField(term30197, term30197.getClass(), "boundsOp", 0);
        setField(term30197, term30197.getClass(), "compoundShape", null);
        setField(term30197, term30197.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term30197, term30197.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term30197, term30197.getClass(), "backgroundEraseDisabled", false);
        setField(term30197, term30197.getClass(), "eventCache", null);
        setBooleanField(term30197, term30197.getClass(), "coalescingEnabled", false);
        setBooleanField(term30197, term30197.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term30197, term30197.getClass(), "componentSerializedDataVersion", 0);
        setField(term30197, term30197.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.TransparentLabel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term30197, args);
    }

};


