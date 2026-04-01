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

public class StatView_getHighestShipStat_9649148744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term372832;
     Object term372879;

    public StatView_getHighestShipStat_9649148744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term372832 = newInstance(Class.forName("org.openRealmOfStars.game.state.StatView"));
        setField(term372832, term372832.getClass(), "backBtn", null);
        setBooleanField(term372832, term372832.getClass(), "highestScore", false);
        setBooleanField(term372832, term372832.getClass(), "highestCulture", false);
        setBooleanField(term372832, term372832.getClass(), "highestHomePlanets", false);
        setBooleanField(term372832, term372832.getClass(), "highestTowers", false);
        setBooleanField(term372832, term372832.getClass(), "highestScience", false);
        setBooleanField(term372832, term372832.getClass(), "highestPopulation", false);
        setField(term372832, term372832.getClass(), "starMap", null);
        setField(term372832, term372832.getClass(), "winningCombo", null);
        setBooleanField(term372832, term372832.getClass(), "isAlignmentXSet", false);
        setFloatField(term372832, term372832.getClass(), "alignmentX", 0.0F);
        setBooleanField(term372832, term372832.getClass(), "isAlignmentYSet", false);
        setFloatField(term372832, term372832.getClass(), "alignmentY", 0.0F);
        setField(term372832, term372832.getClass(), "ui", null);
        setField(term372832, term372832.getClass(), "listenerList", null);
        setField(term372832, term372832.getClass(), "clientProperties", null);
        setField(term372832, term372832.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term372832, term372832.getClass(), "autoscrolls", false);
        setField(term372832, term372832.getClass(), "border", null);
        setIntField(term372832, term372832.getClass(), "flags", 0);
        setField(term372832, term372832.getClass(), "inputVerifier", null);
        setBooleanField(term372832, term372832.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term372832, term372832.getClass(), "paintingChild", null);
        setField(term372832, term372832.getClass(), "popupMenu", null);
        setField(term372832, term372832.getClass(), "revalidateRunnableScheduled", null);
        setField(term372832, term372832.getClass(), "focusInputMap", null);
        setField(term372832, term372832.getClass(), "ancestorInputMap", null);
        setField(term372832, term372832.getClass(), "windowInputMap", null);
        setField(term372832, term372832.getClass(), "actionMap", null);
        setField(term372832, term372832.getClass(), "aaHint", null);
        setField(term372832, term372832.getClass(), "lcdRenderingHint", null);
        setField(term372832, term372832.getClass(), "component", null);
        setField(term372832, term372832.getClass(), "layoutMgr", null);
        setField(term372832, term372832.getClass(), "dispatcher", null);
        setField(term372832, term372832.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term372832, term372832.getClass(), "focusCycleRoot", false);
        setBooleanField(term372832, term372832.getClass(), "focusTraversalPolicyProvider", false);
        setField(term372832, term372832.getClass(), "printingThreads", null);
        setBooleanField(term372832, term372832.getClass(), "printing", false);
        setField(term372832, term372832.getClass(), "containerListener", null);
        setIntField(term372832, term372832.getClass(), "listeningChildren", 0);
        setIntField(term372832, term372832.getClass(), "listeningBoundsChildren", 0);
        setIntField(term372832, term372832.getClass(), "descendantsCount", 0);
        setField(term372832, term372832.getClass(), "preserveBackgroundColor", null);
        setIntField(term372832, term372832.getClass(), "numOfHWComponents", 0);
        setIntField(term372832, term372832.getClass(), "numOfLWComponents", 0);
        setField(term372832, term372832.getClass(), "modalComp", null);
        setField(term372832, term372832.getClass(), "modalAppContext", null);
        setIntField(term372832, term372832.getClass(), "containerSerializedDataVersion", 0);
        setField(term372832, term372832.getClass(), "peer", null);
        setField(term372832, term372832.getClass(), "parent", null);
        setField(term372832, term372832.getClass(), "appContext", null);
        setIntField(term372832, term372832.getClass(), "x", 0);
        setIntField(term372832, term372832.getClass(), "y", 0);
        setIntField(term372832, term372832.getClass(), "width", 0);
        setIntField(term372832, term372832.getClass(), "height", 0);
        setField(term372832, term372832.getClass(), "foreground", null);
        setField(term372832, term372832.getClass(), "background", null);
        setField(term372832, term372832.getClass(), "font", null);
        setField(term372832, term372832.getClass(), "peerFont", null);
        setField(term372832, term372832.getClass(), "cursor", null);
        setField(term372832, term372832.getClass(), "locale", null);
        setField(term372832, term372832.getClass(), "graphicsConfig", null);
        setField(term372832, term372832.getClass(), "bufferStrategy", null);
        setBooleanField(term372832, term372832.getClass(), "ignoreRepaint", false);
        setBooleanField(term372832, term372832.getClass(), "visible", false);
        setBooleanField(term372832, term372832.getClass(), "enabled", false);
        setBooleanField(term372832, term372832.getClass(), "valid", false);
        setField(term372832, term372832.getClass(), "dropTarget", null);
        setField(term372832, term372832.getClass(), "popups", null);
        setField(term372832, term372832.getClass(), "name", null);
        setBooleanField(term372832, term372832.getClass(), "nameExplicitlySet", false);
        setBooleanField(term372832, term372832.getClass(), "focusable", false);
        setIntField(term372832, term372832.getClass(), "isFocusTraversableOverridden", 0);
        setField(term372832, term372832.getClass(), "focusTraversalKeys", null);
        setBooleanField(term372832, term372832.getClass(), "focusTraversalKeysEnabled", false);
        setField(term372832, term372832.getClass(), "acc", null);
        setField(term372832, term372832.getClass(), "minSize", null);
        setBooleanField(term372832, term372832.getClass(), "minSizeSet", false);
        setField(term372832, term372832.getClass(), "prefSize", null);
        setBooleanField(term372832, term372832.getClass(), "prefSizeSet", false);
        setField(term372832, term372832.getClass(), "maxSize", null);
        setBooleanField(term372832, term372832.getClass(), "maxSizeSet", false);
        setField(term372832, term372832.getClass(), "componentOrientation", null);
        setBooleanField(term372832, term372832.getClass(), "newEventsOnly", false);
        setField(term372832, term372832.getClass(), "componentListener", null);
        setField(term372832, term372832.getClass(), "focusListener", null);
        setField(term372832, term372832.getClass(), "hierarchyListener", null);
        setField(term372832, term372832.getClass(), "hierarchyBoundsListener", null);
        setField(term372832, term372832.getClass(), "keyListener", null);
        setField(term372832, term372832.getClass(), "mouseListener", null);
        setField(term372832, term372832.getClass(), "mouseMotionListener", null);
        setField(term372832, term372832.getClass(), "mouseWheelListener", null);
        setField(term372832, term372832.getClass(), "inputMethodListener", null);
        setLongField(term372832, term372832.getClass(), "eventMask", 0L);
        setField(term372832, term372832.getClass(), "changeSupport", null);
        setField(term372832, term372832.getClass(), "objectLock", null);
        setBooleanField(term372832, term372832.getClass(), "isPacked", false);
        setIntField(term372832, term372832.getClass(), "boundsOp", 0);
        setField(term372832, term372832.getClass(), "compoundShape", null);
        setField(term372832, term372832.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term372832, term372832.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term372832, term372832.getClass(), "backgroundEraseDisabled", false);
        setField(term372832, term372832.getClass(), "eventCache", null);
        setBooleanField(term372832, term372832.getClass(), "coalescingEnabled", false);
        setBooleanField(term372832, term372832.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term372832, term372832.getClass(), "componentSerializedDataVersion", 0);
        setField(term372832, term372832.getClass(), "accessibleContext", null);
        term372879 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.StatView");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term372879;
        callMethod(klass, "getHighestShipStat", argTypes, term372832, args);
    }

};


