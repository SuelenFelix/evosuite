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

public class LeaderView_getHeirs_124374711628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term608895;

    public LeaderView_getHeirs_124374711628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term608895 = newInstance(Class.forName("org.openRealmOfStars.game.state.LeaderView"));
        setField(term608895, term608895.getClass(), "player", null);
        setField(term608895, term608895.getClass(), "map", null);
        setField(term608895, term608895.getClass(), "leaderTree", null);
        setField(term608895, term608895.getClass(), "leaderList", null);
        setField(term608895, term608895.getClass(), "credits", null);
        setField(term608895, term608895.getClass(), "planetPopulation", null);
        setField(term608895, term608895.getClass(), "infoText", null);
        setField(term608895, term608895.getClass(), "mapPanel", null);
        setField(term608895, term608895.getClass(), "trainingPlanet", null);
        setField(term608895, term608895.getClass(), "recruitBtn", null);
        setField(term608895, term608895.getClass(), "setLeaderBtn", null);
        setField(term608895, term608895.getClass(), "activePlanet", null);
        setField(term608895, term608895.getClass(), "activeFleet", null);
        setField(term608895, term608895.getClass(), "leadersInPool", null);
        setBooleanField(term608895, term608895.getClass(), "standardLeaderSelected", false);
        setBooleanField(term608895, term608895.getClass(), "isAlignmentXSet", false);
        setFloatField(term608895, term608895.getClass(), "alignmentX", 0.0F);
        setBooleanField(term608895, term608895.getClass(), "isAlignmentYSet", false);
        setFloatField(term608895, term608895.getClass(), "alignmentY", 0.0F);
        setField(term608895, term608895.getClass(), "ui", null);
        setField(term608895, term608895.getClass(), "listenerList", null);
        setField(term608895, term608895.getClass(), "clientProperties", null);
        setField(term608895, term608895.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term608895, term608895.getClass(), "autoscrolls", false);
        setField(term608895, term608895.getClass(), "border", null);
        setIntField(term608895, term608895.getClass(), "flags", 0);
        setField(term608895, term608895.getClass(), "inputVerifier", null);
        setBooleanField(term608895, term608895.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term608895, term608895.getClass(), "paintingChild", null);
        setField(term608895, term608895.getClass(), "popupMenu", null);
        setField(term608895, term608895.getClass(), "revalidateRunnableScheduled", null);
        setField(term608895, term608895.getClass(), "focusInputMap", null);
        setField(term608895, term608895.getClass(), "ancestorInputMap", null);
        setField(term608895, term608895.getClass(), "windowInputMap", null);
        setField(term608895, term608895.getClass(), "actionMap", null);
        setField(term608895, term608895.getClass(), "aaHint", null);
        setField(term608895, term608895.getClass(), "lcdRenderingHint", null);
        setField(term608895, term608895.getClass(), "component", null);
        setField(term608895, term608895.getClass(), "layoutMgr", null);
        setField(term608895, term608895.getClass(), "dispatcher", null);
        setField(term608895, term608895.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term608895, term608895.getClass(), "focusCycleRoot", false);
        setBooleanField(term608895, term608895.getClass(), "focusTraversalPolicyProvider", false);
        setField(term608895, term608895.getClass(), "printingThreads", null);
        setBooleanField(term608895, term608895.getClass(), "printing", false);
        setField(term608895, term608895.getClass(), "containerListener", null);
        setIntField(term608895, term608895.getClass(), "listeningChildren", 0);
        setIntField(term608895, term608895.getClass(), "listeningBoundsChildren", 0);
        setIntField(term608895, term608895.getClass(), "descendantsCount", 0);
        setField(term608895, term608895.getClass(), "preserveBackgroundColor", null);
        setIntField(term608895, term608895.getClass(), "numOfHWComponents", 0);
        setIntField(term608895, term608895.getClass(), "numOfLWComponents", 0);
        setField(term608895, term608895.getClass(), "modalComp", null);
        setField(term608895, term608895.getClass(), "modalAppContext", null);
        setIntField(term608895, term608895.getClass(), "containerSerializedDataVersion", 0);
        setField(term608895, term608895.getClass(), "peer", null);
        setField(term608895, term608895.getClass(), "parent", null);
        setField(term608895, term608895.getClass(), "appContext", null);
        setIntField(term608895, term608895.getClass(), "x", 0);
        setIntField(term608895, term608895.getClass(), "y", 0);
        setIntField(term608895, term608895.getClass(), "width", 0);
        setIntField(term608895, term608895.getClass(), "height", 0);
        setField(term608895, term608895.getClass(), "foreground", null);
        setField(term608895, term608895.getClass(), "background", null);
        setField(term608895, term608895.getClass(), "font", null);
        setField(term608895, term608895.getClass(), "peerFont", null);
        setField(term608895, term608895.getClass(), "cursor", null);
        setField(term608895, term608895.getClass(), "locale", null);
        setField(term608895, term608895.getClass(), "graphicsConfig", null);
        setField(term608895, term608895.getClass(), "bufferStrategy", null);
        setBooleanField(term608895, term608895.getClass(), "ignoreRepaint", false);
        setBooleanField(term608895, term608895.getClass(), "visible", false);
        setBooleanField(term608895, term608895.getClass(), "enabled", false);
        setBooleanField(term608895, term608895.getClass(), "valid", false);
        setField(term608895, term608895.getClass(), "dropTarget", null);
        setField(term608895, term608895.getClass(), "popups", null);
        setField(term608895, term608895.getClass(), "name", null);
        setBooleanField(term608895, term608895.getClass(), "nameExplicitlySet", false);
        setBooleanField(term608895, term608895.getClass(), "focusable", false);
        setIntField(term608895, term608895.getClass(), "isFocusTraversableOverridden", 0);
        setField(term608895, term608895.getClass(), "focusTraversalKeys", null);
        setBooleanField(term608895, term608895.getClass(), "focusTraversalKeysEnabled", false);
        setField(term608895, term608895.getClass(), "acc", null);
        setField(term608895, term608895.getClass(), "minSize", null);
        setBooleanField(term608895, term608895.getClass(), "minSizeSet", false);
        setField(term608895, term608895.getClass(), "prefSize", null);
        setBooleanField(term608895, term608895.getClass(), "prefSizeSet", false);
        setField(term608895, term608895.getClass(), "maxSize", null);
        setBooleanField(term608895, term608895.getClass(), "maxSizeSet", false);
        setField(term608895, term608895.getClass(), "componentOrientation", null);
        setBooleanField(term608895, term608895.getClass(), "newEventsOnly", false);
        setField(term608895, term608895.getClass(), "componentListener", null);
        setField(term608895, term608895.getClass(), "focusListener", null);
        setField(term608895, term608895.getClass(), "hierarchyListener", null);
        setField(term608895, term608895.getClass(), "hierarchyBoundsListener", null);
        setField(term608895, term608895.getClass(), "keyListener", null);
        setField(term608895, term608895.getClass(), "mouseListener", null);
        setField(term608895, term608895.getClass(), "mouseMotionListener", null);
        setField(term608895, term608895.getClass(), "mouseWheelListener", null);
        setField(term608895, term608895.getClass(), "inputMethodListener", null);
        setLongField(term608895, term608895.getClass(), "eventMask", 0L);
        setField(term608895, term608895.getClass(), "changeSupport", null);
        setField(term608895, term608895.getClass(), "objectLock", null);
        setBooleanField(term608895, term608895.getClass(), "isPacked", false);
        setIntField(term608895, term608895.getClass(), "boundsOp", 0);
        setField(term608895, term608895.getClass(), "compoundShape", null);
        setField(term608895, term608895.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term608895, term608895.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term608895, term608895.getClass(), "backgroundEraseDisabled", false);
        setField(term608895, term608895.getClass(), "eventCache", null);
        setBooleanField(term608895, term608895.getClass(), "coalescingEnabled", false);
        setBooleanField(term608895, term608895.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term608895, term608895.getClass(), "componentSerializedDataVersion", 0);
        setField(term608895, term608895.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.LeaderView");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.leader.Leader");
        argTypes[1] = Array.newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "getHeirs", argTypes, term608895, args);
    }

};


