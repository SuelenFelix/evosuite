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

public class BigSpherePanel_getAnimation_21463616134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65098;

    public BigSpherePanel_getAnimation_21463616134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65098 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.BigSpherePanel"));
        setField(term65098, term65098.getClass(), "backgroundImg", null);
        setField(term65098, term65098.getClass(), "northPlanetImg", null);
        setField(term65098, term65098.getClass(), "southPlanetImg", null);
        setField(term65098, term65098.getClass(), "westPlanetImg", null);
        setField(term65098, term65098.getClass(), "eastPlanetImg", null);
        setField(term65098, term65098.getClass(), "shipImages", null);
        setBooleanField(term65098, term65098.getClass(), "drawStarField", false);
        setField(term65098, term65098.getClass(), "title", null);
        setField(term65098, term65098.getClass(), "animation", null);
        setField(term65098, term65098.getClass(), "player", null);
        setField(term65098, term65098.getClass(), "textInformation", null);
        setDoubleField(term65098, term65098.getClass(), "orbitalX", 0.0);
        setDoubleField(term65098, term65098.getClass(), "orbitalZ", 0.0);
        setIntField(term65098, term65098.getClass(), "orbitalY", 0);
        setDoubleField(term65098, term65098.getClass(), "orbitalAngle", 0.0);
        setField(term65098, term65098.getClass(), "customOrbital", null);
        setBooleanField(term65098, term65098.getClass(), "textInMiddle", false);
        setIntField(term65098, term65098.getClass(), "planetTextureOffset", 0);
        setBooleanField(term65098, term65098.getClass(), "isAlignmentXSet", false);
        setFloatField(term65098, term65098.getClass(), "alignmentX", 0.0F);
        setBooleanField(term65098, term65098.getClass(), "isAlignmentYSet", false);
        setFloatField(term65098, term65098.getClass(), "alignmentY", 0.0F);
        setField(term65098, term65098.getClass(), "ui", null);
        setField(term65098, term65098.getClass(), "listenerList", null);
        setField(term65098, term65098.getClass(), "clientProperties", null);
        setField(term65098, term65098.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term65098, term65098.getClass(), "autoscrolls", false);
        setField(term65098, term65098.getClass(), "border", null);
        setIntField(term65098, term65098.getClass(), "flags", 0);
        setField(term65098, term65098.getClass(), "inputVerifier", null);
        setBooleanField(term65098, term65098.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term65098, term65098.getClass(), "paintingChild", null);
        setField(term65098, term65098.getClass(), "popupMenu", null);
        setField(term65098, term65098.getClass(), "revalidateRunnableScheduled", null);
        setField(term65098, term65098.getClass(), "focusInputMap", null);
        setField(term65098, term65098.getClass(), "ancestorInputMap", null);
        setField(term65098, term65098.getClass(), "windowInputMap", null);
        setField(term65098, term65098.getClass(), "actionMap", null);
        setField(term65098, term65098.getClass(), "aaHint", null);
        setField(term65098, term65098.getClass(), "lcdRenderingHint", null);
        setField(term65098, term65098.getClass(), "component", null);
        setField(term65098, term65098.getClass(), "layoutMgr", null);
        setField(term65098, term65098.getClass(), "dispatcher", null);
        setField(term65098, term65098.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term65098, term65098.getClass(), "focusCycleRoot", false);
        setBooleanField(term65098, term65098.getClass(), "focusTraversalPolicyProvider", false);
        setField(term65098, term65098.getClass(), "printingThreads", null);
        setBooleanField(term65098, term65098.getClass(), "printing", false);
        setField(term65098, term65098.getClass(), "containerListener", null);
        setIntField(term65098, term65098.getClass(), "listeningChildren", 0);
        setIntField(term65098, term65098.getClass(), "listeningBoundsChildren", 0);
        setIntField(term65098, term65098.getClass(), "descendantsCount", 0);
        setField(term65098, term65098.getClass(), "preserveBackgroundColor", null);
        setIntField(term65098, term65098.getClass(), "numOfHWComponents", 0);
        setIntField(term65098, term65098.getClass(), "numOfLWComponents", 0);
        setField(term65098, term65098.getClass(), "modalComp", null);
        setField(term65098, term65098.getClass(), "modalAppContext", null);
        setIntField(term65098, term65098.getClass(), "containerSerializedDataVersion", 0);
        setField(term65098, term65098.getClass(), "peer", null);
        setField(term65098, term65098.getClass(), "parent", null);
        setField(term65098, term65098.getClass(), "appContext", null);
        setIntField(term65098, term65098.getClass(), "x", 0);
        setIntField(term65098, term65098.getClass(), "y", 0);
        setIntField(term65098, term65098.getClass(), "width", 0);
        setIntField(term65098, term65098.getClass(), "height", 0);
        setField(term65098, term65098.getClass(), "foreground", null);
        setField(term65098, term65098.getClass(), "background", null);
        setField(term65098, term65098.getClass(), "font", null);
        setField(term65098, term65098.getClass(), "peerFont", null);
        setField(term65098, term65098.getClass(), "cursor", null);
        setField(term65098, term65098.getClass(), "locale", null);
        setField(term65098, term65098.getClass(), "graphicsConfig", null);
        setField(term65098, term65098.getClass(), "bufferStrategy", null);
        setBooleanField(term65098, term65098.getClass(), "ignoreRepaint", false);
        setBooleanField(term65098, term65098.getClass(), "visible", false);
        setBooleanField(term65098, term65098.getClass(), "enabled", false);
        setBooleanField(term65098, term65098.getClass(), "valid", false);
        setField(term65098, term65098.getClass(), "dropTarget", null);
        setField(term65098, term65098.getClass(), "popups", null);
        setField(term65098, term65098.getClass(), "name", null);
        setBooleanField(term65098, term65098.getClass(), "nameExplicitlySet", false);
        setBooleanField(term65098, term65098.getClass(), "focusable", false);
        setIntField(term65098, term65098.getClass(), "isFocusTraversableOverridden", 0);
        setField(term65098, term65098.getClass(), "focusTraversalKeys", null);
        setBooleanField(term65098, term65098.getClass(), "focusTraversalKeysEnabled", false);
        setField(term65098, term65098.getClass(), "acc", null);
        setField(term65098, term65098.getClass(), "minSize", null);
        setBooleanField(term65098, term65098.getClass(), "minSizeSet", false);
        setField(term65098, term65098.getClass(), "prefSize", null);
        setBooleanField(term65098, term65098.getClass(), "prefSizeSet", false);
        setField(term65098, term65098.getClass(), "maxSize", null);
        setBooleanField(term65098, term65098.getClass(), "maxSizeSet", false);
        setField(term65098, term65098.getClass(), "componentOrientation", null);
        setBooleanField(term65098, term65098.getClass(), "newEventsOnly", false);
        setField(term65098, term65098.getClass(), "componentListener", null);
        setField(term65098, term65098.getClass(), "focusListener", null);
        setField(term65098, term65098.getClass(), "hierarchyListener", null);
        setField(term65098, term65098.getClass(), "hierarchyBoundsListener", null);
        setField(term65098, term65098.getClass(), "keyListener", null);
        setField(term65098, term65098.getClass(), "mouseListener", null);
        setField(term65098, term65098.getClass(), "mouseMotionListener", null);
        setField(term65098, term65098.getClass(), "mouseWheelListener", null);
        setField(term65098, term65098.getClass(), "inputMethodListener", null);
        setLongField(term65098, term65098.getClass(), "eventMask", 0L);
        setField(term65098, term65098.getClass(), "changeSupport", null);
        setField(term65098, term65098.getClass(), "objectLock", null);
        setBooleanField(term65098, term65098.getClass(), "isPacked", false);
        setIntField(term65098, term65098.getClass(), "boundsOp", 0);
        setField(term65098, term65098.getClass(), "compoundShape", null);
        setField(term65098, term65098.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term65098, term65098.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term65098, term65098.getClass(), "backgroundEraseDisabled", false);
        setField(term65098, term65098.getClass(), "eventCache", null);
        setBooleanField(term65098, term65098.getClass(), "coalescingEnabled", false);
        setBooleanField(term65098, term65098.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term65098, term65098.getClass(), "componentSerializedDataVersion", 0);
        setField(term65098, term65098.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigSpherePanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAnimation", argTypes, term65098, args);
    }

};


