package icu.samnyan.aqua.api.model.resp.sega.chuni.v2;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ScoreResp_setResAcceptCount_27587827720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52685;
     Object term52701;

    public ScoreResp_setResAcceptCount_27587827720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52685 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term52685, term52685.getClass(), "musicId", -1188357817);
        setIntField(term52685, term52685.getClass(), "level", 800428961);
        setIntField(term52685, term52685.getClass(), "playCount", 1035639807);
        setIntField(term52685, term52685.getClass(), "scoreMax", 1255067608);
        setIntField(term52685, term52685.getClass(), "resRequestCount", -1085076149);
        setIntField(term52685, term52685.getClass(), "resAcceptCount", 2037214602);
        setIntField(term52685, term52685.getClass(), "resSuccessCount", 1791859428);
        setIntField(term52685, term52685.getClass(), "missCount", 313791373);
        setIntField(term52685, term52685.getClass(), "maxComboCount", -1757202955);
        setBooleanField(term52685, term52685.getClass(), "isFullCombo", false);
        setBooleanField(term52685, term52685.getClass(), "isAllJustice", true);
        setBooleanField(term52685, term52685.getClass(), "isSuccess", false);
        setIntField(term52685, term52685.getClass(), "fullChain", -1618822811);
        setIntField(term52685, term52685.getClass(), "maxChain", -850405849);
        setIntField(term52685, term52685.getClass(), "scoreRank", -545145172);
        term52701 = new Integer(-2069653687);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term52701;
        callMethod(klass, "setResAcceptCount", argTypes, term52685, args);
    }

};


