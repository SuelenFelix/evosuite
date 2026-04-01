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

public class BigSpherePanel_setShipImage_81516799629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64850;

    public BigSpherePanel_setShipImage_81516799629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64850 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.BigSpherePanel"));
        setField(term64850, term64850.getClass(), "backgroundImg", null);
        setField(term64850, term64850.getClass(), "northPlanetImg", null);
        setField(term64850, term64850.getClass(), "southPlanetImg", null);
        setField(term64850, term64850.getClass(), "westPlanetImg", null);
        setField(term64850, term64850.getClass(), "eastPlanetImg", null);
        setField(term64850, term64850.getClass(), "shipImages", null);
        setBooleanField(term64850, term64850.getClass(), "drawStarField", false);
        setField(term64850, term64850.getClass(), "title", null);
        setField(term64850, term64850.getClass(), "animation", null);
        setField(term64850, term64850.getClass(), "player", null);
        setField(term64850, term64850.getClass(), "textInformation", null);
        setDoubleField(term64850, term64850.getClass(), "orbitalX", 0.0);
        setDoubleField(term64850, term64850.getClass(), "orbitalZ", 0.0);
        setIntField(term64850, term64850.getClass(), "orbitalY", 0);
        setDoubleField(term64850, term64850.getClass(), "orbitalAngle", 0.0);
        setField(term64850, term64850.getClass(), "customOrbital", null);
        setBooleanField(term64850, term64850.getClass(), "textInMiddle", false);
        setIntField(term64850, term64850.getClass(), "planetTextureOffset", 0);
        setBooleanField(term64850, term64850.getClass(), "isAlignmentXSet", false);
        setFloatField(term64850, term64850.getClass(), "alignmentX", 0.0F);
        setBooleanField(term64850, term64850.getClass(), "isAlignmentYSet", false);
        setFloatField(term64850, term64850.getClass(), "alignmentY", 0.0F);
        setField(term64850, term64850.getClass(), "ui", null);
        setField(term64850, term64850.getClass(), "listenerList", null);
        setField(term64850, term64850.getClass(), "clientProperties", null);
        setField(term64850, term64850.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term64850, term64850.getClass(), "autoscrolls", false);
        setField(term64850, term64850.getClass(), "border", null);
        setIntField(term64850, term64850.getClass(), "flags", 0);
        setField(term64850, term64850.getClass(), "inputVerifier", null);
        setBooleanField(term64850, term64850.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term64850, term64850.getClass(), "paintingChild", null);
        setField(term64850, term64850.getClass(), "popupMenu", null);
        setField(term64850, term64850.getClass(), "revalidateRunnableScheduled", null);
        setField(term64850, term64850.getClass(), "focusInputMap", null);
        setField(term64850, term64850.getClass(), "ancestorInputMap", null);
        setField(term64850, term64850.getClass(), "windowInputMap", null);
        setField(term64850, term64850.getClass(), "actionMap", null);
        setField(term64850, term64850.getClass(), "aaHint", null);
        setField(term64850, term64850.getClass(), "lcdRenderingHint", null);
        setField(term64850, term64850.getClass(), "component", null);
        setField(term64850, term64850.getClass(), "layoutMgr", null);
        setField(term64850, term64850.getClass(), "dispatcher", null);
        setField(term64850, term64850.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term64850, term64850.getClass(), "focusCycleRoot", false);
        setBooleanField(term64850, term64850.getClass(), "focusTraversalPolicyProvider", false);
        setField(term64850, term64850.getClass(), "printingThreads", null);
        setBooleanField(term64850, term64850.getClass(), "printing", false);
        setField(term64850, term64850.getClass(), "containerListener", null);
        setIntField(term64850, term64850.getClass(), "listeningChildren", 0);
        setIntField(term64850, term64850.getClass(), "listeningBoundsChildren", 0);
        setIntField(term64850, term64850.getClass(), "descendantsCount", 0);
        setField(term64850, term64850.getClass(), "preserveBackgroundColor", null);
        setIntField(term64850, term64850.getClass(), "numOfHWComponents", 0);
        setIntField(term64850, term64850.getClass(), "numOfLWComponents", 0);
        setField(term64850, term64850.getClass(), "modalComp", null);
        setField(term64850, term64850.getClass(), "modalAppContext", null);
        setIntField(term64850, term64850.getClass(), "containerSerializedDataVersion", 0);
        setField(term64850, term64850.getClass(), "peer", null);
        setField(term64850, term64850.getClass(), "parent", null);
        setField(term64850, term64850.getClass(), "appContext", null);
        setIntField(term64850, term64850.getClass(), "x", 0);
        setIntField(term64850, term64850.getClass(), "y", 0);
        setIntField(term64850, term64850.getClass(), "width", 0);
        setIntField(term64850, term64850.getClass(), "height", 0);
        setField(term64850, term64850.getClass(), "foreground", null);
        setField(term64850, term64850.getClass(), "background", null);
        setField(term64850, term64850.getClass(), "font", null);
        setField(term64850, term64850.getClass(), "peerFont", null);
        setField(term64850, term64850.getClass(), "cursor", null);
        setField(term64850, term64850.getClass(), "locale", null);
        setField(term64850, term64850.getClass(), "graphicsConfig", null);
        setField(term64850, term64850.getClass(), "bufferStrategy", null);
        setBooleanField(term64850, term64850.getClass(), "ignoreRepaint", false);
        setBooleanField(term64850, term64850.getClass(), "visible", false);
        setBooleanField(term64850, term64850.getClass(), "enabled", false);
        setBooleanField(term64850, term64850.getClass(), "valid", false);
        setField(term64850, term64850.getClass(), "dropTarget", null);
        setField(term64850, term64850.getClass(), "popups", null);
        setField(term64850, term64850.getClass(), "name", null);
        setBooleanField(term64850, term64850.getClass(), "nameExplicitlySet", false);
        setBooleanField(term64850, term64850.getClass(), "focusable", false);
        setIntField(term64850, term64850.getClass(), "isFocusTraversableOverridden", 0);
        setField(term64850, term64850.getClass(), "focusTraversalKeys", null);
        setBooleanField(term64850, term64850.getClass(), "focusTraversalKeysEnabled", false);
        setField(term64850, term64850.getClass(), "acc", null);
        setField(term64850, term64850.getClass(), "minSize", null);
        setBooleanField(term64850, term64850.getClass(), "minSizeSet", false);
        setField(term64850, term64850.getClass(), "prefSize", null);
        setBooleanField(term64850, term64850.getClass(), "prefSizeSet", false);
        setField(term64850, term64850.getClass(), "maxSize", null);
        setBooleanField(term64850, term64850.getClass(), "maxSizeSet", false);
        setField(term64850, term64850.getClass(), "componentOrientation", null);
        setBooleanField(term64850, term64850.getClass(), "newEventsOnly", false);
        setField(term64850, term64850.getClass(), "componentListener", null);
        setField(term64850, term64850.getClass(), "focusListener", null);
        setField(term64850, term64850.getClass(), "hierarchyListener", null);
        setField(term64850, term64850.getClass(), "hierarchyBoundsListener", null);
        setField(term64850, term64850.getClass(), "keyListener", null);
        setField(term64850, term64850.getClass(), "mouseListener", null);
        setField(term64850, term64850.getClass(), "mouseMotionListener", null);
        setField(term64850, term64850.getClass(), "mouseWheelListener", null);
        setField(term64850, term64850.getClass(), "inputMethodListener", null);
        setLongField(term64850, term64850.getClass(), "eventMask", 0L);
        setField(term64850, term64850.getClass(), "changeSupport", null);
        setField(term64850, term64850.getClass(), "objectLock", null);
        setBooleanField(term64850, term64850.getClass(), "isPacked", false);
        setIntField(term64850, term64850.getClass(), "boundsOp", 0);
        setField(term64850, term64850.getClass(), "compoundShape", null);
        setField(term64850, term64850.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term64850, term64850.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term64850, term64850.getClass(), "backgroundEraseDisabled", false);
        setField(term64850, term64850.getClass(), "eventCache", null);
        setBooleanField(term64850, term64850.getClass(), "coalescingEnabled", false);
        setBooleanField(term64850, term64850.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term64850, term64850.getClass(), "componentSerializedDataVersion", 0);
        setField(term64850, term64850.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigSpherePanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.awt.image.BufferedImage"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setShipImage", argTypes, term64850, args);
    }

};


