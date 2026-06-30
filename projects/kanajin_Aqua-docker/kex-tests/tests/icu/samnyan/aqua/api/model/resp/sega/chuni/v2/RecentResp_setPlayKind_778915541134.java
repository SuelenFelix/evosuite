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
import java.lang.Integer;

public class RecentResp_setPlayKind_778915541134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52029;
     Object term52061;

    public RecentResp_setPlayKind_778915541134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52029 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        setField(term52029, term52029.getClass(), "playDate", null);
        setField(term52029, term52029.getClass(), "userPlayDate", null);
        setIntField(term52029, term52029.getClass(), "musicId", 0);
        setIntField(term52029, term52029.getClass(), "level", 0);
        setIntField(term52029, term52029.getClass(), "customId", 0);
        setIntField(term52029, term52029.getClass(), "playedCustom1", 0);
        setIntField(term52029, term52029.getClass(), "playedCustom2", 0);
        setIntField(term52029, term52029.getClass(), "playedCustom3", 0);
        setIntField(term52029, term52029.getClass(), "track", 0);
        setIntField(term52029, term52029.getClass(), "score", 0);
        setIntField(term52029, term52029.getClass(), "rank", 0);
        setIntField(term52029, term52029.getClass(), "maxCombo", 0);
        setIntField(term52029, term52029.getClass(), "maxChain", 0);
        setIntField(term52029, term52029.getClass(), "rateTap", 0);
        setIntField(term52029, term52029.getClass(), "rateHold", 0);
        setIntField(term52029, term52029.getClass(), "rateSlide", 0);
        setIntField(term52029, term52029.getClass(), "rateAir", 0);
        setIntField(term52029, term52029.getClass(), "rateFlick", 0);
        setIntField(term52029, term52029.getClass(), "judgeGuilty", 0);
        setIntField(term52029, term52029.getClass(), "judgeAttack", 0);
        setIntField(term52029, term52029.getClass(), "judgeJustice", 0);
        setIntField(term52029, term52029.getClass(), "judgeCritical", 0);
        setIntField(term52029, term52029.getClass(), "playerRating", 0);
        setBooleanField(term52029, term52029.getClass(), "isNewRecord", false);
        setBooleanField(term52029, term52029.getClass(), "isFullCombo", false);
        setIntField(term52029, term52029.getClass(), "fullChainKind", 0);
        setBooleanField(term52029, term52029.getClass(), "isAllJustice", false);
        setIntField(term52029, term52029.getClass(), "characterId", 0);
        setIntField(term52029, term52029.getClass(), "skillId", 0);
        setIntField(term52029, term52029.getClass(), "playKind", 0);
        setBooleanField(term52029, term52029.getClass(), "isClear", false);
        setIntField(term52029, term52029.getClass(), "skillLevel", 0);
        setIntField(term52029, term52029.getClass(), "skillEffect", 0);
        term52061 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term52061;
        callMethod(klass, "setPlayKind", argTypes, term52029, args);
    }

};


