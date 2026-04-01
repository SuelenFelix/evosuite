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

public class HistoryView_updateTextArea_126112600911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1008851;

    public HistoryView_updateTextArea_126112600911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1008851 = newInstance(Class.forName("org.openRealmOfStars.game.state.HistoryView"));
        setField(term1008851, term1008851.getClass(), "map", null);
        setField(term1008851, term1008851.getClass(), "mapPanel", null);
        setField(term1008851, term1008851.getClass(), "textArea", null);
        setField(term1008851, term1008851.getClass(), "turnLabel", null);
        setIntField(term1008851, term1008851.getClass(), "turnNumber", 0);
        setIntField(term1008851, term1008851.getClass(), "eventNumber", 0);
        setField(term1008851, term1008851.getClass(), "targetCoordinate", null);
        setBooleanField(term1008851, term1008851.getClass(), "isAlignmentXSet", false);
        setFloatField(term1008851, term1008851.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1008851, term1008851.getClass(), "isAlignmentYSet", false);
        setFloatField(term1008851, term1008851.getClass(), "alignmentY", 0.0F);
        setField(term1008851, term1008851.getClass(), "ui", null);
        setField(term1008851, term1008851.getClass(), "listenerList", null);
        setField(term1008851, term1008851.getClass(), "clientProperties", null);
        setField(term1008851, term1008851.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1008851, term1008851.getClass(), "autoscrolls", false);
        setField(term1008851, term1008851.getClass(), "border", null);
        setIntField(term1008851, term1008851.getClass(), "flags", 0);
        setField(term1008851, term1008851.getClass(), "inputVerifier", null);
        setBooleanField(term1008851, term1008851.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1008851, term1008851.getClass(), "paintingChild", null);
        setField(term1008851, term1008851.getClass(), "popupMenu", null);
        setField(term1008851, term1008851.getClass(), "revalidateRunnableScheduled", null);
        setField(term1008851, term1008851.getClass(), "focusInputMap", null);
        setField(term1008851, term1008851.getClass(), "ancestorInputMap", null);
        setField(term1008851, term1008851.getClass(), "windowInputMap", null);
        setField(term1008851, term1008851.getClass(), "actionMap", null);
        setField(term1008851, term1008851.getClass(), "aaHint", null);
        setField(term1008851, term1008851.getClass(), "lcdRenderingHint", null);
        setField(term1008851, term1008851.getClass(), "component", null);
        setField(term1008851, term1008851.getClass(), "layoutMgr", null);
        setField(term1008851, term1008851.getClass(), "dispatcher", null);
        setField(term1008851, term1008851.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1008851, term1008851.getClass(), "focusCycleRoot", false);
        setBooleanField(term1008851, term1008851.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1008851, term1008851.getClass(), "printingThreads", null);
        setBooleanField(term1008851, term1008851.getClass(), "printing", false);
        setField(term1008851, term1008851.getClass(), "containerListener", null);
        setIntField(term1008851, term1008851.getClass(), "listeningChildren", 0);
        setIntField(term1008851, term1008851.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1008851, term1008851.getClass(), "descendantsCount", 0);
        setField(term1008851, term1008851.getClass(), "preserveBackgroundColor", null);
        setIntField(term1008851, term1008851.getClass(), "numOfHWComponents", 0);
        setIntField(term1008851, term1008851.getClass(), "numOfLWComponents", 0);
        setField(term1008851, term1008851.getClass(), "modalComp", null);
        setField(term1008851, term1008851.getClass(), "modalAppContext", null);
        setIntField(term1008851, term1008851.getClass(), "containerSerializedDataVersion", 0);
        setField(term1008851, term1008851.getClass(), "peer", null);
        setField(term1008851, term1008851.getClass(), "parent", null);
        setField(term1008851, term1008851.getClass(), "appContext", null);
        setIntField(term1008851, term1008851.getClass(), "x", 0);
        setIntField(term1008851, term1008851.getClass(), "y", 0);
        setIntField(term1008851, term1008851.getClass(), "width", 0);
        setIntField(term1008851, term1008851.getClass(), "height", 0);
        setField(term1008851, term1008851.getClass(), "foreground", null);
        setField(term1008851, term1008851.getClass(), "background", null);
        setField(term1008851, term1008851.getClass(), "font", null);
        setField(term1008851, term1008851.getClass(), "peerFont", null);
        setField(term1008851, term1008851.getClass(), "cursor", null);
        setField(term1008851, term1008851.getClass(), "locale", null);
        setField(term1008851, term1008851.getClass(), "graphicsConfig", null);
        setField(term1008851, term1008851.getClass(), "bufferStrategy", null);
        setBooleanField(term1008851, term1008851.getClass(), "ignoreRepaint", false);
        setBooleanField(term1008851, term1008851.getClass(), "visible", false);
        setBooleanField(term1008851, term1008851.getClass(), "enabled", false);
        setBooleanField(term1008851, term1008851.getClass(), "valid", false);
        setField(term1008851, term1008851.getClass(), "dropTarget", null);
        setField(term1008851, term1008851.getClass(), "popups", null);
        setField(term1008851, term1008851.getClass(), "name", null);
        setBooleanField(term1008851, term1008851.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1008851, term1008851.getClass(), "focusable", false);
        setIntField(term1008851, term1008851.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1008851, term1008851.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1008851, term1008851.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1008851, term1008851.getClass(), "acc", null);
        setField(term1008851, term1008851.getClass(), "minSize", null);
        setBooleanField(term1008851, term1008851.getClass(), "minSizeSet", false);
        setField(term1008851, term1008851.getClass(), "prefSize", null);
        setBooleanField(term1008851, term1008851.getClass(), "prefSizeSet", false);
        setField(term1008851, term1008851.getClass(), "maxSize", null);
        setBooleanField(term1008851, term1008851.getClass(), "maxSizeSet", false);
        setField(term1008851, term1008851.getClass(), "componentOrientation", null);
        setBooleanField(term1008851, term1008851.getClass(), "newEventsOnly", false);
        setField(term1008851, term1008851.getClass(), "componentListener", null);
        setField(term1008851, term1008851.getClass(), "focusListener", null);
        setField(term1008851, term1008851.getClass(), "hierarchyListener", null);
        setField(term1008851, term1008851.getClass(), "hierarchyBoundsListener", null);
        setField(term1008851, term1008851.getClass(), "keyListener", null);
        setField(term1008851, term1008851.getClass(), "mouseListener", null);
        setField(term1008851, term1008851.getClass(), "mouseMotionListener", null);
        setField(term1008851, term1008851.getClass(), "mouseWheelListener", null);
        setField(term1008851, term1008851.getClass(), "inputMethodListener", null);
        setLongField(term1008851, term1008851.getClass(), "eventMask", 0L);
        setField(term1008851, term1008851.getClass(), "changeSupport", null);
        setField(term1008851, term1008851.getClass(), "objectLock", null);
        setBooleanField(term1008851, term1008851.getClass(), "isPacked", false);
        setIntField(term1008851, term1008851.getClass(), "boundsOp", 0);
        setField(term1008851, term1008851.getClass(), "compoundShape", null);
        setField(term1008851, term1008851.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1008851, term1008851.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1008851, term1008851.getClass(), "backgroundEraseDisabled", false);
        setField(term1008851, term1008851.getClass(), "eventCache", null);
        setBooleanField(term1008851, term1008851.getClass(), "coalescingEnabled", false);
        setBooleanField(term1008851, term1008851.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1008851, term1008851.getClass(), "componentSerializedDataVersion", 0);
        setField(term1008851, term1008851.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.HistoryView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateTextArea", argTypes, term1008851, args);
    }

};


