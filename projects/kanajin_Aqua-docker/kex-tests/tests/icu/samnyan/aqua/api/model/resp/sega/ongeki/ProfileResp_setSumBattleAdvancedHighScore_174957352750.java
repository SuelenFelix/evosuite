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

public class ProfileResp_setSumBattleAdvancedHighScore_174957352750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98666;
     Object term98705;

    public ProfileResp_setSumBattleAdvancedHighScore_174957352750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98666 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp"));
        setField(term98666, term98666.getClass(), "userName", "hPyWXVCDwD");
        setIntField(term98666, term98666.getClass(), "level", -481794035);
        setLongField(term98666, term98666.getClass(), "exp", -360930387310661813L);
        setLongField(term98666, term98666.getClass(), "point", -7924346739368771682L);
        setLongField(term98666, term98666.getClass(), "totalPoint", 5407325613776448093L);
        setIntField(term98666, term98666.getClass(), "playCount", 133050499);
        setIntField(term98666, term98666.getClass(), "jewelCount", 1912220223);
        setIntField(term98666, term98666.getClass(), "totalJewelCount", -678439021);
        setIntField(term98666, term98666.getClass(), "playerRating", 1996302310);
        setIntField(term98666, term98666.getClass(), "highestRating", 1393835005);
        setIntField(term98666, term98666.getClass(), "battlePoint", -110011807);
        setIntField(term98666, term98666.getClass(), "nameplateId", -1542113774);
        setIntField(term98666, term98666.getClass(), "trophyId", 1694430517);
        setIntField(term98666, term98666.getClass(), "cardId", -1600319522);
        setIntField(term98666, term98666.getClass(), "characterId", -1565593246);
        setLongField(term98666, term98666.getClass(), "sumTechHighScore", -2342911426190618364L);
        setLongField(term98666, term98666.getClass(), "sumTechBasicHighScore", 5243522213632600334L);
        setLongField(term98666, term98666.getClass(), "sumTechAdvancedHighScore", -7136107935516349839L);
        setLongField(term98666, term98666.getClass(), "sumTechExpertHighScore", -207216193437887145L);
        setLongField(term98666, term98666.getClass(), "sumTechMasterHighScore", -8678993299894875263L);
        setLongField(term98666, term98666.getClass(), "sumTechLunaticHighScore", 5831523226469995511L);
        setLongField(term98666, term98666.getClass(), "sumBattleHighScore", 2812942122564805626L);
        setLongField(term98666, term98666.getClass(), "sumBattleBasicHighScore", -7046295986047695281L);
        setLongField(term98666, term98666.getClass(), "sumBattleAdvancedHighScore", -8441682245123980715L);
        setLongField(term98666, term98666.getClass(), "sumBattleExpertHighScore", -812848686153529715L);
        setLongField(term98666, term98666.getClass(), "sumBattleMasterHighScore", 4785718299598661245L);
        setLongField(term98666, term98666.getClass(), "sumBattleLunaticHighScore", -4468157061082693107L);
        term98705 = new Long(-3201514133571470122L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term98705;
        callMethod(klass, "setSumBattleAdvancedHighScore", argTypes, term98666, args);
    }

};


