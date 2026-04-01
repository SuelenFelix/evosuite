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

public class BigImagePanel_getAnimation_197972653737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123414;

    public BigImagePanel_getAnimation_197972653737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123414 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel"));
        setField(term123414, term123414.getClass(), "backgroundImg", null);
        setField(term123414, term123414.getClass(), "northPlanetImg", null);
        setField(term123414, term123414.getClass(), "southPlanetImg", null);
        setField(term123414, term123414.getClass(), "westPlanetImg", null);
        setField(term123414, term123414.getClass(), "eastPlanetImg", null);
        setField(term123414, term123414.getClass(), "shipImages", null);
        setBooleanField(term123414, term123414.getClass(), "drawStarField", false);
        setField(term123414, term123414.getClass(), "planet", null);
        setField(term123414, term123414.getClass(), "title", null);
        setField(term123414, term123414.getClass(), "animation", null);
        setField(term123414, term123414.getClass(), "player", null);
        setField(term123414, term123414.getClass(), "textInformation", null);
        setDoubleField(term123414, term123414.getClass(), "orbitalX", 0.0);
        setDoubleField(term123414, term123414.getClass(), "orbitalZ", 0.0);
        setIntField(term123414, term123414.getClass(), "orbitalY", 0);
        setDoubleField(term123414, term123414.getClass(), "orbitalAngle", 0.0);
        setField(term123414, term123414.getClass(), "customOrbital", null);
        setBooleanField(term123414, term123414.getClass(), "textInMiddle", false);
        setBooleanField(term123414, term123414.getClass(), "isAlignmentXSet", false);
        setFloatField(term123414, term123414.getClass(), "alignmentX", 0.0F);
        setBooleanField(term123414, term123414.getClass(), "isAlignmentYSet", false);
        setFloatField(term123414, term123414.getClass(), "alignmentY", 0.0F);
        setField(term123414, term123414.getClass(), "ui", null);
        setField(term123414, term123414.getClass(), "listenerList", null);
        setField(term123414, term123414.getClass(), "clientProperties", null);
        setField(term123414, term123414.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term123414, term123414.getClass(), "autoscrolls", false);
        setField(term123414, term123414.getClass(), "border", null);
        setIntField(term123414, term123414.getClass(), "flags", 0);
        setField(term123414, term123414.getClass(), "inputVerifier", null);
        setBooleanField(term123414, term123414.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term123414, term123414.getClass(), "paintingChild", null);
        setField(term123414, term123414.getClass(), "popupMenu", null);
        setField(term123414, term123414.getClass(), "revalidateRunnableScheduled", null);
        setField(term123414, term123414.getClass(), "focusInputMap", null);
        setField(term123414, term123414.getClass(), "ancestorInputMap", null);
        setField(term123414, term123414.getClass(), "windowInputMap", null);
        setField(term123414, term123414.getClass(), "actionMap", null);
        setField(term123414, term123414.getClass(), "aaHint", null);
        setField(term123414, term123414.getClass(), "lcdRenderingHint", null);
        setField(term123414, term123414.getClass(), "component", null);
        setField(term123414, term123414.getClass(), "layoutMgr", null);
        setField(term123414, term123414.getClass(), "dispatcher", null);
        setField(term123414, term123414.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term123414, term123414.getClass(), "focusCycleRoot", false);
        setBooleanField(term123414, term123414.getClass(), "focusTraversalPolicyProvider", false);
        setField(term123414, term123414.getClass(), "printingThreads", null);
        setBooleanField(term123414, term123414.getClass(), "printing", false);
        setField(term123414, term123414.getClass(), "containerListener", null);
        setIntField(term123414, term123414.getClass(), "listeningChildren", 0);
        setIntField(term123414, term123414.getClass(), "listeningBoundsChildren", 0);
        setIntField(term123414, term123414.getClass(), "descendantsCount", 0);
        setField(term123414, term123414.getClass(), "preserveBackgroundColor", null);
        setIntField(term123414, term123414.getClass(), "numOfHWComponents", 0);
        setIntField(term123414, term123414.getClass(), "numOfLWComponents", 0);
        setField(term123414, term123414.getClass(), "modalComp", null);
        setField(term123414, term123414.getClass(), "modalAppContext", null);
        setIntField(term123414, term123414.getClass(), "containerSerializedDataVersion", 0);
        setField(term123414, term123414.getClass(), "peer", null);
        setField(term123414, term123414.getClass(), "parent", null);
        setField(term123414, term123414.getClass(), "appContext", null);
        setIntField(term123414, term123414.getClass(), "x", 0);
        setIntField(term123414, term123414.getClass(), "y", 0);
        setIntField(term123414, term123414.getClass(), "width", 0);
        setIntField(term123414, term123414.getClass(), "height", 0);
        setField(term123414, term123414.getClass(), "foreground", null);
        setField(term123414, term123414.getClass(), "background", null);
        setField(term123414, term123414.getClass(), "font", null);
        setField(term123414, term123414.getClass(), "peerFont", null);
        setField(term123414, term123414.getClass(), "cursor", null);
        setField(term123414, term123414.getClass(), "locale", null);
        setField(term123414, term123414.getClass(), "graphicsConfig", null);
        setField(term123414, term123414.getClass(), "bufferStrategy", null);
        setBooleanField(term123414, term123414.getClass(), "ignoreRepaint", false);
        setBooleanField(term123414, term123414.getClass(), "visible", false);
        setBooleanField(term123414, term123414.getClass(), "enabled", false);
        setBooleanField(term123414, term123414.getClass(), "valid", false);
        setField(term123414, term123414.getClass(), "dropTarget", null);
        setField(term123414, term123414.getClass(), "popups", null);
        setField(term123414, term123414.getClass(), "name", null);
        setBooleanField(term123414, term123414.getClass(), "nameExplicitlySet", false);
        setBooleanField(term123414, term123414.getClass(), "focusable", false);
        setIntField(term123414, term123414.getClass(), "isFocusTraversableOverridden", 0);
        setField(term123414, term123414.getClass(), "focusTraversalKeys", null);
        setBooleanField(term123414, term123414.getClass(), "focusTraversalKeysEnabled", false);
        setField(term123414, term123414.getClass(), "acc", null);
        setField(term123414, term123414.getClass(), "minSize", null);
        setBooleanField(term123414, term123414.getClass(), "minSizeSet", false);
        setField(term123414, term123414.getClass(), "prefSize", null);
        setBooleanField(term123414, term123414.getClass(), "prefSizeSet", false);
        setField(term123414, term123414.getClass(), "maxSize", null);
        setBooleanField(term123414, term123414.getClass(), "maxSizeSet", false);
        setField(term123414, term123414.getClass(), "componentOrientation", null);
        setBooleanField(term123414, term123414.getClass(), "newEventsOnly", false);
        setField(term123414, term123414.getClass(), "componentListener", null);
        setField(term123414, term123414.getClass(), "focusListener", null);
        setField(term123414, term123414.getClass(), "hierarchyListener", null);
        setField(term123414, term123414.getClass(), "hierarchyBoundsListener", null);
        setField(term123414, term123414.getClass(), "keyListener", null);
        setField(term123414, term123414.getClass(), "mouseListener", null);
        setField(term123414, term123414.getClass(), "mouseMotionListener", null);
        setField(term123414, term123414.getClass(), "mouseWheelListener", null);
        setField(term123414, term123414.getClass(), "inputMethodListener", null);
        setLongField(term123414, term123414.getClass(), "eventMask", 0L);
        setField(term123414, term123414.getClass(), "changeSupport", null);
        setField(term123414, term123414.getClass(), "objectLock", null);
        setBooleanField(term123414, term123414.getClass(), "isPacked", false);
        setIntField(term123414, term123414.getClass(), "boundsOp", 0);
        setField(term123414, term123414.getClass(), "compoundShape", null);
        setField(term123414, term123414.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term123414, term123414.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term123414, term123414.getClass(), "backgroundEraseDisabled", false);
        setField(term123414, term123414.getClass(), "eventCache", null);
        setBooleanField(term123414, term123414.getClass(), "coalescingEnabled", false);
        setBooleanField(term123414, term123414.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term123414, term123414.getClass(), "componentSerializedDataVersion", 0);
        setField(term123414, term123414.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAnimation", argTypes, term123414, args);
    }

};


