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

public class MapInfoPanel_disableFixTradeBtn_102639489426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43522;

    public MapInfoPanel_disableFixTradeBtn_102639489426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43522 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.MapInfoPanel"));
        setField(term43522, term43522.getClass(), "imageLabel", null);
        setField(term43522, term43522.getClass(), "textArea", null);
        setField(term43522, term43522.getClass(), "planet", null);
        setBooleanField(term43522, term43522.getClass(), "activeScanned", false);
        setField(term43522, term43522.getClass(), "fleet", null);
        setField(term43522, term43522.getClass(), "tile", null);
        setField(term43522, term43522.getClass(), "fleetOwner", null);
        setField(term43522, term43522.getClass(), "viewBtn", null);
        setField(term43522, term43522.getClass(), "defendBtn", null);
        setField(term43522, term43522.getClass(), "fixTradeFleetBtn", null);
        setField(term43522, term43522.getClass(), "routeBtn", null);
        setField(term43522, term43522.getClass(), "moveBtn", null);
        setField(term43522, term43522.getClass(), "focusBtn", null);
        setField(term43522, term43522.getClass(), "border", null);
        setBooleanField(term43522, term43522.getClass(), "isAlignmentXSet", false);
        setFloatField(term43522, term43522.getClass(), "alignmentX", 0.0F);
        setBooleanField(term43522, term43522.getClass(), "isAlignmentYSet", false);
        setFloatField(term43522, term43522.getClass(), "alignmentY", 0.0F);
        setField(term43522, term43522.getClass(), "ui", null);
        setField(term43522, term43522.getClass(), "listenerList", null);
        setField(term43522, term43522.getClass(), "clientProperties", null);
        setField(term43522, term43522.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term43522, term43522.getClass(), "autoscrolls", false);
        setField(term43522, term43522.getClass(), "border", null);
        setIntField(term43522, term43522.getClass(), "flags", 0);
        setField(term43522, term43522.getClass(), "inputVerifier", null);
        setBooleanField(term43522, term43522.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term43522, term43522.getClass(), "paintingChild", null);
        setField(term43522, term43522.getClass(), "popupMenu", null);
        setField(term43522, term43522.getClass(), "revalidateRunnableScheduled", null);
        setField(term43522, term43522.getClass(), "focusInputMap", null);
        setField(term43522, term43522.getClass(), "ancestorInputMap", null);
        setField(term43522, term43522.getClass(), "windowInputMap", null);
        setField(term43522, term43522.getClass(), "actionMap", null);
        setField(term43522, term43522.getClass(), "aaHint", null);
        setField(term43522, term43522.getClass(), "lcdRenderingHint", null);
        setField(term43522, term43522.getClass(), "component", null);
        setField(term43522, term43522.getClass(), "layoutMgr", null);
        setField(term43522, term43522.getClass(), "dispatcher", null);
        setField(term43522, term43522.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term43522, term43522.getClass(), "focusCycleRoot", false);
        setBooleanField(term43522, term43522.getClass(), "focusTraversalPolicyProvider", false);
        setField(term43522, term43522.getClass(), "printingThreads", null);
        setBooleanField(term43522, term43522.getClass(), "printing", false);
        setField(term43522, term43522.getClass(), "containerListener", null);
        setIntField(term43522, term43522.getClass(), "listeningChildren", 0);
        setIntField(term43522, term43522.getClass(), "listeningBoundsChildren", 0);
        setIntField(term43522, term43522.getClass(), "descendantsCount", 0);
        setField(term43522, term43522.getClass(), "preserveBackgroundColor", null);
        setIntField(term43522, term43522.getClass(), "numOfHWComponents", 0);
        setIntField(term43522, term43522.getClass(), "numOfLWComponents", 0);
        setField(term43522, term43522.getClass(), "modalComp", null);
        setField(term43522, term43522.getClass(), "modalAppContext", null);
        setIntField(term43522, term43522.getClass(), "containerSerializedDataVersion", 0);
        setField(term43522, term43522.getClass(), "peer", null);
        setField(term43522, term43522.getClass(), "parent", null);
        setField(term43522, term43522.getClass(), "appContext", null);
        setIntField(term43522, term43522.getClass(), "x", 0);
        setIntField(term43522, term43522.getClass(), "y", 0);
        setIntField(term43522, term43522.getClass(), "width", 0);
        setIntField(term43522, term43522.getClass(), "height", 0);
        setField(term43522, term43522.getClass(), "foreground", null);
        setField(term43522, term43522.getClass(), "background", null);
        setField(term43522, term43522.getClass(), "font", null);
        setField(term43522, term43522.getClass(), "peerFont", null);
        setField(term43522, term43522.getClass(), "cursor", null);
        setField(term43522, term43522.getClass(), "locale", null);
        setField(term43522, term43522.getClass(), "graphicsConfig", null);
        setField(term43522, term43522.getClass(), "bufferStrategy", null);
        setBooleanField(term43522, term43522.getClass(), "ignoreRepaint", false);
        setBooleanField(term43522, term43522.getClass(), "visible", false);
        setBooleanField(term43522, term43522.getClass(), "enabled", false);
        setBooleanField(term43522, term43522.getClass(), "valid", false);
        setField(term43522, term43522.getClass(), "dropTarget", null);
        setField(term43522, term43522.getClass(), "popups", null);
        setField(term43522, term43522.getClass(), "name", null);
        setBooleanField(term43522, term43522.getClass(), "nameExplicitlySet", false);
        setBooleanField(term43522, term43522.getClass(), "focusable", false);
        setIntField(term43522, term43522.getClass(), "isFocusTraversableOverridden", 0);
        setField(term43522, term43522.getClass(), "focusTraversalKeys", null);
        setBooleanField(term43522, term43522.getClass(), "focusTraversalKeysEnabled", false);
        setField(term43522, term43522.getClass(), "acc", null);
        setField(term43522, term43522.getClass(), "minSize", null);
        setBooleanField(term43522, term43522.getClass(), "minSizeSet", false);
        setField(term43522, term43522.getClass(), "prefSize", null);
        setBooleanField(term43522, term43522.getClass(), "prefSizeSet", false);
        setField(term43522, term43522.getClass(), "maxSize", null);
        setBooleanField(term43522, term43522.getClass(), "maxSizeSet", false);
        setField(term43522, term43522.getClass(), "componentOrientation", null);
        setBooleanField(term43522, term43522.getClass(), "newEventsOnly", false);
        setField(term43522, term43522.getClass(), "componentListener", null);
        setField(term43522, term43522.getClass(), "focusListener", null);
        setField(term43522, term43522.getClass(), "hierarchyListener", null);
        setField(term43522, term43522.getClass(), "hierarchyBoundsListener", null);
        setField(term43522, term43522.getClass(), "keyListener", null);
        setField(term43522, term43522.getClass(), "mouseListener", null);
        setField(term43522, term43522.getClass(), "mouseMotionListener", null);
        setField(term43522, term43522.getClass(), "mouseWheelListener", null);
        setField(term43522, term43522.getClass(), "inputMethodListener", null);
        setLongField(term43522, term43522.getClass(), "eventMask", 0L);
        setField(term43522, term43522.getClass(), "changeSupport", null);
        setField(term43522, term43522.getClass(), "objectLock", null);
        setBooleanField(term43522, term43522.getClass(), "isPacked", false);
        setIntField(term43522, term43522.getClass(), "boundsOp", 0);
        setField(term43522, term43522.getClass(), "compoundShape", null);
        setField(term43522, term43522.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term43522, term43522.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term43522, term43522.getClass(), "backgroundEraseDisabled", false);
        setField(term43522, term43522.getClass(), "eventCache", null);
        setBooleanField(term43522, term43522.getClass(), "coalescingEnabled", false);
        setBooleanField(term43522, term43522.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term43522, term43522.getClass(), "componentSerializedDataVersion", 0);
        setField(term43522, term43522.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.MapInfoPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "disableFixTradeBtn", argTypes, term43522, args);
    }

};


