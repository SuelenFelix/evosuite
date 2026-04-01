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

public class TraitPanel_getAllBoxes_85103736223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11179;

    public TraitPanel_getAllBoxes_85103736223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11179 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitPanel"));
        setField(term11179, term11179.getClass(), "traitValue", null);
        setField(term11179, term11179.getClass(), "groups", null);
        setField(term11179, term11179.getClass(), "checkBoxes", null);
        setField(term11179, term11179.getClass(), "columns", null);
        setIntField(term11179, term11179.getClass(), "maxColumns", 0);
        setIntField(term11179, term11179.getClass(), "currentColumn", 0);
        setIntField(term11179, term11179.getClass(), "screenWidth", 0);
        setField(term11179, term11179.getClass(), "border", null);
        setBooleanField(term11179, term11179.getClass(), "isAlignmentXSet", false);
        setFloatField(term11179, term11179.getClass(), "alignmentX", 0.0F);
        setBooleanField(term11179, term11179.getClass(), "isAlignmentYSet", false);
        setFloatField(term11179, term11179.getClass(), "alignmentY", 0.0F);
        setField(term11179, term11179.getClass(), "ui", null);
        setField(term11179, term11179.getClass(), "listenerList", null);
        setField(term11179, term11179.getClass(), "clientProperties", null);
        setField(term11179, term11179.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term11179, term11179.getClass(), "autoscrolls", false);
        setField(term11179, term11179.getClass(), "border", null);
        setIntField(term11179, term11179.getClass(), "flags", 0);
        setField(term11179, term11179.getClass(), "inputVerifier", null);
        setBooleanField(term11179, term11179.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term11179, term11179.getClass(), "paintingChild", null);
        setField(term11179, term11179.getClass(), "popupMenu", null);
        setField(term11179, term11179.getClass(), "revalidateRunnableScheduled", null);
        setField(term11179, term11179.getClass(), "focusInputMap", null);
        setField(term11179, term11179.getClass(), "ancestorInputMap", null);
        setField(term11179, term11179.getClass(), "windowInputMap", null);
        setField(term11179, term11179.getClass(), "actionMap", null);
        setField(term11179, term11179.getClass(), "aaHint", null);
        setField(term11179, term11179.getClass(), "lcdRenderingHint", null);
        setField(term11179, term11179.getClass(), "component", null);
        setField(term11179, term11179.getClass(), "layoutMgr", null);
        setField(term11179, term11179.getClass(), "dispatcher", null);
        setField(term11179, term11179.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term11179, term11179.getClass(), "focusCycleRoot", false);
        setBooleanField(term11179, term11179.getClass(), "focusTraversalPolicyProvider", false);
        setField(term11179, term11179.getClass(), "printingThreads", null);
        setBooleanField(term11179, term11179.getClass(), "printing", false);
        setField(term11179, term11179.getClass(), "containerListener", null);
        setIntField(term11179, term11179.getClass(), "listeningChildren", 0);
        setIntField(term11179, term11179.getClass(), "listeningBoundsChildren", 0);
        setIntField(term11179, term11179.getClass(), "descendantsCount", 0);
        setField(term11179, term11179.getClass(), "preserveBackgroundColor", null);
        setIntField(term11179, term11179.getClass(), "numOfHWComponents", 0);
        setIntField(term11179, term11179.getClass(), "numOfLWComponents", 0);
        setField(term11179, term11179.getClass(), "modalComp", null);
        setField(term11179, term11179.getClass(), "modalAppContext", null);
        setIntField(term11179, term11179.getClass(), "containerSerializedDataVersion", 0);
        setField(term11179, term11179.getClass(), "peer", null);
        setField(term11179, term11179.getClass(), "parent", null);
        setField(term11179, term11179.getClass(), "appContext", null);
        setIntField(term11179, term11179.getClass(), "x", 0);
        setIntField(term11179, term11179.getClass(), "y", 0);
        setIntField(term11179, term11179.getClass(), "width", 0);
        setIntField(term11179, term11179.getClass(), "height", 0);
        setField(term11179, term11179.getClass(), "foreground", null);
        setField(term11179, term11179.getClass(), "background", null);
        setField(term11179, term11179.getClass(), "font", null);
        setField(term11179, term11179.getClass(), "peerFont", null);
        setField(term11179, term11179.getClass(), "cursor", null);
        setField(term11179, term11179.getClass(), "locale", null);
        setField(term11179, term11179.getClass(), "graphicsConfig", null);
        setField(term11179, term11179.getClass(), "bufferStrategy", null);
        setBooleanField(term11179, term11179.getClass(), "ignoreRepaint", false);
        setBooleanField(term11179, term11179.getClass(), "visible", false);
        setBooleanField(term11179, term11179.getClass(), "enabled", false);
        setBooleanField(term11179, term11179.getClass(), "valid", false);
        setField(term11179, term11179.getClass(), "dropTarget", null);
        setField(term11179, term11179.getClass(), "popups", null);
        setField(term11179, term11179.getClass(), "name", null);
        setBooleanField(term11179, term11179.getClass(), "nameExplicitlySet", false);
        setBooleanField(term11179, term11179.getClass(), "focusable", false);
        setIntField(term11179, term11179.getClass(), "isFocusTraversableOverridden", 0);
        setField(term11179, term11179.getClass(), "focusTraversalKeys", null);
        setBooleanField(term11179, term11179.getClass(), "focusTraversalKeysEnabled", false);
        setField(term11179, term11179.getClass(), "acc", null);
        setField(term11179, term11179.getClass(), "minSize", null);
        setBooleanField(term11179, term11179.getClass(), "minSizeSet", false);
        setField(term11179, term11179.getClass(), "prefSize", null);
        setBooleanField(term11179, term11179.getClass(), "prefSizeSet", false);
        setField(term11179, term11179.getClass(), "maxSize", null);
        setBooleanField(term11179, term11179.getClass(), "maxSizeSet", false);
        setField(term11179, term11179.getClass(), "componentOrientation", null);
        setBooleanField(term11179, term11179.getClass(), "newEventsOnly", false);
        setField(term11179, term11179.getClass(), "componentListener", null);
        setField(term11179, term11179.getClass(), "focusListener", null);
        setField(term11179, term11179.getClass(), "hierarchyListener", null);
        setField(term11179, term11179.getClass(), "hierarchyBoundsListener", null);
        setField(term11179, term11179.getClass(), "keyListener", null);
        setField(term11179, term11179.getClass(), "mouseListener", null);
        setField(term11179, term11179.getClass(), "mouseMotionListener", null);
        setField(term11179, term11179.getClass(), "mouseWheelListener", null);
        setField(term11179, term11179.getClass(), "inputMethodListener", null);
        setLongField(term11179, term11179.getClass(), "eventMask", 0L);
        setField(term11179, term11179.getClass(), "changeSupport", null);
        setField(term11179, term11179.getClass(), "objectLock", null);
        setBooleanField(term11179, term11179.getClass(), "isPacked", false);
        setIntField(term11179, term11179.getClass(), "boundsOp", 0);
        setField(term11179, term11179.getClass(), "compoundShape", null);
        setField(term11179, term11179.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term11179, term11179.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term11179, term11179.getClass(), "backgroundEraseDisabled", false);
        setField(term11179, term11179.getClass(), "eventCache", null);
        setBooleanField(term11179, term11179.getClass(), "coalescingEnabled", false);
        setBooleanField(term11179, term11179.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term11179, term11179.getClass(), "componentSerializedDataVersion", 0);
        setField(term11179, term11179.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllBoxes", argTypes, term11179, args);
    }

};


