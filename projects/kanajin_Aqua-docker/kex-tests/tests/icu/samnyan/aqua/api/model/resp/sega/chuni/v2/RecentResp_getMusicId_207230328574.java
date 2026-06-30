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

public class RecentResp_getMusicId_207230328574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50055;

    public RecentResp_getMusicId_207230328574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50055 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        setField(term50055, term50055.getClass(), "playDate", null);
        setField(term50055, term50055.getClass(), "userPlayDate", null);
        setIntField(term50055, term50055.getClass(), "musicId", 0);
        setIntField(term50055, term50055.getClass(), "level", 0);
        setIntField(term50055, term50055.getClass(), "customId", 0);
        setIntField(term50055, term50055.getClass(), "playedCustom1", 0);
        setIntField(term50055, term50055.getClass(), "playedCustom2", 0);
        setIntField(term50055, term50055.getClass(), "playedCustom3", 0);
        setIntField(term50055, term50055.getClass(), "track", 0);
        setIntField(term50055, term50055.getClass(), "score", 0);
        setIntField(term50055, term50055.getClass(), "rank", 0);
        setIntField(term50055, term50055.getClass(), "maxCombo", 0);
        setIntField(term50055, term50055.getClass(), "maxChain", 0);
        setIntField(term50055, term50055.getClass(), "rateTap", 0);
        setIntField(term50055, term50055.getClass(), "rateHold", 0);
        setIntField(term50055, term50055.getClass(), "rateSlide", 0);
        setIntField(term50055, term50055.getClass(), "rateAir", 0);
        setIntField(term50055, term50055.getClass(), "rateFlick", 0);
        setIntField(term50055, term50055.getClass(), "judgeGuilty", 0);
        setIntField(term50055, term50055.getClass(), "judgeAttack", 0);
        setIntField(term50055, term50055.getClass(), "judgeJustice", 0);
        setIntField(term50055, term50055.getClass(), "judgeCritical", 0);
        setIntField(term50055, term50055.getClass(), "playerRating", 0);
        setBooleanField(term50055, term50055.getClass(), "isNewRecord", false);
        setBooleanField(term50055, term50055.getClass(), "isFullCombo", false);
        setIntField(term50055, term50055.getClass(), "fullChainKind", 0);
        setBooleanField(term50055, term50055.getClass(), "isAllJustice", false);
        setIntField(term50055, term50055.getClass(), "characterId", 0);
        setIntField(term50055, term50055.getClass(), "skillId", 0);
        setIntField(term50055, term50055.getClass(), "playKind", 0);
        setBooleanField(term50055, term50055.getClass(), "isClear", false);
        setIntField(term50055, term50055.getClass(), "skillLevel", 0);
        setIntField(term50055, term50055.getClass(), "skillEffect", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMusicId", argTypes, term50055, args);
    }

};


