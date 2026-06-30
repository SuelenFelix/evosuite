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

public class ScoreResp_setLevel_17614975916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57783;
     Object term57799;

    public ScoreResp_setLevel_17614975916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57783 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term57783, term57783.getClass(), "musicId", 1322938574);
        setIntField(term57783, term57783.getClass(), "level", -1636808378);
        setIntField(term57783, term57783.getClass(), "playCount", 1132856767);
        setIntField(term57783, term57783.getClass(), "scoreMax", 1028135109);
        setIntField(term57783, term57783.getClass(), "resRequestCount", -576638264);
        setIntField(term57783, term57783.getClass(), "resAcceptCount", -582124031);
        setIntField(term57783, term57783.getClass(), "resSuccessCount", -1908433542);
        setIntField(term57783, term57783.getClass(), "missCount", 700489923);
        setIntField(term57783, term57783.getClass(), "maxComboCount", -1490991707);
        setBooleanField(term57783, term57783.getClass(), "isFullCombo", true);
        setBooleanField(term57783, term57783.getClass(), "isAllJustice", true);
        setBooleanField(term57783, term57783.getClass(), "isSuccess", true);
        setIntField(term57783, term57783.getClass(), "fullChain", -1869327557);
        setIntField(term57783, term57783.getClass(), "maxChain", -1846337897);
        setIntField(term57783, term57783.getClass(), "scoreRank", 1156768326);
        term57799 = new Integer(-393842466);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term57799;
        callMethod(klass, "setLevel", argTypes, term57783, args);
    }

};


