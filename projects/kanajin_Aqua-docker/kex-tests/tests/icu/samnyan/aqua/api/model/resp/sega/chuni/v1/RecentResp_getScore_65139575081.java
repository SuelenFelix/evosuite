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

public class RecentResp_getScore_65139575081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55449;

    public RecentResp_getScore_65139575081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55449 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        setField(term55449, term55449.getClass(), "playDate", null);
        setField(term55449, term55449.getClass(), "userPlayDate", null);
        setIntField(term55449, term55449.getClass(), "musicId", 0);
        setIntField(term55449, term55449.getClass(), "level", 0);
        setIntField(term55449, term55449.getClass(), "customId", 0);
        setIntField(term55449, term55449.getClass(), "playedCustom1", 0);
        setIntField(term55449, term55449.getClass(), "playedCustom2", 0);
        setIntField(term55449, term55449.getClass(), "playedCustom3", 0);
        setIntField(term55449, term55449.getClass(), "track", 0);
        setIntField(term55449, term55449.getClass(), "score", 0);
        setIntField(term55449, term55449.getClass(), "rank", 0);
        setIntField(term55449, term55449.getClass(), "maxCombo", 0);
        setIntField(term55449, term55449.getClass(), "maxChain", 0);
        setIntField(term55449, term55449.getClass(), "rateTap", 0);
        setIntField(term55449, term55449.getClass(), "rateHold", 0);
        setIntField(term55449, term55449.getClass(), "rateSlide", 0);
        setIntField(term55449, term55449.getClass(), "rateAir", 0);
        setIntField(term55449, term55449.getClass(), "rateFlick", 0);
        setIntField(term55449, term55449.getClass(), "judgeGuilty", 0);
        setIntField(term55449, term55449.getClass(), "judgeAttack", 0);
        setIntField(term55449, term55449.getClass(), "judgeJustice", 0);
        setIntField(term55449, term55449.getClass(), "judgeCritical", 0);
        setIntField(term55449, term55449.getClass(), "playerRating", 0);
        setBooleanField(term55449, term55449.getClass(), "isNewRecord", false);
        setBooleanField(term55449, term55449.getClass(), "isFullCombo", false);
        setIntField(term55449, term55449.getClass(), "fullChainKind", 0);
        setBooleanField(term55449, term55449.getClass(), "isAllJustice", false);
        setIntField(term55449, term55449.getClass(), "characterId", 0);
        setIntField(term55449, term55449.getClass(), "skillId", 0);
        setIntField(term55449, term55449.getClass(), "playKind", 0);
        setBooleanField(term55449, term55449.getClass(), "isClear", false);
        setIntField(term55449, term55449.getClass(), "skillLevel", 0);
        setIntField(term55449, term55449.getClass(), "skillEffect", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScore", argTypes, term55449, args);
    }

};


