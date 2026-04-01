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
import java.lang.Boolean;

public class AITurnView_removeBannedShipDesigns_119728768853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1327726;
     Object term1327771;
     Object term1327773;

    public AITurnView_removeBannedShipDesigns_119728768853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1327726 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1327726, term1327726.getClass(), "label", null);
        setField(term1327726, term1327726.getClass(), "game", null);
        setIntField(term1327726, term1327726.getClass(), "textAnim", 0);
        setIntField(term1327726, term1327726.getClass(), "cx", 0);
        setIntField(term1327726, term1327726.getClass(), "cy", 0);
        setField(term1327726, term1327726.getClass(), "aiThread", null);
        setBooleanField(term1327726, term1327726.getClass(), "readyToMove", false);
        setField(term1327726, term1327726.getClass(), "nextState", null);
        setField(term1327726, term1327726.getClass(), "nextStateObject", null);
        setBooleanField(term1327726, term1327726.getClass(), "isAlignmentXSet", false);
        setFloatField(term1327726, term1327726.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1327726, term1327726.getClass(), "isAlignmentYSet", false);
        setFloatField(term1327726, term1327726.getClass(), "alignmentY", 0.0F);
        setField(term1327726, term1327726.getClass(), "ui", null);
        setField(term1327726, term1327726.getClass(), "listenerList", null);
        setField(term1327726, term1327726.getClass(), "clientProperties", null);
        setField(term1327726, term1327726.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1327726, term1327726.getClass(), "autoscrolls", false);
        setField(term1327726, term1327726.getClass(), "border", null);
        setIntField(term1327726, term1327726.getClass(), "flags", 0);
        setField(term1327726, term1327726.getClass(), "inputVerifier", null);
        setBooleanField(term1327726, term1327726.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1327726, term1327726.getClass(), "paintingChild", null);
        setField(term1327726, term1327726.getClass(), "popupMenu", null);
        setField(term1327726, term1327726.getClass(), "revalidateRunnableScheduled", null);
        setField(term1327726, term1327726.getClass(), "focusInputMap", null);
        setField(term1327726, term1327726.getClass(), "ancestorInputMap", null);
        setField(term1327726, term1327726.getClass(), "windowInputMap", null);
        setField(term1327726, term1327726.getClass(), "actionMap", null);
        setField(term1327726, term1327726.getClass(), "aaHint", null);
        setField(term1327726, term1327726.getClass(), "lcdRenderingHint", null);
        setField(term1327726, term1327726.getClass(), "component", null);
        setField(term1327726, term1327726.getClass(), "layoutMgr", null);
        setField(term1327726, term1327726.getClass(), "dispatcher", null);
        setField(term1327726, term1327726.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1327726, term1327726.getClass(), "focusCycleRoot", false);
        setBooleanField(term1327726, term1327726.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1327726, term1327726.getClass(), "printingThreads", null);
        setBooleanField(term1327726, term1327726.getClass(), "printing", false);
        setField(term1327726, term1327726.getClass(), "containerListener", null);
        setIntField(term1327726, term1327726.getClass(), "listeningChildren", 0);
        setIntField(term1327726, term1327726.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1327726, term1327726.getClass(), "descendantsCount", 0);
        setField(term1327726, term1327726.getClass(), "preserveBackgroundColor", null);
        setIntField(term1327726, term1327726.getClass(), "numOfHWComponents", 0);
        setIntField(term1327726, term1327726.getClass(), "numOfLWComponents", 0);
        setField(term1327726, term1327726.getClass(), "modalComp", null);
        setField(term1327726, term1327726.getClass(), "modalAppContext", null);
        setIntField(term1327726, term1327726.getClass(), "containerSerializedDataVersion", 0);
        setField(term1327726, term1327726.getClass(), "peer", null);
        setField(term1327726, term1327726.getClass(), "parent", null);
        setField(term1327726, term1327726.getClass(), "appContext", null);
        setIntField(term1327726, term1327726.getClass(), "x", 0);
        setIntField(term1327726, term1327726.getClass(), "y", 0);
        setIntField(term1327726, term1327726.getClass(), "width", 0);
        setIntField(term1327726, term1327726.getClass(), "height", 0);
        setField(term1327726, term1327726.getClass(), "foreground", null);
        setField(term1327726, term1327726.getClass(), "background", null);
        setField(term1327726, term1327726.getClass(), "font", null);
        setField(term1327726, term1327726.getClass(), "peerFont", null);
        setField(term1327726, term1327726.getClass(), "cursor", null);
        setField(term1327726, term1327726.getClass(), "locale", null);
        setField(term1327726, term1327726.getClass(), "graphicsConfig", null);
        setField(term1327726, term1327726.getClass(), "bufferStrategy", null);
        setBooleanField(term1327726, term1327726.getClass(), "ignoreRepaint", false);
        setBooleanField(term1327726, term1327726.getClass(), "visible", false);
        setBooleanField(term1327726, term1327726.getClass(), "enabled", false);
        setBooleanField(term1327726, term1327726.getClass(), "valid", false);
        setField(term1327726, term1327726.getClass(), "dropTarget", null);
        setField(term1327726, term1327726.getClass(), "popups", null);
        setField(term1327726, term1327726.getClass(), "name", null);
        setBooleanField(term1327726, term1327726.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1327726, term1327726.getClass(), "focusable", false);
        setIntField(term1327726, term1327726.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1327726, term1327726.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1327726, term1327726.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1327726, term1327726.getClass(), "acc", null);
        setField(term1327726, term1327726.getClass(), "minSize", null);
        setBooleanField(term1327726, term1327726.getClass(), "minSizeSet", false);
        setField(term1327726, term1327726.getClass(), "prefSize", null);
        setBooleanField(term1327726, term1327726.getClass(), "prefSizeSet", false);
        setField(term1327726, term1327726.getClass(), "maxSize", null);
        setBooleanField(term1327726, term1327726.getClass(), "maxSizeSet", false);
        setField(term1327726, term1327726.getClass(), "componentOrientation", null);
        setBooleanField(term1327726, term1327726.getClass(), "newEventsOnly", false);
        setField(term1327726, term1327726.getClass(), "componentListener", null);
        setField(term1327726, term1327726.getClass(), "focusListener", null);
        setField(term1327726, term1327726.getClass(), "hierarchyListener", null);
        setField(term1327726, term1327726.getClass(), "hierarchyBoundsListener", null);
        setField(term1327726, term1327726.getClass(), "keyListener", null);
        setField(term1327726, term1327726.getClass(), "mouseListener", null);
        setField(term1327726, term1327726.getClass(), "mouseMotionListener", null);
        setField(term1327726, term1327726.getClass(), "mouseWheelListener", null);
        setField(term1327726, term1327726.getClass(), "inputMethodListener", null);
        setLongField(term1327726, term1327726.getClass(), "eventMask", 0L);
        setField(term1327726, term1327726.getClass(), "changeSupport", null);
        setField(term1327726, term1327726.getClass(), "objectLock", null);
        setBooleanField(term1327726, term1327726.getClass(), "isPacked", false);
        setIntField(term1327726, term1327726.getClass(), "boundsOp", 0);
        setField(term1327726, term1327726.getClass(), "compoundShape", null);
        setField(term1327726, term1327726.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1327726, term1327726.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1327726, term1327726.getClass(), "backgroundEraseDisabled", false);
        setField(term1327726, term1327726.getClass(), "eventCache", null);
        setBooleanField(term1327726, term1327726.getClass(), "coalescingEnabled", false);
        setBooleanField(term1327726, term1327726.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1327726, term1327726.getClass(), "componentSerializedDataVersion", 0);
        setField(term1327726, term1327726.getClass(), "accessibleContext", null);
        term1327771 = new Boolean(false);
        term1327773 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.AITurnView");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term1327771;
        args[2] = term1327773;
        callMethod(klass, "removeBannedShipDesigns", argTypes, term1327726, args);
    }

};


