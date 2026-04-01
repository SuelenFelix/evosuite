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

public class StatView_setBackButtonText_153140127711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term376442;

    public StatView_setBackButtonText_153140127711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term376442 = newInstance(Class.forName("org.openRealmOfStars.game.state.StatView"));
        setField(term376442, term376442.getClass(), "backBtn", null);
        setBooleanField(term376442, term376442.getClass(), "highestScore", false);
        setBooleanField(term376442, term376442.getClass(), "highestCulture", false);
        setBooleanField(term376442, term376442.getClass(), "highestHomePlanets", false);
        setBooleanField(term376442, term376442.getClass(), "highestTowers", false);
        setBooleanField(term376442, term376442.getClass(), "highestScience", false);
        setBooleanField(term376442, term376442.getClass(), "highestPopulation", false);
        setField(term376442, term376442.getClass(), "starMap", null);
        setField(term376442, term376442.getClass(), "winningCombo", null);
        setBooleanField(term376442, term376442.getClass(), "isAlignmentXSet", false);
        setFloatField(term376442, term376442.getClass(), "alignmentX", 0.0F);
        setBooleanField(term376442, term376442.getClass(), "isAlignmentYSet", false);
        setFloatField(term376442, term376442.getClass(), "alignmentY", 0.0F);
        setField(term376442, term376442.getClass(), "ui", null);
        setField(term376442, term376442.getClass(), "listenerList", null);
        setField(term376442, term376442.getClass(), "clientProperties", null);
        setField(term376442, term376442.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term376442, term376442.getClass(), "autoscrolls", false);
        setField(term376442, term376442.getClass(), "border", null);
        setIntField(term376442, term376442.getClass(), "flags", 0);
        setField(term376442, term376442.getClass(), "inputVerifier", null);
        setBooleanField(term376442, term376442.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term376442, term376442.getClass(), "paintingChild", null);
        setField(term376442, term376442.getClass(), "popupMenu", null);
        setField(term376442, term376442.getClass(), "revalidateRunnableScheduled", null);
        setField(term376442, term376442.getClass(), "focusInputMap", null);
        setField(term376442, term376442.getClass(), "ancestorInputMap", null);
        setField(term376442, term376442.getClass(), "windowInputMap", null);
        setField(term376442, term376442.getClass(), "actionMap", null);
        setField(term376442, term376442.getClass(), "aaHint", null);
        setField(term376442, term376442.getClass(), "lcdRenderingHint", null);
        setField(term376442, term376442.getClass(), "component", null);
        setField(term376442, term376442.getClass(), "layoutMgr", null);
        setField(term376442, term376442.getClass(), "dispatcher", null);
        setField(term376442, term376442.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term376442, term376442.getClass(), "focusCycleRoot", false);
        setBooleanField(term376442, term376442.getClass(), "focusTraversalPolicyProvider", false);
        setField(term376442, term376442.getClass(), "printingThreads", null);
        setBooleanField(term376442, term376442.getClass(), "printing", false);
        setField(term376442, term376442.getClass(), "containerListener", null);
        setIntField(term376442, term376442.getClass(), "listeningChildren", 0);
        setIntField(term376442, term376442.getClass(), "listeningBoundsChildren", 0);
        setIntField(term376442, term376442.getClass(), "descendantsCount", 0);
        setField(term376442, term376442.getClass(), "preserveBackgroundColor", null);
        setIntField(term376442, term376442.getClass(), "numOfHWComponents", 0);
        setIntField(term376442, term376442.getClass(), "numOfLWComponents", 0);
        setField(term376442, term376442.getClass(), "modalComp", null);
        setField(term376442, term376442.getClass(), "modalAppContext", null);
        setIntField(term376442, term376442.getClass(), "containerSerializedDataVersion", 0);
        setField(term376442, term376442.getClass(), "peer", null);
        setField(term376442, term376442.getClass(), "parent", null);
        setField(term376442, term376442.getClass(), "appContext", null);
        setIntField(term376442, term376442.getClass(), "x", 0);
        setIntField(term376442, term376442.getClass(), "y", 0);
        setIntField(term376442, term376442.getClass(), "width", 0);
        setIntField(term376442, term376442.getClass(), "height", 0);
        setField(term376442, term376442.getClass(), "foreground", null);
        setField(term376442, term376442.getClass(), "background", null);
        setField(term376442, term376442.getClass(), "font", null);
        setField(term376442, term376442.getClass(), "peerFont", null);
        setField(term376442, term376442.getClass(), "cursor", null);
        setField(term376442, term376442.getClass(), "locale", null);
        setField(term376442, term376442.getClass(), "graphicsConfig", null);
        setField(term376442, term376442.getClass(), "bufferStrategy", null);
        setBooleanField(term376442, term376442.getClass(), "ignoreRepaint", false);
        setBooleanField(term376442, term376442.getClass(), "visible", false);
        setBooleanField(term376442, term376442.getClass(), "enabled", false);
        setBooleanField(term376442, term376442.getClass(), "valid", false);
        setField(term376442, term376442.getClass(), "dropTarget", null);
        setField(term376442, term376442.getClass(), "popups", null);
        setField(term376442, term376442.getClass(), "name", null);
        setBooleanField(term376442, term376442.getClass(), "nameExplicitlySet", false);
        setBooleanField(term376442, term376442.getClass(), "focusable", false);
        setIntField(term376442, term376442.getClass(), "isFocusTraversableOverridden", 0);
        setField(term376442, term376442.getClass(), "focusTraversalKeys", null);
        setBooleanField(term376442, term376442.getClass(), "focusTraversalKeysEnabled", false);
        setField(term376442, term376442.getClass(), "acc", null);
        setField(term376442, term376442.getClass(), "minSize", null);
        setBooleanField(term376442, term376442.getClass(), "minSizeSet", false);
        setField(term376442, term376442.getClass(), "prefSize", null);
        setBooleanField(term376442, term376442.getClass(), "prefSizeSet", false);
        setField(term376442, term376442.getClass(), "maxSize", null);
        setBooleanField(term376442, term376442.getClass(), "maxSizeSet", false);
        setField(term376442, term376442.getClass(), "componentOrientation", null);
        setBooleanField(term376442, term376442.getClass(), "newEventsOnly", false);
        setField(term376442, term376442.getClass(), "componentListener", null);
        setField(term376442, term376442.getClass(), "focusListener", null);
        setField(term376442, term376442.getClass(), "hierarchyListener", null);
        setField(term376442, term376442.getClass(), "hierarchyBoundsListener", null);
        setField(term376442, term376442.getClass(), "keyListener", null);
        setField(term376442, term376442.getClass(), "mouseListener", null);
        setField(term376442, term376442.getClass(), "mouseMotionListener", null);
        setField(term376442, term376442.getClass(), "mouseWheelListener", null);
        setField(term376442, term376442.getClass(), "inputMethodListener", null);
        setLongField(term376442, term376442.getClass(), "eventMask", 0L);
        setField(term376442, term376442.getClass(), "changeSupport", null);
        setField(term376442, term376442.getClass(), "objectLock", null);
        setBooleanField(term376442, term376442.getClass(), "isPacked", false);
        setIntField(term376442, term376442.getClass(), "boundsOp", 0);
        setField(term376442, term376442.getClass(), "compoundShape", null);
        setField(term376442, term376442.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term376442, term376442.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term376442, term376442.getClass(), "backgroundEraseDisabled", false);
        setField(term376442, term376442.getClass(), "eventCache", null);
        setBooleanField(term376442, term376442.getClass(), "coalescingEnabled", false);
        setBooleanField(term376442, term376442.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term376442, term376442.getClass(), "componentSerializedDataVersion", 0);
        setField(term376442, term376442.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.StatView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setBackButtonText", argTypes, term376442, args);
    }

};


