package org.openRealmOfStars.gui.labels;

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
import static org.openRealmOfStars.gui.labels.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PlanetInfoLabel_updateTimeEstimate_11732381447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29946;

    public PlanetInfoLabel_updateTimeEstimate_11732381447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29946 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.PlanetInfoLabel"));
        setField(term29946, term29946.getClass(), "planet", null);
        setField(term29946, term29946.getClass(), "constructionSelect", null);
        setField(term29946, term29946.getClass(), "buildingEstimate", null);
        setField(term29946, term29946.getClass(), "border", null);
        setBooleanField(term29946, term29946.getClass(), "isAlignmentXSet", false);
        setFloatField(term29946, term29946.getClass(), "alignmentX", 0.0F);
        setBooleanField(term29946, term29946.getClass(), "isAlignmentYSet", false);
        setFloatField(term29946, term29946.getClass(), "alignmentY", 0.0F);
        setField(term29946, term29946.getClass(), "ui", null);
        setField(term29946, term29946.getClass(), "listenerList", null);
        setField(term29946, term29946.getClass(), "clientProperties", null);
        setField(term29946, term29946.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term29946, term29946.getClass(), "autoscrolls", false);
        setField(term29946, term29946.getClass(), "border", null);
        setIntField(term29946, term29946.getClass(), "flags", 0);
        setField(term29946, term29946.getClass(), "inputVerifier", null);
        setBooleanField(term29946, term29946.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term29946, term29946.getClass(), "paintingChild", null);
        setField(term29946, term29946.getClass(), "popupMenu", null);
        setField(term29946, term29946.getClass(), "revalidateRunnableScheduled", null);
        setField(term29946, term29946.getClass(), "focusInputMap", null);
        setField(term29946, term29946.getClass(), "ancestorInputMap", null);
        setField(term29946, term29946.getClass(), "windowInputMap", null);
        setField(term29946, term29946.getClass(), "actionMap", null);
        setField(term29946, term29946.getClass(), "aaHint", null);
        setField(term29946, term29946.getClass(), "lcdRenderingHint", null);
        setField(term29946, term29946.getClass(), "component", null);
        setField(term29946, term29946.getClass(), "layoutMgr", null);
        setField(term29946, term29946.getClass(), "dispatcher", null);
        setField(term29946, term29946.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term29946, term29946.getClass(), "focusCycleRoot", false);
        setBooleanField(term29946, term29946.getClass(), "focusTraversalPolicyProvider", false);
        setField(term29946, term29946.getClass(), "printingThreads", null);
        setBooleanField(term29946, term29946.getClass(), "printing", false);
        setField(term29946, term29946.getClass(), "containerListener", null);
        setIntField(term29946, term29946.getClass(), "listeningChildren", 0);
        setIntField(term29946, term29946.getClass(), "listeningBoundsChildren", 0);
        setIntField(term29946, term29946.getClass(), "descendantsCount", 0);
        setField(term29946, term29946.getClass(), "preserveBackgroundColor", null);
        setIntField(term29946, term29946.getClass(), "numOfHWComponents", 0);
        setIntField(term29946, term29946.getClass(), "numOfLWComponents", 0);
        setField(term29946, term29946.getClass(), "modalComp", null);
        setField(term29946, term29946.getClass(), "modalAppContext", null);
        setIntField(term29946, term29946.getClass(), "containerSerializedDataVersion", 0);
        setField(term29946, term29946.getClass(), "peer", null);
        setField(term29946, term29946.getClass(), "parent", null);
        setField(term29946, term29946.getClass(), "appContext", null);
        setIntField(term29946, term29946.getClass(), "x", 0);
        setIntField(term29946, term29946.getClass(), "y", 0);
        setIntField(term29946, term29946.getClass(), "width", 0);
        setIntField(term29946, term29946.getClass(), "height", 0);
        setField(term29946, term29946.getClass(), "foreground", null);
        setField(term29946, term29946.getClass(), "background", null);
        setField(term29946, term29946.getClass(), "font", null);
        setField(term29946, term29946.getClass(), "peerFont", null);
        setField(term29946, term29946.getClass(), "cursor", null);
        setField(term29946, term29946.getClass(), "locale", null);
        setField(term29946, term29946.getClass(), "graphicsConfig", null);
        setField(term29946, term29946.getClass(), "bufferStrategy", null);
        setBooleanField(term29946, term29946.getClass(), "ignoreRepaint", false);
        setBooleanField(term29946, term29946.getClass(), "visible", false);
        setBooleanField(term29946, term29946.getClass(), "enabled", false);
        setBooleanField(term29946, term29946.getClass(), "valid", false);
        setField(term29946, term29946.getClass(), "dropTarget", null);
        setField(term29946, term29946.getClass(), "popups", null);
        setField(term29946, term29946.getClass(), "name", null);
        setBooleanField(term29946, term29946.getClass(), "nameExplicitlySet", false);
        setBooleanField(term29946, term29946.getClass(), "focusable", false);
        setIntField(term29946, term29946.getClass(), "isFocusTraversableOverridden", 0);
        setField(term29946, term29946.getClass(), "focusTraversalKeys", null);
        setBooleanField(term29946, term29946.getClass(), "focusTraversalKeysEnabled", false);
        setField(term29946, term29946.getClass(), "acc", null);
        setField(term29946, term29946.getClass(), "minSize", null);
        setBooleanField(term29946, term29946.getClass(), "minSizeSet", false);
        setField(term29946, term29946.getClass(), "prefSize", null);
        setBooleanField(term29946, term29946.getClass(), "prefSizeSet", false);
        setField(term29946, term29946.getClass(), "maxSize", null);
        setBooleanField(term29946, term29946.getClass(), "maxSizeSet", false);
        setField(term29946, term29946.getClass(), "componentOrientation", null);
        setBooleanField(term29946, term29946.getClass(), "newEventsOnly", false);
        setField(term29946, term29946.getClass(), "componentListener", null);
        setField(term29946, term29946.getClass(), "focusListener", null);
        setField(term29946, term29946.getClass(), "hierarchyListener", null);
        setField(term29946, term29946.getClass(), "hierarchyBoundsListener", null);
        setField(term29946, term29946.getClass(), "keyListener", null);
        setField(term29946, term29946.getClass(), "mouseListener", null);
        setField(term29946, term29946.getClass(), "mouseMotionListener", null);
        setField(term29946, term29946.getClass(), "mouseWheelListener", null);
        setField(term29946, term29946.getClass(), "inputMethodListener", null);
        setLongField(term29946, term29946.getClass(), "eventMask", 0L);
        setField(term29946, term29946.getClass(), "changeSupport", null);
        setField(term29946, term29946.getClass(), "objectLock", null);
        setBooleanField(term29946, term29946.getClass(), "isPacked", false);
        setIntField(term29946, term29946.getClass(), "boundsOp", 0);
        setField(term29946, term29946.getClass(), "compoundShape", null);
        setField(term29946, term29946.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term29946, term29946.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term29946, term29946.getClass(), "backgroundEraseDisabled", false);
        setField(term29946, term29946.getClass(), "eventCache", null);
        setBooleanField(term29946, term29946.getClass(), "coalescingEnabled", false);
        setBooleanField(term29946, term29946.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term29946, term29946.getClass(), "componentSerializedDataVersion", 0);
        setField(term29946, term29946.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.PlanetInfoLabel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateTimeEstimate", argTypes, term29946, args);
    }

};


