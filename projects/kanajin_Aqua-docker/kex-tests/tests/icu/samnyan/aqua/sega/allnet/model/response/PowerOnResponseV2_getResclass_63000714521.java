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

public class PowerOnResponseV2_getResclass_63000714521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22515;

    public PowerOnResponseV2_getResclass_63000714521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22515 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term22515, term22515.getClass(), "stat", 114754804);
        setField(term22515, term22515.getClass(), "uri", "pZbbwCURge");
        setField(term22515, term22515.getClass(), "host", "RsOfgdMCMv");
        setField(term22515, term22515.getClass(), "place_id", "nsofCJqJOR");
        setField(term22515, term22515.getClass(), "name", "CitJiZwsjF");
        setField(term22515, term22515.getClass(), "nickname", "ZiyMvLArWJ");
        setField(term22515, term22515.getClass(), "region0", "MaeokjEfWD");
        setField(term22515, term22515.getClass(), "region_name0", "ocZcumnXEz");
        setField(term22515, term22515.getClass(), "region_name1", "rNNwyactDR");
        setField(term22515, term22515.getClass(), "region_name2", "QJrTMTdxyh");
        setField(term22515, term22515.getClass(), "region_name3", "rgZSPplPSs");
        setField(term22515, term22515.getClass(), "country", "NPUSTXlEKx");
        setIntField(term22515, term22515.getClass(), "year", 1687361082);
        setIntField(term22515, term22515.getClass(), "month", 584893196);
        setIntField(term22515, term22515.getClass(), "day", 497269071);
        setIntField(term22515, term22515.getClass(), "hour", -1899301124);
        setIntField(term22515, term22515.getClass(), "minute", -1882480155);
        setIntField(term22515, term22515.getClass(), "second", -1410220680);
        setField(term22515, term22515.getClass(), "setting", "KKFprGoNpl");
        setField(term22515, term22515.getClass(), "timezone", "tWVISJlxKZ");
        setField(term22515, term22515.getClass(), "res_class", "rOZkUKEoaf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRes_class", argTypes, term22515, args);
    }

};


