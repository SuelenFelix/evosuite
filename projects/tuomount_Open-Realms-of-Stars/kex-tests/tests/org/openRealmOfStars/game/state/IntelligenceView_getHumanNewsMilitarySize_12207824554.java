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

public class IntelligenceView_getHumanNewsMilitarySize_12207824554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term637513;

    public IntelligenceView_getHumanNewsMilitarySize_12207824554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term637513 = newInstance(Class.forName("org.openRealmOfStars.game.state.IntelligenceView"));
        setField(term637513, term637513.getClass(), "player", null);
        setField(term637513, term637513.getClass(), "fakeMilitarySlider", null);
        setField(term637513, term637513.getClass(), "fakeMilitaryText", null);
        setIntField(term637513, term637513.getClass(), "humanNewsMilitarySize", 0);
        setBooleanField(term637513, term637513.getClass(), "isAlignmentXSet", false);
        setFloatField(term637513, term637513.getClass(), "alignmentX", 0.0F);
        setBooleanField(term637513, term637513.getClass(), "isAlignmentYSet", false);
        setFloatField(term637513, term637513.getClass(), "alignmentY", 0.0F);
        setField(term637513, term637513.getClass(), "ui", null);
        setField(term637513, term637513.getClass(), "listenerList", null);
        setField(term637513, term637513.getClass(), "clientProperties", null);
        setField(term637513, term637513.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term637513, term637513.getClass(), "autoscrolls", false);
        setField(term637513, term637513.getClass(), "border", null);
        setIntField(term637513, term637513.getClass(), "flags", 0);
        setField(term637513, term637513.getClass(), "inputVerifier", null);
        setBooleanField(term637513, term637513.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term637513, term637513.getClass(), "paintingChild", null);
        setField(term637513, term637513.getClass(), "popupMenu", null);
        setField(term637513, term637513.getClass(), "revalidateRunnableScheduled", null);
        setField(term637513, term637513.getClass(), "focusInputMap", null);
        setField(term637513, term637513.getClass(), "ancestorInputMap", null);
        setField(term637513, term637513.getClass(), "windowInputMap", null);
        setField(term637513, term637513.getClass(), "actionMap", null);
        setField(term637513, term637513.getClass(), "aaHint", null);
        setField(term637513, term637513.getClass(), "lcdRenderingHint", null);
        setField(term637513, term637513.getClass(), "component", null);
        setField(term637513, term637513.getClass(), "layoutMgr", null);
        setField(term637513, term637513.getClass(), "dispatcher", null);
        setField(term637513, term637513.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term637513, term637513.getClass(), "focusCycleRoot", false);
        setBooleanField(term637513, term637513.getClass(), "focusTraversalPolicyProvider", false);
        setField(term637513, term637513.getClass(), "printingThreads", null);
        setBooleanField(term637513, term637513.getClass(), "printing", false);
        setField(term637513, term637513.getClass(), "containerListener", null);
        setIntField(term637513, term637513.getClass(), "listeningChildren", 0);
        setIntField(term637513, term637513.getClass(), "listeningBoundsChildren", 0);
        setIntField(term637513, term637513.getClass(), "descendantsCount", 0);
        setField(term637513, term637513.getClass(), "preserveBackgroundColor", null);
        setIntField(term637513, term637513.getClass(), "numOfHWComponents", 0);
        setIntField(term637513, term637513.getClass(), "numOfLWComponents", 0);
        setField(term637513, term637513.getClass(), "modalComp", null);
        setField(term637513, term637513.getClass(), "modalAppContext", null);
        setIntField(term637513, term637513.getClass(), "containerSerializedDataVersion", 0);
        setField(term637513, term637513.getClass(), "peer", null);
        setField(term637513, term637513.getClass(), "parent", null);
        setField(term637513, term637513.getClass(), "appContext", null);
        setIntField(term637513, term637513.getClass(), "x", 0);
        setIntField(term637513, term637513.getClass(), "y", 0);
        setIntField(term637513, term637513.getClass(), "width", 0);
        setIntField(term637513, term637513.getClass(), "height", 0);
        setField(term637513, term637513.getClass(), "foreground", null);
        setField(term637513, term637513.getClass(), "background", null);
        setField(term637513, term637513.getClass(), "font", null);
        setField(term637513, term637513.getClass(), "peerFont", null);
        setField(term637513, term637513.getClass(), "cursor", null);
        setField(term637513, term637513.getClass(), "locale", null);
        setField(term637513, term637513.getClass(), "graphicsConfig", null);
        setField(term637513, term637513.getClass(), "bufferStrategy", null);
        setBooleanField(term637513, term637513.getClass(), "ignoreRepaint", false);
        setBooleanField(term637513, term637513.getClass(), "visible", false);
        setBooleanField(term637513, term637513.getClass(), "enabled", false);
        setBooleanField(term637513, term637513.getClass(), "valid", false);
        setField(term637513, term637513.getClass(), "dropTarget", null);
        setField(term637513, term637513.getClass(), "popups", null);
        setField(term637513, term637513.getClass(), "name", null);
        setBooleanField(term637513, term637513.getClass(), "nameExplicitlySet", false);
        setBooleanField(term637513, term637513.getClass(), "focusable", false);
        setIntField(term637513, term637513.getClass(), "isFocusTraversableOverridden", 0);
        setField(term637513, term637513.getClass(), "focusTraversalKeys", null);
        setBooleanField(term637513, term637513.getClass(), "focusTraversalKeysEnabled", false);
        setField(term637513, term637513.getClass(), "acc", null);
        setField(term637513, term637513.getClass(), "minSize", null);
        setBooleanField(term637513, term637513.getClass(), "minSizeSet", false);
        setField(term637513, term637513.getClass(), "prefSize", null);
        setBooleanField(term637513, term637513.getClass(), "prefSizeSet", false);
        setField(term637513, term637513.getClass(), "maxSize", null);
        setBooleanField(term637513, term637513.getClass(), "maxSizeSet", false);
        setField(term637513, term637513.getClass(), "componentOrientation", null);
        setBooleanField(term637513, term637513.getClass(), "newEventsOnly", false);
        setField(term637513, term637513.getClass(), "componentListener", null);
        setField(term637513, term637513.getClass(), "focusListener", null);
        setField(term637513, term637513.getClass(), "hierarchyListener", null);
        setField(term637513, term637513.getClass(), "hierarchyBoundsListener", null);
        setField(term637513, term637513.getClass(), "keyListener", null);
        setField(term637513, term637513.getClass(), "mouseListener", null);
        setField(term637513, term637513.getClass(), "mouseMotionListener", null);
        setField(term637513, term637513.getClass(), "mouseWheelListener", null);
        setField(term637513, term637513.getClass(), "inputMethodListener", null);
        setLongField(term637513, term637513.getClass(), "eventMask", 0L);
        setField(term637513, term637513.getClass(), "changeSupport", null);
        setField(term637513, term637513.getClass(), "objectLock", null);
        setBooleanField(term637513, term637513.getClass(), "isPacked", false);
        setIntField(term637513, term637513.getClass(), "boundsOp", 0);
        setField(term637513, term637513.getClass(), "compoundShape", null);
        setField(term637513, term637513.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term637513, term637513.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term637513, term637513.getClass(), "backgroundEraseDisabled", false);
        setField(term637513, term637513.getClass(), "eventCache", null);
        setBooleanField(term637513, term637513.getClass(), "coalescingEnabled", false);
        setBooleanField(term637513, term637513.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term637513, term637513.getClass(), "componentSerializedDataVersion", 0);
        setField(term637513, term637513.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.IntelligenceView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHumanNewsMilitarySize", argTypes, term637513, args);
    }

};


