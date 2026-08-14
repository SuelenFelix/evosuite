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
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Long;

public class Sqlite2BiliBasFormatExportServiceImpl_createSingleBasObject_16334984966 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7851;
     Object term8009;
     Object term8047;
     Object term8053;
     Object term8055;
     Object term8057;

    public Sqlite2BiliBasFormatExportServiceImpl_createSingleBasObject_16334984966() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8100 = Class.forName((String) "java.io.File$PathStatus");
        Field term8099 = ((Class) term8100).getDeclaredField((String) "CHECKED");
        ((Field) term8099).setAccessible(true);
        Object enum27 = ((Field) term8099).get((Object) null);
        Class<? extends Object> term8253 = Class.forName((String) "java.io.File$PathStatus");
        Field term8252 = ((Class) term8253).getDeclaredField((String) "CHECKED");
        ((Field) term8252).setAccessible(true);
        Object enum28 = ((Field) term8252).get((Object) null);
        Object term7927 = newInstance(Class.forName("java.io.File"));
        setField(term7927, term7927.getClass(), "path", "");
        setField(term7927, term7927.getClass(), "status", enum28);
        setIntField(term7927, term7927.getClass(), "prefixLength", 1687361082);
        setField(term7927, term7927.getClass(), "filePath", null);
        ArrayList term7925 = new ArrayList();
        ((ArrayList) term7925).add(term7927);
        HashMap term7978 = new HashMap();
        HashMap term7995 = new HashMap();
        term7851 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2BiliBasFormatExportServiceImpl"));
        Object term7888 = newInstance(Class.forName("java.io.File"));
        setField(term7851, term7851.getClass(), "NORMAL_TRACK_STYLE_PREFIX", "gUvcueTURF");
        setField(term7851, term7851.getClass(), "NORMAL_COLOR", "EwQBhZjCIT");
        setField(term7851, term7851.getClass(), "liveName", "aSkmSwTnEw");
        setField(term7888, term7888.getClass(), "path", "xvkbvaEGYd");
        setField(term7888, term7888.getClass(), "status", enum27);
        setIntField(term7888, term7888.getClass(), "prefixLength", 114754804);
        setField(term7888, term7888.getClass(), "filePath", null);
        setField(term7851, term7851.getClass(), "saveFilePath", term7888);
        setField(term7851, term7851.getClass(), "saveFileSuffix", "HBGNxdNURv");
        setField(term7851, term7851.getClass(), "sqliteFileList", term7925);
        setField(term7851, term7851.getClass(), "sqliteFileSessionFactoryList", null);
        setIntField(term7851, term7851.getClass(), "maxFontSize", 584893196);
        setIntField(term7851, term7851.getClass(), "mixFontSize", 497269071);
        setBooleanField(term7851, term7851.getClass(), "showSenderName", false);
        setIntField(term7851, term7851.getClass(), "videoWidth", -1899301124);
        setIntField(term7851, term7851.getClass(), "videoHeight", -1882480155);
        setField(term7851, term7851.getClass(), "NORMAL_STYLE_FONT", "OcJCIDNIXA");
        setField(term7851, term7851.getClass(), "NORMAL_STYLE_NAME", "XfRABIFVEp");
        setFloatField(term7851, term7851.getClass(), "NORMAL_FONT_SIZE", 0.43692183F);
        setField(term7851, term7851.getClass(), "fileNameTimeFormat", "MHGKyEnwKc");
        setFloatField(term7851, term7851.getClass(), "screenProp", 0.80973893F);
        setIntField(term7851, term7851.getClass(), "showTime", -1410220680);
        setField(term7851, term7851.getClass(), "danMuFormatIndexMap", term7978);
        setField(term7851, term7851.getClass(), "danMuUserInfoModelHashMap", term7995);
        term8009 = new Boolean(false);
        term8047 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat"));
        setIntField(term8047, term8047.getClass(), "fontColor", -1667990367);
        setIntField(term8047, term8047.getClass(), "fontSize", 25);
        setIntField(term8047, term8047.getClass(), "textSpeed", -1214628358);
        setIntField(term8047, term8047.getClass(), "transitionType", 1);
        setIntField(term8047, term8047.getClass(), "popupStyle", 1102721075);
        term8053 = new Float(0.7633268F);
        term8055 = new Long(7009926388951271268L);
        term8057 = new Float(0.541592F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2BiliBasFormatExportServiceImpl");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuFormat");
        argTypes[5] = float.class;
        argTypes[6] = long.class;
        argTypes[7] = float.class;
        Object[] args = new Object[8];
        args[0] = term8009;
        args[1] = "nghfqDXyCG";
        args[2] = "WBAOTqErtm";
        args[3] = "PqtVXXZMqK";
        args[4] = term8047;
        args[5] = term8053;
        args[6] = term8055;
        args[7] = term8057;
        callMethod(klass, "createSingleBasObject", argTypes, term7851, args);
    }

};


