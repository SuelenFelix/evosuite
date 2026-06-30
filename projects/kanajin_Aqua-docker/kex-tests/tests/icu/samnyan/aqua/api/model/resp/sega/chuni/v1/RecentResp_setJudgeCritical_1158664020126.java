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

public class RecentResp_setJudgeCritical_1158664020126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56927;
     Object term56959;

    public RecentResp_setJudgeCritical_1158664020126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56927 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        setField(term56927, term56927.getClass(), "playDate", null);
        setField(term56927, term56927.getClass(), "userPlayDate", null);
        setIntField(term56927, term56927.getClass(), "musicId", 0);
        setIntField(term56927, term56927.getClass(), "level", 0);
        setIntField(term56927, term56927.getClass(), "customId", 0);
        setIntField(term56927, term56927.getClass(), "playedCustom1", 0);
        setIntField(term56927, term56927.getClass(), "playedCustom2", 0);
        setIntField(term56927, term56927.getClass(), "playedCustom3", 0);
        setIntField(term56927, term56927.getClass(), "track", 0);
        setIntField(term56927, term56927.getClass(), "score", 0);
        setIntField(term56927, term56927.getClass(), "rank", 0);
        setIntField(term56927, term56927.getClass(), "maxCombo", 0);
        setIntField(term56927, term56927.getClass(), "maxChain", 0);
        setIntField(term56927, term56927.getClass(), "rateTap", 0);
        setIntField(term56927, term56927.getClass(), "rateHold", 0);
        setIntField(term56927, term56927.getClass(), "rateSlide", 0);
        setIntField(term56927, term56927.getClass(), "rateAir", 0);
        setIntField(term56927, term56927.getClass(), "rateFlick", 0);
        setIntField(term56927, term56927.getClass(), "judgeGuilty", 0);
        setIntField(term56927, term56927.getClass(), "judgeAttack", 0);
        setIntField(term56927, term56927.getClass(), "judgeJustice", 0);
        setIntField(term56927, term56927.getClass(), "judgeCritical", 0);
        setIntField(term56927, term56927.getClass(), "playerRating", 0);
        setBooleanField(term56927, term56927.getClass(), "isNewRecord", false);
        setBooleanField(term56927, term56927.getClass(), "isFullCombo", false);
        setIntField(term56927, term56927.getClass(), "fullChainKind", 0);
        setBooleanField(term56927, term56927.getClass(), "isAllJustice", false);
        setIntField(term56927, term56927.getClass(), "characterId", 0);
        setIntField(term56927, term56927.getClass(), "skillId", 0);
        setIntField(term56927, term56927.getClass(), "playKind", 0);
        setBooleanField(term56927, term56927.getClass(), "isClear", false);
        setIntField(term56927, term56927.getClass(), "skillLevel", 0);
        setIntField(term56927, term56927.getClass(), "skillEffect", 0);
        term56959 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term56959;
        callMethod(klass, "setJudgeCritical", argTypes, term56927, args);
    }

};


