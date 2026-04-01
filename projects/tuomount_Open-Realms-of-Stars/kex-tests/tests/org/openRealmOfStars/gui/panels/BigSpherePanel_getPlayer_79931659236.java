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

public class BigSpherePanel_getPlayer_79931659236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65194;

    public BigSpherePanel_getPlayer_79931659236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65194 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.BigSpherePanel"));
        setField(term65194, term65194.getClass(), "backgroundImg", null);
        setField(term65194, term65194.getClass(), "northPlanetImg", null);
        setField(term65194, term65194.getClass(), "southPlanetImg", null);
        setField(term65194, term65194.getClass(), "westPlanetImg", null);
        setField(term65194, term65194.getClass(), "eastPlanetImg", null);
        setField(term65194, term65194.getClass(), "shipImages", null);
        setBooleanField(term65194, term65194.getClass(), "drawStarField", false);
        setField(term65194, term65194.getClass(), "title", null);
        setField(term65194, term65194.getClass(), "animation", null);
        setField(term65194, term65194.getClass(), "player", null);
        setField(term65194, term65194.getClass(), "textInformation", null);
        setDoubleField(term65194, term65194.getClass(), "orbitalX", 0.0);
        setDoubleField(term65194, term65194.getClass(), "orbitalZ", 0.0);
        setIntField(term65194, term65194.getClass(), "orbitalY", 0);
        setDoubleField(term65194, term65194.getClass(), "orbitalAngle", 0.0);
        setField(term65194, term65194.getClass(), "customOrbital", null);
        setBooleanField(term65194, term65194.getClass(), "textInMiddle", false);
        setIntField(term65194, term65194.getClass(), "planetTextureOffset", 0);
        setBooleanField(term65194, term65194.getClass(), "isAlignmentXSet", false);
        setFloatField(term65194, term65194.getClass(), "alignmentX", 0.0F);
        setBooleanField(term65194, term65194.getClass(), "isAlignmentYSet", false);
        setFloatField(term65194, term65194.getClass(), "alignmentY", 0.0F);
        setField(term65194, term65194.getClass(), "ui", null);
        setField(term65194, term65194.getClass(), "listenerList", null);
        setField(term65194, term65194.getClass(), "clientProperties", null);
        setField(term65194, term65194.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term65194, term65194.getClass(), "autoscrolls", false);
        setField(term65194, term65194.getClass(), "border", null);
        setIntField(term65194, term65194.getClass(), "flags", 0);
        setField(term65194, term65194.getClass(), "inputVerifier", null);
        setBooleanField(term65194, term65194.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term65194, term65194.getClass(), "paintingChild", null);
        setField(term65194, term65194.getClass(), "popupMenu", null);
        setField(term65194, term65194.getClass(), "revalidateRunnableScheduled", null);
        setField(term65194, term65194.getClass(), "focusInputMap", null);
        setField(term65194, term65194.getClass(), "ancestorInputMap", null);
        setField(term65194, term65194.getClass(), "windowInputMap", null);
        setField(term65194, term65194.getClass(), "actionMap", null);
        setField(term65194, term65194.getClass(), "aaHint", null);
        setField(term65194, term65194.getClass(), "lcdRenderingHint", null);
        setField(term65194, term65194.getClass(), "component", null);
        setField(term65194, term65194.getClass(), "layoutMgr", null);
        setField(term65194, term65194.getClass(), "dispatcher", null);
        setField(term65194, term65194.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term65194, term65194.getClass(), "focusCycleRoot", false);
        setBooleanField(term65194, term65194.getClass(), "focusTraversalPolicyProvider", false);
        setField(term65194, term65194.getClass(), "printingThreads", null);
        setBooleanField(term65194, term65194.getClass(), "printing", false);
        setField(term65194, term65194.getClass(), "containerListener", null);
        setIntField(term65194, term65194.getClass(), "listeningChildren", 0);
        setIntField(term65194, term65194.getClass(), "listeningBoundsChildren", 0);
        setIntField(term65194, term65194.getClass(), "descendantsCount", 0);
        setField(term65194, term65194.getClass(), "preserveBackgroundColor", null);
        setIntField(term65194, term65194.getClass(), "numOfHWComponents", 0);
        setIntField(term65194, term65194.getClass(), "numOfLWComponents", 0);
        setField(term65194, term65194.getClass(), "modalComp", null);
        setField(term65194, term65194.getClass(), "modalAppContext", null);
        setIntField(term65194, term65194.getClass(), "containerSerializedDataVersion", 0);
        setField(term65194, term65194.getClass(), "peer", null);
        setField(term65194, term65194.getClass(), "parent", null);
        setField(term65194, term65194.getClass(), "appContext", null);
        setIntField(term65194, term65194.getClass(), "x", 0);
        setIntField(term65194, term65194.getClass(), "y", 0);
        setIntField(term65194, term65194.getClass(), "width", 0);
        setIntField(term65194, term65194.getClass(), "height", 0);
        setField(term65194, term65194.getClass(), "foreground", null);
        setField(term65194, term65194.getClass(), "background", null);
        setField(term65194, term65194.getClass(), "font", null);
        setField(term65194, term65194.getClass(), "peerFont", null);
        setField(term65194, term65194.getClass(), "cursor", null);
        setField(term65194, term65194.getClass(), "locale", null);
        setField(term65194, term65194.getClass(), "graphicsConfig", null);
        setField(term65194, term65194.getClass(), "bufferStrategy", null);
        setBooleanField(term65194, term65194.getClass(), "ignoreRepaint", false);
        setBooleanField(term65194, term65194.getClass(), "visible", false);
        setBooleanField(term65194, term65194.getClass(), "enabled", false);
        setBooleanField(term65194, term65194.getClass(), "valid", false);
        setField(term65194, term65194.getClass(), "dropTarget", null);
        setField(term65194, term65194.getClass(), "popups", null);
        setField(term65194, term65194.getClass(), "name", null);
        setBooleanField(term65194, term65194.getClass(), "nameExplicitlySet", false);
        setBooleanField(term65194, term65194.getClass(), "focusable", false);
        setIntField(term65194, term65194.getClass(), "isFocusTraversableOverridden", 0);
        setField(term65194, term65194.getClass(), "focusTraversalKeys", null);
        setBooleanField(term65194, term65194.getClass(), "focusTraversalKeysEnabled", false);
        setField(term65194, term65194.getClass(), "acc", null);
        setField(term65194, term65194.getClass(), "minSize", null);
        setBooleanField(term65194, term65194.getClass(), "minSizeSet", false);
        setField(term65194, term65194.getClass(), "prefSize", null);
        setBooleanField(term65194, term65194.getClass(), "prefSizeSet", false);
        setField(term65194, term65194.getClass(), "maxSize", null);
        setBooleanField(term65194, term65194.getClass(), "maxSizeSet", false);
        setField(term65194, term65194.getClass(), "componentOrientation", null);
        setBooleanField(term65194, term65194.getClass(), "newEventsOnly", false);
        setField(term65194, term65194.getClass(), "componentListener", null);
        setField(term65194, term65194.getClass(), "focusListener", null);
        setField(term65194, term65194.getClass(), "hierarchyListener", null);
        setField(term65194, term65194.getClass(), "hierarchyBoundsListener", null);
        setField(term65194, term65194.getClass(), "keyListener", null);
        setField(term65194, term65194.getClass(), "mouseListener", null);
        setField(term65194, term65194.getClass(), "mouseMotionListener", null);
        setField(term65194, term65194.getClass(), "mouseWheelListener", null);
        setField(term65194, term65194.getClass(), "inputMethodListener", null);
        setLongField(term65194, term65194.getClass(), "eventMask", 0L);
        setField(term65194, term65194.getClass(), "changeSupport", null);
        setField(term65194, term65194.getClass(), "objectLock", null);
        setBooleanField(term65194, term65194.getClass(), "isPacked", false);
        setIntField(term65194, term65194.getClass(), "boundsOp", 0);
        setField(term65194, term65194.getClass(), "compoundShape", null);
        setField(term65194, term65194.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term65194, term65194.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term65194, term65194.getClass(), "backgroundEraseDisabled", false);
        setField(term65194, term65194.getClass(), "eventCache", null);
        setBooleanField(term65194, term65194.getClass(), "coalescingEnabled", false);
        setBooleanField(term65194, term65194.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term65194, term65194.getClass(), "componentSerializedDataVersion", 0);
        setField(term65194, term65194.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigSpherePanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayer", argTypes, term65194, args);
    }

};


