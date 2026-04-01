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

public class BigSpherePanel_drawBoldText_132445117728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64798;
     Object term64846;
     Object term64848;

    public BigSpherePanel_drawBoldText_132445117728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64798 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.BigSpherePanel"));
        setField(term64798, term64798.getClass(), "backgroundImg", null);
        setField(term64798, term64798.getClass(), "northPlanetImg", null);
        setField(term64798, term64798.getClass(), "southPlanetImg", null);
        setField(term64798, term64798.getClass(), "westPlanetImg", null);
        setField(term64798, term64798.getClass(), "eastPlanetImg", null);
        setField(term64798, term64798.getClass(), "shipImages", null);
        setBooleanField(term64798, term64798.getClass(), "drawStarField", false);
        setField(term64798, term64798.getClass(), "title", null);
        setField(term64798, term64798.getClass(), "animation", null);
        setField(term64798, term64798.getClass(), "player", null);
        setField(term64798, term64798.getClass(), "textInformation", null);
        setDoubleField(term64798, term64798.getClass(), "orbitalX", 0.0);
        setDoubleField(term64798, term64798.getClass(), "orbitalZ", 0.0);
        setIntField(term64798, term64798.getClass(), "orbitalY", 0);
        setDoubleField(term64798, term64798.getClass(), "orbitalAngle", 0.0);
        setField(term64798, term64798.getClass(), "customOrbital", null);
        setBooleanField(term64798, term64798.getClass(), "textInMiddle", false);
        setIntField(term64798, term64798.getClass(), "planetTextureOffset", 0);
        setBooleanField(term64798, term64798.getClass(), "isAlignmentXSet", false);
        setFloatField(term64798, term64798.getClass(), "alignmentX", 0.0F);
        setBooleanField(term64798, term64798.getClass(), "isAlignmentYSet", false);
        setFloatField(term64798, term64798.getClass(), "alignmentY", 0.0F);
        setField(term64798, term64798.getClass(), "ui", null);
        setField(term64798, term64798.getClass(), "listenerList", null);
        setField(term64798, term64798.getClass(), "clientProperties", null);
        setField(term64798, term64798.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term64798, term64798.getClass(), "autoscrolls", false);
        setField(term64798, term64798.getClass(), "border", null);
        setIntField(term64798, term64798.getClass(), "flags", 0);
        setField(term64798, term64798.getClass(), "inputVerifier", null);
        setBooleanField(term64798, term64798.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term64798, term64798.getClass(), "paintingChild", null);
        setField(term64798, term64798.getClass(), "popupMenu", null);
        setField(term64798, term64798.getClass(), "revalidateRunnableScheduled", null);
        setField(term64798, term64798.getClass(), "focusInputMap", null);
        setField(term64798, term64798.getClass(), "ancestorInputMap", null);
        setField(term64798, term64798.getClass(), "windowInputMap", null);
        setField(term64798, term64798.getClass(), "actionMap", null);
        setField(term64798, term64798.getClass(), "aaHint", null);
        setField(term64798, term64798.getClass(), "lcdRenderingHint", null);
        setField(term64798, term64798.getClass(), "component", null);
        setField(term64798, term64798.getClass(), "layoutMgr", null);
        setField(term64798, term64798.getClass(), "dispatcher", null);
        setField(term64798, term64798.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term64798, term64798.getClass(), "focusCycleRoot", false);
        setBooleanField(term64798, term64798.getClass(), "focusTraversalPolicyProvider", false);
        setField(term64798, term64798.getClass(), "printingThreads", null);
        setBooleanField(term64798, term64798.getClass(), "printing", false);
        setField(term64798, term64798.getClass(), "containerListener", null);
        setIntField(term64798, term64798.getClass(), "listeningChildren", 0);
        setIntField(term64798, term64798.getClass(), "listeningBoundsChildren", 0);
        setIntField(term64798, term64798.getClass(), "descendantsCount", 0);
        setField(term64798, term64798.getClass(), "preserveBackgroundColor", null);
        setIntField(term64798, term64798.getClass(), "numOfHWComponents", 0);
        setIntField(term64798, term64798.getClass(), "numOfLWComponents", 0);
        setField(term64798, term64798.getClass(), "modalComp", null);
        setField(term64798, term64798.getClass(), "modalAppContext", null);
        setIntField(term64798, term64798.getClass(), "containerSerializedDataVersion", 0);
        setField(term64798, term64798.getClass(), "peer", null);
        setField(term64798, term64798.getClass(), "parent", null);
        setField(term64798, term64798.getClass(), "appContext", null);
        setIntField(term64798, term64798.getClass(), "x", 0);
        setIntField(term64798, term64798.getClass(), "y", 0);
        setIntField(term64798, term64798.getClass(), "width", 0);
        setIntField(term64798, term64798.getClass(), "height", 0);
        setField(term64798, term64798.getClass(), "foreground", null);
        setField(term64798, term64798.getClass(), "background", null);
        setField(term64798, term64798.getClass(), "font", null);
        setField(term64798, term64798.getClass(), "peerFont", null);
        setField(term64798, term64798.getClass(), "cursor", null);
        setField(term64798, term64798.getClass(), "locale", null);
        setField(term64798, term64798.getClass(), "graphicsConfig", null);
        setField(term64798, term64798.getClass(), "bufferStrategy", null);
        setBooleanField(term64798, term64798.getClass(), "ignoreRepaint", false);
        setBooleanField(term64798, term64798.getClass(), "visible", false);
        setBooleanField(term64798, term64798.getClass(), "enabled", false);
        setBooleanField(term64798, term64798.getClass(), "valid", false);
        setField(term64798, term64798.getClass(), "dropTarget", null);
        setField(term64798, term64798.getClass(), "popups", null);
        setField(term64798, term64798.getClass(), "name", null);
        setBooleanField(term64798, term64798.getClass(), "nameExplicitlySet", false);
        setBooleanField(term64798, term64798.getClass(), "focusable", false);
        setIntField(term64798, term64798.getClass(), "isFocusTraversableOverridden", 0);
        setField(term64798, term64798.getClass(), "focusTraversalKeys", null);
        setBooleanField(term64798, term64798.getClass(), "focusTraversalKeysEnabled", false);
        setField(term64798, term64798.getClass(), "acc", null);
        setField(term64798, term64798.getClass(), "minSize", null);
        setBooleanField(term64798, term64798.getClass(), "minSizeSet", false);
        setField(term64798, term64798.getClass(), "prefSize", null);
        setBooleanField(term64798, term64798.getClass(), "prefSizeSet", false);
        setField(term64798, term64798.getClass(), "maxSize", null);
        setBooleanField(term64798, term64798.getClass(), "maxSizeSet", false);
        setField(term64798, term64798.getClass(), "componentOrientation", null);
        setBooleanField(term64798, term64798.getClass(), "newEventsOnly", false);
        setField(term64798, term64798.getClass(), "componentListener", null);
        setField(term64798, term64798.getClass(), "focusListener", null);
        setField(term64798, term64798.getClass(), "hierarchyListener", null);
        setField(term64798, term64798.getClass(), "hierarchyBoundsListener", null);
        setField(term64798, term64798.getClass(), "keyListener", null);
        setField(term64798, term64798.getClass(), "mouseListener", null);
        setField(term64798, term64798.getClass(), "mouseMotionListener", null);
        setField(term64798, term64798.getClass(), "mouseWheelListener", null);
        setField(term64798, term64798.getClass(), "inputMethodListener", null);
        setLongField(term64798, term64798.getClass(), "eventMask", 0L);
        setField(term64798, term64798.getClass(), "changeSupport", null);
        setField(term64798, term64798.getClass(), "objectLock", null);
        setBooleanField(term64798, term64798.getClass(), "isPacked", false);
        setIntField(term64798, term64798.getClass(), "boundsOp", 0);
        setField(term64798, term64798.getClass(), "compoundShape", null);
        setField(term64798, term64798.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term64798, term64798.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term64798, term64798.getClass(), "backgroundEraseDisabled", false);
        setField(term64798, term64798.getClass(), "eventCache", null);
        setBooleanField(term64798, term64798.getClass(), "coalescingEnabled", false);
        setBooleanField(term64798, term64798.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term64798, term64798.getClass(), "componentSerializedDataVersion", 0);
        setField(term64798, term64798.getClass(), "accessibleContext", null);
        term64846 = new Integer(0);
        term64848 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigSpherePanel");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.awt.Graphics");
        argTypes[1] = Class.forName("java.awt.Color");
        argTypes[2] = Class.forName("java.awt.Color");
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = Class.forName("java.lang.String");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term64846;
        args[4] = term64848;
        args[5] = null;
        callMethod(klass, "drawBoldText", argTypes, term64798, args);
    }

};


