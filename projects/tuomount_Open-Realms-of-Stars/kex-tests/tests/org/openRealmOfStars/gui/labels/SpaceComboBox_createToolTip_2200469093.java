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

public class SpaceComboBox_createToolTip_2200469093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86186;

    public SpaceComboBox_createToolTip_2200469093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86186 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.SpaceComboBox"));
        setField(term86186, term86186.getClass(), "dataModel", null);
        setField(term86186, term86186.getClass(), "renderer", null);
        setField(term86186, term86186.getClass(), "editor", null);
        setIntField(term86186, term86186.getClass(), "maximumRowCount", 0);
        setBooleanField(term86186, term86186.getClass(), "isEditable", false);
        setField(term86186, term86186.getClass(), "keySelectionManager", null);
        setField(term86186, term86186.getClass(), "actionCommand", null);
        setBooleanField(term86186, term86186.getClass(), "lightWeightPopupEnabled", false);
        setField(term86186, term86186.getClass(), "selectedItemReminder", null);
        setField(term86186, term86186.getClass(), "prototypeDisplayValue", null);
        setBooleanField(term86186, term86186.getClass(), "firingActionEvent", false);
        setBooleanField(term86186, term86186.getClass(), "selectingItem", false);
        setBooleanField(term86186, term86186.getClass(), "updateInProgress", false);
        setField(term86186, term86186.getClass(), "action", null);
        setField(term86186, term86186.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term86186, term86186.getClass(), "isAlignmentXSet", false);
        setFloatField(term86186, term86186.getClass(), "alignmentX", 0.0F);
        setBooleanField(term86186, term86186.getClass(), "isAlignmentYSet", false);
        setFloatField(term86186, term86186.getClass(), "alignmentY", 0.0F);
        setField(term86186, term86186.getClass(), "ui", null);
        setField(term86186, term86186.getClass(), "listenerList", null);
        setField(term86186, term86186.getClass(), "clientProperties", null);
        setField(term86186, term86186.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term86186, term86186.getClass(), "autoscrolls", false);
        setField(term86186, term86186.getClass(), "border", null);
        setIntField(term86186, term86186.getClass(), "flags", 0);
        setField(term86186, term86186.getClass(), "inputVerifier", null);
        setBooleanField(term86186, term86186.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term86186, term86186.getClass(), "paintingChild", null);
        setField(term86186, term86186.getClass(), "popupMenu", null);
        setField(term86186, term86186.getClass(), "revalidateRunnableScheduled", null);
        setField(term86186, term86186.getClass(), "focusInputMap", null);
        setField(term86186, term86186.getClass(), "ancestorInputMap", null);
        setField(term86186, term86186.getClass(), "windowInputMap", null);
        setField(term86186, term86186.getClass(), "actionMap", null);
        setField(term86186, term86186.getClass(), "aaHint", null);
        setField(term86186, term86186.getClass(), "lcdRenderingHint", null);
        setField(term86186, term86186.getClass(), "component", null);
        setField(term86186, term86186.getClass(), "layoutMgr", null);
        setField(term86186, term86186.getClass(), "dispatcher", null);
        setField(term86186, term86186.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term86186, term86186.getClass(), "focusCycleRoot", false);
        setBooleanField(term86186, term86186.getClass(), "focusTraversalPolicyProvider", false);
        setField(term86186, term86186.getClass(), "printingThreads", null);
        setBooleanField(term86186, term86186.getClass(), "printing", false);
        setField(term86186, term86186.getClass(), "containerListener", null);
        setIntField(term86186, term86186.getClass(), "listeningChildren", 0);
        setIntField(term86186, term86186.getClass(), "listeningBoundsChildren", 0);
        setIntField(term86186, term86186.getClass(), "descendantsCount", 0);
        setField(term86186, term86186.getClass(), "preserveBackgroundColor", null);
        setIntField(term86186, term86186.getClass(), "numOfHWComponents", 0);
        setIntField(term86186, term86186.getClass(), "numOfLWComponents", 0);
        setField(term86186, term86186.getClass(), "modalComp", null);
        setField(term86186, term86186.getClass(), "modalAppContext", null);
        setIntField(term86186, term86186.getClass(), "containerSerializedDataVersion", 0);
        setField(term86186, term86186.getClass(), "peer", null);
        setField(term86186, term86186.getClass(), "parent", null);
        setField(term86186, term86186.getClass(), "appContext", null);
        setIntField(term86186, term86186.getClass(), "x", 0);
        setIntField(term86186, term86186.getClass(), "y", 0);
        setIntField(term86186, term86186.getClass(), "width", 0);
        setIntField(term86186, term86186.getClass(), "height", 0);
        setField(term86186, term86186.getClass(), "foreground", null);
        setField(term86186, term86186.getClass(), "background", null);
        setField(term86186, term86186.getClass(), "font", null);
        setField(term86186, term86186.getClass(), "peerFont", null);
        setField(term86186, term86186.getClass(), "cursor", null);
        setField(term86186, term86186.getClass(), "locale", null);
        setField(term86186, term86186.getClass(), "graphicsConfig", null);
        setField(term86186, term86186.getClass(), "bufferStrategy", null);
        setBooleanField(term86186, term86186.getClass(), "ignoreRepaint", false);
        setBooleanField(term86186, term86186.getClass(), "visible", false);
        setBooleanField(term86186, term86186.getClass(), "enabled", false);
        setBooleanField(term86186, term86186.getClass(), "valid", false);
        setField(term86186, term86186.getClass(), "dropTarget", null);
        setField(term86186, term86186.getClass(), "popups", null);
        setField(term86186, term86186.getClass(), "name", null);
        setBooleanField(term86186, term86186.getClass(), "nameExplicitlySet", false);
        setBooleanField(term86186, term86186.getClass(), "focusable", false);
        setIntField(term86186, term86186.getClass(), "isFocusTraversableOverridden", 0);
        setField(term86186, term86186.getClass(), "focusTraversalKeys", null);
        setBooleanField(term86186, term86186.getClass(), "focusTraversalKeysEnabled", false);
        setField(term86186, term86186.getClass(), "acc", null);
        setField(term86186, term86186.getClass(), "minSize", null);
        setBooleanField(term86186, term86186.getClass(), "minSizeSet", false);
        setField(term86186, term86186.getClass(), "prefSize", null);
        setBooleanField(term86186, term86186.getClass(), "prefSizeSet", false);
        setField(term86186, term86186.getClass(), "maxSize", null);
        setBooleanField(term86186, term86186.getClass(), "maxSizeSet", false);
        setField(term86186, term86186.getClass(), "componentOrientation", null);
        setBooleanField(term86186, term86186.getClass(), "newEventsOnly", false);
        setField(term86186, term86186.getClass(), "componentListener", null);
        setField(term86186, term86186.getClass(), "focusListener", null);
        setField(term86186, term86186.getClass(), "hierarchyListener", null);
        setField(term86186, term86186.getClass(), "hierarchyBoundsListener", null);
        setField(term86186, term86186.getClass(), "keyListener", null);
        setField(term86186, term86186.getClass(), "mouseListener", null);
        setField(term86186, term86186.getClass(), "mouseMotionListener", null);
        setField(term86186, term86186.getClass(), "mouseWheelListener", null);
        setField(term86186, term86186.getClass(), "inputMethodListener", null);
        setLongField(term86186, term86186.getClass(), "eventMask", 0L);
        setField(term86186, term86186.getClass(), "changeSupport", null);
        setField(term86186, term86186.getClass(), "objectLock", null);
        setBooleanField(term86186, term86186.getClass(), "isPacked", false);
        setIntField(term86186, term86186.getClass(), "boundsOp", 0);
        setField(term86186, term86186.getClass(), "compoundShape", null);
        setField(term86186, term86186.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term86186, term86186.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term86186, term86186.getClass(), "backgroundEraseDisabled", false);
        setField(term86186, term86186.getClass(), "eventCache", null);
        setBooleanField(term86186, term86186.getClass(), "coalescingEnabled", false);
        setBooleanField(term86186, term86186.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term86186, term86186.getClass(), "componentSerializedDataVersion", 0);
        setField(term86186, term86186.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.SpaceComboBox");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term86186, args);
    }

};


