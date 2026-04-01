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

public class TraitPanel_moveToNextColumn_77095443721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11091;

    public TraitPanel_moveToNextColumn_77095443721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11091 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitPanel"));
        setField(term11091, term11091.getClass(), "traitValue", null);
        setField(term11091, term11091.getClass(), "groups", null);
        setField(term11091, term11091.getClass(), "checkBoxes", null);
        setField(term11091, term11091.getClass(), "columns", null);
        setIntField(term11091, term11091.getClass(), "maxColumns", 0);
        setIntField(term11091, term11091.getClass(), "currentColumn", 0);
        setIntField(term11091, term11091.getClass(), "screenWidth", 0);
        setField(term11091, term11091.getClass(), "border", null);
        setBooleanField(term11091, term11091.getClass(), "isAlignmentXSet", false);
        setFloatField(term11091, term11091.getClass(), "alignmentX", 0.0F);
        setBooleanField(term11091, term11091.getClass(), "isAlignmentYSet", false);
        setFloatField(term11091, term11091.getClass(), "alignmentY", 0.0F);
        setField(term11091, term11091.getClass(), "ui", null);
        setField(term11091, term11091.getClass(), "listenerList", null);
        setField(term11091, term11091.getClass(), "clientProperties", null);
        setField(term11091, term11091.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term11091, term11091.getClass(), "autoscrolls", false);
        setField(term11091, term11091.getClass(), "border", null);
        setIntField(term11091, term11091.getClass(), "flags", 0);
        setField(term11091, term11091.getClass(), "inputVerifier", null);
        setBooleanField(term11091, term11091.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term11091, term11091.getClass(), "paintingChild", null);
        setField(term11091, term11091.getClass(), "popupMenu", null);
        setField(term11091, term11091.getClass(), "revalidateRunnableScheduled", null);
        setField(term11091, term11091.getClass(), "focusInputMap", null);
        setField(term11091, term11091.getClass(), "ancestorInputMap", null);
        setField(term11091, term11091.getClass(), "windowInputMap", null);
        setField(term11091, term11091.getClass(), "actionMap", null);
        setField(term11091, term11091.getClass(), "aaHint", null);
        setField(term11091, term11091.getClass(), "lcdRenderingHint", null);
        setField(term11091, term11091.getClass(), "component", null);
        setField(term11091, term11091.getClass(), "layoutMgr", null);
        setField(term11091, term11091.getClass(), "dispatcher", null);
        setField(term11091, term11091.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term11091, term11091.getClass(), "focusCycleRoot", false);
        setBooleanField(term11091, term11091.getClass(), "focusTraversalPolicyProvider", false);
        setField(term11091, term11091.getClass(), "printingThreads", null);
        setBooleanField(term11091, term11091.getClass(), "printing", false);
        setField(term11091, term11091.getClass(), "containerListener", null);
        setIntField(term11091, term11091.getClass(), "listeningChildren", 0);
        setIntField(term11091, term11091.getClass(), "listeningBoundsChildren", 0);
        setIntField(term11091, term11091.getClass(), "descendantsCount", 0);
        setField(term11091, term11091.getClass(), "preserveBackgroundColor", null);
        setIntField(term11091, term11091.getClass(), "numOfHWComponents", 0);
        setIntField(term11091, term11091.getClass(), "numOfLWComponents", 0);
        setField(term11091, term11091.getClass(), "modalComp", null);
        setField(term11091, term11091.getClass(), "modalAppContext", null);
        setIntField(term11091, term11091.getClass(), "containerSerializedDataVersion", 0);
        setField(term11091, term11091.getClass(), "peer", null);
        setField(term11091, term11091.getClass(), "parent", null);
        setField(term11091, term11091.getClass(), "appContext", null);
        setIntField(term11091, term11091.getClass(), "x", 0);
        setIntField(term11091, term11091.getClass(), "y", 0);
        setIntField(term11091, term11091.getClass(), "width", 0);
        setIntField(term11091, term11091.getClass(), "height", 0);
        setField(term11091, term11091.getClass(), "foreground", null);
        setField(term11091, term11091.getClass(), "background", null);
        setField(term11091, term11091.getClass(), "font", null);
        setField(term11091, term11091.getClass(), "peerFont", null);
        setField(term11091, term11091.getClass(), "cursor", null);
        setField(term11091, term11091.getClass(), "locale", null);
        setField(term11091, term11091.getClass(), "graphicsConfig", null);
        setField(term11091, term11091.getClass(), "bufferStrategy", null);
        setBooleanField(term11091, term11091.getClass(), "ignoreRepaint", false);
        setBooleanField(term11091, term11091.getClass(), "visible", false);
        setBooleanField(term11091, term11091.getClass(), "enabled", false);
        setBooleanField(term11091, term11091.getClass(), "valid", false);
        setField(term11091, term11091.getClass(), "dropTarget", null);
        setField(term11091, term11091.getClass(), "popups", null);
        setField(term11091, term11091.getClass(), "name", null);
        setBooleanField(term11091, term11091.getClass(), "nameExplicitlySet", false);
        setBooleanField(term11091, term11091.getClass(), "focusable", false);
        setIntField(term11091, term11091.getClass(), "isFocusTraversableOverridden", 0);
        setField(term11091, term11091.getClass(), "focusTraversalKeys", null);
        setBooleanField(term11091, term11091.getClass(), "focusTraversalKeysEnabled", false);
        setField(term11091, term11091.getClass(), "acc", null);
        setField(term11091, term11091.getClass(), "minSize", null);
        setBooleanField(term11091, term11091.getClass(), "minSizeSet", false);
        setField(term11091, term11091.getClass(), "prefSize", null);
        setBooleanField(term11091, term11091.getClass(), "prefSizeSet", false);
        setField(term11091, term11091.getClass(), "maxSize", null);
        setBooleanField(term11091, term11091.getClass(), "maxSizeSet", false);
        setField(term11091, term11091.getClass(), "componentOrientation", null);
        setBooleanField(term11091, term11091.getClass(), "newEventsOnly", false);
        setField(term11091, term11091.getClass(), "componentListener", null);
        setField(term11091, term11091.getClass(), "focusListener", null);
        setField(term11091, term11091.getClass(), "hierarchyListener", null);
        setField(term11091, term11091.getClass(), "hierarchyBoundsListener", null);
        setField(term11091, term11091.getClass(), "keyListener", null);
        setField(term11091, term11091.getClass(), "mouseListener", null);
        setField(term11091, term11091.getClass(), "mouseMotionListener", null);
        setField(term11091, term11091.getClass(), "mouseWheelListener", null);
        setField(term11091, term11091.getClass(), "inputMethodListener", null);
        setLongField(term11091, term11091.getClass(), "eventMask", 0L);
        setField(term11091, term11091.getClass(), "changeSupport", null);
        setField(term11091, term11091.getClass(), "objectLock", null);
        setBooleanField(term11091, term11091.getClass(), "isPacked", false);
        setIntField(term11091, term11091.getClass(), "boundsOp", 0);
        setField(term11091, term11091.getClass(), "compoundShape", null);
        setField(term11091, term11091.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term11091, term11091.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term11091, term11091.getClass(), "backgroundEraseDisabled", false);
        setField(term11091, term11091.getClass(), "eventCache", null);
        setBooleanField(term11091, term11091.getClass(), "coalescingEnabled", false);
        setBooleanField(term11091, term11091.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term11091, term11091.getClass(), "componentSerializedDataVersion", 0);
        setField(term11091, term11091.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "moveToNextColumn", argTypes, term11091, args);
    }

};


