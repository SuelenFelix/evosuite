package icu.samnyan.aqua.sega.chusan.model.response;

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
import static icu.samnyan.aqua.sega.chusan.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class GetGameSettingResp_init_28792500410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55660;
     Object term55777;
     Object term55779;

    public GetGameSettingResp_init_28792500410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55660 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term55660, term55660.getClass(), "romVersion", "pQcdIREjlp");
        setField(term55660, term55660.getClass(), "dataVersion", "WjUrdNMIOj");
        setBooleanField(term55660, term55660.getClass(), "isMaintenance", false);
        setIntField(term55660, term55660.getClass(), "requestInterval", 1964061073);
        setField(term55660, term55660.getClass(), "rebootStartTime", "aQUpwHjYvS");
        setField(term55660, term55660.getClass(), "rebootEndTime", "lvcTLkVhAN");
        setBooleanField(term55660, term55660.getClass(), "isBackgroundDistribute", false);
        setIntField(term55660, term55660.getClass(), "maxCountCharacter", -1274174342);
        setIntField(term55660, term55660.getClass(), "maxCountItem", 269850713);
        setIntField(term55660, term55660.getClass(), "maxCountMusic", -1487569724);
        setField(term55660, term55660.getClass(), "matchStartTime", "BJJuVqxXjT");
        setField(term55660, term55660.getClass(), "matchEndTime", "IvxbsFCczM");
        setIntField(term55660, term55660.getClass(), "matchTimeLimit", 288903600);
        setIntField(term55660, term55660.getClass(), "matchErrorLimit", -972943452);
        setField(term55660, term55660.getClass(), "matchingUri", "GkAaLUoaoL");
        setField(term55660, term55660.getClass(), "udpHolePunchUri", "VSmPzUiFzd");
        setField(term55660, term55660.getClass(), "reflectorUri", "bLpZNCaWDB");
        term55777 = new Boolean(true);
        term55779 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term55660;
        args[1] = term55777;
        args[2] = term55779;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


