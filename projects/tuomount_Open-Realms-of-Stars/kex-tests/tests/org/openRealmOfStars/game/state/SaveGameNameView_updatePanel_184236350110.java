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

public class SaveGameNameView_updatePanel_184236350110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term392580;

    public SaveGameNameView_updatePanel_184236350110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term392580 = newInstance(Class.forName("org.openRealmOfStars.game.state.SaveGameNameView"));
        setField(term392580, term392580.getClass(), "saveGameField", null);
        setField(term392580, term392580.getClass(), "overWriteFile", null);
        setField(term392580, term392580.getClass(), "startGameBtn", null);
        setBooleanField(term392580, term392580.getClass(), "continueGame", false);
        setBooleanField(term392580, term392580.getClass(), "isAlignmentXSet", false);
        setFloatField(term392580, term392580.getClass(), "alignmentX", 0.0F);
        setBooleanField(term392580, term392580.getClass(), "isAlignmentYSet", false);
        setFloatField(term392580, term392580.getClass(), "alignmentY", 0.0F);
        setField(term392580, term392580.getClass(), "ui", null);
        setField(term392580, term392580.getClass(), "listenerList", null);
        setField(term392580, term392580.getClass(), "clientProperties", null);
        setField(term392580, term392580.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term392580, term392580.getClass(), "autoscrolls", false);
        setField(term392580, term392580.getClass(), "border", null);
        setIntField(term392580, term392580.getClass(), "flags", 0);
        setField(term392580, term392580.getClass(), "inputVerifier", null);
        setBooleanField(term392580, term392580.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term392580, term392580.getClass(), "paintingChild", null);
        setField(term392580, term392580.getClass(), "popupMenu", null);
        setField(term392580, term392580.getClass(), "revalidateRunnableScheduled", null);
        setField(term392580, term392580.getClass(), "focusInputMap", null);
        setField(term392580, term392580.getClass(), "ancestorInputMap", null);
        setField(term392580, term392580.getClass(), "windowInputMap", null);
        setField(term392580, term392580.getClass(), "actionMap", null);
        setField(term392580, term392580.getClass(), "aaHint", null);
        setField(term392580, term392580.getClass(), "lcdRenderingHint", null);
        setField(term392580, term392580.getClass(), "component", null);
        setField(term392580, term392580.getClass(), "layoutMgr", null);
        setField(term392580, term392580.getClass(), "dispatcher", null);
        setField(term392580, term392580.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term392580, term392580.getClass(), "focusCycleRoot", false);
        setBooleanField(term392580, term392580.getClass(), "focusTraversalPolicyProvider", false);
        setField(term392580, term392580.getClass(), "printingThreads", null);
        setBooleanField(term392580, term392580.getClass(), "printing", false);
        setField(term392580, term392580.getClass(), "containerListener", null);
        setIntField(term392580, term392580.getClass(), "listeningChildren", 0);
        setIntField(term392580, term392580.getClass(), "listeningBoundsChildren", 0);
        setIntField(term392580, term392580.getClass(), "descendantsCount", 0);
        setField(term392580, term392580.getClass(), "preserveBackgroundColor", null);
        setIntField(term392580, term392580.getClass(), "numOfHWComponents", 0);
        setIntField(term392580, term392580.getClass(), "numOfLWComponents", 0);
        setField(term392580, term392580.getClass(), "modalComp", null);
        setField(term392580, term392580.getClass(), "modalAppContext", null);
        setIntField(term392580, term392580.getClass(), "containerSerializedDataVersion", 0);
        setField(term392580, term392580.getClass(), "peer", null);
        setField(term392580, term392580.getClass(), "parent", null);
        setField(term392580, term392580.getClass(), "appContext", null);
        setIntField(term392580, term392580.getClass(), "x", 0);
        setIntField(term392580, term392580.getClass(), "y", 0);
        setIntField(term392580, term392580.getClass(), "width", 0);
        setIntField(term392580, term392580.getClass(), "height", 0);
        setField(term392580, term392580.getClass(), "foreground", null);
        setField(term392580, term392580.getClass(), "background", null);
        setField(term392580, term392580.getClass(), "font", null);
        setField(term392580, term392580.getClass(), "peerFont", null);
        setField(term392580, term392580.getClass(), "cursor", null);
        setField(term392580, term392580.getClass(), "locale", null);
        setField(term392580, term392580.getClass(), "graphicsConfig", null);
        setField(term392580, term392580.getClass(), "bufferStrategy", null);
        setBooleanField(term392580, term392580.getClass(), "ignoreRepaint", false);
        setBooleanField(term392580, term392580.getClass(), "visible", false);
        setBooleanField(term392580, term392580.getClass(), "enabled", false);
        setBooleanField(term392580, term392580.getClass(), "valid", false);
        setField(term392580, term392580.getClass(), "dropTarget", null);
        setField(term392580, term392580.getClass(), "popups", null);
        setField(term392580, term392580.getClass(), "name", null);
        setBooleanField(term392580, term392580.getClass(), "nameExplicitlySet", false);
        setBooleanField(term392580, term392580.getClass(), "focusable", false);
        setIntField(term392580, term392580.getClass(), "isFocusTraversableOverridden", 0);
        setField(term392580, term392580.getClass(), "focusTraversalKeys", null);
        setBooleanField(term392580, term392580.getClass(), "focusTraversalKeysEnabled", false);
        setField(term392580, term392580.getClass(), "acc", null);
        setField(term392580, term392580.getClass(), "minSize", null);
        setBooleanField(term392580, term392580.getClass(), "minSizeSet", false);
        setField(term392580, term392580.getClass(), "prefSize", null);
        setBooleanField(term392580, term392580.getClass(), "prefSizeSet", false);
        setField(term392580, term392580.getClass(), "maxSize", null);
        setBooleanField(term392580, term392580.getClass(), "maxSizeSet", false);
        setField(term392580, term392580.getClass(), "componentOrientation", null);
        setBooleanField(term392580, term392580.getClass(), "newEventsOnly", false);
        setField(term392580, term392580.getClass(), "componentListener", null);
        setField(term392580, term392580.getClass(), "focusListener", null);
        setField(term392580, term392580.getClass(), "hierarchyListener", null);
        setField(term392580, term392580.getClass(), "hierarchyBoundsListener", null);
        setField(term392580, term392580.getClass(), "keyListener", null);
        setField(term392580, term392580.getClass(), "mouseListener", null);
        setField(term392580, term392580.getClass(), "mouseMotionListener", null);
        setField(term392580, term392580.getClass(), "mouseWheelListener", null);
        setField(term392580, term392580.getClass(), "inputMethodListener", null);
        setLongField(term392580, term392580.getClass(), "eventMask", 0L);
        setField(term392580, term392580.getClass(), "changeSupport", null);
        setField(term392580, term392580.getClass(), "objectLock", null);
        setBooleanField(term392580, term392580.getClass(), "isPacked", false);
        setIntField(term392580, term392580.getClass(), "boundsOp", 0);
        setField(term392580, term392580.getClass(), "compoundShape", null);
        setField(term392580, term392580.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term392580, term392580.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term392580, term392580.getClass(), "backgroundEraseDisabled", false);
        setField(term392580, term392580.getClass(), "eventCache", null);
        setBooleanField(term392580, term392580.getClass(), "coalescingEnabled", false);
        setBooleanField(term392580, term392580.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term392580, term392580.getClass(), "componentSerializedDataVersion", 0);
        setField(term392580, term392580.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.SaveGameNameView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updatePanel", argTypes, term392580, args);
    }

};


