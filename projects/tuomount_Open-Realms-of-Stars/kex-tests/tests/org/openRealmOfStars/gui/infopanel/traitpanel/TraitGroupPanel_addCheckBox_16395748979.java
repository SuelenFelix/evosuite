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

public class TraitGroupPanel_addCheckBox_16395748979 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14673;

    public TraitGroupPanel_addCheckBox_16395748979() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14673 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitGroupPanel"));
        setField(term14673, term14673.getClass(), "checkBoxes", null);
        setField(term14673, term14673.getClass(), "border", null);
        setField(term14673, term14673.getClass(), "internalPanel", null);
        setField(term14673, term14673.getClass(), "internalBorder", null);
        setBooleanField(term14673, term14673.getClass(), "isAlignmentXSet", false);
        setFloatField(term14673, term14673.getClass(), "alignmentX", 0.0F);
        setBooleanField(term14673, term14673.getClass(), "isAlignmentYSet", false);
        setFloatField(term14673, term14673.getClass(), "alignmentY", 0.0F);
        setField(term14673, term14673.getClass(), "ui", null);
        setField(term14673, term14673.getClass(), "listenerList", null);
        setField(term14673, term14673.getClass(), "clientProperties", null);
        setField(term14673, term14673.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term14673, term14673.getClass(), "autoscrolls", false);
        setField(term14673, term14673.getClass(), "border", null);
        setIntField(term14673, term14673.getClass(), "flags", 0);
        setField(term14673, term14673.getClass(), "inputVerifier", null);
        setBooleanField(term14673, term14673.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term14673, term14673.getClass(), "paintingChild", null);
        setField(term14673, term14673.getClass(), "popupMenu", null);
        setField(term14673, term14673.getClass(), "revalidateRunnableScheduled", null);
        setField(term14673, term14673.getClass(), "focusInputMap", null);
        setField(term14673, term14673.getClass(), "ancestorInputMap", null);
        setField(term14673, term14673.getClass(), "windowInputMap", null);
        setField(term14673, term14673.getClass(), "actionMap", null);
        setField(term14673, term14673.getClass(), "aaHint", null);
        setField(term14673, term14673.getClass(), "lcdRenderingHint", null);
        setField(term14673, term14673.getClass(), "component", null);
        setField(term14673, term14673.getClass(), "layoutMgr", null);
        setField(term14673, term14673.getClass(), "dispatcher", null);
        setField(term14673, term14673.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term14673, term14673.getClass(), "focusCycleRoot", false);
        setBooleanField(term14673, term14673.getClass(), "focusTraversalPolicyProvider", false);
        setField(term14673, term14673.getClass(), "printingThreads", null);
        setBooleanField(term14673, term14673.getClass(), "printing", false);
        setField(term14673, term14673.getClass(), "containerListener", null);
        setIntField(term14673, term14673.getClass(), "listeningChildren", 0);
        setIntField(term14673, term14673.getClass(), "listeningBoundsChildren", 0);
        setIntField(term14673, term14673.getClass(), "descendantsCount", 0);
        setField(term14673, term14673.getClass(), "preserveBackgroundColor", null);
        setIntField(term14673, term14673.getClass(), "numOfHWComponents", 0);
        setIntField(term14673, term14673.getClass(), "numOfLWComponents", 0);
        setField(term14673, term14673.getClass(), "modalComp", null);
        setField(term14673, term14673.getClass(), "modalAppContext", null);
        setIntField(term14673, term14673.getClass(), "containerSerializedDataVersion", 0);
        setField(term14673, term14673.getClass(), "peer", null);
        setField(term14673, term14673.getClass(), "parent", null);
        setField(term14673, term14673.getClass(), "appContext", null);
        setIntField(term14673, term14673.getClass(), "x", 0);
        setIntField(term14673, term14673.getClass(), "y", 0);
        setIntField(term14673, term14673.getClass(), "width", 0);
        setIntField(term14673, term14673.getClass(), "height", 0);
        setField(term14673, term14673.getClass(), "foreground", null);
        setField(term14673, term14673.getClass(), "background", null);
        setField(term14673, term14673.getClass(), "font", null);
        setField(term14673, term14673.getClass(), "peerFont", null);
        setField(term14673, term14673.getClass(), "cursor", null);
        setField(term14673, term14673.getClass(), "locale", null);
        setField(term14673, term14673.getClass(), "graphicsConfig", null);
        setField(term14673, term14673.getClass(), "bufferStrategy", null);
        setBooleanField(term14673, term14673.getClass(), "ignoreRepaint", false);
        setBooleanField(term14673, term14673.getClass(), "visible", false);
        setBooleanField(term14673, term14673.getClass(), "enabled", false);
        setBooleanField(term14673, term14673.getClass(), "valid", false);
        setField(term14673, term14673.getClass(), "dropTarget", null);
        setField(term14673, term14673.getClass(), "popups", null);
        setField(term14673, term14673.getClass(), "name", null);
        setBooleanField(term14673, term14673.getClass(), "nameExplicitlySet", false);
        setBooleanField(term14673, term14673.getClass(), "focusable", false);
        setIntField(term14673, term14673.getClass(), "isFocusTraversableOverridden", 0);
        setField(term14673, term14673.getClass(), "focusTraversalKeys", null);
        setBooleanField(term14673, term14673.getClass(), "focusTraversalKeysEnabled", false);
        setField(term14673, term14673.getClass(), "acc", null);
        setField(term14673, term14673.getClass(), "minSize", null);
        setBooleanField(term14673, term14673.getClass(), "minSizeSet", false);
        setField(term14673, term14673.getClass(), "prefSize", null);
        setBooleanField(term14673, term14673.getClass(), "prefSizeSet", false);
        setField(term14673, term14673.getClass(), "maxSize", null);
        setBooleanField(term14673, term14673.getClass(), "maxSizeSet", false);
        setField(term14673, term14673.getClass(), "componentOrientation", null);
        setBooleanField(term14673, term14673.getClass(), "newEventsOnly", false);
        setField(term14673, term14673.getClass(), "componentListener", null);
        setField(term14673, term14673.getClass(), "focusListener", null);
        setField(term14673, term14673.getClass(), "hierarchyListener", null);
        setField(term14673, term14673.getClass(), "hierarchyBoundsListener", null);
        setField(term14673, term14673.getClass(), "keyListener", null);
        setField(term14673, term14673.getClass(), "mouseListener", null);
        setField(term14673, term14673.getClass(), "mouseMotionListener", null);
        setField(term14673, term14673.getClass(), "mouseWheelListener", null);
        setField(term14673, term14673.getClass(), "inputMethodListener", null);
        setLongField(term14673, term14673.getClass(), "eventMask", 0L);
        setField(term14673, term14673.getClass(), "changeSupport", null);
        setField(term14673, term14673.getClass(), "objectLock", null);
        setBooleanField(term14673, term14673.getClass(), "isPacked", false);
        setIntField(term14673, term14673.getClass(), "boundsOp", 0);
        setField(term14673, term14673.getClass(), "compoundShape", null);
        setField(term14673, term14673.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term14673, term14673.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term14673, term14673.getClass(), "backgroundEraseDisabled", false);
        setField(term14673, term14673.getClass(), "eventCache", null);
        setBooleanField(term14673, term14673.getClass(), "coalescingEnabled", false);
        setBooleanField(term14673, term14673.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term14673, term14673.getClass(), "componentSerializedDataVersion", 0);
        setField(term14673, term14673.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitGroupPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitCheckBox");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addCheckBox", argTypes, term14673, args);
    }

};


