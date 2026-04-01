package org.openRealmOfStars.gui.infopanel;

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
import static org.openRealmOfStars.gui.infopanel.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class MapInfoPanel_showPlanet_171162192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19247;
     Object term19289;

    public MapInfoPanel_showPlanet_171162192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19247 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.MapInfoPanel"));
        setField(term19247, term19247.getClass(), "imageLabel", null);
        setField(term19247, term19247.getClass(), "textArea", null);
        setField(term19247, term19247.getClass(), "planet", null);
        setBooleanField(term19247, term19247.getClass(), "activeScanned", false);
        setField(term19247, term19247.getClass(), "fleet", null);
        setField(term19247, term19247.getClass(), "tile", null);
        setField(term19247, term19247.getClass(), "fleetOwner", null);
        setField(term19247, term19247.getClass(), "viewBtn", null);
        setField(term19247, term19247.getClass(), "defendBtn", null);
        setField(term19247, term19247.getClass(), "fixTradeFleetBtn", null);
        setField(term19247, term19247.getClass(), "routeBtn", null);
        setField(term19247, term19247.getClass(), "moveBtn", null);
        setField(term19247, term19247.getClass(), "focusBtn", null);
        setField(term19247, term19247.getClass(), "border", null);
        setBooleanField(term19247, term19247.getClass(), "isAlignmentXSet", false);
        setFloatField(term19247, term19247.getClass(), "alignmentX", 0.0F);
        setBooleanField(term19247, term19247.getClass(), "isAlignmentYSet", false);
        setFloatField(term19247, term19247.getClass(), "alignmentY", 0.0F);
        setField(term19247, term19247.getClass(), "ui", null);
        setField(term19247, term19247.getClass(), "listenerList", null);
        setField(term19247, term19247.getClass(), "clientProperties", null);
        setField(term19247, term19247.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term19247, term19247.getClass(), "autoscrolls", false);
        setField(term19247, term19247.getClass(), "border", null);
        setIntField(term19247, term19247.getClass(), "flags", 0);
        setField(term19247, term19247.getClass(), "inputVerifier", null);
        setBooleanField(term19247, term19247.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term19247, term19247.getClass(), "paintingChild", null);
        setField(term19247, term19247.getClass(), "popupMenu", null);
        setField(term19247, term19247.getClass(), "revalidateRunnableScheduled", null);
        setField(term19247, term19247.getClass(), "focusInputMap", null);
        setField(term19247, term19247.getClass(), "ancestorInputMap", null);
        setField(term19247, term19247.getClass(), "windowInputMap", null);
        setField(term19247, term19247.getClass(), "actionMap", null);
        setField(term19247, term19247.getClass(), "aaHint", null);
        setField(term19247, term19247.getClass(), "lcdRenderingHint", null);
        setField(term19247, term19247.getClass(), "component", null);
        setField(term19247, term19247.getClass(), "layoutMgr", null);
        setField(term19247, term19247.getClass(), "dispatcher", null);
        setField(term19247, term19247.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term19247, term19247.getClass(), "focusCycleRoot", false);
        setBooleanField(term19247, term19247.getClass(), "focusTraversalPolicyProvider", false);
        setField(term19247, term19247.getClass(), "printingThreads", null);
        setBooleanField(term19247, term19247.getClass(), "printing", false);
        setField(term19247, term19247.getClass(), "containerListener", null);
        setIntField(term19247, term19247.getClass(), "listeningChildren", 0);
        setIntField(term19247, term19247.getClass(), "listeningBoundsChildren", 0);
        setIntField(term19247, term19247.getClass(), "descendantsCount", 0);
        setField(term19247, term19247.getClass(), "preserveBackgroundColor", null);
        setIntField(term19247, term19247.getClass(), "numOfHWComponents", 0);
        setIntField(term19247, term19247.getClass(), "numOfLWComponents", 0);
        setField(term19247, term19247.getClass(), "modalComp", null);
        setField(term19247, term19247.getClass(), "modalAppContext", null);
        setIntField(term19247, term19247.getClass(), "containerSerializedDataVersion", 0);
        setField(term19247, term19247.getClass(), "peer", null);
        setField(term19247, term19247.getClass(), "parent", null);
        setField(term19247, term19247.getClass(), "appContext", null);
        setIntField(term19247, term19247.getClass(), "x", 0);
        setIntField(term19247, term19247.getClass(), "y", 0);
        setIntField(term19247, term19247.getClass(), "width", 0);
        setIntField(term19247, term19247.getClass(), "height", 0);
        setField(term19247, term19247.getClass(), "foreground", null);
        setField(term19247, term19247.getClass(), "background", null);
        setField(term19247, term19247.getClass(), "font", null);
        setField(term19247, term19247.getClass(), "peerFont", null);
        setField(term19247, term19247.getClass(), "cursor", null);
        setField(term19247, term19247.getClass(), "locale", null);
        setField(term19247, term19247.getClass(), "graphicsConfig", null);
        setField(term19247, term19247.getClass(), "bufferStrategy", null);
        setBooleanField(term19247, term19247.getClass(), "ignoreRepaint", false);
        setBooleanField(term19247, term19247.getClass(), "visible", false);
        setBooleanField(term19247, term19247.getClass(), "enabled", false);
        setBooleanField(term19247, term19247.getClass(), "valid", false);
        setField(term19247, term19247.getClass(), "dropTarget", null);
        setField(term19247, term19247.getClass(), "popups", null);
        setField(term19247, term19247.getClass(), "name", null);
        setBooleanField(term19247, term19247.getClass(), "nameExplicitlySet", false);
        setBooleanField(term19247, term19247.getClass(), "focusable", false);
        setIntField(term19247, term19247.getClass(), "isFocusTraversableOverridden", 0);
        setField(term19247, term19247.getClass(), "focusTraversalKeys", null);
        setBooleanField(term19247, term19247.getClass(), "focusTraversalKeysEnabled", false);
        setField(term19247, term19247.getClass(), "acc", null);
        setField(term19247, term19247.getClass(), "minSize", null);
        setBooleanField(term19247, term19247.getClass(), "minSizeSet", false);
        setField(term19247, term19247.getClass(), "prefSize", null);
        setBooleanField(term19247, term19247.getClass(), "prefSizeSet", false);
        setField(term19247, term19247.getClass(), "maxSize", null);
        setBooleanField(term19247, term19247.getClass(), "maxSizeSet", false);
        setField(term19247, term19247.getClass(), "componentOrientation", null);
        setBooleanField(term19247, term19247.getClass(), "newEventsOnly", false);
        setField(term19247, term19247.getClass(), "componentListener", null);
        setField(term19247, term19247.getClass(), "focusListener", null);
        setField(term19247, term19247.getClass(), "hierarchyListener", null);
        setField(term19247, term19247.getClass(), "hierarchyBoundsListener", null);
        setField(term19247, term19247.getClass(), "keyListener", null);
        setField(term19247, term19247.getClass(), "mouseListener", null);
        setField(term19247, term19247.getClass(), "mouseMotionListener", null);
        setField(term19247, term19247.getClass(), "mouseWheelListener", null);
        setField(term19247, term19247.getClass(), "inputMethodListener", null);
        setLongField(term19247, term19247.getClass(), "eventMask", 0L);
        setField(term19247, term19247.getClass(), "changeSupport", null);
        setField(term19247, term19247.getClass(), "objectLock", null);
        setBooleanField(term19247, term19247.getClass(), "isPacked", false);
        setIntField(term19247, term19247.getClass(), "boundsOp", 0);
        setField(term19247, term19247.getClass(), "compoundShape", null);
        setField(term19247, term19247.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term19247, term19247.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term19247, term19247.getClass(), "backgroundEraseDisabled", false);
        setField(term19247, term19247.getClass(), "eventCache", null);
        setBooleanField(term19247, term19247.getClass(), "coalescingEnabled", false);
        setBooleanField(term19247, term19247.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term19247, term19247.getClass(), "componentSerializedDataVersion", 0);
        setField(term19247, term19247.getClass(), "accessibleContext", null);
        term19289 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.MapInfoPanel");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term19289;
        args[2] = null;
        callMethod(klass, "showPlanet", argTypes, term19247, args);
    }

};


