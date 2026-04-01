package org.openRealmOfStars.gui.infopanel.traitpanel;

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
import static org.openRealmOfStars.gui.infopanel.traitpanel.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TraitGroupPanel_countCheckBoxes_20629477518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14632;

    public TraitGroupPanel_countCheckBoxes_20629477518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14632 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitGroupPanel"));
        setField(term14632, term14632.getClass(), "checkBoxes", null);
        setField(term14632, term14632.getClass(), "border", null);
        setField(term14632, term14632.getClass(), "internalPanel", null);
        setField(term14632, term14632.getClass(), "internalBorder", null);
        setBooleanField(term14632, term14632.getClass(), "isAlignmentXSet", false);
        setFloatField(term14632, term14632.getClass(), "alignmentX", 0.0F);
        setBooleanField(term14632, term14632.getClass(), "isAlignmentYSet", false);
        setFloatField(term14632, term14632.getClass(), "alignmentY", 0.0F);
        setField(term14632, term14632.getClass(), "ui", null);
        setField(term14632, term14632.getClass(), "listenerList", null);
        setField(term14632, term14632.getClass(), "clientProperties", null);
        setField(term14632, term14632.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term14632, term14632.getClass(), "autoscrolls", false);
        setField(term14632, term14632.getClass(), "border", null);
        setIntField(term14632, term14632.getClass(), "flags", 0);
        setField(term14632, term14632.getClass(), "inputVerifier", null);
        setBooleanField(term14632, term14632.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term14632, term14632.getClass(), "paintingChild", null);
        setField(term14632, term14632.getClass(), "popupMenu", null);
        setField(term14632, term14632.getClass(), "revalidateRunnableScheduled", null);
        setField(term14632, term14632.getClass(), "focusInputMap", null);
        setField(term14632, term14632.getClass(), "ancestorInputMap", null);
        setField(term14632, term14632.getClass(), "windowInputMap", null);
        setField(term14632, term14632.getClass(), "actionMap", null);
        setField(term14632, term14632.getClass(), "aaHint", null);
        setField(term14632, term14632.getClass(), "lcdRenderingHint", null);
        setField(term14632, term14632.getClass(), "component", null);
        setField(term14632, term14632.getClass(), "layoutMgr", null);
        setField(term14632, term14632.getClass(), "dispatcher", null);
        setField(term14632, term14632.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term14632, term14632.getClass(), "focusCycleRoot", false);
        setBooleanField(term14632, term14632.getClass(), "focusTraversalPolicyProvider", false);
        setField(term14632, term14632.getClass(), "printingThreads", null);
        setBooleanField(term14632, term14632.getClass(), "printing", false);
        setField(term14632, term14632.getClass(), "containerListener", null);
        setIntField(term14632, term14632.getClass(), "listeningChildren", 0);
        setIntField(term14632, term14632.getClass(), "listeningBoundsChildren", 0);
        setIntField(term14632, term14632.getClass(), "descendantsCount", 0);
        setField(term14632, term14632.getClass(), "preserveBackgroundColor", null);
        setIntField(term14632, term14632.getClass(), "numOfHWComponents", 0);
        setIntField(term14632, term14632.getClass(), "numOfLWComponents", 0);
        setField(term14632, term14632.getClass(), "modalComp", null);
        setField(term14632, term14632.getClass(), "modalAppContext", null);
        setIntField(term14632, term14632.getClass(), "containerSerializedDataVersion", 0);
        setField(term14632, term14632.getClass(), "peer", null);
        setField(term14632, term14632.getClass(), "parent", null);
        setField(term14632, term14632.getClass(), "appContext", null);
        setIntField(term14632, term14632.getClass(), "x", 0);
        setIntField(term14632, term14632.getClass(), "y", 0);
        setIntField(term14632, term14632.getClass(), "width", 0);
        setIntField(term14632, term14632.getClass(), "height", 0);
        setField(term14632, term14632.getClass(), "foreground", null);
        setField(term14632, term14632.getClass(), "background", null);
        setField(term14632, term14632.getClass(), "font", null);
        setField(term14632, term14632.getClass(), "peerFont", null);
        setField(term14632, term14632.getClass(), "cursor", null);
        setField(term14632, term14632.getClass(), "locale", null);
        setField(term14632, term14632.getClass(), "graphicsConfig", null);
        setField(term14632, term14632.getClass(), "bufferStrategy", null);
        setBooleanField(term14632, term14632.getClass(), "ignoreRepaint", false);
        setBooleanField(term14632, term14632.getClass(), "visible", false);
        setBooleanField(term14632, term14632.getClass(), "enabled", false);
        setBooleanField(term14632, term14632.getClass(), "valid", false);
        setField(term14632, term14632.getClass(), "dropTarget", null);
        setField(term14632, term14632.getClass(), "popups", null);
        setField(term14632, term14632.getClass(), "name", null);
        setBooleanField(term14632, term14632.getClass(), "nameExplicitlySet", false);
        setBooleanField(term14632, term14632.getClass(), "focusable", false);
        setIntField(term14632, term14632.getClass(), "isFocusTraversableOverridden", 0);
        setField(term14632, term14632.getClass(), "focusTraversalKeys", null);
        setBooleanField(term14632, term14632.getClass(), "focusTraversalKeysEnabled", false);
        setField(term14632, term14632.getClass(), "acc", null);
        setField(term14632, term14632.getClass(), "minSize", null);
        setBooleanField(term14632, term14632.getClass(), "minSizeSet", false);
        setField(term14632, term14632.getClass(), "prefSize", null);
        setBooleanField(term14632, term14632.getClass(), "prefSizeSet", false);
        setField(term14632, term14632.getClass(), "maxSize", null);
        setBooleanField(term14632, term14632.getClass(), "maxSizeSet", false);
        setField(term14632, term14632.getClass(), "componentOrientation", null);
        setBooleanField(term14632, term14632.getClass(), "newEventsOnly", false);
        setField(term14632, term14632.getClass(), "componentListener", null);
        setField(term14632, term14632.getClass(), "focusListener", null);
        setField(term14632, term14632.getClass(), "hierarchyListener", null);
        setField(term14632, term14632.getClass(), "hierarchyBoundsListener", null);
        setField(term14632, term14632.getClass(), "keyListener", null);
        setField(term14632, term14632.getClass(), "mouseListener", null);
        setField(term14632, term14632.getClass(), "mouseMotionListener", null);
        setField(term14632, term14632.getClass(), "mouseWheelListener", null);
        setField(term14632, term14632.getClass(), "inputMethodListener", null);
        setLongField(term14632, term14632.getClass(), "eventMask", 0L);
        setField(term14632, term14632.getClass(), "changeSupport", null);
        setField(term14632, term14632.getClass(), "objectLock", null);
        setBooleanField(term14632, term14632.getClass(), "isPacked", false);
        setIntField(term14632, term14632.getClass(), "boundsOp", 0);
        setField(term14632, term14632.getClass(), "compoundShape", null);
        setField(term14632, term14632.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term14632, term14632.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term14632, term14632.getClass(), "backgroundEraseDisabled", false);
        setField(term14632, term14632.getClass(), "eventCache", null);
        setBooleanField(term14632, term14632.getClass(), "coalescingEnabled", false);
        setBooleanField(term14632, term14632.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term14632, term14632.getClass(), "componentSerializedDataVersion", 0);
        setField(term14632, term14632.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitGroupPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "countCheckBoxes", argTypes, term14632, args);
    }

};


