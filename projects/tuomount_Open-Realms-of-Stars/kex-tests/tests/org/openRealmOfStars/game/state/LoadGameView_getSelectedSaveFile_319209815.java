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

public class LoadGameView_getSelectedSaveFile_319209815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term997330;

    public LoadGameView_getSelectedSaveFile_319209815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term997330 = newInstance(Class.forName("org.openRealmOfStars.game.state.LoadGameView"));
        setField(term997330, term997330.getClass(), "saveGamesList", null);
        setField(term997330, term997330.getClass(), "confirmDeleteBox", null);
        setField(term997330, term997330.getClass(), "deleteBtn", null);
        setField(term997330, term997330.getClass(), "loadBtn", null);
        setBooleanField(term997330, term997330.getClass(), "isAlignmentXSet", false);
        setFloatField(term997330, term997330.getClass(), "alignmentX", 0.0F);
        setBooleanField(term997330, term997330.getClass(), "isAlignmentYSet", false);
        setFloatField(term997330, term997330.getClass(), "alignmentY", 0.0F);
        setField(term997330, term997330.getClass(), "ui", null);
        setField(term997330, term997330.getClass(), "listenerList", null);
        setField(term997330, term997330.getClass(), "clientProperties", null);
        setField(term997330, term997330.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term997330, term997330.getClass(), "autoscrolls", false);
        setField(term997330, term997330.getClass(), "border", null);
        setIntField(term997330, term997330.getClass(), "flags", 0);
        setField(term997330, term997330.getClass(), "inputVerifier", null);
        setBooleanField(term997330, term997330.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term997330, term997330.getClass(), "paintingChild", null);
        setField(term997330, term997330.getClass(), "popupMenu", null);
        setField(term997330, term997330.getClass(), "revalidateRunnableScheduled", null);
        setField(term997330, term997330.getClass(), "focusInputMap", null);
        setField(term997330, term997330.getClass(), "ancestorInputMap", null);
        setField(term997330, term997330.getClass(), "windowInputMap", null);
        setField(term997330, term997330.getClass(), "actionMap", null);
        setField(term997330, term997330.getClass(), "aaHint", null);
        setField(term997330, term997330.getClass(), "lcdRenderingHint", null);
        setField(term997330, term997330.getClass(), "component", null);
        setField(term997330, term997330.getClass(), "layoutMgr", null);
        setField(term997330, term997330.getClass(), "dispatcher", null);
        setField(term997330, term997330.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term997330, term997330.getClass(), "focusCycleRoot", false);
        setBooleanField(term997330, term997330.getClass(), "focusTraversalPolicyProvider", false);
        setField(term997330, term997330.getClass(), "printingThreads", null);
        setBooleanField(term997330, term997330.getClass(), "printing", false);
        setField(term997330, term997330.getClass(), "containerListener", null);
        setIntField(term997330, term997330.getClass(), "listeningChildren", 0);
        setIntField(term997330, term997330.getClass(), "listeningBoundsChildren", 0);
        setIntField(term997330, term997330.getClass(), "descendantsCount", 0);
        setField(term997330, term997330.getClass(), "preserveBackgroundColor", null);
        setIntField(term997330, term997330.getClass(), "numOfHWComponents", 0);
        setIntField(term997330, term997330.getClass(), "numOfLWComponents", 0);
        setField(term997330, term997330.getClass(), "modalComp", null);
        setField(term997330, term997330.getClass(), "modalAppContext", null);
        setIntField(term997330, term997330.getClass(), "containerSerializedDataVersion", 0);
        setField(term997330, term997330.getClass(), "peer", null);
        setField(term997330, term997330.getClass(), "parent", null);
        setField(term997330, term997330.getClass(), "appContext", null);
        setIntField(term997330, term997330.getClass(), "x", 0);
        setIntField(term997330, term997330.getClass(), "y", 0);
        setIntField(term997330, term997330.getClass(), "width", 0);
        setIntField(term997330, term997330.getClass(), "height", 0);
        setField(term997330, term997330.getClass(), "foreground", null);
        setField(term997330, term997330.getClass(), "background", null);
        setField(term997330, term997330.getClass(), "font", null);
        setField(term997330, term997330.getClass(), "peerFont", null);
        setField(term997330, term997330.getClass(), "cursor", null);
        setField(term997330, term997330.getClass(), "locale", null);
        setField(term997330, term997330.getClass(), "graphicsConfig", null);
        setField(term997330, term997330.getClass(), "bufferStrategy", null);
        setBooleanField(term997330, term997330.getClass(), "ignoreRepaint", false);
        setBooleanField(term997330, term997330.getClass(), "visible", false);
        setBooleanField(term997330, term997330.getClass(), "enabled", false);
        setBooleanField(term997330, term997330.getClass(), "valid", false);
        setField(term997330, term997330.getClass(), "dropTarget", null);
        setField(term997330, term997330.getClass(), "popups", null);
        setField(term997330, term997330.getClass(), "name", null);
        setBooleanField(term997330, term997330.getClass(), "nameExplicitlySet", false);
        setBooleanField(term997330, term997330.getClass(), "focusable", false);
        setIntField(term997330, term997330.getClass(), "isFocusTraversableOverridden", 0);
        setField(term997330, term997330.getClass(), "focusTraversalKeys", null);
        setBooleanField(term997330, term997330.getClass(), "focusTraversalKeysEnabled", false);
        setField(term997330, term997330.getClass(), "acc", null);
        setField(term997330, term997330.getClass(), "minSize", null);
        setBooleanField(term997330, term997330.getClass(), "minSizeSet", false);
        setField(term997330, term997330.getClass(), "prefSize", null);
        setBooleanField(term997330, term997330.getClass(), "prefSizeSet", false);
        setField(term997330, term997330.getClass(), "maxSize", null);
        setBooleanField(term997330, term997330.getClass(), "maxSizeSet", false);
        setField(term997330, term997330.getClass(), "componentOrientation", null);
        setBooleanField(term997330, term997330.getClass(), "newEventsOnly", false);
        setField(term997330, term997330.getClass(), "componentListener", null);
        setField(term997330, term997330.getClass(), "focusListener", null);
        setField(term997330, term997330.getClass(), "hierarchyListener", null);
        setField(term997330, term997330.getClass(), "hierarchyBoundsListener", null);
        setField(term997330, term997330.getClass(), "keyListener", null);
        setField(term997330, term997330.getClass(), "mouseListener", null);
        setField(term997330, term997330.getClass(), "mouseMotionListener", null);
        setField(term997330, term997330.getClass(), "mouseWheelListener", null);
        setField(term997330, term997330.getClass(), "inputMethodListener", null);
        setLongField(term997330, term997330.getClass(), "eventMask", 0L);
        setField(term997330, term997330.getClass(), "changeSupport", null);
        setField(term997330, term997330.getClass(), "objectLock", null);
        setBooleanField(term997330, term997330.getClass(), "isPacked", false);
        setIntField(term997330, term997330.getClass(), "boundsOp", 0);
        setField(term997330, term997330.getClass(), "compoundShape", null);
        setField(term997330, term997330.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term997330, term997330.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term997330, term997330.getClass(), "backgroundEraseDisabled", false);
        setField(term997330, term997330.getClass(), "eventCache", null);
        setBooleanField(term997330, term997330.getClass(), "coalescingEnabled", false);
        setBooleanField(term997330, term997330.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term997330, term997330.getClass(), "componentSerializedDataVersion", 0);
        setField(term997330, term997330.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.LoadGameView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSelectedSaveFile", argTypes, term997330, args);
    }

};


