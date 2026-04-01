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

public class BigSpherePanel_setNorthPlanet_132127692939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65338;

    public BigSpherePanel_setNorthPlanet_132127692939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65338 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.BigSpherePanel"));
        setField(term65338, term65338.getClass(), "backgroundImg", null);
        setField(term65338, term65338.getClass(), "northPlanetImg", null);
        setField(term65338, term65338.getClass(), "southPlanetImg", null);
        setField(term65338, term65338.getClass(), "westPlanetImg", null);
        setField(term65338, term65338.getClass(), "eastPlanetImg", null);
        setField(term65338, term65338.getClass(), "shipImages", null);
        setBooleanField(term65338, term65338.getClass(), "drawStarField", false);
        setField(term65338, term65338.getClass(), "title", null);
        setField(term65338, term65338.getClass(), "animation", null);
        setField(term65338, term65338.getClass(), "player", null);
        setField(term65338, term65338.getClass(), "textInformation", null);
        setDoubleField(term65338, term65338.getClass(), "orbitalX", 0.0);
        setDoubleField(term65338, term65338.getClass(), "orbitalZ", 0.0);
        setIntField(term65338, term65338.getClass(), "orbitalY", 0);
        setDoubleField(term65338, term65338.getClass(), "orbitalAngle", 0.0);
        setField(term65338, term65338.getClass(), "customOrbital", null);
        setBooleanField(term65338, term65338.getClass(), "textInMiddle", false);
        setIntField(term65338, term65338.getClass(), "planetTextureOffset", 0);
        setBooleanField(term65338, term65338.getClass(), "isAlignmentXSet", false);
        setFloatField(term65338, term65338.getClass(), "alignmentX", 0.0F);
        setBooleanField(term65338, term65338.getClass(), "isAlignmentYSet", false);
        setFloatField(term65338, term65338.getClass(), "alignmentY", 0.0F);
        setField(term65338, term65338.getClass(), "ui", null);
        setField(term65338, term65338.getClass(), "listenerList", null);
        setField(term65338, term65338.getClass(), "clientProperties", null);
        setField(term65338, term65338.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term65338, term65338.getClass(), "autoscrolls", false);
        setField(term65338, term65338.getClass(), "border", null);
        setIntField(term65338, term65338.getClass(), "flags", 0);
        setField(term65338, term65338.getClass(), "inputVerifier", null);
        setBooleanField(term65338, term65338.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term65338, term65338.getClass(), "paintingChild", null);
        setField(term65338, term65338.getClass(), "popupMenu", null);
        setField(term65338, term65338.getClass(), "revalidateRunnableScheduled", null);
        setField(term65338, term65338.getClass(), "focusInputMap", null);
        setField(term65338, term65338.getClass(), "ancestorInputMap", null);
        setField(term65338, term65338.getClass(), "windowInputMap", null);
        setField(term65338, term65338.getClass(), "actionMap", null);
        setField(term65338, term65338.getClass(), "aaHint", null);
        setField(term65338, term65338.getClass(), "lcdRenderingHint", null);
        setField(term65338, term65338.getClass(), "component", null);
        setField(term65338, term65338.getClass(), "layoutMgr", null);
        setField(term65338, term65338.getClass(), "dispatcher", null);
        setField(term65338, term65338.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term65338, term65338.getClass(), "focusCycleRoot", false);
        setBooleanField(term65338, term65338.getClass(), "focusTraversalPolicyProvider", false);
        setField(term65338, term65338.getClass(), "printingThreads", null);
        setBooleanField(term65338, term65338.getClass(), "printing", false);
        setField(term65338, term65338.getClass(), "containerListener", null);
        setIntField(term65338, term65338.getClass(), "listeningChildren", 0);
        setIntField(term65338, term65338.getClass(), "listeningBoundsChildren", 0);
        setIntField(term65338, term65338.getClass(), "descendantsCount", 0);
        setField(term65338, term65338.getClass(), "preserveBackgroundColor", null);
        setIntField(term65338, term65338.getClass(), "numOfHWComponents", 0);
        setIntField(term65338, term65338.getClass(), "numOfLWComponents", 0);
        setField(term65338, term65338.getClass(), "modalComp", null);
        setField(term65338, term65338.getClass(), "modalAppContext", null);
        setIntField(term65338, term65338.getClass(), "containerSerializedDataVersion", 0);
        setField(term65338, term65338.getClass(), "peer", null);
        setField(term65338, term65338.getClass(), "parent", null);
        setField(term65338, term65338.getClass(), "appContext", null);
        setIntField(term65338, term65338.getClass(), "x", 0);
        setIntField(term65338, term65338.getClass(), "y", 0);
        setIntField(term65338, term65338.getClass(), "width", 0);
        setIntField(term65338, term65338.getClass(), "height", 0);
        setField(term65338, term65338.getClass(), "foreground", null);
        setField(term65338, term65338.getClass(), "background", null);
        setField(term65338, term65338.getClass(), "font", null);
        setField(term65338, term65338.getClass(), "peerFont", null);
        setField(term65338, term65338.getClass(), "cursor", null);
        setField(term65338, term65338.getClass(), "locale", null);
        setField(term65338, term65338.getClass(), "graphicsConfig", null);
        setField(term65338, term65338.getClass(), "bufferStrategy", null);
        setBooleanField(term65338, term65338.getClass(), "ignoreRepaint", false);
        setBooleanField(term65338, term65338.getClass(), "visible", false);
        setBooleanField(term65338, term65338.getClass(), "enabled", false);
        setBooleanField(term65338, term65338.getClass(), "valid", false);
        setField(term65338, term65338.getClass(), "dropTarget", null);
        setField(term65338, term65338.getClass(), "popups", null);
        setField(term65338, term65338.getClass(), "name", null);
        setBooleanField(term65338, term65338.getClass(), "nameExplicitlySet", false);
        setBooleanField(term65338, term65338.getClass(), "focusable", false);
        setIntField(term65338, term65338.getClass(), "isFocusTraversableOverridden", 0);
        setField(term65338, term65338.getClass(), "focusTraversalKeys", null);
        setBooleanField(term65338, term65338.getClass(), "focusTraversalKeysEnabled", false);
        setField(term65338, term65338.getClass(), "acc", null);
        setField(term65338, term65338.getClass(), "minSize", null);
        setBooleanField(term65338, term65338.getClass(), "minSizeSet", false);
        setField(term65338, term65338.getClass(), "prefSize", null);
        setBooleanField(term65338, term65338.getClass(), "prefSizeSet", false);
        setField(term65338, term65338.getClass(), "maxSize", null);
        setBooleanField(term65338, term65338.getClass(), "maxSizeSet", false);
        setField(term65338, term65338.getClass(), "componentOrientation", null);
        setBooleanField(term65338, term65338.getClass(), "newEventsOnly", false);
        setField(term65338, term65338.getClass(), "componentListener", null);
        setField(term65338, term65338.getClass(), "focusListener", null);
        setField(term65338, term65338.getClass(), "hierarchyListener", null);
        setField(term65338, term65338.getClass(), "hierarchyBoundsListener", null);
        setField(term65338, term65338.getClass(), "keyListener", null);
        setField(term65338, term65338.getClass(), "mouseListener", null);
        setField(term65338, term65338.getClass(), "mouseMotionListener", null);
        setField(term65338, term65338.getClass(), "mouseWheelListener", null);
        setField(term65338, term65338.getClass(), "inputMethodListener", null);
        setLongField(term65338, term65338.getClass(), "eventMask", 0L);
        setField(term65338, term65338.getClass(), "changeSupport", null);
        setField(term65338, term65338.getClass(), "objectLock", null);
        setBooleanField(term65338, term65338.getClass(), "isPacked", false);
        setIntField(term65338, term65338.getClass(), "boundsOp", 0);
        setField(term65338, term65338.getClass(), "compoundShape", null);
        setField(term65338, term65338.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term65338, term65338.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term65338, term65338.getClass(), "backgroundEraseDisabled", false);
        setField(term65338, term65338.getClass(), "eventCache", null);
        setBooleanField(term65338, term65338.getClass(), "coalescingEnabled", false);
        setBooleanField(term65338, term65338.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term65338, term65338.getClass(), "componentSerializedDataVersion", 0);
        setField(term65338, term65338.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigSpherePanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setNorthPlanet", argTypes, term65338, args);
    }

};


