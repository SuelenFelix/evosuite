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

public class IntelligenceView_updatePanel_3758884306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term642911;

    public IntelligenceView_updatePanel_3758884306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term642911 = newInstance(Class.forName("org.openRealmOfStars.game.state.IntelligenceView"));
        setField(term642911, term642911.getClass(), "player", null);
        setField(term642911, term642911.getClass(), "fakeMilitarySlider", null);
        setField(term642911, term642911.getClass(), "fakeMilitaryText", null);
        setIntField(term642911, term642911.getClass(), "humanNewsMilitarySize", 0);
        setBooleanField(term642911, term642911.getClass(), "isAlignmentXSet", false);
        setFloatField(term642911, term642911.getClass(), "alignmentX", 0.0F);
        setBooleanField(term642911, term642911.getClass(), "isAlignmentYSet", false);
        setFloatField(term642911, term642911.getClass(), "alignmentY", 0.0F);
        setField(term642911, term642911.getClass(), "ui", null);
        setField(term642911, term642911.getClass(), "listenerList", null);
        setField(term642911, term642911.getClass(), "clientProperties", null);
        setField(term642911, term642911.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term642911, term642911.getClass(), "autoscrolls", false);
        setField(term642911, term642911.getClass(), "border", null);
        setIntField(term642911, term642911.getClass(), "flags", 0);
        setField(term642911, term642911.getClass(), "inputVerifier", null);
        setBooleanField(term642911, term642911.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term642911, term642911.getClass(), "paintingChild", null);
        setField(term642911, term642911.getClass(), "popupMenu", null);
        setField(term642911, term642911.getClass(), "revalidateRunnableScheduled", null);
        setField(term642911, term642911.getClass(), "focusInputMap", null);
        setField(term642911, term642911.getClass(), "ancestorInputMap", null);
        setField(term642911, term642911.getClass(), "windowInputMap", null);
        setField(term642911, term642911.getClass(), "actionMap", null);
        setField(term642911, term642911.getClass(), "aaHint", null);
        setField(term642911, term642911.getClass(), "lcdRenderingHint", null);
        setField(term642911, term642911.getClass(), "component", null);
        setField(term642911, term642911.getClass(), "layoutMgr", null);
        setField(term642911, term642911.getClass(), "dispatcher", null);
        setField(term642911, term642911.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term642911, term642911.getClass(), "focusCycleRoot", false);
        setBooleanField(term642911, term642911.getClass(), "focusTraversalPolicyProvider", false);
        setField(term642911, term642911.getClass(), "printingThreads", null);
        setBooleanField(term642911, term642911.getClass(), "printing", false);
        setField(term642911, term642911.getClass(), "containerListener", null);
        setIntField(term642911, term642911.getClass(), "listeningChildren", 0);
        setIntField(term642911, term642911.getClass(), "listeningBoundsChildren", 0);
        setIntField(term642911, term642911.getClass(), "descendantsCount", 0);
        setField(term642911, term642911.getClass(), "preserveBackgroundColor", null);
        setIntField(term642911, term642911.getClass(), "numOfHWComponents", 0);
        setIntField(term642911, term642911.getClass(), "numOfLWComponents", 0);
        setField(term642911, term642911.getClass(), "modalComp", null);
        setField(term642911, term642911.getClass(), "modalAppContext", null);
        setIntField(term642911, term642911.getClass(), "containerSerializedDataVersion", 0);
        setField(term642911, term642911.getClass(), "peer", null);
        setField(term642911, term642911.getClass(), "parent", null);
        setField(term642911, term642911.getClass(), "appContext", null);
        setIntField(term642911, term642911.getClass(), "x", 0);
        setIntField(term642911, term642911.getClass(), "y", 0);
        setIntField(term642911, term642911.getClass(), "width", 0);
        setIntField(term642911, term642911.getClass(), "height", 0);
        setField(term642911, term642911.getClass(), "foreground", null);
        setField(term642911, term642911.getClass(), "background", null);
        setField(term642911, term642911.getClass(), "font", null);
        setField(term642911, term642911.getClass(), "peerFont", null);
        setField(term642911, term642911.getClass(), "cursor", null);
        setField(term642911, term642911.getClass(), "locale", null);
        setField(term642911, term642911.getClass(), "graphicsConfig", null);
        setField(term642911, term642911.getClass(), "bufferStrategy", null);
        setBooleanField(term642911, term642911.getClass(), "ignoreRepaint", false);
        setBooleanField(term642911, term642911.getClass(), "visible", false);
        setBooleanField(term642911, term642911.getClass(), "enabled", false);
        setBooleanField(term642911, term642911.getClass(), "valid", false);
        setField(term642911, term642911.getClass(), "dropTarget", null);
        setField(term642911, term642911.getClass(), "popups", null);
        setField(term642911, term642911.getClass(), "name", null);
        setBooleanField(term642911, term642911.getClass(), "nameExplicitlySet", false);
        setBooleanField(term642911, term642911.getClass(), "focusable", false);
        setIntField(term642911, term642911.getClass(), "isFocusTraversableOverridden", 0);
        setField(term642911, term642911.getClass(), "focusTraversalKeys", null);
        setBooleanField(term642911, term642911.getClass(), "focusTraversalKeysEnabled", false);
        setField(term642911, term642911.getClass(), "acc", null);
        setField(term642911, term642911.getClass(), "minSize", null);
        setBooleanField(term642911, term642911.getClass(), "minSizeSet", false);
        setField(term642911, term642911.getClass(), "prefSize", null);
        setBooleanField(term642911, term642911.getClass(), "prefSizeSet", false);
        setField(term642911, term642911.getClass(), "maxSize", null);
        setBooleanField(term642911, term642911.getClass(), "maxSizeSet", false);
        setField(term642911, term642911.getClass(), "componentOrientation", null);
        setBooleanField(term642911, term642911.getClass(), "newEventsOnly", false);
        setField(term642911, term642911.getClass(), "componentListener", null);
        setField(term642911, term642911.getClass(), "focusListener", null);
        setField(term642911, term642911.getClass(), "hierarchyListener", null);
        setField(term642911, term642911.getClass(), "hierarchyBoundsListener", null);
        setField(term642911, term642911.getClass(), "keyListener", null);
        setField(term642911, term642911.getClass(), "mouseListener", null);
        setField(term642911, term642911.getClass(), "mouseMotionListener", null);
        setField(term642911, term642911.getClass(), "mouseWheelListener", null);
        setField(term642911, term642911.getClass(), "inputMethodListener", null);
        setLongField(term642911, term642911.getClass(), "eventMask", 0L);
        setField(term642911, term642911.getClass(), "changeSupport", null);
        setField(term642911, term642911.getClass(), "objectLock", null);
        setBooleanField(term642911, term642911.getClass(), "isPacked", false);
        setIntField(term642911, term642911.getClass(), "boundsOp", 0);
        setField(term642911, term642911.getClass(), "compoundShape", null);
        setField(term642911, term642911.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term642911, term642911.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term642911, term642911.getClass(), "backgroundEraseDisabled", false);
        setField(term642911, term642911.getClass(), "eventCache", null);
        setBooleanField(term642911, term642911.getClass(), "coalescingEnabled", false);
        setBooleanField(term642911, term642911.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term642911, term642911.getClass(), "componentSerializedDataVersion", 0);
        setField(term642911, term642911.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.IntelligenceView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updatePanel", argTypes, term642911, args);
    }

};


