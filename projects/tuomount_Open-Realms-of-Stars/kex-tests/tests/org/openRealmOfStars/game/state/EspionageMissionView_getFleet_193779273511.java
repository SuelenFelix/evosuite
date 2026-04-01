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

public class EspionageMissionView_getFleet_193779273511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1039682;

    public EspionageMissionView_getFleet_193779273511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1039682 = newInstance(Class.forName("org.openRealmOfStars.game.state.EspionageMissionView"));
        setField(term1039682, term1039682.getClass(), "farmPanel", null);
        setField(term1039682, term1039682.getClass(), "minePanel", null);
        setField(term1039682, term1039682.getClass(), "factoryPanel", null);
        setField(term1039682, term1039682.getClass(), "resePanel", null);
        setField(term1039682, term1039682.getClass(), "taxPanel", null);
        setField(term1039682, term1039682.getClass(), "cultureLabel", null);
        setField(term1039682, term1039682.getClass(), "totalPeople", null);
        setField(term1039682, term1039682.getClass(), "peopleGrowth", null);
        setField(term1039682, term1039682.getClass(), "farmProd", null);
        setField(term1039682, term1039682.getClass(), "mineProd", null);
        setField(term1039682, term1039682.getClass(), "prodProd", null);
        setField(term1039682, term1039682.getClass(), "reseProd", null);
        setField(term1039682, term1039682.getClass(), "cultProd", null);
        setField(term1039682, term1039682.getClass(), "credProd", null);
        setField(term1039682, term1039682.getClass(), "maintenance", null);
        setField(term1039682, term1039682.getClass(), "metal", null);
        setField(term1039682, term1039682.getClass(), "metalOre", null);
        setField(term1039682, term1039682.getClass(), "happiness", null);
        setField(term1039682, term1039682.getClass(), "constructionLabel", null);
        setField(term1039682, term1039682.getClass(), "buildingLabel", null);
        setField(term1039682, term1039682.getClass(), "buildingEstimate", null);
        setField(term1039682, term1039682.getClass(), "governorLabel", null);
        setField(term1039682, term1039682.getClass(), "buildingList", null);
        setField(term1039682, term1039682.getClass(), "planet", null);
        setField(term1039682, term1039682.getClass(), "info", null);
        setField(term1039682, term1039682.getClass(), "fleet", null);
        setField(term1039682, term1039682.getClass(), "missionType", null);
        setField(term1039682, term1039682.getClass(), "missionInfo", null);
        setBooleanField(term1039682, term1039682.getClass(), "isAlignmentXSet", false);
        setFloatField(term1039682, term1039682.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1039682, term1039682.getClass(), "isAlignmentYSet", false);
        setFloatField(term1039682, term1039682.getClass(), "alignmentY", 0.0F);
        setField(term1039682, term1039682.getClass(), "ui", null);
        setField(term1039682, term1039682.getClass(), "listenerList", null);
        setField(term1039682, term1039682.getClass(), "clientProperties", null);
        setField(term1039682, term1039682.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1039682, term1039682.getClass(), "autoscrolls", false);
        setField(term1039682, term1039682.getClass(), "border", null);
        setIntField(term1039682, term1039682.getClass(), "flags", 0);
        setField(term1039682, term1039682.getClass(), "inputVerifier", null);
        setBooleanField(term1039682, term1039682.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1039682, term1039682.getClass(), "paintingChild", null);
        setField(term1039682, term1039682.getClass(), "popupMenu", null);
        setField(term1039682, term1039682.getClass(), "revalidateRunnableScheduled", null);
        setField(term1039682, term1039682.getClass(), "focusInputMap", null);
        setField(term1039682, term1039682.getClass(), "ancestorInputMap", null);
        setField(term1039682, term1039682.getClass(), "windowInputMap", null);
        setField(term1039682, term1039682.getClass(), "actionMap", null);
        setField(term1039682, term1039682.getClass(), "aaHint", null);
        setField(term1039682, term1039682.getClass(), "lcdRenderingHint", null);
        setField(term1039682, term1039682.getClass(), "component", null);
        setField(term1039682, term1039682.getClass(), "layoutMgr", null);
        setField(term1039682, term1039682.getClass(), "dispatcher", null);
        setField(term1039682, term1039682.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1039682, term1039682.getClass(), "focusCycleRoot", false);
        setBooleanField(term1039682, term1039682.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1039682, term1039682.getClass(), "printingThreads", null);
        setBooleanField(term1039682, term1039682.getClass(), "printing", false);
        setField(term1039682, term1039682.getClass(), "containerListener", null);
        setIntField(term1039682, term1039682.getClass(), "listeningChildren", 0);
        setIntField(term1039682, term1039682.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1039682, term1039682.getClass(), "descendantsCount", 0);
        setField(term1039682, term1039682.getClass(), "preserveBackgroundColor", null);
        setIntField(term1039682, term1039682.getClass(), "numOfHWComponents", 0);
        setIntField(term1039682, term1039682.getClass(), "numOfLWComponents", 0);
        setField(term1039682, term1039682.getClass(), "modalComp", null);
        setField(term1039682, term1039682.getClass(), "modalAppContext", null);
        setIntField(term1039682, term1039682.getClass(), "containerSerializedDataVersion", 0);
        setField(term1039682, term1039682.getClass(), "peer", null);
        setField(term1039682, term1039682.getClass(), "parent", null);
        setField(term1039682, term1039682.getClass(), "appContext", null);
        setIntField(term1039682, term1039682.getClass(), "x", 0);
        setIntField(term1039682, term1039682.getClass(), "y", 0);
        setIntField(term1039682, term1039682.getClass(), "width", 0);
        setIntField(term1039682, term1039682.getClass(), "height", 0);
        setField(term1039682, term1039682.getClass(), "foreground", null);
        setField(term1039682, term1039682.getClass(), "background", null);
        setField(term1039682, term1039682.getClass(), "font", null);
        setField(term1039682, term1039682.getClass(), "peerFont", null);
        setField(term1039682, term1039682.getClass(), "cursor", null);
        setField(term1039682, term1039682.getClass(), "locale", null);
        setField(term1039682, term1039682.getClass(), "graphicsConfig", null);
        setField(term1039682, term1039682.getClass(), "bufferStrategy", null);
        setBooleanField(term1039682, term1039682.getClass(), "ignoreRepaint", false);
        setBooleanField(term1039682, term1039682.getClass(), "visible", false);
        setBooleanField(term1039682, term1039682.getClass(), "enabled", false);
        setBooleanField(term1039682, term1039682.getClass(), "valid", false);
        setField(term1039682, term1039682.getClass(), "dropTarget", null);
        setField(term1039682, term1039682.getClass(), "popups", null);
        setField(term1039682, term1039682.getClass(), "name", null);
        setBooleanField(term1039682, term1039682.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1039682, term1039682.getClass(), "focusable", false);
        setIntField(term1039682, term1039682.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1039682, term1039682.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1039682, term1039682.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1039682, term1039682.getClass(), "acc", null);
        setField(term1039682, term1039682.getClass(), "minSize", null);
        setBooleanField(term1039682, term1039682.getClass(), "minSizeSet", false);
        setField(term1039682, term1039682.getClass(), "prefSize", null);
        setBooleanField(term1039682, term1039682.getClass(), "prefSizeSet", false);
        setField(term1039682, term1039682.getClass(), "maxSize", null);
        setBooleanField(term1039682, term1039682.getClass(), "maxSizeSet", false);
        setField(term1039682, term1039682.getClass(), "componentOrientation", null);
        setBooleanField(term1039682, term1039682.getClass(), "newEventsOnly", false);
        setField(term1039682, term1039682.getClass(), "componentListener", null);
        setField(term1039682, term1039682.getClass(), "focusListener", null);
        setField(term1039682, term1039682.getClass(), "hierarchyListener", null);
        setField(term1039682, term1039682.getClass(), "hierarchyBoundsListener", null);
        setField(term1039682, term1039682.getClass(), "keyListener", null);
        setField(term1039682, term1039682.getClass(), "mouseListener", null);
        setField(term1039682, term1039682.getClass(), "mouseMotionListener", null);
        setField(term1039682, term1039682.getClass(), "mouseWheelListener", null);
        setField(term1039682, term1039682.getClass(), "inputMethodListener", null);
        setLongField(term1039682, term1039682.getClass(), "eventMask", 0L);
        setField(term1039682, term1039682.getClass(), "changeSupport", null);
        setField(term1039682, term1039682.getClass(), "objectLock", null);
        setBooleanField(term1039682, term1039682.getClass(), "isPacked", false);
        setIntField(term1039682, term1039682.getClass(), "boundsOp", 0);
        setField(term1039682, term1039682.getClass(), "compoundShape", null);
        setField(term1039682, term1039682.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1039682, term1039682.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1039682, term1039682.getClass(), "backgroundEraseDisabled", false);
        setField(term1039682, term1039682.getClass(), "eventCache", null);
        setBooleanField(term1039682, term1039682.getClass(), "coalescingEnabled", false);
        setBooleanField(term1039682, term1039682.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1039682, term1039682.getClass(), "componentSerializedDataVersion", 0);
        setField(term1039682, term1039682.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.EspionageMissionView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFleet", argTypes, term1039682, args);
    }

};


