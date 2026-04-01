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

public class SaveGameNameView_handleActions_75207190211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term392622;

    public SaveGameNameView_handleActions_75207190211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term392622 = newInstance(Class.forName("org.openRealmOfStars.game.state.SaveGameNameView"));
        setField(term392622, term392622.getClass(), "saveGameField", null);
        setField(term392622, term392622.getClass(), "overWriteFile", null);
        setField(term392622, term392622.getClass(), "startGameBtn", null);
        setBooleanField(term392622, term392622.getClass(), "continueGame", false);
        setBooleanField(term392622, term392622.getClass(), "isAlignmentXSet", false);
        setFloatField(term392622, term392622.getClass(), "alignmentX", 0.0F);
        setBooleanField(term392622, term392622.getClass(), "isAlignmentYSet", false);
        setFloatField(term392622, term392622.getClass(), "alignmentY", 0.0F);
        setField(term392622, term392622.getClass(), "ui", null);
        setField(term392622, term392622.getClass(), "listenerList", null);
        setField(term392622, term392622.getClass(), "clientProperties", null);
        setField(term392622, term392622.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term392622, term392622.getClass(), "autoscrolls", false);
        setField(term392622, term392622.getClass(), "border", null);
        setIntField(term392622, term392622.getClass(), "flags", 0);
        setField(term392622, term392622.getClass(), "inputVerifier", null);
        setBooleanField(term392622, term392622.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term392622, term392622.getClass(), "paintingChild", null);
        setField(term392622, term392622.getClass(), "popupMenu", null);
        setField(term392622, term392622.getClass(), "revalidateRunnableScheduled", null);
        setField(term392622, term392622.getClass(), "focusInputMap", null);
        setField(term392622, term392622.getClass(), "ancestorInputMap", null);
        setField(term392622, term392622.getClass(), "windowInputMap", null);
        setField(term392622, term392622.getClass(), "actionMap", null);
        setField(term392622, term392622.getClass(), "aaHint", null);
        setField(term392622, term392622.getClass(), "lcdRenderingHint", null);
        setField(term392622, term392622.getClass(), "component", null);
        setField(term392622, term392622.getClass(), "layoutMgr", null);
        setField(term392622, term392622.getClass(), "dispatcher", null);
        setField(term392622, term392622.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term392622, term392622.getClass(), "focusCycleRoot", false);
        setBooleanField(term392622, term392622.getClass(), "focusTraversalPolicyProvider", false);
        setField(term392622, term392622.getClass(), "printingThreads", null);
        setBooleanField(term392622, term392622.getClass(), "printing", false);
        setField(term392622, term392622.getClass(), "containerListener", null);
        setIntField(term392622, term392622.getClass(), "listeningChildren", 0);
        setIntField(term392622, term392622.getClass(), "listeningBoundsChildren", 0);
        setIntField(term392622, term392622.getClass(), "descendantsCount", 0);
        setField(term392622, term392622.getClass(), "preserveBackgroundColor", null);
        setIntField(term392622, term392622.getClass(), "numOfHWComponents", 0);
        setIntField(term392622, term392622.getClass(), "numOfLWComponents", 0);
        setField(term392622, term392622.getClass(), "modalComp", null);
        setField(term392622, term392622.getClass(), "modalAppContext", null);
        setIntField(term392622, term392622.getClass(), "containerSerializedDataVersion", 0);
        setField(term392622, term392622.getClass(), "peer", null);
        setField(term392622, term392622.getClass(), "parent", null);
        setField(term392622, term392622.getClass(), "appContext", null);
        setIntField(term392622, term392622.getClass(), "x", 0);
        setIntField(term392622, term392622.getClass(), "y", 0);
        setIntField(term392622, term392622.getClass(), "width", 0);
        setIntField(term392622, term392622.getClass(), "height", 0);
        setField(term392622, term392622.getClass(), "foreground", null);
        setField(term392622, term392622.getClass(), "background", null);
        setField(term392622, term392622.getClass(), "font", null);
        setField(term392622, term392622.getClass(), "peerFont", null);
        setField(term392622, term392622.getClass(), "cursor", null);
        setField(term392622, term392622.getClass(), "locale", null);
        setField(term392622, term392622.getClass(), "graphicsConfig", null);
        setField(term392622, term392622.getClass(), "bufferStrategy", null);
        setBooleanField(term392622, term392622.getClass(), "ignoreRepaint", false);
        setBooleanField(term392622, term392622.getClass(), "visible", false);
        setBooleanField(term392622, term392622.getClass(), "enabled", false);
        setBooleanField(term392622, term392622.getClass(), "valid", false);
        setField(term392622, term392622.getClass(), "dropTarget", null);
        setField(term392622, term392622.getClass(), "popups", null);
        setField(term392622, term392622.getClass(), "name", null);
        setBooleanField(term392622, term392622.getClass(), "nameExplicitlySet", false);
        setBooleanField(term392622, term392622.getClass(), "focusable", false);
        setIntField(term392622, term392622.getClass(), "isFocusTraversableOverridden", 0);
        setField(term392622, term392622.getClass(), "focusTraversalKeys", null);
        setBooleanField(term392622, term392622.getClass(), "focusTraversalKeysEnabled", false);
        setField(term392622, term392622.getClass(), "acc", null);
        setField(term392622, term392622.getClass(), "minSize", null);
        setBooleanField(term392622, term392622.getClass(), "minSizeSet", false);
        setField(term392622, term392622.getClass(), "prefSize", null);
        setBooleanField(term392622, term392622.getClass(), "prefSizeSet", false);
        setField(term392622, term392622.getClass(), "maxSize", null);
        setBooleanField(term392622, term392622.getClass(), "maxSizeSet", false);
        setField(term392622, term392622.getClass(), "componentOrientation", null);
        setBooleanField(term392622, term392622.getClass(), "newEventsOnly", false);
        setField(term392622, term392622.getClass(), "componentListener", null);
        setField(term392622, term392622.getClass(), "focusListener", null);
        setField(term392622, term392622.getClass(), "hierarchyListener", null);
        setField(term392622, term392622.getClass(), "hierarchyBoundsListener", null);
        setField(term392622, term392622.getClass(), "keyListener", null);
        setField(term392622, term392622.getClass(), "mouseListener", null);
        setField(term392622, term392622.getClass(), "mouseMotionListener", null);
        setField(term392622, term392622.getClass(), "mouseWheelListener", null);
        setField(term392622, term392622.getClass(), "inputMethodListener", null);
        setLongField(term392622, term392622.getClass(), "eventMask", 0L);
        setField(term392622, term392622.getClass(), "changeSupport", null);
        setField(term392622, term392622.getClass(), "objectLock", null);
        setBooleanField(term392622, term392622.getClass(), "isPacked", false);
        setIntField(term392622, term392622.getClass(), "boundsOp", 0);
        setField(term392622, term392622.getClass(), "compoundShape", null);
        setField(term392622, term392622.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term392622, term392622.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term392622, term392622.getClass(), "backgroundEraseDisabled", false);
        setField(term392622, term392622.getClass(), "eventCache", null);
        setBooleanField(term392622, term392622.getClass(), "coalescingEnabled", false);
        setBooleanField(term392622, term392622.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term392622, term392622.getClass(), "componentSerializedDataVersion", 0);
        setField(term392622, term392622.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.SaveGameNameView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleActions", argTypes, term392622, args);
    }

};


