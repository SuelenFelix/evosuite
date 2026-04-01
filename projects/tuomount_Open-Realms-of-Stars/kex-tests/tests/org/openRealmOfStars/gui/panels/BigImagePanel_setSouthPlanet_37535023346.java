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

public class BigImagePanel_setSouthPlanet_37535023346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123837;

    public BigImagePanel_setSouthPlanet_37535023346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123837 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel"));
        setField(term123837, term123837.getClass(), "backgroundImg", null);
        setField(term123837, term123837.getClass(), "northPlanetImg", null);
        setField(term123837, term123837.getClass(), "southPlanetImg", null);
        setField(term123837, term123837.getClass(), "westPlanetImg", null);
        setField(term123837, term123837.getClass(), "eastPlanetImg", null);
        setField(term123837, term123837.getClass(), "shipImages", null);
        setBooleanField(term123837, term123837.getClass(), "drawStarField", false);
        setField(term123837, term123837.getClass(), "planet", null);
        setField(term123837, term123837.getClass(), "title", null);
        setField(term123837, term123837.getClass(), "animation", null);
        setField(term123837, term123837.getClass(), "player", null);
        setField(term123837, term123837.getClass(), "textInformation", null);
        setDoubleField(term123837, term123837.getClass(), "orbitalX", 0.0);
        setDoubleField(term123837, term123837.getClass(), "orbitalZ", 0.0);
        setIntField(term123837, term123837.getClass(), "orbitalY", 0);
        setDoubleField(term123837, term123837.getClass(), "orbitalAngle", 0.0);
        setField(term123837, term123837.getClass(), "customOrbital", null);
        setBooleanField(term123837, term123837.getClass(), "textInMiddle", false);
        setBooleanField(term123837, term123837.getClass(), "isAlignmentXSet", false);
        setFloatField(term123837, term123837.getClass(), "alignmentX", 0.0F);
        setBooleanField(term123837, term123837.getClass(), "isAlignmentYSet", false);
        setFloatField(term123837, term123837.getClass(), "alignmentY", 0.0F);
        setField(term123837, term123837.getClass(), "ui", null);
        setField(term123837, term123837.getClass(), "listenerList", null);
        setField(term123837, term123837.getClass(), "clientProperties", null);
        setField(term123837, term123837.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term123837, term123837.getClass(), "autoscrolls", false);
        setField(term123837, term123837.getClass(), "border", null);
        setIntField(term123837, term123837.getClass(), "flags", 0);
        setField(term123837, term123837.getClass(), "inputVerifier", null);
        setBooleanField(term123837, term123837.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term123837, term123837.getClass(), "paintingChild", null);
        setField(term123837, term123837.getClass(), "popupMenu", null);
        setField(term123837, term123837.getClass(), "revalidateRunnableScheduled", null);
        setField(term123837, term123837.getClass(), "focusInputMap", null);
        setField(term123837, term123837.getClass(), "ancestorInputMap", null);
        setField(term123837, term123837.getClass(), "windowInputMap", null);
        setField(term123837, term123837.getClass(), "actionMap", null);
        setField(term123837, term123837.getClass(), "aaHint", null);
        setField(term123837, term123837.getClass(), "lcdRenderingHint", null);
        setField(term123837, term123837.getClass(), "component", null);
        setField(term123837, term123837.getClass(), "layoutMgr", null);
        setField(term123837, term123837.getClass(), "dispatcher", null);
        setField(term123837, term123837.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term123837, term123837.getClass(), "focusCycleRoot", false);
        setBooleanField(term123837, term123837.getClass(), "focusTraversalPolicyProvider", false);
        setField(term123837, term123837.getClass(), "printingThreads", null);
        setBooleanField(term123837, term123837.getClass(), "printing", false);
        setField(term123837, term123837.getClass(), "containerListener", null);
        setIntField(term123837, term123837.getClass(), "listeningChildren", 0);
        setIntField(term123837, term123837.getClass(), "listeningBoundsChildren", 0);
        setIntField(term123837, term123837.getClass(), "descendantsCount", 0);
        setField(term123837, term123837.getClass(), "preserveBackgroundColor", null);
        setIntField(term123837, term123837.getClass(), "numOfHWComponents", 0);
        setIntField(term123837, term123837.getClass(), "numOfLWComponents", 0);
        setField(term123837, term123837.getClass(), "modalComp", null);
        setField(term123837, term123837.getClass(), "modalAppContext", null);
        setIntField(term123837, term123837.getClass(), "containerSerializedDataVersion", 0);
        setField(term123837, term123837.getClass(), "peer", null);
        setField(term123837, term123837.getClass(), "parent", null);
        setField(term123837, term123837.getClass(), "appContext", null);
        setIntField(term123837, term123837.getClass(), "x", 0);
        setIntField(term123837, term123837.getClass(), "y", 0);
        setIntField(term123837, term123837.getClass(), "width", 0);
        setIntField(term123837, term123837.getClass(), "height", 0);
        setField(term123837, term123837.getClass(), "foreground", null);
        setField(term123837, term123837.getClass(), "background", null);
        setField(term123837, term123837.getClass(), "font", null);
        setField(term123837, term123837.getClass(), "peerFont", null);
        setField(term123837, term123837.getClass(), "cursor", null);
        setField(term123837, term123837.getClass(), "locale", null);
        setField(term123837, term123837.getClass(), "graphicsConfig", null);
        setField(term123837, term123837.getClass(), "bufferStrategy", null);
        setBooleanField(term123837, term123837.getClass(), "ignoreRepaint", false);
        setBooleanField(term123837, term123837.getClass(), "visible", false);
        setBooleanField(term123837, term123837.getClass(), "enabled", false);
        setBooleanField(term123837, term123837.getClass(), "valid", false);
        setField(term123837, term123837.getClass(), "dropTarget", null);
        setField(term123837, term123837.getClass(), "popups", null);
        setField(term123837, term123837.getClass(), "name", null);
        setBooleanField(term123837, term123837.getClass(), "nameExplicitlySet", false);
        setBooleanField(term123837, term123837.getClass(), "focusable", false);
        setIntField(term123837, term123837.getClass(), "isFocusTraversableOverridden", 0);
        setField(term123837, term123837.getClass(), "focusTraversalKeys", null);
        setBooleanField(term123837, term123837.getClass(), "focusTraversalKeysEnabled", false);
        setField(term123837, term123837.getClass(), "acc", null);
        setField(term123837, term123837.getClass(), "minSize", null);
        setBooleanField(term123837, term123837.getClass(), "minSizeSet", false);
        setField(term123837, term123837.getClass(), "prefSize", null);
        setBooleanField(term123837, term123837.getClass(), "prefSizeSet", false);
        setField(term123837, term123837.getClass(), "maxSize", null);
        setBooleanField(term123837, term123837.getClass(), "maxSizeSet", false);
        setField(term123837, term123837.getClass(), "componentOrientation", null);
        setBooleanField(term123837, term123837.getClass(), "newEventsOnly", false);
        setField(term123837, term123837.getClass(), "componentListener", null);
        setField(term123837, term123837.getClass(), "focusListener", null);
        setField(term123837, term123837.getClass(), "hierarchyListener", null);
        setField(term123837, term123837.getClass(), "hierarchyBoundsListener", null);
        setField(term123837, term123837.getClass(), "keyListener", null);
        setField(term123837, term123837.getClass(), "mouseListener", null);
        setField(term123837, term123837.getClass(), "mouseMotionListener", null);
        setField(term123837, term123837.getClass(), "mouseWheelListener", null);
        setField(term123837, term123837.getClass(), "inputMethodListener", null);
        setLongField(term123837, term123837.getClass(), "eventMask", 0L);
        setField(term123837, term123837.getClass(), "changeSupport", null);
        setField(term123837, term123837.getClass(), "objectLock", null);
        setBooleanField(term123837, term123837.getClass(), "isPacked", false);
        setIntField(term123837, term123837.getClass(), "boundsOp", 0);
        setField(term123837, term123837.getClass(), "compoundShape", null);
        setField(term123837, term123837.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term123837, term123837.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term123837, term123837.getClass(), "backgroundEraseDisabled", false);
        setField(term123837, term123837.getClass(), "eventCache", null);
        setBooleanField(term123837, term123837.getClass(), "coalescingEnabled", false);
        setBooleanField(term123837, term123837.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term123837, term123837.getClass(), "componentSerializedDataVersion", 0);
        setField(term123837, term123837.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSouthPlanet", argTypes, term123837, args);
    }

};


