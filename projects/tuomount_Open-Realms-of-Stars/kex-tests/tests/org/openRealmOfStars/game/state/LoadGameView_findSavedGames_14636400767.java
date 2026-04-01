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

public class LoadGameView_findSavedGames_14636400767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term997371;

    public LoadGameView_findSavedGames_14636400767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term997371 = newInstance(Class.forName("org.openRealmOfStars.game.state.LoadGameView"));
        setField(term997371, term997371.getClass(), "saveGamesList", null);
        setField(term997371, term997371.getClass(), "confirmDeleteBox", null);
        setField(term997371, term997371.getClass(), "deleteBtn", null);
        setField(term997371, term997371.getClass(), "loadBtn", null);
        setBooleanField(term997371, term997371.getClass(), "isAlignmentXSet", false);
        setFloatField(term997371, term997371.getClass(), "alignmentX", 0.0F);
        setBooleanField(term997371, term997371.getClass(), "isAlignmentYSet", false);
        setFloatField(term997371, term997371.getClass(), "alignmentY", 0.0F);
        setField(term997371, term997371.getClass(), "ui", null);
        setField(term997371, term997371.getClass(), "listenerList", null);
        setField(term997371, term997371.getClass(), "clientProperties", null);
        setField(term997371, term997371.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term997371, term997371.getClass(), "autoscrolls", false);
        setField(term997371, term997371.getClass(), "border", null);
        setIntField(term997371, term997371.getClass(), "flags", 0);
        setField(term997371, term997371.getClass(), "inputVerifier", null);
        setBooleanField(term997371, term997371.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term997371, term997371.getClass(), "paintingChild", null);
        setField(term997371, term997371.getClass(), "popupMenu", null);
        setField(term997371, term997371.getClass(), "revalidateRunnableScheduled", null);
        setField(term997371, term997371.getClass(), "focusInputMap", null);
        setField(term997371, term997371.getClass(), "ancestorInputMap", null);
        setField(term997371, term997371.getClass(), "windowInputMap", null);
        setField(term997371, term997371.getClass(), "actionMap", null);
        setField(term997371, term997371.getClass(), "aaHint", null);
        setField(term997371, term997371.getClass(), "lcdRenderingHint", null);
        setField(term997371, term997371.getClass(), "component", null);
        setField(term997371, term997371.getClass(), "layoutMgr", null);
        setField(term997371, term997371.getClass(), "dispatcher", null);
        setField(term997371, term997371.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term997371, term997371.getClass(), "focusCycleRoot", false);
        setBooleanField(term997371, term997371.getClass(), "focusTraversalPolicyProvider", false);
        setField(term997371, term997371.getClass(), "printingThreads", null);
        setBooleanField(term997371, term997371.getClass(), "printing", false);
        setField(term997371, term997371.getClass(), "containerListener", null);
        setIntField(term997371, term997371.getClass(), "listeningChildren", 0);
        setIntField(term997371, term997371.getClass(), "listeningBoundsChildren", 0);
        setIntField(term997371, term997371.getClass(), "descendantsCount", 0);
        setField(term997371, term997371.getClass(), "preserveBackgroundColor", null);
        setIntField(term997371, term997371.getClass(), "numOfHWComponents", 0);
        setIntField(term997371, term997371.getClass(), "numOfLWComponents", 0);
        setField(term997371, term997371.getClass(), "modalComp", null);
        setField(term997371, term997371.getClass(), "modalAppContext", null);
        setIntField(term997371, term997371.getClass(), "containerSerializedDataVersion", 0);
        setField(term997371, term997371.getClass(), "peer", null);
        setField(term997371, term997371.getClass(), "parent", null);
        setField(term997371, term997371.getClass(), "appContext", null);
        setIntField(term997371, term997371.getClass(), "x", 0);
        setIntField(term997371, term997371.getClass(), "y", 0);
        setIntField(term997371, term997371.getClass(), "width", 0);
        setIntField(term997371, term997371.getClass(), "height", 0);
        setField(term997371, term997371.getClass(), "foreground", null);
        setField(term997371, term997371.getClass(), "background", null);
        setField(term997371, term997371.getClass(), "font", null);
        setField(term997371, term997371.getClass(), "peerFont", null);
        setField(term997371, term997371.getClass(), "cursor", null);
        setField(term997371, term997371.getClass(), "locale", null);
        setField(term997371, term997371.getClass(), "graphicsConfig", null);
        setField(term997371, term997371.getClass(), "bufferStrategy", null);
        setBooleanField(term997371, term997371.getClass(), "ignoreRepaint", false);
        setBooleanField(term997371, term997371.getClass(), "visible", false);
        setBooleanField(term997371, term997371.getClass(), "enabled", false);
        setBooleanField(term997371, term997371.getClass(), "valid", false);
        setField(term997371, term997371.getClass(), "dropTarget", null);
        setField(term997371, term997371.getClass(), "popups", null);
        setField(term997371, term997371.getClass(), "name", null);
        setBooleanField(term997371, term997371.getClass(), "nameExplicitlySet", false);
        setBooleanField(term997371, term997371.getClass(), "focusable", false);
        setIntField(term997371, term997371.getClass(), "isFocusTraversableOverridden", 0);
        setField(term997371, term997371.getClass(), "focusTraversalKeys", null);
        setBooleanField(term997371, term997371.getClass(), "focusTraversalKeysEnabled", false);
        setField(term997371, term997371.getClass(), "acc", null);
        setField(term997371, term997371.getClass(), "minSize", null);
        setBooleanField(term997371, term997371.getClass(), "minSizeSet", false);
        setField(term997371, term997371.getClass(), "prefSize", null);
        setBooleanField(term997371, term997371.getClass(), "prefSizeSet", false);
        setField(term997371, term997371.getClass(), "maxSize", null);
        setBooleanField(term997371, term997371.getClass(), "maxSizeSet", false);
        setField(term997371, term997371.getClass(), "componentOrientation", null);
        setBooleanField(term997371, term997371.getClass(), "newEventsOnly", false);
        setField(term997371, term997371.getClass(), "componentListener", null);
        setField(term997371, term997371.getClass(), "focusListener", null);
        setField(term997371, term997371.getClass(), "hierarchyListener", null);
        setField(term997371, term997371.getClass(), "hierarchyBoundsListener", null);
        setField(term997371, term997371.getClass(), "keyListener", null);
        setField(term997371, term997371.getClass(), "mouseListener", null);
        setField(term997371, term997371.getClass(), "mouseMotionListener", null);
        setField(term997371, term997371.getClass(), "mouseWheelListener", null);
        setField(term997371, term997371.getClass(), "inputMethodListener", null);
        setLongField(term997371, term997371.getClass(), "eventMask", 0L);
        setField(term997371, term997371.getClass(), "changeSupport", null);
        setField(term997371, term997371.getClass(), "objectLock", null);
        setBooleanField(term997371, term997371.getClass(), "isPacked", false);
        setIntField(term997371, term997371.getClass(), "boundsOp", 0);
        setField(term997371, term997371.getClass(), "compoundShape", null);
        setField(term997371, term997371.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term997371, term997371.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term997371, term997371.getClass(), "backgroundEraseDisabled", false);
        setField(term997371, term997371.getClass(), "eventCache", null);
        setBooleanField(term997371, term997371.getClass(), "coalescingEnabled", false);
        setBooleanField(term997371, term997371.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term997371, term997371.getClass(), "componentSerializedDataVersion", 0);
        setField(term997371, term997371.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.LoadGameView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findSavedGames", argTypes, term997371, args);
    }

};


