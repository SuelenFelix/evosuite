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

public class GetGameSettingResp_equals_19547427366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54818;
     Object term54938;

    public GetGameSettingResp_equals_19547427366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54818 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetGameSettingResp"));
        Object term54819 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term54819, term54819.getClass(), "romVersion", "WHpoLWpffz");
        setField(term54819, term54819.getClass(), "dataVersion", "axiXBkomuw");
        setBooleanField(term54819, term54819.getClass(), "isMaintenance", false);
        setIntField(term54819, term54819.getClass(), "requestInterval", 247563740);
        setField(term54819, term54819.getClass(), "rebootStartTime", "nhByIXwUpO");
        setField(term54819, term54819.getClass(), "rebootEndTime", "vVySvQZVok");
        setBooleanField(term54819, term54819.getClass(), "isBackgroundDistribute", true);
        setIntField(term54819, term54819.getClass(), "maxCountCharacter", 1806796271);
        setIntField(term54819, term54819.getClass(), "maxCountItem", -91540855);
        setIntField(term54819, term54819.getClass(), "maxCountMusic", -2120152870);
        setField(term54819, term54819.getClass(), "matchStartTime", "fDVzkGiHev");
        setField(term54819, term54819.getClass(), "matchEndTime", "CanAbWJNgt");
        setIntField(term54819, term54819.getClass(), "matchTimeLimit", -2111077974);
        setIntField(term54819, term54819.getClass(), "matchErrorLimit", 1055817592);
        setField(term54819, term54819.getClass(), "matchingUri", "tFRLUuSeUt");
        setField(term54819, term54819.getClass(), "udpHolePunchUri", "KcKxvbBAHa");
        setField(term54819, term54819.getClass(), "reflectorUri", "NbFVXCPmxn");
        setField(term54818, term54818.getClass(), "gameSetting", term54819);
        setBooleanField(term54818, term54818.getClass(), "isDumpUpload", false);
        setBooleanField(term54818, term54818.getClass(), "isAou", false);
        term54938 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term54938;
        callMethod(klass, "equals", argTypes, term54818, args);
    }

};


