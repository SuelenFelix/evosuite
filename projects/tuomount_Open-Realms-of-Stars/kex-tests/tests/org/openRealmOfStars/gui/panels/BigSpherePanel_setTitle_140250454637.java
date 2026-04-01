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

public class BigSpherePanel_setTitle_140250454637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65242;

    public BigSpherePanel_setTitle_140250454637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65242 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.BigSpherePanel"));
        setField(term65242, term65242.getClass(), "backgroundImg", null);
        setField(term65242, term65242.getClass(), "northPlanetImg", null);
        setField(term65242, term65242.getClass(), "southPlanetImg", null);
        setField(term65242, term65242.getClass(), "westPlanetImg", null);
        setField(term65242, term65242.getClass(), "eastPlanetImg", null);
        setField(term65242, term65242.getClass(), "shipImages", null);
        setBooleanField(term65242, term65242.getClass(), "drawStarField", false);
        setField(term65242, term65242.getClass(), "title", null);
        setField(term65242, term65242.getClass(), "animation", null);
        setField(term65242, term65242.getClass(), "player", null);
        setField(term65242, term65242.getClass(), "textInformation", null);
        setDoubleField(term65242, term65242.getClass(), "orbitalX", 0.0);
        setDoubleField(term65242, term65242.getClass(), "orbitalZ", 0.0);
        setIntField(term65242, term65242.getClass(), "orbitalY", 0);
        setDoubleField(term65242, term65242.getClass(), "orbitalAngle", 0.0);
        setField(term65242, term65242.getClass(), "customOrbital", null);
        setBooleanField(term65242, term65242.getClass(), "textInMiddle", false);
        setIntField(term65242, term65242.getClass(), "planetTextureOffset", 0);
        setBooleanField(term65242, term65242.getClass(), "isAlignmentXSet", false);
        setFloatField(term65242, term65242.getClass(), "alignmentX", 0.0F);
        setBooleanField(term65242, term65242.getClass(), "isAlignmentYSet", false);
        setFloatField(term65242, term65242.getClass(), "alignmentY", 0.0F);
        setField(term65242, term65242.getClass(), "ui", null);
        setField(term65242, term65242.getClass(), "listenerList", null);
        setField(term65242, term65242.getClass(), "clientProperties", null);
        setField(term65242, term65242.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term65242, term65242.getClass(), "autoscrolls", false);
        setField(term65242, term65242.getClass(), "border", null);
        setIntField(term65242, term65242.getClass(), "flags", 0);
        setField(term65242, term65242.getClass(), "inputVerifier", null);
        setBooleanField(term65242, term65242.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term65242, term65242.getClass(), "paintingChild", null);
        setField(term65242, term65242.getClass(), "popupMenu", null);
        setField(term65242, term65242.getClass(), "revalidateRunnableScheduled", null);
        setField(term65242, term65242.getClass(), "focusInputMap", null);
        setField(term65242, term65242.getClass(), "ancestorInputMap", null);
        setField(term65242, term65242.getClass(), "windowInputMap", null);
        setField(term65242, term65242.getClass(), "actionMap", null);
        setField(term65242, term65242.getClass(), "aaHint", null);
        setField(term65242, term65242.getClass(), "lcdRenderingHint", null);
        setField(term65242, term65242.getClass(), "component", null);
        setField(term65242, term65242.getClass(), "layoutMgr", null);
        setField(term65242, term65242.getClass(), "dispatcher", null);
        setField(term65242, term65242.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term65242, term65242.getClass(), "focusCycleRoot", false);
        setBooleanField(term65242, term65242.getClass(), "focusTraversalPolicyProvider", false);
        setField(term65242, term65242.getClass(), "printingThreads", null);
        setBooleanField(term65242, term65242.getClass(), "printing", false);
        setField(term65242, term65242.getClass(), "containerListener", null);
        setIntField(term65242, term65242.getClass(), "listeningChildren", 0);
        setIntField(term65242, term65242.getClass(), "listeningBoundsChildren", 0);
        setIntField(term65242, term65242.getClass(), "descendantsCount", 0);
        setField(term65242, term65242.getClass(), "preserveBackgroundColor", null);
        setIntField(term65242, term65242.getClass(), "numOfHWComponents", 0);
        setIntField(term65242, term65242.getClass(), "numOfLWComponents", 0);
        setField(term65242, term65242.getClass(), "modalComp", null);
        setField(term65242, term65242.getClass(), "modalAppContext", null);
        setIntField(term65242, term65242.getClass(), "containerSerializedDataVersion", 0);
        setField(term65242, term65242.getClass(), "peer", null);
        setField(term65242, term65242.getClass(), "parent", null);
        setField(term65242, term65242.getClass(), "appContext", null);
        setIntField(term65242, term65242.getClass(), "x", 0);
        setIntField(term65242, term65242.getClass(), "y", 0);
        setIntField(term65242, term65242.getClass(), "width", 0);
        setIntField(term65242, term65242.getClass(), "height", 0);
        setField(term65242, term65242.getClass(), "foreground", null);
        setField(term65242, term65242.getClass(), "background", null);
        setField(term65242, term65242.getClass(), "font", null);
        setField(term65242, term65242.getClass(), "peerFont", null);
        setField(term65242, term65242.getClass(), "cursor", null);
        setField(term65242, term65242.getClass(), "locale", null);
        setField(term65242, term65242.getClass(), "graphicsConfig", null);
        setField(term65242, term65242.getClass(), "bufferStrategy", null);
        setBooleanField(term65242, term65242.getClass(), "ignoreRepaint", false);
        setBooleanField(term65242, term65242.getClass(), "visible", false);
        setBooleanField(term65242, term65242.getClass(), "enabled", false);
        setBooleanField(term65242, term65242.getClass(), "valid", false);
        setField(term65242, term65242.getClass(), "dropTarget", null);
        setField(term65242, term65242.getClass(), "popups", null);
        setField(term65242, term65242.getClass(), "name", null);
        setBooleanField(term65242, term65242.getClass(), "nameExplicitlySet", false);
        setBooleanField(term65242, term65242.getClass(), "focusable", false);
        setIntField(term65242, term65242.getClass(), "isFocusTraversableOverridden", 0);
        setField(term65242, term65242.getClass(), "focusTraversalKeys", null);
        setBooleanField(term65242, term65242.getClass(), "focusTraversalKeysEnabled", false);
        setField(term65242, term65242.getClass(), "acc", null);
        setField(term65242, term65242.getClass(), "minSize", null);
        setBooleanField(term65242, term65242.getClass(), "minSizeSet", false);
        setField(term65242, term65242.getClass(), "prefSize", null);
        setBooleanField(term65242, term65242.getClass(), "prefSizeSet", false);
        setField(term65242, term65242.getClass(), "maxSize", null);
        setBooleanField(term65242, term65242.getClass(), "maxSizeSet", false);
        setField(term65242, term65242.getClass(), "componentOrientation", null);
        setBooleanField(term65242, term65242.getClass(), "newEventsOnly", false);
        setField(term65242, term65242.getClass(), "componentListener", null);
        setField(term65242, term65242.getClass(), "focusListener", null);
        setField(term65242, term65242.getClass(), "hierarchyListener", null);
        setField(term65242, term65242.getClass(), "hierarchyBoundsListener", null);
        setField(term65242, term65242.getClass(), "keyListener", null);
        setField(term65242, term65242.getClass(), "mouseListener", null);
        setField(term65242, term65242.getClass(), "mouseMotionListener", null);
        setField(term65242, term65242.getClass(), "mouseWheelListener", null);
        setField(term65242, term65242.getClass(), "inputMethodListener", null);
        setLongField(term65242, term65242.getClass(), "eventMask", 0L);
        setField(term65242, term65242.getClass(), "changeSupport", null);
        setField(term65242, term65242.getClass(), "objectLock", null);
        setBooleanField(term65242, term65242.getClass(), "isPacked", false);
        setIntField(term65242, term65242.getClass(), "boundsOp", 0);
        setField(term65242, term65242.getClass(), "compoundShape", null);
        setField(term65242, term65242.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term65242, term65242.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term65242, term65242.getClass(), "backgroundEraseDisabled", false);
        setField(term65242, term65242.getClass(), "eventCache", null);
        setBooleanField(term65242, term65242.getClass(), "coalescingEnabled", false);
        setBooleanField(term65242, term65242.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term65242, term65242.getClass(), "componentSerializedDataVersion", 0);
        setField(term65242, term65242.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigSpherePanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTitle", argTypes, term65242, args);
    }

};


