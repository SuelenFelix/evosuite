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

public class RecentResp_setPlayDate_1784876749105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56217;

    public RecentResp_setPlayDate_1784876749105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56217 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        setField(term56217, term56217.getClass(), "playDate", null);
        setField(term56217, term56217.getClass(), "userPlayDate", null);
        setIntField(term56217, term56217.getClass(), "musicId", 0);
        setIntField(term56217, term56217.getClass(), "level", 0);
        setIntField(term56217, term56217.getClass(), "customId", 0);
        setIntField(term56217, term56217.getClass(), "playedCustom1", 0);
        setIntField(term56217, term56217.getClass(), "playedCustom2", 0);
        setIntField(term56217, term56217.getClass(), "playedCustom3", 0);
        setIntField(term56217, term56217.getClass(), "track", 0);
        setIntField(term56217, term56217.getClass(), "score", 0);
        setIntField(term56217, term56217.getClass(), "rank", 0);
        setIntField(term56217, term56217.getClass(), "maxCombo", 0);
        setIntField(term56217, term56217.getClass(), "maxChain", 0);
        setIntField(term56217, term56217.getClass(), "rateTap", 0);
        setIntField(term56217, term56217.getClass(), "rateHold", 0);
        setIntField(term56217, term56217.getClass(), "rateSlide", 0);
        setIntField(term56217, term56217.getClass(), "rateAir", 0);
        setIntField(term56217, term56217.getClass(), "rateFlick", 0);
        setIntField(term56217, term56217.getClass(), "judgeGuilty", 0);
        setIntField(term56217, term56217.getClass(), "judgeAttack", 0);
        setIntField(term56217, term56217.getClass(), "judgeJustice", 0);
        setIntField(term56217, term56217.getClass(), "judgeCritical", 0);
        setIntField(term56217, term56217.getClass(), "playerRating", 0);
        setBooleanField(term56217, term56217.getClass(), "isNewRecord", false);
        setBooleanField(term56217, term56217.getClass(), "isFullCombo", false);
        setIntField(term56217, term56217.getClass(), "fullChainKind", 0);
        setBooleanField(term56217, term56217.getClass(), "isAllJustice", false);
        setIntField(term56217, term56217.getClass(), "characterId", 0);
        setIntField(term56217, term56217.getClass(), "skillId", 0);
        setIntField(term56217, term56217.getClass(), "playKind", 0);
        setBooleanField(term56217, term56217.getClass(), "isClear", false);
        setIntField(term56217, term56217.getClass(), "skillLevel", 0);
        setIntField(term56217, term56217.getClass(), "skillEffect", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlayDate", argTypes, term56217, args);
    }

};


