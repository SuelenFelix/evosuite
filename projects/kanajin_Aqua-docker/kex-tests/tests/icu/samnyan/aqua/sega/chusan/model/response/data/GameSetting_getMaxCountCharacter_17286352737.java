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

public class GameSetting_getMaxCountCharacter_17286352737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5028;

    public GameSetting_getMaxCountCharacter_17286352737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5028 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term5028, term5028.getClass(), "romVersion", "dikKjYjmRO");
        setField(term5028, term5028.getClass(), "dataVersion", "GJnnMDVnEP");
        setBooleanField(term5028, term5028.getClass(), "isMaintenance", true);
        setIntField(term5028, term5028.getClass(), "requestInterval", 1451393741);
        setField(term5028, term5028.getClass(), "rebootStartTime", "zSMVllDpfk");
        setField(term5028, term5028.getClass(), "rebootEndTime", "iptRXVDoYE");
        setBooleanField(term5028, term5028.getClass(), "isBackgroundDistribute", true);
        setIntField(term5028, term5028.getClass(), "maxCountCharacter", -1115815564);
        setIntField(term5028, term5028.getClass(), "maxCountItem", 425132480);
        setIntField(term5028, term5028.getClass(), "maxCountMusic", 1968674006);
        setField(term5028, term5028.getClass(), "matchStartTime", "kucsxnvbES");
        setField(term5028, term5028.getClass(), "matchEndTime", "IdGzDFfcZf");
        setIntField(term5028, term5028.getClass(), "matchTimeLimit", -634536248);
        setIntField(term5028, term5028.getClass(), "matchErrorLimit", 1090329667);
        setField(term5028, term5028.getClass(), "matchingUri", "KDdRNhZmnU");
        setField(term5028, term5028.getClass(), "udpHolePunchUri", "iMsqJaKlDC");
        setField(term5028, term5028.getClass(), "reflectorUri", "aPkGHbZyjj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxCountCharacter", argTypes, term5028, args);
    }

};


