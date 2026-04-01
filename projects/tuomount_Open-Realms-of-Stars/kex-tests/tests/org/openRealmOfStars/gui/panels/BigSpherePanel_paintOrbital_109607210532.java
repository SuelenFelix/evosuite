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

public class BigSpherePanel_paintOrbital_109607210532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64998;
     Object term65046;
     Object term65048;

    public BigSpherePanel_paintOrbital_109607210532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64998 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.BigSpherePanel"));
        setField(term64998, term64998.getClass(), "backgroundImg", null);
        setField(term64998, term64998.getClass(), "northPlanetImg", null);
        setField(term64998, term64998.getClass(), "southPlanetImg", null);
        setField(term64998, term64998.getClass(), "westPlanetImg", null);
        setField(term64998, term64998.getClass(), "eastPlanetImg", null);
        setField(term64998, term64998.getClass(), "shipImages", null);
        setBooleanField(term64998, term64998.getClass(), "drawStarField", false);
        setField(term64998, term64998.getClass(), "title", null);
        setField(term64998, term64998.getClass(), "animation", null);
        setField(term64998, term64998.getClass(), "player", null);
        setField(term64998, term64998.getClass(), "textInformation", null);
        setDoubleField(term64998, term64998.getClass(), "orbitalX", 0.0);
        setDoubleField(term64998, term64998.getClass(), "orbitalZ", 0.0);
        setIntField(term64998, term64998.getClass(), "orbitalY", 0);
        setDoubleField(term64998, term64998.getClass(), "orbitalAngle", 0.0);
        setField(term64998, term64998.getClass(), "customOrbital", null);
        setBooleanField(term64998, term64998.getClass(), "textInMiddle", false);
        setIntField(term64998, term64998.getClass(), "planetTextureOffset", 0);
        setBooleanField(term64998, term64998.getClass(), "isAlignmentXSet", false);
        setFloatField(term64998, term64998.getClass(), "alignmentX", 0.0F);
        setBooleanField(term64998, term64998.getClass(), "isAlignmentYSet", false);
        setFloatField(term64998, term64998.getClass(), "alignmentY", 0.0F);
        setField(term64998, term64998.getClass(), "ui", null);
        setField(term64998, term64998.getClass(), "listenerList", null);
        setField(term64998, term64998.getClass(), "clientProperties", null);
        setField(term64998, term64998.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term64998, term64998.getClass(), "autoscrolls", false);
        setField(term64998, term64998.getClass(), "border", null);
        setIntField(term64998, term64998.getClass(), "flags", 0);
        setField(term64998, term64998.getClass(), "inputVerifier", null);
        setBooleanField(term64998, term64998.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term64998, term64998.getClass(), "paintingChild", null);
        setField(term64998, term64998.getClass(), "popupMenu", null);
        setField(term64998, term64998.getClass(), "revalidateRunnableScheduled", null);
        setField(term64998, term64998.getClass(), "focusInputMap", null);
        setField(term64998, term64998.getClass(), "ancestorInputMap", null);
        setField(term64998, term64998.getClass(), "windowInputMap", null);
        setField(term64998, term64998.getClass(), "actionMap", null);
        setField(term64998, term64998.getClass(), "aaHint", null);
        setField(term64998, term64998.getClass(), "lcdRenderingHint", null);
        setField(term64998, term64998.getClass(), "component", null);
        setField(term64998, term64998.getClass(), "layoutMgr", null);
        setField(term64998, term64998.getClass(), "dispatcher", null);
        setField(term64998, term64998.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term64998, term64998.getClass(), "focusCycleRoot", false);
        setBooleanField(term64998, term64998.getClass(), "focusTraversalPolicyProvider", false);
        setField(term64998, term64998.getClass(), "printingThreads", null);
        setBooleanField(term64998, term64998.getClass(), "printing", false);
        setField(term64998, term64998.getClass(), "containerListener", null);
        setIntField(term64998, term64998.getClass(), "listeningChildren", 0);
        setIntField(term64998, term64998.getClass(), "listeningBoundsChildren", 0);
        setIntField(term64998, term64998.getClass(), "descendantsCount", 0);
        setField(term64998, term64998.getClass(), "preserveBackgroundColor", null);
        setIntField(term64998, term64998.getClass(), "numOfHWComponents", 0);
        setIntField(term64998, term64998.getClass(), "numOfLWComponents", 0);
        setField(term64998, term64998.getClass(), "modalComp", null);
        setField(term64998, term64998.getClass(), "modalAppContext", null);
        setIntField(term64998, term64998.getClass(), "containerSerializedDataVersion", 0);
        setField(term64998, term64998.getClass(), "peer", null);
        setField(term64998, term64998.getClass(), "parent", null);
        setField(term64998, term64998.getClass(), "appContext", null);
        setIntField(term64998, term64998.getClass(), "x", 0);
        setIntField(term64998, term64998.getClass(), "y", 0);
        setIntField(term64998, term64998.getClass(), "width", 0);
        setIntField(term64998, term64998.getClass(), "height", 0);
        setField(term64998, term64998.getClass(), "foreground", null);
        setField(term64998, term64998.getClass(), "background", null);
        setField(term64998, term64998.getClass(), "font", null);
        setField(term64998, term64998.getClass(), "peerFont", null);
        setField(term64998, term64998.getClass(), "cursor", null);
        setField(term64998, term64998.getClass(), "locale", null);
        setField(term64998, term64998.getClass(), "graphicsConfig", null);
        setField(term64998, term64998.getClass(), "bufferStrategy", null);
        setBooleanField(term64998, term64998.getClass(), "ignoreRepaint", false);
        setBooleanField(term64998, term64998.getClass(), "visible", false);
        setBooleanField(term64998, term64998.getClass(), "enabled", false);
        setBooleanField(term64998, term64998.getClass(), "valid", false);
        setField(term64998, term64998.getClass(), "dropTarget", null);
        setField(term64998, term64998.getClass(), "popups", null);
        setField(term64998, term64998.getClass(), "name", null);
        setBooleanField(term64998, term64998.getClass(), "nameExplicitlySet", false);
        setBooleanField(term64998, term64998.getClass(), "focusable", false);
        setIntField(term64998, term64998.getClass(), "isFocusTraversableOverridden", 0);
        setField(term64998, term64998.getClass(), "focusTraversalKeys", null);
        setBooleanField(term64998, term64998.getClass(), "focusTraversalKeysEnabled", false);
        setField(term64998, term64998.getClass(), "acc", null);
        setField(term64998, term64998.getClass(), "minSize", null);
        setBooleanField(term64998, term64998.getClass(), "minSizeSet", false);
        setField(term64998, term64998.getClass(), "prefSize", null);
        setBooleanField(term64998, term64998.getClass(), "prefSizeSet", false);
        setField(term64998, term64998.getClass(), "maxSize", null);
        setBooleanField(term64998, term64998.getClass(), "maxSizeSet", false);
        setField(term64998, term64998.getClass(), "componentOrientation", null);
        setBooleanField(term64998, term64998.getClass(), "newEventsOnly", false);
        setField(term64998, term64998.getClass(), "componentListener", null);
        setField(term64998, term64998.getClass(), "focusListener", null);
        setField(term64998, term64998.getClass(), "hierarchyListener", null);
        setField(term64998, term64998.getClass(), "hierarchyBoundsListener", null);
        setField(term64998, term64998.getClass(), "keyListener", null);
        setField(term64998, term64998.getClass(), "mouseListener", null);
        setField(term64998, term64998.getClass(), "mouseMotionListener", null);
        setField(term64998, term64998.getClass(), "mouseWheelListener", null);
        setField(term64998, term64998.getClass(), "inputMethodListener", null);
        setLongField(term64998, term64998.getClass(), "eventMask", 0L);
        setField(term64998, term64998.getClass(), "changeSupport", null);
        setField(term64998, term64998.getClass(), "objectLock", null);
        setBooleanField(term64998, term64998.getClass(), "isPacked", false);
        setIntField(term64998, term64998.getClass(), "boundsOp", 0);
        setField(term64998, term64998.getClass(), "compoundShape", null);
        setField(term64998, term64998.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term64998, term64998.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term64998, term64998.getClass(), "backgroundEraseDisabled", false);
        setField(term64998, term64998.getClass(), "eventCache", null);
        setBooleanField(term64998, term64998.getClass(), "coalescingEnabled", false);
        setBooleanField(term64998, term64998.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term64998, term64998.getClass(), "componentSerializedDataVersion", 0);
        setField(term64998, term64998.getClass(), "accessibleContext", null);
        term65046 = new Integer(0);
        term65048 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigSpherePanel");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = Class.forName("java.awt.image.BufferedImage");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term65046;
        args[3] = term65048;
        callMethod(klass, "paintOrbital", argTypes, term64998, args);
    }

};


