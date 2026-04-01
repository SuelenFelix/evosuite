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
import java.lang.Integer;

public class TraitGroupPanel_setBorderInsets_1121856177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14583;
     Object term14624;
     Object term14626;
     Object term14628;
     Object term14630;

    public TraitGroupPanel_setBorderInsets_1121856177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14583 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitGroupPanel"));
        setField(term14583, term14583.getClass(), "checkBoxes", null);
        setField(term14583, term14583.getClass(), "border", null);
        setField(term14583, term14583.getClass(), "internalPanel", null);
        setField(term14583, term14583.getClass(), "internalBorder", null);
        setBooleanField(term14583, term14583.getClass(), "isAlignmentXSet", false);
        setFloatField(term14583, term14583.getClass(), "alignmentX", 0.0F);
        setBooleanField(term14583, term14583.getClass(), "isAlignmentYSet", false);
        setFloatField(term14583, term14583.getClass(), "alignmentY", 0.0F);
        setField(term14583, term14583.getClass(), "ui", null);
        setField(term14583, term14583.getClass(), "listenerList", null);
        setField(term14583, term14583.getClass(), "clientProperties", null);
        setField(term14583, term14583.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term14583, term14583.getClass(), "autoscrolls", false);
        setField(term14583, term14583.getClass(), "border", null);
        setIntField(term14583, term14583.getClass(), "flags", 0);
        setField(term14583, term14583.getClass(), "inputVerifier", null);
        setBooleanField(term14583, term14583.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term14583, term14583.getClass(), "paintingChild", null);
        setField(term14583, term14583.getClass(), "popupMenu", null);
        setField(term14583, term14583.getClass(), "revalidateRunnableScheduled", null);
        setField(term14583, term14583.getClass(), "focusInputMap", null);
        setField(term14583, term14583.getClass(), "ancestorInputMap", null);
        setField(term14583, term14583.getClass(), "windowInputMap", null);
        setField(term14583, term14583.getClass(), "actionMap", null);
        setField(term14583, term14583.getClass(), "aaHint", null);
        setField(term14583, term14583.getClass(), "lcdRenderingHint", null);
        setField(term14583, term14583.getClass(), "component", null);
        setField(term14583, term14583.getClass(), "layoutMgr", null);
        setField(term14583, term14583.getClass(), "dispatcher", null);
        setField(term14583, term14583.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term14583, term14583.getClass(), "focusCycleRoot", false);
        setBooleanField(term14583, term14583.getClass(), "focusTraversalPolicyProvider", false);
        setField(term14583, term14583.getClass(), "printingThreads", null);
        setBooleanField(term14583, term14583.getClass(), "printing", false);
        setField(term14583, term14583.getClass(), "containerListener", null);
        setIntField(term14583, term14583.getClass(), "listeningChildren", 0);
        setIntField(term14583, term14583.getClass(), "listeningBoundsChildren", 0);
        setIntField(term14583, term14583.getClass(), "descendantsCount", 0);
        setField(term14583, term14583.getClass(), "preserveBackgroundColor", null);
        setIntField(term14583, term14583.getClass(), "numOfHWComponents", 0);
        setIntField(term14583, term14583.getClass(), "numOfLWComponents", 0);
        setField(term14583, term14583.getClass(), "modalComp", null);
        setField(term14583, term14583.getClass(), "modalAppContext", null);
        setIntField(term14583, term14583.getClass(), "containerSerializedDataVersion", 0);
        setField(term14583, term14583.getClass(), "peer", null);
        setField(term14583, term14583.getClass(), "parent", null);
        setField(term14583, term14583.getClass(), "appContext", null);
        setIntField(term14583, term14583.getClass(), "x", 0);
        setIntField(term14583, term14583.getClass(), "y", 0);
        setIntField(term14583, term14583.getClass(), "width", 0);
        setIntField(term14583, term14583.getClass(), "height", 0);
        setField(term14583, term14583.getClass(), "foreground", null);
        setField(term14583, term14583.getClass(), "background", null);
        setField(term14583, term14583.getClass(), "font", null);
        setField(term14583, term14583.getClass(), "peerFont", null);
        setField(term14583, term14583.getClass(), "cursor", null);
        setField(term14583, term14583.getClass(), "locale", null);
        setField(term14583, term14583.getClass(), "graphicsConfig", null);
        setField(term14583, term14583.getClass(), "bufferStrategy", null);
        setBooleanField(term14583, term14583.getClass(), "ignoreRepaint", false);
        setBooleanField(term14583, term14583.getClass(), "visible", false);
        setBooleanField(term14583, term14583.getClass(), "enabled", false);
        setBooleanField(term14583, term14583.getClass(), "valid", false);
        setField(term14583, term14583.getClass(), "dropTarget", null);
        setField(term14583, term14583.getClass(), "popups", null);
        setField(term14583, term14583.getClass(), "name", null);
        setBooleanField(term14583, term14583.getClass(), "nameExplicitlySet", false);
        setBooleanField(term14583, term14583.getClass(), "focusable", false);
        setIntField(term14583, term14583.getClass(), "isFocusTraversableOverridden", 0);
        setField(term14583, term14583.getClass(), "focusTraversalKeys", null);
        setBooleanField(term14583, term14583.getClass(), "focusTraversalKeysEnabled", false);
        setField(term14583, term14583.getClass(), "acc", null);
        setField(term14583, term14583.getClass(), "minSize", null);
        setBooleanField(term14583, term14583.getClass(), "minSizeSet", false);
        setField(term14583, term14583.getClass(), "prefSize", null);
        setBooleanField(term14583, term14583.getClass(), "prefSizeSet", false);
        setField(term14583, term14583.getClass(), "maxSize", null);
        setBooleanField(term14583, term14583.getClass(), "maxSizeSet", false);
        setField(term14583, term14583.getClass(), "componentOrientation", null);
        setBooleanField(term14583, term14583.getClass(), "newEventsOnly", false);
        setField(term14583, term14583.getClass(), "componentListener", null);
        setField(term14583, term14583.getClass(), "focusListener", null);
        setField(term14583, term14583.getClass(), "hierarchyListener", null);
        setField(term14583, term14583.getClass(), "hierarchyBoundsListener", null);
        setField(term14583, term14583.getClass(), "keyListener", null);
        setField(term14583, term14583.getClass(), "mouseListener", null);
        setField(term14583, term14583.getClass(), "mouseMotionListener", null);
        setField(term14583, term14583.getClass(), "mouseWheelListener", null);
        setField(term14583, term14583.getClass(), "inputMethodListener", null);
        setLongField(term14583, term14583.getClass(), "eventMask", 0L);
        setField(term14583, term14583.getClass(), "changeSupport", null);
        setField(term14583, term14583.getClass(), "objectLock", null);
        setBooleanField(term14583, term14583.getClass(), "isPacked", false);
        setIntField(term14583, term14583.getClass(), "boundsOp", 0);
        setField(term14583, term14583.getClass(), "compoundShape", null);
        setField(term14583, term14583.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term14583, term14583.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term14583, term14583.getClass(), "backgroundEraseDisabled", false);
        setField(term14583, term14583.getClass(), "eventCache", null);
        setBooleanField(term14583, term14583.getClass(), "coalescingEnabled", false);
        setBooleanField(term14583, term14583.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term14583, term14583.getClass(), "componentSerializedDataVersion", 0);
        setField(term14583, term14583.getClass(), "accessibleContext", null);
        term14624 = new Integer(0);
        term14626 = new Integer(0);
        term14628 = new Integer(0);
        term14630 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitGroupPanel");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term14624;
        args[1] = term14626;
        args[2] = term14628;
        args[3] = term14630;
        callMethod(klass, "setBorderInsets", argTypes, term14583, args);
    }

};


