package icu.samnyan.aqua.sega.maimai2.model.response.data;

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
import static icu.samnyan.aqua.sega.maimai2.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GameSetting_canEqual_38884817023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5355;
     Object term5433;

    public GameSetting_canEqual_38884817023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5355 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term5355, term5355.getClass(), "isMaintenance", true);
        setIntField(term5355, term5355.getClass(), "requestInterval", 1426800646);
        setField(term5355, term5355.getClass(), "rebootStartTime", "jXKxUGTuEF");
        setField(term5355, term5355.getClass(), "rebootEndTime", "nDCcyhiTnS");
        setIntField(term5355, term5355.getClass(), "movieUploadLimit", 954234820);
        setIntField(term5355, term5355.getClass(), "movieStatus", 1047346538);
        setField(term5355, term5355.getClass(), "movieServerUri", "Bcivwcjece");
        setField(term5355, term5355.getClass(), "deliverServerUri", "QTefjRuiez");
        setField(term5355, term5355.getClass(), "oldServerUri", "SQZVNkAVBB");
        setField(term5355, term5355.getClass(), "usbDlServerUri", "mrSAYJlddZ");
        setIntField(term5355, term5355.getClass(), "rebootInterval", 728436340);
        term5433 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5433;
        callMethod(klass, "canEqual", argTypes, term5355, args);
    }

};


