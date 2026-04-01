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

public class TraitPanel_getOrCreateGroup_155943791122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11135;

    public TraitPanel_getOrCreateGroup_155943791122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11135 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitPanel"));
        setField(term11135, term11135.getClass(), "traitValue", null);
        setField(term11135, term11135.getClass(), "groups", null);
        setField(term11135, term11135.getClass(), "checkBoxes", null);
        setField(term11135, term11135.getClass(), "columns", null);
        setIntField(term11135, term11135.getClass(), "maxColumns", 0);
        setIntField(term11135, term11135.getClass(), "currentColumn", 0);
        setIntField(term11135, term11135.getClass(), "screenWidth", 0);
        setField(term11135, term11135.getClass(), "border", null);
        setBooleanField(term11135, term11135.getClass(), "isAlignmentXSet", false);
        setFloatField(term11135, term11135.getClass(), "alignmentX", 0.0F);
        setBooleanField(term11135, term11135.getClass(), "isAlignmentYSet", false);
        setFloatField(term11135, term11135.getClass(), "alignmentY", 0.0F);
        setField(term11135, term11135.getClass(), "ui", null);
        setField(term11135, term11135.getClass(), "listenerList", null);
        setField(term11135, term11135.getClass(), "clientProperties", null);
        setField(term11135, term11135.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term11135, term11135.getClass(), "autoscrolls", false);
        setField(term11135, term11135.getClass(), "border", null);
        setIntField(term11135, term11135.getClass(), "flags", 0);
        setField(term11135, term11135.getClass(), "inputVerifier", null);
        setBooleanField(term11135, term11135.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term11135, term11135.getClass(), "paintingChild", null);
        setField(term11135, term11135.getClass(), "popupMenu", null);
        setField(term11135, term11135.getClass(), "revalidateRunnableScheduled", null);
        setField(term11135, term11135.getClass(), "focusInputMap", null);
        setField(term11135, term11135.getClass(), "ancestorInputMap", null);
        setField(term11135, term11135.getClass(), "windowInputMap", null);
        setField(term11135, term11135.getClass(), "actionMap", null);
        setField(term11135, term11135.getClass(), "aaHint", null);
        setField(term11135, term11135.getClass(), "lcdRenderingHint", null);
        setField(term11135, term11135.getClass(), "component", null);
        setField(term11135, term11135.getClass(), "layoutMgr", null);
        setField(term11135, term11135.getClass(), "dispatcher", null);
        setField(term11135, term11135.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term11135, term11135.getClass(), "focusCycleRoot", false);
        setBooleanField(term11135, term11135.getClass(), "focusTraversalPolicyProvider", false);
        setField(term11135, term11135.getClass(), "printingThreads", null);
        setBooleanField(term11135, term11135.getClass(), "printing", false);
        setField(term11135, term11135.getClass(), "containerListener", null);
        setIntField(term11135, term11135.getClass(), "listeningChildren", 0);
        setIntField(term11135, term11135.getClass(), "listeningBoundsChildren", 0);
        setIntField(term11135, term11135.getClass(), "descendantsCount", 0);
        setField(term11135, term11135.getClass(), "preserveBackgroundColor", null);
        setIntField(term11135, term11135.getClass(), "numOfHWComponents", 0);
        setIntField(term11135, term11135.getClass(), "numOfLWComponents", 0);
        setField(term11135, term11135.getClass(), "modalComp", null);
        setField(term11135, term11135.getClass(), "modalAppContext", null);
        setIntField(term11135, term11135.getClass(), "containerSerializedDataVersion", 0);
        setField(term11135, term11135.getClass(), "peer", null);
        setField(term11135, term11135.getClass(), "parent", null);
        setField(term11135, term11135.getClass(), "appContext", null);
        setIntField(term11135, term11135.getClass(), "x", 0);
        setIntField(term11135, term11135.getClass(), "y", 0);
        setIntField(term11135, term11135.getClass(), "width", 0);
        setIntField(term11135, term11135.getClass(), "height", 0);
        setField(term11135, term11135.getClass(), "foreground", null);
        setField(term11135, term11135.getClass(), "background", null);
        setField(term11135, term11135.getClass(), "font", null);
        setField(term11135, term11135.getClass(), "peerFont", null);
        setField(term11135, term11135.getClass(), "cursor", null);
        setField(term11135, term11135.getClass(), "locale", null);
        setField(term11135, term11135.getClass(), "graphicsConfig", null);
        setField(term11135, term11135.getClass(), "bufferStrategy", null);
        setBooleanField(term11135, term11135.getClass(), "ignoreRepaint", false);
        setBooleanField(term11135, term11135.getClass(), "visible", false);
        setBooleanField(term11135, term11135.getClass(), "enabled", false);
        setBooleanField(term11135, term11135.getClass(), "valid", false);
        setField(term11135, term11135.getClass(), "dropTarget", null);
        setField(term11135, term11135.getClass(), "popups", null);
        setField(term11135, term11135.getClass(), "name", null);
        setBooleanField(term11135, term11135.getClass(), "nameExplicitlySet", false);
        setBooleanField(term11135, term11135.getClass(), "focusable", false);
        setIntField(term11135, term11135.getClass(), "isFocusTraversableOverridden", 0);
        setField(term11135, term11135.getClass(), "focusTraversalKeys", null);
        setBooleanField(term11135, term11135.getClass(), "focusTraversalKeysEnabled", false);
        setField(term11135, term11135.getClass(), "acc", null);
        setField(term11135, term11135.getClass(), "minSize", null);
        setBooleanField(term11135, term11135.getClass(), "minSizeSet", false);
        setField(term11135, term11135.getClass(), "prefSize", null);
        setBooleanField(term11135, term11135.getClass(), "prefSizeSet", false);
        setField(term11135, term11135.getClass(), "maxSize", null);
        setBooleanField(term11135, term11135.getClass(), "maxSizeSet", false);
        setField(term11135, term11135.getClass(), "componentOrientation", null);
        setBooleanField(term11135, term11135.getClass(), "newEventsOnly", false);
        setField(term11135, term11135.getClass(), "componentListener", null);
        setField(term11135, term11135.getClass(), "focusListener", null);
        setField(term11135, term11135.getClass(), "hierarchyListener", null);
        setField(term11135, term11135.getClass(), "hierarchyBoundsListener", null);
        setField(term11135, term11135.getClass(), "keyListener", null);
        setField(term11135, term11135.getClass(), "mouseListener", null);
        setField(term11135, term11135.getClass(), "mouseMotionListener", null);
        setField(term11135, term11135.getClass(), "mouseWheelListener", null);
        setField(term11135, term11135.getClass(), "inputMethodListener", null);
        setLongField(term11135, term11135.getClass(), "eventMask", 0L);
        setField(term11135, term11135.getClass(), "changeSupport", null);
        setField(term11135, term11135.getClass(), "objectLock", null);
        setBooleanField(term11135, term11135.getClass(), "isPacked", false);
        setIntField(term11135, term11135.getClass(), "boundsOp", 0);
        setField(term11135, term11135.getClass(), "compoundShape", null);
        setField(term11135, term11135.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term11135, term11135.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term11135, term11135.getClass(), "backgroundEraseDisabled", false);
        setField(term11135, term11135.getClass(), "eventCache", null);
        setBooleanField(term11135, term11135.getClass(), "coalescingEnabled", false);
        setBooleanField(term11135, term11135.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term11135, term11135.getClass(), "componentSerializedDataVersion", 0);
        setField(term11135, term11135.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getOrCreateGroup", argTypes, term11135, args);
    }

};


