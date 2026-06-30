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

public class PowerOnResponseV3_getNickname_12239733856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2257;

    public PowerOnResponseV3_getNickname_12239733856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2257 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term2257, term2257.getClass(), "stat", -1955890973);
        setField(term2257, term2257.getClass(), "uri", "AWRooQKkdW");
        setField(term2257, term2257.getClass(), "host", "vjxIhXHxGR");
        setField(term2257, term2257.getClass(), "place_id", "QXzGXbEXMu");
        setField(term2257, term2257.getClass(), "name", "qxSDVejjiY");
        setField(term2257, term2257.getClass(), "nickname", "xBsXSDjXYK");
        setField(term2257, term2257.getClass(), "region0", "sEnIVFtZuQ");
        setField(term2257, term2257.getClass(), "region_name0", "ZVecLZMLHF");
        setField(term2257, term2257.getClass(), "region_name1", "fztQhjqwdP");
        setField(term2257, term2257.getClass(), "region_name2", "eVpkWxjuki");
        setField(term2257, term2257.getClass(), "region_name3", "SJiQaLvSKv");
        setField(term2257, term2257.getClass(), "country", "OEXDRUKcFl");
        setField(term2257, term2257.getClass(), "allnet_id", "RYdKCNNMBR");
        setField(term2257, term2257.getClass(), "client_timezone", "yGtHPyvYiQ");
        setField(term2257, term2257.getClass(), "utc_time", "MvRIxilFMJ");
        setField(term2257, term2257.getClass(), "setting", "iNwOJRBEjp");
        setField(term2257, term2257.getClass(), "res_ver", "XylxrMBraH");
        setField(term2257, term2257.getClass(), "token", "pORebkoRdD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNickname", argTypes, term2257, args);
    }

};


