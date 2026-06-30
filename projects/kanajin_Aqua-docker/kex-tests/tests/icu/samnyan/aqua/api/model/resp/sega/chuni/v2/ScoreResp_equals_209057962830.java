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

public class ScoreResp_equals_209057962830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52865;
     Object term52881;

    public ScoreResp_equals_209057962830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52865 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term52865, term52865.getClass(), "musicId", 1957459536);
        setIntField(term52865, term52865.getClass(), "level", 1523266697);
        setIntField(term52865, term52865.getClass(), "playCount", 487116383);
        setIntField(term52865, term52865.getClass(), "scoreMax", 968755800);
        setIntField(term52865, term52865.getClass(), "resRequestCount", 1491289140);
        setIntField(term52865, term52865.getClass(), "resAcceptCount", 424804018);
        setIntField(term52865, term52865.getClass(), "resSuccessCount", 835463182);
        setIntField(term52865, term52865.getClass(), "missCount", -1730193267);
        setIntField(term52865, term52865.getClass(), "maxComboCount", 434941375);
        setBooleanField(term52865, term52865.getClass(), "isFullCombo", false);
        setBooleanField(term52865, term52865.getClass(), "isAllJustice", false);
        setBooleanField(term52865, term52865.getClass(), "isSuccess", false);
        setIntField(term52865, term52865.getClass(), "fullChain", 1467794711);
        setIntField(term52865, term52865.getClass(), "maxChain", -491366166);
        setIntField(term52865, term52865.getClass(), "scoreRank", 1410370567);
        term52881 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term52881;
        callMethod(klass, "equals", argTypes, term52865, args);
    }

};


