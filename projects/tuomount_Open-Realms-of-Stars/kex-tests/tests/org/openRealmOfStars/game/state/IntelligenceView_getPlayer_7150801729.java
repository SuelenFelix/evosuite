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

public class IntelligenceView_getPlayer_7150801729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term648492;

    public IntelligenceView_getPlayer_7150801729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term648492 = newInstance(Class.forName("org.openRealmOfStars.game.state.IntelligenceView"));
        setField(term648492, term648492.getClass(), "player", null);
        setField(term648492, term648492.getClass(), "fakeMilitarySlider", null);
        setField(term648492, term648492.getClass(), "fakeMilitaryText", null);
        setIntField(term648492, term648492.getClass(), "humanNewsMilitarySize", 0);
        setBooleanField(term648492, term648492.getClass(), "isAlignmentXSet", false);
        setFloatField(term648492, term648492.getClass(), "alignmentX", 0.0F);
        setBooleanField(term648492, term648492.getClass(), "isAlignmentYSet", false);
        setFloatField(term648492, term648492.getClass(), "alignmentY", 0.0F);
        setField(term648492, term648492.getClass(), "ui", null);
        setField(term648492, term648492.getClass(), "listenerList", null);
        setField(term648492, term648492.getClass(), "clientProperties", null);
        setField(term648492, term648492.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term648492, term648492.getClass(), "autoscrolls", false);
        setField(term648492, term648492.getClass(), "border", null);
        setIntField(term648492, term648492.getClass(), "flags", 0);
        setField(term648492, term648492.getClass(), "inputVerifier", null);
        setBooleanField(term648492, term648492.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term648492, term648492.getClass(), "paintingChild", null);
        setField(term648492, term648492.getClass(), "popupMenu", null);
        setField(term648492, term648492.getClass(), "revalidateRunnableScheduled", null);
        setField(term648492, term648492.getClass(), "focusInputMap", null);
        setField(term648492, term648492.getClass(), "ancestorInputMap", null);
        setField(term648492, term648492.getClass(), "windowInputMap", null);
        setField(term648492, term648492.getClass(), "actionMap", null);
        setField(term648492, term648492.getClass(), "aaHint", null);
        setField(term648492, term648492.getClass(), "lcdRenderingHint", null);
        setField(term648492, term648492.getClass(), "component", null);
        setField(term648492, term648492.getClass(), "layoutMgr", null);
        setField(term648492, term648492.getClass(), "dispatcher", null);
        setField(term648492, term648492.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term648492, term648492.getClass(), "focusCycleRoot", false);
        setBooleanField(term648492, term648492.getClass(), "focusTraversalPolicyProvider", false);
        setField(term648492, term648492.getClass(), "printingThreads", null);
        setBooleanField(term648492, term648492.getClass(), "printing", false);
        setField(term648492, term648492.getClass(), "containerListener", null);
        setIntField(term648492, term648492.getClass(), "listeningChildren", 0);
        setIntField(term648492, term648492.getClass(), "listeningBoundsChildren", 0);
        setIntField(term648492, term648492.getClass(), "descendantsCount", 0);
        setField(term648492, term648492.getClass(), "preserveBackgroundColor", null);
        setIntField(term648492, term648492.getClass(), "numOfHWComponents", 0);
        setIntField(term648492, term648492.getClass(), "numOfLWComponents", 0);
        setField(term648492, term648492.getClass(), "modalComp", null);
        setField(term648492, term648492.getClass(), "modalAppContext", null);
        setIntField(term648492, term648492.getClass(), "containerSerializedDataVersion", 0);
        setField(term648492, term648492.getClass(), "peer", null);
        setField(term648492, term648492.getClass(), "parent", null);
        setField(term648492, term648492.getClass(), "appContext", null);
        setIntField(term648492, term648492.getClass(), "x", 0);
        setIntField(term648492, term648492.getClass(), "y", 0);
        setIntField(term648492, term648492.getClass(), "width", 0);
        setIntField(term648492, term648492.getClass(), "height", 0);
        setField(term648492, term648492.getClass(), "foreground", null);
        setField(term648492, term648492.getClass(), "background", null);
        setField(term648492, term648492.getClass(), "font", null);
        setField(term648492, term648492.getClass(), "peerFont", null);
        setField(term648492, term648492.getClass(), "cursor", null);
        setField(term648492, term648492.getClass(), "locale", null);
        setField(term648492, term648492.getClass(), "graphicsConfig", null);
        setField(term648492, term648492.getClass(), "bufferStrategy", null);
        setBooleanField(term648492, term648492.getClass(), "ignoreRepaint", false);
        setBooleanField(term648492, term648492.getClass(), "visible", false);
        setBooleanField(term648492, term648492.getClass(), "enabled", false);
        setBooleanField(term648492, term648492.getClass(), "valid", false);
        setField(term648492, term648492.getClass(), "dropTarget", null);
        setField(term648492, term648492.getClass(), "popups", null);
        setField(term648492, term648492.getClass(), "name", null);
        setBooleanField(term648492, term648492.getClass(), "nameExplicitlySet", false);
        setBooleanField(term648492, term648492.getClass(), "focusable", false);
        setIntField(term648492, term648492.getClass(), "isFocusTraversableOverridden", 0);
        setField(term648492, term648492.getClass(), "focusTraversalKeys", null);
        setBooleanField(term648492, term648492.getClass(), "focusTraversalKeysEnabled", false);
        setField(term648492, term648492.getClass(), "acc", null);
        setField(term648492, term648492.getClass(), "minSize", null);
        setBooleanField(term648492, term648492.getClass(), "minSizeSet", false);
        setField(term648492, term648492.getClass(), "prefSize", null);
        setBooleanField(term648492, term648492.getClass(), "prefSizeSet", false);
        setField(term648492, term648492.getClass(), "maxSize", null);
        setBooleanField(term648492, term648492.getClass(), "maxSizeSet", false);
        setField(term648492, term648492.getClass(), "componentOrientation", null);
        setBooleanField(term648492, term648492.getClass(), "newEventsOnly", false);
        setField(term648492, term648492.getClass(), "componentListener", null);
        setField(term648492, term648492.getClass(), "focusListener", null);
        setField(term648492, term648492.getClass(), "hierarchyListener", null);
        setField(term648492, term648492.getClass(), "hierarchyBoundsListener", null);
        setField(term648492, term648492.getClass(), "keyListener", null);
        setField(term648492, term648492.getClass(), "mouseListener", null);
        setField(term648492, term648492.getClass(), "mouseMotionListener", null);
        setField(term648492, term648492.getClass(), "mouseWheelListener", null);
        setField(term648492, term648492.getClass(), "inputMethodListener", null);
        setLongField(term648492, term648492.getClass(), "eventMask", 0L);
        setField(term648492, term648492.getClass(), "changeSupport", null);
        setField(term648492, term648492.getClass(), "objectLock", null);
        setBooleanField(term648492, term648492.getClass(), "isPacked", false);
        setIntField(term648492, term648492.getClass(), "boundsOp", 0);
        setField(term648492, term648492.getClass(), "compoundShape", null);
        setField(term648492, term648492.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term648492, term648492.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term648492, term648492.getClass(), "backgroundEraseDisabled", false);
        setField(term648492, term648492.getClass(), "eventCache", null);
        setBooleanField(term648492, term648492.getClass(), "coalescingEnabled", false);
        setBooleanField(term648492, term648492.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term648492, term648492.getClass(), "componentSerializedDataVersion", 0);
        setField(term648492, term648492.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.IntelligenceView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayer", argTypes, term648492, args);
    }

};


