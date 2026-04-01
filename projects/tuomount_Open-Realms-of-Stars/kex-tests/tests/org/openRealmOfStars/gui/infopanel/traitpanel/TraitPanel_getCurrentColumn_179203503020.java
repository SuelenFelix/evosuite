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

public class TraitPanel_getCurrentColumn_179203503020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11047;

    public TraitPanel_getCurrentColumn_179203503020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11047 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitPanel"));
        setField(term11047, term11047.getClass(), "traitValue", null);
        setField(term11047, term11047.getClass(), "groups", null);
        setField(term11047, term11047.getClass(), "checkBoxes", null);
        setField(term11047, term11047.getClass(), "columns", null);
        setIntField(term11047, term11047.getClass(), "maxColumns", 0);
        setIntField(term11047, term11047.getClass(), "currentColumn", 0);
        setIntField(term11047, term11047.getClass(), "screenWidth", 0);
        setField(term11047, term11047.getClass(), "border", null);
        setBooleanField(term11047, term11047.getClass(), "isAlignmentXSet", false);
        setFloatField(term11047, term11047.getClass(), "alignmentX", 0.0F);
        setBooleanField(term11047, term11047.getClass(), "isAlignmentYSet", false);
        setFloatField(term11047, term11047.getClass(), "alignmentY", 0.0F);
        setField(term11047, term11047.getClass(), "ui", null);
        setField(term11047, term11047.getClass(), "listenerList", null);
        setField(term11047, term11047.getClass(), "clientProperties", null);
        setField(term11047, term11047.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term11047, term11047.getClass(), "autoscrolls", false);
        setField(term11047, term11047.getClass(), "border", null);
        setIntField(term11047, term11047.getClass(), "flags", 0);
        setField(term11047, term11047.getClass(), "inputVerifier", null);
        setBooleanField(term11047, term11047.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term11047, term11047.getClass(), "paintingChild", null);
        setField(term11047, term11047.getClass(), "popupMenu", null);
        setField(term11047, term11047.getClass(), "revalidateRunnableScheduled", null);
        setField(term11047, term11047.getClass(), "focusInputMap", null);
        setField(term11047, term11047.getClass(), "ancestorInputMap", null);
        setField(term11047, term11047.getClass(), "windowInputMap", null);
        setField(term11047, term11047.getClass(), "actionMap", null);
        setField(term11047, term11047.getClass(), "aaHint", null);
        setField(term11047, term11047.getClass(), "lcdRenderingHint", null);
        setField(term11047, term11047.getClass(), "component", null);
        setField(term11047, term11047.getClass(), "layoutMgr", null);
        setField(term11047, term11047.getClass(), "dispatcher", null);
        setField(term11047, term11047.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term11047, term11047.getClass(), "focusCycleRoot", false);
        setBooleanField(term11047, term11047.getClass(), "focusTraversalPolicyProvider", false);
        setField(term11047, term11047.getClass(), "printingThreads", null);
        setBooleanField(term11047, term11047.getClass(), "printing", false);
        setField(term11047, term11047.getClass(), "containerListener", null);
        setIntField(term11047, term11047.getClass(), "listeningChildren", 0);
        setIntField(term11047, term11047.getClass(), "listeningBoundsChildren", 0);
        setIntField(term11047, term11047.getClass(), "descendantsCount", 0);
        setField(term11047, term11047.getClass(), "preserveBackgroundColor", null);
        setIntField(term11047, term11047.getClass(), "numOfHWComponents", 0);
        setIntField(term11047, term11047.getClass(), "numOfLWComponents", 0);
        setField(term11047, term11047.getClass(), "modalComp", null);
        setField(term11047, term11047.getClass(), "modalAppContext", null);
        setIntField(term11047, term11047.getClass(), "containerSerializedDataVersion", 0);
        setField(term11047, term11047.getClass(), "peer", null);
        setField(term11047, term11047.getClass(), "parent", null);
        setField(term11047, term11047.getClass(), "appContext", null);
        setIntField(term11047, term11047.getClass(), "x", 0);
        setIntField(term11047, term11047.getClass(), "y", 0);
        setIntField(term11047, term11047.getClass(), "width", 0);
        setIntField(term11047, term11047.getClass(), "height", 0);
        setField(term11047, term11047.getClass(), "foreground", null);
        setField(term11047, term11047.getClass(), "background", null);
        setField(term11047, term11047.getClass(), "font", null);
        setField(term11047, term11047.getClass(), "peerFont", null);
        setField(term11047, term11047.getClass(), "cursor", null);
        setField(term11047, term11047.getClass(), "locale", null);
        setField(term11047, term11047.getClass(), "graphicsConfig", null);
        setField(term11047, term11047.getClass(), "bufferStrategy", null);
        setBooleanField(term11047, term11047.getClass(), "ignoreRepaint", false);
        setBooleanField(term11047, term11047.getClass(), "visible", false);
        setBooleanField(term11047, term11047.getClass(), "enabled", false);
        setBooleanField(term11047, term11047.getClass(), "valid", false);
        setField(term11047, term11047.getClass(), "dropTarget", null);
        setField(term11047, term11047.getClass(), "popups", null);
        setField(term11047, term11047.getClass(), "name", null);
        setBooleanField(term11047, term11047.getClass(), "nameExplicitlySet", false);
        setBooleanField(term11047, term11047.getClass(), "focusable", false);
        setIntField(term11047, term11047.getClass(), "isFocusTraversableOverridden", 0);
        setField(term11047, term11047.getClass(), "focusTraversalKeys", null);
        setBooleanField(term11047, term11047.getClass(), "focusTraversalKeysEnabled", false);
        setField(term11047, term11047.getClass(), "acc", null);
        setField(term11047, term11047.getClass(), "minSize", null);
        setBooleanField(term11047, term11047.getClass(), "minSizeSet", false);
        setField(term11047, term11047.getClass(), "prefSize", null);
        setBooleanField(term11047, term11047.getClass(), "prefSizeSet", false);
        setField(term11047, term11047.getClass(), "maxSize", null);
        setBooleanField(term11047, term11047.getClass(), "maxSizeSet", false);
        setField(term11047, term11047.getClass(), "componentOrientation", null);
        setBooleanField(term11047, term11047.getClass(), "newEventsOnly", false);
        setField(term11047, term11047.getClass(), "componentListener", null);
        setField(term11047, term11047.getClass(), "focusListener", null);
        setField(term11047, term11047.getClass(), "hierarchyListener", null);
        setField(term11047, term11047.getClass(), "hierarchyBoundsListener", null);
        setField(term11047, term11047.getClass(), "keyListener", null);
        setField(term11047, term11047.getClass(), "mouseListener", null);
        setField(term11047, term11047.getClass(), "mouseMotionListener", null);
        setField(term11047, term11047.getClass(), "mouseWheelListener", null);
        setField(term11047, term11047.getClass(), "inputMethodListener", null);
        setLongField(term11047, term11047.getClass(), "eventMask", 0L);
        setField(term11047, term11047.getClass(), "changeSupport", null);
        setField(term11047, term11047.getClass(), "objectLock", null);
        setBooleanField(term11047, term11047.getClass(), "isPacked", false);
        setIntField(term11047, term11047.getClass(), "boundsOp", 0);
        setField(term11047, term11047.getClass(), "compoundShape", null);
        setField(term11047, term11047.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term11047, term11047.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term11047, term11047.getClass(), "backgroundEraseDisabled", false);
        setField(term11047, term11047.getClass(), "eventCache", null);
        setBooleanField(term11047, term11047.getClass(), "coalescingEnabled", false);
        setBooleanField(term11047, term11047.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term11047, term11047.getClass(), "componentSerializedDataVersion", 0);
        setField(term11047, term11047.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrentColumn", argTypes, term11047, args);
    }

};


