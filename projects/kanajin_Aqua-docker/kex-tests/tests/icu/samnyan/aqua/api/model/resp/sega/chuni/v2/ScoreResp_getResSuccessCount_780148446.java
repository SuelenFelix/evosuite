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

public class ScoreResp_getResSuccessCount_780148446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52451;

    public ScoreResp_getResSuccessCount_780148446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52451 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term52451, term52451.getClass(), "musicId", -1329172198);
        setIntField(term52451, term52451.getClass(), "level", -1036092775);
        setIntField(term52451, term52451.getClass(), "playCount", 857844283);
        setIntField(term52451, term52451.getClass(), "scoreMax", 559778075);
        setIntField(term52451, term52451.getClass(), "resRequestCount", 188273941);
        setIntField(term52451, term52451.getClass(), "resAcceptCount", 736020163);
        setIntField(term52451, term52451.getClass(), "resSuccessCount", 1233013986);
        setIntField(term52451, term52451.getClass(), "missCount", 342111166);
        setIntField(term52451, term52451.getClass(), "maxComboCount", -846825115);
        setBooleanField(term52451, term52451.getClass(), "isFullCombo", false);
        setBooleanField(term52451, term52451.getClass(), "isAllJustice", true);
        setBooleanField(term52451, term52451.getClass(), "isSuccess", false);
        setIntField(term52451, term52451.getClass(), "fullChain", -88572295);
        setIntField(term52451, term52451.getClass(), "maxChain", -1830705318);
        setIntField(term52451, term52451.getClass(), "scoreRank", 1003880925);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResSuccessCount", argTypes, term52451, args);
    }

};


