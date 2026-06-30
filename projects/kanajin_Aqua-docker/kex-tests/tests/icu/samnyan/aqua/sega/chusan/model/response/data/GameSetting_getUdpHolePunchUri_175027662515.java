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

public class GameSetting_getUdpHolePunchUri_175027662515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6684;

    public GameSetting_getUdpHolePunchUri_175027662515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6684 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term6684, term6684.getClass(), "romVersion", "cfRimmJxqA");
        setField(term6684, term6684.getClass(), "dataVersion", "oOnRVGqFmy");
        setBooleanField(term6684, term6684.getClass(), "isMaintenance", false);
        setIntField(term6684, term6684.getClass(), "requestInterval", 1497057438);
        setField(term6684, term6684.getClass(), "rebootStartTime", "LaXzFIlWMk");
        setField(term6684, term6684.getClass(), "rebootEndTime", "GuVQjhBxma");
        setBooleanField(term6684, term6684.getClass(), "isBackgroundDistribute", false);
        setIntField(term6684, term6684.getClass(), "maxCountCharacter", 1526060255);
        setIntField(term6684, term6684.getClass(), "maxCountItem", -833785119);
        setIntField(term6684, term6684.getClass(), "maxCountMusic", -1920705464);
        setField(term6684, term6684.getClass(), "matchStartTime", "WAVMPPbIfL");
        setField(term6684, term6684.getClass(), "matchEndTime", "GISHLsgALf");
        setIntField(term6684, term6684.getClass(), "matchTimeLimit", 428714196);
        setIntField(term6684, term6684.getClass(), "matchErrorLimit", 934939315);
        setField(term6684, term6684.getClass(), "matchingUri", "PVykkUSgBq");
        setField(term6684, term6684.getClass(), "udpHolePunchUri", "tnKbZaCsuj");
        setField(term6684, term6684.getClass(), "reflectorUri", "ZFpcYBgLNC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUdpHolePunchUri", argTypes, term6684, args);
    }

};


