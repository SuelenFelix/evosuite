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

public class BigSpherePanel_getCustomOrbital_79790708540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65386;

    public BigSpherePanel_getCustomOrbital_79790708540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65386 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.BigSpherePanel"));
        setField(term65386, term65386.getClass(), "backgroundImg", null);
        setField(term65386, term65386.getClass(), "northPlanetImg", null);
        setField(term65386, term65386.getClass(), "southPlanetImg", null);
        setField(term65386, term65386.getClass(), "westPlanetImg", null);
        setField(term65386, term65386.getClass(), "eastPlanetImg", null);
        setField(term65386, term65386.getClass(), "shipImages", null);
        setBooleanField(term65386, term65386.getClass(), "drawStarField", false);
        setField(term65386, term65386.getClass(), "title", null);
        setField(term65386, term65386.getClass(), "animation", null);
        setField(term65386, term65386.getClass(), "player", null);
        setField(term65386, term65386.getClass(), "textInformation", null);
        setDoubleField(term65386, term65386.getClass(), "orbitalX", 0.0);
        setDoubleField(term65386, term65386.getClass(), "orbitalZ", 0.0);
        setIntField(term65386, term65386.getClass(), "orbitalY", 0);
        setDoubleField(term65386, term65386.getClass(), "orbitalAngle", 0.0);
        setField(term65386, term65386.getClass(), "customOrbital", null);
        setBooleanField(term65386, term65386.getClass(), "textInMiddle", false);
        setIntField(term65386, term65386.getClass(), "planetTextureOffset", 0);
        setBooleanField(term65386, term65386.getClass(), "isAlignmentXSet", false);
        setFloatField(term65386, term65386.getClass(), "alignmentX", 0.0F);
        setBooleanField(term65386, term65386.getClass(), "isAlignmentYSet", false);
        setFloatField(term65386, term65386.getClass(), "alignmentY", 0.0F);
        setField(term65386, term65386.getClass(), "ui", null);
        setField(term65386, term65386.getClass(), "listenerList", null);
        setField(term65386, term65386.getClass(), "clientProperties", null);
        setField(term65386, term65386.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term65386, term65386.getClass(), "autoscrolls", false);
        setField(term65386, term65386.getClass(), "border", null);
        setIntField(term65386, term65386.getClass(), "flags", 0);
        setField(term65386, term65386.getClass(), "inputVerifier", null);
        setBooleanField(term65386, term65386.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term65386, term65386.getClass(), "paintingChild", null);
        setField(term65386, term65386.getClass(), "popupMenu", null);
        setField(term65386, term65386.getClass(), "revalidateRunnableScheduled", null);
        setField(term65386, term65386.getClass(), "focusInputMap", null);
        setField(term65386, term65386.getClass(), "ancestorInputMap", null);
        setField(term65386, term65386.getClass(), "windowInputMap", null);
        setField(term65386, term65386.getClass(), "actionMap", null);
        setField(term65386, term65386.getClass(), "aaHint", null);
        setField(term65386, term65386.getClass(), "lcdRenderingHint", null);
        setField(term65386, term65386.getClass(), "component", null);
        setField(term65386, term65386.getClass(), "layoutMgr", null);
        setField(term65386, term65386.getClass(), "dispatcher", null);
        setField(term65386, term65386.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term65386, term65386.getClass(), "focusCycleRoot", false);
        setBooleanField(term65386, term65386.getClass(), "focusTraversalPolicyProvider", false);
        setField(term65386, term65386.getClass(), "printingThreads", null);
        setBooleanField(term65386, term65386.getClass(), "printing", false);
        setField(term65386, term65386.getClass(), "containerListener", null);
        setIntField(term65386, term65386.getClass(), "listeningChildren", 0);
        setIntField(term65386, term65386.getClass(), "listeningBoundsChildren", 0);
        setIntField(term65386, term65386.getClass(), "descendantsCount", 0);
        setField(term65386, term65386.getClass(), "preserveBackgroundColor", null);
        setIntField(term65386, term65386.getClass(), "numOfHWComponents", 0);
        setIntField(term65386, term65386.getClass(), "numOfLWComponents", 0);
        setField(term65386, term65386.getClass(), "modalComp", null);
        setField(term65386, term65386.getClass(), "modalAppContext", null);
        setIntField(term65386, term65386.getClass(), "containerSerializedDataVersion", 0);
        setField(term65386, term65386.getClass(), "peer", null);
        setField(term65386, term65386.getClass(), "parent", null);
        setField(term65386, term65386.getClass(), "appContext", null);
        setIntField(term65386, term65386.getClass(), "x", 0);
        setIntField(term65386, term65386.getClass(), "y", 0);
        setIntField(term65386, term65386.getClass(), "width", 0);
        setIntField(term65386, term65386.getClass(), "height", 0);
        setField(term65386, term65386.getClass(), "foreground", null);
        setField(term65386, term65386.getClass(), "background", null);
        setField(term65386, term65386.getClass(), "font", null);
        setField(term65386, term65386.getClass(), "peerFont", null);
        setField(term65386, term65386.getClass(), "cursor", null);
        setField(term65386, term65386.getClass(), "locale", null);
        setField(term65386, term65386.getClass(), "graphicsConfig", null);
        setField(term65386, term65386.getClass(), "bufferStrategy", null);
        setBooleanField(term65386, term65386.getClass(), "ignoreRepaint", false);
        setBooleanField(term65386, term65386.getClass(), "visible", false);
        setBooleanField(term65386, term65386.getClass(), "enabled", false);
        setBooleanField(term65386, term65386.getClass(), "valid", false);
        setField(term65386, term65386.getClass(), "dropTarget", null);
        setField(term65386, term65386.getClass(), "popups", null);
        setField(term65386, term65386.getClass(), "name", null);
        setBooleanField(term65386, term65386.getClass(), "nameExplicitlySet", false);
        setBooleanField(term65386, term65386.getClass(), "focusable", false);
        setIntField(term65386, term65386.getClass(), "isFocusTraversableOverridden", 0);
        setField(term65386, term65386.getClass(), "focusTraversalKeys", null);
        setBooleanField(term65386, term65386.getClass(), "focusTraversalKeysEnabled", false);
        setField(term65386, term65386.getClass(), "acc", null);
        setField(term65386, term65386.getClass(), "minSize", null);
        setBooleanField(term65386, term65386.getClass(), "minSizeSet", false);
        setField(term65386, term65386.getClass(), "prefSize", null);
        setBooleanField(term65386, term65386.getClass(), "prefSizeSet", false);
        setField(term65386, term65386.getClass(), "maxSize", null);
        setBooleanField(term65386, term65386.getClass(), "maxSizeSet", false);
        setField(term65386, term65386.getClass(), "componentOrientation", null);
        setBooleanField(term65386, term65386.getClass(), "newEventsOnly", false);
        setField(term65386, term65386.getClass(), "componentListener", null);
        setField(term65386, term65386.getClass(), "focusListener", null);
        setField(term65386, term65386.getClass(), "hierarchyListener", null);
        setField(term65386, term65386.getClass(), "hierarchyBoundsListener", null);
        setField(term65386, term65386.getClass(), "keyListener", null);
        setField(term65386, term65386.getClass(), "mouseListener", null);
        setField(term65386, term65386.getClass(), "mouseMotionListener", null);
        setField(term65386, term65386.getClass(), "mouseWheelListener", null);
        setField(term65386, term65386.getClass(), "inputMethodListener", null);
        setLongField(term65386, term65386.getClass(), "eventMask", 0L);
        setField(term65386, term65386.getClass(), "changeSupport", null);
        setField(term65386, term65386.getClass(), "objectLock", null);
        setBooleanField(term65386, term65386.getClass(), "isPacked", false);
        setIntField(term65386, term65386.getClass(), "boundsOp", 0);
        setField(term65386, term65386.getClass(), "compoundShape", null);
        setField(term65386, term65386.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term65386, term65386.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term65386, term65386.getClass(), "backgroundEraseDisabled", false);
        setField(term65386, term65386.getClass(), "eventCache", null);
        setBooleanField(term65386, term65386.getClass(), "coalescingEnabled", false);
        setBooleanField(term65386, term65386.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term65386, term65386.getClass(), "componentSerializedDataVersion", 0);
        setField(term65386, term65386.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigSpherePanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCustomOrbital", argTypes, term65386, args);
    }

};


