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
import java.lang.Integer;

public class PowerOnResponseV2_setMinute_170741078938 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28139;
     Object term28315;

    public PowerOnResponseV2_setMinute_170741078938() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28139 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term28139, term28139.getClass(), "stat", 579006268);
        setField(term28139, term28139.getClass(), "uri", "eMtshhmGEm");
        setField(term28139, term28139.getClass(), "host", "VJUbzHGOvg");
        setField(term28139, term28139.getClass(), "place_id", "SiwcigIrfD");
        setField(term28139, term28139.getClass(), "name", "MFIdGVLoDo");
        setField(term28139, term28139.getClass(), "nickname", "kbxgTcnXyU");
        setField(term28139, term28139.getClass(), "region0", "lnJvDbbuwo");
        setField(term28139, term28139.getClass(), "region_name0", "KExnWkKGvF");
        setField(term28139, term28139.getClass(), "region_name1", "luGUNfvmKk");
        setField(term28139, term28139.getClass(), "region_name2", "oOUHomyJff");
        setField(term28139, term28139.getClass(), "region_name3", "KnnoLMOuur");
        setField(term28139, term28139.getClass(), "country", "buRpVghIvt");
        setIntField(term28139, term28139.getClass(), "year", -1694747156);
        setIntField(term28139, term28139.getClass(), "month", 1466373988);
        setIntField(term28139, term28139.getClass(), "day", -358526505);
        setIntField(term28139, term28139.getClass(), "hour", 1843268026);
        setIntField(term28139, term28139.getClass(), "minute", 954660603);
        setIntField(term28139, term28139.getClass(), "second", -1351605385);
        setField(term28139, term28139.getClass(), "setting", "oTGxFdiaIW");
        setField(term28139, term28139.getClass(), "timezone", "jlyFvaZlmv");
        setField(term28139, term28139.getClass(), "res_class", "sofyLEfomV");
        term28315 = new Integer(278355793);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term28315;
        callMethod(klass, "setMinute", argTypes, term28139, args);
    }

};


