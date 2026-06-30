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
     Object term35149;

    public KTable_centerAlignAllColumns_28704500311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35149 = newInstance(Class.forName("proto.KTable"));
        setField(term35149, term35149.getClass(), "dataModel", null);
        setField(term35149, term35149.getClass(), "columnModel", null);
        setField(term35149, term35149.getClass(), "selectionModel", null);
        setField(term35149, term35149.getClass(), "tableHeader", null);
        setIntField(term35149, term35149.getClass(), "rowHeight", 0);
        setIntField(term35149, term35149.getClass(), "rowMargin", 0);
        setField(term35149, term35149.getClass(), "gridColor", null);
        setBooleanField(term35149, term35149.getClass(), "showHorizontalLines", false);
        setBooleanField(term35149, term35149.getClass(), "showVerticalLines", false);
        setIntField(term35149, term35149.getClass(), "autoResizeMode", 0);
        setBooleanField(term35149, term35149.getClass(), "autoCreateColumnsFromModel", false);
        setField(term35149, term35149.getClass(), "preferredViewportSize", null);
        setBooleanField(term35149, term35149.getClass(), "rowSelectionAllowed", false);
        setBooleanField(term35149, term35149.getClass(), "cellSelectionEnabled", false);
        setField(term35149, term35149.getClass(), "editorComp", null);
        setField(term35149, term35149.getClass(), "cellEditor", null);
        setIntField(term35149, term35149.getClass(), "editingColumn", 0);
        setIntField(term35149, term35149.getClass(), "editingRow", 0);
        setField(term35149, term35149.getClass(), "defaultRenderersByColumnClass", null);
        setField(term35149, term35149.getClass(), "defaultEditorsByColumnClass", null);
        setField(term35149, term35149.getClass(), "selectionForeground", null);
        setField(term35149, term35149.getClass(), "selectionBackground", null);
        setField(term35149, term35149.getClass(), "rowModel", null);
        setBooleanField(term35149, term35149.getClass(), "dragEnabled", false);
        setBooleanField(term35149, term35149.getClass(), "surrendersFocusOnKeystroke", false);
        setField(term35149, term35149.getClass(), "editorRemover", null);
        setBooleanField(term35149, term35149.getClass(), "columnSelectionAdjusting", false);
        setBooleanField(term35149, term35149.getClass(), "rowSelectionAdjusting", false);
        setField(term35149, term35149.getClass(), "printError", null);
        setBooleanField(term35149, term35149.getClass(), "isRowHeightSet", false);
        setBooleanField(term35149, term35149.getClass(), "updateSelectionOnSort", false);
        setField(term35149, term35149.getClass(), "sortManager", null);
        setBooleanField(term35149, term35149.getClass(), "ignoreSortChange", false);
        setBooleanField(term35149, term35149.getClass(), "sorterChanged", false);
        setBooleanField(term35149, term35149.getClass(), "autoCreateRowSorter", false);
        setBooleanField(term35149, term35149.getClass(), "fillsViewportHeight", false);
        setField(term35149, term35149.getClass(), "dropMode", null);
        setField(term35149, term35149.getClass(), "dropLocation", null);
        setBooleanField(term35149, term35149.getClass(), "updateInProgress", false);
        setBooleanField(term35149, term35149.getClass(), "isAlignmentXSet", false);
        setFloatField(term35149, term35149.getClass(), "alignmentX", 0.0F);
        setBooleanField(term35149, term35149.getClass(), "isAlignmentYSet", false);
        setFloatField(term35149, term35149.getClass(), "alignmentY", 0.0F);
        setField(term35149, term35149.getClass(), "ui", null);
        setField(term35149, term35149.getClass(), "listenerList", null);
        setField(term35149, term35149.getClass(), "clientProperties", null);
        setField(term35149, term35149.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term35149, term35149.getClass(), "autoscrolls", false);
        setField(term35149, term35149.getClass(), "border", null);
        setIntField(term35149, term35149.getClass(), "flags", 0);
        setField(term35149, term35149.getClass(), "inputVerifier", null);
        setBooleanField(term35149, term35149.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term35149, term35149.getClass(), "paintingChild", null);
        setField(term35149, term35149.getClass(), "popupMenu", null);
        setField(term35149, term35149.getClass(), "revalidateRunnableScheduled", null);
        setField(term35149, term35149.getClass(), "focusInputMap", null);
        setField(term35149, term35149.getClass(), "ancestorInputMap", null);
        setField(term35149, term35149.getClass(), "windowInputMap", null);
        setField(term35149, term35149.getClass(), "actionMap", null);
        setField(term35149, term35149.getClass(), "aaHint", null);
        setField(term35149, term35149.getClass(), "lcdRenderingHint", null);
        setField(term35149, term35149.getClass(), "component", null);
        setField(term35149, term35149.getClass(), "layoutMgr", null);
        setField(term35149, term35149.getClass(), "dispatcher", null);
        setField(term35149, term35149.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term35149, term35149.getClass(), "focusCycleRoot", false);
        setBooleanField(term35149, term35149.getClass(), "focusTraversalPolicyProvider", false);
        setField(term35149, term35149.getClass(), "printingThreads", null);
        setBooleanField(term35149, term35149.getClass(), "printing", false);
        setField(term35149, term35149.getClass(), "containerListener", null);
        setIntField(term35149, term35149.getClass(), "listeningChildren", 0);
        setIntField(term35149, term35149.getClass(), "listeningBoundsChildren", 0);
        setIntField(term35149, term35149.getClass(), "descendantsCount", 0);
        setField(term35149, term35149.getClass(), "preserveBackgroundColor", null);
        setIntField(term35149, term35149.getClass(), "numOfHWComponents", 0);
        setIntField(term35149, term35149.getClass(), "numOfLWComponents", 0);
        setField(term35149, term35149.getClass(), "modalComp", null);
        setField(term35149, term35149.getClass(), "modalAppContext", null);
        setIntField(term35149, term35149.getClass(), "containerSerializedDataVersion", 0);
        setField(term35149, term35149.getClass(), "peer", null);
        setField(term35149, term35149.getClass(), "parent", null);
        setField(term35149, term35149.getClass(), "appContext", null);
        setIntField(term35149, term35149.getClass(), "x", 0);
        setIntField(term35149, term35149.getClass(), "y", 0);
        setIntField(term35149, term35149.getClass(), "width", 0);
        setIntField(term35149, term35149.getClass(), "height", 0);
        setField(term35149, term35149.getClass(), "foreground", null);
        setField(term35149, term35149.getClass(), "background", null);
        setField(term35149, term35149.getClass(), "font", null);
        setField(term35149, term35149.getClass(), "peerFont", null);
        setField(term35149, term35149.getClass(), "cursor", null);
        setField(term35149, term35149.getClass(), "locale", null);
        setField(term35149, term35149.getClass(), "graphicsConfig", null);
        setField(term35149, term35149.getClass(), "bufferStrategy", null);
        setBooleanField(term35149, term35149.getClass(), "ignoreRepaint", false);
        setBooleanField(term35149, term35149.getClass(), "visible", false);
        setBooleanField(term35149, term35149.getClass(), "enabled", false);
        setBooleanField(term35149, term35149.getClass(), "valid", false);
        setField(term35149, term35149.getClass(), "dropTarget", null);
        setField(term35149, term35149.getClass(), "popups", null);
        setField(term35149, term35149.getClass(), "name", null);
        setBooleanField(term35149, term35149.getClass(), "nameExplicitlySet", false);
        setBooleanField(term35149, term35149.getClass(), "focusable", false);
        setIntField(term35149, term35149.getClass(), "isFocusTraversableOverridden", 0);
        setField(term35149, term35149.getClass(), "focusTraversalKeys", null);
        setBooleanField(term35149, term35149.getClass(), "focusTraversalKeysEnabled", false);
        setField(term35149, term35149.getClass(), "acc", null);
        setField(term35149, term35149.getClass(), "minSize", null);
        setBooleanField(term35149, term35149.getClass(), "minSizeSet", false);
        setField(term35149, term35149.getClass(), "prefSize", null);
        setBooleanField(term35149, term35149.getClass(), "prefSizeSet", false);
        setField(term35149, term35149.getClass(), "maxSize", null);
        setBooleanField(term35149, term35149.getClass(), "maxSizeSet", false);
        setField(term35149, term35149.getClass(), "componentOrientation", null);
        setBooleanField(term35149, term35149.getClass(), "newEventsOnly", false);
        setField(term35149, term35149.getClass(), "componentListener", null);
        setField(term35149, term35149.getClass(), "focusListener", null);
        setField(term35149, term35149.getClass(), "hierarchyListener", null);
        setField(term35149, term35149.getClass(), "hierarchyBoundsListener", null);
        setField(term35149, term35149.getClass(), "keyListener", null);
        setField(term35149, term35149.getClass(), "mouseListener", null);
        setField(term35149, term35149.getClass(), "mouseMotionListener", null);
        setField(term35149, term35149.getClass(), "mouseWheelListener", null);
        setField(term35149, term35149.getClass(), "inputMethodListener", null);
        setLongField(term35149, term35149.getClass(), "eventMask", 0L);
        setField(term35149, term35149.getClass(), "changeSupport", null);
        setField(term35149, term35149.getClass(), "objectLock", null);
        setBooleanField(term35149, term35149.getClass(), "isPacked", false);
        setIntField(term35149, term35149.getClass(), "boundsOp", 0);
        setField(term35149, term35149.getClass(), "compoundShape", null);
        setField(term35149, term35149.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term35149, term35149.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term35149, term35149.getClass(), "backgroundEraseDisabled", false);
        setField(term35149, term35149.getClass(), "eventCache", null);
        setBooleanField(term35149, term35149.getClass(), "coalescingEnabled", false);
        setBooleanField(term35149, term35149.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term35149, term35149.getClass(), "componentSerializedDataVersion", 0);
        setField(term35149, term35149.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "centerAlignAllColumns", argTypes, term35149, args);
    }

};


