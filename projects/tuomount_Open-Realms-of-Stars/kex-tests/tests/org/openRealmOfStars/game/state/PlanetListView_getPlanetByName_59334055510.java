package org.openRealmOfStars.game.state;

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
import static org.openRealmOfStars.game.state.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PlanetListView_getPlanetByName_59334055510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term417750;

    public PlanetListView_getPlanetByName_59334055510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term417750 = newInstance(Class.forName("org.openRealmOfStars.game.state.PlanetListView"));
        setField(term417750, term417750.getClass(), "planets", null);
        setField(term417750, term417750.getClass(), "freePlanets", null);
        setField(term417750, term417750.getClass(), "planetInfo", null);
        setField(term417750, term417750.getClass(), "info", null);
        setField(term417750, term417750.getClass(), "map", null);
        setBooleanField(term417750, term417750.getClass(), "isAlignmentXSet", false);
        setFloatField(term417750, term417750.getClass(), "alignmentX", 0.0F);
        setBooleanField(term417750, term417750.getClass(), "isAlignmentYSet", false);
        setFloatField(term417750, term417750.getClass(), "alignmentY", 0.0F);
        setField(term417750, term417750.getClass(), "ui", null);
        setField(term417750, term417750.getClass(), "listenerList", null);
        setField(term417750, term417750.getClass(), "clientProperties", null);
        setField(term417750, term417750.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term417750, term417750.getClass(), "autoscrolls", false);
        setField(term417750, term417750.getClass(), "border", null);
        setIntField(term417750, term417750.getClass(), "flags", 0);
        setField(term417750, term417750.getClass(), "inputVerifier", null);
        setBooleanField(term417750, term417750.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term417750, term417750.getClass(), "paintingChild", null);
        setField(term417750, term417750.getClass(), "popupMenu", null);
        setField(term417750, term417750.getClass(), "revalidateRunnableScheduled", null);
        setField(term417750, term417750.getClass(), "focusInputMap", null);
        setField(term417750, term417750.getClass(), "ancestorInputMap", null);
        setField(term417750, term417750.getClass(), "windowInputMap", null);
        setField(term417750, term417750.getClass(), "actionMap", null);
        setField(term417750, term417750.getClass(), "aaHint", null);
        setField(term417750, term417750.getClass(), "lcdRenderingHint", null);
        setField(term417750, term417750.getClass(), "component", null);
        setField(term417750, term417750.getClass(), "layoutMgr", null);
        setField(term417750, term417750.getClass(), "dispatcher", null);
        setField(term417750, term417750.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term417750, term417750.getClass(), "focusCycleRoot", false);
        setBooleanField(term417750, term417750.getClass(), "focusTraversalPolicyProvider", false);
        setField(term417750, term417750.getClass(), "printingThreads", null);
        setBooleanField(term417750, term417750.getClass(), "printing", false);
        setField(term417750, term417750.getClass(), "containerListener", null);
        setIntField(term417750, term417750.getClass(), "listeningChildren", 0);
        setIntField(term417750, term417750.getClass(), "listeningBoundsChildren", 0);
        setIntField(term417750, term417750.getClass(), "descendantsCount", 0);
        setField(term417750, term417750.getClass(), "preserveBackgroundColor", null);
        setIntField(term417750, term417750.getClass(), "numOfHWComponents", 0);
        setIntField(term417750, term417750.getClass(), "numOfLWComponents", 0);
        setField(term417750, term417750.getClass(), "modalComp", null);
        setField(term417750, term417750.getClass(), "modalAppContext", null);
        setIntField(term417750, term417750.getClass(), "containerSerializedDataVersion", 0);
        setField(term417750, term417750.getClass(), "peer", null);
        setField(term417750, term417750.getClass(), "parent", null);
        setField(term417750, term417750.getClass(), "appContext", null);
        setIntField(term417750, term417750.getClass(), "x", 0);
        setIntField(term417750, term417750.getClass(), "y", 0);
        setIntField(term417750, term417750.getClass(), "width", 0);
        setIntField(term417750, term417750.getClass(), "height", 0);
        setField(term417750, term417750.getClass(), "foreground", null);
        setField(term417750, term417750.getClass(), "background", null);
        setField(term417750, term417750.getClass(), "font", null);
        setField(term417750, term417750.getClass(), "peerFont", null);
        setField(term417750, term417750.getClass(), "cursor", null);
        setField(term417750, term417750.getClass(), "locale", null);
        setField(term417750, term417750.getClass(), "graphicsConfig", null);
        setField(term417750, term417750.getClass(), "bufferStrategy", null);
        setBooleanField(term417750, term417750.getClass(), "ignoreRepaint", false);
        setBooleanField(term417750, term417750.getClass(), "visible", false);
        setBooleanField(term417750, term417750.getClass(), "enabled", false);
        setBooleanField(term417750, term417750.getClass(), "valid", false);
        setField(term417750, term417750.getClass(), "dropTarget", null);
        setField(term417750, term417750.getClass(), "popups", null);
        setField(term417750, term417750.getClass(), "name", null);
        setBooleanField(term417750, term417750.getClass(), "nameExplicitlySet", false);
        setBooleanField(term417750, term417750.getClass(), "focusable", false);
        setIntField(term417750, term417750.getClass(), "isFocusTraversableOverridden", 0);
        setField(term417750, term417750.getClass(), "focusTraversalKeys", null);
        setBooleanField(term417750, term417750.getClass(), "focusTraversalKeysEnabled", false);
        setField(term417750, term417750.getClass(), "acc", null);
        setField(term417750, term417750.getClass(), "minSize", null);
        setBooleanField(term417750, term417750.getClass(), "minSizeSet", false);
        setField(term417750, term417750.getClass(), "prefSize", null);
        setBooleanField(term417750, term417750.getClass(), "prefSizeSet", false);
        setField(term417750, term417750.getClass(), "maxSize", null);
        setBooleanField(term417750, term417750.getClass(), "maxSizeSet", false);
        setField(term417750, term417750.getClass(), "componentOrientation", null);
        setBooleanField(term417750, term417750.getClass(), "newEventsOnly", false);
        setField(term417750, term417750.getClass(), "componentListener", null);
        setField(term417750, term417750.getClass(), "focusListener", null);
        setField(term417750, term417750.getClass(), "hierarchyListener", null);
        setField(term417750, term417750.getClass(), "hierarchyBoundsListener", null);
        setField(term417750, term417750.getClass(), "keyListener", null);
        setField(term417750, term417750.getClass(), "mouseListener", null);
        setField(term417750, term417750.getClass(), "mouseMotionListener", null);
        setField(term417750, term417750.getClass(), "mouseWheelListener", null);
        setField(term417750, term417750.getClass(), "inputMethodListener", null);
        setLongField(term417750, term417750.getClass(), "eventMask", 0L);
        setField(term417750, term417750.getClass(), "changeSupport", null);
        setField(term417750, term417750.getClass(), "objectLock", null);
        setBooleanField(term417750, term417750.getClass(), "isPacked", false);
        setIntField(term417750, term417750.getClass(), "boundsOp", 0);
        setField(term417750, term417750.getClass(), "compoundShape", null);
        setField(term417750, term417750.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term417750, term417750.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term417750, term417750.getClass(), "backgroundEraseDisabled", false);
        setField(term417750, term417750.getClass(), "eventCache", null);
        setBooleanField(term417750, term417750.getClass(), "coalescingEnabled", false);
        setBooleanField(term417750, term417750.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term417750, term417750.getClass(), "componentSerializedDataVersion", 0);
        setField(term417750, term417750.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.PlanetListView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getPlanetByName", argTypes, term417750, args);
    }

};


