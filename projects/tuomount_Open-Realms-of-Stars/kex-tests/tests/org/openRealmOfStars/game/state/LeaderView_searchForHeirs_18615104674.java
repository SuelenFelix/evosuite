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

public class LeaderView_searchForHeirs_18615104674 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term517881;

    public LeaderView_searchForHeirs_18615104674() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term517881 = newInstance(Class.forName("org.openRealmOfStars.game.state.LeaderView"));
        setField(term517881, term517881.getClass(), "player", null);
        setField(term517881, term517881.getClass(), "map", null);
        setField(term517881, term517881.getClass(), "leaderTree", null);
        setField(term517881, term517881.getClass(), "leaderList", null);
        setField(term517881, term517881.getClass(), "credits", null);
        setField(term517881, term517881.getClass(), "planetPopulation", null);
        setField(term517881, term517881.getClass(), "infoText", null);
        setField(term517881, term517881.getClass(), "mapPanel", null);
        setField(term517881, term517881.getClass(), "trainingPlanet", null);
        setField(term517881, term517881.getClass(), "recruitBtn", null);
        setField(term517881, term517881.getClass(), "setLeaderBtn", null);
        setField(term517881, term517881.getClass(), "activePlanet", null);
        setField(term517881, term517881.getClass(), "activeFleet", null);
        setField(term517881, term517881.getClass(), "leadersInPool", null);
        setBooleanField(term517881, term517881.getClass(), "standardLeaderSelected", false);
        setBooleanField(term517881, term517881.getClass(), "isAlignmentXSet", false);
        setFloatField(term517881, term517881.getClass(), "alignmentX", 0.0F);
        setBooleanField(term517881, term517881.getClass(), "isAlignmentYSet", false);
        setFloatField(term517881, term517881.getClass(), "alignmentY", 0.0F);
        setField(term517881, term517881.getClass(), "ui", null);
        setField(term517881, term517881.getClass(), "listenerList", null);
        setField(term517881, term517881.getClass(), "clientProperties", null);
        setField(term517881, term517881.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term517881, term517881.getClass(), "autoscrolls", false);
        setField(term517881, term517881.getClass(), "border", null);
        setIntField(term517881, term517881.getClass(), "flags", 0);
        setField(term517881, term517881.getClass(), "inputVerifier", null);
        setBooleanField(term517881, term517881.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term517881, term517881.getClass(), "paintingChild", null);
        setField(term517881, term517881.getClass(), "popupMenu", null);
        setField(term517881, term517881.getClass(), "revalidateRunnableScheduled", null);
        setField(term517881, term517881.getClass(), "focusInputMap", null);
        setField(term517881, term517881.getClass(), "ancestorInputMap", null);
        setField(term517881, term517881.getClass(), "windowInputMap", null);
        setField(term517881, term517881.getClass(), "actionMap", null);
        setField(term517881, term517881.getClass(), "aaHint", null);
        setField(term517881, term517881.getClass(), "lcdRenderingHint", null);
        setField(term517881, term517881.getClass(), "component", null);
        setField(term517881, term517881.getClass(), "layoutMgr", null);
        setField(term517881, term517881.getClass(), "dispatcher", null);
        setField(term517881, term517881.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term517881, term517881.getClass(), "focusCycleRoot", false);
        setBooleanField(term517881, term517881.getClass(), "focusTraversalPolicyProvider", false);
        setField(term517881, term517881.getClass(), "printingThreads", null);
        setBooleanField(term517881, term517881.getClass(), "printing", false);
        setField(term517881, term517881.getClass(), "containerListener", null);
        setIntField(term517881, term517881.getClass(), "listeningChildren", 0);
        setIntField(term517881, term517881.getClass(), "listeningBoundsChildren", 0);
        setIntField(term517881, term517881.getClass(), "descendantsCount", 0);
        setField(term517881, term517881.getClass(), "preserveBackgroundColor", null);
        setIntField(term517881, term517881.getClass(), "numOfHWComponents", 0);
        setIntField(term517881, term517881.getClass(), "numOfLWComponents", 0);
        setField(term517881, term517881.getClass(), "modalComp", null);
        setField(term517881, term517881.getClass(), "modalAppContext", null);
        setIntField(term517881, term517881.getClass(), "containerSerializedDataVersion", 0);
        setField(term517881, term517881.getClass(), "peer", null);
        setField(term517881, term517881.getClass(), "parent", null);
        setField(term517881, term517881.getClass(), "appContext", null);
        setIntField(term517881, term517881.getClass(), "x", 0);
        setIntField(term517881, term517881.getClass(), "y", 0);
        setIntField(term517881, term517881.getClass(), "width", 0);
        setIntField(term517881, term517881.getClass(), "height", 0);
        setField(term517881, term517881.getClass(), "foreground", null);
        setField(term517881, term517881.getClass(), "background", null);
        setField(term517881, term517881.getClass(), "font", null);
        setField(term517881, term517881.getClass(), "peerFont", null);
        setField(term517881, term517881.getClass(), "cursor", null);
        setField(term517881, term517881.getClass(), "locale", null);
        setField(term517881, term517881.getClass(), "graphicsConfig", null);
        setField(term517881, term517881.getClass(), "bufferStrategy", null);
        setBooleanField(term517881, term517881.getClass(), "ignoreRepaint", false);
        setBooleanField(term517881, term517881.getClass(), "visible", false);
        setBooleanField(term517881, term517881.getClass(), "enabled", false);
        setBooleanField(term517881, term517881.getClass(), "valid", false);
        setField(term517881, term517881.getClass(), "dropTarget", null);
        setField(term517881, term517881.getClass(), "popups", null);
        setField(term517881, term517881.getClass(), "name", null);
        setBooleanField(term517881, term517881.getClass(), "nameExplicitlySet", false);
        setBooleanField(term517881, term517881.getClass(), "focusable", false);
        setIntField(term517881, term517881.getClass(), "isFocusTraversableOverridden", 0);
        setField(term517881, term517881.getClass(), "focusTraversalKeys", null);
        setBooleanField(term517881, term517881.getClass(), "focusTraversalKeysEnabled", false);
        setField(term517881, term517881.getClass(), "acc", null);
        setField(term517881, term517881.getClass(), "minSize", null);
        setBooleanField(term517881, term517881.getClass(), "minSizeSet", false);
        setField(term517881, term517881.getClass(), "prefSize", null);
        setBooleanField(term517881, term517881.getClass(), "prefSizeSet", false);
        setField(term517881, term517881.getClass(), "maxSize", null);
        setBooleanField(term517881, term517881.getClass(), "maxSizeSet", false);
        setField(term517881, term517881.getClass(), "componentOrientation", null);
        setBooleanField(term517881, term517881.getClass(), "newEventsOnly", false);
        setField(term517881, term517881.getClass(), "componentListener", null);
        setField(term517881, term517881.getClass(), "focusListener", null);
        setField(term517881, term517881.getClass(), "hierarchyListener", null);
        setField(term517881, term517881.getClass(), "hierarchyBoundsListener", null);
        setField(term517881, term517881.getClass(), "keyListener", null);
        setField(term517881, term517881.getClass(), "mouseListener", null);
        setField(term517881, term517881.getClass(), "mouseMotionListener", null);
        setField(term517881, term517881.getClass(), "mouseWheelListener", null);
        setField(term517881, term517881.getClass(), "inputMethodListener", null);
        setLongField(term517881, term517881.getClass(), "eventMask", 0L);
        setField(term517881, term517881.getClass(), "changeSupport", null);
        setField(term517881, term517881.getClass(), "objectLock", null);
        setBooleanField(term517881, term517881.getClass(), "isPacked", false);
        setIntField(term517881, term517881.getClass(), "boundsOp", 0);
        setField(term517881, term517881.getClass(), "compoundShape", null);
        setField(term517881, term517881.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term517881, term517881.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term517881, term517881.getClass(), "backgroundEraseDisabled", false);
        setField(term517881, term517881.getClass(), "eventCache", null);
        setBooleanField(term517881, term517881.getClass(), "coalescingEnabled", false);
        setBooleanField(term517881, term517881.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term517881, term517881.getClass(), "componentSerializedDataVersion", 0);
        setField(term517881, term517881.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.LeaderView");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("javax.swing.tree.DefaultMutableTreeNode");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.leader.Leader");
        argTypes[2] = Array.newInstance(Class.forName("org.openRealmOfStars.player.leader.Leader"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "searchForHeirs", argTypes, term517881, args);
    }

};


