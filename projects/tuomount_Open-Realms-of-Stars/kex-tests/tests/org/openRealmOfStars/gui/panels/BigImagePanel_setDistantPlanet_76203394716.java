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

public class BigImagePanel_setDistantPlanet_76203394716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93170;

    public BigImagePanel_setDistantPlanet_76203394716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93170 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel"));
        setField(term93170, term93170.getClass(), "backgroundImg", null);
        setField(term93170, term93170.getClass(), "northPlanetImg", null);
        setField(term93170, term93170.getClass(), "southPlanetImg", null);
        setField(term93170, term93170.getClass(), "westPlanetImg", null);
        setField(term93170, term93170.getClass(), "eastPlanetImg", null);
        setField(term93170, term93170.getClass(), "shipImages", null);
        setBooleanField(term93170, term93170.getClass(), "drawStarField", false);
        setField(term93170, term93170.getClass(), "planet", null);
        setField(term93170, term93170.getClass(), "title", null);
        setField(term93170, term93170.getClass(), "animation", null);
        setField(term93170, term93170.getClass(), "player", null);
        setField(term93170, term93170.getClass(), "textInformation", null);
        setDoubleField(term93170, term93170.getClass(), "orbitalX", 0.0);
        setDoubleField(term93170, term93170.getClass(), "orbitalZ", 0.0);
        setIntField(term93170, term93170.getClass(), "orbitalY", 0);
        setDoubleField(term93170, term93170.getClass(), "orbitalAngle", 0.0);
        setField(term93170, term93170.getClass(), "customOrbital", null);
        setBooleanField(term93170, term93170.getClass(), "textInMiddle", false);
        setBooleanField(term93170, term93170.getClass(), "isAlignmentXSet", false);
        setFloatField(term93170, term93170.getClass(), "alignmentX", 0.0F);
        setBooleanField(term93170, term93170.getClass(), "isAlignmentYSet", false);
        setFloatField(term93170, term93170.getClass(), "alignmentY", 0.0F);
        setField(term93170, term93170.getClass(), "ui", null);
        setField(term93170, term93170.getClass(), "listenerList", null);
        setField(term93170, term93170.getClass(), "clientProperties", null);
        setField(term93170, term93170.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term93170, term93170.getClass(), "autoscrolls", false);
        setField(term93170, term93170.getClass(), "border", null);
        setIntField(term93170, term93170.getClass(), "flags", 0);
        setField(term93170, term93170.getClass(), "inputVerifier", null);
        setBooleanField(term93170, term93170.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term93170, term93170.getClass(), "paintingChild", null);
        setField(term93170, term93170.getClass(), "popupMenu", null);
        setField(term93170, term93170.getClass(), "revalidateRunnableScheduled", null);
        setField(term93170, term93170.getClass(), "focusInputMap", null);
        setField(term93170, term93170.getClass(), "ancestorInputMap", null);
        setField(term93170, term93170.getClass(), "windowInputMap", null);
        setField(term93170, term93170.getClass(), "actionMap", null);
        setField(term93170, term93170.getClass(), "aaHint", null);
        setField(term93170, term93170.getClass(), "lcdRenderingHint", null);
        setField(term93170, term93170.getClass(), "component", null);
        setField(term93170, term93170.getClass(), "layoutMgr", null);
        setField(term93170, term93170.getClass(), "dispatcher", null);
        setField(term93170, term93170.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term93170, term93170.getClass(), "focusCycleRoot", false);
        setBooleanField(term93170, term93170.getClass(), "focusTraversalPolicyProvider", false);
        setField(term93170, term93170.getClass(), "printingThreads", null);
        setBooleanField(term93170, term93170.getClass(), "printing", false);
        setField(term93170, term93170.getClass(), "containerListener", null);
        setIntField(term93170, term93170.getClass(), "listeningChildren", 0);
        setIntField(term93170, term93170.getClass(), "listeningBoundsChildren", 0);
        setIntField(term93170, term93170.getClass(), "descendantsCount", 0);
        setField(term93170, term93170.getClass(), "preserveBackgroundColor", null);
        setIntField(term93170, term93170.getClass(), "numOfHWComponents", 0);
        setIntField(term93170, term93170.getClass(), "numOfLWComponents", 0);
        setField(term93170, term93170.getClass(), "modalComp", null);
        setField(term93170, term93170.getClass(), "modalAppContext", null);
        setIntField(term93170, term93170.getClass(), "containerSerializedDataVersion", 0);
        setField(term93170, term93170.getClass(), "peer", null);
        setField(term93170, term93170.getClass(), "parent", null);
        setField(term93170, term93170.getClass(), "appContext", null);
        setIntField(term93170, term93170.getClass(), "x", 0);
        setIntField(term93170, term93170.getClass(), "y", 0);
        setIntField(term93170, term93170.getClass(), "width", 0);
        setIntField(term93170, term93170.getClass(), "height", 0);
        setField(term93170, term93170.getClass(), "foreground", null);
        setField(term93170, term93170.getClass(), "background", null);
        setField(term93170, term93170.getClass(), "font", null);
        setField(term93170, term93170.getClass(), "peerFont", null);
        setField(term93170, term93170.getClass(), "cursor", null);
        setField(term93170, term93170.getClass(), "locale", null);
        setField(term93170, term93170.getClass(), "graphicsConfig", null);
        setField(term93170, term93170.getClass(), "bufferStrategy", null);
        setBooleanField(term93170, term93170.getClass(), "ignoreRepaint", false);
        setBooleanField(term93170, term93170.getClass(), "visible", false);
        setBooleanField(term93170, term93170.getClass(), "enabled", false);
        setBooleanField(term93170, term93170.getClass(), "valid", false);
        setField(term93170, term93170.getClass(), "dropTarget", null);
        setField(term93170, term93170.getClass(), "popups", null);
        setField(term93170, term93170.getClass(), "name", null);
        setBooleanField(term93170, term93170.getClass(), "nameExplicitlySet", false);
        setBooleanField(term93170, term93170.getClass(), "focusable", false);
        setIntField(term93170, term93170.getClass(), "isFocusTraversableOverridden", 0);
        setField(term93170, term93170.getClass(), "focusTraversalKeys", null);
        setBooleanField(term93170, term93170.getClass(), "focusTraversalKeysEnabled", false);
        setField(term93170, term93170.getClass(), "acc", null);
        setField(term93170, term93170.getClass(), "minSize", null);
        setBooleanField(term93170, term93170.getClass(), "minSizeSet", false);
        setField(term93170, term93170.getClass(), "prefSize", null);
        setBooleanField(term93170, term93170.getClass(), "prefSizeSet", false);
        setField(term93170, term93170.getClass(), "maxSize", null);
        setBooleanField(term93170, term93170.getClass(), "maxSizeSet", false);
        setField(term93170, term93170.getClass(), "componentOrientation", null);
        setBooleanField(term93170, term93170.getClass(), "newEventsOnly", false);
        setField(term93170, term93170.getClass(), "componentListener", null);
        setField(term93170, term93170.getClass(), "focusListener", null);
        setField(term93170, term93170.getClass(), "hierarchyListener", null);
        setField(term93170, term93170.getClass(), "hierarchyBoundsListener", null);
        setField(term93170, term93170.getClass(), "keyListener", null);
        setField(term93170, term93170.getClass(), "mouseListener", null);
        setField(term93170, term93170.getClass(), "mouseMotionListener", null);
        setField(term93170, term93170.getClass(), "mouseWheelListener", null);
        setField(term93170, term93170.getClass(), "inputMethodListener", null);
        setLongField(term93170, term93170.getClass(), "eventMask", 0L);
        setField(term93170, term93170.getClass(), "changeSupport", null);
        setField(term93170, term93170.getClass(), "objectLock", null);
        setBooleanField(term93170, term93170.getClass(), "isPacked", false);
        setIntField(term93170, term93170.getClass(), "boundsOp", 0);
        setField(term93170, term93170.getClass(), "compoundShape", null);
        setField(term93170, term93170.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term93170, term93170.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term93170, term93170.getClass(), "backgroundEraseDisabled", false);
        setField(term93170, term93170.getClass(), "eventCache", null);
        setBooleanField(term93170, term93170.getClass(), "coalescingEnabled", false);
        setBooleanField(term93170, term93170.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term93170, term93170.getClass(), "componentSerializedDataVersion", 0);
        setField(term93170, term93170.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDistantPlanet", argTypes, term93170, args);
    }

};


