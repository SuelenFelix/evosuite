package org.openRealmOfStars.gui.panels;

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
import static org.openRealmOfStars.gui.panels.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class WorkerProductionPanel_setPlusToolTip_10329287919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239570;

    public WorkerProductionPanel_setPlusToolTip_10329287919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term239570 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.WorkerProductionPanel"));
        setField(term239570, term239570.getClass(), "btnMinus", null);
        setField(term239570, term239570.getClass(), "btnPlus", null);
        setField(term239570, term239570.getClass(), "label", null);
        setBooleanField(term239570, term239570.getClass(), "isAlignmentXSet", false);
        setFloatField(term239570, term239570.getClass(), "alignmentX", 0.0F);
        setBooleanField(term239570, term239570.getClass(), "isAlignmentYSet", false);
        setFloatField(term239570, term239570.getClass(), "alignmentY", 0.0F);
        setField(term239570, term239570.getClass(), "ui", null);
        setField(term239570, term239570.getClass(), "listenerList", null);
        setField(term239570, term239570.getClass(), "clientProperties", null);
        setField(term239570, term239570.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term239570, term239570.getClass(), "autoscrolls", false);
        setField(term239570, term239570.getClass(), "border", null);
        setIntField(term239570, term239570.getClass(), "flags", 0);
        setField(term239570, term239570.getClass(), "inputVerifier", null);
        setBooleanField(term239570, term239570.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term239570, term239570.getClass(), "paintingChild", null);
        setField(term239570, term239570.getClass(), "popupMenu", null);
        setField(term239570, term239570.getClass(), "revalidateRunnableScheduled", null);
        setField(term239570, term239570.getClass(), "focusInputMap", null);
        setField(term239570, term239570.getClass(), "ancestorInputMap", null);
        setField(term239570, term239570.getClass(), "windowInputMap", null);
        setField(term239570, term239570.getClass(), "actionMap", null);
        setField(term239570, term239570.getClass(), "aaHint", null);
        setField(term239570, term239570.getClass(), "lcdRenderingHint", null);
        setField(term239570, term239570.getClass(), "component", null);
        setField(term239570, term239570.getClass(), "layoutMgr", null);
        setField(term239570, term239570.getClass(), "dispatcher", null);
        setField(term239570, term239570.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term239570, term239570.getClass(), "focusCycleRoot", false);
        setBooleanField(term239570, term239570.getClass(), "focusTraversalPolicyProvider", false);
        setField(term239570, term239570.getClass(), "printingThreads", null);
        setBooleanField(term239570, term239570.getClass(), "printing", false);
        setField(term239570, term239570.getClass(), "containerListener", null);
        setIntField(term239570, term239570.getClass(), "listeningChildren", 0);
        setIntField(term239570, term239570.getClass(), "listeningBoundsChildren", 0);
        setIntField(term239570, term239570.getClass(), "descendantsCount", 0);
        setField(term239570, term239570.getClass(), "preserveBackgroundColor", null);
        setIntField(term239570, term239570.getClass(), "numOfHWComponents", 0);
        setIntField(term239570, term239570.getClass(), "numOfLWComponents", 0);
        setField(term239570, term239570.getClass(), "modalComp", null);
        setField(term239570, term239570.getClass(), "modalAppContext", null);
        setIntField(term239570, term239570.getClass(), "containerSerializedDataVersion", 0);
        setField(term239570, term239570.getClass(), "peer", null);
        setField(term239570, term239570.getClass(), "parent", null);
        setField(term239570, term239570.getClass(), "appContext", null);
        setIntField(term239570, term239570.getClass(), "x", 0);
        setIntField(term239570, term239570.getClass(), "y", 0);
        setIntField(term239570, term239570.getClass(), "width", 0);
        setIntField(term239570, term239570.getClass(), "height", 0);
        setField(term239570, term239570.getClass(), "foreground", null);
        setField(term239570, term239570.getClass(), "background", null);
        setField(term239570, term239570.getClass(), "font", null);
        setField(term239570, term239570.getClass(), "peerFont", null);
        setField(term239570, term239570.getClass(), "cursor", null);
        setField(term239570, term239570.getClass(), "locale", null);
        setField(term239570, term239570.getClass(), "graphicsConfig", null);
        setField(term239570, term239570.getClass(), "bufferStrategy", null);
        setBooleanField(term239570, term239570.getClass(), "ignoreRepaint", false);
        setBooleanField(term239570, term239570.getClass(), "visible", false);
        setBooleanField(term239570, term239570.getClass(), "enabled", false);
        setBooleanField(term239570, term239570.getClass(), "valid", false);
        setField(term239570, term239570.getClass(), "dropTarget", null);
        setField(term239570, term239570.getClass(), "popups", null);
        setField(term239570, term239570.getClass(), "name", null);
        setBooleanField(term239570, term239570.getClass(), "nameExplicitlySet", false);
        setBooleanField(term239570, term239570.getClass(), "focusable", false);
        setIntField(term239570, term239570.getClass(), "isFocusTraversableOverridden", 0);
        setField(term239570, term239570.getClass(), "focusTraversalKeys", null);
        setBooleanField(term239570, term239570.getClass(), "focusTraversalKeysEnabled", false);
        setField(term239570, term239570.getClass(), "acc", null);
        setField(term239570, term239570.getClass(), "minSize", null);
        setBooleanField(term239570, term239570.getClass(), "minSizeSet", false);
        setField(term239570, term239570.getClass(), "prefSize", null);
        setBooleanField(term239570, term239570.getClass(), "prefSizeSet", false);
        setField(term239570, term239570.getClass(), "maxSize", null);
        setBooleanField(term239570, term239570.getClass(), "maxSizeSet", false);
        setField(term239570, term239570.getClass(), "componentOrientation", null);
        setBooleanField(term239570, term239570.getClass(), "newEventsOnly", false);
        setField(term239570, term239570.getClass(), "componentListener", null);
        setField(term239570, term239570.getClass(), "focusListener", null);
        setField(term239570, term239570.getClass(), "hierarchyListener", null);
        setField(term239570, term239570.getClass(), "hierarchyBoundsListener", null);
        setField(term239570, term239570.getClass(), "keyListener", null);
        setField(term239570, term239570.getClass(), "mouseListener", null);
        setField(term239570, term239570.getClass(), "mouseMotionListener", null);
        setField(term239570, term239570.getClass(), "mouseWheelListener", null);
        setField(term239570, term239570.getClass(), "inputMethodListener", null);
        setLongField(term239570, term239570.getClass(), "eventMask", 0L);
        setField(term239570, term239570.getClass(), "changeSupport", null);
        setField(term239570, term239570.getClass(), "objectLock", null);
        setBooleanField(term239570, term239570.getClass(), "isPacked", false);
        setIntField(term239570, term239570.getClass(), "boundsOp", 0);
        setField(term239570, term239570.getClass(), "compoundShape", null);
        setField(term239570, term239570.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term239570, term239570.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term239570, term239570.getClass(), "backgroundEraseDisabled", false);
        setField(term239570, term239570.getClass(), "eventCache", null);
        setBooleanField(term239570, term239570.getClass(), "coalescingEnabled", false);
        setBooleanField(term239570, term239570.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term239570, term239570.getClass(), "componentSerializedDataVersion", 0);
        setField(term239570, term239570.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.WorkerProductionPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlusToolTip", argTypes, term239570, args);
    }

};


