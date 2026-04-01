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

public class BattleInfoPanel_disableAllWeapons_197973494323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80213;

    public BattleInfoPanel_disableAllWeapons_197973494323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80213 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.BattleInfoPanel"));
        setField(term80213, term80213.getClass(), "imageLabel", null);
        setField(term80213, term80213.getClass(), "textArea", null);
        setField(term80213, term80213.getClass(), "ship", null);
        setField(term80213, term80213.getClass(), "useAllWeapons", null);
        setField(term80213, term80213.getClass(), "showRange", null);
        setField(term80213, term80213.getClass(), "cBtn", null);
        setField(term80213, term80213.getClass(), "border", null);
        setBooleanField(term80213, term80213.getClass(), "isAlignmentXSet", false);
        setFloatField(term80213, term80213.getClass(), "alignmentX", 0.0F);
        setBooleanField(term80213, term80213.getClass(), "isAlignmentYSet", false);
        setFloatField(term80213, term80213.getClass(), "alignmentY", 0.0F);
        setField(term80213, term80213.getClass(), "ui", null);
        setField(term80213, term80213.getClass(), "listenerList", null);
        setField(term80213, term80213.getClass(), "clientProperties", null);
        setField(term80213, term80213.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term80213, term80213.getClass(), "autoscrolls", false);
        setField(term80213, term80213.getClass(), "border", null);
        setIntField(term80213, term80213.getClass(), "flags", 0);
        setField(term80213, term80213.getClass(), "inputVerifier", null);
        setBooleanField(term80213, term80213.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term80213, term80213.getClass(), "paintingChild", null);
        setField(term80213, term80213.getClass(), "popupMenu", null);
        setField(term80213, term80213.getClass(), "revalidateRunnableScheduled", null);
        setField(term80213, term80213.getClass(), "focusInputMap", null);
        setField(term80213, term80213.getClass(), "ancestorInputMap", null);
        setField(term80213, term80213.getClass(), "windowInputMap", null);
        setField(term80213, term80213.getClass(), "actionMap", null);
        setField(term80213, term80213.getClass(), "aaHint", null);
        setField(term80213, term80213.getClass(), "lcdRenderingHint", null);
        setField(term80213, term80213.getClass(), "component", null);
        setField(term80213, term80213.getClass(), "layoutMgr", null);
        setField(term80213, term80213.getClass(), "dispatcher", null);
        setField(term80213, term80213.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term80213, term80213.getClass(), "focusCycleRoot", false);
        setBooleanField(term80213, term80213.getClass(), "focusTraversalPolicyProvider", false);
        setField(term80213, term80213.getClass(), "printingThreads", null);
        setBooleanField(term80213, term80213.getClass(), "printing", false);
        setField(term80213, term80213.getClass(), "containerListener", null);
        setIntField(term80213, term80213.getClass(), "listeningChildren", 0);
        setIntField(term80213, term80213.getClass(), "listeningBoundsChildren", 0);
        setIntField(term80213, term80213.getClass(), "descendantsCount", 0);
        setField(term80213, term80213.getClass(), "preserveBackgroundColor", null);
        setIntField(term80213, term80213.getClass(), "numOfHWComponents", 0);
        setIntField(term80213, term80213.getClass(), "numOfLWComponents", 0);
        setField(term80213, term80213.getClass(), "modalComp", null);
        setField(term80213, term80213.getClass(), "modalAppContext", null);
        setIntField(term80213, term80213.getClass(), "containerSerializedDataVersion", 0);
        setField(term80213, term80213.getClass(), "peer", null);
        setField(term80213, term80213.getClass(), "parent", null);
        setField(term80213, term80213.getClass(), "appContext", null);
        setIntField(term80213, term80213.getClass(), "x", 0);
        setIntField(term80213, term80213.getClass(), "y", 0);
        setIntField(term80213, term80213.getClass(), "width", 0);
        setIntField(term80213, term80213.getClass(), "height", 0);
        setField(term80213, term80213.getClass(), "foreground", null);
        setField(term80213, term80213.getClass(), "background", null);
        setField(term80213, term80213.getClass(), "font", null);
        setField(term80213, term80213.getClass(), "peerFont", null);
        setField(term80213, term80213.getClass(), "cursor", null);
        setField(term80213, term80213.getClass(), "locale", null);
        setField(term80213, term80213.getClass(), "graphicsConfig", null);
        setField(term80213, term80213.getClass(), "bufferStrategy", null);
        setBooleanField(term80213, term80213.getClass(), "ignoreRepaint", false);
        setBooleanField(term80213, term80213.getClass(), "visible", false);
        setBooleanField(term80213, term80213.getClass(), "enabled", false);
        setBooleanField(term80213, term80213.getClass(), "valid", false);
        setField(term80213, term80213.getClass(), "dropTarget", null);
        setField(term80213, term80213.getClass(), "popups", null);
        setField(term80213, term80213.getClass(), "name", null);
        setBooleanField(term80213, term80213.getClass(), "nameExplicitlySet", false);
        setBooleanField(term80213, term80213.getClass(), "focusable", false);
        setIntField(term80213, term80213.getClass(), "isFocusTraversableOverridden", 0);
        setField(term80213, term80213.getClass(), "focusTraversalKeys", null);
        setBooleanField(term80213, term80213.getClass(), "focusTraversalKeysEnabled", false);
        setField(term80213, term80213.getClass(), "acc", null);
        setField(term80213, term80213.getClass(), "minSize", null);
        setBooleanField(term80213, term80213.getClass(), "minSizeSet", false);
        setField(term80213, term80213.getClass(), "prefSize", null);
        setBooleanField(term80213, term80213.getClass(), "prefSizeSet", false);
        setField(term80213, term80213.getClass(), "maxSize", null);
        setBooleanField(term80213, term80213.getClass(), "maxSizeSet", false);
        setField(term80213, term80213.getClass(), "componentOrientation", null);
        setBooleanField(term80213, term80213.getClass(), "newEventsOnly", false);
        setField(term80213, term80213.getClass(), "componentListener", null);
        setField(term80213, term80213.getClass(), "focusListener", null);
        setField(term80213, term80213.getClass(), "hierarchyListener", null);
        setField(term80213, term80213.getClass(), "hierarchyBoundsListener", null);
        setField(term80213, term80213.getClass(), "keyListener", null);
        setField(term80213, term80213.getClass(), "mouseListener", null);
        setField(term80213, term80213.getClass(), "mouseMotionListener", null);
        setField(term80213, term80213.getClass(), "mouseWheelListener", null);
        setField(term80213, term80213.getClass(), "inputMethodListener", null);
        setLongField(term80213, term80213.getClass(), "eventMask", 0L);
        setField(term80213, term80213.getClass(), "changeSupport", null);
        setField(term80213, term80213.getClass(), "objectLock", null);
        setBooleanField(term80213, term80213.getClass(), "isPacked", false);
        setIntField(term80213, term80213.getClass(), "boundsOp", 0);
        setField(term80213, term80213.getClass(), "compoundShape", null);
        setField(term80213, term80213.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term80213, term80213.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term80213, term80213.getClass(), "backgroundEraseDisabled", false);
        setField(term80213, term80213.getClass(), "eventCache", null);
        setBooleanField(term80213, term80213.getClass(), "coalescingEnabled", false);
        setBooleanField(term80213, term80213.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term80213, term80213.getClass(), "componentSerializedDataVersion", 0);
        setField(term80213, term80213.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.BattleInfoPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "disableAllWeapons", argTypes, term80213, args);
    }

};


