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

public class ProfileResp_getSumTechHighScore_148734707915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96885;

    public ProfileResp_getSumTechHighScore_148734707915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96885 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term96885, term96885.getClass(), "userName", "FLUMgaQzXi");
        setIntField(term96885, term96885.getClass(), "level", 871704758);
        setLongField(term96885, term96885.getClass(), "exp", -8086360537435351230L);
        setLongField(term96885, term96885.getClass(), "point", 5165854032880293294L);
        setLongField(term96885, term96885.getClass(), "totalPoint", 2615686874066328070L);
        setIntField(term96885, term96885.getClass(), "playCount", 799785721);
        setIntField(term96885, term96885.getClass(), "jewelCount", 1567302275);
        setIntField(term96885, term96885.getClass(), "totalJewelCount", -2087366011);
        setIntField(term96885, term96885.getClass(), "playerRating", -1090911547);
        setIntField(term96885, term96885.getClass(), "highestRating", -426495161);
        setIntField(term96885, term96885.getClass(), "battlePoint", 208374433);
        setIntField(term96885, term96885.getClass(), "nameplateId", -1618753507);
        setIntField(term96885, term96885.getClass(), "trophyId", -1628459606);
        setIntField(term96885, term96885.getClass(), "cardId", -1182484212);
        setIntField(term96885, term96885.getClass(), "characterId", 321697855);
        setLongField(term96885, term96885.getClass(), "sumTechHighScore", 749986994143010909L);
        setLongField(term96885, term96885.getClass(), "sumTechBasicHighScore", -5610923948186923865L);
        setLongField(term96885, term96885.getClass(), "sumTechAdvancedHighScore", 6863726040287841526L);
        setLongField(term96885, term96885.getClass(), "sumTechExpertHighScore", -7493572270081168323L);
        setLongField(term96885, term96885.getClass(), "sumTechMasterHighScore", -1116229180112055302L);
        setLongField(term96885, term96885.getClass(), "sumTechLunaticHighScore", 1976943265485923698L);
        setLongField(term96885, term96885.getClass(), "sumBattleHighScore", -4020415065526048923L);
        setLongField(term96885, term96885.getClass(), "sumBattleBasicHighScore", 8778345812083053413L);
        setLongField(term96885, term96885.getClass(), "sumBattleAdvancedHighScore", 6204558253499196979L);
        setLongField(term96885, term96885.getClass(), "sumBattleExpertHighScore", -952147836925065007L);
        setLongField(term96885, term96885.getClass(), "sumBattleMasterHighScore", 4031766487864198182L);
        setLongField(term96885, term96885.getClass(), "sumBattleLunaticHighScore", 1105479031792764782L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumTechHighScore", argTypes, term96885, args);
    }

};


