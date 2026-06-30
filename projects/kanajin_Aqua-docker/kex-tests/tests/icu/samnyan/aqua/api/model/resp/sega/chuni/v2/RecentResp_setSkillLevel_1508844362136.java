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

public class RecentResp_setSkillLevel_1508844362136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52097;
     Object term52129;

    public RecentResp_setSkillLevel_1508844362136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52097 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        setField(term52097, term52097.getClass(), "playDate", null);
        setField(term52097, term52097.getClass(), "userPlayDate", null);
        setIntField(term52097, term52097.getClass(), "musicId", 0);
        setIntField(term52097, term52097.getClass(), "level", 0);
        setIntField(term52097, term52097.getClass(), "customId", 0);
        setIntField(term52097, term52097.getClass(), "playedCustom1", 0);
        setIntField(term52097, term52097.getClass(), "playedCustom2", 0);
        setIntField(term52097, term52097.getClass(), "playedCustom3", 0);
        setIntField(term52097, term52097.getClass(), "track", 0);
        setIntField(term52097, term52097.getClass(), "score", 0);
        setIntField(term52097, term52097.getClass(), "rank", 0);
        setIntField(term52097, term52097.getClass(), "maxCombo", 0);
        setIntField(term52097, term52097.getClass(), "maxChain", 0);
        setIntField(term52097, term52097.getClass(), "rateTap", 0);
        setIntField(term52097, term52097.getClass(), "rateHold", 0);
        setIntField(term52097, term52097.getClass(), "rateSlide", 0);
        setIntField(term52097, term52097.getClass(), "rateAir", 0);
        setIntField(term52097, term52097.getClass(), "rateFlick", 0);
        setIntField(term52097, term52097.getClass(), "judgeGuilty", 0);
        setIntField(term52097, term52097.getClass(), "judgeAttack", 0);
        setIntField(term52097, term52097.getClass(), "judgeJustice", 0);
        setIntField(term52097, term52097.getClass(), "judgeCritical", 0);
        setIntField(term52097, term52097.getClass(), "playerRating", 0);
        setBooleanField(term52097, term52097.getClass(), "isNewRecord", false);
        setBooleanField(term52097, term52097.getClass(), "isFullCombo", false);
        setIntField(term52097, term52097.getClass(), "fullChainKind", 0);
        setBooleanField(term52097, term52097.getClass(), "isAllJustice", false);
        setIntField(term52097, term52097.getClass(), "characterId", 0);
        setIntField(term52097, term52097.getClass(), "skillId", 0);
        setIntField(term52097, term52097.getClass(), "playKind", 0);
        setBooleanField(term52097, term52097.getClass(), "isClear", false);
        setIntField(term52097, term52097.getClass(), "skillLevel", 0);
        setIntField(term52097, term52097.getClass(), "skillEffect", 0);
        term52129 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term52129;
        callMethod(klass, "setSkillLevel", argTypes, term52097, args);
    }

};


