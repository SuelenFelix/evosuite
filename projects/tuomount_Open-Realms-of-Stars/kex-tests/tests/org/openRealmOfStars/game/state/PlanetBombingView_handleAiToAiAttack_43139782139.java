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

public class PlanetBombingView_handleAiToAiAttack_43139782139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147074;

    public PlanetBombingView_handleAiToAiAttack_43139782139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147074 = newInstance(Class.forName("org.openRealmOfStars.game.state.PlanetBombingView"));
        setField(term147074, term147074.getClass(), "totalPeople", null);
        setField(term147074, term147074.getClass(), "troopsPower", null);
        setField(term147074, term147074.getClass(), "defenseTurret", null);
        setField(term147074, term147074.getClass(), "totalBuildings", null);
        setField(term147074, term147074.getClass(), "ownerLabel", null);
        setField(term147074, term147074.getClass(), "planet", null);
        setField(term147074, term147074.getClass(), "fleet", null);
        setIntField(term147074, term147074.getClass(), "suppressionFire", 0);
        setField(term147074, term147074.getClass(), "shipsInFleet", null);
        setField(term147074, term147074.getClass(), "imgBase", null);
        setField(term147074, term147074.getClass(), "infoPanel", null);
        setField(term147074, term147074.getClass(), "textArea", null);
        setField(term147074, term147074.getClass(), "textLogger", null);
        setField(term147074, term147074.getClass(), "componentUsed", null);
        setIntField(term147074, term147074.getClass(), "shipIndex", 0);
        setIntField(term147074, term147074.getClass(), "usedComponentIndex", 0);
        setField(term147074, term147074.getClass(), "attacker", null);
        setIntField(term147074, term147074.getClass(), "attackPlayerIndex", 0);
        setField(term147074, term147074.getClass(), "defender", null);
        setIntField(term147074, term147074.getClass(), "defendingPlayerIndex", 0);
        setBooleanField(term147074, term147074.getClass(), "aiControlled", false);
        setBooleanField(term147074, term147074.getClass(), "allAi", false);
        setField(term147074, term147074.getClass(), "endButton", null);
        setBooleanField(term147074, term147074.getClass(), "aiOneAttackFound", false);
        setBooleanField(term147074, term147074.getClass(), "aiExitLoop", false);
        setBooleanField(term147074, term147074.getClass(), "aiTroops", false);
        setIntField(term147074, term147074.getClass(), "aiDelays", 0);
        setIntField(term147074, term147074.getClass(), "aiComponentIndex", 0);
        setField(term147074, term147074.getClass(), "starMap", null);
        setField(term147074, term147074.getClass(), "game", null);
        setField(term147074, term147074.getClass(), "nuked", null);
        setField(term147074, term147074.getClass(), "newsData", null);
        setField(term147074, term147074.getClass(), "bombers", null);
        setBooleanField(term147074, term147074.getClass(), "actionSpent", false);
        setIntField(term147074, term147074.getClass(), "whatHappened", 0);
        setBooleanField(term147074, term147074.getClass(), "isAlignmentXSet", false);
        setFloatField(term147074, term147074.getClass(), "alignmentX", 0.0F);
        setBooleanField(term147074, term147074.getClass(), "isAlignmentYSet", false);
        setFloatField(term147074, term147074.getClass(), "alignmentY", 0.0F);
        setField(term147074, term147074.getClass(), "ui", null);
        setField(term147074, term147074.getClass(), "listenerList", null);
        setField(term147074, term147074.getClass(), "clientProperties", null);
        setField(term147074, term147074.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term147074, term147074.getClass(), "autoscrolls", false);
        setField(term147074, term147074.getClass(), "border", null);
        setIntField(term147074, term147074.getClass(), "flags", 0);
        setField(term147074, term147074.getClass(), "inputVerifier", null);
        setBooleanField(term147074, term147074.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term147074, term147074.getClass(), "paintingChild", null);
        setField(term147074, term147074.getClass(), "popupMenu", null);
        setField(term147074, term147074.getClass(), "revalidateRunnableScheduled", null);
        setField(term147074, term147074.getClass(), "focusInputMap", null);
        setField(term147074, term147074.getClass(), "ancestorInputMap", null);
        setField(term147074, term147074.getClass(), "windowInputMap", null);
        setField(term147074, term147074.getClass(), "actionMap", null);
        setField(term147074, term147074.getClass(), "aaHint", null);
        setField(term147074, term147074.getClass(), "lcdRenderingHint", null);
        setField(term147074, term147074.getClass(), "component", null);
        setField(term147074, term147074.getClass(), "layoutMgr", null);
        setField(term147074, term147074.getClass(), "dispatcher", null);
        setField(term147074, term147074.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term147074, term147074.getClass(), "focusCycleRoot", false);
        setBooleanField(term147074, term147074.getClass(), "focusTraversalPolicyProvider", false);
        setField(term147074, term147074.getClass(), "printingThreads", null);
        setBooleanField(term147074, term147074.getClass(), "printing", false);
        setField(term147074, term147074.getClass(), "containerListener", null);
        setIntField(term147074, term147074.getClass(), "listeningChildren", 0);
        setIntField(term147074, term147074.getClass(), "listeningBoundsChildren", 0);
        setIntField(term147074, term147074.getClass(), "descendantsCount", 0);
        setField(term147074, term147074.getClass(), "preserveBackgroundColor", null);
        setIntField(term147074, term147074.getClass(), "numOfHWComponents", 0);
        setIntField(term147074, term147074.getClass(), "numOfLWComponents", 0);
        setField(term147074, term147074.getClass(), "modalComp", null);
        setField(term147074, term147074.getClass(), "modalAppContext", null);
        setIntField(term147074, term147074.getClass(), "containerSerializedDataVersion", 0);
        setField(term147074, term147074.getClass(), "peer", null);
        setField(term147074, term147074.getClass(), "parent", null);
        setField(term147074, term147074.getClass(), "appContext", null);
        setIntField(term147074, term147074.getClass(), "x", 0);
        setIntField(term147074, term147074.getClass(), "y", 0);
        setIntField(term147074, term147074.getClass(), "width", 0);
        setIntField(term147074, term147074.getClass(), "height", 0);
        setField(term147074, term147074.getClass(), "foreground", null);
        setField(term147074, term147074.getClass(), "background", null);
        setField(term147074, term147074.getClass(), "font", null);
        setField(term147074, term147074.getClass(), "peerFont", null);
        setField(term147074, term147074.getClass(), "cursor", null);
        setField(term147074, term147074.getClass(), "locale", null);
        setField(term147074, term147074.getClass(), "graphicsConfig", null);
        setField(term147074, term147074.getClass(), "bufferStrategy", null);
        setBooleanField(term147074, term147074.getClass(), "ignoreRepaint", false);
        setBooleanField(term147074, term147074.getClass(), "visible", false);
        setBooleanField(term147074, term147074.getClass(), "enabled", false);
        setBooleanField(term147074, term147074.getClass(), "valid", false);
        setField(term147074, term147074.getClass(), "dropTarget", null);
        setField(term147074, term147074.getClass(), "popups", null);
        setField(term147074, term147074.getClass(), "name", null);
        setBooleanField(term147074, term147074.getClass(), "nameExplicitlySet", false);
        setBooleanField(term147074, term147074.getClass(), "focusable", false);
        setIntField(term147074, term147074.getClass(), "isFocusTraversableOverridden", 0);
        setField(term147074, term147074.getClass(), "focusTraversalKeys", null);
        setBooleanField(term147074, term147074.getClass(), "focusTraversalKeysEnabled", false);
        setField(term147074, term147074.getClass(), "acc", null);
        setField(term147074, term147074.getClass(), "minSize", null);
        setBooleanField(term147074, term147074.getClass(), "minSizeSet", false);
        setField(term147074, term147074.getClass(), "prefSize", null);
        setBooleanField(term147074, term147074.getClass(), "prefSizeSet", false);
        setField(term147074, term147074.getClass(), "maxSize", null);
        setBooleanField(term147074, term147074.getClass(), "maxSizeSet", false);
        setField(term147074, term147074.getClass(), "componentOrientation", null);
        setBooleanField(term147074, term147074.getClass(), "newEventsOnly", false);
        setField(term147074, term147074.getClass(), "componentListener", null);
        setField(term147074, term147074.getClass(), "focusListener", null);
        setField(term147074, term147074.getClass(), "hierarchyListener", null);
        setField(term147074, term147074.getClass(), "hierarchyBoundsListener", null);
        setField(term147074, term147074.getClass(), "keyListener", null);
        setField(term147074, term147074.getClass(), "mouseListener", null);
        setField(term147074, term147074.getClass(), "mouseMotionListener", null);
        setField(term147074, term147074.getClass(), "mouseWheelListener", null);
        setField(term147074, term147074.getClass(), "inputMethodListener", null);
        setLongField(term147074, term147074.getClass(), "eventMask", 0L);
        setField(term147074, term147074.getClass(), "changeSupport", null);
        setField(term147074, term147074.getClass(), "objectLock", null);
        setBooleanField(term147074, term147074.getClass(), "isPacked", false);
        setIntField(term147074, term147074.getClass(), "boundsOp", 0);
        setField(term147074, term147074.getClass(), "compoundShape", null);
        setField(term147074, term147074.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term147074, term147074.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term147074, term147074.getClass(), "backgroundEraseDisabled", false);
        setField(term147074, term147074.getClass(), "eventCache", null);
        setBooleanField(term147074, term147074.getClass(), "coalescingEnabled", false);
        setBooleanField(term147074, term147074.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term147074, term147074.getClass(), "componentSerializedDataVersion", 0);
        setField(term147074, term147074.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.PlanetBombingView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "handleAiToAiAttack", argTypes, term147074, args);
    }

};


