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

public class AITurnView_searchForBlackHoleForRealms_183319334434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1264780;

    public AITurnView_searchForBlackHoleForRealms_183319334434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1264780 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1264780, term1264780.getClass(), "label", null);
        setField(term1264780, term1264780.getClass(), "game", null);
        setIntField(term1264780, term1264780.getClass(), "textAnim", 0);
        setIntField(term1264780, term1264780.getClass(), "cx", 0);
        setIntField(term1264780, term1264780.getClass(), "cy", 0);
        setField(term1264780, term1264780.getClass(), "aiThread", null);
        setBooleanField(term1264780, term1264780.getClass(), "readyToMove", false);
        setField(term1264780, term1264780.getClass(), "nextState", null);
        setField(term1264780, term1264780.getClass(), "nextStateObject", null);
        setBooleanField(term1264780, term1264780.getClass(), "isAlignmentXSet", false);
        setFloatField(term1264780, term1264780.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1264780, term1264780.getClass(), "isAlignmentYSet", false);
        setFloatField(term1264780, term1264780.getClass(), "alignmentY", 0.0F);
        setField(term1264780, term1264780.getClass(), "ui", null);
        setField(term1264780, term1264780.getClass(), "listenerList", null);
        setField(term1264780, term1264780.getClass(), "clientProperties", null);
        setField(term1264780, term1264780.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1264780, term1264780.getClass(), "autoscrolls", false);
        setField(term1264780, term1264780.getClass(), "border", null);
        setIntField(term1264780, term1264780.getClass(), "flags", 0);
        setField(term1264780, term1264780.getClass(), "inputVerifier", null);
        setBooleanField(term1264780, term1264780.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1264780, term1264780.getClass(), "paintingChild", null);
        setField(term1264780, term1264780.getClass(), "popupMenu", null);
        setField(term1264780, term1264780.getClass(), "revalidateRunnableScheduled", null);
        setField(term1264780, term1264780.getClass(), "focusInputMap", null);
        setField(term1264780, term1264780.getClass(), "ancestorInputMap", null);
        setField(term1264780, term1264780.getClass(), "windowInputMap", null);
        setField(term1264780, term1264780.getClass(), "actionMap", null);
        setField(term1264780, term1264780.getClass(), "aaHint", null);
        setField(term1264780, term1264780.getClass(), "lcdRenderingHint", null);
        setField(term1264780, term1264780.getClass(), "component", null);
        setField(term1264780, term1264780.getClass(), "layoutMgr", null);
        setField(term1264780, term1264780.getClass(), "dispatcher", null);
        setField(term1264780, term1264780.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1264780, term1264780.getClass(), "focusCycleRoot", false);
        setBooleanField(term1264780, term1264780.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1264780, term1264780.getClass(), "printingThreads", null);
        setBooleanField(term1264780, term1264780.getClass(), "printing", false);
        setField(term1264780, term1264780.getClass(), "containerListener", null);
        setIntField(term1264780, term1264780.getClass(), "listeningChildren", 0);
        setIntField(term1264780, term1264780.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1264780, term1264780.getClass(), "descendantsCount", 0);
        setField(term1264780, term1264780.getClass(), "preserveBackgroundColor", null);
        setIntField(term1264780, term1264780.getClass(), "numOfHWComponents", 0);
        setIntField(term1264780, term1264780.getClass(), "numOfLWComponents", 0);
        setField(term1264780, term1264780.getClass(), "modalComp", null);
        setField(term1264780, term1264780.getClass(), "modalAppContext", null);
        setIntField(term1264780, term1264780.getClass(), "containerSerializedDataVersion", 0);
        setField(term1264780, term1264780.getClass(), "peer", null);
        setField(term1264780, term1264780.getClass(), "parent", null);
        setField(term1264780, term1264780.getClass(), "appContext", null);
        setIntField(term1264780, term1264780.getClass(), "x", 0);
        setIntField(term1264780, term1264780.getClass(), "y", 0);
        setIntField(term1264780, term1264780.getClass(), "width", 0);
        setIntField(term1264780, term1264780.getClass(), "height", 0);
        setField(term1264780, term1264780.getClass(), "foreground", null);
        setField(term1264780, term1264780.getClass(), "background", null);
        setField(term1264780, term1264780.getClass(), "font", null);
        setField(term1264780, term1264780.getClass(), "peerFont", null);
        setField(term1264780, term1264780.getClass(), "cursor", null);
        setField(term1264780, term1264780.getClass(), "locale", null);
        setField(term1264780, term1264780.getClass(), "graphicsConfig", null);
        setField(term1264780, term1264780.getClass(), "bufferStrategy", null);
        setBooleanField(term1264780, term1264780.getClass(), "ignoreRepaint", false);
        setBooleanField(term1264780, term1264780.getClass(), "visible", false);
        setBooleanField(term1264780, term1264780.getClass(), "enabled", false);
        setBooleanField(term1264780, term1264780.getClass(), "valid", false);
        setField(term1264780, term1264780.getClass(), "dropTarget", null);
        setField(term1264780, term1264780.getClass(), "popups", null);
        setField(term1264780, term1264780.getClass(), "name", null);
        setBooleanField(term1264780, term1264780.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1264780, term1264780.getClass(), "focusable", false);
        setIntField(term1264780, term1264780.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1264780, term1264780.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1264780, term1264780.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1264780, term1264780.getClass(), "acc", null);
        setField(term1264780, term1264780.getClass(), "minSize", null);
        setBooleanField(term1264780, term1264780.getClass(), "minSizeSet", false);
        setField(term1264780, term1264780.getClass(), "prefSize", null);
        setBooleanField(term1264780, term1264780.getClass(), "prefSizeSet", false);
        setField(term1264780, term1264780.getClass(), "maxSize", null);
        setBooleanField(term1264780, term1264780.getClass(), "maxSizeSet", false);
        setField(term1264780, term1264780.getClass(), "componentOrientation", null);
        setBooleanField(term1264780, term1264780.getClass(), "newEventsOnly", false);
        setField(term1264780, term1264780.getClass(), "componentListener", null);
        setField(term1264780, term1264780.getClass(), "focusListener", null);
        setField(term1264780, term1264780.getClass(), "hierarchyListener", null);
        setField(term1264780, term1264780.getClass(), "hierarchyBoundsListener", null);
        setField(term1264780, term1264780.getClass(), "keyListener", null);
        setField(term1264780, term1264780.getClass(), "mouseListener", null);
        setField(term1264780, term1264780.getClass(), "mouseMotionListener", null);
        setField(term1264780, term1264780.getClass(), "mouseWheelListener", null);
        setField(term1264780, term1264780.getClass(), "inputMethodListener", null);
        setLongField(term1264780, term1264780.getClass(), "eventMask", 0L);
        setField(term1264780, term1264780.getClass(), "changeSupport", null);
        setField(term1264780, term1264780.getClass(), "objectLock", null);
        setBooleanField(term1264780, term1264780.getClass(), "isPacked", false);
        setIntField(term1264780, term1264780.getClass(), "boundsOp", 0);
        setField(term1264780, term1264780.getClass(), "compoundShape", null);
        setField(term1264780, term1264780.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1264780, term1264780.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1264780, term1264780.getClass(), "backgroundEraseDisabled", false);
        setField(term1264780, term1264780.getClass(), "eventCache", null);
        setBooleanField(term1264780, term1264780.getClass(), "coalescingEnabled", false);
        setBooleanField(term1264780, term1264780.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1264780, term1264780.getClass(), "componentSerializedDataVersion", 0);
        setField(term1264780, term1264780.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "searchForBlackHoleForRealms", argTypes, term1264780, args);
    }

};


