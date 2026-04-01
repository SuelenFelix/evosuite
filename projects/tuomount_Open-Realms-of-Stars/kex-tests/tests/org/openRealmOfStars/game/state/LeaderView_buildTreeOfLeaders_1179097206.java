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

public class LeaderView_buildTreeOfLeaders_1179097206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term524444;

    public LeaderView_buildTreeOfLeaders_1179097206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term524444 = newInstance(Class.forName("org.openRealmOfStars.game.state.LeaderView"));
        setField(term524444, term524444.getClass(), "player", null);
        setField(term524444, term524444.getClass(), "map", null);
        setField(term524444, term524444.getClass(), "leaderTree", null);
        setField(term524444, term524444.getClass(), "leaderList", null);
        setField(term524444, term524444.getClass(), "credits", null);
        setField(term524444, term524444.getClass(), "planetPopulation", null);
        setField(term524444, term524444.getClass(), "infoText", null);
        setField(term524444, term524444.getClass(), "mapPanel", null);
        setField(term524444, term524444.getClass(), "trainingPlanet", null);
        setField(term524444, term524444.getClass(), "recruitBtn", null);
        setField(term524444, term524444.getClass(), "setLeaderBtn", null);
        setField(term524444, term524444.getClass(), "activePlanet", null);
        setField(term524444, term524444.getClass(), "activeFleet", null);
        setField(term524444, term524444.getClass(), "leadersInPool", null);
        setBooleanField(term524444, term524444.getClass(), "standardLeaderSelected", false);
        setBooleanField(term524444, term524444.getClass(), "isAlignmentXSet", false);
        setFloatField(term524444, term524444.getClass(), "alignmentX", 0.0F);
        setBooleanField(term524444, term524444.getClass(), "isAlignmentYSet", false);
        setFloatField(term524444, term524444.getClass(), "alignmentY", 0.0F);
        setField(term524444, term524444.getClass(), "ui", null);
        setField(term524444, term524444.getClass(), "listenerList", null);
        setField(term524444, term524444.getClass(), "clientProperties", null);
        setField(term524444, term524444.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term524444, term524444.getClass(), "autoscrolls", false);
        setField(term524444, term524444.getClass(), "border", null);
        setIntField(term524444, term524444.getClass(), "flags", 0);
        setField(term524444, term524444.getClass(), "inputVerifier", null);
        setBooleanField(term524444, term524444.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term524444, term524444.getClass(), "paintingChild", null);
        setField(term524444, term524444.getClass(), "popupMenu", null);
        setField(term524444, term524444.getClass(), "revalidateRunnableScheduled", null);
        setField(term524444, term524444.getClass(), "focusInputMap", null);
        setField(term524444, term524444.getClass(), "ancestorInputMap", null);
        setField(term524444, term524444.getClass(), "windowInputMap", null);
        setField(term524444, term524444.getClass(), "actionMap", null);
        setField(term524444, term524444.getClass(), "aaHint", null);
        setField(term524444, term524444.getClass(), "lcdRenderingHint", null);
        setField(term524444, term524444.getClass(), "component", null);
        setField(term524444, term524444.getClass(), "layoutMgr", null);
        setField(term524444, term524444.getClass(), "dispatcher", null);
        setField(term524444, term524444.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term524444, term524444.getClass(), "focusCycleRoot", false);
        setBooleanField(term524444, term524444.getClass(), "focusTraversalPolicyProvider", false);
        setField(term524444, term524444.getClass(), "printingThreads", null);
        setBooleanField(term524444, term524444.getClass(), "printing", false);
        setField(term524444, term524444.getClass(), "containerListener", null);
        setIntField(term524444, term524444.getClass(), "listeningChildren", 0);
        setIntField(term524444, term524444.getClass(), "listeningBoundsChildren", 0);
        setIntField(term524444, term524444.getClass(), "descendantsCount", 0);
        setField(term524444, term524444.getClass(), "preserveBackgroundColor", null);
        setIntField(term524444, term524444.getClass(), "numOfHWComponents", 0);
        setIntField(term524444, term524444.getClass(), "numOfLWComponents", 0);
        setField(term524444, term524444.getClass(), "modalComp", null);
        setField(term524444, term524444.getClass(), "modalAppContext", null);
        setIntField(term524444, term524444.getClass(), "containerSerializedDataVersion", 0);
        setField(term524444, term524444.getClass(), "peer", null);
        setField(term524444, term524444.getClass(), "parent", null);
        setField(term524444, term524444.getClass(), "appContext", null);
        setIntField(term524444, term524444.getClass(), "x", 0);
        setIntField(term524444, term524444.getClass(), "y", 0);
        setIntField(term524444, term524444.getClass(), "width", 0);
        setIntField(term524444, term524444.getClass(), "height", 0);
        setField(term524444, term524444.getClass(), "foreground", null);
        setField(term524444, term524444.getClass(), "background", null);
        setField(term524444, term524444.getClass(), "font", null);
        setField(term524444, term524444.getClass(), "peerFont", null);
        setField(term524444, term524444.getClass(), "cursor", null);
        setField(term524444, term524444.getClass(), "locale", null);
        setField(term524444, term524444.getClass(), "graphicsConfig", null);
        setField(term524444, term524444.getClass(), "bufferStrategy", null);
        setBooleanField(term524444, term524444.getClass(), "ignoreRepaint", false);
        setBooleanField(term524444, term524444.getClass(), "visible", false);
        setBooleanField(term524444, term524444.getClass(), "enabled", false);
        setBooleanField(term524444, term524444.getClass(), "valid", false);
        setField(term524444, term524444.getClass(), "dropTarget", null);
        setField(term524444, term524444.getClass(), "popups", null);
        setField(term524444, term524444.getClass(), "name", null);
        setBooleanField(term524444, term524444.getClass(), "nameExplicitlySet", false);
        setBooleanField(term524444, term524444.getClass(), "focusable", false);
        setIntField(term524444, term524444.getClass(), "isFocusTraversableOverridden", 0);
        setField(term524444, term524444.getClass(), "focusTraversalKeys", null);
        setBooleanField(term524444, term524444.getClass(), "focusTraversalKeysEnabled", false);
        setField(term524444, term524444.getClass(), "acc", null);
        setField(term524444, term524444.getClass(), "minSize", null);
        setBooleanField(term524444, term524444.getClass(), "minSizeSet", false);
        setField(term524444, term524444.getClass(), "prefSize", null);
        setBooleanField(term524444, term524444.getClass(), "prefSizeSet", false);
        setField(term524444, term524444.getClass(), "maxSize", null);
        setBooleanField(term524444, term524444.getClass(), "maxSizeSet", false);
        setField(term524444, term524444.getClass(), "componentOrientation", null);
        setBooleanField(term524444, term524444.getClass(), "newEventsOnly", false);
        setField(term524444, term524444.getClass(), "componentListener", null);
        setField(term524444, term524444.getClass(), "focusListener", null);
        setField(term524444, term524444.getClass(), "hierarchyListener", null);
        setField(term524444, term524444.getClass(), "hierarchyBoundsListener", null);
        setField(term524444, term524444.getClass(), "keyListener", null);
        setField(term524444, term524444.getClass(), "mouseListener", null);
        setField(term524444, term524444.getClass(), "mouseMotionListener", null);
        setField(term524444, term524444.getClass(), "mouseWheelListener", null);
        setField(term524444, term524444.getClass(), "inputMethodListener", null);
        setLongField(term524444, term524444.getClass(), "eventMask", 0L);
        setField(term524444, term524444.getClass(), "changeSupport", null);
        setField(term524444, term524444.getClass(), "objectLock", null);
        setBooleanField(term524444, term524444.getClass(), "isPacked", false);
        setIntField(term524444, term524444.getClass(), "boundsOp", 0);
        setField(term524444, term524444.getClass(), "compoundShape", null);
        setField(term524444, term524444.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term524444, term524444.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term524444, term524444.getClass(), "backgroundEraseDisabled", false);
        setField(term524444, term524444.getClass(), "eventCache", null);
        setBooleanField(term524444, term524444.getClass(), "coalescingEnabled", false);
        setBooleanField(term524444, term524444.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term524444, term524444.getClass(), "componentSerializedDataVersion", 0);
        setField(term524444, term524444.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.LeaderView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildTreeOfLeaders", argTypes, term524444, args);
    }

};


