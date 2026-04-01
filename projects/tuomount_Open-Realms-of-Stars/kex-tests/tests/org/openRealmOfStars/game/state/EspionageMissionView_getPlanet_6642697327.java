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

public class EspionageMissionView_getPlanet_6642697327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1029138;

    public EspionageMissionView_getPlanet_6642697327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1029138 = newInstance(Class.forName("org.openRealmOfStars.game.state.EspionageMissionView"));
        setField(term1029138, term1029138.getClass(), "farmPanel", null);
        setField(term1029138, term1029138.getClass(), "minePanel", null);
        setField(term1029138, term1029138.getClass(), "factoryPanel", null);
        setField(term1029138, term1029138.getClass(), "resePanel", null);
        setField(term1029138, term1029138.getClass(), "taxPanel", null);
        setField(term1029138, term1029138.getClass(), "cultureLabel", null);
        setField(term1029138, term1029138.getClass(), "totalPeople", null);
        setField(term1029138, term1029138.getClass(), "peopleGrowth", null);
        setField(term1029138, term1029138.getClass(), "farmProd", null);
        setField(term1029138, term1029138.getClass(), "mineProd", null);
        setField(term1029138, term1029138.getClass(), "prodProd", null);
        setField(term1029138, term1029138.getClass(), "reseProd", null);
        setField(term1029138, term1029138.getClass(), "cultProd", null);
        setField(term1029138, term1029138.getClass(), "credProd", null);
        setField(term1029138, term1029138.getClass(), "maintenance", null);
        setField(term1029138, term1029138.getClass(), "metal", null);
        setField(term1029138, term1029138.getClass(), "metalOre", null);
        setField(term1029138, term1029138.getClass(), "happiness", null);
        setField(term1029138, term1029138.getClass(), "constructionLabel", null);
        setField(term1029138, term1029138.getClass(), "buildingLabel", null);
        setField(term1029138, term1029138.getClass(), "buildingEstimate", null);
        setField(term1029138, term1029138.getClass(), "governorLabel", null);
        setField(term1029138, term1029138.getClass(), "buildingList", null);
        setField(term1029138, term1029138.getClass(), "planet", null);
        setField(term1029138, term1029138.getClass(), "info", null);
        setField(term1029138, term1029138.getClass(), "fleet", null);
        setField(term1029138, term1029138.getClass(), "missionType", null);
        setField(term1029138, term1029138.getClass(), "missionInfo", null);
        setBooleanField(term1029138, term1029138.getClass(), "isAlignmentXSet", false);
        setFloatField(term1029138, term1029138.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1029138, term1029138.getClass(), "isAlignmentYSet", false);
        setFloatField(term1029138, term1029138.getClass(), "alignmentY", 0.0F);
        setField(term1029138, term1029138.getClass(), "ui", null);
        setField(term1029138, term1029138.getClass(), "listenerList", null);
        setField(term1029138, term1029138.getClass(), "clientProperties", null);
        setField(term1029138, term1029138.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1029138, term1029138.getClass(), "autoscrolls", false);
        setField(term1029138, term1029138.getClass(), "border", null);
        setIntField(term1029138, term1029138.getClass(), "flags", 0);
        setField(term1029138, term1029138.getClass(), "inputVerifier", null);
        setBooleanField(term1029138, term1029138.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1029138, term1029138.getClass(), "paintingChild", null);
        setField(term1029138, term1029138.getClass(), "popupMenu", null);
        setField(term1029138, term1029138.getClass(), "revalidateRunnableScheduled", null);
        setField(term1029138, term1029138.getClass(), "focusInputMap", null);
        setField(term1029138, term1029138.getClass(), "ancestorInputMap", null);
        setField(term1029138, term1029138.getClass(), "windowInputMap", null);
        setField(term1029138, term1029138.getClass(), "actionMap", null);
        setField(term1029138, term1029138.getClass(), "aaHint", null);
        setField(term1029138, term1029138.getClass(), "lcdRenderingHint", null);
        setField(term1029138, term1029138.getClass(), "component", null);
        setField(term1029138, term1029138.getClass(), "layoutMgr", null);
        setField(term1029138, term1029138.getClass(), "dispatcher", null);
        setField(term1029138, term1029138.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1029138, term1029138.getClass(), "focusCycleRoot", false);
        setBooleanField(term1029138, term1029138.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1029138, term1029138.getClass(), "printingThreads", null);
        setBooleanField(term1029138, term1029138.getClass(), "printing", false);
        setField(term1029138, term1029138.getClass(), "containerListener", null);
        setIntField(term1029138, term1029138.getClass(), "listeningChildren", 0);
        setIntField(term1029138, term1029138.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1029138, term1029138.getClass(), "descendantsCount", 0);
        setField(term1029138, term1029138.getClass(), "preserveBackgroundColor", null);
        setIntField(term1029138, term1029138.getClass(), "numOfHWComponents", 0);
        setIntField(term1029138, term1029138.getClass(), "numOfLWComponents", 0);
        setField(term1029138, term1029138.getClass(), "modalComp", null);
        setField(term1029138, term1029138.getClass(), "modalAppContext", null);
        setIntField(term1029138, term1029138.getClass(), "containerSerializedDataVersion", 0);
        setField(term1029138, term1029138.getClass(), "peer", null);
        setField(term1029138, term1029138.getClass(), "parent", null);
        setField(term1029138, term1029138.getClass(), "appContext", null);
        setIntField(term1029138, term1029138.getClass(), "x", 0);
        setIntField(term1029138, term1029138.getClass(), "y", 0);
        setIntField(term1029138, term1029138.getClass(), "width", 0);
        setIntField(term1029138, term1029138.getClass(), "height", 0);
        setField(term1029138, term1029138.getClass(), "foreground", null);
        setField(term1029138, term1029138.getClass(), "background", null);
        setField(term1029138, term1029138.getClass(), "font", null);
        setField(term1029138, term1029138.getClass(), "peerFont", null);
        setField(term1029138, term1029138.getClass(), "cursor", null);
        setField(term1029138, term1029138.getClass(), "locale", null);
        setField(term1029138, term1029138.getClass(), "graphicsConfig", null);
        setField(term1029138, term1029138.getClass(), "bufferStrategy", null);
        setBooleanField(term1029138, term1029138.getClass(), "ignoreRepaint", false);
        setBooleanField(term1029138, term1029138.getClass(), "visible", false);
        setBooleanField(term1029138, term1029138.getClass(), "enabled", false);
        setBooleanField(term1029138, term1029138.getClass(), "valid", false);
        setField(term1029138, term1029138.getClass(), "dropTarget", null);
        setField(term1029138, term1029138.getClass(), "popups", null);
        setField(term1029138, term1029138.getClass(), "name", null);
        setBooleanField(term1029138, term1029138.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1029138, term1029138.getClass(), "focusable", false);
        setIntField(term1029138, term1029138.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1029138, term1029138.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1029138, term1029138.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1029138, term1029138.getClass(), "acc", null);
        setField(term1029138, term1029138.getClass(), "minSize", null);
        setBooleanField(term1029138, term1029138.getClass(), "minSizeSet", false);
        setField(term1029138, term1029138.getClass(), "prefSize", null);
        setBooleanField(term1029138, term1029138.getClass(), "prefSizeSet", false);
        setField(term1029138, term1029138.getClass(), "maxSize", null);
        setBooleanField(term1029138, term1029138.getClass(), "maxSizeSet", false);
        setField(term1029138, term1029138.getClass(), "componentOrientation", null);
        setBooleanField(term1029138, term1029138.getClass(), "newEventsOnly", false);
        setField(term1029138, term1029138.getClass(), "componentListener", null);
        setField(term1029138, term1029138.getClass(), "focusListener", null);
        setField(term1029138, term1029138.getClass(), "hierarchyListener", null);
        setField(term1029138, term1029138.getClass(), "hierarchyBoundsListener", null);
        setField(term1029138, term1029138.getClass(), "keyListener", null);
        setField(term1029138, term1029138.getClass(), "mouseListener", null);
        setField(term1029138, term1029138.getClass(), "mouseMotionListener", null);
        setField(term1029138, term1029138.getClass(), "mouseWheelListener", null);
        setField(term1029138, term1029138.getClass(), "inputMethodListener", null);
        setLongField(term1029138, term1029138.getClass(), "eventMask", 0L);
        setField(term1029138, term1029138.getClass(), "changeSupport", null);
        setField(term1029138, term1029138.getClass(), "objectLock", null);
        setBooleanField(term1029138, term1029138.getClass(), "isPacked", false);
        setIntField(term1029138, term1029138.getClass(), "boundsOp", 0);
        setField(term1029138, term1029138.getClass(), "compoundShape", null);
        setField(term1029138, term1029138.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1029138, term1029138.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1029138, term1029138.getClass(), "backgroundEraseDisabled", false);
        setField(term1029138, term1029138.getClass(), "eventCache", null);
        setBooleanField(term1029138, term1029138.getClass(), "coalescingEnabled", false);
        setBooleanField(term1029138, term1029138.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1029138, term1029138.getClass(), "componentSerializedDataVersion", 0);
        setField(term1029138, term1029138.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.EspionageMissionView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlanet", argTypes, term1029138, args);
    }

};


