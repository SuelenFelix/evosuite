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
import java.lang.Integer;

public class GameSetting_setMaxCountMusic_38062884726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9059;
     Object term9176;

    public GameSetting_setMaxCountMusic_38062884726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9059 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term9059, term9059.getClass(), "romVersion", "oApgdbwnti");
        setField(term9059, term9059.getClass(), "dataVersion", "YcgHACNgyo");
        setBooleanField(term9059, term9059.getClass(), "isMaintenance", true);
        setIntField(term9059, term9059.getClass(), "requestInterval", 744634969);
        setField(term9059, term9059.getClass(), "rebootStartTime", "MrUPJzBTEn");
        setField(term9059, term9059.getClass(), "rebootEndTime", "IaSymdfFGa");
        setBooleanField(term9059, term9059.getClass(), "isBackgroundDistribute", false);
        setIntField(term9059, term9059.getClass(), "maxCountCharacter", -13561953);
        setIntField(term9059, term9059.getClass(), "maxCountItem", 2069622671);
        setIntField(term9059, term9059.getClass(), "maxCountMusic", 86341231);
        setField(term9059, term9059.getClass(), "matchStartTime", "FxSvJCIpul");
        setField(term9059, term9059.getClass(), "matchEndTime", "HCjKwpexJj");
        setIntField(term9059, term9059.getClass(), "matchTimeLimit", -926119173);
        setIntField(term9059, term9059.getClass(), "matchErrorLimit", 1613936898);
        setField(term9059, term9059.getClass(), "matchingUri", "sCpIHVPdfl");
        setField(term9059, term9059.getClass(), "udpHolePunchUri", "lMUBBGRjfY");
        setField(term9059, term9059.getClass(), "reflectorUri", "olYpqbolWL");
        term9176 = new Integer(-406599151);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term9176;
        callMethod(klass, "setMaxCountMusic", argTypes, term9059, args);
    }

};


