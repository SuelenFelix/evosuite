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

public class SaveGameNameView_isContinueGame_16486317512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term392664;

    public SaveGameNameView_isContinueGame_16486317512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term392664 = newInstance(Class.forName("org.openRealmOfStars.game.state.SaveGameNameView"));
        setField(term392664, term392664.getClass(), "saveGameField", null);
        setField(term392664, term392664.getClass(), "overWriteFile", null);
        setField(term392664, term392664.getClass(), "startGameBtn", null);
        setBooleanField(term392664, term392664.getClass(), "continueGame", false);
        setBooleanField(term392664, term392664.getClass(), "isAlignmentXSet", false);
        setFloatField(term392664, term392664.getClass(), "alignmentX", 0.0F);
        setBooleanField(term392664, term392664.getClass(), "isAlignmentYSet", false);
        setFloatField(term392664, term392664.getClass(), "alignmentY", 0.0F);
        setField(term392664, term392664.getClass(), "ui", null);
        setField(term392664, term392664.getClass(), "listenerList", null);
        setField(term392664, term392664.getClass(), "clientProperties", null);
        setField(term392664, term392664.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term392664, term392664.getClass(), "autoscrolls", false);
        setField(term392664, term392664.getClass(), "border", null);
        setIntField(term392664, term392664.getClass(), "flags", 0);
        setField(term392664, term392664.getClass(), "inputVerifier", null);
        setBooleanField(term392664, term392664.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term392664, term392664.getClass(), "paintingChild", null);
        setField(term392664, term392664.getClass(), "popupMenu", null);
        setField(term392664, term392664.getClass(), "revalidateRunnableScheduled", null);
        setField(term392664, term392664.getClass(), "focusInputMap", null);
        setField(term392664, term392664.getClass(), "ancestorInputMap", null);
        setField(term392664, term392664.getClass(), "windowInputMap", null);
        setField(term392664, term392664.getClass(), "actionMap", null);
        setField(term392664, term392664.getClass(), "aaHint", null);
        setField(term392664, term392664.getClass(), "lcdRenderingHint", null);
        setField(term392664, term392664.getClass(), "component", null);
        setField(term392664, term392664.getClass(), "layoutMgr", null);
        setField(term392664, term392664.getClass(), "dispatcher", null);
        setField(term392664, term392664.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term392664, term392664.getClass(), "focusCycleRoot", false);
        setBooleanField(term392664, term392664.getClass(), "focusTraversalPolicyProvider", false);
        setField(term392664, term392664.getClass(), "printingThreads", null);
        setBooleanField(term392664, term392664.getClass(), "printing", false);
        setField(term392664, term392664.getClass(), "containerListener", null);
        setIntField(term392664, term392664.getClass(), "listeningChildren", 0);
        setIntField(term392664, term392664.getClass(), "listeningBoundsChildren", 0);
        setIntField(term392664, term392664.getClass(), "descendantsCount", 0);
        setField(term392664, term392664.getClass(), "preserveBackgroundColor", null);
        setIntField(term392664, term392664.getClass(), "numOfHWComponents", 0);
        setIntField(term392664, term392664.getClass(), "numOfLWComponents", 0);
        setField(term392664, term392664.getClass(), "modalComp", null);
        setField(term392664, term392664.getClass(), "modalAppContext", null);
        setIntField(term392664, term392664.getClass(), "containerSerializedDataVersion", 0);
        setField(term392664, term392664.getClass(), "peer", null);
        setField(term392664, term392664.getClass(), "parent", null);
        setField(term392664, term392664.getClass(), "appContext", null);
        setIntField(term392664, term392664.getClass(), "x", 0);
        setIntField(term392664, term392664.getClass(), "y", 0);
        setIntField(term392664, term392664.getClass(), "width", 0);
        setIntField(term392664, term392664.getClass(), "height", 0);
        setField(term392664, term392664.getClass(), "foreground", null);
        setField(term392664, term392664.getClass(), "background", null);
        setField(term392664, term392664.getClass(), "font", null);
        setField(term392664, term392664.getClass(), "peerFont", null);
        setField(term392664, term392664.getClass(), "cursor", null);
        setField(term392664, term392664.getClass(), "locale", null);
        setField(term392664, term392664.getClass(), "graphicsConfig", null);
        setField(term392664, term392664.getClass(), "bufferStrategy", null);
        setBooleanField(term392664, term392664.getClass(), "ignoreRepaint", false);
        setBooleanField(term392664, term392664.getClass(), "visible", false);
        setBooleanField(term392664, term392664.getClass(), "enabled", false);
        setBooleanField(term392664, term392664.getClass(), "valid", false);
        setField(term392664, term392664.getClass(), "dropTarget", null);
        setField(term392664, term392664.getClass(), "popups", null);
        setField(term392664, term392664.getClass(), "name", null);
        setBooleanField(term392664, term392664.getClass(), "nameExplicitlySet", false);
        setBooleanField(term392664, term392664.getClass(), "focusable", false);
        setIntField(term392664, term392664.getClass(), "isFocusTraversableOverridden", 0);
        setField(term392664, term392664.getClass(), "focusTraversalKeys", null);
        setBooleanField(term392664, term392664.getClass(), "focusTraversalKeysEnabled", false);
        setField(term392664, term392664.getClass(), "acc", null);
        setField(term392664, term392664.getClass(), "minSize", null);
        setBooleanField(term392664, term392664.getClass(), "minSizeSet", false);
        setField(term392664, term392664.getClass(), "prefSize", null);
        setBooleanField(term392664, term392664.getClass(), "prefSizeSet", false);
        setField(term392664, term392664.getClass(), "maxSize", null);
        setBooleanField(term392664, term392664.getClass(), "maxSizeSet", false);
        setField(term392664, term392664.getClass(), "componentOrientation", null);
        setBooleanField(term392664, term392664.getClass(), "newEventsOnly", false);
        setField(term392664, term392664.getClass(), "componentListener", null);
        setField(term392664, term392664.getClass(), "focusListener", null);
        setField(term392664, term392664.getClass(), "hierarchyListener", null);
        setField(term392664, term392664.getClass(), "hierarchyBoundsListener", null);
        setField(term392664, term392664.getClass(), "keyListener", null);
        setField(term392664, term392664.getClass(), "mouseListener", null);
        setField(term392664, term392664.getClass(), "mouseMotionListener", null);
        setField(term392664, term392664.getClass(), "mouseWheelListener", null);
        setField(term392664, term392664.getClass(), "inputMethodListener", null);
        setLongField(term392664, term392664.getClass(), "eventMask", 0L);
        setField(term392664, term392664.getClass(), "changeSupport", null);
        setField(term392664, term392664.getClass(), "objectLock", null);
        setBooleanField(term392664, term392664.getClass(), "isPacked", false);
        setIntField(term392664, term392664.getClass(), "boundsOp", 0);
        setField(term392664, term392664.getClass(), "compoundShape", null);
        setField(term392664, term392664.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term392664, term392664.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term392664, term392664.getClass(), "backgroundEraseDisabled", false);
        setField(term392664, term392664.getClass(), "eventCache", null);
        setBooleanField(term392664, term392664.getClass(), "coalescingEnabled", false);
        setBooleanField(term392664, term392664.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term392664, term392664.getClass(), "componentSerializedDataVersion", 0);
        setField(term392664, term392664.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.SaveGameNameView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isContinueGame", argTypes, term392664, args);
    }

};


