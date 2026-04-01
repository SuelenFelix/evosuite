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

public class PlanetListView_createColonizedPlanets_138946987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term417627;

    public PlanetListView_createColonizedPlanets_138946987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term417627 = newInstance(Class.forName("org.openRealmOfStars.game.state.PlanetListView"));
        setField(term417627, term417627.getClass(), "planets", null);
        setField(term417627, term417627.getClass(), "freePlanets", null);
        setField(term417627, term417627.getClass(), "planetInfo", null);
        setField(term417627, term417627.getClass(), "info", null);
        setField(term417627, term417627.getClass(), "map", null);
        setBooleanField(term417627, term417627.getClass(), "isAlignmentXSet", false);
        setFloatField(term417627, term417627.getClass(), "alignmentX", 0.0F);
        setBooleanField(term417627, term417627.getClass(), "isAlignmentYSet", false);
        setFloatField(term417627, term417627.getClass(), "alignmentY", 0.0F);
        setField(term417627, term417627.getClass(), "ui", null);
        setField(term417627, term417627.getClass(), "listenerList", null);
        setField(term417627, term417627.getClass(), "clientProperties", null);
        setField(term417627, term417627.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term417627, term417627.getClass(), "autoscrolls", false);
        setField(term417627, term417627.getClass(), "border", null);
        setIntField(term417627, term417627.getClass(), "flags", 0);
        setField(term417627, term417627.getClass(), "inputVerifier", null);
        setBooleanField(term417627, term417627.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term417627, term417627.getClass(), "paintingChild", null);
        setField(term417627, term417627.getClass(), "popupMenu", null);
        setField(term417627, term417627.getClass(), "revalidateRunnableScheduled", null);
        setField(term417627, term417627.getClass(), "focusInputMap", null);
        setField(term417627, term417627.getClass(), "ancestorInputMap", null);
        setField(term417627, term417627.getClass(), "windowInputMap", null);
        setField(term417627, term417627.getClass(), "actionMap", null);
        setField(term417627, term417627.getClass(), "aaHint", null);
        setField(term417627, term417627.getClass(), "lcdRenderingHint", null);
        setField(term417627, term417627.getClass(), "component", null);
        setField(term417627, term417627.getClass(), "layoutMgr", null);
        setField(term417627, term417627.getClass(), "dispatcher", null);
        setField(term417627, term417627.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term417627, term417627.getClass(), "focusCycleRoot", false);
        setBooleanField(term417627, term417627.getClass(), "focusTraversalPolicyProvider", false);
        setField(term417627, term417627.getClass(), "printingThreads", null);
        setBooleanField(term417627, term417627.getClass(), "printing", false);
        setField(term417627, term417627.getClass(), "containerListener", null);
        setIntField(term417627, term417627.getClass(), "listeningChildren", 0);
        setIntField(term417627, term417627.getClass(), "listeningBoundsChildren", 0);
        setIntField(term417627, term417627.getClass(), "descendantsCount", 0);
        setField(term417627, term417627.getClass(), "preserveBackgroundColor", null);
        setIntField(term417627, term417627.getClass(), "numOfHWComponents", 0);
        setIntField(term417627, term417627.getClass(), "numOfLWComponents", 0);
        setField(term417627, term417627.getClass(), "modalComp", null);
        setField(term417627, term417627.getClass(), "modalAppContext", null);
        setIntField(term417627, term417627.getClass(), "containerSerializedDataVersion", 0);
        setField(term417627, term417627.getClass(), "peer", null);
        setField(term417627, term417627.getClass(), "parent", null);
        setField(term417627, term417627.getClass(), "appContext", null);
        setIntField(term417627, term417627.getClass(), "x", 0);
        setIntField(term417627, term417627.getClass(), "y", 0);
        setIntField(term417627, term417627.getClass(), "width", 0);
        setIntField(term417627, term417627.getClass(), "height", 0);
        setField(term417627, term417627.getClass(), "foreground", null);
        setField(term417627, term417627.getClass(), "background", null);
        setField(term417627, term417627.getClass(), "font", null);
        setField(term417627, term417627.getClass(), "peerFont", null);
        setField(term417627, term417627.getClass(), "cursor", null);
        setField(term417627, term417627.getClass(), "locale", null);
        setField(term417627, term417627.getClass(), "graphicsConfig", null);
        setField(term417627, term417627.getClass(), "bufferStrategy", null);
        setBooleanField(term417627, term417627.getClass(), "ignoreRepaint", false);
        setBooleanField(term417627, term417627.getClass(), "visible", false);
        setBooleanField(term417627, term417627.getClass(), "enabled", false);
        setBooleanField(term417627, term417627.getClass(), "valid", false);
        setField(term417627, term417627.getClass(), "dropTarget", null);
        setField(term417627, term417627.getClass(), "popups", null);
        setField(term417627, term417627.getClass(), "name", null);
        setBooleanField(term417627, term417627.getClass(), "nameExplicitlySet", false);
        setBooleanField(term417627, term417627.getClass(), "focusable", false);
        setIntField(term417627, term417627.getClass(), "isFocusTraversableOverridden", 0);
        setField(term417627, term417627.getClass(), "focusTraversalKeys", null);
        setBooleanField(term417627, term417627.getClass(), "focusTraversalKeysEnabled", false);
        setField(term417627, term417627.getClass(), "acc", null);
        setField(term417627, term417627.getClass(), "minSize", null);
        setBooleanField(term417627, term417627.getClass(), "minSizeSet", false);
        setField(term417627, term417627.getClass(), "prefSize", null);
        setBooleanField(term417627, term417627.getClass(), "prefSizeSet", false);
        setField(term417627, term417627.getClass(), "maxSize", null);
        setBooleanField(term417627, term417627.getClass(), "maxSizeSet", false);
        setField(term417627, term417627.getClass(), "componentOrientation", null);
        setBooleanField(term417627, term417627.getClass(), "newEventsOnly", false);
        setField(term417627, term417627.getClass(), "componentListener", null);
        setField(term417627, term417627.getClass(), "focusListener", null);
        setField(term417627, term417627.getClass(), "hierarchyListener", null);
        setField(term417627, term417627.getClass(), "hierarchyBoundsListener", null);
        setField(term417627, term417627.getClass(), "keyListener", null);
        setField(term417627, term417627.getClass(), "mouseListener", null);
        setField(term417627, term417627.getClass(), "mouseMotionListener", null);
        setField(term417627, term417627.getClass(), "mouseWheelListener", null);
        setField(term417627, term417627.getClass(), "inputMethodListener", null);
        setLongField(term417627, term417627.getClass(), "eventMask", 0L);
        setField(term417627, term417627.getClass(), "changeSupport", null);
        setField(term417627, term417627.getClass(), "objectLock", null);
        setBooleanField(term417627, term417627.getClass(), "isPacked", false);
        setIntField(term417627, term417627.getClass(), "boundsOp", 0);
        setField(term417627, term417627.getClass(), "compoundShape", null);
        setField(term417627, term417627.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term417627, term417627.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term417627, term417627.getClass(), "backgroundEraseDisabled", false);
        setField(term417627, term417627.getClass(), "eventCache", null);
        setBooleanField(term417627, term417627.getClass(), "coalescingEnabled", false);
        setBooleanField(term417627, term417627.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term417627, term417627.getClass(), "componentSerializedDataVersion", 0);
        setField(term417627, term417627.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.PlanetListView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionListener");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createColonizedPlanets", argTypes, term417627, args);
    }

};


