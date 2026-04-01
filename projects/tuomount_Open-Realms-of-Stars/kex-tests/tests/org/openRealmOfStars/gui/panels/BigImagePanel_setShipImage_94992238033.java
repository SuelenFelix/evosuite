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

public class BigImagePanel_setShipImage_94992238033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123222;

    public BigImagePanel_setShipImage_94992238033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123222 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel"));
        setField(term123222, term123222.getClass(), "backgroundImg", null);
        setField(term123222, term123222.getClass(), "northPlanetImg", null);
        setField(term123222, term123222.getClass(), "southPlanetImg", null);
        setField(term123222, term123222.getClass(), "westPlanetImg", null);
        setField(term123222, term123222.getClass(), "eastPlanetImg", null);
        setField(term123222, term123222.getClass(), "shipImages", null);
        setBooleanField(term123222, term123222.getClass(), "drawStarField", false);
        setField(term123222, term123222.getClass(), "planet", null);
        setField(term123222, term123222.getClass(), "title", null);
        setField(term123222, term123222.getClass(), "animation", null);
        setField(term123222, term123222.getClass(), "player", null);
        setField(term123222, term123222.getClass(), "textInformation", null);
        setDoubleField(term123222, term123222.getClass(), "orbitalX", 0.0);
        setDoubleField(term123222, term123222.getClass(), "orbitalZ", 0.0);
        setIntField(term123222, term123222.getClass(), "orbitalY", 0);
        setDoubleField(term123222, term123222.getClass(), "orbitalAngle", 0.0);
        setField(term123222, term123222.getClass(), "customOrbital", null);
        setBooleanField(term123222, term123222.getClass(), "textInMiddle", false);
        setBooleanField(term123222, term123222.getClass(), "isAlignmentXSet", false);
        setFloatField(term123222, term123222.getClass(), "alignmentX", 0.0F);
        setBooleanField(term123222, term123222.getClass(), "isAlignmentYSet", false);
        setFloatField(term123222, term123222.getClass(), "alignmentY", 0.0F);
        setField(term123222, term123222.getClass(), "ui", null);
        setField(term123222, term123222.getClass(), "listenerList", null);
        setField(term123222, term123222.getClass(), "clientProperties", null);
        setField(term123222, term123222.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term123222, term123222.getClass(), "autoscrolls", false);
        setField(term123222, term123222.getClass(), "border", null);
        setIntField(term123222, term123222.getClass(), "flags", 0);
        setField(term123222, term123222.getClass(), "inputVerifier", null);
        setBooleanField(term123222, term123222.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term123222, term123222.getClass(), "paintingChild", null);
        setField(term123222, term123222.getClass(), "popupMenu", null);
        setField(term123222, term123222.getClass(), "revalidateRunnableScheduled", null);
        setField(term123222, term123222.getClass(), "focusInputMap", null);
        setField(term123222, term123222.getClass(), "ancestorInputMap", null);
        setField(term123222, term123222.getClass(), "windowInputMap", null);
        setField(term123222, term123222.getClass(), "actionMap", null);
        setField(term123222, term123222.getClass(), "aaHint", null);
        setField(term123222, term123222.getClass(), "lcdRenderingHint", null);
        setField(term123222, term123222.getClass(), "component", null);
        setField(term123222, term123222.getClass(), "layoutMgr", null);
        setField(term123222, term123222.getClass(), "dispatcher", null);
        setField(term123222, term123222.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term123222, term123222.getClass(), "focusCycleRoot", false);
        setBooleanField(term123222, term123222.getClass(), "focusTraversalPolicyProvider", false);
        setField(term123222, term123222.getClass(), "printingThreads", null);
        setBooleanField(term123222, term123222.getClass(), "printing", false);
        setField(term123222, term123222.getClass(), "containerListener", null);
        setIntField(term123222, term123222.getClass(), "listeningChildren", 0);
        setIntField(term123222, term123222.getClass(), "listeningBoundsChildren", 0);
        setIntField(term123222, term123222.getClass(), "descendantsCount", 0);
        setField(term123222, term123222.getClass(), "preserveBackgroundColor", null);
        setIntField(term123222, term123222.getClass(), "numOfHWComponents", 0);
        setIntField(term123222, term123222.getClass(), "numOfLWComponents", 0);
        setField(term123222, term123222.getClass(), "modalComp", null);
        setField(term123222, term123222.getClass(), "modalAppContext", null);
        setIntField(term123222, term123222.getClass(), "containerSerializedDataVersion", 0);
        setField(term123222, term123222.getClass(), "peer", null);
        setField(term123222, term123222.getClass(), "parent", null);
        setField(term123222, term123222.getClass(), "appContext", null);
        setIntField(term123222, term123222.getClass(), "x", 0);
        setIntField(term123222, term123222.getClass(), "y", 0);
        setIntField(term123222, term123222.getClass(), "width", 0);
        setIntField(term123222, term123222.getClass(), "height", 0);
        setField(term123222, term123222.getClass(), "foreground", null);
        setField(term123222, term123222.getClass(), "background", null);
        setField(term123222, term123222.getClass(), "font", null);
        setField(term123222, term123222.getClass(), "peerFont", null);
        setField(term123222, term123222.getClass(), "cursor", null);
        setField(term123222, term123222.getClass(), "locale", null);
        setField(term123222, term123222.getClass(), "graphicsConfig", null);
        setField(term123222, term123222.getClass(), "bufferStrategy", null);
        setBooleanField(term123222, term123222.getClass(), "ignoreRepaint", false);
        setBooleanField(term123222, term123222.getClass(), "visible", false);
        setBooleanField(term123222, term123222.getClass(), "enabled", false);
        setBooleanField(term123222, term123222.getClass(), "valid", false);
        setField(term123222, term123222.getClass(), "dropTarget", null);
        setField(term123222, term123222.getClass(), "popups", null);
        setField(term123222, term123222.getClass(), "name", null);
        setBooleanField(term123222, term123222.getClass(), "nameExplicitlySet", false);
        setBooleanField(term123222, term123222.getClass(), "focusable", false);
        setIntField(term123222, term123222.getClass(), "isFocusTraversableOverridden", 0);
        setField(term123222, term123222.getClass(), "focusTraversalKeys", null);
        setBooleanField(term123222, term123222.getClass(), "focusTraversalKeysEnabled", false);
        setField(term123222, term123222.getClass(), "acc", null);
        setField(term123222, term123222.getClass(), "minSize", null);
        setBooleanField(term123222, term123222.getClass(), "minSizeSet", false);
        setField(term123222, term123222.getClass(), "prefSize", null);
        setBooleanField(term123222, term123222.getClass(), "prefSizeSet", false);
        setField(term123222, term123222.getClass(), "maxSize", null);
        setBooleanField(term123222, term123222.getClass(), "maxSizeSet", false);
        setField(term123222, term123222.getClass(), "componentOrientation", null);
        setBooleanField(term123222, term123222.getClass(), "newEventsOnly", false);
        setField(term123222, term123222.getClass(), "componentListener", null);
        setField(term123222, term123222.getClass(), "focusListener", null);
        setField(term123222, term123222.getClass(), "hierarchyListener", null);
        setField(term123222, term123222.getClass(), "hierarchyBoundsListener", null);
        setField(term123222, term123222.getClass(), "keyListener", null);
        setField(term123222, term123222.getClass(), "mouseListener", null);
        setField(term123222, term123222.getClass(), "mouseMotionListener", null);
        setField(term123222, term123222.getClass(), "mouseWheelListener", null);
        setField(term123222, term123222.getClass(), "inputMethodListener", null);
        setLongField(term123222, term123222.getClass(), "eventMask", 0L);
        setField(term123222, term123222.getClass(), "changeSupport", null);
        setField(term123222, term123222.getClass(), "objectLock", null);
        setBooleanField(term123222, term123222.getClass(), "isPacked", false);
        setIntField(term123222, term123222.getClass(), "boundsOp", 0);
        setField(term123222, term123222.getClass(), "compoundShape", null);
        setField(term123222, term123222.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term123222, term123222.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term123222, term123222.getClass(), "backgroundEraseDisabled", false);
        setField(term123222, term123222.getClass(), "eventCache", null);
        setBooleanField(term123222, term123222.getClass(), "coalescingEnabled", false);
        setBooleanField(term123222, term123222.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term123222, term123222.getClass(), "componentSerializedDataVersion", 0);
        setField(term123222, term123222.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.awt.image.BufferedImage"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setShipImage", argTypes, term123222, args);
    }

};


