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

public class SpaceLabel_paintComponent_525643203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179;

    public SpaceLabel_paintComponent_525643203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.SpaceLabel"));
        Object term204 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term205 = (Object[]) newArray("java.lang.Object", 0);
        Object term206 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term207 = newInstance(Class.forName("java.lang.Object"));
        Object term208 = newInstance(Class.forName("java.beans.VetoableChangeSupport"));
        Object term209 = newInstance(Class.forName("java.beans.VetoableChangeSupport$VetoableChangeListenerMap"));
        Object term210 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term179, term179.getClass(), "mnemonic", -1145578966);
        setIntField(term179, term179.getClass(), "mnemonicIndex", 679763016);
        setField(term179, term179.getClass(), "text", "SzjVpOQTyS");
        setField(term179, term179.getClass(), "defaultIcon", null);
        setField(term179, term179.getClass(), "disabledIcon", null);
        setBooleanField(term179, term179.getClass(), "disabledIconSet", true);
        setIntField(term179, term179.getClass(), "verticalAlignment", 1962444399);
        setIntField(term179, term179.getClass(), "horizontalAlignment", 767834723);
        setIntField(term179, term179.getClass(), "verticalTextPosition", -602026508);
        setIntField(term179, term179.getClass(), "horizontalTextPosition", -157887805);
        setIntField(term179, term179.getClass(), "iconTextGap", 1876565163);
        setField(term179, term179.getClass(), "labelFor", null);
        setBooleanField(term179, term179.getClass(), "isAlignmentXSet", true);
        setFloatField(term179, term179.getClass(), "alignmentX", 0.5523636F);
        setBooleanField(term179, term179.getClass(), "isAlignmentYSet", true);
        setFloatField(term179, term179.getClass(), "alignmentY", 0.8564069F);
        setField(term179, term179.getClass(), "ui", null);
        setField(term204, term204.getClass(), "listenerList", term205);
        setField(term179, term179.getClass(), "listenerList", term204);
        setField(term206, term206.getClass(), "table", term207);
        setField(term179, term179.getClass(), "clientProperties", term206);
        setField(term209, term209.getClass(), "map", null);
        setField(term208, term208.getClass(), "map", term209);
        setField(term208, term208.getClass(), "source", term210);
        setField(term179, term179.getClass(), "vetoableChangeSupport", term208);
        setBooleanField(term179, term179.getClass(), "autoscrolls", true);
        setField(term179, term179.getClass(), "border", null);
        setIntField(term179, term179.getClass(), "flags", -1016503459);
        setField(term179, term179.getClass(), "inputVerifier", null);
        setBooleanField(term179, term179.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term179, term179.getClass(), "paintingChild", null);
        setField(term179, term179.getClass(), "popupMenu", null);
        setField(term179, term179.getClass(), "revalidateRunnableScheduled", null);
        setField(term179, term179.getClass(), "focusInputMap", null);
        setField(term179, term179.getClass(), "ancestorInputMap", null);
        setField(term179, term179.getClass(), "windowInputMap", null);
        setField(term179, term179.getClass(), "actionMap", null);
        setField(term179, term179.getClass(), "aaHint", null);
        setField(term179, term179.getClass(), "lcdRenderingHint", null);
        setField(term179, term179.getClass(), "component", null);
        setField(term179, term179.getClass(), "layoutMgr", null);
        setField(term179, term179.getClass(), "dispatcher", null);
        setField(term179, term179.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term179, term179.getClass(), "focusCycleRoot", false);
        setBooleanField(term179, term179.getClass(), "focusTraversalPolicyProvider", false);
        setField(term179, term179.getClass(), "printingThreads", null);
        setBooleanField(term179, term179.getClass(), "printing", false);
        setField(term179, term179.getClass(), "containerListener", null);
        setIntField(term179, term179.getClass(), "listeningChildren", 0);
        setIntField(term179, term179.getClass(), "listeningBoundsChildren", 0);
        setIntField(term179, term179.getClass(), "descendantsCount", 0);
        setField(term179, term179.getClass(), "preserveBackgroundColor", null);
        setIntField(term179, term179.getClass(), "numOfHWComponents", 0);
        setIntField(term179, term179.getClass(), "numOfLWComponents", 0);
        setField(term179, term179.getClass(), "modalComp", null);
        setField(term179, term179.getClass(), "modalAppContext", null);
        setIntField(term179, term179.getClass(), "containerSerializedDataVersion", 0);
        setField(term179, term179.getClass(), "peer", null);
        setField(term179, term179.getClass(), "parent", null);
        setField(term179, term179.getClass(), "appContext", null);
        setIntField(term179, term179.getClass(), "x", 0);
        setIntField(term179, term179.getClass(), "y", 0);
        setIntField(term179, term179.getClass(), "width", 0);
        setIntField(term179, term179.getClass(), "height", 0);
        setField(term179, term179.getClass(), "foreground", null);
        setField(term179, term179.getClass(), "background", null);
        setField(term179, term179.getClass(), "font", null);
        setField(term179, term179.getClass(), "peerFont", null);
        setField(term179, term179.getClass(), "cursor", null);
        setField(term179, term179.getClass(), "locale", null);
        setField(term179, term179.getClass(), "graphicsConfig", null);
        setField(term179, term179.getClass(), "bufferStrategy", null);
        setBooleanField(term179, term179.getClass(), "ignoreRepaint", false);
        setBooleanField(term179, term179.getClass(), "visible", false);
        setBooleanField(term179, term179.getClass(), "enabled", false);
        setBooleanField(term179, term179.getClass(), "valid", false);
        setField(term179, term179.getClass(), "dropTarget", null);
        setField(term179, term179.getClass(), "popups", null);
        setField(term179, term179.getClass(), "name", null);
        setBooleanField(term179, term179.getClass(), "nameExplicitlySet", false);
        setBooleanField(term179, term179.getClass(), "focusable", false);
        setIntField(term179, term179.getClass(), "isFocusTraversableOverridden", 0);
        setField(term179, term179.getClass(), "focusTraversalKeys", null);
        setBooleanField(term179, term179.getClass(), "focusTraversalKeysEnabled", false);
        setField(term179, term179.getClass(), "acc", null);
        setField(term179, term179.getClass(), "minSize", null);
        setBooleanField(term179, term179.getClass(), "minSizeSet", false);
        setField(term179, term179.getClass(), "prefSize", null);
        setBooleanField(term179, term179.getClass(), "prefSizeSet", false);
        setField(term179, term179.getClass(), "maxSize", null);
        setBooleanField(term179, term179.getClass(), "maxSizeSet", false);
        setField(term179, term179.getClass(), "componentOrientation", null);
        setBooleanField(term179, term179.getClass(), "newEventsOnly", false);
        setField(term179, term179.getClass(), "componentListener", null);
        setField(term179, term179.getClass(), "focusListener", null);
        setField(term179, term179.getClass(), "hierarchyListener", null);
        setField(term179, term179.getClass(), "hierarchyBoundsListener", null);
        setField(term179, term179.getClass(), "keyListener", null);
        setField(term179, term179.getClass(), "mouseListener", null);
        setField(term179, term179.getClass(), "mouseMotionListener", null);
        setField(term179, term179.getClass(), "mouseWheelListener", null);
        setField(term179, term179.getClass(), "inputMethodListener", null);
        setLongField(term179, term179.getClass(), "eventMask", 0L);
        setField(term179, term179.getClass(), "changeSupport", null);
        setField(term179, term179.getClass(), "objectLock", null);
        setBooleanField(term179, term179.getClass(), "isPacked", false);
        setIntField(term179, term179.getClass(), "boundsOp", 0);
        setField(term179, term179.getClass(), "compoundShape", null);
        setField(term179, term179.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term179, term179.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term179, term179.getClass(), "backgroundEraseDisabled", false);
        setField(term179, term179.getClass(), "eventCache", null);
        setBooleanField(term179, term179.getClass(), "coalescingEnabled", false);
        setBooleanField(term179, term179.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term179, term179.getClass(), "componentSerializedDataVersion", 0);
        setField(term179, term179.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.SpaceLabel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Graphics");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "paintComponent", argTypes, term179, args);
    }

};


