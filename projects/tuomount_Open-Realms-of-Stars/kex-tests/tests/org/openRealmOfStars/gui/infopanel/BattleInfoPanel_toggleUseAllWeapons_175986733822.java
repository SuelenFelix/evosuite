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

public class BattleInfoPanel_toggleUseAllWeapons_175986733822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80172;

    public BattleInfoPanel_toggleUseAllWeapons_175986733822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80172 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.BattleInfoPanel"));
        setField(term80172, term80172.getClass(), "imageLabel", null);
        setField(term80172, term80172.getClass(), "textArea", null);
        setField(term80172, term80172.getClass(), "ship", null);
        setField(term80172, term80172.getClass(), "useAllWeapons", null);
        setField(term80172, term80172.getClass(), "showRange", null);
        setField(term80172, term80172.getClass(), "cBtn", null);
        setField(term80172, term80172.getClass(), "border", null);
        setBooleanField(term80172, term80172.getClass(), "isAlignmentXSet", false);
        setFloatField(term80172, term80172.getClass(), "alignmentX", 0.0F);
        setBooleanField(term80172, term80172.getClass(), "isAlignmentYSet", false);
        setFloatField(term80172, term80172.getClass(), "alignmentY", 0.0F);
        setField(term80172, term80172.getClass(), "ui", null);
        setField(term80172, term80172.getClass(), "listenerList", null);
        setField(term80172, term80172.getClass(), "clientProperties", null);
        setField(term80172, term80172.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term80172, term80172.getClass(), "autoscrolls", false);
        setField(term80172, term80172.getClass(), "border", null);
        setIntField(term80172, term80172.getClass(), "flags", 0);
        setField(term80172, term80172.getClass(), "inputVerifier", null);
        setBooleanField(term80172, term80172.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term80172, term80172.getClass(), "paintingChild", null);
        setField(term80172, term80172.getClass(), "popupMenu", null);
        setField(term80172, term80172.getClass(), "revalidateRunnableScheduled", null);
        setField(term80172, term80172.getClass(), "focusInputMap", null);
        setField(term80172, term80172.getClass(), "ancestorInputMap", null);
        setField(term80172, term80172.getClass(), "windowInputMap", null);
        setField(term80172, term80172.getClass(), "actionMap", null);
        setField(term80172, term80172.getClass(), "aaHint", null);
        setField(term80172, term80172.getClass(), "lcdRenderingHint", null);
        setField(term80172, term80172.getClass(), "component", null);
        setField(term80172, term80172.getClass(), "layoutMgr", null);
        setField(term80172, term80172.getClass(), "dispatcher", null);
        setField(term80172, term80172.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term80172, term80172.getClass(), "focusCycleRoot", false);
        setBooleanField(term80172, term80172.getClass(), "focusTraversalPolicyProvider", false);
        setField(term80172, term80172.getClass(), "printingThreads", null);
        setBooleanField(term80172, term80172.getClass(), "printing", false);
        setField(term80172, term80172.getClass(), "containerListener", null);
        setIntField(term80172, term80172.getClass(), "listeningChildren", 0);
        setIntField(term80172, term80172.getClass(), "listeningBoundsChildren", 0);
        setIntField(term80172, term80172.getClass(), "descendantsCount", 0);
        setField(term80172, term80172.getClass(), "preserveBackgroundColor", null);
        setIntField(term80172, term80172.getClass(), "numOfHWComponents", 0);
        setIntField(term80172, term80172.getClass(), "numOfLWComponents", 0);
        setField(term80172, term80172.getClass(), "modalComp", null);
        setField(term80172, term80172.getClass(), "modalAppContext", null);
        setIntField(term80172, term80172.getClass(), "containerSerializedDataVersion", 0);
        setField(term80172, term80172.getClass(), "peer", null);
        setField(term80172, term80172.getClass(), "parent", null);
        setField(term80172, term80172.getClass(), "appContext", null);
        setIntField(term80172, term80172.getClass(), "x", 0);
        setIntField(term80172, term80172.getClass(), "y", 0);
        setIntField(term80172, term80172.getClass(), "width", 0);
        setIntField(term80172, term80172.getClass(), "height", 0);
        setField(term80172, term80172.getClass(), "foreground", null);
        setField(term80172, term80172.getClass(), "background", null);
        setField(term80172, term80172.getClass(), "font", null);
        setField(term80172, term80172.getClass(), "peerFont", null);
        setField(term80172, term80172.getClass(), "cursor", null);
        setField(term80172, term80172.getClass(), "locale", null);
        setField(term80172, term80172.getClass(), "graphicsConfig", null);
        setField(term80172, term80172.getClass(), "bufferStrategy", null);
        setBooleanField(term80172, term80172.getClass(), "ignoreRepaint", false);
        setBooleanField(term80172, term80172.getClass(), "visible", false);
        setBooleanField(term80172, term80172.getClass(), "enabled", false);
        setBooleanField(term80172, term80172.getClass(), "valid", false);
        setField(term80172, term80172.getClass(), "dropTarget", null);
        setField(term80172, term80172.getClass(), "popups", null);
        setField(term80172, term80172.getClass(), "name", null);
        setBooleanField(term80172, term80172.getClass(), "nameExplicitlySet", false);
        setBooleanField(term80172, term80172.getClass(), "focusable", false);
        setIntField(term80172, term80172.getClass(), "isFocusTraversableOverridden", 0);
        setField(term80172, term80172.getClass(), "focusTraversalKeys", null);
        setBooleanField(term80172, term80172.getClass(), "focusTraversalKeysEnabled", false);
        setField(term80172, term80172.getClass(), "acc", null);
        setField(term80172, term80172.getClass(), "minSize", null);
        setBooleanField(term80172, term80172.getClass(), "minSizeSet", false);
        setField(term80172, term80172.getClass(), "prefSize", null);
        setBooleanField(term80172, term80172.getClass(), "prefSizeSet", false);
        setField(term80172, term80172.getClass(), "maxSize", null);
        setBooleanField(term80172, term80172.getClass(), "maxSizeSet", false);
        setField(term80172, term80172.getClass(), "componentOrientation", null);
        setBooleanField(term80172, term80172.getClass(), "newEventsOnly", false);
        setField(term80172, term80172.getClass(), "componentListener", null);
        setField(term80172, term80172.getClass(), "focusListener", null);
        setField(term80172, term80172.getClass(), "hierarchyListener", null);
        setField(term80172, term80172.getClass(), "hierarchyBoundsListener", null);
        setField(term80172, term80172.getClass(), "keyListener", null);
        setField(term80172, term80172.getClass(), "mouseListener", null);
        setField(term80172, term80172.getClass(), "mouseMotionListener", null);
        setField(term80172, term80172.getClass(), "mouseWheelListener", null);
        setField(term80172, term80172.getClass(), "inputMethodListener", null);
        setLongField(term80172, term80172.getClass(), "eventMask", 0L);
        setField(term80172, term80172.getClass(), "changeSupport", null);
        setField(term80172, term80172.getClass(), "objectLock", null);
        setBooleanField(term80172, term80172.getClass(), "isPacked", false);
        setIntField(term80172, term80172.getClass(), "boundsOp", 0);
        setField(term80172, term80172.getClass(), "compoundShape", null);
        setField(term80172, term80172.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term80172, term80172.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term80172, term80172.getClass(), "backgroundEraseDisabled", false);
        setField(term80172, term80172.getClass(), "eventCache", null);
        setBooleanField(term80172, term80172.getClass(), "coalescingEnabled", false);
        setBooleanField(term80172, term80172.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term80172, term80172.getClass(), "componentSerializedDataVersion", 0);
        setField(term80172, term80172.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.BattleInfoPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toggleUseAllWeapons", argTypes, term80172, args);
    }

};


