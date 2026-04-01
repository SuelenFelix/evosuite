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

public class LeaderView_handleActions_35277783923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term595902;

    public LeaderView_handleActions_35277783923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term595902 = newInstance(Class.forName("org.openRealmOfStars.game.state.LeaderView"));
        setField(term595902, term595902.getClass(), "player", null);
        setField(term595902, term595902.getClass(), "map", null);
        setField(term595902, term595902.getClass(), "leaderTree", null);
        setField(term595902, term595902.getClass(), "leaderList", null);
        setField(term595902, term595902.getClass(), "credits", null);
        setField(term595902, term595902.getClass(), "planetPopulation", null);
        setField(term595902, term595902.getClass(), "infoText", null);
        setField(term595902, term595902.getClass(), "mapPanel", null);
        setField(term595902, term595902.getClass(), "trainingPlanet", null);
        setField(term595902, term595902.getClass(), "recruitBtn", null);
        setField(term595902, term595902.getClass(), "setLeaderBtn", null);
        setField(term595902, term595902.getClass(), "activePlanet", null);
        setField(term595902, term595902.getClass(), "activeFleet", null);
        setField(term595902, term595902.getClass(), "leadersInPool", null);
        setBooleanField(term595902, term595902.getClass(), "standardLeaderSelected", false);
        setBooleanField(term595902, term595902.getClass(), "isAlignmentXSet", false);
        setFloatField(term595902, term595902.getClass(), "alignmentX", 0.0F);
        setBooleanField(term595902, term595902.getClass(), "isAlignmentYSet", false);
        setFloatField(term595902, term595902.getClass(), "alignmentY", 0.0F);
        setField(term595902, term595902.getClass(), "ui", null);
        setField(term595902, term595902.getClass(), "listenerList", null);
        setField(term595902, term595902.getClass(), "clientProperties", null);
        setField(term595902, term595902.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term595902, term595902.getClass(), "autoscrolls", false);
        setField(term595902, term595902.getClass(), "border", null);
        setIntField(term595902, term595902.getClass(), "flags", 0);
        setField(term595902, term595902.getClass(), "inputVerifier", null);
        setBooleanField(term595902, term595902.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term595902, term595902.getClass(), "paintingChild", null);
        setField(term595902, term595902.getClass(), "popupMenu", null);
        setField(term595902, term595902.getClass(), "revalidateRunnableScheduled", null);
        setField(term595902, term595902.getClass(), "focusInputMap", null);
        setField(term595902, term595902.getClass(), "ancestorInputMap", null);
        setField(term595902, term595902.getClass(), "windowInputMap", null);
        setField(term595902, term595902.getClass(), "actionMap", null);
        setField(term595902, term595902.getClass(), "aaHint", null);
        setField(term595902, term595902.getClass(), "lcdRenderingHint", null);
        setField(term595902, term595902.getClass(), "component", null);
        setField(term595902, term595902.getClass(), "layoutMgr", null);
        setField(term595902, term595902.getClass(), "dispatcher", null);
        setField(term595902, term595902.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term595902, term595902.getClass(), "focusCycleRoot", false);
        setBooleanField(term595902, term595902.getClass(), "focusTraversalPolicyProvider", false);
        setField(term595902, term595902.getClass(), "printingThreads", null);
        setBooleanField(term595902, term595902.getClass(), "printing", false);
        setField(term595902, term595902.getClass(), "containerListener", null);
        setIntField(term595902, term595902.getClass(), "listeningChildren", 0);
        setIntField(term595902, term595902.getClass(), "listeningBoundsChildren", 0);
        setIntField(term595902, term595902.getClass(), "descendantsCount", 0);
        setField(term595902, term595902.getClass(), "preserveBackgroundColor", null);
        setIntField(term595902, term595902.getClass(), "numOfHWComponents", 0);
        setIntField(term595902, term595902.getClass(), "numOfLWComponents", 0);
        setField(term595902, term595902.getClass(), "modalComp", null);
        setField(term595902, term595902.getClass(), "modalAppContext", null);
        setIntField(term595902, term595902.getClass(), "containerSerializedDataVersion", 0);
        setField(term595902, term595902.getClass(), "peer", null);
        setField(term595902, term595902.getClass(), "parent", null);
        setField(term595902, term595902.getClass(), "appContext", null);
        setIntField(term595902, term595902.getClass(), "x", 0);
        setIntField(term595902, term595902.getClass(), "y", 0);
        setIntField(term595902, term595902.getClass(), "width", 0);
        setIntField(term595902, term595902.getClass(), "height", 0);
        setField(term595902, term595902.getClass(), "foreground", null);
        setField(term595902, term595902.getClass(), "background", null);
        setField(term595902, term595902.getClass(), "font", null);
        setField(term595902, term595902.getClass(), "peerFont", null);
        setField(term595902, term595902.getClass(), "cursor", null);
        setField(term595902, term595902.getClass(), "locale", null);
        setField(term595902, term595902.getClass(), "graphicsConfig", null);
        setField(term595902, term595902.getClass(), "bufferStrategy", null);
        setBooleanField(term595902, term595902.getClass(), "ignoreRepaint", false);
        setBooleanField(term595902, term595902.getClass(), "visible", false);
        setBooleanField(term595902, term595902.getClass(), "enabled", false);
        setBooleanField(term595902, term595902.getClass(), "valid", false);
        setField(term595902, term595902.getClass(), "dropTarget", null);
        setField(term595902, term595902.getClass(), "popups", null);
        setField(term595902, term595902.getClass(), "name", null);
        setBooleanField(term595902, term595902.getClass(), "nameExplicitlySet", false);
        setBooleanField(term595902, term595902.getClass(), "focusable", false);
        setIntField(term595902, term595902.getClass(), "isFocusTraversableOverridden", 0);
        setField(term595902, term595902.getClass(), "focusTraversalKeys", null);
        setBooleanField(term595902, term595902.getClass(), "focusTraversalKeysEnabled", false);
        setField(term595902, term595902.getClass(), "acc", null);
        setField(term595902, term595902.getClass(), "minSize", null);
        setBooleanField(term595902, term595902.getClass(), "minSizeSet", false);
        setField(term595902, term595902.getClass(), "prefSize", null);
        setBooleanField(term595902, term595902.getClass(), "prefSizeSet", false);
        setField(term595902, term595902.getClass(), "maxSize", null);
        setBooleanField(term595902, term595902.getClass(), "maxSizeSet", false);
        setField(term595902, term595902.getClass(), "componentOrientation", null);
        setBooleanField(term595902, term595902.getClass(), "newEventsOnly", false);
        setField(term595902, term595902.getClass(), "componentListener", null);
        setField(term595902, term595902.getClass(), "focusListener", null);
        setField(term595902, term595902.getClass(), "hierarchyListener", null);
        setField(term595902, term595902.getClass(), "hierarchyBoundsListener", null);
        setField(term595902, term595902.getClass(), "keyListener", null);
        setField(term595902, term595902.getClass(), "mouseListener", null);
        setField(term595902, term595902.getClass(), "mouseMotionListener", null);
        setField(term595902, term595902.getClass(), "mouseWheelListener", null);
        setField(term595902, term595902.getClass(), "inputMethodListener", null);
        setLongField(term595902, term595902.getClass(), "eventMask", 0L);
        setField(term595902, term595902.getClass(), "changeSupport", null);
        setField(term595902, term595902.getClass(), "objectLock", null);
        setBooleanField(term595902, term595902.getClass(), "isPacked", false);
        setIntField(term595902, term595902.getClass(), "boundsOp", 0);
        setField(term595902, term595902.getClass(), "compoundShape", null);
        setField(term595902, term595902.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term595902, term595902.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term595902, term595902.getClass(), "backgroundEraseDisabled", false);
        setField(term595902, term595902.getClass(), "eventCache", null);
        setBooleanField(term595902, term595902.getClass(), "coalescingEnabled", false);
        setBooleanField(term595902, term595902.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term595902, term595902.getClass(), "componentSerializedDataVersion", 0);
        setField(term595902, term595902.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.LeaderView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleActions", argTypes, term595902, args);
    }

};


