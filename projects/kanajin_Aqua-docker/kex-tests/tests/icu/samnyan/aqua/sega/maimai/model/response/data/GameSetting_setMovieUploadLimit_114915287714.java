package icu.samnyan.aqua.sega.maimai.model.response.data;

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
import static icu.samnyan.aqua.sega.maimai.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class GameSetting_setMovieUploadLimit_114915287714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4531;
     Object term4608;

    public GameSetting_setMovieUploadLimit_114915287714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4531 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting"));
        setBooleanField(term4531, term4531.getClass(), "isMaintenance", false);
        setIntField(term4531, term4531.getClass(), "requestInterval", -1099664830);
        setField(term4531, term4531.getClass(), "rebootStartTime", "BJhjdJUhkz");
        setField(term4531, term4531.getClass(), "rebootEndTime", "cdHYQDgUZR");
        setIntField(term4531, term4531.getClass(), "movieUploadLimit", 873502011);
        setIntField(term4531, term4531.getClass(), "movieStatus", -2004575734);
        setField(term4531, term4531.getClass(), "movieServerUri", "KAORSSPSeV");
        setField(term4531, term4531.getClass(), "deliverServerUri", "UimMMORkzd");
        setField(term4531, term4531.getClass(), "oldServerUri", "huVIXUWLtI");
        setField(term4531, term4531.getClass(), "usbDlServerUri", "vhKzFyKPOT");
        term4608 = new Integer(1491468856);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4608;
        callMethod(klass, "setMovieUploadLimit", argTypes, term4531, args);
    }

};


