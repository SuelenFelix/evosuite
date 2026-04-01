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

public class ShipView_getSelectedStat_8199227259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1965250;

    public ShipView_getSelectedStat_8199227259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1965250 = newInstance(Class.forName("org.openRealmOfStars.game.state.ShipView"));
        setField(term1965250, term1965250.getClass(), "player", null);
        setField(term1965250, term1965250.getClass(), "shipList", null);
        setField(term1965250, term1965250.getClass(), "shipImage", null);
        setField(term1965250, term1965250.getClass(), "infoText", null);
        setBooleanField(term1965250, term1965250.getClass(), "copyClicked", false);
        setIntField(term1965250, term1965250.getClass(), "lastSelectedIndex", 0);
        setField(term1965250, term1965250.getClass(), "obsoleteBtn", null);
        setField(term1965250, term1965250.getClass(), "deleteBtn", null);
        setBooleanField(term1965250, term1965250.getClass(), "isAlignmentXSet", false);
        setFloatField(term1965250, term1965250.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1965250, term1965250.getClass(), "isAlignmentYSet", false);
        setFloatField(term1965250, term1965250.getClass(), "alignmentY", 0.0F);
        setField(term1965250, term1965250.getClass(), "ui", null);
        setField(term1965250, term1965250.getClass(), "listenerList", null);
        setField(term1965250, term1965250.getClass(), "clientProperties", null);
        setField(term1965250, term1965250.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1965250, term1965250.getClass(), "autoscrolls", false);
        setField(term1965250, term1965250.getClass(), "border", null);
        setIntField(term1965250, term1965250.getClass(), "flags", 0);
        setField(term1965250, term1965250.getClass(), "inputVerifier", null);
        setBooleanField(term1965250, term1965250.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1965250, term1965250.getClass(), "paintingChild", null);
        setField(term1965250, term1965250.getClass(), "popupMenu", null);
        setField(term1965250, term1965250.getClass(), "revalidateRunnableScheduled", null);
        setField(term1965250, term1965250.getClass(), "focusInputMap", null);
        setField(term1965250, term1965250.getClass(), "ancestorInputMap", null);
        setField(term1965250, term1965250.getClass(), "windowInputMap", null);
        setField(term1965250, term1965250.getClass(), "actionMap", null);
        setField(term1965250, term1965250.getClass(), "aaHint", null);
        setField(term1965250, term1965250.getClass(), "lcdRenderingHint", null);
        setField(term1965250, term1965250.getClass(), "component", null);
        setField(term1965250, term1965250.getClass(), "layoutMgr", null);
        setField(term1965250, term1965250.getClass(), "dispatcher", null);
        setField(term1965250, term1965250.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1965250, term1965250.getClass(), "focusCycleRoot", false);
        setBooleanField(term1965250, term1965250.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1965250, term1965250.getClass(), "printingThreads", null);
        setBooleanField(term1965250, term1965250.getClass(), "printing", false);
        setField(term1965250, term1965250.getClass(), "containerListener", null);
        setIntField(term1965250, term1965250.getClass(), "listeningChildren", 0);
        setIntField(term1965250, term1965250.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1965250, term1965250.getClass(), "descendantsCount", 0);
        setField(term1965250, term1965250.getClass(), "preserveBackgroundColor", null);
        setIntField(term1965250, term1965250.getClass(), "numOfHWComponents", 0);
        setIntField(term1965250, term1965250.getClass(), "numOfLWComponents", 0);
        setField(term1965250, term1965250.getClass(), "modalComp", null);
        setField(term1965250, term1965250.getClass(), "modalAppContext", null);
        setIntField(term1965250, term1965250.getClass(), "containerSerializedDataVersion", 0);
        setField(term1965250, term1965250.getClass(), "peer", null);
        setField(term1965250, term1965250.getClass(), "parent", null);
        setField(term1965250, term1965250.getClass(), "appContext", null);
        setIntField(term1965250, term1965250.getClass(), "x", 0);
        setIntField(term1965250, term1965250.getClass(), "y", 0);
        setIntField(term1965250, term1965250.getClass(), "width", 0);
        setIntField(term1965250, term1965250.getClass(), "height", 0);
        setField(term1965250, term1965250.getClass(), "foreground", null);
        setField(term1965250, term1965250.getClass(), "background", null);
        setField(term1965250, term1965250.getClass(), "font", null);
        setField(term1965250, term1965250.getClass(), "peerFont", null);
        setField(term1965250, term1965250.getClass(), "cursor", null);
        setField(term1965250, term1965250.getClass(), "locale", null);
        setField(term1965250, term1965250.getClass(), "graphicsConfig", null);
        setField(term1965250, term1965250.getClass(), "bufferStrategy", null);
        setBooleanField(term1965250, term1965250.getClass(), "ignoreRepaint", false);
        setBooleanField(term1965250, term1965250.getClass(), "visible", false);
        setBooleanField(term1965250, term1965250.getClass(), "enabled", false);
        setBooleanField(term1965250, term1965250.getClass(), "valid", false);
        setField(term1965250, term1965250.getClass(), "dropTarget", null);
        setField(term1965250, term1965250.getClass(), "popups", null);
        setField(term1965250, term1965250.getClass(), "name", null);
        setBooleanField(term1965250, term1965250.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1965250, term1965250.getClass(), "focusable", false);
        setIntField(term1965250, term1965250.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1965250, term1965250.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1965250, term1965250.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1965250, term1965250.getClass(), "acc", null);
        setField(term1965250, term1965250.getClass(), "minSize", null);
        setBooleanField(term1965250, term1965250.getClass(), "minSizeSet", false);
        setField(term1965250, term1965250.getClass(), "prefSize", null);
        setBooleanField(term1965250, term1965250.getClass(), "prefSizeSet", false);
        setField(term1965250, term1965250.getClass(), "maxSize", null);
        setBooleanField(term1965250, term1965250.getClass(), "maxSizeSet", false);
        setField(term1965250, term1965250.getClass(), "componentOrientation", null);
        setBooleanField(term1965250, term1965250.getClass(), "newEventsOnly", false);
        setField(term1965250, term1965250.getClass(), "componentListener", null);
        setField(term1965250, term1965250.getClass(), "focusListener", null);
        setField(term1965250, term1965250.getClass(), "hierarchyListener", null);
        setField(term1965250, term1965250.getClass(), "hierarchyBoundsListener", null);
        setField(term1965250, term1965250.getClass(), "keyListener", null);
        setField(term1965250, term1965250.getClass(), "mouseListener", null);
        setField(term1965250, term1965250.getClass(), "mouseMotionListener", null);
        setField(term1965250, term1965250.getClass(), "mouseWheelListener", null);
        setField(term1965250, term1965250.getClass(), "inputMethodListener", null);
        setLongField(term1965250, term1965250.getClass(), "eventMask", 0L);
        setField(term1965250, term1965250.getClass(), "changeSupport", null);
        setField(term1965250, term1965250.getClass(), "objectLock", null);
        setBooleanField(term1965250, term1965250.getClass(), "isPacked", false);
        setIntField(term1965250, term1965250.getClass(), "boundsOp", 0);
        setField(term1965250, term1965250.getClass(), "compoundShape", null);
        setField(term1965250, term1965250.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1965250, term1965250.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1965250, term1965250.getClass(), "backgroundEraseDisabled", false);
        setField(term1965250, term1965250.getClass(), "eventCache", null);
        setBooleanField(term1965250, term1965250.getClass(), "coalescingEnabled", false);
        setBooleanField(term1965250, term1965250.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1965250, term1965250.getClass(), "componentSerializedDataVersion", 0);
        setField(term1965250, term1965250.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ShipView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSelectedStat", argTypes, term1965250, args);
    }

};


