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

public class PowerOnResponseV2_getSecond_66878028118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21567;

    public PowerOnResponseV2_getSecond_66878028118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21567 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2"));
        setIntField(term21567, term21567.getClass(), "stat", -2014576105);
        setField(term21567, term21567.getClass(), "uri", "LHnkeoNwHq");
        setField(term21567, term21567.getClass(), "host", "gVnDVbSyKa");
        setField(term21567, term21567.getClass(), "place_id", "kdCYNMSuoD");
        setField(term21567, term21567.getClass(), "name", "eRYlSLwtvV");
        setField(term21567, term21567.getClass(), "nickname", "duOyJsARTD");
        setField(term21567, term21567.getClass(), "region0", "xPnOHsNlyc");
        setField(term21567, term21567.getClass(), "region_name0", "OTSPWPJefj");
        setField(term21567, term21567.getClass(), "region_name1", "EOTYMqXRmE");
        setField(term21567, term21567.getClass(), "region_name2", "iTxNduwSjE");
        setField(term21567, term21567.getClass(), "region_name3", "MQUTfIiFnh");
        setField(term21567, term21567.getClass(), "country", "JeyKRznnft");
        setIntField(term21567, term21567.getClass(), "year", 1296895584);
        setIntField(term21567, term21567.getClass(), "month", 628918458);
        setIntField(term21567, term21567.getClass(), "day", -1274456137);
        setIntField(term21567, term21567.getClass(), "hour", 1041916673);
        setIntField(term21567, term21567.getClass(), "minute", -601863069);
        setIntField(term21567, term21567.getClass(), "second", 663292551);
        setField(term21567, term21567.getClass(), "setting", "vQJUCtuYpK");
        setField(term21567, term21567.getClass(), "timezone", "GHtOeztAdz");
        setField(term21567, term21567.getClass(), "res_class", "gSAtqakaLY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV2");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSecond", argTypes, term21567, args);
    }

};


