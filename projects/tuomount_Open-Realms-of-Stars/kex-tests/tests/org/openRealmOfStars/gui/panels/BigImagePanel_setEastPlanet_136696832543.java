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

public class BigImagePanel_setEastPlanet_136696832543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123696;

    public BigImagePanel_setEastPlanet_136696832543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123696 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel"));
        setField(term123696, term123696.getClass(), "backgroundImg", null);
        setField(term123696, term123696.getClass(), "northPlanetImg", null);
        setField(term123696, term123696.getClass(), "southPlanetImg", null);
        setField(term123696, term123696.getClass(), "westPlanetImg", null);
        setField(term123696, term123696.getClass(), "eastPlanetImg", null);
        setField(term123696, term123696.getClass(), "shipImages", null);
        setBooleanField(term123696, term123696.getClass(), "drawStarField", false);
        setField(term123696, term123696.getClass(), "planet", null);
        setField(term123696, term123696.getClass(), "title", null);
        setField(term123696, term123696.getClass(), "animation", null);
        setField(term123696, term123696.getClass(), "player", null);
        setField(term123696, term123696.getClass(), "textInformation", null);
        setDoubleField(term123696, term123696.getClass(), "orbitalX", 0.0);
        setDoubleField(term123696, term123696.getClass(), "orbitalZ", 0.0);
        setIntField(term123696, term123696.getClass(), "orbitalY", 0);
        setDoubleField(term123696, term123696.getClass(), "orbitalAngle", 0.0);
        setField(term123696, term123696.getClass(), "customOrbital", null);
        setBooleanField(term123696, term123696.getClass(), "textInMiddle", false);
        setBooleanField(term123696, term123696.getClass(), "isAlignmentXSet", false);
        setFloatField(term123696, term123696.getClass(), "alignmentX", 0.0F);
        setBooleanField(term123696, term123696.getClass(), "isAlignmentYSet", false);
        setFloatField(term123696, term123696.getClass(), "alignmentY", 0.0F);
        setField(term123696, term123696.getClass(), "ui", null);
        setField(term123696, term123696.getClass(), "listenerList", null);
        setField(term123696, term123696.getClass(), "clientProperties", null);
        setField(term123696, term123696.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term123696, term123696.getClass(), "autoscrolls", false);
        setField(term123696, term123696.getClass(), "border", null);
        setIntField(term123696, term123696.getClass(), "flags", 0);
        setField(term123696, term123696.getClass(), "inputVerifier", null);
        setBooleanField(term123696, term123696.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term123696, term123696.getClass(), "paintingChild", null);
        setField(term123696, term123696.getClass(), "popupMenu", null);
        setField(term123696, term123696.getClass(), "revalidateRunnableScheduled", null);
        setField(term123696, term123696.getClass(), "focusInputMap", null);
        setField(term123696, term123696.getClass(), "ancestorInputMap", null);
        setField(term123696, term123696.getClass(), "windowInputMap", null);
        setField(term123696, term123696.getClass(), "actionMap", null);
        setField(term123696, term123696.getClass(), "aaHint", null);
        setField(term123696, term123696.getClass(), "lcdRenderingHint", null);
        setField(term123696, term123696.getClass(), "component", null);
        setField(term123696, term123696.getClass(), "layoutMgr", null);
        setField(term123696, term123696.getClass(), "dispatcher", null);
        setField(term123696, term123696.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term123696, term123696.getClass(), "focusCycleRoot", false);
        setBooleanField(term123696, term123696.getClass(), "focusTraversalPolicyProvider", false);
        setField(term123696, term123696.getClass(), "printingThreads", null);
        setBooleanField(term123696, term123696.getClass(), "printing", false);
        setField(term123696, term123696.getClass(), "containerListener", null);
        setIntField(term123696, term123696.getClass(), "listeningChildren", 0);
        setIntField(term123696, term123696.getClass(), "listeningBoundsChildren", 0);
        setIntField(term123696, term123696.getClass(), "descendantsCount", 0);
        setField(term123696, term123696.getClass(), "preserveBackgroundColor", null);
        setIntField(term123696, term123696.getClass(), "numOfHWComponents", 0);
        setIntField(term123696, term123696.getClass(), "numOfLWComponents", 0);
        setField(term123696, term123696.getClass(), "modalComp", null);
        setField(term123696, term123696.getClass(), "modalAppContext", null);
        setIntField(term123696, term123696.getClass(), "containerSerializedDataVersion", 0);
        setField(term123696, term123696.getClass(), "peer", null);
        setField(term123696, term123696.getClass(), "parent", null);
        setField(term123696, term123696.getClass(), "appContext", null);
        setIntField(term123696, term123696.getClass(), "x", 0);
        setIntField(term123696, term123696.getClass(), "y", 0);
        setIntField(term123696, term123696.getClass(), "width", 0);
        setIntField(term123696, term123696.getClass(), "height", 0);
        setField(term123696, term123696.getClass(), "foreground", null);
        setField(term123696, term123696.getClass(), "background", null);
        setField(term123696, term123696.getClass(), "font", null);
        setField(term123696, term123696.getClass(), "peerFont", null);
        setField(term123696, term123696.getClass(), "cursor", null);
        setField(term123696, term123696.getClass(), "locale", null);
        setField(term123696, term123696.getClass(), "graphicsConfig", null);
        setField(term123696, term123696.getClass(), "bufferStrategy", null);
        setBooleanField(term123696, term123696.getClass(), "ignoreRepaint", false);
        setBooleanField(term123696, term123696.getClass(), "visible", false);
        setBooleanField(term123696, term123696.getClass(), "enabled", false);
        setBooleanField(term123696, term123696.getClass(), "valid", false);
        setField(term123696, term123696.getClass(), "dropTarget", null);
        setField(term123696, term123696.getClass(), "popups", null);
        setField(term123696, term123696.getClass(), "name", null);
        setBooleanField(term123696, term123696.getClass(), "nameExplicitlySet", false);
        setBooleanField(term123696, term123696.getClass(), "focusable", false);
        setIntField(term123696, term123696.getClass(), "isFocusTraversableOverridden", 0);
        setField(term123696, term123696.getClass(), "focusTraversalKeys", null);
        setBooleanField(term123696, term123696.getClass(), "focusTraversalKeysEnabled", false);
        setField(term123696, term123696.getClass(), "acc", null);
        setField(term123696, term123696.getClass(), "minSize", null);
        setBooleanField(term123696, term123696.getClass(), "minSizeSet", false);
        setField(term123696, term123696.getClass(), "prefSize", null);
        setBooleanField(term123696, term123696.getClass(), "prefSizeSet", false);
        setField(term123696, term123696.getClass(), "maxSize", null);
        setBooleanField(term123696, term123696.getClass(), "maxSizeSet", false);
        setField(term123696, term123696.getClass(), "componentOrientation", null);
        setBooleanField(term123696, term123696.getClass(), "newEventsOnly", false);
        setField(term123696, term123696.getClass(), "componentListener", null);
        setField(term123696, term123696.getClass(), "focusListener", null);
        setField(term123696, term123696.getClass(), "hierarchyListener", null);
        setField(term123696, term123696.getClass(), "hierarchyBoundsListener", null);
        setField(term123696, term123696.getClass(), "keyListener", null);
        setField(term123696, term123696.getClass(), "mouseListener", null);
        setField(term123696, term123696.getClass(), "mouseMotionListener", null);
        setField(term123696, term123696.getClass(), "mouseWheelListener", null);
        setField(term123696, term123696.getClass(), "inputMethodListener", null);
        setLongField(term123696, term123696.getClass(), "eventMask", 0L);
        setField(term123696, term123696.getClass(), "changeSupport", null);
        setField(term123696, term123696.getClass(), "objectLock", null);
        setBooleanField(term123696, term123696.getClass(), "isPacked", false);
        setIntField(term123696, term123696.getClass(), "boundsOp", 0);
        setField(term123696, term123696.getClass(), "compoundShape", null);
        setField(term123696, term123696.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term123696, term123696.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term123696, term123696.getClass(), "backgroundEraseDisabled", false);
        setField(term123696, term123696.getClass(), "eventCache", null);
        setBooleanField(term123696, term123696.getClass(), "coalescingEnabled", false);
        setBooleanField(term123696, term123696.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term123696, term123696.getClass(), "componentSerializedDataVersion", 0);
        setField(term123696, term123696.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEastPlanet", argTypes, term123696, args);
    }

};


