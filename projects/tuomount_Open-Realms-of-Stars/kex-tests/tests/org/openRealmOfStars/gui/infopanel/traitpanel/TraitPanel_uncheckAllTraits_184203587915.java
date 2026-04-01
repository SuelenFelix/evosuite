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

public class TraitPanel_uncheckAllTraits_184203587915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10827;

    public TraitPanel_uncheckAllTraits_184203587915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10827 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitPanel"));
        setField(term10827, term10827.getClass(), "traitValue", null);
        setField(term10827, term10827.getClass(), "groups", null);
        setField(term10827, term10827.getClass(), "checkBoxes", null);
        setField(term10827, term10827.getClass(), "columns", null);
        setIntField(term10827, term10827.getClass(), "maxColumns", 0);
        setIntField(term10827, term10827.getClass(), "currentColumn", 0);
        setIntField(term10827, term10827.getClass(), "screenWidth", 0);
        setField(term10827, term10827.getClass(), "border", null);
        setBooleanField(term10827, term10827.getClass(), "isAlignmentXSet", false);
        setFloatField(term10827, term10827.getClass(), "alignmentX", 0.0F);
        setBooleanField(term10827, term10827.getClass(), "isAlignmentYSet", false);
        setFloatField(term10827, term10827.getClass(), "alignmentY", 0.0F);
        setField(term10827, term10827.getClass(), "ui", null);
        setField(term10827, term10827.getClass(), "listenerList", null);
        setField(term10827, term10827.getClass(), "clientProperties", null);
        setField(term10827, term10827.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term10827, term10827.getClass(), "autoscrolls", false);
        setField(term10827, term10827.getClass(), "border", null);
        setIntField(term10827, term10827.getClass(), "flags", 0);
        setField(term10827, term10827.getClass(), "inputVerifier", null);
        setBooleanField(term10827, term10827.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term10827, term10827.getClass(), "paintingChild", null);
        setField(term10827, term10827.getClass(), "popupMenu", null);
        setField(term10827, term10827.getClass(), "revalidateRunnableScheduled", null);
        setField(term10827, term10827.getClass(), "focusInputMap", null);
        setField(term10827, term10827.getClass(), "ancestorInputMap", null);
        setField(term10827, term10827.getClass(), "windowInputMap", null);
        setField(term10827, term10827.getClass(), "actionMap", null);
        setField(term10827, term10827.getClass(), "aaHint", null);
        setField(term10827, term10827.getClass(), "lcdRenderingHint", null);
        setField(term10827, term10827.getClass(), "component", null);
        setField(term10827, term10827.getClass(), "layoutMgr", null);
        setField(term10827, term10827.getClass(), "dispatcher", null);
        setField(term10827, term10827.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term10827, term10827.getClass(), "focusCycleRoot", false);
        setBooleanField(term10827, term10827.getClass(), "focusTraversalPolicyProvider", false);
        setField(term10827, term10827.getClass(), "printingThreads", null);
        setBooleanField(term10827, term10827.getClass(), "printing", false);
        setField(term10827, term10827.getClass(), "containerListener", null);
        setIntField(term10827, term10827.getClass(), "listeningChildren", 0);
        setIntField(term10827, term10827.getClass(), "listeningBoundsChildren", 0);
        setIntField(term10827, term10827.getClass(), "descendantsCount", 0);
        setField(term10827, term10827.getClass(), "preserveBackgroundColor", null);
        setIntField(term10827, term10827.getClass(), "numOfHWComponents", 0);
        setIntField(term10827, term10827.getClass(), "numOfLWComponents", 0);
        setField(term10827, term10827.getClass(), "modalComp", null);
        setField(term10827, term10827.getClass(), "modalAppContext", null);
        setIntField(term10827, term10827.getClass(), "containerSerializedDataVersion", 0);
        setField(term10827, term10827.getClass(), "peer", null);
        setField(term10827, term10827.getClass(), "parent", null);
        setField(term10827, term10827.getClass(), "appContext", null);
        setIntField(term10827, term10827.getClass(), "x", 0);
        setIntField(term10827, term10827.getClass(), "y", 0);
        setIntField(term10827, term10827.getClass(), "width", 0);
        setIntField(term10827, term10827.getClass(), "height", 0);
        setField(term10827, term10827.getClass(), "foreground", null);
        setField(term10827, term10827.getClass(), "background", null);
        setField(term10827, term10827.getClass(), "font", null);
        setField(term10827, term10827.getClass(), "peerFont", null);
        setField(term10827, term10827.getClass(), "cursor", null);
        setField(term10827, term10827.getClass(), "locale", null);
        setField(term10827, term10827.getClass(), "graphicsConfig", null);
        setField(term10827, term10827.getClass(), "bufferStrategy", null);
        setBooleanField(term10827, term10827.getClass(), "ignoreRepaint", false);
        setBooleanField(term10827, term10827.getClass(), "visible", false);
        setBooleanField(term10827, term10827.getClass(), "enabled", false);
        setBooleanField(term10827, term10827.getClass(), "valid", false);
        setField(term10827, term10827.getClass(), "dropTarget", null);
        setField(term10827, term10827.getClass(), "popups", null);
        setField(term10827, term10827.getClass(), "name", null);
        setBooleanField(term10827, term10827.getClass(), "nameExplicitlySet", false);
        setBooleanField(term10827, term10827.getClass(), "focusable", false);
        setIntField(term10827, term10827.getClass(), "isFocusTraversableOverridden", 0);
        setField(term10827, term10827.getClass(), "focusTraversalKeys", null);
        setBooleanField(term10827, term10827.getClass(), "focusTraversalKeysEnabled", false);
        setField(term10827, term10827.getClass(), "acc", null);
        setField(term10827, term10827.getClass(), "minSize", null);
        setBooleanField(term10827, term10827.getClass(), "minSizeSet", false);
        setField(term10827, term10827.getClass(), "prefSize", null);
        setBooleanField(term10827, term10827.getClass(), "prefSizeSet", false);
        setField(term10827, term10827.getClass(), "maxSize", null);
        setBooleanField(term10827, term10827.getClass(), "maxSizeSet", false);
        setField(term10827, term10827.getClass(), "componentOrientation", null);
        setBooleanField(term10827, term10827.getClass(), "newEventsOnly", false);
        setField(term10827, term10827.getClass(), "componentListener", null);
        setField(term10827, term10827.getClass(), "focusListener", null);
        setField(term10827, term10827.getClass(), "hierarchyListener", null);
        setField(term10827, term10827.getClass(), "hierarchyBoundsListener", null);
        setField(term10827, term10827.getClass(), "keyListener", null);
        setField(term10827, term10827.getClass(), "mouseListener", null);
        setField(term10827, term10827.getClass(), "mouseMotionListener", null);
        setField(term10827, term10827.getClass(), "mouseWheelListener", null);
        setField(term10827, term10827.getClass(), "inputMethodListener", null);
        setLongField(term10827, term10827.getClass(), "eventMask", 0L);
        setField(term10827, term10827.getClass(), "changeSupport", null);
        setField(term10827, term10827.getClass(), "objectLock", null);
        setBooleanField(term10827, term10827.getClass(), "isPacked", false);
        setIntField(term10827, term10827.getClass(), "boundsOp", 0);
        setField(term10827, term10827.getClass(), "compoundShape", null);
        setField(term10827, term10827.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term10827, term10827.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term10827, term10827.getClass(), "backgroundEraseDisabled", false);
        setField(term10827, term10827.getClass(), "eventCache", null);
        setBooleanField(term10827, term10827.getClass(), "coalescingEnabled", false);
        setBooleanField(term10827, term10827.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term10827, term10827.getClass(), "componentSerializedDataVersion", 0);
        setField(term10827, term10827.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "uncheckAllTraits", argTypes, term10827, args);
    }

};


