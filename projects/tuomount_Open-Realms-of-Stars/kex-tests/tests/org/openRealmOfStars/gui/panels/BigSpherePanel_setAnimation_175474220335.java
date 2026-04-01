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

public class BigSpherePanel_setAnimation_175474220335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65146;

    public BigSpherePanel_setAnimation_175474220335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65146 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.BigSpherePanel"));
        setField(term65146, term65146.getClass(), "backgroundImg", null);
        setField(term65146, term65146.getClass(), "northPlanetImg", null);
        setField(term65146, term65146.getClass(), "southPlanetImg", null);
        setField(term65146, term65146.getClass(), "westPlanetImg", null);
        setField(term65146, term65146.getClass(), "eastPlanetImg", null);
        setField(term65146, term65146.getClass(), "shipImages", null);
        setBooleanField(term65146, term65146.getClass(), "drawStarField", false);
        setField(term65146, term65146.getClass(), "title", null);
        setField(term65146, term65146.getClass(), "animation", null);
        setField(term65146, term65146.getClass(), "player", null);
        setField(term65146, term65146.getClass(), "textInformation", null);
        setDoubleField(term65146, term65146.getClass(), "orbitalX", 0.0);
        setDoubleField(term65146, term65146.getClass(), "orbitalZ", 0.0);
        setIntField(term65146, term65146.getClass(), "orbitalY", 0);
        setDoubleField(term65146, term65146.getClass(), "orbitalAngle", 0.0);
        setField(term65146, term65146.getClass(), "customOrbital", null);
        setBooleanField(term65146, term65146.getClass(), "textInMiddle", false);
        setIntField(term65146, term65146.getClass(), "planetTextureOffset", 0);
        setBooleanField(term65146, term65146.getClass(), "isAlignmentXSet", false);
        setFloatField(term65146, term65146.getClass(), "alignmentX", 0.0F);
        setBooleanField(term65146, term65146.getClass(), "isAlignmentYSet", false);
        setFloatField(term65146, term65146.getClass(), "alignmentY", 0.0F);
        setField(term65146, term65146.getClass(), "ui", null);
        setField(term65146, term65146.getClass(), "listenerList", null);
        setField(term65146, term65146.getClass(), "clientProperties", null);
        setField(term65146, term65146.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term65146, term65146.getClass(), "autoscrolls", false);
        setField(term65146, term65146.getClass(), "border", null);
        setIntField(term65146, term65146.getClass(), "flags", 0);
        setField(term65146, term65146.getClass(), "inputVerifier", null);
        setBooleanField(term65146, term65146.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term65146, term65146.getClass(), "paintingChild", null);
        setField(term65146, term65146.getClass(), "popupMenu", null);
        setField(term65146, term65146.getClass(), "revalidateRunnableScheduled", null);
        setField(term65146, term65146.getClass(), "focusInputMap", null);
        setField(term65146, term65146.getClass(), "ancestorInputMap", null);
        setField(term65146, term65146.getClass(), "windowInputMap", null);
        setField(term65146, term65146.getClass(), "actionMap", null);
        setField(term65146, term65146.getClass(), "aaHint", null);
        setField(term65146, term65146.getClass(), "lcdRenderingHint", null);
        setField(term65146, term65146.getClass(), "component", null);
        setField(term65146, term65146.getClass(), "layoutMgr", null);
        setField(term65146, term65146.getClass(), "dispatcher", null);
        setField(term65146, term65146.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term65146, term65146.getClass(), "focusCycleRoot", false);
        setBooleanField(term65146, term65146.getClass(), "focusTraversalPolicyProvider", false);
        setField(term65146, term65146.getClass(), "printingThreads", null);
        setBooleanField(term65146, term65146.getClass(), "printing", false);
        setField(term65146, term65146.getClass(), "containerListener", null);
        setIntField(term65146, term65146.getClass(), "listeningChildren", 0);
        setIntField(term65146, term65146.getClass(), "listeningBoundsChildren", 0);
        setIntField(term65146, term65146.getClass(), "descendantsCount", 0);
        setField(term65146, term65146.getClass(), "preserveBackgroundColor", null);
        setIntField(term65146, term65146.getClass(), "numOfHWComponents", 0);
        setIntField(term65146, term65146.getClass(), "numOfLWComponents", 0);
        setField(term65146, term65146.getClass(), "modalComp", null);
        setField(term65146, term65146.getClass(), "modalAppContext", null);
        setIntField(term65146, term65146.getClass(), "containerSerializedDataVersion", 0);
        setField(term65146, term65146.getClass(), "peer", null);
        setField(term65146, term65146.getClass(), "parent", null);
        setField(term65146, term65146.getClass(), "appContext", null);
        setIntField(term65146, term65146.getClass(), "x", 0);
        setIntField(term65146, term65146.getClass(), "y", 0);
        setIntField(term65146, term65146.getClass(), "width", 0);
        setIntField(term65146, term65146.getClass(), "height", 0);
        setField(term65146, term65146.getClass(), "foreground", null);
        setField(term65146, term65146.getClass(), "background", null);
        setField(term65146, term65146.getClass(), "font", null);
        setField(term65146, term65146.getClass(), "peerFont", null);
        setField(term65146, term65146.getClass(), "cursor", null);
        setField(term65146, term65146.getClass(), "locale", null);
        setField(term65146, term65146.getClass(), "graphicsConfig", null);
        setField(term65146, term65146.getClass(), "bufferStrategy", null);
        setBooleanField(term65146, term65146.getClass(), "ignoreRepaint", false);
        setBooleanField(term65146, term65146.getClass(), "visible", false);
        setBooleanField(term65146, term65146.getClass(), "enabled", false);
        setBooleanField(term65146, term65146.getClass(), "valid", false);
        setField(term65146, term65146.getClass(), "dropTarget", null);
        setField(term65146, term65146.getClass(), "popups", null);
        setField(term65146, term65146.getClass(), "name", null);
        setBooleanField(term65146, term65146.getClass(), "nameExplicitlySet", false);
        setBooleanField(term65146, term65146.getClass(), "focusable", false);
        setIntField(term65146, term65146.getClass(), "isFocusTraversableOverridden", 0);
        setField(term65146, term65146.getClass(), "focusTraversalKeys", null);
        setBooleanField(term65146, term65146.getClass(), "focusTraversalKeysEnabled", false);
        setField(term65146, term65146.getClass(), "acc", null);
        setField(term65146, term65146.getClass(), "minSize", null);
        setBooleanField(term65146, term65146.getClass(), "minSizeSet", false);
        setField(term65146, term65146.getClass(), "prefSize", null);
        setBooleanField(term65146, term65146.getClass(), "prefSizeSet", false);
        setField(term65146, term65146.getClass(), "maxSize", null);
        setBooleanField(term65146, term65146.getClass(), "maxSizeSet", false);
        setField(term65146, term65146.getClass(), "componentOrientation", null);
        setBooleanField(term65146, term65146.getClass(), "newEventsOnly", false);
        setField(term65146, term65146.getClass(), "componentListener", null);
        setField(term65146, term65146.getClass(), "focusListener", null);
        setField(term65146, term65146.getClass(), "hierarchyListener", null);
        setField(term65146, term65146.getClass(), "hierarchyBoundsListener", null);
        setField(term65146, term65146.getClass(), "keyListener", null);
        setField(term65146, term65146.getClass(), "mouseListener", null);
        setField(term65146, term65146.getClass(), "mouseMotionListener", null);
        setField(term65146, term65146.getClass(), "mouseWheelListener", null);
        setField(term65146, term65146.getClass(), "inputMethodListener", null);
        setLongField(term65146, term65146.getClass(), "eventMask", 0L);
        setField(term65146, term65146.getClass(), "changeSupport", null);
        setField(term65146, term65146.getClass(), "objectLock", null);
        setBooleanField(term65146, term65146.getClass(), "isPacked", false);
        setIntField(term65146, term65146.getClass(), "boundsOp", 0);
        setField(term65146, term65146.getClass(), "compoundShape", null);
        setField(term65146, term65146.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term65146, term65146.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term65146, term65146.getClass(), "backgroundEraseDisabled", false);
        setField(term65146, term65146.getClass(), "eventCache", null);
        setBooleanField(term65146, term65146.getClass(), "coalescingEnabled", false);
        setBooleanField(term65146, term65146.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term65146, term65146.getClass(), "componentSerializedDataVersion", 0);
        setField(term65146, term65146.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigSpherePanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.gui.mapPanel.PlanetAnimation");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setAnimation", argTypes, term65146, args);
    }

};


