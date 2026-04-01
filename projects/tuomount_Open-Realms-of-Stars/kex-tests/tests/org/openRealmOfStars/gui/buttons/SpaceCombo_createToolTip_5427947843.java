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

public class SpaceCombo_createToolTip_5427947843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19523;

    public SpaceCombo_createToolTip_5427947843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19523 = newInstance(Class.forName("org.openRealmOfStars.gui.buttons.SpaceCombo"));
        setField(term19523, term19523.getClass(), "dataModel", null);
        setField(term19523, term19523.getClass(), "renderer", null);
        setField(term19523, term19523.getClass(), "editor", null);
        setIntField(term19523, term19523.getClass(), "maximumRowCount", 0);
        setBooleanField(term19523, term19523.getClass(), "isEditable", false);
        setField(term19523, term19523.getClass(), "keySelectionManager", null);
        setField(term19523, term19523.getClass(), "actionCommand", null);
        setBooleanField(term19523, term19523.getClass(), "lightWeightPopupEnabled", false);
        setField(term19523, term19523.getClass(), "selectedItemReminder", null);
        setField(term19523, term19523.getClass(), "prototypeDisplayValue", null);
        setBooleanField(term19523, term19523.getClass(), "firingActionEvent", false);
        setBooleanField(term19523, term19523.getClass(), "selectingItem", false);
        setBooleanField(term19523, term19523.getClass(), "updateInProgress", false);
        setField(term19523, term19523.getClass(), "action", null);
        setField(term19523, term19523.getClass(), "actionPropertyChangeListener", null);
        setBooleanField(term19523, term19523.getClass(), "isAlignmentXSet", false);
        setFloatField(term19523, term19523.getClass(), "alignmentX", 0.0F);
        setBooleanField(term19523, term19523.getClass(), "isAlignmentYSet", false);
        setFloatField(term19523, term19523.getClass(), "alignmentY", 0.0F);
        setField(term19523, term19523.getClass(), "ui", null);
        setField(term19523, term19523.getClass(), "listenerList", null);
        setField(term19523, term19523.getClass(), "clientProperties", null);
        setField(term19523, term19523.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term19523, term19523.getClass(), "autoscrolls", false);
        setField(term19523, term19523.getClass(), "border", null);
        setIntField(term19523, term19523.getClass(), "flags", 0);
        setField(term19523, term19523.getClass(), "inputVerifier", null);
        setBooleanField(term19523, term19523.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term19523, term19523.getClass(), "paintingChild", null);
        setField(term19523, term19523.getClass(), "popupMenu", null);
        setField(term19523, term19523.getClass(), "revalidateRunnableScheduled", null);
        setField(term19523, term19523.getClass(), "focusInputMap", null);
        setField(term19523, term19523.getClass(), "ancestorInputMap", null);
        setField(term19523, term19523.getClass(), "windowInputMap", null);
        setField(term19523, term19523.getClass(), "actionMap", null);
        setField(term19523, term19523.getClass(), "aaHint", null);
        setField(term19523, term19523.getClass(), "lcdRenderingHint", null);
        setField(term19523, term19523.getClass(), "component", null);
        setField(term19523, term19523.getClass(), "layoutMgr", null);
        setField(term19523, term19523.getClass(), "dispatcher", null);
        setField(term19523, term19523.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term19523, term19523.getClass(), "focusCycleRoot", false);
        setBooleanField(term19523, term19523.getClass(), "focusTraversalPolicyProvider", false);
        setField(term19523, term19523.getClass(), "printingThreads", null);
        setBooleanField(term19523, term19523.getClass(), "printing", false);
        setField(term19523, term19523.getClass(), "containerListener", null);
        setIntField(term19523, term19523.getClass(), "listeningChildren", 0);
        setIntField(term19523, term19523.getClass(), "listeningBoundsChildren", 0);
        setIntField(term19523, term19523.getClass(), "descendantsCount", 0);
        setField(term19523, term19523.getClass(), "preserveBackgroundColor", null);
        setIntField(term19523, term19523.getClass(), "numOfHWComponents", 0);
        setIntField(term19523, term19523.getClass(), "numOfLWComponents", 0);
        setField(term19523, term19523.getClass(), "modalComp", null);
        setField(term19523, term19523.getClass(), "modalAppContext", null);
        setIntField(term19523, term19523.getClass(), "containerSerializedDataVersion", 0);
        setField(term19523, term19523.getClass(), "peer", null);
        setField(term19523, term19523.getClass(), "parent", null);
        setField(term19523, term19523.getClass(), "appContext", null);
        setIntField(term19523, term19523.getClass(), "x", 0);
        setIntField(term19523, term19523.getClass(), "y", 0);
        setIntField(term19523, term19523.getClass(), "width", 0);
        setIntField(term19523, term19523.getClass(), "height", 0);
        setField(term19523, term19523.getClass(), "foreground", null);
        setField(term19523, term19523.getClass(), "background", null);
        setField(term19523, term19523.getClass(), "font", null);
        setField(term19523, term19523.getClass(), "peerFont", null);
        setField(term19523, term19523.getClass(), "cursor", null);
        setField(term19523, term19523.getClass(), "locale", null);
        setField(term19523, term19523.getClass(), "graphicsConfig", null);
        setField(term19523, term19523.getClass(), "bufferStrategy", null);
        setBooleanField(term19523, term19523.getClass(), "ignoreRepaint", false);
        setBooleanField(term19523, term19523.getClass(), "visible", false);
        setBooleanField(term19523, term19523.getClass(), "enabled", false);
        setBooleanField(term19523, term19523.getClass(), "valid", false);
        setField(term19523, term19523.getClass(), "dropTarget", null);
        setField(term19523, term19523.getClass(), "popups", null);
        setField(term19523, term19523.getClass(), "name", null);
        setBooleanField(term19523, term19523.getClass(), "nameExplicitlySet", false);
        setBooleanField(term19523, term19523.getClass(), "focusable", false);
        setIntField(term19523, term19523.getClass(), "isFocusTraversableOverridden", 0);
        setField(term19523, term19523.getClass(), "focusTraversalKeys", null);
        setBooleanField(term19523, term19523.getClass(), "focusTraversalKeysEnabled", false);
        setField(term19523, term19523.getClass(), "acc", null);
        setField(term19523, term19523.getClass(), "minSize", null);
        setBooleanField(term19523, term19523.getClass(), "minSizeSet", false);
        setField(term19523, term19523.getClass(), "prefSize", null);
        setBooleanField(term19523, term19523.getClass(), "prefSizeSet", false);
        setField(term19523, term19523.getClass(), "maxSize", null);
        setBooleanField(term19523, term19523.getClass(), "maxSizeSet", false);
        setField(term19523, term19523.getClass(), "componentOrientation", null);
        setBooleanField(term19523, term19523.getClass(), "newEventsOnly", false);
        setField(term19523, term19523.getClass(), "componentListener", null);
        setField(term19523, term19523.getClass(), "focusListener", null);
        setField(term19523, term19523.getClass(), "hierarchyListener", null);
        setField(term19523, term19523.getClass(), "hierarchyBoundsListener", null);
        setField(term19523, term19523.getClass(), "keyListener", null);
        setField(term19523, term19523.getClass(), "mouseListener", null);
        setField(term19523, term19523.getClass(), "mouseMotionListener", null);
        setField(term19523, term19523.getClass(), "mouseWheelListener", null);
        setField(term19523, term19523.getClass(), "inputMethodListener", null);
        setLongField(term19523, term19523.getClass(), "eventMask", 0L);
        setField(term19523, term19523.getClass(), "changeSupport", null);
        setField(term19523, term19523.getClass(), "objectLock", null);
        setBooleanField(term19523, term19523.getClass(), "isPacked", false);
        setIntField(term19523, term19523.getClass(), "boundsOp", 0);
        setField(term19523, term19523.getClass(), "compoundShape", null);
        setField(term19523, term19523.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term19523, term19523.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term19523, term19523.getClass(), "backgroundEraseDisabled", false);
        setField(term19523, term19523.getClass(), "eventCache", null);
        setBooleanField(term19523, term19523.getClass(), "coalescingEnabled", false);
        setBooleanField(term19523, term19523.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term19523, term19523.getClass(), "componentSerializedDataVersion", 0);
        setField(term19523, term19523.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.buttons.SpaceCombo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term19523, args);
    }

};


