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

public class EndGameView_updateTextArea_4818119043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term386338;

    public EndGameView_updateTextArea_4818119043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term386338 = newInstance(Class.forName("org.openRealmOfStars.game.state.EndGameView"));
        setField(term386338, term386338.getClass(), "textArea", null);
        setBooleanField(term386338, term386338.getClass(), "isAlignmentXSet", false);
        setFloatField(term386338, term386338.getClass(), "alignmentX", 0.0F);
        setBooleanField(term386338, term386338.getClass(), "isAlignmentYSet", false);
        setFloatField(term386338, term386338.getClass(), "alignmentY", 0.0F);
        setField(term386338, term386338.getClass(), "ui", null);
        setField(term386338, term386338.getClass(), "listenerList", null);
        setField(term386338, term386338.getClass(), "clientProperties", null);
        setField(term386338, term386338.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term386338, term386338.getClass(), "autoscrolls", false);
        setField(term386338, term386338.getClass(), "border", null);
        setIntField(term386338, term386338.getClass(), "flags", 0);
        setField(term386338, term386338.getClass(), "inputVerifier", null);
        setBooleanField(term386338, term386338.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term386338, term386338.getClass(), "paintingChild", null);
        setField(term386338, term386338.getClass(), "popupMenu", null);
        setField(term386338, term386338.getClass(), "revalidateRunnableScheduled", null);
        setField(term386338, term386338.getClass(), "focusInputMap", null);
        setField(term386338, term386338.getClass(), "ancestorInputMap", null);
        setField(term386338, term386338.getClass(), "windowInputMap", null);
        setField(term386338, term386338.getClass(), "actionMap", null);
        setField(term386338, term386338.getClass(), "aaHint", null);
        setField(term386338, term386338.getClass(), "lcdRenderingHint", null);
        setField(term386338, term386338.getClass(), "component", null);
        setField(term386338, term386338.getClass(), "layoutMgr", null);
        setField(term386338, term386338.getClass(), "dispatcher", null);
        setField(term386338, term386338.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term386338, term386338.getClass(), "focusCycleRoot", false);
        setBooleanField(term386338, term386338.getClass(), "focusTraversalPolicyProvider", false);
        setField(term386338, term386338.getClass(), "printingThreads", null);
        setBooleanField(term386338, term386338.getClass(), "printing", false);
        setField(term386338, term386338.getClass(), "containerListener", null);
        setIntField(term386338, term386338.getClass(), "listeningChildren", 0);
        setIntField(term386338, term386338.getClass(), "listeningBoundsChildren", 0);
        setIntField(term386338, term386338.getClass(), "descendantsCount", 0);
        setField(term386338, term386338.getClass(), "preserveBackgroundColor", null);
        setIntField(term386338, term386338.getClass(), "numOfHWComponents", 0);
        setIntField(term386338, term386338.getClass(), "numOfLWComponents", 0);
        setField(term386338, term386338.getClass(), "modalComp", null);
        setField(term386338, term386338.getClass(), "modalAppContext", null);
        setIntField(term386338, term386338.getClass(), "containerSerializedDataVersion", 0);
        setField(term386338, term386338.getClass(), "peer", null);
        setField(term386338, term386338.getClass(), "parent", null);
        setField(term386338, term386338.getClass(), "appContext", null);
        setIntField(term386338, term386338.getClass(), "x", 0);
        setIntField(term386338, term386338.getClass(), "y", 0);
        setIntField(term386338, term386338.getClass(), "width", 0);
        setIntField(term386338, term386338.getClass(), "height", 0);
        setField(term386338, term386338.getClass(), "foreground", null);
        setField(term386338, term386338.getClass(), "background", null);
        setField(term386338, term386338.getClass(), "font", null);
        setField(term386338, term386338.getClass(), "peerFont", null);
        setField(term386338, term386338.getClass(), "cursor", null);
        setField(term386338, term386338.getClass(), "locale", null);
        setField(term386338, term386338.getClass(), "graphicsConfig", null);
        setField(term386338, term386338.getClass(), "bufferStrategy", null);
        setBooleanField(term386338, term386338.getClass(), "ignoreRepaint", false);
        setBooleanField(term386338, term386338.getClass(), "visible", false);
        setBooleanField(term386338, term386338.getClass(), "enabled", false);
        setBooleanField(term386338, term386338.getClass(), "valid", false);
        setField(term386338, term386338.getClass(), "dropTarget", null);
        setField(term386338, term386338.getClass(), "popups", null);
        setField(term386338, term386338.getClass(), "name", null);
        setBooleanField(term386338, term386338.getClass(), "nameExplicitlySet", false);
        setBooleanField(term386338, term386338.getClass(), "focusable", false);
        setIntField(term386338, term386338.getClass(), "isFocusTraversableOverridden", 0);
        setField(term386338, term386338.getClass(), "focusTraversalKeys", null);
        setBooleanField(term386338, term386338.getClass(), "focusTraversalKeysEnabled", false);
        setField(term386338, term386338.getClass(), "acc", null);
        setField(term386338, term386338.getClass(), "minSize", null);
        setBooleanField(term386338, term386338.getClass(), "minSizeSet", false);
        setField(term386338, term386338.getClass(), "prefSize", null);
        setBooleanField(term386338, term386338.getClass(), "prefSizeSet", false);
        setField(term386338, term386338.getClass(), "maxSize", null);
        setBooleanField(term386338, term386338.getClass(), "maxSizeSet", false);
        setField(term386338, term386338.getClass(), "componentOrientation", null);
        setBooleanField(term386338, term386338.getClass(), "newEventsOnly", false);
        setField(term386338, term386338.getClass(), "componentListener", null);
        setField(term386338, term386338.getClass(), "focusListener", null);
        setField(term386338, term386338.getClass(), "hierarchyListener", null);
        setField(term386338, term386338.getClass(), "hierarchyBoundsListener", null);
        setField(term386338, term386338.getClass(), "keyListener", null);
        setField(term386338, term386338.getClass(), "mouseListener", null);
        setField(term386338, term386338.getClass(), "mouseMotionListener", null);
        setField(term386338, term386338.getClass(), "mouseWheelListener", null);
        setField(term386338, term386338.getClass(), "inputMethodListener", null);
        setLongField(term386338, term386338.getClass(), "eventMask", 0L);
        setField(term386338, term386338.getClass(), "changeSupport", null);
        setField(term386338, term386338.getClass(), "objectLock", null);
        setBooleanField(term386338, term386338.getClass(), "isPacked", false);
        setIntField(term386338, term386338.getClass(), "boundsOp", 0);
        setField(term386338, term386338.getClass(), "compoundShape", null);
        setField(term386338, term386338.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term386338, term386338.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term386338, term386338.getClass(), "backgroundEraseDisabled", false);
        setField(term386338, term386338.getClass(), "eventCache", null);
        setBooleanField(term386338, term386338.getClass(), "coalescingEnabled", false);
        setBooleanField(term386338, term386338.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term386338, term386338.getClass(), "componentSerializedDataVersion", 0);
        setField(term386338, term386338.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.EndGameView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateTextArea", argTypes, term386338, args);
    }

};


