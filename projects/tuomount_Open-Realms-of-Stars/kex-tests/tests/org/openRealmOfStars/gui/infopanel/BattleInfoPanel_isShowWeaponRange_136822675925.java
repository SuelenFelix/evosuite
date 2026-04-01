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

public class BattleInfoPanel_isShowWeaponRange_136822675925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80295;

    public BattleInfoPanel_isShowWeaponRange_136822675925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80295 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.BattleInfoPanel"));
        setField(term80295, term80295.getClass(), "imageLabel", null);
        setField(term80295, term80295.getClass(), "textArea", null);
        setField(term80295, term80295.getClass(), "ship", null);
        setField(term80295, term80295.getClass(), "useAllWeapons", null);
        setField(term80295, term80295.getClass(), "showRange", null);
        setField(term80295, term80295.getClass(), "cBtn", null);
        setField(term80295, term80295.getClass(), "border", null);
        setBooleanField(term80295, term80295.getClass(), "isAlignmentXSet", false);
        setFloatField(term80295, term80295.getClass(), "alignmentX", 0.0F);
        setBooleanField(term80295, term80295.getClass(), "isAlignmentYSet", false);
        setFloatField(term80295, term80295.getClass(), "alignmentY", 0.0F);
        setField(term80295, term80295.getClass(), "ui", null);
        setField(term80295, term80295.getClass(), "listenerList", null);
        setField(term80295, term80295.getClass(), "clientProperties", null);
        setField(term80295, term80295.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term80295, term80295.getClass(), "autoscrolls", false);
        setField(term80295, term80295.getClass(), "border", null);
        setIntField(term80295, term80295.getClass(), "flags", 0);
        setField(term80295, term80295.getClass(), "inputVerifier", null);
        setBooleanField(term80295, term80295.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term80295, term80295.getClass(), "paintingChild", null);
        setField(term80295, term80295.getClass(), "popupMenu", null);
        setField(term80295, term80295.getClass(), "revalidateRunnableScheduled", null);
        setField(term80295, term80295.getClass(), "focusInputMap", null);
        setField(term80295, term80295.getClass(), "ancestorInputMap", null);
        setField(term80295, term80295.getClass(), "windowInputMap", null);
        setField(term80295, term80295.getClass(), "actionMap", null);
        setField(term80295, term80295.getClass(), "aaHint", null);
        setField(term80295, term80295.getClass(), "lcdRenderingHint", null);
        setField(term80295, term80295.getClass(), "component", null);
        setField(term80295, term80295.getClass(), "layoutMgr", null);
        setField(term80295, term80295.getClass(), "dispatcher", null);
        setField(term80295, term80295.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term80295, term80295.getClass(), "focusCycleRoot", false);
        setBooleanField(term80295, term80295.getClass(), "focusTraversalPolicyProvider", false);
        setField(term80295, term80295.getClass(), "printingThreads", null);
        setBooleanField(term80295, term80295.getClass(), "printing", false);
        setField(term80295, term80295.getClass(), "containerListener", null);
        setIntField(term80295, term80295.getClass(), "listeningChildren", 0);
        setIntField(term80295, term80295.getClass(), "listeningBoundsChildren", 0);
        setIntField(term80295, term80295.getClass(), "descendantsCount", 0);
        setField(term80295, term80295.getClass(), "preserveBackgroundColor", null);
        setIntField(term80295, term80295.getClass(), "numOfHWComponents", 0);
        setIntField(term80295, term80295.getClass(), "numOfLWComponents", 0);
        setField(term80295, term80295.getClass(), "modalComp", null);
        setField(term80295, term80295.getClass(), "modalAppContext", null);
        setIntField(term80295, term80295.getClass(), "containerSerializedDataVersion", 0);
        setField(term80295, term80295.getClass(), "peer", null);
        setField(term80295, term80295.getClass(), "parent", null);
        setField(term80295, term80295.getClass(), "appContext", null);
        setIntField(term80295, term80295.getClass(), "x", 0);
        setIntField(term80295, term80295.getClass(), "y", 0);
        setIntField(term80295, term80295.getClass(), "width", 0);
        setIntField(term80295, term80295.getClass(), "height", 0);
        setField(term80295, term80295.getClass(), "foreground", null);
        setField(term80295, term80295.getClass(), "background", null);
        setField(term80295, term80295.getClass(), "font", null);
        setField(term80295, term80295.getClass(), "peerFont", null);
        setField(term80295, term80295.getClass(), "cursor", null);
        setField(term80295, term80295.getClass(), "locale", null);
        setField(term80295, term80295.getClass(), "graphicsConfig", null);
        setField(term80295, term80295.getClass(), "bufferStrategy", null);
        setBooleanField(term80295, term80295.getClass(), "ignoreRepaint", false);
        setBooleanField(term80295, term80295.getClass(), "visible", false);
        setBooleanField(term80295, term80295.getClass(), "enabled", false);
        setBooleanField(term80295, term80295.getClass(), "valid", false);
        setField(term80295, term80295.getClass(), "dropTarget", null);
        setField(term80295, term80295.getClass(), "popups", null);
        setField(term80295, term80295.getClass(), "name", null);
        setBooleanField(term80295, term80295.getClass(), "nameExplicitlySet", false);
        setBooleanField(term80295, term80295.getClass(), "focusable", false);
        setIntField(term80295, term80295.getClass(), "isFocusTraversableOverridden", 0);
        setField(term80295, term80295.getClass(), "focusTraversalKeys", null);
        setBooleanField(term80295, term80295.getClass(), "focusTraversalKeysEnabled", false);
        setField(term80295, term80295.getClass(), "acc", null);
        setField(term80295, term80295.getClass(), "minSize", null);
        setBooleanField(term80295, term80295.getClass(), "minSizeSet", false);
        setField(term80295, term80295.getClass(), "prefSize", null);
        setBooleanField(term80295, term80295.getClass(), "prefSizeSet", false);
        setField(term80295, term80295.getClass(), "maxSize", null);
        setBooleanField(term80295, term80295.getClass(), "maxSizeSet", false);
        setField(term80295, term80295.getClass(), "componentOrientation", null);
        setBooleanField(term80295, term80295.getClass(), "newEventsOnly", false);
        setField(term80295, term80295.getClass(), "componentListener", null);
        setField(term80295, term80295.getClass(), "focusListener", null);
        setField(term80295, term80295.getClass(), "hierarchyListener", null);
        setField(term80295, term80295.getClass(), "hierarchyBoundsListener", null);
        setField(term80295, term80295.getClass(), "keyListener", null);
        setField(term80295, term80295.getClass(), "mouseListener", null);
        setField(term80295, term80295.getClass(), "mouseMotionListener", null);
        setField(term80295, term80295.getClass(), "mouseWheelListener", null);
        setField(term80295, term80295.getClass(), "inputMethodListener", null);
        setLongField(term80295, term80295.getClass(), "eventMask", 0L);
        setField(term80295, term80295.getClass(), "changeSupport", null);
        setField(term80295, term80295.getClass(), "objectLock", null);
        setBooleanField(term80295, term80295.getClass(), "isPacked", false);
        setIntField(term80295, term80295.getClass(), "boundsOp", 0);
        setField(term80295, term80295.getClass(), "compoundShape", null);
        setField(term80295, term80295.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term80295, term80295.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term80295, term80295.getClass(), "backgroundEraseDisabled", false);
        setField(term80295, term80295.getClass(), "eventCache", null);
        setBooleanField(term80295, term80295.getClass(), "coalescingEnabled", false);
        setBooleanField(term80295, term80295.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term80295, term80295.getClass(), "componentSerializedDataVersion", 0);
        setField(term80295, term80295.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.BattleInfoPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isShowWeaponRange", argTypes, term80295, args);
    }

};


