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

public class RecentResp_getRateTap_211320628185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55577;

    public RecentResp_getRateTap_211320628185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55577 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        setField(term55577, term55577.getClass(), "playDate", null);
        setField(term55577, term55577.getClass(), "userPlayDate", null);
        setIntField(term55577, term55577.getClass(), "musicId", 0);
        setIntField(term55577, term55577.getClass(), "level", 0);
        setIntField(term55577, term55577.getClass(), "customId", 0);
        setIntField(term55577, term55577.getClass(), "playedCustom1", 0);
        setIntField(term55577, term55577.getClass(), "playedCustom2", 0);
        setIntField(term55577, term55577.getClass(), "playedCustom3", 0);
        setIntField(term55577, term55577.getClass(), "track", 0);
        setIntField(term55577, term55577.getClass(), "score", 0);
        setIntField(term55577, term55577.getClass(), "rank", 0);
        setIntField(term55577, term55577.getClass(), "maxCombo", 0);
        setIntField(term55577, term55577.getClass(), "maxChain", 0);
        setIntField(term55577, term55577.getClass(), "rateTap", 0);
        setIntField(term55577, term55577.getClass(), "rateHold", 0);
        setIntField(term55577, term55577.getClass(), "rateSlide", 0);
        setIntField(term55577, term55577.getClass(), "rateAir", 0);
        setIntField(term55577, term55577.getClass(), "rateFlick", 0);
        setIntField(term55577, term55577.getClass(), "judgeGuilty", 0);
        setIntField(term55577, term55577.getClass(), "judgeAttack", 0);
        setIntField(term55577, term55577.getClass(), "judgeJustice", 0);
        setIntField(term55577, term55577.getClass(), "judgeCritical", 0);
        setIntField(term55577, term55577.getClass(), "playerRating", 0);
        setBooleanField(term55577, term55577.getClass(), "isNewRecord", false);
        setBooleanField(term55577, term55577.getClass(), "isFullCombo", false);
        setIntField(term55577, term55577.getClass(), "fullChainKind", 0);
        setBooleanField(term55577, term55577.getClass(), "isAllJustice", false);
        setIntField(term55577, term55577.getClass(), "characterId", 0);
        setIntField(term55577, term55577.getClass(), "skillId", 0);
        setIntField(term55577, term55577.getClass(), "playKind", 0);
        setBooleanField(term55577, term55577.getClass(), "isClear", false);
        setIntField(term55577, term55577.getClass(), "skillLevel", 0);
        setIntField(term55577, term55577.getClass(), "skillEffect", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRateTap", argTypes, term55577, args);
    }

};


