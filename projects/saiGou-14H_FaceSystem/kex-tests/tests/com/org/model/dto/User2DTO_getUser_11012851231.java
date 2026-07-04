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

public class User2DTO_getUser_11012851231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6058;

    public User2DTO_getUser_11012851231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6060 = new Integer(-1899301124);
        Integer term6134 = new Integer(-1882480155);
        Integer term6199 = new Integer(-1410220680);
        Integer term6201 = new Integer(389427431);
        Integer term6203 = new Integer(-1945706126);
        Integer term6206 = new Integer(1152356969);
        Object term6198 = newInstance(Class.forName("com.org.model.Meeting"));
        setField(term6198, term6198.getClass(), "id", term6199);
        setField(term6198, term6198.getClass(), "createTime", null);
        setField(term6198, term6198.getClass(), "name", null);
        setField(term6198, term6198.getClass(), "link", null);
        setField(term6198, term6198.getClass(), "introduce", null);
        setField(term6198, term6198.getClass(), "updateTime", null);
        setField(term6198, term6198.getClass(), "meetingTime", null);
        setField(term6198, term6198.getClass(), "signTime", null);
        setField(term6198, term6198.getClass(), "signNumber", term6201);
        setField(term6198, term6198.getClass(), "userNumber", term6203);
        setField(term6198, term6198.getClass(), "fileUrl", null);
        setBooleanField(term6198, term6198.getClass(), "online", false);
        setField(term6198, term6198.getClass(), "deleted", term6206);
        setField(term6198, term6198.getClass(), "host", null);
        ArrayList term6196 = new ArrayList();
        ((ArrayList) term6196).add(term6198);
        Integer term6213 = new Integer(-1667990367);
        Integer term6215 = new Integer(-1214628358);
        Object term6212 = newInstance(Class.forName("com.org.model.Menu"));
        setField(term6212, term6212.getClass(), "id", term6213);
        setField(term6212, term6212.getClass(), "name", null);
        setField(term6212, term6212.getClass(), "path", null);
        setField(term6212, term6212.getClass(), "parentId", term6215);
        setField(term6212, term6212.getClass(), "icon", null);
        setField(term6212, term6212.getClass(), "introduce", null);
        setField(term6212, term6212.getClass(), "children", null);
        setField(term6212, term6212.getClass(), "meta", null);
        Integer term6218 = new Integer(-571169753);
        Integer term6220 = new Integer(318591690);
        Object term6217 = newInstance(Class.forName("com.org.model.Menu"));
        setField(term6217, term6217.getClass(), "id", term6218);
        setField(term6217, term6217.getClass(), "name", null);
        setField(term6217, term6217.getClass(), "path", null);
        setField(term6217, term6217.getClass(), "parentId", term6220);
        setField(term6217, term6217.getClass(), "icon", null);
        setField(term6217, term6217.getClass(), "introduce", null);
        setField(term6217, term6217.getClass(), "children", null);
        setField(term6217, term6217.getClass(), "meta", null);
        ArrayList term6210 = new ArrayList();
        ((ArrayList) term6210).add(term6212);
        ((ArrayList) term6210).add(term6217);
        Integer term6236 = new Integer(937859191);
        term6058 = newInstance(Class.forName("com.org.model.dto.User2DTO"));
        Object term6059 = newInstance(Class.forName("com.org.model.User"));
        setField(term6059, term6059.getClass(), "id", term6060);
        setField(term6059, term6059.getClass(), "email", "SIODFGaQhr");
        setField(term6059, term6059.getClass(), "password", "qYzsiuXOgS");
        setField(term6059, term6059.getClass(), "username", "bxrCBbrrct");
        setField(term6059, term6059.getClass(), "power", "CKWpJaaaxX");
        setField(term6059, term6059.getClass(), "nickname", "UBRmXJmfrt");
        setField(term6059, term6059.getClass(), "sex", "WZzvmIHhzZ");
        setField(term6059, term6059.getClass(), "age", term6134);
        setField(term6059, term6059.getClass(), "phone", "doQLHkjpNm");
        setField(term6059, term6059.getClass(), "faceUrl", "lCyLIcSuom");
        setField(term6059, term6059.getClass(), "headUrl", "CGOpQSZZwI");
        setField(term6059, term6059.getClass(), "introduce", "ypEdrstygY");
        setField(term6059, term6059.getClass(), "ip", "sNQFlATEeQ");
        setField(term6059, term6059.getClass(), "meetings", term6196);
        setField(term6059, term6059.getClass(), "menus", term6210);
        setField(term6058, term6058.getClass(), "user", term6059);
        setField(term6058, term6058.getClass(), "base64Face", "GEJABPlHSI");
        setField(term6058, term6058.getClass(), "departmentid", term6236);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.dto.User2DTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term6058, args);
    }

};


