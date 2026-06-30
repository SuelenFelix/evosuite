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
import java.lang.Integer;

public class RecentResp_setCustomId_883479854109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56349;
     Object term56381;

    public RecentResp_setCustomId_883479854109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56349 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        setField(term56349, term56349.getClass(), "playDate", null);
        setField(term56349, term56349.getClass(), "userPlayDate", null);
        setIntField(term56349, term56349.getClass(), "musicId", 0);
        setIntField(term56349, term56349.getClass(), "level", 0);
        setIntField(term56349, term56349.getClass(), "customId", 0);
        setIntField(term56349, term56349.getClass(), "playedCustom1", 0);
        setIntField(term56349, term56349.getClass(), "playedCustom2", 0);
        setIntField(term56349, term56349.getClass(), "playedCustom3", 0);
        setIntField(term56349, term56349.getClass(), "track", 0);
        setIntField(term56349, term56349.getClass(), "score", 0);
        setIntField(term56349, term56349.getClass(), "rank", 0);
        setIntField(term56349, term56349.getClass(), "maxCombo", 0);
        setIntField(term56349, term56349.getClass(), "maxChain", 0);
        setIntField(term56349, term56349.getClass(), "rateTap", 0);
        setIntField(term56349, term56349.getClass(), "rateHold", 0);
        setIntField(term56349, term56349.getClass(), "rateSlide", 0);
        setIntField(term56349, term56349.getClass(), "rateAir", 0);
        setIntField(term56349, term56349.getClass(), "rateFlick", 0);
        setIntField(term56349, term56349.getClass(), "judgeGuilty", 0);
        setIntField(term56349, term56349.getClass(), "judgeAttack", 0);
        setIntField(term56349, term56349.getClass(), "judgeJustice", 0);
        setIntField(term56349, term56349.getClass(), "judgeCritical", 0);
        setIntField(term56349, term56349.getClass(), "playerRating", 0);
        setBooleanField(term56349, term56349.getClass(), "isNewRecord", false);
        setBooleanField(term56349, term56349.getClass(), "isFullCombo", false);
        setIntField(term56349, term56349.getClass(), "fullChainKind", 0);
        setBooleanField(term56349, term56349.getClass(), "isAllJustice", false);
        setIntField(term56349, term56349.getClass(), "characterId", 0);
        setIntField(term56349, term56349.getClass(), "skillId", 0);
        setIntField(term56349, term56349.getClass(), "playKind", 0);
        setBooleanField(term56349, term56349.getClass(), "isClear", false);
        setIntField(term56349, term56349.getClass(), "skillLevel", 0);
        setIntField(term56349, term56349.getClass(), "skillEffect", 0);
        term56381 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term56381;
        callMethod(klass, "setCustomId", argTypes, term56349, args);
    }

};


