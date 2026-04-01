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

public class TransparentLabel_paintComponent_11698212923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30114;

    public TransparentLabel_paintComponent_11698212923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30114 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.TransparentLabel"));
        Object term30140 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term30141 = (Object[]) newArray("java.lang.Object", 0);
        Object term30142 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term30143 = newInstance(Class.forName("java.lang.Object"));
        Object term30144 = newInstance(Class.forName("java.beans.VetoableChangeSupport"));
        Object term30145 = newInstance(Class.forName("java.beans.VetoableChangeSupport$VetoableChangeListenerMap"));
        Object term30146 = newInstance(Class.forName("java.lang.Object"));
        setBooleanField(term30114, term30114.getClass(), "wrap", true);
        setIntField(term30114, term30114.getClass(), "mnemonic", -1870567623);
        setIntField(term30114, term30114.getClass(), "mnemonicIndex", -1442923471);
        setField(term30114, term30114.getClass(), "text", "GJnnMDVnEP");
        setField(term30114, term30114.getClass(), "defaultIcon", null);
        setField(term30114, term30114.getClass(), "disabledIcon", null);
        setBooleanField(term30114, term30114.getClass(), "disabledIconSet", false);
        setIntField(term30114, term30114.getClass(), "verticalAlignment", -434247549);
        setIntField(term30114, term30114.getClass(), "horizontalAlignment", 1246505552);
        setIntField(term30114, term30114.getClass(), "verticalTextPosition", -1456497810);
        setIntField(term30114, term30114.getClass(), "horizontalTextPosition", 61954667);
        setIntField(term30114, term30114.getClass(), "iconTextGap", -919022885);
        setField(term30114, term30114.getClass(), "labelFor", null);
        setBooleanField(term30114, term30114.getClass(), "isAlignmentXSet", false);
        setFloatField(term30114, term30114.getClass(), "alignmentX", 0.1610204F);
        setBooleanField(term30114, term30114.getClass(), "isAlignmentYSet", false);
        setFloatField(term30114, term30114.getClass(), "alignmentY", 0.791937F);
        setField(term30114, term30114.getClass(), "ui", null);
        setField(term30140, term30140.getClass(), "listenerList", term30141);
        setField(term30114, term30114.getClass(), "listenerList", term30140);
        setField(term30142, term30142.getClass(), "table", term30143);
        setField(term30114, term30114.getClass(), "clientProperties", term30142);
        setField(term30145, term30145.getClass(), "map", null);
        setField(term30144, term30144.getClass(), "map", term30145);
        setField(term30144, term30144.getClass(), "source", term30146);
        setField(term30114, term30114.getClass(), "vetoableChangeSupport", term30144);
        setBooleanField(term30114, term30114.getClass(), "autoscrolls", false);
        setField(term30114, term30114.getClass(), "border", null);
        setIntField(term30114, term30114.getClass(), "flags", 276336694);
        setField(term30114, term30114.getClass(), "inputVerifier", null);
        setBooleanField(term30114, term30114.getClass(), "verifyInputWhenFocusTarget", true);
        setField(term30114, term30114.getClass(), "paintingChild", null);
        setField(term30114, term30114.getClass(), "popupMenu", null);
        setField(term30114, term30114.getClass(), "revalidateRunnableScheduled", null);
        setField(term30114, term30114.getClass(), "focusInputMap", null);
        setField(term30114, term30114.getClass(), "ancestorInputMap", null);
        setField(term30114, term30114.getClass(), "windowInputMap", null);
        setField(term30114, term30114.getClass(), "actionMap", null);
        setField(term30114, term30114.getClass(), "aaHint", null);
        setField(term30114, term30114.getClass(), "lcdRenderingHint", null);
        setField(term30114, term30114.getClass(), "component", null);
        setField(term30114, term30114.getClass(), "layoutMgr", null);
        setField(term30114, term30114.getClass(), "dispatcher", null);
        setField(term30114, term30114.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term30114, term30114.getClass(), "focusCycleRoot", false);
        setBooleanField(term30114, term30114.getClass(), "focusTraversalPolicyProvider", false);
        setField(term30114, term30114.getClass(), "printingThreads", null);
        setBooleanField(term30114, term30114.getClass(), "printing", false);
        setField(term30114, term30114.getClass(), "containerListener", null);
        setIntField(term30114, term30114.getClass(), "listeningChildren", 0);
        setIntField(term30114, term30114.getClass(), "listeningBoundsChildren", 0);
        setIntField(term30114, term30114.getClass(), "descendantsCount", 0);
        setField(term30114, term30114.getClass(), "preserveBackgroundColor", null);
        setIntField(term30114, term30114.getClass(), "numOfHWComponents", 0);
        setIntField(term30114, term30114.getClass(), "numOfLWComponents", 0);
        setField(term30114, term30114.getClass(), "modalComp", null);
        setField(term30114, term30114.getClass(), "modalAppContext", null);
        setIntField(term30114, term30114.getClass(), "containerSerializedDataVersion", 0);
        setField(term30114, term30114.getClass(), "peer", null);
        setField(term30114, term30114.getClass(), "parent", null);
        setField(term30114, term30114.getClass(), "appContext", null);
        setIntField(term30114, term30114.getClass(), "x", 0);
        setIntField(term30114, term30114.getClass(), "y", 0);
        setIntField(term30114, term30114.getClass(), "width", 0);
        setIntField(term30114, term30114.getClass(), "height", 0);
        setField(term30114, term30114.getClass(), "foreground", null);
        setField(term30114, term30114.getClass(), "background", null);
        setField(term30114, term30114.getClass(), "font", null);
        setField(term30114, term30114.getClass(), "peerFont", null);
        setField(term30114, term30114.getClass(), "cursor", null);
        setField(term30114, term30114.getClass(), "locale", null);
        setField(term30114, term30114.getClass(), "graphicsConfig", null);
        setField(term30114, term30114.getClass(), "bufferStrategy", null);
        setBooleanField(term30114, term30114.getClass(), "ignoreRepaint", false);
        setBooleanField(term30114, term30114.getClass(), "visible", false);
        setBooleanField(term30114, term30114.getClass(), "enabled", false);
        setBooleanField(term30114, term30114.getClass(), "valid", false);
        setField(term30114, term30114.getClass(), "dropTarget", null);
        setField(term30114, term30114.getClass(), "popups", null);
        setField(term30114, term30114.getClass(), "name", null);
        setBooleanField(term30114, term30114.getClass(), "nameExplicitlySet", false);
        setBooleanField(term30114, term30114.getClass(), "focusable", false);
        setIntField(term30114, term30114.getClass(), "isFocusTraversableOverridden", 0);
        setField(term30114, term30114.getClass(), "focusTraversalKeys", null);
        setBooleanField(term30114, term30114.getClass(), "focusTraversalKeysEnabled", false);
        setField(term30114, term30114.getClass(), "acc", null);
        setField(term30114, term30114.getClass(), "minSize", null);
        setBooleanField(term30114, term30114.getClass(), "minSizeSet", false);
        setField(term30114, term30114.getClass(), "prefSize", null);
        setBooleanField(term30114, term30114.getClass(), "prefSizeSet", false);
        setField(term30114, term30114.getClass(), "maxSize", null);
        setBooleanField(term30114, term30114.getClass(), "maxSizeSet", false);
        setField(term30114, term30114.getClass(), "componentOrientation", null);
        setBooleanField(term30114, term30114.getClass(), "newEventsOnly", false);
        setField(term30114, term30114.getClass(), "componentListener", null);
        setField(term30114, term30114.getClass(), "focusListener", null);
        setField(term30114, term30114.getClass(), "hierarchyListener", null);
        setField(term30114, term30114.getClass(), "hierarchyBoundsListener", null);
        setField(term30114, term30114.getClass(), "keyListener", null);
        setField(term30114, term30114.getClass(), "mouseListener", null);
        setField(term30114, term30114.getClass(), "mouseMotionListener", null);
        setField(term30114, term30114.getClass(), "mouseWheelListener", null);
        setField(term30114, term30114.getClass(), "inputMethodListener", null);
        setLongField(term30114, term30114.getClass(), "eventMask", 0L);
        setField(term30114, term30114.getClass(), "changeSupport", null);
        setField(term30114, term30114.getClass(), "objectLock", null);
        setBooleanField(term30114, term30114.getClass(), "isPacked", false);
        setIntField(term30114, term30114.getClass(), "boundsOp", 0);
        setField(term30114, term30114.getClass(), "compoundShape", null);
        setField(term30114, term30114.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term30114, term30114.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term30114, term30114.getClass(), "backgroundEraseDisabled", false);
        setField(term30114, term30114.getClass(), "eventCache", null);
        setBooleanField(term30114, term30114.getClass(), "coalescingEnabled", false);
        setBooleanField(term30114, term30114.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term30114, term30114.getClass(), "componentSerializedDataVersion", 0);
        setField(term30114, term30114.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.TransparentLabel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Graphics");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "paintComponent", argTypes, term30114, args);
    }

};


