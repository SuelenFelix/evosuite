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
import java.lang.Boolean;

public class RecentResp_setClear_1231200428135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52063;
     Object term52095;

    public RecentResp_setClear_1231200428135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52063 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        setField(term52063, term52063.getClass(), "playDate", null);
        setField(term52063, term52063.getClass(), "userPlayDate", null);
        setIntField(term52063, term52063.getClass(), "musicId", 0);
        setIntField(term52063, term52063.getClass(), "level", 0);
        setIntField(term52063, term52063.getClass(), "customId", 0);
        setIntField(term52063, term52063.getClass(), "playedCustom1", 0);
        setIntField(term52063, term52063.getClass(), "playedCustom2", 0);
        setIntField(term52063, term52063.getClass(), "playedCustom3", 0);
        setIntField(term52063, term52063.getClass(), "track", 0);
        setIntField(term52063, term52063.getClass(), "score", 0);
        setIntField(term52063, term52063.getClass(), "rank", 0);
        setIntField(term52063, term52063.getClass(), "maxCombo", 0);
        setIntField(term52063, term52063.getClass(), "maxChain", 0);
        setIntField(term52063, term52063.getClass(), "rateTap", 0);
        setIntField(term52063, term52063.getClass(), "rateHold", 0);
        setIntField(term52063, term52063.getClass(), "rateSlide", 0);
        setIntField(term52063, term52063.getClass(), "rateAir", 0);
        setIntField(term52063, term52063.getClass(), "rateFlick", 0);
        setIntField(term52063, term52063.getClass(), "judgeGuilty", 0);
        setIntField(term52063, term52063.getClass(), "judgeAttack", 0);
        setIntField(term52063, term52063.getClass(), "judgeJustice", 0);
        setIntField(term52063, term52063.getClass(), "judgeCritical", 0);
        setIntField(term52063, term52063.getClass(), "playerRating", 0);
        setBooleanField(term52063, term52063.getClass(), "isNewRecord", false);
        setBooleanField(term52063, term52063.getClass(), "isFullCombo", false);
        setIntField(term52063, term52063.getClass(), "fullChainKind", 0);
        setBooleanField(term52063, term52063.getClass(), "isAllJustice", false);
        setIntField(term52063, term52063.getClass(), "characterId", 0);
        setIntField(term52063, term52063.getClass(), "skillId", 0);
        setIntField(term52063, term52063.getClass(), "playKind", 0);
        setBooleanField(term52063, term52063.getClass(), "isClear", false);
        setIntField(term52063, term52063.getClass(), "skillLevel", 0);
        setIntField(term52063, term52063.getClass(), "skillEffect", 0);
        term52095 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term52095;
        callMethod(klass, "setClear", argTypes, term52063, args);
    }

};


