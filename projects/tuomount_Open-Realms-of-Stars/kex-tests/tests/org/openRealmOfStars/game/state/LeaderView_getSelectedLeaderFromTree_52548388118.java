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

public class LeaderView_getSelectedLeaderFromTree_52548388118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term573062;

    public LeaderView_getSelectedLeaderFromTree_52548388118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term573062 = newInstance(Class.forName("org.openRealmOfStars.game.state.LeaderView"));
        setField(term573062, term573062.getClass(), "player", null);
        setField(term573062, term573062.getClass(), "map", null);
        setField(term573062, term573062.getClass(), "leaderTree", null);
        setField(term573062, term573062.getClass(), "leaderList", null);
        setField(term573062, term573062.getClass(), "credits", null);
        setField(term573062, term573062.getClass(), "planetPopulation", null);
        setField(term573062, term573062.getClass(), "infoText", null);
        setField(term573062, term573062.getClass(), "mapPanel", null);
        setField(term573062, term573062.getClass(), "trainingPlanet", null);
        setField(term573062, term573062.getClass(), "recruitBtn", null);
        setField(term573062, term573062.getClass(), "setLeaderBtn", null);
        setField(term573062, term573062.getClass(), "activePlanet", null);
        setField(term573062, term573062.getClass(), "activeFleet", null);
        setField(term573062, term573062.getClass(), "leadersInPool", null);
        setBooleanField(term573062, term573062.getClass(), "standardLeaderSelected", false);
        setBooleanField(term573062, term573062.getClass(), "isAlignmentXSet", false);
        setFloatField(term573062, term573062.getClass(), "alignmentX", 0.0F);
        setBooleanField(term573062, term573062.getClass(), "isAlignmentYSet", false);
        setFloatField(term573062, term573062.getClass(), "alignmentY", 0.0F);
        setField(term573062, term573062.getClass(), "ui", null);
        setField(term573062, term573062.getClass(), "listenerList", null);
        setField(term573062, term573062.getClass(), "clientProperties", null);
        setField(term573062, term573062.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term573062, term573062.getClass(), "autoscrolls", false);
        setField(term573062, term573062.getClass(), "border", null);
        setIntField(term573062, term573062.getClass(), "flags", 0);
        setField(term573062, term573062.getClass(), "inputVerifier", null);
        setBooleanField(term573062, term573062.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term573062, term573062.getClass(), "paintingChild", null);
        setField(term573062, term573062.getClass(), "popupMenu", null);
        setField(term573062, term573062.getClass(), "revalidateRunnableScheduled", null);
        setField(term573062, term573062.getClass(), "focusInputMap", null);
        setField(term573062, term573062.getClass(), "ancestorInputMap", null);
        setField(term573062, term573062.getClass(), "windowInputMap", null);
        setField(term573062, term573062.getClass(), "actionMap", null);
        setField(term573062, term573062.getClass(), "aaHint", null);
        setField(term573062, term573062.getClass(), "lcdRenderingHint", null);
        setField(term573062, term573062.getClass(), "component", null);
        setField(term573062, term573062.getClass(), "layoutMgr", null);
        setField(term573062, term573062.getClass(), "dispatcher", null);
        setField(term573062, term573062.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term573062, term573062.getClass(), "focusCycleRoot", false);
        setBooleanField(term573062, term573062.getClass(), "focusTraversalPolicyProvider", false);
        setField(term573062, term573062.getClass(), "printingThreads", null);
        setBooleanField(term573062, term573062.getClass(), "printing", false);
        setField(term573062, term573062.getClass(), "containerListener", null);
        setIntField(term573062, term573062.getClass(), "listeningChildren", 0);
        setIntField(term573062, term573062.getClass(), "listeningBoundsChildren", 0);
        setIntField(term573062, term573062.getClass(), "descendantsCount", 0);
        setField(term573062, term573062.getClass(), "preserveBackgroundColor", null);
        setIntField(term573062, term573062.getClass(), "numOfHWComponents", 0);
        setIntField(term573062, term573062.getClass(), "numOfLWComponents", 0);
        setField(term573062, term573062.getClass(), "modalComp", null);
        setField(term573062, term573062.getClass(), "modalAppContext", null);
        setIntField(term573062, term573062.getClass(), "containerSerializedDataVersion", 0);
        setField(term573062, term573062.getClass(), "peer", null);
        setField(term573062, term573062.getClass(), "parent", null);
        setField(term573062, term573062.getClass(), "appContext", null);
        setIntField(term573062, term573062.getClass(), "x", 0);
        setIntField(term573062, term573062.getClass(), "y", 0);
        setIntField(term573062, term573062.getClass(), "width", 0);
        setIntField(term573062, term573062.getClass(), "height", 0);
        setField(term573062, term573062.getClass(), "foreground", null);
        setField(term573062, term573062.getClass(), "background", null);
        setField(term573062, term573062.getClass(), "font", null);
        setField(term573062, term573062.getClass(), "peerFont", null);
        setField(term573062, term573062.getClass(), "cursor", null);
        setField(term573062, term573062.getClass(), "locale", null);
        setField(term573062, term573062.getClass(), "graphicsConfig", null);
        setField(term573062, term573062.getClass(), "bufferStrategy", null);
        setBooleanField(term573062, term573062.getClass(), "ignoreRepaint", false);
        setBooleanField(term573062, term573062.getClass(), "visible", false);
        setBooleanField(term573062, term573062.getClass(), "enabled", false);
        setBooleanField(term573062, term573062.getClass(), "valid", false);
        setField(term573062, term573062.getClass(), "dropTarget", null);
        setField(term573062, term573062.getClass(), "popups", null);
        setField(term573062, term573062.getClass(), "name", null);
        setBooleanField(term573062, term573062.getClass(), "nameExplicitlySet", false);
        setBooleanField(term573062, term573062.getClass(), "focusable", false);
        setIntField(term573062, term573062.getClass(), "isFocusTraversableOverridden", 0);
        setField(term573062, term573062.getClass(), "focusTraversalKeys", null);
        setBooleanField(term573062, term573062.getClass(), "focusTraversalKeysEnabled", false);
        setField(term573062, term573062.getClass(), "acc", null);
        setField(term573062, term573062.getClass(), "minSize", null);
        setBooleanField(term573062, term573062.getClass(), "minSizeSet", false);
        setField(term573062, term573062.getClass(), "prefSize", null);
        setBooleanField(term573062, term573062.getClass(), "prefSizeSet", false);
        setField(term573062, term573062.getClass(), "maxSize", null);
        setBooleanField(term573062, term573062.getClass(), "maxSizeSet", false);
        setField(term573062, term573062.getClass(), "componentOrientation", null);
        setBooleanField(term573062, term573062.getClass(), "newEventsOnly", false);
        setField(term573062, term573062.getClass(), "componentListener", null);
        setField(term573062, term573062.getClass(), "focusListener", null);
        setField(term573062, term573062.getClass(), "hierarchyListener", null);
        setField(term573062, term573062.getClass(), "hierarchyBoundsListener", null);
        setField(term573062, term573062.getClass(), "keyListener", null);
        setField(term573062, term573062.getClass(), "mouseListener", null);
        setField(term573062, term573062.getClass(), "mouseMotionListener", null);
        setField(term573062, term573062.getClass(), "mouseWheelListener", null);
        setField(term573062, term573062.getClass(), "inputMethodListener", null);
        setLongField(term573062, term573062.getClass(), "eventMask", 0L);
        setField(term573062, term573062.getClass(), "changeSupport", null);
        setField(term573062, term573062.getClass(), "objectLock", null);
        setBooleanField(term573062, term573062.getClass(), "isPacked", false);
        setIntField(term573062, term573062.getClass(), "boundsOp", 0);
        setField(term573062, term573062.getClass(), "compoundShape", null);
        setField(term573062, term573062.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term573062, term573062.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term573062, term573062.getClass(), "backgroundEraseDisabled", false);
        setField(term573062, term573062.getClass(), "eventCache", null);
        setBooleanField(term573062, term573062.getClass(), "coalescingEnabled", false);
        setBooleanField(term573062, term573062.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term573062, term573062.getClass(), "componentSerializedDataVersion", 0);
        setField(term573062, term573062.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.LeaderView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSelectedLeaderFromTree", argTypes, term573062, args);
    }

};


