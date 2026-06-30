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

public class GameSetting_toString_42393894223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5858;

    public GameSetting_toString_42393894223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5858 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting"));
        setBooleanField(term5858, term5858.getClass(), "isMaintenance", false);
        setIntField(term5858, term5858.getClass(), "requestInterval", 1050420173);
        setField(term5858, term5858.getClass(), "rebootStartTime", "RjNoEywJbC");
        setField(term5858, term5858.getClass(), "rebootEndTime", "RTTvrwwhou");
        setIntField(term5858, term5858.getClass(), "movieUploadLimit", 994300935);
        setIntField(term5858, term5858.getClass(), "movieStatus", 433954476);
        setField(term5858, term5858.getClass(), "movieServerUri", "lRORwXipuk");
        setField(term5858, term5858.getClass(), "deliverServerUri", "fVdTcjgHdw");
        setField(term5858, term5858.getClass(), "oldServerUri", "wwAwLLcLPp");
        setField(term5858, term5858.getClass(), "usbDlServerUri", "nHpMKOmlpQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term5858, args);
    }

};


