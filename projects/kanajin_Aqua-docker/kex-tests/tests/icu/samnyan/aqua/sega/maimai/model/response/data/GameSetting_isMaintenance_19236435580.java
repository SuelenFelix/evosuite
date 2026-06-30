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

public class GameSetting_isMaintenance_19236435580 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2565;

    public GameSetting_isMaintenance_19236435580() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2565 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting"));
        setBooleanField(term2565, term2565.getClass(), "isMaintenance", true);
        setIntField(term2565, term2565.getClass(), "requestInterval", 1226377461);
        setField(term2565, term2565.getClass(), "rebootStartTime", "IBpaxltauX");
        setField(term2565, term2565.getClass(), "rebootEndTime", "hePqROaplw");
        setIntField(term2565, term2565.getClass(), "movieUploadLimit", -1540486514);
        setIntField(term2565, term2565.getClass(), "movieStatus", 1471031478);
        setField(term2565, term2565.getClass(), "movieServerUri", "PJcSNDruWd");
        setField(term2565, term2565.getClass(), "deliverServerUri", "VVNNlAePXF");
        setField(term2565, term2565.getClass(), "oldServerUri", "jnwVnmKAFv");
        setField(term2565, term2565.getClass(), "usbDlServerUri", "TXyHhqeCjR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isMaintenance", argTypes, term2565, args);
    }

};


