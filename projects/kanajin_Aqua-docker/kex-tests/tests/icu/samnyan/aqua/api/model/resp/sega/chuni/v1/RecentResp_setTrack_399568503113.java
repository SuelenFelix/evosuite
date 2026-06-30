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

public class RecentResp_setTrack_399568503113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56485;
     Object term56517;

    public RecentResp_setTrack_399568503113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56485 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        setField(term56485, term56485.getClass(), "playDate", null);
        setField(term56485, term56485.getClass(), "userPlayDate", null);
        setIntField(term56485, term56485.getClass(), "musicId", 0);
        setIntField(term56485, term56485.getClass(), "level", 0);
        setIntField(term56485, term56485.getClass(), "customId", 0);
        setIntField(term56485, term56485.getClass(), "playedCustom1", 0);
        setIntField(term56485, term56485.getClass(), "playedCustom2", 0);
        setIntField(term56485, term56485.getClass(), "playedCustom3", 0);
        setIntField(term56485, term56485.getClass(), "track", 0);
        setIntField(term56485, term56485.getClass(), "score", 0);
        setIntField(term56485, term56485.getClass(), "rank", 0);
        setIntField(term56485, term56485.getClass(), "maxCombo", 0);
        setIntField(term56485, term56485.getClass(), "maxChain", 0);
        setIntField(term56485, term56485.getClass(), "rateTap", 0);
        setIntField(term56485, term56485.getClass(), "rateHold", 0);
        setIntField(term56485, term56485.getClass(), "rateSlide", 0);
        setIntField(term56485, term56485.getClass(), "rateAir", 0);
        setIntField(term56485, term56485.getClass(), "rateFlick", 0);
        setIntField(term56485, term56485.getClass(), "judgeGuilty", 0);
        setIntField(term56485, term56485.getClass(), "judgeAttack", 0);
        setIntField(term56485, term56485.getClass(), "judgeJustice", 0);
        setIntField(term56485, term56485.getClass(), "judgeCritical", 0);
        setIntField(term56485, term56485.getClass(), "playerRating", 0);
        setBooleanField(term56485, term56485.getClass(), "isNewRecord", false);
        setBooleanField(term56485, term56485.getClass(), "isFullCombo", false);
        setIntField(term56485, term56485.getClass(), "fullChainKind", 0);
        setBooleanField(term56485, term56485.getClass(), "isAllJustice", false);
        setIntField(term56485, term56485.getClass(), "characterId", 0);
        setIntField(term56485, term56485.getClass(), "skillId", 0);
        setIntField(term56485, term56485.getClass(), "playKind", 0);
        setBooleanField(term56485, term56485.getClass(), "isClear", false);
        setIntField(term56485, term56485.getClass(), "skillLevel", 0);
        setIntField(term56485, term56485.getClass(), "skillEffect", 0);
        term56517 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term56517;
        callMethod(klass, "setTrack", argTypes, term56485, args);
    }

};


