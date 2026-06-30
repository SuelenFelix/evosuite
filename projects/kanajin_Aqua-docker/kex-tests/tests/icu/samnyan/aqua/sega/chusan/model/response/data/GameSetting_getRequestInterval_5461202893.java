package icu.samnyan.aqua.sega.chusan.model.response.data;

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
import static icu.samnyan.aqua.sega.chusan.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GameSetting_getRequestInterval_5461202893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4200;

    public GameSetting_getRequestInterval_5461202893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4200 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term4200, term4200.getClass(), "romVersion", "nJnRIRiLZK");
        setField(term4200, term4200.getClass(), "dataVersion", "eWnrMSbYbT");
        setBooleanField(term4200, term4200.getClass(), "isMaintenance", false);
        setIntField(term4200, term4200.getClass(), "requestInterval", 1526503433);
        setField(term4200, term4200.getClass(), "rebootStartTime", "AjoFvDFyCY");
        setField(term4200, term4200.getClass(), "rebootEndTime", "OFTJwdPiTG");
        setBooleanField(term4200, term4200.getClass(), "isBackgroundDistribute", true);
        setIntField(term4200, term4200.getClass(), "maxCountCharacter", 1765728316);
        setIntField(term4200, term4200.getClass(), "maxCountItem", -1459041031);
        setIntField(term4200, term4200.getClass(), "maxCountMusic", 846881911);
        setField(term4200, term4200.getClass(), "matchStartTime", "QiUprSEluR");
        setField(term4200, term4200.getClass(), "matchEndTime", "cDOXXottZh");
        setIntField(term4200, term4200.getClass(), "matchTimeLimit", 780077059);
        setIntField(term4200, term4200.getClass(), "matchErrorLimit", -924663332);
        setField(term4200, term4200.getClass(), "matchingUri", "rfqJDkDppz");
        setField(term4200, term4200.getClass(), "udpHolePunchUri", "MGorMVGauT");
        setField(term4200, term4200.getClass(), "reflectorUri", "jXKxUGTuEF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRequestInterval", argTypes, term4200, args);
    }

};


