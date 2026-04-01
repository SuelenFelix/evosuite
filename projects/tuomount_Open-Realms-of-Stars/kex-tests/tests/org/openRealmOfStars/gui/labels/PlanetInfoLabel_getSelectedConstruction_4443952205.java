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

public class PlanetInfoLabel_getSelectedConstruction_4443952205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24350;

    public PlanetInfoLabel_getSelectedConstruction_4443952205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24350 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.PlanetInfoLabel"));
        setField(term24350, term24350.getClass(), "planet", null);
        setField(term24350, term24350.getClass(), "constructionSelect", null);
        setField(term24350, term24350.getClass(), "buildingEstimate", null);
        setField(term24350, term24350.getClass(), "border", null);
        setBooleanField(term24350, term24350.getClass(), "isAlignmentXSet", false);
        setFloatField(term24350, term24350.getClass(), "alignmentX", 0.0F);
        setBooleanField(term24350, term24350.getClass(), "isAlignmentYSet", false);
        setFloatField(term24350, term24350.getClass(), "alignmentY", 0.0F);
        setField(term24350, term24350.getClass(), "ui", null);
        setField(term24350, term24350.getClass(), "listenerList", null);
        setField(term24350, term24350.getClass(), "clientProperties", null);
        setField(term24350, term24350.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term24350, term24350.getClass(), "autoscrolls", false);
        setField(term24350, term24350.getClass(), "border", null);
        setIntField(term24350, term24350.getClass(), "flags", 0);
        setField(term24350, term24350.getClass(), "inputVerifier", null);
        setBooleanField(term24350, term24350.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term24350, term24350.getClass(), "paintingChild", null);
        setField(term24350, term24350.getClass(), "popupMenu", null);
        setField(term24350, term24350.getClass(), "revalidateRunnableScheduled", null);
        setField(term24350, term24350.getClass(), "focusInputMap", null);
        setField(term24350, term24350.getClass(), "ancestorInputMap", null);
        setField(term24350, term24350.getClass(), "windowInputMap", null);
        setField(term24350, term24350.getClass(), "actionMap", null);
        setField(term24350, term24350.getClass(), "aaHint", null);
        setField(term24350, term24350.getClass(), "lcdRenderingHint", null);
        setField(term24350, term24350.getClass(), "component", null);
        setField(term24350, term24350.getClass(), "layoutMgr", null);
        setField(term24350, term24350.getClass(), "dispatcher", null);
        setField(term24350, term24350.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term24350, term24350.getClass(), "focusCycleRoot", false);
        setBooleanField(term24350, term24350.getClass(), "focusTraversalPolicyProvider", false);
        setField(term24350, term24350.getClass(), "printingThreads", null);
        setBooleanField(term24350, term24350.getClass(), "printing", false);
        setField(term24350, term24350.getClass(), "containerListener", null);
        setIntField(term24350, term24350.getClass(), "listeningChildren", 0);
        setIntField(term24350, term24350.getClass(), "listeningBoundsChildren", 0);
        setIntField(term24350, term24350.getClass(), "descendantsCount", 0);
        setField(term24350, term24350.getClass(), "preserveBackgroundColor", null);
        setIntField(term24350, term24350.getClass(), "numOfHWComponents", 0);
        setIntField(term24350, term24350.getClass(), "numOfLWComponents", 0);
        setField(term24350, term24350.getClass(), "modalComp", null);
        setField(term24350, term24350.getClass(), "modalAppContext", null);
        setIntField(term24350, term24350.getClass(), "containerSerializedDataVersion", 0);
        setField(term24350, term24350.getClass(), "peer", null);
        setField(term24350, term24350.getClass(), "parent", null);
        setField(term24350, term24350.getClass(), "appContext", null);
        setIntField(term24350, term24350.getClass(), "x", 0);
        setIntField(term24350, term24350.getClass(), "y", 0);
        setIntField(term24350, term24350.getClass(), "width", 0);
        setIntField(term24350, term24350.getClass(), "height", 0);
        setField(term24350, term24350.getClass(), "foreground", null);
        setField(term24350, term24350.getClass(), "background", null);
        setField(term24350, term24350.getClass(), "font", null);
        setField(term24350, term24350.getClass(), "peerFont", null);
        setField(term24350, term24350.getClass(), "cursor", null);
        setField(term24350, term24350.getClass(), "locale", null);
        setField(term24350, term24350.getClass(), "graphicsConfig", null);
        setField(term24350, term24350.getClass(), "bufferStrategy", null);
        setBooleanField(term24350, term24350.getClass(), "ignoreRepaint", false);
        setBooleanField(term24350, term24350.getClass(), "visible", false);
        setBooleanField(term24350, term24350.getClass(), "enabled", false);
        setBooleanField(term24350, term24350.getClass(), "valid", false);
        setField(term24350, term24350.getClass(), "dropTarget", null);
        setField(term24350, term24350.getClass(), "popups", null);
        setField(term24350, term24350.getClass(), "name", null);
        setBooleanField(term24350, term24350.getClass(), "nameExplicitlySet", false);
        setBooleanField(term24350, term24350.getClass(), "focusable", false);
        setIntField(term24350, term24350.getClass(), "isFocusTraversableOverridden", 0);
        setField(term24350, term24350.getClass(), "focusTraversalKeys", null);
        setBooleanField(term24350, term24350.getClass(), "focusTraversalKeysEnabled", false);
        setField(term24350, term24350.getClass(), "acc", null);
        setField(term24350, term24350.getClass(), "minSize", null);
        setBooleanField(term24350, term24350.getClass(), "minSizeSet", false);
        setField(term24350, term24350.getClass(), "prefSize", null);
        setBooleanField(term24350, term24350.getClass(), "prefSizeSet", false);
        setField(term24350, term24350.getClass(), "maxSize", null);
        setBooleanField(term24350, term24350.getClass(), "maxSizeSet", false);
        setField(term24350, term24350.getClass(), "componentOrientation", null);
        setBooleanField(term24350, term24350.getClass(), "newEventsOnly", false);
        setField(term24350, term24350.getClass(), "componentListener", null);
        setField(term24350, term24350.getClass(), "focusListener", null);
        setField(term24350, term24350.getClass(), "hierarchyListener", null);
        setField(term24350, term24350.getClass(), "hierarchyBoundsListener", null);
        setField(term24350, term24350.getClass(), "keyListener", null);
        setField(term24350, term24350.getClass(), "mouseListener", null);
        setField(term24350, term24350.getClass(), "mouseMotionListener", null);
        setField(term24350, term24350.getClass(), "mouseWheelListener", null);
        setField(term24350, term24350.getClass(), "inputMethodListener", null);
        setLongField(term24350, term24350.getClass(), "eventMask", 0L);
        setField(term24350, term24350.getClass(), "changeSupport", null);
        setField(term24350, term24350.getClass(), "objectLock", null);
        setBooleanField(term24350, term24350.getClass(), "isPacked", false);
        setIntField(term24350, term24350.getClass(), "boundsOp", 0);
        setField(term24350, term24350.getClass(), "compoundShape", null);
        setField(term24350, term24350.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term24350, term24350.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term24350, term24350.getClass(), "backgroundEraseDisabled", false);
        setField(term24350, term24350.getClass(), "eventCache", null);
        setBooleanField(term24350, term24350.getClass(), "coalescingEnabled", false);
        setBooleanField(term24350, term24350.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term24350, term24350.getClass(), "componentSerializedDataVersion", 0);
        setField(term24350, term24350.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.PlanetInfoLabel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSelectedConstruction", argTypes, term24350, args);
    }

};


