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

public class ScoreResp_setScoreRank_48173103329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58017;
     Object term58033;

    public ScoreResp_setScoreRank_48173103329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58017 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term58017, term58017.getClass(), "musicId", 481428944);
        setIntField(term58017, term58017.getClass(), "level", 585379621);
        setIntField(term58017, term58017.getClass(), "playCount", 1343392329);
        setIntField(term58017, term58017.getClass(), "scoreMax", 9075231);
        setIntField(term58017, term58017.getClass(), "resRequestCount", -1835849143);
        setIntField(term58017, term58017.getClass(), "resAcceptCount", 156667044);
        setIntField(term58017, term58017.getClass(), "resSuccessCount", -1224273100);
        setIntField(term58017, term58017.getClass(), "missCount", -1428004018);
        setIntField(term58017, term58017.getClass(), "maxComboCount", -296242927);
        setBooleanField(term58017, term58017.getClass(), "isFullCombo", false);
        setBooleanField(term58017, term58017.getClass(), "isAllJustice", false);
        setBooleanField(term58017, term58017.getClass(), "isSuccess", true);
        setIntField(term58017, term58017.getClass(), "fullChain", -1009003985);
        setIntField(term58017, term58017.getClass(), "maxChain", 281679450);
        setIntField(term58017, term58017.getClass(), "scoreRank", -1773524930);
        term58033 = new Integer(2053145277);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term58033;
        callMethod(klass, "setScoreRank", argTypes, term58017, args);
    }

};


