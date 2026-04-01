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

public class LeaderView_setPlanet_18409902668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term538280;

    public LeaderView_setPlanet_18409902668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term538280 = newInstance(Class.forName("org.openRealmOfStars.game.state.LeaderView"));
        setField(term538280, term538280.getClass(), "player", null);
        setField(term538280, term538280.getClass(), "map", null);
        setField(term538280, term538280.getClass(), "leaderTree", null);
        setField(term538280, term538280.getClass(), "leaderList", null);
        setField(term538280, term538280.getClass(), "credits", null);
        setField(term538280, term538280.getClass(), "planetPopulation", null);
        setField(term538280, term538280.getClass(), "infoText", null);
        setField(term538280, term538280.getClass(), "mapPanel", null);
        setField(term538280, term538280.getClass(), "trainingPlanet", null);
        setField(term538280, term538280.getClass(), "recruitBtn", null);
        setField(term538280, term538280.getClass(), "setLeaderBtn", null);
        setField(term538280, term538280.getClass(), "activePlanet", null);
        setField(term538280, term538280.getClass(), "activeFleet", null);
        setField(term538280, term538280.getClass(), "leadersInPool", null);
        setBooleanField(term538280, term538280.getClass(), "standardLeaderSelected", false);
        setBooleanField(term538280, term538280.getClass(), "isAlignmentXSet", false);
        setFloatField(term538280, term538280.getClass(), "alignmentX", 0.0F);
        setBooleanField(term538280, term538280.getClass(), "isAlignmentYSet", false);
        setFloatField(term538280, term538280.getClass(), "alignmentY", 0.0F);
        setField(term538280, term538280.getClass(), "ui", null);
        setField(term538280, term538280.getClass(), "listenerList", null);
        setField(term538280, term538280.getClass(), "clientProperties", null);
        setField(term538280, term538280.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term538280, term538280.getClass(), "autoscrolls", false);
        setField(term538280, term538280.getClass(), "border", null);
        setIntField(term538280, term538280.getClass(), "flags", 0);
        setField(term538280, term538280.getClass(), "inputVerifier", null);
        setBooleanField(term538280, term538280.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term538280, term538280.getClass(), "paintingChild", null);
        setField(term538280, term538280.getClass(), "popupMenu", null);
        setField(term538280, term538280.getClass(), "revalidateRunnableScheduled", null);
        setField(term538280, term538280.getClass(), "focusInputMap", null);
        setField(term538280, term538280.getClass(), "ancestorInputMap", null);
        setField(term538280, term538280.getClass(), "windowInputMap", null);
        setField(term538280, term538280.getClass(), "actionMap", null);
        setField(term538280, term538280.getClass(), "aaHint", null);
        setField(term538280, term538280.getClass(), "lcdRenderingHint", null);
        setField(term538280, term538280.getClass(), "component", null);
        setField(term538280, term538280.getClass(), "layoutMgr", null);
        setField(term538280, term538280.getClass(), "dispatcher", null);
        setField(term538280, term538280.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term538280, term538280.getClass(), "focusCycleRoot", false);
        setBooleanField(term538280, term538280.getClass(), "focusTraversalPolicyProvider", false);
        setField(term538280, term538280.getClass(), "printingThreads", null);
        setBooleanField(term538280, term538280.getClass(), "printing", false);
        setField(term538280, term538280.getClass(), "containerListener", null);
        setIntField(term538280, term538280.getClass(), "listeningChildren", 0);
        setIntField(term538280, term538280.getClass(), "listeningBoundsChildren", 0);
        setIntField(term538280, term538280.getClass(), "descendantsCount", 0);
        setField(term538280, term538280.getClass(), "preserveBackgroundColor", null);
        setIntField(term538280, term538280.getClass(), "numOfHWComponents", 0);
        setIntField(term538280, term538280.getClass(), "numOfLWComponents", 0);
        setField(term538280, term538280.getClass(), "modalComp", null);
        setField(term538280, term538280.getClass(), "modalAppContext", null);
        setIntField(term538280, term538280.getClass(), "containerSerializedDataVersion", 0);
        setField(term538280, term538280.getClass(), "peer", null);
        setField(term538280, term538280.getClass(), "parent", null);
        setField(term538280, term538280.getClass(), "appContext", null);
        setIntField(term538280, term538280.getClass(), "x", 0);
        setIntField(term538280, term538280.getClass(), "y", 0);
        setIntField(term538280, term538280.getClass(), "width", 0);
        setIntField(term538280, term538280.getClass(), "height", 0);
        setField(term538280, term538280.getClass(), "foreground", null);
        setField(term538280, term538280.getClass(), "background", null);
        setField(term538280, term538280.getClass(), "font", null);
        setField(term538280, term538280.getClass(), "peerFont", null);
        setField(term538280, term538280.getClass(), "cursor", null);
        setField(term538280, term538280.getClass(), "locale", null);
        setField(term538280, term538280.getClass(), "graphicsConfig", null);
        setField(term538280, term538280.getClass(), "bufferStrategy", null);
        setBooleanField(term538280, term538280.getClass(), "ignoreRepaint", false);
        setBooleanField(term538280, term538280.getClass(), "visible", false);
        setBooleanField(term538280, term538280.getClass(), "enabled", false);
        setBooleanField(term538280, term538280.getClass(), "valid", false);
        setField(term538280, term538280.getClass(), "dropTarget", null);
        setField(term538280, term538280.getClass(), "popups", null);
        setField(term538280, term538280.getClass(), "name", null);
        setBooleanField(term538280, term538280.getClass(), "nameExplicitlySet", false);
        setBooleanField(term538280, term538280.getClass(), "focusable", false);
        setIntField(term538280, term538280.getClass(), "isFocusTraversableOverridden", 0);
        setField(term538280, term538280.getClass(), "focusTraversalKeys", null);
        setBooleanField(term538280, term538280.getClass(), "focusTraversalKeysEnabled", false);
        setField(term538280, term538280.getClass(), "acc", null);
        setField(term538280, term538280.getClass(), "minSize", null);
        setBooleanField(term538280, term538280.getClass(), "minSizeSet", false);
        setField(term538280, term538280.getClass(), "prefSize", null);
        setBooleanField(term538280, term538280.getClass(), "prefSizeSet", false);
        setField(term538280, term538280.getClass(), "maxSize", null);
        setBooleanField(term538280, term538280.getClass(), "maxSizeSet", false);
        setField(term538280, term538280.getClass(), "componentOrientation", null);
        setBooleanField(term538280, term538280.getClass(), "newEventsOnly", false);
        setField(term538280, term538280.getClass(), "componentListener", null);
        setField(term538280, term538280.getClass(), "focusListener", null);
        setField(term538280, term538280.getClass(), "hierarchyListener", null);
        setField(term538280, term538280.getClass(), "hierarchyBoundsListener", null);
        setField(term538280, term538280.getClass(), "keyListener", null);
        setField(term538280, term538280.getClass(), "mouseListener", null);
        setField(term538280, term538280.getClass(), "mouseMotionListener", null);
        setField(term538280, term538280.getClass(), "mouseWheelListener", null);
        setField(term538280, term538280.getClass(), "inputMethodListener", null);
        setLongField(term538280, term538280.getClass(), "eventMask", 0L);
        setField(term538280, term538280.getClass(), "changeSupport", null);
        setField(term538280, term538280.getClass(), "objectLock", null);
        setBooleanField(term538280, term538280.getClass(), "isPacked", false);
        setIntField(term538280, term538280.getClass(), "boundsOp", 0);
        setField(term538280, term538280.getClass(), "compoundShape", null);
        setField(term538280, term538280.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term538280, term538280.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term538280, term538280.getClass(), "backgroundEraseDisabled", false);
        setField(term538280, term538280.getClass(), "eventCache", null);
        setBooleanField(term538280, term538280.getClass(), "coalescingEnabled", false);
        setBooleanField(term538280, term538280.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term538280, term538280.getClass(), "componentSerializedDataVersion", 0);
        setField(term538280, term538280.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.LeaderView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlanet", argTypes, term538280, args);
    }

};


