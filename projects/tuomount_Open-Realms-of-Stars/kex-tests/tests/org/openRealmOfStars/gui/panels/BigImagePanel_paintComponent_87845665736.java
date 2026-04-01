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

public class BigImagePanel_paintComponent_87845665736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123367;

    public BigImagePanel_paintComponent_87845665736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123367 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel"));
        setField(term123367, term123367.getClass(), "backgroundImg", null);
        setField(term123367, term123367.getClass(), "northPlanetImg", null);
        setField(term123367, term123367.getClass(), "southPlanetImg", null);
        setField(term123367, term123367.getClass(), "westPlanetImg", null);
        setField(term123367, term123367.getClass(), "eastPlanetImg", null);
        setField(term123367, term123367.getClass(), "shipImages", null);
        setBooleanField(term123367, term123367.getClass(), "drawStarField", false);
        setField(term123367, term123367.getClass(), "planet", null);
        setField(term123367, term123367.getClass(), "title", null);
        setField(term123367, term123367.getClass(), "animation", null);
        setField(term123367, term123367.getClass(), "player", null);
        setField(term123367, term123367.getClass(), "textInformation", null);
        setDoubleField(term123367, term123367.getClass(), "orbitalX", 0.0);
        setDoubleField(term123367, term123367.getClass(), "orbitalZ", 0.0);
        setIntField(term123367, term123367.getClass(), "orbitalY", 0);
        setDoubleField(term123367, term123367.getClass(), "orbitalAngle", 0.0);
        setField(term123367, term123367.getClass(), "customOrbital", null);
        setBooleanField(term123367, term123367.getClass(), "textInMiddle", false);
        setBooleanField(term123367, term123367.getClass(), "isAlignmentXSet", false);
        setFloatField(term123367, term123367.getClass(), "alignmentX", 0.0F);
        setBooleanField(term123367, term123367.getClass(), "isAlignmentYSet", false);
        setFloatField(term123367, term123367.getClass(), "alignmentY", 0.0F);
        setField(term123367, term123367.getClass(), "ui", null);
        setField(term123367, term123367.getClass(), "listenerList", null);
        setField(term123367, term123367.getClass(), "clientProperties", null);
        setField(term123367, term123367.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term123367, term123367.getClass(), "autoscrolls", false);
        setField(term123367, term123367.getClass(), "border", null);
        setIntField(term123367, term123367.getClass(), "flags", 0);
        setField(term123367, term123367.getClass(), "inputVerifier", null);
        setBooleanField(term123367, term123367.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term123367, term123367.getClass(), "paintingChild", null);
        setField(term123367, term123367.getClass(), "popupMenu", null);
        setField(term123367, term123367.getClass(), "revalidateRunnableScheduled", null);
        setField(term123367, term123367.getClass(), "focusInputMap", null);
        setField(term123367, term123367.getClass(), "ancestorInputMap", null);
        setField(term123367, term123367.getClass(), "windowInputMap", null);
        setField(term123367, term123367.getClass(), "actionMap", null);
        setField(term123367, term123367.getClass(), "aaHint", null);
        setField(term123367, term123367.getClass(), "lcdRenderingHint", null);
        setField(term123367, term123367.getClass(), "component", null);
        setField(term123367, term123367.getClass(), "layoutMgr", null);
        setField(term123367, term123367.getClass(), "dispatcher", null);
        setField(term123367, term123367.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term123367, term123367.getClass(), "focusCycleRoot", false);
        setBooleanField(term123367, term123367.getClass(), "focusTraversalPolicyProvider", false);
        setField(term123367, term123367.getClass(), "printingThreads", null);
        setBooleanField(term123367, term123367.getClass(), "printing", false);
        setField(term123367, term123367.getClass(), "containerListener", null);
        setIntField(term123367, term123367.getClass(), "listeningChildren", 0);
        setIntField(term123367, term123367.getClass(), "listeningBoundsChildren", 0);
        setIntField(term123367, term123367.getClass(), "descendantsCount", 0);
        setField(term123367, term123367.getClass(), "preserveBackgroundColor", null);
        setIntField(term123367, term123367.getClass(), "numOfHWComponents", 0);
        setIntField(term123367, term123367.getClass(), "numOfLWComponents", 0);
        setField(term123367, term123367.getClass(), "modalComp", null);
        setField(term123367, term123367.getClass(), "modalAppContext", null);
        setIntField(term123367, term123367.getClass(), "containerSerializedDataVersion", 0);
        setField(term123367, term123367.getClass(), "peer", null);
        setField(term123367, term123367.getClass(), "parent", null);
        setField(term123367, term123367.getClass(), "appContext", null);
        setIntField(term123367, term123367.getClass(), "x", 0);
        setIntField(term123367, term123367.getClass(), "y", 0);
        setIntField(term123367, term123367.getClass(), "width", 0);
        setIntField(term123367, term123367.getClass(), "height", 0);
        setField(term123367, term123367.getClass(), "foreground", null);
        setField(term123367, term123367.getClass(), "background", null);
        setField(term123367, term123367.getClass(), "font", null);
        setField(term123367, term123367.getClass(), "peerFont", null);
        setField(term123367, term123367.getClass(), "cursor", null);
        setField(term123367, term123367.getClass(), "locale", null);
        setField(term123367, term123367.getClass(), "graphicsConfig", null);
        setField(term123367, term123367.getClass(), "bufferStrategy", null);
        setBooleanField(term123367, term123367.getClass(), "ignoreRepaint", false);
        setBooleanField(term123367, term123367.getClass(), "visible", false);
        setBooleanField(term123367, term123367.getClass(), "enabled", false);
        setBooleanField(term123367, term123367.getClass(), "valid", false);
        setField(term123367, term123367.getClass(), "dropTarget", null);
        setField(term123367, term123367.getClass(), "popups", null);
        setField(term123367, term123367.getClass(), "name", null);
        setBooleanField(term123367, term123367.getClass(), "nameExplicitlySet", false);
        setBooleanField(term123367, term123367.getClass(), "focusable", false);
        setIntField(term123367, term123367.getClass(), "isFocusTraversableOverridden", 0);
        setField(term123367, term123367.getClass(), "focusTraversalKeys", null);
        setBooleanField(term123367, term123367.getClass(), "focusTraversalKeysEnabled", false);
        setField(term123367, term123367.getClass(), "acc", null);
        setField(term123367, term123367.getClass(), "minSize", null);
        setBooleanField(term123367, term123367.getClass(), "minSizeSet", false);
        setField(term123367, term123367.getClass(), "prefSize", null);
        setBooleanField(term123367, term123367.getClass(), "prefSizeSet", false);
        setField(term123367, term123367.getClass(), "maxSize", null);
        setBooleanField(term123367, term123367.getClass(), "maxSizeSet", false);
        setField(term123367, term123367.getClass(), "componentOrientation", null);
        setBooleanField(term123367, term123367.getClass(), "newEventsOnly", false);
        setField(term123367, term123367.getClass(), "componentListener", null);
        setField(term123367, term123367.getClass(), "focusListener", null);
        setField(term123367, term123367.getClass(), "hierarchyListener", null);
        setField(term123367, term123367.getClass(), "hierarchyBoundsListener", null);
        setField(term123367, term123367.getClass(), "keyListener", null);
        setField(term123367, term123367.getClass(), "mouseListener", null);
        setField(term123367, term123367.getClass(), "mouseMotionListener", null);
        setField(term123367, term123367.getClass(), "mouseWheelListener", null);
        setField(term123367, term123367.getClass(), "inputMethodListener", null);
        setLongField(term123367, term123367.getClass(), "eventMask", 0L);
        setField(term123367, term123367.getClass(), "changeSupport", null);
        setField(term123367, term123367.getClass(), "objectLock", null);
        setBooleanField(term123367, term123367.getClass(), "isPacked", false);
        setIntField(term123367, term123367.getClass(), "boundsOp", 0);
        setField(term123367, term123367.getClass(), "compoundShape", null);
        setField(term123367, term123367.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term123367, term123367.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term123367, term123367.getClass(), "backgroundEraseDisabled", false);
        setField(term123367, term123367.getClass(), "eventCache", null);
        setBooleanField(term123367, term123367.getClass(), "coalescingEnabled", false);
        setBooleanField(term123367, term123367.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term123367, term123367.getClass(), "componentSerializedDataVersion", 0);
        setField(term123367, term123367.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Graphics");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "paintComponent", argTypes, term123367, args);
    }

};


