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

public class GameSetting_hashCode_8682074822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5721;

    public GameSetting_hashCode_8682074822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5721 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting"));
        setBooleanField(term5721, term5721.getClass(), "isMaintenance", false);
        setIntField(term5721, term5721.getClass(), "requestInterval", 778959809);
        setField(term5721, term5721.getClass(), "rebootStartTime", "vBnWPlsZMk");
        setField(term5721, term5721.getClass(), "rebootEndTime", "fIZsWucfXz");
        setIntField(term5721, term5721.getClass(), "movieUploadLimit", -7504064);
        setIntField(term5721, term5721.getClass(), "movieStatus", -1464364418);
        setField(term5721, term5721.getClass(), "movieServerUri", "IApvtmfhnq");
        setField(term5721, term5721.getClass(), "deliverServerUri", "VSaNnhMpRc");
        setField(term5721, term5721.getClass(), "oldServerUri", "QNjNTLlUaV");
        setField(term5721, term5721.getClass(), "usbDlServerUri", "hIYsRyOZxk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term5721, args);
    }

};


