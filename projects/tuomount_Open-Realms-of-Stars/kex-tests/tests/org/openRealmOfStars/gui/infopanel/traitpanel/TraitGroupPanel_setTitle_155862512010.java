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

public class TraitGroupPanel_setTitle_155862512010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14714;

    public TraitGroupPanel_setTitle_155862512010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14714 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitGroupPanel"));
        setField(term14714, term14714.getClass(), "checkBoxes", null);
        setField(term14714, term14714.getClass(), "border", null);
        setField(term14714, term14714.getClass(), "internalPanel", null);
        setField(term14714, term14714.getClass(), "internalBorder", null);
        setBooleanField(term14714, term14714.getClass(), "isAlignmentXSet", false);
        setFloatField(term14714, term14714.getClass(), "alignmentX", 0.0F);
        setBooleanField(term14714, term14714.getClass(), "isAlignmentYSet", false);
        setFloatField(term14714, term14714.getClass(), "alignmentY", 0.0F);
        setField(term14714, term14714.getClass(), "ui", null);
        setField(term14714, term14714.getClass(), "listenerList", null);
        setField(term14714, term14714.getClass(), "clientProperties", null);
        setField(term14714, term14714.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term14714, term14714.getClass(), "autoscrolls", false);
        setField(term14714, term14714.getClass(), "border", null);
        setIntField(term14714, term14714.getClass(), "flags", 0);
        setField(term14714, term14714.getClass(), "inputVerifier", null);
        setBooleanField(term14714, term14714.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term14714, term14714.getClass(), "paintingChild", null);
        setField(term14714, term14714.getClass(), "popupMenu", null);
        setField(term14714, term14714.getClass(), "revalidateRunnableScheduled", null);
        setField(term14714, term14714.getClass(), "focusInputMap", null);
        setField(term14714, term14714.getClass(), "ancestorInputMap", null);
        setField(term14714, term14714.getClass(), "windowInputMap", null);
        setField(term14714, term14714.getClass(), "actionMap", null);
        setField(term14714, term14714.getClass(), "aaHint", null);
        setField(term14714, term14714.getClass(), "lcdRenderingHint", null);
        setField(term14714, term14714.getClass(), "component", null);
        setField(term14714, term14714.getClass(), "layoutMgr", null);
        setField(term14714, term14714.getClass(), "dispatcher", null);
        setField(term14714, term14714.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term14714, term14714.getClass(), "focusCycleRoot", false);
        setBooleanField(term14714, term14714.getClass(), "focusTraversalPolicyProvider", false);
        setField(term14714, term14714.getClass(), "printingThreads", null);
        setBooleanField(term14714, term14714.getClass(), "printing", false);
        setField(term14714, term14714.getClass(), "containerListener", null);
        setIntField(term14714, term14714.getClass(), "listeningChildren", 0);
        setIntField(term14714, term14714.getClass(), "listeningBoundsChildren", 0);
        setIntField(term14714, term14714.getClass(), "descendantsCount", 0);
        setField(term14714, term14714.getClass(), "preserveBackgroundColor", null);
        setIntField(term14714, term14714.getClass(), "numOfHWComponents", 0);
        setIntField(term14714, term14714.getClass(), "numOfLWComponents", 0);
        setField(term14714, term14714.getClass(), "modalComp", null);
        setField(term14714, term14714.getClass(), "modalAppContext", null);
        setIntField(term14714, term14714.getClass(), "containerSerializedDataVersion", 0);
        setField(term14714, term14714.getClass(), "peer", null);
        setField(term14714, term14714.getClass(), "parent", null);
        setField(term14714, term14714.getClass(), "appContext", null);
        setIntField(term14714, term14714.getClass(), "x", 0);
        setIntField(term14714, term14714.getClass(), "y", 0);
        setIntField(term14714, term14714.getClass(), "width", 0);
        setIntField(term14714, term14714.getClass(), "height", 0);
        setField(term14714, term14714.getClass(), "foreground", null);
        setField(term14714, term14714.getClass(), "background", null);
        setField(term14714, term14714.getClass(), "font", null);
        setField(term14714, term14714.getClass(), "peerFont", null);
        setField(term14714, term14714.getClass(), "cursor", null);
        setField(term14714, term14714.getClass(), "locale", null);
        setField(term14714, term14714.getClass(), "graphicsConfig", null);
        setField(term14714, term14714.getClass(), "bufferStrategy", null);
        setBooleanField(term14714, term14714.getClass(), "ignoreRepaint", false);
        setBooleanField(term14714, term14714.getClass(), "visible", false);
        setBooleanField(term14714, term14714.getClass(), "enabled", false);
        setBooleanField(term14714, term14714.getClass(), "valid", false);
        setField(term14714, term14714.getClass(), "dropTarget", null);
        setField(term14714, term14714.getClass(), "popups", null);
        setField(term14714, term14714.getClass(), "name", null);
        setBooleanField(term14714, term14714.getClass(), "nameExplicitlySet", false);
        setBooleanField(term14714, term14714.getClass(), "focusable", false);
        setIntField(term14714, term14714.getClass(), "isFocusTraversableOverridden", 0);
        setField(term14714, term14714.getClass(), "focusTraversalKeys", null);
        setBooleanField(term14714, term14714.getClass(), "focusTraversalKeysEnabled", false);
        setField(term14714, term14714.getClass(), "acc", null);
        setField(term14714, term14714.getClass(), "minSize", null);
        setBooleanField(term14714, term14714.getClass(), "minSizeSet", false);
        setField(term14714, term14714.getClass(), "prefSize", null);
        setBooleanField(term14714, term14714.getClass(), "prefSizeSet", false);
        setField(term14714, term14714.getClass(), "maxSize", null);
        setBooleanField(term14714, term14714.getClass(), "maxSizeSet", false);
        setField(term14714, term14714.getClass(), "componentOrientation", null);
        setBooleanField(term14714, term14714.getClass(), "newEventsOnly", false);
        setField(term14714, term14714.getClass(), "componentListener", null);
        setField(term14714, term14714.getClass(), "focusListener", null);
        setField(term14714, term14714.getClass(), "hierarchyListener", null);
        setField(term14714, term14714.getClass(), "hierarchyBoundsListener", null);
        setField(term14714, term14714.getClass(), "keyListener", null);
        setField(term14714, term14714.getClass(), "mouseListener", null);
        setField(term14714, term14714.getClass(), "mouseMotionListener", null);
        setField(term14714, term14714.getClass(), "mouseWheelListener", null);
        setField(term14714, term14714.getClass(), "inputMethodListener", null);
        setLongField(term14714, term14714.getClass(), "eventMask", 0L);
        setField(term14714, term14714.getClass(), "changeSupport", null);
        setField(term14714, term14714.getClass(), "objectLock", null);
        setBooleanField(term14714, term14714.getClass(), "isPacked", false);
        setIntField(term14714, term14714.getClass(), "boundsOp", 0);
        setField(term14714, term14714.getClass(), "compoundShape", null);
        setField(term14714, term14714.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term14714, term14714.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term14714, term14714.getClass(), "backgroundEraseDisabled", false);
        setField(term14714, term14714.getClass(), "eventCache", null);
        setBooleanField(term14714, term14714.getClass(), "coalescingEnabled", false);
        setBooleanField(term14714, term14714.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term14714, term14714.getClass(), "componentSerializedDataVersion", 0);
        setField(term14714, term14714.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.traitpanel.TraitGroupPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTitle", argTypes, term14714, args);
    }

};


