package org.openRealmOfStars.game.state;

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
import static org.openRealmOfStars.game.state.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PlanetListView_createUncolonizedPlanets_19621415718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term417668;

    public PlanetListView_createUncolonizedPlanets_19621415718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term417668 = newInstance(Class.forName("org.openRealmOfStars.game.state.PlanetListView"));
        setField(term417668, term417668.getClass(), "planets", null);
        setField(term417668, term417668.getClass(), "freePlanets", null);
        setField(term417668, term417668.getClass(), "planetInfo", null);
        setField(term417668, term417668.getClass(), "info", null);
        setField(term417668, term417668.getClass(), "map", null);
        setBooleanField(term417668, term417668.getClass(), "isAlignmentXSet", false);
        setFloatField(term417668, term417668.getClass(), "alignmentX", 0.0F);
        setBooleanField(term417668, term417668.getClass(), "isAlignmentYSet", false);
        setFloatField(term417668, term417668.getClass(), "alignmentY", 0.0F);
        setField(term417668, term417668.getClass(), "ui", null);
        setField(term417668, term417668.getClass(), "listenerList", null);
        setField(term417668, term417668.getClass(), "clientProperties", null);
        setField(term417668, term417668.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term417668, term417668.getClass(), "autoscrolls", false);
        setField(term417668, term417668.getClass(), "border", null);
        setIntField(term417668, term417668.getClass(), "flags", 0);
        setField(term417668, term417668.getClass(), "inputVerifier", null);
        setBooleanField(term417668, term417668.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term417668, term417668.getClass(), "paintingChild", null);
        setField(term417668, term417668.getClass(), "popupMenu", null);
        setField(term417668, term417668.getClass(), "revalidateRunnableScheduled", null);
        setField(term417668, term417668.getClass(), "focusInputMap", null);
        setField(term417668, term417668.getClass(), "ancestorInputMap", null);
        setField(term417668, term417668.getClass(), "windowInputMap", null);
        setField(term417668, term417668.getClass(), "actionMap", null);
        setField(term417668, term417668.getClass(), "aaHint", null);
        setField(term417668, term417668.getClass(), "lcdRenderingHint", null);
        setField(term417668, term417668.getClass(), "component", null);
        setField(term417668, term417668.getClass(), "layoutMgr", null);
        setField(term417668, term417668.getClass(), "dispatcher", null);
        setField(term417668, term417668.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term417668, term417668.getClass(), "focusCycleRoot", false);
        setBooleanField(term417668, term417668.getClass(), "focusTraversalPolicyProvider", false);
        setField(term417668, term417668.getClass(), "printingThreads", null);
        setBooleanField(term417668, term417668.getClass(), "printing", false);
        setField(term417668, term417668.getClass(), "containerListener", null);
        setIntField(term417668, term417668.getClass(), "listeningChildren", 0);
        setIntField(term417668, term417668.getClass(), "listeningBoundsChildren", 0);
        setIntField(term417668, term417668.getClass(), "descendantsCount", 0);
        setField(term417668, term417668.getClass(), "preserveBackgroundColor", null);
        setIntField(term417668, term417668.getClass(), "numOfHWComponents", 0);
        setIntField(term417668, term417668.getClass(), "numOfLWComponents", 0);
        setField(term417668, term417668.getClass(), "modalComp", null);
        setField(term417668, term417668.getClass(), "modalAppContext", null);
        setIntField(term417668, term417668.getClass(), "containerSerializedDataVersion", 0);
        setField(term417668, term417668.getClass(), "peer", null);
        setField(term417668, term417668.getClass(), "parent", null);
        setField(term417668, term417668.getClass(), "appContext", null);
        setIntField(term417668, term417668.getClass(), "x", 0);
        setIntField(term417668, term417668.getClass(), "y", 0);
        setIntField(term417668, term417668.getClass(), "width", 0);
        setIntField(term417668, term417668.getClass(), "height", 0);
        setField(term417668, term417668.getClass(), "foreground", null);
        setField(term417668, term417668.getClass(), "background", null);
        setField(term417668, term417668.getClass(), "font", null);
        setField(term417668, term417668.getClass(), "peerFont", null);
        setField(term417668, term417668.getClass(), "cursor", null);
        setField(term417668, term417668.getClass(), "locale", null);
        setField(term417668, term417668.getClass(), "graphicsConfig", null);
        setField(term417668, term417668.getClass(), "bufferStrategy", null);
        setBooleanField(term417668, term417668.getClass(), "ignoreRepaint", false);
        setBooleanField(term417668, term417668.getClass(), "visible", false);
        setBooleanField(term417668, term417668.getClass(), "enabled", false);
        setBooleanField(term417668, term417668.getClass(), "valid", false);
        setField(term417668, term417668.getClass(), "dropTarget", null);
        setField(term417668, term417668.getClass(), "popups", null);
        setField(term417668, term417668.getClass(), "name", null);
        setBooleanField(term417668, term417668.getClass(), "nameExplicitlySet", false);
        setBooleanField(term417668, term417668.getClass(), "focusable", false);
        setIntField(term417668, term417668.getClass(), "isFocusTraversableOverridden", 0);
        setField(term417668, term417668.getClass(), "focusTraversalKeys", null);
        setBooleanField(term417668, term417668.getClass(), "focusTraversalKeysEnabled", false);
        setField(term417668, term417668.getClass(), "acc", null);
        setField(term417668, term417668.getClass(), "minSize", null);
        setBooleanField(term417668, term417668.getClass(), "minSizeSet", false);
        setField(term417668, term417668.getClass(), "prefSize", null);
        setBooleanField(term417668, term417668.getClass(), "prefSizeSet", false);
        setField(term417668, term417668.getClass(), "maxSize", null);
        setBooleanField(term417668, term417668.getClass(), "maxSizeSet", false);
        setField(term417668, term417668.getClass(), "componentOrientation", null);
        setBooleanField(term417668, term417668.getClass(), "newEventsOnly", false);
        setField(term417668, term417668.getClass(), "componentListener", null);
        setField(term417668, term417668.getClass(), "focusListener", null);
        setField(term417668, term417668.getClass(), "hierarchyListener", null);
        setField(term417668, term417668.getClass(), "hierarchyBoundsListener", null);
        setField(term417668, term417668.getClass(), "keyListener", null);
        setField(term417668, term417668.getClass(), "mouseListener", null);
        setField(term417668, term417668.getClass(), "mouseMotionListener", null);
        setField(term417668, term417668.getClass(), "mouseWheelListener", null);
        setField(term417668, term417668.getClass(), "inputMethodListener", null);
        setLongField(term417668, term417668.getClass(), "eventMask", 0L);
        setField(term417668, term417668.getClass(), "changeSupport", null);
        setField(term417668, term417668.getClass(), "objectLock", null);
        setBooleanField(term417668, term417668.getClass(), "isPacked", false);
        setIntField(term417668, term417668.getClass(), "boundsOp", 0);
        setField(term417668, term417668.getClass(), "compoundShape", null);
        setField(term417668, term417668.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term417668, term417668.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term417668, term417668.getClass(), "backgroundEraseDisabled", false);
        setField(term417668, term417668.getClass(), "eventCache", null);
        setBooleanField(term417668, term417668.getClass(), "coalescingEnabled", false);
        setBooleanField(term417668, term417668.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term417668, term417668.getClass(), "componentSerializedDataVersion", 0);
        setField(term417668, term417668.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.PlanetListView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionListener");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createUncolonizedPlanets", argTypes, term417668, args);
    }

};


