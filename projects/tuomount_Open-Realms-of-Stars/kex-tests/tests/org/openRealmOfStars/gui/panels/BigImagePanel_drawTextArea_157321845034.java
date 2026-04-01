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

public class BigImagePanel_drawTextArea_157321845034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123269;

    public BigImagePanel_drawTextArea_157321845034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123269 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel"));
        setField(term123269, term123269.getClass(), "backgroundImg", null);
        setField(term123269, term123269.getClass(), "northPlanetImg", null);
        setField(term123269, term123269.getClass(), "southPlanetImg", null);
        setField(term123269, term123269.getClass(), "westPlanetImg", null);
        setField(term123269, term123269.getClass(), "eastPlanetImg", null);
        setField(term123269, term123269.getClass(), "shipImages", null);
        setBooleanField(term123269, term123269.getClass(), "drawStarField", false);
        setField(term123269, term123269.getClass(), "planet", null);
        setField(term123269, term123269.getClass(), "title", null);
        setField(term123269, term123269.getClass(), "animation", null);
        setField(term123269, term123269.getClass(), "player", null);
        setField(term123269, term123269.getClass(), "textInformation", null);
        setDoubleField(term123269, term123269.getClass(), "orbitalX", 0.0);
        setDoubleField(term123269, term123269.getClass(), "orbitalZ", 0.0);
        setIntField(term123269, term123269.getClass(), "orbitalY", 0);
        setDoubleField(term123269, term123269.getClass(), "orbitalAngle", 0.0);
        setField(term123269, term123269.getClass(), "customOrbital", null);
        setBooleanField(term123269, term123269.getClass(), "textInMiddle", false);
        setBooleanField(term123269, term123269.getClass(), "isAlignmentXSet", false);
        setFloatField(term123269, term123269.getClass(), "alignmentX", 0.0F);
        setBooleanField(term123269, term123269.getClass(), "isAlignmentYSet", false);
        setFloatField(term123269, term123269.getClass(), "alignmentY", 0.0F);
        setField(term123269, term123269.getClass(), "ui", null);
        setField(term123269, term123269.getClass(), "listenerList", null);
        setField(term123269, term123269.getClass(), "clientProperties", null);
        setField(term123269, term123269.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term123269, term123269.getClass(), "autoscrolls", false);
        setField(term123269, term123269.getClass(), "border", null);
        setIntField(term123269, term123269.getClass(), "flags", 0);
        setField(term123269, term123269.getClass(), "inputVerifier", null);
        setBooleanField(term123269, term123269.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term123269, term123269.getClass(), "paintingChild", null);
        setField(term123269, term123269.getClass(), "popupMenu", null);
        setField(term123269, term123269.getClass(), "revalidateRunnableScheduled", null);
        setField(term123269, term123269.getClass(), "focusInputMap", null);
        setField(term123269, term123269.getClass(), "ancestorInputMap", null);
        setField(term123269, term123269.getClass(), "windowInputMap", null);
        setField(term123269, term123269.getClass(), "actionMap", null);
        setField(term123269, term123269.getClass(), "aaHint", null);
        setField(term123269, term123269.getClass(), "lcdRenderingHint", null);
        setField(term123269, term123269.getClass(), "component", null);
        setField(term123269, term123269.getClass(), "layoutMgr", null);
        setField(term123269, term123269.getClass(), "dispatcher", null);
        setField(term123269, term123269.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term123269, term123269.getClass(), "focusCycleRoot", false);
        setBooleanField(term123269, term123269.getClass(), "focusTraversalPolicyProvider", false);
        setField(term123269, term123269.getClass(), "printingThreads", null);
        setBooleanField(term123269, term123269.getClass(), "printing", false);
        setField(term123269, term123269.getClass(), "containerListener", null);
        setIntField(term123269, term123269.getClass(), "listeningChildren", 0);
        setIntField(term123269, term123269.getClass(), "listeningBoundsChildren", 0);
        setIntField(term123269, term123269.getClass(), "descendantsCount", 0);
        setField(term123269, term123269.getClass(), "preserveBackgroundColor", null);
        setIntField(term123269, term123269.getClass(), "numOfHWComponents", 0);
        setIntField(term123269, term123269.getClass(), "numOfLWComponents", 0);
        setField(term123269, term123269.getClass(), "modalComp", null);
        setField(term123269, term123269.getClass(), "modalAppContext", null);
        setIntField(term123269, term123269.getClass(), "containerSerializedDataVersion", 0);
        setField(term123269, term123269.getClass(), "peer", null);
        setField(term123269, term123269.getClass(), "parent", null);
        setField(term123269, term123269.getClass(), "appContext", null);
        setIntField(term123269, term123269.getClass(), "x", 0);
        setIntField(term123269, term123269.getClass(), "y", 0);
        setIntField(term123269, term123269.getClass(), "width", 0);
        setIntField(term123269, term123269.getClass(), "height", 0);
        setField(term123269, term123269.getClass(), "foreground", null);
        setField(term123269, term123269.getClass(), "background", null);
        setField(term123269, term123269.getClass(), "font", null);
        setField(term123269, term123269.getClass(), "peerFont", null);
        setField(term123269, term123269.getClass(), "cursor", null);
        setField(term123269, term123269.getClass(), "locale", null);
        setField(term123269, term123269.getClass(), "graphicsConfig", null);
        setField(term123269, term123269.getClass(), "bufferStrategy", null);
        setBooleanField(term123269, term123269.getClass(), "ignoreRepaint", false);
        setBooleanField(term123269, term123269.getClass(), "visible", false);
        setBooleanField(term123269, term123269.getClass(), "enabled", false);
        setBooleanField(term123269, term123269.getClass(), "valid", false);
        setField(term123269, term123269.getClass(), "dropTarget", null);
        setField(term123269, term123269.getClass(), "popups", null);
        setField(term123269, term123269.getClass(), "name", null);
        setBooleanField(term123269, term123269.getClass(), "nameExplicitlySet", false);
        setBooleanField(term123269, term123269.getClass(), "focusable", false);
        setIntField(term123269, term123269.getClass(), "isFocusTraversableOverridden", 0);
        setField(term123269, term123269.getClass(), "focusTraversalKeys", null);
        setBooleanField(term123269, term123269.getClass(), "focusTraversalKeysEnabled", false);
        setField(term123269, term123269.getClass(), "acc", null);
        setField(term123269, term123269.getClass(), "minSize", null);
        setBooleanField(term123269, term123269.getClass(), "minSizeSet", false);
        setField(term123269, term123269.getClass(), "prefSize", null);
        setBooleanField(term123269, term123269.getClass(), "prefSizeSet", false);
        setField(term123269, term123269.getClass(), "maxSize", null);
        setBooleanField(term123269, term123269.getClass(), "maxSizeSet", false);
        setField(term123269, term123269.getClass(), "componentOrientation", null);
        setBooleanField(term123269, term123269.getClass(), "newEventsOnly", false);
        setField(term123269, term123269.getClass(), "componentListener", null);
        setField(term123269, term123269.getClass(), "focusListener", null);
        setField(term123269, term123269.getClass(), "hierarchyListener", null);
        setField(term123269, term123269.getClass(), "hierarchyBoundsListener", null);
        setField(term123269, term123269.getClass(), "keyListener", null);
        setField(term123269, term123269.getClass(), "mouseListener", null);
        setField(term123269, term123269.getClass(), "mouseMotionListener", null);
        setField(term123269, term123269.getClass(), "mouseWheelListener", null);
        setField(term123269, term123269.getClass(), "inputMethodListener", null);
        setLongField(term123269, term123269.getClass(), "eventMask", 0L);
        setField(term123269, term123269.getClass(), "changeSupport", null);
        setField(term123269, term123269.getClass(), "objectLock", null);
        setBooleanField(term123269, term123269.getClass(), "isPacked", false);
        setIntField(term123269, term123269.getClass(), "boundsOp", 0);
        setField(term123269, term123269.getClass(), "compoundShape", null);
        setField(term123269, term123269.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term123269, term123269.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term123269, term123269.getClass(), "backgroundEraseDisabled", false);
        setField(term123269, term123269.getClass(), "eventCache", null);
        setBooleanField(term123269, term123269.getClass(), "coalescingEnabled", false);
        setBooleanField(term123269, term123269.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term123269, term123269.getClass(), "componentSerializedDataVersion", 0);
        setField(term123269, term123269.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Graphics");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "drawTextArea", argTypes, term123269, args);
    }

};


