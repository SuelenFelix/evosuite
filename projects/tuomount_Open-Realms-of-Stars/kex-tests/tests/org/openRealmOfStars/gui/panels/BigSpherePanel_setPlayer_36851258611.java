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

public class BigSpherePanel_setPlayer_36851258611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25696;

    public BigSpherePanel_setPlayer_36851258611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25696 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.BigSpherePanel"));
        setField(term25696, term25696.getClass(), "backgroundImg", null);
        setField(term25696, term25696.getClass(), "northPlanetImg", null);
        setField(term25696, term25696.getClass(), "southPlanetImg", null);
        setField(term25696, term25696.getClass(), "westPlanetImg", null);
        setField(term25696, term25696.getClass(), "eastPlanetImg", null);
        setField(term25696, term25696.getClass(), "shipImages", null);
        setBooleanField(term25696, term25696.getClass(), "drawStarField", false);
        setField(term25696, term25696.getClass(), "title", null);
        setField(term25696, term25696.getClass(), "animation", null);
        setField(term25696, term25696.getClass(), "player", null);
        setField(term25696, term25696.getClass(), "textInformation", null);
        setDoubleField(term25696, term25696.getClass(), "orbitalX", 0.0);
        setDoubleField(term25696, term25696.getClass(), "orbitalZ", 0.0);
        setIntField(term25696, term25696.getClass(), "orbitalY", 0);
        setDoubleField(term25696, term25696.getClass(), "orbitalAngle", 0.0);
        setField(term25696, term25696.getClass(), "customOrbital", null);
        setBooleanField(term25696, term25696.getClass(), "textInMiddle", false);
        setIntField(term25696, term25696.getClass(), "planetTextureOffset", 0);
        setBooleanField(term25696, term25696.getClass(), "isAlignmentXSet", false);
        setFloatField(term25696, term25696.getClass(), "alignmentX", 0.0F);
        setBooleanField(term25696, term25696.getClass(), "isAlignmentYSet", false);
        setFloatField(term25696, term25696.getClass(), "alignmentY", 0.0F);
        setField(term25696, term25696.getClass(), "ui", null);
        setField(term25696, term25696.getClass(), "listenerList", null);
        setField(term25696, term25696.getClass(), "clientProperties", null);
        setField(term25696, term25696.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term25696, term25696.getClass(), "autoscrolls", false);
        setField(term25696, term25696.getClass(), "border", null);
        setIntField(term25696, term25696.getClass(), "flags", 0);
        setField(term25696, term25696.getClass(), "inputVerifier", null);
        setBooleanField(term25696, term25696.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term25696, term25696.getClass(), "paintingChild", null);
        setField(term25696, term25696.getClass(), "popupMenu", null);
        setField(term25696, term25696.getClass(), "revalidateRunnableScheduled", null);
        setField(term25696, term25696.getClass(), "focusInputMap", null);
        setField(term25696, term25696.getClass(), "ancestorInputMap", null);
        setField(term25696, term25696.getClass(), "windowInputMap", null);
        setField(term25696, term25696.getClass(), "actionMap", null);
        setField(term25696, term25696.getClass(), "aaHint", null);
        setField(term25696, term25696.getClass(), "lcdRenderingHint", null);
        setField(term25696, term25696.getClass(), "component", null);
        setField(term25696, term25696.getClass(), "layoutMgr", null);
        setField(term25696, term25696.getClass(), "dispatcher", null);
        setField(term25696, term25696.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term25696, term25696.getClass(), "focusCycleRoot", false);
        setBooleanField(term25696, term25696.getClass(), "focusTraversalPolicyProvider", false);
        setField(term25696, term25696.getClass(), "printingThreads", null);
        setBooleanField(term25696, term25696.getClass(), "printing", false);
        setField(term25696, term25696.getClass(), "containerListener", null);
        setIntField(term25696, term25696.getClass(), "listeningChildren", 0);
        setIntField(term25696, term25696.getClass(), "listeningBoundsChildren", 0);
        setIntField(term25696, term25696.getClass(), "descendantsCount", 0);
        setField(term25696, term25696.getClass(), "preserveBackgroundColor", null);
        setIntField(term25696, term25696.getClass(), "numOfHWComponents", 0);
        setIntField(term25696, term25696.getClass(), "numOfLWComponents", 0);
        setField(term25696, term25696.getClass(), "modalComp", null);
        setField(term25696, term25696.getClass(), "modalAppContext", null);
        setIntField(term25696, term25696.getClass(), "containerSerializedDataVersion", 0);
        setField(term25696, term25696.getClass(), "peer", null);
        setField(term25696, term25696.getClass(), "parent", null);
        setField(term25696, term25696.getClass(), "appContext", null);
        setIntField(term25696, term25696.getClass(), "x", 0);
        setIntField(term25696, term25696.getClass(), "y", 0);
        setIntField(term25696, term25696.getClass(), "width", 0);
        setIntField(term25696, term25696.getClass(), "height", 0);
        setField(term25696, term25696.getClass(), "foreground", null);
        setField(term25696, term25696.getClass(), "background", null);
        setField(term25696, term25696.getClass(), "font", null);
        setField(term25696, term25696.getClass(), "peerFont", null);
        setField(term25696, term25696.getClass(), "cursor", null);
        setField(term25696, term25696.getClass(), "locale", null);
        setField(term25696, term25696.getClass(), "graphicsConfig", null);
        setField(term25696, term25696.getClass(), "bufferStrategy", null);
        setBooleanField(term25696, term25696.getClass(), "ignoreRepaint", false);
        setBooleanField(term25696, term25696.getClass(), "visible", false);
        setBooleanField(term25696, term25696.getClass(), "enabled", false);
        setBooleanField(term25696, term25696.getClass(), "valid", false);
        setField(term25696, term25696.getClass(), "dropTarget", null);
        setField(term25696, term25696.getClass(), "popups", null);
        setField(term25696, term25696.getClass(), "name", null);
        setBooleanField(term25696, term25696.getClass(), "nameExplicitlySet", false);
        setBooleanField(term25696, term25696.getClass(), "focusable", false);
        setIntField(term25696, term25696.getClass(), "isFocusTraversableOverridden", 0);
        setField(term25696, term25696.getClass(), "focusTraversalKeys", null);
        setBooleanField(term25696, term25696.getClass(), "focusTraversalKeysEnabled", false);
        setField(term25696, term25696.getClass(), "acc", null);
        setField(term25696, term25696.getClass(), "minSize", null);
        setBooleanField(term25696, term25696.getClass(), "minSizeSet", false);
        setField(term25696, term25696.getClass(), "prefSize", null);
        setBooleanField(term25696, term25696.getClass(), "prefSizeSet", false);
        setField(term25696, term25696.getClass(), "maxSize", null);
        setBooleanField(term25696, term25696.getClass(), "maxSizeSet", false);
        setField(term25696, term25696.getClass(), "componentOrientation", null);
        setBooleanField(term25696, term25696.getClass(), "newEventsOnly", false);
        setField(term25696, term25696.getClass(), "componentListener", null);
        setField(term25696, term25696.getClass(), "focusListener", null);
        setField(term25696, term25696.getClass(), "hierarchyListener", null);
        setField(term25696, term25696.getClass(), "hierarchyBoundsListener", null);
        setField(term25696, term25696.getClass(), "keyListener", null);
        setField(term25696, term25696.getClass(), "mouseListener", null);
        setField(term25696, term25696.getClass(), "mouseMotionListener", null);
        setField(term25696, term25696.getClass(), "mouseWheelListener", null);
        setField(term25696, term25696.getClass(), "inputMethodListener", null);
        setLongField(term25696, term25696.getClass(), "eventMask", 0L);
        setField(term25696, term25696.getClass(), "changeSupport", null);
        setField(term25696, term25696.getClass(), "objectLock", null);
        setBooleanField(term25696, term25696.getClass(), "isPacked", false);
        setIntField(term25696, term25696.getClass(), "boundsOp", 0);
        setField(term25696, term25696.getClass(), "compoundShape", null);
        setField(term25696, term25696.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term25696, term25696.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term25696, term25696.getClass(), "backgroundEraseDisabled", false);
        setField(term25696, term25696.getClass(), "eventCache", null);
        setBooleanField(term25696, term25696.getClass(), "coalescingEnabled", false);
        setBooleanField(term25696, term25696.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term25696, term25696.getClass(), "componentSerializedDataVersion", 0);
        setField(term25696, term25696.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigSpherePanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlayer", argTypes, term25696, args);
    }

};


