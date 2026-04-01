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

public class EspionageMissionView_updatePanel_11448627465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1027476;

    public EspionageMissionView_updatePanel_11448627465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1027476 = newInstance(Class.forName("org.openRealmOfStars.game.state.EspionageMissionView"));
        setField(term1027476, term1027476.getClass(), "farmPanel", null);
        setField(term1027476, term1027476.getClass(), "minePanel", null);
        setField(term1027476, term1027476.getClass(), "factoryPanel", null);
        setField(term1027476, term1027476.getClass(), "resePanel", null);
        setField(term1027476, term1027476.getClass(), "taxPanel", null);
        setField(term1027476, term1027476.getClass(), "cultureLabel", null);
        setField(term1027476, term1027476.getClass(), "totalPeople", null);
        setField(term1027476, term1027476.getClass(), "peopleGrowth", null);
        setField(term1027476, term1027476.getClass(), "farmProd", null);
        setField(term1027476, term1027476.getClass(), "mineProd", null);
        setField(term1027476, term1027476.getClass(), "prodProd", null);
        setField(term1027476, term1027476.getClass(), "reseProd", null);
        setField(term1027476, term1027476.getClass(), "cultProd", null);
        setField(term1027476, term1027476.getClass(), "credProd", null);
        setField(term1027476, term1027476.getClass(), "maintenance", null);
        setField(term1027476, term1027476.getClass(), "metal", null);
        setField(term1027476, term1027476.getClass(), "metalOre", null);
        setField(term1027476, term1027476.getClass(), "happiness", null);
        setField(term1027476, term1027476.getClass(), "constructionLabel", null);
        setField(term1027476, term1027476.getClass(), "buildingLabel", null);
        setField(term1027476, term1027476.getClass(), "buildingEstimate", null);
        setField(term1027476, term1027476.getClass(), "governorLabel", null);
        setField(term1027476, term1027476.getClass(), "buildingList", null);
        setField(term1027476, term1027476.getClass(), "planet", null);
        setField(term1027476, term1027476.getClass(), "info", null);
        setField(term1027476, term1027476.getClass(), "fleet", null);
        setField(term1027476, term1027476.getClass(), "missionType", null);
        setField(term1027476, term1027476.getClass(), "missionInfo", null);
        setBooleanField(term1027476, term1027476.getClass(), "isAlignmentXSet", false);
        setFloatField(term1027476, term1027476.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1027476, term1027476.getClass(), "isAlignmentYSet", false);
        setFloatField(term1027476, term1027476.getClass(), "alignmentY", 0.0F);
        setField(term1027476, term1027476.getClass(), "ui", null);
        setField(term1027476, term1027476.getClass(), "listenerList", null);
        setField(term1027476, term1027476.getClass(), "clientProperties", null);
        setField(term1027476, term1027476.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1027476, term1027476.getClass(), "autoscrolls", false);
        setField(term1027476, term1027476.getClass(), "border", null);
        setIntField(term1027476, term1027476.getClass(), "flags", 0);
        setField(term1027476, term1027476.getClass(), "inputVerifier", null);
        setBooleanField(term1027476, term1027476.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1027476, term1027476.getClass(), "paintingChild", null);
        setField(term1027476, term1027476.getClass(), "popupMenu", null);
        setField(term1027476, term1027476.getClass(), "revalidateRunnableScheduled", null);
        setField(term1027476, term1027476.getClass(), "focusInputMap", null);
        setField(term1027476, term1027476.getClass(), "ancestorInputMap", null);
        setField(term1027476, term1027476.getClass(), "windowInputMap", null);
        setField(term1027476, term1027476.getClass(), "actionMap", null);
        setField(term1027476, term1027476.getClass(), "aaHint", null);
        setField(term1027476, term1027476.getClass(), "lcdRenderingHint", null);
        setField(term1027476, term1027476.getClass(), "component", null);
        setField(term1027476, term1027476.getClass(), "layoutMgr", null);
        setField(term1027476, term1027476.getClass(), "dispatcher", null);
        setField(term1027476, term1027476.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1027476, term1027476.getClass(), "focusCycleRoot", false);
        setBooleanField(term1027476, term1027476.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1027476, term1027476.getClass(), "printingThreads", null);
        setBooleanField(term1027476, term1027476.getClass(), "printing", false);
        setField(term1027476, term1027476.getClass(), "containerListener", null);
        setIntField(term1027476, term1027476.getClass(), "listeningChildren", 0);
        setIntField(term1027476, term1027476.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1027476, term1027476.getClass(), "descendantsCount", 0);
        setField(term1027476, term1027476.getClass(), "preserveBackgroundColor", null);
        setIntField(term1027476, term1027476.getClass(), "numOfHWComponents", 0);
        setIntField(term1027476, term1027476.getClass(), "numOfLWComponents", 0);
        setField(term1027476, term1027476.getClass(), "modalComp", null);
        setField(term1027476, term1027476.getClass(), "modalAppContext", null);
        setIntField(term1027476, term1027476.getClass(), "containerSerializedDataVersion", 0);
        setField(term1027476, term1027476.getClass(), "peer", null);
        setField(term1027476, term1027476.getClass(), "parent", null);
        setField(term1027476, term1027476.getClass(), "appContext", null);
        setIntField(term1027476, term1027476.getClass(), "x", 0);
        setIntField(term1027476, term1027476.getClass(), "y", 0);
        setIntField(term1027476, term1027476.getClass(), "width", 0);
        setIntField(term1027476, term1027476.getClass(), "height", 0);
        setField(term1027476, term1027476.getClass(), "foreground", null);
        setField(term1027476, term1027476.getClass(), "background", null);
        setField(term1027476, term1027476.getClass(), "font", null);
        setField(term1027476, term1027476.getClass(), "peerFont", null);
        setField(term1027476, term1027476.getClass(), "cursor", null);
        setField(term1027476, term1027476.getClass(), "locale", null);
        setField(term1027476, term1027476.getClass(), "graphicsConfig", null);
        setField(term1027476, term1027476.getClass(), "bufferStrategy", null);
        setBooleanField(term1027476, term1027476.getClass(), "ignoreRepaint", false);
        setBooleanField(term1027476, term1027476.getClass(), "visible", false);
        setBooleanField(term1027476, term1027476.getClass(), "enabled", false);
        setBooleanField(term1027476, term1027476.getClass(), "valid", false);
        setField(term1027476, term1027476.getClass(), "dropTarget", null);
        setField(term1027476, term1027476.getClass(), "popups", null);
        setField(term1027476, term1027476.getClass(), "name", null);
        setBooleanField(term1027476, term1027476.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1027476, term1027476.getClass(), "focusable", false);
        setIntField(term1027476, term1027476.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1027476, term1027476.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1027476, term1027476.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1027476, term1027476.getClass(), "acc", null);
        setField(term1027476, term1027476.getClass(), "minSize", null);
        setBooleanField(term1027476, term1027476.getClass(), "minSizeSet", false);
        setField(term1027476, term1027476.getClass(), "prefSize", null);
        setBooleanField(term1027476, term1027476.getClass(), "prefSizeSet", false);
        setField(term1027476, term1027476.getClass(), "maxSize", null);
        setBooleanField(term1027476, term1027476.getClass(), "maxSizeSet", false);
        setField(term1027476, term1027476.getClass(), "componentOrientation", null);
        setBooleanField(term1027476, term1027476.getClass(), "newEventsOnly", false);
        setField(term1027476, term1027476.getClass(), "componentListener", null);
        setField(term1027476, term1027476.getClass(), "focusListener", null);
        setField(term1027476, term1027476.getClass(), "hierarchyListener", null);
        setField(term1027476, term1027476.getClass(), "hierarchyBoundsListener", null);
        setField(term1027476, term1027476.getClass(), "keyListener", null);
        setField(term1027476, term1027476.getClass(), "mouseListener", null);
        setField(term1027476, term1027476.getClass(), "mouseMotionListener", null);
        setField(term1027476, term1027476.getClass(), "mouseWheelListener", null);
        setField(term1027476, term1027476.getClass(), "inputMethodListener", null);
        setLongField(term1027476, term1027476.getClass(), "eventMask", 0L);
        setField(term1027476, term1027476.getClass(), "changeSupport", null);
        setField(term1027476, term1027476.getClass(), "objectLock", null);
        setBooleanField(term1027476, term1027476.getClass(), "isPacked", false);
        setIntField(term1027476, term1027476.getClass(), "boundsOp", 0);
        setField(term1027476, term1027476.getClass(), "compoundShape", null);
        setField(term1027476, term1027476.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1027476, term1027476.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1027476, term1027476.getClass(), "backgroundEraseDisabled", false);
        setField(term1027476, term1027476.getClass(), "eventCache", null);
        setBooleanField(term1027476, term1027476.getClass(), "coalescingEnabled", false);
        setBooleanField(term1027476, term1027476.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1027476, term1027476.getClass(), "componentSerializedDataVersion", 0);
        setField(term1027476, term1027476.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.EspionageMissionView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updatePanel", argTypes, term1027476, args);
    }

};


