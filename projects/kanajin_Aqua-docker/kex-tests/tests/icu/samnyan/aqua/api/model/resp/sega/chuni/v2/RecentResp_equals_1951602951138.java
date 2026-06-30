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

public class RecentResp_equals_1951602951138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52165;

    public RecentResp_equals_1951602951138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52165 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        setField(term52165, term52165.getClass(), "playDate", null);
        setField(term52165, term52165.getClass(), "userPlayDate", null);
        setIntField(term52165, term52165.getClass(), "musicId", 0);
        setIntField(term52165, term52165.getClass(), "level", 0);
        setIntField(term52165, term52165.getClass(), "customId", 0);
        setIntField(term52165, term52165.getClass(), "playedCustom1", 0);
        setIntField(term52165, term52165.getClass(), "playedCustom2", 0);
        setIntField(term52165, term52165.getClass(), "playedCustom3", 0);
        setIntField(term52165, term52165.getClass(), "track", 0);
        setIntField(term52165, term52165.getClass(), "score", 0);
        setIntField(term52165, term52165.getClass(), "rank", 0);
        setIntField(term52165, term52165.getClass(), "maxCombo", 0);
        setIntField(term52165, term52165.getClass(), "maxChain", 0);
        setIntField(term52165, term52165.getClass(), "rateTap", 0);
        setIntField(term52165, term52165.getClass(), "rateHold", 0);
        setIntField(term52165, term52165.getClass(), "rateSlide", 0);
        setIntField(term52165, term52165.getClass(), "rateAir", 0);
        setIntField(term52165, term52165.getClass(), "rateFlick", 0);
        setIntField(term52165, term52165.getClass(), "judgeGuilty", 0);
        setIntField(term52165, term52165.getClass(), "judgeAttack", 0);
        setIntField(term52165, term52165.getClass(), "judgeJustice", 0);
        setIntField(term52165, term52165.getClass(), "judgeCritical", 0);
        setIntField(term52165, term52165.getClass(), "playerRating", 0);
        setBooleanField(term52165, term52165.getClass(), "isNewRecord", false);
        setBooleanField(term52165, term52165.getClass(), "isFullCombo", false);
        setIntField(term52165, term52165.getClass(), "fullChainKind", 0);
        setBooleanField(term52165, term52165.getClass(), "isAllJustice", false);
        setIntField(term52165, term52165.getClass(), "characterId", 0);
        setIntField(term52165, term52165.getClass(), "skillId", 0);
        setIntField(term52165, term52165.getClass(), "playKind", 0);
        setBooleanField(term52165, term52165.getClass(), "isClear", false);
        setIntField(term52165, term52165.getClass(), "skillLevel", 0);
        setIntField(term52165, term52165.getClass(), "skillEffect", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term52165, args);
    }

};


