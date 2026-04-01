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

public class GovernmentEditorView_buildJson_17349826518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1988848;

    public GovernmentEditorView_buildJson_17349826518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1988848 = newInstance(Class.forName("org.openRealmOfStars.game.state.GovernmentEditorView"));
        setField(term1988848, term1988848.getClass(), "governmentNameField", null);
        setField(term1988848, term1988848.getClass(), "rulerSelectionCombo", null);
        setField(term1988848, term1988848.getClass(), "rulerTitleMaleField", null);
        setField(term1988848, term1988848.getClass(), "rulerTitleFemaleField", null);
        setField(term1988848, term1988848.getClass(), "traitPanel", null);
        setBooleanField(term1988848, term1988848.getClass(), "conflictWithId", false);
        setBooleanField(term1988848, term1988848.getClass(), "isAlignmentXSet", false);
        setFloatField(term1988848, term1988848.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1988848, term1988848.getClass(), "isAlignmentYSet", false);
        setFloatField(term1988848, term1988848.getClass(), "alignmentY", 0.0F);
        setField(term1988848, term1988848.getClass(), "ui", null);
        setField(term1988848, term1988848.getClass(), "listenerList", null);
        setField(term1988848, term1988848.getClass(), "clientProperties", null);
        setField(term1988848, term1988848.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1988848, term1988848.getClass(), "autoscrolls", false);
        setField(term1988848, term1988848.getClass(), "border", null);
        setIntField(term1988848, term1988848.getClass(), "flags", 0);
        setField(term1988848, term1988848.getClass(), "inputVerifier", null);
        setBooleanField(term1988848, term1988848.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1988848, term1988848.getClass(), "paintingChild", null);
        setField(term1988848, term1988848.getClass(), "popupMenu", null);
        setField(term1988848, term1988848.getClass(), "revalidateRunnableScheduled", null);
        setField(term1988848, term1988848.getClass(), "focusInputMap", null);
        setField(term1988848, term1988848.getClass(), "ancestorInputMap", null);
        setField(term1988848, term1988848.getClass(), "windowInputMap", null);
        setField(term1988848, term1988848.getClass(), "actionMap", null);
        setField(term1988848, term1988848.getClass(), "aaHint", null);
        setField(term1988848, term1988848.getClass(), "lcdRenderingHint", null);
        setField(term1988848, term1988848.getClass(), "component", null);
        setField(term1988848, term1988848.getClass(), "layoutMgr", null);
        setField(term1988848, term1988848.getClass(), "dispatcher", null);
        setField(term1988848, term1988848.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1988848, term1988848.getClass(), "focusCycleRoot", false);
        setBooleanField(term1988848, term1988848.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1988848, term1988848.getClass(), "printingThreads", null);
        setBooleanField(term1988848, term1988848.getClass(), "printing", false);
        setField(term1988848, term1988848.getClass(), "containerListener", null);
        setIntField(term1988848, term1988848.getClass(), "listeningChildren", 0);
        setIntField(term1988848, term1988848.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1988848, term1988848.getClass(), "descendantsCount", 0);
        setField(term1988848, term1988848.getClass(), "preserveBackgroundColor", null);
        setIntField(term1988848, term1988848.getClass(), "numOfHWComponents", 0);
        setIntField(term1988848, term1988848.getClass(), "numOfLWComponents", 0);
        setField(term1988848, term1988848.getClass(), "modalComp", null);
        setField(term1988848, term1988848.getClass(), "modalAppContext", null);
        setIntField(term1988848, term1988848.getClass(), "containerSerializedDataVersion", 0);
        setField(term1988848, term1988848.getClass(), "peer", null);
        setField(term1988848, term1988848.getClass(), "parent", null);
        setField(term1988848, term1988848.getClass(), "appContext", null);
        setIntField(term1988848, term1988848.getClass(), "x", 0);
        setIntField(term1988848, term1988848.getClass(), "y", 0);
        setIntField(term1988848, term1988848.getClass(), "width", 0);
        setIntField(term1988848, term1988848.getClass(), "height", 0);
        setField(term1988848, term1988848.getClass(), "foreground", null);
        setField(term1988848, term1988848.getClass(), "background", null);
        setField(term1988848, term1988848.getClass(), "font", null);
        setField(term1988848, term1988848.getClass(), "peerFont", null);
        setField(term1988848, term1988848.getClass(), "cursor", null);
        setField(term1988848, term1988848.getClass(), "locale", null);
        setField(term1988848, term1988848.getClass(), "graphicsConfig", null);
        setField(term1988848, term1988848.getClass(), "bufferStrategy", null);
        setBooleanField(term1988848, term1988848.getClass(), "ignoreRepaint", false);
        setBooleanField(term1988848, term1988848.getClass(), "visible", false);
        setBooleanField(term1988848, term1988848.getClass(), "enabled", false);
        setBooleanField(term1988848, term1988848.getClass(), "valid", false);
        setField(term1988848, term1988848.getClass(), "dropTarget", null);
        setField(term1988848, term1988848.getClass(), "popups", null);
        setField(term1988848, term1988848.getClass(), "name", null);
        setBooleanField(term1988848, term1988848.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1988848, term1988848.getClass(), "focusable", false);
        setIntField(term1988848, term1988848.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1988848, term1988848.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1988848, term1988848.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1988848, term1988848.getClass(), "acc", null);
        setField(term1988848, term1988848.getClass(), "minSize", null);
        setBooleanField(term1988848, term1988848.getClass(), "minSizeSet", false);
        setField(term1988848, term1988848.getClass(), "prefSize", null);
        setBooleanField(term1988848, term1988848.getClass(), "prefSizeSet", false);
        setField(term1988848, term1988848.getClass(), "maxSize", null);
        setBooleanField(term1988848, term1988848.getClass(), "maxSizeSet", false);
        setField(term1988848, term1988848.getClass(), "componentOrientation", null);
        setBooleanField(term1988848, term1988848.getClass(), "newEventsOnly", false);
        setField(term1988848, term1988848.getClass(), "componentListener", null);
        setField(term1988848, term1988848.getClass(), "focusListener", null);
        setField(term1988848, term1988848.getClass(), "hierarchyListener", null);
        setField(term1988848, term1988848.getClass(), "hierarchyBoundsListener", null);
        setField(term1988848, term1988848.getClass(), "keyListener", null);
        setField(term1988848, term1988848.getClass(), "mouseListener", null);
        setField(term1988848, term1988848.getClass(), "mouseMotionListener", null);
        setField(term1988848, term1988848.getClass(), "mouseWheelListener", null);
        setField(term1988848, term1988848.getClass(), "inputMethodListener", null);
        setLongField(term1988848, term1988848.getClass(), "eventMask", 0L);
        setField(term1988848, term1988848.getClass(), "changeSupport", null);
        setField(term1988848, term1988848.getClass(), "objectLock", null);
        setBooleanField(term1988848, term1988848.getClass(), "isPacked", false);
        setIntField(term1988848, term1988848.getClass(), "boundsOp", 0);
        setField(term1988848, term1988848.getClass(), "compoundShape", null);
        setField(term1988848, term1988848.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1988848, term1988848.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1988848, term1988848.getClass(), "backgroundEraseDisabled", false);
        setField(term1988848, term1988848.getClass(), "eventCache", null);
        setBooleanField(term1988848, term1988848.getClass(), "coalescingEnabled", false);
        setBooleanField(term1988848, term1988848.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1988848, term1988848.getClass(), "componentSerializedDataVersion", 0);
        setField(term1988848, term1988848.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.GovernmentEditorView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildJson", argTypes, term1988848, args);
    }

};


