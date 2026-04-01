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

public class SaveGameNameView_setContinueGame_43500318913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term392706;
     Object term392748;

    public SaveGameNameView_setContinueGame_43500318913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term392706 = newInstance(Class.forName("org.openRealmOfStars.game.state.SaveGameNameView"));
        setField(term392706, term392706.getClass(), "saveGameField", null);
        setField(term392706, term392706.getClass(), "overWriteFile", null);
        setField(term392706, term392706.getClass(), "startGameBtn", null);
        setBooleanField(term392706, term392706.getClass(), "continueGame", false);
        setBooleanField(term392706, term392706.getClass(), "isAlignmentXSet", false);
        setFloatField(term392706, term392706.getClass(), "alignmentX", 0.0F);
        setBooleanField(term392706, term392706.getClass(), "isAlignmentYSet", false);
        setFloatField(term392706, term392706.getClass(), "alignmentY", 0.0F);
        setField(term392706, term392706.getClass(), "ui", null);
        setField(term392706, term392706.getClass(), "listenerList", null);
        setField(term392706, term392706.getClass(), "clientProperties", null);
        setField(term392706, term392706.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term392706, term392706.getClass(), "autoscrolls", false);
        setField(term392706, term392706.getClass(), "border", null);
        setIntField(term392706, term392706.getClass(), "flags", 0);
        setField(term392706, term392706.getClass(), "inputVerifier", null);
        setBooleanField(term392706, term392706.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term392706, term392706.getClass(), "paintingChild", null);
        setField(term392706, term392706.getClass(), "popupMenu", null);
        setField(term392706, term392706.getClass(), "revalidateRunnableScheduled", null);
        setField(term392706, term392706.getClass(), "focusInputMap", null);
        setField(term392706, term392706.getClass(), "ancestorInputMap", null);
        setField(term392706, term392706.getClass(), "windowInputMap", null);
        setField(term392706, term392706.getClass(), "actionMap", null);
        setField(term392706, term392706.getClass(), "aaHint", null);
        setField(term392706, term392706.getClass(), "lcdRenderingHint", null);
        setField(term392706, term392706.getClass(), "component", null);
        setField(term392706, term392706.getClass(), "layoutMgr", null);
        setField(term392706, term392706.getClass(), "dispatcher", null);
        setField(term392706, term392706.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term392706, term392706.getClass(), "focusCycleRoot", false);
        setBooleanField(term392706, term392706.getClass(), "focusTraversalPolicyProvider", false);
        setField(term392706, term392706.getClass(), "printingThreads", null);
        setBooleanField(term392706, term392706.getClass(), "printing", false);
        setField(term392706, term392706.getClass(), "containerListener", null);
        setIntField(term392706, term392706.getClass(), "listeningChildren", 0);
        setIntField(term392706, term392706.getClass(), "listeningBoundsChildren", 0);
        setIntField(term392706, term392706.getClass(), "descendantsCount", 0);
        setField(term392706, term392706.getClass(), "preserveBackgroundColor", null);
        setIntField(term392706, term392706.getClass(), "numOfHWComponents", 0);
        setIntField(term392706, term392706.getClass(), "numOfLWComponents", 0);
        setField(term392706, term392706.getClass(), "modalComp", null);
        setField(term392706, term392706.getClass(), "modalAppContext", null);
        setIntField(term392706, term392706.getClass(), "containerSerializedDataVersion", 0);
        setField(term392706, term392706.getClass(), "peer", null);
        setField(term392706, term392706.getClass(), "parent", null);
        setField(term392706, term392706.getClass(), "appContext", null);
        setIntField(term392706, term392706.getClass(), "x", 0);
        setIntField(term392706, term392706.getClass(), "y", 0);
        setIntField(term392706, term392706.getClass(), "width", 0);
        setIntField(term392706, term392706.getClass(), "height", 0);
        setField(term392706, term392706.getClass(), "foreground", null);
        setField(term392706, term392706.getClass(), "background", null);
        setField(term392706, term392706.getClass(), "font", null);
        setField(term392706, term392706.getClass(), "peerFont", null);
        setField(term392706, term392706.getClass(), "cursor", null);
        setField(term392706, term392706.getClass(), "locale", null);
        setField(term392706, term392706.getClass(), "graphicsConfig", null);
        setField(term392706, term392706.getClass(), "bufferStrategy", null);
        setBooleanField(term392706, term392706.getClass(), "ignoreRepaint", false);
        setBooleanField(term392706, term392706.getClass(), "visible", false);
        setBooleanField(term392706, term392706.getClass(), "enabled", false);
        setBooleanField(term392706, term392706.getClass(), "valid", false);
        setField(term392706, term392706.getClass(), "dropTarget", null);
        setField(term392706, term392706.getClass(), "popups", null);
        setField(term392706, term392706.getClass(), "name", null);
        setBooleanField(term392706, term392706.getClass(), "nameExplicitlySet", false);
        setBooleanField(term392706, term392706.getClass(), "focusable", false);
        setIntField(term392706, term392706.getClass(), "isFocusTraversableOverridden", 0);
        setField(term392706, term392706.getClass(), "focusTraversalKeys", null);
        setBooleanField(term392706, term392706.getClass(), "focusTraversalKeysEnabled", false);
        setField(term392706, term392706.getClass(), "acc", null);
        setField(term392706, term392706.getClass(), "minSize", null);
        setBooleanField(term392706, term392706.getClass(), "minSizeSet", false);
        setField(term392706, term392706.getClass(), "prefSize", null);
        setBooleanField(term392706, term392706.getClass(), "prefSizeSet", false);
        setField(term392706, term392706.getClass(), "maxSize", null);
        setBooleanField(term392706, term392706.getClass(), "maxSizeSet", false);
        setField(term392706, term392706.getClass(), "componentOrientation", null);
        setBooleanField(term392706, term392706.getClass(), "newEventsOnly", false);
        setField(term392706, term392706.getClass(), "componentListener", null);
        setField(term392706, term392706.getClass(), "focusListener", null);
        setField(term392706, term392706.getClass(), "hierarchyListener", null);
        setField(term392706, term392706.getClass(), "hierarchyBoundsListener", null);
        setField(term392706, term392706.getClass(), "keyListener", null);
        setField(term392706, term392706.getClass(), "mouseListener", null);
        setField(term392706, term392706.getClass(), "mouseMotionListener", null);
        setField(term392706, term392706.getClass(), "mouseWheelListener", null);
        setField(term392706, term392706.getClass(), "inputMethodListener", null);
        setLongField(term392706, term392706.getClass(), "eventMask", 0L);
        setField(term392706, term392706.getClass(), "changeSupport", null);
        setField(term392706, term392706.getClass(), "objectLock", null);
        setBooleanField(term392706, term392706.getClass(), "isPacked", false);
        setIntField(term392706, term392706.getClass(), "boundsOp", 0);
        setField(term392706, term392706.getClass(), "compoundShape", null);
        setField(term392706, term392706.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term392706, term392706.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term392706, term392706.getClass(), "backgroundEraseDisabled", false);
        setField(term392706, term392706.getClass(), "eventCache", null);
        setBooleanField(term392706, term392706.getClass(), "coalescingEnabled", false);
        setBooleanField(term392706, term392706.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term392706, term392706.getClass(), "componentSerializedDataVersion", 0);
        setField(term392706, term392706.getClass(), "accessibleContext", null);
        term392748 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.SaveGameNameView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term392748;
        callMethod(klass, "setContinueGame", argTypes, term392706, args);
    }

};


