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

public class RaceImagePanel_setRaceToShow_16438979325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216442;

    public RaceImagePanel_setRaceToShow_16438979325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term216442 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.RaceImagePanel"));
        setField(term216442, term216442.getClass(), "raceToShow", null);
        setField(term216442, term216442.getClass(), "image", null);
        setField(term216442, term216442.getClass(), "text", null);
        setBooleanField(term216442, term216442.getClass(), "isAlignmentXSet", false);
        setFloatField(term216442, term216442.getClass(), "alignmentX", 0.0F);
        setBooleanField(term216442, term216442.getClass(), "isAlignmentYSet", false);
        setFloatField(term216442, term216442.getClass(), "alignmentY", 0.0F);
        setField(term216442, term216442.getClass(), "ui", null);
        setField(term216442, term216442.getClass(), "listenerList", null);
        setField(term216442, term216442.getClass(), "clientProperties", null);
        setField(term216442, term216442.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term216442, term216442.getClass(), "autoscrolls", false);
        setField(term216442, term216442.getClass(), "border", null);
        setIntField(term216442, term216442.getClass(), "flags", 0);
        setField(term216442, term216442.getClass(), "inputVerifier", null);
        setBooleanField(term216442, term216442.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term216442, term216442.getClass(), "paintingChild", null);
        setField(term216442, term216442.getClass(), "popupMenu", null);
        setField(term216442, term216442.getClass(), "revalidateRunnableScheduled", null);
        setField(term216442, term216442.getClass(), "focusInputMap", null);
        setField(term216442, term216442.getClass(), "ancestorInputMap", null);
        setField(term216442, term216442.getClass(), "windowInputMap", null);
        setField(term216442, term216442.getClass(), "actionMap", null);
        setField(term216442, term216442.getClass(), "aaHint", null);
        setField(term216442, term216442.getClass(), "lcdRenderingHint", null);
        setField(term216442, term216442.getClass(), "component", null);
        setField(term216442, term216442.getClass(), "layoutMgr", null);
        setField(term216442, term216442.getClass(), "dispatcher", null);
        setField(term216442, term216442.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term216442, term216442.getClass(), "focusCycleRoot", false);
        setBooleanField(term216442, term216442.getClass(), "focusTraversalPolicyProvider", false);
        setField(term216442, term216442.getClass(), "printingThreads", null);
        setBooleanField(term216442, term216442.getClass(), "printing", false);
        setField(term216442, term216442.getClass(), "containerListener", null);
        setIntField(term216442, term216442.getClass(), "listeningChildren", 0);
        setIntField(term216442, term216442.getClass(), "listeningBoundsChildren", 0);
        setIntField(term216442, term216442.getClass(), "descendantsCount", 0);
        setField(term216442, term216442.getClass(), "preserveBackgroundColor", null);
        setIntField(term216442, term216442.getClass(), "numOfHWComponents", 0);
        setIntField(term216442, term216442.getClass(), "numOfLWComponents", 0);
        setField(term216442, term216442.getClass(), "modalComp", null);
        setField(term216442, term216442.getClass(), "modalAppContext", null);
        setIntField(term216442, term216442.getClass(), "containerSerializedDataVersion", 0);
        setField(term216442, term216442.getClass(), "peer", null);
        setField(term216442, term216442.getClass(), "parent", null);
        setField(term216442, term216442.getClass(), "appContext", null);
        setIntField(term216442, term216442.getClass(), "x", 0);
        setIntField(term216442, term216442.getClass(), "y", 0);
        setIntField(term216442, term216442.getClass(), "width", 0);
        setIntField(term216442, term216442.getClass(), "height", 0);
        setField(term216442, term216442.getClass(), "foreground", null);
        setField(term216442, term216442.getClass(), "background", null);
        setField(term216442, term216442.getClass(), "font", null);
        setField(term216442, term216442.getClass(), "peerFont", null);
        setField(term216442, term216442.getClass(), "cursor", null);
        setField(term216442, term216442.getClass(), "locale", null);
        setField(term216442, term216442.getClass(), "graphicsConfig", null);
        setField(term216442, term216442.getClass(), "bufferStrategy", null);
        setBooleanField(term216442, term216442.getClass(), "ignoreRepaint", false);
        setBooleanField(term216442, term216442.getClass(), "visible", false);
        setBooleanField(term216442, term216442.getClass(), "enabled", false);
        setBooleanField(term216442, term216442.getClass(), "valid", false);
        setField(term216442, term216442.getClass(), "dropTarget", null);
        setField(term216442, term216442.getClass(), "popups", null);
        setField(term216442, term216442.getClass(), "name", null);
        setBooleanField(term216442, term216442.getClass(), "nameExplicitlySet", false);
        setBooleanField(term216442, term216442.getClass(), "focusable", false);
        setIntField(term216442, term216442.getClass(), "isFocusTraversableOverridden", 0);
        setField(term216442, term216442.getClass(), "focusTraversalKeys", null);
        setBooleanField(term216442, term216442.getClass(), "focusTraversalKeysEnabled", false);
        setField(term216442, term216442.getClass(), "acc", null);
        setField(term216442, term216442.getClass(), "minSize", null);
        setBooleanField(term216442, term216442.getClass(), "minSizeSet", false);
        setField(term216442, term216442.getClass(), "prefSize", null);
        setBooleanField(term216442, term216442.getClass(), "prefSizeSet", false);
        setField(term216442, term216442.getClass(), "maxSize", null);
        setBooleanField(term216442, term216442.getClass(), "maxSizeSet", false);
        setField(term216442, term216442.getClass(), "componentOrientation", null);
        setBooleanField(term216442, term216442.getClass(), "newEventsOnly", false);
        setField(term216442, term216442.getClass(), "componentListener", null);
        setField(term216442, term216442.getClass(), "focusListener", null);
        setField(term216442, term216442.getClass(), "hierarchyListener", null);
        setField(term216442, term216442.getClass(), "hierarchyBoundsListener", null);
        setField(term216442, term216442.getClass(), "keyListener", null);
        setField(term216442, term216442.getClass(), "mouseListener", null);
        setField(term216442, term216442.getClass(), "mouseMotionListener", null);
        setField(term216442, term216442.getClass(), "mouseWheelListener", null);
        setField(term216442, term216442.getClass(), "inputMethodListener", null);
        setLongField(term216442, term216442.getClass(), "eventMask", 0L);
        setField(term216442, term216442.getClass(), "changeSupport", null);
        setField(term216442, term216442.getClass(), "objectLock", null);
        setBooleanField(term216442, term216442.getClass(), "isPacked", false);
        setIntField(term216442, term216442.getClass(), "boundsOp", 0);
        setField(term216442, term216442.getClass(), "compoundShape", null);
        setField(term216442, term216442.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term216442, term216442.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term216442, term216442.getClass(), "backgroundEraseDisabled", false);
        setField(term216442, term216442.getClass(), "eventCache", null);
        setBooleanField(term216442, term216442.getClass(), "coalescingEnabled", false);
        setBooleanField(term216442, term216442.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term216442, term216442.getClass(), "componentSerializedDataVersion", 0);
        setField(term216442, term216442.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.RaceImagePanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRaceToShow", argTypes, term216442, args);
    }

};


