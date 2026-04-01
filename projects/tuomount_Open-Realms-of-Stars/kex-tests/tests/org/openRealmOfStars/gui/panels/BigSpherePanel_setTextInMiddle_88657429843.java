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
import java.lang.Boolean;

public class BigSpherePanel_setTextInMiddle_88657429843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65530;
     Object term65578;

    public BigSpherePanel_setTextInMiddle_88657429843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65530 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.BigSpherePanel"));
        setField(term65530, term65530.getClass(), "backgroundImg", null);
        setField(term65530, term65530.getClass(), "northPlanetImg", null);
        setField(term65530, term65530.getClass(), "southPlanetImg", null);
        setField(term65530, term65530.getClass(), "westPlanetImg", null);
        setField(term65530, term65530.getClass(), "eastPlanetImg", null);
        setField(term65530, term65530.getClass(), "shipImages", null);
        setBooleanField(term65530, term65530.getClass(), "drawStarField", false);
        setField(term65530, term65530.getClass(), "title", null);
        setField(term65530, term65530.getClass(), "animation", null);
        setField(term65530, term65530.getClass(), "player", null);
        setField(term65530, term65530.getClass(), "textInformation", null);
        setDoubleField(term65530, term65530.getClass(), "orbitalX", 0.0);
        setDoubleField(term65530, term65530.getClass(), "orbitalZ", 0.0);
        setIntField(term65530, term65530.getClass(), "orbitalY", 0);
        setDoubleField(term65530, term65530.getClass(), "orbitalAngle", 0.0);
        setField(term65530, term65530.getClass(), "customOrbital", null);
        setBooleanField(term65530, term65530.getClass(), "textInMiddle", false);
        setIntField(term65530, term65530.getClass(), "planetTextureOffset", 0);
        setBooleanField(term65530, term65530.getClass(), "isAlignmentXSet", false);
        setFloatField(term65530, term65530.getClass(), "alignmentX", 0.0F);
        setBooleanField(term65530, term65530.getClass(), "isAlignmentYSet", false);
        setFloatField(term65530, term65530.getClass(), "alignmentY", 0.0F);
        setField(term65530, term65530.getClass(), "ui", null);
        setField(term65530, term65530.getClass(), "listenerList", null);
        setField(term65530, term65530.getClass(), "clientProperties", null);
        setField(term65530, term65530.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term65530, term65530.getClass(), "autoscrolls", false);
        setField(term65530, term65530.getClass(), "border", null);
        setIntField(term65530, term65530.getClass(), "flags", 0);
        setField(term65530, term65530.getClass(), "inputVerifier", null);
        setBooleanField(term65530, term65530.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term65530, term65530.getClass(), "paintingChild", null);
        setField(term65530, term65530.getClass(), "popupMenu", null);
        setField(term65530, term65530.getClass(), "revalidateRunnableScheduled", null);
        setField(term65530, term65530.getClass(), "focusInputMap", null);
        setField(term65530, term65530.getClass(), "ancestorInputMap", null);
        setField(term65530, term65530.getClass(), "windowInputMap", null);
        setField(term65530, term65530.getClass(), "actionMap", null);
        setField(term65530, term65530.getClass(), "aaHint", null);
        setField(term65530, term65530.getClass(), "lcdRenderingHint", null);
        setField(term65530, term65530.getClass(), "component", null);
        setField(term65530, term65530.getClass(), "layoutMgr", null);
        setField(term65530, term65530.getClass(), "dispatcher", null);
        setField(term65530, term65530.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term65530, term65530.getClass(), "focusCycleRoot", false);
        setBooleanField(term65530, term65530.getClass(), "focusTraversalPolicyProvider", false);
        setField(term65530, term65530.getClass(), "printingThreads", null);
        setBooleanField(term65530, term65530.getClass(), "printing", false);
        setField(term65530, term65530.getClass(), "containerListener", null);
        setIntField(term65530, term65530.getClass(), "listeningChildren", 0);
        setIntField(term65530, term65530.getClass(), "listeningBoundsChildren", 0);
        setIntField(term65530, term65530.getClass(), "descendantsCount", 0);
        setField(term65530, term65530.getClass(), "preserveBackgroundColor", null);
        setIntField(term65530, term65530.getClass(), "numOfHWComponents", 0);
        setIntField(term65530, term65530.getClass(), "numOfLWComponents", 0);
        setField(term65530, term65530.getClass(), "modalComp", null);
        setField(term65530, term65530.getClass(), "modalAppContext", null);
        setIntField(term65530, term65530.getClass(), "containerSerializedDataVersion", 0);
        setField(term65530, term65530.getClass(), "peer", null);
        setField(term65530, term65530.getClass(), "parent", null);
        setField(term65530, term65530.getClass(), "appContext", null);
        setIntField(term65530, term65530.getClass(), "x", 0);
        setIntField(term65530, term65530.getClass(), "y", 0);
        setIntField(term65530, term65530.getClass(), "width", 0);
        setIntField(term65530, term65530.getClass(), "height", 0);
        setField(term65530, term65530.getClass(), "foreground", null);
        setField(term65530, term65530.getClass(), "background", null);
        setField(term65530, term65530.getClass(), "font", null);
        setField(term65530, term65530.getClass(), "peerFont", null);
        setField(term65530, term65530.getClass(), "cursor", null);
        setField(term65530, term65530.getClass(), "locale", null);
        setField(term65530, term65530.getClass(), "graphicsConfig", null);
        setField(term65530, term65530.getClass(), "bufferStrategy", null);
        setBooleanField(term65530, term65530.getClass(), "ignoreRepaint", false);
        setBooleanField(term65530, term65530.getClass(), "visible", false);
        setBooleanField(term65530, term65530.getClass(), "enabled", false);
        setBooleanField(term65530, term65530.getClass(), "valid", false);
        setField(term65530, term65530.getClass(), "dropTarget", null);
        setField(term65530, term65530.getClass(), "popups", null);
        setField(term65530, term65530.getClass(), "name", null);
        setBooleanField(term65530, term65530.getClass(), "nameExplicitlySet", false);
        setBooleanField(term65530, term65530.getClass(), "focusable", false);
        setIntField(term65530, term65530.getClass(), "isFocusTraversableOverridden", 0);
        setField(term65530, term65530.getClass(), "focusTraversalKeys", null);
        setBooleanField(term65530, term65530.getClass(), "focusTraversalKeysEnabled", false);
        setField(term65530, term65530.getClass(), "acc", null);
        setField(term65530, term65530.getClass(), "minSize", null);
        setBooleanField(term65530, term65530.getClass(), "minSizeSet", false);
        setField(term65530, term65530.getClass(), "prefSize", null);
        setBooleanField(term65530, term65530.getClass(), "prefSizeSet", false);
        setField(term65530, term65530.getClass(), "maxSize", null);
        setBooleanField(term65530, term65530.getClass(), "maxSizeSet", false);
        setField(term65530, term65530.getClass(), "componentOrientation", null);
        setBooleanField(term65530, term65530.getClass(), "newEventsOnly", false);
        setField(term65530, term65530.getClass(), "componentListener", null);
        setField(term65530, term65530.getClass(), "focusListener", null);
        setField(term65530, term65530.getClass(), "hierarchyListener", null);
        setField(term65530, term65530.getClass(), "hierarchyBoundsListener", null);
        setField(term65530, term65530.getClass(), "keyListener", null);
        setField(term65530, term65530.getClass(), "mouseListener", null);
        setField(term65530, term65530.getClass(), "mouseMotionListener", null);
        setField(term65530, term65530.getClass(), "mouseWheelListener", null);
        setField(term65530, term65530.getClass(), "inputMethodListener", null);
        setLongField(term65530, term65530.getClass(), "eventMask", 0L);
        setField(term65530, term65530.getClass(), "changeSupport", null);
        setField(term65530, term65530.getClass(), "objectLock", null);
        setBooleanField(term65530, term65530.getClass(), "isPacked", false);
        setIntField(term65530, term65530.getClass(), "boundsOp", 0);
        setField(term65530, term65530.getClass(), "compoundShape", null);
        setField(term65530, term65530.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term65530, term65530.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term65530, term65530.getClass(), "backgroundEraseDisabled", false);
        setField(term65530, term65530.getClass(), "eventCache", null);
        setBooleanField(term65530, term65530.getClass(), "coalescingEnabled", false);
        setBooleanField(term65530, term65530.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term65530, term65530.getClass(), "componentSerializedDataVersion", 0);
        setField(term65530, term65530.getClass(), "accessibleContext", null);
        term65578 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigSpherePanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term65578;
        callMethod(klass, "setTextInMiddle", argTypes, term65530, args);
    }

};


