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

public class StatView_createRelationPanel_146249424915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term376630;

    public StatView_createRelationPanel_146249424915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term376630 = newInstance(Class.forName("org.openRealmOfStars.game.state.StatView"));
        setField(term376630, term376630.getClass(), "backBtn", null);
        setBooleanField(term376630, term376630.getClass(), "highestScore", false);
        setBooleanField(term376630, term376630.getClass(), "highestCulture", false);
        setBooleanField(term376630, term376630.getClass(), "highestHomePlanets", false);
        setBooleanField(term376630, term376630.getClass(), "highestTowers", false);
        setBooleanField(term376630, term376630.getClass(), "highestScience", false);
        setBooleanField(term376630, term376630.getClass(), "highestPopulation", false);
        setField(term376630, term376630.getClass(), "starMap", null);
        setField(term376630, term376630.getClass(), "winningCombo", null);
        setBooleanField(term376630, term376630.getClass(), "isAlignmentXSet", false);
        setFloatField(term376630, term376630.getClass(), "alignmentX", 0.0F);
        setBooleanField(term376630, term376630.getClass(), "isAlignmentYSet", false);
        setFloatField(term376630, term376630.getClass(), "alignmentY", 0.0F);
        setField(term376630, term376630.getClass(), "ui", null);
        setField(term376630, term376630.getClass(), "listenerList", null);
        setField(term376630, term376630.getClass(), "clientProperties", null);
        setField(term376630, term376630.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term376630, term376630.getClass(), "autoscrolls", false);
        setField(term376630, term376630.getClass(), "border", null);
        setIntField(term376630, term376630.getClass(), "flags", 0);
        setField(term376630, term376630.getClass(), "inputVerifier", null);
        setBooleanField(term376630, term376630.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term376630, term376630.getClass(), "paintingChild", null);
        setField(term376630, term376630.getClass(), "popupMenu", null);
        setField(term376630, term376630.getClass(), "revalidateRunnableScheduled", null);
        setField(term376630, term376630.getClass(), "focusInputMap", null);
        setField(term376630, term376630.getClass(), "ancestorInputMap", null);
        setField(term376630, term376630.getClass(), "windowInputMap", null);
        setField(term376630, term376630.getClass(), "actionMap", null);
        setField(term376630, term376630.getClass(), "aaHint", null);
        setField(term376630, term376630.getClass(), "lcdRenderingHint", null);
        setField(term376630, term376630.getClass(), "component", null);
        setField(term376630, term376630.getClass(), "layoutMgr", null);
        setField(term376630, term376630.getClass(), "dispatcher", null);
        setField(term376630, term376630.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term376630, term376630.getClass(), "focusCycleRoot", false);
        setBooleanField(term376630, term376630.getClass(), "focusTraversalPolicyProvider", false);
        setField(term376630, term376630.getClass(), "printingThreads", null);
        setBooleanField(term376630, term376630.getClass(), "printing", false);
        setField(term376630, term376630.getClass(), "containerListener", null);
        setIntField(term376630, term376630.getClass(), "listeningChildren", 0);
        setIntField(term376630, term376630.getClass(), "listeningBoundsChildren", 0);
        setIntField(term376630, term376630.getClass(), "descendantsCount", 0);
        setField(term376630, term376630.getClass(), "preserveBackgroundColor", null);
        setIntField(term376630, term376630.getClass(), "numOfHWComponents", 0);
        setIntField(term376630, term376630.getClass(), "numOfLWComponents", 0);
        setField(term376630, term376630.getClass(), "modalComp", null);
        setField(term376630, term376630.getClass(), "modalAppContext", null);
        setIntField(term376630, term376630.getClass(), "containerSerializedDataVersion", 0);
        setField(term376630, term376630.getClass(), "peer", null);
        setField(term376630, term376630.getClass(), "parent", null);
        setField(term376630, term376630.getClass(), "appContext", null);
        setIntField(term376630, term376630.getClass(), "x", 0);
        setIntField(term376630, term376630.getClass(), "y", 0);
        setIntField(term376630, term376630.getClass(), "width", 0);
        setIntField(term376630, term376630.getClass(), "height", 0);
        setField(term376630, term376630.getClass(), "foreground", null);
        setField(term376630, term376630.getClass(), "background", null);
        setField(term376630, term376630.getClass(), "font", null);
        setField(term376630, term376630.getClass(), "peerFont", null);
        setField(term376630, term376630.getClass(), "cursor", null);
        setField(term376630, term376630.getClass(), "locale", null);
        setField(term376630, term376630.getClass(), "graphicsConfig", null);
        setField(term376630, term376630.getClass(), "bufferStrategy", null);
        setBooleanField(term376630, term376630.getClass(), "ignoreRepaint", false);
        setBooleanField(term376630, term376630.getClass(), "visible", false);
        setBooleanField(term376630, term376630.getClass(), "enabled", false);
        setBooleanField(term376630, term376630.getClass(), "valid", false);
        setField(term376630, term376630.getClass(), "dropTarget", null);
        setField(term376630, term376630.getClass(), "popups", null);
        setField(term376630, term376630.getClass(), "name", null);
        setBooleanField(term376630, term376630.getClass(), "nameExplicitlySet", false);
        setBooleanField(term376630, term376630.getClass(), "focusable", false);
        setIntField(term376630, term376630.getClass(), "isFocusTraversableOverridden", 0);
        setField(term376630, term376630.getClass(), "focusTraversalKeys", null);
        setBooleanField(term376630, term376630.getClass(), "focusTraversalKeysEnabled", false);
        setField(term376630, term376630.getClass(), "acc", null);
        setField(term376630, term376630.getClass(), "minSize", null);
        setBooleanField(term376630, term376630.getClass(), "minSizeSet", false);
        setField(term376630, term376630.getClass(), "prefSize", null);
        setBooleanField(term376630, term376630.getClass(), "prefSizeSet", false);
        setField(term376630, term376630.getClass(), "maxSize", null);
        setBooleanField(term376630, term376630.getClass(), "maxSizeSet", false);
        setField(term376630, term376630.getClass(), "componentOrientation", null);
        setBooleanField(term376630, term376630.getClass(), "newEventsOnly", false);
        setField(term376630, term376630.getClass(), "componentListener", null);
        setField(term376630, term376630.getClass(), "focusListener", null);
        setField(term376630, term376630.getClass(), "hierarchyListener", null);
        setField(term376630, term376630.getClass(), "hierarchyBoundsListener", null);
        setField(term376630, term376630.getClass(), "keyListener", null);
        setField(term376630, term376630.getClass(), "mouseListener", null);
        setField(term376630, term376630.getClass(), "mouseMotionListener", null);
        setField(term376630, term376630.getClass(), "mouseWheelListener", null);
        setField(term376630, term376630.getClass(), "inputMethodListener", null);
        setLongField(term376630, term376630.getClass(), "eventMask", 0L);
        setField(term376630, term376630.getClass(), "changeSupport", null);
        setField(term376630, term376630.getClass(), "objectLock", null);
        setBooleanField(term376630, term376630.getClass(), "isPacked", false);
        setIntField(term376630, term376630.getClass(), "boundsOp", 0);
        setField(term376630, term376630.getClass(), "compoundShape", null);
        setField(term376630, term376630.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term376630, term376630.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term376630, term376630.getClass(), "backgroundEraseDisabled", false);
        setField(term376630, term376630.getClass(), "eventCache", null);
        setBooleanField(term376630, term376630.getClass(), "coalescingEnabled", false);
        setBooleanField(term376630, term376630.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term376630, term376630.getClass(), "componentSerializedDataVersion", 0);
        setField(term376630, term376630.getClass(), "accessibleContext", null);
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
        callMethod(klass, "createRelationPanel", argTypes, term376630, args);
    }

};


