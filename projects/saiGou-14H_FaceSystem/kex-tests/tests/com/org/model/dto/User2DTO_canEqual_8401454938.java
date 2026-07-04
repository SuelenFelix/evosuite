package com.org.model.dto;

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
import static com.org.model.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;
import java.util.ArrayList;

public class User2DTO_canEqual_8401454938 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8907;
     Object term9127;

    public User2DTO_canEqual_8401454938() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term8909 = new Integer(-1639041228);
        Integer term8983 = new Integer(2027686272);
        Integer term9048 = new Integer(-1494356104);
        Integer term9050 = new Integer(-695279311);
        Integer term9052 = new Integer(114279242);
        Integer term9055 = new Integer(990883365);
        Object term9047 = newInstance(Class.forName("com.org.model.Meeting"));
        setField(term9047, term9047.getClass(), "id", term9048);
        setField(term9047, term9047.getClass(), "createTime", null);
        setField(term9047, term9047.getClass(), "name", null);
        setField(term9047, term9047.getClass(), "link", null);
        setField(term9047, term9047.getClass(), "introduce", null);
        setField(term9047, term9047.getClass(), "updateTime", null);
        setField(term9047, term9047.getClass(), "meetingTime", null);
        setField(term9047, term9047.getClass(), "signTime", null);
        setField(term9047, term9047.getClass(), "signNumber", term9050);
        setField(term9047, term9047.getClass(), "userNumber", term9052);
        setField(term9047, term9047.getClass(), "fileUrl", null);
        setBooleanField(term9047, term9047.getClass(), "online", false);
        setField(term9047, term9047.getClass(), "deleted", term9055);
        setField(term9047, term9047.getClass(), "host", null);
        Integer term9058 = new Integer(633598642);
        Integer term9060 = new Integer(1862841859);
        Integer term9062 = new Integer(-1114668574);
        Integer term9065 = new Integer(514511037);
        Object term9057 = newInstance(Class.forName("com.org.model.Meeting"));
        setField(term9057, term9057.getClass(), "id", term9058);
        setField(term9057, term9057.getClass(), "createTime", null);
        setField(term9057, term9057.getClass(), "name", null);
        setField(term9057, term9057.getClass(), "link", null);
        setField(term9057, term9057.getClass(), "introduce", null);
        setField(term9057, term9057.getClass(), "updateTime", null);
        setField(term9057, term9057.getClass(), "meetingTime", null);
        setField(term9057, term9057.getClass(), "signTime", null);
        setField(term9057, term9057.getClass(), "signNumber", term9060);
        setField(term9057, term9057.getClass(), "userNumber", term9062);
        setField(term9057, term9057.getClass(), "fileUrl", null);
        setBooleanField(term9057, term9057.getClass(), "online", false);
        setField(term9057, term9057.getClass(), "deleted", term9065);
        setField(term9057, term9057.getClass(), "host", null);
        Integer term9068 = new Integer(1713573821);
        Integer term9070 = new Integer(1956590498);
        Integer term9072 = new Integer(1467356494);
        Integer term9075 = new Integer(-26316536);
        Object term9067 = newInstance(Class.forName("com.org.model.Meeting"));
        setField(term9067, term9067.getClass(), "id", term9068);
        setField(term9067, term9067.getClass(), "createTime", null);
        setField(term9067, term9067.getClass(), "name", null);
        setField(term9067, term9067.getClass(), "link", null);
        setField(term9067, term9067.getClass(), "introduce", null);
        setField(term9067, term9067.getClass(), "updateTime", null);
        setField(term9067, term9067.getClass(), "meetingTime", null);
        setField(term9067, term9067.getClass(), "signTime", null);
        setField(term9067, term9067.getClass(), "signNumber", term9070);
        setField(term9067, term9067.getClass(), "userNumber", term9072);
        setField(term9067, term9067.getClass(), "fileUrl", null);
        setBooleanField(term9067, term9067.getClass(), "online", false);
        setField(term9067, term9067.getClass(), "deleted", term9075);
        setField(term9067, term9067.getClass(), "host", null);
        Integer term9078 = new Integer(1716165145);
        Integer term9080 = new Integer(1692937831);
        Integer term9082 = new Integer(-1539747985);
        Integer term9085 = new Integer(-1982489643);
        Object term9077 = newInstance(Class.forName("com.org.model.Meeting"));
        setField(term9077, term9077.getClass(), "id", term9078);
        setField(term9077, term9077.getClass(), "createTime", null);
        setField(term9077, term9077.getClass(), "name", null);
        setField(term9077, term9077.getClass(), "link", null);
        setField(term9077, term9077.getClass(), "introduce", null);
        setField(term9077, term9077.getClass(), "updateTime", null);
        setField(term9077, term9077.getClass(), "meetingTime", null);
        setField(term9077, term9077.getClass(), "signTime", null);
        setField(term9077, term9077.getClass(), "signNumber", term9080);
        setField(term9077, term9077.getClass(), "userNumber", term9082);
        setField(term9077, term9077.getClass(), "fileUrl", null);
        setBooleanField(term9077, term9077.getClass(), "online", true);
        setField(term9077, term9077.getClass(), "deleted", term9085);
        setField(term9077, term9077.getClass(), "host", null);
        ArrayList term9045 = new ArrayList();
        ((ArrayList) term9045).add(term9047);
        ((ArrayList) term9045).add(term9057);
        ((ArrayList) term9045).add(term9067);
        ((ArrayList) term9045).add(term9077);
        Integer term9092 = new Integer(550892835);
        Integer term9094 = new Integer(1237549886);
        Object term9091 = newInstance(Class.forName("com.org.model.Menu"));
        setField(term9091, term9091.getClass(), "id", term9092);
        setField(term9091, term9091.getClass(), "name", null);
        setField(term9091, term9091.getClass(), "path", null);
        setField(term9091, term9091.getClass(), "parentId", term9094);
        setField(term9091, term9091.getClass(), "icon", null);
        setField(term9091, term9091.getClass(), "introduce", null);
        setField(term9091, term9091.getClass(), "children", null);
        setField(term9091, term9091.getClass(), "meta", null);
        Integer term9097 = new Integer(1136208236);
        Integer term9099 = new Integer(-1220630391);
        Object term9096 = newInstance(Class.forName("com.org.model.Menu"));
        setField(term9096, term9096.getClass(), "id", term9097);
        setField(term9096, term9096.getClass(), "name", null);
        setField(term9096, term9096.getClass(), "path", null);
        setField(term9096, term9096.getClass(), "parentId", term9099);
        setField(term9096, term9096.getClass(), "icon", null);
        setField(term9096, term9096.getClass(), "introduce", null);
        setField(term9096, term9096.getClass(), "children", null);
        setField(term9096, term9096.getClass(), "meta", null);
        Integer term9102 = new Integer(-1945635750);
        Integer term9104 = new Integer(-1622760744);
        Object term9101 = newInstance(Class.forName("com.org.model.Menu"));
        setField(term9101, term9101.getClass(), "id", term9102);
        setField(term9101, term9101.getClass(), "name", null);
        setField(term9101, term9101.getClass(), "path", null);
        setField(term9101, term9101.getClass(), "parentId", term9104);
        setField(term9101, term9101.getClass(), "icon", null);
        setField(term9101, term9101.getClass(), "introduce", null);
        setField(term9101, term9101.getClass(), "children", null);
        setField(term9101, term9101.getClass(), "meta", null);
        Integer term9107 = new Integer(1200440315);
        Integer term9109 = new Integer(40571662);
        Object term9106 = newInstance(Class.forName("com.org.model.Menu"));
        setField(term9106, term9106.getClass(), "id", term9107);
        setField(term9106, term9106.getClass(), "name", null);
        setField(term9106, term9106.getClass(), "path", null);
        setField(term9106, term9106.getClass(), "parentId", term9109);
        setField(term9106, term9106.getClass(), "icon", null);
        setField(term9106, term9106.getClass(), "introduce", null);
        setField(term9106, term9106.getClass(), "children", null);
        setField(term9106, term9106.getClass(), "meta", null);
        ArrayList term9089 = new ArrayList();
        ((ArrayList) term9089).add(term9091);
        ((ArrayList) term9089).add(term9096);
        ((ArrayList) term9089).add(term9101);
        ((ArrayList) term9089).add(term9106);
        Integer term9125 = new Integer(1863910269);
        term8907 = newInstance(Class.forName("com.org.model.dto.User2DTO"));
        Object term8908 = newInstance(Class.forName("com.org.model.User"));
        setField(term8908, term8908.getClass(), "id", term8909);
        setField(term8908, term8908.getClass(), "email", "acPRDlpsid");
        setField(term8908, term8908.getClass(), "password", "YyojIzvxLZ");
        setField(term8908, term8908.getClass(), "username", "fxapaYlZea");
        setField(term8908, term8908.getClass(), "power", "VJgREHwfRM");
        setField(term8908, term8908.getClass(), "nickname", "kXnpLIZTAr");
        setField(term8908, term8908.getClass(), "sex", "ZiMAmqpbzk");
        setField(term8908, term8908.getClass(), "age", term8983);
        setField(term8908, term8908.getClass(), "phone", "UwJtBPAtSU");
        setField(term8908, term8908.getClass(), "faceUrl", "nBaMiSdFmS");
        setField(term8908, term8908.getClass(), "headUrl", "ezwGsjqTai");
        setField(term8908, term8908.getClass(), "introduce", "ngeHWMRjnn");
        setField(term8908, term8908.getClass(), "ip", "FOKfDXQxMM");
        setField(term8908, term8908.getClass(), "meetings", term9045);
        setField(term8908, term8908.getClass(), "menus", term9089);
        setField(term8907, term8907.getClass(), "user", term8908);
        setField(term8907, term8907.getClass(), "base64Face", "KqQOTshBOL");
        setField(term8907, term8907.getClass(), "departmentid", term9125);
        term9127 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.User2DTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term9127;
        callMethod(klass, "canEqual", argTypes, term8907, args);
    }

};


