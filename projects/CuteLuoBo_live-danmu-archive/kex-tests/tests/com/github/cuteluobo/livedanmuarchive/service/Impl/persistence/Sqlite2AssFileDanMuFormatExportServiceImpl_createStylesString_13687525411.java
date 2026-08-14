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

public class Sqlite2AssFileDanMuFormatExportServiceImpl_createStylesString_13687525411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1542;

    public Sqlite2AssFileDanMuFormatExportServiceImpl_createStylesString_13687525411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1709 = Class.forName((String) "java.io.File$PathStatus");
        Field term1708 = ((Class) term1709).getDeclaredField((String) "INVALID");
        ((Field) term1708).setAccessible(true);
        Object enum5 = ((Field) term1708).get((Object) null);
        Class<? extends Object> term1862 = Class.forName((String) "java.io.File$PathStatus");
        Field term1861 = ((Class) term1862).getDeclaredField((String) "CHECKED");
        ((Field) term1861).setAccessible(true);
        Object enum6 = ((Field) term1861).get((Object) null);
        Object term1594 = newInstance(Class.forName("java.io.File"));
        setField(term1594, term1594.getClass(), "path", "");
        setField(term1594, term1594.getClass(), "status", enum6);
        setIntField(term1594, term1594.getClass(), "prefixLength", -226514366);
        setField(term1594, term1594.getClass(), "filePath", null);
        Object term1599 = newInstance(Class.forName("java.io.File"));
        setField(term1599, term1599.getClass(), "path", "");
        setField(term1599, term1599.getClass(), "status", enum5);
        setIntField(term1599, term1599.getClass(), "prefixLength", 1193880199);
        setField(term1599, term1599.getClass(), "filePath", null);
        Object term1602 = newInstance(Class.forName("java.io.File"));
        setField(term1602, term1602.getClass(), "path", "");
        setField(term1602, term1602.getClass(), "status", enum6);
        setIntField(term1602, term1602.getClass(), "prefixLength", -1087774327);
        setField(term1602, term1602.getClass(), "filePath", null);
        Object term1605 = newInstance(Class.forName("java.io.File"));
        setField(term1605, term1605.getClass(), "path", "");
        setField(term1605, term1605.getClass(), "status", enum5);
        setIntField(term1605, term1605.getClass(), "prefixLength", -1530420153);
        setField(term1605, term1605.getClass(), "filePath", null);
        Object term1608 = newInstance(Class.forName("java.io.File"));
        setField(term1608, term1608.getClass(), "path", "");
        setField(term1608, term1608.getClass(), "status", enum5);
        setIntField(term1608, term1608.getClass(), "prefixLength", -469968304);
        setField(term1608, term1608.getClass(), "filePath", null);
        ArrayList term1592 = new ArrayList();
        ((ArrayList) term1592).add(term1594);
        ((ArrayList) term1592).add(term1599);
        ((ArrayList) term1592).add(term1602);
        ((ArrayList) term1592).add(term1605);
        ((ArrayList) term1592).add(term1608);
        HashMap term1657 = new HashMap();
        HashMap term1674 = new HashMap();
        term1542 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2AssFileDanMuFormatExportServiceImpl"));
        Object term1555 = newInstance(Class.forName("java.io.File"));
        setField(term1542, term1542.getClass(), "liveName", "nyiiPDVjAc");
        setField(term1555, term1555.getClass(), "path", "aKnKipADSo");
        setField(term1555, term1555.getClass(), "status", enum5);
        setIntField(term1555, term1555.getClass(), "prefixLength", -73683645);
        setField(term1555, term1555.getClass(), "filePath", null);
        setField(term1542, term1542.getClass(), "saveFilePath", term1555);
        setField(term1542, term1542.getClass(), "saveFileSuffix", "wSQxaModmm");
        setField(term1542, term1542.getClass(), "sqliteFileList", term1592);
        setField(term1542, term1542.getClass(), "sqliteFileSessionFactoryList", null);
        setIntField(term1542, term1542.getClass(), "maxFontSize", -1145578966);
        setIntField(term1542, term1542.getClass(), "mixFontSize", 679763016);
        setBooleanField(term1542, term1542.getClass(), "showSenderName", false);
        setIntField(term1542, term1542.getClass(), "videoWidth", 1962444399);
        setIntField(term1542, term1542.getClass(), "videoHeight", 767834723);
        setField(term1542, term1542.getClass(), "NORMAL_STYLE_FONT", "tShwQLRGNe");
        setField(term1542, term1542.getClass(), "NORMAL_STYLE_NAME", "LvtrsXUliU");
        setFloatField(term1542, term1542.getClass(), "NORMAL_FONT_SIZE", 0.09123778F);
        setField(term1542, term1542.getClass(), "fileNameTimeFormat", "xLbjWUgOIL");
        setFloatField(term1542, term1542.getClass(), "screenProp", 0.5523636F);
        setIntField(term1542, term1542.getClass(), "showTime", -602026508);
        setField(term1542, term1542.getClass(), "danMuFormatIndexMap", term1657);
        setField(term1542, term1542.getClass(), "danMuUserInfoModelHashMap", term1674);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2AssFileDanMuFormatExportServiceImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createStylesString", argTypes, term1542, args);
    }

};


