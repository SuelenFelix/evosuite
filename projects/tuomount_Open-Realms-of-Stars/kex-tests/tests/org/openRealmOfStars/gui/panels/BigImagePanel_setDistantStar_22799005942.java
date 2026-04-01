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

public class BigImagePanel_setDistantStar_22799005942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123649;

    public BigImagePanel_setDistantStar_22799005942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123649 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel"));
        setField(term123649, term123649.getClass(), "backgroundImg", null);
        setField(term123649, term123649.getClass(), "northPlanetImg", null);
        setField(term123649, term123649.getClass(), "southPlanetImg", null);
        setField(term123649, term123649.getClass(), "westPlanetImg", null);
        setField(term123649, term123649.getClass(), "eastPlanetImg", null);
        setField(term123649, term123649.getClass(), "shipImages", null);
        setBooleanField(term123649, term123649.getClass(), "drawStarField", false);
        setField(term123649, term123649.getClass(), "planet", null);
        setField(term123649, term123649.getClass(), "title", null);
        setField(term123649, term123649.getClass(), "animation", null);
        setField(term123649, term123649.getClass(), "player", null);
        setField(term123649, term123649.getClass(), "textInformation", null);
        setDoubleField(term123649, term123649.getClass(), "orbitalX", 0.0);
        setDoubleField(term123649, term123649.getClass(), "orbitalZ", 0.0);
        setIntField(term123649, term123649.getClass(), "orbitalY", 0);
        setDoubleField(term123649, term123649.getClass(), "orbitalAngle", 0.0);
        setField(term123649, term123649.getClass(), "customOrbital", null);
        setBooleanField(term123649, term123649.getClass(), "textInMiddle", false);
        setBooleanField(term123649, term123649.getClass(), "isAlignmentXSet", false);
        setFloatField(term123649, term123649.getClass(), "alignmentX", 0.0F);
        setBooleanField(term123649, term123649.getClass(), "isAlignmentYSet", false);
        setFloatField(term123649, term123649.getClass(), "alignmentY", 0.0F);
        setField(term123649, term123649.getClass(), "ui", null);
        setField(term123649, term123649.getClass(), "listenerList", null);
        setField(term123649, term123649.getClass(), "clientProperties", null);
        setField(term123649, term123649.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term123649, term123649.getClass(), "autoscrolls", false);
        setField(term123649, term123649.getClass(), "border", null);
        setIntField(term123649, term123649.getClass(), "flags", 0);
        setField(term123649, term123649.getClass(), "inputVerifier", null);
        setBooleanField(term123649, term123649.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term123649, term123649.getClass(), "paintingChild", null);
        setField(term123649, term123649.getClass(), "popupMenu", null);
        setField(term123649, term123649.getClass(), "revalidateRunnableScheduled", null);
        setField(term123649, term123649.getClass(), "focusInputMap", null);
        setField(term123649, term123649.getClass(), "ancestorInputMap", null);
        setField(term123649, term123649.getClass(), "windowInputMap", null);
        setField(term123649, term123649.getClass(), "actionMap", null);
        setField(term123649, term123649.getClass(), "aaHint", null);
        setField(term123649, term123649.getClass(), "lcdRenderingHint", null);
        setField(term123649, term123649.getClass(), "component", null);
        setField(term123649, term123649.getClass(), "layoutMgr", null);
        setField(term123649, term123649.getClass(), "dispatcher", null);
        setField(term123649, term123649.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term123649, term123649.getClass(), "focusCycleRoot", false);
        setBooleanField(term123649, term123649.getClass(), "focusTraversalPolicyProvider", false);
        setField(term123649, term123649.getClass(), "printingThreads", null);
        setBooleanField(term123649, term123649.getClass(), "printing", false);
        setField(term123649, term123649.getClass(), "containerListener", null);
        setIntField(term123649, term123649.getClass(), "listeningChildren", 0);
        setIntField(term123649, term123649.getClass(), "listeningBoundsChildren", 0);
        setIntField(term123649, term123649.getClass(), "descendantsCount", 0);
        setField(term123649, term123649.getClass(), "preserveBackgroundColor", null);
        setIntField(term123649, term123649.getClass(), "numOfHWComponents", 0);
        setIntField(term123649, term123649.getClass(), "numOfLWComponents", 0);
        setField(term123649, term123649.getClass(), "modalComp", null);
        setField(term123649, term123649.getClass(), "modalAppContext", null);
        setIntField(term123649, term123649.getClass(), "containerSerializedDataVersion", 0);
        setField(term123649, term123649.getClass(), "peer", null);
        setField(term123649, term123649.getClass(), "parent", null);
        setField(term123649, term123649.getClass(), "appContext", null);
        setIntField(term123649, term123649.getClass(), "x", 0);
        setIntField(term123649, term123649.getClass(), "y", 0);
        setIntField(term123649, term123649.getClass(), "width", 0);
        setIntField(term123649, term123649.getClass(), "height", 0);
        setField(term123649, term123649.getClass(), "foreground", null);
        setField(term123649, term123649.getClass(), "background", null);
        setField(term123649, term123649.getClass(), "font", null);
        setField(term123649, term123649.getClass(), "peerFont", null);
        setField(term123649, term123649.getClass(), "cursor", null);
        setField(term123649, term123649.getClass(), "locale", null);
        setField(term123649, term123649.getClass(), "graphicsConfig", null);
        setField(term123649, term123649.getClass(), "bufferStrategy", null);
        setBooleanField(term123649, term123649.getClass(), "ignoreRepaint", false);
        setBooleanField(term123649, term123649.getClass(), "visible", false);
        setBooleanField(term123649, term123649.getClass(), "enabled", false);
        setBooleanField(term123649, term123649.getClass(), "valid", false);
        setField(term123649, term123649.getClass(), "dropTarget", null);
        setField(term123649, term123649.getClass(), "popups", null);
        setField(term123649, term123649.getClass(), "name", null);
        setBooleanField(term123649, term123649.getClass(), "nameExplicitlySet", false);
        setBooleanField(term123649, term123649.getClass(), "focusable", false);
        setIntField(term123649, term123649.getClass(), "isFocusTraversableOverridden", 0);
        setField(term123649, term123649.getClass(), "focusTraversalKeys", null);
        setBooleanField(term123649, term123649.getClass(), "focusTraversalKeysEnabled", false);
        setField(term123649, term123649.getClass(), "acc", null);
        setField(term123649, term123649.getClass(), "minSize", null);
        setBooleanField(term123649, term123649.getClass(), "minSizeSet", false);
        setField(term123649, term123649.getClass(), "prefSize", null);
        setBooleanField(term123649, term123649.getClass(), "prefSizeSet", false);
        setField(term123649, term123649.getClass(), "maxSize", null);
        setBooleanField(term123649, term123649.getClass(), "maxSizeSet", false);
        setField(term123649, term123649.getClass(), "componentOrientation", null);
        setBooleanField(term123649, term123649.getClass(), "newEventsOnly", false);
        setField(term123649, term123649.getClass(), "componentListener", null);
        setField(term123649, term123649.getClass(), "focusListener", null);
        setField(term123649, term123649.getClass(), "hierarchyListener", null);
        setField(term123649, term123649.getClass(), "hierarchyBoundsListener", null);
        setField(term123649, term123649.getClass(), "keyListener", null);
        setField(term123649, term123649.getClass(), "mouseListener", null);
        setField(term123649, term123649.getClass(), "mouseMotionListener", null);
        setField(term123649, term123649.getClass(), "mouseWheelListener", null);
        setField(term123649, term123649.getClass(), "inputMethodListener", null);
        setLongField(term123649, term123649.getClass(), "eventMask", 0L);
        setField(term123649, term123649.getClass(), "changeSupport", null);
        setField(term123649, term123649.getClass(), "objectLock", null);
        setBooleanField(term123649, term123649.getClass(), "isPacked", false);
        setIntField(term123649, term123649.getClass(), "boundsOp", 0);
        setField(term123649, term123649.getClass(), "compoundShape", null);
        setField(term123649, term123649.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term123649, term123649.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term123649, term123649.getClass(), "backgroundEraseDisabled", false);
        setField(term123649, term123649.getClass(), "eventCache", null);
        setBooleanField(term123649, term123649.getClass(), "coalescingEnabled", false);
        setBooleanField(term123649, term123649.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term123649, term123649.getClass(), "componentSerializedDataVersion", 0);
        setField(term123649, term123649.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.mapTiles.Tile");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDistantStar", argTypes, term123649, args);
    }

};


