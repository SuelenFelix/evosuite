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

public class GovernmentEditorView_getEditedGovernmentId_13461785446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1988764;

    public GovernmentEditorView_getEditedGovernmentId_13461785446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1988764 = newInstance(Class.forName("org.openRealmOfStars.game.state.GovernmentEditorView"));
        setField(term1988764, term1988764.getClass(), "governmentNameField", null);
        setField(term1988764, term1988764.getClass(), "rulerSelectionCombo", null);
        setField(term1988764, term1988764.getClass(), "rulerTitleMaleField", null);
        setField(term1988764, term1988764.getClass(), "rulerTitleFemaleField", null);
        setField(term1988764, term1988764.getClass(), "traitPanel", null);
        setBooleanField(term1988764, term1988764.getClass(), "conflictWithId", false);
        setBooleanField(term1988764, term1988764.getClass(), "isAlignmentXSet", false);
        setFloatField(term1988764, term1988764.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1988764, term1988764.getClass(), "isAlignmentYSet", false);
        setFloatField(term1988764, term1988764.getClass(), "alignmentY", 0.0F);
        setField(term1988764, term1988764.getClass(), "ui", null);
        setField(term1988764, term1988764.getClass(), "listenerList", null);
        setField(term1988764, term1988764.getClass(), "clientProperties", null);
        setField(term1988764, term1988764.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1988764, term1988764.getClass(), "autoscrolls", false);
        setField(term1988764, term1988764.getClass(), "border", null);
        setIntField(term1988764, term1988764.getClass(), "flags", 0);
        setField(term1988764, term1988764.getClass(), "inputVerifier", null);
        setBooleanField(term1988764, term1988764.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1988764, term1988764.getClass(), "paintingChild", null);
        setField(term1988764, term1988764.getClass(), "popupMenu", null);
        setField(term1988764, term1988764.getClass(), "revalidateRunnableScheduled", null);
        setField(term1988764, term1988764.getClass(), "focusInputMap", null);
        setField(term1988764, term1988764.getClass(), "ancestorInputMap", null);
        setField(term1988764, term1988764.getClass(), "windowInputMap", null);
        setField(term1988764, term1988764.getClass(), "actionMap", null);
        setField(term1988764, term1988764.getClass(), "aaHint", null);
        setField(term1988764, term1988764.getClass(), "lcdRenderingHint", null);
        setField(term1988764, term1988764.getClass(), "component", null);
        setField(term1988764, term1988764.getClass(), "layoutMgr", null);
        setField(term1988764, term1988764.getClass(), "dispatcher", null);
        setField(term1988764, term1988764.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1988764, term1988764.getClass(), "focusCycleRoot", false);
        setBooleanField(term1988764, term1988764.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1988764, term1988764.getClass(), "printingThreads", null);
        setBooleanField(term1988764, term1988764.getClass(), "printing", false);
        setField(term1988764, term1988764.getClass(), "containerListener", null);
        setIntField(term1988764, term1988764.getClass(), "listeningChildren", 0);
        setIntField(term1988764, term1988764.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1988764, term1988764.getClass(), "descendantsCount", 0);
        setField(term1988764, term1988764.getClass(), "preserveBackgroundColor", null);
        setIntField(term1988764, term1988764.getClass(), "numOfHWComponents", 0);
        setIntField(term1988764, term1988764.getClass(), "numOfLWComponents", 0);
        setField(term1988764, term1988764.getClass(), "modalComp", null);
        setField(term1988764, term1988764.getClass(), "modalAppContext", null);
        setIntField(term1988764, term1988764.getClass(), "containerSerializedDataVersion", 0);
        setField(term1988764, term1988764.getClass(), "peer", null);
        setField(term1988764, term1988764.getClass(), "parent", null);
        setField(term1988764, term1988764.getClass(), "appContext", null);
        setIntField(term1988764, term1988764.getClass(), "x", 0);
        setIntField(term1988764, term1988764.getClass(), "y", 0);
        setIntField(term1988764, term1988764.getClass(), "width", 0);
        setIntField(term1988764, term1988764.getClass(), "height", 0);
        setField(term1988764, term1988764.getClass(), "foreground", null);
        setField(term1988764, term1988764.getClass(), "background", null);
        setField(term1988764, term1988764.getClass(), "font", null);
        setField(term1988764, term1988764.getClass(), "peerFont", null);
        setField(term1988764, term1988764.getClass(), "cursor", null);
        setField(term1988764, term1988764.getClass(), "locale", null);
        setField(term1988764, term1988764.getClass(), "graphicsConfig", null);
        setField(term1988764, term1988764.getClass(), "bufferStrategy", null);
        setBooleanField(term1988764, term1988764.getClass(), "ignoreRepaint", false);
        setBooleanField(term1988764, term1988764.getClass(), "visible", false);
        setBooleanField(term1988764, term1988764.getClass(), "enabled", false);
        setBooleanField(term1988764, term1988764.getClass(), "valid", false);
        setField(term1988764, term1988764.getClass(), "dropTarget", null);
        setField(term1988764, term1988764.getClass(), "popups", null);
        setField(term1988764, term1988764.getClass(), "name", null);
        setBooleanField(term1988764, term1988764.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1988764, term1988764.getClass(), "focusable", false);
        setIntField(term1988764, term1988764.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1988764, term1988764.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1988764, term1988764.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1988764, term1988764.getClass(), "acc", null);
        setField(term1988764, term1988764.getClass(), "minSize", null);
        setBooleanField(term1988764, term1988764.getClass(), "minSizeSet", false);
        setField(term1988764, term1988764.getClass(), "prefSize", null);
        setBooleanField(term1988764, term1988764.getClass(), "prefSizeSet", false);
        setField(term1988764, term1988764.getClass(), "maxSize", null);
        setBooleanField(term1988764, term1988764.getClass(), "maxSizeSet", false);
        setField(term1988764, term1988764.getClass(), "componentOrientation", null);
        setBooleanField(term1988764, term1988764.getClass(), "newEventsOnly", false);
        setField(term1988764, term1988764.getClass(), "componentListener", null);
        setField(term1988764, term1988764.getClass(), "focusListener", null);
        setField(term1988764, term1988764.getClass(), "hierarchyListener", null);
        setField(term1988764, term1988764.getClass(), "hierarchyBoundsListener", null);
        setField(term1988764, term1988764.getClass(), "keyListener", null);
        setField(term1988764, term1988764.getClass(), "mouseListener", null);
        setField(term1988764, term1988764.getClass(), "mouseMotionListener", null);
        setField(term1988764, term1988764.getClass(), "mouseWheelListener", null);
        setField(term1988764, term1988764.getClass(), "inputMethodListener", null);
        setLongField(term1988764, term1988764.getClass(), "eventMask", 0L);
        setField(term1988764, term1988764.getClass(), "changeSupport", null);
        setField(term1988764, term1988764.getClass(), "objectLock", null);
        setBooleanField(term1988764, term1988764.getClass(), "isPacked", false);
        setIntField(term1988764, term1988764.getClass(), "boundsOp", 0);
        setField(term1988764, term1988764.getClass(), "compoundShape", null);
        setField(term1988764, term1988764.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1988764, term1988764.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1988764, term1988764.getClass(), "backgroundEraseDisabled", false);
        setField(term1988764, term1988764.getClass(), "eventCache", null);
        setBooleanField(term1988764, term1988764.getClass(), "coalescingEnabled", false);
        setBooleanField(term1988764, term1988764.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1988764, term1988764.getClass(), "componentSerializedDataVersion", 0);
        setField(term1988764, term1988764.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.GovernmentEditorView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEditedGovernmentId", argTypes, term1988764, args);
    }

};


