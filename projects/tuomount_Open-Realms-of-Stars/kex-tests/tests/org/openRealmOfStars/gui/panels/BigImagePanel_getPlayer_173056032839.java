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

public class BigImagePanel_getPlayer_173056032839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123508;

    public BigImagePanel_getPlayer_173056032839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123508 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel"));
        setField(term123508, term123508.getClass(), "backgroundImg", null);
        setField(term123508, term123508.getClass(), "northPlanetImg", null);
        setField(term123508, term123508.getClass(), "southPlanetImg", null);
        setField(term123508, term123508.getClass(), "westPlanetImg", null);
        setField(term123508, term123508.getClass(), "eastPlanetImg", null);
        setField(term123508, term123508.getClass(), "shipImages", null);
        setBooleanField(term123508, term123508.getClass(), "drawStarField", false);
        setField(term123508, term123508.getClass(), "planet", null);
        setField(term123508, term123508.getClass(), "title", null);
        setField(term123508, term123508.getClass(), "animation", null);
        setField(term123508, term123508.getClass(), "player", null);
        setField(term123508, term123508.getClass(), "textInformation", null);
        setDoubleField(term123508, term123508.getClass(), "orbitalX", 0.0);
        setDoubleField(term123508, term123508.getClass(), "orbitalZ", 0.0);
        setIntField(term123508, term123508.getClass(), "orbitalY", 0);
        setDoubleField(term123508, term123508.getClass(), "orbitalAngle", 0.0);
        setField(term123508, term123508.getClass(), "customOrbital", null);
        setBooleanField(term123508, term123508.getClass(), "textInMiddle", false);
        setBooleanField(term123508, term123508.getClass(), "isAlignmentXSet", false);
        setFloatField(term123508, term123508.getClass(), "alignmentX", 0.0F);
        setBooleanField(term123508, term123508.getClass(), "isAlignmentYSet", false);
        setFloatField(term123508, term123508.getClass(), "alignmentY", 0.0F);
        setField(term123508, term123508.getClass(), "ui", null);
        setField(term123508, term123508.getClass(), "listenerList", null);
        setField(term123508, term123508.getClass(), "clientProperties", null);
        setField(term123508, term123508.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term123508, term123508.getClass(), "autoscrolls", false);
        setField(term123508, term123508.getClass(), "border", null);
        setIntField(term123508, term123508.getClass(), "flags", 0);
        setField(term123508, term123508.getClass(), "inputVerifier", null);
        setBooleanField(term123508, term123508.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term123508, term123508.getClass(), "paintingChild", null);
        setField(term123508, term123508.getClass(), "popupMenu", null);
        setField(term123508, term123508.getClass(), "revalidateRunnableScheduled", null);
        setField(term123508, term123508.getClass(), "focusInputMap", null);
        setField(term123508, term123508.getClass(), "ancestorInputMap", null);
        setField(term123508, term123508.getClass(), "windowInputMap", null);
        setField(term123508, term123508.getClass(), "actionMap", null);
        setField(term123508, term123508.getClass(), "aaHint", null);
        setField(term123508, term123508.getClass(), "lcdRenderingHint", null);
        setField(term123508, term123508.getClass(), "component", null);
        setField(term123508, term123508.getClass(), "layoutMgr", null);
        setField(term123508, term123508.getClass(), "dispatcher", null);
        setField(term123508, term123508.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term123508, term123508.getClass(), "focusCycleRoot", false);
        setBooleanField(term123508, term123508.getClass(), "focusTraversalPolicyProvider", false);
        setField(term123508, term123508.getClass(), "printingThreads", null);
        setBooleanField(term123508, term123508.getClass(), "printing", false);
        setField(term123508, term123508.getClass(), "containerListener", null);
        setIntField(term123508, term123508.getClass(), "listeningChildren", 0);
        setIntField(term123508, term123508.getClass(), "listeningBoundsChildren", 0);
        setIntField(term123508, term123508.getClass(), "descendantsCount", 0);
        setField(term123508, term123508.getClass(), "preserveBackgroundColor", null);
        setIntField(term123508, term123508.getClass(), "numOfHWComponents", 0);
        setIntField(term123508, term123508.getClass(), "numOfLWComponents", 0);
        setField(term123508, term123508.getClass(), "modalComp", null);
        setField(term123508, term123508.getClass(), "modalAppContext", null);
        setIntField(term123508, term123508.getClass(), "containerSerializedDataVersion", 0);
        setField(term123508, term123508.getClass(), "peer", null);
        setField(term123508, term123508.getClass(), "parent", null);
        setField(term123508, term123508.getClass(), "appContext", null);
        setIntField(term123508, term123508.getClass(), "x", 0);
        setIntField(term123508, term123508.getClass(), "y", 0);
        setIntField(term123508, term123508.getClass(), "width", 0);
        setIntField(term123508, term123508.getClass(), "height", 0);
        setField(term123508, term123508.getClass(), "foreground", null);
        setField(term123508, term123508.getClass(), "background", null);
        setField(term123508, term123508.getClass(), "font", null);
        setField(term123508, term123508.getClass(), "peerFont", null);
        setField(term123508, term123508.getClass(), "cursor", null);
        setField(term123508, term123508.getClass(), "locale", null);
        setField(term123508, term123508.getClass(), "graphicsConfig", null);
        setField(term123508, term123508.getClass(), "bufferStrategy", null);
        setBooleanField(term123508, term123508.getClass(), "ignoreRepaint", false);
        setBooleanField(term123508, term123508.getClass(), "visible", false);
        setBooleanField(term123508, term123508.getClass(), "enabled", false);
        setBooleanField(term123508, term123508.getClass(), "valid", false);
        setField(term123508, term123508.getClass(), "dropTarget", null);
        setField(term123508, term123508.getClass(), "popups", null);
        setField(term123508, term123508.getClass(), "name", null);
        setBooleanField(term123508, term123508.getClass(), "nameExplicitlySet", false);
        setBooleanField(term123508, term123508.getClass(), "focusable", false);
        setIntField(term123508, term123508.getClass(), "isFocusTraversableOverridden", 0);
        setField(term123508, term123508.getClass(), "focusTraversalKeys", null);
        setBooleanField(term123508, term123508.getClass(), "focusTraversalKeysEnabled", false);
        setField(term123508, term123508.getClass(), "acc", null);
        setField(term123508, term123508.getClass(), "minSize", null);
        setBooleanField(term123508, term123508.getClass(), "minSizeSet", false);
        setField(term123508, term123508.getClass(), "prefSize", null);
        setBooleanField(term123508, term123508.getClass(), "prefSizeSet", false);
        setField(term123508, term123508.getClass(), "maxSize", null);
        setBooleanField(term123508, term123508.getClass(), "maxSizeSet", false);
        setField(term123508, term123508.getClass(), "componentOrientation", null);
        setBooleanField(term123508, term123508.getClass(), "newEventsOnly", false);
        setField(term123508, term123508.getClass(), "componentListener", null);
        setField(term123508, term123508.getClass(), "focusListener", null);
        setField(term123508, term123508.getClass(), "hierarchyListener", null);
        setField(term123508, term123508.getClass(), "hierarchyBoundsListener", null);
        setField(term123508, term123508.getClass(), "keyListener", null);
        setField(term123508, term123508.getClass(), "mouseListener", null);
        setField(term123508, term123508.getClass(), "mouseMotionListener", null);
        setField(term123508, term123508.getClass(), "mouseWheelListener", null);
        setField(term123508, term123508.getClass(), "inputMethodListener", null);
        setLongField(term123508, term123508.getClass(), "eventMask", 0L);
        setField(term123508, term123508.getClass(), "changeSupport", null);
        setField(term123508, term123508.getClass(), "objectLock", null);
        setBooleanField(term123508, term123508.getClass(), "isPacked", false);
        setIntField(term123508, term123508.getClass(), "boundsOp", 0);
        setField(term123508, term123508.getClass(), "compoundShape", null);
        setField(term123508, term123508.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term123508, term123508.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term123508, term123508.getClass(), "backgroundEraseDisabled", false);
        setField(term123508, term123508.getClass(), "eventCache", null);
        setBooleanField(term123508, term123508.getClass(), "coalescingEnabled", false);
        setBooleanField(term123508, term123508.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term123508, term123508.getClass(), "componentSerializedDataVersion", 0);
        setField(term123508, term123508.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayer", argTypes, term123508, args);
    }

};


