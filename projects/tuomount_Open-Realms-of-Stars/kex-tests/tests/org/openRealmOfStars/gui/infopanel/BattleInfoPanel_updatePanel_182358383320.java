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

public class BattleInfoPanel_updatePanel_182358383320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80090;

    public BattleInfoPanel_updatePanel_182358383320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80090 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.BattleInfoPanel"));
        setField(term80090, term80090.getClass(), "imageLabel", null);
        setField(term80090, term80090.getClass(), "textArea", null);
        setField(term80090, term80090.getClass(), "ship", null);
        setField(term80090, term80090.getClass(), "useAllWeapons", null);
        setField(term80090, term80090.getClass(), "showRange", null);
        setField(term80090, term80090.getClass(), "cBtn", null);
        setField(term80090, term80090.getClass(), "border", null);
        setBooleanField(term80090, term80090.getClass(), "isAlignmentXSet", false);
        setFloatField(term80090, term80090.getClass(), "alignmentX", 0.0F);
        setBooleanField(term80090, term80090.getClass(), "isAlignmentYSet", false);
        setFloatField(term80090, term80090.getClass(), "alignmentY", 0.0F);
        setField(term80090, term80090.getClass(), "ui", null);
        setField(term80090, term80090.getClass(), "listenerList", null);
        setField(term80090, term80090.getClass(), "clientProperties", null);
        setField(term80090, term80090.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term80090, term80090.getClass(), "autoscrolls", false);
        setField(term80090, term80090.getClass(), "border", null);
        setIntField(term80090, term80090.getClass(), "flags", 0);
        setField(term80090, term80090.getClass(), "inputVerifier", null);
        setBooleanField(term80090, term80090.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term80090, term80090.getClass(), "paintingChild", null);
        setField(term80090, term80090.getClass(), "popupMenu", null);
        setField(term80090, term80090.getClass(), "revalidateRunnableScheduled", null);
        setField(term80090, term80090.getClass(), "focusInputMap", null);
        setField(term80090, term80090.getClass(), "ancestorInputMap", null);
        setField(term80090, term80090.getClass(), "windowInputMap", null);
        setField(term80090, term80090.getClass(), "actionMap", null);
        setField(term80090, term80090.getClass(), "aaHint", null);
        setField(term80090, term80090.getClass(), "lcdRenderingHint", null);
        setField(term80090, term80090.getClass(), "component", null);
        setField(term80090, term80090.getClass(), "layoutMgr", null);
        setField(term80090, term80090.getClass(), "dispatcher", null);
        setField(term80090, term80090.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term80090, term80090.getClass(), "focusCycleRoot", false);
        setBooleanField(term80090, term80090.getClass(), "focusTraversalPolicyProvider", false);
        setField(term80090, term80090.getClass(), "printingThreads", null);
        setBooleanField(term80090, term80090.getClass(), "printing", false);
        setField(term80090, term80090.getClass(), "containerListener", null);
        setIntField(term80090, term80090.getClass(), "listeningChildren", 0);
        setIntField(term80090, term80090.getClass(), "listeningBoundsChildren", 0);
        setIntField(term80090, term80090.getClass(), "descendantsCount", 0);
        setField(term80090, term80090.getClass(), "preserveBackgroundColor", null);
        setIntField(term80090, term80090.getClass(), "numOfHWComponents", 0);
        setIntField(term80090, term80090.getClass(), "numOfLWComponents", 0);
        setField(term80090, term80090.getClass(), "modalComp", null);
        setField(term80090, term80090.getClass(), "modalAppContext", null);
        setIntField(term80090, term80090.getClass(), "containerSerializedDataVersion", 0);
        setField(term80090, term80090.getClass(), "peer", null);
        setField(term80090, term80090.getClass(), "parent", null);
        setField(term80090, term80090.getClass(), "appContext", null);
        setIntField(term80090, term80090.getClass(), "x", 0);
        setIntField(term80090, term80090.getClass(), "y", 0);
        setIntField(term80090, term80090.getClass(), "width", 0);
        setIntField(term80090, term80090.getClass(), "height", 0);
        setField(term80090, term80090.getClass(), "foreground", null);
        setField(term80090, term80090.getClass(), "background", null);
        setField(term80090, term80090.getClass(), "font", null);
        setField(term80090, term80090.getClass(), "peerFont", null);
        setField(term80090, term80090.getClass(), "cursor", null);
        setField(term80090, term80090.getClass(), "locale", null);
        setField(term80090, term80090.getClass(), "graphicsConfig", null);
        setField(term80090, term80090.getClass(), "bufferStrategy", null);
        setBooleanField(term80090, term80090.getClass(), "ignoreRepaint", false);
        setBooleanField(term80090, term80090.getClass(), "visible", false);
        setBooleanField(term80090, term80090.getClass(), "enabled", false);
        setBooleanField(term80090, term80090.getClass(), "valid", false);
        setField(term80090, term80090.getClass(), "dropTarget", null);
        setField(term80090, term80090.getClass(), "popups", null);
        setField(term80090, term80090.getClass(), "name", null);
        setBooleanField(term80090, term80090.getClass(), "nameExplicitlySet", false);
        setBooleanField(term80090, term80090.getClass(), "focusable", false);
        setIntField(term80090, term80090.getClass(), "isFocusTraversableOverridden", 0);
        setField(term80090, term80090.getClass(), "focusTraversalKeys", null);
        setBooleanField(term80090, term80090.getClass(), "focusTraversalKeysEnabled", false);
        setField(term80090, term80090.getClass(), "acc", null);
        setField(term80090, term80090.getClass(), "minSize", null);
        setBooleanField(term80090, term80090.getClass(), "minSizeSet", false);
        setField(term80090, term80090.getClass(), "prefSize", null);
        setBooleanField(term80090, term80090.getClass(), "prefSizeSet", false);
        setField(term80090, term80090.getClass(), "maxSize", null);
        setBooleanField(term80090, term80090.getClass(), "maxSizeSet", false);
        setField(term80090, term80090.getClass(), "componentOrientation", null);
        setBooleanField(term80090, term80090.getClass(), "newEventsOnly", false);
        setField(term80090, term80090.getClass(), "componentListener", null);
        setField(term80090, term80090.getClass(), "focusListener", null);
        setField(term80090, term80090.getClass(), "hierarchyListener", null);
        setField(term80090, term80090.getClass(), "hierarchyBoundsListener", null);
        setField(term80090, term80090.getClass(), "keyListener", null);
        setField(term80090, term80090.getClass(), "mouseListener", null);
        setField(term80090, term80090.getClass(), "mouseMotionListener", null);
        setField(term80090, term80090.getClass(), "mouseWheelListener", null);
        setField(term80090, term80090.getClass(), "inputMethodListener", null);
        setLongField(term80090, term80090.getClass(), "eventMask", 0L);
        setField(term80090, term80090.getClass(), "changeSupport", null);
        setField(term80090, term80090.getClass(), "objectLock", null);
        setBooleanField(term80090, term80090.getClass(), "isPacked", false);
        setIntField(term80090, term80090.getClass(), "boundsOp", 0);
        setField(term80090, term80090.getClass(), "compoundShape", null);
        setField(term80090, term80090.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term80090, term80090.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term80090, term80090.getClass(), "backgroundEraseDisabled", false);
        setField(term80090, term80090.getClass(), "eventCache", null);
        setBooleanField(term80090, term80090.getClass(), "coalescingEnabled", false);
        setBooleanField(term80090, term80090.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term80090, term80090.getClass(), "componentSerializedDataVersion", 0);
        setField(term80090, term80090.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.BattleInfoPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "updatePanel", argTypes, term80090, args);
    }

};


