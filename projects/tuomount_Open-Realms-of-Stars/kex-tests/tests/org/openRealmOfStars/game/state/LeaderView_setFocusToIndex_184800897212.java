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
import java.lang.Integer;

public class LeaderView_setFocusToIndex_184800897212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term552244;
     Object term552286;

    public LeaderView_setFocusToIndex_184800897212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term552244 = newInstance(Class.forName("org.openRealmOfStars.game.state.LeaderView"));
        setField(term552244, term552244.getClass(), "player", null);
        setField(term552244, term552244.getClass(), "map", null);
        setField(term552244, term552244.getClass(), "leaderTree", null);
        setField(term552244, term552244.getClass(), "leaderList", null);
        setField(term552244, term552244.getClass(), "credits", null);
        setField(term552244, term552244.getClass(), "planetPopulation", null);
        setField(term552244, term552244.getClass(), "infoText", null);
        setField(term552244, term552244.getClass(), "mapPanel", null);
        setField(term552244, term552244.getClass(), "trainingPlanet", null);
        setField(term552244, term552244.getClass(), "recruitBtn", null);
        setField(term552244, term552244.getClass(), "setLeaderBtn", null);
        setField(term552244, term552244.getClass(), "activePlanet", null);
        setField(term552244, term552244.getClass(), "activeFleet", null);
        setField(term552244, term552244.getClass(), "leadersInPool", null);
        setBooleanField(term552244, term552244.getClass(), "standardLeaderSelected", false);
        setBooleanField(term552244, term552244.getClass(), "isAlignmentXSet", false);
        setFloatField(term552244, term552244.getClass(), "alignmentX", 0.0F);
        setBooleanField(term552244, term552244.getClass(), "isAlignmentYSet", false);
        setFloatField(term552244, term552244.getClass(), "alignmentY", 0.0F);
        setField(term552244, term552244.getClass(), "ui", null);
        setField(term552244, term552244.getClass(), "listenerList", null);
        setField(term552244, term552244.getClass(), "clientProperties", null);
        setField(term552244, term552244.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term552244, term552244.getClass(), "autoscrolls", false);
        setField(term552244, term552244.getClass(), "border", null);
        setIntField(term552244, term552244.getClass(), "flags", 0);
        setField(term552244, term552244.getClass(), "inputVerifier", null);
        setBooleanField(term552244, term552244.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term552244, term552244.getClass(), "paintingChild", null);
        setField(term552244, term552244.getClass(), "popupMenu", null);
        setField(term552244, term552244.getClass(), "revalidateRunnableScheduled", null);
        setField(term552244, term552244.getClass(), "focusInputMap", null);
        setField(term552244, term552244.getClass(), "ancestorInputMap", null);
        setField(term552244, term552244.getClass(), "windowInputMap", null);
        setField(term552244, term552244.getClass(), "actionMap", null);
        setField(term552244, term552244.getClass(), "aaHint", null);
        setField(term552244, term552244.getClass(), "lcdRenderingHint", null);
        setField(term552244, term552244.getClass(), "component", null);
        setField(term552244, term552244.getClass(), "layoutMgr", null);
        setField(term552244, term552244.getClass(), "dispatcher", null);
        setField(term552244, term552244.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term552244, term552244.getClass(), "focusCycleRoot", false);
        setBooleanField(term552244, term552244.getClass(), "focusTraversalPolicyProvider", false);
        setField(term552244, term552244.getClass(), "printingThreads", null);
        setBooleanField(term552244, term552244.getClass(), "printing", false);
        setField(term552244, term552244.getClass(), "containerListener", null);
        setIntField(term552244, term552244.getClass(), "listeningChildren", 0);
        setIntField(term552244, term552244.getClass(), "listeningBoundsChildren", 0);
        setIntField(term552244, term552244.getClass(), "descendantsCount", 0);
        setField(term552244, term552244.getClass(), "preserveBackgroundColor", null);
        setIntField(term552244, term552244.getClass(), "numOfHWComponents", 0);
        setIntField(term552244, term552244.getClass(), "numOfLWComponents", 0);
        setField(term552244, term552244.getClass(), "modalComp", null);
        setField(term552244, term552244.getClass(), "modalAppContext", null);
        setIntField(term552244, term552244.getClass(), "containerSerializedDataVersion", 0);
        setField(term552244, term552244.getClass(), "peer", null);
        setField(term552244, term552244.getClass(), "parent", null);
        setField(term552244, term552244.getClass(), "appContext", null);
        setIntField(term552244, term552244.getClass(), "x", 0);
        setIntField(term552244, term552244.getClass(), "y", 0);
        setIntField(term552244, term552244.getClass(), "width", 0);
        setIntField(term552244, term552244.getClass(), "height", 0);
        setField(term552244, term552244.getClass(), "foreground", null);
        setField(term552244, term552244.getClass(), "background", null);
        setField(term552244, term552244.getClass(), "font", null);
        setField(term552244, term552244.getClass(), "peerFont", null);
        setField(term552244, term552244.getClass(), "cursor", null);
        setField(term552244, term552244.getClass(), "locale", null);
        setField(term552244, term552244.getClass(), "graphicsConfig", null);
        setField(term552244, term552244.getClass(), "bufferStrategy", null);
        setBooleanField(term552244, term552244.getClass(), "ignoreRepaint", false);
        setBooleanField(term552244, term552244.getClass(), "visible", false);
        setBooleanField(term552244, term552244.getClass(), "enabled", false);
        setBooleanField(term552244, term552244.getClass(), "valid", false);
        setField(term552244, term552244.getClass(), "dropTarget", null);
        setField(term552244, term552244.getClass(), "popups", null);
        setField(term552244, term552244.getClass(), "name", null);
        setBooleanField(term552244, term552244.getClass(), "nameExplicitlySet", false);
        setBooleanField(term552244, term552244.getClass(), "focusable", false);
        setIntField(term552244, term552244.getClass(), "isFocusTraversableOverridden", 0);
        setField(term552244, term552244.getClass(), "focusTraversalKeys", null);
        setBooleanField(term552244, term552244.getClass(), "focusTraversalKeysEnabled", false);
        setField(term552244, term552244.getClass(), "acc", null);
        setField(term552244, term552244.getClass(), "minSize", null);
        setBooleanField(term552244, term552244.getClass(), "minSizeSet", false);
        setField(term552244, term552244.getClass(), "prefSize", null);
        setBooleanField(term552244, term552244.getClass(), "prefSizeSet", false);
        setField(term552244, term552244.getClass(), "maxSize", null);
        setBooleanField(term552244, term552244.getClass(), "maxSizeSet", false);
        setField(term552244, term552244.getClass(), "componentOrientation", null);
        setBooleanField(term552244, term552244.getClass(), "newEventsOnly", false);
        setField(term552244, term552244.getClass(), "componentListener", null);
        setField(term552244, term552244.getClass(), "focusListener", null);
        setField(term552244, term552244.getClass(), "hierarchyListener", null);
        setField(term552244, term552244.getClass(), "hierarchyBoundsListener", null);
        setField(term552244, term552244.getClass(), "keyListener", null);
        setField(term552244, term552244.getClass(), "mouseListener", null);
        setField(term552244, term552244.getClass(), "mouseMotionListener", null);
        setField(term552244, term552244.getClass(), "mouseWheelListener", null);
        setField(term552244, term552244.getClass(), "inputMethodListener", null);
        setLongField(term552244, term552244.getClass(), "eventMask", 0L);
        setField(term552244, term552244.getClass(), "changeSupport", null);
        setField(term552244, term552244.getClass(), "objectLock", null);
        setBooleanField(term552244, term552244.getClass(), "isPacked", false);
        setIntField(term552244, term552244.getClass(), "boundsOp", 0);
        setField(term552244, term552244.getClass(), "compoundShape", null);
        setField(term552244, term552244.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term552244, term552244.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term552244, term552244.getClass(), "backgroundEraseDisabled", false);
        setField(term552244, term552244.getClass(), "eventCache", null);
        setBooleanField(term552244, term552244.getClass(), "coalescingEnabled", false);
        setBooleanField(term552244, term552244.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term552244, term552244.getClass(), "componentSerializedDataVersion", 0);
        setField(term552244, term552244.getClass(), "accessibleContext", null);
        term552286 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.LeaderView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term552286;
        callMethod(klass, "setFocusToIndex", argTypes, term552244, args);
    }

};


