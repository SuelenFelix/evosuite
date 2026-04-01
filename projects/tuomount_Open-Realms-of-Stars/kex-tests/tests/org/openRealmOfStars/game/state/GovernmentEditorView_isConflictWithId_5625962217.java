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

public class GovernmentEditorView_isConflictWithId_5625962217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1988806;

    public GovernmentEditorView_isConflictWithId_5625962217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1988806 = newInstance(Class.forName("org.openRealmOfStars.game.state.GovernmentEditorView"));
        setField(term1988806, term1988806.getClass(), "governmentNameField", null);
        setField(term1988806, term1988806.getClass(), "rulerSelectionCombo", null);
        setField(term1988806, term1988806.getClass(), "rulerTitleMaleField", null);
        setField(term1988806, term1988806.getClass(), "rulerTitleFemaleField", null);
        setField(term1988806, term1988806.getClass(), "traitPanel", null);
        setBooleanField(term1988806, term1988806.getClass(), "conflictWithId", false);
        setBooleanField(term1988806, term1988806.getClass(), "isAlignmentXSet", false);
        setFloatField(term1988806, term1988806.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1988806, term1988806.getClass(), "isAlignmentYSet", false);
        setFloatField(term1988806, term1988806.getClass(), "alignmentY", 0.0F);
        setField(term1988806, term1988806.getClass(), "ui", null);
        setField(term1988806, term1988806.getClass(), "listenerList", null);
        setField(term1988806, term1988806.getClass(), "clientProperties", null);
        setField(term1988806, term1988806.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1988806, term1988806.getClass(), "autoscrolls", false);
        setField(term1988806, term1988806.getClass(), "border", null);
        setIntField(term1988806, term1988806.getClass(), "flags", 0);
        setField(term1988806, term1988806.getClass(), "inputVerifier", null);
        setBooleanField(term1988806, term1988806.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1988806, term1988806.getClass(), "paintingChild", null);
        setField(term1988806, term1988806.getClass(), "popupMenu", null);
        setField(term1988806, term1988806.getClass(), "revalidateRunnableScheduled", null);
        setField(term1988806, term1988806.getClass(), "focusInputMap", null);
        setField(term1988806, term1988806.getClass(), "ancestorInputMap", null);
        setField(term1988806, term1988806.getClass(), "windowInputMap", null);
        setField(term1988806, term1988806.getClass(), "actionMap", null);
        setField(term1988806, term1988806.getClass(), "aaHint", null);
        setField(term1988806, term1988806.getClass(), "lcdRenderingHint", null);
        setField(term1988806, term1988806.getClass(), "component", null);
        setField(term1988806, term1988806.getClass(), "layoutMgr", null);
        setField(term1988806, term1988806.getClass(), "dispatcher", null);
        setField(term1988806, term1988806.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1988806, term1988806.getClass(), "focusCycleRoot", false);
        setBooleanField(term1988806, term1988806.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1988806, term1988806.getClass(), "printingThreads", null);
        setBooleanField(term1988806, term1988806.getClass(), "printing", false);
        setField(term1988806, term1988806.getClass(), "containerListener", null);
        setIntField(term1988806, term1988806.getClass(), "listeningChildren", 0);
        setIntField(term1988806, term1988806.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1988806, term1988806.getClass(), "descendantsCount", 0);
        setField(term1988806, term1988806.getClass(), "preserveBackgroundColor", null);
        setIntField(term1988806, term1988806.getClass(), "numOfHWComponents", 0);
        setIntField(term1988806, term1988806.getClass(), "numOfLWComponents", 0);
        setField(term1988806, term1988806.getClass(), "modalComp", null);
        setField(term1988806, term1988806.getClass(), "modalAppContext", null);
        setIntField(term1988806, term1988806.getClass(), "containerSerializedDataVersion", 0);
        setField(term1988806, term1988806.getClass(), "peer", null);
        setField(term1988806, term1988806.getClass(), "parent", null);
        setField(term1988806, term1988806.getClass(), "appContext", null);
        setIntField(term1988806, term1988806.getClass(), "x", 0);
        setIntField(term1988806, term1988806.getClass(), "y", 0);
        setIntField(term1988806, term1988806.getClass(), "width", 0);
        setIntField(term1988806, term1988806.getClass(), "height", 0);
        setField(term1988806, term1988806.getClass(), "foreground", null);
        setField(term1988806, term1988806.getClass(), "background", null);
        setField(term1988806, term1988806.getClass(), "font", null);
        setField(term1988806, term1988806.getClass(), "peerFont", null);
        setField(term1988806, term1988806.getClass(), "cursor", null);
        setField(term1988806, term1988806.getClass(), "locale", null);
        setField(term1988806, term1988806.getClass(), "graphicsConfig", null);
        setField(term1988806, term1988806.getClass(), "bufferStrategy", null);
        setBooleanField(term1988806, term1988806.getClass(), "ignoreRepaint", false);
        setBooleanField(term1988806, term1988806.getClass(), "visible", false);
        setBooleanField(term1988806, term1988806.getClass(), "enabled", false);
        setBooleanField(term1988806, term1988806.getClass(), "valid", false);
        setField(term1988806, term1988806.getClass(), "dropTarget", null);
        setField(term1988806, term1988806.getClass(), "popups", null);
        setField(term1988806, term1988806.getClass(), "name", null);
        setBooleanField(term1988806, term1988806.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1988806, term1988806.getClass(), "focusable", false);
        setIntField(term1988806, term1988806.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1988806, term1988806.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1988806, term1988806.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1988806, term1988806.getClass(), "acc", null);
        setField(term1988806, term1988806.getClass(), "minSize", null);
        setBooleanField(term1988806, term1988806.getClass(), "minSizeSet", false);
        setField(term1988806, term1988806.getClass(), "prefSize", null);
        setBooleanField(term1988806, term1988806.getClass(), "prefSizeSet", false);
        setField(term1988806, term1988806.getClass(), "maxSize", null);
        setBooleanField(term1988806, term1988806.getClass(), "maxSizeSet", false);
        setField(term1988806, term1988806.getClass(), "componentOrientation", null);
        setBooleanField(term1988806, term1988806.getClass(), "newEventsOnly", false);
        setField(term1988806, term1988806.getClass(), "componentListener", null);
        setField(term1988806, term1988806.getClass(), "focusListener", null);
        setField(term1988806, term1988806.getClass(), "hierarchyListener", null);
        setField(term1988806, term1988806.getClass(), "hierarchyBoundsListener", null);
        setField(term1988806, term1988806.getClass(), "keyListener", null);
        setField(term1988806, term1988806.getClass(), "mouseListener", null);
        setField(term1988806, term1988806.getClass(), "mouseMotionListener", null);
        setField(term1988806, term1988806.getClass(), "mouseWheelListener", null);
        setField(term1988806, term1988806.getClass(), "inputMethodListener", null);
        setLongField(term1988806, term1988806.getClass(), "eventMask", 0L);
        setField(term1988806, term1988806.getClass(), "changeSupport", null);
        setField(term1988806, term1988806.getClass(), "objectLock", null);
        setBooleanField(term1988806, term1988806.getClass(), "isPacked", false);
        setIntField(term1988806, term1988806.getClass(), "boundsOp", 0);
        setField(term1988806, term1988806.getClass(), "compoundShape", null);
        setField(term1988806, term1988806.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1988806, term1988806.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1988806, term1988806.getClass(), "backgroundEraseDisabled", false);
        setField(term1988806, term1988806.getClass(), "eventCache", null);
        setBooleanField(term1988806, term1988806.getClass(), "coalescingEnabled", false);
        setBooleanField(term1988806, term1988806.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1988806, term1988806.getClass(), "componentSerializedDataVersion", 0);
        setField(term1988806, term1988806.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.GovernmentEditorView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isConflictWithId", argTypes, term1988806, args);
    }

};


