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

public class BigImagePanel_setEastPlanet_46815260347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123884;

    public BigImagePanel_setEastPlanet_46815260347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123884 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel"));
        setField(term123884, term123884.getClass(), "backgroundImg", null);
        setField(term123884, term123884.getClass(), "northPlanetImg", null);
        setField(term123884, term123884.getClass(), "southPlanetImg", null);
        setField(term123884, term123884.getClass(), "westPlanetImg", null);
        setField(term123884, term123884.getClass(), "eastPlanetImg", null);
        setField(term123884, term123884.getClass(), "shipImages", null);
        setBooleanField(term123884, term123884.getClass(), "drawStarField", false);
        setField(term123884, term123884.getClass(), "planet", null);
        setField(term123884, term123884.getClass(), "title", null);
        setField(term123884, term123884.getClass(), "animation", null);
        setField(term123884, term123884.getClass(), "player", null);
        setField(term123884, term123884.getClass(), "textInformation", null);
        setDoubleField(term123884, term123884.getClass(), "orbitalX", 0.0);
        setDoubleField(term123884, term123884.getClass(), "orbitalZ", 0.0);
        setIntField(term123884, term123884.getClass(), "orbitalY", 0);
        setDoubleField(term123884, term123884.getClass(), "orbitalAngle", 0.0);
        setField(term123884, term123884.getClass(), "customOrbital", null);
        setBooleanField(term123884, term123884.getClass(), "textInMiddle", false);
        setBooleanField(term123884, term123884.getClass(), "isAlignmentXSet", false);
        setFloatField(term123884, term123884.getClass(), "alignmentX", 0.0F);
        setBooleanField(term123884, term123884.getClass(), "isAlignmentYSet", false);
        setFloatField(term123884, term123884.getClass(), "alignmentY", 0.0F);
        setField(term123884, term123884.getClass(), "ui", null);
        setField(term123884, term123884.getClass(), "listenerList", null);
        setField(term123884, term123884.getClass(), "clientProperties", null);
        setField(term123884, term123884.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term123884, term123884.getClass(), "autoscrolls", false);
        setField(term123884, term123884.getClass(), "border", null);
        setIntField(term123884, term123884.getClass(), "flags", 0);
        setField(term123884, term123884.getClass(), "inputVerifier", null);
        setBooleanField(term123884, term123884.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term123884, term123884.getClass(), "paintingChild", null);
        setField(term123884, term123884.getClass(), "popupMenu", null);
        setField(term123884, term123884.getClass(), "revalidateRunnableScheduled", null);
        setField(term123884, term123884.getClass(), "focusInputMap", null);
        setField(term123884, term123884.getClass(), "ancestorInputMap", null);
        setField(term123884, term123884.getClass(), "windowInputMap", null);
        setField(term123884, term123884.getClass(), "actionMap", null);
        setField(term123884, term123884.getClass(), "aaHint", null);
        setField(term123884, term123884.getClass(), "lcdRenderingHint", null);
        setField(term123884, term123884.getClass(), "component", null);
        setField(term123884, term123884.getClass(), "layoutMgr", null);
        setField(term123884, term123884.getClass(), "dispatcher", null);
        setField(term123884, term123884.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term123884, term123884.getClass(), "focusCycleRoot", false);
        setBooleanField(term123884, term123884.getClass(), "focusTraversalPolicyProvider", false);
        setField(term123884, term123884.getClass(), "printingThreads", null);
        setBooleanField(term123884, term123884.getClass(), "printing", false);
        setField(term123884, term123884.getClass(), "containerListener", null);
        setIntField(term123884, term123884.getClass(), "listeningChildren", 0);
        setIntField(term123884, term123884.getClass(), "listeningBoundsChildren", 0);
        setIntField(term123884, term123884.getClass(), "descendantsCount", 0);
        setField(term123884, term123884.getClass(), "preserveBackgroundColor", null);
        setIntField(term123884, term123884.getClass(), "numOfHWComponents", 0);
        setIntField(term123884, term123884.getClass(), "numOfLWComponents", 0);
        setField(term123884, term123884.getClass(), "modalComp", null);
        setField(term123884, term123884.getClass(), "modalAppContext", null);
        setIntField(term123884, term123884.getClass(), "containerSerializedDataVersion", 0);
        setField(term123884, term123884.getClass(), "peer", null);
        setField(term123884, term123884.getClass(), "parent", null);
        setField(term123884, term123884.getClass(), "appContext", null);
        setIntField(term123884, term123884.getClass(), "x", 0);
        setIntField(term123884, term123884.getClass(), "y", 0);
        setIntField(term123884, term123884.getClass(), "width", 0);
        setIntField(term123884, term123884.getClass(), "height", 0);
        setField(term123884, term123884.getClass(), "foreground", null);
        setField(term123884, term123884.getClass(), "background", null);
        setField(term123884, term123884.getClass(), "font", null);
        setField(term123884, term123884.getClass(), "peerFont", null);
        setField(term123884, term123884.getClass(), "cursor", null);
        setField(term123884, term123884.getClass(), "locale", null);
        setField(term123884, term123884.getClass(), "graphicsConfig", null);
        setField(term123884, term123884.getClass(), "bufferStrategy", null);
        setBooleanField(term123884, term123884.getClass(), "ignoreRepaint", false);
        setBooleanField(term123884, term123884.getClass(), "visible", false);
        setBooleanField(term123884, term123884.getClass(), "enabled", false);
        setBooleanField(term123884, term123884.getClass(), "valid", false);
        setField(term123884, term123884.getClass(), "dropTarget", null);
        setField(term123884, term123884.getClass(), "popups", null);
        setField(term123884, term123884.getClass(), "name", null);
        setBooleanField(term123884, term123884.getClass(), "nameExplicitlySet", false);
        setBooleanField(term123884, term123884.getClass(), "focusable", false);
        setIntField(term123884, term123884.getClass(), "isFocusTraversableOverridden", 0);
        setField(term123884, term123884.getClass(), "focusTraversalKeys", null);
        setBooleanField(term123884, term123884.getClass(), "focusTraversalKeysEnabled", false);
        setField(term123884, term123884.getClass(), "acc", null);
        setField(term123884, term123884.getClass(), "minSize", null);
        setBooleanField(term123884, term123884.getClass(), "minSizeSet", false);
        setField(term123884, term123884.getClass(), "prefSize", null);
        setBooleanField(term123884, term123884.getClass(), "prefSizeSet", false);
        setField(term123884, term123884.getClass(), "maxSize", null);
        setBooleanField(term123884, term123884.getClass(), "maxSizeSet", false);
        setField(term123884, term123884.getClass(), "componentOrientation", null);
        setBooleanField(term123884, term123884.getClass(), "newEventsOnly", false);
        setField(term123884, term123884.getClass(), "componentListener", null);
        setField(term123884, term123884.getClass(), "focusListener", null);
        setField(term123884, term123884.getClass(), "hierarchyListener", null);
        setField(term123884, term123884.getClass(), "hierarchyBoundsListener", null);
        setField(term123884, term123884.getClass(), "keyListener", null);
        setField(term123884, term123884.getClass(), "mouseListener", null);
        setField(term123884, term123884.getClass(), "mouseMotionListener", null);
        setField(term123884, term123884.getClass(), "mouseWheelListener", null);
        setField(term123884, term123884.getClass(), "inputMethodListener", null);
        setLongField(term123884, term123884.getClass(), "eventMask", 0L);
        setField(term123884, term123884.getClass(), "changeSupport", null);
        setField(term123884, term123884.getClass(), "objectLock", null);
        setBooleanField(term123884, term123884.getClass(), "isPacked", false);
        setIntField(term123884, term123884.getClass(), "boundsOp", 0);
        setField(term123884, term123884.getClass(), "compoundShape", null);
        setField(term123884, term123884.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term123884, term123884.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term123884, term123884.getClass(), "backgroundEraseDisabled", false);
        setField(term123884, term123884.getClass(), "eventCache", null);
        setBooleanField(term123884, term123884.getClass(), "coalescingEnabled", false);
        setBooleanField(term123884, term123884.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term123884, term123884.getClass(), "componentSerializedDataVersion", 0);
        setField(term123884, term123884.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEastPlanet", argTypes, term123884, args);
    }

};


