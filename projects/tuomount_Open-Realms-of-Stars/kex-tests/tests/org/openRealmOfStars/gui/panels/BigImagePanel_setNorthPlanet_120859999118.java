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

public class BigImagePanel_setNorthPlanet_120859999118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100022;

    public BigImagePanel_setNorthPlanet_120859999118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100022 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel"));
        setField(term100022, term100022.getClass(), "backgroundImg", null);
        setField(term100022, term100022.getClass(), "northPlanetImg", null);
        setField(term100022, term100022.getClass(), "southPlanetImg", null);
        setField(term100022, term100022.getClass(), "westPlanetImg", null);
        setField(term100022, term100022.getClass(), "eastPlanetImg", null);
        setField(term100022, term100022.getClass(), "shipImages", null);
        setBooleanField(term100022, term100022.getClass(), "drawStarField", false);
        setField(term100022, term100022.getClass(), "planet", null);
        setField(term100022, term100022.getClass(), "title", null);
        setField(term100022, term100022.getClass(), "animation", null);
        setField(term100022, term100022.getClass(), "player", null);
        setField(term100022, term100022.getClass(), "textInformation", null);
        setDoubleField(term100022, term100022.getClass(), "orbitalX", 0.0);
        setDoubleField(term100022, term100022.getClass(), "orbitalZ", 0.0);
        setIntField(term100022, term100022.getClass(), "orbitalY", 0);
        setDoubleField(term100022, term100022.getClass(), "orbitalAngle", 0.0);
        setField(term100022, term100022.getClass(), "customOrbital", null);
        setBooleanField(term100022, term100022.getClass(), "textInMiddle", false);
        setBooleanField(term100022, term100022.getClass(), "isAlignmentXSet", false);
        setFloatField(term100022, term100022.getClass(), "alignmentX", 0.0F);
        setBooleanField(term100022, term100022.getClass(), "isAlignmentYSet", false);
        setFloatField(term100022, term100022.getClass(), "alignmentY", 0.0F);
        setField(term100022, term100022.getClass(), "ui", null);
        setField(term100022, term100022.getClass(), "listenerList", null);
        setField(term100022, term100022.getClass(), "clientProperties", null);
        setField(term100022, term100022.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term100022, term100022.getClass(), "autoscrolls", false);
        setField(term100022, term100022.getClass(), "border", null);
        setIntField(term100022, term100022.getClass(), "flags", 0);
        setField(term100022, term100022.getClass(), "inputVerifier", null);
        setBooleanField(term100022, term100022.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term100022, term100022.getClass(), "paintingChild", null);
        setField(term100022, term100022.getClass(), "popupMenu", null);
        setField(term100022, term100022.getClass(), "revalidateRunnableScheduled", null);
        setField(term100022, term100022.getClass(), "focusInputMap", null);
        setField(term100022, term100022.getClass(), "ancestorInputMap", null);
        setField(term100022, term100022.getClass(), "windowInputMap", null);
        setField(term100022, term100022.getClass(), "actionMap", null);
        setField(term100022, term100022.getClass(), "aaHint", null);
        setField(term100022, term100022.getClass(), "lcdRenderingHint", null);
        setField(term100022, term100022.getClass(), "component", null);
        setField(term100022, term100022.getClass(), "layoutMgr", null);
        setField(term100022, term100022.getClass(), "dispatcher", null);
        setField(term100022, term100022.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term100022, term100022.getClass(), "focusCycleRoot", false);
        setBooleanField(term100022, term100022.getClass(), "focusTraversalPolicyProvider", false);
        setField(term100022, term100022.getClass(), "printingThreads", null);
        setBooleanField(term100022, term100022.getClass(), "printing", false);
        setField(term100022, term100022.getClass(), "containerListener", null);
        setIntField(term100022, term100022.getClass(), "listeningChildren", 0);
        setIntField(term100022, term100022.getClass(), "listeningBoundsChildren", 0);
        setIntField(term100022, term100022.getClass(), "descendantsCount", 0);
        setField(term100022, term100022.getClass(), "preserveBackgroundColor", null);
        setIntField(term100022, term100022.getClass(), "numOfHWComponents", 0);
        setIntField(term100022, term100022.getClass(), "numOfLWComponents", 0);
        setField(term100022, term100022.getClass(), "modalComp", null);
        setField(term100022, term100022.getClass(), "modalAppContext", null);
        setIntField(term100022, term100022.getClass(), "containerSerializedDataVersion", 0);
        setField(term100022, term100022.getClass(), "peer", null);
        setField(term100022, term100022.getClass(), "parent", null);
        setField(term100022, term100022.getClass(), "appContext", null);
        setIntField(term100022, term100022.getClass(), "x", 0);
        setIntField(term100022, term100022.getClass(), "y", 0);
        setIntField(term100022, term100022.getClass(), "width", 0);
        setIntField(term100022, term100022.getClass(), "height", 0);
        setField(term100022, term100022.getClass(), "foreground", null);
        setField(term100022, term100022.getClass(), "background", null);
        setField(term100022, term100022.getClass(), "font", null);
        setField(term100022, term100022.getClass(), "peerFont", null);
        setField(term100022, term100022.getClass(), "cursor", null);
        setField(term100022, term100022.getClass(), "locale", null);
        setField(term100022, term100022.getClass(), "graphicsConfig", null);
        setField(term100022, term100022.getClass(), "bufferStrategy", null);
        setBooleanField(term100022, term100022.getClass(), "ignoreRepaint", false);
        setBooleanField(term100022, term100022.getClass(), "visible", false);
        setBooleanField(term100022, term100022.getClass(), "enabled", false);
        setBooleanField(term100022, term100022.getClass(), "valid", false);
        setField(term100022, term100022.getClass(), "dropTarget", null);
        setField(term100022, term100022.getClass(), "popups", null);
        setField(term100022, term100022.getClass(), "name", null);
        setBooleanField(term100022, term100022.getClass(), "nameExplicitlySet", false);
        setBooleanField(term100022, term100022.getClass(), "focusable", false);
        setIntField(term100022, term100022.getClass(), "isFocusTraversableOverridden", 0);
        setField(term100022, term100022.getClass(), "focusTraversalKeys", null);
        setBooleanField(term100022, term100022.getClass(), "focusTraversalKeysEnabled", false);
        setField(term100022, term100022.getClass(), "acc", null);
        setField(term100022, term100022.getClass(), "minSize", null);
        setBooleanField(term100022, term100022.getClass(), "minSizeSet", false);
        setField(term100022, term100022.getClass(), "prefSize", null);
        setBooleanField(term100022, term100022.getClass(), "prefSizeSet", false);
        setField(term100022, term100022.getClass(), "maxSize", null);
        setBooleanField(term100022, term100022.getClass(), "maxSizeSet", false);
        setField(term100022, term100022.getClass(), "componentOrientation", null);
        setBooleanField(term100022, term100022.getClass(), "newEventsOnly", false);
        setField(term100022, term100022.getClass(), "componentListener", null);
        setField(term100022, term100022.getClass(), "focusListener", null);
        setField(term100022, term100022.getClass(), "hierarchyListener", null);
        setField(term100022, term100022.getClass(), "hierarchyBoundsListener", null);
        setField(term100022, term100022.getClass(), "keyListener", null);
        setField(term100022, term100022.getClass(), "mouseListener", null);
        setField(term100022, term100022.getClass(), "mouseMotionListener", null);
        setField(term100022, term100022.getClass(), "mouseWheelListener", null);
        setField(term100022, term100022.getClass(), "inputMethodListener", null);
        setLongField(term100022, term100022.getClass(), "eventMask", 0L);
        setField(term100022, term100022.getClass(), "changeSupport", null);
        setField(term100022, term100022.getClass(), "objectLock", null);
        setBooleanField(term100022, term100022.getClass(), "isPacked", false);
        setIntField(term100022, term100022.getClass(), "boundsOp", 0);
        setField(term100022, term100022.getClass(), "compoundShape", null);
        setField(term100022, term100022.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term100022, term100022.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term100022, term100022.getClass(), "backgroundEraseDisabled", false);
        setField(term100022, term100022.getClass(), "eventCache", null);
        setBooleanField(term100022, term100022.getClass(), "coalescingEnabled", false);
        setBooleanField(term100022, term100022.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term100022, term100022.getClass(), "componentSerializedDataVersion", 0);
        setField(term100022, term100022.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setNorthPlanet", argTypes, term100022, args);
    }

};


