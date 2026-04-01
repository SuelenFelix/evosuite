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

public class BigImagePanel_setTitle_112737237440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123555;

    public BigImagePanel_setTitle_112737237440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123555 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel"));
        setField(term123555, term123555.getClass(), "backgroundImg", null);
        setField(term123555, term123555.getClass(), "northPlanetImg", null);
        setField(term123555, term123555.getClass(), "southPlanetImg", null);
        setField(term123555, term123555.getClass(), "westPlanetImg", null);
        setField(term123555, term123555.getClass(), "eastPlanetImg", null);
        setField(term123555, term123555.getClass(), "shipImages", null);
        setBooleanField(term123555, term123555.getClass(), "drawStarField", false);
        setField(term123555, term123555.getClass(), "planet", null);
        setField(term123555, term123555.getClass(), "title", null);
        setField(term123555, term123555.getClass(), "animation", null);
        setField(term123555, term123555.getClass(), "player", null);
        setField(term123555, term123555.getClass(), "textInformation", null);
        setDoubleField(term123555, term123555.getClass(), "orbitalX", 0.0);
        setDoubleField(term123555, term123555.getClass(), "orbitalZ", 0.0);
        setIntField(term123555, term123555.getClass(), "orbitalY", 0);
        setDoubleField(term123555, term123555.getClass(), "orbitalAngle", 0.0);
        setField(term123555, term123555.getClass(), "customOrbital", null);
        setBooleanField(term123555, term123555.getClass(), "textInMiddle", false);
        setBooleanField(term123555, term123555.getClass(), "isAlignmentXSet", false);
        setFloatField(term123555, term123555.getClass(), "alignmentX", 0.0F);
        setBooleanField(term123555, term123555.getClass(), "isAlignmentYSet", false);
        setFloatField(term123555, term123555.getClass(), "alignmentY", 0.0F);
        setField(term123555, term123555.getClass(), "ui", null);
        setField(term123555, term123555.getClass(), "listenerList", null);
        setField(term123555, term123555.getClass(), "clientProperties", null);
        setField(term123555, term123555.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term123555, term123555.getClass(), "autoscrolls", false);
        setField(term123555, term123555.getClass(), "border", null);
        setIntField(term123555, term123555.getClass(), "flags", 0);
        setField(term123555, term123555.getClass(), "inputVerifier", null);
        setBooleanField(term123555, term123555.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term123555, term123555.getClass(), "paintingChild", null);
        setField(term123555, term123555.getClass(), "popupMenu", null);
        setField(term123555, term123555.getClass(), "revalidateRunnableScheduled", null);
        setField(term123555, term123555.getClass(), "focusInputMap", null);
        setField(term123555, term123555.getClass(), "ancestorInputMap", null);
        setField(term123555, term123555.getClass(), "windowInputMap", null);
        setField(term123555, term123555.getClass(), "actionMap", null);
        setField(term123555, term123555.getClass(), "aaHint", null);
        setField(term123555, term123555.getClass(), "lcdRenderingHint", null);
        setField(term123555, term123555.getClass(), "component", null);
        setField(term123555, term123555.getClass(), "layoutMgr", null);
        setField(term123555, term123555.getClass(), "dispatcher", null);
        setField(term123555, term123555.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term123555, term123555.getClass(), "focusCycleRoot", false);
        setBooleanField(term123555, term123555.getClass(), "focusTraversalPolicyProvider", false);
        setField(term123555, term123555.getClass(), "printingThreads", null);
        setBooleanField(term123555, term123555.getClass(), "printing", false);
        setField(term123555, term123555.getClass(), "containerListener", null);
        setIntField(term123555, term123555.getClass(), "listeningChildren", 0);
        setIntField(term123555, term123555.getClass(), "listeningBoundsChildren", 0);
        setIntField(term123555, term123555.getClass(), "descendantsCount", 0);
        setField(term123555, term123555.getClass(), "preserveBackgroundColor", null);
        setIntField(term123555, term123555.getClass(), "numOfHWComponents", 0);
        setIntField(term123555, term123555.getClass(), "numOfLWComponents", 0);
        setField(term123555, term123555.getClass(), "modalComp", null);
        setField(term123555, term123555.getClass(), "modalAppContext", null);
        setIntField(term123555, term123555.getClass(), "containerSerializedDataVersion", 0);
        setField(term123555, term123555.getClass(), "peer", null);
        setField(term123555, term123555.getClass(), "parent", null);
        setField(term123555, term123555.getClass(), "appContext", null);
        setIntField(term123555, term123555.getClass(), "x", 0);
        setIntField(term123555, term123555.getClass(), "y", 0);
        setIntField(term123555, term123555.getClass(), "width", 0);
        setIntField(term123555, term123555.getClass(), "height", 0);
        setField(term123555, term123555.getClass(), "foreground", null);
        setField(term123555, term123555.getClass(), "background", null);
        setField(term123555, term123555.getClass(), "font", null);
        setField(term123555, term123555.getClass(), "peerFont", null);
        setField(term123555, term123555.getClass(), "cursor", null);
        setField(term123555, term123555.getClass(), "locale", null);
        setField(term123555, term123555.getClass(), "graphicsConfig", null);
        setField(term123555, term123555.getClass(), "bufferStrategy", null);
        setBooleanField(term123555, term123555.getClass(), "ignoreRepaint", false);
        setBooleanField(term123555, term123555.getClass(), "visible", false);
        setBooleanField(term123555, term123555.getClass(), "enabled", false);
        setBooleanField(term123555, term123555.getClass(), "valid", false);
        setField(term123555, term123555.getClass(), "dropTarget", null);
        setField(term123555, term123555.getClass(), "popups", null);
        setField(term123555, term123555.getClass(), "name", null);
        setBooleanField(term123555, term123555.getClass(), "nameExplicitlySet", false);
        setBooleanField(term123555, term123555.getClass(), "focusable", false);
        setIntField(term123555, term123555.getClass(), "isFocusTraversableOverridden", 0);
        setField(term123555, term123555.getClass(), "focusTraversalKeys", null);
        setBooleanField(term123555, term123555.getClass(), "focusTraversalKeysEnabled", false);
        setField(term123555, term123555.getClass(), "acc", null);
        setField(term123555, term123555.getClass(), "minSize", null);
        setBooleanField(term123555, term123555.getClass(), "minSizeSet", false);
        setField(term123555, term123555.getClass(), "prefSize", null);
        setBooleanField(term123555, term123555.getClass(), "prefSizeSet", false);
        setField(term123555, term123555.getClass(), "maxSize", null);
        setBooleanField(term123555, term123555.getClass(), "maxSizeSet", false);
        setField(term123555, term123555.getClass(), "componentOrientation", null);
        setBooleanField(term123555, term123555.getClass(), "newEventsOnly", false);
        setField(term123555, term123555.getClass(), "componentListener", null);
        setField(term123555, term123555.getClass(), "focusListener", null);
        setField(term123555, term123555.getClass(), "hierarchyListener", null);
        setField(term123555, term123555.getClass(), "hierarchyBoundsListener", null);
        setField(term123555, term123555.getClass(), "keyListener", null);
        setField(term123555, term123555.getClass(), "mouseListener", null);
        setField(term123555, term123555.getClass(), "mouseMotionListener", null);
        setField(term123555, term123555.getClass(), "mouseWheelListener", null);
        setField(term123555, term123555.getClass(), "inputMethodListener", null);
        setLongField(term123555, term123555.getClass(), "eventMask", 0L);
        setField(term123555, term123555.getClass(), "changeSupport", null);
        setField(term123555, term123555.getClass(), "objectLock", null);
        setBooleanField(term123555, term123555.getClass(), "isPacked", false);
        setIntField(term123555, term123555.getClass(), "boundsOp", 0);
        setField(term123555, term123555.getClass(), "compoundShape", null);
        setField(term123555, term123555.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term123555, term123555.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term123555, term123555.getClass(), "backgroundEraseDisabled", false);
        setField(term123555, term123555.getClass(), "eventCache", null);
        setBooleanField(term123555, term123555.getClass(), "coalescingEnabled", false);
        setBooleanField(term123555, term123555.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term123555, term123555.getClass(), "componentSerializedDataVersion", 0);
        setField(term123555, term123555.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTitle", argTypes, term123555, args);
    }

};


