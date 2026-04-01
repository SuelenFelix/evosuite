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

public class StatView_createWinningPanel_152228715514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term376583;

    public StatView_createWinningPanel_152228715514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term376583 = newInstance(Class.forName("org.openRealmOfStars.game.state.StatView"));
        setField(term376583, term376583.getClass(), "backBtn", null);
        setBooleanField(term376583, term376583.getClass(), "highestScore", false);
        setBooleanField(term376583, term376583.getClass(), "highestCulture", false);
        setBooleanField(term376583, term376583.getClass(), "highestHomePlanets", false);
        setBooleanField(term376583, term376583.getClass(), "highestTowers", false);
        setBooleanField(term376583, term376583.getClass(), "highestScience", false);
        setBooleanField(term376583, term376583.getClass(), "highestPopulation", false);
        setField(term376583, term376583.getClass(), "starMap", null);
        setField(term376583, term376583.getClass(), "winningCombo", null);
        setBooleanField(term376583, term376583.getClass(), "isAlignmentXSet", false);
        setFloatField(term376583, term376583.getClass(), "alignmentX", 0.0F);
        setBooleanField(term376583, term376583.getClass(), "isAlignmentYSet", false);
        setFloatField(term376583, term376583.getClass(), "alignmentY", 0.0F);
        setField(term376583, term376583.getClass(), "ui", null);
        setField(term376583, term376583.getClass(), "listenerList", null);
        setField(term376583, term376583.getClass(), "clientProperties", null);
        setField(term376583, term376583.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term376583, term376583.getClass(), "autoscrolls", false);
        setField(term376583, term376583.getClass(), "border", null);
        setIntField(term376583, term376583.getClass(), "flags", 0);
        setField(term376583, term376583.getClass(), "inputVerifier", null);
        setBooleanField(term376583, term376583.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term376583, term376583.getClass(), "paintingChild", null);
        setField(term376583, term376583.getClass(), "popupMenu", null);
        setField(term376583, term376583.getClass(), "revalidateRunnableScheduled", null);
        setField(term376583, term376583.getClass(), "focusInputMap", null);
        setField(term376583, term376583.getClass(), "ancestorInputMap", null);
        setField(term376583, term376583.getClass(), "windowInputMap", null);
        setField(term376583, term376583.getClass(), "actionMap", null);
        setField(term376583, term376583.getClass(), "aaHint", null);
        setField(term376583, term376583.getClass(), "lcdRenderingHint", null);
        setField(term376583, term376583.getClass(), "component", null);
        setField(term376583, term376583.getClass(), "layoutMgr", null);
        setField(term376583, term376583.getClass(), "dispatcher", null);
        setField(term376583, term376583.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term376583, term376583.getClass(), "focusCycleRoot", false);
        setBooleanField(term376583, term376583.getClass(), "focusTraversalPolicyProvider", false);
        setField(term376583, term376583.getClass(), "printingThreads", null);
        setBooleanField(term376583, term376583.getClass(), "printing", false);
        setField(term376583, term376583.getClass(), "containerListener", null);
        setIntField(term376583, term376583.getClass(), "listeningChildren", 0);
        setIntField(term376583, term376583.getClass(), "listeningBoundsChildren", 0);
        setIntField(term376583, term376583.getClass(), "descendantsCount", 0);
        setField(term376583, term376583.getClass(), "preserveBackgroundColor", null);
        setIntField(term376583, term376583.getClass(), "numOfHWComponents", 0);
        setIntField(term376583, term376583.getClass(), "numOfLWComponents", 0);
        setField(term376583, term376583.getClass(), "modalComp", null);
        setField(term376583, term376583.getClass(), "modalAppContext", null);
        setIntField(term376583, term376583.getClass(), "containerSerializedDataVersion", 0);
        setField(term376583, term376583.getClass(), "peer", null);
        setField(term376583, term376583.getClass(), "parent", null);
        setField(term376583, term376583.getClass(), "appContext", null);
        setIntField(term376583, term376583.getClass(), "x", 0);
        setIntField(term376583, term376583.getClass(), "y", 0);
        setIntField(term376583, term376583.getClass(), "width", 0);
        setIntField(term376583, term376583.getClass(), "height", 0);
        setField(term376583, term376583.getClass(), "foreground", null);
        setField(term376583, term376583.getClass(), "background", null);
        setField(term376583, term376583.getClass(), "font", null);
        setField(term376583, term376583.getClass(), "peerFont", null);
        setField(term376583, term376583.getClass(), "cursor", null);
        setField(term376583, term376583.getClass(), "locale", null);
        setField(term376583, term376583.getClass(), "graphicsConfig", null);
        setField(term376583, term376583.getClass(), "bufferStrategy", null);
        setBooleanField(term376583, term376583.getClass(), "ignoreRepaint", false);
        setBooleanField(term376583, term376583.getClass(), "visible", false);
        setBooleanField(term376583, term376583.getClass(), "enabled", false);
        setBooleanField(term376583, term376583.getClass(), "valid", false);
        setField(term376583, term376583.getClass(), "dropTarget", null);
        setField(term376583, term376583.getClass(), "popups", null);
        setField(term376583, term376583.getClass(), "name", null);
        setBooleanField(term376583, term376583.getClass(), "nameExplicitlySet", false);
        setBooleanField(term376583, term376583.getClass(), "focusable", false);
        setIntField(term376583, term376583.getClass(), "isFocusTraversableOverridden", 0);
        setField(term376583, term376583.getClass(), "focusTraversalKeys", null);
        setBooleanField(term376583, term376583.getClass(), "focusTraversalKeysEnabled", false);
        setField(term376583, term376583.getClass(), "acc", null);
        setField(term376583, term376583.getClass(), "minSize", null);
        setBooleanField(term376583, term376583.getClass(), "minSizeSet", false);
        setField(term376583, term376583.getClass(), "prefSize", null);
        setBooleanField(term376583, term376583.getClass(), "prefSizeSet", false);
        setField(term376583, term376583.getClass(), "maxSize", null);
        setBooleanField(term376583, term376583.getClass(), "maxSizeSet", false);
        setField(term376583, term376583.getClass(), "componentOrientation", null);
        setBooleanField(term376583, term376583.getClass(), "newEventsOnly", false);
        setField(term376583, term376583.getClass(), "componentListener", null);
        setField(term376583, term376583.getClass(), "focusListener", null);
        setField(term376583, term376583.getClass(), "hierarchyListener", null);
        setField(term376583, term376583.getClass(), "hierarchyBoundsListener", null);
        setField(term376583, term376583.getClass(), "keyListener", null);
        setField(term376583, term376583.getClass(), "mouseListener", null);
        setField(term376583, term376583.getClass(), "mouseMotionListener", null);
        setField(term376583, term376583.getClass(), "mouseWheelListener", null);
        setField(term376583, term376583.getClass(), "inputMethodListener", null);
        setLongField(term376583, term376583.getClass(), "eventMask", 0L);
        setField(term376583, term376583.getClass(), "changeSupport", null);
        setField(term376583, term376583.getClass(), "objectLock", null);
        setBooleanField(term376583, term376583.getClass(), "isPacked", false);
        setIntField(term376583, term376583.getClass(), "boundsOp", 0);
        setField(term376583, term376583.getClass(), "compoundShape", null);
        setField(term376583, term376583.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term376583, term376583.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term376583, term376583.getClass(), "backgroundEraseDisabled", false);
        setField(term376583, term376583.getClass(), "eventCache", null);
        setBooleanField(term376583, term376583.getClass(), "coalescingEnabled", false);
        setBooleanField(term376583, term376583.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term376583, term376583.getClass(), "componentSerializedDataVersion", 0);
        setField(term376583, term376583.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.StatView");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "createWinningPanel", argTypes, term376583, args);
    }

};


