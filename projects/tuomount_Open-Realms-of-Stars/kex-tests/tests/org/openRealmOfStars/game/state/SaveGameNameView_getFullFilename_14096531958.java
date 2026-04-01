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

public class SaveGameNameView_getFullFilename_14096531958 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term392496;

    public SaveGameNameView_getFullFilename_14096531958() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term392496 = newInstance(Class.forName("org.openRealmOfStars.game.state.SaveGameNameView"));
        setField(term392496, term392496.getClass(), "saveGameField", null);
        setField(term392496, term392496.getClass(), "overWriteFile", null);
        setField(term392496, term392496.getClass(), "startGameBtn", null);
        setBooleanField(term392496, term392496.getClass(), "continueGame", false);
        setBooleanField(term392496, term392496.getClass(), "isAlignmentXSet", false);
        setFloatField(term392496, term392496.getClass(), "alignmentX", 0.0F);
        setBooleanField(term392496, term392496.getClass(), "isAlignmentYSet", false);
        setFloatField(term392496, term392496.getClass(), "alignmentY", 0.0F);
        setField(term392496, term392496.getClass(), "ui", null);
        setField(term392496, term392496.getClass(), "listenerList", null);
        setField(term392496, term392496.getClass(), "clientProperties", null);
        setField(term392496, term392496.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term392496, term392496.getClass(), "autoscrolls", false);
        setField(term392496, term392496.getClass(), "border", null);
        setIntField(term392496, term392496.getClass(), "flags", 0);
        setField(term392496, term392496.getClass(), "inputVerifier", null);
        setBooleanField(term392496, term392496.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term392496, term392496.getClass(), "paintingChild", null);
        setField(term392496, term392496.getClass(), "popupMenu", null);
        setField(term392496, term392496.getClass(), "revalidateRunnableScheduled", null);
        setField(term392496, term392496.getClass(), "focusInputMap", null);
        setField(term392496, term392496.getClass(), "ancestorInputMap", null);
        setField(term392496, term392496.getClass(), "windowInputMap", null);
        setField(term392496, term392496.getClass(), "actionMap", null);
        setField(term392496, term392496.getClass(), "aaHint", null);
        setField(term392496, term392496.getClass(), "lcdRenderingHint", null);
        setField(term392496, term392496.getClass(), "component", null);
        setField(term392496, term392496.getClass(), "layoutMgr", null);
        setField(term392496, term392496.getClass(), "dispatcher", null);
        setField(term392496, term392496.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term392496, term392496.getClass(), "focusCycleRoot", false);
        setBooleanField(term392496, term392496.getClass(), "focusTraversalPolicyProvider", false);
        setField(term392496, term392496.getClass(), "printingThreads", null);
        setBooleanField(term392496, term392496.getClass(), "printing", false);
        setField(term392496, term392496.getClass(), "containerListener", null);
        setIntField(term392496, term392496.getClass(), "listeningChildren", 0);
        setIntField(term392496, term392496.getClass(), "listeningBoundsChildren", 0);
        setIntField(term392496, term392496.getClass(), "descendantsCount", 0);
        setField(term392496, term392496.getClass(), "preserveBackgroundColor", null);
        setIntField(term392496, term392496.getClass(), "numOfHWComponents", 0);
        setIntField(term392496, term392496.getClass(), "numOfLWComponents", 0);
        setField(term392496, term392496.getClass(), "modalComp", null);
        setField(term392496, term392496.getClass(), "modalAppContext", null);
        setIntField(term392496, term392496.getClass(), "containerSerializedDataVersion", 0);
        setField(term392496, term392496.getClass(), "peer", null);
        setField(term392496, term392496.getClass(), "parent", null);
        setField(term392496, term392496.getClass(), "appContext", null);
        setIntField(term392496, term392496.getClass(), "x", 0);
        setIntField(term392496, term392496.getClass(), "y", 0);
        setIntField(term392496, term392496.getClass(), "width", 0);
        setIntField(term392496, term392496.getClass(), "height", 0);
        setField(term392496, term392496.getClass(), "foreground", null);
        setField(term392496, term392496.getClass(), "background", null);
        setField(term392496, term392496.getClass(), "font", null);
        setField(term392496, term392496.getClass(), "peerFont", null);
        setField(term392496, term392496.getClass(), "cursor", null);
        setField(term392496, term392496.getClass(), "locale", null);
        setField(term392496, term392496.getClass(), "graphicsConfig", null);
        setField(term392496, term392496.getClass(), "bufferStrategy", null);
        setBooleanField(term392496, term392496.getClass(), "ignoreRepaint", false);
        setBooleanField(term392496, term392496.getClass(), "visible", false);
        setBooleanField(term392496, term392496.getClass(), "enabled", false);
        setBooleanField(term392496, term392496.getClass(), "valid", false);
        setField(term392496, term392496.getClass(), "dropTarget", null);
        setField(term392496, term392496.getClass(), "popups", null);
        setField(term392496, term392496.getClass(), "name", null);
        setBooleanField(term392496, term392496.getClass(), "nameExplicitlySet", false);
        setBooleanField(term392496, term392496.getClass(), "focusable", false);
        setIntField(term392496, term392496.getClass(), "isFocusTraversableOverridden", 0);
        setField(term392496, term392496.getClass(), "focusTraversalKeys", null);
        setBooleanField(term392496, term392496.getClass(), "focusTraversalKeysEnabled", false);
        setField(term392496, term392496.getClass(), "acc", null);
        setField(term392496, term392496.getClass(), "minSize", null);
        setBooleanField(term392496, term392496.getClass(), "minSizeSet", false);
        setField(term392496, term392496.getClass(), "prefSize", null);
        setBooleanField(term392496, term392496.getClass(), "prefSizeSet", false);
        setField(term392496, term392496.getClass(), "maxSize", null);
        setBooleanField(term392496, term392496.getClass(), "maxSizeSet", false);
        setField(term392496, term392496.getClass(), "componentOrientation", null);
        setBooleanField(term392496, term392496.getClass(), "newEventsOnly", false);
        setField(term392496, term392496.getClass(), "componentListener", null);
        setField(term392496, term392496.getClass(), "focusListener", null);
        setField(term392496, term392496.getClass(), "hierarchyListener", null);
        setField(term392496, term392496.getClass(), "hierarchyBoundsListener", null);
        setField(term392496, term392496.getClass(), "keyListener", null);
        setField(term392496, term392496.getClass(), "mouseListener", null);
        setField(term392496, term392496.getClass(), "mouseMotionListener", null);
        setField(term392496, term392496.getClass(), "mouseWheelListener", null);
        setField(term392496, term392496.getClass(), "inputMethodListener", null);
        setLongField(term392496, term392496.getClass(), "eventMask", 0L);
        setField(term392496, term392496.getClass(), "changeSupport", null);
        setField(term392496, term392496.getClass(), "objectLock", null);
        setBooleanField(term392496, term392496.getClass(), "isPacked", false);
        setIntField(term392496, term392496.getClass(), "boundsOp", 0);
        setField(term392496, term392496.getClass(), "compoundShape", null);
        setField(term392496, term392496.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term392496, term392496.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term392496, term392496.getClass(), "backgroundEraseDisabled", false);
        setField(term392496, term392496.getClass(), "eventCache", null);
        setBooleanField(term392496, term392496.getClass(), "coalescingEnabled", false);
        setBooleanField(term392496, term392496.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term392496, term392496.getClass(), "componentSerializedDataVersion", 0);
        setField(term392496, term392496.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.SaveGameNameView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFullFilename", argTypes, term392496, args);
    }

};


