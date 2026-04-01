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

public class LeaderView_updateButtonToolTips_149474871614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term559458;

    public LeaderView_updateButtonToolTips_149474871614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term559458 = newInstance(Class.forName("org.openRealmOfStars.game.state.LeaderView"));
        setField(term559458, term559458.getClass(), "player", null);
        setField(term559458, term559458.getClass(), "map", null);
        setField(term559458, term559458.getClass(), "leaderTree", null);
        setField(term559458, term559458.getClass(), "leaderList", null);
        setField(term559458, term559458.getClass(), "credits", null);
        setField(term559458, term559458.getClass(), "planetPopulation", null);
        setField(term559458, term559458.getClass(), "infoText", null);
        setField(term559458, term559458.getClass(), "mapPanel", null);
        setField(term559458, term559458.getClass(), "trainingPlanet", null);
        setField(term559458, term559458.getClass(), "recruitBtn", null);
        setField(term559458, term559458.getClass(), "setLeaderBtn", null);
        setField(term559458, term559458.getClass(), "activePlanet", null);
        setField(term559458, term559458.getClass(), "activeFleet", null);
        setField(term559458, term559458.getClass(), "leadersInPool", null);
        setBooleanField(term559458, term559458.getClass(), "standardLeaderSelected", false);
        setBooleanField(term559458, term559458.getClass(), "isAlignmentXSet", false);
        setFloatField(term559458, term559458.getClass(), "alignmentX", 0.0F);
        setBooleanField(term559458, term559458.getClass(), "isAlignmentYSet", false);
        setFloatField(term559458, term559458.getClass(), "alignmentY", 0.0F);
        setField(term559458, term559458.getClass(), "ui", null);
        setField(term559458, term559458.getClass(), "listenerList", null);
        setField(term559458, term559458.getClass(), "clientProperties", null);
        setField(term559458, term559458.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term559458, term559458.getClass(), "autoscrolls", false);
        setField(term559458, term559458.getClass(), "border", null);
        setIntField(term559458, term559458.getClass(), "flags", 0);
        setField(term559458, term559458.getClass(), "inputVerifier", null);
        setBooleanField(term559458, term559458.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term559458, term559458.getClass(), "paintingChild", null);
        setField(term559458, term559458.getClass(), "popupMenu", null);
        setField(term559458, term559458.getClass(), "revalidateRunnableScheduled", null);
        setField(term559458, term559458.getClass(), "focusInputMap", null);
        setField(term559458, term559458.getClass(), "ancestorInputMap", null);
        setField(term559458, term559458.getClass(), "windowInputMap", null);
        setField(term559458, term559458.getClass(), "actionMap", null);
        setField(term559458, term559458.getClass(), "aaHint", null);
        setField(term559458, term559458.getClass(), "lcdRenderingHint", null);
        setField(term559458, term559458.getClass(), "component", null);
        setField(term559458, term559458.getClass(), "layoutMgr", null);
        setField(term559458, term559458.getClass(), "dispatcher", null);
        setField(term559458, term559458.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term559458, term559458.getClass(), "focusCycleRoot", false);
        setBooleanField(term559458, term559458.getClass(), "focusTraversalPolicyProvider", false);
        setField(term559458, term559458.getClass(), "printingThreads", null);
        setBooleanField(term559458, term559458.getClass(), "printing", false);
        setField(term559458, term559458.getClass(), "containerListener", null);
        setIntField(term559458, term559458.getClass(), "listeningChildren", 0);
        setIntField(term559458, term559458.getClass(), "listeningBoundsChildren", 0);
        setIntField(term559458, term559458.getClass(), "descendantsCount", 0);
        setField(term559458, term559458.getClass(), "preserveBackgroundColor", null);
        setIntField(term559458, term559458.getClass(), "numOfHWComponents", 0);
        setIntField(term559458, term559458.getClass(), "numOfLWComponents", 0);
        setField(term559458, term559458.getClass(), "modalComp", null);
        setField(term559458, term559458.getClass(), "modalAppContext", null);
        setIntField(term559458, term559458.getClass(), "containerSerializedDataVersion", 0);
        setField(term559458, term559458.getClass(), "peer", null);
        setField(term559458, term559458.getClass(), "parent", null);
        setField(term559458, term559458.getClass(), "appContext", null);
        setIntField(term559458, term559458.getClass(), "x", 0);
        setIntField(term559458, term559458.getClass(), "y", 0);
        setIntField(term559458, term559458.getClass(), "width", 0);
        setIntField(term559458, term559458.getClass(), "height", 0);
        setField(term559458, term559458.getClass(), "foreground", null);
        setField(term559458, term559458.getClass(), "background", null);
        setField(term559458, term559458.getClass(), "font", null);
        setField(term559458, term559458.getClass(), "peerFont", null);
        setField(term559458, term559458.getClass(), "cursor", null);
        setField(term559458, term559458.getClass(), "locale", null);
        setField(term559458, term559458.getClass(), "graphicsConfig", null);
        setField(term559458, term559458.getClass(), "bufferStrategy", null);
        setBooleanField(term559458, term559458.getClass(), "ignoreRepaint", false);
        setBooleanField(term559458, term559458.getClass(), "visible", false);
        setBooleanField(term559458, term559458.getClass(), "enabled", false);
        setBooleanField(term559458, term559458.getClass(), "valid", false);
        setField(term559458, term559458.getClass(), "dropTarget", null);
        setField(term559458, term559458.getClass(), "popups", null);
        setField(term559458, term559458.getClass(), "name", null);
        setBooleanField(term559458, term559458.getClass(), "nameExplicitlySet", false);
        setBooleanField(term559458, term559458.getClass(), "focusable", false);
        setIntField(term559458, term559458.getClass(), "isFocusTraversableOverridden", 0);
        setField(term559458, term559458.getClass(), "focusTraversalKeys", null);
        setBooleanField(term559458, term559458.getClass(), "focusTraversalKeysEnabled", false);
        setField(term559458, term559458.getClass(), "acc", null);
        setField(term559458, term559458.getClass(), "minSize", null);
        setBooleanField(term559458, term559458.getClass(), "minSizeSet", false);
        setField(term559458, term559458.getClass(), "prefSize", null);
        setBooleanField(term559458, term559458.getClass(), "prefSizeSet", false);
        setField(term559458, term559458.getClass(), "maxSize", null);
        setBooleanField(term559458, term559458.getClass(), "maxSizeSet", false);
        setField(term559458, term559458.getClass(), "componentOrientation", null);
        setBooleanField(term559458, term559458.getClass(), "newEventsOnly", false);
        setField(term559458, term559458.getClass(), "componentListener", null);
        setField(term559458, term559458.getClass(), "focusListener", null);
        setField(term559458, term559458.getClass(), "hierarchyListener", null);
        setField(term559458, term559458.getClass(), "hierarchyBoundsListener", null);
        setField(term559458, term559458.getClass(), "keyListener", null);
        setField(term559458, term559458.getClass(), "mouseListener", null);
        setField(term559458, term559458.getClass(), "mouseMotionListener", null);
        setField(term559458, term559458.getClass(), "mouseWheelListener", null);
        setField(term559458, term559458.getClass(), "inputMethodListener", null);
        setLongField(term559458, term559458.getClass(), "eventMask", 0L);
        setField(term559458, term559458.getClass(), "changeSupport", null);
        setField(term559458, term559458.getClass(), "objectLock", null);
        setBooleanField(term559458, term559458.getClass(), "isPacked", false);
        setIntField(term559458, term559458.getClass(), "boundsOp", 0);
        setField(term559458, term559458.getClass(), "compoundShape", null);
        setField(term559458, term559458.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term559458, term559458.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term559458, term559458.getClass(), "backgroundEraseDisabled", false);
        setField(term559458, term559458.getClass(), "eventCache", null);
        setBooleanField(term559458, term559458.getClass(), "coalescingEnabled", false);
        setBooleanField(term559458, term559458.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term559458, term559458.getClass(), "componentSerializedDataVersion", 0);
        setField(term559458, term559458.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.LeaderView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateButtonToolTips", argTypes, term559458, args);
    }

};


