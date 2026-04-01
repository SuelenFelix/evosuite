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

public class EndStoryView_getHomePlanet_9792313647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1577135;

    public EndStoryView_getHomePlanet_9792313647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1577135 = newInstance(Class.forName("org.openRealmOfStars.game.state.EndStoryView"));
        setField(term1577135, term1577135.getClass(), "textArea", null);
        setField(term1577135, term1577135.getClass(), "map", null);
        setField(term1577135, term1577135.getClass(), "centerPanel", null);
        setField(term1577135, term1577135.getClass(), "imagePanel", null);
        setIntField(term1577135, term1577135.getClass(), "index", 0);
        setField(term1577135, term1577135.getClass(), "realm", null);
        setBooleanField(term1577135, term1577135.getClass(), "isAlignmentXSet", false);
        setFloatField(term1577135, term1577135.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1577135, term1577135.getClass(), "isAlignmentYSet", false);
        setFloatField(term1577135, term1577135.getClass(), "alignmentY", 0.0F);
        setField(term1577135, term1577135.getClass(), "ui", null);
        setField(term1577135, term1577135.getClass(), "listenerList", null);
        setField(term1577135, term1577135.getClass(), "clientProperties", null);
        setField(term1577135, term1577135.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1577135, term1577135.getClass(), "autoscrolls", false);
        setField(term1577135, term1577135.getClass(), "border", null);
        setIntField(term1577135, term1577135.getClass(), "flags", 0);
        setField(term1577135, term1577135.getClass(), "inputVerifier", null);
        setBooleanField(term1577135, term1577135.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1577135, term1577135.getClass(), "paintingChild", null);
        setField(term1577135, term1577135.getClass(), "popupMenu", null);
        setField(term1577135, term1577135.getClass(), "revalidateRunnableScheduled", null);
        setField(term1577135, term1577135.getClass(), "focusInputMap", null);
        setField(term1577135, term1577135.getClass(), "ancestorInputMap", null);
        setField(term1577135, term1577135.getClass(), "windowInputMap", null);
        setField(term1577135, term1577135.getClass(), "actionMap", null);
        setField(term1577135, term1577135.getClass(), "aaHint", null);
        setField(term1577135, term1577135.getClass(), "lcdRenderingHint", null);
        setField(term1577135, term1577135.getClass(), "component", null);
        setField(term1577135, term1577135.getClass(), "layoutMgr", null);
        setField(term1577135, term1577135.getClass(), "dispatcher", null);
        setField(term1577135, term1577135.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1577135, term1577135.getClass(), "focusCycleRoot", false);
        setBooleanField(term1577135, term1577135.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1577135, term1577135.getClass(), "printingThreads", null);
        setBooleanField(term1577135, term1577135.getClass(), "printing", false);
        setField(term1577135, term1577135.getClass(), "containerListener", null);
        setIntField(term1577135, term1577135.getClass(), "listeningChildren", 0);
        setIntField(term1577135, term1577135.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1577135, term1577135.getClass(), "descendantsCount", 0);
        setField(term1577135, term1577135.getClass(), "preserveBackgroundColor", null);
        setIntField(term1577135, term1577135.getClass(), "numOfHWComponents", 0);
        setIntField(term1577135, term1577135.getClass(), "numOfLWComponents", 0);
        setField(term1577135, term1577135.getClass(), "modalComp", null);
        setField(term1577135, term1577135.getClass(), "modalAppContext", null);
        setIntField(term1577135, term1577135.getClass(), "containerSerializedDataVersion", 0);
        setField(term1577135, term1577135.getClass(), "peer", null);
        setField(term1577135, term1577135.getClass(), "parent", null);
        setField(term1577135, term1577135.getClass(), "appContext", null);
        setIntField(term1577135, term1577135.getClass(), "x", 0);
        setIntField(term1577135, term1577135.getClass(), "y", 0);
        setIntField(term1577135, term1577135.getClass(), "width", 0);
        setIntField(term1577135, term1577135.getClass(), "height", 0);
        setField(term1577135, term1577135.getClass(), "foreground", null);
        setField(term1577135, term1577135.getClass(), "background", null);
        setField(term1577135, term1577135.getClass(), "font", null);
        setField(term1577135, term1577135.getClass(), "peerFont", null);
        setField(term1577135, term1577135.getClass(), "cursor", null);
        setField(term1577135, term1577135.getClass(), "locale", null);
        setField(term1577135, term1577135.getClass(), "graphicsConfig", null);
        setField(term1577135, term1577135.getClass(), "bufferStrategy", null);
        setBooleanField(term1577135, term1577135.getClass(), "ignoreRepaint", false);
        setBooleanField(term1577135, term1577135.getClass(), "visible", false);
        setBooleanField(term1577135, term1577135.getClass(), "enabled", false);
        setBooleanField(term1577135, term1577135.getClass(), "valid", false);
        setField(term1577135, term1577135.getClass(), "dropTarget", null);
        setField(term1577135, term1577135.getClass(), "popups", null);
        setField(term1577135, term1577135.getClass(), "name", null);
        setBooleanField(term1577135, term1577135.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1577135, term1577135.getClass(), "focusable", false);
        setIntField(term1577135, term1577135.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1577135, term1577135.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1577135, term1577135.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1577135, term1577135.getClass(), "acc", null);
        setField(term1577135, term1577135.getClass(), "minSize", null);
        setBooleanField(term1577135, term1577135.getClass(), "minSizeSet", false);
        setField(term1577135, term1577135.getClass(), "prefSize", null);
        setBooleanField(term1577135, term1577135.getClass(), "prefSizeSet", false);
        setField(term1577135, term1577135.getClass(), "maxSize", null);
        setBooleanField(term1577135, term1577135.getClass(), "maxSizeSet", false);
        setField(term1577135, term1577135.getClass(), "componentOrientation", null);
        setBooleanField(term1577135, term1577135.getClass(), "newEventsOnly", false);
        setField(term1577135, term1577135.getClass(), "componentListener", null);
        setField(term1577135, term1577135.getClass(), "focusListener", null);
        setField(term1577135, term1577135.getClass(), "hierarchyListener", null);
        setField(term1577135, term1577135.getClass(), "hierarchyBoundsListener", null);
        setField(term1577135, term1577135.getClass(), "keyListener", null);
        setField(term1577135, term1577135.getClass(), "mouseListener", null);
        setField(term1577135, term1577135.getClass(), "mouseMotionListener", null);
        setField(term1577135, term1577135.getClass(), "mouseWheelListener", null);
        setField(term1577135, term1577135.getClass(), "inputMethodListener", null);
        setLongField(term1577135, term1577135.getClass(), "eventMask", 0L);
        setField(term1577135, term1577135.getClass(), "changeSupport", null);
        setField(term1577135, term1577135.getClass(), "objectLock", null);
        setBooleanField(term1577135, term1577135.getClass(), "isPacked", false);
        setIntField(term1577135, term1577135.getClass(), "boundsOp", 0);
        setField(term1577135, term1577135.getClass(), "compoundShape", null);
        setField(term1577135, term1577135.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1577135, term1577135.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1577135, term1577135.getClass(), "backgroundEraseDisabled", false);
        setField(term1577135, term1577135.getClass(), "eventCache", null);
        setBooleanField(term1577135, term1577135.getClass(), "coalescingEnabled", false);
        setBooleanField(term1577135, term1577135.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1577135, term1577135.getClass(), "componentSerializedDataVersion", 0);
        setField(term1577135, term1577135.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.EndStoryView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHomePlanet", argTypes, term1577135, args);
    }

};


