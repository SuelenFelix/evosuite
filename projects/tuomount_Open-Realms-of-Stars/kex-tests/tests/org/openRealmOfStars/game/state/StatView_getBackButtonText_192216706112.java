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

public class StatView_getBackButtonText_192216706112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term376489;

    public StatView_getBackButtonText_192216706112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term376489 = newInstance(Class.forName("org.openRealmOfStars.game.state.StatView"));
        setField(term376489, term376489.getClass(), "backBtn", null);
        setBooleanField(term376489, term376489.getClass(), "highestScore", false);
        setBooleanField(term376489, term376489.getClass(), "highestCulture", false);
        setBooleanField(term376489, term376489.getClass(), "highestHomePlanets", false);
        setBooleanField(term376489, term376489.getClass(), "highestTowers", false);
        setBooleanField(term376489, term376489.getClass(), "highestScience", false);
        setBooleanField(term376489, term376489.getClass(), "highestPopulation", false);
        setField(term376489, term376489.getClass(), "starMap", null);
        setField(term376489, term376489.getClass(), "winningCombo", null);
        setBooleanField(term376489, term376489.getClass(), "isAlignmentXSet", false);
        setFloatField(term376489, term376489.getClass(), "alignmentX", 0.0F);
        setBooleanField(term376489, term376489.getClass(), "isAlignmentYSet", false);
        setFloatField(term376489, term376489.getClass(), "alignmentY", 0.0F);
        setField(term376489, term376489.getClass(), "ui", null);
        setField(term376489, term376489.getClass(), "listenerList", null);
        setField(term376489, term376489.getClass(), "clientProperties", null);
        setField(term376489, term376489.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term376489, term376489.getClass(), "autoscrolls", false);
        setField(term376489, term376489.getClass(), "border", null);
        setIntField(term376489, term376489.getClass(), "flags", 0);
        setField(term376489, term376489.getClass(), "inputVerifier", null);
        setBooleanField(term376489, term376489.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term376489, term376489.getClass(), "paintingChild", null);
        setField(term376489, term376489.getClass(), "popupMenu", null);
        setField(term376489, term376489.getClass(), "revalidateRunnableScheduled", null);
        setField(term376489, term376489.getClass(), "focusInputMap", null);
        setField(term376489, term376489.getClass(), "ancestorInputMap", null);
        setField(term376489, term376489.getClass(), "windowInputMap", null);
        setField(term376489, term376489.getClass(), "actionMap", null);
        setField(term376489, term376489.getClass(), "aaHint", null);
        setField(term376489, term376489.getClass(), "lcdRenderingHint", null);
        setField(term376489, term376489.getClass(), "component", null);
        setField(term376489, term376489.getClass(), "layoutMgr", null);
        setField(term376489, term376489.getClass(), "dispatcher", null);
        setField(term376489, term376489.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term376489, term376489.getClass(), "focusCycleRoot", false);
        setBooleanField(term376489, term376489.getClass(), "focusTraversalPolicyProvider", false);
        setField(term376489, term376489.getClass(), "printingThreads", null);
        setBooleanField(term376489, term376489.getClass(), "printing", false);
        setField(term376489, term376489.getClass(), "containerListener", null);
        setIntField(term376489, term376489.getClass(), "listeningChildren", 0);
        setIntField(term376489, term376489.getClass(), "listeningBoundsChildren", 0);
        setIntField(term376489, term376489.getClass(), "descendantsCount", 0);
        setField(term376489, term376489.getClass(), "preserveBackgroundColor", null);
        setIntField(term376489, term376489.getClass(), "numOfHWComponents", 0);
        setIntField(term376489, term376489.getClass(), "numOfLWComponents", 0);
        setField(term376489, term376489.getClass(), "modalComp", null);
        setField(term376489, term376489.getClass(), "modalAppContext", null);
        setIntField(term376489, term376489.getClass(), "containerSerializedDataVersion", 0);
        setField(term376489, term376489.getClass(), "peer", null);
        setField(term376489, term376489.getClass(), "parent", null);
        setField(term376489, term376489.getClass(), "appContext", null);
        setIntField(term376489, term376489.getClass(), "x", 0);
        setIntField(term376489, term376489.getClass(), "y", 0);
        setIntField(term376489, term376489.getClass(), "width", 0);
        setIntField(term376489, term376489.getClass(), "height", 0);
        setField(term376489, term376489.getClass(), "foreground", null);
        setField(term376489, term376489.getClass(), "background", null);
        setField(term376489, term376489.getClass(), "font", null);
        setField(term376489, term376489.getClass(), "peerFont", null);
        setField(term376489, term376489.getClass(), "cursor", null);
        setField(term376489, term376489.getClass(), "locale", null);
        setField(term376489, term376489.getClass(), "graphicsConfig", null);
        setField(term376489, term376489.getClass(), "bufferStrategy", null);
        setBooleanField(term376489, term376489.getClass(), "ignoreRepaint", false);
        setBooleanField(term376489, term376489.getClass(), "visible", false);
        setBooleanField(term376489, term376489.getClass(), "enabled", false);
        setBooleanField(term376489, term376489.getClass(), "valid", false);
        setField(term376489, term376489.getClass(), "dropTarget", null);
        setField(term376489, term376489.getClass(), "popups", null);
        setField(term376489, term376489.getClass(), "name", null);
        setBooleanField(term376489, term376489.getClass(), "nameExplicitlySet", false);
        setBooleanField(term376489, term376489.getClass(), "focusable", false);
        setIntField(term376489, term376489.getClass(), "isFocusTraversableOverridden", 0);
        setField(term376489, term376489.getClass(), "focusTraversalKeys", null);
        setBooleanField(term376489, term376489.getClass(), "focusTraversalKeysEnabled", false);
        setField(term376489, term376489.getClass(), "acc", null);
        setField(term376489, term376489.getClass(), "minSize", null);
        setBooleanField(term376489, term376489.getClass(), "minSizeSet", false);
        setField(term376489, term376489.getClass(), "prefSize", null);
        setBooleanField(term376489, term376489.getClass(), "prefSizeSet", false);
        setField(term376489, term376489.getClass(), "maxSize", null);
        setBooleanField(term376489, term376489.getClass(), "maxSizeSet", false);
        setField(term376489, term376489.getClass(), "componentOrientation", null);
        setBooleanField(term376489, term376489.getClass(), "newEventsOnly", false);
        setField(term376489, term376489.getClass(), "componentListener", null);
        setField(term376489, term376489.getClass(), "focusListener", null);
        setField(term376489, term376489.getClass(), "hierarchyListener", null);
        setField(term376489, term376489.getClass(), "hierarchyBoundsListener", null);
        setField(term376489, term376489.getClass(), "keyListener", null);
        setField(term376489, term376489.getClass(), "mouseListener", null);
        setField(term376489, term376489.getClass(), "mouseMotionListener", null);
        setField(term376489, term376489.getClass(), "mouseWheelListener", null);
        setField(term376489, term376489.getClass(), "inputMethodListener", null);
        setLongField(term376489, term376489.getClass(), "eventMask", 0L);
        setField(term376489, term376489.getClass(), "changeSupport", null);
        setField(term376489, term376489.getClass(), "objectLock", null);
        setBooleanField(term376489, term376489.getClass(), "isPacked", false);
        setIntField(term376489, term376489.getClass(), "boundsOp", 0);
        setField(term376489, term376489.getClass(), "compoundShape", null);
        setField(term376489, term376489.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term376489, term376489.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term376489, term376489.getClass(), "backgroundEraseDisabled", false);
        setField(term376489, term376489.getClass(), "eventCache", null);
        setBooleanField(term376489, term376489.getClass(), "coalescingEnabled", false);
        setBooleanField(term376489, term376489.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term376489, term376489.getClass(), "componentSerializedDataVersion", 0);
        setField(term376489, term376489.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.StatView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBackButtonText", argTypes, term376489, args);
    }

};


