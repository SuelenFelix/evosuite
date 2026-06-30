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

public class GetGameSettingResp_hashCode_15060560618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55240;

    public GetGameSettingResp_hashCode_15060560618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55240 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetGameSettingResp"));
        Object term55241 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term55241, term55241.getClass(), "romVersion", "CBnamgJrJS");
        setField(term55241, term55241.getClass(), "dataVersion", "uJhRRqAnDP");
        setBooleanField(term55241, term55241.getClass(), "isMaintenance", false);
        setIntField(term55241, term55241.getClass(), "requestInterval", 959188355);
        setField(term55241, term55241.getClass(), "rebootStartTime", "hJCqADrhuV");
        setField(term55241, term55241.getClass(), "rebootEndTime", "RyPUBlRpNZ");
        setBooleanField(term55241, term55241.getClass(), "isBackgroundDistribute", true);
        setIntField(term55241, term55241.getClass(), "maxCountCharacter", -1044212296);
        setIntField(term55241, term55241.getClass(), "maxCountItem", -1818413689);
        setIntField(term55241, term55241.getClass(), "maxCountMusic", 1416082413);
        setField(term55241, term55241.getClass(), "matchStartTime", "ardfVpCueq");
        setField(term55241, term55241.getClass(), "matchEndTime", "wEYAmGJIEF");
        setIntField(term55241, term55241.getClass(), "matchTimeLimit", 1462806642);
        setIntField(term55241, term55241.getClass(), "matchErrorLimit", -1504046723);
        setField(term55241, term55241.getClass(), "matchingUri", "iXEhfXJomO");
        setField(term55241, term55241.getClass(), "udpHolePunchUri", "KEoUMzNdMA");
        setField(term55241, term55241.getClass(), "reflectorUri", "SOsGYAgpgW");
        setField(term55240, term55240.getClass(), "gameSetting", term55241);
        setBooleanField(term55240, term55240.getClass(), "isDumpUpload", false);
        setBooleanField(term55240, term55240.getClass(), "isAou", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term55240, args);
    }

};


