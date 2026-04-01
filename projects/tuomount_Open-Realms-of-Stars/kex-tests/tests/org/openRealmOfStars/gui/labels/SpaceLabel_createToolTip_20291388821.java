package org.openRealmOfStars.gui.labels;

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
import static org.openRealmOfStars.gui.labels.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SpaceLabel_createToolTip_20291388821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;

    public SpaceLabel_createToolTip_20291388821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.SpaceLabel"));
        Object term48 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term49 = (Object[]) newArray("java.lang.Object", 0);
        Object term50 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term51 = newInstance(Class.forName("java.lang.Object"));
        Object term52 = newInstance(Class.forName("java.beans.VetoableChangeSupport"));
        Object term53 = newInstance(Class.forName("java.beans.VetoableChangeSupport$VetoableChangeListenerMap"));
        Object term54 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term23, term23.getClass(), "mnemonic", 568599855);
        setIntField(term23, term23.getClass(), "mnemonicIndex", 1162663216);
        setField(term23, term23.getClass(), "text", "sjlJAEtRrb");
        setField(term23, term23.getClass(), "defaultIcon", null);
        setField(term23, term23.getClass(), "disabledIcon", null);
        setBooleanField(term23, term23.getClass(), "disabledIconSet", false);
        setIntField(term23, term23.getClass(), "verticalAlignment", 1484323161);
        setIntField(term23, term23.getClass(), "horizontalAlignment", 391863371);
        setIntField(term23, term23.getClass(), "verticalTextPosition", -1922583790);
        setIntField(term23, term23.getClass(), "horizontalTextPosition", -616727354);
        setIntField(term23, term23.getClass(), "iconTextGap", -1955890973);
        setField(term23, term23.getClass(), "labelFor", null);
        setBooleanField(term23, term23.getClass(), "isAlignmentXSet", true);
        setFloatField(term23, term23.getClass(), "alignmentX", 0.13238746F);
        setBooleanField(term23, term23.getClass(), "isAlignmentYSet", false);
        setFloatField(term23, term23.getClass(), "alignmentY", 0.2707036F);
        setField(term23, term23.getClass(), "ui", null);
        setField(term48, term48.getClass(), "listenerList", term49);
        setField(term23, term23.getClass(), "listenerList", term48);
        setField(term50, term50.getClass(), "table", term51);
        setField(term23, term23.getClass(), "clientProperties", term50);
        setField(term53, term53.getClass(), "map", null);
        setField(term52, term52.getClass(), "map", term53);
        setField(term52, term52.getClass(), "source", term54);
        setField(term23, term23.getClass(), "vetoableChangeSupport", term52);
        setBooleanField(term23, term23.getClass(), "autoscrolls", true);
        setField(term23, term23.getClass(), "border", null);
        setIntField(term23, term23.getClass(), "flags", 590364439);
        setField(term23, term23.getClass(), "inputVerifier", null);
        setBooleanField(term23, term23.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term23, term23.getClass(), "paintingChild", null);
        setField(term23, term23.getClass(), "popupMenu", null);
        setField(term23, term23.getClass(), "revalidateRunnableScheduled", null);
        setField(term23, term23.getClass(), "focusInputMap", null);
        setField(term23, term23.getClass(), "ancestorInputMap", null);
        setField(term23, term23.getClass(), "windowInputMap", null);
        setField(term23, term23.getClass(), "actionMap", null);
        setField(term23, term23.getClass(), "aaHint", null);
        setField(term23, term23.getClass(), "lcdRenderingHint", null);
        setField(term23, term23.getClass(), "component", null);
        setField(term23, term23.getClass(), "layoutMgr", null);
        setField(term23, term23.getClass(), "dispatcher", null);
        setField(term23, term23.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term23, term23.getClass(), "focusCycleRoot", false);
        setBooleanField(term23, term23.getClass(), "focusTraversalPolicyProvider", false);
        setField(term23, term23.getClass(), "printingThreads", null);
        setBooleanField(term23, term23.getClass(), "printing", false);
        setField(term23, term23.getClass(), "containerListener", null);
        setIntField(term23, term23.getClass(), "listeningChildren", 0);
        setIntField(term23, term23.getClass(), "listeningBoundsChildren", 0);
        setIntField(term23, term23.getClass(), "descendantsCount", 0);
        setField(term23, term23.getClass(), "preserveBackgroundColor", null);
        setIntField(term23, term23.getClass(), "numOfHWComponents", 0);
        setIntField(term23, term23.getClass(), "numOfLWComponents", 0);
        setField(term23, term23.getClass(), "modalComp", null);
        setField(term23, term23.getClass(), "modalAppContext", null);
        setIntField(term23, term23.getClass(), "containerSerializedDataVersion", 0);
        setField(term23, term23.getClass(), "peer", null);
        setField(term23, term23.getClass(), "parent", null);
        setField(term23, term23.getClass(), "appContext", null);
        setIntField(term23, term23.getClass(), "x", 0);
        setIntField(term23, term23.getClass(), "y", 0);
        setIntField(term23, term23.getClass(), "width", 0);
        setIntField(term23, term23.getClass(), "height", 0);
        setField(term23, term23.getClass(), "foreground", null);
        setField(term23, term23.getClass(), "background", null);
        setField(term23, term23.getClass(), "font", null);
        setField(term23, term23.getClass(), "peerFont", null);
        setField(term23, term23.getClass(), "cursor", null);
        setField(term23, term23.getClass(), "locale", null);
        setField(term23, term23.getClass(), "graphicsConfig", null);
        setField(term23, term23.getClass(), "bufferStrategy", null);
        setBooleanField(term23, term23.getClass(), "ignoreRepaint", false);
        setBooleanField(term23, term23.getClass(), "visible", false);
        setBooleanField(term23, term23.getClass(), "enabled", false);
        setBooleanField(term23, term23.getClass(), "valid", false);
        setField(term23, term23.getClass(), "dropTarget", null);
        setField(term23, term23.getClass(), "popups", null);
        setField(term23, term23.getClass(), "name", null);
        setBooleanField(term23, term23.getClass(), "nameExplicitlySet", false);
        setBooleanField(term23, term23.getClass(), "focusable", false);
        setIntField(term23, term23.getClass(), "isFocusTraversableOverridden", 0);
        setField(term23, term23.getClass(), "focusTraversalKeys", null);
        setBooleanField(term23, term23.getClass(), "focusTraversalKeysEnabled", false);
        setField(term23, term23.getClass(), "acc", null);
        setField(term23, term23.getClass(), "minSize", null);
        setBooleanField(term23, term23.getClass(), "minSizeSet", false);
        setField(term23, term23.getClass(), "prefSize", null);
        setBooleanField(term23, term23.getClass(), "prefSizeSet", false);
        setField(term23, term23.getClass(), "maxSize", null);
        setBooleanField(term23, term23.getClass(), "maxSizeSet", false);
        setField(term23, term23.getClass(), "componentOrientation", null);
        setBooleanField(term23, term23.getClass(), "newEventsOnly", false);
        setField(term23, term23.getClass(), "componentListener", null);
        setField(term23, term23.getClass(), "focusListener", null);
        setField(term23, term23.getClass(), "hierarchyListener", null);
        setField(term23, term23.getClass(), "hierarchyBoundsListener", null);
        setField(term23, term23.getClass(), "keyListener", null);
        setField(term23, term23.getClass(), "mouseListener", null);
        setField(term23, term23.getClass(), "mouseMotionListener", null);
        setField(term23, term23.getClass(), "mouseWheelListener", null);
        setField(term23, term23.getClass(), "inputMethodListener", null);
        setLongField(term23, term23.getClass(), "eventMask", 0L);
        setField(term23, term23.getClass(), "changeSupport", null);
        setField(term23, term23.getClass(), "objectLock", null);
        setBooleanField(term23, term23.getClass(), "isPacked", false);
        setIntField(term23, term23.getClass(), "boundsOp", 0);
        setField(term23, term23.getClass(), "compoundShape", null);
        setField(term23, term23.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term23, term23.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term23, term23.getClass(), "backgroundEraseDisabled", false);
        setField(term23, term23.getClass(), "eventCache", null);
        setBooleanField(term23, term23.getClass(), "coalescingEnabled", false);
        setBooleanField(term23, term23.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term23, term23.getClass(), "componentSerializedDataVersion", 0);
        setField(term23, term23.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.SpaceLabel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term23, args);
    }

};


