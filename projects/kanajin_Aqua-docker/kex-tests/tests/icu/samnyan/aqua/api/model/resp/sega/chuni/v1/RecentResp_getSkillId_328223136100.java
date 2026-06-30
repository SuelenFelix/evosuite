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

public class RecentResp_getSkillId_328223136100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56057;

    public RecentResp_getSkillId_328223136100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56057 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        setField(term56057, term56057.getClass(), "playDate", null);
        setField(term56057, term56057.getClass(), "userPlayDate", null);
        setIntField(term56057, term56057.getClass(), "musicId", 0);
        setIntField(term56057, term56057.getClass(), "level", 0);
        setIntField(term56057, term56057.getClass(), "customId", 0);
        setIntField(term56057, term56057.getClass(), "playedCustom1", 0);
        setIntField(term56057, term56057.getClass(), "playedCustom2", 0);
        setIntField(term56057, term56057.getClass(), "playedCustom3", 0);
        setIntField(term56057, term56057.getClass(), "track", 0);
        setIntField(term56057, term56057.getClass(), "score", 0);
        setIntField(term56057, term56057.getClass(), "rank", 0);
        setIntField(term56057, term56057.getClass(), "maxCombo", 0);
        setIntField(term56057, term56057.getClass(), "maxChain", 0);
        setIntField(term56057, term56057.getClass(), "rateTap", 0);
        setIntField(term56057, term56057.getClass(), "rateHold", 0);
        setIntField(term56057, term56057.getClass(), "rateSlide", 0);
        setIntField(term56057, term56057.getClass(), "rateAir", 0);
        setIntField(term56057, term56057.getClass(), "rateFlick", 0);
        setIntField(term56057, term56057.getClass(), "judgeGuilty", 0);
        setIntField(term56057, term56057.getClass(), "judgeAttack", 0);
        setIntField(term56057, term56057.getClass(), "judgeJustice", 0);
        setIntField(term56057, term56057.getClass(), "judgeCritical", 0);
        setIntField(term56057, term56057.getClass(), "playerRating", 0);
        setBooleanField(term56057, term56057.getClass(), "isNewRecord", false);
        setBooleanField(term56057, term56057.getClass(), "isFullCombo", false);
        setIntField(term56057, term56057.getClass(), "fullChainKind", 0);
        setBooleanField(term56057, term56057.getClass(), "isAllJustice", false);
        setIntField(term56057, term56057.getClass(), "characterId", 0);
        setIntField(term56057, term56057.getClass(), "skillId", 0);
        setIntField(term56057, term56057.getClass(), "playKind", 0);
        setBooleanField(term56057, term56057.getClass(), "isClear", false);
        setIntField(term56057, term56057.getClass(), "skillLevel", 0);
        setIntField(term56057, term56057.getClass(), "skillEffect", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSkillId", argTypes, term56057, args);
    }

};


