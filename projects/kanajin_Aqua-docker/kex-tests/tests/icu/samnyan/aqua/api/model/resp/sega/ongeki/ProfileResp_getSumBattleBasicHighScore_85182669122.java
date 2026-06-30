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

public class ProfileResp_getSumBattleBasicHighScore_85182669122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97228;

    public ProfileResp_getSumBattleBasicHighScore_85182669122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97228 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term97228, term97228.getClass(), "userName", "kPPTLgPOHr");
        setIntField(term97228, term97228.getClass(), "level", 1359111709);
        setLongField(term97228, term97228.getClass(), "exp", 6712378500780090116L);
        setLongField(term97228, term97228.getClass(), "point", -7631931869688460563L);
        setLongField(term97228, term97228.getClass(), "totalPoint", 4853024693378729552L);
        setIntField(term97228, term97228.getClass(), "playCount", -1265138208);
        setIntField(term97228, term97228.getClass(), "jewelCount", 446683314);
        setIntField(term97228, term97228.getClass(), "totalJewelCount", 124087336);
        setIntField(term97228, term97228.getClass(), "playerRating", -1621022239);
        setIntField(term97228, term97228.getClass(), "highestRating", 453745338);
        setIntField(term97228, term97228.getClass(), "battlePoint", 1618228718);
        setIntField(term97228, term97228.getClass(), "nameplateId", -297879354);
        setIntField(term97228, term97228.getClass(), "trophyId", -1726977849);
        setIntField(term97228, term97228.getClass(), "cardId", -1783105418);
        setIntField(term97228, term97228.getClass(), "characterId", -1412745031);
        setLongField(term97228, term97228.getClass(), "sumTechHighScore", -6474049362506572286L);
        setLongField(term97228, term97228.getClass(), "sumTechBasicHighScore", -2088081429247726677L);
        setLongField(term97228, term97228.getClass(), "sumTechAdvancedHighScore", 5304684043785467921L);
        setLongField(term97228, term97228.getClass(), "sumTechExpertHighScore", -1990823654925056118L);
        setLongField(term97228, term97228.getClass(), "sumTechMasterHighScore", 7715295835447619393L);
        setLongField(term97228, term97228.getClass(), "sumTechLunaticHighScore", -4054765433548197329L);
        setLongField(term97228, term97228.getClass(), "sumBattleHighScore", -536182069079325955L);
        setLongField(term97228, term97228.getClass(), "sumBattleBasicHighScore", -8007150686430531542L);
        setLongField(term97228, term97228.getClass(), "sumBattleAdvancedHighScore", 9204718033380852255L);
        setLongField(term97228, term97228.getClass(), "sumBattleExpertHighScore", 3667236367126773538L);
        setLongField(term97228, term97228.getClass(), "sumBattleMasterHighScore", -3845936146638753974L);
        setLongField(term97228, term97228.getClass(), "sumBattleLunaticHighScore", -9033517055261545771L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumBattleBasicHighScore", argTypes, term97228, args);
    }

};


