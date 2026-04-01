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

public class EspionageMissionView_setFleet_149430232113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1041538;

    public EspionageMissionView_setFleet_149430232113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1041538 = newInstance(Class.forName("org.openRealmOfStars.game.state.EspionageMissionView"));
        setField(term1041538, term1041538.getClass(), "farmPanel", null);
        setField(term1041538, term1041538.getClass(), "minePanel", null);
        setField(term1041538, term1041538.getClass(), "factoryPanel", null);
        setField(term1041538, term1041538.getClass(), "resePanel", null);
        setField(term1041538, term1041538.getClass(), "taxPanel", null);
        setField(term1041538, term1041538.getClass(), "cultureLabel", null);
        setField(term1041538, term1041538.getClass(), "totalPeople", null);
        setField(term1041538, term1041538.getClass(), "peopleGrowth", null);
        setField(term1041538, term1041538.getClass(), "farmProd", null);
        setField(term1041538, term1041538.getClass(), "mineProd", null);
        setField(term1041538, term1041538.getClass(), "prodProd", null);
        setField(term1041538, term1041538.getClass(), "reseProd", null);
        setField(term1041538, term1041538.getClass(), "cultProd", null);
        setField(term1041538, term1041538.getClass(), "credProd", null);
        setField(term1041538, term1041538.getClass(), "maintenance", null);
        setField(term1041538, term1041538.getClass(), "metal", null);
        setField(term1041538, term1041538.getClass(), "metalOre", null);
        setField(term1041538, term1041538.getClass(), "happiness", null);
        setField(term1041538, term1041538.getClass(), "constructionLabel", null);
        setField(term1041538, term1041538.getClass(), "buildingLabel", null);
        setField(term1041538, term1041538.getClass(), "buildingEstimate", null);
        setField(term1041538, term1041538.getClass(), "governorLabel", null);
        setField(term1041538, term1041538.getClass(), "buildingList", null);
        setField(term1041538, term1041538.getClass(), "planet", null);
        setField(term1041538, term1041538.getClass(), "info", null);
        setField(term1041538, term1041538.getClass(), "fleet", null);
        setField(term1041538, term1041538.getClass(), "missionType", null);
        setField(term1041538, term1041538.getClass(), "missionInfo", null);
        setBooleanField(term1041538, term1041538.getClass(), "isAlignmentXSet", false);
        setFloatField(term1041538, term1041538.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1041538, term1041538.getClass(), "isAlignmentYSet", false);
        setFloatField(term1041538, term1041538.getClass(), "alignmentY", 0.0F);
        setField(term1041538, term1041538.getClass(), "ui", null);
        setField(term1041538, term1041538.getClass(), "listenerList", null);
        setField(term1041538, term1041538.getClass(), "clientProperties", null);
        setField(term1041538, term1041538.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1041538, term1041538.getClass(), "autoscrolls", false);
        setField(term1041538, term1041538.getClass(), "border", null);
        setIntField(term1041538, term1041538.getClass(), "flags", 0);
        setField(term1041538, term1041538.getClass(), "inputVerifier", null);
        setBooleanField(term1041538, term1041538.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1041538, term1041538.getClass(), "paintingChild", null);
        setField(term1041538, term1041538.getClass(), "popupMenu", null);
        setField(term1041538, term1041538.getClass(), "revalidateRunnableScheduled", null);
        setField(term1041538, term1041538.getClass(), "focusInputMap", null);
        setField(term1041538, term1041538.getClass(), "ancestorInputMap", null);
        setField(term1041538, term1041538.getClass(), "windowInputMap", null);
        setField(term1041538, term1041538.getClass(), "actionMap", null);
        setField(term1041538, term1041538.getClass(), "aaHint", null);
        setField(term1041538, term1041538.getClass(), "lcdRenderingHint", null);
        setField(term1041538, term1041538.getClass(), "component", null);
        setField(term1041538, term1041538.getClass(), "layoutMgr", null);
        setField(term1041538, term1041538.getClass(), "dispatcher", null);
        setField(term1041538, term1041538.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1041538, term1041538.getClass(), "focusCycleRoot", false);
        setBooleanField(term1041538, term1041538.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1041538, term1041538.getClass(), "printingThreads", null);
        setBooleanField(term1041538, term1041538.getClass(), "printing", false);
        setField(term1041538, term1041538.getClass(), "containerListener", null);
        setIntField(term1041538, term1041538.getClass(), "listeningChildren", 0);
        setIntField(term1041538, term1041538.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1041538, term1041538.getClass(), "descendantsCount", 0);
        setField(term1041538, term1041538.getClass(), "preserveBackgroundColor", null);
        setIntField(term1041538, term1041538.getClass(), "numOfHWComponents", 0);
        setIntField(term1041538, term1041538.getClass(), "numOfLWComponents", 0);
        setField(term1041538, term1041538.getClass(), "modalComp", null);
        setField(term1041538, term1041538.getClass(), "modalAppContext", null);
        setIntField(term1041538, term1041538.getClass(), "containerSerializedDataVersion", 0);
        setField(term1041538, term1041538.getClass(), "peer", null);
        setField(term1041538, term1041538.getClass(), "parent", null);
        setField(term1041538, term1041538.getClass(), "appContext", null);
        setIntField(term1041538, term1041538.getClass(), "x", 0);
        setIntField(term1041538, term1041538.getClass(), "y", 0);
        setIntField(term1041538, term1041538.getClass(), "width", 0);
        setIntField(term1041538, term1041538.getClass(), "height", 0);
        setField(term1041538, term1041538.getClass(), "foreground", null);
        setField(term1041538, term1041538.getClass(), "background", null);
        setField(term1041538, term1041538.getClass(), "font", null);
        setField(term1041538, term1041538.getClass(), "peerFont", null);
        setField(term1041538, term1041538.getClass(), "cursor", null);
        setField(term1041538, term1041538.getClass(), "locale", null);
        setField(term1041538, term1041538.getClass(), "graphicsConfig", null);
        setField(term1041538, term1041538.getClass(), "bufferStrategy", null);
        setBooleanField(term1041538, term1041538.getClass(), "ignoreRepaint", false);
        setBooleanField(term1041538, term1041538.getClass(), "visible", false);
        setBooleanField(term1041538, term1041538.getClass(), "enabled", false);
        setBooleanField(term1041538, term1041538.getClass(), "valid", false);
        setField(term1041538, term1041538.getClass(), "dropTarget", null);
        setField(term1041538, term1041538.getClass(), "popups", null);
        setField(term1041538, term1041538.getClass(), "name", null);
        setBooleanField(term1041538, term1041538.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1041538, term1041538.getClass(), "focusable", false);
        setIntField(term1041538, term1041538.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1041538, term1041538.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1041538, term1041538.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1041538, term1041538.getClass(), "acc", null);
        setField(term1041538, term1041538.getClass(), "minSize", null);
        setBooleanField(term1041538, term1041538.getClass(), "minSizeSet", false);
        setField(term1041538, term1041538.getClass(), "prefSize", null);
        setBooleanField(term1041538, term1041538.getClass(), "prefSizeSet", false);
        setField(term1041538, term1041538.getClass(), "maxSize", null);
        setBooleanField(term1041538, term1041538.getClass(), "maxSizeSet", false);
        setField(term1041538, term1041538.getClass(), "componentOrientation", null);
        setBooleanField(term1041538, term1041538.getClass(), "newEventsOnly", false);
        setField(term1041538, term1041538.getClass(), "componentListener", null);
        setField(term1041538, term1041538.getClass(), "focusListener", null);
        setField(term1041538, term1041538.getClass(), "hierarchyListener", null);
        setField(term1041538, term1041538.getClass(), "hierarchyBoundsListener", null);
        setField(term1041538, term1041538.getClass(), "keyListener", null);
        setField(term1041538, term1041538.getClass(), "mouseListener", null);
        setField(term1041538, term1041538.getClass(), "mouseMotionListener", null);
        setField(term1041538, term1041538.getClass(), "mouseWheelListener", null);
        setField(term1041538, term1041538.getClass(), "inputMethodListener", null);
        setLongField(term1041538, term1041538.getClass(), "eventMask", 0L);
        setField(term1041538, term1041538.getClass(), "changeSupport", null);
        setField(term1041538, term1041538.getClass(), "objectLock", null);
        setBooleanField(term1041538, term1041538.getClass(), "isPacked", false);
        setIntField(term1041538, term1041538.getClass(), "boundsOp", 0);
        setField(term1041538, term1041538.getClass(), "compoundShape", null);
        setField(term1041538, term1041538.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1041538, term1041538.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1041538, term1041538.getClass(), "backgroundEraseDisabled", false);
        setField(term1041538, term1041538.getClass(), "eventCache", null);
        setBooleanField(term1041538, term1041538.getClass(), "coalescingEnabled", false);
        setBooleanField(term1041538, term1041538.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1041538, term1041538.getClass(), "componentSerializedDataVersion", 0);
        setField(term1041538, term1041538.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.EspionageMissionView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFleet", argTypes, term1041538, args);
    }

};


