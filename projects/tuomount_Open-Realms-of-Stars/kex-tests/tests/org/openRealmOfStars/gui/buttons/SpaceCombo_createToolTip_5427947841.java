package org.openRealmOfStars.gui.buttons;

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
import static org.openRealmOfStars.gui.buttons.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SpaceCombo_createToolTip_5427947841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19446;

    public SpaceCombo_createToolTip_5427947841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19446 = newInstance(Class.forName("org.openRealmOfStars.gui.buttons.SpaceCombo"));
        Object term19462 = newInstance(Class.forName("java.lang.Object"));
        Object term19470 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term19471 = (Object[]) newArray("java.lang.Object", 0);
        Object term19472 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term19473 = newInstance(Class.forName("java.lang.Object"));
        Object term19474 = newInstance(Class.forName("java.beans.VetoableChangeSupport"));
        Object term19475 = newInstance(Class.forName("java.beans.VetoableChangeSupport$VetoableChangeListenerMap"));
        Object term19476 = newInstance(Class.forName("java.lang.Object"));
        setField(term19446, term19446.getClass(), "dataModel", null);
        setField(term19446, term19446.getClass(), "renderer", null);
        setField(term19446, term19446.getClass(), "editor", null);
        setIntField(term19446, term19446.getClass(), "maximumRowCount", 848113442);
        setBooleanField(term19446, term19446.getClass(), "isEditable", false);
        setField(term19446, term19446.getClass(), "keySelectionManager", null);
        setField(term19446, term19446.getClass(), "actionCommand", "THZSpzBRYP");
        setBooleanField(term19446, term19446.getClass(), "lightWeightPopupEnabled", false);
        setField(term19446, term19446.getClass(), "selectedItemReminder", term19462);
        setField(term19446, term19446.getClass(), "prototypeDisplayValue", null);
        setBooleanField(term19446, term19446.getClass(), "firingActionEvent", true);
        setBooleanField(term19446, term19446.getClass(), "selectingItem", true);
        setBooleanField(term19446, term19446.getClass(), "updateInProgress", true);
        setField(term19446, term19446.getClass(), "action", null);
        setField(term19446, term19446.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term19446, term19446.getClass(), "isAlignmentXSet", true);
        setFloatField(term19446, term19446.getClass(), "alignmentX", 0.7254646F);
        setBooleanField(term19446, term19446.getClass(), "isAlignmentYSet", true);
        setFloatField(term19446, term19446.getClass(), "alignmentY", 0.9828442F);
        setField(term19446, term19446.getClass(), "ui", null);
        setField(term19470, term19470.getClass(), "listenerList", term19471);
        setField(term19446, term19446.getClass(), "listenerList", term19470);
        setField(term19472, term19472.getClass(), "table", term19473);
        setField(term19446, term19446.getClass(), "clientProperties", term19472);
        setField(term19475, term19475.getClass(), "map", null);
        setField(term19474, term19474.getClass(), "map", term19475);
        setField(term19474, term19474.getClass(), "source", term19476);
        setField(term19446, term19446.getClass(), "vetoableChangeSupport", term19474);
        setBooleanField(term19446, term19446.getClass(), "autoscrolls", false);
        setField(term19446, term19446.getClass(), "border", null);
        setIntField(term19446, term19446.getClass(), "flags", 90996421);
        setField(term19446, term19446.getClass(), "inputVerifier", null);
        setBooleanField(term19446, term19446.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term19446, term19446.getClass(), "paintingChild", null);
        setField(term19446, term19446.getClass(), "popupMenu", null);
        setField(term19446, term19446.getClass(), "revalidateRunnableScheduled", null);
        setField(term19446, term19446.getClass(), "focusInputMap", null);
        setField(term19446, term19446.getClass(), "ancestorInputMap", null);
        setField(term19446, term19446.getClass(), "windowInputMap", null);
        setField(term19446, term19446.getClass(), "actionMap", null);
        setField(term19446, term19446.getClass(), "aaHint", null);
        setField(term19446, term19446.getClass(), "lcdRenderingHint", null);
        setField(term19446, term19446.getClass(), "component", null);
        setField(term19446, term19446.getClass(), "layoutMgr", null);
        setField(term19446, term19446.getClass(), "dispatcher", null);
        setField(term19446, term19446.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term19446, term19446.getClass(), "focusCycleRoot", false);
        setBooleanField(term19446, term19446.getClass(), "focusTraversalPolicyProvider", false);
        setField(term19446, term19446.getClass(), "printingThreads", null);
        setBooleanField(term19446, term19446.getClass(), "printing", false);
        setField(term19446, term19446.getClass(), "containerListener", null);
        setIntField(term19446, term19446.getClass(), "listeningChildren", 0);
        setIntField(term19446, term19446.getClass(), "listeningBoundsChildren", 0);
        setIntField(term19446, term19446.getClass(), "descendantsCount", 0);
        setField(term19446, term19446.getClass(), "preserveBackgroundColor", null);
        setIntField(term19446, term19446.getClass(), "numOfHWComponents", 0);
        setIntField(term19446, term19446.getClass(), "numOfLWComponents", 0);
        setField(term19446, term19446.getClass(), "modalComp", null);
        setField(term19446, term19446.getClass(), "modalAppContext", null);
        setIntField(term19446, term19446.getClass(), "containerSerializedDataVersion", 0);
        setField(term19446, term19446.getClass(), "peer", null);
        setField(term19446, term19446.getClass(), "parent", null);
        setField(term19446, term19446.getClass(), "appContext", null);
        setIntField(term19446, term19446.getClass(), "x", 0);
        setIntField(term19446, term19446.getClass(), "y", 0);
        setIntField(term19446, term19446.getClass(), "width", 0);
        setIntField(term19446, term19446.getClass(), "height", 0);
        setField(term19446, term19446.getClass(), "foreground", null);
        setField(term19446, term19446.getClass(), "background", null);
        setField(term19446, term19446.getClass(), "font", null);
        setField(term19446, term19446.getClass(), "peerFont", null);
        setField(term19446, term19446.getClass(), "cursor", null);
        setField(term19446, term19446.getClass(), "locale", null);
        setField(term19446, term19446.getClass(), "graphicsConfig", null);
        setField(term19446, term19446.getClass(), "bufferStrategy", null);
        setBooleanField(term19446, term19446.getClass(), "ignoreRepaint", false);
        setBooleanField(term19446, term19446.getClass(), "visible", false);
        setBooleanField(term19446, term19446.getClass(), "enabled", false);
        setBooleanField(term19446, term19446.getClass(), "valid", false);
        setField(term19446, term19446.getClass(), "dropTarget", null);
        setField(term19446, term19446.getClass(), "popups", null);
        setField(term19446, term19446.getClass(), "name", null);
        setBooleanField(term19446, term19446.getClass(), "nameExplicitlySet", false);
        setBooleanField(term19446, term19446.getClass(), "focusable", false);
        setIntField(term19446, term19446.getClass(), "isFocusTraversableOverridden", 0);
        setField(term19446, term19446.getClass(), "focusTraversalKeys", null);
        setBooleanField(term19446, term19446.getClass(), "focusTraversalKeysEnabled", false);
        setField(term19446, term19446.getClass(), "acc", null);
        setField(term19446, term19446.getClass(), "minSize", null);
        setBooleanField(term19446, term19446.getClass(), "minSizeSet", false);
        setField(term19446, term19446.getClass(), "prefSize", null);
        setBooleanField(term19446, term19446.getClass(), "prefSizeSet", false);
        setField(term19446, term19446.getClass(), "maxSize", null);
        setBooleanField(term19446, term19446.getClass(), "maxSizeSet", false);
        setField(term19446, term19446.getClass(), "componentOrientation", null);
        setBooleanField(term19446, term19446.getClass(), "newEventsOnly", false);
        setField(term19446, term19446.getClass(), "componentListener", null);
        setField(term19446, term19446.getClass(), "focusListener", null);
        setField(term19446, term19446.getClass(), "hierarchyListener", null);
        setField(term19446, term19446.getClass(), "hierarchyBoundsListener", null);
        setField(term19446, term19446.getClass(), "keyListener", null);
        setField(term19446, term19446.getClass(), "mouseListener", null);
        setField(term19446, term19446.getClass(), "mouseMotionListener", null);
        setField(term19446, term19446.getClass(), "mouseWheelListener", null);
        setField(term19446, term19446.getClass(), "inputMethodListener", null);
        setLongField(term19446, term19446.getClass(), "eventMask", 0L);
        setField(term19446, term19446.getClass(), "changeSupport", null);
        setField(term19446, term19446.getClass(), "objectLock", null);
        setBooleanField(term19446, term19446.getClass(), "isPacked", false);
        setIntField(term19446, term19446.getClass(), "boundsOp", 0);
        setField(term19446, term19446.getClass(), "compoundShape", null);
        setField(term19446, term19446.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term19446, term19446.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term19446, term19446.getClass(), "backgroundEraseDisabled", false);
        setField(term19446, term19446.getClass(), "eventCache", null);
        setBooleanField(term19446, term19446.getClass(), "coalescingEnabled", false);
        setBooleanField(term19446, term19446.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term19446, term19446.getClass(), "componentSerializedDataVersion", 0);
        setField(term19446, term19446.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.buttons.SpaceCombo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term19446, args);
    }

};


