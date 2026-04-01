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
import java.lang.Integer;

public class BattleInfoPanel_getBestWeaponForDistance_204021199114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79838;
     Object term79879;

    public BattleInfoPanel_getBestWeaponForDistance_204021199114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79838 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.BattleInfoPanel"));
        setField(term79838, term79838.getClass(), "imageLabel", null);
        setField(term79838, term79838.getClass(), "textArea", null);
        setField(term79838, term79838.getClass(), "ship", null);
        setField(term79838, term79838.getClass(), "useAllWeapons", null);
        setField(term79838, term79838.getClass(), "showRange", null);
        setField(term79838, term79838.getClass(), "cBtn", null);
        setField(term79838, term79838.getClass(), "border", null);
        setBooleanField(term79838, term79838.getClass(), "isAlignmentXSet", false);
        setFloatField(term79838, term79838.getClass(), "alignmentX", 0.0F);
        setBooleanField(term79838, term79838.getClass(), "isAlignmentYSet", false);
        setFloatField(term79838, term79838.getClass(), "alignmentY", 0.0F);
        setField(term79838, term79838.getClass(), "ui", null);
        setField(term79838, term79838.getClass(), "listenerList", null);
        setField(term79838, term79838.getClass(), "clientProperties", null);
        setField(term79838, term79838.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term79838, term79838.getClass(), "autoscrolls", false);
        setField(term79838, term79838.getClass(), "border", null);
        setIntField(term79838, term79838.getClass(), "flags", 0);
        setField(term79838, term79838.getClass(), "inputVerifier", null);
        setBooleanField(term79838, term79838.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term79838, term79838.getClass(), "paintingChild", null);
        setField(term79838, term79838.getClass(), "popupMenu", null);
        setField(term79838, term79838.getClass(), "revalidateRunnableScheduled", null);
        setField(term79838, term79838.getClass(), "focusInputMap", null);
        setField(term79838, term79838.getClass(), "ancestorInputMap", null);
        setField(term79838, term79838.getClass(), "windowInputMap", null);
        setField(term79838, term79838.getClass(), "actionMap", null);
        setField(term79838, term79838.getClass(), "aaHint", null);
        setField(term79838, term79838.getClass(), "lcdRenderingHint", null);
        setField(term79838, term79838.getClass(), "component", null);
        setField(term79838, term79838.getClass(), "layoutMgr", null);
        setField(term79838, term79838.getClass(), "dispatcher", null);
        setField(term79838, term79838.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term79838, term79838.getClass(), "focusCycleRoot", false);
        setBooleanField(term79838, term79838.getClass(), "focusTraversalPolicyProvider", false);
        setField(term79838, term79838.getClass(), "printingThreads", null);
        setBooleanField(term79838, term79838.getClass(), "printing", false);
        setField(term79838, term79838.getClass(), "containerListener", null);
        setIntField(term79838, term79838.getClass(), "listeningChildren", 0);
        setIntField(term79838, term79838.getClass(), "listeningBoundsChildren", 0);
        setIntField(term79838, term79838.getClass(), "descendantsCount", 0);
        setField(term79838, term79838.getClass(), "preserveBackgroundColor", null);
        setIntField(term79838, term79838.getClass(), "numOfHWComponents", 0);
        setIntField(term79838, term79838.getClass(), "numOfLWComponents", 0);
        setField(term79838, term79838.getClass(), "modalComp", null);
        setField(term79838, term79838.getClass(), "modalAppContext", null);
        setIntField(term79838, term79838.getClass(), "containerSerializedDataVersion", 0);
        setField(term79838, term79838.getClass(), "peer", null);
        setField(term79838, term79838.getClass(), "parent", null);
        setField(term79838, term79838.getClass(), "appContext", null);
        setIntField(term79838, term79838.getClass(), "x", 0);
        setIntField(term79838, term79838.getClass(), "y", 0);
        setIntField(term79838, term79838.getClass(), "width", 0);
        setIntField(term79838, term79838.getClass(), "height", 0);
        setField(term79838, term79838.getClass(), "foreground", null);
        setField(term79838, term79838.getClass(), "background", null);
        setField(term79838, term79838.getClass(), "font", null);
        setField(term79838, term79838.getClass(), "peerFont", null);
        setField(term79838, term79838.getClass(), "cursor", null);
        setField(term79838, term79838.getClass(), "locale", null);
        setField(term79838, term79838.getClass(), "graphicsConfig", null);
        setField(term79838, term79838.getClass(), "bufferStrategy", null);
        setBooleanField(term79838, term79838.getClass(), "ignoreRepaint", false);
        setBooleanField(term79838, term79838.getClass(), "visible", false);
        setBooleanField(term79838, term79838.getClass(), "enabled", false);
        setBooleanField(term79838, term79838.getClass(), "valid", false);
        setField(term79838, term79838.getClass(), "dropTarget", null);
        setField(term79838, term79838.getClass(), "popups", null);
        setField(term79838, term79838.getClass(), "name", null);
        setBooleanField(term79838, term79838.getClass(), "nameExplicitlySet", false);
        setBooleanField(term79838, term79838.getClass(), "focusable", false);
        setIntField(term79838, term79838.getClass(), "isFocusTraversableOverridden", 0);
        setField(term79838, term79838.getClass(), "focusTraversalKeys", null);
        setBooleanField(term79838, term79838.getClass(), "focusTraversalKeysEnabled", false);
        setField(term79838, term79838.getClass(), "acc", null);
        setField(term79838, term79838.getClass(), "minSize", null);
        setBooleanField(term79838, term79838.getClass(), "minSizeSet", false);
        setField(term79838, term79838.getClass(), "prefSize", null);
        setBooleanField(term79838, term79838.getClass(), "prefSizeSet", false);
        setField(term79838, term79838.getClass(), "maxSize", null);
        setBooleanField(term79838, term79838.getClass(), "maxSizeSet", false);
        setField(term79838, term79838.getClass(), "componentOrientation", null);
        setBooleanField(term79838, term79838.getClass(), "newEventsOnly", false);
        setField(term79838, term79838.getClass(), "componentListener", null);
        setField(term79838, term79838.getClass(), "focusListener", null);
        setField(term79838, term79838.getClass(), "hierarchyListener", null);
        setField(term79838, term79838.getClass(), "hierarchyBoundsListener", null);
        setField(term79838, term79838.getClass(), "keyListener", null);
        setField(term79838, term79838.getClass(), "mouseListener", null);
        setField(term79838, term79838.getClass(), "mouseMotionListener", null);
        setField(term79838, term79838.getClass(), "mouseWheelListener", null);
        setField(term79838, term79838.getClass(), "inputMethodListener", null);
        setLongField(term79838, term79838.getClass(), "eventMask", 0L);
        setField(term79838, term79838.getClass(), "changeSupport", null);
        setField(term79838, term79838.getClass(), "objectLock", null);
        setBooleanField(term79838, term79838.getClass(), "isPacked", false);
        setIntField(term79838, term79838.getClass(), "boundsOp", 0);
        setField(term79838, term79838.getClass(), "compoundShape", null);
        setField(term79838, term79838.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term79838, term79838.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term79838, term79838.getClass(), "backgroundEraseDisabled", false);
        setField(term79838, term79838.getClass(), "eventCache", null);
        setBooleanField(term79838, term79838.getClass(), "coalescingEnabled", false);
        setBooleanField(term79838, term79838.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term79838, term79838.getClass(), "componentSerializedDataVersion", 0);
        setField(term79838, term79838.getClass(), "accessibleContext", null);
        term79879 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.BattleInfoPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term79879;
        callMethod(klass, "getBestWeaponForDistance", argTypes, term79838, args);
    }

};


