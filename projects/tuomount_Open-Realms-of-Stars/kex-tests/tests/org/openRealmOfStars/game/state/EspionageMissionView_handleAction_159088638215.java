package org.openRealmOfStars.game.state;

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
import static org.openRealmOfStars.game.state.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class EspionageMissionView_handleAction_159088638215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1043252;

    public EspionageMissionView_handleAction_159088638215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1043252 = newInstance(Class.forName("org.openRealmOfStars.game.state.EspionageMissionView"));
        setField(term1043252, term1043252.getClass(), "farmPanel", null);
        setField(term1043252, term1043252.getClass(), "minePanel", null);
        setField(term1043252, term1043252.getClass(), "factoryPanel", null);
        setField(term1043252, term1043252.getClass(), "resePanel", null);
        setField(term1043252, term1043252.getClass(), "taxPanel", null);
        setField(term1043252, term1043252.getClass(), "cultureLabel", null);
        setField(term1043252, term1043252.getClass(), "totalPeople", null);
        setField(term1043252, term1043252.getClass(), "peopleGrowth", null);
        setField(term1043252, term1043252.getClass(), "farmProd", null);
        setField(term1043252, term1043252.getClass(), "mineProd", null);
        setField(term1043252, term1043252.getClass(), "prodProd", null);
        setField(term1043252, term1043252.getClass(), "reseProd", null);
        setField(term1043252, term1043252.getClass(), "cultProd", null);
        setField(term1043252, term1043252.getClass(), "credProd", null);
        setField(term1043252, term1043252.getClass(), "maintenance", null);
        setField(term1043252, term1043252.getClass(), "metal", null);
        setField(term1043252, term1043252.getClass(), "metalOre", null);
        setField(term1043252, term1043252.getClass(), "happiness", null);
        setField(term1043252, term1043252.getClass(), "constructionLabel", null);
        setField(term1043252, term1043252.getClass(), "buildingLabel", null);
        setField(term1043252, term1043252.getClass(), "buildingEstimate", null);
        setField(term1043252, term1043252.getClass(), "governorLabel", null);
        setField(term1043252, term1043252.getClass(), "buildingList", null);
        setField(term1043252, term1043252.getClass(), "planet", null);
        setField(term1043252, term1043252.getClass(), "info", null);
        setField(term1043252, term1043252.getClass(), "fleet", null);
        setField(term1043252, term1043252.getClass(), "missionType", null);
        setField(term1043252, term1043252.getClass(), "missionInfo", null);
        setBooleanField(term1043252, term1043252.getClass(), "isAlignmentXSet", false);
        setFloatField(term1043252, term1043252.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1043252, term1043252.getClass(), "isAlignmentYSet", false);
        setFloatField(term1043252, term1043252.getClass(), "alignmentY", 0.0F);
        setField(term1043252, term1043252.getClass(), "ui", null);
        setField(term1043252, term1043252.getClass(), "listenerList", null);
        setField(term1043252, term1043252.getClass(), "clientProperties", null);
        setField(term1043252, term1043252.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1043252, term1043252.getClass(), "autoscrolls", false);
        setField(term1043252, term1043252.getClass(), "border", null);
        setIntField(term1043252, term1043252.getClass(), "flags", 0);
        setField(term1043252, term1043252.getClass(), "inputVerifier", null);
        setBooleanField(term1043252, term1043252.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1043252, term1043252.getClass(), "paintingChild", null);
        setField(term1043252, term1043252.getClass(), "popupMenu", null);
        setField(term1043252, term1043252.getClass(), "revalidateRunnableScheduled", null);
        setField(term1043252, term1043252.getClass(), "focusInputMap", null);
        setField(term1043252, term1043252.getClass(), "ancestorInputMap", null);
        setField(term1043252, term1043252.getClass(), "windowInputMap", null);
        setField(term1043252, term1043252.getClass(), "actionMap", null);
        setField(term1043252, term1043252.getClass(), "aaHint", null);
        setField(term1043252, term1043252.getClass(), "lcdRenderingHint", null);
        setField(term1043252, term1043252.getClass(), "component", null);
        setField(term1043252, term1043252.getClass(), "layoutMgr", null);
        setField(term1043252, term1043252.getClass(), "dispatcher", null);
        setField(term1043252, term1043252.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1043252, term1043252.getClass(), "focusCycleRoot", false);
        setBooleanField(term1043252, term1043252.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1043252, term1043252.getClass(), "printingThreads", null);
        setBooleanField(term1043252, term1043252.getClass(), "printing", false);
        setField(term1043252, term1043252.getClass(), "containerListener", null);
        setIntField(term1043252, term1043252.getClass(), "listeningChildren", 0);
        setIntField(term1043252, term1043252.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1043252, term1043252.getClass(), "descendantsCount", 0);
        setField(term1043252, term1043252.getClass(), "preserveBackgroundColor", null);
        setIntField(term1043252, term1043252.getClass(), "numOfHWComponents", 0);
        setIntField(term1043252, term1043252.getClass(), "numOfLWComponents", 0);
        setField(term1043252, term1043252.getClass(), "modalComp", null);
        setField(term1043252, term1043252.getClass(), "modalAppContext", null);
        setIntField(term1043252, term1043252.getClass(), "containerSerializedDataVersion", 0);
        setField(term1043252, term1043252.getClass(), "peer", null);
        setField(term1043252, term1043252.getClass(), "parent", null);
        setField(term1043252, term1043252.getClass(), "appContext", null);
        setIntField(term1043252, term1043252.getClass(), "x", 0);
        setIntField(term1043252, term1043252.getClass(), "y", 0);
        setIntField(term1043252, term1043252.getClass(), "width", 0);
        setIntField(term1043252, term1043252.getClass(), "height", 0);
        setField(term1043252, term1043252.getClass(), "foreground", null);
        setField(term1043252, term1043252.getClass(), "background", null);
        setField(term1043252, term1043252.getClass(), "font", null);
        setField(term1043252, term1043252.getClass(), "peerFont", null);
        setField(term1043252, term1043252.getClass(), "cursor", null);
        setField(term1043252, term1043252.getClass(), "locale", null);
        setField(term1043252, term1043252.getClass(), "graphicsConfig", null);
        setField(term1043252, term1043252.getClass(), "bufferStrategy", null);
        setBooleanField(term1043252, term1043252.getClass(), "ignoreRepaint", false);
        setBooleanField(term1043252, term1043252.getClass(), "visible", false);
        setBooleanField(term1043252, term1043252.getClass(), "enabled", false);
        setBooleanField(term1043252, term1043252.getClass(), "valid", false);
        setField(term1043252, term1043252.getClass(), "dropTarget", null);
        setField(term1043252, term1043252.getClass(), "popups", null);
        setField(term1043252, term1043252.getClass(), "name", null);
        setBooleanField(term1043252, term1043252.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1043252, term1043252.getClass(), "focusable", false);
        setIntField(term1043252, term1043252.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1043252, term1043252.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1043252, term1043252.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1043252, term1043252.getClass(), "acc", null);
        setField(term1043252, term1043252.getClass(), "minSize", null);
        setBooleanField(term1043252, term1043252.getClass(), "minSizeSet", false);
        setField(term1043252, term1043252.getClass(), "prefSize", null);
        setBooleanField(term1043252, term1043252.getClass(), "prefSizeSet", false);
        setField(term1043252, term1043252.getClass(), "maxSize", null);
        setBooleanField(term1043252, term1043252.getClass(), "maxSizeSet", false);
        setField(term1043252, term1043252.getClass(), "componentOrientation", null);
        setBooleanField(term1043252, term1043252.getClass(), "newEventsOnly", false);
        setField(term1043252, term1043252.getClass(), "componentListener", null);
        setField(term1043252, term1043252.getClass(), "focusListener", null);
        setField(term1043252, term1043252.getClass(), "hierarchyListener", null);
        setField(term1043252, term1043252.getClass(), "hierarchyBoundsListener", null);
        setField(term1043252, term1043252.getClass(), "keyListener", null);
        setField(term1043252, term1043252.getClass(), "mouseListener", null);
        setField(term1043252, term1043252.getClass(), "mouseMotionListener", null);
        setField(term1043252, term1043252.getClass(), "mouseWheelListener", null);
        setField(term1043252, term1043252.getClass(), "inputMethodListener", null);
        setLongField(term1043252, term1043252.getClass(), "eventMask", 0L);
        setField(term1043252, term1043252.getClass(), "changeSupport", null);
        setField(term1043252, term1043252.getClass(), "objectLock", null);
        setBooleanField(term1043252, term1043252.getClass(), "isPacked", false);
        setIntField(term1043252, term1043252.getClass(), "boundsOp", 0);
        setField(term1043252, term1043252.getClass(), "compoundShape", null);
        setField(term1043252, term1043252.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1043252, term1043252.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1043252, term1043252.getClass(), "backgroundEraseDisabled", false);
        setField(term1043252, term1043252.getClass(), "eventCache", null);
        setBooleanField(term1043252, term1043252.getClass(), "coalescingEnabled", false);
        setBooleanField(term1043252, term1043252.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1043252, term1043252.getClass(), "componentSerializedDataVersion", 0);
        setField(term1043252, term1043252.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.EspionageMissionView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleAction", argTypes, term1043252, args);
    }

};


