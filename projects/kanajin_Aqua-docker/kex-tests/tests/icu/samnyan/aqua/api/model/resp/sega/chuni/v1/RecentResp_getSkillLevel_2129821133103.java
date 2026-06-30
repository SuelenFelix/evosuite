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

public class RecentResp_getSkillLevel_2129821133103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56153;

    public RecentResp_getSkillLevel_2129821133103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56153 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        setField(term56153, term56153.getClass(), "playDate", null);
        setField(term56153, term56153.getClass(), "userPlayDate", null);
        setIntField(term56153, term56153.getClass(), "musicId", 0);
        setIntField(term56153, term56153.getClass(), "level", 0);
        setIntField(term56153, term56153.getClass(), "customId", 0);
        setIntField(term56153, term56153.getClass(), "playedCustom1", 0);
        setIntField(term56153, term56153.getClass(), "playedCustom2", 0);
        setIntField(term56153, term56153.getClass(), "playedCustom3", 0);
        setIntField(term56153, term56153.getClass(), "track", 0);
        setIntField(term56153, term56153.getClass(), "score", 0);
        setIntField(term56153, term56153.getClass(), "rank", 0);
        setIntField(term56153, term56153.getClass(), "maxCombo", 0);
        setIntField(term56153, term56153.getClass(), "maxChain", 0);
        setIntField(term56153, term56153.getClass(), "rateTap", 0);
        setIntField(term56153, term56153.getClass(), "rateHold", 0);
        setIntField(term56153, term56153.getClass(), "rateSlide", 0);
        setIntField(term56153, term56153.getClass(), "rateAir", 0);
        setIntField(term56153, term56153.getClass(), "rateFlick", 0);
        setIntField(term56153, term56153.getClass(), "judgeGuilty", 0);
        setIntField(term56153, term56153.getClass(), "judgeAttack", 0);
        setIntField(term56153, term56153.getClass(), "judgeJustice", 0);
        setIntField(term56153, term56153.getClass(), "judgeCritical", 0);
        setIntField(term56153, term56153.getClass(), "playerRating", 0);
        setBooleanField(term56153, term56153.getClass(), "isNewRecord", false);
        setBooleanField(term56153, term56153.getClass(), "isFullCombo", false);
        setIntField(term56153, term56153.getClass(), "fullChainKind", 0);
        setBooleanField(term56153, term56153.getClass(), "isAllJustice", false);
        setIntField(term56153, term56153.getClass(), "characterId", 0);
        setIntField(term56153, term56153.getClass(), "skillId", 0);
        setIntField(term56153, term56153.getClass(), "playKind", 0);
        setBooleanField(term56153, term56153.getClass(), "isClear", false);
        setIntField(term56153, term56153.getClass(), "skillLevel", 0);
        setIntField(term56153, term56153.getClass(), "skillEffect", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSkillLevel", argTypes, term56153, args);
    }

};


