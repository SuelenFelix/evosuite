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

public class LoadGameView_deleteSelectedGame_17745917262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term996465;

    public LoadGameView_deleteSelectedGame_17745917262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term996465 = newInstance(Class.forName("org.openRealmOfStars.game.state.LoadGameView"));
        setField(term996465, term996465.getClass(), "saveGamesList", null);
        setField(term996465, term996465.getClass(), "confirmDeleteBox", null);
        setField(term996465, term996465.getClass(), "deleteBtn", null);
        setField(term996465, term996465.getClass(), "loadBtn", null);
        setBooleanField(term996465, term996465.getClass(), "isAlignmentXSet", false);
        setFloatField(term996465, term996465.getClass(), "alignmentX", 0.0F);
        setBooleanField(term996465, term996465.getClass(), "isAlignmentYSet", false);
        setFloatField(term996465, term996465.getClass(), "alignmentY", 0.0F);
        setField(term996465, term996465.getClass(), "ui", null);
        setField(term996465, term996465.getClass(), "listenerList", null);
        setField(term996465, term996465.getClass(), "clientProperties", null);
        setField(term996465, term996465.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term996465, term996465.getClass(), "autoscrolls", false);
        setField(term996465, term996465.getClass(), "border", null);
        setIntField(term996465, term996465.getClass(), "flags", 0);
        setField(term996465, term996465.getClass(), "inputVerifier", null);
        setBooleanField(term996465, term996465.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term996465, term996465.getClass(), "paintingChild", null);
        setField(term996465, term996465.getClass(), "popupMenu", null);
        setField(term996465, term996465.getClass(), "revalidateRunnableScheduled", null);
        setField(term996465, term996465.getClass(), "focusInputMap", null);
        setField(term996465, term996465.getClass(), "ancestorInputMap", null);
        setField(term996465, term996465.getClass(), "windowInputMap", null);
        setField(term996465, term996465.getClass(), "actionMap", null);
        setField(term996465, term996465.getClass(), "aaHint", null);
        setField(term996465, term996465.getClass(), "lcdRenderingHint", null);
        setField(term996465, term996465.getClass(), "component", null);
        setField(term996465, term996465.getClass(), "layoutMgr", null);
        setField(term996465, term996465.getClass(), "dispatcher", null);
        setField(term996465, term996465.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term996465, term996465.getClass(), "focusCycleRoot", false);
        setBooleanField(term996465, term996465.getClass(), "focusTraversalPolicyProvider", false);
        setField(term996465, term996465.getClass(), "printingThreads", null);
        setBooleanField(term996465, term996465.getClass(), "printing", false);
        setField(term996465, term996465.getClass(), "containerListener", null);
        setIntField(term996465, term996465.getClass(), "listeningChildren", 0);
        setIntField(term996465, term996465.getClass(), "listeningBoundsChildren", 0);
        setIntField(term996465, term996465.getClass(), "descendantsCount", 0);
        setField(term996465, term996465.getClass(), "preserveBackgroundColor", null);
        setIntField(term996465, term996465.getClass(), "numOfHWComponents", 0);
        setIntField(term996465, term996465.getClass(), "numOfLWComponents", 0);
        setField(term996465, term996465.getClass(), "modalComp", null);
        setField(term996465, term996465.getClass(), "modalAppContext", null);
        setIntField(term996465, term996465.getClass(), "containerSerializedDataVersion", 0);
        setField(term996465, term996465.getClass(), "peer", null);
        setField(term996465, term996465.getClass(), "parent", null);
        setField(term996465, term996465.getClass(), "appContext", null);
        setIntField(term996465, term996465.getClass(), "x", 0);
        setIntField(term996465, term996465.getClass(), "y", 0);
        setIntField(term996465, term996465.getClass(), "width", 0);
        setIntField(term996465, term996465.getClass(), "height", 0);
        setField(term996465, term996465.getClass(), "foreground", null);
        setField(term996465, term996465.getClass(), "background", null);
        setField(term996465, term996465.getClass(), "font", null);
        setField(term996465, term996465.getClass(), "peerFont", null);
        setField(term996465, term996465.getClass(), "cursor", null);
        setField(term996465, term996465.getClass(), "locale", null);
        setField(term996465, term996465.getClass(), "graphicsConfig", null);
        setField(term996465, term996465.getClass(), "bufferStrategy", null);
        setBooleanField(term996465, term996465.getClass(), "ignoreRepaint", false);
        setBooleanField(term996465, term996465.getClass(), "visible", false);
        setBooleanField(term996465, term996465.getClass(), "enabled", false);
        setBooleanField(term996465, term996465.getClass(), "valid", false);
        setField(term996465, term996465.getClass(), "dropTarget", null);
        setField(term996465, term996465.getClass(), "popups", null);
        setField(term996465, term996465.getClass(), "name", null);
        setBooleanField(term996465, term996465.getClass(), "nameExplicitlySet", false);
        setBooleanField(term996465, term996465.getClass(), "focusable", false);
        setIntField(term996465, term996465.getClass(), "isFocusTraversableOverridden", 0);
        setField(term996465, term996465.getClass(), "focusTraversalKeys", null);
        setBooleanField(term996465, term996465.getClass(), "focusTraversalKeysEnabled", false);
        setField(term996465, term996465.getClass(), "acc", null);
        setField(term996465, term996465.getClass(), "minSize", null);
        setBooleanField(term996465, term996465.getClass(), "minSizeSet", false);
        setField(term996465, term996465.getClass(), "prefSize", null);
        setBooleanField(term996465, term996465.getClass(), "prefSizeSet", false);
        setField(term996465, term996465.getClass(), "maxSize", null);
        setBooleanField(term996465, term996465.getClass(), "maxSizeSet", false);
        setField(term996465, term996465.getClass(), "componentOrientation", null);
        setBooleanField(term996465, term996465.getClass(), "newEventsOnly", false);
        setField(term996465, term996465.getClass(), "componentListener", null);
        setField(term996465, term996465.getClass(), "focusListener", null);
        setField(term996465, term996465.getClass(), "hierarchyListener", null);
        setField(term996465, term996465.getClass(), "hierarchyBoundsListener", null);
        setField(term996465, term996465.getClass(), "keyListener", null);
        setField(term996465, term996465.getClass(), "mouseListener", null);
        setField(term996465, term996465.getClass(), "mouseMotionListener", null);
        setField(term996465, term996465.getClass(), "mouseWheelListener", null);
        setField(term996465, term996465.getClass(), "inputMethodListener", null);
        setLongField(term996465, term996465.getClass(), "eventMask", 0L);
        setField(term996465, term996465.getClass(), "changeSupport", null);
        setField(term996465, term996465.getClass(), "objectLock", null);
        setBooleanField(term996465, term996465.getClass(), "isPacked", false);
        setIntField(term996465, term996465.getClass(), "boundsOp", 0);
        setField(term996465, term996465.getClass(), "compoundShape", null);
        setField(term996465, term996465.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term996465, term996465.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term996465, term996465.getClass(), "backgroundEraseDisabled", false);
        setField(term996465, term996465.getClass(), "eventCache", null);
        setBooleanField(term996465, term996465.getClass(), "coalescingEnabled", false);
        setBooleanField(term996465, term996465.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term996465, term996465.getClass(), "componentSerializedDataVersion", 0);
        setField(term996465, term996465.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.LoadGameView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "deleteSelectedGame", argTypes, term996465, args);
    }

};


