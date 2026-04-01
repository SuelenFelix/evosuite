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

public class TraitPanel_checkTrait_169429601316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10871;

    public TraitPanel_checkTrait_169429601316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10871 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitPanel"));
        setField(term10871, term10871.getClass(), "traitValue", null);
        setField(term10871, term10871.getClass(), "groups", null);
        setField(term10871, term10871.getClass(), "checkBoxes", null);
        setField(term10871, term10871.getClass(), "columns", null);
        setIntField(term10871, term10871.getClass(), "maxColumns", 0);
        setIntField(term10871, term10871.getClass(), "currentColumn", 0);
        setIntField(term10871, term10871.getClass(), "screenWidth", 0);
        setField(term10871, term10871.getClass(), "border", null);
        setBooleanField(term10871, term10871.getClass(), "isAlignmentXSet", false);
        setFloatField(term10871, term10871.getClass(), "alignmentX", 0.0F);
        setBooleanField(term10871, term10871.getClass(), "isAlignmentYSet", false);
        setFloatField(term10871, term10871.getClass(), "alignmentY", 0.0F);
        setField(term10871, term10871.getClass(), "ui", null);
        setField(term10871, term10871.getClass(), "listenerList", null);
        setField(term10871, term10871.getClass(), "clientProperties", null);
        setField(term10871, term10871.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term10871, term10871.getClass(), "autoscrolls", false);
        setField(term10871, term10871.getClass(), "border", null);
        setIntField(term10871, term10871.getClass(), "flags", 0);
        setField(term10871, term10871.getClass(), "inputVerifier", null);
        setBooleanField(term10871, term10871.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term10871, term10871.getClass(), "paintingChild", null);
        setField(term10871, term10871.getClass(), "popupMenu", null);
        setField(term10871, term10871.getClass(), "revalidateRunnableScheduled", null);
        setField(term10871, term10871.getClass(), "focusInputMap", null);
        setField(term10871, term10871.getClass(), "ancestorInputMap", null);
        setField(term10871, term10871.getClass(), "windowInputMap", null);
        setField(term10871, term10871.getClass(), "actionMap", null);
        setField(term10871, term10871.getClass(), "aaHint", null);
        setField(term10871, term10871.getClass(), "lcdRenderingHint", null);
        setField(term10871, term10871.getClass(), "component", null);
        setField(term10871, term10871.getClass(), "layoutMgr", null);
        setField(term10871, term10871.getClass(), "dispatcher", null);
        setField(term10871, term10871.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term10871, term10871.getClass(), "focusCycleRoot", false);
        setBooleanField(term10871, term10871.getClass(), "focusTraversalPolicyProvider", false);
        setField(term10871, term10871.getClass(), "printingThreads", null);
        setBooleanField(term10871, term10871.getClass(), "printing", false);
        setField(term10871, term10871.getClass(), "containerListener", null);
        setIntField(term10871, term10871.getClass(), "listeningChildren", 0);
        setIntField(term10871, term10871.getClass(), "listeningBoundsChildren", 0);
        setIntField(term10871, term10871.getClass(), "descendantsCount", 0);
        setField(term10871, term10871.getClass(), "preserveBackgroundColor", null);
        setIntField(term10871, term10871.getClass(), "numOfHWComponents", 0);
        setIntField(term10871, term10871.getClass(), "numOfLWComponents", 0);
        setField(term10871, term10871.getClass(), "modalComp", null);
        setField(term10871, term10871.getClass(), "modalAppContext", null);
        setIntField(term10871, term10871.getClass(), "containerSerializedDataVersion", 0);
        setField(term10871, term10871.getClass(), "peer", null);
        setField(term10871, term10871.getClass(), "parent", null);
        setField(term10871, term10871.getClass(), "appContext", null);
        setIntField(term10871, term10871.getClass(), "x", 0);
        setIntField(term10871, term10871.getClass(), "y", 0);
        setIntField(term10871, term10871.getClass(), "width", 0);
        setIntField(term10871, term10871.getClass(), "height", 0);
        setField(term10871, term10871.getClass(), "foreground", null);
        setField(term10871, term10871.getClass(), "background", null);
        setField(term10871, term10871.getClass(), "font", null);
        setField(term10871, term10871.getClass(), "peerFont", null);
        setField(term10871, term10871.getClass(), "cursor", null);
        setField(term10871, term10871.getClass(), "locale", null);
        setField(term10871, term10871.getClass(), "graphicsConfig", null);
        setField(term10871, term10871.getClass(), "bufferStrategy", null);
        setBooleanField(term10871, term10871.getClass(), "ignoreRepaint", false);
        setBooleanField(term10871, term10871.getClass(), "visible", false);
        setBooleanField(term10871, term10871.getClass(), "enabled", false);
        setBooleanField(term10871, term10871.getClass(), "valid", false);
        setField(term10871, term10871.getClass(), "dropTarget", null);
        setField(term10871, term10871.getClass(), "popups", null);
        setField(term10871, term10871.getClass(), "name", null);
        setBooleanField(term10871, term10871.getClass(), "nameExplicitlySet", false);
        setBooleanField(term10871, term10871.getClass(), "focusable", false);
        setIntField(term10871, term10871.getClass(), "isFocusTraversableOverridden", 0);
        setField(term10871, term10871.getClass(), "focusTraversalKeys", null);
        setBooleanField(term10871, term10871.getClass(), "focusTraversalKeysEnabled", false);
        setField(term10871, term10871.getClass(), "acc", null);
        setField(term10871, term10871.getClass(), "minSize", null);
        setBooleanField(term10871, term10871.getClass(), "minSizeSet", false);
        setField(term10871, term10871.getClass(), "prefSize", null);
        setBooleanField(term10871, term10871.getClass(), "prefSizeSet", false);
        setField(term10871, term10871.getClass(), "maxSize", null);
        setBooleanField(term10871, term10871.getClass(), "maxSizeSet", false);
        setField(term10871, term10871.getClass(), "componentOrientation", null);
        setBooleanField(term10871, term10871.getClass(), "newEventsOnly", false);
        setField(term10871, term10871.getClass(), "componentListener", null);
        setField(term10871, term10871.getClass(), "focusListener", null);
        setField(term10871, term10871.getClass(), "hierarchyListener", null);
        setField(term10871, term10871.getClass(), "hierarchyBoundsListener", null);
        setField(term10871, term10871.getClass(), "keyListener", null);
        setField(term10871, term10871.getClass(), "mouseListener", null);
        setField(term10871, term10871.getClass(), "mouseMotionListener", null);
        setField(term10871, term10871.getClass(), "mouseWheelListener", null);
        setField(term10871, term10871.getClass(), "inputMethodListener", null);
        setLongField(term10871, term10871.getClass(), "eventMask", 0L);
        setField(term10871, term10871.getClass(), "changeSupport", null);
        setField(term10871, term10871.getClass(), "objectLock", null);
        setBooleanField(term10871, term10871.getClass(), "isPacked", false);
        setIntField(term10871, term10871.getClass(), "boundsOp", 0);
        setField(term10871, term10871.getClass(), "compoundShape", null);
        setField(term10871, term10871.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term10871, term10871.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term10871, term10871.getClass(), "backgroundEraseDisabled", false);
        setField(term10871, term10871.getClass(), "eventCache", null);
        setBooleanField(term10871, term10871.getClass(), "coalescingEnabled", false);
        setBooleanField(term10871, term10871.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term10871, term10871.getClass(), "componentSerializedDataVersion", 0);
        setField(term10871, term10871.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "checkTrait", argTypes, term10871, args);
    }

};


