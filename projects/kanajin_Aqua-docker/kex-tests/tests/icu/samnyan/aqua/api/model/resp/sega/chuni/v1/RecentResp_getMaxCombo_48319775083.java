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

public class RecentResp_getMaxCombo_48319775083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55513;

    public RecentResp_getMaxCombo_48319775083() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55513 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        setField(term55513, term55513.getClass(), "playDate", null);
        setField(term55513, term55513.getClass(), "userPlayDate", null);
        setIntField(term55513, term55513.getClass(), "musicId", 0);
        setIntField(term55513, term55513.getClass(), "level", 0);
        setIntField(term55513, term55513.getClass(), "customId", 0);
        setIntField(term55513, term55513.getClass(), "playedCustom1", 0);
        setIntField(term55513, term55513.getClass(), "playedCustom2", 0);
        setIntField(term55513, term55513.getClass(), "playedCustom3", 0);
        setIntField(term55513, term55513.getClass(), "track", 0);
        setIntField(term55513, term55513.getClass(), "score", 0);
        setIntField(term55513, term55513.getClass(), "rank", 0);
        setIntField(term55513, term55513.getClass(), "maxCombo", 0);
        setIntField(term55513, term55513.getClass(), "maxChain", 0);
        setIntField(term55513, term55513.getClass(), "rateTap", 0);
        setIntField(term55513, term55513.getClass(), "rateHold", 0);
        setIntField(term55513, term55513.getClass(), "rateSlide", 0);
        setIntField(term55513, term55513.getClass(), "rateAir", 0);
        setIntField(term55513, term55513.getClass(), "rateFlick", 0);
        setIntField(term55513, term55513.getClass(), "judgeGuilty", 0);
        setIntField(term55513, term55513.getClass(), "judgeAttack", 0);
        setIntField(term55513, term55513.getClass(), "judgeJustice", 0);
        setIntField(term55513, term55513.getClass(), "judgeCritical", 0);
        setIntField(term55513, term55513.getClass(), "playerRating", 0);
        setBooleanField(term55513, term55513.getClass(), "isNewRecord", false);
        setBooleanField(term55513, term55513.getClass(), "isFullCombo", false);
        setIntField(term55513, term55513.getClass(), "fullChainKind", 0);
        setBooleanField(term55513, term55513.getClass(), "isAllJustice", false);
        setIntField(term55513, term55513.getClass(), "characterId", 0);
        setIntField(term55513, term55513.getClass(), "skillId", 0);
        setIntField(term55513, term55513.getClass(), "playKind", 0);
        setBooleanField(term55513, term55513.getClass(), "isClear", false);
        setIntField(term55513, term55513.getClass(), "skillLevel", 0);
        setIntField(term55513, term55513.getClass(), "skillEffect", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxCombo", argTypes, term55513, args);
    }

};


