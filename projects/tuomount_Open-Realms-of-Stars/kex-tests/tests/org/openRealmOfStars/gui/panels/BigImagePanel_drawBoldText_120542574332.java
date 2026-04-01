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
import java.lang.Integer;

public class BigImagePanel_drawBoldText_120542574332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123171;
     Object term123218;
     Object term123220;

    public BigImagePanel_drawBoldText_120542574332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123171 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel"));
        setField(term123171, term123171.getClass(), "backgroundImg", null);
        setField(term123171, term123171.getClass(), "northPlanetImg", null);
        setField(term123171, term123171.getClass(), "southPlanetImg", null);
        setField(term123171, term123171.getClass(), "westPlanetImg", null);
        setField(term123171, term123171.getClass(), "eastPlanetImg", null);
        setField(term123171, term123171.getClass(), "shipImages", null);
        setBooleanField(term123171, term123171.getClass(), "drawStarField", false);
        setField(term123171, term123171.getClass(), "planet", null);
        setField(term123171, term123171.getClass(), "title", null);
        setField(term123171, term123171.getClass(), "animation", null);
        setField(term123171, term123171.getClass(), "player", null);
        setField(term123171, term123171.getClass(), "textInformation", null);
        setDoubleField(term123171, term123171.getClass(), "orbitalX", 0.0);
        setDoubleField(term123171, term123171.getClass(), "orbitalZ", 0.0);
        setIntField(term123171, term123171.getClass(), "orbitalY", 0);
        setDoubleField(term123171, term123171.getClass(), "orbitalAngle", 0.0);
        setField(term123171, term123171.getClass(), "customOrbital", null);
        setBooleanField(term123171, term123171.getClass(), "textInMiddle", false);
        setBooleanField(term123171, term123171.getClass(), "isAlignmentXSet", false);
        setFloatField(term123171, term123171.getClass(), "alignmentX", 0.0F);
        setBooleanField(term123171, term123171.getClass(), "isAlignmentYSet", false);
        setFloatField(term123171, term123171.getClass(), "alignmentY", 0.0F);
        setField(term123171, term123171.getClass(), "ui", null);
        setField(term123171, term123171.getClass(), "listenerList", null);
        setField(term123171, term123171.getClass(), "clientProperties", null);
        setField(term123171, term123171.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term123171, term123171.getClass(), "autoscrolls", false);
        setField(term123171, term123171.getClass(), "border", null);
        setIntField(term123171, term123171.getClass(), "flags", 0);
        setField(term123171, term123171.getClass(), "inputVerifier", null);
        setBooleanField(term123171, term123171.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term123171, term123171.getClass(), "paintingChild", null);
        setField(term123171, term123171.getClass(), "popupMenu", null);
        setField(term123171, term123171.getClass(), "revalidateRunnableScheduled", null);
        setField(term123171, term123171.getClass(), "focusInputMap", null);
        setField(term123171, term123171.getClass(), "ancestorInputMap", null);
        setField(term123171, term123171.getClass(), "windowInputMap", null);
        setField(term123171, term123171.getClass(), "actionMap", null);
        setField(term123171, term123171.getClass(), "aaHint", null);
        setField(term123171, term123171.getClass(), "lcdRenderingHint", null);
        setField(term123171, term123171.getClass(), "component", null);
        setField(term123171, term123171.getClass(), "layoutMgr", null);
        setField(term123171, term123171.getClass(), "dispatcher", null);
        setField(term123171, term123171.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term123171, term123171.getClass(), "focusCycleRoot", false);
        setBooleanField(term123171, term123171.getClass(), "focusTraversalPolicyProvider", false);
        setField(term123171, term123171.getClass(), "printingThreads", null);
        setBooleanField(term123171, term123171.getClass(), "printing", false);
        setField(term123171, term123171.getClass(), "containerListener", null);
        setIntField(term123171, term123171.getClass(), "listeningChildren", 0);
        setIntField(term123171, term123171.getClass(), "listeningBoundsChildren", 0);
        setIntField(term123171, term123171.getClass(), "descendantsCount", 0);
        setField(term123171, term123171.getClass(), "preserveBackgroundColor", null);
        setIntField(term123171, term123171.getClass(), "numOfHWComponents", 0);
        setIntField(term123171, term123171.getClass(), "numOfLWComponents", 0);
        setField(term123171, term123171.getClass(), "modalComp", null);
        setField(term123171, term123171.getClass(), "modalAppContext", null);
        setIntField(term123171, term123171.getClass(), "containerSerializedDataVersion", 0);
        setField(term123171, term123171.getClass(), "peer", null);
        setField(term123171, term123171.getClass(), "parent", null);
        setField(term123171, term123171.getClass(), "appContext", null);
        setIntField(term123171, term123171.getClass(), "x", 0);
        setIntField(term123171, term123171.getClass(), "y", 0);
        setIntField(term123171, term123171.getClass(), "width", 0);
        setIntField(term123171, term123171.getClass(), "height", 0);
        setField(term123171, term123171.getClass(), "foreground", null);
        setField(term123171, term123171.getClass(), "background", null);
        setField(term123171, term123171.getClass(), "font", null);
        setField(term123171, term123171.getClass(), "peerFont", null);
        setField(term123171, term123171.getClass(), "cursor", null);
        setField(term123171, term123171.getClass(), "locale", null);
        setField(term123171, term123171.getClass(), "graphicsConfig", null);
        setField(term123171, term123171.getClass(), "bufferStrategy", null);
        setBooleanField(term123171, term123171.getClass(), "ignoreRepaint", false);
        setBooleanField(term123171, term123171.getClass(), "visible", false);
        setBooleanField(term123171, term123171.getClass(), "enabled", false);
        setBooleanField(term123171, term123171.getClass(), "valid", false);
        setField(term123171, term123171.getClass(), "dropTarget", null);
        setField(term123171, term123171.getClass(), "popups", null);
        setField(term123171, term123171.getClass(), "name", null);
        setBooleanField(term123171, term123171.getClass(), "nameExplicitlySet", false);
        setBooleanField(term123171, term123171.getClass(), "focusable", false);
        setIntField(term123171, term123171.getClass(), "isFocusTraversableOverridden", 0);
        setField(term123171, term123171.getClass(), "focusTraversalKeys", null);
        setBooleanField(term123171, term123171.getClass(), "focusTraversalKeysEnabled", false);
        setField(term123171, term123171.getClass(), "acc", null);
        setField(term123171, term123171.getClass(), "minSize", null);
        setBooleanField(term123171, term123171.getClass(), "minSizeSet", false);
        setField(term123171, term123171.getClass(), "prefSize", null);
        setBooleanField(term123171, term123171.getClass(), "prefSizeSet", false);
        setField(term123171, term123171.getClass(), "maxSize", null);
        setBooleanField(term123171, term123171.getClass(), "maxSizeSet", false);
        setField(term123171, term123171.getClass(), "componentOrientation", null);
        setBooleanField(term123171, term123171.getClass(), "newEventsOnly", false);
        setField(term123171, term123171.getClass(), "componentListener", null);
        setField(term123171, term123171.getClass(), "focusListener", null);
        setField(term123171, term123171.getClass(), "hierarchyListener", null);
        setField(term123171, term123171.getClass(), "hierarchyBoundsListener", null);
        setField(term123171, term123171.getClass(), "keyListener", null);
        setField(term123171, term123171.getClass(), "mouseListener", null);
        setField(term123171, term123171.getClass(), "mouseMotionListener", null);
        setField(term123171, term123171.getClass(), "mouseWheelListener", null);
        setField(term123171, term123171.getClass(), "inputMethodListener", null);
        setLongField(term123171, term123171.getClass(), "eventMask", 0L);
        setField(term123171, term123171.getClass(), "changeSupport", null);
        setField(term123171, term123171.getClass(), "objectLock", null);
        setBooleanField(term123171, term123171.getClass(), "isPacked", false);
        setIntField(term123171, term123171.getClass(), "boundsOp", 0);
        setField(term123171, term123171.getClass(), "compoundShape", null);
        setField(term123171, term123171.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term123171, term123171.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term123171, term123171.getClass(), "backgroundEraseDisabled", false);
        setField(term123171, term123171.getClass(), "eventCache", null);
        setBooleanField(term123171, term123171.getClass(), "coalescingEnabled", false);
        setBooleanField(term123171, term123171.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term123171, term123171.getClass(), "componentSerializedDataVersion", 0);
        setField(term123171, term123171.getClass(), "accessibleContext", null);
        term123218 = new Integer(0);
        term123220 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.awt.Graphics");
        argTypes[1] = Class.forName("java.awt.Color");
        argTypes[2] = Class.forName("java.awt.Color");
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = Class.forName("java.lang.String");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term123218;
        args[4] = term123220;
        args[5] = null;
        callMethod(klass, "drawBoldText", argTypes, term123171, args);
    }

};


