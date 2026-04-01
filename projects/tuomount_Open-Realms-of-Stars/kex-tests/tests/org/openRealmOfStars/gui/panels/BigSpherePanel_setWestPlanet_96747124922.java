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

public class BigSpherePanel_setWestPlanet_96747124922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63927;

    public BigSpherePanel_setWestPlanet_96747124922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63927 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.BigSpherePanel"));
        setField(term63927, term63927.getClass(), "backgroundImg", null);
        setField(term63927, term63927.getClass(), "northPlanetImg", null);
        setField(term63927, term63927.getClass(), "southPlanetImg", null);
        setField(term63927, term63927.getClass(), "westPlanetImg", null);
        setField(term63927, term63927.getClass(), "eastPlanetImg", null);
        setField(term63927, term63927.getClass(), "shipImages", null);
        setBooleanField(term63927, term63927.getClass(), "drawStarField", false);
        setField(term63927, term63927.getClass(), "title", null);
        setField(term63927, term63927.getClass(), "animation", null);
        setField(term63927, term63927.getClass(), "player", null);
        setField(term63927, term63927.getClass(), "textInformation", null);
        setDoubleField(term63927, term63927.getClass(), "orbitalX", 0.0);
        setDoubleField(term63927, term63927.getClass(), "orbitalZ", 0.0);
        setIntField(term63927, term63927.getClass(), "orbitalY", 0);
        setDoubleField(term63927, term63927.getClass(), "orbitalAngle", 0.0);
        setField(term63927, term63927.getClass(), "customOrbital", null);
        setBooleanField(term63927, term63927.getClass(), "textInMiddle", false);
        setIntField(term63927, term63927.getClass(), "planetTextureOffset", 0);
        setBooleanField(term63927, term63927.getClass(), "isAlignmentXSet", false);
        setFloatField(term63927, term63927.getClass(), "alignmentX", 0.0F);
        setBooleanField(term63927, term63927.getClass(), "isAlignmentYSet", false);
        setFloatField(term63927, term63927.getClass(), "alignmentY", 0.0F);
        setField(term63927, term63927.getClass(), "ui", null);
        setField(term63927, term63927.getClass(), "listenerList", null);
        setField(term63927, term63927.getClass(), "clientProperties", null);
        setField(term63927, term63927.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term63927, term63927.getClass(), "autoscrolls", false);
        setField(term63927, term63927.getClass(), "border", null);
        setIntField(term63927, term63927.getClass(), "flags", 0);
        setField(term63927, term63927.getClass(), "inputVerifier", null);
        setBooleanField(term63927, term63927.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term63927, term63927.getClass(), "paintingChild", null);
        setField(term63927, term63927.getClass(), "popupMenu", null);
        setField(term63927, term63927.getClass(), "revalidateRunnableScheduled", null);
        setField(term63927, term63927.getClass(), "focusInputMap", null);
        setField(term63927, term63927.getClass(), "ancestorInputMap", null);
        setField(term63927, term63927.getClass(), "windowInputMap", null);
        setField(term63927, term63927.getClass(), "actionMap", null);
        setField(term63927, term63927.getClass(), "aaHint", null);
        setField(term63927, term63927.getClass(), "lcdRenderingHint", null);
        setField(term63927, term63927.getClass(), "component", null);
        setField(term63927, term63927.getClass(), "layoutMgr", null);
        setField(term63927, term63927.getClass(), "dispatcher", null);
        setField(term63927, term63927.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term63927, term63927.getClass(), "focusCycleRoot", false);
        setBooleanField(term63927, term63927.getClass(), "focusTraversalPolicyProvider", false);
        setField(term63927, term63927.getClass(), "printingThreads", null);
        setBooleanField(term63927, term63927.getClass(), "printing", false);
        setField(term63927, term63927.getClass(), "containerListener", null);
        setIntField(term63927, term63927.getClass(), "listeningChildren", 0);
        setIntField(term63927, term63927.getClass(), "listeningBoundsChildren", 0);
        setIntField(term63927, term63927.getClass(), "descendantsCount", 0);
        setField(term63927, term63927.getClass(), "preserveBackgroundColor", null);
        setIntField(term63927, term63927.getClass(), "numOfHWComponents", 0);
        setIntField(term63927, term63927.getClass(), "numOfLWComponents", 0);
        setField(term63927, term63927.getClass(), "modalComp", null);
        setField(term63927, term63927.getClass(), "modalAppContext", null);
        setIntField(term63927, term63927.getClass(), "containerSerializedDataVersion", 0);
        setField(term63927, term63927.getClass(), "peer", null);
        setField(term63927, term63927.getClass(), "parent", null);
        setField(term63927, term63927.getClass(), "appContext", null);
        setIntField(term63927, term63927.getClass(), "x", 0);
        setIntField(term63927, term63927.getClass(), "y", 0);
        setIntField(term63927, term63927.getClass(), "width", 0);
        setIntField(term63927, term63927.getClass(), "height", 0);
        setField(term63927, term63927.getClass(), "foreground", null);
        setField(term63927, term63927.getClass(), "background", null);
        setField(term63927, term63927.getClass(), "font", null);
        setField(term63927, term63927.getClass(), "peerFont", null);
        setField(term63927, term63927.getClass(), "cursor", null);
        setField(term63927, term63927.getClass(), "locale", null);
        setField(term63927, term63927.getClass(), "graphicsConfig", null);
        setField(term63927, term63927.getClass(), "bufferStrategy", null);
        setBooleanField(term63927, term63927.getClass(), "ignoreRepaint", false);
        setBooleanField(term63927, term63927.getClass(), "visible", false);
        setBooleanField(term63927, term63927.getClass(), "enabled", false);
        setBooleanField(term63927, term63927.getClass(), "valid", false);
        setField(term63927, term63927.getClass(), "dropTarget", null);
        setField(term63927, term63927.getClass(), "popups", null);
        setField(term63927, term63927.getClass(), "name", null);
        setBooleanField(term63927, term63927.getClass(), "nameExplicitlySet", false);
        setBooleanField(term63927, term63927.getClass(), "focusable", false);
        setIntField(term63927, term63927.getClass(), "isFocusTraversableOverridden", 0);
        setField(term63927, term63927.getClass(), "focusTraversalKeys", null);
        setBooleanField(term63927, term63927.getClass(), "focusTraversalKeysEnabled", false);
        setField(term63927, term63927.getClass(), "acc", null);
        setField(term63927, term63927.getClass(), "minSize", null);
        setBooleanField(term63927, term63927.getClass(), "minSizeSet", false);
        setField(term63927, term63927.getClass(), "prefSize", null);
        setBooleanField(term63927, term63927.getClass(), "prefSizeSet", false);
        setField(term63927, term63927.getClass(), "maxSize", null);
        setBooleanField(term63927, term63927.getClass(), "maxSizeSet", false);
        setField(term63927, term63927.getClass(), "componentOrientation", null);
        setBooleanField(term63927, term63927.getClass(), "newEventsOnly", false);
        setField(term63927, term63927.getClass(), "componentListener", null);
        setField(term63927, term63927.getClass(), "focusListener", null);
        setField(term63927, term63927.getClass(), "hierarchyListener", null);
        setField(term63927, term63927.getClass(), "hierarchyBoundsListener", null);
        setField(term63927, term63927.getClass(), "keyListener", null);
        setField(term63927, term63927.getClass(), "mouseListener", null);
        setField(term63927, term63927.getClass(), "mouseMotionListener", null);
        setField(term63927, term63927.getClass(), "mouseWheelListener", null);
        setField(term63927, term63927.getClass(), "inputMethodListener", null);
        setLongField(term63927, term63927.getClass(), "eventMask", 0L);
        setField(term63927, term63927.getClass(), "changeSupport", null);
        setField(term63927, term63927.getClass(), "objectLock", null);
        setBooleanField(term63927, term63927.getClass(), "isPacked", false);
        setIntField(term63927, term63927.getClass(), "boundsOp", 0);
        setField(term63927, term63927.getClass(), "compoundShape", null);
        setField(term63927, term63927.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term63927, term63927.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term63927, term63927.getClass(), "backgroundEraseDisabled", false);
        setField(term63927, term63927.getClass(), "eventCache", null);
        setBooleanField(term63927, term63927.getClass(), "coalescingEnabled", false);
        setBooleanField(term63927, term63927.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term63927, term63927.getClass(), "componentSerializedDataVersion", 0);
        setField(term63927, term63927.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigSpherePanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setWestPlanet", argTypes, term63927, args);
    }

};


