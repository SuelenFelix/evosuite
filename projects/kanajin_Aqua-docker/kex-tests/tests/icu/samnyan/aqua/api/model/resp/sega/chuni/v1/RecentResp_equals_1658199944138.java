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

public class RecentResp_equals_1658199944138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57335;

    public RecentResp_equals_1658199944138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57335 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        setField(term57335, term57335.getClass(), "playDate", null);
        setField(term57335, term57335.getClass(), "userPlayDate", null);
        setIntField(term57335, term57335.getClass(), "musicId", 0);
        setIntField(term57335, term57335.getClass(), "level", 0);
        setIntField(term57335, term57335.getClass(), "customId", 0);
        setIntField(term57335, term57335.getClass(), "playedCustom1", 0);
        setIntField(term57335, term57335.getClass(), "playedCustom2", 0);
        setIntField(term57335, term57335.getClass(), "playedCustom3", 0);
        setIntField(term57335, term57335.getClass(), "track", 0);
        setIntField(term57335, term57335.getClass(), "score", 0);
        setIntField(term57335, term57335.getClass(), "rank", 0);
        setIntField(term57335, term57335.getClass(), "maxCombo", 0);
        setIntField(term57335, term57335.getClass(), "maxChain", 0);
        setIntField(term57335, term57335.getClass(), "rateTap", 0);
        setIntField(term57335, term57335.getClass(), "rateHold", 0);
        setIntField(term57335, term57335.getClass(), "rateSlide", 0);
        setIntField(term57335, term57335.getClass(), "rateAir", 0);
        setIntField(term57335, term57335.getClass(), "rateFlick", 0);
        setIntField(term57335, term57335.getClass(), "judgeGuilty", 0);
        setIntField(term57335, term57335.getClass(), "judgeAttack", 0);
        setIntField(term57335, term57335.getClass(), "judgeJustice", 0);
        setIntField(term57335, term57335.getClass(), "judgeCritical", 0);
        setIntField(term57335, term57335.getClass(), "playerRating", 0);
        setBooleanField(term57335, term57335.getClass(), "isNewRecord", false);
        setBooleanField(term57335, term57335.getClass(), "isFullCombo", false);
        setIntField(term57335, term57335.getClass(), "fullChainKind", 0);
        setBooleanField(term57335, term57335.getClass(), "isAllJustice", false);
        setIntField(term57335, term57335.getClass(), "characterId", 0);
        setIntField(term57335, term57335.getClass(), "skillId", 0);
        setIntField(term57335, term57335.getClass(), "playKind", 0);
        setBooleanField(term57335, term57335.getClass(), "isClear", false);
        setIntField(term57335, term57335.getClass(), "skillLevel", 0);
        setIntField(term57335, term57335.getClass(), "skillEffect", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term57335, args);
    }

};


