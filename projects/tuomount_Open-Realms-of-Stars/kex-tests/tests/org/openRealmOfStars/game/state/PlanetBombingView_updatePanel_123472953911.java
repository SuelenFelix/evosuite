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

public class PlanetBombingView_updatePanel_123472953911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107401;

    public PlanetBombingView_updatePanel_123472953911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107401 = newInstance(Class.forName("org.openRealmOfStars.game.state.PlanetBombingView"));
        setField(term107401, term107401.getClass(), "totalPeople", null);
        setField(term107401, term107401.getClass(), "troopsPower", null);
        setField(term107401, term107401.getClass(), "defenseTurret", null);
        setField(term107401, term107401.getClass(), "totalBuildings", null);
        setField(term107401, term107401.getClass(), "ownerLabel", null);
        setField(term107401, term107401.getClass(), "planet", null);
        setField(term107401, term107401.getClass(), "fleet", null);
        setIntField(term107401, term107401.getClass(), "suppressionFire", 0);
        setField(term107401, term107401.getClass(), "shipsInFleet", null);
        setField(term107401, term107401.getClass(), "imgBase", null);
        setField(term107401, term107401.getClass(), "infoPanel", null);
        setField(term107401, term107401.getClass(), "textArea", null);
        setField(term107401, term107401.getClass(), "textLogger", null);
        setField(term107401, term107401.getClass(), "componentUsed", null);
        setIntField(term107401, term107401.getClass(), "shipIndex", 0);
        setIntField(term107401, term107401.getClass(), "usedComponentIndex", 0);
        setField(term107401, term107401.getClass(), "attacker", null);
        setIntField(term107401, term107401.getClass(), "attackPlayerIndex", 0);
        setField(term107401, term107401.getClass(), "defender", null);
        setIntField(term107401, term107401.getClass(), "defendingPlayerIndex", 0);
        setBooleanField(term107401, term107401.getClass(), "aiControlled", false);
        setBooleanField(term107401, term107401.getClass(), "allAi", false);
        setField(term107401, term107401.getClass(), "endButton", null);
        setBooleanField(term107401, term107401.getClass(), "aiOneAttackFound", false);
        setBooleanField(term107401, term107401.getClass(), "aiExitLoop", false);
        setBooleanField(term107401, term107401.getClass(), "aiTroops", false);
        setIntField(term107401, term107401.getClass(), "aiDelays", 0);
        setIntField(term107401, term107401.getClass(), "aiComponentIndex", 0);
        setField(term107401, term107401.getClass(), "starMap", null);
        setField(term107401, term107401.getClass(), "game", null);
        setField(term107401, term107401.getClass(), "nuked", null);
        setField(term107401, term107401.getClass(), "newsData", null);
        setField(term107401, term107401.getClass(), "bombers", null);
        setBooleanField(term107401, term107401.getClass(), "actionSpent", false);
        setIntField(term107401, term107401.getClass(), "whatHappened", 0);
        setBooleanField(term107401, term107401.getClass(), "isAlignmentXSet", false);
        setFloatField(term107401, term107401.getClass(), "alignmentX", 0.0F);
        setBooleanField(term107401, term107401.getClass(), "isAlignmentYSet", false);
        setFloatField(term107401, term107401.getClass(), "alignmentY", 0.0F);
        setField(term107401, term107401.getClass(), "ui", null);
        setField(term107401, term107401.getClass(), "listenerList", null);
        setField(term107401, term107401.getClass(), "clientProperties", null);
        setField(term107401, term107401.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term107401, term107401.getClass(), "autoscrolls", false);
        setField(term107401, term107401.getClass(), "border", null);
        setIntField(term107401, term107401.getClass(), "flags", 0);
        setField(term107401, term107401.getClass(), "inputVerifier", null);
        setBooleanField(term107401, term107401.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term107401, term107401.getClass(), "paintingChild", null);
        setField(term107401, term107401.getClass(), "popupMenu", null);
        setField(term107401, term107401.getClass(), "revalidateRunnableScheduled", null);
        setField(term107401, term107401.getClass(), "focusInputMap", null);
        setField(term107401, term107401.getClass(), "ancestorInputMap", null);
        setField(term107401, term107401.getClass(), "windowInputMap", null);
        setField(term107401, term107401.getClass(), "actionMap", null);
        setField(term107401, term107401.getClass(), "aaHint", null);
        setField(term107401, term107401.getClass(), "lcdRenderingHint", null);
        setField(term107401, term107401.getClass(), "component", null);
        setField(term107401, term107401.getClass(), "layoutMgr", null);
        setField(term107401, term107401.getClass(), "dispatcher", null);
        setField(term107401, term107401.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term107401, term107401.getClass(), "focusCycleRoot", false);
        setBooleanField(term107401, term107401.getClass(), "focusTraversalPolicyProvider", false);
        setField(term107401, term107401.getClass(), "printingThreads", null);
        setBooleanField(term107401, term107401.getClass(), "printing", false);
        setField(term107401, term107401.getClass(), "containerListener", null);
        setIntField(term107401, term107401.getClass(), "listeningChildren", 0);
        setIntField(term107401, term107401.getClass(), "listeningBoundsChildren", 0);
        setIntField(term107401, term107401.getClass(), "descendantsCount", 0);
        setField(term107401, term107401.getClass(), "preserveBackgroundColor", null);
        setIntField(term107401, term107401.getClass(), "numOfHWComponents", 0);
        setIntField(term107401, term107401.getClass(), "numOfLWComponents", 0);
        setField(term107401, term107401.getClass(), "modalComp", null);
        setField(term107401, term107401.getClass(), "modalAppContext", null);
        setIntField(term107401, term107401.getClass(), "containerSerializedDataVersion", 0);
        setField(term107401, term107401.getClass(), "peer", null);
        setField(term107401, term107401.getClass(), "parent", null);
        setField(term107401, term107401.getClass(), "appContext", null);
        setIntField(term107401, term107401.getClass(), "x", 0);
        setIntField(term107401, term107401.getClass(), "y", 0);
        setIntField(term107401, term107401.getClass(), "width", 0);
        setIntField(term107401, term107401.getClass(), "height", 0);
        setField(term107401, term107401.getClass(), "foreground", null);
        setField(term107401, term107401.getClass(), "background", null);
        setField(term107401, term107401.getClass(), "font", null);
        setField(term107401, term107401.getClass(), "peerFont", null);
        setField(term107401, term107401.getClass(), "cursor", null);
        setField(term107401, term107401.getClass(), "locale", null);
        setField(term107401, term107401.getClass(), "graphicsConfig", null);
        setField(term107401, term107401.getClass(), "bufferStrategy", null);
        setBooleanField(term107401, term107401.getClass(), "ignoreRepaint", false);
        setBooleanField(term107401, term107401.getClass(), "visible", false);
        setBooleanField(term107401, term107401.getClass(), "enabled", false);
        setBooleanField(term107401, term107401.getClass(), "valid", false);
        setField(term107401, term107401.getClass(), "dropTarget", null);
        setField(term107401, term107401.getClass(), "popups", null);
        setField(term107401, term107401.getClass(), "name", null);
        setBooleanField(term107401, term107401.getClass(), "nameExplicitlySet", false);
        setBooleanField(term107401, term107401.getClass(), "focusable", false);
        setIntField(term107401, term107401.getClass(), "isFocusTraversableOverridden", 0);
        setField(term107401, term107401.getClass(), "focusTraversalKeys", null);
        setBooleanField(term107401, term107401.getClass(), "focusTraversalKeysEnabled", false);
        setField(term107401, term107401.getClass(), "acc", null);
        setField(term107401, term107401.getClass(), "minSize", null);
        setBooleanField(term107401, term107401.getClass(), "minSizeSet", false);
        setField(term107401, term107401.getClass(), "prefSize", null);
        setBooleanField(term107401, term107401.getClass(), "prefSizeSet", false);
        setField(term107401, term107401.getClass(), "maxSize", null);
        setBooleanField(term107401, term107401.getClass(), "maxSizeSet", false);
        setField(term107401, term107401.getClass(), "componentOrientation", null);
        setBooleanField(term107401, term107401.getClass(), "newEventsOnly", false);
        setField(term107401, term107401.getClass(), "componentListener", null);
        setField(term107401, term107401.getClass(), "focusListener", null);
        setField(term107401, term107401.getClass(), "hierarchyListener", null);
        setField(term107401, term107401.getClass(), "hierarchyBoundsListener", null);
        setField(term107401, term107401.getClass(), "keyListener", null);
        setField(term107401, term107401.getClass(), "mouseListener", null);
        setField(term107401, term107401.getClass(), "mouseMotionListener", null);
        setField(term107401, term107401.getClass(), "mouseWheelListener", null);
        setField(term107401, term107401.getClass(), "inputMethodListener", null);
        setLongField(term107401, term107401.getClass(), "eventMask", 0L);
        setField(term107401, term107401.getClass(), "changeSupport", null);
        setField(term107401, term107401.getClass(), "objectLock", null);
        setBooleanField(term107401, term107401.getClass(), "isPacked", false);
        setIntField(term107401, term107401.getClass(), "boundsOp", 0);
        setField(term107401, term107401.getClass(), "compoundShape", null);
        setField(term107401, term107401.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term107401, term107401.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term107401, term107401.getClass(), "backgroundEraseDisabled", false);
        setField(term107401, term107401.getClass(), "eventCache", null);
        setBooleanField(term107401, term107401.getClass(), "coalescingEnabled", false);
        setBooleanField(term107401, term107401.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term107401, term107401.getClass(), "componentSerializedDataVersion", 0);
        setField(term107401, term107401.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.PlanetBombingView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updatePanel", argTypes, term107401, args);
    }

};


