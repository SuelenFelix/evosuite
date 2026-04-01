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

public class TraitGroupPanel_getTitle_113495670411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14755;

    public TraitGroupPanel_getTitle_113495670411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14755 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitGroupPanel"));
        setField(term14755, term14755.getClass(), "checkBoxes", null);
        setField(term14755, term14755.getClass(), "border", null);
        setField(term14755, term14755.getClass(), "internalPanel", null);
        setField(term14755, term14755.getClass(), "internalBorder", null);
        setBooleanField(term14755, term14755.getClass(), "isAlignmentXSet", false);
        setFloatField(term14755, term14755.getClass(), "alignmentX", 0.0F);
        setBooleanField(term14755, term14755.getClass(), "isAlignmentYSet", false);
        setFloatField(term14755, term14755.getClass(), "alignmentY", 0.0F);
        setField(term14755, term14755.getClass(), "ui", null);
        setField(term14755, term14755.getClass(), "listenerList", null);
        setField(term14755, term14755.getClass(), "clientProperties", null);
        setField(term14755, term14755.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term14755, term14755.getClass(), "autoscrolls", false);
        setField(term14755, term14755.getClass(), "border", null);
        setIntField(term14755, term14755.getClass(), "flags", 0);
        setField(term14755, term14755.getClass(), "inputVerifier", null);
        setBooleanField(term14755, term14755.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term14755, term14755.getClass(), "paintingChild", null);
        setField(term14755, term14755.getClass(), "popupMenu", null);
        setField(term14755, term14755.getClass(), "revalidateRunnableScheduled", null);
        setField(term14755, term14755.getClass(), "focusInputMap", null);
        setField(term14755, term14755.getClass(), "ancestorInputMap", null);
        setField(term14755, term14755.getClass(), "windowInputMap", null);
        setField(term14755, term14755.getClass(), "actionMap", null);
        setField(term14755, term14755.getClass(), "aaHint", null);
        setField(term14755, term14755.getClass(), "lcdRenderingHint", null);
        setField(term14755, term14755.getClass(), "component", null);
        setField(term14755, term14755.getClass(), "layoutMgr", null);
        setField(term14755, term14755.getClass(), "dispatcher", null);
        setField(term14755, term14755.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term14755, term14755.getClass(), "focusCycleRoot", false);
        setBooleanField(term14755, term14755.getClass(), "focusTraversalPolicyProvider", false);
        setField(term14755, term14755.getClass(), "printingThreads", null);
        setBooleanField(term14755, term14755.getClass(), "printing", false);
        setField(term14755, term14755.getClass(), "containerListener", null);
        setIntField(term14755, term14755.getClass(), "listeningChildren", 0);
        setIntField(term14755, term14755.getClass(), "listeningBoundsChildren", 0);
        setIntField(term14755, term14755.getClass(), "descendantsCount", 0);
        setField(term14755, term14755.getClass(), "preserveBackgroundColor", null);
        setIntField(term14755, term14755.getClass(), "numOfHWComponents", 0);
        setIntField(term14755, term14755.getClass(), "numOfLWComponents", 0);
        setField(term14755, term14755.getClass(), "modalComp", null);
        setField(term14755, term14755.getClass(), "modalAppContext", null);
        setIntField(term14755, term14755.getClass(), "containerSerializedDataVersion", 0);
        setField(term14755, term14755.getClass(), "peer", null);
        setField(term14755, term14755.getClass(), "parent", null);
        setField(term14755, term14755.getClass(), "appContext", null);
        setIntField(term14755, term14755.getClass(), "x", 0);
        setIntField(term14755, term14755.getClass(), "y", 0);
        setIntField(term14755, term14755.getClass(), "width", 0);
        setIntField(term14755, term14755.getClass(), "height", 0);
        setField(term14755, term14755.getClass(), "foreground", null);
        setField(term14755, term14755.getClass(), "background", null);
        setField(term14755, term14755.getClass(), "font", null);
        setField(term14755, term14755.getClass(), "peerFont", null);
        setField(term14755, term14755.getClass(), "cursor", null);
        setField(term14755, term14755.getClass(), "locale", null);
        setField(term14755, term14755.getClass(), "graphicsConfig", null);
        setField(term14755, term14755.getClass(), "bufferStrategy", null);
        setBooleanField(term14755, term14755.getClass(), "ignoreRepaint", false);
        setBooleanField(term14755, term14755.getClass(), "visible", false);
        setBooleanField(term14755, term14755.getClass(), "enabled", false);
        setBooleanField(term14755, term14755.getClass(), "valid", false);
        setField(term14755, term14755.getClass(), "dropTarget", null);
        setField(term14755, term14755.getClass(), "popups", null);
        setField(term14755, term14755.getClass(), "name", null);
        setBooleanField(term14755, term14755.getClass(), "nameExplicitlySet", false);
        setBooleanField(term14755, term14755.getClass(), "focusable", false);
        setIntField(term14755, term14755.getClass(), "isFocusTraversableOverridden", 0);
        setField(term14755, term14755.getClass(), "focusTraversalKeys", null);
        setBooleanField(term14755, term14755.getClass(), "focusTraversalKeysEnabled", false);
        setField(term14755, term14755.getClass(), "acc", null);
        setField(term14755, term14755.getClass(), "minSize", null);
        setBooleanField(term14755, term14755.getClass(), "minSizeSet", false);
        setField(term14755, term14755.getClass(), "prefSize", null);
        setBooleanField(term14755, term14755.getClass(), "prefSizeSet", false);
        setField(term14755, term14755.getClass(), "maxSize", null);
        setBooleanField(term14755, term14755.getClass(), "maxSizeSet", false);
        setField(term14755, term14755.getClass(), "componentOrientation", null);
        setBooleanField(term14755, term14755.getClass(), "newEventsOnly", false);
        setField(term14755, term14755.getClass(), "componentListener", null);
        setField(term14755, term14755.getClass(), "focusListener", null);
        setField(term14755, term14755.getClass(), "hierarchyListener", null);
        setField(term14755, term14755.getClass(), "hierarchyBoundsListener", null);
        setField(term14755, term14755.getClass(), "keyListener", null);
        setField(term14755, term14755.getClass(), "mouseListener", null);
        setField(term14755, term14755.getClass(), "mouseMotionListener", null);
        setField(term14755, term14755.getClass(), "mouseWheelListener", null);
        setField(term14755, term14755.getClass(), "inputMethodListener", null);
        setLongField(term14755, term14755.getClass(), "eventMask", 0L);
        setField(term14755, term14755.getClass(), "changeSupport", null);
        setField(term14755, term14755.getClass(), "objectLock", null);
        setBooleanField(term14755, term14755.getClass(), "isPacked", false);
        setIntField(term14755, term14755.getClass(), "boundsOp", 0);
        setField(term14755, term14755.getClass(), "compoundShape", null);
        setField(term14755, term14755.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term14755, term14755.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term14755, term14755.getClass(), "backgroundEraseDisabled", false);
        setField(term14755, term14755.getClass(), "eventCache", null);
        setBooleanField(term14755, term14755.getClass(), "coalescingEnabled", false);
        setBooleanField(term14755, term14755.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term14755, term14755.getClass(), "componentSerializedDataVersion", 0);
        setField(term14755, term14755.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitGroupPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitle", argTypes, term14755, args);
    }

};


