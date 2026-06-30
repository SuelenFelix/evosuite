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

public class ScoreResp_setMaxComboCount_46904351923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52739;
     Object term52755;

    public ScoreResp_setMaxComboCount_46904351923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52739 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term52739, term52739.getClass(), "musicId", -1222668512);
        setIntField(term52739, term52739.getClass(), "level", 1109294828);
        setIntField(term52739, term52739.getClass(), "playCount", -596850824);
        setIntField(term52739, term52739.getClass(), "scoreMax", 1619317687);
        setIntField(term52739, term52739.getClass(), "resRequestCount", -1335475299);
        setIntField(term52739, term52739.getClass(), "resAcceptCount", 1764067908);
        setIntField(term52739, term52739.getClass(), "resSuccessCount", 1906236006);
        setIntField(term52739, term52739.getClass(), "missCount", -279175941);
        setIntField(term52739, term52739.getClass(), "maxComboCount", -574044161);
        setBooleanField(term52739, term52739.getClass(), "isFullCombo", true);
        setBooleanField(term52739, term52739.getClass(), "isAllJustice", true);
        setBooleanField(term52739, term52739.getClass(), "isSuccess", false);
        setIntField(term52739, term52739.getClass(), "fullChain", -101199395);
        setIntField(term52739, term52739.getClass(), "maxChain", 894150826);
        setIntField(term52739, term52739.getClass(), "scoreRank", -261894603);
        term52755 = new Integer(1163902450);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term52755;
        callMethod(klass, "setMaxComboCount", argTypes, term52739, args);
    }

};


