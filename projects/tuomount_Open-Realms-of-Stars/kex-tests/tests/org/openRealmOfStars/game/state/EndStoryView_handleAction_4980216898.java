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

public class EndStoryView_handleAction_4980216898 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1577177;

    public EndStoryView_handleAction_4980216898() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1577177 = newInstance(Class.forName("org.openRealmOfStars.game.state.EndStoryView"));
        setField(term1577177, term1577177.getClass(), "textArea", null);
        setField(term1577177, term1577177.getClass(), "map", null);
        setField(term1577177, term1577177.getClass(), "centerPanel", null);
        setField(term1577177, term1577177.getClass(), "imagePanel", null);
        setIntField(term1577177, term1577177.getClass(), "index", 0);
        setField(term1577177, term1577177.getClass(), "realm", null);
        setBooleanField(term1577177, term1577177.getClass(), "isAlignmentXSet", false);
        setFloatField(term1577177, term1577177.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1577177, term1577177.getClass(), "isAlignmentYSet", false);
        setFloatField(term1577177, term1577177.getClass(), "alignmentY", 0.0F);
        setField(term1577177, term1577177.getClass(), "ui", null);
        setField(term1577177, term1577177.getClass(), "listenerList", null);
        setField(term1577177, term1577177.getClass(), "clientProperties", null);
        setField(term1577177, term1577177.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1577177, term1577177.getClass(), "autoscrolls", false);
        setField(term1577177, term1577177.getClass(), "border", null);
        setIntField(term1577177, term1577177.getClass(), "flags", 0);
        setField(term1577177, term1577177.getClass(), "inputVerifier", null);
        setBooleanField(term1577177, term1577177.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1577177, term1577177.getClass(), "paintingChild", null);
        setField(term1577177, term1577177.getClass(), "popupMenu", null);
        setField(term1577177, term1577177.getClass(), "revalidateRunnableScheduled", null);
        setField(term1577177, term1577177.getClass(), "focusInputMap", null);
        setField(term1577177, term1577177.getClass(), "ancestorInputMap", null);
        setField(term1577177, term1577177.getClass(), "windowInputMap", null);
        setField(term1577177, term1577177.getClass(), "actionMap", null);
        setField(term1577177, term1577177.getClass(), "aaHint", null);
        setField(term1577177, term1577177.getClass(), "lcdRenderingHint", null);
        setField(term1577177, term1577177.getClass(), "component", null);
        setField(term1577177, term1577177.getClass(), "layoutMgr", null);
        setField(term1577177, term1577177.getClass(), "dispatcher", null);
        setField(term1577177, term1577177.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1577177, term1577177.getClass(), "focusCycleRoot", false);
        setBooleanField(term1577177, term1577177.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1577177, term1577177.getClass(), "printingThreads", null);
        setBooleanField(term1577177, term1577177.getClass(), "printing", false);
        setField(term1577177, term1577177.getClass(), "containerListener", null);
        setIntField(term1577177, term1577177.getClass(), "listeningChildren", 0);
        setIntField(term1577177, term1577177.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1577177, term1577177.getClass(), "descendantsCount", 0);
        setField(term1577177, term1577177.getClass(), "preserveBackgroundColor", null);
        setIntField(term1577177, term1577177.getClass(), "numOfHWComponents", 0);
        setIntField(term1577177, term1577177.getClass(), "numOfLWComponents", 0);
        setField(term1577177, term1577177.getClass(), "modalComp", null);
        setField(term1577177, term1577177.getClass(), "modalAppContext", null);
        setIntField(term1577177, term1577177.getClass(), "containerSerializedDataVersion", 0);
        setField(term1577177, term1577177.getClass(), "peer", null);
        setField(term1577177, term1577177.getClass(), "parent", null);
        setField(term1577177, term1577177.getClass(), "appContext", null);
        setIntField(term1577177, term1577177.getClass(), "x", 0);
        setIntField(term1577177, term1577177.getClass(), "y", 0);
        setIntField(term1577177, term1577177.getClass(), "width", 0);
        setIntField(term1577177, term1577177.getClass(), "height", 0);
        setField(term1577177, term1577177.getClass(), "foreground", null);
        setField(term1577177, term1577177.getClass(), "background", null);
        setField(term1577177, term1577177.getClass(), "font", null);
        setField(term1577177, term1577177.getClass(), "peerFont", null);
        setField(term1577177, term1577177.getClass(), "cursor", null);
        setField(term1577177, term1577177.getClass(), "locale", null);
        setField(term1577177, term1577177.getClass(), "graphicsConfig", null);
        setField(term1577177, term1577177.getClass(), "bufferStrategy", null);
        setBooleanField(term1577177, term1577177.getClass(), "ignoreRepaint", false);
        setBooleanField(term1577177, term1577177.getClass(), "visible", false);
        setBooleanField(term1577177, term1577177.getClass(), "enabled", false);
        setBooleanField(term1577177, term1577177.getClass(), "valid", false);
        setField(term1577177, term1577177.getClass(), "dropTarget", null);
        setField(term1577177, term1577177.getClass(), "popups", null);
        setField(term1577177, term1577177.getClass(), "name", null);
        setBooleanField(term1577177, term1577177.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1577177, term1577177.getClass(), "focusable", false);
        setIntField(term1577177, term1577177.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1577177, term1577177.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1577177, term1577177.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1577177, term1577177.getClass(), "acc", null);
        setField(term1577177, term1577177.getClass(), "minSize", null);
        setBooleanField(term1577177, term1577177.getClass(), "minSizeSet", false);
        setField(term1577177, term1577177.getClass(), "prefSize", null);
        setBooleanField(term1577177, term1577177.getClass(), "prefSizeSet", false);
        setField(term1577177, term1577177.getClass(), "maxSize", null);
        setBooleanField(term1577177, term1577177.getClass(), "maxSizeSet", false);
        setField(term1577177, term1577177.getClass(), "componentOrientation", null);
        setBooleanField(term1577177, term1577177.getClass(), "newEventsOnly", false);
        setField(term1577177, term1577177.getClass(), "componentListener", null);
        setField(term1577177, term1577177.getClass(), "focusListener", null);
        setField(term1577177, term1577177.getClass(), "hierarchyListener", null);
        setField(term1577177, term1577177.getClass(), "hierarchyBoundsListener", null);
        setField(term1577177, term1577177.getClass(), "keyListener", null);
        setField(term1577177, term1577177.getClass(), "mouseListener", null);
        setField(term1577177, term1577177.getClass(), "mouseMotionListener", null);
        setField(term1577177, term1577177.getClass(), "mouseWheelListener", null);
        setField(term1577177, term1577177.getClass(), "inputMethodListener", null);
        setLongField(term1577177, term1577177.getClass(), "eventMask", 0L);
        setField(term1577177, term1577177.getClass(), "changeSupport", null);
        setField(term1577177, term1577177.getClass(), "objectLock", null);
        setBooleanField(term1577177, term1577177.getClass(), "isPacked", false);
        setIntField(term1577177, term1577177.getClass(), "boundsOp", 0);
        setField(term1577177, term1577177.getClass(), "compoundShape", null);
        setField(term1577177, term1577177.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1577177, term1577177.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1577177, term1577177.getClass(), "backgroundEraseDisabled", false);
        setField(term1577177, term1577177.getClass(), "eventCache", null);
        setBooleanField(term1577177, term1577177.getClass(), "coalescingEnabled", false);
        setBooleanField(term1577177, term1577177.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1577177, term1577177.getClass(), "componentSerializedDataVersion", 0);
        setField(term1577177, term1577177.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.EndStoryView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleAction", argTypes, term1577177, args);
    }

};


