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

public class LeaderView_updatePanel_205330973220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term578769;

    public LeaderView_updatePanel_205330973220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term578769 = newInstance(Class.forName("org.openRealmOfStars.game.state.LeaderView"));
        setField(term578769, term578769.getClass(), "player", null);
        setField(term578769, term578769.getClass(), "map", null);
        setField(term578769, term578769.getClass(), "leaderTree", null);
        setField(term578769, term578769.getClass(), "leaderList", null);
        setField(term578769, term578769.getClass(), "credits", null);
        setField(term578769, term578769.getClass(), "planetPopulation", null);
        setField(term578769, term578769.getClass(), "infoText", null);
        setField(term578769, term578769.getClass(), "mapPanel", null);
        setField(term578769, term578769.getClass(), "trainingPlanet", null);
        setField(term578769, term578769.getClass(), "recruitBtn", null);
        setField(term578769, term578769.getClass(), "setLeaderBtn", null);
        setField(term578769, term578769.getClass(), "activePlanet", null);
        setField(term578769, term578769.getClass(), "activeFleet", null);
        setField(term578769, term578769.getClass(), "leadersInPool", null);
        setBooleanField(term578769, term578769.getClass(), "standardLeaderSelected", false);
        setBooleanField(term578769, term578769.getClass(), "isAlignmentXSet", false);
        setFloatField(term578769, term578769.getClass(), "alignmentX", 0.0F);
        setBooleanField(term578769, term578769.getClass(), "isAlignmentYSet", false);
        setFloatField(term578769, term578769.getClass(), "alignmentY", 0.0F);
        setField(term578769, term578769.getClass(), "ui", null);
        setField(term578769, term578769.getClass(), "listenerList", null);
        setField(term578769, term578769.getClass(), "clientProperties", null);
        setField(term578769, term578769.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term578769, term578769.getClass(), "autoscrolls", false);
        setField(term578769, term578769.getClass(), "border", null);
        setIntField(term578769, term578769.getClass(), "flags", 0);
        setField(term578769, term578769.getClass(), "inputVerifier", null);
        setBooleanField(term578769, term578769.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term578769, term578769.getClass(), "paintingChild", null);
        setField(term578769, term578769.getClass(), "popupMenu", null);
        setField(term578769, term578769.getClass(), "revalidateRunnableScheduled", null);
        setField(term578769, term578769.getClass(), "focusInputMap", null);
        setField(term578769, term578769.getClass(), "ancestorInputMap", null);
        setField(term578769, term578769.getClass(), "windowInputMap", null);
        setField(term578769, term578769.getClass(), "actionMap", null);
        setField(term578769, term578769.getClass(), "aaHint", null);
        setField(term578769, term578769.getClass(), "lcdRenderingHint", null);
        setField(term578769, term578769.getClass(), "component", null);
        setField(term578769, term578769.getClass(), "layoutMgr", null);
        setField(term578769, term578769.getClass(), "dispatcher", null);
        setField(term578769, term578769.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term578769, term578769.getClass(), "focusCycleRoot", false);
        setBooleanField(term578769, term578769.getClass(), "focusTraversalPolicyProvider", false);
        setField(term578769, term578769.getClass(), "printingThreads", null);
        setBooleanField(term578769, term578769.getClass(), "printing", false);
        setField(term578769, term578769.getClass(), "containerListener", null);
        setIntField(term578769, term578769.getClass(), "listeningChildren", 0);
        setIntField(term578769, term578769.getClass(), "listeningBoundsChildren", 0);
        setIntField(term578769, term578769.getClass(), "descendantsCount", 0);
        setField(term578769, term578769.getClass(), "preserveBackgroundColor", null);
        setIntField(term578769, term578769.getClass(), "numOfHWComponents", 0);
        setIntField(term578769, term578769.getClass(), "numOfLWComponents", 0);
        setField(term578769, term578769.getClass(), "modalComp", null);
        setField(term578769, term578769.getClass(), "modalAppContext", null);
        setIntField(term578769, term578769.getClass(), "containerSerializedDataVersion", 0);
        setField(term578769, term578769.getClass(), "peer", null);
        setField(term578769, term578769.getClass(), "parent", null);
        setField(term578769, term578769.getClass(), "appContext", null);
        setIntField(term578769, term578769.getClass(), "x", 0);
        setIntField(term578769, term578769.getClass(), "y", 0);
        setIntField(term578769, term578769.getClass(), "width", 0);
        setIntField(term578769, term578769.getClass(), "height", 0);
        setField(term578769, term578769.getClass(), "foreground", null);
        setField(term578769, term578769.getClass(), "background", null);
        setField(term578769, term578769.getClass(), "font", null);
        setField(term578769, term578769.getClass(), "peerFont", null);
        setField(term578769, term578769.getClass(), "cursor", null);
        setField(term578769, term578769.getClass(), "locale", null);
        setField(term578769, term578769.getClass(), "graphicsConfig", null);
        setField(term578769, term578769.getClass(), "bufferStrategy", null);
        setBooleanField(term578769, term578769.getClass(), "ignoreRepaint", false);
        setBooleanField(term578769, term578769.getClass(), "visible", false);
        setBooleanField(term578769, term578769.getClass(), "enabled", false);
        setBooleanField(term578769, term578769.getClass(), "valid", false);
        setField(term578769, term578769.getClass(), "dropTarget", null);
        setField(term578769, term578769.getClass(), "popups", null);
        setField(term578769, term578769.getClass(), "name", null);
        setBooleanField(term578769, term578769.getClass(), "nameExplicitlySet", false);
        setBooleanField(term578769, term578769.getClass(), "focusable", false);
        setIntField(term578769, term578769.getClass(), "isFocusTraversableOverridden", 0);
        setField(term578769, term578769.getClass(), "focusTraversalKeys", null);
        setBooleanField(term578769, term578769.getClass(), "focusTraversalKeysEnabled", false);
        setField(term578769, term578769.getClass(), "acc", null);
        setField(term578769, term578769.getClass(), "minSize", null);
        setBooleanField(term578769, term578769.getClass(), "minSizeSet", false);
        setField(term578769, term578769.getClass(), "prefSize", null);
        setBooleanField(term578769, term578769.getClass(), "prefSizeSet", false);
        setField(term578769, term578769.getClass(), "maxSize", null);
        setBooleanField(term578769, term578769.getClass(), "maxSizeSet", false);
        setField(term578769, term578769.getClass(), "componentOrientation", null);
        setBooleanField(term578769, term578769.getClass(), "newEventsOnly", false);
        setField(term578769, term578769.getClass(), "componentListener", null);
        setField(term578769, term578769.getClass(), "focusListener", null);
        setField(term578769, term578769.getClass(), "hierarchyListener", null);
        setField(term578769, term578769.getClass(), "hierarchyBoundsListener", null);
        setField(term578769, term578769.getClass(), "keyListener", null);
        setField(term578769, term578769.getClass(), "mouseListener", null);
        setField(term578769, term578769.getClass(), "mouseMotionListener", null);
        setField(term578769, term578769.getClass(), "mouseWheelListener", null);
        setField(term578769, term578769.getClass(), "inputMethodListener", null);
        setLongField(term578769, term578769.getClass(), "eventMask", 0L);
        setField(term578769, term578769.getClass(), "changeSupport", null);
        setField(term578769, term578769.getClass(), "objectLock", null);
        setBooleanField(term578769, term578769.getClass(), "isPacked", false);
        setIntField(term578769, term578769.getClass(), "boundsOp", 0);
        setField(term578769, term578769.getClass(), "compoundShape", null);
        setField(term578769, term578769.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term578769, term578769.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term578769, term578769.getClass(), "backgroundEraseDisabled", false);
        setField(term578769, term578769.getClass(), "eventCache", null);
        setBooleanField(term578769, term578769.getClass(), "coalescingEnabled", false);
        setBooleanField(term578769, term578769.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term578769, term578769.getClass(), "componentSerializedDataVersion", 0);
        setField(term578769, term578769.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.LeaderView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updatePanel", argTypes, term578769, args);
    }

};


