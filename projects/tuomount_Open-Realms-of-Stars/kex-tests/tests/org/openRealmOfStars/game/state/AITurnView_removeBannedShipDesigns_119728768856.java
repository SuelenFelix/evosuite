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

public class AITurnView_removeBannedShipDesigns_119728768856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1278110;
     Object term1278155;
     Object term1278157;

    public AITurnView_removeBannedShipDesigns_119728768856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1278110 = newInstance(Class.forName("org.openRealmOfStars.game.state.AITurnView"));
        setField(term1278110, term1278110.getClass(), "label", null);
        setField(term1278110, term1278110.getClass(), "game", null);
        setIntField(term1278110, term1278110.getClass(), "textAnim", 0);
        setIntField(term1278110, term1278110.getClass(), "cx", 0);
        setIntField(term1278110, term1278110.getClass(), "cy", 0);
        setField(term1278110, term1278110.getClass(), "aiThread", null);
        setBooleanField(term1278110, term1278110.getClass(), "readyToMove", false);
        setField(term1278110, term1278110.getClass(), "nextState", null);
        setField(term1278110, term1278110.getClass(), "nextStateObject", null);
        setBooleanField(term1278110, term1278110.getClass(), "isAlignmentXSet", false);
        setFloatField(term1278110, term1278110.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1278110, term1278110.getClass(), "isAlignmentYSet", false);
        setFloatField(term1278110, term1278110.getClass(), "alignmentY", 0.0F);
        setField(term1278110, term1278110.getClass(), "ui", null);
        setField(term1278110, term1278110.getClass(), "listenerList", null);
        setField(term1278110, term1278110.getClass(), "clientProperties", null);
        setField(term1278110, term1278110.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1278110, term1278110.getClass(), "autoscrolls", false);
        setField(term1278110, term1278110.getClass(), "border", null);
        setIntField(term1278110, term1278110.getClass(), "flags", 0);
        setField(term1278110, term1278110.getClass(), "inputVerifier", null);
        setBooleanField(term1278110, term1278110.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1278110, term1278110.getClass(), "paintingChild", null);
        setField(term1278110, term1278110.getClass(), "popupMenu", null);
        setField(term1278110, term1278110.getClass(), "revalidateRunnableScheduled", null);
        setField(term1278110, term1278110.getClass(), "focusInputMap", null);
        setField(term1278110, term1278110.getClass(), "ancestorInputMap", null);
        setField(term1278110, term1278110.getClass(), "windowInputMap", null);
        setField(term1278110, term1278110.getClass(), "actionMap", null);
        setField(term1278110, term1278110.getClass(), "aaHint", null);
        setField(term1278110, term1278110.getClass(), "lcdRenderingHint", null);
        setField(term1278110, term1278110.getClass(), "component", null);
        setField(term1278110, term1278110.getClass(), "layoutMgr", null);
        setField(term1278110, term1278110.getClass(), "dispatcher", null);
        setField(term1278110, term1278110.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1278110, term1278110.getClass(), "focusCycleRoot", false);
        setBooleanField(term1278110, term1278110.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1278110, term1278110.getClass(), "printingThreads", null);
        setBooleanField(term1278110, term1278110.getClass(), "printing", false);
        setField(term1278110, term1278110.getClass(), "containerListener", null);
        setIntField(term1278110, term1278110.getClass(), "listeningChildren", 0);
        setIntField(term1278110, term1278110.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1278110, term1278110.getClass(), "descendantsCount", 0);
        setField(term1278110, term1278110.getClass(), "preserveBackgroundColor", null);
        setIntField(term1278110, term1278110.getClass(), "numOfHWComponents", 0);
        setIntField(term1278110, term1278110.getClass(), "numOfLWComponents", 0);
        setField(term1278110, term1278110.getClass(), "modalComp", null);
        setField(term1278110, term1278110.getClass(), "modalAppContext", null);
        setIntField(term1278110, term1278110.getClass(), "containerSerializedDataVersion", 0);
        setField(term1278110, term1278110.getClass(), "peer", null);
        setField(term1278110, term1278110.getClass(), "parent", null);
        setField(term1278110, term1278110.getClass(), "appContext", null);
        setIntField(term1278110, term1278110.getClass(), "x", 0);
        setIntField(term1278110, term1278110.getClass(), "y", 0);
        setIntField(term1278110, term1278110.getClass(), "width", 0);
        setIntField(term1278110, term1278110.getClass(), "height", 0);
        setField(term1278110, term1278110.getClass(), "foreground", null);
        setField(term1278110, term1278110.getClass(), "background", null);
        setField(term1278110, term1278110.getClass(), "font", null);
        setField(term1278110, term1278110.getClass(), "peerFont", null);
        setField(term1278110, term1278110.getClass(), "cursor", null);
        setField(term1278110, term1278110.getClass(), "locale", null);
        setField(term1278110, term1278110.getClass(), "graphicsConfig", null);
        setField(term1278110, term1278110.getClass(), "bufferStrategy", null);
        setBooleanField(term1278110, term1278110.getClass(), "ignoreRepaint", false);
        setBooleanField(term1278110, term1278110.getClass(), "visible", false);
        setBooleanField(term1278110, term1278110.getClass(), "enabled", false);
        setBooleanField(term1278110, term1278110.getClass(), "valid", false);
        setField(term1278110, term1278110.getClass(), "dropTarget", null);
        setField(term1278110, term1278110.getClass(), "popups", null);
        setField(term1278110, term1278110.getClass(), "name", null);
        setBooleanField(term1278110, term1278110.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1278110, term1278110.getClass(), "focusable", false);
        setIntField(term1278110, term1278110.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1278110, term1278110.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1278110, term1278110.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1278110, term1278110.getClass(), "acc", null);
        setField(term1278110, term1278110.getClass(), "minSize", null);
        setBooleanField(term1278110, term1278110.getClass(), "minSizeSet", false);
        setField(term1278110, term1278110.getClass(), "prefSize", null);
        setBooleanField(term1278110, term1278110.getClass(), "prefSizeSet", false);
        setField(term1278110, term1278110.getClass(), "maxSize", null);
        setBooleanField(term1278110, term1278110.getClass(), "maxSizeSet", false);
        setField(term1278110, term1278110.getClass(), "componentOrientation", null);
        setBooleanField(term1278110, term1278110.getClass(), "newEventsOnly", false);
        setField(term1278110, term1278110.getClass(), "componentListener", null);
        setField(term1278110, term1278110.getClass(), "focusListener", null);
        setField(term1278110, term1278110.getClass(), "hierarchyListener", null);
        setField(term1278110, term1278110.getClass(), "hierarchyBoundsListener", null);
        setField(term1278110, term1278110.getClass(), "keyListener", null);
        setField(term1278110, term1278110.getClass(), "mouseListener", null);
        setField(term1278110, term1278110.getClass(), "mouseMotionListener", null);
        setField(term1278110, term1278110.getClass(), "mouseWheelListener", null);
        setField(term1278110, term1278110.getClass(), "inputMethodListener", null);
        setLongField(term1278110, term1278110.getClass(), "eventMask", 0L);
        setField(term1278110, term1278110.getClass(), "changeSupport", null);
        setField(term1278110, term1278110.getClass(), "objectLock", null);
        setBooleanField(term1278110, term1278110.getClass(), "isPacked", false);
        setIntField(term1278110, term1278110.getClass(), "boundsOp", 0);
        setField(term1278110, term1278110.getClass(), "compoundShape", null);
        setField(term1278110, term1278110.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1278110, term1278110.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1278110, term1278110.getClass(), "backgroundEraseDisabled", false);
        setField(term1278110, term1278110.getClass(), "eventCache", null);
        setBooleanField(term1278110, term1278110.getClass(), "coalescingEnabled", false);
        setBooleanField(term1278110, term1278110.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1278110, term1278110.getClass(), "componentSerializedDataVersion", 0);
        setField(term1278110, term1278110.getClass(), "accessibleContext", null);
        term1278155 = new Boolean(false);
        term1278157 = new Boolean(false);
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
        args[1] = term1278155;
        args[2] = term1278157;
        callMethod(klass, "removeBannedShipDesigns", argTypes, term1278110, args);
    }

};


