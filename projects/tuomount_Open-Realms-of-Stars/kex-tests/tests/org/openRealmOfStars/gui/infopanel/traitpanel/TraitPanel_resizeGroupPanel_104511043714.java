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

public class TraitPanel_resizeGroupPanel_104511043714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10783;

    public TraitPanel_resizeGroupPanel_104511043714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10783 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitPanel"));
        setField(term10783, term10783.getClass(), "traitValue", null);
        setField(term10783, term10783.getClass(), "groups", null);
        setField(term10783, term10783.getClass(), "checkBoxes", null);
        setField(term10783, term10783.getClass(), "columns", null);
        setIntField(term10783, term10783.getClass(), "maxColumns", 0);
        setIntField(term10783, term10783.getClass(), "currentColumn", 0);
        setIntField(term10783, term10783.getClass(), "screenWidth", 0);
        setField(term10783, term10783.getClass(), "border", null);
        setBooleanField(term10783, term10783.getClass(), "isAlignmentXSet", false);
        setFloatField(term10783, term10783.getClass(), "alignmentX", 0.0F);
        setBooleanField(term10783, term10783.getClass(), "isAlignmentYSet", false);
        setFloatField(term10783, term10783.getClass(), "alignmentY", 0.0F);
        setField(term10783, term10783.getClass(), "ui", null);
        setField(term10783, term10783.getClass(), "listenerList", null);
        setField(term10783, term10783.getClass(), "clientProperties", null);
        setField(term10783, term10783.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term10783, term10783.getClass(), "autoscrolls", false);
        setField(term10783, term10783.getClass(), "border", null);
        setIntField(term10783, term10783.getClass(), "flags", 0);
        setField(term10783, term10783.getClass(), "inputVerifier", null);
        setBooleanField(term10783, term10783.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term10783, term10783.getClass(), "paintingChild", null);
        setField(term10783, term10783.getClass(), "popupMenu", null);
        setField(term10783, term10783.getClass(), "revalidateRunnableScheduled", null);
        setField(term10783, term10783.getClass(), "focusInputMap", null);
        setField(term10783, term10783.getClass(), "ancestorInputMap", null);
        setField(term10783, term10783.getClass(), "windowInputMap", null);
        setField(term10783, term10783.getClass(), "actionMap", null);
        setField(term10783, term10783.getClass(), "aaHint", null);
        setField(term10783, term10783.getClass(), "lcdRenderingHint", null);
        setField(term10783, term10783.getClass(), "component", null);
        setField(term10783, term10783.getClass(), "layoutMgr", null);
        setField(term10783, term10783.getClass(), "dispatcher", null);
        setField(term10783, term10783.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term10783, term10783.getClass(), "focusCycleRoot", false);
        setBooleanField(term10783, term10783.getClass(), "focusTraversalPolicyProvider", false);
        setField(term10783, term10783.getClass(), "printingThreads", null);
        setBooleanField(term10783, term10783.getClass(), "printing", false);
        setField(term10783, term10783.getClass(), "containerListener", null);
        setIntField(term10783, term10783.getClass(), "listeningChildren", 0);
        setIntField(term10783, term10783.getClass(), "listeningBoundsChildren", 0);
        setIntField(term10783, term10783.getClass(), "descendantsCount", 0);
        setField(term10783, term10783.getClass(), "preserveBackgroundColor", null);
        setIntField(term10783, term10783.getClass(), "numOfHWComponents", 0);
        setIntField(term10783, term10783.getClass(), "numOfLWComponents", 0);
        setField(term10783, term10783.getClass(), "modalComp", null);
        setField(term10783, term10783.getClass(), "modalAppContext", null);
        setIntField(term10783, term10783.getClass(), "containerSerializedDataVersion", 0);
        setField(term10783, term10783.getClass(), "peer", null);
        setField(term10783, term10783.getClass(), "parent", null);
        setField(term10783, term10783.getClass(), "appContext", null);
        setIntField(term10783, term10783.getClass(), "x", 0);
        setIntField(term10783, term10783.getClass(), "y", 0);
        setIntField(term10783, term10783.getClass(), "width", 0);
        setIntField(term10783, term10783.getClass(), "height", 0);
        setField(term10783, term10783.getClass(), "foreground", null);
        setField(term10783, term10783.getClass(), "background", null);
        setField(term10783, term10783.getClass(), "font", null);
        setField(term10783, term10783.getClass(), "peerFont", null);
        setField(term10783, term10783.getClass(), "cursor", null);
        setField(term10783, term10783.getClass(), "locale", null);
        setField(term10783, term10783.getClass(), "graphicsConfig", null);
        setField(term10783, term10783.getClass(), "bufferStrategy", null);
        setBooleanField(term10783, term10783.getClass(), "ignoreRepaint", false);
        setBooleanField(term10783, term10783.getClass(), "visible", false);
        setBooleanField(term10783, term10783.getClass(), "enabled", false);
        setBooleanField(term10783, term10783.getClass(), "valid", false);
        setField(term10783, term10783.getClass(), "dropTarget", null);
        setField(term10783, term10783.getClass(), "popups", null);
        setField(term10783, term10783.getClass(), "name", null);
        setBooleanField(term10783, term10783.getClass(), "nameExplicitlySet", false);
        setBooleanField(term10783, term10783.getClass(), "focusable", false);
        setIntField(term10783, term10783.getClass(), "isFocusTraversableOverridden", 0);
        setField(term10783, term10783.getClass(), "focusTraversalKeys", null);
        setBooleanField(term10783, term10783.getClass(), "focusTraversalKeysEnabled", false);
        setField(term10783, term10783.getClass(), "acc", null);
        setField(term10783, term10783.getClass(), "minSize", null);
        setBooleanField(term10783, term10783.getClass(), "minSizeSet", false);
        setField(term10783, term10783.getClass(), "prefSize", null);
        setBooleanField(term10783, term10783.getClass(), "prefSizeSet", false);
        setField(term10783, term10783.getClass(), "maxSize", null);
        setBooleanField(term10783, term10783.getClass(), "maxSizeSet", false);
        setField(term10783, term10783.getClass(), "componentOrientation", null);
        setBooleanField(term10783, term10783.getClass(), "newEventsOnly", false);
        setField(term10783, term10783.getClass(), "componentListener", null);
        setField(term10783, term10783.getClass(), "focusListener", null);
        setField(term10783, term10783.getClass(), "hierarchyListener", null);
        setField(term10783, term10783.getClass(), "hierarchyBoundsListener", null);
        setField(term10783, term10783.getClass(), "keyListener", null);
        setField(term10783, term10783.getClass(), "mouseListener", null);
        setField(term10783, term10783.getClass(), "mouseMotionListener", null);
        setField(term10783, term10783.getClass(), "mouseWheelListener", null);
        setField(term10783, term10783.getClass(), "inputMethodListener", null);
        setLongField(term10783, term10783.getClass(), "eventMask", 0L);
        setField(term10783, term10783.getClass(), "changeSupport", null);
        setField(term10783, term10783.getClass(), "objectLock", null);
        setBooleanField(term10783, term10783.getClass(), "isPacked", false);
        setIntField(term10783, term10783.getClass(), "boundsOp", 0);
        setField(term10783, term10783.getClass(), "compoundShape", null);
        setField(term10783, term10783.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term10783, term10783.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term10783, term10783.getClass(), "backgroundEraseDisabled", false);
        setField(term10783, term10783.getClass(), "eventCache", null);
        setBooleanField(term10783, term10783.getClass(), "coalescingEnabled", false);
        setBooleanField(term10783, term10783.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term10783, term10783.getClass(), "componentSerializedDataVersion", 0);
        setField(term10783, term10783.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitGroupPanel");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "resizeGroupPanel", argTypes, term10783, args);
    }

};


