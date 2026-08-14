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
import java.lang.Float;

public class Sqlite2AssFileDanMuFormatExportServiceImpl_createAssDialogue_6066807336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4024;
     Object term4170;
     Object term4172;
     Object term4186;
     Object term4200;

    public Sqlite2AssFileDanMuFormatExportServiceImpl_createAssDialogue_6066807336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4223 = Class.forName((String) "java.io.File$PathStatus");
        Field term4222 = ((Class) term4223).getDeclaredField((String) "CHECKED");
        ((Field) term4222).setAccessible(true);
        Object enum14 = ((Field) term4222).get((Object) null);
        Object term4076 = newInstance(Class.forName("java.io.File"));
        setField(term4076, term4076.getClass(), "path", "");
        setField(term4076, term4076.getClass(), "status", enum14);
        setIntField(term4076, term4076.getClass(), "prefixLength", -894662986);
        setField(term4076, term4076.getClass(), "filePath", null);
        Object term4079 = newInstance(Class.forName("java.io.File"));
        setField(term4079, term4079.getClass(), "path", "");
        setField(term4079, term4079.getClass(), "status", enum14);
        setIntField(term4079, term4079.getClass(), "prefixLength", 304775596);
        setField(term4079, term4079.getClass(), "filePath", null);
        Class<? extends Object> term4376 = Class.forName((String) "java.io.File$PathStatus");
        Field term4375 = ((Class) term4376).getDeclaredField((String) "INVALID");
        ((Field) term4375).setAccessible(true);
        Object enum15 = ((Field) term4375).get((Object) null);
        Object term4082 = newInstance(Class.forName("java.io.File"));
        setField(term4082, term4082.getClass(), "path", "");
        setField(term4082, term4082.getClass(), "status", enum15);
        setIntField(term4082, term4082.getClass(), "prefixLength", -1347665717);
        setField(term4082, term4082.getClass(), "filePath", null);
        Object term4087 = newInstance(Class.forName("java.io.File"));
        setField(term4087, term4087.getClass(), "path", "");
        setField(term4087, term4087.getClass(), "status", enum15);
        setIntField(term4087, term4087.getClass(), "prefixLength", -1888585309);
        setField(term4087, term4087.getClass(), "filePath", null);
        Object term4090 = newInstance(Class.forName("java.io.File"));
        setField(term4090, term4090.getClass(), "path", "");
        setField(term4090, term4090.getClass(), "status", enum15);
        setIntField(term4090, term4090.getClass(), "prefixLength", 683666002);
        setField(term4090, term4090.getClass(), "filePath", null);
        ArrayList term4074 = new ArrayList();
        ((ArrayList) term4074).add(term4076);
        ((ArrayList) term4074).add(term4079);
        ((ArrayList) term4074).add(term4082);
        ((ArrayList) term4074).add(term4087);
        ((ArrayList) term4074).add(term4090);
        HashMap term4139 = new HashMap();
        HashMap term4156 = new HashMap();
        term4024 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2AssFileDanMuFormatExportServiceImpl"));
        Object term4037 = newInstance(Class.forName("java.io.File"));
        setField(term4024, term4024.getClass(), "liveName", "RYdKCNNMBR");
        setField(term4037, term4037.getClass(), "path", "yGtHPyvYiQ");
        setField(term4037, term4037.getClass(), "status", enum14);
        setIntField(term4037, term4037.getClass(), "prefixLength", -1263114719);
        setField(term4037, term4037.getClass(), "filePath", null);
        setField(term4024, term4024.getClass(), "saveFilePath", term4037);
        setField(term4024, term4024.getClass(), "saveFileSuffix", "MvRIxilFMJ");
        setField(term4024, term4024.getClass(), "sqliteFileList", term4074);
        setField(term4024, term4024.getClass(), "sqliteFileSessionFactoryList", null);
        setIntField(term4024, term4024.getClass(), "maxFontSize", 1596213415);
        setIntField(term4024, term4024.getClass(), "mixFontSize", -268815336);
        setBooleanField(term4024, term4024.getClass(), "showSenderName", true);
        setIntField(term4024, term4024.getClass(), "videoWidth", -1210583429);
        setIntField(term4024, term4024.getClass(), "videoHeight", -663691365);
        setField(term4024, term4024.getClass(), "NORMAL_STYLE_FONT", "hCWPJQKpdc");
        setField(term4024, term4024.getClass(), "NORMAL_STYLE_NAME", "WzMEhMXkKx");
        setFloatField(term4024, term4024.getClass(), "NORMAL_FONT_SIZE", 0.8474802F);
        setField(term4024, term4024.getClass(), "fileNameTimeFormat", "XOiDvlDhdc");
        setFloatField(term4024, term4024.getClass(), "screenProp", 0.9985961F);
        setIntField(term4024, term4024.getClass(), "showTime", 339854490);
        setField(term4024, term4024.getClass(), "danMuFormatIndexMap", term4139);
        setField(term4024, term4024.getClass(), "danMuUserInfoModelHashMap", term4156);
        term4170 = new Long(-8885298608300233488L);
        term4172 = new Long(-4325723315152823407L);
        term4186 = new Float(0.51832694F);
        term4200 = new Float(0.97262454F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2AssFileDanMuFormatExportServiceImpl");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = float.class;
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = float.class;
        Object[] args = new Object[6];
        args[0] = term4170;
        args[1] = term4172;
        args[2] = "xIeFjkHkOe";
        args[3] = term4186;
        args[4] = "SdCKLMIYnX";
        args[5] = term4200;
        callMethod(klass, "createAssDialogue", argTypes, term4024, args);
    }

};


