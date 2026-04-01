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

public class BattleInfoPanel_updateShip_97769407416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79922;

    public BattleInfoPanel_updateShip_97769407416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79922 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.BattleInfoPanel"));
        setField(term79922, term79922.getClass(), "imageLabel", null);
        setField(term79922, term79922.getClass(), "textArea", null);
        setField(term79922, term79922.getClass(), "ship", null);
        setField(term79922, term79922.getClass(), "useAllWeapons", null);
        setField(term79922, term79922.getClass(), "showRange", null);
        setField(term79922, term79922.getClass(), "cBtn", null);
        setField(term79922, term79922.getClass(), "border", null);
        setBooleanField(term79922, term79922.getClass(), "isAlignmentXSet", false);
        setFloatField(term79922, term79922.getClass(), "alignmentX", 0.0F);
        setBooleanField(term79922, term79922.getClass(), "isAlignmentYSet", false);
        setFloatField(term79922, term79922.getClass(), "alignmentY", 0.0F);
        setField(term79922, term79922.getClass(), "ui", null);
        setField(term79922, term79922.getClass(), "listenerList", null);
        setField(term79922, term79922.getClass(), "clientProperties", null);
        setField(term79922, term79922.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term79922, term79922.getClass(), "autoscrolls", false);
        setField(term79922, term79922.getClass(), "border", null);
        setIntField(term79922, term79922.getClass(), "flags", 0);
        setField(term79922, term79922.getClass(), "inputVerifier", null);
        setBooleanField(term79922, term79922.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term79922, term79922.getClass(), "paintingChild", null);
        setField(term79922, term79922.getClass(), "popupMenu", null);
        setField(term79922, term79922.getClass(), "revalidateRunnableScheduled", null);
        setField(term79922, term79922.getClass(), "focusInputMap", null);
        setField(term79922, term79922.getClass(), "ancestorInputMap", null);
        setField(term79922, term79922.getClass(), "windowInputMap", null);
        setField(term79922, term79922.getClass(), "actionMap", null);
        setField(term79922, term79922.getClass(), "aaHint", null);
        setField(term79922, term79922.getClass(), "lcdRenderingHint", null);
        setField(term79922, term79922.getClass(), "component", null);
        setField(term79922, term79922.getClass(), "layoutMgr", null);
        setField(term79922, term79922.getClass(), "dispatcher", null);
        setField(term79922, term79922.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term79922, term79922.getClass(), "focusCycleRoot", false);
        setBooleanField(term79922, term79922.getClass(), "focusTraversalPolicyProvider", false);
        setField(term79922, term79922.getClass(), "printingThreads", null);
        setBooleanField(term79922, term79922.getClass(), "printing", false);
        setField(term79922, term79922.getClass(), "containerListener", null);
        setIntField(term79922, term79922.getClass(), "listeningChildren", 0);
        setIntField(term79922, term79922.getClass(), "listeningBoundsChildren", 0);
        setIntField(term79922, term79922.getClass(), "descendantsCount", 0);
        setField(term79922, term79922.getClass(), "preserveBackgroundColor", null);
        setIntField(term79922, term79922.getClass(), "numOfHWComponents", 0);
        setIntField(term79922, term79922.getClass(), "numOfLWComponents", 0);
        setField(term79922, term79922.getClass(), "modalComp", null);
        setField(term79922, term79922.getClass(), "modalAppContext", null);
        setIntField(term79922, term79922.getClass(), "containerSerializedDataVersion", 0);
        setField(term79922, term79922.getClass(), "peer", null);
        setField(term79922, term79922.getClass(), "parent", null);
        setField(term79922, term79922.getClass(), "appContext", null);
        setIntField(term79922, term79922.getClass(), "x", 0);
        setIntField(term79922, term79922.getClass(), "y", 0);
        setIntField(term79922, term79922.getClass(), "width", 0);
        setIntField(term79922, term79922.getClass(), "height", 0);
        setField(term79922, term79922.getClass(), "foreground", null);
        setField(term79922, term79922.getClass(), "background", null);
        setField(term79922, term79922.getClass(), "font", null);
        setField(term79922, term79922.getClass(), "peerFont", null);
        setField(term79922, term79922.getClass(), "cursor", null);
        setField(term79922, term79922.getClass(), "locale", null);
        setField(term79922, term79922.getClass(), "graphicsConfig", null);
        setField(term79922, term79922.getClass(), "bufferStrategy", null);
        setBooleanField(term79922, term79922.getClass(), "ignoreRepaint", false);
        setBooleanField(term79922, term79922.getClass(), "visible", false);
        setBooleanField(term79922, term79922.getClass(), "enabled", false);
        setBooleanField(term79922, term79922.getClass(), "valid", false);
        setField(term79922, term79922.getClass(), "dropTarget", null);
        setField(term79922, term79922.getClass(), "popups", null);
        setField(term79922, term79922.getClass(), "name", null);
        setBooleanField(term79922, term79922.getClass(), "nameExplicitlySet", false);
        setBooleanField(term79922, term79922.getClass(), "focusable", false);
        setIntField(term79922, term79922.getClass(), "isFocusTraversableOverridden", 0);
        setField(term79922, term79922.getClass(), "focusTraversalKeys", null);
        setBooleanField(term79922, term79922.getClass(), "focusTraversalKeysEnabled", false);
        setField(term79922, term79922.getClass(), "acc", null);
        setField(term79922, term79922.getClass(), "minSize", null);
        setBooleanField(term79922, term79922.getClass(), "minSizeSet", false);
        setField(term79922, term79922.getClass(), "prefSize", null);
        setBooleanField(term79922, term79922.getClass(), "prefSizeSet", false);
        setField(term79922, term79922.getClass(), "maxSize", null);
        setBooleanField(term79922, term79922.getClass(), "maxSizeSet", false);
        setField(term79922, term79922.getClass(), "componentOrientation", null);
        setBooleanField(term79922, term79922.getClass(), "newEventsOnly", false);
        setField(term79922, term79922.getClass(), "componentListener", null);
        setField(term79922, term79922.getClass(), "focusListener", null);
        setField(term79922, term79922.getClass(), "hierarchyListener", null);
        setField(term79922, term79922.getClass(), "hierarchyBoundsListener", null);
        setField(term79922, term79922.getClass(), "keyListener", null);
        setField(term79922, term79922.getClass(), "mouseListener", null);
        setField(term79922, term79922.getClass(), "mouseMotionListener", null);
        setField(term79922, term79922.getClass(), "mouseWheelListener", null);
        setField(term79922, term79922.getClass(), "inputMethodListener", null);
        setLongField(term79922, term79922.getClass(), "eventMask", 0L);
        setField(term79922, term79922.getClass(), "changeSupport", null);
        setField(term79922, term79922.getClass(), "objectLock", null);
        setBooleanField(term79922, term79922.getClass(), "isPacked", false);
        setIntField(term79922, term79922.getClass(), "boundsOp", 0);
        setField(term79922, term79922.getClass(), "compoundShape", null);
        setField(term79922, term79922.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term79922, term79922.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term79922, term79922.getClass(), "backgroundEraseDisabled", false);
        setField(term79922, term79922.getClass(), "eventCache", null);
        setBooleanField(term79922, term79922.getClass(), "coalescingEnabled", false);
        setBooleanField(term79922, term79922.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term79922, term79922.getClass(), "componentSerializedDataVersion", 0);
        setField(term79922, term79922.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.BattleInfoPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateShip", argTypes, term79922, args);
    }

};


