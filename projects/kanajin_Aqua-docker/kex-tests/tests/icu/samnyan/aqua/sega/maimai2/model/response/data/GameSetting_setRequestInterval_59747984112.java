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
import java.lang.Integer;

public class GameSetting_setRequestInterval_59747984112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3696;
     Object term3774;

    public GameSetting_setRequestInterval_59747984112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3696 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term3696, term3696.getClass(), "isMaintenance", true);
        setIntField(term3696, term3696.getClass(), "requestInterval", -1654552020);
        setField(term3696, term3696.getClass(), "rebootStartTime", "IbxeAMwLVt");
        setField(term3696, term3696.getClass(), "rebootEndTime", "bShlAqoTmZ");
        setIntField(term3696, term3696.getClass(), "movieUploadLimit", -1049546692);
        setIntField(term3696, term3696.getClass(), "movieStatus", 1397781598);
        setField(term3696, term3696.getClass(), "movieServerUri", "nOKlKlNhtU");
        setField(term3696, term3696.getClass(), "deliverServerUri", "gXFNBHJSey");
        setField(term3696, term3696.getClass(), "oldServerUri", "wUcSfItZgv");
        setField(term3696, term3696.getClass(), "usbDlServerUri", "rOfPCPHmtJ");
        setIntField(term3696, term3696.getClass(), "rebootInterval", -44720365);
        term3774 = new Integer(1963632911);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3774;
        callMethod(klass, "setRequestInterval", argTypes, term3696, args);
    }

};


