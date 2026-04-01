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

public class BigImagePanel_setSouthPlanet_52346548921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113521;

    public BigImagePanel_setSouthPlanet_52346548921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113521 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel"));
        setField(term113521, term113521.getClass(), "backgroundImg", null);
        setField(term113521, term113521.getClass(), "northPlanetImg", null);
        setField(term113521, term113521.getClass(), "southPlanetImg", null);
        setField(term113521, term113521.getClass(), "westPlanetImg", null);
        setField(term113521, term113521.getClass(), "eastPlanetImg", null);
        setField(term113521, term113521.getClass(), "shipImages", null);
        setBooleanField(term113521, term113521.getClass(), "drawStarField", false);
        setField(term113521, term113521.getClass(), "planet", null);
        setField(term113521, term113521.getClass(), "title", null);
        setField(term113521, term113521.getClass(), "animation", null);
        setField(term113521, term113521.getClass(), "player", null);
        setField(term113521, term113521.getClass(), "textInformation", null);
        setDoubleField(term113521, term113521.getClass(), "orbitalX", 0.0);
        setDoubleField(term113521, term113521.getClass(), "orbitalZ", 0.0);
        setIntField(term113521, term113521.getClass(), "orbitalY", 0);
        setDoubleField(term113521, term113521.getClass(), "orbitalAngle", 0.0);
        setField(term113521, term113521.getClass(), "customOrbital", null);
        setBooleanField(term113521, term113521.getClass(), "textInMiddle", false);
        setBooleanField(term113521, term113521.getClass(), "isAlignmentXSet", false);
        setFloatField(term113521, term113521.getClass(), "alignmentX", 0.0F);
        setBooleanField(term113521, term113521.getClass(), "isAlignmentYSet", false);
        setFloatField(term113521, term113521.getClass(), "alignmentY", 0.0F);
        setField(term113521, term113521.getClass(), "ui", null);
        setField(term113521, term113521.getClass(), "listenerList", null);
        setField(term113521, term113521.getClass(), "clientProperties", null);
        setField(term113521, term113521.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term113521, term113521.getClass(), "autoscrolls", false);
        setField(term113521, term113521.getClass(), "border", null);
        setIntField(term113521, term113521.getClass(), "flags", 0);
        setField(term113521, term113521.getClass(), "inputVerifier", null);
        setBooleanField(term113521, term113521.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term113521, term113521.getClass(), "paintingChild", null);
        setField(term113521, term113521.getClass(), "popupMenu", null);
        setField(term113521, term113521.getClass(), "revalidateRunnableScheduled", null);
        setField(term113521, term113521.getClass(), "focusInputMap", null);
        setField(term113521, term113521.getClass(), "ancestorInputMap", null);
        setField(term113521, term113521.getClass(), "windowInputMap", null);
        setField(term113521, term113521.getClass(), "actionMap", null);
        setField(term113521, term113521.getClass(), "aaHint", null);
        setField(term113521, term113521.getClass(), "lcdRenderingHint", null);
        setField(term113521, term113521.getClass(), "component", null);
        setField(term113521, term113521.getClass(), "layoutMgr", null);
        setField(term113521, term113521.getClass(), "dispatcher", null);
        setField(term113521, term113521.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term113521, term113521.getClass(), "focusCycleRoot", false);
        setBooleanField(term113521, term113521.getClass(), "focusTraversalPolicyProvider", false);
        setField(term113521, term113521.getClass(), "printingThreads", null);
        setBooleanField(term113521, term113521.getClass(), "printing", false);
        setField(term113521, term113521.getClass(), "containerListener", null);
        setIntField(term113521, term113521.getClass(), "listeningChildren", 0);
        setIntField(term113521, term113521.getClass(), "listeningBoundsChildren", 0);
        setIntField(term113521, term113521.getClass(), "descendantsCount", 0);
        setField(term113521, term113521.getClass(), "preserveBackgroundColor", null);
        setIntField(term113521, term113521.getClass(), "numOfHWComponents", 0);
        setIntField(term113521, term113521.getClass(), "numOfLWComponents", 0);
        setField(term113521, term113521.getClass(), "modalComp", null);
        setField(term113521, term113521.getClass(), "modalAppContext", null);
        setIntField(term113521, term113521.getClass(), "containerSerializedDataVersion", 0);
        setField(term113521, term113521.getClass(), "peer", null);
        setField(term113521, term113521.getClass(), "parent", null);
        setField(term113521, term113521.getClass(), "appContext", null);
        setIntField(term113521, term113521.getClass(), "x", 0);
        setIntField(term113521, term113521.getClass(), "y", 0);
        setIntField(term113521, term113521.getClass(), "width", 0);
        setIntField(term113521, term113521.getClass(), "height", 0);
        setField(term113521, term113521.getClass(), "foreground", null);
        setField(term113521, term113521.getClass(), "background", null);
        setField(term113521, term113521.getClass(), "font", null);
        setField(term113521, term113521.getClass(), "peerFont", null);
        setField(term113521, term113521.getClass(), "cursor", null);
        setField(term113521, term113521.getClass(), "locale", null);
        setField(term113521, term113521.getClass(), "graphicsConfig", null);
        setField(term113521, term113521.getClass(), "bufferStrategy", null);
        setBooleanField(term113521, term113521.getClass(), "ignoreRepaint", false);
        setBooleanField(term113521, term113521.getClass(), "visible", false);
        setBooleanField(term113521, term113521.getClass(), "enabled", false);
        setBooleanField(term113521, term113521.getClass(), "valid", false);
        setField(term113521, term113521.getClass(), "dropTarget", null);
        setField(term113521, term113521.getClass(), "popups", null);
        setField(term113521, term113521.getClass(), "name", null);
        setBooleanField(term113521, term113521.getClass(), "nameExplicitlySet", false);
        setBooleanField(term113521, term113521.getClass(), "focusable", false);
        setIntField(term113521, term113521.getClass(), "isFocusTraversableOverridden", 0);
        setField(term113521, term113521.getClass(), "focusTraversalKeys", null);
        setBooleanField(term113521, term113521.getClass(), "focusTraversalKeysEnabled", false);
        setField(term113521, term113521.getClass(), "acc", null);
        setField(term113521, term113521.getClass(), "minSize", null);
        setBooleanField(term113521, term113521.getClass(), "minSizeSet", false);
        setField(term113521, term113521.getClass(), "prefSize", null);
        setBooleanField(term113521, term113521.getClass(), "prefSizeSet", false);
        setField(term113521, term113521.getClass(), "maxSize", null);
        setBooleanField(term113521, term113521.getClass(), "maxSizeSet", false);
        setField(term113521, term113521.getClass(), "componentOrientation", null);
        setBooleanField(term113521, term113521.getClass(), "newEventsOnly", false);
        setField(term113521, term113521.getClass(), "componentListener", null);
        setField(term113521, term113521.getClass(), "focusListener", null);
        setField(term113521, term113521.getClass(), "hierarchyListener", null);
        setField(term113521, term113521.getClass(), "hierarchyBoundsListener", null);
        setField(term113521, term113521.getClass(), "keyListener", null);
        setField(term113521, term113521.getClass(), "mouseListener", null);
        setField(term113521, term113521.getClass(), "mouseMotionListener", null);
        setField(term113521, term113521.getClass(), "mouseWheelListener", null);
        setField(term113521, term113521.getClass(), "inputMethodListener", null);
        setLongField(term113521, term113521.getClass(), "eventMask", 0L);
        setField(term113521, term113521.getClass(), "changeSupport", null);
        setField(term113521, term113521.getClass(), "objectLock", null);
        setBooleanField(term113521, term113521.getClass(), "isPacked", false);
        setIntField(term113521, term113521.getClass(), "boundsOp", 0);
        setField(term113521, term113521.getClass(), "compoundShape", null);
        setField(term113521, term113521.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term113521, term113521.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term113521, term113521.getClass(), "backgroundEraseDisabled", false);
        setField(term113521, term113521.getClass(), "eventCache", null);
        setBooleanField(term113521, term113521.getClass(), "coalescingEnabled", false);
        setBooleanField(term113521, term113521.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term113521, term113521.getClass(), "componentSerializedDataVersion", 0);
        setField(term113521, term113521.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSouthPlanet", argTypes, term113521, args);
    }

};


