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

public class RecentResp_getPlayerRating_153691798694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55865;

    public RecentResp_getPlayerRating_153691798694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55865 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        setField(term55865, term55865.getClass(), "playDate", null);
        setField(term55865, term55865.getClass(), "userPlayDate", null);
        setIntField(term55865, term55865.getClass(), "musicId", 0);
        setIntField(term55865, term55865.getClass(), "level", 0);
        setIntField(term55865, term55865.getClass(), "customId", 0);
        setIntField(term55865, term55865.getClass(), "playedCustom1", 0);
        setIntField(term55865, term55865.getClass(), "playedCustom2", 0);
        setIntField(term55865, term55865.getClass(), "playedCustom3", 0);
        setIntField(term55865, term55865.getClass(), "track", 0);
        setIntField(term55865, term55865.getClass(), "score", 0);
        setIntField(term55865, term55865.getClass(), "rank", 0);
        setIntField(term55865, term55865.getClass(), "maxCombo", 0);
        setIntField(term55865, term55865.getClass(), "maxChain", 0);
        setIntField(term55865, term55865.getClass(), "rateTap", 0);
        setIntField(term55865, term55865.getClass(), "rateHold", 0);
        setIntField(term55865, term55865.getClass(), "rateSlide", 0);
        setIntField(term55865, term55865.getClass(), "rateAir", 0);
        setIntField(term55865, term55865.getClass(), "rateFlick", 0);
        setIntField(term55865, term55865.getClass(), "judgeGuilty", 0);
        setIntField(term55865, term55865.getClass(), "judgeAttack", 0);
        setIntField(term55865, term55865.getClass(), "judgeJustice", 0);
        setIntField(term55865, term55865.getClass(), "judgeCritical", 0);
        setIntField(term55865, term55865.getClass(), "playerRating", 0);
        setBooleanField(term55865, term55865.getClass(), "isNewRecord", false);
        setBooleanField(term55865, term55865.getClass(), "isFullCombo", false);
        setIntField(term55865, term55865.getClass(), "fullChainKind", 0);
        setBooleanField(term55865, term55865.getClass(), "isAllJustice", false);
        setIntField(term55865, term55865.getClass(), "characterId", 0);
        setIntField(term55865, term55865.getClass(), "skillId", 0);
        setIntField(term55865, term55865.getClass(), "playKind", 0);
        setBooleanField(term55865, term55865.getClass(), "isClear", false);
        setIntField(term55865, term55865.getClass(), "skillLevel", 0);
        setIntField(term55865, term55865.getClass(), "skillEffect", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerRating", argTypes, term55865, args);
    }

};


