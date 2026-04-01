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

public class RaceImagePanel_getRaceToShow_1941768044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216401;

    public RaceImagePanel_getRaceToShow_1941768044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term216401 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.RaceImagePanel"));
        setField(term216401, term216401.getClass(), "raceToShow", null);
        setField(term216401, term216401.getClass(), "image", null);
        setField(term216401, term216401.getClass(), "text", null);
        setBooleanField(term216401, term216401.getClass(), "isAlignmentXSet", false);
        setFloatField(term216401, term216401.getClass(), "alignmentX", 0.0F);
        setBooleanField(term216401, term216401.getClass(), "isAlignmentYSet", false);
        setFloatField(term216401, term216401.getClass(), "alignmentY", 0.0F);
        setField(term216401, term216401.getClass(), "ui", null);
        setField(term216401, term216401.getClass(), "listenerList", null);
        setField(term216401, term216401.getClass(), "clientProperties", null);
        setField(term216401, term216401.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term216401, term216401.getClass(), "autoscrolls", false);
        setField(term216401, term216401.getClass(), "border", null);
        setIntField(term216401, term216401.getClass(), "flags", 0);
        setField(term216401, term216401.getClass(), "inputVerifier", null);
        setBooleanField(term216401, term216401.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term216401, term216401.getClass(), "paintingChild", null);
        setField(term216401, term216401.getClass(), "popupMenu", null);
        setField(term216401, term216401.getClass(), "revalidateRunnableScheduled", null);
        setField(term216401, term216401.getClass(), "focusInputMap", null);
        setField(term216401, term216401.getClass(), "ancestorInputMap", null);
        setField(term216401, term216401.getClass(), "windowInputMap", null);
        setField(term216401, term216401.getClass(), "actionMap", null);
        setField(term216401, term216401.getClass(), "aaHint", null);
        setField(term216401, term216401.getClass(), "lcdRenderingHint", null);
        setField(term216401, term216401.getClass(), "component", null);
        setField(term216401, term216401.getClass(), "layoutMgr", null);
        setField(term216401, term216401.getClass(), "dispatcher", null);
        setField(term216401, term216401.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term216401, term216401.getClass(), "focusCycleRoot", false);
        setBooleanField(term216401, term216401.getClass(), "focusTraversalPolicyProvider", false);
        setField(term216401, term216401.getClass(), "printingThreads", null);
        setBooleanField(term216401, term216401.getClass(), "printing", false);
        setField(term216401, term216401.getClass(), "containerListener", null);
        setIntField(term216401, term216401.getClass(), "listeningChildren", 0);
        setIntField(term216401, term216401.getClass(), "listeningBoundsChildren", 0);
        setIntField(term216401, term216401.getClass(), "descendantsCount", 0);
        setField(term216401, term216401.getClass(), "preserveBackgroundColor", null);
        setIntField(term216401, term216401.getClass(), "numOfHWComponents", 0);
        setIntField(term216401, term216401.getClass(), "numOfLWComponents", 0);
        setField(term216401, term216401.getClass(), "modalComp", null);
        setField(term216401, term216401.getClass(), "modalAppContext", null);
        setIntField(term216401, term216401.getClass(), "containerSerializedDataVersion", 0);
        setField(term216401, term216401.getClass(), "peer", null);
        setField(term216401, term216401.getClass(), "parent", null);
        setField(term216401, term216401.getClass(), "appContext", null);
        setIntField(term216401, term216401.getClass(), "x", 0);
        setIntField(term216401, term216401.getClass(), "y", 0);
        setIntField(term216401, term216401.getClass(), "width", 0);
        setIntField(term216401, term216401.getClass(), "height", 0);
        setField(term216401, term216401.getClass(), "foreground", null);
        setField(term216401, term216401.getClass(), "background", null);
        setField(term216401, term216401.getClass(), "font", null);
        setField(term216401, term216401.getClass(), "peerFont", null);
        setField(term216401, term216401.getClass(), "cursor", null);
        setField(term216401, term216401.getClass(), "locale", null);
        setField(term216401, term216401.getClass(), "graphicsConfig", null);
        setField(term216401, term216401.getClass(), "bufferStrategy", null);
        setBooleanField(term216401, term216401.getClass(), "ignoreRepaint", false);
        setBooleanField(term216401, term216401.getClass(), "visible", false);
        setBooleanField(term216401, term216401.getClass(), "enabled", false);
        setBooleanField(term216401, term216401.getClass(), "valid", false);
        setField(term216401, term216401.getClass(), "dropTarget", null);
        setField(term216401, term216401.getClass(), "popups", null);
        setField(term216401, term216401.getClass(), "name", null);
        setBooleanField(term216401, term216401.getClass(), "nameExplicitlySet", false);
        setBooleanField(term216401, term216401.getClass(), "focusable", false);
        setIntField(term216401, term216401.getClass(), "isFocusTraversableOverridden", 0);
        setField(term216401, term216401.getClass(), "focusTraversalKeys", null);
        setBooleanField(term216401, term216401.getClass(), "focusTraversalKeysEnabled", false);
        setField(term216401, term216401.getClass(), "acc", null);
        setField(term216401, term216401.getClass(), "minSize", null);
        setBooleanField(term216401, term216401.getClass(), "minSizeSet", false);
        setField(term216401, term216401.getClass(), "prefSize", null);
        setBooleanField(term216401, term216401.getClass(), "prefSizeSet", false);
        setField(term216401, term216401.getClass(), "maxSize", null);
        setBooleanField(term216401, term216401.getClass(), "maxSizeSet", false);
        setField(term216401, term216401.getClass(), "componentOrientation", null);
        setBooleanField(term216401, term216401.getClass(), "newEventsOnly", false);
        setField(term216401, term216401.getClass(), "componentListener", null);
        setField(term216401, term216401.getClass(), "focusListener", null);
        setField(term216401, term216401.getClass(), "hierarchyListener", null);
        setField(term216401, term216401.getClass(), "hierarchyBoundsListener", null);
        setField(term216401, term216401.getClass(), "keyListener", null);
        setField(term216401, term216401.getClass(), "mouseListener", null);
        setField(term216401, term216401.getClass(), "mouseMotionListener", null);
        setField(term216401, term216401.getClass(), "mouseWheelListener", null);
        setField(term216401, term216401.getClass(), "inputMethodListener", null);
        setLongField(term216401, term216401.getClass(), "eventMask", 0L);
        setField(term216401, term216401.getClass(), "changeSupport", null);
        setField(term216401, term216401.getClass(), "objectLock", null);
        setBooleanField(term216401, term216401.getClass(), "isPacked", false);
        setIntField(term216401, term216401.getClass(), "boundsOp", 0);
        setField(term216401, term216401.getClass(), "compoundShape", null);
        setField(term216401, term216401.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term216401, term216401.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term216401, term216401.getClass(), "backgroundEraseDisabled", false);
        setField(term216401, term216401.getClass(), "eventCache", null);
        setBooleanField(term216401, term216401.getClass(), "coalescingEnabled", false);
        setBooleanField(term216401, term216401.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term216401, term216401.getClass(), "componentSerializedDataVersion", 0);
        setField(term216401, term216401.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.RaceImagePanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRaceToShow", argTypes, term216401, args);
    }

};


