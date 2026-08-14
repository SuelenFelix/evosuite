package com.github.cuteluobo.livedanmuarchive.pojo;

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
import static com.github.cuteluobo.livedanmuarchive.pojo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;

public class DanMuData_convent_6078306375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3000;
     Object term3035;
     Object term3064;

    public DanMuData_convent_6078306375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3001 = new Long(5270370404989704783L);
        Integer term3003 = new Integer(391863371);
        Integer term3017 = new Integer(-1922583790);
        Integer term3019 = new Integer(-616727354);
        Long term3021 = new Long(7411271909051562686L);
        term3000 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuDataModel"));
        setField(term3000, term3000.getClass(), "id", term3001);
        setField(term3000, term3000.getClass(), "userId", term3003);
        setField(term3000, term3000.getClass(), "data", "BjugTaMcxJ");
        setField(term3000, term3000.getClass(), "format", term3017);
        setField(term3000, term3000.getClass(), "type", term3019);
        setField(term3000, term3000.getClass(), "createTime", term3021);
        setField(term3000, term3000.getClass(), "createTimeText", "vGiuZVPJNH");
        Integer term3036 = new Integer(-1955890973);
        Long term3038 = new Long(4872422362414183754L);
        term3035 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuUserInfoModel"));
        setField(term3035, term3035.getClass(), "id", term3036);
        setField(term3035, term3035.getClass(), "addTime", term3038);
        setField(term3035, term3035.getClass(), "uid", "tlzpzIjMib");
        setField(term3035, term3035.getClass(), "nickName", "AZdLeSugwv");
        Integer term3065 = new Integer(-2038273078);
        term3064 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuFormatModel"));
        setField(term3064, term3064.getClass(), "id", term3065);
        setIntField(term3064, term3064.getClass(), "fontColor", -1955890973);
        setIntField(term3064, term3064.getClass(), "fontSize", 25);
        setIntField(term3064, term3064.getClass(), "textSpeed", -2038273078);
        setIntField(term3064, term3064.getClass(), "transitionType", 1);
        setIntField(term3064, term3064.getClass(), "popupStyle", 1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.DanMuData");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuDataModel");
        argTypes[1] = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuUserInfoModel");
        argTypes[2] = Class.forName("com.github.cuteluobo.livedanmuarchive.model.DanMuFormatModel");
        Object[] args = new Object[3];
        args[0] = term3000;
        args[1] = term3035;
        args[2] = term3064;
        callMethod(klass, "convent", argTypes, null, args);
    }

};


