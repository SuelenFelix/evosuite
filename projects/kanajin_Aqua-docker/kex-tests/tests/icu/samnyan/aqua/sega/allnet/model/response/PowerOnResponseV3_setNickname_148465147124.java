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

public class PowerOnResponseV3_setNickname_148465147124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9115;

    public PowerOnResponseV3_setNickname_148465147124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9115 = newInstance(Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3"));
        setIntField(term9115, term9115.getClass(), "stat", 1135664017);
        setField(term9115, term9115.getClass(), "uri", "uXYcXVYJZM");
        setField(term9115, term9115.getClass(), "host", "BJhjdJUhkz");
        setField(term9115, term9115.getClass(), "place_id", "cdHYQDgUZR");
        setField(term9115, term9115.getClass(), "name", "KAORSSPSeV");
        setField(term9115, term9115.getClass(), "nickname", "UimMMORkzd");
        setField(term9115, term9115.getClass(), "region0", "huVIXUWLtI");
        setField(term9115, term9115.getClass(), "region_name0", "vhKzFyKPOT");
        setField(term9115, term9115.getClass(), "region_name1", "nQhIgWXdRc");
        setField(term9115, term9115.getClass(), "region_name2", "EusenEbIoF");
        setField(term9115, term9115.getClass(), "region_name3", "SScVQYSvWH");
        setField(term9115, term9115.getClass(), "country", "MnovcqFhCl");
        setField(term9115, term9115.getClass(), "allnet_id", "qYtAeLzOhW");
        setField(term9115, term9115.getClass(), "client_timezone", "tJzmOfcUnY");
        setField(term9115, term9115.getClass(), "utc_time", "TKlccZUpjz");
        setField(term9115, term9115.getClass(), "setting", "GGzwMoHZXC");
        setField(term9115, term9115.getClass(), "res_ver", "IpmgwHTgnG");
        setField(term9115, term9115.getClass(), "token", "tIpkeYIezR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.allnet.model.response.PowerOnResponseV3");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "YkZtEtthvz";
        callMethod(klass, "setNickname", argTypes, term9115, args);
    }

};


