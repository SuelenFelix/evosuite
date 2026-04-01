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

public class PlanetBombingView_handleLastNewsAndReputation_115392368151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154670;

    public PlanetBombingView_handleLastNewsAndReputation_115392368151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154670 = newInstance(Class.forName("org.openRealmOfStars.game.state.PlanetBombingView"));
        setField(term154670, term154670.getClass(), "totalPeople", null);
        setField(term154670, term154670.getClass(), "troopsPower", null);
        setField(term154670, term154670.getClass(), "defenseTurret", null);
        setField(term154670, term154670.getClass(), "totalBuildings", null);
        setField(term154670, term154670.getClass(), "ownerLabel", null);
        setField(term154670, term154670.getClass(), "planet", null);
        setField(term154670, term154670.getClass(), "fleet", null);
        setIntField(term154670, term154670.getClass(), "suppressionFire", 0);
        setField(term154670, term154670.getClass(), "shipsInFleet", null);
        setField(term154670, term154670.getClass(), "imgBase", null);
        setField(term154670, term154670.getClass(), "infoPanel", null);
        setField(term154670, term154670.getClass(), "textArea", null);
        setField(term154670, term154670.getClass(), "textLogger", null);
        setField(term154670, term154670.getClass(), "componentUsed", null);
        setIntField(term154670, term154670.getClass(), "shipIndex", 0);
        setIntField(term154670, term154670.getClass(), "usedComponentIndex", 0);
        setField(term154670, term154670.getClass(), "attacker", null);
        setIntField(term154670, term154670.getClass(), "attackPlayerIndex", 0);
        setField(term154670, term154670.getClass(), "defender", null);
        setIntField(term154670, term154670.getClass(), "defendingPlayerIndex", 0);
        setBooleanField(term154670, term154670.getClass(), "aiControlled", false);
        setBooleanField(term154670, term154670.getClass(), "allAi", false);
        setField(term154670, term154670.getClass(), "endButton", null);
        setBooleanField(term154670, term154670.getClass(), "aiOneAttackFound", false);
        setBooleanField(term154670, term154670.getClass(), "aiExitLoop", false);
        setBooleanField(term154670, term154670.getClass(), "aiTroops", false);
        setIntField(term154670, term154670.getClass(), "aiDelays", 0);
        setIntField(term154670, term154670.getClass(), "aiComponentIndex", 0);
        setField(term154670, term154670.getClass(), "starMap", null);
        setField(term154670, term154670.getClass(), "game", null);
        setField(term154670, term154670.getClass(), "nuked", null);
        setField(term154670, term154670.getClass(), "newsData", null);
        setField(term154670, term154670.getClass(), "bombers", null);
        setBooleanField(term154670, term154670.getClass(), "actionSpent", false);
        setIntField(term154670, term154670.getClass(), "whatHappened", 0);
        setBooleanField(term154670, term154670.getClass(), "isAlignmentXSet", false);
        setFloatField(term154670, term154670.getClass(), "alignmentX", 0.0F);
        setBooleanField(term154670, term154670.getClass(), "isAlignmentYSet", false);
        setFloatField(term154670, term154670.getClass(), "alignmentY", 0.0F);
        setField(term154670, term154670.getClass(), "ui", null);
        setField(term154670, term154670.getClass(), "listenerList", null);
        setField(term154670, term154670.getClass(), "clientProperties", null);
        setField(term154670, term154670.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term154670, term154670.getClass(), "autoscrolls", false);
        setField(term154670, term154670.getClass(), "border", null);
        setIntField(term154670, term154670.getClass(), "flags", 0);
        setField(term154670, term154670.getClass(), "inputVerifier", null);
        setBooleanField(term154670, term154670.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term154670, term154670.getClass(), "paintingChild", null);
        setField(term154670, term154670.getClass(), "popupMenu", null);
        setField(term154670, term154670.getClass(), "revalidateRunnableScheduled", null);
        setField(term154670, term154670.getClass(), "focusInputMap", null);
        setField(term154670, term154670.getClass(), "ancestorInputMap", null);
        setField(term154670, term154670.getClass(), "windowInputMap", null);
        setField(term154670, term154670.getClass(), "actionMap", null);
        setField(term154670, term154670.getClass(), "aaHint", null);
        setField(term154670, term154670.getClass(), "lcdRenderingHint", null);
        setField(term154670, term154670.getClass(), "component", null);
        setField(term154670, term154670.getClass(), "layoutMgr", null);
        setField(term154670, term154670.getClass(), "dispatcher", null);
        setField(term154670, term154670.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term154670, term154670.getClass(), "focusCycleRoot", false);
        setBooleanField(term154670, term154670.getClass(), "focusTraversalPolicyProvider", false);
        setField(term154670, term154670.getClass(), "printingThreads", null);
        setBooleanField(term154670, term154670.getClass(), "printing", false);
        setField(term154670, term154670.getClass(), "containerListener", null);
        setIntField(term154670, term154670.getClass(), "listeningChildren", 0);
        setIntField(term154670, term154670.getClass(), "listeningBoundsChildren", 0);
        setIntField(term154670, term154670.getClass(), "descendantsCount", 0);
        setField(term154670, term154670.getClass(), "preserveBackgroundColor", null);
        setIntField(term154670, term154670.getClass(), "numOfHWComponents", 0);
        setIntField(term154670, term154670.getClass(), "numOfLWComponents", 0);
        setField(term154670, term154670.getClass(), "modalComp", null);
        setField(term154670, term154670.getClass(), "modalAppContext", null);
        setIntField(term154670, term154670.getClass(), "containerSerializedDataVersion", 0);
        setField(term154670, term154670.getClass(), "peer", null);
        setField(term154670, term154670.getClass(), "parent", null);
        setField(term154670, term154670.getClass(), "appContext", null);
        setIntField(term154670, term154670.getClass(), "x", 0);
        setIntField(term154670, term154670.getClass(), "y", 0);
        setIntField(term154670, term154670.getClass(), "width", 0);
        setIntField(term154670, term154670.getClass(), "height", 0);
        setField(term154670, term154670.getClass(), "foreground", null);
        setField(term154670, term154670.getClass(), "background", null);
        setField(term154670, term154670.getClass(), "font", null);
        setField(term154670, term154670.getClass(), "peerFont", null);
        setField(term154670, term154670.getClass(), "cursor", null);
        setField(term154670, term154670.getClass(), "locale", null);
        setField(term154670, term154670.getClass(), "graphicsConfig", null);
        setField(term154670, term154670.getClass(), "bufferStrategy", null);
        setBooleanField(term154670, term154670.getClass(), "ignoreRepaint", false);
        setBooleanField(term154670, term154670.getClass(), "visible", false);
        setBooleanField(term154670, term154670.getClass(), "enabled", false);
        setBooleanField(term154670, term154670.getClass(), "valid", false);
        setField(term154670, term154670.getClass(), "dropTarget", null);
        setField(term154670, term154670.getClass(), "popups", null);
        setField(term154670, term154670.getClass(), "name", null);
        setBooleanField(term154670, term154670.getClass(), "nameExplicitlySet", false);
        setBooleanField(term154670, term154670.getClass(), "focusable", false);
        setIntField(term154670, term154670.getClass(), "isFocusTraversableOverridden", 0);
        setField(term154670, term154670.getClass(), "focusTraversalKeys", null);
        setBooleanField(term154670, term154670.getClass(), "focusTraversalKeysEnabled", false);
        setField(term154670, term154670.getClass(), "acc", null);
        setField(term154670, term154670.getClass(), "minSize", null);
        setBooleanField(term154670, term154670.getClass(), "minSizeSet", false);
        setField(term154670, term154670.getClass(), "prefSize", null);
        setBooleanField(term154670, term154670.getClass(), "prefSizeSet", false);
        setField(term154670, term154670.getClass(), "maxSize", null);
        setBooleanField(term154670, term154670.getClass(), "maxSizeSet", false);
        setField(term154670, term154670.getClass(), "componentOrientation", null);
        setBooleanField(term154670, term154670.getClass(), "newEventsOnly", false);
        setField(term154670, term154670.getClass(), "componentListener", null);
        setField(term154670, term154670.getClass(), "focusListener", null);
        setField(term154670, term154670.getClass(), "hierarchyListener", null);
        setField(term154670, term154670.getClass(), "hierarchyBoundsListener", null);
        setField(term154670, term154670.getClass(), "keyListener", null);
        setField(term154670, term154670.getClass(), "mouseListener", null);
        setField(term154670, term154670.getClass(), "mouseMotionListener", null);
        setField(term154670, term154670.getClass(), "mouseWheelListener", null);
        setField(term154670, term154670.getClass(), "inputMethodListener", null);
        setLongField(term154670, term154670.getClass(), "eventMask", 0L);
        setField(term154670, term154670.getClass(), "changeSupport", null);
        setField(term154670, term154670.getClass(), "objectLock", null);
        setBooleanField(term154670, term154670.getClass(), "isPacked", false);
        setIntField(term154670, term154670.getClass(), "boundsOp", 0);
        setField(term154670, term154670.getClass(), "compoundShape", null);
        setField(term154670, term154670.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term154670, term154670.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term154670, term154670.getClass(), "backgroundEraseDisabled", false);
        setField(term154670, term154670.getClass(), "eventCache", null);
        setBooleanField(term154670, term154670.getClass(), "coalescingEnabled", false);
        setBooleanField(term154670, term154670.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term154670, term154670.getClass(), "componentSerializedDataVersion", 0);
        setField(term154670, term154670.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.PlanetBombingView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "handleLastNewsAndReputation", argTypes, term154670, args);
    }

};


