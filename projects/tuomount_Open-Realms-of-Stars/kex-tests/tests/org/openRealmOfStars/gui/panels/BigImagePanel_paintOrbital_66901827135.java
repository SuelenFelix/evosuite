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

public class BigImagePanel_paintOrbital_66901827135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123316;
     Object term123363;
     Object term123365;

    public BigImagePanel_paintOrbital_66901827135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123316 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel"));
        setField(term123316, term123316.getClass(), "backgroundImg", null);
        setField(term123316, term123316.getClass(), "northPlanetImg", null);
        setField(term123316, term123316.getClass(), "southPlanetImg", null);
        setField(term123316, term123316.getClass(), "westPlanetImg", null);
        setField(term123316, term123316.getClass(), "eastPlanetImg", null);
        setField(term123316, term123316.getClass(), "shipImages", null);
        setBooleanField(term123316, term123316.getClass(), "drawStarField", false);
        setField(term123316, term123316.getClass(), "planet", null);
        setField(term123316, term123316.getClass(), "title", null);
        setField(term123316, term123316.getClass(), "animation", null);
        setField(term123316, term123316.getClass(), "player", null);
        setField(term123316, term123316.getClass(), "textInformation", null);
        setDoubleField(term123316, term123316.getClass(), "orbitalX", 0.0);
        setDoubleField(term123316, term123316.getClass(), "orbitalZ", 0.0);
        setIntField(term123316, term123316.getClass(), "orbitalY", 0);
        setDoubleField(term123316, term123316.getClass(), "orbitalAngle", 0.0);
        setField(term123316, term123316.getClass(), "customOrbital", null);
        setBooleanField(term123316, term123316.getClass(), "textInMiddle", false);
        setBooleanField(term123316, term123316.getClass(), "isAlignmentXSet", false);
        setFloatField(term123316, term123316.getClass(), "alignmentX", 0.0F);
        setBooleanField(term123316, term123316.getClass(), "isAlignmentYSet", false);
        setFloatField(term123316, term123316.getClass(), "alignmentY", 0.0F);
        setField(term123316, term123316.getClass(), "ui", null);
        setField(term123316, term123316.getClass(), "listenerList", null);
        setField(term123316, term123316.getClass(), "clientProperties", null);
        setField(term123316, term123316.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term123316, term123316.getClass(), "autoscrolls", false);
        setField(term123316, term123316.getClass(), "border", null);
        setIntField(term123316, term123316.getClass(), "flags", 0);
        setField(term123316, term123316.getClass(), "inputVerifier", null);
        setBooleanField(term123316, term123316.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term123316, term123316.getClass(), "paintingChild", null);
        setField(term123316, term123316.getClass(), "popupMenu", null);
        setField(term123316, term123316.getClass(), "revalidateRunnableScheduled", null);
        setField(term123316, term123316.getClass(), "focusInputMap", null);
        setField(term123316, term123316.getClass(), "ancestorInputMap", null);
        setField(term123316, term123316.getClass(), "windowInputMap", null);
        setField(term123316, term123316.getClass(), "actionMap", null);
        setField(term123316, term123316.getClass(), "aaHint", null);
        setField(term123316, term123316.getClass(), "lcdRenderingHint", null);
        setField(term123316, term123316.getClass(), "component", null);
        setField(term123316, term123316.getClass(), "layoutMgr", null);
        setField(term123316, term123316.getClass(), "dispatcher", null);
        setField(term123316, term123316.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term123316, term123316.getClass(), "focusCycleRoot", false);
        setBooleanField(term123316, term123316.getClass(), "focusTraversalPolicyProvider", false);
        setField(term123316, term123316.getClass(), "printingThreads", null);
        setBooleanField(term123316, term123316.getClass(), "printing", false);
        setField(term123316, term123316.getClass(), "containerListener", null);
        setIntField(term123316, term123316.getClass(), "listeningChildren", 0);
        setIntField(term123316, term123316.getClass(), "listeningBoundsChildren", 0);
        setIntField(term123316, term123316.getClass(), "descendantsCount", 0);
        setField(term123316, term123316.getClass(), "preserveBackgroundColor", null);
        setIntField(term123316, term123316.getClass(), "numOfHWComponents", 0);
        setIntField(term123316, term123316.getClass(), "numOfLWComponents", 0);
        setField(term123316, term123316.getClass(), "modalComp", null);
        setField(term123316, term123316.getClass(), "modalAppContext", null);
        setIntField(term123316, term123316.getClass(), "containerSerializedDataVersion", 0);
        setField(term123316, term123316.getClass(), "peer", null);
        setField(term123316, term123316.getClass(), "parent", null);
        setField(term123316, term123316.getClass(), "appContext", null);
        setIntField(term123316, term123316.getClass(), "x", 0);
        setIntField(term123316, term123316.getClass(), "y", 0);
        setIntField(term123316, term123316.getClass(), "width", 0);
        setIntField(term123316, term123316.getClass(), "height", 0);
        setField(term123316, term123316.getClass(), "foreground", null);
        setField(term123316, term123316.getClass(), "background", null);
        setField(term123316, term123316.getClass(), "font", null);
        setField(term123316, term123316.getClass(), "peerFont", null);
        setField(term123316, term123316.getClass(), "cursor", null);
        setField(term123316, term123316.getClass(), "locale", null);
        setField(term123316, term123316.getClass(), "graphicsConfig", null);
        setField(term123316, term123316.getClass(), "bufferStrategy", null);
        setBooleanField(term123316, term123316.getClass(), "ignoreRepaint", false);
        setBooleanField(term123316, term123316.getClass(), "visible", false);
        setBooleanField(term123316, term123316.getClass(), "enabled", false);
        setBooleanField(term123316, term123316.getClass(), "valid", false);
        setField(term123316, term123316.getClass(), "dropTarget", null);
        setField(term123316, term123316.getClass(), "popups", null);
        setField(term123316, term123316.getClass(), "name", null);
        setBooleanField(term123316, term123316.getClass(), "nameExplicitlySet", false);
        setBooleanField(term123316, term123316.getClass(), "focusable", false);
        setIntField(term123316, term123316.getClass(), "isFocusTraversableOverridden", 0);
        setField(term123316, term123316.getClass(), "focusTraversalKeys", null);
        setBooleanField(term123316, term123316.getClass(), "focusTraversalKeysEnabled", false);
        setField(term123316, term123316.getClass(), "acc", null);
        setField(term123316, term123316.getClass(), "minSize", null);
        setBooleanField(term123316, term123316.getClass(), "minSizeSet", false);
        setField(term123316, term123316.getClass(), "prefSize", null);
        setBooleanField(term123316, term123316.getClass(), "prefSizeSet", false);
        setField(term123316, term123316.getClass(), "maxSize", null);
        setBooleanField(term123316, term123316.getClass(), "maxSizeSet", false);
        setField(term123316, term123316.getClass(), "componentOrientation", null);
        setBooleanField(term123316, term123316.getClass(), "newEventsOnly", false);
        setField(term123316, term123316.getClass(), "componentListener", null);
        setField(term123316, term123316.getClass(), "focusListener", null);
        setField(term123316, term123316.getClass(), "hierarchyListener", null);
        setField(term123316, term123316.getClass(), "hierarchyBoundsListener", null);
        setField(term123316, term123316.getClass(), "keyListener", null);
        setField(term123316, term123316.getClass(), "mouseListener", null);
        setField(term123316, term123316.getClass(), "mouseMotionListener", null);
        setField(term123316, term123316.getClass(), "mouseWheelListener", null);
        setField(term123316, term123316.getClass(), "inputMethodListener", null);
        setLongField(term123316, term123316.getClass(), "eventMask", 0L);
        setField(term123316, term123316.getClass(), "changeSupport", null);
        setField(term123316, term123316.getClass(), "objectLock", null);
        setBooleanField(term123316, term123316.getClass(), "isPacked", false);
        setIntField(term123316, term123316.getClass(), "boundsOp", 0);
        setField(term123316, term123316.getClass(), "compoundShape", null);
        setField(term123316, term123316.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term123316, term123316.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term123316, term123316.getClass(), "backgroundEraseDisabled", false);
        setField(term123316, term123316.getClass(), "eventCache", null);
        setBooleanField(term123316, term123316.getClass(), "coalescingEnabled", false);
        setBooleanField(term123316, term123316.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term123316, term123316.getClass(), "componentSerializedDataVersion", 0);
        setField(term123316, term123316.getClass(), "accessibleContext", null);
        term123363 = new Integer(0);
        term123365 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = Class.forName("java.awt.image.BufferedImage");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term123363;
        args[3] = term123365;
        callMethod(klass, "paintOrbital", argTypes, term123316, args);
    }

};


