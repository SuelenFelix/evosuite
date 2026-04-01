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

public class BigSpherePanel_drawTextArea_95665847030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64898;

    public BigSpherePanel_drawTextArea_95665847030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64898 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.BigSpherePanel"));
        setField(term64898, term64898.getClass(), "backgroundImg", null);
        setField(term64898, term64898.getClass(), "northPlanetImg", null);
        setField(term64898, term64898.getClass(), "southPlanetImg", null);
        setField(term64898, term64898.getClass(), "westPlanetImg", null);
        setField(term64898, term64898.getClass(), "eastPlanetImg", null);
        setField(term64898, term64898.getClass(), "shipImages", null);
        setBooleanField(term64898, term64898.getClass(), "drawStarField", false);
        setField(term64898, term64898.getClass(), "title", null);
        setField(term64898, term64898.getClass(), "animation", null);
        setField(term64898, term64898.getClass(), "player", null);
        setField(term64898, term64898.getClass(), "textInformation", null);
        setDoubleField(term64898, term64898.getClass(), "orbitalX", 0.0);
        setDoubleField(term64898, term64898.getClass(), "orbitalZ", 0.0);
        setIntField(term64898, term64898.getClass(), "orbitalY", 0);
        setDoubleField(term64898, term64898.getClass(), "orbitalAngle", 0.0);
        setField(term64898, term64898.getClass(), "customOrbital", null);
        setBooleanField(term64898, term64898.getClass(), "textInMiddle", false);
        setIntField(term64898, term64898.getClass(), "planetTextureOffset", 0);
        setBooleanField(term64898, term64898.getClass(), "isAlignmentXSet", false);
        setFloatField(term64898, term64898.getClass(), "alignmentX", 0.0F);
        setBooleanField(term64898, term64898.getClass(), "isAlignmentYSet", false);
        setFloatField(term64898, term64898.getClass(), "alignmentY", 0.0F);
        setField(term64898, term64898.getClass(), "ui", null);
        setField(term64898, term64898.getClass(), "listenerList", null);
        setField(term64898, term64898.getClass(), "clientProperties", null);
        setField(term64898, term64898.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term64898, term64898.getClass(), "autoscrolls", false);
        setField(term64898, term64898.getClass(), "border", null);
        setIntField(term64898, term64898.getClass(), "flags", 0);
        setField(term64898, term64898.getClass(), "inputVerifier", null);
        setBooleanField(term64898, term64898.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term64898, term64898.getClass(), "paintingChild", null);
        setField(term64898, term64898.getClass(), "popupMenu", null);
        setField(term64898, term64898.getClass(), "revalidateRunnableScheduled", null);
        setField(term64898, term64898.getClass(), "focusInputMap", null);
        setField(term64898, term64898.getClass(), "ancestorInputMap", null);
        setField(term64898, term64898.getClass(), "windowInputMap", null);
        setField(term64898, term64898.getClass(), "actionMap", null);
        setField(term64898, term64898.getClass(), "aaHint", null);
        setField(term64898, term64898.getClass(), "lcdRenderingHint", null);
        setField(term64898, term64898.getClass(), "component", null);
        setField(term64898, term64898.getClass(), "layoutMgr", null);
        setField(term64898, term64898.getClass(), "dispatcher", null);
        setField(term64898, term64898.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term64898, term64898.getClass(), "focusCycleRoot", false);
        setBooleanField(term64898, term64898.getClass(), "focusTraversalPolicyProvider", false);
        setField(term64898, term64898.getClass(), "printingThreads", null);
        setBooleanField(term64898, term64898.getClass(), "printing", false);
        setField(term64898, term64898.getClass(), "containerListener", null);
        setIntField(term64898, term64898.getClass(), "listeningChildren", 0);
        setIntField(term64898, term64898.getClass(), "listeningBoundsChildren", 0);
        setIntField(term64898, term64898.getClass(), "descendantsCount", 0);
        setField(term64898, term64898.getClass(), "preserveBackgroundColor", null);
        setIntField(term64898, term64898.getClass(), "numOfHWComponents", 0);
        setIntField(term64898, term64898.getClass(), "numOfLWComponents", 0);
        setField(term64898, term64898.getClass(), "modalComp", null);
        setField(term64898, term64898.getClass(), "modalAppContext", null);
        setIntField(term64898, term64898.getClass(), "containerSerializedDataVersion", 0);
        setField(term64898, term64898.getClass(), "peer", null);
        setField(term64898, term64898.getClass(), "parent", null);
        setField(term64898, term64898.getClass(), "appContext", null);
        setIntField(term64898, term64898.getClass(), "x", 0);
        setIntField(term64898, term64898.getClass(), "y", 0);
        setIntField(term64898, term64898.getClass(), "width", 0);
        setIntField(term64898, term64898.getClass(), "height", 0);
        setField(term64898, term64898.getClass(), "foreground", null);
        setField(term64898, term64898.getClass(), "background", null);
        setField(term64898, term64898.getClass(), "font", null);
        setField(term64898, term64898.getClass(), "peerFont", null);
        setField(term64898, term64898.getClass(), "cursor", null);
        setField(term64898, term64898.getClass(), "locale", null);
        setField(term64898, term64898.getClass(), "graphicsConfig", null);
        setField(term64898, term64898.getClass(), "bufferStrategy", null);
        setBooleanField(term64898, term64898.getClass(), "ignoreRepaint", false);
        setBooleanField(term64898, term64898.getClass(), "visible", false);
        setBooleanField(term64898, term64898.getClass(), "enabled", false);
        setBooleanField(term64898, term64898.getClass(), "valid", false);
        setField(term64898, term64898.getClass(), "dropTarget", null);
        setField(term64898, term64898.getClass(), "popups", null);
        setField(term64898, term64898.getClass(), "name", null);
        setBooleanField(term64898, term64898.getClass(), "nameExplicitlySet", false);
        setBooleanField(term64898, term64898.getClass(), "focusable", false);
        setIntField(term64898, term64898.getClass(), "isFocusTraversableOverridden", 0);
        setField(term64898, term64898.getClass(), "focusTraversalKeys", null);
        setBooleanField(term64898, term64898.getClass(), "focusTraversalKeysEnabled", false);
        setField(term64898, term64898.getClass(), "acc", null);
        setField(term64898, term64898.getClass(), "minSize", null);
        setBooleanField(term64898, term64898.getClass(), "minSizeSet", false);
        setField(term64898, term64898.getClass(), "prefSize", null);
        setBooleanField(term64898, term64898.getClass(), "prefSizeSet", false);
        setField(term64898, term64898.getClass(), "maxSize", null);
        setBooleanField(term64898, term64898.getClass(), "maxSizeSet", false);
        setField(term64898, term64898.getClass(), "componentOrientation", null);
        setBooleanField(term64898, term64898.getClass(), "newEventsOnly", false);
        setField(term64898, term64898.getClass(), "componentListener", null);
        setField(term64898, term64898.getClass(), "focusListener", null);
        setField(term64898, term64898.getClass(), "hierarchyListener", null);
        setField(term64898, term64898.getClass(), "hierarchyBoundsListener", null);
        setField(term64898, term64898.getClass(), "keyListener", null);
        setField(term64898, term64898.getClass(), "mouseListener", null);
        setField(term64898, term64898.getClass(), "mouseMotionListener", null);
        setField(term64898, term64898.getClass(), "mouseWheelListener", null);
        setField(term64898, term64898.getClass(), "inputMethodListener", null);
        setLongField(term64898, term64898.getClass(), "eventMask", 0L);
        setField(term64898, term64898.getClass(), "changeSupport", null);
        setField(term64898, term64898.getClass(), "objectLock", null);
        setBooleanField(term64898, term64898.getClass(), "isPacked", false);
        setIntField(term64898, term64898.getClass(), "boundsOp", 0);
        setField(term64898, term64898.getClass(), "compoundShape", null);
        setField(term64898, term64898.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term64898, term64898.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term64898, term64898.getClass(), "backgroundEraseDisabled", false);
        setField(term64898, term64898.getClass(), "eventCache", null);
        setBooleanField(term64898, term64898.getClass(), "coalescingEnabled", false);
        setBooleanField(term64898, term64898.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term64898, term64898.getClass(), "componentSerializedDataVersion", 0);
        setField(term64898, term64898.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigSpherePanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Graphics");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "drawTextArea", argTypes, term64898, args);
    }

};


