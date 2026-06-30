package icu.samnyan.aqua.sega.chusan.model.response;

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
import static icu.samnyan.aqua.sega.chusan.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Boolean;

public class GetGameSettingResp_setDumpUpload_8949198234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54394;
     Object term54514;

    public GetGameSettingResp_setDumpUpload_8949198234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54394 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetGameSettingResp"));
        Object term54395 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term54395, term54395.getClass(), "romVersion", "SWbairdDKL");
        setField(term54395, term54395.getClass(), "dataVersion", "AibUFEALwF");
        setBooleanField(term54395, term54395.getClass(), "isMaintenance", false);
        setIntField(term54395, term54395.getClass(), "requestInterval", 702531885);
        setField(term54395, term54395.getClass(), "rebootStartTime", "eXOUrXTrdW");
        setField(term54395, term54395.getClass(), "rebootEndTime", "aomDEETHep");
        setBooleanField(term54395, term54395.getClass(), "isBackgroundDistribute", false);
        setIntField(term54395, term54395.getClass(), "maxCountCharacter", 137777785);
        setIntField(term54395, term54395.getClass(), "maxCountItem", -1972381311);
        setIntField(term54395, term54395.getClass(), "maxCountMusic", -1871425005);
        setField(term54395, term54395.getClass(), "matchStartTime", "GTMrlIYfIM");
        setField(term54395, term54395.getClass(), "matchEndTime", "eiDqCOWbLE");
        setIntField(term54395, term54395.getClass(), "matchTimeLimit", -1968820002);
        setIntField(term54395, term54395.getClass(), "matchErrorLimit", 1126576455);
        setField(term54395, term54395.getClass(), "matchingUri", "OBbbsrFNxC");
        setField(term54395, term54395.getClass(), "udpHolePunchUri", "mvdZyohjrq");
        setField(term54395, term54395.getClass(), "reflectorUri", "hXsByefZqZ");
        setField(term54394, term54394.getClass(), "gameSetting", term54395);
        setBooleanField(term54394, term54394.getClass(), "isDumpUpload", false);
        setBooleanField(term54394, term54394.getClass(), "isAou", false);
        term54514 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term54514;
        callMethod(klass, "setDumpUpload", argTypes, term54394, args);
    }

};


