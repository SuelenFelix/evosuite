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

public class PowerOnResponseV2_getStat_15490441351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16195;

    public PowerOnResponseV2_getStat_15490441351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16195 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term16195, term16195.getClass(), "stat", -14890619);
        setField(term16195, term16195.getClass(), "uri", "rOfPCPHmtJ");
        setField(term16195, term16195.getClass(), "host", "EnmiAvfpJv");
        setField(term16195, term16195.getClass(), "place_id", "AdYzLPMcwe");
        setField(term16195, term16195.getClass(), "name", "FrTZLybkKk");
        setField(term16195, term16195.getClass(), "nickname", "FlxVmiMYKP");
        setField(term16195, term16195.getClass(), "region0", "fgOpAWlGYN");
        setField(term16195, term16195.getClass(), "region_name0", "PNzNzzjSXM");
        setField(term16195, term16195.getClass(), "region_name1", "ktKcSZiuGM");
        setField(term16195, term16195.getClass(), "region_name2", "PSOttyUeqv");
        setField(term16195, term16195.getClass(), "region_name3", "HmEvTlmzXo");
        setField(term16195, term16195.getClass(), "country", "BMMonTIZgJ");
        setIntField(term16195, term16195.getClass(), "year", 1632125673);
        setIntField(term16195, term16195.getClass(), "month", 454281060);
        setIntField(term16195, term16195.getClass(), "day", -1786399638);
        setIntField(term16195, term16195.getClass(), "hour", 2055867847);
        setIntField(term16195, term16195.getClass(), "minute", -1048298087);
        setIntField(term16195, term16195.getClass(), "second", 292681826);
        setField(term16195, term16195.getClass(), "setting", "QXyFXBjFde");
        setField(term16195, term16195.getClass(), "timezone", "xVFgeyYxZS");
        setField(term16195, term16195.getClass(), "res_class", "iQiGTulJiH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStat", argTypes, term16195, args);
    }

};


