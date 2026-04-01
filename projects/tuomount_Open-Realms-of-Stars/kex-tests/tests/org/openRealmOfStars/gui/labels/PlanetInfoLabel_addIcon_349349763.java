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

public class PlanetInfoLabel_addIcon_349349763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18295;

    public PlanetInfoLabel_addIcon_349349763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18295 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.PlanetInfoLabel"));
        setField(term18295, term18295.getClass(), "planet", null);
        setField(term18295, term18295.getClass(), "constructionSelect", null);
        setField(term18295, term18295.getClass(), "buildingEstimate", null);
        setField(term18295, term18295.getClass(), "border", null);
        setBooleanField(term18295, term18295.getClass(), "isAlignmentXSet", false);
        setFloatField(term18295, term18295.getClass(), "alignmentX", 0.0F);
        setBooleanField(term18295, term18295.getClass(), "isAlignmentYSet", false);
        setFloatField(term18295, term18295.getClass(), "alignmentY", 0.0F);
        setField(term18295, term18295.getClass(), "ui", null);
        setField(term18295, term18295.getClass(), "listenerList", null);
        setField(term18295, term18295.getClass(), "clientProperties", null);
        setField(term18295, term18295.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term18295, term18295.getClass(), "autoscrolls", false);
        setField(term18295, term18295.getClass(), "border", null);
        setIntField(term18295, term18295.getClass(), "flags", 0);
        setField(term18295, term18295.getClass(), "inputVerifier", null);
        setBooleanField(term18295, term18295.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term18295, term18295.getClass(), "paintingChild", null);
        setField(term18295, term18295.getClass(), "popupMenu", null);
        setField(term18295, term18295.getClass(), "revalidateRunnableScheduled", null);
        setField(term18295, term18295.getClass(), "focusInputMap", null);
        setField(term18295, term18295.getClass(), "ancestorInputMap", null);
        setField(term18295, term18295.getClass(), "windowInputMap", null);
        setField(term18295, term18295.getClass(), "actionMap", null);
        setField(term18295, term18295.getClass(), "aaHint", null);
        setField(term18295, term18295.getClass(), "lcdRenderingHint", null);
        setField(term18295, term18295.getClass(), "component", null);
        setField(term18295, term18295.getClass(), "layoutMgr", null);
        setField(term18295, term18295.getClass(), "dispatcher", null);
        setField(term18295, term18295.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term18295, term18295.getClass(), "focusCycleRoot", false);
        setBooleanField(term18295, term18295.getClass(), "focusTraversalPolicyProvider", false);
        setField(term18295, term18295.getClass(), "printingThreads", null);
        setBooleanField(term18295, term18295.getClass(), "printing", false);
        setField(term18295, term18295.getClass(), "containerListener", null);
        setIntField(term18295, term18295.getClass(), "listeningChildren", 0);
        setIntField(term18295, term18295.getClass(), "listeningBoundsChildren", 0);
        setIntField(term18295, term18295.getClass(), "descendantsCount", 0);
        setField(term18295, term18295.getClass(), "preserveBackgroundColor", null);
        setIntField(term18295, term18295.getClass(), "numOfHWComponents", 0);
        setIntField(term18295, term18295.getClass(), "numOfLWComponents", 0);
        setField(term18295, term18295.getClass(), "modalComp", null);
        setField(term18295, term18295.getClass(), "modalAppContext", null);
        setIntField(term18295, term18295.getClass(), "containerSerializedDataVersion", 0);
        setField(term18295, term18295.getClass(), "peer", null);
        setField(term18295, term18295.getClass(), "parent", null);
        setField(term18295, term18295.getClass(), "appContext", null);
        setIntField(term18295, term18295.getClass(), "x", 0);
        setIntField(term18295, term18295.getClass(), "y", 0);
        setIntField(term18295, term18295.getClass(), "width", 0);
        setIntField(term18295, term18295.getClass(), "height", 0);
        setField(term18295, term18295.getClass(), "foreground", null);
        setField(term18295, term18295.getClass(), "background", null);
        setField(term18295, term18295.getClass(), "font", null);
        setField(term18295, term18295.getClass(), "peerFont", null);
        setField(term18295, term18295.getClass(), "cursor", null);
        setField(term18295, term18295.getClass(), "locale", null);
        setField(term18295, term18295.getClass(), "graphicsConfig", null);
        setField(term18295, term18295.getClass(), "bufferStrategy", null);
        setBooleanField(term18295, term18295.getClass(), "ignoreRepaint", false);
        setBooleanField(term18295, term18295.getClass(), "visible", false);
        setBooleanField(term18295, term18295.getClass(), "enabled", false);
        setBooleanField(term18295, term18295.getClass(), "valid", false);
        setField(term18295, term18295.getClass(), "dropTarget", null);
        setField(term18295, term18295.getClass(), "popups", null);
        setField(term18295, term18295.getClass(), "name", null);
        setBooleanField(term18295, term18295.getClass(), "nameExplicitlySet", false);
        setBooleanField(term18295, term18295.getClass(), "focusable", false);
        setIntField(term18295, term18295.getClass(), "isFocusTraversableOverridden", 0);
        setField(term18295, term18295.getClass(), "focusTraversalKeys", null);
        setBooleanField(term18295, term18295.getClass(), "focusTraversalKeysEnabled", false);
        setField(term18295, term18295.getClass(), "acc", null);
        setField(term18295, term18295.getClass(), "minSize", null);
        setBooleanField(term18295, term18295.getClass(), "minSizeSet", false);
        setField(term18295, term18295.getClass(), "prefSize", null);
        setBooleanField(term18295, term18295.getClass(), "prefSizeSet", false);
        setField(term18295, term18295.getClass(), "maxSize", null);
        setBooleanField(term18295, term18295.getClass(), "maxSizeSet", false);
        setField(term18295, term18295.getClass(), "componentOrientation", null);
        setBooleanField(term18295, term18295.getClass(), "newEventsOnly", false);
        setField(term18295, term18295.getClass(), "componentListener", null);
        setField(term18295, term18295.getClass(), "focusListener", null);
        setField(term18295, term18295.getClass(), "hierarchyListener", null);
        setField(term18295, term18295.getClass(), "hierarchyBoundsListener", null);
        setField(term18295, term18295.getClass(), "keyListener", null);
        setField(term18295, term18295.getClass(), "mouseListener", null);
        setField(term18295, term18295.getClass(), "mouseMotionListener", null);
        setField(term18295, term18295.getClass(), "mouseWheelListener", null);
        setField(term18295, term18295.getClass(), "inputMethodListener", null);
        setLongField(term18295, term18295.getClass(), "eventMask", 0L);
        setField(term18295, term18295.getClass(), "changeSupport", null);
        setField(term18295, term18295.getClass(), "objectLock", null);
        setBooleanField(term18295, term18295.getClass(), "isPacked", false);
        setIntField(term18295, term18295.getClass(), "boundsOp", 0);
        setField(term18295, term18295.getClass(), "compoundShape", null);
        setField(term18295, term18295.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term18295, term18295.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term18295, term18295.getClass(), "backgroundEraseDisabled", false);
        setField(term18295, term18295.getClass(), "eventCache", null);
        setBooleanField(term18295, term18295.getClass(), "coalescingEnabled", false);
        setBooleanField(term18295, term18295.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term18295, term18295.getClass(), "componentSerializedDataVersion", 0);
        setField(term18295, term18295.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.PlanetInfoLabel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.gui.labels.IconLabel");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addIcon", argTypes, term18295, args);
    }

};


