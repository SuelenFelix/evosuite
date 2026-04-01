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

public class PlanetListView_getRealm_20201092179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term417709;

    public PlanetListView_getRealm_20201092179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term417709 = newInstance(Class.forName("org.openRealmOfStars.game.state.PlanetListView"));
        setField(term417709, term417709.getClass(), "planets", null);
        setField(term417709, term417709.getClass(), "freePlanets", null);
        setField(term417709, term417709.getClass(), "planetInfo", null);
        setField(term417709, term417709.getClass(), "info", null);
        setField(term417709, term417709.getClass(), "map", null);
        setBooleanField(term417709, term417709.getClass(), "isAlignmentXSet", false);
        setFloatField(term417709, term417709.getClass(), "alignmentX", 0.0F);
        setBooleanField(term417709, term417709.getClass(), "isAlignmentYSet", false);
        setFloatField(term417709, term417709.getClass(), "alignmentY", 0.0F);
        setField(term417709, term417709.getClass(), "ui", null);
        setField(term417709, term417709.getClass(), "listenerList", null);
        setField(term417709, term417709.getClass(), "clientProperties", null);
        setField(term417709, term417709.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term417709, term417709.getClass(), "autoscrolls", false);
        setField(term417709, term417709.getClass(), "border", null);
        setIntField(term417709, term417709.getClass(), "flags", 0);
        setField(term417709, term417709.getClass(), "inputVerifier", null);
        setBooleanField(term417709, term417709.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term417709, term417709.getClass(), "paintingChild", null);
        setField(term417709, term417709.getClass(), "popupMenu", null);
        setField(term417709, term417709.getClass(), "revalidateRunnableScheduled", null);
        setField(term417709, term417709.getClass(), "focusInputMap", null);
        setField(term417709, term417709.getClass(), "ancestorInputMap", null);
        setField(term417709, term417709.getClass(), "windowInputMap", null);
        setField(term417709, term417709.getClass(), "actionMap", null);
        setField(term417709, term417709.getClass(), "aaHint", null);
        setField(term417709, term417709.getClass(), "lcdRenderingHint", null);
        setField(term417709, term417709.getClass(), "component", null);
        setField(term417709, term417709.getClass(), "layoutMgr", null);
        setField(term417709, term417709.getClass(), "dispatcher", null);
        setField(term417709, term417709.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term417709, term417709.getClass(), "focusCycleRoot", false);
        setBooleanField(term417709, term417709.getClass(), "focusTraversalPolicyProvider", false);
        setField(term417709, term417709.getClass(), "printingThreads", null);
        setBooleanField(term417709, term417709.getClass(), "printing", false);
        setField(term417709, term417709.getClass(), "containerListener", null);
        setIntField(term417709, term417709.getClass(), "listeningChildren", 0);
        setIntField(term417709, term417709.getClass(), "listeningBoundsChildren", 0);
        setIntField(term417709, term417709.getClass(), "descendantsCount", 0);
        setField(term417709, term417709.getClass(), "preserveBackgroundColor", null);
        setIntField(term417709, term417709.getClass(), "numOfHWComponents", 0);
        setIntField(term417709, term417709.getClass(), "numOfLWComponents", 0);
        setField(term417709, term417709.getClass(), "modalComp", null);
        setField(term417709, term417709.getClass(), "modalAppContext", null);
        setIntField(term417709, term417709.getClass(), "containerSerializedDataVersion", 0);
        setField(term417709, term417709.getClass(), "peer", null);
        setField(term417709, term417709.getClass(), "parent", null);
        setField(term417709, term417709.getClass(), "appContext", null);
        setIntField(term417709, term417709.getClass(), "x", 0);
        setIntField(term417709, term417709.getClass(), "y", 0);
        setIntField(term417709, term417709.getClass(), "width", 0);
        setIntField(term417709, term417709.getClass(), "height", 0);
        setField(term417709, term417709.getClass(), "foreground", null);
        setField(term417709, term417709.getClass(), "background", null);
        setField(term417709, term417709.getClass(), "font", null);
        setField(term417709, term417709.getClass(), "peerFont", null);
        setField(term417709, term417709.getClass(), "cursor", null);
        setField(term417709, term417709.getClass(), "locale", null);
        setField(term417709, term417709.getClass(), "graphicsConfig", null);
        setField(term417709, term417709.getClass(), "bufferStrategy", null);
        setBooleanField(term417709, term417709.getClass(), "ignoreRepaint", false);
        setBooleanField(term417709, term417709.getClass(), "visible", false);
        setBooleanField(term417709, term417709.getClass(), "enabled", false);
        setBooleanField(term417709, term417709.getClass(), "valid", false);
        setField(term417709, term417709.getClass(), "dropTarget", null);
        setField(term417709, term417709.getClass(), "popups", null);
        setField(term417709, term417709.getClass(), "name", null);
        setBooleanField(term417709, term417709.getClass(), "nameExplicitlySet", false);
        setBooleanField(term417709, term417709.getClass(), "focusable", false);
        setIntField(term417709, term417709.getClass(), "isFocusTraversableOverridden", 0);
        setField(term417709, term417709.getClass(), "focusTraversalKeys", null);
        setBooleanField(term417709, term417709.getClass(), "focusTraversalKeysEnabled", false);
        setField(term417709, term417709.getClass(), "acc", null);
        setField(term417709, term417709.getClass(), "minSize", null);
        setBooleanField(term417709, term417709.getClass(), "minSizeSet", false);
        setField(term417709, term417709.getClass(), "prefSize", null);
        setBooleanField(term417709, term417709.getClass(), "prefSizeSet", false);
        setField(term417709, term417709.getClass(), "maxSize", null);
        setBooleanField(term417709, term417709.getClass(), "maxSizeSet", false);
        setField(term417709, term417709.getClass(), "componentOrientation", null);
        setBooleanField(term417709, term417709.getClass(), "newEventsOnly", false);
        setField(term417709, term417709.getClass(), "componentListener", null);
        setField(term417709, term417709.getClass(), "focusListener", null);
        setField(term417709, term417709.getClass(), "hierarchyListener", null);
        setField(term417709, term417709.getClass(), "hierarchyBoundsListener", null);
        setField(term417709, term417709.getClass(), "keyListener", null);
        setField(term417709, term417709.getClass(), "mouseListener", null);
        setField(term417709, term417709.getClass(), "mouseMotionListener", null);
        setField(term417709, term417709.getClass(), "mouseWheelListener", null);
        setField(term417709, term417709.getClass(), "inputMethodListener", null);
        setLongField(term417709, term417709.getClass(), "eventMask", 0L);
        setField(term417709, term417709.getClass(), "changeSupport", null);
        setField(term417709, term417709.getClass(), "objectLock", null);
        setBooleanField(term417709, term417709.getClass(), "isPacked", false);
        setIntField(term417709, term417709.getClass(), "boundsOp", 0);
        setField(term417709, term417709.getClass(), "compoundShape", null);
        setField(term417709, term417709.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term417709, term417709.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term417709, term417709.getClass(), "backgroundEraseDisabled", false);
        setField(term417709, term417709.getClass(), "eventCache", null);
        setBooleanField(term417709, term417709.getClass(), "coalescingEnabled", false);
        setBooleanField(term417709, term417709.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term417709, term417709.getClass(), "componentSerializedDataVersion", 0);
        setField(term417709, term417709.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.PlanetListView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRealm", argTypes, term417709, args);
    }

};


