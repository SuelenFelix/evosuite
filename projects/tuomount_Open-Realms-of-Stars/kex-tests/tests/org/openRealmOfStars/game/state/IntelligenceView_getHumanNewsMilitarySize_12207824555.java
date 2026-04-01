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

public class IntelligenceView_getHumanNewsMilitarySize_12207824555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term686993;

    public IntelligenceView_getHumanNewsMilitarySize_12207824555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term686993 = newInstance(Class.forName("org.openRealmOfStars.game.state.IntelligenceView"));
        setField(term686993, term686993.getClass(), "player", null);
        setField(term686993, term686993.getClass(), "fakeMilitarySlider", null);
        setField(term686993, term686993.getClass(), "fakeMilitaryText", null);
        setIntField(term686993, term686993.getClass(), "humanNewsMilitarySize", 0);
        setBooleanField(term686993, term686993.getClass(), "isAlignmentXSet", false);
        setFloatField(term686993, term686993.getClass(), "alignmentX", 0.0F);
        setBooleanField(term686993, term686993.getClass(), "isAlignmentYSet", false);
        setFloatField(term686993, term686993.getClass(), "alignmentY", 0.0F);
        setField(term686993, term686993.getClass(), "ui", null);
        setField(term686993, term686993.getClass(), "listenerList", null);
        setField(term686993, term686993.getClass(), "clientProperties", null);
        setField(term686993, term686993.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term686993, term686993.getClass(), "autoscrolls", false);
        setField(term686993, term686993.getClass(), "border", null);
        setIntField(term686993, term686993.getClass(), "flags", 0);
        setField(term686993, term686993.getClass(), "inputVerifier", null);
        setBooleanField(term686993, term686993.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term686993, term686993.getClass(), "paintingChild", null);
        setField(term686993, term686993.getClass(), "popupMenu", null);
        setField(term686993, term686993.getClass(), "revalidateRunnableScheduled", null);
        setField(term686993, term686993.getClass(), "focusInputMap", null);
        setField(term686993, term686993.getClass(), "ancestorInputMap", null);
        setField(term686993, term686993.getClass(), "windowInputMap", null);
        setField(term686993, term686993.getClass(), "actionMap", null);
        setField(term686993, term686993.getClass(), "aaHint", null);
        setField(term686993, term686993.getClass(), "lcdRenderingHint", null);
        setField(term686993, term686993.getClass(), "component", null);
        setField(term686993, term686993.getClass(), "layoutMgr", null);
        setField(term686993, term686993.getClass(), "dispatcher", null);
        setField(term686993, term686993.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term686993, term686993.getClass(), "focusCycleRoot", false);
        setBooleanField(term686993, term686993.getClass(), "focusTraversalPolicyProvider", false);
        setField(term686993, term686993.getClass(), "printingThreads", null);
        setBooleanField(term686993, term686993.getClass(), "printing", false);
        setField(term686993, term686993.getClass(), "containerListener", null);
        setIntField(term686993, term686993.getClass(), "listeningChildren", 0);
        setIntField(term686993, term686993.getClass(), "listeningBoundsChildren", 0);
        setIntField(term686993, term686993.getClass(), "descendantsCount", 0);
        setField(term686993, term686993.getClass(), "preserveBackgroundColor", null);
        setIntField(term686993, term686993.getClass(), "numOfHWComponents", 0);
        setIntField(term686993, term686993.getClass(), "numOfLWComponents", 0);
        setField(term686993, term686993.getClass(), "modalComp", null);
        setField(term686993, term686993.getClass(), "modalAppContext", null);
        setIntField(term686993, term686993.getClass(), "containerSerializedDataVersion", 0);
        setField(term686993, term686993.getClass(), "peer", null);
        setField(term686993, term686993.getClass(), "parent", null);
        setField(term686993, term686993.getClass(), "appContext", null);
        setIntField(term686993, term686993.getClass(), "x", 0);
        setIntField(term686993, term686993.getClass(), "y", 0);
        setIntField(term686993, term686993.getClass(), "width", 0);
        setIntField(term686993, term686993.getClass(), "height", 0);
        setField(term686993, term686993.getClass(), "foreground", null);
        setField(term686993, term686993.getClass(), "background", null);
        setField(term686993, term686993.getClass(), "font", null);
        setField(term686993, term686993.getClass(), "peerFont", null);
        setField(term686993, term686993.getClass(), "cursor", null);
        setField(term686993, term686993.getClass(), "locale", null);
        setField(term686993, term686993.getClass(), "graphicsConfig", null);
        setField(term686993, term686993.getClass(), "bufferStrategy", null);
        setBooleanField(term686993, term686993.getClass(), "ignoreRepaint", false);
        setBooleanField(term686993, term686993.getClass(), "visible", false);
        setBooleanField(term686993, term686993.getClass(), "enabled", false);
        setBooleanField(term686993, term686993.getClass(), "valid", false);
        setField(term686993, term686993.getClass(), "dropTarget", null);
        setField(term686993, term686993.getClass(), "popups", null);
        setField(term686993, term686993.getClass(), "name", null);
        setBooleanField(term686993, term686993.getClass(), "nameExplicitlySet", false);
        setBooleanField(term686993, term686993.getClass(), "focusable", false);
        setIntField(term686993, term686993.getClass(), "isFocusTraversableOverridden", 0);
        setField(term686993, term686993.getClass(), "focusTraversalKeys", null);
        setBooleanField(term686993, term686993.getClass(), "focusTraversalKeysEnabled", false);
        setField(term686993, term686993.getClass(), "acc", null);
        setField(term686993, term686993.getClass(), "minSize", null);
        setBooleanField(term686993, term686993.getClass(), "minSizeSet", false);
        setField(term686993, term686993.getClass(), "prefSize", null);
        setBooleanField(term686993, term686993.getClass(), "prefSizeSet", false);
        setField(term686993, term686993.getClass(), "maxSize", null);
        setBooleanField(term686993, term686993.getClass(), "maxSizeSet", false);
        setField(term686993, term686993.getClass(), "componentOrientation", null);
        setBooleanField(term686993, term686993.getClass(), "newEventsOnly", false);
        setField(term686993, term686993.getClass(), "componentListener", null);
        setField(term686993, term686993.getClass(), "focusListener", null);
        setField(term686993, term686993.getClass(), "hierarchyListener", null);
        setField(term686993, term686993.getClass(), "hierarchyBoundsListener", null);
        setField(term686993, term686993.getClass(), "keyListener", null);
        setField(term686993, term686993.getClass(), "mouseListener", null);
        setField(term686993, term686993.getClass(), "mouseMotionListener", null);
        setField(term686993, term686993.getClass(), "mouseWheelListener", null);
        setField(term686993, term686993.getClass(), "inputMethodListener", null);
        setLongField(term686993, term686993.getClass(), "eventMask", 0L);
        setField(term686993, term686993.getClass(), "changeSupport", null);
        setField(term686993, term686993.getClass(), "objectLock", null);
        setBooleanField(term686993, term686993.getClass(), "isPacked", false);
        setIntField(term686993, term686993.getClass(), "boundsOp", 0);
        setField(term686993, term686993.getClass(), "compoundShape", null);
        setField(term686993, term686993.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term686993, term686993.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term686993, term686993.getClass(), "backgroundEraseDisabled", false);
        setField(term686993, term686993.getClass(), "eventCache", null);
        setBooleanField(term686993, term686993.getClass(), "coalescingEnabled", false);
        setBooleanField(term686993, term686993.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term686993, term686993.getClass(), "componentSerializedDataVersion", 0);
        setField(term686993, term686993.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.IntelligenceView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHumanNewsMilitarySize", argTypes, term686993, args);
    }

};


