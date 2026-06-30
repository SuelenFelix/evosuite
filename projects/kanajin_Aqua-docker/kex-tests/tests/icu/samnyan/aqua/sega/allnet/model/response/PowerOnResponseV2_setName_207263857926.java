package icu.samnyan.aqua.sega.allnet.model.response;

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
import static icu.samnyan.aqua.sega.allnet.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PowerOnResponseV2_setName_207263857926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24163;

    public PowerOnResponseV2_setName_207263857926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24163 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term24163, term24163.getClass(), "stat", -1747406163);
        setField(term24163, term24163.getClass(), "uri", "hyvFdAvkOr");
        setField(term24163, term24163.getClass(), "host", "ewbQRtustW");
        setField(term24163, term24163.getClass(), "place_id", "cABEHYBnys");
        setField(term24163, term24163.getClass(), "name", "EhlWSobaco");
        setField(term24163, term24163.getClass(), "nickname", "hEuycunsSe");
        setField(term24163, term24163.getClass(), "region0", "IMFzXhpNCx");
        setField(term24163, term24163.getClass(), "region_name0", "xAtFmANjwD");
        setField(term24163, term24163.getClass(), "region_name1", "ICysuFllEZ");
        setField(term24163, term24163.getClass(), "region_name2", "cGQJTTxcXr");
        setField(term24163, term24163.getClass(), "region_name3", "aKaqvssiby");
        setField(term24163, term24163.getClass(), "country", "tTVbtBVAfo");
        setIntField(term24163, term24163.getClass(), "year", 388157121);
        setIntField(term24163, term24163.getClass(), "month", 1684998508);
        setIntField(term24163, term24163.getClass(), "day", -1476644457);
        setIntField(term24163, term24163.getClass(), "hour", 1270666529);
        setIntField(term24163, term24163.getClass(), "minute", -1146679443);
        setIntField(term24163, term24163.getClass(), "second", -860131894);
        setField(term24163, term24163.getClass(), "setting", "cjaaJUnNCR");
        setField(term24163, term24163.getClass(), "timezone", "ETbxNuJLii");
        setField(term24163, term24163.getClass(), "res_class", "YJhnPtWtJR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xzGnrvbExX";
        callMethod(klass, "setName", argTypes, term24163, args);
    }

};


