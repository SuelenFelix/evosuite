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

public class ProfileResp_getSumBattleHighScore_78514269721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97179;

    public ProfileResp_getSumBattleHighScore_78514269721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97179 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term97179, term97179.getClass(), "userName", "RASgFwVGWH");
        setIntField(term97179, term97179.getClass(), "level", -541487942);
        setLongField(term97179, term97179.getClass(), "exp", 1899971755457488246L);
        setLongField(term97179, term97179.getClass(), "point", 8851463727956587910L);
        setLongField(term97179, term97179.getClass(), "totalPoint", 8713780813371812262L);
        setIntField(term97179, term97179.getClass(), "playCount", -647322251);
        setIntField(term97179, term97179.getClass(), "jewelCount", -994119890);
        setIntField(term97179, term97179.getClass(), "totalJewelCount", 1502179361);
        setIntField(term97179, term97179.getClass(), "playerRating", -1699701583);
        setIntField(term97179, term97179.getClass(), "highestRating", 993714395);
        setIntField(term97179, term97179.getClass(), "battlePoint", -2037813043);
        setIntField(term97179, term97179.getClass(), "nameplateId", 1938007925);
        setIntField(term97179, term97179.getClass(), "trophyId", 1600688588);
        setIntField(term97179, term97179.getClass(), "cardId", -759951384);
        setIntField(term97179, term97179.getClass(), "characterId", -516240145);
        setLongField(term97179, term97179.getClass(), "sumTechHighScore", 3557191045587060984L);
        setLongField(term97179, term97179.getClass(), "sumTechBasicHighScore", 2887807802515197723L);
        setLongField(term97179, term97179.getClass(), "sumTechAdvancedHighScore", 4071480204991861453L);
        setLongField(term97179, term97179.getClass(), "sumTechExpertHighScore", -2685349916092598053L);
        setLongField(term97179, term97179.getClass(), "sumTechMasterHighScore", 491694438146039380L);
        setLongField(term97179, term97179.getClass(), "sumTechLunaticHighScore", -7601151382201720048L);
        setLongField(term97179, term97179.getClass(), "sumBattleHighScore", 6235700915808994828L);
        setLongField(term97179, term97179.getClass(), "sumBattleBasicHighScore", 729029652647225135L);
        setLongField(term97179, term97179.getClass(), "sumBattleAdvancedHighScore", 7709882480457682539L);
        setLongField(term97179, term97179.getClass(), "sumBattleExpertHighScore", 7440384647054614109L);
        setLongField(term97179, term97179.getClass(), "sumBattleMasterHighScore", 4473009422220945627L);
        setLongField(term97179, term97179.getClass(), "sumBattleLunaticHighScore", -6700686536507259379L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumBattleHighScore", argTypes, term97179, args);
    }

};


