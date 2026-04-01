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

public class PlanetBombingView_isAiDone_173341574247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152231;

    public PlanetBombingView_isAiDone_173341574247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152231 = newInstance(Class.forName("org.openRealmOfStars.game.state.PlanetBombingView"));
        setField(term152231, term152231.getClass(), "totalPeople", null);
        setField(term152231, term152231.getClass(), "troopsPower", null);
        setField(term152231, term152231.getClass(), "defenseTurret", null);
        setField(term152231, term152231.getClass(), "totalBuildings", null);
        setField(term152231, term152231.getClass(), "ownerLabel", null);
        setField(term152231, term152231.getClass(), "planet", null);
        setField(term152231, term152231.getClass(), "fleet", null);
        setIntField(term152231, term152231.getClass(), "suppressionFire", 0);
        setField(term152231, term152231.getClass(), "shipsInFleet", null);
        setField(term152231, term152231.getClass(), "imgBase", null);
        setField(term152231, term152231.getClass(), "infoPanel", null);
        setField(term152231, term152231.getClass(), "textArea", null);
        setField(term152231, term152231.getClass(), "textLogger", null);
        setField(term152231, term152231.getClass(), "componentUsed", null);
        setIntField(term152231, term152231.getClass(), "shipIndex", 0);
        setIntField(term152231, term152231.getClass(), "usedComponentIndex", 0);
        setField(term152231, term152231.getClass(), "attacker", null);
        setIntField(term152231, term152231.getClass(), "attackPlayerIndex", 0);
        setField(term152231, term152231.getClass(), "defender", null);
        setIntField(term152231, term152231.getClass(), "defendingPlayerIndex", 0);
        setBooleanField(term152231, term152231.getClass(), "aiControlled", false);
        setBooleanField(term152231, term152231.getClass(), "allAi", false);
        setField(term152231, term152231.getClass(), "endButton", null);
        setBooleanField(term152231, term152231.getClass(), "aiOneAttackFound", false);
        setBooleanField(term152231, term152231.getClass(), "aiExitLoop", false);
        setBooleanField(term152231, term152231.getClass(), "aiTroops", false);
        setIntField(term152231, term152231.getClass(), "aiDelays", 0);
        setIntField(term152231, term152231.getClass(), "aiComponentIndex", 0);
        setField(term152231, term152231.getClass(), "starMap", null);
        setField(term152231, term152231.getClass(), "game", null);
        setField(term152231, term152231.getClass(), "nuked", null);
        setField(term152231, term152231.getClass(), "newsData", null);
        setField(term152231, term152231.getClass(), "bombers", null);
        setBooleanField(term152231, term152231.getClass(), "actionSpent", false);
        setIntField(term152231, term152231.getClass(), "whatHappened", 0);
        setBooleanField(term152231, term152231.getClass(), "isAlignmentXSet", false);
        setFloatField(term152231, term152231.getClass(), "alignmentX", 0.0F);
        setBooleanField(term152231, term152231.getClass(), "isAlignmentYSet", false);
        setFloatField(term152231, term152231.getClass(), "alignmentY", 0.0F);
        setField(term152231, term152231.getClass(), "ui", null);
        setField(term152231, term152231.getClass(), "listenerList", null);
        setField(term152231, term152231.getClass(), "clientProperties", null);
        setField(term152231, term152231.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term152231, term152231.getClass(), "autoscrolls", false);
        setField(term152231, term152231.getClass(), "border", null);
        setIntField(term152231, term152231.getClass(), "flags", 0);
        setField(term152231, term152231.getClass(), "inputVerifier", null);
        setBooleanField(term152231, term152231.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term152231, term152231.getClass(), "paintingChild", null);
        setField(term152231, term152231.getClass(), "popupMenu", null);
        setField(term152231, term152231.getClass(), "revalidateRunnableScheduled", null);
        setField(term152231, term152231.getClass(), "focusInputMap", null);
        setField(term152231, term152231.getClass(), "ancestorInputMap", null);
        setField(term152231, term152231.getClass(), "windowInputMap", null);
        setField(term152231, term152231.getClass(), "actionMap", null);
        setField(term152231, term152231.getClass(), "aaHint", null);
        setField(term152231, term152231.getClass(), "lcdRenderingHint", null);
        setField(term152231, term152231.getClass(), "component", null);
        setField(term152231, term152231.getClass(), "layoutMgr", null);
        setField(term152231, term152231.getClass(), "dispatcher", null);
        setField(term152231, term152231.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term152231, term152231.getClass(), "focusCycleRoot", false);
        setBooleanField(term152231, term152231.getClass(), "focusTraversalPolicyProvider", false);
        setField(term152231, term152231.getClass(), "printingThreads", null);
        setBooleanField(term152231, term152231.getClass(), "printing", false);
        setField(term152231, term152231.getClass(), "containerListener", null);
        setIntField(term152231, term152231.getClass(), "listeningChildren", 0);
        setIntField(term152231, term152231.getClass(), "listeningBoundsChildren", 0);
        setIntField(term152231, term152231.getClass(), "descendantsCount", 0);
        setField(term152231, term152231.getClass(), "preserveBackgroundColor", null);
        setIntField(term152231, term152231.getClass(), "numOfHWComponents", 0);
        setIntField(term152231, term152231.getClass(), "numOfLWComponents", 0);
        setField(term152231, term152231.getClass(), "modalComp", null);
        setField(term152231, term152231.getClass(), "modalAppContext", null);
        setIntField(term152231, term152231.getClass(), "containerSerializedDataVersion", 0);
        setField(term152231, term152231.getClass(), "peer", null);
        setField(term152231, term152231.getClass(), "parent", null);
        setField(term152231, term152231.getClass(), "appContext", null);
        setIntField(term152231, term152231.getClass(), "x", 0);
        setIntField(term152231, term152231.getClass(), "y", 0);
        setIntField(term152231, term152231.getClass(), "width", 0);
        setIntField(term152231, term152231.getClass(), "height", 0);
        setField(term152231, term152231.getClass(), "foreground", null);
        setField(term152231, term152231.getClass(), "background", null);
        setField(term152231, term152231.getClass(), "font", null);
        setField(term152231, term152231.getClass(), "peerFont", null);
        setField(term152231, term152231.getClass(), "cursor", null);
        setField(term152231, term152231.getClass(), "locale", null);
        setField(term152231, term152231.getClass(), "graphicsConfig", null);
        setField(term152231, term152231.getClass(), "bufferStrategy", null);
        setBooleanField(term152231, term152231.getClass(), "ignoreRepaint", false);
        setBooleanField(term152231, term152231.getClass(), "visible", false);
        setBooleanField(term152231, term152231.getClass(), "enabled", false);
        setBooleanField(term152231, term152231.getClass(), "valid", false);
        setField(term152231, term152231.getClass(), "dropTarget", null);
        setField(term152231, term152231.getClass(), "popups", null);
        setField(term152231, term152231.getClass(), "name", null);
        setBooleanField(term152231, term152231.getClass(), "nameExplicitlySet", false);
        setBooleanField(term152231, term152231.getClass(), "focusable", false);
        setIntField(term152231, term152231.getClass(), "isFocusTraversableOverridden", 0);
        setField(term152231, term152231.getClass(), "focusTraversalKeys", null);
        setBooleanField(term152231, term152231.getClass(), "focusTraversalKeysEnabled", false);
        setField(term152231, term152231.getClass(), "acc", null);
        setField(term152231, term152231.getClass(), "minSize", null);
        setBooleanField(term152231, term152231.getClass(), "minSizeSet", false);
        setField(term152231, term152231.getClass(), "prefSize", null);
        setBooleanField(term152231, term152231.getClass(), "prefSizeSet", false);
        setField(term152231, term152231.getClass(), "maxSize", null);
        setBooleanField(term152231, term152231.getClass(), "maxSizeSet", false);
        setField(term152231, term152231.getClass(), "componentOrientation", null);
        setBooleanField(term152231, term152231.getClass(), "newEventsOnly", false);
        setField(term152231, term152231.getClass(), "componentListener", null);
        setField(term152231, term152231.getClass(), "focusListener", null);
        setField(term152231, term152231.getClass(), "hierarchyListener", null);
        setField(term152231, term152231.getClass(), "hierarchyBoundsListener", null);
        setField(term152231, term152231.getClass(), "keyListener", null);
        setField(term152231, term152231.getClass(), "mouseListener", null);
        setField(term152231, term152231.getClass(), "mouseMotionListener", null);
        setField(term152231, term152231.getClass(), "mouseWheelListener", null);
        setField(term152231, term152231.getClass(), "inputMethodListener", null);
        setLongField(term152231, term152231.getClass(), "eventMask", 0L);
        setField(term152231, term152231.getClass(), "changeSupport", null);
        setField(term152231, term152231.getClass(), "objectLock", null);
        setBooleanField(term152231, term152231.getClass(), "isPacked", false);
        setIntField(term152231, term152231.getClass(), "boundsOp", 0);
        setField(term152231, term152231.getClass(), "compoundShape", null);
        setField(term152231, term152231.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term152231, term152231.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term152231, term152231.getClass(), "backgroundEraseDisabled", false);
        setField(term152231, term152231.getClass(), "eventCache", null);
        setBooleanField(term152231, term152231.getClass(), "coalescingEnabled", false);
        setBooleanField(term152231, term152231.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term152231, term152231.getClass(), "componentSerializedDataVersion", 0);
        setField(term152231, term152231.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.PlanetBombingView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAiDone", argTypes, term152231, args);
    }

};


