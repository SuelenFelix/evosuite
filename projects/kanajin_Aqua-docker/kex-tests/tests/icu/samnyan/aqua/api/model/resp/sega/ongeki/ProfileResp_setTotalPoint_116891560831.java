package icu.samnyan.aqua.api.model.resp.sega.ongeki;

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
import static icu.samnyan.aqua.api.model.resp.sega.ongeki.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class ProfileResp_setTotalPoint_116891560831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97697;
     Object term97736;

    public ProfileResp_setTotalPoint_116891560831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97697 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term97697, term97697.getClass(), "userName", "BTPXZrdCMh");
        setIntField(term97697, term97697.getClass(), "level", 849870303);
        setLongField(term97697, term97697.getClass(), "exp", 8151287794377461925L);
        setLongField(term97697, term97697.getClass(), "point", 3659917402769044046L);
        setLongField(term97697, term97697.getClass(), "totalPoint", 1047290652534056793L);
        setIntField(term97697, term97697.getClass(), "playCount", -133282941);
        setIntField(term97697, term97697.getClass(), "jewelCount", -894846771);
        setIntField(term97697, term97697.getClass(), "totalJewelCount", 183214400);
        setIntField(term97697, term97697.getClass(), "playerRating", -408220592);
        setIntField(term97697, term97697.getClass(), "highestRating", 1058802595);
        setIntField(term97697, term97697.getClass(), "battlePoint", -1671263450);
        setIntField(term97697, term97697.getClass(), "nameplateId", 750084667);
        setIntField(term97697, term97697.getClass(), "trophyId", 847923537);
        setIntField(term97697, term97697.getClass(), "cardId", 1193785062);
        setIntField(term97697, term97697.getClass(), "characterId", -951685340);
        setLongField(term97697, term97697.getClass(), "sumTechHighScore", 8087706986098256695L);
        setLongField(term97697, term97697.getClass(), "sumTechBasicHighScore", -6594572008134805448L);
        setLongField(term97697, term97697.getClass(), "sumTechAdvancedHighScore", 6808779350592717925L);
        setLongField(term97697, term97697.getClass(), "sumTechExpertHighScore", 4045330952321794410L);
        setLongField(term97697, term97697.getClass(), "sumTechMasterHighScore", 8428251397168351360L);
        setLongField(term97697, term97697.getClass(), "sumTechLunaticHighScore", 154603419020757356L);
        setLongField(term97697, term97697.getClass(), "sumBattleHighScore", 5201425391616953363L);
        setLongField(term97697, term97697.getClass(), "sumBattleBasicHighScore", 4833652184756528695L);
        setLongField(term97697, term97697.getClass(), "sumBattleAdvancedHighScore", 865720572702622542L);
        setLongField(term97697, term97697.getClass(), "sumBattleExpertHighScore", 1412803437344527008L);
        setLongField(term97697, term97697.getClass(), "sumBattleMasterHighScore", -9059703756960944121L);
        setLongField(term97697, term97697.getClass(), "sumBattleLunaticHighScore", -5820333289696299519L);
        term97736 = new Long(-5365565718317650942L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term97736;
        callMethod(klass, "setTotalPoint", argTypes, term97697, args);
    }

};


