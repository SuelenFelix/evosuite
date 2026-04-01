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
import java.lang.Object;

public class TransparentLabel_createToolTip_9118819102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30035;

    public TransparentLabel_createToolTip_9118819102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30035 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.TransparentLabel"));
        Object term30061 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term30062 = (Object[]) newArray("java.lang.Object", 0);
        Object term30063 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term30064 = newInstance(Class.forName("java.lang.Object"));
        Object term30065 = newInstance(Class.forName("java.beans.VetoableChangeSupport"));
        Object term30066 = newInstance(Class.forName("java.beans.VetoableChangeSupport$VetoableChangeListenerMap"));
        Object term30067 = newInstance(Class.forName("java.lang.Object"));
        setBooleanField(term30035, term30035.getClass(), "wrap", true);
        setIntField(term30035, term30035.getClass(), "mnemonic", -1054011286);
        setIntField(term30035, term30035.getClass(), "mnemonicIndex", -1640361091);
        setField(term30035, term30035.getClass(), "text", "MAnhIPOtHL");
        setField(term30035, term30035.getClass(), "defaultIcon", null);
        setField(term30035, term30035.getClass(), "disabledIcon", null);
        setBooleanField(term30035, term30035.getClass(), "disabledIconSet", true);
        setIntField(term30035, term30035.getClass(), "verticalAlignment", -1908164516);
        setIntField(term30035, term30035.getClass(), "horizontalAlignment", -1343269854);
        setIntField(term30035, term30035.getClass(), "verticalTextPosition", -731459309);
        setIntField(term30035, term30035.getClass(), "horizontalTextPosition", -913468095);
        setIntField(term30035, term30035.getClass(), "iconTextGap", 38489871);
        setField(term30035, term30035.getClass(), "labelFor", null);
        setBooleanField(term30035, term30035.getClass(), "isAlignmentXSet", true);
        setFloatField(term30035, term30035.getClass(), "alignmentX", 0.26573372F);
        setBooleanField(term30035, term30035.getClass(), "isAlignmentYSet", false);
        setFloatField(term30035, term30035.getClass(), "alignmentY", 0.20737511F);
        setField(term30035, term30035.getClass(), "ui", null);
        setField(term30061, term30061.getClass(), "listenerList", term30062);
        setField(term30035, term30035.getClass(), "listenerList", term30061);
        setField(term30063, term30063.getClass(), "table", term30064);
        setField(term30035, term30035.getClass(), "clientProperties", term30063);
        setField(term30066, term30066.getClass(), "map", null);
        setField(term30065, term30065.getClass(), "map", term30066);
        setField(term30065, term30065.getClass(), "source", term30067);
        setField(term30035, term30035.getClass(), "vetoableChangeSupport", term30065);
        setBooleanField(term30035, term30035.getClass(), "autoscrolls", true);
        setField(term30035, term30035.getClass(), "border", null);
        setIntField(term30035, term30035.getClass(), "flags", 1841765799);
        setField(term30035, term30035.getClass(), "inputVerifier", null);
        setBooleanField(term30035, term30035.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term30035, term30035.getClass(), "paintingChild", null);
        setField(term30035, term30035.getClass(), "popupMenu", null);
        setField(term30035, term30035.getClass(), "revalidateRunnableScheduled", null);
        setField(term30035, term30035.getClass(), "focusInputMap", null);
        setField(term30035, term30035.getClass(), "ancestorInputMap", null);
        setField(term30035, term30035.getClass(), "windowInputMap", null);
        setField(term30035, term30035.getClass(), "actionMap", null);
        setField(term30035, term30035.getClass(), "aaHint", null);
        setField(term30035, term30035.getClass(), "lcdRenderingHint", null);
        setField(term30035, term30035.getClass(), "component", null);
        setField(term30035, term30035.getClass(), "layoutMgr", null);
        setField(term30035, term30035.getClass(), "dispatcher", null);
        setField(term30035, term30035.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term30035, term30035.getClass(), "focusCycleRoot", false);
        setBooleanField(term30035, term30035.getClass(), "focusTraversalPolicyProvider", false);
        setField(term30035, term30035.getClass(), "printingThreads", null);
        setBooleanField(term30035, term30035.getClass(), "printing", false);
        setField(term30035, term30035.getClass(), "containerListener", null);
        setIntField(term30035, term30035.getClass(), "listeningChildren", 0);
        setIntField(term30035, term30035.getClass(), "listeningBoundsChildren", 0);
        setIntField(term30035, term30035.getClass(), "descendantsCount", 0);
        setField(term30035, term30035.getClass(), "preserveBackgroundColor", null);
        setIntField(term30035, term30035.getClass(), "numOfHWComponents", 0);
        setIntField(term30035, term30035.getClass(), "numOfLWComponents", 0);
        setField(term30035, term30035.getClass(), "modalComp", null);
        setField(term30035, term30035.getClass(), "modalAppContext", null);
        setIntField(term30035, term30035.getClass(), "containerSerializedDataVersion", 0);
        setField(term30035, term30035.getClass(), "peer", null);
        setField(term30035, term30035.getClass(), "parent", null);
        setField(term30035, term30035.getClass(), "appContext", null);
        setIntField(term30035, term30035.getClass(), "x", 0);
        setIntField(term30035, term30035.getClass(), "y", 0);
        setIntField(term30035, term30035.getClass(), "width", 0);
        setIntField(term30035, term30035.getClass(), "height", 0);
        setField(term30035, term30035.getClass(), "foreground", null);
        setField(term30035, term30035.getClass(), "background", null);
        setField(term30035, term30035.getClass(), "font", null);
        setField(term30035, term30035.getClass(), "peerFont", null);
        setField(term30035, term30035.getClass(), "cursor", null);
        setField(term30035, term30035.getClass(), "locale", null);
        setField(term30035, term30035.getClass(), "graphicsConfig", null);
        setField(term30035, term30035.getClass(), "bufferStrategy", null);
        setBooleanField(term30035, term30035.getClass(), "ignoreRepaint", false);
        setBooleanField(term30035, term30035.getClass(), "visible", false);
        setBooleanField(term30035, term30035.getClass(), "enabled", false);
        setBooleanField(term30035, term30035.getClass(), "valid", false);
        setField(term30035, term30035.getClass(), "dropTarget", null);
        setField(term30035, term30035.getClass(), "popups", null);
        setField(term30035, term30035.getClass(), "name", null);
        setBooleanField(term30035, term30035.getClass(), "nameExplicitlySet", false);
        setBooleanField(term30035, term30035.getClass(), "focusable", false);
        setIntField(term30035, term30035.getClass(), "isFocusTraversableOverridden", 0);
        setField(term30035, term30035.getClass(), "focusTraversalKeys", null);
        setBooleanField(term30035, term30035.getClass(), "focusTraversalKeysEnabled", false);
        setField(term30035, term30035.getClass(), "acc", null);
        setField(term30035, term30035.getClass(), "minSize", null);
        setBooleanField(term30035, term30035.getClass(), "minSizeSet", false);
        setField(term30035, term30035.getClass(), "prefSize", null);
        setBooleanField(term30035, term30035.getClass(), "prefSizeSet", false);
        setField(term30035, term30035.getClass(), "maxSize", null);
        setBooleanField(term30035, term30035.getClass(), "maxSizeSet", false);
        setField(term30035, term30035.getClass(), "componentOrientation", null);
        setBooleanField(term30035, term30035.getClass(), "newEventsOnly", false);
        setField(term30035, term30035.getClass(), "componentListener", null);
        setField(term30035, term30035.getClass(), "focusListener", null);
        setField(term30035, term30035.getClass(), "hierarchyListener", null);
        setField(term30035, term30035.getClass(), "hierarchyBoundsListener", null);
        setField(term30035, term30035.getClass(), "keyListener", null);
        setField(term30035, term30035.getClass(), "mouseListener", null);
        setField(term30035, term30035.getClass(), "mouseMotionListener", null);
        setField(term30035, term30035.getClass(), "mouseWheelListener", null);
        setField(term30035, term30035.getClass(), "inputMethodListener", null);
        setLongField(term30035, term30035.getClass(), "eventMask", 0L);
        setField(term30035, term30035.getClass(), "changeSupport", null);
        setField(term30035, term30035.getClass(), "objectLock", null);
        setBooleanField(term30035, term30035.getClass(), "isPacked", false);
        setIntField(term30035, term30035.getClass(), "boundsOp", 0);
        setField(term30035, term30035.getClass(), "compoundShape", null);
        setField(term30035, term30035.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term30035, term30035.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term30035, term30035.getClass(), "backgroundEraseDisabled", false);
        setField(term30035, term30035.getClass(), "eventCache", null);
        setBooleanField(term30035, term30035.getClass(), "coalescingEnabled", false);
        setBooleanField(term30035, term30035.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term30035, term30035.getClass(), "componentSerializedDataVersion", 0);
        setField(term30035, term30035.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.TransparentLabel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term30035, args);
    }

};


