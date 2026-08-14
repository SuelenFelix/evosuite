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

public class KTable_centerAlignColumns_7496706489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34263;

    public KTable_centerAlignColumns_7496706489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34263 = newInstance(Class.forName("proto.KTable"));
        setField(term34263, term34263.getClass(), "dataModel", null);
        setField(term34263, term34263.getClass(), "columnModel", null);
        setField(term34263, term34263.getClass(), "selectionModel", null);
        setField(term34263, term34263.getClass(), "tableHeader", null);
        setIntField(term34263, term34263.getClass(), "rowHeight", 0);
        setIntField(term34263, term34263.getClass(), "rowMargin", 0);
        setField(term34263, term34263.getClass(), "gridColor", null);
        setBooleanField(term34263, term34263.getClass(), "showHorizontalLines", false);
        setBooleanField(term34263, term34263.getClass(), "showVerticalLines", false);
        setIntField(term34263, term34263.getClass(), "autoResizeMode", 0);
        setBooleanField(term34263, term34263.getClass(), "autoCreateColumnsFromModel", false);
        setField(term34263, term34263.getClass(), "preferredViewportSize", null);
        setBooleanField(term34263, term34263.getClass(), "rowSelectionAllowed", false);
        setBooleanField(term34263, term34263.getClass(), "cellSelectionEnabled", false);
        setField(term34263, term34263.getClass(), "editorComp", null);
        setField(term34263, term34263.getClass(), "cellEditor", null);
        setIntField(term34263, term34263.getClass(), "editingColumn", 0);
        setIntField(term34263, term34263.getClass(), "editingRow", 0);
        setField(term34263, term34263.getClass(), "defaultRenderersByColumnClass", null);
        setField(term34263, term34263.getClass(), "defaultEditorsByColumnClass", null);
        setField(term34263, term34263.getClass(), "selectionForeground", null);
        setField(term34263, term34263.getClass(), "selectionBackground", null);
        setField(term34263, term34263.getClass(), "rowModel", null);
        setBooleanField(term34263, term34263.getClass(), "dragEnabled", false);
        setBooleanField(term34263, term34263.getClass(), "surrendersFocusOnKeystroke", false);
        setField(term34263, term34263.getClass(), "editorRemover", null);
        setBooleanField(term34263, term34263.getClass(), "columnSelectionAdjusting", false);
        setBooleanField(term34263, term34263.getClass(), "rowSelectionAdjusting", false);
        setField(term34263, term34263.getClass(), "printError", null);
        setBooleanField(term34263, term34263.getClass(), "isRowHeightSet", false);
        setBooleanField(term34263, term34263.getClass(), "updateSelectionOnSort", false);
        setField(term34263, term34263.getClass(), "sortManager", null);
        setBooleanField(term34263, term34263.getClass(), "ignoreSortChange", false);
        setBooleanField(term34263, term34263.getClass(), "sorterChanged", false);
        setBooleanField(term34263, term34263.getClass(), "autoCreateRowSorter", false);
        setBooleanField(term34263, term34263.getClass(), "fillsViewportHeight", false);
        setField(term34263, term34263.getClass(), "dropMode", null);
        setField(term34263, term34263.getClass(), "dropLocation", null);
        setBooleanField(term34263, term34263.getClass(), "updateInProgress", false);
        setBooleanField(term34263, term34263.getClass(), "isAlignmentXSet", false);
        setFloatField(term34263, term34263.getClass(), "alignmentX", 0.0F);
        setBooleanField(term34263, term34263.getClass(), "isAlignmentYSet", false);
        setFloatField(term34263, term34263.getClass(), "alignmentY", 0.0F);
        setField(term34263, term34263.getClass(), "ui", null);
        setField(term34263, term34263.getClass(), "listenerList", null);
        setField(term34263, term34263.getClass(), "clientProperties", null);
        setField(term34263, term34263.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term34263, term34263.getClass(), "autoscrolls", false);
        setField(term34263, term34263.getClass(), "border", null);
        setIntField(term34263, term34263.getClass(), "flags", 0);
        setField(term34263, term34263.getClass(), "inputVerifier", null);
        setBooleanField(term34263, term34263.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term34263, term34263.getClass(), "paintingChild", null);
        setField(term34263, term34263.getClass(), "popupMenu", null);
        setField(term34263, term34263.getClass(), "revalidateRunnableScheduled", null);
        setField(term34263, term34263.getClass(), "focusInputMap", null);
        setField(term34263, term34263.getClass(), "ancestorInputMap", null);
        setField(term34263, term34263.getClass(), "windowInputMap", null);
        setField(term34263, term34263.getClass(), "actionMap", null);
        setField(term34263, term34263.getClass(), "aaHint", null);
        setField(term34263, term34263.getClass(), "lcdRenderingHint", null);
        setField(term34263, term34263.getClass(), "component", null);
        setField(term34263, term34263.getClass(), "layoutMgr", null);
        setField(term34263, term34263.getClass(), "dispatcher", null);
        setField(term34263, term34263.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term34263, term34263.getClass(), "focusCycleRoot", false);
        setBooleanField(term34263, term34263.getClass(), "focusTraversalPolicyProvider", false);
        setField(term34263, term34263.getClass(), "printingThreads", null);
        setBooleanField(term34263, term34263.getClass(), "printing", false);
        setField(term34263, term34263.getClass(), "containerListener", null);
        setIntField(term34263, term34263.getClass(), "listeningChildren", 0);
        setIntField(term34263, term34263.getClass(), "listeningBoundsChildren", 0);
        setIntField(term34263, term34263.getClass(), "descendantsCount", 0);
        setField(term34263, term34263.getClass(), "preserveBackgroundColor", null);
        setIntField(term34263, term34263.getClass(), "numOfHWComponents", 0);
        setIntField(term34263, term34263.getClass(), "numOfLWComponents", 0);
        setField(term34263, term34263.getClass(), "modalComp", null);
        setField(term34263, term34263.getClass(), "modalAppContext", null);
        setIntField(term34263, term34263.getClass(), "containerSerializedDataVersion", 0);
        setField(term34263, term34263.getClass(), "peer", null);
        setField(term34263, term34263.getClass(), "parent", null);
        setField(term34263, term34263.getClass(), "appContext", null);
        setIntField(term34263, term34263.getClass(), "x", 0);
        setIntField(term34263, term34263.getClass(), "y", 0);
        setIntField(term34263, term34263.getClass(), "width", 0);
        setIntField(term34263, term34263.getClass(), "height", 0);
        setField(term34263, term34263.getClass(), "foreground", null);
        setField(term34263, term34263.getClass(), "background", null);
        setField(term34263, term34263.getClass(), "font", null);
        setField(term34263, term34263.getClass(), "peerFont", null);
        setField(term34263, term34263.getClass(), "cursor", null);
        setField(term34263, term34263.getClass(), "locale", null);
        setField(term34263, term34263.getClass(), "graphicsConfig", null);
        setField(term34263, term34263.getClass(), "bufferStrategy", null);
        setBooleanField(term34263, term34263.getClass(), "ignoreRepaint", false);
        setBooleanField(term34263, term34263.getClass(), "visible", false);
        setBooleanField(term34263, term34263.getClass(), "enabled", false);
        setBooleanField(term34263, term34263.getClass(), "valid", false);
        setField(term34263, term34263.getClass(), "dropTarget", null);
        setField(term34263, term34263.getClass(), "popups", null);
        setField(term34263, term34263.getClass(), "name", null);
        setBooleanField(term34263, term34263.getClass(), "nameExplicitlySet", false);
        setBooleanField(term34263, term34263.getClass(), "focusable", false);
        setIntField(term34263, term34263.getClass(), "isFocusTraversableOverridden", 0);
        setField(term34263, term34263.getClass(), "focusTraversalKeys", null);
        setBooleanField(term34263, term34263.getClass(), "focusTraversalKeysEnabled", false);
        setField(term34263, term34263.getClass(), "acc", null);
        setField(term34263, term34263.getClass(), "minSize", null);
        setBooleanField(term34263, term34263.getClass(), "minSizeSet", false);
        setField(term34263, term34263.getClass(), "prefSize", null);
        setBooleanField(term34263, term34263.getClass(), "prefSizeSet", false);
        setField(term34263, term34263.getClass(), "maxSize", null);
        setBooleanField(term34263, term34263.getClass(), "maxSizeSet", false);
        setField(term34263, term34263.getClass(), "componentOrientation", null);
        setBooleanField(term34263, term34263.getClass(), "newEventsOnly", false);
        setField(term34263, term34263.getClass(), "componentListener", null);
        setField(term34263, term34263.getClass(), "focusListener", null);
        setField(term34263, term34263.getClass(), "hierarchyListener", null);
        setField(term34263, term34263.getClass(), "hierarchyBoundsListener", null);
        setField(term34263, term34263.getClass(), "keyListener", null);
        setField(term34263, term34263.getClass(), "mouseListener", null);
        setField(term34263, term34263.getClass(), "mouseMotionListener", null);
        setField(term34263, term34263.getClass(), "mouseWheelListener", null);
        setField(term34263, term34263.getClass(), "inputMethodListener", null);
        setLongField(term34263, term34263.getClass(), "eventMask", 0L);
        setField(term34263, term34263.getClass(), "changeSupport", null);
        setField(term34263, term34263.getClass(), "objectLock", null);
        setBooleanField(term34263, term34263.getClass(), "isPacked", false);
        setIntField(term34263, term34263.getClass(), "boundsOp", 0);
        setField(term34263, term34263.getClass(), "compoundShape", null);
        setField(term34263, term34263.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term34263, term34263.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term34263, term34263.getClass(), "backgroundEraseDisabled", false);
        setField(term34263, term34263.getClass(), "eventCache", null);
        setBooleanField(term34263, term34263.getClass(), "coalescingEnabled", false);
        setBooleanField(term34263, term34263.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term34263, term34263.getClass(), "componentSerializedDataVersion", 0);
        setField(term34263, term34263.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "centerAlignColumns", argTypes, term34263, args);
    }

};


