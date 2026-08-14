package com.github.cuteluobo.livedanmuarchive.service.Impl.persistence;

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
import static com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Integer;

public class Sqlite2BiliBasFormatExportServiceImpl_createColorString_14351119747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8455;
     Object term8628;

    public Sqlite2BiliBasFormatExportServiceImpl_createColorString_14351119747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8671 = Class.forName((String) "java.io.File$PathStatus");
        Field term8670 = ((Class) term8671).getDeclaredField((String) "INVALID");
        ((Field) term8670).setAccessible(true);
        Object enum29 = ((Field) term8670).get((Object) null);
        Class<? extends Object> term8824 = Class.forName((String) "java.io.File$PathStatus");
        Field term8823 = ((Class) term8824).getDeclaredField((String) "CHECKED");
        ((Field) term8823).setAccessible(true);
        Object enum30 = ((Field) term8823).get((Object) null);
        Object term8531 = newInstance(Class.forName("java.io.File"));
        setField(term8531, term8531.getClass(), "path", "");
        setField(term8531, term8531.getClass(), "status", enum30);
        setIntField(term8531, term8531.getClass(), "prefixLength", -1222614956);
        setField(term8531, term8531.getClass(), "filePath", null);
        Object term8536 = newInstance(Class.forName("java.io.File"));
        setField(term8536, term8536.getClass(), "path", "");
        setField(term8536, term8536.getClass(), "status", enum29);
        setIntField(term8536, term8536.getClass(), "prefixLength", -1870495012);
        setField(term8536, term8536.getClass(), "filePath", null);
        Object term8539 = newInstance(Class.forName("java.io.File"));
        setField(term8539, term8539.getClass(), "path", "");
        setField(term8539, term8539.getClass(), "status", enum29);
        setIntField(term8539, term8539.getClass(), "prefixLength", -1310015129);
        setField(term8539, term8539.getClass(), "filePath", null);
        Object term8542 = newInstance(Class.forName("java.io.File"));
        setField(term8542, term8542.getClass(), "path", "");
        setField(term8542, term8542.getClass(), "status", enum30);
        setIntField(term8542, term8542.getClass(), "prefixLength", -2104981311);
        setField(term8542, term8542.getClass(), "filePath", null);
        Object term8545 = newInstance(Class.forName("java.io.File"));
        setField(term8545, term8545.getClass(), "path", "");
        setField(term8545, term8545.getClass(), "status", enum29);
        setIntField(term8545, term8545.getClass(), "prefixLength", -571169753);
        setField(term8545, term8545.getClass(), "filePath", null);
        Object term8548 = newInstance(Class.forName("java.io.File"));
        setField(term8548, term8548.getClass(), "path", "");
        setField(term8548, term8548.getClass(), "status", enum30);
        setIntField(term8548, term8548.getClass(), "prefixLength", 318591690);
        setField(term8548, term8548.getClass(), "filePath", null);
        ArrayList term8529 = new ArrayList();
        ((ArrayList) term8529).add(term8531);
        ((ArrayList) term8529).add(term8536);
        ((ArrayList) term8529).add(term8539);
        ((ArrayList) term8529).add(term8542);
        ((ArrayList) term8529).add(term8545);
        ((ArrayList) term8529).add(term8548);
        HashMap term8597 = new HashMap();
        HashMap term8614 = new HashMap();
        term8455 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2BiliBasFormatExportServiceImpl"));
        Object term8492 = newInstance(Class.forName("java.io.File"));
        setField(term8455, term8455.getClass(), "NORMAL_TRACK_STYLE_PREFIX", "rYbtIDVdnd");
        setField(term8455, term8455.getClass(), "NORMAL_COLOR", "UKAReurpHG");
        setField(term8455, term8455.getClass(), "liveName", "WVRMUmrljA");
        setField(term8492, term8492.getClass(), "path", "NTlKJDDWlk");
        setField(term8492, term8492.getClass(), "status", enum29);
        setIntField(term8492, term8492.getClass(), "prefixLength", -426764678);
        setField(term8492, term8492.getClass(), "filePath", null);
        setField(term8455, term8455.getClass(), "saveFilePath", term8492);
        setField(term8455, term8455.getClass(), "saveFileSuffix", "vOuMEpOQAg");
        setField(term8455, term8455.getClass(), "sqliteFileList", term8529);
        setField(term8455, term8455.getClass(), "sqliteFileSessionFactoryList", null);
        setIntField(term8455, term8455.getClass(), "maxFontSize", -165587447);
        setIntField(term8455, term8455.getClass(), "mixFontSize", -1347358701);
        setBooleanField(term8455, term8455.getClass(), "showSenderName", true);
        setIntField(term8455, term8455.getClass(), "videoWidth", 806595993);
        setIntField(term8455, term8455.getClass(), "videoHeight", 548228925);
        setField(term8455, term8455.getClass(), "NORMAL_STYLE_FONT", "doQLHkjpNm");
        setField(term8455, term8455.getClass(), "NORMAL_STYLE_NAME", "lCyLIcSuom");
        setFloatField(term8455, term8455.getClass(), "NORMAL_FONT_SIZE", 0.13481021F);
        setField(term8455, term8455.getClass(), "fileNameTimeFormat", "CGOpQSZZwI");
        setFloatField(term8455, term8455.getClass(), "screenProp", 0.996533F);
        setIntField(term8455, term8455.getClass(), "showTime", -749861210);
        setField(term8455, term8455.getClass(), "danMuFormatIndexMap", term8597);
        setField(term8455, term8455.getClass(), "danMuUserInfoModelHashMap", term8614);
        term8628 = new Integer(-2131181468);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2BiliBasFormatExportServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8628;
        callMethod(klass, "createColorString", argTypes, term8455, args);
    }

};


