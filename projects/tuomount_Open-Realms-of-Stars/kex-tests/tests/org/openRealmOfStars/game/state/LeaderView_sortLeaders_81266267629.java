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

public class LeaderView_sortLeaders_81266267629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term608937;

    public LeaderView_sortLeaders_81266267629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term608937 = newInstance(Class.forName("org.openRealmOfStars.game.state.LeaderView"));
        setField(term608937, term608937.getClass(), "player", null);
        setField(term608937, term608937.getClass(), "map", null);
        setField(term608937, term608937.getClass(), "leaderTree", null);
        setField(term608937, term608937.getClass(), "leaderList", null);
        setField(term608937, term608937.getClass(), "credits", null);
        setField(term608937, term608937.getClass(), "planetPopulation", null);
        setField(term608937, term608937.getClass(), "infoText", null);
        setField(term608937, term608937.getClass(), "mapPanel", null);
        setField(term608937, term608937.getClass(), "trainingPlanet", null);
        setField(term608937, term608937.getClass(), "recruitBtn", null);
        setField(term608937, term608937.getClass(), "setLeaderBtn", null);
        setField(term608937, term608937.getClass(), "activePlanet", null);
        setField(term608937, term608937.getClass(), "activeFleet", null);
        setField(term608937, term608937.getClass(), "leadersInPool", null);
        setBooleanField(term608937, term608937.getClass(), "standardLeaderSelected", false);
        setBooleanField(term608937, term608937.getClass(), "isAlignmentXSet", false);
        setFloatField(term608937, term608937.getClass(), "alignmentX", 0.0F);
        setBooleanField(term608937, term608937.getClass(), "isAlignmentYSet", false);
        setFloatField(term608937, term608937.getClass(), "alignmentY", 0.0F);
        setField(term608937, term608937.getClass(), "ui", null);
        setField(term608937, term608937.getClass(), "listenerList", null);
        setField(term608937, term608937.getClass(), "clientProperties", null);
        setField(term608937, term608937.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term608937, term608937.getClass(), "autoscrolls", false);
        setField(term608937, term608937.getClass(), "border", null);
        setIntField(term608937, term608937.getClass(), "flags", 0);
        setField(term608937, term608937.getClass(), "inputVerifier", null);
        setBooleanField(term608937, term608937.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term608937, term608937.getClass(), "paintingChild", null);
        setField(term608937, term608937.getClass(), "popupMenu", null);
        setField(term608937, term608937.getClass(), "revalidateRunnableScheduled", null);
        setField(term608937, term608937.getClass(), "focusInputMap", null);
        setField(term608937, term608937.getClass(), "ancestorInputMap", null);
        setField(term608937, term608937.getClass(), "windowInputMap", null);
        setField(term608937, term608937.getClass(), "actionMap", null);
        setField(term608937, term608937.getClass(), "aaHint", null);
        setField(term608937, term608937.getClass(), "lcdRenderingHint", null);
        setField(term608937, term608937.getClass(), "component", null);
        setField(term608937, term608937.getClass(), "layoutMgr", null);
        setField(term608937, term608937.getClass(), "dispatcher", null);
        setField(term608937, term608937.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term608937, term608937.getClass(), "focusCycleRoot", false);
        setBooleanField(term608937, term608937.getClass(), "focusTraversalPolicyProvider", false);
        setField(term608937, term608937.getClass(), "printingThreads", null);
        setBooleanField(term608937, term608937.getClass(), "printing", false);
        setField(term608937, term608937.getClass(), "containerListener", null);
        setIntField(term608937, term608937.getClass(), "listeningChildren", 0);
        setIntField(term608937, term608937.getClass(), "listeningBoundsChildren", 0);
        setIntField(term608937, term608937.getClass(), "descendantsCount", 0);
        setField(term608937, term608937.getClass(), "preserveBackgroundColor", null);
        setIntField(term608937, term608937.getClass(), "numOfHWComponents", 0);
        setIntField(term608937, term608937.getClass(), "numOfLWComponents", 0);
        setField(term608937, term608937.getClass(), "modalComp", null);
        setField(term608937, term608937.getClass(), "modalAppContext", null);
        setIntField(term608937, term608937.getClass(), "containerSerializedDataVersion", 0);
        setField(term608937, term608937.getClass(), "peer", null);
        setField(term608937, term608937.getClass(), "parent", null);
        setField(term608937, term608937.getClass(), "appContext", null);
        setIntField(term608937, term608937.getClass(), "x", 0);
        setIntField(term608937, term608937.getClass(), "y", 0);
        setIntField(term608937, term608937.getClass(), "width", 0);
        setIntField(term608937, term608937.getClass(), "height", 0);
        setField(term608937, term608937.getClass(), "foreground", null);
        setField(term608937, term608937.getClass(), "background", null);
        setField(term608937, term608937.getClass(), "font", null);
        setField(term608937, term608937.getClass(), "peerFont", null);
        setField(term608937, term608937.getClass(), "cursor", null);
        setField(term608937, term608937.getClass(), "locale", null);
        setField(term608937, term608937.getClass(), "graphicsConfig", null);
        setField(term608937, term608937.getClass(), "bufferStrategy", null);
        setBooleanField(term608937, term608937.getClass(), "ignoreRepaint", false);
        setBooleanField(term608937, term608937.getClass(), "visible", false);
        setBooleanField(term608937, term608937.getClass(), "enabled", false);
        setBooleanField(term608937, term608937.getClass(), "valid", false);
        setField(term608937, term608937.getClass(), "dropTarget", null);
        setField(term608937, term608937.getClass(), "popups", null);
        setField(term608937, term608937.getClass(), "name", null);
        setBooleanField(term608937, term608937.getClass(), "nameExplicitlySet", false);
        setBooleanField(term608937, term608937.getClass(), "focusable", false);
        setIntField(term608937, term608937.getClass(), "isFocusTraversableOverridden", 0);
        setField(term608937, term608937.getClass(), "focusTraversalKeys", null);
        setBooleanField(term608937, term608937.getClass(), "focusTraversalKeysEnabled", false);
        setField(term608937, term608937.getClass(), "acc", null);
        setField(term608937, term608937.getClass(), "minSize", null);
        setBooleanField(term608937, term608937.getClass(), "minSizeSet", false);
        setField(term608937, term608937.getClass(), "prefSize", null);
        setBooleanField(term608937, term608937.getClass(), "prefSizeSet", false);
        setField(term608937, term608937.getClass(), "maxSize", null);
        setBooleanField(term608937, term608937.getClass(), "maxSizeSet", false);
        setField(term608937, term608937.getClass(), "componentOrientation", null);
        setBooleanField(term608937, term608937.getClass(), "newEventsOnly", false);
        setField(term608937, term608937.getClass(), "componentListener", null);
        setField(term608937, term608937.getClass(), "focusListener", null);
        setField(term608937, term608937.getClass(), "hierarchyListener", null);
        setField(term608937, term608937.getClass(), "hierarchyBoundsListener", null);
        setField(term608937, term608937.getClass(), "keyListener", null);
        setField(term608937, term608937.getClass(), "mouseListener", null);
        setField(term608937, term608937.getClass(), "mouseMotionListener", null);
        setField(term608937, term608937.getClass(), "mouseWheelListener", null);
        setField(term608937, term608937.getClass(), "inputMethodListener", null);
        setLongField(term608937, term608937.getClass(), "eventMask", 0L);
        setField(term608937, term608937.getClass(), "changeSupport", null);
        setField(term608937, term608937.getClass(), "objectLock", null);
        setBooleanField(term608937, term608937.getClass(), "isPacked", false);
        setIntField(term608937, term608937.getClass(), "boundsOp", 0);
        setField(term608937, term608937.getClass(), "compoundShape", null);
        setField(term608937, term608937.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term608937, term608937.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term608937, term608937.getClass(), "backgroundEraseDisabled", false);
        setField(term608937, term608937.getClass(), "eventCache", null);
        setBooleanField(term608937, term608937.getClass(), "coalescingEnabled", false);
        setBooleanField(term608937, term608937.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term608937, term608937.getClass(), "componentSerializedDataVersion", 0);
        setField(term608937, term608937.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.LeaderView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.ArrayList");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "sortLeaders", argTypes, term608937, args);
    }

};


