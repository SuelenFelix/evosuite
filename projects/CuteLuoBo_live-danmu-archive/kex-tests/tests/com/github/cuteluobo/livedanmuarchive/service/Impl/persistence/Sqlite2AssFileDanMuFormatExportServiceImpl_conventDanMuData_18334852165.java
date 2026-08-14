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
import java.lang.Long;
import java.lang.Integer;
import java.util.LinkedList;
import java.lang.Float;

public class Sqlite2AssFileDanMuFormatExportServiceImpl_conventDanMuData_18334852165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3382;
     Object term3516;
     Object term3518;
     Object term3609;
     Object term3611;
     Object term3614;
     Object term3616;

    public Sqlite2AssFileDanMuFormatExportServiceImpl_conventDanMuData_18334852165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3639 = Class.forName((String) "java.io.File$PathStatus");
        Field term3638 = ((Class) term3639).getDeclaredField((String) "INVALID");
        ((Field) term3638).setAccessible(true);
        Object enum12 = ((Field) term3638).get((Object) null);
        Class<? extends Object> term3792 = Class.forName((String) "java.io.File$PathStatus");
        Field term3791 = ((Class) term3792).getDeclaredField((String) "CHECKED");
        ((Field) term3791).setAccessible(true);
        Object enum13 = ((Field) term3791).get((Object) null);
        Object term3434 = newInstance(Class.forName("java.io.File"));
        setField(term3434, term3434.getClass(), "path", "");
        setField(term3434, term3434.getClass(), "status", enum13);
        setIntField(term3434, term3434.getClass(), "prefixLength", -1547384488);
        setField(term3434, term3434.getClass(), "filePath", null);
        ArrayList term3432 = new ArrayList();
        ((ArrayList) term3432).add(term3434);
        HashMap term3485 = new HashMap();
        HashMap term3502 = new HashMap();
        term3382 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2AssFileDanMuFormatExportServiceImpl"));
        Object term3395 = newInstance(Class.forName("java.io.File"));
        setField(term3382, term3382.getClass(), "liveName", "XqgfKFvPSD");
        setField(term3395, term3395.getClass(), "path", "JiVRgTZvKc");
        setField(term3395, term3395.getClass(), "status", enum12);
        setIntField(term3395, term3395.getClass(), "prefixLength", 1090617576);
        setField(term3395, term3395.getClass(), "filePath", null);
        setField(term3382, term3382.getClass(), "saveFilePath", term3395);
        setField(term3382, term3382.getClass(), "saveFileSuffix", "XPKmummaqg");
        setField(term3382, term3382.getClass(), "sqliteFileList", term3432);
        setField(term3382, term3382.getClass(), "sqliteFileSessionFactoryList", null);
        setIntField(term3382, term3382.getClass(), "maxFontSize", 1442160736);
        setIntField(term3382, term3382.getClass(), "mixFontSize", 1114000454);
        setBooleanField(term3382, term3382.getClass(), "showSenderName", true);
        setIntField(term3382, term3382.getClass(), "videoWidth", -556405712);
        setIntField(term3382, term3382.getClass(), "videoHeight", -1772434990);
        setField(term3382, term3382.getClass(), "NORMAL_STYLE_FONT", "SPpkrGcPRr");
        setField(term3382, term3382.getClass(), "NORMAL_STYLE_NAME", "sEccwbJKYE");
        setFloatField(term3382, term3382.getClass(), "NORMAL_FONT_SIZE", 0.8783184F);
        setField(term3382, term3382.getClass(), "fileNameTimeFormat", "AWRooQKkdW");
        setFloatField(term3382, term3382.getClass(), "screenProp", 0.26413453F);
        setIntField(term3382, term3382.getClass(), "showTime", -1845499264);
        setField(term3382, term3382.getClass(), "danMuFormatIndexMap", term3485);
        setField(term3382, term3382.getClass(), "danMuUserInfoModelHashMap", term3502);
        term3516 = new Long(5270370404989704783L);
        term3518 = (Object[]) newArray("com.github.cuteluobo.livedanmuarchive.pojo.FormatDanMuData", 6);
        Object term3519 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.FormatDanMuData"));
        Object term3534 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.FormatDanMuData"));
        Object term3549 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.FormatDanMuData"));
        Object term3564 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.FormatDanMuData"));
        Object term3579 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.FormatDanMuData"));
        Object term3594 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.FormatDanMuData"));
        setLongField(term3519, term3519.getClass(), "startTime", 7411271909051562686L);
        setField(term3519, term3519.getClass(), "content", "sEnIVFtZuQ");
        setFloatField(term3519, term3519.getClass(), "fontSize", 0.7944024F);
        setElement(term3518, 0, term3519);
        setLongField(term3534, term3534.getClass(), "startTime", 4872422362414183754L);
        setField(term3534, term3534.getClass(), "content", "ZVecLZMLHF");
        setFloatField(term3534, term3534.getClass(), "fontSize", 0.3692338F);
        setElement(term3518, 1, term3534);
        setLongField(term3549, term3549.getClass(), "startTime", 6811161968424632369L);
        setField(term3549, term3549.getClass(), "content", "fztQhjqwdP");
        setFloatField(term3549, term3549.getClass(), "fontSize", 0.13906479F);
        setElement(term3518, 2, term3549);
        setLongField(term3564, term3564.getClass(), "startTime", -7237588299778557629L);
        setField(term3564, term3564.getClass(), "content", "eVpkWxjuki");
        setFloatField(term3564, term3564.getClass(), "fontSize", 0.6076495F);
        setElement(term3518, 3, term3564);
        setLongField(term3579, term3579.getClass(), "startTime", 6967924379644551255L);
        setField(term3579, term3579.getClass(), "content", "SJiQaLvSKv");
        setFloatField(term3579, term3579.getClass(), "fontSize", 0.6608425F);
        setElement(term3518, 4, term3579);
        setLongField(term3594, term3594.getClass(), "startTime", -2813493605142626659L);
        setField(term3594, term3594.getClass(), "content", "OEXDRUKcFl");
        setFloatField(term3594, term3594.getClass(), "fontSize", 0.37773192F);
        setElement(term3518, 5, term3594);
        term3609 = new Integer(444029505);
        term3611 = new LinkedList();
        term3614 = new Float(0.24413109F);
        term3616 = new Integer(-1034506028);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2AssFileDanMuFormatExportServiceImpl");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = long.class;
        argTypes[1] = Array.newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.FormatDanMuData"), 0).getClass();
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.util.List");
        argTypes[4] = float.class;
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = term3516;
        args[1] = term3518;
        args[2] = term3609;
        args[3] = term3611;
        args[4] = term3614;
        args[5] = term3616;
        callMethod(klass, "conventDanMuData", argTypes, term3382, args);
    }

};


