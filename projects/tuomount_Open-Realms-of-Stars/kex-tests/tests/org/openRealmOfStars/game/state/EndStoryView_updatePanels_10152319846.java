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

public class EndStoryView_updatePanels_10152319846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1577093;

    public EndStoryView_updatePanels_10152319846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1577093 = newInstance(Class.forName("org.openRealmOfStars.game.state.EndStoryView"));
        setField(term1577093, term1577093.getClass(), "textArea", null);
        setField(term1577093, term1577093.getClass(), "map", null);
        setField(term1577093, term1577093.getClass(), "centerPanel", null);
        setField(term1577093, term1577093.getClass(), "imagePanel", null);
        setIntField(term1577093, term1577093.getClass(), "index", 0);
        setField(term1577093, term1577093.getClass(), "realm", null);
        setBooleanField(term1577093, term1577093.getClass(), "isAlignmentXSet", false);
        setFloatField(term1577093, term1577093.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1577093, term1577093.getClass(), "isAlignmentYSet", false);
        setFloatField(term1577093, term1577093.getClass(), "alignmentY", 0.0F);
        setField(term1577093, term1577093.getClass(), "ui", null);
        setField(term1577093, term1577093.getClass(), "listenerList", null);
        setField(term1577093, term1577093.getClass(), "clientProperties", null);
        setField(term1577093, term1577093.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1577093, term1577093.getClass(), "autoscrolls", false);
        setField(term1577093, term1577093.getClass(), "border", null);
        setIntField(term1577093, term1577093.getClass(), "flags", 0);
        setField(term1577093, term1577093.getClass(), "inputVerifier", null);
        setBooleanField(term1577093, term1577093.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1577093, term1577093.getClass(), "paintingChild", null);
        setField(term1577093, term1577093.getClass(), "popupMenu", null);
        setField(term1577093, term1577093.getClass(), "revalidateRunnableScheduled", null);
        setField(term1577093, term1577093.getClass(), "focusInputMap", null);
        setField(term1577093, term1577093.getClass(), "ancestorInputMap", null);
        setField(term1577093, term1577093.getClass(), "windowInputMap", null);
        setField(term1577093, term1577093.getClass(), "actionMap", null);
        setField(term1577093, term1577093.getClass(), "aaHint", null);
        setField(term1577093, term1577093.getClass(), "lcdRenderingHint", null);
        setField(term1577093, term1577093.getClass(), "component", null);
        setField(term1577093, term1577093.getClass(), "layoutMgr", null);
        setField(term1577093, term1577093.getClass(), "dispatcher", null);
        setField(term1577093, term1577093.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1577093, term1577093.getClass(), "focusCycleRoot", false);
        setBooleanField(term1577093, term1577093.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1577093, term1577093.getClass(), "printingThreads", null);
        setBooleanField(term1577093, term1577093.getClass(), "printing", false);
        setField(term1577093, term1577093.getClass(), "containerListener", null);
        setIntField(term1577093, term1577093.getClass(), "listeningChildren", 0);
        setIntField(term1577093, term1577093.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1577093, term1577093.getClass(), "descendantsCount", 0);
        setField(term1577093, term1577093.getClass(), "preserveBackgroundColor", null);
        setIntField(term1577093, term1577093.getClass(), "numOfHWComponents", 0);
        setIntField(term1577093, term1577093.getClass(), "numOfLWComponents", 0);
        setField(term1577093, term1577093.getClass(), "modalComp", null);
        setField(term1577093, term1577093.getClass(), "modalAppContext", null);
        setIntField(term1577093, term1577093.getClass(), "containerSerializedDataVersion", 0);
        setField(term1577093, term1577093.getClass(), "peer", null);
        setField(term1577093, term1577093.getClass(), "parent", null);
        setField(term1577093, term1577093.getClass(), "appContext", null);
        setIntField(term1577093, term1577093.getClass(), "x", 0);
        setIntField(term1577093, term1577093.getClass(), "y", 0);
        setIntField(term1577093, term1577093.getClass(), "width", 0);
        setIntField(term1577093, term1577093.getClass(), "height", 0);
        setField(term1577093, term1577093.getClass(), "foreground", null);
        setField(term1577093, term1577093.getClass(), "background", null);
        setField(term1577093, term1577093.getClass(), "font", null);
        setField(term1577093, term1577093.getClass(), "peerFont", null);
        setField(term1577093, term1577093.getClass(), "cursor", null);
        setField(term1577093, term1577093.getClass(), "locale", null);
        setField(term1577093, term1577093.getClass(), "graphicsConfig", null);
        setField(term1577093, term1577093.getClass(), "bufferStrategy", null);
        setBooleanField(term1577093, term1577093.getClass(), "ignoreRepaint", false);
        setBooleanField(term1577093, term1577093.getClass(), "visible", false);
        setBooleanField(term1577093, term1577093.getClass(), "enabled", false);
        setBooleanField(term1577093, term1577093.getClass(), "valid", false);
        setField(term1577093, term1577093.getClass(), "dropTarget", null);
        setField(term1577093, term1577093.getClass(), "popups", null);
        setField(term1577093, term1577093.getClass(), "name", null);
        setBooleanField(term1577093, term1577093.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1577093, term1577093.getClass(), "focusable", false);
        setIntField(term1577093, term1577093.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1577093, term1577093.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1577093, term1577093.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1577093, term1577093.getClass(), "acc", null);
        setField(term1577093, term1577093.getClass(), "minSize", null);
        setBooleanField(term1577093, term1577093.getClass(), "minSizeSet", false);
        setField(term1577093, term1577093.getClass(), "prefSize", null);
        setBooleanField(term1577093, term1577093.getClass(), "prefSizeSet", false);
        setField(term1577093, term1577093.getClass(), "maxSize", null);
        setBooleanField(term1577093, term1577093.getClass(), "maxSizeSet", false);
        setField(term1577093, term1577093.getClass(), "componentOrientation", null);
        setBooleanField(term1577093, term1577093.getClass(), "newEventsOnly", false);
        setField(term1577093, term1577093.getClass(), "componentListener", null);
        setField(term1577093, term1577093.getClass(), "focusListener", null);
        setField(term1577093, term1577093.getClass(), "hierarchyListener", null);
        setField(term1577093, term1577093.getClass(), "hierarchyBoundsListener", null);
        setField(term1577093, term1577093.getClass(), "keyListener", null);
        setField(term1577093, term1577093.getClass(), "mouseListener", null);
        setField(term1577093, term1577093.getClass(), "mouseMotionListener", null);
        setField(term1577093, term1577093.getClass(), "mouseWheelListener", null);
        setField(term1577093, term1577093.getClass(), "inputMethodListener", null);
        setLongField(term1577093, term1577093.getClass(), "eventMask", 0L);
        setField(term1577093, term1577093.getClass(), "changeSupport", null);
        setField(term1577093, term1577093.getClass(), "objectLock", null);
        setBooleanField(term1577093, term1577093.getClass(), "isPacked", false);
        setIntField(term1577093, term1577093.getClass(), "boundsOp", 0);
        setField(term1577093, term1577093.getClass(), "compoundShape", null);
        setField(term1577093, term1577093.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1577093, term1577093.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1577093, term1577093.getClass(), "backgroundEraseDisabled", false);
        setField(term1577093, term1577093.getClass(), "eventCache", null);
        setBooleanField(term1577093, term1577093.getClass(), "coalescingEnabled", false);
        setBooleanField(term1577093, term1577093.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1577093, term1577093.getClass(), "componentSerializedDataVersion", 0);
        setField(term1577093, term1577093.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.EndStoryView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updatePanels", argTypes, term1577093, args);
    }

};


