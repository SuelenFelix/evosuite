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
import java.lang.Integer;

public class RealmView_updateRealm_5433231637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2082140;
     Object term2082181;
     Object term2082183;

    public RealmView_updateRealm_5433231637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2082140 = newInstance(Class.forName("org.openRealmOfStars.game.state.RealmView"));
        setField(term2082140, term2082140.getClass(), "realm", null);
        setField(term2082140, term2082140.getClass(), "raceImage", null);
        setField(term2082140, term2082140.getClass(), "raceDescription", null);
        setField(term2082140, term2082140.getClass(), "leaderDescription", null);
        setField(term2082140, term2082140.getClass(), "governmentDescription", null);
        setBooleanField(term2082140, term2082140.getClass(), "isAlignmentXSet", false);
        setFloatField(term2082140, term2082140.getClass(), "alignmentX", 0.0F);
        setBooleanField(term2082140, term2082140.getClass(), "isAlignmentYSet", false);
        setFloatField(term2082140, term2082140.getClass(), "alignmentY", 0.0F);
        setField(term2082140, term2082140.getClass(), "ui", null);
        setField(term2082140, term2082140.getClass(), "listenerList", null);
        setField(term2082140, term2082140.getClass(), "clientProperties", null);
        setField(term2082140, term2082140.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term2082140, term2082140.getClass(), "autoscrolls", false);
        setField(term2082140, term2082140.getClass(), "border", null);
        setIntField(term2082140, term2082140.getClass(), "flags", 0);
        setField(term2082140, term2082140.getClass(), "inputVerifier", null);
        setBooleanField(term2082140, term2082140.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term2082140, term2082140.getClass(), "paintingChild", null);
        setField(term2082140, term2082140.getClass(), "popupMenu", null);
        setField(term2082140, term2082140.getClass(), "revalidateRunnableScheduled", null);
        setField(term2082140, term2082140.getClass(), "focusInputMap", null);
        setField(term2082140, term2082140.getClass(), "ancestorInputMap", null);
        setField(term2082140, term2082140.getClass(), "windowInputMap", null);
        setField(term2082140, term2082140.getClass(), "actionMap", null);
        setField(term2082140, term2082140.getClass(), "aaHint", null);
        setField(term2082140, term2082140.getClass(), "lcdRenderingHint", null);
        setField(term2082140, term2082140.getClass(), "component", null);
        setField(term2082140, term2082140.getClass(), "layoutMgr", null);
        setField(term2082140, term2082140.getClass(), "dispatcher", null);
        setField(term2082140, term2082140.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2082140, term2082140.getClass(), "focusCycleRoot", false);
        setBooleanField(term2082140, term2082140.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2082140, term2082140.getClass(), "printingThreads", null);
        setBooleanField(term2082140, term2082140.getClass(), "printing", false);
        setField(term2082140, term2082140.getClass(), "containerListener", null);
        setIntField(term2082140, term2082140.getClass(), "listeningChildren", 0);
        setIntField(term2082140, term2082140.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2082140, term2082140.getClass(), "descendantsCount", 0);
        setField(term2082140, term2082140.getClass(), "preserveBackgroundColor", null);
        setIntField(term2082140, term2082140.getClass(), "numOfHWComponents", 0);
        setIntField(term2082140, term2082140.getClass(), "numOfLWComponents", 0);
        setField(term2082140, term2082140.getClass(), "modalComp", null);
        setField(term2082140, term2082140.getClass(), "modalAppContext", null);
        setIntField(term2082140, term2082140.getClass(), "containerSerializedDataVersion", 0);
        setField(term2082140, term2082140.getClass(), "peer", null);
        setField(term2082140, term2082140.getClass(), "parent", null);
        setField(term2082140, term2082140.getClass(), "appContext", null);
        setIntField(term2082140, term2082140.getClass(), "x", 0);
        setIntField(term2082140, term2082140.getClass(), "y", 0);
        setIntField(term2082140, term2082140.getClass(), "width", 0);
        setIntField(term2082140, term2082140.getClass(), "height", 0);
        setField(term2082140, term2082140.getClass(), "foreground", null);
        setField(term2082140, term2082140.getClass(), "background", null);
        setField(term2082140, term2082140.getClass(), "font", null);
        setField(term2082140, term2082140.getClass(), "peerFont", null);
        setField(term2082140, term2082140.getClass(), "cursor", null);
        setField(term2082140, term2082140.getClass(), "locale", null);
        setField(term2082140, term2082140.getClass(), "graphicsConfig", null);
        setField(term2082140, term2082140.getClass(), "bufferStrategy", null);
        setBooleanField(term2082140, term2082140.getClass(), "ignoreRepaint", false);
        setBooleanField(term2082140, term2082140.getClass(), "visible", false);
        setBooleanField(term2082140, term2082140.getClass(), "enabled", false);
        setBooleanField(term2082140, term2082140.getClass(), "valid", false);
        setField(term2082140, term2082140.getClass(), "dropTarget", null);
        setField(term2082140, term2082140.getClass(), "popups", null);
        setField(term2082140, term2082140.getClass(), "name", null);
        setBooleanField(term2082140, term2082140.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2082140, term2082140.getClass(), "focusable", false);
        setIntField(term2082140, term2082140.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2082140, term2082140.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2082140, term2082140.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2082140, term2082140.getClass(), "acc", null);
        setField(term2082140, term2082140.getClass(), "minSize", null);
        setBooleanField(term2082140, term2082140.getClass(), "minSizeSet", false);
        setField(term2082140, term2082140.getClass(), "prefSize", null);
        setBooleanField(term2082140, term2082140.getClass(), "prefSizeSet", false);
        setField(term2082140, term2082140.getClass(), "maxSize", null);
        setBooleanField(term2082140, term2082140.getClass(), "maxSizeSet", false);
        setField(term2082140, term2082140.getClass(), "componentOrientation", null);
        setBooleanField(term2082140, term2082140.getClass(), "newEventsOnly", false);
        setField(term2082140, term2082140.getClass(), "componentListener", null);
        setField(term2082140, term2082140.getClass(), "focusListener", null);
        setField(term2082140, term2082140.getClass(), "hierarchyListener", null);
        setField(term2082140, term2082140.getClass(), "hierarchyBoundsListener", null);
        setField(term2082140, term2082140.getClass(), "keyListener", null);
        setField(term2082140, term2082140.getClass(), "mouseListener", null);
        setField(term2082140, term2082140.getClass(), "mouseMotionListener", null);
        setField(term2082140, term2082140.getClass(), "mouseWheelListener", null);
        setField(term2082140, term2082140.getClass(), "inputMethodListener", null);
        setLongField(term2082140, term2082140.getClass(), "eventMask", 0L);
        setField(term2082140, term2082140.getClass(), "changeSupport", null);
        setField(term2082140, term2082140.getClass(), "objectLock", null);
        setBooleanField(term2082140, term2082140.getClass(), "isPacked", false);
        setIntField(term2082140, term2082140.getClass(), "boundsOp", 0);
        setField(term2082140, term2082140.getClass(), "compoundShape", null);
        setField(term2082140, term2082140.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2082140, term2082140.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2082140, term2082140.getClass(), "backgroundEraseDisabled", false);
        setField(term2082140, term2082140.getClass(), "eventCache", null);
        setBooleanField(term2082140, term2082140.getClass(), "coalescingEnabled", false);
        setBooleanField(term2082140, term2082140.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2082140, term2082140.getClass(), "componentSerializedDataVersion", 0);
        setField(term2082140, term2082140.getClass(), "accessibleContext", null);
        term2082181 = new Integer(0);
        term2082183 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.RealmView");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term2082181;
        args[2] = term2082183;
        callMethod(klass, "updateRealm", argTypes, term2082140, args);
    }

};


