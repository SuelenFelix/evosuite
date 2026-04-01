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

public class BigSpherePanel_setEastPlanet_39812205118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50611;

    public BigSpherePanel_setEastPlanet_39812205118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50611 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.BigSpherePanel"));
        setField(term50611, term50611.getClass(), "backgroundImg", null);
        setField(term50611, term50611.getClass(), "northPlanetImg", null);
        setField(term50611, term50611.getClass(), "southPlanetImg", null);
        setField(term50611, term50611.getClass(), "westPlanetImg", null);
        setField(term50611, term50611.getClass(), "eastPlanetImg", null);
        setField(term50611, term50611.getClass(), "shipImages", null);
        setBooleanField(term50611, term50611.getClass(), "drawStarField", false);
        setField(term50611, term50611.getClass(), "title", null);
        setField(term50611, term50611.getClass(), "animation", null);
        setField(term50611, term50611.getClass(), "player", null);
        setField(term50611, term50611.getClass(), "textInformation", null);
        setDoubleField(term50611, term50611.getClass(), "orbitalX", 0.0);
        setDoubleField(term50611, term50611.getClass(), "orbitalZ", 0.0);
        setIntField(term50611, term50611.getClass(), "orbitalY", 0);
        setDoubleField(term50611, term50611.getClass(), "orbitalAngle", 0.0);
        setField(term50611, term50611.getClass(), "customOrbital", null);
        setBooleanField(term50611, term50611.getClass(), "textInMiddle", false);
        setIntField(term50611, term50611.getClass(), "planetTextureOffset", 0);
        setBooleanField(term50611, term50611.getClass(), "isAlignmentXSet", false);
        setFloatField(term50611, term50611.getClass(), "alignmentX", 0.0F);
        setBooleanField(term50611, term50611.getClass(), "isAlignmentYSet", false);
        setFloatField(term50611, term50611.getClass(), "alignmentY", 0.0F);
        setField(term50611, term50611.getClass(), "ui", null);
        setField(term50611, term50611.getClass(), "listenerList", null);
        setField(term50611, term50611.getClass(), "clientProperties", null);
        setField(term50611, term50611.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term50611, term50611.getClass(), "autoscrolls", false);
        setField(term50611, term50611.getClass(), "border", null);
        setIntField(term50611, term50611.getClass(), "flags", 0);
        setField(term50611, term50611.getClass(), "inputVerifier", null);
        setBooleanField(term50611, term50611.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term50611, term50611.getClass(), "paintingChild", null);
        setField(term50611, term50611.getClass(), "popupMenu", null);
        setField(term50611, term50611.getClass(), "revalidateRunnableScheduled", null);
        setField(term50611, term50611.getClass(), "focusInputMap", null);
        setField(term50611, term50611.getClass(), "ancestorInputMap", null);
        setField(term50611, term50611.getClass(), "windowInputMap", null);
        setField(term50611, term50611.getClass(), "actionMap", null);
        setField(term50611, term50611.getClass(), "aaHint", null);
        setField(term50611, term50611.getClass(), "lcdRenderingHint", null);
        setField(term50611, term50611.getClass(), "component", null);
        setField(term50611, term50611.getClass(), "layoutMgr", null);
        setField(term50611, term50611.getClass(), "dispatcher", null);
        setField(term50611, term50611.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term50611, term50611.getClass(), "focusCycleRoot", false);
        setBooleanField(term50611, term50611.getClass(), "focusTraversalPolicyProvider", false);
        setField(term50611, term50611.getClass(), "printingThreads", null);
        setBooleanField(term50611, term50611.getClass(), "printing", false);
        setField(term50611, term50611.getClass(), "containerListener", null);
        setIntField(term50611, term50611.getClass(), "listeningChildren", 0);
        setIntField(term50611, term50611.getClass(), "listeningBoundsChildren", 0);
        setIntField(term50611, term50611.getClass(), "descendantsCount", 0);
        setField(term50611, term50611.getClass(), "preserveBackgroundColor", null);
        setIntField(term50611, term50611.getClass(), "numOfHWComponents", 0);
        setIntField(term50611, term50611.getClass(), "numOfLWComponents", 0);
        setField(term50611, term50611.getClass(), "modalComp", null);
        setField(term50611, term50611.getClass(), "modalAppContext", null);
        setIntField(term50611, term50611.getClass(), "containerSerializedDataVersion", 0);
        setField(term50611, term50611.getClass(), "peer", null);
        setField(term50611, term50611.getClass(), "parent", null);
        setField(term50611, term50611.getClass(), "appContext", null);
        setIntField(term50611, term50611.getClass(), "x", 0);
        setIntField(term50611, term50611.getClass(), "y", 0);
        setIntField(term50611, term50611.getClass(), "width", 0);
        setIntField(term50611, term50611.getClass(), "height", 0);
        setField(term50611, term50611.getClass(), "foreground", null);
        setField(term50611, term50611.getClass(), "background", null);
        setField(term50611, term50611.getClass(), "font", null);
        setField(term50611, term50611.getClass(), "peerFont", null);
        setField(term50611, term50611.getClass(), "cursor", null);
        setField(term50611, term50611.getClass(), "locale", null);
        setField(term50611, term50611.getClass(), "graphicsConfig", null);
        setField(term50611, term50611.getClass(), "bufferStrategy", null);
        setBooleanField(term50611, term50611.getClass(), "ignoreRepaint", false);
        setBooleanField(term50611, term50611.getClass(), "visible", false);
        setBooleanField(term50611, term50611.getClass(), "enabled", false);
        setBooleanField(term50611, term50611.getClass(), "valid", false);
        setField(term50611, term50611.getClass(), "dropTarget", null);
        setField(term50611, term50611.getClass(), "popups", null);
        setField(term50611, term50611.getClass(), "name", null);
        setBooleanField(term50611, term50611.getClass(), "nameExplicitlySet", false);
        setBooleanField(term50611, term50611.getClass(), "focusable", false);
        setIntField(term50611, term50611.getClass(), "isFocusTraversableOverridden", 0);
        setField(term50611, term50611.getClass(), "focusTraversalKeys", null);
        setBooleanField(term50611, term50611.getClass(), "focusTraversalKeysEnabled", false);
        setField(term50611, term50611.getClass(), "acc", null);
        setField(term50611, term50611.getClass(), "minSize", null);
        setBooleanField(term50611, term50611.getClass(), "minSizeSet", false);
        setField(term50611, term50611.getClass(), "prefSize", null);
        setBooleanField(term50611, term50611.getClass(), "prefSizeSet", false);
        setField(term50611, term50611.getClass(), "maxSize", null);
        setBooleanField(term50611, term50611.getClass(), "maxSizeSet", false);
        setField(term50611, term50611.getClass(), "componentOrientation", null);
        setBooleanField(term50611, term50611.getClass(), "newEventsOnly", false);
        setField(term50611, term50611.getClass(), "componentListener", null);
        setField(term50611, term50611.getClass(), "focusListener", null);
        setField(term50611, term50611.getClass(), "hierarchyListener", null);
        setField(term50611, term50611.getClass(), "hierarchyBoundsListener", null);
        setField(term50611, term50611.getClass(), "keyListener", null);
        setField(term50611, term50611.getClass(), "mouseListener", null);
        setField(term50611, term50611.getClass(), "mouseMotionListener", null);
        setField(term50611, term50611.getClass(), "mouseWheelListener", null);
        setField(term50611, term50611.getClass(), "inputMethodListener", null);
        setLongField(term50611, term50611.getClass(), "eventMask", 0L);
        setField(term50611, term50611.getClass(), "changeSupport", null);
        setField(term50611, term50611.getClass(), "objectLock", null);
        setBooleanField(term50611, term50611.getClass(), "isPacked", false);
        setIntField(term50611, term50611.getClass(), "boundsOp", 0);
        setField(term50611, term50611.getClass(), "compoundShape", null);
        setField(term50611, term50611.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term50611, term50611.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term50611, term50611.getClass(), "backgroundEraseDisabled", false);
        setField(term50611, term50611.getClass(), "eventCache", null);
        setBooleanField(term50611, term50611.getClass(), "coalescingEnabled", false);
        setBooleanField(term50611, term50611.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term50611, term50611.getClass(), "componentSerializedDataVersion", 0);
        setField(term50611, term50611.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigSpherePanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEastPlanet", argTypes, term50611, args);
    }

};


