package icu.samnyan.aqua.api.model.resp.sega.chuni.v1;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ScoreResp_setMaxChain_47818042028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57999;
     Object term58015;

    public ScoreResp_setMaxChain_47818042028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57999 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term57999, term57999.getClass(), "musicId", -1492168193);
        setIntField(term57999, term57999.getClass(), "level", 144805805);
        setIntField(term57999, term57999.getClass(), "playCount", 804939687);
        setIntField(term57999, term57999.getClass(), "scoreMax", 1638315840);
        setIntField(term57999, term57999.getClass(), "resRequestCount", 2098018411);
        setIntField(term57999, term57999.getClass(), "resAcceptCount", 696364986);
        setIntField(term57999, term57999.getClass(), "resSuccessCount", 2133855407);
        setIntField(term57999, term57999.getClass(), "missCount", -646910326);
        setIntField(term57999, term57999.getClass(), "maxComboCount", -740085612);
        setBooleanField(term57999, term57999.getClass(), "isFullCombo", true);
        setBooleanField(term57999, term57999.getClass(), "isAllJustice", false);
        setBooleanField(term57999, term57999.getClass(), "isSuccess", true);
        setIntField(term57999, term57999.getClass(), "fullChain", -377361876);
        setIntField(term57999, term57999.getClass(), "maxChain", -138587866);
        setIntField(term57999, term57999.getClass(), "scoreRank", 473269350);
        term58015 = new Integer(-1267755429);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term58015;
        callMethod(klass, "setMaxChain", argTypes, term57999, args);
    }

};


