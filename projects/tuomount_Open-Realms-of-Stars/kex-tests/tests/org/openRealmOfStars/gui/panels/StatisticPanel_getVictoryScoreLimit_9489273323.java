package org.openRealmOfStars.gui.panels;

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
import static org.openRealmOfStars.gui.panels.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StatisticPanel_getVictoryScoreLimit_9489273323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223789;

    public StatisticPanel_getVictoryScoreLimit_9489273323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223789 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.StatisticPanel"));
        setField(term223789, term223789.getClass(), "data", null);
        setField(term223789, term223789.getClass(), "yDataNames", null);
        setIntField(term223789, term223789.getClass(), "largestY", 0);
        setIntField(term223789, term223789.getClass(), "largestX", 0);
        setIntField(term223789, term223789.getClass(), "turnDistance", 0);
        setIntField(term223789, term223789.getClass(), "victoryScoreLimit", 0);
        setField(term223789, term223789.getClass(), "playerColors", null);
        setBooleanField(term223789, term223789.getClass(), "showLastValue", false);
        setBooleanField(term223789, term223789.getClass(), "isAlignmentXSet", false);
        setFloatField(term223789, term223789.getClass(), "alignmentX", 0.0F);
        setBooleanField(term223789, term223789.getClass(), "isAlignmentYSet", false);
        setFloatField(term223789, term223789.getClass(), "alignmentY", 0.0F);
        setField(term223789, term223789.getClass(), "ui", null);
        setField(term223789, term223789.getClass(), "listenerList", null);
        setField(term223789, term223789.getClass(), "clientProperties", null);
        setField(term223789, term223789.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term223789, term223789.getClass(), "autoscrolls", false);
        setField(term223789, term223789.getClass(), "border", null);
        setIntField(term223789, term223789.getClass(), "flags", 0);
        setField(term223789, term223789.getClass(), "inputVerifier", null);
        setBooleanField(term223789, term223789.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term223789, term223789.getClass(), "paintingChild", null);
        setField(term223789, term223789.getClass(), "popupMenu", null);
        setField(term223789, term223789.getClass(), "revalidateRunnableScheduled", null);
        setField(term223789, term223789.getClass(), "focusInputMap", null);
        setField(term223789, term223789.getClass(), "ancestorInputMap", null);
        setField(term223789, term223789.getClass(), "windowInputMap", null);
        setField(term223789, term223789.getClass(), "actionMap", null);
        setField(term223789, term223789.getClass(), "aaHint", null);
        setField(term223789, term223789.getClass(), "lcdRenderingHint", null);
        setField(term223789, term223789.getClass(), "component", null);
        setField(term223789, term223789.getClass(), "layoutMgr", null);
        setField(term223789, term223789.getClass(), "dispatcher", null);
        setField(term223789, term223789.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term223789, term223789.getClass(), "focusCycleRoot", false);
        setBooleanField(term223789, term223789.getClass(), "focusTraversalPolicyProvider", false);
        setField(term223789, term223789.getClass(), "printingThreads", null);
        setBooleanField(term223789, term223789.getClass(), "printing", false);
        setField(term223789, term223789.getClass(), "containerListener", null);
        setIntField(term223789, term223789.getClass(), "listeningChildren", 0);
        setIntField(term223789, term223789.getClass(), "listeningBoundsChildren", 0);
        setIntField(term223789, term223789.getClass(), "descendantsCount", 0);
        setField(term223789, term223789.getClass(), "preserveBackgroundColor", null);
        setIntField(term223789, term223789.getClass(), "numOfHWComponents", 0);
        setIntField(term223789, term223789.getClass(), "numOfLWComponents", 0);
        setField(term223789, term223789.getClass(), "modalComp", null);
        setField(term223789, term223789.getClass(), "modalAppContext", null);
        setIntField(term223789, term223789.getClass(), "containerSerializedDataVersion", 0);
        setField(term223789, term223789.getClass(), "peer", null);
        setField(term223789, term223789.getClass(), "parent", null);
        setField(term223789, term223789.getClass(), "appContext", null);
        setIntField(term223789, term223789.getClass(), "x", 0);
        setIntField(term223789, term223789.getClass(), "y", 0);
        setIntField(term223789, term223789.getClass(), "width", 0);
        setIntField(term223789, term223789.getClass(), "height", 0);
        setField(term223789, term223789.getClass(), "foreground", null);
        setField(term223789, term223789.getClass(), "background", null);
        setField(term223789, term223789.getClass(), "font", null);
        setField(term223789, term223789.getClass(), "peerFont", null);
        setField(term223789, term223789.getClass(), "cursor", null);
        setField(term223789, term223789.getClass(), "locale", null);
        setField(term223789, term223789.getClass(), "graphicsConfig", null);
        setField(term223789, term223789.getClass(), "bufferStrategy", null);
        setBooleanField(term223789, term223789.getClass(), "ignoreRepaint", false);
        setBooleanField(term223789, term223789.getClass(), "visible", false);
        setBooleanField(term223789, term223789.getClass(), "enabled", false);
        setBooleanField(term223789, term223789.getClass(), "valid", false);
        setField(term223789, term223789.getClass(), "dropTarget", null);
        setField(term223789, term223789.getClass(), "popups", null);
        setField(term223789, term223789.getClass(), "name", null);
        setBooleanField(term223789, term223789.getClass(), "nameExplicitlySet", false);
        setBooleanField(term223789, term223789.getClass(), "focusable", false);
        setIntField(term223789, term223789.getClass(), "isFocusTraversableOverridden", 0);
        setField(term223789, term223789.getClass(), "focusTraversalKeys", null);
        setBooleanField(term223789, term223789.getClass(), "focusTraversalKeysEnabled", false);
        setField(term223789, term223789.getClass(), "acc", null);
        setField(term223789, term223789.getClass(), "minSize", null);
        setBooleanField(term223789, term223789.getClass(), "minSizeSet", false);
        setField(term223789, term223789.getClass(), "prefSize", null);
        setBooleanField(term223789, term223789.getClass(), "prefSizeSet", false);
        setField(term223789, term223789.getClass(), "maxSize", null);
        setBooleanField(term223789, term223789.getClass(), "maxSizeSet", false);
        setField(term223789, term223789.getClass(), "componentOrientation", null);
        setBooleanField(term223789, term223789.getClass(), "newEventsOnly", false);
        setField(term223789, term223789.getClass(), "componentListener", null);
        setField(term223789, term223789.getClass(), "focusListener", null);
        setField(term223789, term223789.getClass(), "hierarchyListener", null);
        setField(term223789, term223789.getClass(), "hierarchyBoundsListener", null);
        setField(term223789, term223789.getClass(), "keyListener", null);
        setField(term223789, term223789.getClass(), "mouseListener", null);
        setField(term223789, term223789.getClass(), "mouseMotionListener", null);
        setField(term223789, term223789.getClass(), "mouseWheelListener", null);
        setField(term223789, term223789.getClass(), "inputMethodListener", null);
        setLongField(term223789, term223789.getClass(), "eventMask", 0L);
        setField(term223789, term223789.getClass(), "changeSupport", null);
        setField(term223789, term223789.getClass(), "objectLock", null);
        setBooleanField(term223789, term223789.getClass(), "isPacked", false);
        setIntField(term223789, term223789.getClass(), "boundsOp", 0);
        setField(term223789, term223789.getClass(), "compoundShape", null);
        setField(term223789, term223789.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term223789, term223789.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term223789, term223789.getClass(), "backgroundEraseDisabled", false);
        setField(term223789, term223789.getClass(), "eventCache", null);
        setBooleanField(term223789, term223789.getClass(), "coalescingEnabled", false);
        setBooleanField(term223789, term223789.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term223789, term223789.getClass(), "componentSerializedDataVersion", 0);
        setField(term223789, term223789.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.StatisticPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVictoryScoreLimit", argTypes, term223789, args);
    }

};


