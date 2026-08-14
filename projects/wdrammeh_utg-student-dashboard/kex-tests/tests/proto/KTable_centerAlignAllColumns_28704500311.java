package proto;

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
import static proto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class KTable_centerAlignAllColumns_28704500311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35182;

    public KTable_centerAlignAllColumns_28704500311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35182 = newInstance(Class.forName("proto.KTable"));
        setField(term35182, term35182.getClass(), "dataModel", null);
        setField(term35182, term35182.getClass(), "columnModel", null);
        setField(term35182, term35182.getClass(), "selectionModel", null);
        setField(term35182, term35182.getClass(), "tableHeader", null);
        setIntField(term35182, term35182.getClass(), "rowHeight", 0);
        setIntField(term35182, term35182.getClass(), "rowMargin", 0);
        setField(term35182, term35182.getClass(), "gridColor", null);
        setBooleanField(term35182, term35182.getClass(), "showHorizontalLines", false);
        setBooleanField(term35182, term35182.getClass(), "showVerticalLines", false);
        setIntField(term35182, term35182.getClass(), "autoResizeMode", 0);
        setBooleanField(term35182, term35182.getClass(), "autoCreateColumnsFromModel", false);
        setField(term35182, term35182.getClass(), "preferredViewportSize", null);
        setBooleanField(term35182, term35182.getClass(), "rowSelectionAllowed", false);
        setBooleanField(term35182, term35182.getClass(), "cellSelectionEnabled", false);
        setField(term35182, term35182.getClass(), "editorComp", null);
        setField(term35182, term35182.getClass(), "cellEditor", null);
        setIntField(term35182, term35182.getClass(), "editingColumn", 0);
        setIntField(term35182, term35182.getClass(), "editingRow", 0);
        setField(term35182, term35182.getClass(), "defaultRenderersByColumnClass", null);
        setField(term35182, term35182.getClass(), "defaultEditorsByColumnClass", null);
        setField(term35182, term35182.getClass(), "selectionForeground", null);
        setField(term35182, term35182.getClass(), "selectionBackground", null);
        setField(term35182, term35182.getClass(), "rowModel", null);
        setBooleanField(term35182, term35182.getClass(), "dragEnabled", false);
        setBooleanField(term35182, term35182.getClass(), "surrendersFocusOnKeystroke", false);
        setField(term35182, term35182.getClass(), "editorRemover", null);
        setBooleanField(term35182, term35182.getClass(), "columnSelectionAdjusting", false);
        setBooleanField(term35182, term35182.getClass(), "rowSelectionAdjusting", false);
        setField(term35182, term35182.getClass(), "printError", null);
        setBooleanField(term35182, term35182.getClass(), "isRowHeightSet", false);
        setBooleanField(term35182, term35182.getClass(), "updateSelectionOnSort", false);
        setField(term35182, term35182.getClass(), "sortManager", null);
        setBooleanField(term35182, term35182.getClass(), "ignoreSortChange", false);
        setBooleanField(term35182, term35182.getClass(), "sorterChanged", false);
        setBooleanField(term35182, term35182.getClass(), "autoCreateRowSorter", false);
        setBooleanField(term35182, term35182.getClass(), "fillsViewportHeight", false);
        setField(term35182, term35182.getClass(), "dropMode", null);
        setField(term35182, term35182.getClass(), "dropLocation", null);
        setBooleanField(term35182, term35182.getClass(), "updateInProgress", false);
        setBooleanField(term35182, term35182.getClass(), "isAlignmentXSet", false);
        setFloatField(term35182, term35182.getClass(), "alignmentX", 0.0F);
        setBooleanField(term35182, term35182.getClass(), "isAlignmentYSet", false);
        setFloatField(term35182, term35182.getClass(), "alignmentY", 0.0F);
        setField(term35182, term35182.getClass(), "ui", null);
        setField(term35182, term35182.getClass(), "listenerList", null);
        setField(term35182, term35182.getClass(), "clientProperties", null);
        setField(term35182, term35182.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term35182, term35182.getClass(), "autoscrolls", false);
        setField(term35182, term35182.getClass(), "border", null);
        setIntField(term35182, term35182.getClass(), "flags", 0);
        setField(term35182, term35182.getClass(), "inputVerifier", null);
        setBooleanField(term35182, term35182.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term35182, term35182.getClass(), "paintingChild", null);
        setField(term35182, term35182.getClass(), "popupMenu", null);
        setField(term35182, term35182.getClass(), "revalidateRunnableScheduled", null);
        setField(term35182, term35182.getClass(), "focusInputMap", null);
        setField(term35182, term35182.getClass(), "ancestorInputMap", null);
        setField(term35182, term35182.getClass(), "windowInputMap", null);
        setField(term35182, term35182.getClass(), "actionMap", null);
        setField(term35182, term35182.getClass(), "aaHint", null);
        setField(term35182, term35182.getClass(), "lcdRenderingHint", null);
        setField(term35182, term35182.getClass(), "component", null);
        setField(term35182, term35182.getClass(), "layoutMgr", null);
        setField(term35182, term35182.getClass(), "dispatcher", null);
        setField(term35182, term35182.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term35182, term35182.getClass(), "focusCycleRoot", false);
        setBooleanField(term35182, term35182.getClass(), "focusTraversalPolicyProvider", false);
        setField(term35182, term35182.getClass(), "printingThreads", null);
        setBooleanField(term35182, term35182.getClass(), "printing", false);
        setField(term35182, term35182.getClass(), "containerListener", null);
        setIntField(term35182, term35182.getClass(), "listeningChildren", 0);
        setIntField(term35182, term35182.getClass(), "listeningBoundsChildren", 0);
        setIntField(term35182, term35182.getClass(), "descendantsCount", 0);
        setField(term35182, term35182.getClass(), "preserveBackgroundColor", null);
        setIntField(term35182, term35182.getClass(), "numOfHWComponents", 0);
        setIntField(term35182, term35182.getClass(), "numOfLWComponents", 0);
        setField(term35182, term35182.getClass(), "modalComp", null);
        setField(term35182, term35182.getClass(), "modalAppContext", null);
        setIntField(term35182, term35182.getClass(), "containerSerializedDataVersion", 0);
        setField(term35182, term35182.getClass(), "peer", null);
        setField(term35182, term35182.getClass(), "parent", null);
        setField(term35182, term35182.getClass(), "appContext", null);
        setIntField(term35182, term35182.getClass(), "x", 0);
        setIntField(term35182, term35182.getClass(), "y", 0);
        setIntField(term35182, term35182.getClass(), "width", 0);
        setIntField(term35182, term35182.getClass(), "height", 0);
        setField(term35182, term35182.getClass(), "foreground", null);
        setField(term35182, term35182.getClass(), "background", null);
        setField(term35182, term35182.getClass(), "font", null);
        setField(term35182, term35182.getClass(), "peerFont", null);
        setField(term35182, term35182.getClass(), "cursor", null);
        setField(term35182, term35182.getClass(), "locale", null);
        setField(term35182, term35182.getClass(), "graphicsConfig", null);
        setField(term35182, term35182.getClass(), "bufferStrategy", null);
        setBooleanField(term35182, term35182.getClass(), "ignoreRepaint", false);
        setBooleanField(term35182, term35182.getClass(), "visible", false);
        setBooleanField(term35182, term35182.getClass(), "enabled", false);
        setBooleanField(term35182, term35182.getClass(), "valid", false);
        setField(term35182, term35182.getClass(), "dropTarget", null);
        setField(term35182, term35182.getClass(), "popups", null);
        setField(term35182, term35182.getClass(), "name", null);
        setBooleanField(term35182, term35182.getClass(), "nameExplicitlySet", false);
        setBooleanField(term35182, term35182.getClass(), "focusable", false);
        setIntField(term35182, term35182.getClass(), "isFocusTraversableOverridden", 0);
        setField(term35182, term35182.getClass(), "focusTraversalKeys", null);
        setBooleanField(term35182, term35182.getClass(), "focusTraversalKeysEnabled", false);
        setField(term35182, term35182.getClass(), "acc", null);
        setField(term35182, term35182.getClass(), "minSize", null);
        setBooleanField(term35182, term35182.getClass(), "minSizeSet", false);
        setField(term35182, term35182.getClass(), "prefSize", null);
        setBooleanField(term35182, term35182.getClass(), "prefSizeSet", false);
        setField(term35182, term35182.getClass(), "maxSize", null);
        setBooleanField(term35182, term35182.getClass(), "maxSizeSet", false);
        setField(term35182, term35182.getClass(), "componentOrientation", null);
        setBooleanField(term35182, term35182.getClass(), "newEventsOnly", false);
        setField(term35182, term35182.getClass(), "componentListener", null);
        setField(term35182, term35182.getClass(), "focusListener", null);
        setField(term35182, term35182.getClass(), "hierarchyListener", null);
        setField(term35182, term35182.getClass(), "hierarchyBoundsListener", null);
        setField(term35182, term35182.getClass(), "keyListener", null);
        setField(term35182, term35182.getClass(), "mouseListener", null);
        setField(term35182, term35182.getClass(), "mouseMotionListener", null);
        setField(term35182, term35182.getClass(), "mouseWheelListener", null);
        setField(term35182, term35182.getClass(), "inputMethodListener", null);
        setLongField(term35182, term35182.getClass(), "eventMask", 0L);
        setField(term35182, term35182.getClass(), "changeSupport", null);
        setField(term35182, term35182.getClass(), "objectLock", null);
        setBooleanField(term35182, term35182.getClass(), "isPacked", false);
        setIntField(term35182, term35182.getClass(), "boundsOp", 0);
        setField(term35182, term35182.getClass(), "compoundShape", null);
        setField(term35182, term35182.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term35182, term35182.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term35182, term35182.getClass(), "backgroundEraseDisabled", false);
        setField(term35182, term35182.getClass(), "eventCache", null);
        setBooleanField(term35182, term35182.getClass(), "coalescingEnabled", false);
        setBooleanField(term35182, term35182.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term35182, term35182.getClass(), "componentSerializedDataVersion", 0);
        setField(term35182, term35182.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "centerAlignAllColumns", argTypes, term35182, args);
    }

};


