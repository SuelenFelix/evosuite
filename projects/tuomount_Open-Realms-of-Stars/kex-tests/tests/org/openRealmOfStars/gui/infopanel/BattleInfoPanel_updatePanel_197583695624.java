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

public class BattleInfoPanel_updatePanel_197583695624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80254;

    public BattleInfoPanel_updatePanel_197583695624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80254 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.BattleInfoPanel"));
        setField(term80254, term80254.getClass(), "imageLabel", null);
        setField(term80254, term80254.getClass(), "textArea", null);
        setField(term80254, term80254.getClass(), "ship", null);
        setField(term80254, term80254.getClass(), "useAllWeapons", null);
        setField(term80254, term80254.getClass(), "showRange", null);
        setField(term80254, term80254.getClass(), "cBtn", null);
        setField(term80254, term80254.getClass(), "border", null);
        setBooleanField(term80254, term80254.getClass(), "isAlignmentXSet", false);
        setFloatField(term80254, term80254.getClass(), "alignmentX", 0.0F);
        setBooleanField(term80254, term80254.getClass(), "isAlignmentYSet", false);
        setFloatField(term80254, term80254.getClass(), "alignmentY", 0.0F);
        setField(term80254, term80254.getClass(), "ui", null);
        setField(term80254, term80254.getClass(), "listenerList", null);
        setField(term80254, term80254.getClass(), "clientProperties", null);
        setField(term80254, term80254.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term80254, term80254.getClass(), "autoscrolls", false);
        setField(term80254, term80254.getClass(), "border", null);
        setIntField(term80254, term80254.getClass(), "flags", 0);
        setField(term80254, term80254.getClass(), "inputVerifier", null);
        setBooleanField(term80254, term80254.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term80254, term80254.getClass(), "paintingChild", null);
        setField(term80254, term80254.getClass(), "popupMenu", null);
        setField(term80254, term80254.getClass(), "revalidateRunnableScheduled", null);
        setField(term80254, term80254.getClass(), "focusInputMap", null);
        setField(term80254, term80254.getClass(), "ancestorInputMap", null);
        setField(term80254, term80254.getClass(), "windowInputMap", null);
        setField(term80254, term80254.getClass(), "actionMap", null);
        setField(term80254, term80254.getClass(), "aaHint", null);
        setField(term80254, term80254.getClass(), "lcdRenderingHint", null);
        setField(term80254, term80254.getClass(), "component", null);
        setField(term80254, term80254.getClass(), "layoutMgr", null);
        setField(term80254, term80254.getClass(), "dispatcher", null);
        setField(term80254, term80254.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term80254, term80254.getClass(), "focusCycleRoot", false);
        setBooleanField(term80254, term80254.getClass(), "focusTraversalPolicyProvider", false);
        setField(term80254, term80254.getClass(), "printingThreads", null);
        setBooleanField(term80254, term80254.getClass(), "printing", false);
        setField(term80254, term80254.getClass(), "containerListener", null);
        setIntField(term80254, term80254.getClass(), "listeningChildren", 0);
        setIntField(term80254, term80254.getClass(), "listeningBoundsChildren", 0);
        setIntField(term80254, term80254.getClass(), "descendantsCount", 0);
        setField(term80254, term80254.getClass(), "preserveBackgroundColor", null);
        setIntField(term80254, term80254.getClass(), "numOfHWComponents", 0);
        setIntField(term80254, term80254.getClass(), "numOfLWComponents", 0);
        setField(term80254, term80254.getClass(), "modalComp", null);
        setField(term80254, term80254.getClass(), "modalAppContext", null);
        setIntField(term80254, term80254.getClass(), "containerSerializedDataVersion", 0);
        setField(term80254, term80254.getClass(), "peer", null);
        setField(term80254, term80254.getClass(), "parent", null);
        setField(term80254, term80254.getClass(), "appContext", null);
        setIntField(term80254, term80254.getClass(), "x", 0);
        setIntField(term80254, term80254.getClass(), "y", 0);
        setIntField(term80254, term80254.getClass(), "width", 0);
        setIntField(term80254, term80254.getClass(), "height", 0);
        setField(term80254, term80254.getClass(), "foreground", null);
        setField(term80254, term80254.getClass(), "background", null);
        setField(term80254, term80254.getClass(), "font", null);
        setField(term80254, term80254.getClass(), "peerFont", null);
        setField(term80254, term80254.getClass(), "cursor", null);
        setField(term80254, term80254.getClass(), "locale", null);
        setField(term80254, term80254.getClass(), "graphicsConfig", null);
        setField(term80254, term80254.getClass(), "bufferStrategy", null);
        setBooleanField(term80254, term80254.getClass(), "ignoreRepaint", false);
        setBooleanField(term80254, term80254.getClass(), "visible", false);
        setBooleanField(term80254, term80254.getClass(), "enabled", false);
        setBooleanField(term80254, term80254.getClass(), "valid", false);
        setField(term80254, term80254.getClass(), "dropTarget", null);
        setField(term80254, term80254.getClass(), "popups", null);
        setField(term80254, term80254.getClass(), "name", null);
        setBooleanField(term80254, term80254.getClass(), "nameExplicitlySet", false);
        setBooleanField(term80254, term80254.getClass(), "focusable", false);
        setIntField(term80254, term80254.getClass(), "isFocusTraversableOverridden", 0);
        setField(term80254, term80254.getClass(), "focusTraversalKeys", null);
        setBooleanField(term80254, term80254.getClass(), "focusTraversalKeysEnabled", false);
        setField(term80254, term80254.getClass(), "acc", null);
        setField(term80254, term80254.getClass(), "minSize", null);
        setBooleanField(term80254, term80254.getClass(), "minSizeSet", false);
        setField(term80254, term80254.getClass(), "prefSize", null);
        setBooleanField(term80254, term80254.getClass(), "prefSizeSet", false);
        setField(term80254, term80254.getClass(), "maxSize", null);
        setBooleanField(term80254, term80254.getClass(), "maxSizeSet", false);
        setField(term80254, term80254.getClass(), "componentOrientation", null);
        setBooleanField(term80254, term80254.getClass(), "newEventsOnly", false);
        setField(term80254, term80254.getClass(), "componentListener", null);
        setField(term80254, term80254.getClass(), "focusListener", null);
        setField(term80254, term80254.getClass(), "hierarchyListener", null);
        setField(term80254, term80254.getClass(), "hierarchyBoundsListener", null);
        setField(term80254, term80254.getClass(), "keyListener", null);
        setField(term80254, term80254.getClass(), "mouseListener", null);
        setField(term80254, term80254.getClass(), "mouseMotionListener", null);
        setField(term80254, term80254.getClass(), "mouseWheelListener", null);
        setField(term80254, term80254.getClass(), "inputMethodListener", null);
        setLongField(term80254, term80254.getClass(), "eventMask", 0L);
        setField(term80254, term80254.getClass(), "changeSupport", null);
        setField(term80254, term80254.getClass(), "objectLock", null);
        setBooleanField(term80254, term80254.getClass(), "isPacked", false);
        setIntField(term80254, term80254.getClass(), "boundsOp", 0);
        setField(term80254, term80254.getClass(), "compoundShape", null);
        setField(term80254, term80254.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term80254, term80254.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term80254, term80254.getClass(), "backgroundEraseDisabled", false);
        setField(term80254, term80254.getClass(), "eventCache", null);
        setBooleanField(term80254, term80254.getClass(), "coalescingEnabled", false);
        setBooleanField(term80254, term80254.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term80254, term80254.getClass(), "componentSerializedDataVersion", 0);
        setField(term80254, term80254.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.BattleInfoPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updatePanel", argTypes, term80254, args);
    }

};


