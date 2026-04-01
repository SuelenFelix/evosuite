package org.openRealmOfStars.gui.panels;

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
import static org.openRealmOfStars.gui.panels.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ResearchTechPanel_setText_10202506315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134347;

    public ResearchTechPanel_setText_10202506315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134347 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.ResearchTechPanel"));
        setField(term134347, term134347.getClass(), "btnMinus", null);
        setField(term134347, term134347.getClass(), "btnPlus", null);
        setField(term134347, term134347.getClass(), "label", null);
        setField(term134347, term134347.getClass(), "lvlLabel", null);
        setField(term134347, term134347.getClass(), "btnUpgrade", null);
        setField(term134347, term134347.getClass(), "slider", null);
        setBooleanField(term134347, term134347.getClass(), "isAlignmentXSet", false);
        setFloatField(term134347, term134347.getClass(), "alignmentX", 0.0F);
        setBooleanField(term134347, term134347.getClass(), "isAlignmentYSet", false);
        setFloatField(term134347, term134347.getClass(), "alignmentY", 0.0F);
        setField(term134347, term134347.getClass(), "ui", null);
        setField(term134347, term134347.getClass(), "listenerList", null);
        setField(term134347, term134347.getClass(), "clientProperties", null);
        setField(term134347, term134347.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term134347, term134347.getClass(), "autoscrolls", false);
        setField(term134347, term134347.getClass(), "border", null);
        setIntField(term134347, term134347.getClass(), "flags", 0);
        setField(term134347, term134347.getClass(), "inputVerifier", null);
        setBooleanField(term134347, term134347.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term134347, term134347.getClass(), "paintingChild", null);
        setField(term134347, term134347.getClass(), "popupMenu", null);
        setField(term134347, term134347.getClass(), "revalidateRunnableScheduled", null);
        setField(term134347, term134347.getClass(), "focusInputMap", null);
        setField(term134347, term134347.getClass(), "ancestorInputMap", null);
        setField(term134347, term134347.getClass(), "windowInputMap", null);
        setField(term134347, term134347.getClass(), "actionMap", null);
        setField(term134347, term134347.getClass(), "aaHint", null);
        setField(term134347, term134347.getClass(), "lcdRenderingHint", null);
        setField(term134347, term134347.getClass(), "component", null);
        setField(term134347, term134347.getClass(), "layoutMgr", null);
        setField(term134347, term134347.getClass(), "dispatcher", null);
        setField(term134347, term134347.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term134347, term134347.getClass(), "focusCycleRoot", false);
        setBooleanField(term134347, term134347.getClass(), "focusTraversalPolicyProvider", false);
        setField(term134347, term134347.getClass(), "printingThreads", null);
        setBooleanField(term134347, term134347.getClass(), "printing", false);
        setField(term134347, term134347.getClass(), "containerListener", null);
        setIntField(term134347, term134347.getClass(), "listeningChildren", 0);
        setIntField(term134347, term134347.getClass(), "listeningBoundsChildren", 0);
        setIntField(term134347, term134347.getClass(), "descendantsCount", 0);
        setField(term134347, term134347.getClass(), "preserveBackgroundColor", null);
        setIntField(term134347, term134347.getClass(), "numOfHWComponents", 0);
        setIntField(term134347, term134347.getClass(), "numOfLWComponents", 0);
        setField(term134347, term134347.getClass(), "modalComp", null);
        setField(term134347, term134347.getClass(), "modalAppContext", null);
        setIntField(term134347, term134347.getClass(), "containerSerializedDataVersion", 0);
        setField(term134347, term134347.getClass(), "peer", null);
        setField(term134347, term134347.getClass(), "parent", null);
        setField(term134347, term134347.getClass(), "appContext", null);
        setIntField(term134347, term134347.getClass(), "x", 0);
        setIntField(term134347, term134347.getClass(), "y", 0);
        setIntField(term134347, term134347.getClass(), "width", 0);
        setIntField(term134347, term134347.getClass(), "height", 0);
        setField(term134347, term134347.getClass(), "foreground", null);
        setField(term134347, term134347.getClass(), "background", null);
        setField(term134347, term134347.getClass(), "font", null);
        setField(term134347, term134347.getClass(), "peerFont", null);
        setField(term134347, term134347.getClass(), "cursor", null);
        setField(term134347, term134347.getClass(), "locale", null);
        setField(term134347, term134347.getClass(), "graphicsConfig", null);
        setField(term134347, term134347.getClass(), "bufferStrategy", null);
        setBooleanField(term134347, term134347.getClass(), "ignoreRepaint", false);
        setBooleanField(term134347, term134347.getClass(), "visible", false);
        setBooleanField(term134347, term134347.getClass(), "enabled", false);
        setBooleanField(term134347, term134347.getClass(), "valid", false);
        setField(term134347, term134347.getClass(), "dropTarget", null);
        setField(term134347, term134347.getClass(), "popups", null);
        setField(term134347, term134347.getClass(), "name", null);
        setBooleanField(term134347, term134347.getClass(), "nameExplicitlySet", false);
        setBooleanField(term134347, term134347.getClass(), "focusable", false);
        setIntField(term134347, term134347.getClass(), "isFocusTraversableOverridden", 0);
        setField(term134347, term134347.getClass(), "focusTraversalKeys", null);
        setBooleanField(term134347, term134347.getClass(), "focusTraversalKeysEnabled", false);
        setField(term134347, term134347.getClass(), "acc", null);
        setField(term134347, term134347.getClass(), "minSize", null);
        setBooleanField(term134347, term134347.getClass(), "minSizeSet", false);
        setField(term134347, term134347.getClass(), "prefSize", null);
        setBooleanField(term134347, term134347.getClass(), "prefSizeSet", false);
        setField(term134347, term134347.getClass(), "maxSize", null);
        setBooleanField(term134347, term134347.getClass(), "maxSizeSet", false);
        setField(term134347, term134347.getClass(), "componentOrientation", null);
        setBooleanField(term134347, term134347.getClass(), "newEventsOnly", false);
        setField(term134347, term134347.getClass(), "componentListener", null);
        setField(term134347, term134347.getClass(), "focusListener", null);
        setField(term134347, term134347.getClass(), "hierarchyListener", null);
        setField(term134347, term134347.getClass(), "hierarchyBoundsListener", null);
        setField(term134347, term134347.getClass(), "keyListener", null);
        setField(term134347, term134347.getClass(), "mouseListener", null);
        setField(term134347, term134347.getClass(), "mouseMotionListener", null);
        setField(term134347, term134347.getClass(), "mouseWheelListener", null);
        setField(term134347, term134347.getClass(), "inputMethodListener", null);
        setLongField(term134347, term134347.getClass(), "eventMask", 0L);
        setField(term134347, term134347.getClass(), "changeSupport", null);
        setField(term134347, term134347.getClass(), "objectLock", null);
        setBooleanField(term134347, term134347.getClass(), "isPacked", false);
        setIntField(term134347, term134347.getClass(), "boundsOp", 0);
        setField(term134347, term134347.getClass(), "compoundShape", null);
        setField(term134347, term134347.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term134347, term134347.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term134347, term134347.getClass(), "backgroundEraseDisabled", false);
        setField(term134347, term134347.getClass(), "eventCache", null);
        setBooleanField(term134347, term134347.getClass(), "coalescingEnabled", false);
        setBooleanField(term134347, term134347.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term134347, term134347.getClass(), "componentSerializedDataVersion", 0);
        setField(term134347, term134347.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.ResearchTechPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setText", argTypes, term134347, args);
    }

};


