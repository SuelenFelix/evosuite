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

public class SpaceComboBox_createToolTip_2200469091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86109;

    public SpaceComboBox_createToolTip_2200469091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86109 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.SpaceComboBox"));
        Object term86125 = newInstance(Class.forName("java.lang.Object"));
        Object term86133 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term86134 = (Object[]) newArray("java.lang.Object", 0);
        Object term86135 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term86136 = newInstance(Class.forName("java.lang.Object"));
        Object term86137 = newInstance(Class.forName("java.beans.VetoableChangeSupport"));
        Object term86138 = newInstance(Class.forName("java.beans.VetoableChangeSupport$VetoableChangeListenerMap"));
        Object term86139 = newInstance(Class.forName("java.lang.Object"));
        setField(term86109, term86109.getClass(), "dataModel", null);
        setField(term86109, term86109.getClass(), "renderer", null);
        setField(term86109, term86109.getClass(), "editor", null);
        setIntField(term86109, term86109.getClass(), "maximumRowCount", 1959598890);
        setBooleanField(term86109, term86109.getClass(), "isEditable", false);
        setField(term86109, term86109.getClass(), "keySelectionManager", null);
        setField(term86109, term86109.getClass(), "actionCommand", "PwMdJRwzDW");
        setBooleanField(term86109, term86109.getClass(), "lightWeightPopupEnabled", true);
        setField(term86109, term86109.getClass(), "selectedItemReminder", term86125);
        setField(term86109, term86109.getClass(), "prototypeDisplayValue", null);
        setBooleanField(term86109, term86109.getClass(), "firingActionEvent", true);
        setBooleanField(term86109, term86109.getClass(), "selectingItem", true);
        setBooleanField(term86109, term86109.getClass(), "updateInProgress", false);
        setField(term86109, term86109.getClass(), "action", null);
        setField(term86109, term86109.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term86109, term86109.getClass(), "isAlignmentXSet", true);
        setFloatField(term86109, term86109.getClass(), "alignmentX", 0.5283886F);
        setBooleanField(term86109, term86109.getClass(), "isAlignmentYSet", false);
        setFloatField(term86109, term86109.getClass(), "alignmentY", 0.82608706F);
        setField(term86109, term86109.getClass(), "ui", null);
        setField(term86133, term86133.getClass(), "listenerList", term86134);
        setField(term86109, term86109.getClass(), "listenerList", term86133);
        setField(term86135, term86135.getClass(), "table", term86136);
        setField(term86109, term86109.getClass(), "clientProperties", term86135);
        setField(term86138, term86138.getClass(), "map", null);
        setField(term86137, term86137.getClass(), "map", term86138);
        setField(term86137, term86137.getClass(), "source", term86139);
        setField(term86109, term86109.getClass(), "vetoableChangeSupport", term86137);
        setBooleanField(term86109, term86109.getClass(), "autoscrolls", true);
        setField(term86109, term86109.getClass(), "border", null);
        setIntField(term86109, term86109.getClass(), "flags", -724930680);
        setField(term86109, term86109.getClass(), "inputVerifier", null);
        setBooleanField(term86109, term86109.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term86109, term86109.getClass(), "paintingChild", null);
        setField(term86109, term86109.getClass(), "popupMenu", null);
        setField(term86109, term86109.getClass(), "revalidateRunnableScheduled", null);
        setField(term86109, term86109.getClass(), "focusInputMap", null);
        setField(term86109, term86109.getClass(), "ancestorInputMap", null);
        setField(term86109, term86109.getClass(), "windowInputMap", null);
        setField(term86109, term86109.getClass(), "actionMap", null);
        setField(term86109, term86109.getClass(), "aaHint", null);
        setField(term86109, term86109.getClass(), "lcdRenderingHint", null);
        setField(term86109, term86109.getClass(), "component", null);
        setField(term86109, term86109.getClass(), "layoutMgr", null);
        setField(term86109, term86109.getClass(), "dispatcher", null);
        setField(term86109, term86109.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term86109, term86109.getClass(), "focusCycleRoot", false);
        setBooleanField(term86109, term86109.getClass(), "focusTraversalPolicyProvider", false);
        setField(term86109, term86109.getClass(), "printingThreads", null);
        setBooleanField(term86109, term86109.getClass(), "printing", false);
        setField(term86109, term86109.getClass(), "containerListener", null);
        setIntField(term86109, term86109.getClass(), "listeningChildren", 0);
        setIntField(term86109, term86109.getClass(), "listeningBoundsChildren", 0);
        setIntField(term86109, term86109.getClass(), "descendantsCount", 0);
        setField(term86109, term86109.getClass(), "preserveBackgroundColor", null);
        setIntField(term86109, term86109.getClass(), "numOfHWComponents", 0);
        setIntField(term86109, term86109.getClass(), "numOfLWComponents", 0);
        setField(term86109, term86109.getClass(), "modalComp", null);
        setField(term86109, term86109.getClass(), "modalAppContext", null);
        setIntField(term86109, term86109.getClass(), "containerSerializedDataVersion", 0);
        setField(term86109, term86109.getClass(), "peer", null);
        setField(term86109, term86109.getClass(), "parent", null);
        setField(term86109, term86109.getClass(), "appContext", null);
        setIntField(term86109, term86109.getClass(), "x", 0);
        setIntField(term86109, term86109.getClass(), "y", 0);
        setIntField(term86109, term86109.getClass(), "width", 0);
        setIntField(term86109, term86109.getClass(), "height", 0);
        setField(term86109, term86109.getClass(), "foreground", null);
        setField(term86109, term86109.getClass(), "background", null);
        setField(term86109, term86109.getClass(), "font", null);
        setField(term86109, term86109.getClass(), "peerFont", null);
        setField(term86109, term86109.getClass(), "cursor", null);
        setField(term86109, term86109.getClass(), "locale", null);
        setField(term86109, term86109.getClass(), "graphicsConfig", null);
        setField(term86109, term86109.getClass(), "bufferStrategy", null);
        setBooleanField(term86109, term86109.getClass(), "ignoreRepaint", false);
        setBooleanField(term86109, term86109.getClass(), "visible", false);
        setBooleanField(term86109, term86109.getClass(), "enabled", false);
        setBooleanField(term86109, term86109.getClass(), "valid", false);
        setField(term86109, term86109.getClass(), "dropTarget", null);
        setField(term86109, term86109.getClass(), "popups", null);
        setField(term86109, term86109.getClass(), "name", null);
        setBooleanField(term86109, term86109.getClass(), "nameExplicitlySet", false);
        setBooleanField(term86109, term86109.getClass(), "focusable", false);
        setIntField(term86109, term86109.getClass(), "isFocusTraversableOverridden", 0);
        setField(term86109, term86109.getClass(), "focusTraversalKeys", null);
        setBooleanField(term86109, term86109.getClass(), "focusTraversalKeysEnabled", false);
        setField(term86109, term86109.getClass(), "acc", null);
        setField(term86109, term86109.getClass(), "minSize", null);
        setBooleanField(term86109, term86109.getClass(), "minSizeSet", false);
        setField(term86109, term86109.getClass(), "prefSize", null);
        setBooleanField(term86109, term86109.getClass(), "prefSizeSet", false);
        setField(term86109, term86109.getClass(), "maxSize", null);
        setBooleanField(term86109, term86109.getClass(), "maxSizeSet", false);
        setField(term86109, term86109.getClass(), "componentOrientation", null);
        setBooleanField(term86109, term86109.getClass(), "newEventsOnly", false);
        setField(term86109, term86109.getClass(), "componentListener", null);
        setField(term86109, term86109.getClass(), "focusListener", null);
        setField(term86109, term86109.getClass(), "hierarchyListener", null);
        setField(term86109, term86109.getClass(), "hierarchyBoundsListener", null);
        setField(term86109, term86109.getClass(), "keyListener", null);
        setField(term86109, term86109.getClass(), "mouseListener", null);
        setField(term86109, term86109.getClass(), "mouseMotionListener", null);
        setField(term86109, term86109.getClass(), "mouseWheelListener", null);
        setField(term86109, term86109.getClass(), "inputMethodListener", null);
        setLongField(term86109, term86109.getClass(), "eventMask", 0L);
        setField(term86109, term86109.getClass(), "changeSupport", null);
        setField(term86109, term86109.getClass(), "objectLock", null);
        setBooleanField(term86109, term86109.getClass(), "isPacked", false);
        setIntField(term86109, term86109.getClass(), "boundsOp", 0);
        setField(term86109, term86109.getClass(), "compoundShape", null);
        setField(term86109, term86109.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term86109, term86109.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term86109, term86109.getClass(), "backgroundEraseDisabled", false);
        setField(term86109, term86109.getClass(), "eventCache", null);
        setBooleanField(term86109, term86109.getClass(), "coalescingEnabled", false);
        setBooleanField(term86109, term86109.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term86109, term86109.getClass(), "componentSerializedDataVersion", 0);
        setField(term86109, term86109.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.SpaceComboBox");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term86109, args);
    }

};


