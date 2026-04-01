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

public class BattleInfoPanel_isUseAllWeapons_77279036821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80131;

    public BattleInfoPanel_isUseAllWeapons_77279036821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80131 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.BattleInfoPanel"));
        setField(term80131, term80131.getClass(), "imageLabel", null);
        setField(term80131, term80131.getClass(), "textArea", null);
        setField(term80131, term80131.getClass(), "ship", null);
        setField(term80131, term80131.getClass(), "useAllWeapons", null);
        setField(term80131, term80131.getClass(), "showRange", null);
        setField(term80131, term80131.getClass(), "cBtn", null);
        setField(term80131, term80131.getClass(), "border", null);
        setBooleanField(term80131, term80131.getClass(), "isAlignmentXSet", false);
        setFloatField(term80131, term80131.getClass(), "alignmentX", 0.0F);
        setBooleanField(term80131, term80131.getClass(), "isAlignmentYSet", false);
        setFloatField(term80131, term80131.getClass(), "alignmentY", 0.0F);
        setField(term80131, term80131.getClass(), "ui", null);
        setField(term80131, term80131.getClass(), "listenerList", null);
        setField(term80131, term80131.getClass(), "clientProperties", null);
        setField(term80131, term80131.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term80131, term80131.getClass(), "autoscrolls", false);
        setField(term80131, term80131.getClass(), "border", null);
        setIntField(term80131, term80131.getClass(), "flags", 0);
        setField(term80131, term80131.getClass(), "inputVerifier", null);
        setBooleanField(term80131, term80131.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term80131, term80131.getClass(), "paintingChild", null);
        setField(term80131, term80131.getClass(), "popupMenu", null);
        setField(term80131, term80131.getClass(), "revalidateRunnableScheduled", null);
        setField(term80131, term80131.getClass(), "focusInputMap", null);
        setField(term80131, term80131.getClass(), "ancestorInputMap", null);
        setField(term80131, term80131.getClass(), "windowInputMap", null);
        setField(term80131, term80131.getClass(), "actionMap", null);
        setField(term80131, term80131.getClass(), "aaHint", null);
        setField(term80131, term80131.getClass(), "lcdRenderingHint", null);
        setField(term80131, term80131.getClass(), "component", null);
        setField(term80131, term80131.getClass(), "layoutMgr", null);
        setField(term80131, term80131.getClass(), "dispatcher", null);
        setField(term80131, term80131.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term80131, term80131.getClass(), "focusCycleRoot", false);
        setBooleanField(term80131, term80131.getClass(), "focusTraversalPolicyProvider", false);
        setField(term80131, term80131.getClass(), "printingThreads", null);
        setBooleanField(term80131, term80131.getClass(), "printing", false);
        setField(term80131, term80131.getClass(), "containerListener", null);
        setIntField(term80131, term80131.getClass(), "listeningChildren", 0);
        setIntField(term80131, term80131.getClass(), "listeningBoundsChildren", 0);
        setIntField(term80131, term80131.getClass(), "descendantsCount", 0);
        setField(term80131, term80131.getClass(), "preserveBackgroundColor", null);
        setIntField(term80131, term80131.getClass(), "numOfHWComponents", 0);
        setIntField(term80131, term80131.getClass(), "numOfLWComponents", 0);
        setField(term80131, term80131.getClass(), "modalComp", null);
        setField(term80131, term80131.getClass(), "modalAppContext", null);
        setIntField(term80131, term80131.getClass(), "containerSerializedDataVersion", 0);
        setField(term80131, term80131.getClass(), "peer", null);
        setField(term80131, term80131.getClass(), "parent", null);
        setField(term80131, term80131.getClass(), "appContext", null);
        setIntField(term80131, term80131.getClass(), "x", 0);
        setIntField(term80131, term80131.getClass(), "y", 0);
        setIntField(term80131, term80131.getClass(), "width", 0);
        setIntField(term80131, term80131.getClass(), "height", 0);
        setField(term80131, term80131.getClass(), "foreground", null);
        setField(term80131, term80131.getClass(), "background", null);
        setField(term80131, term80131.getClass(), "font", null);
        setField(term80131, term80131.getClass(), "peerFont", null);
        setField(term80131, term80131.getClass(), "cursor", null);
        setField(term80131, term80131.getClass(), "locale", null);
        setField(term80131, term80131.getClass(), "graphicsConfig", null);
        setField(term80131, term80131.getClass(), "bufferStrategy", null);
        setBooleanField(term80131, term80131.getClass(), "ignoreRepaint", false);
        setBooleanField(term80131, term80131.getClass(), "visible", false);
        setBooleanField(term80131, term80131.getClass(), "enabled", false);
        setBooleanField(term80131, term80131.getClass(), "valid", false);
        setField(term80131, term80131.getClass(), "dropTarget", null);
        setField(term80131, term80131.getClass(), "popups", null);
        setField(term80131, term80131.getClass(), "name", null);
        setBooleanField(term80131, term80131.getClass(), "nameExplicitlySet", false);
        setBooleanField(term80131, term80131.getClass(), "focusable", false);
        setIntField(term80131, term80131.getClass(), "isFocusTraversableOverridden", 0);
        setField(term80131, term80131.getClass(), "focusTraversalKeys", null);
        setBooleanField(term80131, term80131.getClass(), "focusTraversalKeysEnabled", false);
        setField(term80131, term80131.getClass(), "acc", null);
        setField(term80131, term80131.getClass(), "minSize", null);
        setBooleanField(term80131, term80131.getClass(), "minSizeSet", false);
        setField(term80131, term80131.getClass(), "prefSize", null);
        setBooleanField(term80131, term80131.getClass(), "prefSizeSet", false);
        setField(term80131, term80131.getClass(), "maxSize", null);
        setBooleanField(term80131, term80131.getClass(), "maxSizeSet", false);
        setField(term80131, term80131.getClass(), "componentOrientation", null);
        setBooleanField(term80131, term80131.getClass(), "newEventsOnly", false);
        setField(term80131, term80131.getClass(), "componentListener", null);
        setField(term80131, term80131.getClass(), "focusListener", null);
        setField(term80131, term80131.getClass(), "hierarchyListener", null);
        setField(term80131, term80131.getClass(), "hierarchyBoundsListener", null);
        setField(term80131, term80131.getClass(), "keyListener", null);
        setField(term80131, term80131.getClass(), "mouseListener", null);
        setField(term80131, term80131.getClass(), "mouseMotionListener", null);
        setField(term80131, term80131.getClass(), "mouseWheelListener", null);
        setField(term80131, term80131.getClass(), "inputMethodListener", null);
        setLongField(term80131, term80131.getClass(), "eventMask", 0L);
        setField(term80131, term80131.getClass(), "changeSupport", null);
        setField(term80131, term80131.getClass(), "objectLock", null);
        setBooleanField(term80131, term80131.getClass(), "isPacked", false);
        setIntField(term80131, term80131.getClass(), "boundsOp", 0);
        setField(term80131, term80131.getClass(), "compoundShape", null);
        setField(term80131, term80131.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term80131, term80131.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term80131, term80131.getClass(), "backgroundEraseDisabled", false);
        setField(term80131, term80131.getClass(), "eventCache", null);
        setBooleanField(term80131, term80131.getClass(), "coalescingEnabled", false);
        setBooleanField(term80131, term80131.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term80131, term80131.getClass(), "componentSerializedDataVersion", 0);
        setField(term80131, term80131.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.BattleInfoPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isUseAllWeapons", argTypes, term80131, args);
    }

};


