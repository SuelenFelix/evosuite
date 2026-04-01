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
import java.lang.Integer;

public class BigSpherePanel_paintSphere_84740771131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64946;
     Object term64994;
     Object term64996;

    public BigSpherePanel_paintSphere_84740771131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64946 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.BigSpherePanel"));
        setField(term64946, term64946.getClass(), "backgroundImg", null);
        setField(term64946, term64946.getClass(), "northPlanetImg", null);
        setField(term64946, term64946.getClass(), "southPlanetImg", null);
        setField(term64946, term64946.getClass(), "westPlanetImg", null);
        setField(term64946, term64946.getClass(), "eastPlanetImg", null);
        setField(term64946, term64946.getClass(), "shipImages", null);
        setBooleanField(term64946, term64946.getClass(), "drawStarField", false);
        setField(term64946, term64946.getClass(), "title", null);
        setField(term64946, term64946.getClass(), "animation", null);
        setField(term64946, term64946.getClass(), "player", null);
        setField(term64946, term64946.getClass(), "textInformation", null);
        setDoubleField(term64946, term64946.getClass(), "orbitalX", 0.0);
        setDoubleField(term64946, term64946.getClass(), "orbitalZ", 0.0);
        setIntField(term64946, term64946.getClass(), "orbitalY", 0);
        setDoubleField(term64946, term64946.getClass(), "orbitalAngle", 0.0);
        setField(term64946, term64946.getClass(), "customOrbital", null);
        setBooleanField(term64946, term64946.getClass(), "textInMiddle", false);
        setIntField(term64946, term64946.getClass(), "planetTextureOffset", 0);
        setBooleanField(term64946, term64946.getClass(), "isAlignmentXSet", false);
        setFloatField(term64946, term64946.getClass(), "alignmentX", 0.0F);
        setBooleanField(term64946, term64946.getClass(), "isAlignmentYSet", false);
        setFloatField(term64946, term64946.getClass(), "alignmentY", 0.0F);
        setField(term64946, term64946.getClass(), "ui", null);
        setField(term64946, term64946.getClass(), "listenerList", null);
        setField(term64946, term64946.getClass(), "clientProperties", null);
        setField(term64946, term64946.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term64946, term64946.getClass(), "autoscrolls", false);
        setField(term64946, term64946.getClass(), "border", null);
        setIntField(term64946, term64946.getClass(), "flags", 0);
        setField(term64946, term64946.getClass(), "inputVerifier", null);
        setBooleanField(term64946, term64946.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term64946, term64946.getClass(), "paintingChild", null);
        setField(term64946, term64946.getClass(), "popupMenu", null);
        setField(term64946, term64946.getClass(), "revalidateRunnableScheduled", null);
        setField(term64946, term64946.getClass(), "focusInputMap", null);
        setField(term64946, term64946.getClass(), "ancestorInputMap", null);
        setField(term64946, term64946.getClass(), "windowInputMap", null);
        setField(term64946, term64946.getClass(), "actionMap", null);
        setField(term64946, term64946.getClass(), "aaHint", null);
        setField(term64946, term64946.getClass(), "lcdRenderingHint", null);
        setField(term64946, term64946.getClass(), "component", null);
        setField(term64946, term64946.getClass(), "layoutMgr", null);
        setField(term64946, term64946.getClass(), "dispatcher", null);
        setField(term64946, term64946.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term64946, term64946.getClass(), "focusCycleRoot", false);
        setBooleanField(term64946, term64946.getClass(), "focusTraversalPolicyProvider", false);
        setField(term64946, term64946.getClass(), "printingThreads", null);
        setBooleanField(term64946, term64946.getClass(), "printing", false);
        setField(term64946, term64946.getClass(), "containerListener", null);
        setIntField(term64946, term64946.getClass(), "listeningChildren", 0);
        setIntField(term64946, term64946.getClass(), "listeningBoundsChildren", 0);
        setIntField(term64946, term64946.getClass(), "descendantsCount", 0);
        setField(term64946, term64946.getClass(), "preserveBackgroundColor", null);
        setIntField(term64946, term64946.getClass(), "numOfHWComponents", 0);
        setIntField(term64946, term64946.getClass(), "numOfLWComponents", 0);
        setField(term64946, term64946.getClass(), "modalComp", null);
        setField(term64946, term64946.getClass(), "modalAppContext", null);
        setIntField(term64946, term64946.getClass(), "containerSerializedDataVersion", 0);
        setField(term64946, term64946.getClass(), "peer", null);
        setField(term64946, term64946.getClass(), "parent", null);
        setField(term64946, term64946.getClass(), "appContext", null);
        setIntField(term64946, term64946.getClass(), "x", 0);
        setIntField(term64946, term64946.getClass(), "y", 0);
        setIntField(term64946, term64946.getClass(), "width", 0);
        setIntField(term64946, term64946.getClass(), "height", 0);
        setField(term64946, term64946.getClass(), "foreground", null);
        setField(term64946, term64946.getClass(), "background", null);
        setField(term64946, term64946.getClass(), "font", null);
        setField(term64946, term64946.getClass(), "peerFont", null);
        setField(term64946, term64946.getClass(), "cursor", null);
        setField(term64946, term64946.getClass(), "locale", null);
        setField(term64946, term64946.getClass(), "graphicsConfig", null);
        setField(term64946, term64946.getClass(), "bufferStrategy", null);
        setBooleanField(term64946, term64946.getClass(), "ignoreRepaint", false);
        setBooleanField(term64946, term64946.getClass(), "visible", false);
        setBooleanField(term64946, term64946.getClass(), "enabled", false);
        setBooleanField(term64946, term64946.getClass(), "valid", false);
        setField(term64946, term64946.getClass(), "dropTarget", null);
        setField(term64946, term64946.getClass(), "popups", null);
        setField(term64946, term64946.getClass(), "name", null);
        setBooleanField(term64946, term64946.getClass(), "nameExplicitlySet", false);
        setBooleanField(term64946, term64946.getClass(), "focusable", false);
        setIntField(term64946, term64946.getClass(), "isFocusTraversableOverridden", 0);
        setField(term64946, term64946.getClass(), "focusTraversalKeys", null);
        setBooleanField(term64946, term64946.getClass(), "focusTraversalKeysEnabled", false);
        setField(term64946, term64946.getClass(), "acc", null);
        setField(term64946, term64946.getClass(), "minSize", null);
        setBooleanField(term64946, term64946.getClass(), "minSizeSet", false);
        setField(term64946, term64946.getClass(), "prefSize", null);
        setBooleanField(term64946, term64946.getClass(), "prefSizeSet", false);
        setField(term64946, term64946.getClass(), "maxSize", null);
        setBooleanField(term64946, term64946.getClass(), "maxSizeSet", false);
        setField(term64946, term64946.getClass(), "componentOrientation", null);
        setBooleanField(term64946, term64946.getClass(), "newEventsOnly", false);
        setField(term64946, term64946.getClass(), "componentListener", null);
        setField(term64946, term64946.getClass(), "focusListener", null);
        setField(term64946, term64946.getClass(), "hierarchyListener", null);
        setField(term64946, term64946.getClass(), "hierarchyBoundsListener", null);
        setField(term64946, term64946.getClass(), "keyListener", null);
        setField(term64946, term64946.getClass(), "mouseListener", null);
        setField(term64946, term64946.getClass(), "mouseMotionListener", null);
        setField(term64946, term64946.getClass(), "mouseWheelListener", null);
        setField(term64946, term64946.getClass(), "inputMethodListener", null);
        setLongField(term64946, term64946.getClass(), "eventMask", 0L);
        setField(term64946, term64946.getClass(), "changeSupport", null);
        setField(term64946, term64946.getClass(), "objectLock", null);
        setBooleanField(term64946, term64946.getClass(), "isPacked", false);
        setIntField(term64946, term64946.getClass(), "boundsOp", 0);
        setField(term64946, term64946.getClass(), "compoundShape", null);
        setField(term64946, term64946.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term64946, term64946.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term64946, term64946.getClass(), "backgroundEraseDisabled", false);
        setField(term64946, term64946.getClass(), "eventCache", null);
        setBooleanField(term64946, term64946.getClass(), "coalescingEnabled", false);
        setBooleanField(term64946, term64946.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term64946, term64946.getClass(), "componentSerializedDataVersion", 0);
        setField(term64946, term64946.getClass(), "accessibleContext", null);
        term64994 = new Integer(0);
        term64996 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigSpherePanel");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term64994;
        args[2] = term64996;
        callMethod(klass, "paintSphere", argTypes, term64946, args);
    }

};


