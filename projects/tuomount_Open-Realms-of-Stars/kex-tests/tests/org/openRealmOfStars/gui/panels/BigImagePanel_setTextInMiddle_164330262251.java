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

public class BigImagePanel_setTextInMiddle_164330262251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124072;
     Object term124119;

    public BigImagePanel_setTextInMiddle_164330262251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124072 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel"));
        setField(term124072, term124072.getClass(), "backgroundImg", null);
        setField(term124072, term124072.getClass(), "northPlanetImg", null);
        setField(term124072, term124072.getClass(), "southPlanetImg", null);
        setField(term124072, term124072.getClass(), "westPlanetImg", null);
        setField(term124072, term124072.getClass(), "eastPlanetImg", null);
        setField(term124072, term124072.getClass(), "shipImages", null);
        setBooleanField(term124072, term124072.getClass(), "drawStarField", false);
        setField(term124072, term124072.getClass(), "planet", null);
        setField(term124072, term124072.getClass(), "title", null);
        setField(term124072, term124072.getClass(), "animation", null);
        setField(term124072, term124072.getClass(), "player", null);
        setField(term124072, term124072.getClass(), "textInformation", null);
        setDoubleField(term124072, term124072.getClass(), "orbitalX", 0.0);
        setDoubleField(term124072, term124072.getClass(), "orbitalZ", 0.0);
        setIntField(term124072, term124072.getClass(), "orbitalY", 0);
        setDoubleField(term124072, term124072.getClass(), "orbitalAngle", 0.0);
        setField(term124072, term124072.getClass(), "customOrbital", null);
        setBooleanField(term124072, term124072.getClass(), "textInMiddle", false);
        setBooleanField(term124072, term124072.getClass(), "isAlignmentXSet", false);
        setFloatField(term124072, term124072.getClass(), "alignmentX", 0.0F);
        setBooleanField(term124072, term124072.getClass(), "isAlignmentYSet", false);
        setFloatField(term124072, term124072.getClass(), "alignmentY", 0.0F);
        setField(term124072, term124072.getClass(), "ui", null);
        setField(term124072, term124072.getClass(), "listenerList", null);
        setField(term124072, term124072.getClass(), "clientProperties", null);
        setField(term124072, term124072.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term124072, term124072.getClass(), "autoscrolls", false);
        setField(term124072, term124072.getClass(), "border", null);
        setIntField(term124072, term124072.getClass(), "flags", 0);
        setField(term124072, term124072.getClass(), "inputVerifier", null);
        setBooleanField(term124072, term124072.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term124072, term124072.getClass(), "paintingChild", null);
        setField(term124072, term124072.getClass(), "popupMenu", null);
        setField(term124072, term124072.getClass(), "revalidateRunnableScheduled", null);
        setField(term124072, term124072.getClass(), "focusInputMap", null);
        setField(term124072, term124072.getClass(), "ancestorInputMap", null);
        setField(term124072, term124072.getClass(), "windowInputMap", null);
        setField(term124072, term124072.getClass(), "actionMap", null);
        setField(term124072, term124072.getClass(), "aaHint", null);
        setField(term124072, term124072.getClass(), "lcdRenderingHint", null);
        setField(term124072, term124072.getClass(), "component", null);
        setField(term124072, term124072.getClass(), "layoutMgr", null);
        setField(term124072, term124072.getClass(), "dispatcher", null);
        setField(term124072, term124072.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term124072, term124072.getClass(), "focusCycleRoot", false);
        setBooleanField(term124072, term124072.getClass(), "focusTraversalPolicyProvider", false);
        setField(term124072, term124072.getClass(), "printingThreads", null);
        setBooleanField(term124072, term124072.getClass(), "printing", false);
        setField(term124072, term124072.getClass(), "containerListener", null);
        setIntField(term124072, term124072.getClass(), "listeningChildren", 0);
        setIntField(term124072, term124072.getClass(), "listeningBoundsChildren", 0);
        setIntField(term124072, term124072.getClass(), "descendantsCount", 0);
        setField(term124072, term124072.getClass(), "preserveBackgroundColor", null);
        setIntField(term124072, term124072.getClass(), "numOfHWComponents", 0);
        setIntField(term124072, term124072.getClass(), "numOfLWComponents", 0);
        setField(term124072, term124072.getClass(), "modalComp", null);
        setField(term124072, term124072.getClass(), "modalAppContext", null);
        setIntField(term124072, term124072.getClass(), "containerSerializedDataVersion", 0);
        setField(term124072, term124072.getClass(), "peer", null);
        setField(term124072, term124072.getClass(), "parent", null);
        setField(term124072, term124072.getClass(), "appContext", null);
        setIntField(term124072, term124072.getClass(), "x", 0);
        setIntField(term124072, term124072.getClass(), "y", 0);
        setIntField(term124072, term124072.getClass(), "width", 0);
        setIntField(term124072, term124072.getClass(), "height", 0);
        setField(term124072, term124072.getClass(), "foreground", null);
        setField(term124072, term124072.getClass(), "background", null);
        setField(term124072, term124072.getClass(), "font", null);
        setField(term124072, term124072.getClass(), "peerFont", null);
        setField(term124072, term124072.getClass(), "cursor", null);
        setField(term124072, term124072.getClass(), "locale", null);
        setField(term124072, term124072.getClass(), "graphicsConfig", null);
        setField(term124072, term124072.getClass(), "bufferStrategy", null);
        setBooleanField(term124072, term124072.getClass(), "ignoreRepaint", false);
        setBooleanField(term124072, term124072.getClass(), "visible", false);
        setBooleanField(term124072, term124072.getClass(), "enabled", false);
        setBooleanField(term124072, term124072.getClass(), "valid", false);
        setField(term124072, term124072.getClass(), "dropTarget", null);
        setField(term124072, term124072.getClass(), "popups", null);
        setField(term124072, term124072.getClass(), "name", null);
        setBooleanField(term124072, term124072.getClass(), "nameExplicitlySet", false);
        setBooleanField(term124072, term124072.getClass(), "focusable", false);
        setIntField(term124072, term124072.getClass(), "isFocusTraversableOverridden", 0);
        setField(term124072, term124072.getClass(), "focusTraversalKeys", null);
        setBooleanField(term124072, term124072.getClass(), "focusTraversalKeysEnabled", false);
        setField(term124072, term124072.getClass(), "acc", null);
        setField(term124072, term124072.getClass(), "minSize", null);
        setBooleanField(term124072, term124072.getClass(), "minSizeSet", false);
        setField(term124072, term124072.getClass(), "prefSize", null);
        setBooleanField(term124072, term124072.getClass(), "prefSizeSet", false);
        setField(term124072, term124072.getClass(), "maxSize", null);
        setBooleanField(term124072, term124072.getClass(), "maxSizeSet", false);
        setField(term124072, term124072.getClass(), "componentOrientation", null);
        setBooleanField(term124072, term124072.getClass(), "newEventsOnly", false);
        setField(term124072, term124072.getClass(), "componentListener", null);
        setField(term124072, term124072.getClass(), "focusListener", null);
        setField(term124072, term124072.getClass(), "hierarchyListener", null);
        setField(term124072, term124072.getClass(), "hierarchyBoundsListener", null);
        setField(term124072, term124072.getClass(), "keyListener", null);
        setField(term124072, term124072.getClass(), "mouseListener", null);
        setField(term124072, term124072.getClass(), "mouseMotionListener", null);
        setField(term124072, term124072.getClass(), "mouseWheelListener", null);
        setField(term124072, term124072.getClass(), "inputMethodListener", null);
        setLongField(term124072, term124072.getClass(), "eventMask", 0L);
        setField(term124072, term124072.getClass(), "changeSupport", null);
        setField(term124072, term124072.getClass(), "objectLock", null);
        setBooleanField(term124072, term124072.getClass(), "isPacked", false);
        setIntField(term124072, term124072.getClass(), "boundsOp", 0);
        setField(term124072, term124072.getClass(), "compoundShape", null);
        setField(term124072, term124072.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term124072, term124072.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term124072, term124072.getClass(), "backgroundEraseDisabled", false);
        setField(term124072, term124072.getClass(), "eventCache", null);
        setBooleanField(term124072, term124072.getClass(), "coalescingEnabled", false);
        setBooleanField(term124072, term124072.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term124072, term124072.getClass(), "componentSerializedDataVersion", 0);
        setField(term124072, term124072.getClass(), "accessibleContext", null);
        term124119 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term124119;
        callMethod(klass, "setTextInMiddle", argTypes, term124072, args);
    }

};


