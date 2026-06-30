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
import java.lang.Boolean;

public class ScoreResp_setSuccess_38174864226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57963;
     Object term57979;

    public ScoreResp_setSuccess_38174864226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57963 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term57963, term57963.getClass(), "musicId", 1007162436);
        setIntField(term57963, term57963.getClass(), "level", -1475097555);
        setIntField(term57963, term57963.getClass(), "playCount", 1715200190);
        setIntField(term57963, term57963.getClass(), "scoreMax", 766065716);
        setIntField(term57963, term57963.getClass(), "resRequestCount", -431182213);
        setIntField(term57963, term57963.getClass(), "resAcceptCount", 419448852);
        setIntField(term57963, term57963.getClass(), "resSuccessCount", -494367790);
        setIntField(term57963, term57963.getClass(), "missCount", 620015992);
        setIntField(term57963, term57963.getClass(), "maxComboCount", 396108638);
        setBooleanField(term57963, term57963.getClass(), "isFullCombo", true);
        setBooleanField(term57963, term57963.getClass(), "isAllJustice", false);
        setBooleanField(term57963, term57963.getClass(), "isSuccess", true);
        setIntField(term57963, term57963.getClass(), "fullChain", 581841369);
        setIntField(term57963, term57963.getClass(), "maxChain", 970094723);
        setIntField(term57963, term57963.getClass(), "scoreRank", 376622340);
        term57979 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term57979;
        callMethod(klass, "setSuccess", argTypes, term57963, args);
    }

};


