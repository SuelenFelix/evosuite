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

public class SpaceLabel_convertHtml_21395490472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101;

    public SpaceLabel_convertHtml_21395490472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.SpaceLabel"));
        Object term126 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term127 = (Object[]) newArray("java.lang.Object", 0);
        Object term128 = newInstance(Class.forName("javax.swing.ArrayTable"));
        Object term129 = newInstance(Class.forName("java.lang.Object"));
        Object term130 = newInstance(Class.forName("java.beans.VetoableChangeSupport"));
        Object term131 = newInstance(Class.forName("java.beans.VetoableChangeSupport$VetoableChangeListenerMap"));
        Object term132 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term101, term101.getClass(), "mnemonic", -1275173084);
        setIntField(term101, term101.getClass(), "mnemonicIndex", -244121226);
        setField(term101, term101.getClass(), "text", "jJCZpVmanW");
        setField(term101, term101.getClass(), "defaultIcon", null);
        setField(term101, term101.getClass(), "disabledIcon", null);
        setBooleanField(term101, term101.getClass(), "disabledIconSet", false);
        setIntField(term101, term101.getClass(), "verticalAlignment", -203030934);
        setIntField(term101, term101.getClass(), "horizontalAlignment", -1179120542);
        setIntField(term101, term101.getClass(), "verticalTextPosition", -73683645);
        setIntField(term101, term101.getClass(), "horizontalTextPosition", -226514366);
        setIntField(term101, term101.getClass(), "iconTextGap", 1193880199);
        setField(term101, term101.getClass(), "labelFor", null);
        setBooleanField(term101, term101.getClass(), "isAlignmentXSet", true);
        setFloatField(term101, term101.getClass(), "alignmentX", 0.3455959F);
        setBooleanField(term101, term101.getClass(), "isAlignmentYSet", false);
        setFloatField(term101, term101.getClass(), "alignmentY", 0.09123778F);
        setField(term101, term101.getClass(), "ui", null);
        setField(term126, term126.getClass(), "listenerList", term127);
        setField(term101, term101.getClass(), "listenerList", term126);
        setField(term128, term128.getClass(), "table", term129);
        setField(term101, term101.getClass(), "clientProperties", term128);
        setField(term131, term131.getClass(), "map", null);
        setField(term130, term130.getClass(), "map", term131);
        setField(term130, term130.getClass(), "source", term132);
        setField(term101, term101.getClass(), "vetoableChangeSupport", term130);
        setBooleanField(term101, term101.getClass(), "autoscrolls", false);
        setField(term101, term101.getClass(), "border", null);
        setIntField(term101, term101.getClass(), "flags", -1530420153);
        setField(term101, term101.getClass(), "inputVerifier", null);
        setBooleanField(term101, term101.getClass(), "verifyInputWhenFocusTarget", true);
        setField(term101, term101.getClass(), "paintingChild", null);
        setField(term101, term101.getClass(), "popupMenu", null);
        setField(term101, term101.getClass(), "revalidateRunnableScheduled", null);
        setField(term101, term101.getClass(), "focusInputMap", null);
        setField(term101, term101.getClass(), "ancestorInputMap", null);
        setField(term101, term101.getClass(), "windowInputMap", null);
        setField(term101, term101.getClass(), "actionMap", null);
        setField(term101, term101.getClass(), "aaHint", null);
        setField(term101, term101.getClass(), "lcdRenderingHint", null);
        setField(term101, term101.getClass(), "component", null);
        setField(term101, term101.getClass(), "layoutMgr", null);
        setField(term101, term101.getClass(), "dispatcher", null);
        setField(term101, term101.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term101, term101.getClass(), "focusCycleRoot", false);
        setBooleanField(term101, term101.getClass(), "focusTraversalPolicyProvider", false);
        setField(term101, term101.getClass(), "printingThreads", null);
        setBooleanField(term101, term101.getClass(), "printing", false);
        setField(term101, term101.getClass(), "containerListener", null);
        setIntField(term101, term101.getClass(), "listeningChildren", 0);
        setIntField(term101, term101.getClass(), "listeningBoundsChildren", 0);
        setIntField(term101, term101.getClass(), "descendantsCount", 0);
        setField(term101, term101.getClass(), "preserveBackgroundColor", null);
        setIntField(term101, term101.getClass(), "numOfHWComponents", 0);
        setIntField(term101, term101.getClass(), "numOfLWComponents", 0);
        setField(term101, term101.getClass(), "modalComp", null);
        setField(term101, term101.getClass(), "modalAppContext", null);
        setIntField(term101, term101.getClass(), "containerSerializedDataVersion", 0);
        setField(term101, term101.getClass(), "peer", null);
        setField(term101, term101.getClass(), "parent", null);
        setField(term101, term101.getClass(), "appContext", null);
        setIntField(term101, term101.getClass(), "x", 0);
        setIntField(term101, term101.getClass(), "y", 0);
        setIntField(term101, term101.getClass(), "width", 0);
        setIntField(term101, term101.getClass(), "height", 0);
        setField(term101, term101.getClass(), "foreground", null);
        setField(term101, term101.getClass(), "background", null);
        setField(term101, term101.getClass(), "font", null);
        setField(term101, term101.getClass(), "peerFont", null);
        setField(term101, term101.getClass(), "cursor", null);
        setField(term101, term101.getClass(), "locale", null);
        setField(term101, term101.getClass(), "graphicsConfig", null);
        setField(term101, term101.getClass(), "bufferStrategy", null);
        setBooleanField(term101, term101.getClass(), "ignoreRepaint", false);
        setBooleanField(term101, term101.getClass(), "visible", false);
        setBooleanField(term101, term101.getClass(), "enabled", false);
        setBooleanField(term101, term101.getClass(), "valid", false);
        setField(term101, term101.getClass(), "dropTarget", null);
        setField(term101, term101.getClass(), "popups", null);
        setField(term101, term101.getClass(), "name", null);
        setBooleanField(term101, term101.getClass(), "nameExplicitlySet", false);
        setBooleanField(term101, term101.getClass(), "focusable", false);
        setIntField(term101, term101.getClass(), "isFocusTraversableOverridden", 0);
        setField(term101, term101.getClass(), "focusTraversalKeys", null);
        setBooleanField(term101, term101.getClass(), "focusTraversalKeysEnabled", false);
        setField(term101, term101.getClass(), "acc", null);
        setField(term101, term101.getClass(), "minSize", null);
        setBooleanField(term101, term101.getClass(), "minSizeSet", false);
        setField(term101, term101.getClass(), "prefSize", null);
        setBooleanField(term101, term101.getClass(), "prefSizeSet", false);
        setField(term101, term101.getClass(), "maxSize", null);
        setBooleanField(term101, term101.getClass(), "maxSizeSet", false);
        setField(term101, term101.getClass(), "componentOrientation", null);
        setBooleanField(term101, term101.getClass(), "newEventsOnly", false);
        setField(term101, term101.getClass(), "componentListener", null);
        setField(term101, term101.getClass(), "focusListener", null);
        setField(term101, term101.getClass(), "hierarchyListener", null);
        setField(term101, term101.getClass(), "hierarchyBoundsListener", null);
        setField(term101, term101.getClass(), "keyListener", null);
        setField(term101, term101.getClass(), "mouseListener", null);
        setField(term101, term101.getClass(), "mouseMotionListener", null);
        setField(term101, term101.getClass(), "mouseWheelListener", null);
        setField(term101, term101.getClass(), "inputMethodListener", null);
        setLongField(term101, term101.getClass(), "eventMask", 0L);
        setField(term101, term101.getClass(), "changeSupport", null);
        setField(term101, term101.getClass(), "objectLock", null);
        setBooleanField(term101, term101.getClass(), "isPacked", false);
        setIntField(term101, term101.getClass(), "boundsOp", 0);
        setField(term101, term101.getClass(), "compoundShape", null);
        setField(term101, term101.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term101, term101.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term101, term101.getClass(), "backgroundEraseDisabled", false);
        setField(term101, term101.getClass(), "eventCache", null);
        setBooleanField(term101, term101.getClass(), "coalescingEnabled", false);
        setBooleanField(term101, term101.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term101, term101.getClass(), "componentSerializedDataVersion", 0);
        setField(term101, term101.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.SpaceLabel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "convertHtml", argTypes, term101, args);
    }

};


