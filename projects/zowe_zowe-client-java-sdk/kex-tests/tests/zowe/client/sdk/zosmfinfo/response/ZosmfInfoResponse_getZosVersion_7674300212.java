package zowe.client.sdk.zosmfinfo.response;

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
import static zowe.client.sdk.zosmfinfo.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ZosmfInfoResponse_getZosVersion_7674300212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term646;

    public ZosmfInfoResponse_getZosVersion_7674300212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term646 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.response.ZosmfInfoResponse"));
        Object[] term731 = (Object[]) newArray("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin", 4);
        Object term732 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        Object term769 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        Object term806 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        Object term843 = newInstance(Class.forName("zowe.client.sdk.zosmfinfo.model.ZosmfPlugin"));
        setField(term646, term646.getClass(), "zosVersion", "TEParAifyi");
        setField(term646, term646.getClass(), "zosmfPort", "OWDIEULEFu");
        setField(term646, term646.getClass(), "zosmfVersion", "dWRymuLBtr");
        setField(term646, term646.getClass(), "zosmfHostName", "AijpHYOFuy");
        setField(term646, term646.getClass(), "zosmfSafRealm", "SbAoxhfrkn");
        setField(term646, term646.getClass(), "zosmfFullVersion", "kuTXqwMtDB");
        setField(term646, term646.getClass(), "apiVersion", "Ghbwtircqb");
        setField(term732, term732.getClass(), "pluginVersion", "xrwlQZdwCp");
        setField(term732, term732.getClass(), "pluginDefaultName", "IDCWpPLRkE");
        setField(term732, term732.getClass(), "pluginStatus", "nyiiPDVjAc");
        setElement(term731, 0, term732);
        setField(term769, term769.getClass(), "pluginVersion", "aKnKipADSo");
        setField(term769, term769.getClass(), "pluginDefaultName", "wSQxaModmm");
        setField(term769, term769.getClass(), "pluginStatus", "UlajhuVLaP");
        setElement(term731, 1, term769);
        setField(term806, term806.getClass(), "pluginVersion", "gGSMzuGICf");
        setField(term806, term806.getClass(), "pluginDefaultName", "hxCBltsObl");
        setField(term806, term806.getClass(), "pluginStatus", "BndsHwAFMv");
        setElement(term731, 2, term806);
        setField(term843, term843.getClass(), "pluginVersion", "GzFkzHGYFt");
        setField(term843, term843.getClass(), "pluginDefaultName", "tShwQLRGNe");
        setField(term843, term843.getClass(), "pluginStatus", "LvtrsXUliU");
        setElement(term731, 3, term843);
        setField(term646, term646.getClass(), "zosmfPluginsInfo", term731);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosmfinfo.response.ZosmfInfoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getZosVersion", argTypes, term646, args);
    }

};


