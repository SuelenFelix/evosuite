package org.openRealmOfStars.gui.infopanel;

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
import static org.openRealmOfStars.gui.infopanel.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BattleInfoPanel_showShip_185877734815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79881;

    public BattleInfoPanel_showShip_185877734815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79881 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.BattleInfoPanel"));
        setField(term79881, term79881.getClass(), "imageLabel", null);
        setField(term79881, term79881.getClass(), "textArea", null);
        setField(term79881, term79881.getClass(), "ship", null);
        setField(term79881, term79881.getClass(), "useAllWeapons", null);
        setField(term79881, term79881.getClass(), "showRange", null);
        setField(term79881, term79881.getClass(), "cBtn", null);
        setField(term79881, term79881.getClass(), "border", null);
        setBooleanField(term79881, term79881.getClass(), "isAlignmentXSet", false);
        setFloatField(term79881, term79881.getClass(), "alignmentX", 0.0F);
        setBooleanField(term79881, term79881.getClass(), "isAlignmentYSet", false);
        setFloatField(term79881, term79881.getClass(), "alignmentY", 0.0F);
        setField(term79881, term79881.getClass(), "ui", null);
        setField(term79881, term79881.getClass(), "listenerList", null);
        setField(term79881, term79881.getClass(), "clientProperties", null);
        setField(term79881, term79881.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term79881, term79881.getClass(), "autoscrolls", false);
        setField(term79881, term79881.getClass(), "border", null);
        setIntField(term79881, term79881.getClass(), "flags", 0);
        setField(term79881, term79881.getClass(), "inputVerifier", null);
        setBooleanField(term79881, term79881.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term79881, term79881.getClass(), "paintingChild", null);
        setField(term79881, term79881.getClass(), "popupMenu", null);
        setField(term79881, term79881.getClass(), "revalidateRunnableScheduled", null);
        setField(term79881, term79881.getClass(), "focusInputMap", null);
        setField(term79881, term79881.getClass(), "ancestorInputMap", null);
        setField(term79881, term79881.getClass(), "windowInputMap", null);
        setField(term79881, term79881.getClass(), "actionMap", null);
        setField(term79881, term79881.getClass(), "aaHint", null);
        setField(term79881, term79881.getClass(), "lcdRenderingHint", null);
        setField(term79881, term79881.getClass(), "component", null);
        setField(term79881, term79881.getClass(), "layoutMgr", null);
        setField(term79881, term79881.getClass(), "dispatcher", null);
        setField(term79881, term79881.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term79881, term79881.getClass(), "focusCycleRoot", false);
        setBooleanField(term79881, term79881.getClass(), "focusTraversalPolicyProvider", false);
        setField(term79881, term79881.getClass(), "printingThreads", null);
        setBooleanField(term79881, term79881.getClass(), "printing", false);
        setField(term79881, term79881.getClass(), "containerListener", null);
        setIntField(term79881, term79881.getClass(), "listeningChildren", 0);
        setIntField(term79881, term79881.getClass(), "listeningBoundsChildren", 0);
        setIntField(term79881, term79881.getClass(), "descendantsCount", 0);
        setField(term79881, term79881.getClass(), "preserveBackgroundColor", null);
        setIntField(term79881, term79881.getClass(), "numOfHWComponents", 0);
        setIntField(term79881, term79881.getClass(), "numOfLWComponents", 0);
        setField(term79881, term79881.getClass(), "modalComp", null);
        setField(term79881, term79881.getClass(), "modalAppContext", null);
        setIntField(term79881, term79881.getClass(), "containerSerializedDataVersion", 0);
        setField(term79881, term79881.getClass(), "peer", null);
        setField(term79881, term79881.getClass(), "parent", null);
        setField(term79881, term79881.getClass(), "appContext", null);
        setIntField(term79881, term79881.getClass(), "x", 0);
        setIntField(term79881, term79881.getClass(), "y", 0);
        setIntField(term79881, term79881.getClass(), "width", 0);
        setIntField(term79881, term79881.getClass(), "height", 0);
        setField(term79881, term79881.getClass(), "foreground", null);
        setField(term79881, term79881.getClass(), "background", null);
        setField(term79881, term79881.getClass(), "font", null);
        setField(term79881, term79881.getClass(), "peerFont", null);
        setField(term79881, term79881.getClass(), "cursor", null);
        setField(term79881, term79881.getClass(), "locale", null);
        setField(term79881, term79881.getClass(), "graphicsConfig", null);
        setField(term79881, term79881.getClass(), "bufferStrategy", null);
        setBooleanField(term79881, term79881.getClass(), "ignoreRepaint", false);
        setBooleanField(term79881, term79881.getClass(), "visible", false);
        setBooleanField(term79881, term79881.getClass(), "enabled", false);
        setBooleanField(term79881, term79881.getClass(), "valid", false);
        setField(term79881, term79881.getClass(), "dropTarget", null);
        setField(term79881, term79881.getClass(), "popups", null);
        setField(term79881, term79881.getClass(), "name", null);
        setBooleanField(term79881, term79881.getClass(), "nameExplicitlySet", false);
        setBooleanField(term79881, term79881.getClass(), "focusable", false);
        setIntField(term79881, term79881.getClass(), "isFocusTraversableOverridden", 0);
        setField(term79881, term79881.getClass(), "focusTraversalKeys", null);
        setBooleanField(term79881, term79881.getClass(), "focusTraversalKeysEnabled", false);
        setField(term79881, term79881.getClass(), "acc", null);
        setField(term79881, term79881.getClass(), "minSize", null);
        setBooleanField(term79881, term79881.getClass(), "minSizeSet", false);
        setField(term79881, term79881.getClass(), "prefSize", null);
        setBooleanField(term79881, term79881.getClass(), "prefSizeSet", false);
        setField(term79881, term79881.getClass(), "maxSize", null);
        setBooleanField(term79881, term79881.getClass(), "maxSizeSet", false);
        setField(term79881, term79881.getClass(), "componentOrientation", null);
        setBooleanField(term79881, term79881.getClass(), "newEventsOnly", false);
        setField(term79881, term79881.getClass(), "componentListener", null);
        setField(term79881, term79881.getClass(), "focusListener", null);
        setField(term79881, term79881.getClass(), "hierarchyListener", null);
        setField(term79881, term79881.getClass(), "hierarchyBoundsListener", null);
        setField(term79881, term79881.getClass(), "keyListener", null);
        setField(term79881, term79881.getClass(), "mouseListener", null);
        setField(term79881, term79881.getClass(), "mouseMotionListener", null);
        setField(term79881, term79881.getClass(), "mouseWheelListener", null);
        setField(term79881, term79881.getClass(), "inputMethodListener", null);
        setLongField(term79881, term79881.getClass(), "eventMask", 0L);
        setField(term79881, term79881.getClass(), "changeSupport", null);
        setField(term79881, term79881.getClass(), "objectLock", null);
        setBooleanField(term79881, term79881.getClass(), "isPacked", false);
        setIntField(term79881, term79881.getClass(), "boundsOp", 0);
        setField(term79881, term79881.getClass(), "compoundShape", null);
        setField(term79881, term79881.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term79881, term79881.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term79881, term79881.getClass(), "backgroundEraseDisabled", false);
        setField(term79881, term79881.getClass(), "eventCache", null);
        setBooleanField(term79881, term79881.getClass(), "coalescingEnabled", false);
        setBooleanField(term79881, term79881.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term79881, term79881.getClass(), "componentSerializedDataVersion", 0);
        setField(term79881, term79881.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.BattleInfoPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.ship.Ship");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "showShip", argTypes, term79881, args);
    }

};


