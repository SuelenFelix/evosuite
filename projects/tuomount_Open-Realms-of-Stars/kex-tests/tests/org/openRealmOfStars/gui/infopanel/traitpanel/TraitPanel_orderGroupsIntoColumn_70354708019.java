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

public class TraitPanel_orderGroupsIntoColumn_70354708019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11003;

    public TraitPanel_orderGroupsIntoColumn_70354708019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11003 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitPanel"));
        setField(term11003, term11003.getClass(), "traitValue", null);
        setField(term11003, term11003.getClass(), "groups", null);
        setField(term11003, term11003.getClass(), "checkBoxes", null);
        setField(term11003, term11003.getClass(), "columns", null);
        setIntField(term11003, term11003.getClass(), "maxColumns", 0);
        setIntField(term11003, term11003.getClass(), "currentColumn", 0);
        setIntField(term11003, term11003.getClass(), "screenWidth", 0);
        setField(term11003, term11003.getClass(), "border", null);
        setBooleanField(term11003, term11003.getClass(), "isAlignmentXSet", false);
        setFloatField(term11003, term11003.getClass(), "alignmentX", 0.0F);
        setBooleanField(term11003, term11003.getClass(), "isAlignmentYSet", false);
        setFloatField(term11003, term11003.getClass(), "alignmentY", 0.0F);
        setField(term11003, term11003.getClass(), "ui", null);
        setField(term11003, term11003.getClass(), "listenerList", null);
        setField(term11003, term11003.getClass(), "clientProperties", null);
        setField(term11003, term11003.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term11003, term11003.getClass(), "autoscrolls", false);
        setField(term11003, term11003.getClass(), "border", null);
        setIntField(term11003, term11003.getClass(), "flags", 0);
        setField(term11003, term11003.getClass(), "inputVerifier", null);
        setBooleanField(term11003, term11003.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term11003, term11003.getClass(), "paintingChild", null);
        setField(term11003, term11003.getClass(), "popupMenu", null);
        setField(term11003, term11003.getClass(), "revalidateRunnableScheduled", null);
        setField(term11003, term11003.getClass(), "focusInputMap", null);
        setField(term11003, term11003.getClass(), "ancestorInputMap", null);
        setField(term11003, term11003.getClass(), "windowInputMap", null);
        setField(term11003, term11003.getClass(), "actionMap", null);
        setField(term11003, term11003.getClass(), "aaHint", null);
        setField(term11003, term11003.getClass(), "lcdRenderingHint", null);
        setField(term11003, term11003.getClass(), "component", null);
        setField(term11003, term11003.getClass(), "layoutMgr", null);
        setField(term11003, term11003.getClass(), "dispatcher", null);
        setField(term11003, term11003.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term11003, term11003.getClass(), "focusCycleRoot", false);
        setBooleanField(term11003, term11003.getClass(), "focusTraversalPolicyProvider", false);
        setField(term11003, term11003.getClass(), "printingThreads", null);
        setBooleanField(term11003, term11003.getClass(), "printing", false);
        setField(term11003, term11003.getClass(), "containerListener", null);
        setIntField(term11003, term11003.getClass(), "listeningChildren", 0);
        setIntField(term11003, term11003.getClass(), "listeningBoundsChildren", 0);
        setIntField(term11003, term11003.getClass(), "descendantsCount", 0);
        setField(term11003, term11003.getClass(), "preserveBackgroundColor", null);
        setIntField(term11003, term11003.getClass(), "numOfHWComponents", 0);
        setIntField(term11003, term11003.getClass(), "numOfLWComponents", 0);
        setField(term11003, term11003.getClass(), "modalComp", null);
        setField(term11003, term11003.getClass(), "modalAppContext", null);
        setIntField(term11003, term11003.getClass(), "containerSerializedDataVersion", 0);
        setField(term11003, term11003.getClass(), "peer", null);
        setField(term11003, term11003.getClass(), "parent", null);
        setField(term11003, term11003.getClass(), "appContext", null);
        setIntField(term11003, term11003.getClass(), "x", 0);
        setIntField(term11003, term11003.getClass(), "y", 0);
        setIntField(term11003, term11003.getClass(), "width", 0);
        setIntField(term11003, term11003.getClass(), "height", 0);
        setField(term11003, term11003.getClass(), "foreground", null);
        setField(term11003, term11003.getClass(), "background", null);
        setField(term11003, term11003.getClass(), "font", null);
        setField(term11003, term11003.getClass(), "peerFont", null);
        setField(term11003, term11003.getClass(), "cursor", null);
        setField(term11003, term11003.getClass(), "locale", null);
        setField(term11003, term11003.getClass(), "graphicsConfig", null);
        setField(term11003, term11003.getClass(), "bufferStrategy", null);
        setBooleanField(term11003, term11003.getClass(), "ignoreRepaint", false);
        setBooleanField(term11003, term11003.getClass(), "visible", false);
        setBooleanField(term11003, term11003.getClass(), "enabled", false);
        setBooleanField(term11003, term11003.getClass(), "valid", false);
        setField(term11003, term11003.getClass(), "dropTarget", null);
        setField(term11003, term11003.getClass(), "popups", null);
        setField(term11003, term11003.getClass(), "name", null);
        setBooleanField(term11003, term11003.getClass(), "nameExplicitlySet", false);
        setBooleanField(term11003, term11003.getClass(), "focusable", false);
        setIntField(term11003, term11003.getClass(), "isFocusTraversableOverridden", 0);
        setField(term11003, term11003.getClass(), "focusTraversalKeys", null);
        setBooleanField(term11003, term11003.getClass(), "focusTraversalKeysEnabled", false);
        setField(term11003, term11003.getClass(), "acc", null);
        setField(term11003, term11003.getClass(), "minSize", null);
        setBooleanField(term11003, term11003.getClass(), "minSizeSet", false);
        setField(term11003, term11003.getClass(), "prefSize", null);
        setBooleanField(term11003, term11003.getClass(), "prefSizeSet", false);
        setField(term11003, term11003.getClass(), "maxSize", null);
        setBooleanField(term11003, term11003.getClass(), "maxSizeSet", false);
        setField(term11003, term11003.getClass(), "componentOrientation", null);
        setBooleanField(term11003, term11003.getClass(), "newEventsOnly", false);
        setField(term11003, term11003.getClass(), "componentListener", null);
        setField(term11003, term11003.getClass(), "focusListener", null);
        setField(term11003, term11003.getClass(), "hierarchyListener", null);
        setField(term11003, term11003.getClass(), "hierarchyBoundsListener", null);
        setField(term11003, term11003.getClass(), "keyListener", null);
        setField(term11003, term11003.getClass(), "mouseListener", null);
        setField(term11003, term11003.getClass(), "mouseMotionListener", null);
        setField(term11003, term11003.getClass(), "mouseWheelListener", null);
        setField(term11003, term11003.getClass(), "inputMethodListener", null);
        setLongField(term11003, term11003.getClass(), "eventMask", 0L);
        setField(term11003, term11003.getClass(), "changeSupport", null);
        setField(term11003, term11003.getClass(), "objectLock", null);
        setBooleanField(term11003, term11003.getClass(), "isPacked", false);
        setIntField(term11003, term11003.getClass(), "boundsOp", 0);
        setField(term11003, term11003.getClass(), "compoundShape", null);
        setField(term11003, term11003.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term11003, term11003.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term11003, term11003.getClass(), "backgroundEraseDisabled", false);
        setField(term11003, term11003.getClass(), "eventCache", null);
        setBooleanField(term11003, term11003.getClass(), "coalescingEnabled", false);
        setBooleanField(term11003, term11003.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term11003, term11003.getClass(), "componentSerializedDataVersion", 0);
        setField(term11003, term11003.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "orderGroupsIntoColumn", argTypes, term11003, args);
    }

};


