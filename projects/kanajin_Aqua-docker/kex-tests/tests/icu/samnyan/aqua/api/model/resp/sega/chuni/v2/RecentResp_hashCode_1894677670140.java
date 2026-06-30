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

public class RecentResp_hashCode_1894677670140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52229;

    public RecentResp_hashCode_1894677670140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52229 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        setField(term52229, term52229.getClass(), "playDate", null);
        setField(term52229, term52229.getClass(), "userPlayDate", null);
        setIntField(term52229, term52229.getClass(), "musicId", 0);
        setIntField(term52229, term52229.getClass(), "level", 0);
        setIntField(term52229, term52229.getClass(), "customId", 0);
        setIntField(term52229, term52229.getClass(), "playedCustom1", 0);
        setIntField(term52229, term52229.getClass(), "playedCustom2", 0);
        setIntField(term52229, term52229.getClass(), "playedCustom3", 0);
        setIntField(term52229, term52229.getClass(), "track", 0);
        setIntField(term52229, term52229.getClass(), "score", 0);
        setIntField(term52229, term52229.getClass(), "rank", 0);
        setIntField(term52229, term52229.getClass(), "maxCombo", 0);
        setIntField(term52229, term52229.getClass(), "maxChain", 0);
        setIntField(term52229, term52229.getClass(), "rateTap", 0);
        setIntField(term52229, term52229.getClass(), "rateHold", 0);
        setIntField(term52229, term52229.getClass(), "rateSlide", 0);
        setIntField(term52229, term52229.getClass(), "rateAir", 0);
        setIntField(term52229, term52229.getClass(), "rateFlick", 0);
        setIntField(term52229, term52229.getClass(), "judgeGuilty", 0);
        setIntField(term52229, term52229.getClass(), "judgeAttack", 0);
        setIntField(term52229, term52229.getClass(), "judgeJustice", 0);
        setIntField(term52229, term52229.getClass(), "judgeCritical", 0);
        setIntField(term52229, term52229.getClass(), "playerRating", 0);
        setBooleanField(term52229, term52229.getClass(), "isNewRecord", false);
        setBooleanField(term52229, term52229.getClass(), "isFullCombo", false);
        setIntField(term52229, term52229.getClass(), "fullChainKind", 0);
        setBooleanField(term52229, term52229.getClass(), "isAllJustice", false);
        setIntField(term52229, term52229.getClass(), "characterId", 0);
        setIntField(term52229, term52229.getClass(), "skillId", 0);
        setIntField(term52229, term52229.getClass(), "playKind", 0);
        setBooleanField(term52229, term52229.getClass(), "isClear", false);
        setIntField(term52229, term52229.getClass(), "skillLevel", 0);
        setIntField(term52229, term52229.getClass(), "skillEffect", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term52229, args);
    }

};


