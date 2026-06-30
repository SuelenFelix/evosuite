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

public class KTable_getProperSize_14741097005 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32425;

    public KTable_getProperSize_14741097005() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32425 = newInstance(Class.forName("proto.KTable"));
        setField(term32425, term32425.getClass(), "dataModel", null);
        setField(term32425, term32425.getClass(), "columnModel", null);
        setField(term32425, term32425.getClass(), "selectionModel", null);
        setField(term32425, term32425.getClass(), "tableHeader", null);
        setIntField(term32425, term32425.getClass(), "rowHeight", 0);
        setIntField(term32425, term32425.getClass(), "rowMargin", 0);
        setField(term32425, term32425.getClass(), "gridColor", null);
        setBooleanField(term32425, term32425.getClass(), "showHorizontalLines", false);
        setBooleanField(term32425, term32425.getClass(), "showVerticalLines", false);
        setIntField(term32425, term32425.getClass(), "autoResizeMode", 0);
        setBooleanField(term32425, term32425.getClass(), "autoCreateColumnsFromModel", false);
        setField(term32425, term32425.getClass(), "preferredViewportSize", null);
        setBooleanField(term32425, term32425.getClass(), "rowSelectionAllowed", false);
        setBooleanField(term32425, term32425.getClass(), "cellSelectionEnabled", false);
        setField(term32425, term32425.getClass(), "editorComp", null);
        setField(term32425, term32425.getClass(), "cellEditor", null);
        setIntField(term32425, term32425.getClass(), "editingColumn", 0);
        setIntField(term32425, term32425.getClass(), "editingRow", 0);
        setField(term32425, term32425.getClass(), "defaultRenderersByColumnClass", null);
        setField(term32425, term32425.getClass(), "defaultEditorsByColumnClass", null);
        setField(term32425, term32425.getClass(), "selectionForeground", null);
        setField(term32425, term32425.getClass(), "selectionBackground", null);
        setField(term32425, term32425.getClass(), "rowModel", null);
        setBooleanField(term32425, term32425.getClass(), "dragEnabled", false);
        setBooleanField(term32425, term32425.getClass(), "surrendersFocusOnKeystroke", false);
        setField(term32425, term32425.getClass(), "editorRemover", null);
        setBooleanField(term32425, term32425.getClass(), "columnSelectionAdjusting", false);
        setBooleanField(term32425, term32425.getClass(), "rowSelectionAdjusting", false);
        setField(term32425, term32425.getClass(), "printError", null);
        setBooleanField(term32425, term32425.getClass(), "isRowHeightSet", false);
        setBooleanField(term32425, term32425.getClass(), "updateSelectionOnSort", false);
        setField(term32425, term32425.getClass(), "sortManager", null);
        setBooleanField(term32425, term32425.getClass(), "ignoreSortChange", false);
        setBooleanField(term32425, term32425.getClass(), "sorterChanged", false);
        setBooleanField(term32425, term32425.getClass(), "autoCreateRowSorter", false);
        setBooleanField(term32425, term32425.getClass(), "fillsViewportHeight", false);
        setField(term32425, term32425.getClass(), "dropMode", null);
        setField(term32425, term32425.getClass(), "dropLocation", null);
        setBooleanField(term32425, term32425.getClass(), "updateInProgress", false);
        setBooleanField(term32425, term32425.getClass(), "isAlignmentXSet", false);
        setFloatField(term32425, term32425.getClass(), "alignmentX", 0.0F);
        setBooleanField(term32425, term32425.getClass(), "isAlignmentYSet", false);
        setFloatField(term32425, term32425.getClass(), "alignmentY", 0.0F);
        setField(term32425, term32425.getClass(), "ui", null);
        setField(term32425, term32425.getClass(), "listenerList", null);
        setField(term32425, term32425.getClass(), "clientProperties", null);
        setField(term32425, term32425.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term32425, term32425.getClass(), "autoscrolls", false);
        setField(term32425, term32425.getClass(), "border", null);
        setIntField(term32425, term32425.getClass(), "flags", 0);
        setField(term32425, term32425.getClass(), "inputVerifier", null);
        setBooleanField(term32425, term32425.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term32425, term32425.getClass(), "paintingChild", null);
        setField(term32425, term32425.getClass(), "popupMenu", null);
        setField(term32425, term32425.getClass(), "revalidateRunnableScheduled", null);
        setField(term32425, term32425.getClass(), "focusInputMap", null);
        setField(term32425, term32425.getClass(), "ancestorInputMap", null);
        setField(term32425, term32425.getClass(), "windowInputMap", null);
        setField(term32425, term32425.getClass(), "actionMap", null);
        setField(term32425, term32425.getClass(), "aaHint", null);
        setField(term32425, term32425.getClass(), "lcdRenderingHint", null);
        setField(term32425, term32425.getClass(), "component", null);
        setField(term32425, term32425.getClass(), "layoutMgr", null);
        setField(term32425, term32425.getClass(), "dispatcher", null);
        setField(term32425, term32425.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term32425, term32425.getClass(), "focusCycleRoot", false);
        setBooleanField(term32425, term32425.getClass(), "focusTraversalPolicyProvider", false);
        setField(term32425, term32425.getClass(), "printingThreads", null);
        setBooleanField(term32425, term32425.getClass(), "printing", false);
        setField(term32425, term32425.getClass(), "containerListener", null);
        setIntField(term32425, term32425.getClass(), "listeningChildren", 0);
        setIntField(term32425, term32425.getClass(), "listeningBoundsChildren", 0);
        setIntField(term32425, term32425.getClass(), "descendantsCount", 0);
        setField(term32425, term32425.getClass(), "preserveBackgroundColor", null);
        setIntField(term32425, term32425.getClass(), "numOfHWComponents", 0);
        setIntField(term32425, term32425.getClass(), "numOfLWComponents", 0);
        setField(term32425, term32425.getClass(), "modalComp", null);
        setField(term32425, term32425.getClass(), "modalAppContext", null);
        setIntField(term32425, term32425.getClass(), "containerSerializedDataVersion", 0);
        setField(term32425, term32425.getClass(), "peer", null);
        setField(term32425, term32425.getClass(), "parent", null);
        setField(term32425, term32425.getClass(), "appContext", null);
        setIntField(term32425, term32425.getClass(), "x", 0);
        setIntField(term32425, term32425.getClass(), "y", 0);
        setIntField(term32425, term32425.getClass(), "width", 0);
        setIntField(term32425, term32425.getClass(), "height", 0);
        setField(term32425, term32425.getClass(), "foreground", null);
        setField(term32425, term32425.getClass(), "background", null);
        setField(term32425, term32425.getClass(), "font", null);
        setField(term32425, term32425.getClass(), "peerFont", null);
        setField(term32425, term32425.getClass(), "cursor", null);
        setField(term32425, term32425.getClass(), "locale", null);
        setField(term32425, term32425.getClass(), "graphicsConfig", null);
        setField(term32425, term32425.getClass(), "bufferStrategy", null);
        setBooleanField(term32425, term32425.getClass(), "ignoreRepaint", false);
        setBooleanField(term32425, term32425.getClass(), "visible", false);
        setBooleanField(term32425, term32425.getClass(), "enabled", false);
        setBooleanField(term32425, term32425.getClass(), "valid", false);
        setField(term32425, term32425.getClass(), "dropTarget", null);
        setField(term32425, term32425.getClass(), "popups", null);
        setField(term32425, term32425.getClass(), "name", null);
        setBooleanField(term32425, term32425.getClass(), "nameExplicitlySet", false);
        setBooleanField(term32425, term32425.getClass(), "focusable", false);
        setIntField(term32425, term32425.getClass(), "isFocusTraversableOverridden", 0);
        setField(term32425, term32425.getClass(), "focusTraversalKeys", null);
        setBooleanField(term32425, term32425.getClass(), "focusTraversalKeysEnabled", false);
        setField(term32425, term32425.getClass(), "acc", null);
        setField(term32425, term32425.getClass(), "minSize", null);
        setBooleanField(term32425, term32425.getClass(), "minSizeSet", false);
        setField(term32425, term32425.getClass(), "prefSize", null);
        setBooleanField(term32425, term32425.getClass(), "prefSizeSet", false);
        setField(term32425, term32425.getClass(), "maxSize", null);
        setBooleanField(term32425, term32425.getClass(), "maxSizeSet", false);
        setField(term32425, term32425.getClass(), "componentOrientation", null);
        setBooleanField(term32425, term32425.getClass(), "newEventsOnly", false);
        setField(term32425, term32425.getClass(), "componentListener", null);
        setField(term32425, term32425.getClass(), "focusListener", null);
        setField(term32425, term32425.getClass(), "hierarchyListener", null);
        setField(term32425, term32425.getClass(), "hierarchyBoundsListener", null);
        setField(term32425, term32425.getClass(), "keyListener", null);
        setField(term32425, term32425.getClass(), "mouseListener", null);
        setField(term32425, term32425.getClass(), "mouseMotionListener", null);
        setField(term32425, term32425.getClass(), "mouseWheelListener", null);
        setField(term32425, term32425.getClass(), "inputMethodListener", null);
        setLongField(term32425, term32425.getClass(), "eventMask", 0L);
        setField(term32425, term32425.getClass(), "changeSupport", null);
        setField(term32425, term32425.getClass(), "objectLock", null);
        setBooleanField(term32425, term32425.getClass(), "isPacked", false);
        setIntField(term32425, term32425.getClass(), "boundsOp", 0);
        setField(term32425, term32425.getClass(), "compoundShape", null);
        setField(term32425, term32425.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term32425, term32425.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term32425, term32425.getClass(), "backgroundEraseDisabled", false);
        setField(term32425, term32425.getClass(), "eventCache", null);
        setBooleanField(term32425, term32425.getClass(), "coalescingEnabled", false);
        setBooleanField(term32425, term32425.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term32425, term32425.getClass(), "componentSerializedDataVersion", 0);
        setField(term32425, term32425.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProperSize", argTypes, term32425, args);
    }

};


