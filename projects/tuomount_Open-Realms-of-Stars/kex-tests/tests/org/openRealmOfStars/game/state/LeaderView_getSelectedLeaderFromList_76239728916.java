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

public class LeaderView_getSelectedLeaderFromList_76239728916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term566289;

    public LeaderView_getSelectedLeaderFromList_76239728916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term566289 = newInstance(Class.forName("org.openRealmOfStars.game.state.LeaderView"));
        setField(term566289, term566289.getClass(), "player", null);
        setField(term566289, term566289.getClass(), "map", null);
        setField(term566289, term566289.getClass(), "leaderTree", null);
        setField(term566289, term566289.getClass(), "leaderList", null);
        setField(term566289, term566289.getClass(), "credits", null);
        setField(term566289, term566289.getClass(), "planetPopulation", null);
        setField(term566289, term566289.getClass(), "infoText", null);
        setField(term566289, term566289.getClass(), "mapPanel", null);
        setField(term566289, term566289.getClass(), "trainingPlanet", null);
        setField(term566289, term566289.getClass(), "recruitBtn", null);
        setField(term566289, term566289.getClass(), "setLeaderBtn", null);
        setField(term566289, term566289.getClass(), "activePlanet", null);
        setField(term566289, term566289.getClass(), "activeFleet", null);
        setField(term566289, term566289.getClass(), "leadersInPool", null);
        setBooleanField(term566289, term566289.getClass(), "standardLeaderSelected", false);
        setBooleanField(term566289, term566289.getClass(), "isAlignmentXSet", false);
        setFloatField(term566289, term566289.getClass(), "alignmentX", 0.0F);
        setBooleanField(term566289, term566289.getClass(), "isAlignmentYSet", false);
        setFloatField(term566289, term566289.getClass(), "alignmentY", 0.0F);
        setField(term566289, term566289.getClass(), "ui", null);
        setField(term566289, term566289.getClass(), "listenerList", null);
        setField(term566289, term566289.getClass(), "clientProperties", null);
        setField(term566289, term566289.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term566289, term566289.getClass(), "autoscrolls", false);
        setField(term566289, term566289.getClass(), "border", null);
        setIntField(term566289, term566289.getClass(), "flags", 0);
        setField(term566289, term566289.getClass(), "inputVerifier", null);
        setBooleanField(term566289, term566289.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term566289, term566289.getClass(), "paintingChild", null);
        setField(term566289, term566289.getClass(), "popupMenu", null);
        setField(term566289, term566289.getClass(), "revalidateRunnableScheduled", null);
        setField(term566289, term566289.getClass(), "focusInputMap", null);
        setField(term566289, term566289.getClass(), "ancestorInputMap", null);
        setField(term566289, term566289.getClass(), "windowInputMap", null);
        setField(term566289, term566289.getClass(), "actionMap", null);
        setField(term566289, term566289.getClass(), "aaHint", null);
        setField(term566289, term566289.getClass(), "lcdRenderingHint", null);
        setField(term566289, term566289.getClass(), "component", null);
        setField(term566289, term566289.getClass(), "layoutMgr", null);
        setField(term566289, term566289.getClass(), "dispatcher", null);
        setField(term566289, term566289.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term566289, term566289.getClass(), "focusCycleRoot", false);
        setBooleanField(term566289, term566289.getClass(), "focusTraversalPolicyProvider", false);
        setField(term566289, term566289.getClass(), "printingThreads", null);
        setBooleanField(term566289, term566289.getClass(), "printing", false);
        setField(term566289, term566289.getClass(), "containerListener", null);
        setIntField(term566289, term566289.getClass(), "listeningChildren", 0);
        setIntField(term566289, term566289.getClass(), "listeningBoundsChildren", 0);
        setIntField(term566289, term566289.getClass(), "descendantsCount", 0);
        setField(term566289, term566289.getClass(), "preserveBackgroundColor", null);
        setIntField(term566289, term566289.getClass(), "numOfHWComponents", 0);
        setIntField(term566289, term566289.getClass(), "numOfLWComponents", 0);
        setField(term566289, term566289.getClass(), "modalComp", null);
        setField(term566289, term566289.getClass(), "modalAppContext", null);
        setIntField(term566289, term566289.getClass(), "containerSerializedDataVersion", 0);
        setField(term566289, term566289.getClass(), "peer", null);
        setField(term566289, term566289.getClass(), "parent", null);
        setField(term566289, term566289.getClass(), "appContext", null);
        setIntField(term566289, term566289.getClass(), "x", 0);
        setIntField(term566289, term566289.getClass(), "y", 0);
        setIntField(term566289, term566289.getClass(), "width", 0);
        setIntField(term566289, term566289.getClass(), "height", 0);
        setField(term566289, term566289.getClass(), "foreground", null);
        setField(term566289, term566289.getClass(), "background", null);
        setField(term566289, term566289.getClass(), "font", null);
        setField(term566289, term566289.getClass(), "peerFont", null);
        setField(term566289, term566289.getClass(), "cursor", null);
        setField(term566289, term566289.getClass(), "locale", null);
        setField(term566289, term566289.getClass(), "graphicsConfig", null);
        setField(term566289, term566289.getClass(), "bufferStrategy", null);
        setBooleanField(term566289, term566289.getClass(), "ignoreRepaint", false);
        setBooleanField(term566289, term566289.getClass(), "visible", false);
        setBooleanField(term566289, term566289.getClass(), "enabled", false);
        setBooleanField(term566289, term566289.getClass(), "valid", false);
        setField(term566289, term566289.getClass(), "dropTarget", null);
        setField(term566289, term566289.getClass(), "popups", null);
        setField(term566289, term566289.getClass(), "name", null);
        setBooleanField(term566289, term566289.getClass(), "nameExplicitlySet", false);
        setBooleanField(term566289, term566289.getClass(), "focusable", false);
        setIntField(term566289, term566289.getClass(), "isFocusTraversableOverridden", 0);
        setField(term566289, term566289.getClass(), "focusTraversalKeys", null);
        setBooleanField(term566289, term566289.getClass(), "focusTraversalKeysEnabled", false);
        setField(term566289, term566289.getClass(), "acc", null);
        setField(term566289, term566289.getClass(), "minSize", null);
        setBooleanField(term566289, term566289.getClass(), "minSizeSet", false);
        setField(term566289, term566289.getClass(), "prefSize", null);
        setBooleanField(term566289, term566289.getClass(), "prefSizeSet", false);
        setField(term566289, term566289.getClass(), "maxSize", null);
        setBooleanField(term566289, term566289.getClass(), "maxSizeSet", false);
        setField(term566289, term566289.getClass(), "componentOrientation", null);
        setBooleanField(term566289, term566289.getClass(), "newEventsOnly", false);
        setField(term566289, term566289.getClass(), "componentListener", null);
        setField(term566289, term566289.getClass(), "focusListener", null);
        setField(term566289, term566289.getClass(), "hierarchyListener", null);
        setField(term566289, term566289.getClass(), "hierarchyBoundsListener", null);
        setField(term566289, term566289.getClass(), "keyListener", null);
        setField(term566289, term566289.getClass(), "mouseListener", null);
        setField(term566289, term566289.getClass(), "mouseMotionListener", null);
        setField(term566289, term566289.getClass(), "mouseWheelListener", null);
        setField(term566289, term566289.getClass(), "inputMethodListener", null);
        setLongField(term566289, term566289.getClass(), "eventMask", 0L);
        setField(term566289, term566289.getClass(), "changeSupport", null);
        setField(term566289, term566289.getClass(), "objectLock", null);
        setBooleanField(term566289, term566289.getClass(), "isPacked", false);
        setIntField(term566289, term566289.getClass(), "boundsOp", 0);
        setField(term566289, term566289.getClass(), "compoundShape", null);
        setField(term566289, term566289.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term566289, term566289.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term566289, term566289.getClass(), "backgroundEraseDisabled", false);
        setField(term566289, term566289.getClass(), "eventCache", null);
        setBooleanField(term566289, term566289.getClass(), "coalescingEnabled", false);
        setBooleanField(term566289, term566289.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term566289, term566289.getClass(), "componentSerializedDataVersion", 0);
        setField(term566289, term566289.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.LeaderView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSelectedLeaderFromList", argTypes, term566289, args);
    }

};


