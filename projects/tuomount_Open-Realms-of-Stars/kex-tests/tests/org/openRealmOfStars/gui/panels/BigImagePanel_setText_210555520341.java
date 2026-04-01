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

public class BigImagePanel_setText_210555520341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123602;

    public BigImagePanel_setText_210555520341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123602 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel"));
        setField(term123602, term123602.getClass(), "backgroundImg", null);
        setField(term123602, term123602.getClass(), "northPlanetImg", null);
        setField(term123602, term123602.getClass(), "southPlanetImg", null);
        setField(term123602, term123602.getClass(), "westPlanetImg", null);
        setField(term123602, term123602.getClass(), "eastPlanetImg", null);
        setField(term123602, term123602.getClass(), "shipImages", null);
        setBooleanField(term123602, term123602.getClass(), "drawStarField", false);
        setField(term123602, term123602.getClass(), "planet", null);
        setField(term123602, term123602.getClass(), "title", null);
        setField(term123602, term123602.getClass(), "animation", null);
        setField(term123602, term123602.getClass(), "player", null);
        setField(term123602, term123602.getClass(), "textInformation", null);
        setDoubleField(term123602, term123602.getClass(), "orbitalX", 0.0);
        setDoubleField(term123602, term123602.getClass(), "orbitalZ", 0.0);
        setIntField(term123602, term123602.getClass(), "orbitalY", 0);
        setDoubleField(term123602, term123602.getClass(), "orbitalAngle", 0.0);
        setField(term123602, term123602.getClass(), "customOrbital", null);
        setBooleanField(term123602, term123602.getClass(), "textInMiddle", false);
        setBooleanField(term123602, term123602.getClass(), "isAlignmentXSet", false);
        setFloatField(term123602, term123602.getClass(), "alignmentX", 0.0F);
        setBooleanField(term123602, term123602.getClass(), "isAlignmentYSet", false);
        setFloatField(term123602, term123602.getClass(), "alignmentY", 0.0F);
        setField(term123602, term123602.getClass(), "ui", null);
        setField(term123602, term123602.getClass(), "listenerList", null);
        setField(term123602, term123602.getClass(), "clientProperties", null);
        setField(term123602, term123602.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term123602, term123602.getClass(), "autoscrolls", false);
        setField(term123602, term123602.getClass(), "border", null);
        setIntField(term123602, term123602.getClass(), "flags", 0);
        setField(term123602, term123602.getClass(), "inputVerifier", null);
        setBooleanField(term123602, term123602.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term123602, term123602.getClass(), "paintingChild", null);
        setField(term123602, term123602.getClass(), "popupMenu", null);
        setField(term123602, term123602.getClass(), "revalidateRunnableScheduled", null);
        setField(term123602, term123602.getClass(), "focusInputMap", null);
        setField(term123602, term123602.getClass(), "ancestorInputMap", null);
        setField(term123602, term123602.getClass(), "windowInputMap", null);
        setField(term123602, term123602.getClass(), "actionMap", null);
        setField(term123602, term123602.getClass(), "aaHint", null);
        setField(term123602, term123602.getClass(), "lcdRenderingHint", null);
        setField(term123602, term123602.getClass(), "component", null);
        setField(term123602, term123602.getClass(), "layoutMgr", null);
        setField(term123602, term123602.getClass(), "dispatcher", null);
        setField(term123602, term123602.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term123602, term123602.getClass(), "focusCycleRoot", false);
        setBooleanField(term123602, term123602.getClass(), "focusTraversalPolicyProvider", false);
        setField(term123602, term123602.getClass(), "printingThreads", null);
        setBooleanField(term123602, term123602.getClass(), "printing", false);
        setField(term123602, term123602.getClass(), "containerListener", null);
        setIntField(term123602, term123602.getClass(), "listeningChildren", 0);
        setIntField(term123602, term123602.getClass(), "listeningBoundsChildren", 0);
        setIntField(term123602, term123602.getClass(), "descendantsCount", 0);
        setField(term123602, term123602.getClass(), "preserveBackgroundColor", null);
        setIntField(term123602, term123602.getClass(), "numOfHWComponents", 0);
        setIntField(term123602, term123602.getClass(), "numOfLWComponents", 0);
        setField(term123602, term123602.getClass(), "modalComp", null);
        setField(term123602, term123602.getClass(), "modalAppContext", null);
        setIntField(term123602, term123602.getClass(), "containerSerializedDataVersion", 0);
        setField(term123602, term123602.getClass(), "peer", null);
        setField(term123602, term123602.getClass(), "parent", null);
        setField(term123602, term123602.getClass(), "appContext", null);
        setIntField(term123602, term123602.getClass(), "x", 0);
        setIntField(term123602, term123602.getClass(), "y", 0);
        setIntField(term123602, term123602.getClass(), "width", 0);
        setIntField(term123602, term123602.getClass(), "height", 0);
        setField(term123602, term123602.getClass(), "foreground", null);
        setField(term123602, term123602.getClass(), "background", null);
        setField(term123602, term123602.getClass(), "font", null);
        setField(term123602, term123602.getClass(), "peerFont", null);
        setField(term123602, term123602.getClass(), "cursor", null);
        setField(term123602, term123602.getClass(), "locale", null);
        setField(term123602, term123602.getClass(), "graphicsConfig", null);
        setField(term123602, term123602.getClass(), "bufferStrategy", null);
        setBooleanField(term123602, term123602.getClass(), "ignoreRepaint", false);
        setBooleanField(term123602, term123602.getClass(), "visible", false);
        setBooleanField(term123602, term123602.getClass(), "enabled", false);
        setBooleanField(term123602, term123602.getClass(), "valid", false);
        setField(term123602, term123602.getClass(), "dropTarget", null);
        setField(term123602, term123602.getClass(), "popups", null);
        setField(term123602, term123602.getClass(), "name", null);
        setBooleanField(term123602, term123602.getClass(), "nameExplicitlySet", false);
        setBooleanField(term123602, term123602.getClass(), "focusable", false);
        setIntField(term123602, term123602.getClass(), "isFocusTraversableOverridden", 0);
        setField(term123602, term123602.getClass(), "focusTraversalKeys", null);
        setBooleanField(term123602, term123602.getClass(), "focusTraversalKeysEnabled", false);
        setField(term123602, term123602.getClass(), "acc", null);
        setField(term123602, term123602.getClass(), "minSize", null);
        setBooleanField(term123602, term123602.getClass(), "minSizeSet", false);
        setField(term123602, term123602.getClass(), "prefSize", null);
        setBooleanField(term123602, term123602.getClass(), "prefSizeSet", false);
        setField(term123602, term123602.getClass(), "maxSize", null);
        setBooleanField(term123602, term123602.getClass(), "maxSizeSet", false);
        setField(term123602, term123602.getClass(), "componentOrientation", null);
        setBooleanField(term123602, term123602.getClass(), "newEventsOnly", false);
        setField(term123602, term123602.getClass(), "componentListener", null);
        setField(term123602, term123602.getClass(), "focusListener", null);
        setField(term123602, term123602.getClass(), "hierarchyListener", null);
        setField(term123602, term123602.getClass(), "hierarchyBoundsListener", null);
        setField(term123602, term123602.getClass(), "keyListener", null);
        setField(term123602, term123602.getClass(), "mouseListener", null);
        setField(term123602, term123602.getClass(), "mouseMotionListener", null);
        setField(term123602, term123602.getClass(), "mouseWheelListener", null);
        setField(term123602, term123602.getClass(), "inputMethodListener", null);
        setLongField(term123602, term123602.getClass(), "eventMask", 0L);
        setField(term123602, term123602.getClass(), "changeSupport", null);
        setField(term123602, term123602.getClass(), "objectLock", null);
        setBooleanField(term123602, term123602.getClass(), "isPacked", false);
        setIntField(term123602, term123602.getClass(), "boundsOp", 0);
        setField(term123602, term123602.getClass(), "compoundShape", null);
        setField(term123602, term123602.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term123602, term123602.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term123602, term123602.getClass(), "backgroundEraseDisabled", false);
        setField(term123602, term123602.getClass(), "eventCache", null);
        setBooleanField(term123602, term123602.getClass(), "coalescingEnabled", false);
        setBooleanField(term123602, term123602.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term123602, term123602.getClass(), "componentSerializedDataVersion", 0);
        setField(term123602, term123602.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setText", argTypes, term123602, args);
    }

};


