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

public class ShipInteriorPanel_setRace_10132326297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238077;

    public ShipInteriorPanel_setRace_10132326297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term238077 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.ShipInteriorPanel"));
        setField(term238077, term238077.getClass(), "race", null);
        setField(term238077, term238077.getClass(), "planetImage", null);
        setIntField(term238077, term238077.getClass(), "x", 0);
        setIntField(term238077, term238077.getClass(), "speed", 0);
        setIntField(term238077, term238077.getClass(), "offsetX", 0);
        setIntField(term238077, term238077.getClass(), "offsetY", 0);
        setIntField(term238077, term238077.getClass(), "glitchLine", 0);
        setBooleanField(term238077, term238077.getClass(), "isAlignmentXSet", false);
        setFloatField(term238077, term238077.getClass(), "alignmentX", 0.0F);
        setBooleanField(term238077, term238077.getClass(), "isAlignmentYSet", false);
        setFloatField(term238077, term238077.getClass(), "alignmentY", 0.0F);
        setField(term238077, term238077.getClass(), "ui", null);
        setField(term238077, term238077.getClass(), "listenerList", null);
        setField(term238077, term238077.getClass(), "clientProperties", null);
        setField(term238077, term238077.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term238077, term238077.getClass(), "autoscrolls", false);
        setField(term238077, term238077.getClass(), "border", null);
        setIntField(term238077, term238077.getClass(), "flags", 0);
        setField(term238077, term238077.getClass(), "inputVerifier", null);
        setBooleanField(term238077, term238077.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term238077, term238077.getClass(), "paintingChild", null);
        setField(term238077, term238077.getClass(), "popupMenu", null);
        setField(term238077, term238077.getClass(), "revalidateRunnableScheduled", null);
        setField(term238077, term238077.getClass(), "focusInputMap", null);
        setField(term238077, term238077.getClass(), "ancestorInputMap", null);
        setField(term238077, term238077.getClass(), "windowInputMap", null);
        setField(term238077, term238077.getClass(), "actionMap", null);
        setField(term238077, term238077.getClass(), "aaHint", null);
        setField(term238077, term238077.getClass(), "lcdRenderingHint", null);
        setField(term238077, term238077.getClass(), "component", null);
        setField(term238077, term238077.getClass(), "layoutMgr", null);
        setField(term238077, term238077.getClass(), "dispatcher", null);
        setField(term238077, term238077.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term238077, term238077.getClass(), "focusCycleRoot", false);
        setBooleanField(term238077, term238077.getClass(), "focusTraversalPolicyProvider", false);
        setField(term238077, term238077.getClass(), "printingThreads", null);
        setBooleanField(term238077, term238077.getClass(), "printing", false);
        setField(term238077, term238077.getClass(), "containerListener", null);
        setIntField(term238077, term238077.getClass(), "listeningChildren", 0);
        setIntField(term238077, term238077.getClass(), "listeningBoundsChildren", 0);
        setIntField(term238077, term238077.getClass(), "descendantsCount", 0);
        setField(term238077, term238077.getClass(), "preserveBackgroundColor", null);
        setIntField(term238077, term238077.getClass(), "numOfHWComponents", 0);
        setIntField(term238077, term238077.getClass(), "numOfLWComponents", 0);
        setField(term238077, term238077.getClass(), "modalComp", null);
        setField(term238077, term238077.getClass(), "modalAppContext", null);
        setIntField(term238077, term238077.getClass(), "containerSerializedDataVersion", 0);
        setField(term238077, term238077.getClass(), "peer", null);
        setField(term238077, term238077.getClass(), "parent", null);
        setField(term238077, term238077.getClass(), "appContext", null);
        setIntField(term238077, term238077.getClass(), "y", 0);
        setIntField(term238077, term238077.getClass(), "width", 0);
        setIntField(term238077, term238077.getClass(), "height", 0);
        setField(term238077, term238077.getClass(), "foreground", null);
        setField(term238077, term238077.getClass(), "background", null);
        setField(term238077, term238077.getClass(), "font", null);
        setField(term238077, term238077.getClass(), "peerFont", null);
        setField(term238077, term238077.getClass(), "cursor", null);
        setField(term238077, term238077.getClass(), "locale", null);
        setField(term238077, term238077.getClass(), "graphicsConfig", null);
        setField(term238077, term238077.getClass(), "bufferStrategy", null);
        setBooleanField(term238077, term238077.getClass(), "ignoreRepaint", false);
        setBooleanField(term238077, term238077.getClass(), "visible", false);
        setBooleanField(term238077, term238077.getClass(), "enabled", false);
        setBooleanField(term238077, term238077.getClass(), "valid", false);
        setField(term238077, term238077.getClass(), "dropTarget", null);
        setField(term238077, term238077.getClass(), "popups", null);
        setField(term238077, term238077.getClass(), "name", null);
        setBooleanField(term238077, term238077.getClass(), "nameExplicitlySet", false);
        setBooleanField(term238077, term238077.getClass(), "focusable", false);
        setIntField(term238077, term238077.getClass(), "isFocusTraversableOverridden", 0);
        setField(term238077, term238077.getClass(), "focusTraversalKeys", null);
        setBooleanField(term238077, term238077.getClass(), "focusTraversalKeysEnabled", false);
        setField(term238077, term238077.getClass(), "acc", null);
        setField(term238077, term238077.getClass(), "minSize", null);
        setBooleanField(term238077, term238077.getClass(), "minSizeSet", false);
        setField(term238077, term238077.getClass(), "prefSize", null);
        setBooleanField(term238077, term238077.getClass(), "prefSizeSet", false);
        setField(term238077, term238077.getClass(), "maxSize", null);
        setBooleanField(term238077, term238077.getClass(), "maxSizeSet", false);
        setField(term238077, term238077.getClass(), "componentOrientation", null);
        setBooleanField(term238077, term238077.getClass(), "newEventsOnly", false);
        setField(term238077, term238077.getClass(), "componentListener", null);
        setField(term238077, term238077.getClass(), "focusListener", null);
        setField(term238077, term238077.getClass(), "hierarchyListener", null);
        setField(term238077, term238077.getClass(), "hierarchyBoundsListener", null);
        setField(term238077, term238077.getClass(), "keyListener", null);
        setField(term238077, term238077.getClass(), "mouseListener", null);
        setField(term238077, term238077.getClass(), "mouseMotionListener", null);
        setField(term238077, term238077.getClass(), "mouseWheelListener", null);
        setField(term238077, term238077.getClass(), "inputMethodListener", null);
        setLongField(term238077, term238077.getClass(), "eventMask", 0L);
        setField(term238077, term238077.getClass(), "changeSupport", null);
        setField(term238077, term238077.getClass(), "objectLock", null);
        setBooleanField(term238077, term238077.getClass(), "isPacked", false);
        setIntField(term238077, term238077.getClass(), "boundsOp", 0);
        setField(term238077, term238077.getClass(), "compoundShape", null);
        setField(term238077, term238077.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term238077, term238077.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term238077, term238077.getClass(), "backgroundEraseDisabled", false);
        setField(term238077, term238077.getClass(), "eventCache", null);
        setBooleanField(term238077, term238077.getClass(), "coalescingEnabled", false);
        setBooleanField(term238077, term238077.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term238077, term238077.getClass(), "componentSerializedDataVersion", 0);
        setField(term238077, term238077.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.ShipInteriorPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.race.SpaceRace");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRace", argTypes, term238077, args);
    }

};


