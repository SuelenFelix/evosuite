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

public class BattleInfoPanel_resetComponentUses_92005170719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80049;

    public BattleInfoPanel_resetComponentUses_92005170719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80049 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.BattleInfoPanel"));
        setField(term80049, term80049.getClass(), "imageLabel", null);
        setField(term80049, term80049.getClass(), "textArea", null);
        setField(term80049, term80049.getClass(), "ship", null);
        setField(term80049, term80049.getClass(), "useAllWeapons", null);
        setField(term80049, term80049.getClass(), "showRange", null);
        setField(term80049, term80049.getClass(), "cBtn", null);
        setField(term80049, term80049.getClass(), "border", null);
        setBooleanField(term80049, term80049.getClass(), "isAlignmentXSet", false);
        setFloatField(term80049, term80049.getClass(), "alignmentX", 0.0F);
        setBooleanField(term80049, term80049.getClass(), "isAlignmentYSet", false);
        setFloatField(term80049, term80049.getClass(), "alignmentY", 0.0F);
        setField(term80049, term80049.getClass(), "ui", null);
        setField(term80049, term80049.getClass(), "listenerList", null);
        setField(term80049, term80049.getClass(), "clientProperties", null);
        setField(term80049, term80049.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term80049, term80049.getClass(), "autoscrolls", false);
        setField(term80049, term80049.getClass(), "border", null);
        setIntField(term80049, term80049.getClass(), "flags", 0);
        setField(term80049, term80049.getClass(), "inputVerifier", null);
        setBooleanField(term80049, term80049.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term80049, term80049.getClass(), "paintingChild", null);
        setField(term80049, term80049.getClass(), "popupMenu", null);
        setField(term80049, term80049.getClass(), "revalidateRunnableScheduled", null);
        setField(term80049, term80049.getClass(), "focusInputMap", null);
        setField(term80049, term80049.getClass(), "ancestorInputMap", null);
        setField(term80049, term80049.getClass(), "windowInputMap", null);
        setField(term80049, term80049.getClass(), "actionMap", null);
        setField(term80049, term80049.getClass(), "aaHint", null);
        setField(term80049, term80049.getClass(), "lcdRenderingHint", null);
        setField(term80049, term80049.getClass(), "component", null);
        setField(term80049, term80049.getClass(), "layoutMgr", null);
        setField(term80049, term80049.getClass(), "dispatcher", null);
        setField(term80049, term80049.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term80049, term80049.getClass(), "focusCycleRoot", false);
        setBooleanField(term80049, term80049.getClass(), "focusTraversalPolicyProvider", false);
        setField(term80049, term80049.getClass(), "printingThreads", null);
        setBooleanField(term80049, term80049.getClass(), "printing", false);
        setField(term80049, term80049.getClass(), "containerListener", null);
        setIntField(term80049, term80049.getClass(), "listeningChildren", 0);
        setIntField(term80049, term80049.getClass(), "listeningBoundsChildren", 0);
        setIntField(term80049, term80049.getClass(), "descendantsCount", 0);
        setField(term80049, term80049.getClass(), "preserveBackgroundColor", null);
        setIntField(term80049, term80049.getClass(), "numOfHWComponents", 0);
        setIntField(term80049, term80049.getClass(), "numOfLWComponents", 0);
        setField(term80049, term80049.getClass(), "modalComp", null);
        setField(term80049, term80049.getClass(), "modalAppContext", null);
        setIntField(term80049, term80049.getClass(), "containerSerializedDataVersion", 0);
        setField(term80049, term80049.getClass(), "peer", null);
        setField(term80049, term80049.getClass(), "parent", null);
        setField(term80049, term80049.getClass(), "appContext", null);
        setIntField(term80049, term80049.getClass(), "x", 0);
        setIntField(term80049, term80049.getClass(), "y", 0);
        setIntField(term80049, term80049.getClass(), "width", 0);
        setIntField(term80049, term80049.getClass(), "height", 0);
        setField(term80049, term80049.getClass(), "foreground", null);
        setField(term80049, term80049.getClass(), "background", null);
        setField(term80049, term80049.getClass(), "font", null);
        setField(term80049, term80049.getClass(), "peerFont", null);
        setField(term80049, term80049.getClass(), "cursor", null);
        setField(term80049, term80049.getClass(), "locale", null);
        setField(term80049, term80049.getClass(), "graphicsConfig", null);
        setField(term80049, term80049.getClass(), "bufferStrategy", null);
        setBooleanField(term80049, term80049.getClass(), "ignoreRepaint", false);
        setBooleanField(term80049, term80049.getClass(), "visible", false);
        setBooleanField(term80049, term80049.getClass(), "enabled", false);
        setBooleanField(term80049, term80049.getClass(), "valid", false);
        setField(term80049, term80049.getClass(), "dropTarget", null);
        setField(term80049, term80049.getClass(), "popups", null);
        setField(term80049, term80049.getClass(), "name", null);
        setBooleanField(term80049, term80049.getClass(), "nameExplicitlySet", false);
        setBooleanField(term80049, term80049.getClass(), "focusable", false);
        setIntField(term80049, term80049.getClass(), "isFocusTraversableOverridden", 0);
        setField(term80049, term80049.getClass(), "focusTraversalKeys", null);
        setBooleanField(term80049, term80049.getClass(), "focusTraversalKeysEnabled", false);
        setField(term80049, term80049.getClass(), "acc", null);
        setField(term80049, term80049.getClass(), "minSize", null);
        setBooleanField(term80049, term80049.getClass(), "minSizeSet", false);
        setField(term80049, term80049.getClass(), "prefSize", null);
        setBooleanField(term80049, term80049.getClass(), "prefSizeSet", false);
        setField(term80049, term80049.getClass(), "maxSize", null);
        setBooleanField(term80049, term80049.getClass(), "maxSizeSet", false);
        setField(term80049, term80049.getClass(), "componentOrientation", null);
        setBooleanField(term80049, term80049.getClass(), "newEventsOnly", false);
        setField(term80049, term80049.getClass(), "componentListener", null);
        setField(term80049, term80049.getClass(), "focusListener", null);
        setField(term80049, term80049.getClass(), "hierarchyListener", null);
        setField(term80049, term80049.getClass(), "hierarchyBoundsListener", null);
        setField(term80049, term80049.getClass(), "keyListener", null);
        setField(term80049, term80049.getClass(), "mouseListener", null);
        setField(term80049, term80049.getClass(), "mouseMotionListener", null);
        setField(term80049, term80049.getClass(), "mouseWheelListener", null);
        setField(term80049, term80049.getClass(), "inputMethodListener", null);
        setLongField(term80049, term80049.getClass(), "eventMask", 0L);
        setField(term80049, term80049.getClass(), "changeSupport", null);
        setField(term80049, term80049.getClass(), "objectLock", null);
        setBooleanField(term80049, term80049.getClass(), "isPacked", false);
        setIntField(term80049, term80049.getClass(), "boundsOp", 0);
        setField(term80049, term80049.getClass(), "compoundShape", null);
        setField(term80049, term80049.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term80049, term80049.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term80049, term80049.getClass(), "backgroundEraseDisabled", false);
        setField(term80049, term80049.getClass(), "eventCache", null);
        setBooleanField(term80049, term80049.getClass(), "coalescingEnabled", false);
        setBooleanField(term80049, term80049.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term80049, term80049.getClass(), "componentSerializedDataVersion", 0);
        setField(term80049, term80049.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.BattleInfoPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "resetComponentUses", argTypes, term80049, args);
    }

};


