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
     Object term34230;

    public KTable_centerAlignColumns_7496706489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34230 = newInstance(Class.forName("proto.KTable"));
        setField(term34230, term34230.getClass(), "dataModel", null);
        setField(term34230, term34230.getClass(), "columnModel", null);
        setField(term34230, term34230.getClass(), "selectionModel", null);
        setField(term34230, term34230.getClass(), "tableHeader", null);
        setIntField(term34230, term34230.getClass(), "rowHeight", 0);
        setIntField(term34230, term34230.getClass(), "rowMargin", 0);
        setField(term34230, term34230.getClass(), "gridColor", null);
        setBooleanField(term34230, term34230.getClass(), "showHorizontalLines", false);
        setBooleanField(term34230, term34230.getClass(), "showVerticalLines", false);
        setIntField(term34230, term34230.getClass(), "autoResizeMode", 0);
        setBooleanField(term34230, term34230.getClass(), "autoCreateColumnsFromModel", false);
        setField(term34230, term34230.getClass(), "preferredViewportSize", null);
        setBooleanField(term34230, term34230.getClass(), "rowSelectionAllowed", false);
        setBooleanField(term34230, term34230.getClass(), "cellSelectionEnabled", false);
        setField(term34230, term34230.getClass(), "editorComp", null);
        setField(term34230, term34230.getClass(), "cellEditor", null);
        setIntField(term34230, term34230.getClass(), "editingColumn", 0);
        setIntField(term34230, term34230.getClass(), "editingRow", 0);
        setField(term34230, term34230.getClass(), "defaultRenderersByColumnClass", null);
        setField(term34230, term34230.getClass(), "defaultEditorsByColumnClass", null);
        setField(term34230, term34230.getClass(), "selectionForeground", null);
        setField(term34230, term34230.getClass(), "selectionBackground", null);
        setField(term34230, term34230.getClass(), "rowModel", null);
        setBooleanField(term34230, term34230.getClass(), "dragEnabled", false);
        setBooleanField(term34230, term34230.getClass(), "surrendersFocusOnKeystroke", false);
        setField(term34230, term34230.getClass(), "editorRemover", null);
        setBooleanField(term34230, term34230.getClass(), "columnSelectionAdjusting", false);
        setBooleanField(term34230, term34230.getClass(), "rowSelectionAdjusting", false);
        setField(term34230, term34230.getClass(), "printError", null);
        setBooleanField(term34230, term34230.getClass(), "isRowHeightSet", false);
        setBooleanField(term34230, term34230.getClass(), "updateSelectionOnSort", false);
        setField(term34230, term34230.getClass(), "sortManager", null);
        setBooleanField(term34230, term34230.getClass(), "ignoreSortChange", false);
        setBooleanField(term34230, term34230.getClass(), "sorterChanged", false);
        setBooleanField(term34230, term34230.getClass(), "autoCreateRowSorter", false);
        setBooleanField(term34230, term34230.getClass(), "fillsViewportHeight", false);
        setField(term34230, term34230.getClass(), "dropMode", null);
        setField(term34230, term34230.getClass(), "dropLocation", null);
        setBooleanField(term34230, term34230.getClass(), "updateInProgress", false);
        setBooleanField(term34230, term34230.getClass(), "isAlignmentXSet", false);
        setFloatField(term34230, term34230.getClass(), "alignmentX", 0.0F);
        setBooleanField(term34230, term34230.getClass(), "isAlignmentYSet", false);
        setFloatField(term34230, term34230.getClass(), "alignmentY", 0.0F);
        setField(term34230, term34230.getClass(), "ui", null);
        setField(term34230, term34230.getClass(), "listenerList", null);
        setField(term34230, term34230.getClass(), "clientProperties", null);
        setField(term34230, term34230.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term34230, term34230.getClass(), "autoscrolls", false);
        setField(term34230, term34230.getClass(), "border", null);
        setIntField(term34230, term34230.getClass(), "flags", 0);
        setField(term34230, term34230.getClass(), "inputVerifier", null);
        setBooleanField(term34230, term34230.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term34230, term34230.getClass(), "paintingChild", null);
        setField(term34230, term34230.getClass(), "popupMenu", null);
        setField(term34230, term34230.getClass(), "revalidateRunnableScheduled", null);
        setField(term34230, term34230.getClass(), "focusInputMap", null);
        setField(term34230, term34230.getClass(), "ancestorInputMap", null);
        setField(term34230, term34230.getClass(), "windowInputMap", null);
        setField(term34230, term34230.getClass(), "actionMap", null);
        setField(term34230, term34230.getClass(), "aaHint", null);
        setField(term34230, term34230.getClass(), "lcdRenderingHint", null);
        setField(term34230, term34230.getClass(), "component", null);
        setField(term34230, term34230.getClass(), "layoutMgr", null);
        setField(term34230, term34230.getClass(), "dispatcher", null);
        setField(term34230, term34230.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term34230, term34230.getClass(), "focusCycleRoot", false);
        setBooleanField(term34230, term34230.getClass(), "focusTraversalPolicyProvider", false);
        setField(term34230, term34230.getClass(), "printingThreads", null);
        setBooleanField(term34230, term34230.getClass(), "printing", false);
        setField(term34230, term34230.getClass(), "containerListener", null);
        setIntField(term34230, term34230.getClass(), "listeningChildren", 0);
        setIntField(term34230, term34230.getClass(), "listeningBoundsChildren", 0);
        setIntField(term34230, term34230.getClass(), "descendantsCount", 0);
        setField(term34230, term34230.getClass(), "preserveBackgroundColor", null);
        setIntField(term34230, term34230.getClass(), "numOfHWComponents", 0);
        setIntField(term34230, term34230.getClass(), "numOfLWComponents", 0);
        setField(term34230, term34230.getClass(), "modalComp", null);
        setField(term34230, term34230.getClass(), "modalAppContext", null);
        setIntField(term34230, term34230.getClass(), "containerSerializedDataVersion", 0);
        setField(term34230, term34230.getClass(), "peer", null);
        setField(term34230, term34230.getClass(), "parent", null);
        setField(term34230, term34230.getClass(), "appContext", null);
        setIntField(term34230, term34230.getClass(), "x", 0);
        setIntField(term34230, term34230.getClass(), "y", 0);
        setIntField(term34230, term34230.getClass(), "width", 0);
        setIntField(term34230, term34230.getClass(), "height", 0);
        setField(term34230, term34230.getClass(), "foreground", null);
        setField(term34230, term34230.getClass(), "background", null);
        setField(term34230, term34230.getClass(), "font", null);
        setField(term34230, term34230.getClass(), "peerFont", null);
        setField(term34230, term34230.getClass(), "cursor", null);
        setField(term34230, term34230.getClass(), "locale", null);
        setField(term34230, term34230.getClass(), "graphicsConfig", null);
        setField(term34230, term34230.getClass(), "bufferStrategy", null);
        setBooleanField(term34230, term34230.getClass(), "ignoreRepaint", false);
        setBooleanField(term34230, term34230.getClass(), "visible", false);
        setBooleanField(term34230, term34230.getClass(), "enabled", false);
        setBooleanField(term34230, term34230.getClass(), "valid", false);
        setField(term34230, term34230.getClass(), "dropTarget", null);
        setField(term34230, term34230.getClass(), "popups", null);
        setField(term34230, term34230.getClass(), "name", null);
        setBooleanField(term34230, term34230.getClass(), "nameExplicitlySet", false);
        setBooleanField(term34230, term34230.getClass(), "focusable", false);
        setIntField(term34230, term34230.getClass(), "isFocusTraversableOverridden", 0);
        setField(term34230, term34230.getClass(), "focusTraversalKeys", null);
        setBooleanField(term34230, term34230.getClass(), "focusTraversalKeysEnabled", false);
        setField(term34230, term34230.getClass(), "acc", null);
        setField(term34230, term34230.getClass(), "minSize", null);
        setBooleanField(term34230, term34230.getClass(), "minSizeSet", false);
        setField(term34230, term34230.getClass(), "prefSize", null);
        setBooleanField(term34230, term34230.getClass(), "prefSizeSet", false);
        setField(term34230, term34230.getClass(), "maxSize", null);
        setBooleanField(term34230, term34230.getClass(), "maxSizeSet", false);
        setField(term34230, term34230.getClass(), "componentOrientation", null);
        setBooleanField(term34230, term34230.getClass(), "newEventsOnly", false);
        setField(term34230, term34230.getClass(), "componentListener", null);
        setField(term34230, term34230.getClass(), "focusListener", null);
        setField(term34230, term34230.getClass(), "hierarchyListener", null);
        setField(term34230, term34230.getClass(), "hierarchyBoundsListener", null);
        setField(term34230, term34230.getClass(), "keyListener", null);
        setField(term34230, term34230.getClass(), "mouseListener", null);
        setField(term34230, term34230.getClass(), "mouseMotionListener", null);
        setField(term34230, term34230.getClass(), "mouseWheelListener", null);
        setField(term34230, term34230.getClass(), "inputMethodListener", null);
        setLongField(term34230, term34230.getClass(), "eventMask", 0L);
        setField(term34230, term34230.getClass(), "changeSupport", null);
        setField(term34230, term34230.getClass(), "objectLock", null);
        setBooleanField(term34230, term34230.getClass(), "isPacked", false);
        setIntField(term34230, term34230.getClass(), "boundsOp", 0);
        setField(term34230, term34230.getClass(), "compoundShape", null);
        setField(term34230, term34230.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term34230, term34230.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term34230, term34230.getClass(), "backgroundEraseDisabled", false);
        setField(term34230, term34230.getClass(), "eventCache", null);
        setBooleanField(term34230, term34230.getClass(), "coalescingEnabled", false);
        setBooleanField(term34230, term34230.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term34230, term34230.getClass(), "componentSerializedDataVersion", 0);
        setField(term34230, term34230.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "centerAlignColumns", argTypes, term34230, args);
    }

};


