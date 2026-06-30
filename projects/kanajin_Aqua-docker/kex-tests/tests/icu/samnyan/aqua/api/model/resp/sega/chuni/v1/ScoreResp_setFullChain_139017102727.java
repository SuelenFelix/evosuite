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

public class ScoreResp_setFullChain_139017102727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57981;
     Object term57997;

    public ScoreResp_setFullChain_139017102727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57981 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp"));
        setIntField(term57981, term57981.getClass(), "musicId", 1985101421);
        setIntField(term57981, term57981.getClass(), "level", 422564495);
        setIntField(term57981, term57981.getClass(), "playCount", -1614243846);
        setIntField(term57981, term57981.getClass(), "scoreMax", 1218830458);
        setIntField(term57981, term57981.getClass(), "resRequestCount", 476903736);
        setIntField(term57981, term57981.getClass(), "resAcceptCount", -832801133);
        setIntField(term57981, term57981.getClass(), "resSuccessCount", 658732890);
        setIntField(term57981, term57981.getClass(), "missCount", 888621409);
        setIntField(term57981, term57981.getClass(), "maxComboCount", 665526857);
        setBooleanField(term57981, term57981.getClass(), "isFullCombo", true);
        setBooleanField(term57981, term57981.getClass(), "isAllJustice", true);
        setBooleanField(term57981, term57981.getClass(), "isSuccess", false);
        setIntField(term57981, term57981.getClass(), "fullChain", 184439959);
        setIntField(term57981, term57981.getClass(), "maxChain", -153314488);
        setIntField(term57981, term57981.getClass(), "scoreRank", -1106116513);
        term57997 = new Integer(1454640705);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ScoreResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term57997;
        callMethod(klass, "setFullChain", argTypes, term57981, args);
    }

};


