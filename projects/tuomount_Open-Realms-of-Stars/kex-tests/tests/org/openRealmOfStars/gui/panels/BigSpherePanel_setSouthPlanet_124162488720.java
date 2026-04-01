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

public class BigSpherePanel_setSouthPlanet_124162488720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57566;

    public BigSpherePanel_setSouthPlanet_124162488720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57566 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.BigSpherePanel"));
        setField(term57566, term57566.getClass(), "backgroundImg", null);
        setField(term57566, term57566.getClass(), "northPlanetImg", null);
        setField(term57566, term57566.getClass(), "southPlanetImg", null);
        setField(term57566, term57566.getClass(), "westPlanetImg", null);
        setField(term57566, term57566.getClass(), "eastPlanetImg", null);
        setField(term57566, term57566.getClass(), "shipImages", null);
        setBooleanField(term57566, term57566.getClass(), "drawStarField", false);
        setField(term57566, term57566.getClass(), "title", null);
        setField(term57566, term57566.getClass(), "animation", null);
        setField(term57566, term57566.getClass(), "player", null);
        setField(term57566, term57566.getClass(), "textInformation", null);
        setDoubleField(term57566, term57566.getClass(), "orbitalX", 0.0);
        setDoubleField(term57566, term57566.getClass(), "orbitalZ", 0.0);
        setIntField(term57566, term57566.getClass(), "orbitalY", 0);
        setDoubleField(term57566, term57566.getClass(), "orbitalAngle", 0.0);
        setField(term57566, term57566.getClass(), "customOrbital", null);
        setBooleanField(term57566, term57566.getClass(), "textInMiddle", false);
        setIntField(term57566, term57566.getClass(), "planetTextureOffset", 0);
        setBooleanField(term57566, term57566.getClass(), "isAlignmentXSet", false);
        setFloatField(term57566, term57566.getClass(), "alignmentX", 0.0F);
        setBooleanField(term57566, term57566.getClass(), "isAlignmentYSet", false);
        setFloatField(term57566, term57566.getClass(), "alignmentY", 0.0F);
        setField(term57566, term57566.getClass(), "ui", null);
        setField(term57566, term57566.getClass(), "listenerList", null);
        setField(term57566, term57566.getClass(), "clientProperties", null);
        setField(term57566, term57566.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term57566, term57566.getClass(), "autoscrolls", false);
        setField(term57566, term57566.getClass(), "border", null);
        setIntField(term57566, term57566.getClass(), "flags", 0);
        setField(term57566, term57566.getClass(), "inputVerifier", null);
        setBooleanField(term57566, term57566.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term57566, term57566.getClass(), "paintingChild", null);
        setField(term57566, term57566.getClass(), "popupMenu", null);
        setField(term57566, term57566.getClass(), "revalidateRunnableScheduled", null);
        setField(term57566, term57566.getClass(), "focusInputMap", null);
        setField(term57566, term57566.getClass(), "ancestorInputMap", null);
        setField(term57566, term57566.getClass(), "windowInputMap", null);
        setField(term57566, term57566.getClass(), "actionMap", null);
        setField(term57566, term57566.getClass(), "aaHint", null);
        setField(term57566, term57566.getClass(), "lcdRenderingHint", null);
        setField(term57566, term57566.getClass(), "component", null);
        setField(term57566, term57566.getClass(), "layoutMgr", null);
        setField(term57566, term57566.getClass(), "dispatcher", null);
        setField(term57566, term57566.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term57566, term57566.getClass(), "focusCycleRoot", false);
        setBooleanField(term57566, term57566.getClass(), "focusTraversalPolicyProvider", false);
        setField(term57566, term57566.getClass(), "printingThreads", null);
        setBooleanField(term57566, term57566.getClass(), "printing", false);
        setField(term57566, term57566.getClass(), "containerListener", null);
        setIntField(term57566, term57566.getClass(), "listeningChildren", 0);
        setIntField(term57566, term57566.getClass(), "listeningBoundsChildren", 0);
        setIntField(term57566, term57566.getClass(), "descendantsCount", 0);
        setField(term57566, term57566.getClass(), "preserveBackgroundColor", null);
        setIntField(term57566, term57566.getClass(), "numOfHWComponents", 0);
        setIntField(term57566, term57566.getClass(), "numOfLWComponents", 0);
        setField(term57566, term57566.getClass(), "modalComp", null);
        setField(term57566, term57566.getClass(), "modalAppContext", null);
        setIntField(term57566, term57566.getClass(), "containerSerializedDataVersion", 0);
        setField(term57566, term57566.getClass(), "peer", null);
        setField(term57566, term57566.getClass(), "parent", null);
        setField(term57566, term57566.getClass(), "appContext", null);
        setIntField(term57566, term57566.getClass(), "x", 0);
        setIntField(term57566, term57566.getClass(), "y", 0);
        setIntField(term57566, term57566.getClass(), "width", 0);
        setIntField(term57566, term57566.getClass(), "height", 0);
        setField(term57566, term57566.getClass(), "foreground", null);
        setField(term57566, term57566.getClass(), "background", null);
        setField(term57566, term57566.getClass(), "font", null);
        setField(term57566, term57566.getClass(), "peerFont", null);
        setField(term57566, term57566.getClass(), "cursor", null);
        setField(term57566, term57566.getClass(), "locale", null);
        setField(term57566, term57566.getClass(), "graphicsConfig", null);
        setField(term57566, term57566.getClass(), "bufferStrategy", null);
        setBooleanField(term57566, term57566.getClass(), "ignoreRepaint", false);
        setBooleanField(term57566, term57566.getClass(), "visible", false);
        setBooleanField(term57566, term57566.getClass(), "enabled", false);
        setBooleanField(term57566, term57566.getClass(), "valid", false);
        setField(term57566, term57566.getClass(), "dropTarget", null);
        setField(term57566, term57566.getClass(), "popups", null);
        setField(term57566, term57566.getClass(), "name", null);
        setBooleanField(term57566, term57566.getClass(), "nameExplicitlySet", false);
        setBooleanField(term57566, term57566.getClass(), "focusable", false);
        setIntField(term57566, term57566.getClass(), "isFocusTraversableOverridden", 0);
        setField(term57566, term57566.getClass(), "focusTraversalKeys", null);
        setBooleanField(term57566, term57566.getClass(), "focusTraversalKeysEnabled", false);
        setField(term57566, term57566.getClass(), "acc", null);
        setField(term57566, term57566.getClass(), "minSize", null);
        setBooleanField(term57566, term57566.getClass(), "minSizeSet", false);
        setField(term57566, term57566.getClass(), "prefSize", null);
        setBooleanField(term57566, term57566.getClass(), "prefSizeSet", false);
        setField(term57566, term57566.getClass(), "maxSize", null);
        setBooleanField(term57566, term57566.getClass(), "maxSizeSet", false);
        setField(term57566, term57566.getClass(), "componentOrientation", null);
        setBooleanField(term57566, term57566.getClass(), "newEventsOnly", false);
        setField(term57566, term57566.getClass(), "componentListener", null);
        setField(term57566, term57566.getClass(), "focusListener", null);
        setField(term57566, term57566.getClass(), "hierarchyListener", null);
        setField(term57566, term57566.getClass(), "hierarchyBoundsListener", null);
        setField(term57566, term57566.getClass(), "keyListener", null);
        setField(term57566, term57566.getClass(), "mouseListener", null);
        setField(term57566, term57566.getClass(), "mouseMotionListener", null);
        setField(term57566, term57566.getClass(), "mouseWheelListener", null);
        setField(term57566, term57566.getClass(), "inputMethodListener", null);
        setLongField(term57566, term57566.getClass(), "eventMask", 0L);
        setField(term57566, term57566.getClass(), "changeSupport", null);
        setField(term57566, term57566.getClass(), "objectLock", null);
        setBooleanField(term57566, term57566.getClass(), "isPacked", false);
        setIntField(term57566, term57566.getClass(), "boundsOp", 0);
        setField(term57566, term57566.getClass(), "compoundShape", null);
        setField(term57566, term57566.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term57566, term57566.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term57566, term57566.getClass(), "backgroundEraseDisabled", false);
        setField(term57566, term57566.getClass(), "eventCache", null);
        setBooleanField(term57566, term57566.getClass(), "coalescingEnabled", false);
        setBooleanField(term57566, term57566.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term57566, term57566.getClass(), "componentSerializedDataVersion", 0);
        setField(term57566, term57566.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigSpherePanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSouthPlanet", argTypes, term57566, args);
    }

};


