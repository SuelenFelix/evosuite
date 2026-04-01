package org.openRealmOfStars.game.state;

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
import static org.openRealmOfStars.game.state.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GovernmentEditorView_handleAction_204494379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1988890;

    public GovernmentEditorView_handleAction_204494379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1988890 = newInstance(Class.forName("org.openRealmOfStars.game.state.GovernmentEditorView"));
        setField(term1988890, term1988890.getClass(), "governmentNameField", null);
        setField(term1988890, term1988890.getClass(), "rulerSelectionCombo", null);
        setField(term1988890, term1988890.getClass(), "rulerTitleMaleField", null);
        setField(term1988890, term1988890.getClass(), "rulerTitleFemaleField", null);
        setField(term1988890, term1988890.getClass(), "traitPanel", null);
        setBooleanField(term1988890, term1988890.getClass(), "conflictWithId", false);
        setBooleanField(term1988890, term1988890.getClass(), "isAlignmentXSet", false);
        setFloatField(term1988890, term1988890.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1988890, term1988890.getClass(), "isAlignmentYSet", false);
        setFloatField(term1988890, term1988890.getClass(), "alignmentY", 0.0F);
        setField(term1988890, term1988890.getClass(), "ui", null);
        setField(term1988890, term1988890.getClass(), "listenerList", null);
        setField(term1988890, term1988890.getClass(), "clientProperties", null);
        setField(term1988890, term1988890.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1988890, term1988890.getClass(), "autoscrolls", false);
        setField(term1988890, term1988890.getClass(), "border", null);
        setIntField(term1988890, term1988890.getClass(), "flags", 0);
        setField(term1988890, term1988890.getClass(), "inputVerifier", null);
        setBooleanField(term1988890, term1988890.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1988890, term1988890.getClass(), "paintingChild", null);
        setField(term1988890, term1988890.getClass(), "popupMenu", null);
        setField(term1988890, term1988890.getClass(), "revalidateRunnableScheduled", null);
        setField(term1988890, term1988890.getClass(), "focusInputMap", null);
        setField(term1988890, term1988890.getClass(), "ancestorInputMap", null);
        setField(term1988890, term1988890.getClass(), "windowInputMap", null);
        setField(term1988890, term1988890.getClass(), "actionMap", null);
        setField(term1988890, term1988890.getClass(), "aaHint", null);
        setField(term1988890, term1988890.getClass(), "lcdRenderingHint", null);
        setField(term1988890, term1988890.getClass(), "component", null);
        setField(term1988890, term1988890.getClass(), "layoutMgr", null);
        setField(term1988890, term1988890.getClass(), "dispatcher", null);
        setField(term1988890, term1988890.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1988890, term1988890.getClass(), "focusCycleRoot", false);
        setBooleanField(term1988890, term1988890.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1988890, term1988890.getClass(), "printingThreads", null);
        setBooleanField(term1988890, term1988890.getClass(), "printing", false);
        setField(term1988890, term1988890.getClass(), "containerListener", null);
        setIntField(term1988890, term1988890.getClass(), "listeningChildren", 0);
        setIntField(term1988890, term1988890.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1988890, term1988890.getClass(), "descendantsCount", 0);
        setField(term1988890, term1988890.getClass(), "preserveBackgroundColor", null);
        setIntField(term1988890, term1988890.getClass(), "numOfHWComponents", 0);
        setIntField(term1988890, term1988890.getClass(), "numOfLWComponents", 0);
        setField(term1988890, term1988890.getClass(), "modalComp", null);
        setField(term1988890, term1988890.getClass(), "modalAppContext", null);
        setIntField(term1988890, term1988890.getClass(), "containerSerializedDataVersion", 0);
        setField(term1988890, term1988890.getClass(), "peer", null);
        setField(term1988890, term1988890.getClass(), "parent", null);
        setField(term1988890, term1988890.getClass(), "appContext", null);
        setIntField(term1988890, term1988890.getClass(), "x", 0);
        setIntField(term1988890, term1988890.getClass(), "y", 0);
        setIntField(term1988890, term1988890.getClass(), "width", 0);
        setIntField(term1988890, term1988890.getClass(), "height", 0);
        setField(term1988890, term1988890.getClass(), "foreground", null);
        setField(term1988890, term1988890.getClass(), "background", null);
        setField(term1988890, term1988890.getClass(), "font", null);
        setField(term1988890, term1988890.getClass(), "peerFont", null);
        setField(term1988890, term1988890.getClass(), "cursor", null);
        setField(term1988890, term1988890.getClass(), "locale", null);
        setField(term1988890, term1988890.getClass(), "graphicsConfig", null);
        setField(term1988890, term1988890.getClass(), "bufferStrategy", null);
        setBooleanField(term1988890, term1988890.getClass(), "ignoreRepaint", false);
        setBooleanField(term1988890, term1988890.getClass(), "visible", false);
        setBooleanField(term1988890, term1988890.getClass(), "enabled", false);
        setBooleanField(term1988890, term1988890.getClass(), "valid", false);
        setField(term1988890, term1988890.getClass(), "dropTarget", null);
        setField(term1988890, term1988890.getClass(), "popups", null);
        setField(term1988890, term1988890.getClass(), "name", null);
        setBooleanField(term1988890, term1988890.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1988890, term1988890.getClass(), "focusable", false);
        setIntField(term1988890, term1988890.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1988890, term1988890.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1988890, term1988890.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1988890, term1988890.getClass(), "acc", null);
        setField(term1988890, term1988890.getClass(), "minSize", null);
        setBooleanField(term1988890, term1988890.getClass(), "minSizeSet", false);
        setField(term1988890, term1988890.getClass(), "prefSize", null);
        setBooleanField(term1988890, term1988890.getClass(), "prefSizeSet", false);
        setField(term1988890, term1988890.getClass(), "maxSize", null);
        setBooleanField(term1988890, term1988890.getClass(), "maxSizeSet", false);
        setField(term1988890, term1988890.getClass(), "componentOrientation", null);
        setBooleanField(term1988890, term1988890.getClass(), "newEventsOnly", false);
        setField(term1988890, term1988890.getClass(), "componentListener", null);
        setField(term1988890, term1988890.getClass(), "focusListener", null);
        setField(term1988890, term1988890.getClass(), "hierarchyListener", null);
        setField(term1988890, term1988890.getClass(), "hierarchyBoundsListener", null);
        setField(term1988890, term1988890.getClass(), "keyListener", null);
        setField(term1988890, term1988890.getClass(), "mouseListener", null);
        setField(term1988890, term1988890.getClass(), "mouseMotionListener", null);
        setField(term1988890, term1988890.getClass(), "mouseWheelListener", null);
        setField(term1988890, term1988890.getClass(), "inputMethodListener", null);
        setLongField(term1988890, term1988890.getClass(), "eventMask", 0L);
        setField(term1988890, term1988890.getClass(), "changeSupport", null);
        setField(term1988890, term1988890.getClass(), "objectLock", null);
        setBooleanField(term1988890, term1988890.getClass(), "isPacked", false);
        setIntField(term1988890, term1988890.getClass(), "boundsOp", 0);
        setField(term1988890, term1988890.getClass(), "compoundShape", null);
        setField(term1988890, term1988890.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1988890, term1988890.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1988890, term1988890.getClass(), "backgroundEraseDisabled", false);
        setField(term1988890, term1988890.getClass(), "eventCache", null);
        setBooleanField(term1988890, term1988890.getClass(), "coalescingEnabled", false);
        setBooleanField(term1988890, term1988890.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1988890, term1988890.getClass(), "componentSerializedDataVersion", 0);
        setField(term1988890, term1988890.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.GovernmentEditorView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleAction", argTypes, term1988890, args);
    }

};


