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

public class SaveGameNameView_getFilename_6231145669 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term392538;

    public SaveGameNameView_getFilename_6231145669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term392538 = newInstance(Class.forName("org.openRealmOfStars.game.state.SaveGameNameView"));
        setField(term392538, term392538.getClass(), "saveGameField", null);
        setField(term392538, term392538.getClass(), "overWriteFile", null);
        setField(term392538, term392538.getClass(), "startGameBtn", null);
        setBooleanField(term392538, term392538.getClass(), "continueGame", false);
        setBooleanField(term392538, term392538.getClass(), "isAlignmentXSet", false);
        setFloatField(term392538, term392538.getClass(), "alignmentX", 0.0F);
        setBooleanField(term392538, term392538.getClass(), "isAlignmentYSet", false);
        setFloatField(term392538, term392538.getClass(), "alignmentY", 0.0F);
        setField(term392538, term392538.getClass(), "ui", null);
        setField(term392538, term392538.getClass(), "listenerList", null);
        setField(term392538, term392538.getClass(), "clientProperties", null);
        setField(term392538, term392538.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term392538, term392538.getClass(), "autoscrolls", false);
        setField(term392538, term392538.getClass(), "border", null);
        setIntField(term392538, term392538.getClass(), "flags", 0);
        setField(term392538, term392538.getClass(), "inputVerifier", null);
        setBooleanField(term392538, term392538.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term392538, term392538.getClass(), "paintingChild", null);
        setField(term392538, term392538.getClass(), "popupMenu", null);
        setField(term392538, term392538.getClass(), "revalidateRunnableScheduled", null);
        setField(term392538, term392538.getClass(), "focusInputMap", null);
        setField(term392538, term392538.getClass(), "ancestorInputMap", null);
        setField(term392538, term392538.getClass(), "windowInputMap", null);
        setField(term392538, term392538.getClass(), "actionMap", null);
        setField(term392538, term392538.getClass(), "aaHint", null);
        setField(term392538, term392538.getClass(), "lcdRenderingHint", null);
        setField(term392538, term392538.getClass(), "component", null);
        setField(term392538, term392538.getClass(), "layoutMgr", null);
        setField(term392538, term392538.getClass(), "dispatcher", null);
        setField(term392538, term392538.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term392538, term392538.getClass(), "focusCycleRoot", false);
        setBooleanField(term392538, term392538.getClass(), "focusTraversalPolicyProvider", false);
        setField(term392538, term392538.getClass(), "printingThreads", null);
        setBooleanField(term392538, term392538.getClass(), "printing", false);
        setField(term392538, term392538.getClass(), "containerListener", null);
        setIntField(term392538, term392538.getClass(), "listeningChildren", 0);
        setIntField(term392538, term392538.getClass(), "listeningBoundsChildren", 0);
        setIntField(term392538, term392538.getClass(), "descendantsCount", 0);
        setField(term392538, term392538.getClass(), "preserveBackgroundColor", null);
        setIntField(term392538, term392538.getClass(), "numOfHWComponents", 0);
        setIntField(term392538, term392538.getClass(), "numOfLWComponents", 0);
        setField(term392538, term392538.getClass(), "modalComp", null);
        setField(term392538, term392538.getClass(), "modalAppContext", null);
        setIntField(term392538, term392538.getClass(), "containerSerializedDataVersion", 0);
        setField(term392538, term392538.getClass(), "peer", null);
        setField(term392538, term392538.getClass(), "parent", null);
        setField(term392538, term392538.getClass(), "appContext", null);
        setIntField(term392538, term392538.getClass(), "x", 0);
        setIntField(term392538, term392538.getClass(), "y", 0);
        setIntField(term392538, term392538.getClass(), "width", 0);
        setIntField(term392538, term392538.getClass(), "height", 0);
        setField(term392538, term392538.getClass(), "foreground", null);
        setField(term392538, term392538.getClass(), "background", null);
        setField(term392538, term392538.getClass(), "font", null);
        setField(term392538, term392538.getClass(), "peerFont", null);
        setField(term392538, term392538.getClass(), "cursor", null);
        setField(term392538, term392538.getClass(), "locale", null);
        setField(term392538, term392538.getClass(), "graphicsConfig", null);
        setField(term392538, term392538.getClass(), "bufferStrategy", null);
        setBooleanField(term392538, term392538.getClass(), "ignoreRepaint", false);
        setBooleanField(term392538, term392538.getClass(), "visible", false);
        setBooleanField(term392538, term392538.getClass(), "enabled", false);
        setBooleanField(term392538, term392538.getClass(), "valid", false);
        setField(term392538, term392538.getClass(), "dropTarget", null);
        setField(term392538, term392538.getClass(), "popups", null);
        setField(term392538, term392538.getClass(), "name", null);
        setBooleanField(term392538, term392538.getClass(), "nameExplicitlySet", false);
        setBooleanField(term392538, term392538.getClass(), "focusable", false);
        setIntField(term392538, term392538.getClass(), "isFocusTraversableOverridden", 0);
        setField(term392538, term392538.getClass(), "focusTraversalKeys", null);
        setBooleanField(term392538, term392538.getClass(), "focusTraversalKeysEnabled", false);
        setField(term392538, term392538.getClass(), "acc", null);
        setField(term392538, term392538.getClass(), "minSize", null);
        setBooleanField(term392538, term392538.getClass(), "minSizeSet", false);
        setField(term392538, term392538.getClass(), "prefSize", null);
        setBooleanField(term392538, term392538.getClass(), "prefSizeSet", false);
        setField(term392538, term392538.getClass(), "maxSize", null);
        setBooleanField(term392538, term392538.getClass(), "maxSizeSet", false);
        setField(term392538, term392538.getClass(), "componentOrientation", null);
        setBooleanField(term392538, term392538.getClass(), "newEventsOnly", false);
        setField(term392538, term392538.getClass(), "componentListener", null);
        setField(term392538, term392538.getClass(), "focusListener", null);
        setField(term392538, term392538.getClass(), "hierarchyListener", null);
        setField(term392538, term392538.getClass(), "hierarchyBoundsListener", null);
        setField(term392538, term392538.getClass(), "keyListener", null);
        setField(term392538, term392538.getClass(), "mouseListener", null);
        setField(term392538, term392538.getClass(), "mouseMotionListener", null);
        setField(term392538, term392538.getClass(), "mouseWheelListener", null);
        setField(term392538, term392538.getClass(), "inputMethodListener", null);
        setLongField(term392538, term392538.getClass(), "eventMask", 0L);
        setField(term392538, term392538.getClass(), "changeSupport", null);
        setField(term392538, term392538.getClass(), "objectLock", null);
        setBooleanField(term392538, term392538.getClass(), "isPacked", false);
        setIntField(term392538, term392538.getClass(), "boundsOp", 0);
        setField(term392538, term392538.getClass(), "compoundShape", null);
        setField(term392538, term392538.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term392538, term392538.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term392538, term392538.getClass(), "backgroundEraseDisabled", false);
        setField(term392538, term392538.getClass(), "eventCache", null);
        setBooleanField(term392538, term392538.getClass(), "coalescingEnabled", false);
        setBooleanField(term392538, term392538.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term392538, term392538.getClass(), "componentSerializedDataVersion", 0);
        setField(term392538, term392538.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.SaveGameNameView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFilename", argTypes, term392538, args);
    }

};


