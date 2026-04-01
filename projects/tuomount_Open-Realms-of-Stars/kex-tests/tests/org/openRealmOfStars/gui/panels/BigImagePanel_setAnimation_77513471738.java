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

public class BigImagePanel_setAnimation_77513471738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123461;

    public BigImagePanel_setAnimation_77513471738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123461 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel"));
        setField(term123461, term123461.getClass(), "backgroundImg", null);
        setField(term123461, term123461.getClass(), "northPlanetImg", null);
        setField(term123461, term123461.getClass(), "southPlanetImg", null);
        setField(term123461, term123461.getClass(), "westPlanetImg", null);
        setField(term123461, term123461.getClass(), "eastPlanetImg", null);
        setField(term123461, term123461.getClass(), "shipImages", null);
        setBooleanField(term123461, term123461.getClass(), "drawStarField", false);
        setField(term123461, term123461.getClass(), "planet", null);
        setField(term123461, term123461.getClass(), "title", null);
        setField(term123461, term123461.getClass(), "animation", null);
        setField(term123461, term123461.getClass(), "player", null);
        setField(term123461, term123461.getClass(), "textInformation", null);
        setDoubleField(term123461, term123461.getClass(), "orbitalX", 0.0);
        setDoubleField(term123461, term123461.getClass(), "orbitalZ", 0.0);
        setIntField(term123461, term123461.getClass(), "orbitalY", 0);
        setDoubleField(term123461, term123461.getClass(), "orbitalAngle", 0.0);
        setField(term123461, term123461.getClass(), "customOrbital", null);
        setBooleanField(term123461, term123461.getClass(), "textInMiddle", false);
        setBooleanField(term123461, term123461.getClass(), "isAlignmentXSet", false);
        setFloatField(term123461, term123461.getClass(), "alignmentX", 0.0F);
        setBooleanField(term123461, term123461.getClass(), "isAlignmentYSet", false);
        setFloatField(term123461, term123461.getClass(), "alignmentY", 0.0F);
        setField(term123461, term123461.getClass(), "ui", null);
        setField(term123461, term123461.getClass(), "listenerList", null);
        setField(term123461, term123461.getClass(), "clientProperties", null);
        setField(term123461, term123461.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term123461, term123461.getClass(), "autoscrolls", false);
        setField(term123461, term123461.getClass(), "border", null);
        setIntField(term123461, term123461.getClass(), "flags", 0);
        setField(term123461, term123461.getClass(), "inputVerifier", null);
        setBooleanField(term123461, term123461.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term123461, term123461.getClass(), "paintingChild", null);
        setField(term123461, term123461.getClass(), "popupMenu", null);
        setField(term123461, term123461.getClass(), "revalidateRunnableScheduled", null);
        setField(term123461, term123461.getClass(), "focusInputMap", null);
        setField(term123461, term123461.getClass(), "ancestorInputMap", null);
        setField(term123461, term123461.getClass(), "windowInputMap", null);
        setField(term123461, term123461.getClass(), "actionMap", null);
        setField(term123461, term123461.getClass(), "aaHint", null);
        setField(term123461, term123461.getClass(), "lcdRenderingHint", null);
        setField(term123461, term123461.getClass(), "component", null);
        setField(term123461, term123461.getClass(), "layoutMgr", null);
        setField(term123461, term123461.getClass(), "dispatcher", null);
        setField(term123461, term123461.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term123461, term123461.getClass(), "focusCycleRoot", false);
        setBooleanField(term123461, term123461.getClass(), "focusTraversalPolicyProvider", false);
        setField(term123461, term123461.getClass(), "printingThreads", null);
        setBooleanField(term123461, term123461.getClass(), "printing", false);
        setField(term123461, term123461.getClass(), "containerListener", null);
        setIntField(term123461, term123461.getClass(), "listeningChildren", 0);
        setIntField(term123461, term123461.getClass(), "listeningBoundsChildren", 0);
        setIntField(term123461, term123461.getClass(), "descendantsCount", 0);
        setField(term123461, term123461.getClass(), "preserveBackgroundColor", null);
        setIntField(term123461, term123461.getClass(), "numOfHWComponents", 0);
        setIntField(term123461, term123461.getClass(), "numOfLWComponents", 0);
        setField(term123461, term123461.getClass(), "modalComp", null);
        setField(term123461, term123461.getClass(), "modalAppContext", null);
        setIntField(term123461, term123461.getClass(), "containerSerializedDataVersion", 0);
        setField(term123461, term123461.getClass(), "peer", null);
        setField(term123461, term123461.getClass(), "parent", null);
        setField(term123461, term123461.getClass(), "appContext", null);
        setIntField(term123461, term123461.getClass(), "x", 0);
        setIntField(term123461, term123461.getClass(), "y", 0);
        setIntField(term123461, term123461.getClass(), "width", 0);
        setIntField(term123461, term123461.getClass(), "height", 0);
        setField(term123461, term123461.getClass(), "foreground", null);
        setField(term123461, term123461.getClass(), "background", null);
        setField(term123461, term123461.getClass(), "font", null);
        setField(term123461, term123461.getClass(), "peerFont", null);
        setField(term123461, term123461.getClass(), "cursor", null);
        setField(term123461, term123461.getClass(), "locale", null);
        setField(term123461, term123461.getClass(), "graphicsConfig", null);
        setField(term123461, term123461.getClass(), "bufferStrategy", null);
        setBooleanField(term123461, term123461.getClass(), "ignoreRepaint", false);
        setBooleanField(term123461, term123461.getClass(), "visible", false);
        setBooleanField(term123461, term123461.getClass(), "enabled", false);
        setBooleanField(term123461, term123461.getClass(), "valid", false);
        setField(term123461, term123461.getClass(), "dropTarget", null);
        setField(term123461, term123461.getClass(), "popups", null);
        setField(term123461, term123461.getClass(), "name", null);
        setBooleanField(term123461, term123461.getClass(), "nameExplicitlySet", false);
        setBooleanField(term123461, term123461.getClass(), "focusable", false);
        setIntField(term123461, term123461.getClass(), "isFocusTraversableOverridden", 0);
        setField(term123461, term123461.getClass(), "focusTraversalKeys", null);
        setBooleanField(term123461, term123461.getClass(), "focusTraversalKeysEnabled", false);
        setField(term123461, term123461.getClass(), "acc", null);
        setField(term123461, term123461.getClass(), "minSize", null);
        setBooleanField(term123461, term123461.getClass(), "minSizeSet", false);
        setField(term123461, term123461.getClass(), "prefSize", null);
        setBooleanField(term123461, term123461.getClass(), "prefSizeSet", false);
        setField(term123461, term123461.getClass(), "maxSize", null);
        setBooleanField(term123461, term123461.getClass(), "maxSizeSet", false);
        setField(term123461, term123461.getClass(), "componentOrientation", null);
        setBooleanField(term123461, term123461.getClass(), "newEventsOnly", false);
        setField(term123461, term123461.getClass(), "componentListener", null);
        setField(term123461, term123461.getClass(), "focusListener", null);
        setField(term123461, term123461.getClass(), "hierarchyListener", null);
        setField(term123461, term123461.getClass(), "hierarchyBoundsListener", null);
        setField(term123461, term123461.getClass(), "keyListener", null);
        setField(term123461, term123461.getClass(), "mouseListener", null);
        setField(term123461, term123461.getClass(), "mouseMotionListener", null);
        setField(term123461, term123461.getClass(), "mouseWheelListener", null);
        setField(term123461, term123461.getClass(), "inputMethodListener", null);
        setLongField(term123461, term123461.getClass(), "eventMask", 0L);
        setField(term123461, term123461.getClass(), "changeSupport", null);
        setField(term123461, term123461.getClass(), "objectLock", null);
        setBooleanField(term123461, term123461.getClass(), "isPacked", false);
        setIntField(term123461, term123461.getClass(), "boundsOp", 0);
        setField(term123461, term123461.getClass(), "compoundShape", null);
        setField(term123461, term123461.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term123461, term123461.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term123461, term123461.getClass(), "backgroundEraseDisabled", false);
        setField(term123461, term123461.getClass(), "eventCache", null);
        setBooleanField(term123461, term123461.getClass(), "coalescingEnabled", false);
        setBooleanField(term123461, term123461.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term123461, term123461.getClass(), "componentSerializedDataVersion", 0);
        setField(term123461, term123461.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.gui.mapPanel.PlanetAnimation");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setAnimation", argTypes, term123461, args);
    }

};


