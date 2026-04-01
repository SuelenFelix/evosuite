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

public class BigSpherePanel_setText_34046482738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65290;

    public BigSpherePanel_setText_34046482738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65290 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.BigSpherePanel"));
        setField(term65290, term65290.getClass(), "backgroundImg", null);
        setField(term65290, term65290.getClass(), "northPlanetImg", null);
        setField(term65290, term65290.getClass(), "southPlanetImg", null);
        setField(term65290, term65290.getClass(), "westPlanetImg", null);
        setField(term65290, term65290.getClass(), "eastPlanetImg", null);
        setField(term65290, term65290.getClass(), "shipImages", null);
        setBooleanField(term65290, term65290.getClass(), "drawStarField", false);
        setField(term65290, term65290.getClass(), "title", null);
        setField(term65290, term65290.getClass(), "animation", null);
        setField(term65290, term65290.getClass(), "player", null);
        setField(term65290, term65290.getClass(), "textInformation", null);
        setDoubleField(term65290, term65290.getClass(), "orbitalX", 0.0);
        setDoubleField(term65290, term65290.getClass(), "orbitalZ", 0.0);
        setIntField(term65290, term65290.getClass(), "orbitalY", 0);
        setDoubleField(term65290, term65290.getClass(), "orbitalAngle", 0.0);
        setField(term65290, term65290.getClass(), "customOrbital", null);
        setBooleanField(term65290, term65290.getClass(), "textInMiddle", false);
        setIntField(term65290, term65290.getClass(), "planetTextureOffset", 0);
        setBooleanField(term65290, term65290.getClass(), "isAlignmentXSet", false);
        setFloatField(term65290, term65290.getClass(), "alignmentX", 0.0F);
        setBooleanField(term65290, term65290.getClass(), "isAlignmentYSet", false);
        setFloatField(term65290, term65290.getClass(), "alignmentY", 0.0F);
        setField(term65290, term65290.getClass(), "ui", null);
        setField(term65290, term65290.getClass(), "listenerList", null);
        setField(term65290, term65290.getClass(), "clientProperties", null);
        setField(term65290, term65290.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term65290, term65290.getClass(), "autoscrolls", false);
        setField(term65290, term65290.getClass(), "border", null);
        setIntField(term65290, term65290.getClass(), "flags", 0);
        setField(term65290, term65290.getClass(), "inputVerifier", null);
        setBooleanField(term65290, term65290.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term65290, term65290.getClass(), "paintingChild", null);
        setField(term65290, term65290.getClass(), "popupMenu", null);
        setField(term65290, term65290.getClass(), "revalidateRunnableScheduled", null);
        setField(term65290, term65290.getClass(), "focusInputMap", null);
        setField(term65290, term65290.getClass(), "ancestorInputMap", null);
        setField(term65290, term65290.getClass(), "windowInputMap", null);
        setField(term65290, term65290.getClass(), "actionMap", null);
        setField(term65290, term65290.getClass(), "aaHint", null);
        setField(term65290, term65290.getClass(), "lcdRenderingHint", null);
        setField(term65290, term65290.getClass(), "component", null);
        setField(term65290, term65290.getClass(), "layoutMgr", null);
        setField(term65290, term65290.getClass(), "dispatcher", null);
        setField(term65290, term65290.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term65290, term65290.getClass(), "focusCycleRoot", false);
        setBooleanField(term65290, term65290.getClass(), "focusTraversalPolicyProvider", false);
        setField(term65290, term65290.getClass(), "printingThreads", null);
        setBooleanField(term65290, term65290.getClass(), "printing", false);
        setField(term65290, term65290.getClass(), "containerListener", null);
        setIntField(term65290, term65290.getClass(), "listeningChildren", 0);
        setIntField(term65290, term65290.getClass(), "listeningBoundsChildren", 0);
        setIntField(term65290, term65290.getClass(), "descendantsCount", 0);
        setField(term65290, term65290.getClass(), "preserveBackgroundColor", null);
        setIntField(term65290, term65290.getClass(), "numOfHWComponents", 0);
        setIntField(term65290, term65290.getClass(), "numOfLWComponents", 0);
        setField(term65290, term65290.getClass(), "modalComp", null);
        setField(term65290, term65290.getClass(), "modalAppContext", null);
        setIntField(term65290, term65290.getClass(), "containerSerializedDataVersion", 0);
        setField(term65290, term65290.getClass(), "peer", null);
        setField(term65290, term65290.getClass(), "parent", null);
        setField(term65290, term65290.getClass(), "appContext", null);
        setIntField(term65290, term65290.getClass(), "x", 0);
        setIntField(term65290, term65290.getClass(), "y", 0);
        setIntField(term65290, term65290.getClass(), "width", 0);
        setIntField(term65290, term65290.getClass(), "height", 0);
        setField(term65290, term65290.getClass(), "foreground", null);
        setField(term65290, term65290.getClass(), "background", null);
        setField(term65290, term65290.getClass(), "font", null);
        setField(term65290, term65290.getClass(), "peerFont", null);
        setField(term65290, term65290.getClass(), "cursor", null);
        setField(term65290, term65290.getClass(), "locale", null);
        setField(term65290, term65290.getClass(), "graphicsConfig", null);
        setField(term65290, term65290.getClass(), "bufferStrategy", null);
        setBooleanField(term65290, term65290.getClass(), "ignoreRepaint", false);
        setBooleanField(term65290, term65290.getClass(), "visible", false);
        setBooleanField(term65290, term65290.getClass(), "enabled", false);
        setBooleanField(term65290, term65290.getClass(), "valid", false);
        setField(term65290, term65290.getClass(), "dropTarget", null);
        setField(term65290, term65290.getClass(), "popups", null);
        setField(term65290, term65290.getClass(), "name", null);
        setBooleanField(term65290, term65290.getClass(), "nameExplicitlySet", false);
        setBooleanField(term65290, term65290.getClass(), "focusable", false);
        setIntField(term65290, term65290.getClass(), "isFocusTraversableOverridden", 0);
        setField(term65290, term65290.getClass(), "focusTraversalKeys", null);
        setBooleanField(term65290, term65290.getClass(), "focusTraversalKeysEnabled", false);
        setField(term65290, term65290.getClass(), "acc", null);
        setField(term65290, term65290.getClass(), "minSize", null);
        setBooleanField(term65290, term65290.getClass(), "minSizeSet", false);
        setField(term65290, term65290.getClass(), "prefSize", null);
        setBooleanField(term65290, term65290.getClass(), "prefSizeSet", false);
        setField(term65290, term65290.getClass(), "maxSize", null);
        setBooleanField(term65290, term65290.getClass(), "maxSizeSet", false);
        setField(term65290, term65290.getClass(), "componentOrientation", null);
        setBooleanField(term65290, term65290.getClass(), "newEventsOnly", false);
        setField(term65290, term65290.getClass(), "componentListener", null);
        setField(term65290, term65290.getClass(), "focusListener", null);
        setField(term65290, term65290.getClass(), "hierarchyListener", null);
        setField(term65290, term65290.getClass(), "hierarchyBoundsListener", null);
        setField(term65290, term65290.getClass(), "keyListener", null);
        setField(term65290, term65290.getClass(), "mouseListener", null);
        setField(term65290, term65290.getClass(), "mouseMotionListener", null);
        setField(term65290, term65290.getClass(), "mouseWheelListener", null);
        setField(term65290, term65290.getClass(), "inputMethodListener", null);
        setLongField(term65290, term65290.getClass(), "eventMask", 0L);
        setField(term65290, term65290.getClass(), "changeSupport", null);
        setField(term65290, term65290.getClass(), "objectLock", null);
        setBooleanField(term65290, term65290.getClass(), "isPacked", false);
        setIntField(term65290, term65290.getClass(), "boundsOp", 0);
        setField(term65290, term65290.getClass(), "compoundShape", null);
        setField(term65290, term65290.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term65290, term65290.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term65290, term65290.getClass(), "backgroundEraseDisabled", false);
        setField(term65290, term65290.getClass(), "eventCache", null);
        setBooleanField(term65290, term65290.getClass(), "coalescingEnabled", false);
        setBooleanField(term65290, term65290.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term65290, term65290.getClass(), "componentSerializedDataVersion", 0);
        setField(term65290, term65290.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigSpherePanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setText", argTypes, term65290, args);
    }

};


