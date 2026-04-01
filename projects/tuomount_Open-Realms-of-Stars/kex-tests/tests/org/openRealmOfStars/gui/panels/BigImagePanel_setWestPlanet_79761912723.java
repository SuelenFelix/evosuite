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

public class BigImagePanel_setWestPlanet_79761912723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121082;

    public BigImagePanel_setWestPlanet_79761912723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121082 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel"));
        setField(term121082, term121082.getClass(), "backgroundImg", null);
        setField(term121082, term121082.getClass(), "northPlanetImg", null);
        setField(term121082, term121082.getClass(), "southPlanetImg", null);
        setField(term121082, term121082.getClass(), "westPlanetImg", null);
        setField(term121082, term121082.getClass(), "eastPlanetImg", null);
        setField(term121082, term121082.getClass(), "shipImages", null);
        setBooleanField(term121082, term121082.getClass(), "drawStarField", false);
        setField(term121082, term121082.getClass(), "planet", null);
        setField(term121082, term121082.getClass(), "title", null);
        setField(term121082, term121082.getClass(), "animation", null);
        setField(term121082, term121082.getClass(), "player", null);
        setField(term121082, term121082.getClass(), "textInformation", null);
        setDoubleField(term121082, term121082.getClass(), "orbitalX", 0.0);
        setDoubleField(term121082, term121082.getClass(), "orbitalZ", 0.0);
        setIntField(term121082, term121082.getClass(), "orbitalY", 0);
        setDoubleField(term121082, term121082.getClass(), "orbitalAngle", 0.0);
        setField(term121082, term121082.getClass(), "customOrbital", null);
        setBooleanField(term121082, term121082.getClass(), "textInMiddle", false);
        setBooleanField(term121082, term121082.getClass(), "isAlignmentXSet", false);
        setFloatField(term121082, term121082.getClass(), "alignmentX", 0.0F);
        setBooleanField(term121082, term121082.getClass(), "isAlignmentYSet", false);
        setFloatField(term121082, term121082.getClass(), "alignmentY", 0.0F);
        setField(term121082, term121082.getClass(), "ui", null);
        setField(term121082, term121082.getClass(), "listenerList", null);
        setField(term121082, term121082.getClass(), "clientProperties", null);
        setField(term121082, term121082.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term121082, term121082.getClass(), "autoscrolls", false);
        setField(term121082, term121082.getClass(), "border", null);
        setIntField(term121082, term121082.getClass(), "flags", 0);
        setField(term121082, term121082.getClass(), "inputVerifier", null);
        setBooleanField(term121082, term121082.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term121082, term121082.getClass(), "paintingChild", null);
        setField(term121082, term121082.getClass(), "popupMenu", null);
        setField(term121082, term121082.getClass(), "revalidateRunnableScheduled", null);
        setField(term121082, term121082.getClass(), "focusInputMap", null);
        setField(term121082, term121082.getClass(), "ancestorInputMap", null);
        setField(term121082, term121082.getClass(), "windowInputMap", null);
        setField(term121082, term121082.getClass(), "actionMap", null);
        setField(term121082, term121082.getClass(), "aaHint", null);
        setField(term121082, term121082.getClass(), "lcdRenderingHint", null);
        setField(term121082, term121082.getClass(), "component", null);
        setField(term121082, term121082.getClass(), "layoutMgr", null);
        setField(term121082, term121082.getClass(), "dispatcher", null);
        setField(term121082, term121082.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term121082, term121082.getClass(), "focusCycleRoot", false);
        setBooleanField(term121082, term121082.getClass(), "focusTraversalPolicyProvider", false);
        setField(term121082, term121082.getClass(), "printingThreads", null);
        setBooleanField(term121082, term121082.getClass(), "printing", false);
        setField(term121082, term121082.getClass(), "containerListener", null);
        setIntField(term121082, term121082.getClass(), "listeningChildren", 0);
        setIntField(term121082, term121082.getClass(), "listeningBoundsChildren", 0);
        setIntField(term121082, term121082.getClass(), "descendantsCount", 0);
        setField(term121082, term121082.getClass(), "preserveBackgroundColor", null);
        setIntField(term121082, term121082.getClass(), "numOfHWComponents", 0);
        setIntField(term121082, term121082.getClass(), "numOfLWComponents", 0);
        setField(term121082, term121082.getClass(), "modalComp", null);
        setField(term121082, term121082.getClass(), "modalAppContext", null);
        setIntField(term121082, term121082.getClass(), "containerSerializedDataVersion", 0);
        setField(term121082, term121082.getClass(), "peer", null);
        setField(term121082, term121082.getClass(), "parent", null);
        setField(term121082, term121082.getClass(), "appContext", null);
        setIntField(term121082, term121082.getClass(), "x", 0);
        setIntField(term121082, term121082.getClass(), "y", 0);
        setIntField(term121082, term121082.getClass(), "width", 0);
        setIntField(term121082, term121082.getClass(), "height", 0);
        setField(term121082, term121082.getClass(), "foreground", null);
        setField(term121082, term121082.getClass(), "background", null);
        setField(term121082, term121082.getClass(), "font", null);
        setField(term121082, term121082.getClass(), "peerFont", null);
        setField(term121082, term121082.getClass(), "cursor", null);
        setField(term121082, term121082.getClass(), "locale", null);
        setField(term121082, term121082.getClass(), "graphicsConfig", null);
        setField(term121082, term121082.getClass(), "bufferStrategy", null);
        setBooleanField(term121082, term121082.getClass(), "ignoreRepaint", false);
        setBooleanField(term121082, term121082.getClass(), "visible", false);
        setBooleanField(term121082, term121082.getClass(), "enabled", false);
        setBooleanField(term121082, term121082.getClass(), "valid", false);
        setField(term121082, term121082.getClass(), "dropTarget", null);
        setField(term121082, term121082.getClass(), "popups", null);
        setField(term121082, term121082.getClass(), "name", null);
        setBooleanField(term121082, term121082.getClass(), "nameExplicitlySet", false);
        setBooleanField(term121082, term121082.getClass(), "focusable", false);
        setIntField(term121082, term121082.getClass(), "isFocusTraversableOverridden", 0);
        setField(term121082, term121082.getClass(), "focusTraversalKeys", null);
        setBooleanField(term121082, term121082.getClass(), "focusTraversalKeysEnabled", false);
        setField(term121082, term121082.getClass(), "acc", null);
        setField(term121082, term121082.getClass(), "minSize", null);
        setBooleanField(term121082, term121082.getClass(), "minSizeSet", false);
        setField(term121082, term121082.getClass(), "prefSize", null);
        setBooleanField(term121082, term121082.getClass(), "prefSizeSet", false);
        setField(term121082, term121082.getClass(), "maxSize", null);
        setBooleanField(term121082, term121082.getClass(), "maxSizeSet", false);
        setField(term121082, term121082.getClass(), "componentOrientation", null);
        setBooleanField(term121082, term121082.getClass(), "newEventsOnly", false);
        setField(term121082, term121082.getClass(), "componentListener", null);
        setField(term121082, term121082.getClass(), "focusListener", null);
        setField(term121082, term121082.getClass(), "hierarchyListener", null);
        setField(term121082, term121082.getClass(), "hierarchyBoundsListener", null);
        setField(term121082, term121082.getClass(), "keyListener", null);
        setField(term121082, term121082.getClass(), "mouseListener", null);
        setField(term121082, term121082.getClass(), "mouseMotionListener", null);
        setField(term121082, term121082.getClass(), "mouseWheelListener", null);
        setField(term121082, term121082.getClass(), "inputMethodListener", null);
        setLongField(term121082, term121082.getClass(), "eventMask", 0L);
        setField(term121082, term121082.getClass(), "changeSupport", null);
        setField(term121082, term121082.getClass(), "objectLock", null);
        setBooleanField(term121082, term121082.getClass(), "isPacked", false);
        setIntField(term121082, term121082.getClass(), "boundsOp", 0);
        setField(term121082, term121082.getClass(), "compoundShape", null);
        setField(term121082, term121082.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term121082, term121082.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term121082, term121082.getClass(), "backgroundEraseDisabled", false);
        setField(term121082, term121082.getClass(), "eventCache", null);
        setBooleanField(term121082, term121082.getClass(), "coalescingEnabled", false);
        setBooleanField(term121082, term121082.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term121082, term121082.getClass(), "componentSerializedDataVersion", 0);
        setField(term121082, term121082.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setWestPlanet", argTypes, term121082, args);
    }

};


