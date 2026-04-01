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

public class LeaderView_setFleet_58585533510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term545923;

    public LeaderView_setFleet_58585533510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term545923 = newInstance(Class.forName("org.openRealmOfStars.game.state.LeaderView"));
        setField(term545923, term545923.getClass(), "player", null);
        setField(term545923, term545923.getClass(), "map", null);
        setField(term545923, term545923.getClass(), "leaderTree", null);
        setField(term545923, term545923.getClass(), "leaderList", null);
        setField(term545923, term545923.getClass(), "credits", null);
        setField(term545923, term545923.getClass(), "planetPopulation", null);
        setField(term545923, term545923.getClass(), "infoText", null);
        setField(term545923, term545923.getClass(), "mapPanel", null);
        setField(term545923, term545923.getClass(), "trainingPlanet", null);
        setField(term545923, term545923.getClass(), "recruitBtn", null);
        setField(term545923, term545923.getClass(), "setLeaderBtn", null);
        setField(term545923, term545923.getClass(), "activePlanet", null);
        setField(term545923, term545923.getClass(), "activeFleet", null);
        setField(term545923, term545923.getClass(), "leadersInPool", null);
        setBooleanField(term545923, term545923.getClass(), "standardLeaderSelected", false);
        setBooleanField(term545923, term545923.getClass(), "isAlignmentXSet", false);
        setFloatField(term545923, term545923.getClass(), "alignmentX", 0.0F);
        setBooleanField(term545923, term545923.getClass(), "isAlignmentYSet", false);
        setFloatField(term545923, term545923.getClass(), "alignmentY", 0.0F);
        setField(term545923, term545923.getClass(), "ui", null);
        setField(term545923, term545923.getClass(), "listenerList", null);
        setField(term545923, term545923.getClass(), "clientProperties", null);
        setField(term545923, term545923.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term545923, term545923.getClass(), "autoscrolls", false);
        setField(term545923, term545923.getClass(), "border", null);
        setIntField(term545923, term545923.getClass(), "flags", 0);
        setField(term545923, term545923.getClass(), "inputVerifier", null);
        setBooleanField(term545923, term545923.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term545923, term545923.getClass(), "paintingChild", null);
        setField(term545923, term545923.getClass(), "popupMenu", null);
        setField(term545923, term545923.getClass(), "revalidateRunnableScheduled", null);
        setField(term545923, term545923.getClass(), "focusInputMap", null);
        setField(term545923, term545923.getClass(), "ancestorInputMap", null);
        setField(term545923, term545923.getClass(), "windowInputMap", null);
        setField(term545923, term545923.getClass(), "actionMap", null);
        setField(term545923, term545923.getClass(), "aaHint", null);
        setField(term545923, term545923.getClass(), "lcdRenderingHint", null);
        setField(term545923, term545923.getClass(), "component", null);
        setField(term545923, term545923.getClass(), "layoutMgr", null);
        setField(term545923, term545923.getClass(), "dispatcher", null);
        setField(term545923, term545923.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term545923, term545923.getClass(), "focusCycleRoot", false);
        setBooleanField(term545923, term545923.getClass(), "focusTraversalPolicyProvider", false);
        setField(term545923, term545923.getClass(), "printingThreads", null);
        setBooleanField(term545923, term545923.getClass(), "printing", false);
        setField(term545923, term545923.getClass(), "containerListener", null);
        setIntField(term545923, term545923.getClass(), "listeningChildren", 0);
        setIntField(term545923, term545923.getClass(), "listeningBoundsChildren", 0);
        setIntField(term545923, term545923.getClass(), "descendantsCount", 0);
        setField(term545923, term545923.getClass(), "preserveBackgroundColor", null);
        setIntField(term545923, term545923.getClass(), "numOfHWComponents", 0);
        setIntField(term545923, term545923.getClass(), "numOfLWComponents", 0);
        setField(term545923, term545923.getClass(), "modalComp", null);
        setField(term545923, term545923.getClass(), "modalAppContext", null);
        setIntField(term545923, term545923.getClass(), "containerSerializedDataVersion", 0);
        setField(term545923, term545923.getClass(), "peer", null);
        setField(term545923, term545923.getClass(), "parent", null);
        setField(term545923, term545923.getClass(), "appContext", null);
        setIntField(term545923, term545923.getClass(), "x", 0);
        setIntField(term545923, term545923.getClass(), "y", 0);
        setIntField(term545923, term545923.getClass(), "width", 0);
        setIntField(term545923, term545923.getClass(), "height", 0);
        setField(term545923, term545923.getClass(), "foreground", null);
        setField(term545923, term545923.getClass(), "background", null);
        setField(term545923, term545923.getClass(), "font", null);
        setField(term545923, term545923.getClass(), "peerFont", null);
        setField(term545923, term545923.getClass(), "cursor", null);
        setField(term545923, term545923.getClass(), "locale", null);
        setField(term545923, term545923.getClass(), "graphicsConfig", null);
        setField(term545923, term545923.getClass(), "bufferStrategy", null);
        setBooleanField(term545923, term545923.getClass(), "ignoreRepaint", false);
        setBooleanField(term545923, term545923.getClass(), "visible", false);
        setBooleanField(term545923, term545923.getClass(), "enabled", false);
        setBooleanField(term545923, term545923.getClass(), "valid", false);
        setField(term545923, term545923.getClass(), "dropTarget", null);
        setField(term545923, term545923.getClass(), "popups", null);
        setField(term545923, term545923.getClass(), "name", null);
        setBooleanField(term545923, term545923.getClass(), "nameExplicitlySet", false);
        setBooleanField(term545923, term545923.getClass(), "focusable", false);
        setIntField(term545923, term545923.getClass(), "isFocusTraversableOverridden", 0);
        setField(term545923, term545923.getClass(), "focusTraversalKeys", null);
        setBooleanField(term545923, term545923.getClass(), "focusTraversalKeysEnabled", false);
        setField(term545923, term545923.getClass(), "acc", null);
        setField(term545923, term545923.getClass(), "minSize", null);
        setBooleanField(term545923, term545923.getClass(), "minSizeSet", false);
        setField(term545923, term545923.getClass(), "prefSize", null);
        setBooleanField(term545923, term545923.getClass(), "prefSizeSet", false);
        setField(term545923, term545923.getClass(), "maxSize", null);
        setBooleanField(term545923, term545923.getClass(), "maxSizeSet", false);
        setField(term545923, term545923.getClass(), "componentOrientation", null);
        setBooleanField(term545923, term545923.getClass(), "newEventsOnly", false);
        setField(term545923, term545923.getClass(), "componentListener", null);
        setField(term545923, term545923.getClass(), "focusListener", null);
        setField(term545923, term545923.getClass(), "hierarchyListener", null);
        setField(term545923, term545923.getClass(), "hierarchyBoundsListener", null);
        setField(term545923, term545923.getClass(), "keyListener", null);
        setField(term545923, term545923.getClass(), "mouseListener", null);
        setField(term545923, term545923.getClass(), "mouseMotionListener", null);
        setField(term545923, term545923.getClass(), "mouseWheelListener", null);
        setField(term545923, term545923.getClass(), "inputMethodListener", null);
        setLongField(term545923, term545923.getClass(), "eventMask", 0L);
        setField(term545923, term545923.getClass(), "changeSupport", null);
        setField(term545923, term545923.getClass(), "objectLock", null);
        setBooleanField(term545923, term545923.getClass(), "isPacked", false);
        setIntField(term545923, term545923.getClass(), "boundsOp", 0);
        setField(term545923, term545923.getClass(), "compoundShape", null);
        setField(term545923, term545923.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term545923, term545923.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term545923, term545923.getClass(), "backgroundEraseDisabled", false);
        setField(term545923, term545923.getClass(), "eventCache", null);
        setBooleanField(term545923, term545923.getClass(), "coalescingEnabled", false);
        setBooleanField(term545923, term545923.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term545923, term545923.getClass(), "componentSerializedDataVersion", 0);
        setField(term545923, term545923.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.LeaderView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFleet", argTypes, term545923, args);
    }

};


