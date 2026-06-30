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

public class RecentResp_setScore_1703139056114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56519;
     Object term56551;

    public RecentResp_setScore_1703139056114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56519 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        setField(term56519, term56519.getClass(), "playDate", null);
        setField(term56519, term56519.getClass(), "userPlayDate", null);
        setIntField(term56519, term56519.getClass(), "musicId", 0);
        setIntField(term56519, term56519.getClass(), "level", 0);
        setIntField(term56519, term56519.getClass(), "customId", 0);
        setIntField(term56519, term56519.getClass(), "playedCustom1", 0);
        setIntField(term56519, term56519.getClass(), "playedCustom2", 0);
        setIntField(term56519, term56519.getClass(), "playedCustom3", 0);
        setIntField(term56519, term56519.getClass(), "track", 0);
        setIntField(term56519, term56519.getClass(), "score", 0);
        setIntField(term56519, term56519.getClass(), "rank", 0);
        setIntField(term56519, term56519.getClass(), "maxCombo", 0);
        setIntField(term56519, term56519.getClass(), "maxChain", 0);
        setIntField(term56519, term56519.getClass(), "rateTap", 0);
        setIntField(term56519, term56519.getClass(), "rateHold", 0);
        setIntField(term56519, term56519.getClass(), "rateSlide", 0);
        setIntField(term56519, term56519.getClass(), "rateAir", 0);
        setIntField(term56519, term56519.getClass(), "rateFlick", 0);
        setIntField(term56519, term56519.getClass(), "judgeGuilty", 0);
        setIntField(term56519, term56519.getClass(), "judgeAttack", 0);
        setIntField(term56519, term56519.getClass(), "judgeJustice", 0);
        setIntField(term56519, term56519.getClass(), "judgeCritical", 0);
        setIntField(term56519, term56519.getClass(), "playerRating", 0);
        setBooleanField(term56519, term56519.getClass(), "isNewRecord", false);
        setBooleanField(term56519, term56519.getClass(), "isFullCombo", false);
        setIntField(term56519, term56519.getClass(), "fullChainKind", 0);
        setBooleanField(term56519, term56519.getClass(), "isAllJustice", false);
        setIntField(term56519, term56519.getClass(), "characterId", 0);
        setIntField(term56519, term56519.getClass(), "skillId", 0);
        setIntField(term56519, term56519.getClass(), "playKind", 0);
        setBooleanField(term56519, term56519.getClass(), "isClear", false);
        setIntField(term56519, term56519.getClass(), "skillLevel", 0);
        setIntField(term56519, term56519.getClass(), "skillEffect", 0);
        term56551 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term56551;
        callMethod(klass, "setScore", argTypes, term56519, args);
    }

};


