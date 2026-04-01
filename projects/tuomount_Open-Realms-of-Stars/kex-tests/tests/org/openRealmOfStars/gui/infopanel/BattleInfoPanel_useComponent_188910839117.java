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
import java.lang.Integer;

public class BattleInfoPanel_useComponent_188910839117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79963;
     Object term80004;

    public BattleInfoPanel_useComponent_188910839117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79963 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.BattleInfoPanel"));
        setField(term79963, term79963.getClass(), "imageLabel", null);
        setField(term79963, term79963.getClass(), "textArea", null);
        setField(term79963, term79963.getClass(), "ship", null);
        setField(term79963, term79963.getClass(), "useAllWeapons", null);
        setField(term79963, term79963.getClass(), "showRange", null);
        setField(term79963, term79963.getClass(), "cBtn", null);
        setField(term79963, term79963.getClass(), "border", null);
        setBooleanField(term79963, term79963.getClass(), "isAlignmentXSet", false);
        setFloatField(term79963, term79963.getClass(), "alignmentX", 0.0F);
        setBooleanField(term79963, term79963.getClass(), "isAlignmentYSet", false);
        setFloatField(term79963, term79963.getClass(), "alignmentY", 0.0F);
        setField(term79963, term79963.getClass(), "ui", null);
        setField(term79963, term79963.getClass(), "listenerList", null);
        setField(term79963, term79963.getClass(), "clientProperties", null);
        setField(term79963, term79963.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term79963, term79963.getClass(), "autoscrolls", false);
        setField(term79963, term79963.getClass(), "border", null);
        setIntField(term79963, term79963.getClass(), "flags", 0);
        setField(term79963, term79963.getClass(), "inputVerifier", null);
        setBooleanField(term79963, term79963.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term79963, term79963.getClass(), "paintingChild", null);
        setField(term79963, term79963.getClass(), "popupMenu", null);
        setField(term79963, term79963.getClass(), "revalidateRunnableScheduled", null);
        setField(term79963, term79963.getClass(), "focusInputMap", null);
        setField(term79963, term79963.getClass(), "ancestorInputMap", null);
        setField(term79963, term79963.getClass(), "windowInputMap", null);
        setField(term79963, term79963.getClass(), "actionMap", null);
        setField(term79963, term79963.getClass(), "aaHint", null);
        setField(term79963, term79963.getClass(), "lcdRenderingHint", null);
        setField(term79963, term79963.getClass(), "component", null);
        setField(term79963, term79963.getClass(), "layoutMgr", null);
        setField(term79963, term79963.getClass(), "dispatcher", null);
        setField(term79963, term79963.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term79963, term79963.getClass(), "focusCycleRoot", false);
        setBooleanField(term79963, term79963.getClass(), "focusTraversalPolicyProvider", false);
        setField(term79963, term79963.getClass(), "printingThreads", null);
        setBooleanField(term79963, term79963.getClass(), "printing", false);
        setField(term79963, term79963.getClass(), "containerListener", null);
        setIntField(term79963, term79963.getClass(), "listeningChildren", 0);
        setIntField(term79963, term79963.getClass(), "listeningBoundsChildren", 0);
        setIntField(term79963, term79963.getClass(), "descendantsCount", 0);
        setField(term79963, term79963.getClass(), "preserveBackgroundColor", null);
        setIntField(term79963, term79963.getClass(), "numOfHWComponents", 0);
        setIntField(term79963, term79963.getClass(), "numOfLWComponents", 0);
        setField(term79963, term79963.getClass(), "modalComp", null);
        setField(term79963, term79963.getClass(), "modalAppContext", null);
        setIntField(term79963, term79963.getClass(), "containerSerializedDataVersion", 0);
        setField(term79963, term79963.getClass(), "peer", null);
        setField(term79963, term79963.getClass(), "parent", null);
        setField(term79963, term79963.getClass(), "appContext", null);
        setIntField(term79963, term79963.getClass(), "x", 0);
        setIntField(term79963, term79963.getClass(), "y", 0);
        setIntField(term79963, term79963.getClass(), "width", 0);
        setIntField(term79963, term79963.getClass(), "height", 0);
        setField(term79963, term79963.getClass(), "foreground", null);
        setField(term79963, term79963.getClass(), "background", null);
        setField(term79963, term79963.getClass(), "font", null);
        setField(term79963, term79963.getClass(), "peerFont", null);
        setField(term79963, term79963.getClass(), "cursor", null);
        setField(term79963, term79963.getClass(), "locale", null);
        setField(term79963, term79963.getClass(), "graphicsConfig", null);
        setField(term79963, term79963.getClass(), "bufferStrategy", null);
        setBooleanField(term79963, term79963.getClass(), "ignoreRepaint", false);
        setBooleanField(term79963, term79963.getClass(), "visible", false);
        setBooleanField(term79963, term79963.getClass(), "enabled", false);
        setBooleanField(term79963, term79963.getClass(), "valid", false);
        setField(term79963, term79963.getClass(), "dropTarget", null);
        setField(term79963, term79963.getClass(), "popups", null);
        setField(term79963, term79963.getClass(), "name", null);
        setBooleanField(term79963, term79963.getClass(), "nameExplicitlySet", false);
        setBooleanField(term79963, term79963.getClass(), "focusable", false);
        setIntField(term79963, term79963.getClass(), "isFocusTraversableOverridden", 0);
        setField(term79963, term79963.getClass(), "focusTraversalKeys", null);
        setBooleanField(term79963, term79963.getClass(), "focusTraversalKeysEnabled", false);
        setField(term79963, term79963.getClass(), "acc", null);
        setField(term79963, term79963.getClass(), "minSize", null);
        setBooleanField(term79963, term79963.getClass(), "minSizeSet", false);
        setField(term79963, term79963.getClass(), "prefSize", null);
        setBooleanField(term79963, term79963.getClass(), "prefSizeSet", false);
        setField(term79963, term79963.getClass(), "maxSize", null);
        setBooleanField(term79963, term79963.getClass(), "maxSizeSet", false);
        setField(term79963, term79963.getClass(), "componentOrientation", null);
        setBooleanField(term79963, term79963.getClass(), "newEventsOnly", false);
        setField(term79963, term79963.getClass(), "componentListener", null);
        setField(term79963, term79963.getClass(), "focusListener", null);
        setField(term79963, term79963.getClass(), "hierarchyListener", null);
        setField(term79963, term79963.getClass(), "hierarchyBoundsListener", null);
        setField(term79963, term79963.getClass(), "keyListener", null);
        setField(term79963, term79963.getClass(), "mouseListener", null);
        setField(term79963, term79963.getClass(), "mouseMotionListener", null);
        setField(term79963, term79963.getClass(), "mouseWheelListener", null);
        setField(term79963, term79963.getClass(), "inputMethodListener", null);
        setLongField(term79963, term79963.getClass(), "eventMask", 0L);
        setField(term79963, term79963.getClass(), "changeSupport", null);
        setField(term79963, term79963.getClass(), "objectLock", null);
        setBooleanField(term79963, term79963.getClass(), "isPacked", false);
        setIntField(term79963, term79963.getClass(), "boundsOp", 0);
        setField(term79963, term79963.getClass(), "compoundShape", null);
        setField(term79963, term79963.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term79963, term79963.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term79963, term79963.getClass(), "backgroundEraseDisabled", false);
        setField(term79963, term79963.getClass(), "eventCache", null);
        setBooleanField(term79963, term79963.getClass(), "coalescingEnabled", false);
        setBooleanField(term79963, term79963.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term79963, term79963.getClass(), "componentSerializedDataVersion", 0);
        setField(term79963, term79963.getClass(), "accessibleContext", null);
        term80004 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.BattleInfoPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term80004;
        callMethod(klass, "useComponent", argTypes, term79963, args);
    }

};


