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

public class BigImagePanel_isTextInMiddle_191344263650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124025;

    public BigImagePanel_isTextInMiddle_191344263650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124025 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel"));
        setField(term124025, term124025.getClass(), "backgroundImg", null);
        setField(term124025, term124025.getClass(), "northPlanetImg", null);
        setField(term124025, term124025.getClass(), "southPlanetImg", null);
        setField(term124025, term124025.getClass(), "westPlanetImg", null);
        setField(term124025, term124025.getClass(), "eastPlanetImg", null);
        setField(term124025, term124025.getClass(), "shipImages", null);
        setBooleanField(term124025, term124025.getClass(), "drawStarField", false);
        setField(term124025, term124025.getClass(), "planet", null);
        setField(term124025, term124025.getClass(), "title", null);
        setField(term124025, term124025.getClass(), "animation", null);
        setField(term124025, term124025.getClass(), "player", null);
        setField(term124025, term124025.getClass(), "textInformation", null);
        setDoubleField(term124025, term124025.getClass(), "orbitalX", 0.0);
        setDoubleField(term124025, term124025.getClass(), "orbitalZ", 0.0);
        setIntField(term124025, term124025.getClass(), "orbitalY", 0);
        setDoubleField(term124025, term124025.getClass(), "orbitalAngle", 0.0);
        setField(term124025, term124025.getClass(), "customOrbital", null);
        setBooleanField(term124025, term124025.getClass(), "textInMiddle", false);
        setBooleanField(term124025, term124025.getClass(), "isAlignmentXSet", false);
        setFloatField(term124025, term124025.getClass(), "alignmentX", 0.0F);
        setBooleanField(term124025, term124025.getClass(), "isAlignmentYSet", false);
        setFloatField(term124025, term124025.getClass(), "alignmentY", 0.0F);
        setField(term124025, term124025.getClass(), "ui", null);
        setField(term124025, term124025.getClass(), "listenerList", null);
        setField(term124025, term124025.getClass(), "clientProperties", null);
        setField(term124025, term124025.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term124025, term124025.getClass(), "autoscrolls", false);
        setField(term124025, term124025.getClass(), "border", null);
        setIntField(term124025, term124025.getClass(), "flags", 0);
        setField(term124025, term124025.getClass(), "inputVerifier", null);
        setBooleanField(term124025, term124025.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term124025, term124025.getClass(), "paintingChild", null);
        setField(term124025, term124025.getClass(), "popupMenu", null);
        setField(term124025, term124025.getClass(), "revalidateRunnableScheduled", null);
        setField(term124025, term124025.getClass(), "focusInputMap", null);
        setField(term124025, term124025.getClass(), "ancestorInputMap", null);
        setField(term124025, term124025.getClass(), "windowInputMap", null);
        setField(term124025, term124025.getClass(), "actionMap", null);
        setField(term124025, term124025.getClass(), "aaHint", null);
        setField(term124025, term124025.getClass(), "lcdRenderingHint", null);
        setField(term124025, term124025.getClass(), "component", null);
        setField(term124025, term124025.getClass(), "layoutMgr", null);
        setField(term124025, term124025.getClass(), "dispatcher", null);
        setField(term124025, term124025.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term124025, term124025.getClass(), "focusCycleRoot", false);
        setBooleanField(term124025, term124025.getClass(), "focusTraversalPolicyProvider", false);
        setField(term124025, term124025.getClass(), "printingThreads", null);
        setBooleanField(term124025, term124025.getClass(), "printing", false);
        setField(term124025, term124025.getClass(), "containerListener", null);
        setIntField(term124025, term124025.getClass(), "listeningChildren", 0);
        setIntField(term124025, term124025.getClass(), "listeningBoundsChildren", 0);
        setIntField(term124025, term124025.getClass(), "descendantsCount", 0);
        setField(term124025, term124025.getClass(), "preserveBackgroundColor", null);
        setIntField(term124025, term124025.getClass(), "numOfHWComponents", 0);
        setIntField(term124025, term124025.getClass(), "numOfLWComponents", 0);
        setField(term124025, term124025.getClass(), "modalComp", null);
        setField(term124025, term124025.getClass(), "modalAppContext", null);
        setIntField(term124025, term124025.getClass(), "containerSerializedDataVersion", 0);
        setField(term124025, term124025.getClass(), "peer", null);
        setField(term124025, term124025.getClass(), "parent", null);
        setField(term124025, term124025.getClass(), "appContext", null);
        setIntField(term124025, term124025.getClass(), "x", 0);
        setIntField(term124025, term124025.getClass(), "y", 0);
        setIntField(term124025, term124025.getClass(), "width", 0);
        setIntField(term124025, term124025.getClass(), "height", 0);
        setField(term124025, term124025.getClass(), "foreground", null);
        setField(term124025, term124025.getClass(), "background", null);
        setField(term124025, term124025.getClass(), "font", null);
        setField(term124025, term124025.getClass(), "peerFont", null);
        setField(term124025, term124025.getClass(), "cursor", null);
        setField(term124025, term124025.getClass(), "locale", null);
        setField(term124025, term124025.getClass(), "graphicsConfig", null);
        setField(term124025, term124025.getClass(), "bufferStrategy", null);
        setBooleanField(term124025, term124025.getClass(), "ignoreRepaint", false);
        setBooleanField(term124025, term124025.getClass(), "visible", false);
        setBooleanField(term124025, term124025.getClass(), "enabled", false);
        setBooleanField(term124025, term124025.getClass(), "valid", false);
        setField(term124025, term124025.getClass(), "dropTarget", null);
        setField(term124025, term124025.getClass(), "popups", null);
        setField(term124025, term124025.getClass(), "name", null);
        setBooleanField(term124025, term124025.getClass(), "nameExplicitlySet", false);
        setBooleanField(term124025, term124025.getClass(), "focusable", false);
        setIntField(term124025, term124025.getClass(), "isFocusTraversableOverridden", 0);
        setField(term124025, term124025.getClass(), "focusTraversalKeys", null);
        setBooleanField(term124025, term124025.getClass(), "focusTraversalKeysEnabled", false);
        setField(term124025, term124025.getClass(), "acc", null);
        setField(term124025, term124025.getClass(), "minSize", null);
        setBooleanField(term124025, term124025.getClass(), "minSizeSet", false);
        setField(term124025, term124025.getClass(), "prefSize", null);
        setBooleanField(term124025, term124025.getClass(), "prefSizeSet", false);
        setField(term124025, term124025.getClass(), "maxSize", null);
        setBooleanField(term124025, term124025.getClass(), "maxSizeSet", false);
        setField(term124025, term124025.getClass(), "componentOrientation", null);
        setBooleanField(term124025, term124025.getClass(), "newEventsOnly", false);
        setField(term124025, term124025.getClass(), "componentListener", null);
        setField(term124025, term124025.getClass(), "focusListener", null);
        setField(term124025, term124025.getClass(), "hierarchyListener", null);
        setField(term124025, term124025.getClass(), "hierarchyBoundsListener", null);
        setField(term124025, term124025.getClass(), "keyListener", null);
        setField(term124025, term124025.getClass(), "mouseListener", null);
        setField(term124025, term124025.getClass(), "mouseMotionListener", null);
        setField(term124025, term124025.getClass(), "mouseWheelListener", null);
        setField(term124025, term124025.getClass(), "inputMethodListener", null);
        setLongField(term124025, term124025.getClass(), "eventMask", 0L);
        setField(term124025, term124025.getClass(), "changeSupport", null);
        setField(term124025, term124025.getClass(), "objectLock", null);
        setBooleanField(term124025, term124025.getClass(), "isPacked", false);
        setIntField(term124025, term124025.getClass(), "boundsOp", 0);
        setField(term124025, term124025.getClass(), "compoundShape", null);
        setField(term124025, term124025.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term124025, term124025.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term124025, term124025.getClass(), "backgroundEraseDisabled", false);
        setField(term124025, term124025.getClass(), "eventCache", null);
        setBooleanField(term124025, term124025.getClass(), "coalescingEnabled", false);
        setBooleanField(term124025, term124025.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term124025, term124025.getClass(), "componentSerializedDataVersion", 0);
        setField(term124025, term124025.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isTextInMiddle", argTypes, term124025, args);
    }

};


