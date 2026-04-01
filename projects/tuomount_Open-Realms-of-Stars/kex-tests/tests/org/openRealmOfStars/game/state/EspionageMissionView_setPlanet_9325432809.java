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

public class EspionageMissionView_setPlanet_9325432809 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1038098;

    public EspionageMissionView_setPlanet_9325432809() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1038098 = newInstance(Class.forName("org.openRealmOfStars.game.state.EspionageMissionView"));
        setField(term1038098, term1038098.getClass(), "farmPanel", null);
        setField(term1038098, term1038098.getClass(), "minePanel", null);
        setField(term1038098, term1038098.getClass(), "factoryPanel", null);
        setField(term1038098, term1038098.getClass(), "resePanel", null);
        setField(term1038098, term1038098.getClass(), "taxPanel", null);
        setField(term1038098, term1038098.getClass(), "cultureLabel", null);
        setField(term1038098, term1038098.getClass(), "totalPeople", null);
        setField(term1038098, term1038098.getClass(), "peopleGrowth", null);
        setField(term1038098, term1038098.getClass(), "farmProd", null);
        setField(term1038098, term1038098.getClass(), "mineProd", null);
        setField(term1038098, term1038098.getClass(), "prodProd", null);
        setField(term1038098, term1038098.getClass(), "reseProd", null);
        setField(term1038098, term1038098.getClass(), "cultProd", null);
        setField(term1038098, term1038098.getClass(), "credProd", null);
        setField(term1038098, term1038098.getClass(), "maintenance", null);
        setField(term1038098, term1038098.getClass(), "metal", null);
        setField(term1038098, term1038098.getClass(), "metalOre", null);
        setField(term1038098, term1038098.getClass(), "happiness", null);
        setField(term1038098, term1038098.getClass(), "constructionLabel", null);
        setField(term1038098, term1038098.getClass(), "buildingLabel", null);
        setField(term1038098, term1038098.getClass(), "buildingEstimate", null);
        setField(term1038098, term1038098.getClass(), "governorLabel", null);
        setField(term1038098, term1038098.getClass(), "buildingList", null);
        setField(term1038098, term1038098.getClass(), "planet", null);
        setField(term1038098, term1038098.getClass(), "info", null);
        setField(term1038098, term1038098.getClass(), "fleet", null);
        setField(term1038098, term1038098.getClass(), "missionType", null);
        setField(term1038098, term1038098.getClass(), "missionInfo", null);
        setBooleanField(term1038098, term1038098.getClass(), "isAlignmentXSet", false);
        setFloatField(term1038098, term1038098.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1038098, term1038098.getClass(), "isAlignmentYSet", false);
        setFloatField(term1038098, term1038098.getClass(), "alignmentY", 0.0F);
        setField(term1038098, term1038098.getClass(), "ui", null);
        setField(term1038098, term1038098.getClass(), "listenerList", null);
        setField(term1038098, term1038098.getClass(), "clientProperties", null);
        setField(term1038098, term1038098.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1038098, term1038098.getClass(), "autoscrolls", false);
        setField(term1038098, term1038098.getClass(), "border", null);
        setIntField(term1038098, term1038098.getClass(), "flags", 0);
        setField(term1038098, term1038098.getClass(), "inputVerifier", null);
        setBooleanField(term1038098, term1038098.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1038098, term1038098.getClass(), "paintingChild", null);
        setField(term1038098, term1038098.getClass(), "popupMenu", null);
        setField(term1038098, term1038098.getClass(), "revalidateRunnableScheduled", null);
        setField(term1038098, term1038098.getClass(), "focusInputMap", null);
        setField(term1038098, term1038098.getClass(), "ancestorInputMap", null);
        setField(term1038098, term1038098.getClass(), "windowInputMap", null);
        setField(term1038098, term1038098.getClass(), "actionMap", null);
        setField(term1038098, term1038098.getClass(), "aaHint", null);
        setField(term1038098, term1038098.getClass(), "lcdRenderingHint", null);
        setField(term1038098, term1038098.getClass(), "component", null);
        setField(term1038098, term1038098.getClass(), "layoutMgr", null);
        setField(term1038098, term1038098.getClass(), "dispatcher", null);
        setField(term1038098, term1038098.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1038098, term1038098.getClass(), "focusCycleRoot", false);
        setBooleanField(term1038098, term1038098.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1038098, term1038098.getClass(), "printingThreads", null);
        setBooleanField(term1038098, term1038098.getClass(), "printing", false);
        setField(term1038098, term1038098.getClass(), "containerListener", null);
        setIntField(term1038098, term1038098.getClass(), "listeningChildren", 0);
        setIntField(term1038098, term1038098.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1038098, term1038098.getClass(), "descendantsCount", 0);
        setField(term1038098, term1038098.getClass(), "preserveBackgroundColor", null);
        setIntField(term1038098, term1038098.getClass(), "numOfHWComponents", 0);
        setIntField(term1038098, term1038098.getClass(), "numOfLWComponents", 0);
        setField(term1038098, term1038098.getClass(), "modalComp", null);
        setField(term1038098, term1038098.getClass(), "modalAppContext", null);
        setIntField(term1038098, term1038098.getClass(), "containerSerializedDataVersion", 0);
        setField(term1038098, term1038098.getClass(), "peer", null);
        setField(term1038098, term1038098.getClass(), "parent", null);
        setField(term1038098, term1038098.getClass(), "appContext", null);
        setIntField(term1038098, term1038098.getClass(), "x", 0);
        setIntField(term1038098, term1038098.getClass(), "y", 0);
        setIntField(term1038098, term1038098.getClass(), "width", 0);
        setIntField(term1038098, term1038098.getClass(), "height", 0);
        setField(term1038098, term1038098.getClass(), "foreground", null);
        setField(term1038098, term1038098.getClass(), "background", null);
        setField(term1038098, term1038098.getClass(), "font", null);
        setField(term1038098, term1038098.getClass(), "peerFont", null);
        setField(term1038098, term1038098.getClass(), "cursor", null);
        setField(term1038098, term1038098.getClass(), "locale", null);
        setField(term1038098, term1038098.getClass(), "graphicsConfig", null);
        setField(term1038098, term1038098.getClass(), "bufferStrategy", null);
        setBooleanField(term1038098, term1038098.getClass(), "ignoreRepaint", false);
        setBooleanField(term1038098, term1038098.getClass(), "visible", false);
        setBooleanField(term1038098, term1038098.getClass(), "enabled", false);
        setBooleanField(term1038098, term1038098.getClass(), "valid", false);
        setField(term1038098, term1038098.getClass(), "dropTarget", null);
        setField(term1038098, term1038098.getClass(), "popups", null);
        setField(term1038098, term1038098.getClass(), "name", null);
        setBooleanField(term1038098, term1038098.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1038098, term1038098.getClass(), "focusable", false);
        setIntField(term1038098, term1038098.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1038098, term1038098.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1038098, term1038098.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1038098, term1038098.getClass(), "acc", null);
        setField(term1038098, term1038098.getClass(), "minSize", null);
        setBooleanField(term1038098, term1038098.getClass(), "minSizeSet", false);
        setField(term1038098, term1038098.getClass(), "prefSize", null);
        setBooleanField(term1038098, term1038098.getClass(), "prefSizeSet", false);
        setField(term1038098, term1038098.getClass(), "maxSize", null);
        setBooleanField(term1038098, term1038098.getClass(), "maxSizeSet", false);
        setField(term1038098, term1038098.getClass(), "componentOrientation", null);
        setBooleanField(term1038098, term1038098.getClass(), "newEventsOnly", false);
        setField(term1038098, term1038098.getClass(), "componentListener", null);
        setField(term1038098, term1038098.getClass(), "focusListener", null);
        setField(term1038098, term1038098.getClass(), "hierarchyListener", null);
        setField(term1038098, term1038098.getClass(), "hierarchyBoundsListener", null);
        setField(term1038098, term1038098.getClass(), "keyListener", null);
        setField(term1038098, term1038098.getClass(), "mouseListener", null);
        setField(term1038098, term1038098.getClass(), "mouseMotionListener", null);
        setField(term1038098, term1038098.getClass(), "mouseWheelListener", null);
        setField(term1038098, term1038098.getClass(), "inputMethodListener", null);
        setLongField(term1038098, term1038098.getClass(), "eventMask", 0L);
        setField(term1038098, term1038098.getClass(), "changeSupport", null);
        setField(term1038098, term1038098.getClass(), "objectLock", null);
        setBooleanField(term1038098, term1038098.getClass(), "isPacked", false);
        setIntField(term1038098, term1038098.getClass(), "boundsOp", 0);
        setField(term1038098, term1038098.getClass(), "compoundShape", null);
        setField(term1038098, term1038098.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1038098, term1038098.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1038098, term1038098.getClass(), "backgroundEraseDisabled", false);
        setField(term1038098, term1038098.getClass(), "eventCache", null);
        setBooleanField(term1038098, term1038098.getClass(), "coalescingEnabled", false);
        setBooleanField(term1038098, term1038098.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1038098, term1038098.getClass(), "componentSerializedDataVersion", 0);
        setField(term1038098, term1038098.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.EspionageMissionView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlanet", argTypes, term1038098, args);
    }

};


