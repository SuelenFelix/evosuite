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

public class BigImagePanel_setPlayer_139657779011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85033;

    public BigImagePanel_setPlayer_139657779011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85033 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel"));
        setField(term85033, term85033.getClass(), "backgroundImg", null);
        setField(term85033, term85033.getClass(), "northPlanetImg", null);
        setField(term85033, term85033.getClass(), "southPlanetImg", null);
        setField(term85033, term85033.getClass(), "westPlanetImg", null);
        setField(term85033, term85033.getClass(), "eastPlanetImg", null);
        setField(term85033, term85033.getClass(), "shipImages", null);
        setBooleanField(term85033, term85033.getClass(), "drawStarField", false);
        setField(term85033, term85033.getClass(), "planet", null);
        setField(term85033, term85033.getClass(), "title", null);
        setField(term85033, term85033.getClass(), "animation", null);
        setField(term85033, term85033.getClass(), "player", null);
        setField(term85033, term85033.getClass(), "textInformation", null);
        setDoubleField(term85033, term85033.getClass(), "orbitalX", 0.0);
        setDoubleField(term85033, term85033.getClass(), "orbitalZ", 0.0);
        setIntField(term85033, term85033.getClass(), "orbitalY", 0);
        setDoubleField(term85033, term85033.getClass(), "orbitalAngle", 0.0);
        setField(term85033, term85033.getClass(), "customOrbital", null);
        setBooleanField(term85033, term85033.getClass(), "textInMiddle", false);
        setBooleanField(term85033, term85033.getClass(), "isAlignmentXSet", false);
        setFloatField(term85033, term85033.getClass(), "alignmentX", 0.0F);
        setBooleanField(term85033, term85033.getClass(), "isAlignmentYSet", false);
        setFloatField(term85033, term85033.getClass(), "alignmentY", 0.0F);
        setField(term85033, term85033.getClass(), "ui", null);
        setField(term85033, term85033.getClass(), "listenerList", null);
        setField(term85033, term85033.getClass(), "clientProperties", null);
        setField(term85033, term85033.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term85033, term85033.getClass(), "autoscrolls", false);
        setField(term85033, term85033.getClass(), "border", null);
        setIntField(term85033, term85033.getClass(), "flags", 0);
        setField(term85033, term85033.getClass(), "inputVerifier", null);
        setBooleanField(term85033, term85033.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term85033, term85033.getClass(), "paintingChild", null);
        setField(term85033, term85033.getClass(), "popupMenu", null);
        setField(term85033, term85033.getClass(), "revalidateRunnableScheduled", null);
        setField(term85033, term85033.getClass(), "focusInputMap", null);
        setField(term85033, term85033.getClass(), "ancestorInputMap", null);
        setField(term85033, term85033.getClass(), "windowInputMap", null);
        setField(term85033, term85033.getClass(), "actionMap", null);
        setField(term85033, term85033.getClass(), "aaHint", null);
        setField(term85033, term85033.getClass(), "lcdRenderingHint", null);
        setField(term85033, term85033.getClass(), "component", null);
        setField(term85033, term85033.getClass(), "layoutMgr", null);
        setField(term85033, term85033.getClass(), "dispatcher", null);
        setField(term85033, term85033.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term85033, term85033.getClass(), "focusCycleRoot", false);
        setBooleanField(term85033, term85033.getClass(), "focusTraversalPolicyProvider", false);
        setField(term85033, term85033.getClass(), "printingThreads", null);
        setBooleanField(term85033, term85033.getClass(), "printing", false);
        setField(term85033, term85033.getClass(), "containerListener", null);
        setIntField(term85033, term85033.getClass(), "listeningChildren", 0);
        setIntField(term85033, term85033.getClass(), "listeningBoundsChildren", 0);
        setIntField(term85033, term85033.getClass(), "descendantsCount", 0);
        setField(term85033, term85033.getClass(), "preserveBackgroundColor", null);
        setIntField(term85033, term85033.getClass(), "numOfHWComponents", 0);
        setIntField(term85033, term85033.getClass(), "numOfLWComponents", 0);
        setField(term85033, term85033.getClass(), "modalComp", null);
        setField(term85033, term85033.getClass(), "modalAppContext", null);
        setIntField(term85033, term85033.getClass(), "containerSerializedDataVersion", 0);
        setField(term85033, term85033.getClass(), "peer", null);
        setField(term85033, term85033.getClass(), "parent", null);
        setField(term85033, term85033.getClass(), "appContext", null);
        setIntField(term85033, term85033.getClass(), "x", 0);
        setIntField(term85033, term85033.getClass(), "y", 0);
        setIntField(term85033, term85033.getClass(), "width", 0);
        setIntField(term85033, term85033.getClass(), "height", 0);
        setField(term85033, term85033.getClass(), "foreground", null);
        setField(term85033, term85033.getClass(), "background", null);
        setField(term85033, term85033.getClass(), "font", null);
        setField(term85033, term85033.getClass(), "peerFont", null);
        setField(term85033, term85033.getClass(), "cursor", null);
        setField(term85033, term85033.getClass(), "locale", null);
        setField(term85033, term85033.getClass(), "graphicsConfig", null);
        setField(term85033, term85033.getClass(), "bufferStrategy", null);
        setBooleanField(term85033, term85033.getClass(), "ignoreRepaint", false);
        setBooleanField(term85033, term85033.getClass(), "visible", false);
        setBooleanField(term85033, term85033.getClass(), "enabled", false);
        setBooleanField(term85033, term85033.getClass(), "valid", false);
        setField(term85033, term85033.getClass(), "dropTarget", null);
        setField(term85033, term85033.getClass(), "popups", null);
        setField(term85033, term85033.getClass(), "name", null);
        setBooleanField(term85033, term85033.getClass(), "nameExplicitlySet", false);
        setBooleanField(term85033, term85033.getClass(), "focusable", false);
        setIntField(term85033, term85033.getClass(), "isFocusTraversableOverridden", 0);
        setField(term85033, term85033.getClass(), "focusTraversalKeys", null);
        setBooleanField(term85033, term85033.getClass(), "focusTraversalKeysEnabled", false);
        setField(term85033, term85033.getClass(), "acc", null);
        setField(term85033, term85033.getClass(), "minSize", null);
        setBooleanField(term85033, term85033.getClass(), "minSizeSet", false);
        setField(term85033, term85033.getClass(), "prefSize", null);
        setBooleanField(term85033, term85033.getClass(), "prefSizeSet", false);
        setField(term85033, term85033.getClass(), "maxSize", null);
        setBooleanField(term85033, term85033.getClass(), "maxSizeSet", false);
        setField(term85033, term85033.getClass(), "componentOrientation", null);
        setBooleanField(term85033, term85033.getClass(), "newEventsOnly", false);
        setField(term85033, term85033.getClass(), "componentListener", null);
        setField(term85033, term85033.getClass(), "focusListener", null);
        setField(term85033, term85033.getClass(), "hierarchyListener", null);
        setField(term85033, term85033.getClass(), "hierarchyBoundsListener", null);
        setField(term85033, term85033.getClass(), "keyListener", null);
        setField(term85033, term85033.getClass(), "mouseListener", null);
        setField(term85033, term85033.getClass(), "mouseMotionListener", null);
        setField(term85033, term85033.getClass(), "mouseWheelListener", null);
        setField(term85033, term85033.getClass(), "inputMethodListener", null);
        setLongField(term85033, term85033.getClass(), "eventMask", 0L);
        setField(term85033, term85033.getClass(), "changeSupport", null);
        setField(term85033, term85033.getClass(), "objectLock", null);
        setBooleanField(term85033, term85033.getClass(), "isPacked", false);
        setIntField(term85033, term85033.getClass(), "boundsOp", 0);
        setField(term85033, term85033.getClass(), "compoundShape", null);
        setField(term85033, term85033.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term85033, term85033.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term85033, term85033.getClass(), "backgroundEraseDisabled", false);
        setField(term85033, term85033.getClass(), "eventCache", null);
        setBooleanField(term85033, term85033.getClass(), "coalescingEnabled", false);
        setBooleanField(term85033, term85033.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term85033, term85033.getClass(), "componentSerializedDataVersion", 0);
        setField(term85033, term85033.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.BigImagePanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlayer", argTypes, term85033, args);
    }

};


