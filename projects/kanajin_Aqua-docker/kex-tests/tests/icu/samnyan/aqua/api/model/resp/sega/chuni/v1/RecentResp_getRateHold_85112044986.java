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

public class RecentResp_getRateHold_85112044986 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55609;

    public RecentResp_getRateHold_85112044986() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55609 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        setField(term55609, term55609.getClass(), "playDate", null);
        setField(term55609, term55609.getClass(), "userPlayDate", null);
        setIntField(term55609, term55609.getClass(), "musicId", 0);
        setIntField(term55609, term55609.getClass(), "level", 0);
        setIntField(term55609, term55609.getClass(), "customId", 0);
        setIntField(term55609, term55609.getClass(), "playedCustom1", 0);
        setIntField(term55609, term55609.getClass(), "playedCustom2", 0);
        setIntField(term55609, term55609.getClass(), "playedCustom3", 0);
        setIntField(term55609, term55609.getClass(), "track", 0);
        setIntField(term55609, term55609.getClass(), "score", 0);
        setIntField(term55609, term55609.getClass(), "rank", 0);
        setIntField(term55609, term55609.getClass(), "maxCombo", 0);
        setIntField(term55609, term55609.getClass(), "maxChain", 0);
        setIntField(term55609, term55609.getClass(), "rateTap", 0);
        setIntField(term55609, term55609.getClass(), "rateHold", 0);
        setIntField(term55609, term55609.getClass(), "rateSlide", 0);
        setIntField(term55609, term55609.getClass(), "rateAir", 0);
        setIntField(term55609, term55609.getClass(), "rateFlick", 0);
        setIntField(term55609, term55609.getClass(), "judgeGuilty", 0);
        setIntField(term55609, term55609.getClass(), "judgeAttack", 0);
        setIntField(term55609, term55609.getClass(), "judgeJustice", 0);
        setIntField(term55609, term55609.getClass(), "judgeCritical", 0);
        setIntField(term55609, term55609.getClass(), "playerRating", 0);
        setBooleanField(term55609, term55609.getClass(), "isNewRecord", false);
        setBooleanField(term55609, term55609.getClass(), "isFullCombo", false);
        setIntField(term55609, term55609.getClass(), "fullChainKind", 0);
        setBooleanField(term55609, term55609.getClass(), "isAllJustice", false);
        setIntField(term55609, term55609.getClass(), "characterId", 0);
        setIntField(term55609, term55609.getClass(), "skillId", 0);
        setIntField(term55609, term55609.getClass(), "playKind", 0);
        setBooleanField(term55609, term55609.getClass(), "isClear", false);
        setIntField(term55609, term55609.getClass(), "skillLevel", 0);
        setIntField(term55609, term55609.getClass(), "skillEffect", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRateHold", argTypes, term55609, args);
    }

};


