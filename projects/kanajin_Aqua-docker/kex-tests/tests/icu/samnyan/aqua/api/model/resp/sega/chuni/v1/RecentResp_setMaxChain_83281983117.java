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

public class RecentResp_setMaxChain_83281983117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56621;
     Object term56653;

    public RecentResp_setMaxChain_83281983117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56621 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        setField(term56621, term56621.getClass(), "playDate", null);
        setField(term56621, term56621.getClass(), "userPlayDate", null);
        setIntField(term56621, term56621.getClass(), "musicId", 0);
        setIntField(term56621, term56621.getClass(), "level", 0);
        setIntField(term56621, term56621.getClass(), "customId", 0);
        setIntField(term56621, term56621.getClass(), "playedCustom1", 0);
        setIntField(term56621, term56621.getClass(), "playedCustom2", 0);
        setIntField(term56621, term56621.getClass(), "playedCustom3", 0);
        setIntField(term56621, term56621.getClass(), "track", 0);
        setIntField(term56621, term56621.getClass(), "score", 0);
        setIntField(term56621, term56621.getClass(), "rank", 0);
        setIntField(term56621, term56621.getClass(), "maxCombo", 0);
        setIntField(term56621, term56621.getClass(), "maxChain", 0);
        setIntField(term56621, term56621.getClass(), "rateTap", 0);
        setIntField(term56621, term56621.getClass(), "rateHold", 0);
        setIntField(term56621, term56621.getClass(), "rateSlide", 0);
        setIntField(term56621, term56621.getClass(), "rateAir", 0);
        setIntField(term56621, term56621.getClass(), "rateFlick", 0);
        setIntField(term56621, term56621.getClass(), "judgeGuilty", 0);
        setIntField(term56621, term56621.getClass(), "judgeAttack", 0);
        setIntField(term56621, term56621.getClass(), "judgeJustice", 0);
        setIntField(term56621, term56621.getClass(), "judgeCritical", 0);
        setIntField(term56621, term56621.getClass(), "playerRating", 0);
        setBooleanField(term56621, term56621.getClass(), "isNewRecord", false);
        setBooleanField(term56621, term56621.getClass(), "isFullCombo", false);
        setIntField(term56621, term56621.getClass(), "fullChainKind", 0);
        setBooleanField(term56621, term56621.getClass(), "isAllJustice", false);
        setIntField(term56621, term56621.getClass(), "characterId", 0);
        setIntField(term56621, term56621.getClass(), "skillId", 0);
        setIntField(term56621, term56621.getClass(), "playKind", 0);
        setBooleanField(term56621, term56621.getClass(), "isClear", false);
        setIntField(term56621, term56621.getClass(), "skillLevel", 0);
        setIntField(term56621, term56621.getClass(), "skillEffect", 0);
        term56653 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term56653;
        callMethod(klass, "setMaxChain", argTypes, term56621, args);
    }

};


