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

public class BigImagePanel_setNorthPlanet_210741571344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123743;

    public BigImagePanel_setNorthPlanet_210741571344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123743 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel"));
        setField(term123743, term123743.getClass(), "backgroundImg", null);
        setField(term123743, term123743.getClass(), "northPlanetImg", null);
        setField(term123743, term123743.getClass(), "southPlanetImg", null);
        setField(term123743, term123743.getClass(), "westPlanetImg", null);
        setField(term123743, term123743.getClass(), "eastPlanetImg", null);
        setField(term123743, term123743.getClass(), "shipImages", null);
        setBooleanField(term123743, term123743.getClass(), "drawStarField", false);
        setField(term123743, term123743.getClass(), "planet", null);
        setField(term123743, term123743.getClass(), "title", null);
        setField(term123743, term123743.getClass(), "animation", null);
        setField(term123743, term123743.getClass(), "player", null);
        setField(term123743, term123743.getClass(), "textInformation", null);
        setDoubleField(term123743, term123743.getClass(), "orbitalX", 0.0);
        setDoubleField(term123743, term123743.getClass(), "orbitalZ", 0.0);
        setIntField(term123743, term123743.getClass(), "orbitalY", 0);
        setDoubleField(term123743, term123743.getClass(), "orbitalAngle", 0.0);
        setField(term123743, term123743.getClass(), "customOrbital", null);
        setBooleanField(term123743, term123743.getClass(), "textInMiddle", false);
        setBooleanField(term123743, term123743.getClass(), "isAlignmentXSet", false);
        setFloatField(term123743, term123743.getClass(), "alignmentX", 0.0F);
        setBooleanField(term123743, term123743.getClass(), "isAlignmentYSet", false);
        setFloatField(term123743, term123743.getClass(), "alignmentY", 0.0F);
        setField(term123743, term123743.getClass(), "ui", null);
        setField(term123743, term123743.getClass(), "listenerList", null);
        setField(term123743, term123743.getClass(), "clientProperties", null);
        setField(term123743, term123743.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term123743, term123743.getClass(), "autoscrolls", false);
        setField(term123743, term123743.getClass(), "border", null);
        setIntField(term123743, term123743.getClass(), "flags", 0);
        setField(term123743, term123743.getClass(), "inputVerifier", null);
        setBooleanField(term123743, term123743.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term123743, term123743.getClass(), "paintingChild", null);
        setField(term123743, term123743.getClass(), "popupMenu", null);
        setField(term123743, term123743.getClass(), "revalidateRunnableScheduled", null);
        setField(term123743, term123743.getClass(), "focusInputMap", null);
        setField(term123743, term123743.getClass(), "ancestorInputMap", null);
        setField(term123743, term123743.getClass(), "windowInputMap", null);
        setField(term123743, term123743.getClass(), "actionMap", null);
        setField(term123743, term123743.getClass(), "aaHint", null);
        setField(term123743, term123743.getClass(), "lcdRenderingHint", null);
        setField(term123743, term123743.getClass(), "component", null);
        setField(term123743, term123743.getClass(), "layoutMgr", null);
        setField(term123743, term123743.getClass(), "dispatcher", null);
        setField(term123743, term123743.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term123743, term123743.getClass(), "focusCycleRoot", false);
        setBooleanField(term123743, term123743.getClass(), "focusTraversalPolicyProvider", false);
        setField(term123743, term123743.getClass(), "printingThreads", null);
        setBooleanField(term123743, term123743.getClass(), "printing", false);
        setField(term123743, term123743.getClass(), "containerListener", null);
        setIntField(term123743, term123743.getClass(), "listeningChildren", 0);
        setIntField(term123743, term123743.getClass(), "listeningBoundsChildren", 0);
        setIntField(term123743, term123743.getClass(), "descendantsCount", 0);
        setField(term123743, term123743.getClass(), "preserveBackgroundColor", null);
        setIntField(term123743, term123743.getClass(), "numOfHWComponents", 0);
        setIntField(term123743, term123743.getClass(), "numOfLWComponents", 0);
        setField(term123743, term123743.getClass(), "modalComp", null);
        setField(term123743, term123743.getClass(), "modalAppContext", null);
        setIntField(term123743, term123743.getClass(), "containerSerializedDataVersion", 0);
        setField(term123743, term123743.getClass(), "peer", null);
        setField(term123743, term123743.getClass(), "parent", null);
        setField(term123743, term123743.getClass(), "appContext", null);
        setIntField(term123743, term123743.getClass(), "x", 0);
        setIntField(term123743, term123743.getClass(), "y", 0);
        setIntField(term123743, term123743.getClass(), "width", 0);
        setIntField(term123743, term123743.getClass(), "height", 0);
        setField(term123743, term123743.getClass(), "foreground", null);
        setField(term123743, term123743.getClass(), "background", null);
        setField(term123743, term123743.getClass(), "font", null);
        setField(term123743, term123743.getClass(), "peerFont", null);
        setField(term123743, term123743.getClass(), "cursor", null);
        setField(term123743, term123743.getClass(), "locale", null);
        setField(term123743, term123743.getClass(), "graphicsConfig", null);
        setField(term123743, term123743.getClass(), "bufferStrategy", null);
        setBooleanField(term123743, term123743.getClass(), "ignoreRepaint", false);
        setBooleanField(term123743, term123743.getClass(), "visible", false);
        setBooleanField(term123743, term123743.getClass(), "enabled", false);
        setBooleanField(term123743, term123743.getClass(), "valid", false);
        setField(term123743, term123743.getClass(), "dropTarget", null);
        setField(term123743, term123743.getClass(), "popups", null);
        setField(term123743, term123743.getClass(), "name", null);
        setBooleanField(term123743, term123743.getClass(), "nameExplicitlySet", false);
        setBooleanField(term123743, term123743.getClass(), "focusable", false);
        setIntField(term123743, term123743.getClass(), "isFocusTraversableOverridden", 0);
        setField(term123743, term123743.getClass(), "focusTraversalKeys", null);
        setBooleanField(term123743, term123743.getClass(), "focusTraversalKeysEnabled", false);
        setField(term123743, term123743.getClass(), "acc", null);
        setField(term123743, term123743.getClass(), "minSize", null);
        setBooleanField(term123743, term123743.getClass(), "minSizeSet", false);
        setField(term123743, term123743.getClass(), "prefSize", null);
        setBooleanField(term123743, term123743.getClass(), "prefSizeSet", false);
        setField(term123743, term123743.getClass(), "maxSize", null);
        setBooleanField(term123743, term123743.getClass(), "maxSizeSet", false);
        setField(term123743, term123743.getClass(), "componentOrientation", null);
        setBooleanField(term123743, term123743.getClass(), "newEventsOnly", false);
        setField(term123743, term123743.getClass(), "componentListener", null);
        setField(term123743, term123743.getClass(), "focusListener", null);
        setField(term123743, term123743.getClass(), "hierarchyListener", null);
        setField(term123743, term123743.getClass(), "hierarchyBoundsListener", null);
        setField(term123743, term123743.getClass(), "keyListener", null);
        setField(term123743, term123743.getClass(), "mouseListener", null);
        setField(term123743, term123743.getClass(), "mouseMotionListener", null);
        setField(term123743, term123743.getClass(), "mouseWheelListener", null);
        setField(term123743, term123743.getClass(), "inputMethodListener", null);
        setLongField(term123743, term123743.getClass(), "eventMask", 0L);
        setField(term123743, term123743.getClass(), "changeSupport", null);
        setField(term123743, term123743.getClass(), "objectLock", null);
        setBooleanField(term123743, term123743.getClass(), "isPacked", false);
        setIntField(term123743, term123743.getClass(), "boundsOp", 0);
        setField(term123743, term123743.getClass(), "compoundShape", null);
        setField(term123743, term123743.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term123743, term123743.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term123743, term123743.getClass(), "backgroundEraseDisabled", false);
        setField(term123743, term123743.getClass(), "eventCache", null);
        setBooleanField(term123743, term123743.getClass(), "coalescingEnabled", false);
        setBooleanField(term123743, term123743.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term123743, term123743.getClass(), "componentSerializedDataVersion", 0);
        setField(term123743, term123743.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setNorthPlanet", argTypes, term123743, args);
    }

};


