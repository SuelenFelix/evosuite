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

public class StatView_createSnowmanPanel_106250570616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term376677;

    public StatView_createSnowmanPanel_106250570616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term376677 = newInstance(Class.forName("org.openRealmOfStars.game.state.StatView"));
        setField(term376677, term376677.getClass(), "backBtn", null);
        setBooleanField(term376677, term376677.getClass(), "highestScore", false);
        setBooleanField(term376677, term376677.getClass(), "highestCulture", false);
        setBooleanField(term376677, term376677.getClass(), "highestHomePlanets", false);
        setBooleanField(term376677, term376677.getClass(), "highestTowers", false);
        setBooleanField(term376677, term376677.getClass(), "highestScience", false);
        setBooleanField(term376677, term376677.getClass(), "highestPopulation", false);
        setField(term376677, term376677.getClass(), "starMap", null);
        setField(term376677, term376677.getClass(), "winningCombo", null);
        setBooleanField(term376677, term376677.getClass(), "isAlignmentXSet", false);
        setFloatField(term376677, term376677.getClass(), "alignmentX", 0.0F);
        setBooleanField(term376677, term376677.getClass(), "isAlignmentYSet", false);
        setFloatField(term376677, term376677.getClass(), "alignmentY", 0.0F);
        setField(term376677, term376677.getClass(), "ui", null);
        setField(term376677, term376677.getClass(), "listenerList", null);
        setField(term376677, term376677.getClass(), "clientProperties", null);
        setField(term376677, term376677.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term376677, term376677.getClass(), "autoscrolls", false);
        setField(term376677, term376677.getClass(), "border", null);
        setIntField(term376677, term376677.getClass(), "flags", 0);
        setField(term376677, term376677.getClass(), "inputVerifier", null);
        setBooleanField(term376677, term376677.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term376677, term376677.getClass(), "paintingChild", null);
        setField(term376677, term376677.getClass(), "popupMenu", null);
        setField(term376677, term376677.getClass(), "revalidateRunnableScheduled", null);
        setField(term376677, term376677.getClass(), "focusInputMap", null);
        setField(term376677, term376677.getClass(), "ancestorInputMap", null);
        setField(term376677, term376677.getClass(), "windowInputMap", null);
        setField(term376677, term376677.getClass(), "actionMap", null);
        setField(term376677, term376677.getClass(), "aaHint", null);
        setField(term376677, term376677.getClass(), "lcdRenderingHint", null);
        setField(term376677, term376677.getClass(), "component", null);
        setField(term376677, term376677.getClass(), "layoutMgr", null);
        setField(term376677, term376677.getClass(), "dispatcher", null);
        setField(term376677, term376677.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term376677, term376677.getClass(), "focusCycleRoot", false);
        setBooleanField(term376677, term376677.getClass(), "focusTraversalPolicyProvider", false);
        setField(term376677, term376677.getClass(), "printingThreads", null);
        setBooleanField(term376677, term376677.getClass(), "printing", false);
        setField(term376677, term376677.getClass(), "containerListener", null);
        setIntField(term376677, term376677.getClass(), "listeningChildren", 0);
        setIntField(term376677, term376677.getClass(), "listeningBoundsChildren", 0);
        setIntField(term376677, term376677.getClass(), "descendantsCount", 0);
        setField(term376677, term376677.getClass(), "preserveBackgroundColor", null);
        setIntField(term376677, term376677.getClass(), "numOfHWComponents", 0);
        setIntField(term376677, term376677.getClass(), "numOfLWComponents", 0);
        setField(term376677, term376677.getClass(), "modalComp", null);
        setField(term376677, term376677.getClass(), "modalAppContext", null);
        setIntField(term376677, term376677.getClass(), "containerSerializedDataVersion", 0);
        setField(term376677, term376677.getClass(), "peer", null);
        setField(term376677, term376677.getClass(), "parent", null);
        setField(term376677, term376677.getClass(), "appContext", null);
        setIntField(term376677, term376677.getClass(), "x", 0);
        setIntField(term376677, term376677.getClass(), "y", 0);
        setIntField(term376677, term376677.getClass(), "width", 0);
        setIntField(term376677, term376677.getClass(), "height", 0);
        setField(term376677, term376677.getClass(), "foreground", null);
        setField(term376677, term376677.getClass(), "background", null);
        setField(term376677, term376677.getClass(), "font", null);
        setField(term376677, term376677.getClass(), "peerFont", null);
        setField(term376677, term376677.getClass(), "cursor", null);
        setField(term376677, term376677.getClass(), "locale", null);
        setField(term376677, term376677.getClass(), "graphicsConfig", null);
        setField(term376677, term376677.getClass(), "bufferStrategy", null);
        setBooleanField(term376677, term376677.getClass(), "ignoreRepaint", false);
        setBooleanField(term376677, term376677.getClass(), "visible", false);
        setBooleanField(term376677, term376677.getClass(), "enabled", false);
        setBooleanField(term376677, term376677.getClass(), "valid", false);
        setField(term376677, term376677.getClass(), "dropTarget", null);
        setField(term376677, term376677.getClass(), "popups", null);
        setField(term376677, term376677.getClass(), "name", null);
        setBooleanField(term376677, term376677.getClass(), "nameExplicitlySet", false);
        setBooleanField(term376677, term376677.getClass(), "focusable", false);
        setIntField(term376677, term376677.getClass(), "isFocusTraversableOverridden", 0);
        setField(term376677, term376677.getClass(), "focusTraversalKeys", null);
        setBooleanField(term376677, term376677.getClass(), "focusTraversalKeysEnabled", false);
        setField(term376677, term376677.getClass(), "acc", null);
        setField(term376677, term376677.getClass(), "minSize", null);
        setBooleanField(term376677, term376677.getClass(), "minSizeSet", false);
        setField(term376677, term376677.getClass(), "prefSize", null);
        setBooleanField(term376677, term376677.getClass(), "prefSizeSet", false);
        setField(term376677, term376677.getClass(), "maxSize", null);
        setBooleanField(term376677, term376677.getClass(), "maxSizeSet", false);
        setField(term376677, term376677.getClass(), "componentOrientation", null);
        setBooleanField(term376677, term376677.getClass(), "newEventsOnly", false);
        setField(term376677, term376677.getClass(), "componentListener", null);
        setField(term376677, term376677.getClass(), "focusListener", null);
        setField(term376677, term376677.getClass(), "hierarchyListener", null);
        setField(term376677, term376677.getClass(), "hierarchyBoundsListener", null);
        setField(term376677, term376677.getClass(), "keyListener", null);
        setField(term376677, term376677.getClass(), "mouseListener", null);
        setField(term376677, term376677.getClass(), "mouseMotionListener", null);
        setField(term376677, term376677.getClass(), "mouseWheelListener", null);
        setField(term376677, term376677.getClass(), "inputMethodListener", null);
        setLongField(term376677, term376677.getClass(), "eventMask", 0L);
        setField(term376677, term376677.getClass(), "changeSupport", null);
        setField(term376677, term376677.getClass(), "objectLock", null);
        setBooleanField(term376677, term376677.getClass(), "isPacked", false);
        setIntField(term376677, term376677.getClass(), "boundsOp", 0);
        setField(term376677, term376677.getClass(), "compoundShape", null);
        setField(term376677, term376677.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term376677, term376677.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term376677, term376677.getClass(), "backgroundEraseDisabled", false);
        setField(term376677, term376677.getClass(), "eventCache", null);
        setBooleanField(term376677, term376677.getClass(), "coalescingEnabled", false);
        setBooleanField(term376677, term376677.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term376677, term376677.getClass(), "componentSerializedDataVersion", 0);
        setField(term376677, term376677.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.StatView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionListener");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createSnowmanPanel", argTypes, term376677, args);
    }

};


