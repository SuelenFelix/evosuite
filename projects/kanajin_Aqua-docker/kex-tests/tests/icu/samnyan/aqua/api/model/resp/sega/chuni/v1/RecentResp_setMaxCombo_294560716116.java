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

public class RecentResp_setMaxCombo_294560716116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56587;
     Object term56619;

    public RecentResp_setMaxCombo_294560716116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56587 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        setField(term56587, term56587.getClass(), "playDate", null);
        setField(term56587, term56587.getClass(), "userPlayDate", null);
        setIntField(term56587, term56587.getClass(), "musicId", 0);
        setIntField(term56587, term56587.getClass(), "level", 0);
        setIntField(term56587, term56587.getClass(), "customId", 0);
        setIntField(term56587, term56587.getClass(), "playedCustom1", 0);
        setIntField(term56587, term56587.getClass(), "playedCustom2", 0);
        setIntField(term56587, term56587.getClass(), "playedCustom3", 0);
        setIntField(term56587, term56587.getClass(), "track", 0);
        setIntField(term56587, term56587.getClass(), "score", 0);
        setIntField(term56587, term56587.getClass(), "rank", 0);
        setIntField(term56587, term56587.getClass(), "maxCombo", 0);
        setIntField(term56587, term56587.getClass(), "maxChain", 0);
        setIntField(term56587, term56587.getClass(), "rateTap", 0);
        setIntField(term56587, term56587.getClass(), "rateHold", 0);
        setIntField(term56587, term56587.getClass(), "rateSlide", 0);
        setIntField(term56587, term56587.getClass(), "rateAir", 0);
        setIntField(term56587, term56587.getClass(), "rateFlick", 0);
        setIntField(term56587, term56587.getClass(), "judgeGuilty", 0);
        setIntField(term56587, term56587.getClass(), "judgeAttack", 0);
        setIntField(term56587, term56587.getClass(), "judgeJustice", 0);
        setIntField(term56587, term56587.getClass(), "judgeCritical", 0);
        setIntField(term56587, term56587.getClass(), "playerRating", 0);
        setBooleanField(term56587, term56587.getClass(), "isNewRecord", false);
        setBooleanField(term56587, term56587.getClass(), "isFullCombo", false);
        setIntField(term56587, term56587.getClass(), "fullChainKind", 0);
        setBooleanField(term56587, term56587.getClass(), "isAllJustice", false);
        setIntField(term56587, term56587.getClass(), "characterId", 0);
        setIntField(term56587, term56587.getClass(), "skillId", 0);
        setIntField(term56587, term56587.getClass(), "playKind", 0);
        setBooleanField(term56587, term56587.getClass(), "isClear", false);
        setIntField(term56587, term56587.getClass(), "skillLevel", 0);
        setIntField(term56587, term56587.getClass(), "skillEffect", 0);
        term56619 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term56619;
        callMethod(klass, "setMaxCombo", argTypes, term56587, args);
    }

};


