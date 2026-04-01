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

public class StatView_createShipStatPanel_161545703513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term376536;

    public StatView_createShipStatPanel_161545703513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term376536 = newInstance(Class.forName("org.openRealmOfStars.game.state.StatView"));
        setField(term376536, term376536.getClass(), "backBtn", null);
        setBooleanField(term376536, term376536.getClass(), "highestScore", false);
        setBooleanField(term376536, term376536.getClass(), "highestCulture", false);
        setBooleanField(term376536, term376536.getClass(), "highestHomePlanets", false);
        setBooleanField(term376536, term376536.getClass(), "highestTowers", false);
        setBooleanField(term376536, term376536.getClass(), "highestScience", false);
        setBooleanField(term376536, term376536.getClass(), "highestPopulation", false);
        setField(term376536, term376536.getClass(), "starMap", null);
        setField(term376536, term376536.getClass(), "winningCombo", null);
        setBooleanField(term376536, term376536.getClass(), "isAlignmentXSet", false);
        setFloatField(term376536, term376536.getClass(), "alignmentX", 0.0F);
        setBooleanField(term376536, term376536.getClass(), "isAlignmentYSet", false);
        setFloatField(term376536, term376536.getClass(), "alignmentY", 0.0F);
        setField(term376536, term376536.getClass(), "ui", null);
        setField(term376536, term376536.getClass(), "listenerList", null);
        setField(term376536, term376536.getClass(), "clientProperties", null);
        setField(term376536, term376536.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term376536, term376536.getClass(), "autoscrolls", false);
        setField(term376536, term376536.getClass(), "border", null);
        setIntField(term376536, term376536.getClass(), "flags", 0);
        setField(term376536, term376536.getClass(), "inputVerifier", null);
        setBooleanField(term376536, term376536.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term376536, term376536.getClass(), "paintingChild", null);
        setField(term376536, term376536.getClass(), "popupMenu", null);
        setField(term376536, term376536.getClass(), "revalidateRunnableScheduled", null);
        setField(term376536, term376536.getClass(), "focusInputMap", null);
        setField(term376536, term376536.getClass(), "ancestorInputMap", null);
        setField(term376536, term376536.getClass(), "windowInputMap", null);
        setField(term376536, term376536.getClass(), "actionMap", null);
        setField(term376536, term376536.getClass(), "aaHint", null);
        setField(term376536, term376536.getClass(), "lcdRenderingHint", null);
        setField(term376536, term376536.getClass(), "component", null);
        setField(term376536, term376536.getClass(), "layoutMgr", null);
        setField(term376536, term376536.getClass(), "dispatcher", null);
        setField(term376536, term376536.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term376536, term376536.getClass(), "focusCycleRoot", false);
        setBooleanField(term376536, term376536.getClass(), "focusTraversalPolicyProvider", false);
        setField(term376536, term376536.getClass(), "printingThreads", null);
        setBooleanField(term376536, term376536.getClass(), "printing", false);
        setField(term376536, term376536.getClass(), "containerListener", null);
        setIntField(term376536, term376536.getClass(), "listeningChildren", 0);
        setIntField(term376536, term376536.getClass(), "listeningBoundsChildren", 0);
        setIntField(term376536, term376536.getClass(), "descendantsCount", 0);
        setField(term376536, term376536.getClass(), "preserveBackgroundColor", null);
        setIntField(term376536, term376536.getClass(), "numOfHWComponents", 0);
        setIntField(term376536, term376536.getClass(), "numOfLWComponents", 0);
        setField(term376536, term376536.getClass(), "modalComp", null);
        setField(term376536, term376536.getClass(), "modalAppContext", null);
        setIntField(term376536, term376536.getClass(), "containerSerializedDataVersion", 0);
        setField(term376536, term376536.getClass(), "peer", null);
        setField(term376536, term376536.getClass(), "parent", null);
        setField(term376536, term376536.getClass(), "appContext", null);
        setIntField(term376536, term376536.getClass(), "x", 0);
        setIntField(term376536, term376536.getClass(), "y", 0);
        setIntField(term376536, term376536.getClass(), "width", 0);
        setIntField(term376536, term376536.getClass(), "height", 0);
        setField(term376536, term376536.getClass(), "foreground", null);
        setField(term376536, term376536.getClass(), "background", null);
        setField(term376536, term376536.getClass(), "font", null);
        setField(term376536, term376536.getClass(), "peerFont", null);
        setField(term376536, term376536.getClass(), "cursor", null);
        setField(term376536, term376536.getClass(), "locale", null);
        setField(term376536, term376536.getClass(), "graphicsConfig", null);
        setField(term376536, term376536.getClass(), "bufferStrategy", null);
        setBooleanField(term376536, term376536.getClass(), "ignoreRepaint", false);
        setBooleanField(term376536, term376536.getClass(), "visible", false);
        setBooleanField(term376536, term376536.getClass(), "enabled", false);
        setBooleanField(term376536, term376536.getClass(), "valid", false);
        setField(term376536, term376536.getClass(), "dropTarget", null);
        setField(term376536, term376536.getClass(), "popups", null);
        setField(term376536, term376536.getClass(), "name", null);
        setBooleanField(term376536, term376536.getClass(), "nameExplicitlySet", false);
        setBooleanField(term376536, term376536.getClass(), "focusable", false);
        setIntField(term376536, term376536.getClass(), "isFocusTraversableOverridden", 0);
        setField(term376536, term376536.getClass(), "focusTraversalKeys", null);
        setBooleanField(term376536, term376536.getClass(), "focusTraversalKeysEnabled", false);
        setField(term376536, term376536.getClass(), "acc", null);
        setField(term376536, term376536.getClass(), "minSize", null);
        setBooleanField(term376536, term376536.getClass(), "minSizeSet", false);
        setField(term376536, term376536.getClass(), "prefSize", null);
        setBooleanField(term376536, term376536.getClass(), "prefSizeSet", false);
        setField(term376536, term376536.getClass(), "maxSize", null);
        setBooleanField(term376536, term376536.getClass(), "maxSizeSet", false);
        setField(term376536, term376536.getClass(), "componentOrientation", null);
        setBooleanField(term376536, term376536.getClass(), "newEventsOnly", false);
        setField(term376536, term376536.getClass(), "componentListener", null);
        setField(term376536, term376536.getClass(), "focusListener", null);
        setField(term376536, term376536.getClass(), "hierarchyListener", null);
        setField(term376536, term376536.getClass(), "hierarchyBoundsListener", null);
        setField(term376536, term376536.getClass(), "keyListener", null);
        setField(term376536, term376536.getClass(), "mouseListener", null);
        setField(term376536, term376536.getClass(), "mouseMotionListener", null);
        setField(term376536, term376536.getClass(), "mouseWheelListener", null);
        setField(term376536, term376536.getClass(), "inputMethodListener", null);
        setLongField(term376536, term376536.getClass(), "eventMask", 0L);
        setField(term376536, term376536.getClass(), "changeSupport", null);
        setField(term376536, term376536.getClass(), "objectLock", null);
        setBooleanField(term376536, term376536.getClass(), "isPacked", false);
        setIntField(term376536, term376536.getClass(), "boundsOp", 0);
        setField(term376536, term376536.getClass(), "compoundShape", null);
        setField(term376536, term376536.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term376536, term376536.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term376536, term376536.getClass(), "backgroundEraseDisabled", false);
        setField(term376536, term376536.getClass(), "eventCache", null);
        setBooleanField(term376536, term376536.getClass(), "coalescingEnabled", false);
        setBooleanField(term376536, term376536.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term376536, term376536.getClass(), "componentSerializedDataVersion", 0);
        setField(term376536, term376536.getClass(), "accessibleContext", null);
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
        callMethod(klass, "createShipStatPanel", argTypes, term376536, args);
    }

};


