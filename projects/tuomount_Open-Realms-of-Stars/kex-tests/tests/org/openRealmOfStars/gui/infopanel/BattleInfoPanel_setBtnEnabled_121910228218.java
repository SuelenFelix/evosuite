package org.openRealmOfStars.gui.infopanel;

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
import static org.openRealmOfStars.gui.infopanel.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class BattleInfoPanel_setBtnEnabled_121910228218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80006;
     Object term80047;

    public BattleInfoPanel_setBtnEnabled_121910228218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80006 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.BattleInfoPanel"));
        setField(term80006, term80006.getClass(), "imageLabel", null);
        setField(term80006, term80006.getClass(), "textArea", null);
        setField(term80006, term80006.getClass(), "ship", null);
        setField(term80006, term80006.getClass(), "useAllWeapons", null);
        setField(term80006, term80006.getClass(), "showRange", null);
        setField(term80006, term80006.getClass(), "cBtn", null);
        setField(term80006, term80006.getClass(), "border", null);
        setBooleanField(term80006, term80006.getClass(), "isAlignmentXSet", false);
        setFloatField(term80006, term80006.getClass(), "alignmentX", 0.0F);
        setBooleanField(term80006, term80006.getClass(), "isAlignmentYSet", false);
        setFloatField(term80006, term80006.getClass(), "alignmentY", 0.0F);
        setField(term80006, term80006.getClass(), "ui", null);
        setField(term80006, term80006.getClass(), "listenerList", null);
        setField(term80006, term80006.getClass(), "clientProperties", null);
        setField(term80006, term80006.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term80006, term80006.getClass(), "autoscrolls", false);
        setField(term80006, term80006.getClass(), "border", null);
        setIntField(term80006, term80006.getClass(), "flags", 0);
        setField(term80006, term80006.getClass(), "inputVerifier", null);
        setBooleanField(term80006, term80006.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term80006, term80006.getClass(), "paintingChild", null);
        setField(term80006, term80006.getClass(), "popupMenu", null);
        setField(term80006, term80006.getClass(), "revalidateRunnableScheduled", null);
        setField(term80006, term80006.getClass(), "focusInputMap", null);
        setField(term80006, term80006.getClass(), "ancestorInputMap", null);
        setField(term80006, term80006.getClass(), "windowInputMap", null);
        setField(term80006, term80006.getClass(), "actionMap", null);
        setField(term80006, term80006.getClass(), "aaHint", null);
        setField(term80006, term80006.getClass(), "lcdRenderingHint", null);
        setField(term80006, term80006.getClass(), "component", null);
        setField(term80006, term80006.getClass(), "layoutMgr", null);
        setField(term80006, term80006.getClass(), "dispatcher", null);
        setField(term80006, term80006.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term80006, term80006.getClass(), "focusCycleRoot", false);
        setBooleanField(term80006, term80006.getClass(), "focusTraversalPolicyProvider", false);
        setField(term80006, term80006.getClass(), "printingThreads", null);
        setBooleanField(term80006, term80006.getClass(), "printing", false);
        setField(term80006, term80006.getClass(), "containerListener", null);
        setIntField(term80006, term80006.getClass(), "listeningChildren", 0);
        setIntField(term80006, term80006.getClass(), "listeningBoundsChildren", 0);
        setIntField(term80006, term80006.getClass(), "descendantsCount", 0);
        setField(term80006, term80006.getClass(), "preserveBackgroundColor", null);
        setIntField(term80006, term80006.getClass(), "numOfHWComponents", 0);
        setIntField(term80006, term80006.getClass(), "numOfLWComponents", 0);
        setField(term80006, term80006.getClass(), "modalComp", null);
        setField(term80006, term80006.getClass(), "modalAppContext", null);
        setIntField(term80006, term80006.getClass(), "containerSerializedDataVersion", 0);
        setField(term80006, term80006.getClass(), "peer", null);
        setField(term80006, term80006.getClass(), "parent", null);
        setField(term80006, term80006.getClass(), "appContext", null);
        setIntField(term80006, term80006.getClass(), "x", 0);
        setIntField(term80006, term80006.getClass(), "y", 0);
        setIntField(term80006, term80006.getClass(), "width", 0);
        setIntField(term80006, term80006.getClass(), "height", 0);
        setField(term80006, term80006.getClass(), "foreground", null);
        setField(term80006, term80006.getClass(), "background", null);
        setField(term80006, term80006.getClass(), "font", null);
        setField(term80006, term80006.getClass(), "peerFont", null);
        setField(term80006, term80006.getClass(), "cursor", null);
        setField(term80006, term80006.getClass(), "locale", null);
        setField(term80006, term80006.getClass(), "graphicsConfig", null);
        setField(term80006, term80006.getClass(), "bufferStrategy", null);
        setBooleanField(term80006, term80006.getClass(), "ignoreRepaint", false);
        setBooleanField(term80006, term80006.getClass(), "visible", false);
        setBooleanField(term80006, term80006.getClass(), "enabled", false);
        setBooleanField(term80006, term80006.getClass(), "valid", false);
        setField(term80006, term80006.getClass(), "dropTarget", null);
        setField(term80006, term80006.getClass(), "popups", null);
        setField(term80006, term80006.getClass(), "name", null);
        setBooleanField(term80006, term80006.getClass(), "nameExplicitlySet", false);
        setBooleanField(term80006, term80006.getClass(), "focusable", false);
        setIntField(term80006, term80006.getClass(), "isFocusTraversableOverridden", 0);
        setField(term80006, term80006.getClass(), "focusTraversalKeys", null);
        setBooleanField(term80006, term80006.getClass(), "focusTraversalKeysEnabled", false);
        setField(term80006, term80006.getClass(), "acc", null);
        setField(term80006, term80006.getClass(), "minSize", null);
        setBooleanField(term80006, term80006.getClass(), "minSizeSet", false);
        setField(term80006, term80006.getClass(), "prefSize", null);
        setBooleanField(term80006, term80006.getClass(), "prefSizeSet", false);
        setField(term80006, term80006.getClass(), "maxSize", null);
        setBooleanField(term80006, term80006.getClass(), "maxSizeSet", false);
        setField(term80006, term80006.getClass(), "componentOrientation", null);
        setBooleanField(term80006, term80006.getClass(), "newEventsOnly", false);
        setField(term80006, term80006.getClass(), "componentListener", null);
        setField(term80006, term80006.getClass(), "focusListener", null);
        setField(term80006, term80006.getClass(), "hierarchyListener", null);
        setField(term80006, term80006.getClass(), "hierarchyBoundsListener", null);
        setField(term80006, term80006.getClass(), "keyListener", null);
        setField(term80006, term80006.getClass(), "mouseListener", null);
        setField(term80006, term80006.getClass(), "mouseMotionListener", null);
        setField(term80006, term80006.getClass(), "mouseWheelListener", null);
        setField(term80006, term80006.getClass(), "inputMethodListener", null);
        setLongField(term80006, term80006.getClass(), "eventMask", 0L);
        setField(term80006, term80006.getClass(), "changeSupport", null);
        setField(term80006, term80006.getClass(), "objectLock", null);
        setBooleanField(term80006, term80006.getClass(), "isPacked", false);
        setIntField(term80006, term80006.getClass(), "boundsOp", 0);
        setField(term80006, term80006.getClass(), "compoundShape", null);
        setField(term80006, term80006.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term80006, term80006.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term80006, term80006.getClass(), "backgroundEraseDisabled", false);
        setField(term80006, term80006.getClass(), "eventCache", null);
        setBooleanField(term80006, term80006.getClass(), "coalescingEnabled", false);
        setBooleanField(term80006, term80006.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term80006, term80006.getClass(), "componentSerializedDataVersion", 0);
        setField(term80006, term80006.getClass(), "accessibleContext", null);
        term80047 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.BattleInfoPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term80047;
        callMethod(klass, "setBtnEnabled", argTypes, term80006, args);
    }

};


