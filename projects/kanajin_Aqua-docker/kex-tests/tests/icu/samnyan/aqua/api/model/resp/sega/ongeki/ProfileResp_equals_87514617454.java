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

public class ProfileResp_equals_87514617454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98870;
     Object term98909;

    public ProfileResp_equals_87514617454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98870 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term98870, term98870.getClass(), "userName", "bWJuYqVbYa");
        setIntField(term98870, term98870.getClass(), "level", 1010798612);
        setLongField(term98870, term98870.getClass(), "exp", -3183525352022378229L);
        setLongField(term98870, term98870.getClass(), "point", -2112525754530386827L);
        setLongField(term98870, term98870.getClass(), "totalPoint", -7558640179934958704L);
        setIntField(term98870, term98870.getClass(), "playCount", -2064161482);
        setIntField(term98870, term98870.getClass(), "jewelCount", 1971642139);
        setIntField(term98870, term98870.getClass(), "totalJewelCount", -1975635096);
        setIntField(term98870, term98870.getClass(), "playerRating", 566794429);
        setIntField(term98870, term98870.getClass(), "highestRating", 1103352739);
        setIntField(term98870, term98870.getClass(), "battlePoint", -419432251);
        setIntField(term98870, term98870.getClass(), "nameplateId", 139946543);
        setIntField(term98870, term98870.getClass(), "trophyId", 1731503972);
        setIntField(term98870, term98870.getClass(), "cardId", -1101776708);
        setIntField(term98870, term98870.getClass(), "characterId", 254815209);
        setLongField(term98870, term98870.getClass(), "sumTechHighScore", 7534275919759555162L);
        setLongField(term98870, term98870.getClass(), "sumTechBasicHighScore", -6297522184197592868L);
        setLongField(term98870, term98870.getClass(), "sumTechAdvancedHighScore", 8332584667883410658L);
        setLongField(term98870, term98870.getClass(), "sumTechExpertHighScore", -7684351169632643854L);
        setLongField(term98870, term98870.getClass(), "sumTechMasterHighScore", -3754325764090193679L);
        setLongField(term98870, term98870.getClass(), "sumTechLunaticHighScore", -2836847517663893738L);
        setLongField(term98870, term98870.getClass(), "sumBattleHighScore", -9144061403350933482L);
        setLongField(term98870, term98870.getClass(), "sumBattleBasicHighScore", -2061418607713782861L);
        setLongField(term98870, term98870.getClass(), "sumBattleAdvancedHighScore", 6663959595334072081L);
        setLongField(term98870, term98870.getClass(), "sumBattleExpertHighScore", 561545793548791935L);
        setLongField(term98870, term98870.getClass(), "sumBattleMasterHighScore", 2339724581479774358L);
        setLongField(term98870, term98870.getClass(), "sumBattleLunaticHighScore", 2035340628592826076L);
        term98909 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term98909;
        callMethod(klass, "equals", argTypes, term98870, args);
    }

};


