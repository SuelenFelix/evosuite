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

public class ScoreResp_setMusicId_80902080615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52595;
     Object term52611;

    public ScoreResp_setMusicId_80902080615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52595 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp"));
        setIntField(term52595, term52595.getClass(), "musicId", 1810592574);
        setIntField(term52595, term52595.getClass(), "level", 1394978641);
        setIntField(term52595, term52595.getClass(), "playCount", 1085224973);
        setIntField(term52595, term52595.getClass(), "scoreMax", 580824436);
        setIntField(term52595, term52595.getClass(), "resRequestCount", 400588448);
        setIntField(term52595, term52595.getClass(), "resAcceptCount", -798151545);
        setIntField(term52595, term52595.getClass(), "resSuccessCount", -243386399);
        setIntField(term52595, term52595.getClass(), "missCount", 1238856040);
        setIntField(term52595, term52595.getClass(), "maxComboCount", -171442968);
        setBooleanField(term52595, term52595.getClass(), "isFullCombo", false);
        setBooleanField(term52595, term52595.getClass(), "isAllJustice", true);
        setBooleanField(term52595, term52595.getClass(), "isSuccess", false);
        setIntField(term52595, term52595.getClass(), "fullChain", 1345075451);
        setIntField(term52595, term52595.getClass(), "maxChain", -482097687);
        setIntField(term52595, term52595.getClass(), "scoreRank", -1155698012);
        term52611 = new Integer(-1635314310);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term52611;
        callMethod(klass, "setMusicId", argTypes, term52595, args);
    }

};


