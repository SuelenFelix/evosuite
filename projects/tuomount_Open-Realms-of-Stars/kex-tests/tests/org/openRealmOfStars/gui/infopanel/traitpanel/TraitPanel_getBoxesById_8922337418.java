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

public class TraitPanel_getBoxesById_8922337418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10959;

    public TraitPanel_getBoxesById_8922337418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10959 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitPanel"));
        setField(term10959, term10959.getClass(), "traitValue", null);
        setField(term10959, term10959.getClass(), "groups", null);
        setField(term10959, term10959.getClass(), "checkBoxes", null);
        setField(term10959, term10959.getClass(), "columns", null);
        setIntField(term10959, term10959.getClass(), "maxColumns", 0);
        setIntField(term10959, term10959.getClass(), "currentColumn", 0);
        setIntField(term10959, term10959.getClass(), "screenWidth", 0);
        setField(term10959, term10959.getClass(), "border", null);
        setBooleanField(term10959, term10959.getClass(), "isAlignmentXSet", false);
        setFloatField(term10959, term10959.getClass(), "alignmentX", 0.0F);
        setBooleanField(term10959, term10959.getClass(), "isAlignmentYSet", false);
        setFloatField(term10959, term10959.getClass(), "alignmentY", 0.0F);
        setField(term10959, term10959.getClass(), "ui", null);
        setField(term10959, term10959.getClass(), "listenerList", null);
        setField(term10959, term10959.getClass(), "clientProperties", null);
        setField(term10959, term10959.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term10959, term10959.getClass(), "autoscrolls", false);
        setField(term10959, term10959.getClass(), "border", null);
        setIntField(term10959, term10959.getClass(), "flags", 0);
        setField(term10959, term10959.getClass(), "inputVerifier", null);
        setBooleanField(term10959, term10959.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term10959, term10959.getClass(), "paintingChild", null);
        setField(term10959, term10959.getClass(), "popupMenu", null);
        setField(term10959, term10959.getClass(), "revalidateRunnableScheduled", null);
        setField(term10959, term10959.getClass(), "focusInputMap", null);
        setField(term10959, term10959.getClass(), "ancestorInputMap", null);
        setField(term10959, term10959.getClass(), "windowInputMap", null);
        setField(term10959, term10959.getClass(), "actionMap", null);
        setField(term10959, term10959.getClass(), "aaHint", null);
        setField(term10959, term10959.getClass(), "lcdRenderingHint", null);
        setField(term10959, term10959.getClass(), "component", null);
        setField(term10959, term10959.getClass(), "layoutMgr", null);
        setField(term10959, term10959.getClass(), "dispatcher", null);
        setField(term10959, term10959.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term10959, term10959.getClass(), "focusCycleRoot", false);
        setBooleanField(term10959, term10959.getClass(), "focusTraversalPolicyProvider", false);
        setField(term10959, term10959.getClass(), "printingThreads", null);
        setBooleanField(term10959, term10959.getClass(), "printing", false);
        setField(term10959, term10959.getClass(), "containerListener", null);
        setIntField(term10959, term10959.getClass(), "listeningChildren", 0);
        setIntField(term10959, term10959.getClass(), "listeningBoundsChildren", 0);
        setIntField(term10959, term10959.getClass(), "descendantsCount", 0);
        setField(term10959, term10959.getClass(), "preserveBackgroundColor", null);
        setIntField(term10959, term10959.getClass(), "numOfHWComponents", 0);
        setIntField(term10959, term10959.getClass(), "numOfLWComponents", 0);
        setField(term10959, term10959.getClass(), "modalComp", null);
        setField(term10959, term10959.getClass(), "modalAppContext", null);
        setIntField(term10959, term10959.getClass(), "containerSerializedDataVersion", 0);
        setField(term10959, term10959.getClass(), "peer", null);
        setField(term10959, term10959.getClass(), "parent", null);
        setField(term10959, term10959.getClass(), "appContext", null);
        setIntField(term10959, term10959.getClass(), "x", 0);
        setIntField(term10959, term10959.getClass(), "y", 0);
        setIntField(term10959, term10959.getClass(), "width", 0);
        setIntField(term10959, term10959.getClass(), "height", 0);
        setField(term10959, term10959.getClass(), "foreground", null);
        setField(term10959, term10959.getClass(), "background", null);
        setField(term10959, term10959.getClass(), "font", null);
        setField(term10959, term10959.getClass(), "peerFont", null);
        setField(term10959, term10959.getClass(), "cursor", null);
        setField(term10959, term10959.getClass(), "locale", null);
        setField(term10959, term10959.getClass(), "graphicsConfig", null);
        setField(term10959, term10959.getClass(), "bufferStrategy", null);
        setBooleanField(term10959, term10959.getClass(), "ignoreRepaint", false);
        setBooleanField(term10959, term10959.getClass(), "visible", false);
        setBooleanField(term10959, term10959.getClass(), "enabled", false);
        setBooleanField(term10959, term10959.getClass(), "valid", false);
        setField(term10959, term10959.getClass(), "dropTarget", null);
        setField(term10959, term10959.getClass(), "popups", null);
        setField(term10959, term10959.getClass(), "name", null);
        setBooleanField(term10959, term10959.getClass(), "nameExplicitlySet", false);
        setBooleanField(term10959, term10959.getClass(), "focusable", false);
        setIntField(term10959, term10959.getClass(), "isFocusTraversableOverridden", 0);
        setField(term10959, term10959.getClass(), "focusTraversalKeys", null);
        setBooleanField(term10959, term10959.getClass(), "focusTraversalKeysEnabled", false);
        setField(term10959, term10959.getClass(), "acc", null);
        setField(term10959, term10959.getClass(), "minSize", null);
        setBooleanField(term10959, term10959.getClass(), "minSizeSet", false);
        setField(term10959, term10959.getClass(), "prefSize", null);
        setBooleanField(term10959, term10959.getClass(), "prefSizeSet", false);
        setField(term10959, term10959.getClass(), "maxSize", null);
        setBooleanField(term10959, term10959.getClass(), "maxSizeSet", false);
        setField(term10959, term10959.getClass(), "componentOrientation", null);
        setBooleanField(term10959, term10959.getClass(), "newEventsOnly", false);
        setField(term10959, term10959.getClass(), "componentListener", null);
        setField(term10959, term10959.getClass(), "focusListener", null);
        setField(term10959, term10959.getClass(), "hierarchyListener", null);
        setField(term10959, term10959.getClass(), "hierarchyBoundsListener", null);
        setField(term10959, term10959.getClass(), "keyListener", null);
        setField(term10959, term10959.getClass(), "mouseListener", null);
        setField(term10959, term10959.getClass(), "mouseMotionListener", null);
        setField(term10959, term10959.getClass(), "mouseWheelListener", null);
        setField(term10959, term10959.getClass(), "inputMethodListener", null);
        setLongField(term10959, term10959.getClass(), "eventMask", 0L);
        setField(term10959, term10959.getClass(), "changeSupport", null);
        setField(term10959, term10959.getClass(), "objectLock", null);
        setBooleanField(term10959, term10959.getClass(), "isPacked", false);
        setIntField(term10959, term10959.getClass(), "boundsOp", 0);
        setField(term10959, term10959.getClass(), "compoundShape", null);
        setField(term10959, term10959.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term10959, term10959.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term10959, term10959.getClass(), "backgroundEraseDisabled", false);
        setField(term10959, term10959.getClass(), "eventCache", null);
        setBooleanField(term10959, term10959.getClass(), "coalescingEnabled", false);
        setBooleanField(term10959, term10959.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term10959, term10959.getClass(), "componentSerializedDataVersion", 0);
        setField(term10959, term10959.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getBoxesById", argTypes, term10959, args);
    }

};


