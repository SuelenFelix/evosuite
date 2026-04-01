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

public class BigSpherePanel_setDistantPlanet_100305642915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34756;

    public BigSpherePanel_setDistantPlanet_100305642915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34756 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.BigSpherePanel"));
        setField(term34756, term34756.getClass(), "backgroundImg", null);
        setField(term34756, term34756.getClass(), "northPlanetImg", null);
        setField(term34756, term34756.getClass(), "southPlanetImg", null);
        setField(term34756, term34756.getClass(), "westPlanetImg", null);
        setField(term34756, term34756.getClass(), "eastPlanetImg", null);
        setField(term34756, term34756.getClass(), "shipImages", null);
        setBooleanField(term34756, term34756.getClass(), "drawStarField", false);
        setField(term34756, term34756.getClass(), "title", null);
        setField(term34756, term34756.getClass(), "animation", null);
        setField(term34756, term34756.getClass(), "player", null);
        setField(term34756, term34756.getClass(), "textInformation", null);
        setDoubleField(term34756, term34756.getClass(), "orbitalX", 0.0);
        setDoubleField(term34756, term34756.getClass(), "orbitalZ", 0.0);
        setIntField(term34756, term34756.getClass(), "orbitalY", 0);
        setDoubleField(term34756, term34756.getClass(), "orbitalAngle", 0.0);
        setField(term34756, term34756.getClass(), "customOrbital", null);
        setBooleanField(term34756, term34756.getClass(), "textInMiddle", false);
        setIntField(term34756, term34756.getClass(), "planetTextureOffset", 0);
        setBooleanField(term34756, term34756.getClass(), "isAlignmentXSet", false);
        setFloatField(term34756, term34756.getClass(), "alignmentX", 0.0F);
        setBooleanField(term34756, term34756.getClass(), "isAlignmentYSet", false);
        setFloatField(term34756, term34756.getClass(), "alignmentY", 0.0F);
        setField(term34756, term34756.getClass(), "ui", null);
        setField(term34756, term34756.getClass(), "listenerList", null);
        setField(term34756, term34756.getClass(), "clientProperties", null);
        setField(term34756, term34756.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term34756, term34756.getClass(), "autoscrolls", false);
        setField(term34756, term34756.getClass(), "border", null);
        setIntField(term34756, term34756.getClass(), "flags", 0);
        setField(term34756, term34756.getClass(), "inputVerifier", null);
        setBooleanField(term34756, term34756.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term34756, term34756.getClass(), "paintingChild", null);
        setField(term34756, term34756.getClass(), "popupMenu", null);
        setField(term34756, term34756.getClass(), "revalidateRunnableScheduled", null);
        setField(term34756, term34756.getClass(), "focusInputMap", null);
        setField(term34756, term34756.getClass(), "ancestorInputMap", null);
        setField(term34756, term34756.getClass(), "windowInputMap", null);
        setField(term34756, term34756.getClass(), "actionMap", null);
        setField(term34756, term34756.getClass(), "aaHint", null);
        setField(term34756, term34756.getClass(), "lcdRenderingHint", null);
        setField(term34756, term34756.getClass(), "component", null);
        setField(term34756, term34756.getClass(), "layoutMgr", null);
        setField(term34756, term34756.getClass(), "dispatcher", null);
        setField(term34756, term34756.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term34756, term34756.getClass(), "focusCycleRoot", false);
        setBooleanField(term34756, term34756.getClass(), "focusTraversalPolicyProvider", false);
        setField(term34756, term34756.getClass(), "printingThreads", null);
        setBooleanField(term34756, term34756.getClass(), "printing", false);
        setField(term34756, term34756.getClass(), "containerListener", null);
        setIntField(term34756, term34756.getClass(), "listeningChildren", 0);
        setIntField(term34756, term34756.getClass(), "listeningBoundsChildren", 0);
        setIntField(term34756, term34756.getClass(), "descendantsCount", 0);
        setField(term34756, term34756.getClass(), "preserveBackgroundColor", null);
        setIntField(term34756, term34756.getClass(), "numOfHWComponents", 0);
        setIntField(term34756, term34756.getClass(), "numOfLWComponents", 0);
        setField(term34756, term34756.getClass(), "modalComp", null);
        setField(term34756, term34756.getClass(), "modalAppContext", null);
        setIntField(term34756, term34756.getClass(), "containerSerializedDataVersion", 0);
        setField(term34756, term34756.getClass(), "peer", null);
        setField(term34756, term34756.getClass(), "parent", null);
        setField(term34756, term34756.getClass(), "appContext", null);
        setIntField(term34756, term34756.getClass(), "x", 0);
        setIntField(term34756, term34756.getClass(), "y", 0);
        setIntField(term34756, term34756.getClass(), "width", 0);
        setIntField(term34756, term34756.getClass(), "height", 0);
        setField(term34756, term34756.getClass(), "foreground", null);
        setField(term34756, term34756.getClass(), "background", null);
        setField(term34756, term34756.getClass(), "font", null);
        setField(term34756, term34756.getClass(), "peerFont", null);
        setField(term34756, term34756.getClass(), "cursor", null);
        setField(term34756, term34756.getClass(), "locale", null);
        setField(term34756, term34756.getClass(), "graphicsConfig", null);
        setField(term34756, term34756.getClass(), "bufferStrategy", null);
        setBooleanField(term34756, term34756.getClass(), "ignoreRepaint", false);
        setBooleanField(term34756, term34756.getClass(), "visible", false);
        setBooleanField(term34756, term34756.getClass(), "enabled", false);
        setBooleanField(term34756, term34756.getClass(), "valid", false);
        setField(term34756, term34756.getClass(), "dropTarget", null);
        setField(term34756, term34756.getClass(), "popups", null);
        setField(term34756, term34756.getClass(), "name", null);
        setBooleanField(term34756, term34756.getClass(), "nameExplicitlySet", false);
        setBooleanField(term34756, term34756.getClass(), "focusable", false);
        setIntField(term34756, term34756.getClass(), "isFocusTraversableOverridden", 0);
        setField(term34756, term34756.getClass(), "focusTraversalKeys", null);
        setBooleanField(term34756, term34756.getClass(), "focusTraversalKeysEnabled", false);
        setField(term34756, term34756.getClass(), "acc", null);
        setField(term34756, term34756.getClass(), "minSize", null);
        setBooleanField(term34756, term34756.getClass(), "minSizeSet", false);
        setField(term34756, term34756.getClass(), "prefSize", null);
        setBooleanField(term34756, term34756.getClass(), "prefSizeSet", false);
        setField(term34756, term34756.getClass(), "maxSize", null);
        setBooleanField(term34756, term34756.getClass(), "maxSizeSet", false);
        setField(term34756, term34756.getClass(), "componentOrientation", null);
        setBooleanField(term34756, term34756.getClass(), "newEventsOnly", false);
        setField(term34756, term34756.getClass(), "componentListener", null);
        setField(term34756, term34756.getClass(), "focusListener", null);
        setField(term34756, term34756.getClass(), "hierarchyListener", null);
        setField(term34756, term34756.getClass(), "hierarchyBoundsListener", null);
        setField(term34756, term34756.getClass(), "keyListener", null);
        setField(term34756, term34756.getClass(), "mouseListener", null);
        setField(term34756, term34756.getClass(), "mouseMotionListener", null);
        setField(term34756, term34756.getClass(), "mouseWheelListener", null);
        setField(term34756, term34756.getClass(), "inputMethodListener", null);
        setLongField(term34756, term34756.getClass(), "eventMask", 0L);
        setField(term34756, term34756.getClass(), "changeSupport", null);
        setField(term34756, term34756.getClass(), "objectLock", null);
        setBooleanField(term34756, term34756.getClass(), "isPacked", false);
        setIntField(term34756, term34756.getClass(), "boundsOp", 0);
        setField(term34756, term34756.getClass(), "compoundShape", null);
        setField(term34756, term34756.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term34756, term34756.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term34756, term34756.getClass(), "backgroundEraseDisabled", false);
        setField(term34756, term34756.getClass(), "eventCache", null);
        setBooleanField(term34756, term34756.getClass(), "coalescingEnabled", false);
        setBooleanField(term34756, term34756.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term34756, term34756.getClass(), "componentSerializedDataVersion", 0);
        setField(term34756, term34756.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigSpherePanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDistantPlanet", argTypes, term34756, args);
    }

};


