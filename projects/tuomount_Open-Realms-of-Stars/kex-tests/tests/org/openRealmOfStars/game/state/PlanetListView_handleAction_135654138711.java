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

public class PlanetListView_handleAction_135654138711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term417791;

    public PlanetListView_handleAction_135654138711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term417791 = newInstance(Class.forName("org.openRealmOfStars.game.state.PlanetListView"));
        setField(term417791, term417791.getClass(), "planets", null);
        setField(term417791, term417791.getClass(), "freePlanets", null);
        setField(term417791, term417791.getClass(), "planetInfo", null);
        setField(term417791, term417791.getClass(), "info", null);
        setField(term417791, term417791.getClass(), "map", null);
        setBooleanField(term417791, term417791.getClass(), "isAlignmentXSet", false);
        setFloatField(term417791, term417791.getClass(), "alignmentX", 0.0F);
        setBooleanField(term417791, term417791.getClass(), "isAlignmentYSet", false);
        setFloatField(term417791, term417791.getClass(), "alignmentY", 0.0F);
        setField(term417791, term417791.getClass(), "ui", null);
        setField(term417791, term417791.getClass(), "listenerList", null);
        setField(term417791, term417791.getClass(), "clientProperties", null);
        setField(term417791, term417791.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term417791, term417791.getClass(), "autoscrolls", false);
        setField(term417791, term417791.getClass(), "border", null);
        setIntField(term417791, term417791.getClass(), "flags", 0);
        setField(term417791, term417791.getClass(), "inputVerifier", null);
        setBooleanField(term417791, term417791.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term417791, term417791.getClass(), "paintingChild", null);
        setField(term417791, term417791.getClass(), "popupMenu", null);
        setField(term417791, term417791.getClass(), "revalidateRunnableScheduled", null);
        setField(term417791, term417791.getClass(), "focusInputMap", null);
        setField(term417791, term417791.getClass(), "ancestorInputMap", null);
        setField(term417791, term417791.getClass(), "windowInputMap", null);
        setField(term417791, term417791.getClass(), "actionMap", null);
        setField(term417791, term417791.getClass(), "aaHint", null);
        setField(term417791, term417791.getClass(), "lcdRenderingHint", null);
        setField(term417791, term417791.getClass(), "component", null);
        setField(term417791, term417791.getClass(), "layoutMgr", null);
        setField(term417791, term417791.getClass(), "dispatcher", null);
        setField(term417791, term417791.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term417791, term417791.getClass(), "focusCycleRoot", false);
        setBooleanField(term417791, term417791.getClass(), "focusTraversalPolicyProvider", false);
        setField(term417791, term417791.getClass(), "printingThreads", null);
        setBooleanField(term417791, term417791.getClass(), "printing", false);
        setField(term417791, term417791.getClass(), "containerListener", null);
        setIntField(term417791, term417791.getClass(), "listeningChildren", 0);
        setIntField(term417791, term417791.getClass(), "listeningBoundsChildren", 0);
        setIntField(term417791, term417791.getClass(), "descendantsCount", 0);
        setField(term417791, term417791.getClass(), "preserveBackgroundColor", null);
        setIntField(term417791, term417791.getClass(), "numOfHWComponents", 0);
        setIntField(term417791, term417791.getClass(), "numOfLWComponents", 0);
        setField(term417791, term417791.getClass(), "modalComp", null);
        setField(term417791, term417791.getClass(), "modalAppContext", null);
        setIntField(term417791, term417791.getClass(), "containerSerializedDataVersion", 0);
        setField(term417791, term417791.getClass(), "peer", null);
        setField(term417791, term417791.getClass(), "parent", null);
        setField(term417791, term417791.getClass(), "appContext", null);
        setIntField(term417791, term417791.getClass(), "x", 0);
        setIntField(term417791, term417791.getClass(), "y", 0);
        setIntField(term417791, term417791.getClass(), "width", 0);
        setIntField(term417791, term417791.getClass(), "height", 0);
        setField(term417791, term417791.getClass(), "foreground", null);
        setField(term417791, term417791.getClass(), "background", null);
        setField(term417791, term417791.getClass(), "font", null);
        setField(term417791, term417791.getClass(), "peerFont", null);
        setField(term417791, term417791.getClass(), "cursor", null);
        setField(term417791, term417791.getClass(), "locale", null);
        setField(term417791, term417791.getClass(), "graphicsConfig", null);
        setField(term417791, term417791.getClass(), "bufferStrategy", null);
        setBooleanField(term417791, term417791.getClass(), "ignoreRepaint", false);
        setBooleanField(term417791, term417791.getClass(), "visible", false);
        setBooleanField(term417791, term417791.getClass(), "enabled", false);
        setBooleanField(term417791, term417791.getClass(), "valid", false);
        setField(term417791, term417791.getClass(), "dropTarget", null);
        setField(term417791, term417791.getClass(), "popups", null);
        setField(term417791, term417791.getClass(), "name", null);
        setBooleanField(term417791, term417791.getClass(), "nameExplicitlySet", false);
        setBooleanField(term417791, term417791.getClass(), "focusable", false);
        setIntField(term417791, term417791.getClass(), "isFocusTraversableOverridden", 0);
        setField(term417791, term417791.getClass(), "focusTraversalKeys", null);
        setBooleanField(term417791, term417791.getClass(), "focusTraversalKeysEnabled", false);
        setField(term417791, term417791.getClass(), "acc", null);
        setField(term417791, term417791.getClass(), "minSize", null);
        setBooleanField(term417791, term417791.getClass(), "minSizeSet", false);
        setField(term417791, term417791.getClass(), "prefSize", null);
        setBooleanField(term417791, term417791.getClass(), "prefSizeSet", false);
        setField(term417791, term417791.getClass(), "maxSize", null);
        setBooleanField(term417791, term417791.getClass(), "maxSizeSet", false);
        setField(term417791, term417791.getClass(), "componentOrientation", null);
        setBooleanField(term417791, term417791.getClass(), "newEventsOnly", false);
        setField(term417791, term417791.getClass(), "componentListener", null);
        setField(term417791, term417791.getClass(), "focusListener", null);
        setField(term417791, term417791.getClass(), "hierarchyListener", null);
        setField(term417791, term417791.getClass(), "hierarchyBoundsListener", null);
        setField(term417791, term417791.getClass(), "keyListener", null);
        setField(term417791, term417791.getClass(), "mouseListener", null);
        setField(term417791, term417791.getClass(), "mouseMotionListener", null);
        setField(term417791, term417791.getClass(), "mouseWheelListener", null);
        setField(term417791, term417791.getClass(), "inputMethodListener", null);
        setLongField(term417791, term417791.getClass(), "eventMask", 0L);
        setField(term417791, term417791.getClass(), "changeSupport", null);
        setField(term417791, term417791.getClass(), "objectLock", null);
        setBooleanField(term417791, term417791.getClass(), "isPacked", false);
        setIntField(term417791, term417791.getClass(), "boundsOp", 0);
        setField(term417791, term417791.getClass(), "compoundShape", null);
        setField(term417791, term417791.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term417791, term417791.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term417791, term417791.getClass(), "backgroundEraseDisabled", false);
        setField(term417791, term417791.getClass(), "eventCache", null);
        setBooleanField(term417791, term417791.getClass(), "coalescingEnabled", false);
        setBooleanField(term417791, term417791.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term417791, term417791.getClass(), "componentSerializedDataVersion", 0);
        setField(term417791, term417791.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.PlanetListView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleAction", argTypes, term417791, args);
    }

};


