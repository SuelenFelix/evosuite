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

public class RealmView_getRealm_7563696025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2048631;

    public RealmView_getRealm_7563696025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2048631 = newInstance(Class.forName("org.openRealmOfStars.game.state.RealmView"));
        setField(term2048631, term2048631.getClass(), "realm", null);
        setField(term2048631, term2048631.getClass(), "raceImage", null);
        setField(term2048631, term2048631.getClass(), "raceDescription", null);
        setField(term2048631, term2048631.getClass(), "leaderDescription", null);
        setField(term2048631, term2048631.getClass(), "governmentDescription", null);
        setBooleanField(term2048631, term2048631.getClass(), "isAlignmentXSet", false);
        setFloatField(term2048631, term2048631.getClass(), "alignmentX", 0.0F);
        setBooleanField(term2048631, term2048631.getClass(), "isAlignmentYSet", false);
        setFloatField(term2048631, term2048631.getClass(), "alignmentY", 0.0F);
        setField(term2048631, term2048631.getClass(), "ui", null);
        setField(term2048631, term2048631.getClass(), "listenerList", null);
        setField(term2048631, term2048631.getClass(), "clientProperties", null);
        setField(term2048631, term2048631.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term2048631, term2048631.getClass(), "autoscrolls", false);
        setField(term2048631, term2048631.getClass(), "border", null);
        setIntField(term2048631, term2048631.getClass(), "flags", 0);
        setField(term2048631, term2048631.getClass(), "inputVerifier", null);
        setBooleanField(term2048631, term2048631.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term2048631, term2048631.getClass(), "paintingChild", null);
        setField(term2048631, term2048631.getClass(), "popupMenu", null);
        setField(term2048631, term2048631.getClass(), "revalidateRunnableScheduled", null);
        setField(term2048631, term2048631.getClass(), "focusInputMap", null);
        setField(term2048631, term2048631.getClass(), "ancestorInputMap", null);
        setField(term2048631, term2048631.getClass(), "windowInputMap", null);
        setField(term2048631, term2048631.getClass(), "actionMap", null);
        setField(term2048631, term2048631.getClass(), "aaHint", null);
        setField(term2048631, term2048631.getClass(), "lcdRenderingHint", null);
        setField(term2048631, term2048631.getClass(), "component", null);
        setField(term2048631, term2048631.getClass(), "layoutMgr", null);
        setField(term2048631, term2048631.getClass(), "dispatcher", null);
        setField(term2048631, term2048631.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2048631, term2048631.getClass(), "focusCycleRoot", false);
        setBooleanField(term2048631, term2048631.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2048631, term2048631.getClass(), "printingThreads", null);
        setBooleanField(term2048631, term2048631.getClass(), "printing", false);
        setField(term2048631, term2048631.getClass(), "containerListener", null);
        setIntField(term2048631, term2048631.getClass(), "listeningChildren", 0);
        setIntField(term2048631, term2048631.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2048631, term2048631.getClass(), "descendantsCount", 0);
        setField(term2048631, term2048631.getClass(), "preserveBackgroundColor", null);
        setIntField(term2048631, term2048631.getClass(), "numOfHWComponents", 0);
        setIntField(term2048631, term2048631.getClass(), "numOfLWComponents", 0);
        setField(term2048631, term2048631.getClass(), "modalComp", null);
        setField(term2048631, term2048631.getClass(), "modalAppContext", null);
        setIntField(term2048631, term2048631.getClass(), "containerSerializedDataVersion", 0);
        setField(term2048631, term2048631.getClass(), "peer", null);
        setField(term2048631, term2048631.getClass(), "parent", null);
        setField(term2048631, term2048631.getClass(), "appContext", null);
        setIntField(term2048631, term2048631.getClass(), "x", 0);
        setIntField(term2048631, term2048631.getClass(), "y", 0);
        setIntField(term2048631, term2048631.getClass(), "width", 0);
        setIntField(term2048631, term2048631.getClass(), "height", 0);
        setField(term2048631, term2048631.getClass(), "foreground", null);
        setField(term2048631, term2048631.getClass(), "background", null);
        setField(term2048631, term2048631.getClass(), "font", null);
        setField(term2048631, term2048631.getClass(), "peerFont", null);
        setField(term2048631, term2048631.getClass(), "cursor", null);
        setField(term2048631, term2048631.getClass(), "locale", null);
        setField(term2048631, term2048631.getClass(), "graphicsConfig", null);
        setField(term2048631, term2048631.getClass(), "bufferStrategy", null);
        setBooleanField(term2048631, term2048631.getClass(), "ignoreRepaint", false);
        setBooleanField(term2048631, term2048631.getClass(), "visible", false);
        setBooleanField(term2048631, term2048631.getClass(), "enabled", false);
        setBooleanField(term2048631, term2048631.getClass(), "valid", false);
        setField(term2048631, term2048631.getClass(), "dropTarget", null);
        setField(term2048631, term2048631.getClass(), "popups", null);
        setField(term2048631, term2048631.getClass(), "name", null);
        setBooleanField(term2048631, term2048631.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2048631, term2048631.getClass(), "focusable", false);
        setIntField(term2048631, term2048631.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2048631, term2048631.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2048631, term2048631.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2048631, term2048631.getClass(), "acc", null);
        setField(term2048631, term2048631.getClass(), "minSize", null);
        setBooleanField(term2048631, term2048631.getClass(), "minSizeSet", false);
        setField(term2048631, term2048631.getClass(), "prefSize", null);
        setBooleanField(term2048631, term2048631.getClass(), "prefSizeSet", false);
        setField(term2048631, term2048631.getClass(), "maxSize", null);
        setBooleanField(term2048631, term2048631.getClass(), "maxSizeSet", false);
        setField(term2048631, term2048631.getClass(), "componentOrientation", null);
        setBooleanField(term2048631, term2048631.getClass(), "newEventsOnly", false);
        setField(term2048631, term2048631.getClass(), "componentListener", null);
        setField(term2048631, term2048631.getClass(), "focusListener", null);
        setField(term2048631, term2048631.getClass(), "hierarchyListener", null);
        setField(term2048631, term2048631.getClass(), "hierarchyBoundsListener", null);
        setField(term2048631, term2048631.getClass(), "keyListener", null);
        setField(term2048631, term2048631.getClass(), "mouseListener", null);
        setField(term2048631, term2048631.getClass(), "mouseMotionListener", null);
        setField(term2048631, term2048631.getClass(), "mouseWheelListener", null);
        setField(term2048631, term2048631.getClass(), "inputMethodListener", null);
        setLongField(term2048631, term2048631.getClass(), "eventMask", 0L);
        setField(term2048631, term2048631.getClass(), "changeSupport", null);
        setField(term2048631, term2048631.getClass(), "objectLock", null);
        setBooleanField(term2048631, term2048631.getClass(), "isPacked", false);
        setIntField(term2048631, term2048631.getClass(), "boundsOp", 0);
        setField(term2048631, term2048631.getClass(), "compoundShape", null);
        setField(term2048631, term2048631.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2048631, term2048631.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2048631, term2048631.getClass(), "backgroundEraseDisabled", false);
        setField(term2048631, term2048631.getClass(), "eventCache", null);
        setBooleanField(term2048631, term2048631.getClass(), "coalescingEnabled", false);
        setBooleanField(term2048631, term2048631.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2048631, term2048631.getClass(), "componentSerializedDataVersion", 0);
        setField(term2048631, term2048631.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.RealmView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRealm", argTypes, term2048631, args);
    }

};


