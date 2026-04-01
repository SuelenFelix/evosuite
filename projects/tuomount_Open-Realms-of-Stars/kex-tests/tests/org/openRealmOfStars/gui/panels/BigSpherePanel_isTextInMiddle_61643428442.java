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

public class BigSpherePanel_isTextInMiddle_61643428442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65482;

    public BigSpherePanel_isTextInMiddle_61643428442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65482 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.BigSpherePanel"));
        setField(term65482, term65482.getClass(), "backgroundImg", null);
        setField(term65482, term65482.getClass(), "northPlanetImg", null);
        setField(term65482, term65482.getClass(), "southPlanetImg", null);
        setField(term65482, term65482.getClass(), "westPlanetImg", null);
        setField(term65482, term65482.getClass(), "eastPlanetImg", null);
        setField(term65482, term65482.getClass(), "shipImages", null);
        setBooleanField(term65482, term65482.getClass(), "drawStarField", false);
        setField(term65482, term65482.getClass(), "title", null);
        setField(term65482, term65482.getClass(), "animation", null);
        setField(term65482, term65482.getClass(), "player", null);
        setField(term65482, term65482.getClass(), "textInformation", null);
        setDoubleField(term65482, term65482.getClass(), "orbitalX", 0.0);
        setDoubleField(term65482, term65482.getClass(), "orbitalZ", 0.0);
        setIntField(term65482, term65482.getClass(), "orbitalY", 0);
        setDoubleField(term65482, term65482.getClass(), "orbitalAngle", 0.0);
        setField(term65482, term65482.getClass(), "customOrbital", null);
        setBooleanField(term65482, term65482.getClass(), "textInMiddle", false);
        setIntField(term65482, term65482.getClass(), "planetTextureOffset", 0);
        setBooleanField(term65482, term65482.getClass(), "isAlignmentXSet", false);
        setFloatField(term65482, term65482.getClass(), "alignmentX", 0.0F);
        setBooleanField(term65482, term65482.getClass(), "isAlignmentYSet", false);
        setFloatField(term65482, term65482.getClass(), "alignmentY", 0.0F);
        setField(term65482, term65482.getClass(), "ui", null);
        setField(term65482, term65482.getClass(), "listenerList", null);
        setField(term65482, term65482.getClass(), "clientProperties", null);
        setField(term65482, term65482.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term65482, term65482.getClass(), "autoscrolls", false);
        setField(term65482, term65482.getClass(), "border", null);
        setIntField(term65482, term65482.getClass(), "flags", 0);
        setField(term65482, term65482.getClass(), "inputVerifier", null);
        setBooleanField(term65482, term65482.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term65482, term65482.getClass(), "paintingChild", null);
        setField(term65482, term65482.getClass(), "popupMenu", null);
        setField(term65482, term65482.getClass(), "revalidateRunnableScheduled", null);
        setField(term65482, term65482.getClass(), "focusInputMap", null);
        setField(term65482, term65482.getClass(), "ancestorInputMap", null);
        setField(term65482, term65482.getClass(), "windowInputMap", null);
        setField(term65482, term65482.getClass(), "actionMap", null);
        setField(term65482, term65482.getClass(), "aaHint", null);
        setField(term65482, term65482.getClass(), "lcdRenderingHint", null);
        setField(term65482, term65482.getClass(), "component", null);
        setField(term65482, term65482.getClass(), "layoutMgr", null);
        setField(term65482, term65482.getClass(), "dispatcher", null);
        setField(term65482, term65482.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term65482, term65482.getClass(), "focusCycleRoot", false);
        setBooleanField(term65482, term65482.getClass(), "focusTraversalPolicyProvider", false);
        setField(term65482, term65482.getClass(), "printingThreads", null);
        setBooleanField(term65482, term65482.getClass(), "printing", false);
        setField(term65482, term65482.getClass(), "containerListener", null);
        setIntField(term65482, term65482.getClass(), "listeningChildren", 0);
        setIntField(term65482, term65482.getClass(), "listeningBoundsChildren", 0);
        setIntField(term65482, term65482.getClass(), "descendantsCount", 0);
        setField(term65482, term65482.getClass(), "preserveBackgroundColor", null);
        setIntField(term65482, term65482.getClass(), "numOfHWComponents", 0);
        setIntField(term65482, term65482.getClass(), "numOfLWComponents", 0);
        setField(term65482, term65482.getClass(), "modalComp", null);
        setField(term65482, term65482.getClass(), "modalAppContext", null);
        setIntField(term65482, term65482.getClass(), "containerSerializedDataVersion", 0);
        setField(term65482, term65482.getClass(), "peer", null);
        setField(term65482, term65482.getClass(), "parent", null);
        setField(term65482, term65482.getClass(), "appContext", null);
        setIntField(term65482, term65482.getClass(), "x", 0);
        setIntField(term65482, term65482.getClass(), "y", 0);
        setIntField(term65482, term65482.getClass(), "width", 0);
        setIntField(term65482, term65482.getClass(), "height", 0);
        setField(term65482, term65482.getClass(), "foreground", null);
        setField(term65482, term65482.getClass(), "background", null);
        setField(term65482, term65482.getClass(), "font", null);
        setField(term65482, term65482.getClass(), "peerFont", null);
        setField(term65482, term65482.getClass(), "cursor", null);
        setField(term65482, term65482.getClass(), "locale", null);
        setField(term65482, term65482.getClass(), "graphicsConfig", null);
        setField(term65482, term65482.getClass(), "bufferStrategy", null);
        setBooleanField(term65482, term65482.getClass(), "ignoreRepaint", false);
        setBooleanField(term65482, term65482.getClass(), "visible", false);
        setBooleanField(term65482, term65482.getClass(), "enabled", false);
        setBooleanField(term65482, term65482.getClass(), "valid", false);
        setField(term65482, term65482.getClass(), "dropTarget", null);
        setField(term65482, term65482.getClass(), "popups", null);
        setField(term65482, term65482.getClass(), "name", null);
        setBooleanField(term65482, term65482.getClass(), "nameExplicitlySet", false);
        setBooleanField(term65482, term65482.getClass(), "focusable", false);
        setIntField(term65482, term65482.getClass(), "isFocusTraversableOverridden", 0);
        setField(term65482, term65482.getClass(), "focusTraversalKeys", null);
        setBooleanField(term65482, term65482.getClass(), "focusTraversalKeysEnabled", false);
        setField(term65482, term65482.getClass(), "acc", null);
        setField(term65482, term65482.getClass(), "minSize", null);
        setBooleanField(term65482, term65482.getClass(), "minSizeSet", false);
        setField(term65482, term65482.getClass(), "prefSize", null);
        setBooleanField(term65482, term65482.getClass(), "prefSizeSet", false);
        setField(term65482, term65482.getClass(), "maxSize", null);
        setBooleanField(term65482, term65482.getClass(), "maxSizeSet", false);
        setField(term65482, term65482.getClass(), "componentOrientation", null);
        setBooleanField(term65482, term65482.getClass(), "newEventsOnly", false);
        setField(term65482, term65482.getClass(), "componentListener", null);
        setField(term65482, term65482.getClass(), "focusListener", null);
        setField(term65482, term65482.getClass(), "hierarchyListener", null);
        setField(term65482, term65482.getClass(), "hierarchyBoundsListener", null);
        setField(term65482, term65482.getClass(), "keyListener", null);
        setField(term65482, term65482.getClass(), "mouseListener", null);
        setField(term65482, term65482.getClass(), "mouseMotionListener", null);
        setField(term65482, term65482.getClass(), "mouseWheelListener", null);
        setField(term65482, term65482.getClass(), "inputMethodListener", null);
        setLongField(term65482, term65482.getClass(), "eventMask", 0L);
        setField(term65482, term65482.getClass(), "changeSupport", null);
        setField(term65482, term65482.getClass(), "objectLock", null);
        setBooleanField(term65482, term65482.getClass(), "isPacked", false);
        setIntField(term65482, term65482.getClass(), "boundsOp", 0);
        setField(term65482, term65482.getClass(), "compoundShape", null);
        setField(term65482, term65482.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term65482, term65482.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term65482, term65482.getClass(), "backgroundEraseDisabled", false);
        setField(term65482, term65482.getClass(), "eventCache", null);
        setBooleanField(term65482, term65482.getClass(), "coalescingEnabled", false);
        setBooleanField(term65482, term65482.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term65482, term65482.getClass(), "componentSerializedDataVersion", 0);
        setField(term65482, term65482.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigSpherePanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isTextInMiddle", argTypes, term65482, args);
    }

};


